// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.*;
import android.content.pm.ApplicationInfo;

public final class tk extends ContextWrapper
{

	public static Context a(Context context)
	{
		if(context instanceof tk)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class tk>
	//*   2    4:ifeq            15
			return ((tk)context).getBaseContext();
	//    3    7:aload_0         
	//    4    8:checkcast       #2   <Class tk>
	//    5   11:invokevirtual   #11  <Method Context getBaseContext()>
	//    6   14:areturn         
		Context context1 = context.getApplicationContext();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #16  <Method Context Context.getApplicationContext()>
	//    9   19:astore_1        
		if(context1 == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       26
			return context;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return context1;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public final void a(Activity activity)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new NoSuchMethodError();
	//    2    2:new             #20  <Class NoSuchMethodError>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void NoSuchMethodError()>
	//    5    9:athrow          
		activity;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw activity;
	//    9   13:aload_1         
	//   10   14:athrow          
	}

	public final void a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new NoSuchMethodError();
	//    2    2:new             #20  <Class NoSuchMethodError>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void NoSuchMethodError()>
	//    5    9:athrow          
		s;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw s;
	//    9   13:aload_1         
	//   10   14:athrow          
	}

	public final Context getApplicationContext()
	{
		throw new NoSuchMethodError();
	//    0    0:new             #20  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	public final ApplicationInfo getApplicationInfo()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new NoSuchMethodError();
	//    2    2:new             #20  <Class NoSuchMethodError>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void NoSuchMethodError()>
	//    5    9:athrow          
		Exception exception;
		exception;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw exception;
	//    9   13:aload_1         
	//   10   14:athrow          
	}

	public final String getPackageName()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new NoSuchMethodError();
	//    2    2:new             #20  <Class NoSuchMethodError>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void NoSuchMethodError()>
	//    5    9:athrow          
		Exception exception;
		exception;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw exception;
	//    9   13:aload_1         
	//   10   14:athrow          
	}

	public final String getPackageResourcePath()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new NoSuchMethodError();
	//    2    2:new             #20  <Class NoSuchMethodError>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void NoSuchMethodError()>
	//    5    9:athrow          
		Exception exception;
		exception;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw exception;
	//    9   13:aload_1         
	//   10   14:athrow          
	}

	public final void startActivity(Intent intent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new NoSuchMethodError();
	//    2    2:new             #20  <Class NoSuchMethodError>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void NoSuchMethodError()>
	//    5    9:athrow          
		intent;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw intent;
	//    9   13:aload_1         
	//   10   14:athrow          
	}
}
