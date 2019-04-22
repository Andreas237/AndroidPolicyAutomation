// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

// Referenced classes of package com.google.android.gms.common.internal:
//			SignInButtonConfig, ISignInButtonCreator

public final class SignInButtonCreator extends RemoteCreator
{

	private SignInButtonCreator()
	{
		super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "com.google.android.gms.common.ui.SignInButtonCreatorImpl">
	//    2    3:invokespecial   #20  <Method void RemoteCreator(String)>
	//    3    6:return          
	}

	public static View createView(Context context, int i, int j)
		throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException
	{
		return zzuz.zza(context, i, j);
	//    0    0:getstatic       #14  <Field SignInButtonCreator zzuz>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #27  <Method View zza(Context, int, int)>
	//    5    9:areturn         
	}

	private final View zza(Context context, int i, int j)
		throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException
	{
		try
		{
			SignInButtonConfig signinbuttonconfig = new SignInButtonConfig(i, j, ((com.google.android.gms.common.api.Scope []) (null)));
	//    0    0:new             #32  <Class SignInButtonConfig>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:iload_3         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #35  <Method void SignInButtonConfig(int, int, com.google.android.gms.common.api.Scope[])>
	//    6   10:astore          4
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    7   12:aload_1         
	//    8   13:invokestatic    #41  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    9   16:astore          5
			context = ((Context) ((View)ObjectWrapper.unwrap(((ISignInButtonCreator)((RemoteCreator)this).getRemoteCreatorInstance(context)).newSignInButtonFromConfig(iobjectwrapper, signinbuttonconfig))));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #45  <Method Object RemoteCreator.getRemoteCreatorInstance(Context)>
	//   13   23:checkcast       #47  <Class ISignInButtonCreator>
	//   14   26:aload           5
	//   15   28:aload           4
	//   16   30:invokeinterface #51  <Method com.google.android.gms.dynamic.IObjectWrapper ISignInButtonCreator.newSignInButtonFromConfig(com.google.android.gms.dynamic.IObjectWrapper, SignInButtonConfig)>
	//   17   35:invokestatic    #55  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   18   38:checkcast       #57  <Class View>
	//   19   41:astore_1        
		}
	//*  20   42:aload_1         
	//*  21   43:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  22   44:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder(64);
	//   23   45:new             #59  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:bipush          64
	//   26   51:invokespecial   #62  <Method void StringBuilder(int)>
	//   27   54:astore          4
			stringbuilder.append("Could not get button with size ");
	//   28   56:aload           4
	//   29   58:ldc1            #64  <String "Could not get button with size ">
	//   30   60:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(i);
	//   32   64:aload           4
	//   33   66:iload_2         
	//   34   67:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   35   70:pop             
			stringbuilder.append(" and color ");
	//   36   71:aload           4
	//   37   73:ldc1            #73  <String " and color ">
	//   38   75:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder.append(j);
	//   40   79:aload           4
	//   41   81:iload_3         
	//   42   82:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   43   85:pop             
			throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException(stringbuilder.toString(), ((Throwable) (context)));
	//   44   86:new             #24  <Class com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException>
	//   45   89:dup             
	//   46   90:aload           4
	//   47   92:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   48   95:aload_1         
	//   49   96:invokespecial   #80  <Method void com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException(String, Throwable)>
	//   50   99:athrow          
		}
		return ((View) (context));
	}

	public final ISignInButtonCreator getRemoteCreator(IBinder ibinder)
	{
		return ISignInButtonCreator.Stub.asInterface(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method ISignInButtonCreator ISignInButtonCreator$Stub.asInterface(IBinder)>
	//    2    4:areturn         
	}

	public final volatile Object getRemoteCreator(IBinder ibinder)
	{
		return ((Object) (getRemoteCreator(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method ISignInButtonCreator getRemoteCreator(IBinder)>
	//    3    5:areturn         
	}

	private static final SignInButtonCreator zzuz = new SignInButtonCreator();

	static 
	{
	//    0    0:new             #2   <Class SignInButtonCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void SignInButtonCreator()>
	//    3    7:putstatic       #14  <Field SignInButtonCreator zzuz>
	//*   4   10:return          
	}
}
