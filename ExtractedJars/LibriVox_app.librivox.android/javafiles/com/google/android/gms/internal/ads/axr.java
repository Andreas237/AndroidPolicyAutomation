// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, ayc, ayd, asq, 
//			asr

public final class axr extends Enum
	implements asp
{

	private axr(String s, int i1, int j1)
	{
		super(s, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #81  <Method void Enum(String, int)>
		l = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #83  <Field int l>
	//    7   11:return          
	}

	public static axr a(int i1)
	{
		switch(i1)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 9: default 56
	//	               0 94
	//	               1 90
	//	               2 86
	//	               3 82
	//	               4 78
	//	               5 74
	//	               6 70
	//	               7 66
	//	               8 62
	//	               9 58
		default:
			return null;
	//    2   56:aconst_null     
	//    3   57:areturn         

		case 9: // '\t'
			return j;
	//    4   58:getstatic       #69  <Field axr j>
	//    5   61:areturn         

		case 8: // '\b'
			return i;
	//    6   62:getstatic       #65  <Field axr i>
	//    7   65:areturn         

		case 7: // '\007'
			return h;
	//    8   66:getstatic       #61  <Field axr h>
	//    9   69:areturn         

		case 6: // '\006'
			return g;
	//   10   70:getstatic       #57  <Field axr g>
	//   11   73:areturn         

		case 5: // '\005'
			return f;
	//   12   74:getstatic       #53  <Field axr f>
	//   13   77:areturn         

		case 4: // '\004'
			return e;
	//   14   78:getstatic       #49  <Field axr e>
	//   15   81:areturn         

		case 3: // '\003'
			return d;
	//   16   82:getstatic       #45  <Field axr d>
	//   17   85:areturn         

		case 2: // '\002'
			return c;
	//   18   86:getstatic       #41  <Field axr c>
	//   19   89:areturn         

		case 1: // '\001'
			return b;
	//   20   90:getstatic       #37  <Field axr b>
	//   21   93:areturn         

		case 0: // '\0'
			return a;
	//   22   94:getstatic       #33  <Field axr a>
	//   23   97:areturn         
		}
	}

	public static asr b()
	{
		return ayd.a;
	//    0    0:getstatic       #90  <Field asr ayd.a>
	//    1    3:areturn         
	}

	public static axr[] values()
	{
		return (axr[])((axr []) (m)).clone();
	//    0    0:getstatic       #71  <Field axr[] m>
	//    1    3:invokevirtual   #97  <Method Object _5B_Lcom.google.android.gms.internal.ads.axr_3B_.clone()>
	//    2    6:checkcast       #93  <Class axr[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int l>
	//    2    4:ireturn         
	}

	private static final axr a;
	private static final axr b;
	private static final axr c;
	private static final axr d;
	private static final axr e;
	private static final axr f;
	private static final axr g;
	private static final axr h;
	private static final axr i;
	private static final axr j;
	private static final asq k = new ayc();
	private static final axr m[];
	private final int l;

	static 
	{
		a = new axr("UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class axr>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #31  <Method void axr(String, int, int)>
	//    6   11:putstatic       #33  <Field axr a>
		b = new axr("URL_PHISHING", 1, 1);
	//    7   14:new             #2   <Class axr>
	//    8   17:dup             
	//    9   18:ldc1            #35  <String "URL_PHISHING">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #31  <Method void axr(String, int, int)>
	//   13   25:putstatic       #37  <Field axr b>
		c = new axr("URL_MALWARE", 2, 2);
	//   14   28:new             #2   <Class axr>
	//   15   31:dup             
	//   16   32:ldc1            #39  <String "URL_MALWARE">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #31  <Method void axr(String, int, int)>
	//   20   39:putstatic       #41  <Field axr c>
		d = new axr("URL_UNWANTED", 3, 3);
	//   21   42:new             #2   <Class axr>
	//   22   45:dup             
	//   23   46:ldc1            #43  <String "URL_UNWANTED">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #31  <Method void axr(String, int, int)>
	//   27   53:putstatic       #45  <Field axr d>
		e = new axr("CLIENT_SIDE_PHISHING_URL", 4, 4);
	//   28   56:new             #2   <Class axr>
	//   29   59:dup             
	//   30   60:ldc1            #47  <String "CLIENT_SIDE_PHISHING_URL">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #31  <Method void axr(String, int, int)>
	//   34   67:putstatic       #49  <Field axr e>
		f = new axr("CLIENT_SIDE_MALWARE_URL", 5, 5);
	//   35   70:new             #2   <Class axr>
	//   36   73:dup             
	//   37   74:ldc1            #51  <String "CLIENT_SIDE_MALWARE_URL">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #31  <Method void axr(String, int, int)>
	//   41   81:putstatic       #53  <Field axr f>
		g = new axr("DANGEROUS_DOWNLOAD_RECOVERY", 6, 6);
	//   42   84:new             #2   <Class axr>
	//   43   87:dup             
	//   44   88:ldc1            #55  <String "DANGEROUS_DOWNLOAD_RECOVERY">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #31  <Method void axr(String, int, int)>
	//   48   97:putstatic       #57  <Field axr g>
		h = new axr("DANGEROUS_DOWNLOAD_WARNING", 7, 7);
	//   49  100:new             #2   <Class axr>
	//   50  103:dup             
	//   51  104:ldc1            #59  <String "DANGEROUS_DOWNLOAD_WARNING">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #31  <Method void axr(String, int, int)>
	//   55  113:putstatic       #61  <Field axr h>
		i = new axr("OCTAGON_AD", 8, 8);
	//   56  116:new             #2   <Class axr>
	//   57  119:dup             
	//   58  120:ldc1            #63  <String "OCTAGON_AD">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #31  <Method void axr(String, int, int)>
	//   62  129:putstatic       #65  <Field axr i>
		j = new axr("OCTAGON_AD_SB_MATCH", 9, 9);
	//   63  132:new             #2   <Class axr>
	//   64  135:dup             
	//   65  136:ldc1            #67  <String "OCTAGON_AD_SB_MATCH">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #31  <Method void axr(String, int, int)>
	//   69  145:putstatic       #69  <Field axr j>
		m = (new axr[] {
			a, b, c, d, e, f, g, h, i, j
		});
	//   70  148:bipush          10
	//   71  150:anewarray       axr[]
	//   72  153:dup             
	//   73  154:iconst_0        
	//   74  155:getstatic       #33  <Field axr a>
	//   75  158:aastore         
	//   76  159:dup             
	//   77  160:iconst_1        
	//   78  161:getstatic       #37  <Field axr b>
	//   79  164:aastore         
	//   80  165:dup             
	//   81  166:iconst_2        
	//   82  167:getstatic       #41  <Field axr c>
	//   83  170:aastore         
	//   84  171:dup             
	//   85  172:iconst_3        
	//   86  173:getstatic       #45  <Field axr d>
	//   87  176:aastore         
	//   88  177:dup             
	//   89  178:iconst_4        
	//   90  179:getstatic       #49  <Field axr e>
	//   91  182:aastore         
	//   92  183:dup             
	//   93  184:iconst_5        
	//   94  185:getstatic       #53  <Field axr f>
	//   95  188:aastore         
	//   96  189:dup             
	//   97  190:bipush          6
	//   98  192:getstatic       #57  <Field axr g>
	//   99  195:aastore         
	//  100  196:dup             
	//  101  197:bipush          7
	//  102  199:getstatic       #61  <Field axr h>
	//  103  202:aastore         
	//  104  203:dup             
	//  105  204:bipush          8
	//  106  206:getstatic       #65  <Field axr i>
	//  107  209:aastore         
	//  108  210:dup             
	//  109  211:bipush          9
	//  110  213:getstatic       #69  <Field axr j>
	//  111  216:aastore         
	//  112  217:putstatic       #71  <Field axr[] m>
	//  113  220:new             #73  <Class ayc>
	//  114  223:dup             
	//  115  224:invokespecial   #75  <Method void ayc()>
	//  116  227:putstatic       #77  <Field asq k>
	//* 117  230:return          
	}
}
