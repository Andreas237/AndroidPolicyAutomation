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
//			SignInButtonConfig, ISignInButtonCreator, zah

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
	{
		return zape.zaa(context, i, j);
	//    0    0:getstatic       #14  <Field SignInButtonCreator zape>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #25  <Method View zaa(Context, int, int)>
	//    5    9:areturn         
	}

	private final View zaa(Context context, int i, int j)
	{
		try
		{
			SignInButtonConfig signinbuttonconfig = new SignInButtonConfig(i, j, ((com.google.android.gms.common.api.Scope []) (null)));
	//    0    0:new             #29  <Class SignInButtonConfig>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:iload_3         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #32  <Method void SignInButtonConfig(int, int, com.google.android.gms.common.api.Scope[])>
	//    6   10:astore          4
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    7   12:aload_1         
	//    8   13:invokestatic    #38  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    9   16:astore          5
			context = ((Context) ((View)ObjectWrapper.unwrap(((ISignInButtonCreator)getRemoteCreatorInstance(context)).newSignInButtonFromConfig(iobjectwrapper, signinbuttonconfig))));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #42  <Method Object getRemoteCreatorInstance(Context)>
	//   13   23:checkcast       #44  <Class ISignInButtonCreator>
	//   14   26:aload           5
	//   15   28:aload           4
	//   16   30:invokeinterface #48  <Method com.google.android.gms.dynamic.IObjectWrapper ISignInButtonCreator.newSignInButtonFromConfig(com.google.android.gms.dynamic.IObjectWrapper, SignInButtonConfig)>
	//   17   35:invokestatic    #52  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   18   38:checkcast       #54  <Class View>
	//   19   41:astore_1        
		}
	//*  20   42:aload_1         
	//*  21   43:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  22   44:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder(64);
	//   23   45:new             #56  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:bipush          64
	//   26   51:invokespecial   #59  <Method void StringBuilder(int)>
	//   27   54:astore          4
			stringbuilder.append("Could not get button with size ");
	//   28   56:aload           4
	//   29   58:ldc1            #61  <String "Could not get button with size ">
	//   30   60:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(i);
	//   32   64:aload           4
	//   33   66:iload_2         
	//   34   67:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   35   70:pop             
			stringbuilder.append(" and color ");
	//   36   71:aload           4
	//   37   73:ldc1            #70  <String " and color ">
	//   38   75:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder.append(j);
	//   40   79:aload           4
	//   41   81:iload_3         
	//   42   82:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   43   85:pop             
			throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException(stringbuilder.toString(), ((Throwable) (context)));
	//   44   86:new             #72  <Class com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException>
	//   45   89:dup             
	//   46   90:aload           4
	//   47   92:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   48   95:aload_1         
	//   49   96:invokespecial   #79  <Method void com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException(String, Throwable)>
	//   50   99:athrow          
		}
		return ((View) (context));
	}

	public final ISignInButtonCreator getRemoteCreator(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #83  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//    6    9:invokeinterface #89  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof ISignInButtonCreator)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #44  <Class ISignInButtonCreator>
	//*  10   19:ifeq            27
			return (ISignInButtonCreator)iinterface;
	//   11   22:aload_2         
	//   12   23:checkcast       #44  <Class ISignInButtonCreator>
	//   13   26:areturn         
		else
			return ((ISignInButtonCreator) (new zah(ibinder)));
	//   14   27:new             #91  <Class zah>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #94  <Method void zah(IBinder)>
	//   18   35:areturn         
	}

	public final volatile Object getRemoteCreator(IBinder ibinder)
	{
		return ((Object) (getRemoteCreator(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method ISignInButtonCreator getRemoteCreator(IBinder)>
	//    3    5:areturn         
	}

	private static final SignInButtonCreator zape = new SignInButtonCreator();

	static 
	{
	//    0    0:new             #2   <Class SignInButtonCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void SignInButtonCreator()>
	//    3    7:putstatic       #14  <Field SignInButtonCreator zape>
	//*   4   10:return          
	}
}
