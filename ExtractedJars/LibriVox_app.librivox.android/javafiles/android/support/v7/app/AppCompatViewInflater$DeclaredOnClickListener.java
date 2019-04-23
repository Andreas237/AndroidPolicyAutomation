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

class AppCompatViewInflater$DeclaredOnClickListener
	implements android.view.View.OnClickListener
{

	private void resolveMethod(Context context, String s)
	{
_L2:
		if(context == null)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_1         
	//    1    1:ifnull          70
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_47;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method boolean Context.isRestricted()>
	//    4    8:ifne            47
		s = ((String) (((Object) (context)).getClass().getMethod(mMethodName, new Class[] {
			android/view/View
		})));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #38  <Method Class Object.getClass()>
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field String mMethodName>
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:ldc1            #42  <Class View>
	//   14   27:aastore         
	//   15   28:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   16   31:astore_2        
		if(s != null)
	//*  17   32:aload_2         
	//*  18   33:ifnull          47
			try
			{
				mResolvedMethod = ((Method) (s));
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:putfield        #48  <Field Method mResolvedMethod>
				mResolvedContext = context;
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:putfield        #50  <Field Context mResolvedContext>
				return;
	//   25   46:return          
			}
	//*  26   47:aload_1         
	//*  27   48:instanceof      #52  <Class ContextWrapper>
	//*  28   51:ifeq            65
	//*  29   54:aload_1         
	//*  30   55:checkcast       #52  <Class ContextWrapper>
	//*  31   58:invokevirtual   #56  <Method Context ContextWrapper.getBaseContext()>
	//*  32   61:astore_1        
	//*  33   62:goto            0
	//*  34   65:aconst_null     
	//*  35   66:astore_1        
	//*  36   67:goto            0
	//*  37   70:aload_0         
	//*  38   71:getfield        #21  <Field View mHostView>
	//*  39   74:invokevirtual   #60  <Method int View.getId()>
	//*  40   77:istore_3        
	//*  41   78:iload_3         
	//*  42   79:iconst_m1       
	//*  43   80:icmpne          89
	//*  44   83:ldc1            #62  <String "">
	//*  45   85:astore_1        
	//*  46   86:goto            135
	//*  47   89:new             #64  <Class StringBuilder>
	//*  48   92:dup             
	//*  49   93:invokespecial   #65  <Method void StringBuilder()>
	//*  50   96:astore_1        
	//*  51   97:aload_1         
	//*  52   98:ldc1            #67  <String " with id '">
	//*  53  100:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  54  103:pop             
	//*  55  104:aload_1         
	//*  56  105:aload_0         
	//*  57  106:getfield        #21  <Field View mHostView>
	//*  58  109:invokevirtual   #74  <Method Context View.getContext()>
	//*  59  112:invokevirtual   #78  <Method Resources Context.getResources()>
	//*  60  115:iload_3         
	//*  61  116:invokevirtual   #84  <Method String Resources.getResourceEntryName(int)>
	//*  62  119:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  63  122:pop             
	//*  64  123:aload_1         
	//*  65  124:ldc1            #86  <String "'">
	//*  66  126:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  67  129:pop             
	//*  68  130:aload_1         
	//*  69  131:invokevirtual   #90  <Method String StringBuilder.toString()>
	//*  70  134:astore_1        
	//*  71  135:new             #64  <Class StringBuilder>
	//*  72  138:dup             
	//*  73  139:invokespecial   #65  <Method void StringBuilder()>
	//*  74  142:astore_2        
	//*  75  143:aload_2         
	//*  76  144:ldc1            #92  <String "Could not find method ">
	//*  77  146:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  78  149:pop             
	//*  79  150:aload_2         
	//*  80  151:aload_0         
	//*  81  152:getfield        #23  <Field String mMethodName>
	//*  82  155:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  83  158:pop             
	//*  84  159:aload_2         
	//*  85  160:ldc1            #94  <String "(View) in a parent or ancestor Context for android:onClick ">
	//*  86  162:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  87  165:pop             
	//*  88  166:aload_2         
	//*  89  167:ldc1            #96  <String "attribute defined on view ">
	//*  90  169:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  91  172:pop             
	//*  92  173:aload_2         
	//*  93  174:aload_0         
	//*  94  175:getfield        #21  <Field View mHostView>
	//*  95  178:invokevirtual   #38  <Method Class Object.getClass()>
	//*  96  181:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
	//*  97  184:pop             
	//*  98  185:aload_2         
	//*  99  186:aload_1         
	//* 100  187:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//* 101  190:pop             
	//* 102  191:new             #101 <Class IllegalStateException>
	//* 103  194:dup             
	//* 104  195:aload_2         
	//* 105  196:invokevirtual   #90  <Method String StringBuilder.toString()>
	//* 106  199:invokespecial   #104 <Method void IllegalStateException(String)>
	//* 107  202:athrow          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  108  203:astore_2        
		if(context instanceof ContextWrapper)
			context = ((ContextWrapper)context).getBaseContext();
		else
			context = null;
		if(true) goto _L2; else goto _L1
_L1:
		int i = mHostView.getId();
		if(i == -1)
		{
			context = "";
		} else
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append(" with id '");
			((StringBuilder) (context)).append(mHostView.getContext().getResources().getResourceEntryName(i));
			((StringBuilder) (context)).append("'");
			context = ((Context) (((StringBuilder) (context)).toString()));
		}
		s = ((String) (new StringBuilder()));
		((StringBuilder) (s)).append("Could not find method ");
		((StringBuilder) (s)).append(mMethodName);
		((StringBuilder) (s)).append("(View) in a parent or ancestor Context for android:onClick ");
		((StringBuilder) (s)).append("attribute defined on view ");
		((StringBuilder) (s)).append(((Object) (((Object) (mHostView)).getClass())));
		((StringBuilder) (s)).append(((String) (context)));
		throw new IllegalStateException(((StringBuilder) (s)).toString());
	//* 109  204:goto            47
	}

	public void onClick(View view)
	{
		if(mResolvedMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Method mResolvedMethod>
	//*   2    4:ifnonnull       22
			resolveMethod(mHostView.getContext(), mMethodName);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field View mHostView>
	//    6   12:invokevirtual   #74  <Method Context View.getContext()>
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field String mMethodName>
	//    9   19:invokespecial   #112 <Method void resolveMethod(Context, String)>
		try
		{
			mResolvedMethod.invoke(((Object) (mResolvedContext)), new Object[] {
				view
			});
	//   10   22:aload_0         
	//   11   23:getfield        #48  <Field Method mResolvedMethod>
	//   12   26:aload_0         
	//   13   27:getfield        #50  <Field Context mResolvedContext>
	//   14   30:iconst_1        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:aastore         
	//   20   38:invokevirtual   #118 <Method Object Method.invoke(Object, Object[])>
	//   21   41:pop             
			return;
	//   22   42:return          
		}
	//*  23   43:astore_1        
	//*  24   44:new             #101 <Class IllegalStateException>
	//*  25   47:dup             
	//*  26   48:ldc1            #120 <String "Could not execute method for android:onClick">
	//*  27   50:aload_1         
	//*  28   51:invokespecial   #123 <Method void IllegalStateException(String, Throwable)>
	//*  29   54:athrow          
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  30   55:astore_1        
		{
			throw new IllegalStateException("Could not execute non-public method for android:onClick", ((Throwable) (view)));
	//   31   56:new             #101 <Class IllegalStateException>
	//   32   59:dup             
	//   33   60:ldc1            #125 <String "Could not execute non-public method for android:onClick">
	//   34   62:aload_1         
	//   35   63:invokespecial   #123 <Method void IllegalStateException(String, Throwable)>
	//   36   66:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			throw new IllegalStateException("Could not execute method for android:onClick", ((Throwable) (view)));
		}
	}

	private final View mHostView;
	private final String mMethodName;
	private Context mResolvedContext;
	private Method mResolvedMethod;

	public AppCompatViewInflater$DeclaredOnClickListener(View view, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mHostView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field View mHostView>
		mMethodName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String mMethodName>
	//    8   14:return          
	}
}
