// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;
import com.firebase.client.core.RepoManager;

public class FirebaseApp
{

	protected FirebaseApp(Repo repo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		repo = repo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Repo repo>
	//    5    9:return          
	}

	public void goOffline()
	{
		RepoManager.interrupt(repo);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Repo repo>
	//    2    4:invokestatic    #24  <Method void RepoManager.interrupt(Repo)>
	//    3    7:return          
	}

	public void goOnline()
	{
		RepoManager.resume(repo);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Repo repo>
	//    2    4:invokestatic    #28  <Method void RepoManager.resume(Repo)>
	//    3    7:return          
	}

	public void purgeOutstandingWrites()
	{
		repo.scheduleNow(new Runnable() {

			public void run()
			{
				repo.purgeOutstandingWrites();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FirebaseApp this$0>
			//    2    4:invokestatic    #25  <Method Repo FirebaseApp.access$000(FirebaseApp)>
			//    3    7:invokevirtual   #28  <Method void Repo.purgeOutstandingWrites()>
			//    4   10:return          
			}

			final FirebaseApp this$0;

			
			{
				this$0 = FirebaseApp.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FirebaseApp this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Repo repo>
	//    2    4:new             #6   <Class FirebaseApp$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #32  <Method void FirebaseApp$1(FirebaseApp)>
	//    6   12:invokevirtual   #38  <Method void Repo.scheduleNow(Runnable)>
	//    7   15:return          
	}

	private final Repo repo;


/*
	static Repo access$000(FirebaseApp firebaseapp)
	{
		return firebaseapp.repo;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Repo repo>
	//    2    4:areturn         
	}

*/
}
