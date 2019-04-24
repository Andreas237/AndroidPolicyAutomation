// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public abstract class PersistentMapActivity extends BaseFragmentActivity
{

	public PersistentMapActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	protected void a(Fragment fragment)
	{
		G = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Fragment G>
		FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #19  <Method FragmentManager getSupportFragmentManager()>
	//    5    9:invokevirtual   #25  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    6   12:astore_2        
		fragmenttransaction.replace(0x7f090247, fragment);
	//    7   13:aload_2         
	//    8   14:ldc1            #26  <Int 0x7f090247>
	//    9   16:aload_1         
	//   10   17:invokevirtual   #32  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
	//   11   20:pop             
		fragmenttransaction.commit();
	//   12   21:aload_2         
	//   13   22:invokevirtual   #36  <Method int FragmentTransaction.commit()>
	//   14   25:pop             
		getFragmentManager().executePendingTransactions();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #40  <Method android.app.FragmentManager getFragmentManager()>
	//   17   30:invokevirtual   #46  <Method boolean android.app.FragmentManager.executePendingTransactions()>
	//   18   33:pop             
	//   19   34:return          
	}

	protected Fragment G;
}
