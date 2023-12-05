package dao;

import java.awt.geom.QuadCurve2D;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.*;
import com.mysql.cj.Query;
import dto.Atm_Dto;

public class Atm_Dao 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public  void AccountInfo(long AccountNo)
	{	
		javax.persistence.Query q=em.createQuery("select t from Atm_Dto t where AccountNumber=?1");
		q.setParameter(1,AccountNo);
		List<Atm_Dto> atm_Dtos=q.getResultList();
		for(Atm_Dto i:atm_Dtos)
		{
			System.out.println(i);
		}			
	}
	public  void BalanceInfo(long AccountNo)
	{	
		javax.persistence.Query q=em.createQuery("select t from Atm_Dto t where AccountNumber=?1");
		q.setParameter(1,AccountNo);
		List<Atm_Dto> atm_Dtos=q.getResultList();
		for(Atm_Dto i:atm_Dtos)
		{
			int bal=i.getAccountBalance();
			System.out.println(bal);
		}			
	}
	public void updatePin(long AccountNo)
	{
		Scanner sc=new Scanner(System.in);
		javax.persistence.Query q=em.createQuery("select t from Atm_Dto t where AccountNumber=?1");
		q.setParameter(1,AccountNo);
		List<Atm_Dto> atm_Dtos=q.getResultList();
		for(Atm_Dto i:atm_Dtos)
		{
			String dbverify="check"+i.getAccountPin();
			if(!(dbverify.equals("check")))
			{
				System.out.println("Enter New PIN");
				int newpin=sc.nextInt();
				i.setAccountPin(newpin);
				System.out.println(i.getAccountPin());
			}
		}	
	}
	public void withdrawMoney(long AccountNo) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter Amount to Withdraw");
		int Withdraw=sc.nextInt();
		int bal=0;
		javax.persistence.Query q=em.createQuery("select t from Atm_Dto t where AccountNumber=?1");
		q.setParameter(1,AccountNo);
		List<Atm_Dto> atm_Dtos=q.getResultList();
		for(Atm_Dto i:atm_Dtos)
		{
			bal=i.getAccountBalance();
		}
		bal=bal-Withdraw;
		javax.persistence.Query q1=em.createQuery("update Atm_Dto set AccountBalance=?1 where AccountNumber=?2");
		q1.setParameter(1,bal);
		q1.setParameter(2,AccountNo);		
	}
	
}
