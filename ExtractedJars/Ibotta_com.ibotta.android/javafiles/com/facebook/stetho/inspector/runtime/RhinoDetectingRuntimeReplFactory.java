// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.runtime;

import android.content.Context;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RhinoDetectingRuntimeReplFactory
	implements RuntimeReplFactory
{

	public RhinoDetectingRuntimeReplFactory(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Context mContext>
	//    5    9:return          
	}

	private static RuntimeReplFactory findRhinoReplFactory(Context context)
		throws RuntimeException
	{
		try
		{
			context = ((Context) ((RuntimeReplFactory)Class.forName("com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder").getDeclaredMethod("defaultFactory", new Class[] {
				android/content/Context
			}).invoke(((Object) (null)), new Object[] {
				context
			})));
	//    0    0:ldc1            #43  <String "com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder">
	//    1    2:invokestatic    #49  <Method Class Class.forName(String)>
	//    2    5:ldc1            #51  <String "defaultFactory">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #53  <Class Context>
	//    8   15:aastore         
	//    9   16:invokevirtual   #57  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   10   19:aconst_null     
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_0         
	//   16   27:aastore         
	//   17   28:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
	//   18   31:checkcast       #6   <Class RuntimeReplFactory>
	//   19   34:astore_0        
		}
	//*  20   35:aload_0         
	//*  21   36:areturn         
	//*  22   37:astore_0        
	//*  23   38:new             #32  <Class RuntimeException>
	//*  24   41:dup             
	//*  25   42:aload_0         
	//*  26   43:invokespecial   #66  <Method void RuntimeException(Throwable)>
	//*  27   46:athrow          
	//*  28   47:astore_0        
	//*  29   48:new             #32  <Class RuntimeException>
	//*  30   51:dup             
	//*  31   52:aload_0         
	//*  32   53:invokespecial   #66  <Method void RuntimeException(Throwable)>
	//*  33   56:athrow          
	//*  34   57:astore_0        
	//*  35   58:new             #32  <Class RuntimeException>
	//*  36   61:dup             
	//*  37   62:aload_0         
	//*  38   63:invokespecial   #66  <Method void RuntimeException(Throwable)>
	//*  39   66:athrow          
	//*  40   67:ldc1            #68  <String "Error finding stetho-js-rhino, cannot enable console evaluation!">
	//*  41   69:invokestatic    #74  <Method void LogUtil.i(String)>
	//*  42   72:aconst_null     
	//*  43   73:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			LogUtil.i("Error finding stetho-js-rhino, cannot enable console evaluation!");
			return null;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new RuntimeException(((Throwable) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new RuntimeException(((Throwable) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new RuntimeException(((Throwable) (context)));
		}
		return ((RuntimeReplFactory) (context));
	//*  44   74:astore_0        
	//*  45   75:goto            67
	}

	public RuntimeRepl newInstance()
	{
		if(!mSearchedForRhinoJs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean mSearchedForRhinoJs>
	//*   2    4:ifne            32
		{
			mSearchedForRhinoJs = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #80  <Field boolean mSearchedForRhinoJs>
			try
			{
				mRhinoReplFactory = findRhinoReplFactory(mContext);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field Context mContext>
	//    9   17:invokestatic    #82  <Method RuntimeReplFactory findRhinoReplFactory(Context)>
	//   10   20:putfield        #84  <Field RuntimeReplFactory mRhinoReplFactory>
			}
	//*  11   23:goto            32
			catch(RuntimeException runtimeexception)
	//*  12   26:astore_1        
			{
				mRhinoJsUnexpectedError = runtimeexception;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #28  <Field RuntimeException mRhinoJsUnexpectedError>
			}
		}
		RuntimeReplFactory runtimereplfactory = mRhinoReplFactory;
	//   16   32:aload_0         
	//   17   33:getfield        #84  <Field RuntimeReplFactory mRhinoReplFactory>
	//   18   36:astore_1        
		if(runtimereplfactory != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          48
			return runtimereplfactory.newInstance();
	//   21   41:aload_1         
	//   22   42:invokeinterface #86  <Method RuntimeRepl RuntimeReplFactory.newInstance()>
	//   23   47:areturn         
		else
			return new RuntimeRepl() {

				public Object evaluate(String s)
					throws Exception
				{
					if(mRhinoJsUnexpectedError != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field RhinoDetectingRuntimeReplFactory this$0>
				//*   2    4:invokestatic    #29  <Method RuntimeException RhinoDetectingRuntimeReplFactory.access$000(RhinoDetectingRuntimeReplFactory)>
				//*   3    7:ifnull          45
					{
						s = ((String) (new StringBuilder()));
				//    4   10:new             #31  <Class StringBuilder>
				//    5   13:dup             
				//    6   14:invokespecial   #32  <Method void StringBuilder()>
				//    7   17:astore_1        
						((StringBuilder) (s)).append("stetho-js-rhino threw: ");
				//    8   18:aload_1         
				//    9   19:ldc1            #34  <String "stetho-js-rhino threw: ">
				//   10   21:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
				//   11   24:pop             
						((StringBuilder) (s)).append(mRhinoJsUnexpectedError.toString());
				//   12   25:aload_1         
				//   13   26:aload_0         
				//   14   27:getfield        #17  <Field RhinoDetectingRuntimeReplFactory this$0>
				//   15   30:invokestatic    #29  <Method RuntimeException RhinoDetectingRuntimeReplFactory.access$000(RhinoDetectingRuntimeReplFactory)>
				//   16   33:invokevirtual   #44  <Method String RuntimeException.toString()>
				//   17   36:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
				//   18   39:pop             
						return ((Object) (((StringBuilder) (s)).toString()));
				//   19   40:aload_1         
				//   20   41:invokevirtual   #45  <Method String StringBuilder.toString()>
				//   21   44:areturn         
					} else
					{
						return ((Object) ("Not supported without stetho-js-rhino dependency"));
				//   22   45:ldc1            #47  <String "Not supported without stetho-js-rhino dependency">
				//   23   47:areturn         
					}
				}

				final RhinoDetectingRuntimeReplFactory this$0;

			
			{
				this$0 = RhinoDetectingRuntimeReplFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RhinoDetectingRuntimeReplFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   24   48:new             #8   <Class RhinoDetectingRuntimeReplFactory$1>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:invokespecial   #89  <Method void RhinoDetectingRuntimeReplFactory$1(RhinoDetectingRuntimeReplFactory)>
	//   28   56:areturn         
	}

	private final Context mContext;
	private RuntimeException mRhinoJsUnexpectedError;
	private RuntimeReplFactory mRhinoReplFactory;
	private boolean mSearchedForRhinoJs;


/*
	static RuntimeException access$000(RhinoDetectingRuntimeReplFactory rhinodetectingruntimereplfactory)
	{
		return rhinodetectingruntimereplfactory.mRhinoJsUnexpectedError;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field RuntimeException mRhinoJsUnexpectedError>
	//    2    4:areturn         
	}

*/
}
