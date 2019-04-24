// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzf;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzah, zzy

public final class zzaj extends zzf
{

	private zzaj()
	{
		super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "com.google.android.gms.common.ui.SignInButtonCreatorImpl">
	//    2    3:invokespecial   #20  <Method void zzf(String)>
	//    3    6:return          
	}

	public static View zzd(Context context, int i, int j)
		throws com.google.android.gms.dynamic.zzf.zza
	{
		return zzaGI.zze(context, i, j);
	//    0    0:getstatic       #14  <Field zzaj zzaGI>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #27  <Method View zze(Context, int, int)>
	//    5    9:areturn         
	}

	private View zze(Context context, int i, int j)
		throws com.google.android.gms.dynamic.zzf.zza
	{
		try
		{
			zzah zzah1 = new zzah(i, j, ((com.google.android.gms.common.api.Scope []) (null)));
	//    0    0:new             #32  <Class zzah>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:iload_3         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #35  <Method void zzah(int, int, com.google.android.gms.common.api.Scope[])>
	//    6   10:astore          4
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.zzd.zzA(((Object) (context)));
	//    7   12:aload_1         
	//    8   13:invokestatic    #41  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    9   16:astore          5
			context = ((Context) ((View)com.google.android.gms.dynamic.zzd.zzF(((zzy)zzbl(context)).zza(iobjectwrapper, zzah1))));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #45  <Method Object zzbl(Context)>
	//   13   23:checkcast       #47  <Class zzy>
	//   14   26:aload           5
	//   15   28:aload           4
	//   16   30:invokeinterface #51  <Method com.google.android.gms.dynamic.IObjectWrapper zzy.zza(com.google.android.gms.dynamic.IObjectWrapper, zzah)>
	//   17   35:invokestatic    #55  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//   18   38:checkcast       #57  <Class View>
	//   19   41:astore_1        
		}
	//*  20   42:aload_1         
	//*  21   43:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  22   44:astore_1        
		{
			throw new com.google.android.gms.dynamic.zzf.zza((new StringBuilder(64)).append("Could not get button with size ").append(i).append(" and color ").append(j).toString(), ((Throwable) (context)));
	//   23   45:new             #24  <Class com.google.android.gms.dynamic.zzf$zza>
	//   24   48:dup             
	//   25   49:new             #59  <Class StringBuilder>
	//   26   52:dup             
	//   27   53:bipush          64
	//   28   55:invokespecial   #62  <Method void StringBuilder(int)>
	//   29   58:ldc1            #64  <String "Could not get button with size ">
	//   30   60:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:iload_2         
	//   32   64:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   33   67:ldc1            #73  <String " and color ">
	//   34   69:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:iload_3         
	//   36   73:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   37   76:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   38   79:aload_1         
	//   39   80:invokespecial   #80  <Method void com.google.android.gms.dynamic.zzf$zza(String, Throwable)>
	//   40   83:athrow          
		}
		return ((View) (context));
	}

	public zzy zzby(IBinder ibinder)
	{
		return zzy.zza.zzbx(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method zzy zzy$zza.zzbx(IBinder)>
	//    2    4:areturn         
	}

	public Object zzc(IBinder ibinder)
	{
		return ((Object) (zzby(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method zzy zzby(IBinder)>
	//    3    5:areturn         
	}

	private static final zzaj zzaGI = new zzaj();

	static 
	{
	//    0    0:new             #2   <Class zzaj>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void zzaj()>
	//    3    7:putstatic       #14  <Field zzaj zzaGI>
	//*   4   10:return          
	}
}
