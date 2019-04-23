// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public class zzrw
{

	private zzrw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isUserUnlocked(Context context)
	{
		return !zztj() || zzab(context);
	//    0    0:invokestatic    #14  <Method boolean zztj()>
	//    1    3:ifeq            18
	//    2    6:aload_0         
	//    3    7:invokestatic    #25  <Method boolean zzab(Context)>
	//    4   10:ifeq            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	private static boolean zzab(Context context)
	{
		boolean flag;
		boolean flag1;
		flag = zzbra;
	//    0    0:getstatic       #16  <Field boolean zzbra>
	//    1    3:istore_2        
		flag1 = flag;
	//    2    4:iload_2         
	//    3    5:istore_3        
		if(flag) goto _L2; else goto _L1
	//    4    6:iload_2         
	//    5    7:ifne            106
_L1:
		int i = 1;
	//    6   10:iconst_1        
	//    7   11:istore_1        
_L5:
		if(i > 2) goto _L4; else goto _L3
	//    8   12:iload_1         
	//    9   13:iconst_2        
	//   10   14:icmpgt          94
_L3:
		UserManager usermanager;
		usermanager = zzac(context);
	//   11   17:aload_0         
	//   12   18:invokestatic    #35  <Method UserManager zzac(Context)>
	//   13   21:astore          4
		if(usermanager == null)
	//*  14   23:aload           4
	//*  15   25:ifnonnull       34
		{
			zzbra = true;
	//   16   28:iconst_1        
	//   17   29:putstatic       #16  <Field boolean zzbra>
			return true;
	//   18   32:iconst_1        
	//   19   33:ireturn         
		}
		flag1 = flag;
	//   20   34:iload_2         
	//   21   35:istore_3        
		if(usermanager.isUserUnlocked())
			break MISSING_BLOCK_LABEL_113;
	//   22   36:aload           4
	//   23   38:invokevirtual   #39  <Method boolean UserManager.isUserUnlocked()>
	//   24   41:ifne            113
		flag1 = flag;
	//   25   44:iload_2         
	//   26   45:istore_3        
		break MISSING_BLOCK_LABEL_46;
	//*  27   46:aload           4
	//*  28   48:invokestatic    #45  <Method android.os.UserHandle Process.myUserHandle()>
	//*  29   51:invokevirtual   #49  <Method boolean UserManager.isUserRunning(android.os.UserHandle)>
	//*  30   54:ifne            108
	//*  31   57:goto            113
_L6:
		flag1 = flag;
	//   32   60:iload_2         
	//   33   61:istore_3        
		zzbra = flag;
	//   34   62:iload_2         
	//   35   63:putstatic       #16  <Field boolean zzbra>
		  goto _L4
	//*  36   66:goto            94
		nullpointerexception;
	//   37   69:astore          4
		Log.w("DirectBootUtils", "Failed to check if user is unlocked", ((Throwable) (nullpointerexception)));
	//   38   71:ldc1            #51  <String "DirectBootUtils">
	//   39   73:ldc1            #53  <String "Failed to check if user is unlocked">
	//   40   75:aload           4
	//   41   77:invokestatic    #59  <Method int Log.w(String, String, Throwable)>
	//   42   80:pop             
		zzbqz = null;
	//   43   81:aconst_null     
	//   44   82:putstatic       #61  <Field UserManager zzbqz>
		i++;
	//   45   85:iload_1         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_1        
		flag = flag1;
	//   49   89:iload_3         
	//   50   90:istore_2        
		  goto _L5
	//*  51   91:goto            12
_L4:
		flag1 = flag;
	//   52   94:iload_2         
	//   53   95:istore_3        
		if(flag)
	//*  54   96:iload_2         
	//*  55   97:ifeq            106
		{
			zzbqz = null;
	//   56  100:aconst_null     
	//   57  101:putstatic       #61  <Field UserManager zzbqz>
			flag1 = flag;
	//   58  104:iload_2         
	//   59  105:istore_3        
		}
_L2:
		return flag1;
	//   60  106:iload_3         
	//   61  107:ireturn         
		NullPointerException nullpointerexception;
		if(!usermanager.isUserRunning(Process.myUserHandle()))
			break MISSING_BLOCK_LABEL_113;
		flag = false;
	//   62  108:iconst_0        
	//   63  109:istore_2        
		  goto _L6
	//*  64  110:goto            60
		flag = true;
	//   65  113:iconst_1        
	//   66  114:istore_2        
		  goto _L6
	//*  67  115:goto            60
	}

	private static UserManager zzac(Context context)
	{
		UserManager usermanager;
		usermanager = zzbqz;
	//    0    0:getstatic       #61  <Field UserManager zzbqz>
	//    1    3:astore_1        
		if(usermanager != null)
			break MISSING_BLOCK_LABEL_46;
	//    2    4:aload_1         
	//    3    5:ifnonnull       46
		com/google/android/gms/internal/measurement/zzrw;
	//    4    8:ldc1            #2   <Class zzrw>
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		UserManager usermanager1 = zzbqz;
	//    6   11:getstatic       #61  <Field UserManager zzbqz>
	//    7   14:astore_2        
		usermanager = usermanager1;
	//    8   15:aload_2         
	//    9   16:astore_1        
		if(usermanager1 != null)
			break MISSING_BLOCK_LABEL_35;
	//   10   17:aload_2         
	//   11   18:ifnonnull       35
		usermanager = (UserManager)context.getSystemService(android/os/UserManager);
	//   12   21:aload_0         
	//   13   22:ldc1            #37  <Class UserManager>
	//   14   24:invokevirtual   #69  <Method Object Context.getSystemService(Class)>
	//   15   27:checkcast       #37  <Class UserManager>
	//   16   30:astore_1        
		zzbqz = usermanager;
	//   17   31:aload_1         
	//   18   32:putstatic       #61  <Field UserManager zzbqz>
		com/google/android/gms/internal/measurement/zzrw;
	//   19   35:ldc1            #2   <Class zzrw>
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return usermanager;
	//   21   38:aload_1         
	//   22   39:areturn         
		context;
	//   23   40:astore_0        
		com/google/android/gms/internal/measurement/zzrw;
	//   24   41:ldc1            #2   <Class zzrw>
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		throw context;
	//   26   44:aload_0         
	//   27   45:athrow          
		return usermanager;
	//   28   46:aload_1         
	//   29   47:areturn         
	}

	public static boolean zztj()
	{
		return android.os.Build.VERSION.SDK_INT >= 24;
	//    0    0:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          24
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	private static volatile UserManager zzbqz;
	private static volatile boolean zzbra = zztj() ^ true;

	static 
	{
	//    0    0:invokestatic    #14  <Method boolean zztj()>
	//    1    3:iconst_1        
	//    2    4:ixor            
	//    3    5:putstatic       #16  <Field boolean zzbra>
	//*   4    8:return          
	}
}
