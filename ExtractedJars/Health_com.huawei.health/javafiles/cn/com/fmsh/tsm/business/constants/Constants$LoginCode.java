// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.constants;


// Referenced classes of package cn.com.fmsh.tsm.business.constants:
//			Constants

public static interface Constants$LoginCode
{

	public static final byte CANCEL_CONTRACT[] = {
		16, 16
	};
	public static final byte CONTRACTING[] = {
		16, 3
	};
	public static final byte CONTRACT_FAIL[] = {
		16, 4
	};
	public static final byte CONTRACT_OK[] = {
		16, 5
	};
	public static final byte FROZEN[] = {
		16, 18
	};
	public static final byte INFO_INCOMPLETE[] = {
		16, 20
	};
	public static final byte INVALID_PWD[] = {
		16, 1
	};
	public static final byte LOCKED[] = {
		16, 17
	};
	public static final byte LOGOUT[] = {
		16, 6
	};
	public static final byte PWD_OVERRUN[] = {
		16, 19
	};
	public static final byte REGISTER[] = {
		16, 7
	};
	public static final byte UNCONTRACT[] = {
		16, 8
	};
	public static final byte UNCONTRACT_USER[] = {
		16, 2
	};
	public static final byte UNREGISTER[] = abyte0;

	/* static  */
	{
		byte abyte0[] = new byte[2];
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:astore_0        
		abyte0[0] = 16;
	//    3    4:aload_0         
	//    4    5:iconst_0        
	//    5    6:bipush          16
	//    6    8:bastore         
	//    7    9:aload_0         
	//    8   10:putstatic       #26  <Field byte[] UNREGISTER>
	//    9   13:iconst_2        
	//   10   14:newarray        byte[]
	//   11   16:dup             
	//   12   17:iconst_0        
	//   13   18:ldc1            #27  <Int 16>
	//   14   20:bastore         
	//   15   21:dup             
	//   16   22:iconst_1        
	//   17   23:ldc1            #28  <Int 1>
	//   18   25:bastore         
	//   19   26:putstatic       #30  <Field byte[] INVALID_PWD>
	//   20   29:iconst_2        
	//   21   30:newarray        byte[]
	//   22   32:dup             
	//   23   33:iconst_0        
	//   24   34:ldc1            #27  <Int 16>
	//   25   36:bastore         
	//   26   37:dup             
	//   27   38:iconst_1        
	//   28   39:ldc1            #31  <Int 2>
	//   29   41:bastore         
	//   30   42:putstatic       #33  <Field byte[] UNCONTRACT_USER>
	//   31   45:iconst_2        
	//   32   46:newarray        byte[]
	//   33   48:dup             
	//   34   49:iconst_0        
	//   35   50:ldc1            #27  <Int 16>
	//   36   52:bastore         
	//   37   53:dup             
	//   38   54:iconst_1        
	//   39   55:ldc1            #34  <Int 3>
	//   40   57:bastore         
	//   41   58:putstatic       #36  <Field byte[] CONTRACTING>
	//   42   61:iconst_2        
	//   43   62:newarray        byte[]
	//   44   64:dup             
	//   45   65:iconst_0        
	//   46   66:ldc1            #27  <Int 16>
	//   47   68:bastore         
	//   48   69:dup             
	//   49   70:iconst_1        
	//   50   71:ldc1            #37  <Int 4>
	//   51   73:bastore         
	//   52   74:putstatic       #39  <Field byte[] CONTRACT_FAIL>
	//   53   77:iconst_2        
	//   54   78:newarray        byte[]
	//   55   80:dup             
	//   56   81:iconst_0        
	//   57   82:ldc1            #27  <Int 16>
	//   58   84:bastore         
	//   59   85:dup             
	//   60   86:iconst_1        
	//   61   87:ldc1            #40  <Int 5>
	//   62   89:bastore         
	//   63   90:putstatic       #42  <Field byte[] CONTRACT_OK>
	//   64   93:iconst_2        
	//   65   94:newarray        byte[]
	//   66   96:dup             
	//   67   97:iconst_0        
	//   68   98:ldc1            #27  <Int 16>
	//   69  100:bastore         
	//   70  101:dup             
	//   71  102:iconst_1        
	//   72  103:ldc1            #43  <Int 6>
	//   73  105:bastore         
	//   74  106:putstatic       #45  <Field byte[] LOGOUT>
	//   75  109:iconst_2        
	//   76  110:newarray        byte[]
	//   77  112:dup             
	//   78  113:iconst_0        
	//   79  114:ldc1            #27  <Int 16>
	//   80  116:bastore         
	//   81  117:dup             
	//   82  118:iconst_1        
	//   83  119:ldc1            #46  <Int 7>
	//   84  121:bastore         
	//   85  122:putstatic       #48  <Field byte[] REGISTER>
	//   86  125:iconst_2        
	//   87  126:newarray        byte[]
	//   88  128:dup             
	//   89  129:iconst_0        
	//   90  130:ldc1            #27  <Int 16>
	//   91  132:bastore         
	//   92  133:dup             
	//   93  134:iconst_1        
	//   94  135:ldc1            #49  <Int 8>
	//   95  137:bastore         
	//   96  138:putstatic       #51  <Field byte[] UNCONTRACT>
	//   97  141:iconst_2        
	//   98  142:newarray        byte[]
	//   99  144:dup             
	//  100  145:iconst_0        
	//  101  146:ldc1            #27  <Int 16>
	//  102  148:bastore         
	//  103  149:dup             
	//  104  150:iconst_1        
	//  105  151:ldc1            #27  <Int 16>
	//  106  153:bastore         
	//  107  154:putstatic       #53  <Field byte[] CANCEL_CONTRACT>
	//  108  157:iconst_2        
	//  109  158:newarray        byte[]
	//  110  160:dup             
	//  111  161:iconst_0        
	//  112  162:ldc1            #27  <Int 16>
	//  113  164:bastore         
	//  114  165:dup             
	//  115  166:iconst_1        
	//  116  167:ldc1            #54  <Int 17>
	//  117  169:bastore         
	//  118  170:putstatic       #56  <Field byte[] LOCKED>
	//  119  173:iconst_2        
	//  120  174:newarray        byte[]
	//  121  176:dup             
	//  122  177:iconst_0        
	//  123  178:ldc1            #27  <Int 16>
	//  124  180:bastore         
	//  125  181:dup             
	//  126  182:iconst_1        
	//  127  183:ldc1            #57  <Int 18>
	//  128  185:bastore         
	//  129  186:putstatic       #59  <Field byte[] FROZEN>
	//  130  189:iconst_2        
	//  131  190:newarray        byte[]
	//  132  192:dup             
	//  133  193:iconst_0        
	//  134  194:ldc1            #27  <Int 16>
	//  135  196:bastore         
	//  136  197:dup             
	//  137  198:iconst_1        
	//  138  199:ldc1            #60  <Int 19>
	//  139  201:bastore         
	//  140  202:putstatic       #62  <Field byte[] PWD_OVERRUN>
	//  141  205:iconst_2        
	//  142  206:newarray        byte[]
	//  143  208:dup             
	//  144  209:iconst_0        
	//  145  210:ldc1            #27  <Int 16>
	//  146  212:bastore         
	//  147  213:dup             
	//  148  214:iconst_1        
	//  149  215:ldc1            #63  <Int 20>
	//  150  217:bastore         
	//  151  218:putstatic       #65  <Field byte[] INFO_INCOMPLETE>
	//* 152  221:return          
	}
}
