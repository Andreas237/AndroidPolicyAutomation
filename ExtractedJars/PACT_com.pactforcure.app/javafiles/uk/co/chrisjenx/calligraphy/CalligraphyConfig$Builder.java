// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package uk.co.chrisjenx.calligraphy;

import android.text.TextUtils;
import java.util.*;

// Referenced classes of package uk.co.chrisjenx.calligraphy:
//			CalligraphyConfig

public static class CalligraphyConfig$Builder
{

	public CalligraphyConfig$Builder addCustomStyle(Class class1, int i)
	{
		if(class1 == null || i == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:iload_2         
	//*   3    5:ifne            10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			mStyleClassMap.put(((Object) (class1)), ((Object) (Integer.valueOf(i))));
	//    6   10:aload_0         
	//    7   11:getfield        #55  <Field Map mStyleClassMap>
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   11   19:invokeinterface #88  <Method Object Map.put(Object, Object)>
	//   12   24:pop             
			return this;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	public CalligraphyConfig$Builder addCustomViewWithSetTypeface(Class class1)
	{
		customViewTypefaceSupport = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean customViewTypefaceSupport>
		mHasTypefaceClasses.add(((Object) (class1)));
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field Set mHasTypefaceClasses>
	//    5    9:aload_1         
	//    6   10:invokeinterface #98  <Method boolean Set.add(Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public CalligraphyConfig build()
	{
		boolean flag;
		if(!TextUtils.isEmpty(((CharSequence) (fontAssetPath))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field String fontAssetPath>
	//*   2    4:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifne            26
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:iload_1         
	//*   8   14:putfield        #48  <Field boolean isFontSet>
	//*   9   17:new             #6   <Class CalligraphyConfig>
	//*  10   20:dup             
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #110 <Method void CalligraphyConfig(CalligraphyConfig$Builder)>
	//*  13   25:areturn         
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		isFontSet = flag;
		return new CalligraphyConfig(this);
	//*  16   28:goto            12
	}

	public CalligraphyConfig$Builder disableCustomViewInflation()
	{
		customViewCreation = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean customViewCreation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CalligraphyConfig$Builder disablePrivateFactoryInjection()
	{
		reflection = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #35  <Field boolean reflection>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CalligraphyConfig$Builder setDefaultFontPath(String s)
	{
		boolean flag;
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            21
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:iload_2         
	//*   7   11:putfield        #48  <Field boolean isFontSet>
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:putfield        #50  <Field String fontAssetPath>
	//*  11   19:aload_0         
	//*  12   20:areturn         
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		isFontSet = flag;
		fontAssetPath = s;
		return this;
	//*  15   23:goto            9
	}

	public CalligraphyConfig$Builder setFontAttrId(int i)
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          12
	//*   3    5:aload_0         
	//*   4    6:iload_1         
	//*   5    7:putfield        #46  <Field int attrId>
	//*   6   10:aload_0         
	//*   7   11:areturn         
			i = -1;
	//    8   12:iconst_m1       
	//    9   13:istore_1        
		attrId = i;
		return this;
	//*  10   14:goto            5
	}

	public static final int INVALID_ATTR_ID = -1;
	private int attrId;
	private boolean customViewCreation;
	private boolean customViewTypefaceSupport;
	private String fontAssetPath;
	private boolean isFontSet;
	private Set mHasTypefaceClasses;
	private Map mStyleClassMap;
	private boolean reflection;


/*
	static boolean access$000(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.isFontSet;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean isFontSet>
	//    2    4:ireturn         
	}

*/


/*
	static String access$100(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.fontAssetPath;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String fontAssetPath>
	//    2    4:areturn         
	}

*/


/*
	static int access$200(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.attrId;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int attrId>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$300(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.reflection;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean reflection>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$400(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.customViewCreation;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean customViewCreation>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$500(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.customViewTypefaceSupport;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean customViewTypefaceSupport>
	//    2    4:ireturn         
	}

*/


/*
	static Map access$600(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.mStyleClassMap;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Map mStyleClassMap>
	//    2    4:areturn         
	}

*/


/*
	static Set access$700(CalligraphyConfig$Builder calligraphyconfig$builder)
	{
		return calligraphyconfig$builder.mHasTypefaceClasses;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set mHasTypefaceClasses>
	//    2    4:areturn         
	}

*/

	public CalligraphyConfig$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   2    4:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          11
	//*   4    9:icmplt          69
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore_1        
		else
	//*   7   14:aload_0         
	//*   8   15:iload_1         
	//*   9   16:putfield        #35  <Field boolean reflection>
	//*  10   19:aload_0         
	//*  11   20:iconst_1        
	//*  12   21:putfield        #37  <Field boolean customViewCreation>
	//*  13   24:aload_0         
	//*  14   25:iconst_0        
	//*  15   26:putfield        #39  <Field boolean customViewTypefaceSupport>
	//*  16   29:aload_0         
	//*  17   30:getstatic       #44  <Field int R$attr.fontPath>
	//*  18   33:putfield        #46  <Field int attrId>
	//*  19   36:aload_0         
	//*  20   37:iconst_0        
	//*  21   38:putfield        #48  <Field boolean isFontSet>
	//*  22   41:aload_0         
	//*  23   42:aconst_null     
	//*  24   43:putfield        #50  <Field String fontAssetPath>
	//*  25   46:aload_0         
	//*  26   47:new             #52  <Class HashMap>
	//*  27   50:dup             
	//*  28   51:invokespecial   #53  <Method void HashMap()>
	//*  29   54:putfield        #55  <Field Map mStyleClassMap>
	//*  30   57:aload_0         
	//*  31   58:new             #57  <Class HashSet>
	//*  32   61:dup             
	//*  33   62:invokespecial   #58  <Method void HashSet()>
	//*  34   65:putfield        #60  <Field Set mHasTypefaceClasses>
	//*  35   68:return          
			flag = false;
	//   36   69:iconst_0        
	//   37   70:istore_1        
		reflection = flag;
		customViewCreation = true;
		customViewTypefaceSupport = false;
		attrId = R.attr.fontPath;
		isFontSet = false;
		fontAssetPath = null;
		mStyleClassMap = ((Map) (new HashMap()));
		mHasTypefaceClasses = ((Set) (new HashSet()));
	//*  38   71:goto            14
	}
}
