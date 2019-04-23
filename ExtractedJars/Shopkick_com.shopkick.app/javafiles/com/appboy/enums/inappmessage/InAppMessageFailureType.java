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
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static InAppMessageFailureType valueOf(String s)
	{
		return (InAppMessageFailureType)Enum.valueOf(com/appboy/enums/inappmessage/InAppMessageFailureType, s);
	//    0    0:ldc1            #2   <Class InAppMessageFailureType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class InAppMessageFailureType>
	//    4    9:areturn         
	}

	public static InAppMessageFailureType[] values()
	{
		return (InAppMessageFailureType[])((InAppMessageFailureType []) (a)).clone();
	//    0    0:getstatic       #36  <Field InAppMessageFailureType[] a>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.appboy.enums.inappmessage.InAppMessageFailureType_3B_.clone()>
	//    2    6:checkcast       #47  <Class InAppMessageFailureType[]>
	//    3    9:areturn         
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method String forJsonPut()>
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
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					a[InAppMessageFailureType.TEMPLATE_REQUEST.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					a[InAppMessageFailureType.ZIP_ASSET_DOWNLOAD.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					a[InAppMessageFailureType.DISPLAY_VIEW_GENERATION.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1.a[ordinal()])
	//*   0    0:getstatic       #58  <Field int[] InAppMessageFailureType$1.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #62  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 51
	//	               2 48
	//	               3 45
	//	               4 42
		default:
			return null;
	//    5   40:aconst_null     
	//    6   41:areturn         

		case 4: // '\004'
			return "vf";
	//    7   42:ldc1            #64  <String "vf">
	//    8   44:areturn         

		case 3: // '\003'
			return "zf";
	//    9   45:ldc1            #66  <String "zf">
	//   10   47:areturn         

		case 2: // '\002'
			return "tf";
	//   11   48:ldc1            #68  <String "tf">
	//   12   50:areturn         

		case 1: // '\001'
			return "if";
	//   13   51:ldc1            #70  <String "if">
	//   14   53:areturn         
		}
	}

	public static final InAppMessageFailureType DISPLAY_VIEW_GENERATION;
	public static final InAppMessageFailureType IMAGE_DOWNLOAD;
	public static final InAppMessageFailureType TEMPLATE_REQUEST;
	public static final InAppMessageFailureType ZIP_ASSET_DOWNLOAD;
	private static final InAppMessageFailureType a[];

	static 
	{
		IMAGE_DOWNLOAD = new InAppMessageFailureType("IMAGE_DOWNLOAD", 0);
	//    0    0:new             #2   <Class InAppMessageFailureType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "IMAGE_DOWNLOAD">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void InAppMessageFailureType(String, int)>
	//    5   10:putstatic       #25  <Field InAppMessageFailureType IMAGE_DOWNLOAD>
		TEMPLATE_REQUEST = new InAppMessageFailureType("TEMPLATE_REQUEST", 1);
	//    6   13:new             #2   <Class InAppMessageFailureType>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "TEMPLATE_REQUEST">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void InAppMessageFailureType(String, int)>
	//   11   23:putstatic       #28  <Field InAppMessageFailureType TEMPLATE_REQUEST>
		ZIP_ASSET_DOWNLOAD = new InAppMessageFailureType("ZIP_ASSET_DOWNLOAD", 2);
	//   12   26:new             #2   <Class InAppMessageFailureType>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "ZIP_ASSET_DOWNLOAD">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void InAppMessageFailureType(String, int)>
	//   17   36:putstatic       #31  <Field InAppMessageFailureType ZIP_ASSET_DOWNLOAD>
		DISPLAY_VIEW_GENERATION = new InAppMessageFailureType("DISPLAY_VIEW_GENERATION", 3);
	//   18   39:new             #2   <Class InAppMessageFailureType>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "DISPLAY_VIEW_GENERATION">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void InAppMessageFailureType(String, int)>
	//   23   49:putstatic       #34  <Field InAppMessageFailureType DISPLAY_VIEW_GENERATION>
		a = (new InAppMessageFailureType[] {
			IMAGE_DOWNLOAD, TEMPLATE_REQUEST, ZIP_ASSET_DOWNLOAD, DISPLAY_VIEW_GENERATION
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       InAppMessageFailureType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #25  <Field InAppMessageFailureType IMAGE_DOWNLOAD>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #28  <Field InAppMessageFailureType TEMPLATE_REQUEST>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #31  <Field InAppMessageFailureType ZIP_ASSET_DOWNLOAD>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #34  <Field InAppMessageFailureType DISPLAY_VIEW_GENERATION>
	//   41   79:aastore         
	//   42   80:putstatic       #36  <Field InAppMessageFailureType[] a>
	//*  43   83:return          
	}
}
