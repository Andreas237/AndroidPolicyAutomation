// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import com.appboy.models.IPutIntoJson;
import java.util.Locale;

public final class AppStore extends Enum
	implements IPutIntoJson
{

	private AppStore(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static String serverStringToEnumString(String s)
	{
		return s.replace(" ", "_").toUpperCase(Locale.US);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String " ">
	//    2    3:ldc1            #37  <String "_">
	//    3    5:invokevirtual   #43  <Method String String.replace(CharSequence, CharSequence)>
	//    4    8:getstatic       #49  <Field Locale Locale.US>
	//    5   11:invokevirtual   #53  <Method String String.toUpperCase(Locale)>
	//    6   14:areturn         
	}

	public static AppStore valueOf(String s)
	{
		return (AppStore)Enum.valueOf(com/appboy/enums/AppStore, s);
	//    0    0:ldc1            #2   <Class AppStore>
	//    1    2:aload_0         
	//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppStore>
	//    4    9:areturn         
	}

	public static AppStore[] values()
	{
		return (AppStore[])((AppStore []) (a)).clone();
	//    0    0:getstatic       #28  <Field AppStore[] a>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.appboy.enums.AppStore_3B_.clone()>
	//    2    6:checkcast       #61  <Class AppStore[]>
	//    3    9:areturn         
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method String forJsonPut()>
	//    2    4:areturn         
	}

	public String forJsonPut()
	{
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[AppStore.values().length];
			//    0    0:invokestatic    #16  <Method AppStore[] AppStore.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #18  <Field int[] a>
				try
				{
					a[AppStore.GOOGLE_PLAY_STORE.ordinal()] = 1;
			//    4    9:getstatic       #18  <Field int[] a>
			//    5   12:getstatic       #22  <Field AppStore AppStore.GOOGLE_PLAY_STORE>
			//    6   15:invokevirtual   #26  <Method int AppStore.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #18  <Field int[] a>
			//*  10   23:getstatic       #29  <Field AppStore AppStore.KINDLE_STORE>
			//*  11   26:invokevirtual   #26  <Method int AppStore.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					a[AppStore.KINDLE_STORE.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1.a[ordinal()])
	//*   0    0:getstatic       #72  <Field int[] AppStore$1.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #76  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 37
	//	               2 34
		default:
			return null;
	//    5   32:aconst_null     
	//    6   33:areturn         

		case 2: // '\002'
			return "Kindle Store";
	//    7   34:ldc1            #78  <String "Kindle Store">
	//    8   36:areturn         

		case 1: // '\001'
			return "Google Play Store";
	//    9   37:ldc1            #80  <String "Google Play Store">
	//   10   39:areturn         
		}
	}

	public static final AppStore GOOGLE_PLAY_STORE;
	public static final AppStore KINDLE_STORE;
	private static final AppStore a[];

	static 
	{
		GOOGLE_PLAY_STORE = new AppStore("GOOGLE_PLAY_STORE", 0);
	//    0    0:new             #2   <Class AppStore>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "GOOGLE_PLAY_STORE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void AppStore(String, int)>
	//    5   10:putstatic       #23  <Field AppStore GOOGLE_PLAY_STORE>
		KINDLE_STORE = new AppStore("KINDLE_STORE", 1);
	//    6   13:new             #2   <Class AppStore>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "KINDLE_STORE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void AppStore(String, int)>
	//   11   23:putstatic       #26  <Field AppStore KINDLE_STORE>
		a = (new AppStore[] {
			GOOGLE_PLAY_STORE, KINDLE_STORE
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AppStore[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #23  <Field AppStore GOOGLE_PLAY_STORE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field AppStore KINDLE_STORE>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field AppStore[] a>
	//*  23   45:return          
	}
}
