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


	private LayoutInflaterCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	private static void forceSetFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		if(!sCheckedField)
	//*   0    0:getstatic       #28  <Field boolean sCheckedField>
	//*   1    3:ifne            74
		{
			try
			{
				sLayoutInflaterFactory2Field = ((Class) (android/view/LayoutInflater)).getDeclaredField("mFactory2");
	//    2    6:ldc1            #30  <Class LayoutInflater>
	//    3    8:ldc1            #32  <String "mFactory2">
	//    4   10:invokevirtual   #38  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #40  <Field Field sLayoutInflaterFactory2Field>
				sLayoutInflaterFactory2Field.setAccessible(true);
	//    6   16:getstatic       #40  <Field Field sLayoutInflaterFactory2Field>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #46  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            70
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_2        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #48  <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #49  <Method void StringBuilder()>
	//   14   34:astore_3        
				stringbuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
	//   15   35:aload_3         
	//   16   36:ldc1            #51  <String "forceSetFactory2 Could not find field 'mFactory2' on class ">
	//   17   38:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
				stringbuilder.append(((Class) (android/view/LayoutInflater)).getName());
	//   19   42:aload_3         
	//   20   43:ldc1            #30  <Class LayoutInflater>
	//   21   45:invokevirtual   #59  <Method String Class.getName()>
	//   22   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
				stringbuilder.append("; inflation may have unexpected results.");
	//   24   52:aload_3         
	//   25   53:ldc1            #61  <String "; inflation may have unexpected results.">
	//   26   55:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:pop             
				Log.e("LayoutInflaterCompatHC", stringbuilder.toString(), ((Throwable) (nosuchfieldexception)));
	//   28   59:ldc1            #11  <String "LayoutInflaterCompatHC">
	//   29   61:aload_3         
	//   30   62:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   31   65:aload_2         
	//   32   66:invokestatic    #70  <Method int Log.e(String, String, Throwable)>
	//   33   69:pop             
			}
			sCheckedField = true;
	//   34   70:iconst_1        
	//   35   71:putstatic       #28  <Field boolean sCheckedField>
		}
		Object obj = ((Object) (sLayoutInflaterFactory2Field));
	//   36   74:getstatic       #40  <Field Field sLayoutInflaterFactory2Field>
	//   37   77:astore_2        
		if(obj != null)
	//*  38   78:aload_2         
	//*  39   79:ifnull          129
		{
			try
			{
				((Field) (obj)).set(((Object) (layoutinflater)), ((Object) (factory2)));
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:invokevirtual   #74  <Method void Field.set(Object, Object)>
				return;
	//   44   88:return          
			}
			// Misplaced declaration of an exception variable
			catch(android.view.LayoutInflater.Factory2 factory2)
	//*  45   89:astore_1        
			{
				obj = ((Object) (new StringBuilder()));
	//   46   90:new             #48  <Class StringBuilder>
	//   47   93:dup             
	//   48   94:invokespecial   #49  <Method void StringBuilder()>
	//   49   97:astore_2        
			}
			((StringBuilder) (obj)).append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
	//   50   98:aload_2         
	//   51   99:ldc1            #76  <String "forceSetFactory2 could not set the Factory2 on LayoutInflater ">
	//   52  101:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
			((StringBuilder) (obj)).append(((Object) (layoutinflater)));
	//   54  105:aload_2         
	//   55  106:aload_0         
	//   56  107:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   57  110:pop             
			((StringBuilder) (obj)).append("; inflation may have unexpected results.");
	//   58  111:aload_2         
	//   59  112:ldc1            #61  <String "; inflation may have unexpected results.">
	//   60  114:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
			Log.e("LayoutInflaterCompatHC", ((StringBuilder) (obj)).toString(), ((Throwable) (factory2)));
	//   62  118:ldc1            #11  <String "LayoutInflaterCompatHC">
	//   63  120:aload_2         
	//   64  121:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   65  124:aload_1         
	//   66  125:invokestatic    #70  <Method int Log.e(String, String, Throwable)>
	//   67  128:pop             
		}
	//   68  129:return          
	}

	public static LayoutInflaterFactory getFactory(LayoutInflater layoutinflater)
	{
		layoutinflater = ((LayoutInflater) (layoutinflater.getFactory()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//    2    4:astore_0        
		if(layoutinflater instanceof Factory2Wrapper)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #6   <Class LayoutInflaterCompat$Factory2Wrapper>
	//*   5    9:ifeq            20
			return ((Factory2Wrapper)layoutinflater).mDelegateFactory;
	//    6   12:aload_0         
	//    7   13:checkcast       #6   <Class LayoutInflaterCompat$Factory2Wrapper>
	//    8   16:getfield        #89  <Field LayoutInflaterFactory LayoutInflaterCompat$Factory2Wrapper.mDelegateFactory>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public static void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		Factory2Wrapper factory2wrapper = null;
	//    4    7:aconst_null     
	//    5    8:astore_3        
		if(i >= 21)
	//*   6    9:iload_2         
	//*   7   10:bipush          21
	//*   8   12:icmplt          34
		{
			if(layoutinflaterfactory != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          28
				factory2wrapper = new Factory2Wrapper(layoutinflaterfactory);
	//   11   19:new             #6   <Class LayoutInflaterCompat$Factory2Wrapper>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #102 <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
	//   15   27:astore_3        
			layoutinflater.setFactory2(((android.view.LayoutInflater.Factory2) (factory2wrapper)));
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #106 <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
			return;
	//   19   33:return          
		}
		factory2wrapper = ((Factory2Wrapper) (obj));
	//   20   34:aload           4
	//   21   36:astore_3        
		if(layoutinflaterfactory != null)
	//*  22   37:aload_1         
	//*  23   38:ifnull          50
			factory2wrapper = new Factory2Wrapper(layoutinflaterfactory);
	//   24   41:new             #6   <Class LayoutInflaterCompat$Factory2Wrapper>
	//   25   44:dup             
	//   26   45:aload_1         
	//   27   46:invokespecial   #102 <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
	//   28   49:astore_3        
		layoutinflater.setFactory2(((android.view.LayoutInflater.Factory2) (factory2wrapper)));
	//   29   50:aload_0         
	//   30   51:aload_3         
	//   31   52:invokevirtual   #106 <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		layoutinflaterfactory = ((LayoutInflaterFactory) (layoutinflater.getFactory()));
	//   32   55:aload_0         
	//   33   56:invokevirtual   #85  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//   34   59:astore_1        
		if(layoutinflaterfactory instanceof android.view.LayoutInflater.Factory2)
	//*  35   60:aload_1         
	//*  36   61:instanceof      #108 <Class android.view.LayoutInflater$Factory2>
	//*  37   64:ifeq            76
		{
			forceSetFactory2(layoutinflater, (android.view.LayoutInflater.Factory2)layoutinflaterfactory);
	//   38   67:aload_0         
	//   39   68:aload_1         
	//   40   69:checkcast       #108 <Class android.view.LayoutInflater$Factory2>
	//   41   72:invokestatic    #110 <Method void forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   42   75:return          
		} else
		{
			forceSetFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (factory2wrapper)));
	//   43   76:aload_0         
	//   44   77:aload_3         
	//   45   78:invokestatic    #110 <Method void forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   46   81:return          
		}
	}

	public static void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		layoutinflater.setFactory2(factory2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #106 <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   3    5:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpge          39
		{
			android.view.LayoutInflater.Factory factory = layoutinflater.getFactory();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #85  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//    8   17:astore_2        
			if(factory instanceof android.view.LayoutInflater.Factory2)
	//*   9   18:aload_2         
	//*  10   19:instanceof      #108 <Class android.view.LayoutInflater$Factory2>
	//*  11   22:ifeq            34
			{
				forceSetFactory2(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
	//   12   25:aload_0         
	//   13   26:aload_2         
	//   14   27:checkcast       #108 <Class android.view.LayoutInflater$Factory2>
	//   15   30:invokestatic    #110 <Method void forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
				return;
	//   16   33:return          
			}
			forceSetFactory2(layoutinflater, factory2);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokestatic    #110 <Method void forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
		}
	//   20   39:return          
	}

	private static final String TAG = "LayoutInflaterCompatHC";
	private static boolean sCheckedField;
	private static Field sLayoutInflaterFactory2Field;
}
