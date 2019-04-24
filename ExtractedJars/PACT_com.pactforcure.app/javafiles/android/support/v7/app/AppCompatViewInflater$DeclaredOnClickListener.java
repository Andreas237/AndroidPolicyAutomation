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

private static class AppCompatViewInflater$DeclaredOnClickListener
	implements android.view.View.OnClickListener
{

	private void resolveMethod(Context context, String s)
	{
_L2:
		if(context == null)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_1         
	//    1    1:ifnull          71
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_48;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method boolean Context.isRestricted()>
	//    4    8:ifne            48
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
	//*  18   33:ifnull          48
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
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   26   47:astore_2        
		if(context instanceof ContextWrapper)
	//*  27   48:aload_1         
	//*  28   49:instanceof      #58  <Class ContextWrapper>
	//*  29   52:ifeq            66
			context = ((ContextWrapper)context).getBaseContext();
	//   30   55:aload_1         
	//   31   56:checkcast       #58  <Class ContextWrapper>
	//   32   59:invokevirtual   #62  <Method Context ContextWrapper.getBaseContext()>
	//   33   62:astore_1        
		else
	//*  34   63:goto            0
			context = null;
	//   35   66:aconst_null     
	//   36   67:astore_1        
		if(true) goto _L2; else goto _L1
	//   37   68:goto            0
_L1:
		int i = mHostView.getId();
	//   38   71:aload_0         
	//   39   72:getfield        #25  <Field View mHostView>
	//   40   75:invokevirtual   #66  <Method int View.getId()>
	//   41   78:istore_3        
		if(i == -1)
	//*  42   79:iload_3         
	//*  43   80:iconst_m1       
	//*  44   81:icmpne          141
			context = "";
	//   45   84:ldc1            #68  <String "">
	//   46   86:astore_1        
		else
	//*  47   87:new             #70  <Class IllegalStateException>
	//*  48   90:dup             
	//*  49   91:new             #72  <Class StringBuilder>
	//*  50   94:dup             
	//*  51   95:invokespecial   #73  <Method void StringBuilder()>
	//*  52   98:ldc1            #75  <String "Could not find method ">
	//*  53  100:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  54  103:aload_0         
	//*  55  104:getfield        #27  <Field String mMethodName>
	//*  56  107:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  57  110:ldc1            #81  <String "(View) in a parent or ancestor Context for android:onClick ">
	//*  58  112:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  59  115:ldc1            #83  <String "attribute defined on view ">
	//*  60  117:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  61  120:aload_0         
	//*  62  121:getfield        #25  <Field View mHostView>
	//*  63  124:invokevirtual   #44  <Method Class Object.getClass()>
	//*  64  127:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//*  65  130:aload_1         
	//*  66  131:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  67  134:invokevirtual   #90  <Method String StringBuilder.toString()>
	//*  68  137:invokespecial   #93  <Method void IllegalStateException(String)>
	//*  69  140:athrow          
			context = ((Context) ((new StringBuilder()).append(" with id '").append(mHostView.getContext().getResources().getResourceEntryName(i)).append("'").toString()));
	//   70  141:new             #72  <Class StringBuilder>
	//   71  144:dup             
	//   72  145:invokespecial   #73  <Method void StringBuilder()>
	//   73  148:ldc1            #95  <String " with id '">
	//   74  150:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   75  153:aload_0         
	//   76  154:getfield        #25  <Field View mHostView>
	//   77  157:invokevirtual   #98  <Method Context View.getContext()>
	//   78  160:invokevirtual   #102 <Method Resources Context.getResources()>
	//   79  163:iload_3         
	//   80  164:invokevirtual   #108 <Method String Resources.getResourceEntryName(int)>
	//   81  167:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   82  170:ldc1            #110 <String "'">
	//   83  172:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   84  175:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   85  178:astore_1        
		throw new IllegalStateException((new StringBuilder()).append("Could not find method ").append(mMethodName).append("(View) in a parent or ancestor Context for android:onClick ").append("attribute defined on view ").append(((Object) (((Object) (mHostView)).getClass()))).append(((String) (context))).toString());
	//*  86  179:goto            87
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
	//    6   12:invokevirtual   #98  <Method Context View.getContext()>
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
	//   24   44:new             #70  <Class IllegalStateException>
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
	//   31   56:new             #70  <Class IllegalStateException>
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
