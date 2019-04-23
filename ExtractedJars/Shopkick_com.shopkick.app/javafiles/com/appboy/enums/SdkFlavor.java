// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import com.appboy.models.IPutIntoJson;

public final class SdkFlavor extends Enum
	implements IPutIntoJson
{

	private SdkFlavor(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static SdkFlavor valueOf(String s)
	{
		return (SdkFlavor)Enum.valueOf(com/appboy/enums/SdkFlavor, s);
	//    0    0:ldc1            #2   <Class SdkFlavor>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SdkFlavor>
	//    4    9:areturn         
	}

	public static SdkFlavor[] values()
	{
		return (SdkFlavor[])((SdkFlavor []) (a)).clone();
	//    0    0:getstatic       #44  <Field SdkFlavor[] a>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.appboy.enums.SdkFlavor_3B_.clone()>
	//    2    6:checkcast       #55  <Class SdkFlavor[]>
	//    3    9:areturn         
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method String forJsonPut()>
	//    2    4:areturn         
	}

	public String forJsonPut()
	{
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[SdkFlavor.values().length];
			//    0    0:invokestatic    #16  <Method SdkFlavor[] SdkFlavor.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #18  <Field int[] a>
				try
				{
					a[SdkFlavor.UNITY.ordinal()] = 1;
			//    4    9:getstatic       #18  <Field int[] a>
			//    5   12:getstatic       #22  <Field SdkFlavor SdkFlavor.UNITY>
			//    6   15:invokevirtual   #26  <Method int SdkFlavor.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #18  <Field int[] a>
			//*  10   23:getstatic       #29  <Field SdkFlavor SdkFlavor.REACT>
			//*  11   26:invokevirtual   #26  <Method int SdkFlavor.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #18  <Field int[] a>
			//*  15   34:getstatic       #32  <Field SdkFlavor SdkFlavor.CORDOVA>
			//*  16   37:invokevirtual   #26  <Method int SdkFlavor.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #18  <Field int[] a>
			//*  20   45:getstatic       #35  <Field SdkFlavor SdkFlavor.XAMARIN>
			//*  21   48:invokevirtual   #26  <Method int SdkFlavor.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #18  <Field int[] a>
			//*  25   56:getstatic       #38  <Field SdkFlavor SdkFlavor.SEGMENT>
			//*  26   59:invokevirtual   #26  <Method int SdkFlavor.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #18  <Field int[] a>
			//*  30   67:getstatic       #41  <Field SdkFlavor SdkFlavor.MPARTICLE>
			//*  31   70:invokevirtual   #26  <Method int SdkFlavor.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   35   77:astore_0        
				try
				{
					a[SdkFlavor.REACT.ordinal()] = 2;
				}
			//*  36   78:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   37   81:astore_0        
				try
				{
					a[SdkFlavor.CORDOVA.ordinal()] = 3;
				}
			//*  38   82:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   39   85:astore_0        
				try
				{
					a[SdkFlavor.XAMARIN.ordinal()] = 4;
				}
			//*  40   86:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   41   89:astore_0        
				try
				{
					a[SdkFlavor.SEGMENT.ordinal()] = 5;
				}
			//*  42   90:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   43   93:astore_0        
				try
				{
					a[SdkFlavor.MPARTICLE.ordinal()] = 6;
				}
			//*  44   94:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   97:astore_0        
			//*  46   98:return          
			}
		}

		switch(_cls1.a[ordinal()])
	//*   0    0:getstatic       #66  <Field int[] SdkFlavor$1.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #70  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 6: default 48
	//	               1 65
	//	               2 62
	//	               3 59
	//	               4 56
	//	               5 53
	//	               6 50
		default:
			return null;
	//    5   48:aconst_null     
	//    6   49:areturn         

		case 6: // '\006'
			return "mparticle";
	//    7   50:ldc1            #72  <String "mparticle">
	//    8   52:areturn         

		case 5: // '\005'
			return "segment";
	//    9   53:ldc1            #74  <String "segment">
	//   10   55:areturn         

		case 4: // '\004'
			return "xamarin";
	//   11   56:ldc1            #76  <String "xamarin">
	//   12   58:areturn         

		case 3: // '\003'
			return "cordova";
	//   13   59:ldc1            #78  <String "cordova">
	//   14   61:areturn         

		case 2: // '\002'
			return "react";
	//   15   62:ldc1            #80  <String "react">
	//   16   64:areturn         

		case 1: // '\001'
			return "unity";
	//   17   65:ldc1            #82  <String "unity">
	//   18   67:areturn         
		}
	}

	public static final SdkFlavor CORDOVA;
	public static final SdkFlavor MPARTICLE;
	public static final SdkFlavor REACT;
	public static final SdkFlavor SEGMENT;
	public static final SdkFlavor UNITY;
	public static final SdkFlavor XAMARIN;
	private static final SdkFlavor a[];

	static 
	{
		UNITY = new SdkFlavor("UNITY", 0);
	//    0    0:new             #2   <Class SdkFlavor>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "UNITY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void SdkFlavor(String, int)>
	//    5   10:putstatic       #27  <Field SdkFlavor UNITY>
		REACT = new SdkFlavor("REACT", 1);
	//    6   13:new             #2   <Class SdkFlavor>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "REACT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void SdkFlavor(String, int)>
	//   11   23:putstatic       #30  <Field SdkFlavor REACT>
		CORDOVA = new SdkFlavor("CORDOVA", 2);
	//   12   26:new             #2   <Class SdkFlavor>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "CORDOVA">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void SdkFlavor(String, int)>
	//   17   36:putstatic       #33  <Field SdkFlavor CORDOVA>
		XAMARIN = new SdkFlavor("XAMARIN", 3);
	//   18   39:new             #2   <Class SdkFlavor>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "XAMARIN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void SdkFlavor(String, int)>
	//   23   49:putstatic       #36  <Field SdkFlavor XAMARIN>
		SEGMENT = new SdkFlavor("SEGMENT", 4);
	//   24   52:new             #2   <Class SdkFlavor>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "SEGMENT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void SdkFlavor(String, int)>
	//   29   62:putstatic       #39  <Field SdkFlavor SEGMENT>
		MPARTICLE = new SdkFlavor("MPARTICLE", 5);
	//   30   65:new             #2   <Class SdkFlavor>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "MPARTICLE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void SdkFlavor(String, int)>
	//   35   75:putstatic       #42  <Field SdkFlavor MPARTICLE>
		a = (new SdkFlavor[] {
			UNITY, REACT, CORDOVA, XAMARIN, SEGMENT, MPARTICLE
		});
	//   36   78:bipush          6
	//   37   80:anewarray       SdkFlavor[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #27  <Field SdkFlavor UNITY>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #30  <Field SdkFlavor REACT>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #33  <Field SdkFlavor CORDOVA>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #36  <Field SdkFlavor XAMARIN>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #39  <Field SdkFlavor SEGMENT>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #42  <Field SdkFlavor MPARTICLE>
	//   61  118:aastore         
	//   62  119:putstatic       #44  <Field SdkFlavor[] a>
	//*  63  122:return          
	}
}
