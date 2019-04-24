// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.view:
//			LayoutInflaterFactory

public final class LayoutInflaterCompat
{
	static class Factory2Wrapper
		implements android.view.LayoutInflater.Factory2
	{

		public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
		{
			return mDelegateFactory.onCreateView(view, s, context, attributeset);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokeinterface #25  <Method View LayoutInflaterFactory.onCreateView(View, String, Context, AttributeSet)>
		//    7   14:areturn         
		}

		public View onCreateView(String s, Context context, AttributeSet attributeset)
		{
			return mDelegateFactory.onCreateView(((View) (null)), s, context, attributeset);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
		//    2    4:aconst_null     
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokeinterface #25  <Method View LayoutInflaterFactory.onCreateView(View, String, Context, AttributeSet)>
		//    7   13:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #30  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(((Object)this).getClass().getName());
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #35  <Method Class Object.getClass()>
		//    7   13:invokevirtual   #40  <Method String Class.getName()>
		//    8   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//    9   19:pop             
			stringbuilder.append("{");
		//   10   20:aload_1         
		//   11   21:ldc1            #46  <String "{">
		//   12   23:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(((Object) (mDelegateFactory)));
		//   14   27:aload_1         
		//   15   28:aload_0         
		//   16   29:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
		//   17   32:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   18   35:pop             
			stringbuilder.append("}");
		//   19   36:aload_1         
		//   20   37:ldc1            #51  <String "}">
		//   21   39:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			return stringbuilder.toString();
		//   23   43:aload_1         
		//   24   44:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   25   47:areturn         
		}

		final LayoutInflaterFactory mDelegateFactory;

		Factory2Wrapper(LayoutInflaterFactory layoutinflaterfactory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mDelegateFactory = layoutinflaterfactory;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
		//    5    9:return          
		}
	}

	static class LayoutInflaterCompatApi21Impl extends LayoutInflaterCompatBaseImpl
	{

