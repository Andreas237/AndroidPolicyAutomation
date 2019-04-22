// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;

import com.appboy.models.IPutIntoJson;

public final class InAppMessageFailureType extends Enum
	implements IPutIntoJson
{

	private InAppMessageFailureType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static InAppMessageFailureType valueOf(String s)
	{
		return (InAppMessageFailureType)Enum.valueOf(com/appboy/enums/inappmessage/InAppMessageFailureType, s);
	//    0    0:ldc1            #2   <Class InAppMessageFailureType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class InAppMessageFailureType>
	//    4    9:areturn         
	}

	public static InAppMessageFailureType[] values()
	{
		return (InAppMessageFailureType[])((InAppMessageFailureType []) (a)).clone();
	//    0    0:getstatic       #40  <Field InAppMessageFailureType[] a>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.appboy.enums.inappmessage.InAppMessageFailureType_3B_.clone()>
	//    2    6:checkcast       #51  <Class InAppMessageFailureType[]>
	//    3    9:areturn         
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method String forJsonPut()>
	//    2    4:areturn         
	}

	public String forJsonPut()
	{
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[InAppMessageFailureType.values().length];
			//    0    0:invokestatic    #16  <Method InAppMessageFailureType[] InAppMessageFailureType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #18  <Field int[] a>
				try
				{
					a[InAppMessageFailureType.IMAGE_DOWNLOAD.ordinal()] = 1;
			//    4    9:getstatic       #18  <Field int[] a>
			//    5   12:getstatic       #22  <Field InAppMessageFailureType InAppMessageFailureType.IMAGE_DOWNLOAD>
			//    6   15:invokevirtual   #26  <Method int InAppMessageFailureType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #18  <Field int[] a>
			//*  10   23:getstatic       #29  <Field InAppMessageFailureType InAppMessageFailureType.TEMPLATE_REQUEST>
			//*  11   26:invokevirtual   #26  <Method int InAppMessageFailureType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #18  <Field int[] a>
			//*  15   34:getstatic       #32  <Field InAppMessageFailureType InAppMessageFailureType.ZIP_ASSET_DOWNLOAD>
			//*  16   37:invokevirtual   #26  <Method int InAppMessageFailureType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #18  <Field int[] a>
			//*  20   45:getstatic       #35  <Field InAppMessageFailureType InAppMessageFailureType.DISPLAY_VIEW_GENERATION>
			//*  21   48:invokevirtual   #26  <Method int InAppMessageFailureType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #18  <Field int[] a>
			//*  25   56:getstatic       #38  <Field InAppMessageFailureType InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED>
			//*  26   59:invokevirtual   #26  <Method int InAppMessageFailureType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					a[InAppMessageFailureType.TEMPLATE_REQUEST.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					a[InAppMessageFailureType.ZIP_ASSET_DOWNLOAD.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					a[InAppMessageFailureType.DISPLAY_VIEW_GENERATION.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					a[InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1.a[ordinal()])
	//*   0    0:getstatic       #62  <Field int[] InAppMessageFailureType$1.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #66  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 58
	//	               2 55
	//	               3 52
	//	               4 49
	//	               5 46
		default:
			return null;
	//    5   44:aconst_null     
	//    6   45:areturn         

		case 5: // '\005'
			return "te";
	//    7   46:ldc1            #68  <String "te">
	//    8   48:areturn         

		case 4: // '\004'
			return "vf";
	//    9   49:ldc1            #70  <String "vf">
	//   10   51:areturn         

		case 3: // '\003'
			return "zf";
	//   11   52:ldc1            #72  <String "zf">
	//   12   54:areturn         

		case 2: // '\002'
			return "tf";
	//   13   55:ldc1            #74  <String "tf">
	//   14   57:areturn         

		case 1: // '\001'
			return "if";
	//   15   58:ldc1            #76  <String "if">
	//   16   60:areturn         
		}
	}

	public static final InAppMessageFailureType DISPLAY_VIEW_GENERATION;
	public static final InAppMessageFailureType IMAGE_DOWNLOAD;
	public static final InAppMessageFailureType INTERNAL_TIMEOUT_EXCEEDED;
	public static final InAppMessageFailureType TEMPLATE_REQUEST;
	public static final InAppMessageFailureType ZIP_ASSET_DOWNLOAD;
	private static final InAppMessageFailureType a[];

	static 
	{
		IMAGE_DOWNLOAD = new InAppMessageFailureType("IMAGE_DOWNLOAD", 0);
	//    0    0:new             #2   <Class InAppMessageFailureType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "IMAGE_DOWNLOAD">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void InAppMessageFailureType(String, int)>
	//    5   10:putstatic       #26  <Field InAppMessageFailureType IMAGE_DOWNLOAD>
		TEMPLATE_REQUEST = new InAppMessageFailureType("TEMPLATE_REQUEST", 1);
	//    6   13:new             #2   <Class InAppMessageFailureType>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "TEMPLATE_REQUEST">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void InAppMessageFailureType(String, int)>
	//   11   23:putstatic       #29  <Field InAppMessageFailureType TEMPLATE_REQUEST>
		ZIP_ASSET_DOWNLOAD = new InAppMessageFailureType("ZIP_ASSET_DOWNLOAD", 2);
	//   12   26:new             #2   <Class InAppMessageFailureType>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "ZIP_ASSET_DOWNLOAD">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void InAppMessageFailureType(String, int)>
	//   17   36:putstatic       #32  <Field InAppMessageFailureType ZIP_ASSET_DOWNLOAD>
		DISPLAY_VIEW_GENERATION = new InAppMessageFailureType("DISPLAY_VIEW_GENERATION", 3);
	//   18   39:new             #2   <Class InAppMessageFailureType>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "DISPLAY_VIEW_GENERATION">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void InAppMessageFailureType(String, int)>
	//   23   49:putstatic       #35  <Field InAppMessageFailureType DISPLAY_VIEW_GENERATION>
		INTERNAL_TIMEOUT_EXCEEDED = new InAppMessageFailureType("INTERNAL_TIMEOUT_EXCEEDED", 4);
	//   24   52:new             #2   <Class InAppMessageFailureType>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "INTERNAL_TIMEOUT_EXCEEDED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void InAppMessageFailureType(String, int)>
	//   29   62:putstatic       #38  <Field InAppMessageFailureType INTERNAL_TIMEOUT_EXCEEDED>
		a = (new InAppMessageFailureType[] {
			IMAGE_DOWNLOAD, TEMPLATE_REQUEST, ZIP_ASSET_DOWNLOAD, DISPLAY_VIEW_GENERATION, INTERNAL_TIMEOUT_EXCEEDED
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       InAppMessageFailureType[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #26  <Field InAppMessageFailureType IMAGE_DOWNLOAD>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #29  <Field InAppMessageFailureType TEMPLATE_REQUEST>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #32  <Field InAppMessageFailureType ZIP_ASSET_DOWNLOAD>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #35  <Field InAppMessageFailureType DISPLAY_VIEW_GENERATION>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #38  <Field InAppMessageFailureType INTERNAL_TIMEOUT_EXCEEDED>
	//   51   98:aastore         
	//   52   99:putstatic       #40  <Field InAppMessageFailureType[] a>
	//*  53  102:return          
	}
}
