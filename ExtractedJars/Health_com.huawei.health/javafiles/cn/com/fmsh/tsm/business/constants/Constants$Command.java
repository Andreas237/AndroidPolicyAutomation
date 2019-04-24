// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.constants;


// Referenced classes of package cn.com.fmsh.tsm.business.constants:
//			Constants

public static interface Constants$Command
{

	public static final byte LOAD_HEAD[] = {
		-128, 82
	};
	public static final byte LOAD_INITIALIZE_HEAD[] = {
		-128, 80
	};
	public static final byte SELECT_0015[] = abyte0;
	public static final byte SELECT_3F01[] = abyte0;
	public static final byte UPDATE_VALID_DATE[] = {
		4, -42, -107, 24, 8
	};

	/* static  */
	{
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #16  <Int -128>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #17  <Int 80>
	//    9   12:bastore         
	//   10   13:putstatic       #19  <Field byte[] LOAD_INITIALIZE_HEAD>
	//   11   16:iconst_2        
	//   12   17:newarray        byte[]
	//   13   19:dup             
	//   14   20:iconst_0        
	//   15   21:ldc1            #16  <Int -128>
	//   16   23:bastore         
	//   17   24:dup             
	//   18   25:iconst_1        
	//   19   26:ldc1            #20  <Int 82>
	//   20   28:bastore         
	//   21   29:putstatic       #22  <Field byte[] LOAD_HEAD>
		byte abyte0[] = new byte[7];
	//   22   32:bipush          7
	//   23   34:newarray        byte[]
	//   24   36:astore_0        
		abyte0[1] = -92;
	//   25   37:aload_0         
	//   26   38:iconst_1        
	//   27   39:bipush          -92
	//   28   41:bastore         
		abyte0[4] = 2;
	//   29   42:aload_0         
	//   30   43:iconst_4        
	//   31   44:iconst_2        
	//   32   45:bastore         
		abyte0[5] = 63;
	//   33   46:aload_0         
	//   34   47:iconst_5        
	//   35   48:bipush          63
	//   36   50:bastore         
		abyte0[6] = 1;
	//   37   51:aload_0         
	//   38   52:bipush          6
	//   39   54:iconst_1        
	//   40   55:bastore         
	//   41   56:aload_0         
	//   42   57:putstatic       #24  <Field byte[] SELECT_3F01>
		abyte0 = new byte[5];
	//   43   60:iconst_5        
	//   44   61:newarray        byte[]
	//   45   63:astore_0        
		abyte0[1] = -80;
	//   46   64:aload_0         
	//   47   65:iconst_1        
	//   48   66:bipush          -80
	//   49   68:bastore         
		abyte0[2] = -107;
	//   50   69:aload_0         
	//   51   70:iconst_2        
	//   52   71:bipush          -107
	//   53   73:bastore         
	//   54   74:aload_0         
	//   55   75:putstatic       #26  <Field byte[] SELECT_0015>
	//   56   78:iconst_5        
	//   57   79:newarray        byte[]
	//   58   81:dup             
	//   59   82:iconst_0        
	//   60   83:ldc1            #27  <Int 4>
	//   61   85:bastore         
	//   62   86:dup             
	//   63   87:iconst_1        
	//   64   88:ldc1            #28  <Int -42>
	//   65   90:bastore         
	//   66   91:dup             
	//   67   92:iconst_2        
	//   68   93:ldc1            #29  <Int -107>
	//   69   95:bastore         
	//   70   96:dup             
	//   71   97:iconst_3        
	//   72   98:ldc1            #30  <Int 24>
	//   73  100:bastore         
	//   74  101:dup             
	//   75  102:iconst_4        
	//   76  103:ldc1            #31  <Int 8>
	//   77  105:bastore         
	//   78  106:putstatic       #33  <Field byte[] UPDATE_VALID_DATE>
	//*  79  109:return          
	}
}
