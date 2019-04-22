// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import com.appboy.models.IPutIntoJson;

public final class Gender extends Enum
	implements IPutIntoJson
{

	private Gender(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static Gender valueOf(String s)
	{
		return (Gender)Enum.valueOf(com/appboy/enums/Gender, s);
	//    0    0:ldc1            #2   <Class Gender>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Gender>
	//    4    9:areturn         
	}

	public static Gender[] values()
	{
		return (Gender[])((Gender []) (a)).clone();
	//    0    0:getstatic       #44  <Field Gender[] a>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.appboy.enums.Gender_3B_.clone()>
	//    2    6:checkcast       #55  <Class Gender[]>
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
				a = new int[Gender.values().length];
			//    0    0:invokestatic    #16  <Method Gender[] Gender.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #18  <Field int[] a>
				try
				{
					a[Gender.MALE.ordinal()] = 1;
			//    4    9:getstatic       #18  <Field int[] a>
			//    5   12:getstatic       #22  <Field Gender Gender.MALE>
			//    6   15:invokevirtual   #26  <Method int Gender.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #18  <Field int[] a>
			//*  10   23:getstatic       #29  <Field Gender Gender.FEMALE>
			//*  11   26:invokevirtual   #26  <Method int Gender.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #18  <Field int[] a>
			//*  15   34:getstatic       #32  <Field Gender Gender.OTHER>
			//*  16   37:invokevirtual   #26  <Method int Gender.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #18  <Field int[] a>
			//*  20   45:getstatic       #35  <Field Gender Gender.UNKNOWN>
			//*  21   48:invokevirtual   #26  <Method int Gender.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #18  <Field int[] a>
			//*  25   56:getstatic       #38  <Field Gender Gender.NOT_APPLICABLE>
			//*  26   59:invokevirtual   #26  <Method int Gender.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #18  <Field int[] a>
			//*  30   67:getstatic       #41  <Field Gender Gender.PREFER_NOT_TO_SAY>
			//*  31   70:invokevirtual   #26  <Method int Gender.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   35   77:astore_0        
				try
				{
					a[Gender.FEMALE.ordinal()] = 2;
				}
			//*  36   78:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   37   81:astore_0        
				try
				{
					a[Gender.OTHER.ordinal()] = 3;
				}
			//*  38   82:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   39   85:astore_0        
				try
				{
					a[Gender.UNKNOWN.ordinal()] = 4;
				}
			//*  40   86:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   41   89:astore_0        
				try
				{
					a[Gender.NOT_APPLICABLE.ordinal()] = 5;
				}
			//*  42   90:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   43   93:astore_0        
				try
				{
					a[Gender.PREFER_NOT_TO_SAY.ordinal()] = 6;
				}
			//*  44   94:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   97:astore_0        
			//*  46   98:return          
			}
		}

		switch(_cls1.a[ordinal()])
	//*   0    0:getstatic       #66  <Field int[] Gender$1.a>
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
			return "p";
	//    7   50:ldc1            #72  <String "p">
	//    8   52:areturn         

		case 5: // '\005'
			return "n";
	//    9   53:ldc1            #74  <String "n">
	//   10   55:areturn         

		case 4: // '\004'
			return "u";
	//   11   56:ldc1            #76  <String "u">
	//   12   58:areturn         

		case 3: // '\003'
			return "o";
	//   13   59:ldc1            #78  <String "o">
	//   14   61:areturn         

		case 2: // '\002'
			return "f";
	//   15   62:ldc1            #80  <String "f">
	//   16   64:areturn         

		case 1: // '\001'
			return "m";
	//   17   65:ldc1            #82  <String "m">
	//   18   67:areturn         
		}
	}

	public static final Gender FEMALE;
	public static final Gender MALE;
	public static final Gender NOT_APPLICABLE;
	public static final Gender OTHER;
	public static final Gender PREFER_NOT_TO_SAY;
	public static final Gender UNKNOWN;
	private static final Gender a[];

	static 
	{
		MALE = new Gender("MALE", 0);
	//    0    0:new             #2   <Class Gender>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "MALE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void Gender(String, int)>
	//    5   10:putstatic       #27  <Field Gender MALE>
		FEMALE = new Gender("FEMALE", 1);
	//    6   13:new             #2   <Class Gender>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "FEMALE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void Gender(String, int)>
	//   11   23:putstatic       #30  <Field Gender FEMALE>
		OTHER = new Gender("OTHER", 2);
	//   12   26:new             #2   <Class Gender>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "OTHER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void Gender(String, int)>
	//   17   36:putstatic       #33  <Field Gender OTHER>
		UNKNOWN = new Gender("UNKNOWN", 3);
	//   18   39:new             #2   <Class Gender>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "UNKNOWN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void Gender(String, int)>
	//   23   49:putstatic       #36  <Field Gender UNKNOWN>
		NOT_APPLICABLE = new Gender("NOT_APPLICABLE", 4);
	//   24   52:new             #2   <Class Gender>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "NOT_APPLICABLE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void Gender(String, int)>
	//   29   62:putstatic       #39  <Field Gender NOT_APPLICABLE>
		PREFER_NOT_TO_SAY = new Gender("PREFER_NOT_TO_SAY", 5);
	//   30   65:new             #2   <Class Gender>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "PREFER_NOT_TO_SAY">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void Gender(String, int)>
	//   35   75:putstatic       #42  <Field Gender PREFER_NOT_TO_SAY>
		a = (new Gender[] {
			MALE, FEMALE, OTHER, UNKNOWN, NOT_APPLICABLE, PREFER_NOT_TO_SAY
		});
	//   36   78:bipush          6
	//   37   80:anewarray       Gender[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #27  <Field Gender MALE>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #30  <Field Gender FEMALE>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #33  <Field Gender OTHER>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #36  <Field Gender UNKNOWN>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #39  <Field Gender NOT_APPLICABLE>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #42  <Field Gender PREFER_NOT_TO_SAY>
	//   61  118:aastore         
	//   62  119:putstatic       #44  <Field Gender[] a>
	//*  63  122:return          
	}
}
