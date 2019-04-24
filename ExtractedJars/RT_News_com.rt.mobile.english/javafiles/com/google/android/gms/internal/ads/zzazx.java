// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzazx
{

	public zzazx(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #16  <Field byte[] zzdpc>
		for(int i = 0; i < 256; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_3        
	//*   8   15:iload_3         
	//*   9   16:sipush          256
	//*  10   19:icmpge          37
			zzdpc[i] = (byte)i;
	//   11   22:aload_0         
	//   12   23:getfield        #16  <Field byte[] zzdpc>
	//   13   26:iload_3         
	//   14   27:iload_3         
	//   15   28:int2byte        
	//   16   29:bastore         

	//   17   30:iload_3         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore_3        
	//*  21   34:goto            15
		int j = 0;
	//   22   37:iconst_0        
	//   23   38:istore_3        
		int k = j;
	//   24   39:iload_3         
	//   25   40:istore          4
		for(; j < 256; j++)
	//*  26   42:iload_3         
	//*  27   43:sipush          256
	//*  28   46:icmpge          106
		{
			k = k + zzdpc[j] + abyte0[j % abyte0.length] & 0xff;
	//   29   49:iload           4
	//   30   51:aload_0         
	//   31   52:getfield        #16  <Field byte[] zzdpc>
	//   32   55:iload_3         
	//   33   56:baload          
	//   34   57:iadd            
	//   35   58:aload_1         
	//   36   59:iload_3         
	//   37   60:aload_1         
	//   38   61:arraylength     
	//   39   62:irem            
	//   40   63:baload          
	//   41   64:iadd            
	//   42   65:sipush          255
	//   43   68:iand            
	//   44   69:istore          4
			byte byte0 = zzdpc[j];
	//   45   71:aload_0         
	//   46   72:getfield        #16  <Field byte[] zzdpc>
	//   47   75:iload_3         
	//   48   76:baload          
	//   49   77:istore_2        
			zzdpc[j] = zzdpc[k];
	//   50   78:aload_0         
	//   51   79:getfield        #16  <Field byte[] zzdpc>
	//   52   82:iload_3         
	//   53   83:aload_0         
	//   54   84:getfield        #16  <Field byte[] zzdpc>
	//   55   87:iload           4
	//   56   89:baload          
	//   57   90:bastore         
			zzdpc[k] = byte0;
	//   58   91:aload_0         
	//   59   92:getfield        #16  <Field byte[] zzdpc>
	//   60   95:iload           4
	//   61   97:iload_2         
	//   62   98:bastore         
		}

	//   63   99:iload_3         
	//   64  100:iconst_1        
	//   65  101:iadd            
	//   66  102:istore_3        
	//*  67  103:goto            42
		zzdpd = 0;
	//   68  106:aload_0         
	//   69  107:iconst_0        
	//   70  108:putfield        #18  <Field int zzdpd>
		zzdpe = 0;
	//   71  111:aload_0         
	//   72  112:iconst_0        
	//   73  113:putfield        #20  <Field int zzdpe>
	//   74  116:return          
	}

	public final void zzn(byte abyte0[])
	{
		int k = zzdpd;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int zzdpd>
	//    2    4:istore          5
		int j = zzdpe;
	//    3    6:aload_0         
	//    4    7:getfield        #20  <Field int zzdpe>
	//    5   10:istore          4
		for(int i = 0; i < abyte0.length; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:icmpge          115
		{
			k = k + 1 & 0xff;
	//   12   20:iload           5
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:sipush          255
	//   16   27:iand            
	//   17   28:istore          5
			j = j + zzdpc[k] & 0xff;
	//   18   30:iload           4
	//   19   32:aload_0         
	//   20   33:getfield        #16  <Field byte[] zzdpc>
	//   21   36:iload           5
	//   22   38:baload          
	//   23   39:iadd            
	//   24   40:sipush          255
	//   25   43:iand            
	//   26   44:istore          4
			byte byte0 = zzdpc[k];
	//   27   46:aload_0         
	//   28   47:getfield        #16  <Field byte[] zzdpc>
	//   29   50:iload           5
	//   30   52:baload          
	//   31   53:istore_2        
			zzdpc[k] = zzdpc[j];
	//   32   54:aload_0         
	//   33   55:getfield        #16  <Field byte[] zzdpc>
	//   34   58:iload           5
	//   35   60:aload_0         
	//   36   61:getfield        #16  <Field byte[] zzdpc>
	//   37   64:iload           4
	//   38   66:baload          
	//   39   67:bastore         
			zzdpc[j] = byte0;
	//   40   68:aload_0         
	//   41   69:getfield        #16  <Field byte[] zzdpc>
	//   42   72:iload           4
	//   43   74:iload_2         
	//   44   75:bastore         
			abyte0[i] = (byte)(abyte0[i] ^ zzdpc[zzdpc[k] + zzdpc[j] & 0xff]);
	//   45   76:aload_1         
	//   46   77:iload_3         
	//   47   78:aload_1         
	//   48   79:iload_3         
	//   49   80:baload          
	//   50   81:aload_0         
	//   51   82:getfield        #16  <Field byte[] zzdpc>
	//   52   85:aload_0         
	//   53   86:getfield        #16  <Field byte[] zzdpc>
	//   54   89:iload           5
	//   55   91:baload          
	//   56   92:aload_0         
	//   57   93:getfield        #16  <Field byte[] zzdpc>
	//   58   96:iload           4
	//   59   98:baload          
	//   60   99:iadd            
	//   61  100:sipush          255
	//   62  103:iand            
	//   63  104:baload          
	//   64  105:ixor            
	//   65  106:int2byte        
	//   66  107:bastore         
		}

	//   67  108:iload_3         
	//   68  109:iconst_1        
	//   69  110:iadd            
	//   70  111:istore_3        
	//*  71  112:goto            14
		zzdpd = k;
	//   72  115:aload_0         
	//   73  116:iload           5
	//   74  118:putfield        #18  <Field int zzdpd>
		zzdpe = j;
	//   75  121:aload_0         
	//   76  122:iload           4
	//   77  124:putfield        #20  <Field int zzdpe>
	//   78  127:return          
	}

	private final byte zzdpc[] = new byte[256];
	private int zzdpd;
	private int zzdpe;
}
