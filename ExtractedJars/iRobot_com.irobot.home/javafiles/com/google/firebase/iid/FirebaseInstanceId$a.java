// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.a;
import com.google.firebase.b;
import com.google.firebase.b.d;

// Referenced classes of package com.google.firebase.iid:
//			FirebaseInstanceId, ar

private final class FirebaseInstanceId$a
{

	private final Boolean b()
	{
		Object obj;
		obj = ((Object) (com.google.firebase.iid.FirebaseInstanceId.a(a).a()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field FirebaseInstanceId a>
	//    2    4:invokestatic    #59  <Method b com.google.firebase.iid.FirebaseInstanceId.a(FirebaseInstanceId)>
	//    3    7:invokevirtual   #64  <Method Context b.a()>
	//    4   10:astore_2        
		SharedPreferences sharedpreferences = ((Context) (obj)).getSharedPreferences("com.google.firebase.messaging", 0);
	//    5   11:aload_2         
	//    6   12:ldc1            #66  <String "com.google.firebase.messaging">
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #72  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    9   18:astore_3        
		if(sharedpreferences.contains("auto_init"))
	//*  10   19:aload_3         
	//*  11   20:ldc1            #74  <String "auto_init">
	//*  12   22:invokeinterface #80  <Method boolean SharedPreferences.contains(String)>
	//*  13   27:ifeq            43
			return Boolean.valueOf(sharedpreferences.getBoolean("auto_init", false));
	//   14   30:aload_3         
	//   15   31:ldc1            #74  <String "auto_init">
	//   16   33:iconst_0        
	//   17   34:invokeinterface #84  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   18   39:invokestatic    #90  <Method Boolean Boolean.valueOf(boolean)>
	//   19   42:areturn         
		PackageManager packagemanager = ((Context) (obj)).getPackageManager();
	//   20   43:aload_2         
	//   21   44:invokevirtual   #94  <Method PackageManager Context.getPackageManager()>
	//   22   47:astore_3        
		if(packagemanager == null)
			break MISSING_BLOCK_LABEL_102;
	//   23   48:aload_3         
	//   24   49:ifnull          102
		obj = ((Object) (packagemanager.getApplicationInfo(((Context) (obj)).getPackageName(), 128)));
	//   25   52:aload_3         
	//   26   53:aload_2         
	//   27   54:invokevirtual   #98  <Method String Context.getPackageName()>
	//   28   57:sipush          128
	//   29   60:invokevirtual   #104 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   30   63:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_102;
	//   31   64:aload_2         
	//   32   65:ifnull          102
		boolean flag;
		if(((ApplicationInfo) (obj)).metaData == null || !((ApplicationInfo) (obj)).metaData.containsKey("firebase_messaging_auto_init_enabled"))
			break MISSING_BLOCK_LABEL_102;
	//   33   68:aload_2         
	//   34   69:getfield        #110 <Field Bundle ApplicationInfo.metaData>
	//   35   72:ifnull          102
	//   36   75:aload_2         
	//   37   76:getfield        #110 <Field Bundle ApplicationInfo.metaData>
	//   38   79:ldc1            #112 <String "firebase_messaging_auto_init_enabled">
	//   39   81:invokevirtual   #117 <Method boolean Bundle.containsKey(String)>
	//   40   84:ifeq            102
		flag = ((ApplicationInfo) (obj)).metaData.getBoolean("firebase_messaging_auto_init_enabled");
	//   41   87:aload_2         
	//   42   88:getfield        #110 <Field Bundle ApplicationInfo.metaData>
	//   43   91:ldc1            #112 <String "firebase_messaging_auto_init_enabled">
	//   44   93:invokevirtual   #119 <Method boolean Bundle.getBoolean(String)>
	//   45   96:istore_1        
		return Boolean.valueOf(flag);
	//   46   97:iload_1         
	//   47   98:invokestatic    #90  <Method Boolean Boolean.valueOf(boolean)>
	//   48  101:areturn         
_L2:
		return null;
	//   49  102:aconst_null     
	//   50  103:areturn         
		android.content.pm.tFoundException tfoundexception;
		tfoundexception;
	//   51  104:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  52  105:goto            102
	}

	private final boolean c()
	{
		ClassNotFoundException classnotfoundexception;
		Object obj;
		Intent intent;
		try
		{
			Class.forName("com.google.firebase.messaging.a");
	//    0    0:ldc1            #123 <String "com.google.firebase.messaging.a">
	//    1    2:invokestatic    #129 <Method Class Class.forName(String)>
	//    2    5:pop             
		}
	//*   3    6:iconst_1        
	//*   4    7:ireturn         
	//*   5    8:aload_0         
	//*   6    9:getfield        #24  <Field FirebaseInstanceId a>
	//*   7   12:invokestatic    #59  <Method b com.google.firebase.iid.FirebaseInstanceId.a(FirebaseInstanceId)>
	//*   8   15:invokevirtual   #64  <Method Context b.a()>
	//*   9   18:astore_1        
	//*  10   19:new             #131 <Class Intent>
	//*  11   22:dup             
	//*  12   23:ldc1            #133 <String "com.google.firebase.MESSAGING_EVENT">
	//*  13   25:invokespecial   #136 <Method void Intent(String)>
	//*  14   28:astore_2        
	//*  15   29:aload_2         
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #98  <Method String Context.getPackageName()>
	//*  18   34:invokevirtual   #140 <Method Intent Intent.setPackage(String)>
	//*  19   37:pop             
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #94  <Method PackageManager Context.getPackageManager()>
	//*  22   42:aload_2         
	//*  23   43:iconst_0        
	//*  24   44:invokevirtual   #144 <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//*  25   47:astore_1        
	//*  26   48:aload_1         
	//*  27   49:ifnull          61
	//*  28   52:aload_1         
	//*  29   53:getfield        #150 <Field android.content.pm.ServiceInfo ResolveInfo.serviceInfo>
	//*  30   56:ifnull          61
	//*  31   59:iconst_1        
	//*  32   60:ireturn         
	//*  33   61:iconst_0        
	//*  34   62:ireturn         
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			obj = ((Object) (com.google.firebase.iid.FirebaseInstanceId.a(a).a()));
			intent = new Intent("com.google.firebase.MESSAGING_EVENT");
			intent.setPackage(((Context) (obj)).getPackageName());
			obj = ((Object) (((Context) (obj)).getPackageManager().resolveService(intent, 0)));
			return obj != null && ((ResolveInfo) (obj)).serviceInfo != null;
		}
		return true;
	//*  35   63:astore_1        
	//*  36   64:goto            8
	}

	final boolean a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(e == null)
			break MISSING_BLOCK_LABEL_21;
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field Boolean e>
	//    4    6:ifnull          21
		flag = e.booleanValue();
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field Boolean e>
	//    7   13:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//    8   16:istore_1        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return flag;
	//   11   19:iload_1         
	//   12   20:ireturn         
		if(!b) goto _L2; else goto _L1
	//   13   21:aload_0         
	//   14   22:getfield        #34  <Field boolean b>
	//   15   25:ifeq            49
_L1:
		flag = com.google.firebase.iid.FirebaseInstanceId.a(a).e();
	//   16   28:aload_0         
	//   17   29:getfield        #24  <Field FirebaseInstanceId a>
	//   18   32:invokestatic    #59  <Method b com.google.firebase.iid.FirebaseInstanceId.a(FirebaseInstanceId)>
	//   19   35:invokevirtual   #155 <Method boolean b.e()>
	//   20   38:istore_1        
		if(!flag) goto _L2; else goto _L3
	//   21   39:iload_1         
	//   22   40:ifeq            49
_L3:
		flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_1        
_L5:
		this;
	//   25   45:aload_0         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		return flag;
	//   27   47:iload_1         
	//   28   48:ireturn         
_L2:
		flag = false;
	//   29   49:iconst_0        
	//   30   50:istore_1        
		if(true) goto _L5; else goto _L4
	//   31   51:goto            45
_L4:
		Exception exception;
		exception;
	//   32   54:astore_2        
	//*  33   55:aload_0         
		throw exception;
	//   34   56:monitorexit     
	//   35   57:aload_2         
	//   36   58:athrow          
	}

