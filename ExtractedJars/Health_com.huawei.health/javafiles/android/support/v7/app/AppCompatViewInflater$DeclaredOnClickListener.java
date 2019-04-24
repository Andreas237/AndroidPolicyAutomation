// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.app:
//			AppCompatViewInflater

static class AppCompatViewInflater$DeclaredOnClickListener
	implements android.view.View.OnClickListener
{

	private void resolveMethod(Context context, String s)
	{
_L2:
		if(context == null)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_1         
	//    1    1:ifnull          74
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_51;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method boolean Context.isRestricted()>
	//    4    8:ifne            47
		s = ((String) (((Object) (context)).getClass().getMethod(mMethodName, new Class[] {
			android/view/View
		})));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #44  <Method Class Object.getClass()>
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field String mMethodName>
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:ldc1            #48  <Class View>
	//   14   27:aastore         
	//   15   28:invokevirtual   #52  <Method Method Class.getMethod(String, Class[])>
	//   16   31:astore_2        
		if(s != null)
	//*  17   32:aload_2         
	//*  18   33:ifnull          47
			try
			{
				mResolvedMethod = ((Method) (s));
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:putfield        #54  <Field Method mResolvedMethod>
				mResolvedContext = context;
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:putfield        #56  <Field Context mResolvedContext>
				return;
	//   25   46:return          
			}
	//*  26   47:goto            51
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   27   50:astore_2        
		if(context instanceof ContextWrapper)
	//*  28   51:aload_1         
	//*  29   52:instanceof      #58  <Class ContextWrapper>
	//*  30   55:ifeq            69
			context = ((ContextWrapper)context).getBaseContext();
	//   31   58:aload_1         
	//   32   59:checkcast       #58  <Class ContextWrapper>
	//   33   62:invokevirtual   #62  <Method Context ContextWrapper.getBaseContext()>
	//   34   65:astore_1        
		else
	//*  35   66:goto            0
			context = null;
	//   36   69:aconst_null     
	//   37   70:astore_1        
		if(true) goto _L2; else goto _L1
	//   38   71:goto            0
_L1:
		int i = mHostView.getId();
	//   39   74:aload_0         
	//   40   75:getfield        #25  <Field View mHostView>
	//   41   78:invokevirtual   #66  <Method int View.getId()>
	//   42   81:istore_3        
		if(i == -1)
	//*  43   82:iload_3         
	//*  44   83:iconst_m1       
	//*  45   84:icmpne          93
			context = "";
	//   46   87:ldc1            #68  <String "">
	//   47   89:astore_1        
		else
	//*  48   90:goto            131
			context = ((Context) ((new StringBuilder()).append(" with id '").append(mHostView.getContext().getResources().getResourceEntryName(i)).append("'").toString()));
	//   49   93:new             #70  <Class StringBuilder>
	//   50   96:dup             
	//   51   97:invokespecial   #71  <Method void StringBuilder()>
	//   52  100:ldc1            #73  <String " with id '">
	//   53  102:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   54  105:aload_0         
	//   55  106:getfield        #25  <Field View mHostView>
	//   56  109:invokevirtual   #80  <Method Context View.getContext()>
	//   57  112:invokevirtual   #84  <Method Resources Context.getResources()>
	//   58  115:iload_3         
	//   59  116:invokevirtual   #90  <Method String Resources.getResourceEntryName(int)>
	//   60  119:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   61  122:ldc1            #92  <String "'">
	//   62  124:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   63  127:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   64  130:astore_1        
		throw new IllegalStateException((new StringBuilder()).append("Could not find method ").append(mMethodName).append("(View) in a parent or ancestor Context for android:onClick ").append("attribute defined on view ").append(((Object) (((Object) (mHostView)).getClass()))).append(((String) (context))).toString());
	//   65  131:new             #98  <Class IllegalStateException>
	//   66  134:dup             
	//   67  135:new             #70  <Class StringBuilder>
	//   68  138:dup             
	//   69  139:invokespecial   #71  <Method void StringBuilder()>
	//   70  142:ldc1            #100 <String "Could not find method ">
	//   71  144:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   72  147:aload_0         
	//   73  148:getfield        #27  <Field String mMethodName>
	//   74  151:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   75  154:ldc1            #102 <String "(View) in a parent or ancestor Context for android:onClick ">
	//   76  156:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   77  159:ldc1            #104 <String "attribute defined on view ">
	//   78  161:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   79  164:aload_0         
	//   80  165:getfield        #25  <Field View mHostView>
	//   81  168:invokevirtual   #44  <Method Class Object.getClass()>
	//   82  171:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
	//   83  174:aload_1         
	//   84  175:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   85  178:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   86  181:invokespecial   #110 <Method void IllegalStateException(String)>
	//   87  184:athrow          
	}

	public void onClick(View view)
	{
		if(mResolvedMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Method mResolvedMethod>
	//*   2    4:ifnonnull       22
			resolveMethod(mHostView.getContext(), mMethodName);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field View mHostView>
	//    6   12:invokevirtual   #80  <Method Context View.getContext()>
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field String mMethodName>
	//    9   19:invokespecial   #119 <Method void resolveMethod(Context, String)>
		try
		{
			mResolvedMethod.invoke(((Object) (mResolvedContext)), new Object[] {
				view
			});
	//   10   22:aload_0         
	//   11   23:getfield        #54  <Field Method mResolvedMethod>
	//   12   26:aload_0         
	//   13   27:getfield        #56  <Field Context mResolvedContext>
	//   14   30:iconst_1        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:aastore         
	//   20   38:invokevirtual   #125 <Method Object Method.invoke(Object, Object[])>
	//   21   41:pop             
			return;
	//   22   42:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  23   43:astore_1        
		{
			throw new IllegalStateException("Could not execute non-public method for android:onClick", ((Throwable) (view)));
	//   24   44:new             #98  <Class IllegalStateException>
	//   25   47:dup             
	//   26   48:ldc1            #127 <String "Could not execute non-public method for android:onClick">
	//   27   50:aload_1         
	//   28   51:invokespecial   #130 <Method void IllegalStateException(String, Throwable)>
	//   29   54:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  30   55:astore_1        
		{
			throw new IllegalStateException("Could not execute method for android:onClick", ((Throwable) (view)));
	//   31   56:new             #98  <Class IllegalStateException>
	//   32   59:dup             
	//   33   60:ldc1            #132 <String "Could not execute method for android:onClick">
	//   34   62:aload_1         
	//   35   63:invokespecial   #130 <Method void IllegalStateException(String, Throwable)>
	//   36   66:athrow          
		}
	}

	private final View mHostView;
	private final String mMethodName;
	private Context mResolvedContext;
	private Method mResolvedMethod;

	public AppCompatViewInflater$DeclaredOnClickListener(View view, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mHostView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field View mHostView>
		mMethodName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String mMethodName>
	//    8   14:return          
	}
}
