// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package uk.co.chrisjenx.calligraphy;

import android.support.v7.widget.*;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import java.util.*;

// Referenced classes of package uk.co.chrisjenx.calligraphy:
//			CalligraphyUtils

public class CalligraphyConfig
{
	public static class Builder
	{

		public Builder addCustomStyle(Class class1, int i)
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

		public Builder addCustomViewWithSetTypeface(Class class1)
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

		public Builder disableCustomViewInflation()
		{
			customViewCreation = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #37  <Field boolean customViewCreation>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder disablePrivateFactoryInjection()
		{
			reflection = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #35  <Field boolean reflection>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDefaultFontPath(String s)
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

		public Builder setFontAttrId(int i)
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
		static boolean access$000(Builder builder)
		{
			return builder.isFontSet;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field boolean isFontSet>
		//    2    4:ireturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.fontAssetPath;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String fontAssetPath>
		//    2    4:areturn         
		}

*/


/*
		static int access$200(Builder builder)
		{
			return builder.attrId;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int attrId>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$300(Builder builder)
		{
			return builder.reflection;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field boolean reflection>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$400(Builder builder)
		{
			return builder.customViewCreation;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field boolean customViewCreation>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$500(Builder builder)
		{
			return builder.customViewTypefaceSupport;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean customViewTypefaceSupport>
		//    2    4:ireturn         
		}

*/


/*
		static Map access$600(Builder builder)
		{
			return builder.mStyleClassMap;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Map mStyleClassMap>
		//    2    4:areturn         
		}

*/


/*
		static Set access$700(Builder builder)
		{
			return builder.mHasTypefaceClasses;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field Set mHasTypefaceClasses>
		//    2    4:areturn         
		}

*/

		public Builder()
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


	protected CalligraphyConfig(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		mIsFontSet = builder.isFontSet;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #85  <Method boolean CalligraphyConfig$Builder.access$000(CalligraphyConfig$Builder)>
	//    5    9:putfield        #87  <Field boolean mIsFontSet>
		mFontPath = builder.fontAssetPath;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #91  <Method String CalligraphyConfig$Builder.access$100(CalligraphyConfig$Builder)>
	//    9   17:putfield        #93  <Field String mFontPath>
		mAttrId = builder.attrId;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #97  <Method int CalligraphyConfig$Builder.access$200(CalligraphyConfig$Builder)>
	//   13   25:putfield        #99  <Field int mAttrId>
		mReflection = builder.reflection;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #102 <Method boolean CalligraphyConfig$Builder.access$300(CalligraphyConfig$Builder)>
	//   17   33:putfield        #104 <Field boolean mReflection>
		mCustomViewCreation = builder.customViewCreation;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #107 <Method boolean CalligraphyConfig$Builder.access$400(CalligraphyConfig$Builder)>
	//   21   41:putfield        #109 <Field boolean mCustomViewCreation>
		mCustomViewTypefaceSupport = builder.customViewTypefaceSupport;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #112 <Method boolean CalligraphyConfig$Builder.access$500(CalligraphyConfig$Builder)>
	//   25   49:putfield        #114 <Field boolean mCustomViewTypefaceSupport>
		HashMap hashmap = new HashMap(DEFAULT_STYLES);
	//   26   52:new             #29  <Class HashMap>
	//   27   55:dup             
	//   28   56:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   29   59:invokespecial   #117 <Method void HashMap(Map)>
	//   30   62:astore_2        
		((Map) (hashmap)).putAll(builder.mStyleClassMap);
	//   31   63:aload_2         
	//   32   64:aload_1         
	//   33   65:invokestatic    #121 <Method Map CalligraphyConfig$Builder.access$600(CalligraphyConfig$Builder)>
	//   34   68:invokeinterface #124 <Method void Map.putAll(Map)>
		mClassStyleAttributeMap = Collections.unmodifiableMap(((Map) (hashmap)));
	//   35   73:aload_0         
	//   36   74:aload_2         
	//   37   75:invokestatic    #130 <Method Map Collections.unmodifiableMap(Map)>
	//   38   78:putfield        #132 <Field Map mClassStyleAttributeMap>
		hasTypefaceViews = Collections.unmodifiableSet(builder.mHasTypefaceClasses);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:invokestatic    #136 <Method Set CalligraphyConfig$Builder.access$700(CalligraphyConfig$Builder)>
	//   42   86:invokestatic    #140 <Method Set Collections.unmodifiableSet(Set)>
	//   43   89:putfield        #142 <Field Set hasTypefaceViews>
	//   44   92:return          
	}

	private static void addAppCompatViews()
	{
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatTextView, ((Object) (Integer.valueOf(0x1010084))));
	//    0    0:getstatic       #34  <Field Map DEFAULT_STYLES>
	//    1    3:ldc1            #144 <Class AppCompatTextView>
	//    2    5:ldc1            #37  <Int 0x1010084>
	//    3    7:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//    4   10:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//    5   15:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatButton, ((Object) (Integer.valueOf(0x1010048))));
	//    6   16:getstatic       #34  <Field Map DEFAULT_STYLES>
	//    7   19:ldc1            #146 <Class AppCompatButton>
	//    8   21:ldc1            #52  <Int 0x1010048>
	//    9   23:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   10   26:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   11   31:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatEditText, ((Object) (Integer.valueOf(0x101006e))));
	//   12   32:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   13   35:ldc1            #148 <Class AppCompatEditText>
	//   14   37:ldc1            #55  <Int 0x101006e>
	//   15   39:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   16   42:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   17   47:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatAutoCompleteTextView, ((Object) (Integer.valueOf(0x101006b))));
	//   18   48:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   19   51:ldc1            #150 <Class AppCompatAutoCompleteTextView>
	//   20   53:ldc1            #58  <Int 0x101006b>
	//   21   55:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   22   58:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   23   63:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatMultiAutoCompleteTextView, ((Object) (Integer.valueOf(0x101006b))));
	//   24   64:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   25   67:ldc1            #152 <Class AppCompatMultiAutoCompleteTextView>
	//   26   69:ldc1            #58  <Int 0x101006b>
	//   27   71:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   28   74:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   29   79:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatCheckBox, ((Object) (Integer.valueOf(0x101006c))));
	//   30   80:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   31   83:ldc1            #154 <Class AppCompatCheckBox>
	//   32   85:ldc1            #63  <Int 0x101006c>
	//   33   87:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   34   90:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   35   95:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatRadioButton, ((Object) (Integer.valueOf(0x101007e))));
	//   36   96:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   37   99:ldc1            #156 <Class AppCompatRadioButton>
	//   38  101:ldc1            #66  <Int 0x101007e>
	//   39  103:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   40  106:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   41  111:pop             
		DEFAULT_STYLES.put(android/support/v7/widget/AppCompatCheckedTextView, ((Object) (Integer.valueOf(0x10103c8))));
	//   42  112:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   43  115:ldc1            #158 <Class AppCompatCheckedTextView>
	//   44  117:ldc1            #159 <Int 0x10103c8>
	//   45  119:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   46  122:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   47  127:pop             
	//   48  128:return          
	}

	public static CalligraphyConfig get()
	{
		if(sInstance == null)
	//*   0    0:getstatic       #163 <Field CalligraphyConfig sInstance>
	//*   1    3:ifnonnull       23
			sInstance = new CalligraphyConfig(new Builder());
	//    2    6:new             #2   <Class CalligraphyConfig>
	//    3    9:dup             
	//    4   10:new             #6   <Class CalligraphyConfig$Builder>
	//    5   13:dup             
	//    6   14:invokespecial   #164 <Method void CalligraphyConfig$Builder()>
	//    7   17:invokespecial   #166 <Method void CalligraphyConfig(CalligraphyConfig$Builder)>
	//    8   20:putstatic       #163 <Field CalligraphyConfig sInstance>
		return sInstance;
	//    9   23:getstatic       #163 <Field CalligraphyConfig sInstance>
	//   10   26:areturn         
	}

	public static void initDefault(CalligraphyConfig calligraphyconfig)
	{
		sInstance = calligraphyconfig;
	//    0    0:aload_0         
	//    1    1:putstatic       #163 <Field CalligraphyConfig sInstance>
	//    2    4:return          
	}

	public int getAttrId()
	{
		return mAttrId;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int mAttrId>
	//    2    4:ireturn         
	}

	Map getClassStyles()
	{
		return mClassStyleAttributeMap;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Map mClassStyleAttributeMap>
	//    2    4:areturn         
	}

	public String getFontPath()
	{
		return mFontPath;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String mFontPath>
	//    2    4:areturn         
	}

	public boolean isCustomViewCreation()
	{
		return mCustomViewCreation;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean mCustomViewCreation>
	//    2    4:ireturn         
	}

	public boolean isCustomViewHasTypeface(View view)
	{
		return hasTypefaceViews.contains(((Object) (((Object) (view)).getClass())));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Set hasTypefaceViews>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method Class Object.getClass()>
	//    4    8:invokeinterface #189 <Method boolean Set.contains(Object)>
	//    5   13:ireturn         
	}

	public boolean isCustomViewTypefaceSupport()
	{
		return mCustomViewTypefaceSupport;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean mCustomViewTypefaceSupport>
	//    2    4:ireturn         
	}

	boolean isFontSet()
	{
		return mIsFontSet;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean mIsFontSet>
	//    2    4:ireturn         
	}

	public boolean isReflection()
	{
		return mReflection;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field boolean mReflection>
	//    2    4:ireturn         
	}

	private static final Map DEFAULT_STYLES;
	private static CalligraphyConfig sInstance;
	private final Set hasTypefaceViews;
	private final int mAttrId;
	private final Map mClassStyleAttributeMap;
	private final boolean mCustomViewCreation;
	private final boolean mCustomViewTypefaceSupport;
	private final String mFontPath;
	private final boolean mIsFontSet;
	private final boolean mReflection;

	static 
	{
		DEFAULT_STYLES = ((Map) (new HashMap()));
	//    0    0:new             #29  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void HashMap()>
	//    3    7:putstatic       #34  <Field Map DEFAULT_STYLES>
		DEFAULT_STYLES.put(android/widget/TextView, ((Object) (Integer.valueOf(0x1010084))));
	//    4   10:getstatic       #34  <Field Map DEFAULT_STYLES>
	//    5   13:ldc1            #36  <Class TextView>
	//    6   15:ldc1            #37  <Int 0x1010084>
	//    7   17:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//    8   20:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//    9   25:pop             
		DEFAULT_STYLES.put(android/widget/Button, ((Object) (Integer.valueOf(0x1010048))));
	//   10   26:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   11   29:ldc1            #51  <Class Button>
	//   12   31:ldc1            #52  <Int 0x1010048>
	//   13   33:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   14   36:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   15   41:pop             
		DEFAULT_STYLES.put(android/widget/EditText, ((Object) (Integer.valueOf(0x101006e))));
	//   16   42:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   17   45:ldc1            #54  <Class EditText>
	//   18   47:ldc1            #55  <Int 0x101006e>
	//   19   49:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   20   52:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   21   57:pop             
		DEFAULT_STYLES.put(android/widget/AutoCompleteTextView, ((Object) (Integer.valueOf(0x101006b))));
	//   22   58:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   23   61:ldc1            #57  <Class AutoCompleteTextView>
	//   24   63:ldc1            #58  <Int 0x101006b>
	//   25   65:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   26   68:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   27   73:pop             
		DEFAULT_STYLES.put(android/widget/MultiAutoCompleteTextView, ((Object) (Integer.valueOf(0x101006b))));
	//   28   74:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   29   77:ldc1            #60  <Class MultiAutoCompleteTextView>
	//   30   79:ldc1            #58  <Int 0x101006b>
	//   31   81:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   32   84:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   33   89:pop             
		DEFAULT_STYLES.put(android/widget/CheckBox, ((Object) (Integer.valueOf(0x101006c))));
	//   34   90:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   35   93:ldc1            #62  <Class CheckBox>
	//   36   95:ldc1            #63  <Int 0x101006c>
	//   37   97:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   38  100:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   39  105:pop             
		DEFAULT_STYLES.put(android/widget/RadioButton, ((Object) (Integer.valueOf(0x101007e))));
	//   40  106:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   41  109:ldc1            #65  <Class RadioButton>
	//   42  111:ldc1            #66  <Int 0x101007e>
	//   43  113:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   44  116:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   45  121:pop             
		DEFAULT_STYLES.put(android/widget/ToggleButton, ((Object) (Integer.valueOf(0x101004b))));
	//   46  122:getstatic       #34  <Field Map DEFAULT_STYLES>
	//   47  125:ldc1            #68  <Class ToggleButton>
	//   48  127:ldc1            #69  <Int 0x101004b>
	//   49  129:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   50  132:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   51  137:pop             
		if(CalligraphyUtils.canAddV7AppCompatViews())
	//*  52  138:invokestatic    #75  <Method boolean CalligraphyUtils.canAddV7AppCompatViews()>
	//*  53  141:ifeq            147
			addAppCompatViews();
	//   54  144:invokestatic    #78  <Method void addAppCompatViews()>
	//*  55  147:return          
	}
}