	final FirebaseInstanceId a;
	private final boolean b = c();
	private final d c;
	private com.google.firebase.b.b d;
	private Boolean e;

	FirebaseInstanceId$a(FirebaseInstanceId firebaseinstanceid, d d1)
	{
		a = firebaseinstanceid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field FirebaseInstanceId a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		c = d1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field d c>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #32  <Method boolean c()>
	//   11   19:putfield        #34  <Field boolean b>
		e = b();
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokespecial   #37  <Method Boolean b()>
	//   15   27:putfield        #39  <Field Boolean e>
		if(e == null && b)
	//*  16   30:aload_0         
	//*  17   31:getfield        #39  <Field Boolean e>
	//*  18   34:ifnonnull       68
	//*  19   37:aload_0         
	//*  20   38:getfield        #34  <Field boolean b>
	//*  21   41:ifeq            68
		{
			d = ((com.google.firebase.b.b) (new ar(this)));
	//   22   44:aload_0         
	//   23   45:new             #41  <Class ar>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #44  <Method void ar(FirebaseInstanceId$a)>
	//   27   53:putfield        #46  <Field com.google.firebase.b.b d>
			d1.a(com/google/firebase/a, d);
	//   28   56:aload_2         
	//   29   57:ldc1            #48  <Class a>
	//   30   59:aload_0         
	//   31   60:getfield        #46  <Field com.google.firebase.b.b d>
	//   32   63:invokeinterface #53  <Method void d.a(Class, com.google.firebase.b.b)>
		}
	//   33   68:return          
	}
}
