// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

public final class LayoutInflaterCompat
{

	private static void forceSetFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		if(!sCheckedField)
	//*   0    0:getstatic       #16  <Field boolean sCheckedField>
	//*   1    3:ifne            74
		{
			try
			{
				sLayoutInflaterFactory2Field = ((Class) (android/view/LayoutInflater)).getDeclaredField("mFactory2");
	//    2    6:ldc1            #18  <Class LayoutInflater>
	//    3    8:ldc1            #20  <String "mFactory2">
	//    4   10:invokevirtual   #26  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #28  <Field Field sLayoutInflaterFactory2Field>
				sLayoutInflaterFactory2Field.setAccessible(true);
	//    6   16:getstatic       #28  <Field Field sLayoutInflaterFactory2Field>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #34  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            70
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_2        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #36  <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #40  <Method void StringBuilder()>
	//   14   34:astore_3        
				stringbuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
	//   15   35:aload_3         
	//   16   36:ldc1            #42  <String "forceSetFactory2 Could not find field 'mFactory2' on class ">
	//   17   38:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
				stringbuilder.append(((Class) (android/view/LayoutInflater)).getName());
	//   19   42:aload_3         
	//   20   43:ldc1            #18  <Class LayoutInflater>
	//   21   45:invokevirtual   #50  <Method String Class.getName()>
	//   22   48:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
				stringbuilder.append("; inflation may have unexpected results.");
	//   24   52:aload_3         
	//   25   53:ldc1            #52  <String "; inflation may have unexpected results.">
	//   26   55:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:pop             
				Log.e("LayoutInflaterCompatHC", stringbuilder.toString(), ((Throwable) (nosuchfieldexception)));
	//   28   59:ldc1            #54  <String "LayoutInflaterCompatHC">
	//   29   61:aload_3         
	//   30   62:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   31   65:aload_2         
	//   32   66:invokestatic    #63  <Method int Log.e(String, String, Throwable)>
	//   33   69:pop             
			}
			sCheckedField = true;
	//   34   70:iconst_1        
	//   35   71:putstatic       #16  <Field boolean sCheckedField>
		}
		Object obj = ((Object) (sLayoutInflaterFactory2Field));
	//   36   74:getstatic       #28  <Field Field sLayoutInflaterFactory2Field>
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
	//   43   85:invokevirtual   #67  <Method void Field.set(Object, Object)>
				return;
	//   44   88:return          
			}
			// Misplaced declaration of an exception variable
			catch(android.view.LayoutInflater.Factory2 factory2)
	//*  45   89:astore_1        
			{
				obj = ((Object) (new StringBuilder()));
	//   46   90:new             #36  <Class StringBuilder>
	//   47   93:dup             
	//   48   94:invokespecial   #40  <Method void StringBuilder()>
	//   49   97:astore_2        
			}
			((StringBuilder) (obj)).append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
	//   50   98:aload_2         
	//   51   99:ldc1            #69  <String "forceSetFactory2 could not set the Factory2 on LayoutInflater ">
	//   52  101:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
			((StringBuilder) (obj)).append(((Object) (layoutinflater)));
	//   54  105:aload_2         
	//   55  106:aload_0         
	//   56  107:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   57  110:pop             
			((StringBuilder) (obj)).append("; inflation may have unexpected results.");
	//   58  111:aload_2         
	//   59  112:ldc1            #52  <String "; inflation may have unexpected results.">
	//   60  114:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
			Log.e("LayoutInflaterCompatHC", ((StringBuilder) (obj)).toString(), ((Throwable) (factory2)));
	//   62  118:ldc1            #54  <String "LayoutInflaterCompatHC">
	//   63  120:aload_2         
	//   64  121:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   65  124:aload_1         
	//   66  125:invokestatic    #63  <Method int Log.e(String, String, Throwable)>
	//   67  128:pop             
		}
	//   68  129:return          
	}

	public static void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		layoutinflater.setFactory2(factory2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #78  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   3    5:getstatic       #84  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpge          39
		{
			android.view.LayoutInflater.Factory factory = layoutinflater.getFactory();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #88  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//    8   17:astore_2        
			if(factory instanceof android.view.LayoutInflater.Factory2)
	//*   9   18:aload_2         
	//*  10   19:instanceof      #90  <Class android.view.LayoutInflater$Factory2>
	//*  11   22:ifeq            34
			{
				forceSetFactory2(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
	//   12   25:aload_0         
	//   13   26:aload_2         
	//   14   27:checkcast       #90  <Class android.view.LayoutInflater$Factory2>
	//   15   30:invokestatic    #92  <Method void forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
				return;
	//   16   33:return          
			}
			forceSetFactory2(layoutinflater, factory2);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokestatic    #92  <Method void forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
		}
	//   20   39:return          
	}

	private static boolean sCheckedField;
	private static Field sLayoutInflaterFactory2Field;
}
