// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.support.v4.app.AppOpsManagerCompat;
import java.lang.annotation.Annotation;

public final class PermissionChecker
{
	public static interface PermissionResult
		extends Annotation
	{
	}


	public static int checkCallingOrSelfPermission(Context context, String s)
	{
		String s1;
		if(Binder.getCallingPid() == Process.myPid())
	//*   0    0:invokestatic    #16  <Method int Binder.getCallingPid()>
	//*   1    3:invokestatic    #21  <Method int Process.myPid()>
	//*   2    6:icmpne          17
			s1 = context.getPackageName();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #27  <Method String Context.getPackageName()>
	//    5   13:astore_2        
		else
	//*   6   14:goto            19
			s1 = null;
	//    7   17:aconst_null     
	//    8   18:astore_2        
		return checkPermission(context, s, Binder.getCallingPid(), Binder.getCallingUid(), s1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #16  <Method int Binder.getCallingPid()>
	//   12   24:invokestatic    #30  <Method int Binder.getCallingUid()>
	//   13   27:aload_2         
	//   14   28:invokestatic    #34  <Method int checkPermission(Context, String, int, int, String)>
	//   15   31:ireturn         
	}

	public static int checkCallingPermission(Context context, String s, String s1)
	{
		if(Binder.getCallingPid() == Process.myPid())
	//*   0    0:invokestatic    #16  <Method int Binder.getCallingPid()>
	//*   1    3:invokestatic    #21  <Method int Process.myPid()>
	//*   2    6:icmpne          11
			return -1;
	//    3    9:iconst_m1       
	//    4   10:ireturn         
		else
			return checkPermission(context, s, Binder.getCallingPid(), Binder.getCallingUid(), s1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #16  <Method int Binder.getCallingPid()>
	//    8   16:invokestatic    #30  <Method int Binder.getCallingUid()>
	//    9   19:aload_2         
	//   10   20:invokestatic    #34  <Method int checkPermission(Context, String, int, int, String)>
	//   11   23:ireturn         
	}

	public static int checkPermission(Context context, String s, int i, int j, String s1)
	{
		if(context.checkPermission(s, i, j) == -1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:iload_3         
	//*   4    4:invokevirtual   #42  <Method int Context.checkPermission(String, int, int)>
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          13
			return -1;
	//    7   11:iconst_m1       
	//    8   12:ireturn         
		String s2 = AppOpsManagerCompat.permissionToOp(s);
	//    9   13:aload_1         
	//   10   14:invokestatic    #48  <Method String AppOpsManagerCompat.permissionToOp(String)>
	//   11   17:astore          5
		if(s2 == null)
	//*  12   19:aload           5
	//*  13   21:ifnonnull       26
			return 0;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		s = s1;
	//   16   26:aload           4
	//   17   28:astore_1        
		if(s1 == null)
	//*  18   29:aload           4
	//*  19   31:ifnonnull       63
		{
			s = ((String) (context.getPackageManager().getPackagesForUid(j)));
	//   20   34:aload_0         
	//   21   35:invokevirtual   #52  <Method PackageManager Context.getPackageManager()>
	//   22   38:iload_3         
	//   23   39:invokevirtual   #58  <Method String[] PackageManager.getPackagesForUid(int)>
	//   24   42:astore_1        
			if(s != null)
	//*  25   43:aload_1         
	//*  26   44:ifnull          61
			{
				if(s.length <= 0)
	//*  27   47:aload_1         
	//*  28   48:arraylength     
	//*  29   49:ifgt            54
					return -1;
	//   30   52:iconst_m1       
	//   31   53:ireturn         
				s = ((String) (s[0]));
	//   32   54:aload_1         
	//   33   55:iconst_0        
	//   34   56:aaload          
	//   35   57:astore_1        
			} else
	//*  36   58:goto            63
			{
				return -1;
	//   37   61:iconst_m1       
	//   38   62:ireturn         
			}
		}
		return AppOpsManagerCompat.noteProxyOpNoThrow(context, s2, s) == 0 ? 0 : -2;
	//   39   63:aload_0         
	//   40   64:aload           5
	//   41   66:aload_1         
	//   42   67:invokestatic    #61  <Method int AppOpsManagerCompat.noteProxyOpNoThrow(Context, String, String)>
	//   43   70:ifeq            76
	//   44   73:bipush          -2
	//   45   75:ireturn         
	//   46   76:iconst_0        
	//   47   77:ireturn         
	}

	public static int checkSelfPermission(Context context, String s)
	{
		return checkPermission(context, s, Process.myPid(), Process.myUid(), context.getPackageName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #21  <Method int Process.myPid()>
	//    3    5:invokestatic    #65  <Method int Process.myUid()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #27  <Method String Context.getPackageName()>
	//    6   12:invokestatic    #34  <Method int checkPermission(Context, String, int, int, String)>
	//    7   15:ireturn         
	}
}
