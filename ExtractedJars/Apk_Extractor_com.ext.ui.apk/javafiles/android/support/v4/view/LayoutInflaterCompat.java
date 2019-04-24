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
			return (new StringBuilder()).append(((Object)this).getClass().getName()).append("{").append(((Object) (mDelegateFactory))).append("}").toString();
		//    0    0:new             #30  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #35  <Method Class Object.getClass()>
		//    5   11:invokevirtual   #40  <Method String Class.getName()>
		//    6   14:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #46  <String "{">
		//    8   19:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:aload_0         
		//   10   23:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
		//   11   26:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   12   29:ldc1            #51  <String "}">
		//   13   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   14   34:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   15   37:areturn         
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
		//*   1    1:ifnull          19
				layoutinflaterfactory = ((LayoutInflaterFactory) (new Factory2Wrapper(layoutinflaterfactory)));
		//    2    4:new             #19  <Class LayoutInflaterCompat$Factory2Wrapper>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #22  <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
		//    6   12:astore_2        
			else
		//*   7   13:aload_1         
		//*   8   14:aload_2         
		//*   9   15:invokevirtual   #28  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		//*  10   18:return          
				layoutinflaterfactory = null;
		//   11   19:aconst_null     
		//   12   20:astore_2        
			layoutinflater.setFactory2(((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
		//*  13   21:goto            13
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
		//*   1    1:ifnull          20
				layoutinflaterfactory = ((LayoutInflaterFactory) (new Factory2Wrapper(layoutinflaterfactory)));
		//    2    4:new             #21  <Class LayoutInflaterCompat$Factory2Wrapper>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #30  <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
		//    6   12:astore_2        
			else
		//*   7   13:aload_0         
		//*   8   14:aload_1         
		//*   9   15:aload_2         
		//*  10   16:invokevirtual   #34  <Method void setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
		//*  11   19:return          
				layoutinflaterfactory = null;
		//   12   20:aconst_null     
		//   13   21:astore_2        
			setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
		//*  14   22:goto            13
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
	//*   1    3:ifne            27
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
	//*   9   23:iconst_1        
	//*  10   24:putstatic       #47  <Field boolean sCheckedField>
	//*  11   27:getstatic       #59  <Field Field sLayoutInflaterFactory2Field>
	//*  12   30:ifnull          41
	//*  13   33:getstatic       #59  <Field Field sLayoutInflaterFactory2Field>
	//*  14   36:aload_0         
	//*  15   37:aload_1         
	//*  16   38:invokevirtual   #69  <Method void Field.set(Object, Object)>
	//*  17   41:return          
			catch(NoSuchFieldException nosuchfieldexception)
	//*  18   42:astore_2        
			{
				Log.e("LayoutInflaterCompatHC", (new StringBuilder()).append("forceSetFactory2 Could not find field 'mFactory2' on class ").append(((Class) (android/view/LayoutInflater)).getName()).append("; inflation may have unexpected results.").toString(), ((Throwable) (nosuchfieldexception)));
	//   19   43:ldc1            #19  <String "LayoutInflaterCompatHC">
	//   20   45:new             #71  <Class StringBuilder>
	//   21   48:dup             
	//   22   49:invokespecial   #72  <Method void StringBuilder()>
	//   23   52:ldc1            #74  <String "forceSetFactory2 Could not find field 'mFactory2' on class ">
	//   24   54:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:ldc1            #49  <Class LayoutInflater>
	//   26   59:invokevirtual   #82  <Method String Class.getName()>
	//   27   62:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   28   65:ldc1            #84  <String "; inflation may have unexpected results.">
	//   29   67:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   30   70:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   31   73:aload_2         
	//   32   74:invokestatic    #93  <Method int Log.e(String, String, Throwable)>
	//   33   77:pop             
			}
			sCheckedField = true;
		}
		if(sLayoutInflaterFactory2Field == null)
			break MISSING_BLOCK_LABEL_41;
		sLayoutInflaterFactory2Field.set(((Object) (layoutinflater)), ((Object) (factory2)));
		return;
	//*  34   78:goto            23
		factory2;
	//   35   81:astore_1        
		Log.e("LayoutInflaterCompatHC", (new StringBuilder()).append("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(((Object) (layoutinflater))).append("; inflation may have unexpected results.").toString(), ((Throwable) (factory2)));
	//   36   82:ldc1            #19  <String "LayoutInflaterCompatHC">
	//   37   84:new             #71  <Class StringBuilder>
	//   38   87:dup             
	//   39   88:invokespecial   #72  <Method void StringBuilder()>
	//   40   91:ldc1            #95  <String "forceSetFactory2 could not set the Factory2 on LayoutInflater ">
	//   41   93:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   42   96:aload_0         
	//   43   97:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   44  100:ldc1            #84  <String "; inflation may have unexpected results.">
	//   45  102:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   46  105:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   47  108:aload_1         
	//   48  109:invokestatic    #93  <Method int Log.e(String, String, Throwable)>
	//   49  112:pop             
		return;
	//   50  113:return          
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