		public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
		{
			if(layoutinflaterfactory != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          16
				layoutinflaterfactory = ((LayoutInflaterFactory) (new Factory2Wrapper(layoutinflaterfactory)));
		//    2    4:new             #19  <Class LayoutInflaterCompat$Factory2Wrapper>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #22  <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
		//    6   12:astore_2        
			else
		//*   7   13:goto            18
				layoutinflaterfactory = null;
		//    8   16:aconst_null     
		//    9   17:astore_2        
			layoutinflater.setFactory2(((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokevirtual   #28  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		//   13   23:return          
		}

		public void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
		{
			layoutinflater.setFactory2(factory2);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #28  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		//    3    5:return          
		}

		LayoutInflaterCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void LayoutInflaterCompat$LayoutInflaterCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class LayoutInflaterCompatBaseImpl
	{

		public LayoutInflaterFactory getFactory(LayoutInflater layoutinflater)
		{
			layoutinflater = ((LayoutInflater) (layoutinflater.getFactory()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #19  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
		//    2    4:astore_1        
			if(layoutinflater instanceof Factory2Wrapper)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #21  <Class LayoutInflaterCompat$Factory2Wrapper>
		//*   5    9:ifeq            20
				return ((Factory2Wrapper)layoutinflater).mDelegateFactory;
		//    6   12:aload_1         
		//    7   13:checkcast       #21  <Class LayoutInflaterCompat$Factory2Wrapper>
		//    8   16:getfield        #25  <Field LayoutInflaterFactory LayoutInflaterCompat$Factory2Wrapper.mDelegateFactory>
		//    9   19:areturn         
			else
				return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
		}

		public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
		{
			if(layoutinflaterfactory != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          16
				layoutinflaterfactory = ((LayoutInflaterFactory) (new Factory2Wrapper(layoutinflaterfactory)));
		//    2    4:new             #21  <Class LayoutInflaterCompat$Factory2Wrapper>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #30  <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
		//    6   12:astore_2        
			else
		//*   7   13:goto            18
				layoutinflaterfactory = null;
		//    8   16:aconst_null     
		//    9   17:astore_2        
			setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:aload_2         
		//   13   21:invokevirtual   #34  <Method void setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
		//   14   24:return          
		}

		public void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
		{
			layoutinflater.setFactory2(factory2);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #37  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
			android.view.LayoutInflater.Factory factory = layoutinflater.getFactory();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #19  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
		//    5    9:astore_3        
			if(factory instanceof android.view.LayoutInflater.Factory2)
		//*   6   10:aload_3         
		//*   7   11:instanceof      #39  <Class android.view.LayoutInflater$Factory2>
		//*   8   14:ifeq            26
			{
				LayoutInflaterCompat.forceSetFactory2(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
		//    9   17:aload_1         
		//   10   18:aload_3         
		//   11   19:checkcast       #39  <Class android.view.LayoutInflater$Factory2>
		//   12   22:invokestatic    #42  <Method void LayoutInflaterCompat.forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
				return;
		//   13   25:return          
			} else
			{
				LayoutInflaterCompat.forceSetFactory2(layoutinflater, factory2);
		//   14   26:aload_1         
		//   15   27:aload_2         
		//   16   28:invokestatic    #42  <Method void LayoutInflaterCompat.forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
				return;
		//   17   31:return          
			}
		}

		LayoutInflaterCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private LayoutInflaterCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	static void forceSetFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		if(!sCheckedField)
	//*   0    0:getstatic       #47  <Field boolean sCheckedField>
	//*   1    3:ifne            74
		{
			try
			{
				sLayoutInflaterFactory2Field = ((Class) (android/view/LayoutInflater)).getDeclaredField("mFactory2");
	//    2    6:ldc1            #49  <Class LayoutInflater>
	//    3    8:ldc1            #51  <String "mFactory2">
	//    4   10:invokevirtual   #57  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #59  <Field Field sLayoutInflaterFactory2Field>
				sLayoutInflaterFactory2Field.setAccessible(true);
	//    6   16:getstatic       #59  <Field Field sLayoutInflaterFactory2Field>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #65  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            70
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   11   27:new             #67  <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #68  <Method void StringBuilder()>
	//   14   34:astore_3        
				stringbuilder1.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
	//   15   35:aload_3         
	//   16   36:ldc1            #70  <String "forceSetFactory2 Could not find field 'mFactory2' on class ">
	//   17   38:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
				stringbuilder1.append(((Class) (android/view/LayoutInflater)).getName());
	//   19   42:aload_3         
	//   20   43:ldc1            #49  <Class LayoutInflater>
	//   21   45:invokevirtual   #78  <Method String Class.getName()>
	//   22   48:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
				stringbuilder1.append("; inflation may have unexpected results.");
	//   24   52:aload_3         
	//   25   53:ldc1            #80  <String "; inflation may have unexpected results.">
	//   26   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:pop             
				Log.e("LayoutInflaterCompatHC", stringbuilder1.toString(), ((Throwable) (nosuchfieldexception)));
	//   28   59:ldc1            #19  <String "LayoutInflaterCompatHC">
	//   29   61:aload_3         
	//   30   62:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   31   65:aload_2         
	//   32   66:invokestatic    #89  <Method int Log.e(String, String, Throwable)>
	//   33   69:pop             
			}
			sCheckedField = true;
	//   34   70:iconst_1        
	//   35   71:putstatic       #47  <Field boolean sCheckedField>
		}
		if(sLayoutInflaterFactory2Field != null)
	//*  36   74:getstatic       #59  <Field Field sLayoutInflaterFactory2Field>
	//*  37   77:ifnull          129
		{
			StringBuilder stringbuilder;
			try
			{
				sLayoutInflaterFactory2Field.set(((Object) (layoutinflater)), ((Object) (factory2)));
	//   38   80:getstatic       #59  <Field Field sLayoutInflaterFactory2Field>
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:invokevirtual   #93  <Method void Field.set(Object, Object)>
				return;
	//   42   88:return          
			}
			// Misplaced declaration of an exception variable
			catch(android.view.LayoutInflater.Factory2 factory2)
	//*  43   89:astore_1        
			{
				stringbuilder = new StringBuilder();
	//   44   90:new             #67  <Class StringBuilder>
	//   45   93:dup             
	//   46   94:invokespecial   #68  <Method void StringBuilder()>
	//   47   97:astore_2        
			}
			stringbuilder.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
	//   48   98:aload_2         
	//   49   99:ldc1            #95  <String "forceSetFactory2 could not set the Factory2 on LayoutInflater ">
	//   50  101:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   51  104:pop             
			stringbuilder.append(((Object) (layoutinflater)));
	//   52  105:aload_2         
	//   53  106:aload_0         
	//   54  107:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   55  110:pop             
			stringbuilder.append("; inflation may have unexpected results.");
	//   56  111:aload_2         
	//   57  112:ldc1            #80  <String "; inflation may have unexpected results.">
	//   58  114:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
			Log.e("LayoutInflaterCompatHC", stringbuilder.toString(), ((Throwable) (factory2)));
	//   60  118:ldc1            #19  <String "LayoutInflaterCompatHC">
	//   61  120:aload_2         
	//   62  121:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   63  124:aload_1         
	//   64  125:invokestatic    #89  <Method int Log.e(String, String, Throwable)>
	//   65  128:pop             
		}
	//   66  129:return          
	}

	public static LayoutInflaterFactory getFactory(LayoutInflater layoutinflater)
	{
		return IMPL.getFactory(layoutinflater);
	//    0    0:getstatic       #36  <Field LayoutInflaterCompat$LayoutInflaterCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #103 <Method LayoutInflaterFactory LayoutInflaterCompat$LayoutInflaterCompatBaseImpl.getFactory(LayoutInflater)>
	//    3    7:areturn         
	}

	public static void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
	{
		IMPL.setFactory(layoutinflater, layoutinflaterfactory);
	//    0    0:getstatic       #36  <Field LayoutInflaterCompat$LayoutInflaterCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method void LayoutInflaterCompat$LayoutInflaterCompatBaseImpl.setFactory(LayoutInflater, LayoutInflaterFactory)>
	//    4    8:return          
	}

	public static void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		IMPL.setFactory2(layoutinflater, factory2);
	//    0    0:getstatic       #36  <Field LayoutInflaterCompat$LayoutInflaterCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method void LayoutInflaterCompat$LayoutInflaterCompatBaseImpl.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
	//    4    8:return          
	}

	static final LayoutInflaterCompatBaseImpl IMPL;
	private static final String TAG = "LayoutInflaterCompatHC";
	private static boolean sCheckedField;
	private static Field sLayoutInflaterFactory2Field;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((LayoutInflaterCompatBaseImpl) (new LayoutInflaterCompatApi21Impl()));
	//    3    8:new             #9   <Class LayoutInflaterCompat$LayoutInflaterCompatApi21Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #34  <Method void LayoutInflaterCompat$LayoutInflaterCompatApi21Impl()>
	//    6   15:putstatic       #36  <Field LayoutInflaterCompat$LayoutInflaterCompatBaseImpl IMPL>
	//    7   18:return          
		else
			IMPL = new LayoutInflaterCompatBaseImpl();
	//    8   19:new             #12  <Class LayoutInflaterCompat$LayoutInflaterCompatBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #37  <Method void LayoutInflaterCompat$LayoutInflaterCompatBaseImpl()>
	//   11   26:putstatic       #36  <Field LayoutInflaterCompat$LayoutInflaterCompatBaseImpl IMPL>
	//*  12   29:return          
	}
}
