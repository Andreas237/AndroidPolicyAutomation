// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.InvalidImageException;
import com.itextpdf.text.pdf.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.*;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TIFFDirectory, TIFFField, CCITTG4Encoder, TIFFFaxDecoder, 
//			TIFFLZWDecoder

public class TiffImage
{

	public TiffImage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static Image ProcessExtraSamples(DeflaterOutputStream deflateroutputstream, DeflaterOutputStream deflateroutputstream1, byte abyte0[], int i, int j, int k, int l)
		throws IOException
	{
		if(j == 8)
	//*   0    0:iload           4
	//*   1    2:bipush          8
	//*   2    4:icmpne          121
		{
			byte abyte1[] = new byte[k * l];
	//    3    7:iload           5
	//    4    9:iload           6
	//    5   11:imul            
	//    6   12:newarray        byte[]
	//    7   14:astore          10
			j = 0;
	//    8   16:iconst_0        
	//    9   17:istore          4
			int j1 = 0;
	//   10   19:iconst_0        
	//   11   20:istore          8
			int i1;
			for(i1 = 0; j1 < k * l * i; i1++)
	//*  12   22:iconst_0        
	//*  13   23:istore          7
	//*  14   25:iload           8
	//*  15   27:iload           5
	//*  16   29:iload           6
	//*  17   31:imul            
	//*  18   32:iload_3         
	//*  19   33:imul            
	//*  20   34:icmpge          102
			{
				for(int k1 = 0; k1 < i - 1;)
	//*  21   37:iconst_0        
	//*  22   38:istore          9
	//*  23   40:iload           9
	//*  24   42:iload_3         
	//*  25   43:iconst_1        
	//*  26   44:isub            
	//*  27   45:icmpge          74
				{
					abyte0[j] = abyte0[j1 + k1];
	//   28   48:aload_2         
	//   29   49:iload           4
	//   30   51:aload_2         
	//   31   52:iload           8
	//   32   54:iload           9
	//   33   56:iadd            
	//   34   57:baload          
	//   35   58:bastore         
					k1++;
	//   36   59:iload           9
	//   37   61:iconst_1        
	//   38   62:iadd            
	//   39   63:istore          9
					j++;
	//   40   65:iload           4
	//   41   67:iconst_1        
	//   42   68:iadd            
	//   43   69:istore          4
				}

	//*  44   71:goto            40
				abyte1[i1] = abyte0[(j1 + i) - 1];
	//   45   74:aload           10
	//   46   76:iload           7
	//   47   78:aload_2         
	//   48   79:iload           8
	//   49   81:iload_3         
	//   50   82:iadd            
	//   51   83:iconst_1        
	//   52   84:isub            
	//   53   85:baload          
	//   54   86:bastore         
				j1 += i;
	//   55   87:iload           8
	//   56   89:iload_3         
	//   57   90:iadd            
	//   58   91:istore          8
			}

	//   59   93:iload           7
	//   60   95:iconst_1        
	//   61   96:iadd            
	//   62   97:istore          7
	//*  63   99:goto            25
			deflateroutputstream.write(abyte0, 0, j);
	//   64  102:aload_0         
	//   65  103:aload_2         
	//   66  104:iconst_0        
	//   67  105:iload           4
	//   68  107:invokevirtual   #19  <Method void DeflaterOutputStream.write(byte[], int, int)>
			deflateroutputstream1.write(abyte1, 0, i1);
	//   69  110:aload_1         
	//   70  111:aload           10
	//   71  113:iconst_0        
	//   72  114:iload           7
	//   73  116:invokevirtual   #19  <Method void DeflaterOutputStream.write(byte[], int, int)>
			return null;
	//   74  119:aconst_null     
	//   75  120:areturn         
		} else
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("extra.samples.are.not.supported", new Object[0]));
	//   76  121:new             #21  <Class IllegalArgumentException>
	//   77  124:dup             
	//   78  125:ldc1            #23  <String "extra.samples.are.not.supported">
	//   79  127:iconst_0        
	//   80  128:anewarray       Object[]
	//   81  131:invokestatic    #29  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   82  134:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   83  137:athrow          
		}
	}

	public static void applyPredictor(byte abyte0[], int i, int j, int k, int l)
	{
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpeq          6
	//*   3    5:return          
		{
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
			while(i < k) 
	//*   6    8:iload_1         
	//*   7    9:iload_3         
	//*   8   10:icmpge          5
			{
				int j1 = l * (i * j + 1);
	//    9   13:iload           4
	//   10   15:iload_1         
	//   11   16:iload_2         
	//   12   17:imul            
	//   13   18:iconst_1        
	//   14   19:iadd            
	//   15   20:imul            
	//   16   21:istore          6
				for(int i1 = l; i1 < j * l; i1++)
	//*  17   23:iload           4
	//*  18   25:istore          5
	//*  19   27:iload           5
	//*  20   29:iload_2         
	//*  21   30:iload           4
	//*  22   32:imul            
	//*  23   33:icmpge          68
				{
					abyte0[j1] = (byte)(abyte0[j1] + abyte0[j1 - l]);
	//   24   36:aload_0         
	//   25   37:iload           6
	//   26   39:aload_0         
	//   27   40:iload           6
	//   28   42:baload          
	//   29   43:aload_0         
	//   30   44:iload           6
	//   31   46:iload           4
	//   32   48:isub            
	//   33   49:baload          
	//   34   50:iadd            
	//   35   51:int2byte        
	//   36   52:bastore         
					j1++;
	//   37   53:iload           6
	//   38   55:iconst_1        
	//   39   56:iadd            
	//   40   57:istore          6
				}

	//   41   59:iload           5
	//   42   61:iconst_1        
	//   43   62:iadd            
	//   44   63:istore          5
	//*  45   65:goto            27
				i++;
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:istore_1        
			}
		}
	//*  50   72:goto            8
	}

	public static void decodePackbits(byte abyte0[], byte abyte1[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore          4
		do
		{
			int k;
			try
			{
				k = abyte1.length;
	//    4    5:aload_1         
	//    5    6:arraylength     
	//    6    7:istore          5
			}
	//*   7    9:iload_3         
	//*   8   10:iload           5
	//*   9   12:icmpge          154
	//*  10   15:iload           4
	//*  11   17:iconst_1        
	//*  12   18:iadd            
	//*  13   19:istore          6
	//*  14   21:aload_0         
	//*  15   22:iload           4
	//*  16   24:baload          
	//*  17   25:istore          7
	//*  18   27:iload           7
	//*  19   29:iflt            84
	//*  20   32:iload           7
	//*  21   34:bipush          127
	//*  22   36:icmpgt          84
	//*  23   39:iconst_0        
	//*  24   40:istore          5
	//*  25   42:iload           6
	//*  26   44:istore          4
	//*  27   46:iload           5
	//*  28   48:iload           7
	//*  29   50:iconst_1        
	//*  30   51:iadd            
	//*  31   52:icmpge          81
	//*  32   55:aload_1         
	//*  33   56:iload_3         
	//*  34   57:aload_0         
	//*  35   58:iload           4
	//*  36   60:baload          
	//*  37   61:bastore         
	//*  38   62:iload           5
	//*  39   64:iconst_1        
	//*  40   65:iadd            
	//*  41   66:istore          5
	//*  42   68:iload_3         
	//*  43   69:iconst_1        
	//*  44   70:iadd            
	//*  45   71:istore_3        
	//*  46   72:iload           4
	//*  47   74:iconst_1        
	//*  48   75:iadd            
	//*  49   76:istore          4
	//*  50   78:goto            46
	//*  51   81:goto            5
	//*  52   84:iload           7
	//*  53   86:iconst_m1       
	//*  54   87:icmpgt          145
	//*  55   90:iload           7
	//*  56   92:bipush          -127
	//*  57   94:icmplt          145
	//*  58   97:iload           6
	//*  59   99:iconst_1        
	//*  60  100:iadd            
	//*  61  101:istore          5
	//*  62  103:aload_0         
	//*  63  104:iload           6
	//*  64  106:baload          
	//*  65  107:istore_2        
	//*  66  108:iconst_0        
	//*  67  109:istore          4
	//*  68  111:iload           4
	//*  69  113:iload           7
	//*  70  115:ineg            
	//*  71  116:iconst_1        
	//*  72  117:iadd            
	//*  73  118:icmpge          138
	//*  74  121:aload_1         
	//*  75  122:iload_3         
	//*  76  123:iload_2         
	//*  77  124:bastore         
	//*  78  125:iload           4
	//*  79  127:iconst_1        
	//*  80  128:iadd            
	//*  81  129:istore          4
	//*  82  131:iload_3         
	//*  83  132:iconst_1        
	//*  84  133:iadd            
	//*  85  134:istore_3        
	//*  86  135:goto            111
	//*  87  138:iload           5
	//*  88  140:istore          4
	//*  89  142:goto            5
	//*  90  145:iload           6
	//*  91  147:iconst_1        
	//*  92  148:iadd            
	//*  93  149:istore          4
	//*  94  151:goto            5
	//*  95  154:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  96  155:astore_0        
			{
				return;
	//   97  156:return          
			}
			if(i < k)
			{
				int j1 = j + 1;
				byte byte1 = abyte0[j];
				if(byte1 >= 0 && byte1 <= 127)
				{
					int l = 0;
					j = j1;
					while(l < byte1 + 1) 
					{
						abyte1[i] = abyte0[j];
						l++;
						i++;
						j++;
					}
				} else
				if(byte1 <= -1 && byte1 >= -127)
				{
					int i1 = j1 + 1;
					byte byte0 = abyte0[j1];
					for(j = 0; j < -byte1 + 1;)
					{
						abyte1[i] = byte0;
						j++;
						i++;
					}

					j = i1;
				} else
				{
					j = j1 + 1;
				}
			} else
			{
				return;
			}
		} while(true);
	}

	static long[] getArrayLongShort(TIFFDirectory tiffdirectory, int i)
	{
		tiffdirectory = ((TIFFDirectory) (tiffdirectory.getField(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//    3    5:astore_0        
		if(tiffdirectory != null) goto _L2; else goto _L1
	//    4    6:aload_0         
	//    5    7:ifnonnull       14
_L1:
		tiffdirectory = null;
	//    6   10:aconst_null     
	//    7   11:astore_0        
_L4:
		return ((long []) (tiffdirectory));
	//    8   12:aload_0         
	//    9   13:areturn         
_L2:
		if(((TIFFField) (tiffdirectory)).getType() == 4)
	//*  10   14:aload_0         
	//*  11   15:invokevirtual   #53  <Method int TIFFField.getType()>
	//*  12   18:iconst_4        
	//*  13   19:icmpne          27
			return ((TIFFField) (tiffdirectory)).getAsLongs();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #57  <Method long[] TIFFField.getAsLongs()>
	//   16   26:areturn         
		char ac[] = ((TIFFField) (tiffdirectory)).getAsChars();
	//   17   27:aload_0         
	//   18   28:invokevirtual   #61  <Method char[] TIFFField.getAsChars()>
	//   19   31:astore_3        
		long al[] = new long[ac.length];
	//   20   32:aload_3         
	//   21   33:arraylength     
	//   22   34:newarray        long[]
	//   23   36:astore_2        
		i = 0;
	//   24   37:iconst_0        
	//   25   38:istore_1        
		do
		{
			tiffdirectory = ((TIFFDirectory) (al));
	//   26   39:aload_2         
	//   27   40:astore_0        
			if(i >= ac.length)
				continue;
	//   28   41:iload_1         
	//   29   42:aload_3         
	//   30   43:arraylength     
	//   31   44:icmpge          12
			al[i] = ac[i];
	//   32   47:aload_2         
	//   33   48:iload_1         
	//   34   49:aload_3         
	//   35   50:iload_1         
	//   36   51:caload          
	//   37   52:i2l             
	//   38   53:lastore         
			i++;
	//   39   54:iload_1         
	//   40   55:iconst_1        
	//   41   56:iadd            
	//   42   57:istore_1        
		} while(true);
	//   43   58:goto            39
		if(true) goto _L4; else goto _L3
_L3:
	}

	static int getDpi(TIFFField tifffield, int i)
	{
		if(tifffield == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		tifffield = ((TIFFField) (tifffield.getAsRational(0)));
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #67  <Method long[] TIFFField.getAsRational(int)>
	//    7   11:astore_0        
		float f = (float)tifffield[0] / (float)tifffield[1];
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:laload          
	//   11   15:l2f             
	//   12   16:aload_0         
	//   13   17:iconst_1        
	//   14   18:laload          
	//   15   19:l2f             
	//   16   20:fdiv            
	//   17   21:fstore_2        
		switch(i)
	//*  18   22:iload_1         
		{
	//*  19   23:tableswitch     1 3: default 48
	//	               1 50
	//	               2 50
	//	               3 58
		default:
			return 0;
	//   20   48:iconst_0        
	//   21   49:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return (int)((double)f + 0.5D);
	//   22   50:fload_2         
	//   23   51:f2d             
	//   24   52:ldc2w           #68  <Double 0.5D>
	//   25   55:dadd            
	//   26   56:d2i             
	//   27   57:ireturn         

		case 3: // '\003'
			return (int)((double)f * 2.54D + 0.5D);
	//   28   58:fload_2         
	//   29   59:f2d             
	//   30   60:ldc2w           #70  <Double 2.54D>
	//   31   63:dmul            
	//   32   64:ldc2w           #68  <Double 0.5D>
	//   33   67:dadd            
	//   34   68:d2i             
	//   35   69:ireturn         
		}
	}

	public static int getNumberOfPages(RandomAccessFileOrArray randomaccessfileorarray)
	{
		int i;
		try
		{
			i = TIFFDirectory.getNumDirectories(randomaccessfileorarray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method int TIFFDirectory.getNumDirectories(RandomAccessFileOrArray)>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(RandomAccessFileOrArray randomaccessfileorarray)
	//*   5    7:astore_0        
		{
			throw new ExceptionConverter(((Exception) (randomaccessfileorarray)));
	//    6    8:new             #78  <Class ExceptionConverter>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #81  <Method void ExceptionConverter(Exception)>
	//   10   16:athrow          
		}
		return i;
	}

	public static Image getTiffImage(RandomAccessFileOrArray randomaccessfileorarray, int i)
	{
		return getTiffImage(randomaccessfileorarray, i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #86  <Method Image getTiffImage(RandomAccessFileOrArray, int, boolean)>
	//    4    6:areturn         
	}

	public static Image getTiffImage(RandomAccessFileOrArray randomaccessfileorarray, int i, boolean flag)
	{
		return getTiffImage(randomaccessfileorarray, false, i, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #89  <Method Image getTiffImage(RandomAccessFileOrArray, boolean, int, boolean)>
	//    5    7:areturn         
	}

	public static Image getTiffImage(RandomAccessFileOrArray randomaccessfileorarray, boolean flag, int i)
	{
		return getTiffImage(randomaccessfileorarray, flag, i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #89  <Method Image getTiffImage(RandomAccessFileOrArray, boolean, int, boolean)>
	//    5    7:areturn         
	}

	public static Image getTiffImage(RandomAccessFileOrArray randomaccessfileorarray, boolean flag, int i, boolean flag1)
	{
		TIFFDirectory tiffdirectory;
		if(i < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          22
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.page.number.must.be.gt.eq.1", new Object[0]));
	//    3    5:new             #21  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #96  <String "the.page.number.must.be.gt.eq.1">
	//    6   11:iconst_0        
	//    7   12:anewarray       Object[]
	//    8   15:invokestatic    #29  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   18:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		try
		{
			tiffdirectory = new TIFFDirectory(randomaccessfileorarray, i - 1);
	//   11   22:new             #43  <Class TIFFDirectory>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:iconst_1        
	//   16   29:isub            
	//   17   30:invokespecial   #99  <Method void TIFFDirectory(RandomAccessFileOrArray, int)>
	//   18   33:astore          29
			if(tiffdirectory.isTagPresent(322))
	//*  19   35:aload           29
	//*  20   37:sipush          322
	//*  21   40:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//*  22   43:ifeq            73
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("tiles.are.not.supported", new Object[0]));
	//   23   46:new             #21  <Class IllegalArgumentException>
	//   24   49:dup             
	//   25   50:ldc1            #105 <String "tiles.are.not.supported">
	//   26   52:iconst_0        
	//   27   53:anewarray       Object[]
	//   28   56:invokestatic    #29  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   29   59:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   30   62:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(RandomAccessFileOrArray randomaccessfileorarray)
	//*  31   63:astore_0        
		{
			throw new ExceptionConverter(((Exception) (randomaccessfileorarray)));
	//   32   64:new             #78  <Class ExceptionConverter>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:invokespecial   #81  <Method void ExceptionConverter(Exception)>
	//   36   72:athrow          
		}
		int j2 = (int)tiffdirectory.getFieldAsLong(259);
	//   37   73:aload           29
	//   38   75:sipush          259
	//   39   78:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   40   81:l2i             
	//   41   82:istore          15
		j2;
	//   42   84:iload           15
		JVM INSTR lookupswitch 4: default 1126
	//	               2: 135
	//	               3: 135
	//	               4: 135
	//	               32771: 135;
	//   43   86:lookupswitch    4: default 1126
	//	               2: 135
	//	               3: 135
	//	               4: 135
	//	               32771: 135
		   goto _L1 _L2 _L2 _L2 _L2
_L1:
		return getTiffImageColor(tiffdirectory, randomaccessfileorarray);
	//   44  128:aload           29
	//   45  130:aload_0         
	//   46  131:invokestatic    #113 <Method Image getTiffImageColor(TIFFDirectory, RandomAccessFileOrArray)>
	//   47  134:areturn         
_L2:
		float f;
		float f1;
		f1 = 0.0F;
	//   48  135:fconst_0        
	//   49  136:fstore          5
		f = f1;
	//   50  138:fload           5
	//   51  140:fstore          4
		if(!tiffdirectory.isTagPresent(274)) goto _L4; else goto _L3
	//   52  142:aload           29
	//   53  144:sipush          274
	//   54  147:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//   55  150:ifeq            176
_L3:
		i = (int)tiffdirectory.getFieldAsLong(274);
	//   56  153:aload           29
	//   57  155:sipush          274
	//   58  158:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   59  161:l2i             
	//   60  162:istore_2        
		if(i != 3 && i != 4) goto _L6; else goto _L5
	//   61  163:iload_2         
	//   62  164:iconst_3        
	//   63  165:icmpeq          1132
	//   64  168:iload_2         
	//   65  169:iconst_4        
	//   66  170:icmpne          1243
	//*  67  173:goto            1132
_L4:
		long l3;
		long l5;
		long l6;
		l5 = 0L;
	//   68  176:lconst_0        
	//   69  177:lstore          23
		l6 = 0L;
	//   70  179:lconst_0        
	//   71  180:lstore          25
		l3 = 1L;
	//   72  182:lconst_1        
	//   73  183:lstore          19
		int k;
		int k2;
		k = (int)tiffdirectory.getFieldAsLong(257);
	//   74  185:aload           29
	//   75  187:sipush          257
	//   76  190:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   77  193:l2i             
	//   78  194:istore          8
		k2 = (int)tiffdirectory.getFieldAsLong(256);
	//   79  196:aload           29
	//   80  198:sipush          256
	//   81  201:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   82  204:l2i             
	//   83  205:istore          16
		float f2;
		f2 = 0.0F;
	//   84  207:fconst_0        
	//   85  208:fstore          6
		f1 = 0.0F;
	//   86  210:fconst_0        
	//   87  211:fstore          5
		i = 2;
	//   88  213:iconst_2        
	//   89  214:istore_2        
		int j;
		int l;
		if(tiffdirectory.isTagPresent(296))
	//*  90  215:aload           29
	//*  91  217:sipush          296
	//*  92  220:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//*  93  223:ifeq            236
			i = (int)tiffdirectory.getFieldAsLong(296);
	//   94  226:aload           29
	//   95  228:sipush          296
	//   96  231:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   97  234:l2i             
	//   98  235:istore_2        
		j = getDpi(tiffdirectory.getField(282), i);
	//   99  236:aload           29
	//  100  238:sipush          282
	//  101  241:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  102  244:iload_2         
	//  103  245:invokestatic    #115 <Method int getDpi(TIFFField, int)>
	//  104  248:istore          7
		l = getDpi(tiffdirectory.getField(283), i);
	//  105  250:aload           29
	//  106  252:sipush          283
	//  107  255:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  108  258:iload_2         
	//  109  259:invokestatic    #115 <Method int getDpi(TIFFField, int)>
	//  110  262:istore          9
		int i1;
		int j1;
		i1 = j;
	//  111  264:iload           7
	//  112  266:istore          10
		j1 = l;
	//  113  268:iload           9
	//  114  270:istore          11
		if(i != 1) goto _L8; else goto _L7
	//  115  272:iload_2         
	//  116  273:iconst_1        
	//  117  274:icmpne          298
_L7:
		f1 = f2;
	//  118  277:fload           6
	//  119  279:fstore          5
		if(l == 0) goto _L10; else goto _L9
	//  120  281:iload           9
	//  121  283:ifeq            1139
_L9:
		f1 = (float)j / (float)l;
	//  122  286:iload           7
	//  123  288:i2f             
	//  124  289:iload           9
	//  125  291:i2f             
	//  126  292:fdiv            
	//  127  293:fstore          5
		  goto _L10
	//* 128  295:goto            1139
_L8:
		i = k;
	//  129  298:iload           8
	//  130  300:istore_2        
		if(tiffdirectory.isTagPresent(278))
	//* 131  301:aload           29
	//* 132  303:sipush          278
	//* 133  306:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 134  309:ifeq            1148
			i = (int)tiffdirectory.getFieldAsLong(278);
	//  135  312:aload           29
	//  136  314:sipush          278
	//  137  317:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//  138  320:l2i             
	//  139  321:istore_2        
		  goto _L11
	//* 140  322:goto            1148
_L43:
		long al[];
		long al1[];
		al1 = getArrayLongShort(tiffdirectory, 273);
	//  141  325:aload           29
	//  142  327:sipush          273
	//  143  330:invokestatic    #117 <Method long[] getArrayLongShort(TIFFDirectory, int)>
	//  144  333:astore          30
		al = getArrayLongShort(tiffdirectory, 279);
	//  145  335:aload           29
	//  146  337:sipush          279
	//  147  340:invokestatic    #117 <Method long[] getArrayLongShort(TIFFDirectory, int)>
	//  148  343:astore          28
		Object obj;
		if(al == null)
			break MISSING_BLOCK_LABEL_391;
	//  149  345:aload           28
	//  150  347:ifnull          391
		obj = ((Object) (al));
	//  151  350:aload           28
	//  152  352:astore          27
		if(al.length != 1)
			break MISSING_BLOCK_LABEL_422;
	//  153  354:aload           28
	//  154  356:arraylength     
	//  155  357:iconst_1        
	//  156  358:icmpne          422
		if(al[0] == 0L)
			break MISSING_BLOCK_LABEL_391;
	//  157  361:aload           28
	//  158  363:iconst_0        
	//  159  364:laload          
	//  160  365:lconst_0        
	//  161  366:lcmp            
	//  162  367:ifeq            391
		obj = ((Object) (al));
	//  163  370:aload           28
	//  164  372:astore          27
		if(al[0] + al1[0] <= randomaccessfileorarray.length())
			break MISSING_BLOCK_LABEL_422;
	//  165  374:aload           28
	//  166  376:iconst_0        
	//  167  377:laload          
	//  168  378:aload           30
	//  169  380:iconst_0        
	//  170  381:laload          
	//  171  382:ladd            
	//  172  383:aload_0         
	//  173  384:invokevirtual   #123 <Method long RandomAccessFileOrArray.length()>
	//  174  387:lcmp            
	//  175  388:ifle            422
		int k1;
		obj = ((Object) (al));
	//  176  391:aload           28
	//  177  393:astore          27
		if(k != k1)
			break MISSING_BLOCK_LABEL_422;
	//  178  395:iload           8
	//  179  397:iload           12
	//  180  399:icmpne          422
		obj = ((Object) (new long[1]));
	//  181  402:iconst_1        
	//  182  403:newarray        long[]
	//  183  405:astore          27
		obj[0] = randomaccessfileorarray.length() - (long)(int)al1[0];
	//  184  407:aload           27
	//  185  409:iconst_0        
	//  186  410:aload_0         
	//  187  411:invokevirtual   #123 <Method long RandomAccessFileOrArray.length()>
	//  188  414:aload           30
	//  189  416:iconst_0        
	//  190  417:laload          
	//  191  418:l2i             
	//  192  419:i2l             
	//  193  420:lsub            
	//  194  421:lastore         
		TIFFField tifffield = tiffdirectory.getField(266);
	//  195  422:aload           29
	//  196  424:sipush          266
	//  197  427:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  198  430:astore          28
		if(tifffield == null) goto _L13; else goto _L12
	//  199  432:aload           28
	//  200  434:ifnull          1168
_L12:
		l3 = tifffield.getAsLong(0);
	//  201  437:aload           28
	//  202  439:iconst_0        
	//  203  440:invokevirtual   #126 <Method long TIFFField.getAsLong(int)>
	//  204  443:lstore          19
		  goto _L13
	//* 205  445:goto            1168
	//* 206  448:iconst_0        
	//* 207  449:istore_2        
	//* 208  450:iload_2         
	//* 209  451:istore          9
_L44:
		if(!tiffdirectory.isTagPresent(262)) goto _L15; else goto _L14
	//  210  453:aload           29
	//  211  455:sipush          262
	//  212  458:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//  213  461:ifeq            1180
_L14:
		l = i;
	//  214  464:iload_2         
	//  215  465:istore          9
		if(tiffdirectory.getFieldAsLong(262) == 1L)
	//* 216  467:aload           29
	//* 217  469:sipush          262
	//* 218  472:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//* 219  475:lconst_1        
	//* 220  476:lcmp            
	//* 221  477:ifne            1180
			l = ((int) (false | true));
	//  222  480:iconst_0        
	//  223  481:iconst_1        
	//  224  482:ior             
	//  225  483:istore          9
		  goto _L15
	//* 226  485:goto            1180
_L23:
		if(!flag1 || k1 != k) goto _L17; else goto _L16
	//  227  488:iload_3         
	//  228  489:ifeq            748
	//  229  492:iload           12
	//  230  494:iload           8
	//  231  496:icmpne          748
_L16:
		obj = ((Object) (new byte[(int)obj[0]]));
	//  232  499:aload           27
	//  233  501:iconst_0        
	//  234  502:laload          
	//  235  503:l2i             
	//  236  504:newarray        byte[]
	//  237  506:astore          27
		randomaccessfileorarray.seek(al1[0]);
	//  238  508:aload_0         
	//  239  509:aload           30
	//  240  511:iconst_0        
	//  241  512:laload          
	//  242  513:invokevirtual   #130 <Method void RandomAccessFileOrArray.seek(long)>
		randomaccessfileorarray.readFully(((byte []) (obj)));
	//  243  516:aload_0         
	//  244  517:aload           27
	//  245  519:invokevirtual   #134 <Method void RandomAccessFileOrArray.readFully(byte[])>
		randomaccessfileorarray = ((RandomAccessFileOrArray) (Image.getInstance(k2, k, false, i, j, ((byte []) (obj)))));
	//  246  522:iload           16
	//  247  524:iload           8
	//  248  526:iconst_0        
	//  249  527:iload_2         
	//  250  528:iload           7
	//  251  530:aload           27
	//  252  532:invokestatic    #140 <Method Image Image.getInstance(int, int, boolean, int, int, byte[])>
	//  253  535:astore_0        
		((Image) (randomaccessfileorarray)).setInverted(true);
	//  254  536:aload_0         
	//  255  537:iconst_1        
	//  256  538:invokevirtual   #144 <Method void Image.setInverted(boolean)>
_L40:
		((Image) (randomaccessfileorarray)).setDpi(i1, j1);
	//  257  541:aload_0         
	//  258  542:iload           10
	//  259  544:iload           11
	//  260  546:invokevirtual   #148 <Method void Image.setDpi(int, int)>
		((Image) (randomaccessfileorarray)).setXYRatio(f1);
	//  261  549:aload_0         
	//  262  550:fload           5
	//  263  552:invokevirtual   #152 <Method void Image.setXYRatio(float)>
		flag = tiffdirectory.isTagPresent(34675);
	//  264  555:aload           29
	//  265  557:ldc1            #153 <Int 34675>
	//  266  559:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//  267  562:istore_1        
		if(!flag) goto _L19; else goto _L18
	//  268  563:iload_1         
	//  269  564:ifeq            597
_L18:
		int l1;
		int i2;
		long l2;
		long l4;
		try
		{
			obj = ((Object) (ICC_Profile.getInstance(tiffdirectory.getField(34675).getAsBytes())));
	//  270  567:aload           29
	//  271  569:ldc1            #153 <Int 34675>
	//  272  571:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  273  574:invokevirtual   #157 <Method byte[] TIFFField.getAsBytes()>
	//  274  577:invokestatic    #162 <Method ICC_Profile ICC_Profile.getInstance(byte[])>
	//  275  580:astore          27
			if(((ICC_Profile) (obj)).getNumComponents() == 1)
	//* 276  582:aload           27
	//* 277  584:invokevirtual   #165 <Method int ICC_Profile.getNumComponents()>
	//* 278  587:iconst_1        
	//* 279  588:icmpne          597
				((Image) (randomaccessfileorarray)).tagICC(((ICC_Profile) (obj)));
	//  280  591:aload_0         
	//  281  592:aload           27
	//  282  594:invokevirtual   #169 <Method void Image.tagICC(ICC_Profile)>
		}
	//* 283  597:aload_0         
	//* 284  598:iconst_5        
	//* 285  599:invokevirtual   #173 <Method void Image.setOriginalType(int)>
	//* 286  602:aload_0         
	//* 287  603:astore          27
	//* 288  605:fload           4
	//* 289  607:fconst_0        
	//* 290  608:fcmpl           
	//* 291  609:ifeq            1129
	//* 292  612:aload_0         
	//* 293  613:fload           4
	//* 294  615:invokevirtual   #176 <Method void Image.setInitialRotation(float)>
	//* 295  618:aload_0         
	//* 296  619:areturn         
	//* 297  620:sipush          257
	//* 298  623:istore          13
	//* 299  625:iload           9
	//* 300  627:bipush          12
	//* 301  629:ior             
	//* 302  630:istore          14
	//* 303  632:aload           29
	//* 304  634:sipush          292
	//* 305  637:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//* 306  640:astore          28
	//* 307  642:iload           13
	//* 308  644:istore_2        
	//* 309  645:iload           14
	//* 310  647:istore          7
	//* 311  649:lload           23
	//* 312  651:lstore          17
	//* 313  653:lload           25
	//* 314  655:lstore          21
	//* 315  657:aload           28
	//* 316  659:ifnull          488
	//* 317  662:aload           28
	//* 318  664:iconst_0        
	//* 319  665:invokevirtual   #126 <Method long TIFFField.getAsLong(int)>
	//* 320  668:lstore          23
	//* 321  670:iload           13
	//* 322  672:istore          9
	//* 323  674:lconst_1        
	//* 324  675:lload           23
	//* 325  677:land            
	//* 326  678:lconst_0        
	//* 327  679:lcmp            
	//* 328  680:ifeq            1309
	//* 329  683:sipush          258
	//* 330  686:istore          9
	//* 331  688:goto            1309
	//* 332  691:sipush          256
	//* 333  694:istore          13
	//* 334  696:aload           29
	//* 335  698:sipush          293
	//* 336  701:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//* 337  704:astore          28
	//* 338  706:iload           13
	//* 339  708:istore_2        
	//* 340  709:iload           9
	//* 341  711:istore          7
	//* 342  713:lload           23
	//* 343  715:lstore          17
	//* 344  717:lload           25
	//* 345  719:lstore          21
	//* 346  721:aload           28
	//* 347  723:ifnull          488
	//* 348  726:aload           28
	//* 349  728:iconst_0        
	//* 350  729:invokevirtual   #126 <Method long TIFFField.getAsLong(int)>
	//* 351  732:lstore          21
	//* 352  734:iload           13
	//* 353  736:istore_2        
	//* 354  737:iload           9
	//* 355  739:istore          7
	//* 356  741:lload           23
	//* 357  743:lstore          17
	//* 358  745:goto            488
	//* 359  748:iload           8
	//* 360  750:istore          13
	//* 361  752:new             #178 <Class CCITTG4Encoder>
	//* 362  755:dup             
	//* 363  756:iload           16
	//* 364  758:invokespecial   #180 <Method void CCITTG4Encoder(int)>
	//* 365  761:astore          28
	//* 366  763:iconst_0        
	//* 367  764:istore          9
	//* 368  766:iload           9
	//* 369  768:aload           30
	//* 370  770:arraylength     
	//* 371  771:icmpge          1097
	//* 372  774:aload           27
	//* 373  776:iload           9
	//* 374  778:laload          
	//* 375  779:l2i             
	//* 376  780:newarray        byte[]
	//* 377  782:astore          33
	//* 378  784:aload_0         
	//* 379  785:aload           30
	//* 380  787:iload           9
	//* 381  789:laload          
	//* 382  790:invokevirtual   #130 <Method void RandomAccessFileOrArray.seek(long)>
	//* 383  793:aload_0         
	//* 384  794:aload           33
	//* 385  796:invokevirtual   #134 <Method void RandomAccessFileOrArray.readFully(byte[])>
	//* 386  799:iload           12
	//* 387  801:iload           13
	//* 388  803:invokestatic    #186 <Method int Math.min(int, int)>
	//* 389  806:istore          14
	//* 390  808:new             #188 <Class TIFFFaxDecoder>
	//* 391  811:dup             
	//* 392  812:lload           19
	//* 393  814:iload           16
	//* 394  816:iload           14
	//* 395  818:invokespecial   #191 <Method void TIFFFaxDecoder(long, int, int)>
	//* 396  821:astore          34
	//* 397  823:aload           34
	//* 398  825:iload_1         
	//* 399  826:invokevirtual   #194 <Method void TIFFFaxDecoder.setRecoverFromImageError(boolean)>
	//* 400  829:iload           16
	//* 401  831:bipush          7
	//* 402  833:iadd            
	//* 403  834:bipush          8
	//* 404  836:idiv            
	//* 405  837:iload           14
	//* 406  839:imul            
	//* 407  840:newarray        byte[]
	//* 408  842:astore          31
	//* 409  844:iload           15
	//* 410  846:lookupswitch    4: default 1355
	//	               2: 888
	//	               3: 912
	//	               4: 1062
	//	               32771: 888
	//* 411  888:aload           34
	//* 412  890:aload           31
	//* 413  892:aload           33
	//* 414  894:iconst_0        
	//* 415  895:iload           14
	//* 416  897:invokevirtual   #198 <Method void TIFFFaxDecoder.decode1D(byte[], byte[], int, int)>
	//* 417  900:aload           28
	//* 418  902:aload           31
	//* 419  904:iload           14
	//* 420  906:invokevirtual   #202 <Method void CCITTG4Encoder.fax4Encode(byte[], int)>
	//* 421  909:goto            1355
	//* 422  912:aload           34
	//* 423  914:aload           31
	//* 424  916:aload           33
	//* 425  918:iconst_0        
	//* 426  919:iload           14
	//* 427  921:lload           17
	//* 428  923:invokevirtual   #206 <Method void TIFFFaxDecoder.decode2D(byte[], byte[], int, int, long)>
	//* 429  926:aload           28
	//* 430  928:aload           31
	//* 431  930:iload           14
	//* 432  932:invokevirtual   #202 <Method void CCITTG4Encoder.fax4Encode(byte[], int)>
	//* 433  935:goto            1355
	//* 434  938:astore          32
	//* 435  940:lload           17
	//* 436  942:ldc2w           #207 <Long 4L>
	//* 437  945:lxor            
	//* 438  946:lstore          17
	//* 439  948:aload           34
	//* 440  950:aload           31
	//* 441  952:aload           33
	//* 442  954:iconst_0        
	//* 443  955:iload           14
	//* 444  957:lload           17
	//* 445  959:invokevirtual   #206 <Method void TIFFFaxDecoder.decode2D(byte[], byte[], int, int, long)>
	//* 446  962:goto            926
	//* 447  965:astore          28
	//* 448  967:iload_1         
	//* 449  968:ifne            974
	//* 450  971:aload           32
	//* 451  973:athrow          
	//* 452  974:iload           12
	//* 453  976:iconst_1        
	//* 454  977:icmpne          983
	//* 455  980:aload           32
	//* 456  982:athrow          
	//* 457  983:aload           27
	//* 458  985:iconst_0        
	//* 459  986:laload          
	//* 460  987:l2i             
	//* 461  988:newarray        byte[]
	//* 462  990:astore          27
	//* 463  992:aload_0         
	//* 464  993:aload           30
	//* 465  995:iconst_0        
	//* 466  996:laload          
	//* 467  997:invokevirtual   #130 <Method void RandomAccessFileOrArray.seek(long)>
	//* 468 1000:aload_0         
	//* 469 1001:aload           27
	//* 470 1003:invokevirtual   #134 <Method void RandomAccessFileOrArray.readFully(byte[])>
	//* 471 1006:iload           16
	//* 472 1008:iload           8
	//* 473 1010:iconst_0        
	//* 474 1011:iload_2         
	//* 475 1012:iload           7
	//* 476 1014:aload           27
	//* 477 1016:invokestatic    #140 <Method Image Image.getInstance(int, int, boolean, int, int, byte[])>
	//* 478 1019:astore_0        
	//* 479 1020:aload_0         
	//* 480 1021:iconst_1        
	//* 481 1022:invokevirtual   #144 <Method void Image.setInverted(boolean)>
	//* 482 1025:aload_0         
	//* 483 1026:iload           10
	//* 484 1028:iload           11
	//* 485 1030:invokevirtual   #148 <Method void Image.setDpi(int, int)>
	//* 486 1033:aload_0         
	//* 487 1034:fload           5
	//* 488 1036:invokevirtual   #152 <Method void Image.setXYRatio(float)>
	//* 489 1039:aload_0         
	//* 490 1040:iconst_5        
	//* 491 1041:invokevirtual   #173 <Method void Image.setOriginalType(int)>
	//* 492 1044:aload_0         
	//* 493 1045:astore          27
	//* 494 1047:fload           4
	//* 495 1049:fconst_0        
	//* 496 1050:fcmpl           
	//* 497 1051:ifeq            1129
	//* 498 1054:aload_0         
	//* 499 1055:fload           4
	//* 500 1057:invokevirtual   #176 <Method void Image.setInitialRotation(float)>
	//* 501 1060:aload_0         
	//* 502 1061:areturn         
	//* 503 1062:aload           34
	//* 504 1064:aload           31
	//* 505 1066:aload           33
	//* 506 1068:iconst_0        
	//* 507 1069:iload           14
	//* 508 1071:lload           21
	//* 509 1073:invokevirtual   #211 <Method void TIFFFaxDecoder.decodeT6(byte[], byte[], int, int, long)>
	//* 510 1076:aload           28
	//* 511 1078:aload           31
	//* 512 1080:iload           14
	//* 513 1082:invokevirtual   #202 <Method void CCITTG4Encoder.fax4Encode(byte[], int)>
	//* 514 1085:goto            1355
	//* 515 1088:astore          32
	//* 516 1090:iload_1         
	//* 517 1091:ifne            1076
	//* 518 1094:aload           32
	//* 519 1096:athrow          
	//* 520 1097:iload           16
	//* 521 1099:iload           8
	//* 522 1101:iconst_0        
	//* 523 1102:sipush          256
	//* 524 1105:iload           7
	//* 525 1107:iconst_1        
	//* 526 1108:iand            
	//* 527 1109:aload           28
	//* 528 1111:invokevirtual   #214 <Method byte[] CCITTG4Encoder.close()>
	//* 529 1114:invokestatic    #140 <Method Image Image.getInstance(int, int, boolean, int, int, byte[])>
	//* 530 1117:astore_0        
	//* 531 1118:goto            541
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  532 1121:astore          27
_L19:
		((Image) (randomaccessfileorarray)).setOriginalType(5);
		obj = ((Object) (randomaccessfileorarray));
		if(f == 0.0F) goto _L21; else goto _L20
_L20:
		((Image) (randomaccessfileorarray)).setInitialRotation(f);
		return ((Image) (randomaccessfileorarray));
_L47:
		l1 = 257;
		i2 = l | 0xc;
		obj1 = ((Object) (tiffdirectory.getField(292)));
		i = l1;
		j = i2;
		l2 = l5;
		l4 = l6;
		if(obj1 == null) goto _L23; else goto _L22
_L22:
		l5 = ((TIFFField) (obj1)).getAsLong(0);
		  goto _L24
_L48:
		l1 = 256;
		obj1 = ((Object) (tiffdirectory.getField(293)));
		i = l1;
		j = l;
		l2 = l5;
		l4 = l6;
		if(obj1 == null) goto _L23; else goto _L25
_L25:
		l4 = ((TIFFField) (obj1)).getAsLong(0);
		i = l1;
		j = l;
		l2 = l5;
		  goto _L23
_L17:
		l1 = k;
		obj1 = ((Object) (new CCITTG4Encoder(k2)));
		l = 0;
_L55:
		if(l >= al1.length) goto _L27; else goto _L26
_L26:
		abyte1 = new byte[(int)obj[l]];
		randomaccessfileorarray.seek(al1[l]);
		randomaccessfileorarray.readFully(abyte1);
		i2 = Math.min(k1, l1);
		tifffaxdecoder = new TIFFFaxDecoder(l3, k2, i2);
		tifffaxdecoder.setRecoverFromImageError(flag);
		abyte0 = new byte[((k2 + 7) / 8) * i2];
		j2;
		JVM INSTR lookupswitch 4: default 1355
	//	               2: 888
	//	               3: 912
	//	               4: 1062
	//	               32771: 888;
		   goto _L28 _L29 _L30 _L31 _L29
_L28:
		break MISSING_BLOCK_LABEL_1355;
_L29:
		tifffaxdecoder.decode1D(abyte0, abyte1, 0, i2);
		((CCITTG4Encoder) (obj1)).fax4Encode(abyte0, i2);
		break MISSING_BLOCK_LABEL_1355;
_L30:
		tifffaxdecoder.decode2D(abyte0, abyte1, 0, i2, l2);
_L32:
		((CCITTG4Encoder) (obj1)).fax4Encode(abyte0, i2);
		break MISSING_BLOCK_LABEL_1355;
		obj2;
		l2 ^= 4L;
		tifffaxdecoder.decode2D(abyte0, abyte1, 0, i2, l2);
		  goto _L32
		obj1;
		if(flag) goto _L34; else goto _L33
_L33:
		throw obj2;
_L34:
		if(k1 != 1) goto _L36; else goto _L35
_L35:
		throw obj2;
_L36:
		obj = ((Object) (new byte[(int)obj[0]]));
		randomaccessfileorarray.seek(al1[0]);
		randomaccessfileorarray.readFully(((byte []) (obj)));
		randomaccessfileorarray = ((RandomAccessFileOrArray) (Image.getInstance(k2, k, false, i, j, ((byte []) (obj)))));
		((Image) (randomaccessfileorarray)).setInverted(true);
		((Image) (randomaccessfileorarray)).setDpi(i1, j1);
		((Image) (randomaccessfileorarray)).setXYRatio(f1);
		((Image) (randomaccessfileorarray)).setOriginalType(5);
		obj = ((Object) (randomaccessfileorarray));
		if(f == 0.0F) goto _L21; else goto _L37
_L37:
		((Image) (randomaccessfileorarray)).setInitialRotation(f);
		return ((Image) (randomaccessfileorarray));
_L31:
		tifffaxdecoder.decodeT6(abyte0, abyte1, 0, i2, l4);
_L39:
		((CCITTG4Encoder) (obj1)).fax4Encode(abyte0, i2);
		break MISSING_BLOCK_LABEL_1355;
		obj2;
		if(flag) goto _L39; else goto _L38
_L38:
		throw obj2;
_L27:
		randomaccessfileorarray = ((RandomAccessFileOrArray) (Image.getInstance(k2, k, false, 256, j & 1, ((CCITTG4Encoder) (obj1)).close())));
		  goto _L40
	//* 533 1123:goto            597
	//* 534 1126:goto            128
_L21:
		return ((Image) (obj));
	//  535 1129:aload           27
	//  536 1131:areturn         
_L5:
		f = 3.141593F;
	//  537 1132:ldc1            #215 <Float 3.141593F>
	//  538 1134:fstore          4
		  goto _L4
	//* 539 1136:goto            176
_L10:
		i1 = 0;
	//  540 1139:iconst_0        
	//  541 1140:istore          10
		j1 = 0;
	//  542 1142:iconst_0        
	//  543 1143:istore          11
		  goto _L8
	//* 544 1145:goto            298
_L11:
		if(i <= 0) goto _L42; else goto _L41
	//  545 1148:iload_2         
	//  546 1149:ifle            1161
_L41:
		k1 = i;
	//  547 1152:iload_2         
	//  548 1153:istore          12
		if(i <= k) goto _L43; else goto _L42
	//  549 1155:iload_2         
	//  550 1156:iload           8
	//  551 1158:icmple          325
_L42:
		k1 = k;
	//  552 1161:iload           8
	//  553 1163:istore          12
		  goto _L43
	//* 554 1165:goto            325
_L13:
		if(l3 != 2L);
	//  555 1168:lload           19
	//  556 1170:ldc2w           #216 <Long 2L>
	//  557 1173:lcmp            
	//  558 1174:ifne            1284
		i = 0;
		l = i;
		  goto _L44
	//* 559 1177:goto            448
_L15:
		i = 0;
	//  560 1180:iconst_0        
	//  561 1181:istore_2        
		j2;
	//  562 1182:iload           15
		JVM INSTR lookupswitch 4: default 1228
	//	               2: 1287
	//	               3: 620
	//	               4: 691
	//	               32771: 1287;
	//  563 1184:lookupswitch    4: default 1228
	//	               2: 1287
	//	               3: 620
	//	               4: 691
	//	               32771: 1287
		   goto _L45 _L46 _L47 _L48 _L46
_L45:
		j = l;
	//  564 1228:iload           9
	//  565 1230:istore          7
		l2 = l5;
	//  566 1232:lload           23
	//  567 1234:lstore          17
		l4 = l6;
	//  568 1236:lload           25
	//  569 1238:lstore          21
		  goto _L49
	//* 570 1240:goto            488
_L6:
		if(i != 5 && i != 8) goto _L51; else goto _L50
	//  571 1243:iload_2         
	//  572 1244:iconst_5        
	//  573 1245:icmpeq          1254
	//  574 1248:iload_2         
	//  575 1249:bipush          8
	//  576 1251:icmpne          1261
_L49:
		if(true) goto _L23; else goto _L52
_L52:
_L50:
		f = 1.570796F;
	//  577 1254:ldc1            #218 <Float 1.570796F>
	//  578 1256:fstore          4
		  goto _L4
	//* 579 1258:goto            176
_L51:
		if(i == 6) goto _L54; else goto _L53
	//  580 1261:iload_2         
	//  581 1262:bipush          6
	//  582 1264:icmpeq          1277
_L53:
		f = f1;
	//  583 1267:fload           5
	//  584 1269:fstore          4
		if(i != 7) goto _L4; else goto _L54
	//  585 1271:iload_2         
	//  586 1272:bipush          7
	//  587 1274:icmpne          176
_L54:
		f = -1.570796F;
	//  588 1277:ldc1            #219 <Float -1.570796F>
	//  589 1279:fstore          4
		  goto _L4
	//* 590 1281:goto            176
	//* 591 1284:goto            448
_L46:
		i = 257;
	//  592 1287:sipush          257
	//  593 1290:istore_2        
		j = l | 0xa;
	//  594 1291:iload           9
	//  595 1293:bipush          10
	//  596 1295:ior             
	//  597 1296:istore          7
		l2 = l5;
	//  598 1298:lload           23
	//  599 1300:lstore          17
		l4 = l6;
	//  600 1302:lload           25
	//  601 1304:lstore          21
		  goto _L23
_L24:
		l = l1;
		if((1L & l5) != 0L)
			l = 258;
	//* 602 1306:goto            488
		i = l;
	//  603 1309:iload           9
	//  604 1311:istore_2        
		j = i2;
	//  605 1312:iload           14
	//  606 1314:istore          7
		l2 = l5;
	//  607 1316:lload           23
	//  608 1318:lstore          17
		l4 = l6;
	//  609 1320:lload           25
	//  610 1322:lstore          21
		if((4L & l5) != 0L)
	//* 611 1324:ldc2w           #207 <Long 4L>
	//* 612 1327:lload           23
	//* 613 1329:land            
	//* 614 1330:lconst_0        
	//* 615 1331:lcmp            
	//* 616 1332:ifeq            488
		{
			j = i2 | 2;
	//  617 1335:iload           14
	//  618 1337:iconst_2        
	//  619 1338:ior             
	//  620 1339:istore          7
			i = l;
	//  621 1341:iload           9
	//  622 1343:istore_2        
			l2 = l5;
	//  623 1344:lload           23
	//  624 1346:lstore          17
			l4 = l6;
	//  625 1348:lload           25
	//  626 1350:lstore          21
		}
		  goto _L23
	//* 627 1352:goto            488
		l1 -= k1;
	//  628 1355:iload           13
	//  629 1357:iload           12
	//  630 1359:isub            
	//  631 1360:istore          13
		l++;
	//  632 1362:iload           9
	//  633 1364:iconst_1        
	//  634 1365:iadd            
	//  635 1366:istore          9
		  goto _L55
	//* 636 1368:goto            766
	}

	protected static Image getTiffImageColor(TIFFDirectory tiffdirectory, RandomAccessFileOrArray randomaccessfileorarray)
	{
		int l1;
		int l2;
		TIFFLZWDecoder tifflzwdecoder;
		try
		{
			l2 = (int)tiffdirectory.getFieldAsLong(259);
	//    0    0:aload_0         
	//    1    1:sipush          259
	//    2    4:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//    3    7:l2i             
	//    4    8:istore          15
		}
	//*   5   10:iconst_1        
	//*   6   11:istore          11
	//*   7   13:aconst_null     
	//*   8   14:astore          24
	//*   9   16:iload           15
	//*  10   18:lookupswitch    7: default 1755
	//	               1: 109
	//	               5: 109
	//	               6: 109
	//	               7: 109
	//	               8: 109
	//	               32773: 109
	//	               32946: 109
	//*  11   84:new             #21  <Class IllegalArgumentException>
	//*  12   87:dup             
	//*  13   88:ldc1            #221 <String "the.compression.1.is.not.supported">
	//*  14   90:iload           15
	//*  15   92:invokestatic    #224 <Method String MessageLocalization.getComposedMessage(String, int)>
	//*  16   95:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//*  17   98:athrow          
		// Misplaced declaration of an exception variable
		catch(TIFFDirectory tiffdirectory)
	//*  18   99:astore_0        
		{
			throw new ExceptionConverter(((Exception) (tiffdirectory)));
	//   19  100:new             #78  <Class ExceptionConverter>
	//   20  103:dup             
	//   21  104:aload_0         
	//   22  105:invokespecial   #81  <Method void ExceptionConverter(Exception)>
	//   23  108:athrow          
		}
		l1 = 1;
		tifflzwdecoder = null;
		l2;
		JVM INSTR lookupswitch 7: default 1755
	//	               1: 109
	//	               5: 109
	//	               6: 109
	//	               7: 109
	//	               8: 109
	//	               32773: 109
	//	               32946: 109;
		   goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.compression.1.is.not.supported", l2));
_L2:
		int j2 = (int)tiffdirectory.getFieldAsLong(262);
	//   24  109:aload_0         
	//   25  110:sipush          262
	//   26  113:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   27  116:l2i             
	//   28  117:istore          13
		j2;
	//   29  119:iload           13
		JVM INSTR tableswitch 0 5: default 1758
	//	               0 189
	//	               1 189
	//	               2 189
	//	               3 189
	//	               4 160
	//	               5 189;
	//   30  121:tableswitch     0 5: default 1758
	//	               0 189
	//	               1 189
	//	               2 189
	//	               3 189
	//	               4 160
	//	               5 189
		   goto _L3 _L4 _L4 _L4 _L4 _L3 _L4
_L3:
		if(l2 == 6 || l2 == 7) goto _L4; else goto _L5
	//   31  160:iload           15
	//   32  162:bipush          6
	//   33  164:icmpeq          189
	//   34  167:iload           15
	//   35  169:bipush          7
	//   36  171:icmpeq          189
_L5:
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.photometric.1.is.not.supported", j2));
	//   37  174:new             #21  <Class IllegalArgumentException>
	//   38  177:dup             
	//   39  178:ldc1            #226 <String "the.photometric.1.is.not.supported">
	//   40  180:iload           13
	//   41  182:invokestatic    #224 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   42  185:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   43  188:athrow          
_L4:
		float f;
		float f1;
		f1 = 0.0F;
	//   44  189:fconst_0        
	//   45  190:fstore_3        
		f = f1;
	//   46  191:fload_3         
	//   47  192:fstore_2        
		if(!tiffdirectory.isTagPresent(274)) goto _L7; else goto _L6
	//   48  193:aload_0         
	//   49  194:sipush          274
	//   50  197:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//   51  200:ifeq            228
_L6:
		int i = (int)tiffdirectory.getFieldAsLong(274);
	//   52  203:aload_0         
	//   53  204:sipush          274
	//   54  207:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   55  210:l2i             
	//   56  211:istore          4
		if(i != 3 && i != 4) goto _L9; else goto _L8
	//   57  213:iload           4
	//   58  215:iconst_3        
	//   59  216:icmpeq          1761
	//   60  219:iload           4
	//   61  221:iconst_4        
	//   62  222:icmpne          1767
	//*  63  225:goto            1761
_L7:
		if(tiffdirectory.isTagPresent(284) && tiffdirectory.getFieldAsLong(284) == 2L)
	//*  64  228:aload_0         
	//*  65  229:sipush          284
	//*  66  232:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//*  67  235:ifeq            269
	//*  68  238:aload_0         
	//*  69  239:sipush          284
	//*  70  242:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//*  71  245:ldc2w           #216 <Long 2L>
	//*  72  248:lcmp            
	//*  73  249:ifne            269
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("planar.images.are.not.supported", new Object[0]));
	//   74  252:new             #21  <Class IllegalArgumentException>
	//   75  255:dup             
	//   76  256:ldc1            #228 <String "planar.images.are.not.supported">
	//   77  258:iconst_0        
	//   78  259:anewarray       Object[]
	//   79  262:invokestatic    #29  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   80  265:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   81  268:athrow          
		int k = 0;
	//   82  269:iconst_0        
	//   83  270:istore          6
		int i1;
		if(tiffdirectory.isTagPresent(338))
	//*  84  272:aload_0         
	//*  85  273:sipush          338
	//*  86  276:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//*  87  279:ifeq            285
			k = 1;
	//   88  282:iconst_1        
	//   89  283:istore          6
		i1 = 1;
	//   90  285:iconst_1        
	//   91  286:istore          8
		if(tiffdirectory.isTagPresent(277))
	//*  92  288:aload_0         
	//*  93  289:sipush          277
	//*  94  292:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//*  95  295:ifeq            308
			i1 = (int)tiffdirectory.getFieldAsLong(277);
	//   96  298:aload_0         
	//   97  299:sipush          277
	//   98  302:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//   99  305:l2i             
	//  100  306:istore          8
		int l = 1;
	//  101  308:iconst_1        
	//  102  309:istore          7
		if(tiffdirectory.isTagPresent(258))
	//* 103  311:aload_0         
	//* 104  312:sipush          258
	//* 105  315:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 106  318:ifeq            1808
			l = (int)tiffdirectory.getFieldAsLong(258);
	//  107  321:aload_0         
	//  108  322:sipush          258
	//  109  325:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//  110  328:l2i             
	//  111  329:istore          7
		  goto _L10
	//* 112  331:goto            1808
_L76:
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bits.per.sample.1.is.not.supported", l));
	//  113  334:new             #21  <Class IllegalArgumentException>
	//  114  337:dup             
	//  115  338:ldc1            #230 <String "bits.per.sample.1.is.not.supported">
	//  116  340:iload           7
	//  117  342:invokestatic    #224 <Method String MessageLocalization.getComposedMessage(String, int)>
	//  118  345:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//  119  348:athrow          
_L74:
		int k2;
		i = (int)tiffdirectory.getFieldAsLong(257);
	//  120  349:aload_0         
	//  121  350:sipush          257
	//  122  353:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//  123  356:l2i             
	//  124  357:istore          4
		k2 = (int)tiffdirectory.getFieldAsLong(256);
	//  125  359:aload_0         
	//  126  360:sipush          256
	//  127  363:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//  128  366:l2i             
	//  129  367:istore          14
		int j = 2;
	//  130  369:iconst_2        
	//  131  370:istore          5
		int i3;
		int j3;
		if(tiffdirectory.isTagPresent(296))
	//* 132  372:aload_0         
	//* 133  373:sipush          296
	//* 134  376:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 135  379:ifeq            392
			j = (int)tiffdirectory.getFieldAsLong(296);
	//  136  382:aload_0         
	//  137  383:sipush          296
	//  138  386:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//  139  389:l2i             
	//  140  390:istore          5
		i3 = getDpi(tiffdirectory.getField(282), j);
	//  141  392:aload_0         
	//  142  393:sipush          282
	//  143  396:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  144  399:iload           5
	//  145  401:invokestatic    #115 <Method int getDpi(TIFFField, int)>
	//  146  404:istore          16
		j3 = getDpi(tiffdirectory.getField(283), j);
	//  147  406:aload_0         
	//  148  407:sipush          283
	//  149  410:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  150  413:iload           5
	//  151  415:invokestatic    #115 <Method int getDpi(TIFFField, int)>
	//  152  418:istore          17
		j = 1;
	//  153  420:iconst_1        
	//  154  421:istore          5
		Object obj = ((Object) (tiffdirectory.getField(266)));
	//  155  423:aload_0         
	//  156  424:sipush          266
	//  157  427:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//  158  430:astore          20
		if(obj == null) goto _L12; else goto _L11
	//  159  432:aload           20
	//  160  434:ifnull          1859
_L11:
		j = ((TIFFField) (obj)).getAsInt(0);
	//  161  437:aload           20
	//  162  439:iconst_0        
	//  163  440:invokevirtual   #234 <Method int TIFFField.getAsInt(int)>
	//  164  443:istore          5
	//* 165  445:goto            1859
	//* 166  448:iload           4
	//* 167  450:istore          5
	//* 168  452:aload_0         
	//* 169  453:sipush          278
	//* 170  456:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 171  459:ifeq            1871
	//* 172  462:aload_0         
	//* 173  463:sipush          278
	//* 174  466:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//* 175  469:l2i             
	//* 176  470:istore          5
	//* 177  472:goto            1871
	//* 178  475:aload_0         
	//* 179  476:sipush          273
	//* 180  479:invokestatic    #117 <Method long[] getArrayLongShort(TIFFDirectory, int)>
	//* 181  482:astore          30
	//* 182  484:aload_0         
	//* 183  485:sipush          279
	//* 184  488:invokestatic    #117 <Method long[] getArrayLongShort(TIFFDirectory, int)>
	//* 185  491:astore          20
	//* 186  493:aload           20
	//* 187  495:ifnull          539
	//* 188  498:aload           20
	//* 189  500:astore          23
	//* 190  502:aload           20
	//* 191  504:arraylength     
	//* 192  505:iconst_1        
	//* 193  506:icmpne          1894
	//* 194  509:aload           20
	//* 195  511:iconst_0        
	//* 196  512:laload          
	//* 197  513:lconst_0        
	//* 198  514:lcmp            
	//* 199  515:ifeq            539
	//* 200  518:aload           20
	//* 201  520:astore          23
	//* 202  522:aload           20
	//* 203  524:iconst_0        
	//* 204  525:laload          
	//* 205  526:aload           30
	//* 206  528:iconst_0        
	//* 207  529:laload          
	//* 208  530:ladd            
	//* 209  531:aload_1         
	//* 210  532:invokevirtual   #123 <Method long RandomAccessFileOrArray.length()>
	//* 211  535:lcmp            
	//* 212  536:ifle            1894
	//* 213  539:aload           20
	//* 214  541:astore          23
	//* 215  543:iload           4
	//* 216  545:iload           10
	//* 217  547:icmpne          1894
	//* 218  550:iconst_1        
	//* 219  551:newarray        long[]
	//* 220  553:astore          23
	//* 221  555:aload           23
	//* 222  557:iconst_0        
	//* 223  558:aload_1         
	//* 224  559:invokevirtual   #123 <Method long RandomAccessFileOrArray.length()>
	//* 225  562:aload           30
	//* 226  564:iconst_0        
	//* 227  565:laload          
	//* 228  566:l2i             
	//* 229  567:i2l             
	//* 230  568:lsub            
	//* 231  569:lastore         
	//* 232  570:goto            1894
	//* 233  573:aload_0         
	//* 234  574:sipush          317
	//* 235  577:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//* 236  580:astore          20
	//* 237  582:iload           11
	//* 238  584:istore          5
	//* 239  586:aload           20
	//* 240  588:ifnull          664
	//* 241  591:aload           20
	//* 242  593:iconst_0        
	//* 243  594:invokevirtual   #234 <Method int TIFFField.getAsInt(int)>
	//* 244  597:istore          11
	//* 245  599:iload           11
	//* 246  601:iconst_1        
	//* 247  602:icmpeq          628
	//* 248  605:iload           11
	//* 249  607:iconst_2        
	//* 250  608:icmpeq          628
	//* 251  611:new             #92  <Class RuntimeException>
	//* 252  614:dup             
	//* 253  615:ldc1            #236 <String "illegal.value.for.predictor.in.tiff.file">
	//* 254  617:iconst_0        
	//* 255  618:anewarray       Object[]
	//* 256  621:invokestatic    #29  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 257  624:invokespecial   #237 <Method void RuntimeException(String)>
	//* 258  627:athrow          
	//* 259  628:iload           11
	//* 260  630:istore          5
	//* 261  632:iload           11
	//* 262  634:iconst_2        
	//* 263  635:icmpne          664
	//* 264  638:iload           11
	//* 265  640:istore          5
	//* 266  642:iload           7
	//* 267  644:bipush          8
	//* 268  646:icmpeq          664
	//* 269  649:new             #92  <Class RuntimeException>
	//* 270  652:dup             
	//* 271  653:ldc1            #239 <String "1.bit.samples.are.not.supported.for.horizontal.differencing.predictor">
	//* 272  655:iload           7
	//* 273  657:invokestatic    #224 <Method String MessageLocalization.getComposedMessage(String, int)>
	//* 274  660:invokespecial   #237 <Method void RuntimeException(String)>
	//* 275  663:athrow          
	//* 276  664:iload           15
	//* 277  666:iconst_5        
	//* 278  667:icmpne          685
	//* 279  670:new             #241 <Class TIFFLZWDecoder>
	//* 280  673:dup             
	//* 281  674:iload           14
	//* 282  676:iload           5
	//* 283  678:iload           8
	//* 284  680:invokespecial   #244 <Method void TIFFLZWDecoder(int, int, int)>
	//* 285  683:astore          24
	//* 286  685:iload           4
	//* 287  687:istore          12
	//* 288  689:aconst_null     
	//* 289  690:astore          25
	//* 290  692:aconst_null     
	//* 291  693:astore          22
	//* 292  695:aconst_null     
	//* 293  696:astore          20
	//* 294  698:aconst_null     
	//* 295  699:astore          21
	//* 296  701:iload           6
	//* 297  703:ifle            726
	//* 298  706:new             #246 <Class ByteArrayOutputStream>
	//* 299  709:dup             
	//* 300  710:invokespecial   #247 <Method void ByteArrayOutputStream()>
	//* 301  713:astore          22
	//* 302  715:new             #15  <Class DeflaterOutputStream>
	//* 303  718:dup             
	//* 304  719:aload           22
	//* 305  721:invokespecial   #250 <Method void DeflaterOutputStream(java.io.OutputStream)>
	//* 306  724:astore          21
	//* 307  726:aconst_null     
	//* 308  727:astore          28
	//* 309  729:iload           7
	//* 310  731:iconst_1        
	//* 311  732:icmpne          796
	//* 312  735:iload           8
	//* 313  737:iconst_1        
	//* 314  738:icmpne          796
	//* 315  741:iload           13
	//* 316  743:iconst_3        
	//* 317  744:icmpeq          796
	//* 318  747:new             #178 <Class CCITTG4Encoder>
	//* 319  750:dup             
	//* 320  751:iload           14
	//* 321  753:invokespecial   #180 <Method void CCITTG4Encoder(int)>
	//* 322  756:astore          27
	//* 323  758:aload           20
	//* 324  760:astore          26
	//* 325  762:iload           15
	//* 326  764:bipush          6
	//* 327  766:icmpne          1066
	//* 328  769:aload_0         
	//* 329  770:sipush          513
	//* 330  773:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 331  776:ifne            865
	//* 332  779:new             #13  <Class IOException>
	//* 333  782:dup             
	//* 334  783:ldc1            #252 <String "missing.tag.s.for.ojpeg.compression">
	//* 335  785:iconst_0        
	//* 336  786:anewarray       Object[]
	//* 337  789:invokestatic    #29  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 338  792:invokespecial   #253 <Method void IOException(String)>
	//* 339  795:athrow          
	//* 340  796:new             #246 <Class ByteArrayOutputStream>
	//* 341  799:dup             
	//* 342  800:invokespecial   #247 <Method void ByteArrayOutputStream()>
	//* 343  803:astore          29
	//* 344  805:aload           20
	//* 345  807:astore          26
	//* 346  809:aload           28
	//* 347  811:astore          27
	//* 348  813:aload           29
	//* 349  815:astore          25
	//* 350  817:iload           15
	//* 351  819:bipush          6
	//* 352  821:icmpeq          762
	//* 353  824:aload           20
	//* 354  826:astore          26
	//* 355  828:aload           28
	//* 356  830:astore          27
	//* 357  832:aload           29
	//* 358  834:astore          25
	//* 359  836:iload           15
	//* 360  838:bipush          7
	//* 361  840:icmpeq          762
	//* 362  843:new             #15  <Class DeflaterOutputStream>
	//* 363  846:dup             
	//* 364  847:aload           29
	//* 365  849:invokespecial   #250 <Method void DeflaterOutputStream(java.io.OutputStream)>
	//* 366  852:astore          26
	//* 367  854:aload           28
	//* 368  856:astore          27
	//* 369  858:aload           29
	//* 370  860:astore          25
	//* 371  862:goto            762
	//* 372  865:aload_0         
	//* 373  866:sipush          513
	//* 374  869:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//* 375  872:l2i             
	//* 376  873:istore          9
	//* 377  875:aload_1         
	//* 378  876:invokevirtual   #123 <Method long RandomAccessFileOrArray.length()>
	//* 379  879:l2i             
	//* 380  880:iload           9
	//* 381  882:isub            
	//* 382  883:istore          5
	//* 383  885:aload_0         
	//* 384  886:sipush          514
	//* 385  889:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 386  892:ifeq            911
	//* 387  895:aload_0         
	//* 388  896:sipush          514
	//* 389  899:invokevirtual   #109 <Method long TIFFDirectory.getFieldAsLong(int)>
	//* 390  902:l2i             
	//* 391  903:aload           23
	//* 392  905:iconst_0        
	//* 393  906:laload          
	//* 394  907:l2i             
	//* 395  908:iadd            
	//* 396  909:istore          5
	//* 397  911:iload           5
	//* 398  913:aload_1         
	//* 399  914:invokevirtual   #123 <Method long RandomAccessFileOrArray.length()>
	//* 400  917:l2i             
	//* 401  918:iload           9
	//* 402  920:isub            
	//* 403  921:invokestatic    #186 <Method int Math.min(int, int)>
	//* 404  924:newarray        byte[]
	//* 405  926:astore          20
	//* 406  928:aload_1         
	//* 407  929:iload           9
	//* 408  931:i2l             
	//* 409  932:invokevirtual   #130 <Method void RandomAccessFileOrArray.seek(long)>
	//* 410  935:aload_1         
	//* 411  936:aload           20
	//* 412  938:invokevirtual   #134 <Method void RandomAccessFileOrArray.readFully(byte[])>
	//* 413  941:new             #255 <Class Jpeg>
	//* 414  944:dup             
	//* 415  945:aload           20
	//* 416  947:invokespecial   #257 <Method void Jpeg(byte[])>
	//* 417  950:astore_1        
	//* 418  951:aload_1         
	//* 419  952:iload           16
	//* 420  954:iload           17
	//* 421  956:invokevirtual   #148 <Method void Image.setDpi(int, int)>
	//* 422  959:iload           15
	//* 423  961:bipush          6
	//* 424  963:icmpeq          1687
	//* 425  966:iload           15
	//* 426  968:bipush          7
	//* 427  970:icmpeq          1687
	//* 428  973:aload_0         
	//* 429  974:ldc1            #153 <Int 34675>
	//* 430  976:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 431  979:istore          19
	//* 432  981:iload           19
	//* 433  983:ifeq            1019
	//* 434  986:aload_0         
	//* 435  987:ldc1            #153 <Int 34675>
	//* 436  989:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//* 437  992:invokevirtual   #157 <Method byte[] TIFFField.getAsBytes()>
	//* 438  995:invokestatic    #162 <Method ICC_Profile ICC_Profile.getInstance(byte[])>
	//* 439  998:astore          20
	//* 440 1000:iload           8
	//* 441 1002:iload           6
	//* 442 1004:isub            
	//* 443 1005:aload           20
	//* 444 1007:invokevirtual   #165 <Method int ICC_Profile.getNumComponents()>
	//* 445 1010:icmpne          1019
	//* 446 1013:aload_1         
	//* 447 1014:aload           20
	//* 448 1016:invokevirtual   #169 <Method void Image.tagICC(ICC_Profile)>
	//* 449 1019:aload_0         
	//* 450 1020:sipush          320
	//* 451 1023:invokevirtual   #103 <Method boolean TIFFDirectory.isTagPresent(int)>
	//* 452 1026:ifeq            1682
	//* 453 1029:aload_0         
	//* 454 1030:sipush          320
	//* 455 1033:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//* 456 1036:invokevirtual   #61  <Method char[] TIFFField.getAsChars()>
	//* 457 1039:astore          20
	//* 458 1041:aload           20
	//* 459 1043:arraylength     
	//* 460 1044:newarray        byte[]
	//* 461 1046:astore_0        
	//* 462 1047:aload           20
	//* 463 1049:arraylength     
	//* 464 1050:iconst_3        
	//* 465 1051:idiv            
	//* 466 1052:istore          10
	//* 467 1054:iload           10
	//* 468 1056:iconst_2        
	//* 469 1057:imul            
	//* 470 1058:istore          11
	//* 471 1060:iconst_0        
	//* 472 1061:istore          5
	//* 473 1063:goto            1928
	//* 474 1066:iload           15
	//* 475 1068:bipush          7
	//* 476 1070:icmpne          1999
	//* 477 1073:aload           23
	//* 478 1075:arraylength     
	//* 479 1076:iconst_1        
	//* 480 1077:icmple          1097
	//* 481 1080:new             #13  <Class IOException>
	//* 482 1083:dup             
	//* 483 1084:ldc2            #259 <String "compression.jpeg.is.only.supported.with.a.single.strip.this.image.has.1.strips">
	//* 484 1087:aload           23
	//* 485 1089:arraylength     
	//* 486 1090:invokestatic    #224 <Method String MessageLocalization.getComposedMessage(String, int)>
	//* 487 1093:invokespecial   #253 <Method void IOException(String)>
	//* 488 1096:athrow          
	//* 489 1097:aload           23
	//* 490 1099:iconst_0        
	//* 491 1100:laload          
	//* 492 1101:l2i             
	//* 493 1102:newarray        byte[]
	//* 494 1104:astore          20
	//* 495 1106:aload_1         
	//* 496 1107:aload           30
	//* 497 1109:iconst_0        
	//* 498 1110:laload          
	//* 499 1111:invokevirtual   #130 <Method void RandomAccessFileOrArray.seek(long)>
	//* 500 1114:aload_1         
	//* 501 1115:aload           20
	//* 502 1117:invokevirtual   #134 <Method void RandomAccessFileOrArray.readFully(byte[])>
	//* 503 1120:aload_0         
	//* 504 1121:sipush          347
	//* 505 1124:invokevirtual   #47  <Method TIFFField TIFFDirectory.getField(int)>
	//* 506 1127:astore          23
	//* 507 1129:aload           20
	//* 508 1131:astore_1        
	//* 509 1132:aload           23
	//* 510 1134:ifnull          1289
	//* 511 1137:aload           23
	//* 512 1139:invokevirtual   #157 <Method byte[] TIFFField.getAsBytes()>
	//* 513 1142:astore_1        
	//* 514 1143:iconst_0        
	//* 515 1144:istore          11
	//* 516 1146:aload_1         
	//* 517 1147:arraylength     
	//* 518 1148:istore          10
	//* 519 1150:iload           10
	//* 520 1152:istore          5
	//* 521 1154:iload           11
	//* 522 1156:istore          9
	//* 523 1158:aload_1         
	//* 524 1159:iconst_0        
	//* 525 1160:baload          
	//* 526 1161:iconst_m1       
	//* 527 1162:icmpne          1190
	//* 528 1165:iload           10
	//* 529 1167:istore          5
	//* 530 1169:iload           11
	//* 531 1171:istore          9
	//* 532 1173:aload_1         
	//* 533 1174:iconst_1        
	//* 534 1175:baload          
	//* 535 1176:bipush          -40
	//* 536 1178:icmpne          1190
	//* 537 1181:iconst_2        
	//* 538 1182:istore          9
	//* 539 1184:iload           10
	//* 540 1186:iconst_2        
	//* 541 1187:isub            
	//* 542 1188:istore          5
	//* 543 1190:iload           5
	//* 544 1192:istore          10
	//* 545 1194:aload_1         
	//* 546 1195:aload_1         
	//* 547 1196:arraylength     
	//* 548 1197:iconst_2        
	//* 549 1198:isub            
	//* 550 1199:baload          
	//* 551 1200:iconst_m1       
	//* 552 1201:icmpne          1225
	//* 553 1204:iload           5
	//* 554 1206:istore          10
	//* 555 1208:aload_1         
	//* 556 1209:aload_1         
	//* 557 1210:arraylength     
	//* 558 1211:iconst_1        
	//* 559 1212:isub            
	//* 560 1213:baload          
	//* 561 1214:bipush          -39
	//* 562 1216:icmpne          1225
	//* 563 1219:iload           5
	//* 564 1221:iconst_2        
	//* 565 1222:isub            
	//* 566 1223:istore          10
	//* 567 1225:iload           10
	//* 568 1227:newarray        byte[]
	//* 569 1229:astore          23
	//* 570 1231:aload_1         
	//* 571 1232:iload           9
	//* 572 1234:aload           23
	//* 573 1236:iconst_0        
	//* 574 1237:iload           10
	//* 575 1239:invokestatic    #265 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 576 1242:aload           20
	//* 577 1244:arraylength     
	//* 578 1245:aload           23
	//* 579 1247:arraylength     
	//* 580 1248:iadd            
	//* 581 1249:newarray        byte[]
	//* 582 1251:astore_1        
	//* 583 1252:aload           20
	//* 584 1254:iconst_0        
	//* 585 1255:aload_1         
	//* 586 1256:iconst_0        
	//* 587 1257:iconst_2        
	//* 588 1258:invokestatic    #265 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 589 1261:aload           23
	//* 590 1263:iconst_0        
	//* 591 1264:aload_1         
	//* 592 1265:iconst_2        
	//* 593 1266:aload           23
	//* 594 1268:arraylength     
	//* 595 1269:invokestatic    #265 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 596 1272:aload           20
	//* 597 1274:iconst_2        
	//* 598 1275:aload_1         
	//* 599 1276:aload           23
	//* 600 1278:arraylength     
	//* 601 1279:iconst_2        
	//* 602 1280:iadd            
	//* 603 1281:aload           20
	//* 604 1283:arraylength     
	//* 605 1284:iconst_2        
	//* 606 1285:isub            
	//* 607 1286:invokestatic    #265 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 608 1289:new             #255 <Class Jpeg>
	//* 609 1292:dup             
	//* 610 1293:aload_1         
	//* 611 1294:invokespecial   #257 <Method void Jpeg(byte[])>
	//* 612 1297:astore          20
	//* 613 1299:aload           20
	//* 614 1301:astore_1        
	//* 615 1302:iload           13
	//* 616 1304:iconst_2        
	//* 617 1305:icmpne          951
	//* 618 1308:aload           20
	//* 619 1310:iconst_0        
	//* 620 1311:invokevirtual   #268 <Method void Image.setColorTransform(int)>
	//* 621 1314:aload           20
	//* 622 1316:astore_1        
	//* 623 1317:goto            951
	//* 624 1320:iload           11
	//* 625 1322:aload           30
	//* 626 1324:arraylength     
	//* 627 1325:icmpge          2082
	//* 628 1328:aload           23
	//* 629 1330:iload           11
	//* 630 1332:laload          
	//* 631 1333:l2i             
	//* 632 1334:newarray        byte[]
	//* 633 1336:astore          28
	//* 634 1338:aload_1         
	//* 635 1339:aload           30
	//* 636 1341:iload           11
	//* 637 1343:laload          
	//* 638 1344:invokevirtual   #130 <Method void RandomAccessFileOrArray.seek(long)>
	//* 639 1347:aload_1         
	//* 640 1348:aload           28
	//* 641 1350:invokevirtual   #134 <Method void RandomAccessFileOrArray.readFully(byte[])>
	//* 642 1353:iload           10
	//* 643 1355:iload           12
	//* 644 1357:invokestatic    #186 <Method int Math.min(int, int)>
	//* 645 1360:istore          18
	//* 646 1362:aconst_null     
	//* 647 1363:astore          20
	//* 648 1365:iload           15
	//* 649 1367:iconst_1        
	//* 650 1368:icmpeq          1392
	//* 651 1371:iload           14
	//* 652 1373:iload           7
	//* 653 1375:imul            
	//* 654 1376:iload           8
	//* 655 1378:imul            
	//* 656 1379:bipush          7
	//* 657 1381:iadd            
	//* 658 1382:bipush          8
	//* 659 1384:idiv            
	//* 660 1385:iload           18
	//* 661 1387:imul            
	//* 662 1388:newarray        byte[]
	//* 663 1390:astore          20
	//* 664 1392:iload           9
	//* 665 1394:ifeq            2005
	//* 666 1397:aload           28
	//* 667 1399:invokestatic    #271 <Method void TIFFFaxDecoder.reverseBits(byte[])>
	//* 668 1402:goto            2005
	//* 669 1405:iload           7
	//* 670 1407:iconst_1        
	//* 671 1408:icmpne          1483
	//* 672 1411:iload           8
	//* 673 1413:iconst_1        
	//* 674 1414:icmpne          1483
	//* 675 1417:iload           13
	//* 676 1419:iconst_3        
	//* 677 1420:icmpeq          1483
	//* 678 1423:aload           27
	//* 679 1425:aload           20
	//* 680 1427:iload           18
	//* 681 1429:invokevirtual   #202 <Method void CCITTG4Encoder.fax4Encode(byte[], int)>
	//* 682 1432:goto            2059
	//* 683 1435:aload           28
	//* 684 1437:aload           20
	//* 685 1439:invokestatic    #274 <Method void inflate(byte[], byte[])>
	//* 686 1442:aload           20
	//* 687 1444:iload           5
	//* 688 1446:iload           14
	//* 689 1448:iload           18
	//* 690 1450:iload           8
	//* 691 1452:invokestatic    #276 <Method void applyPredictor(byte[], int, int, int, int)>
	//* 692 1455:goto            1405
	//* 693 1458:aload           28
	//* 694 1460:aload           20
	//* 695 1462:invokestatic    #278 <Method void decodePackbits(byte[], byte[])>
	//* 696 1465:goto            1405
	//* 697 1468:aload           24
	//* 698 1470:aload           28
	//* 699 1472:aload           20
	//* 700 1474:iload           18
	//* 701 1476:invokevirtual   #282 <Method byte[] TIFFLZWDecoder.decode(byte[], byte[], int)>
	//* 702 1479:pop             
	//* 703 1480:goto            1405
	//* 704 1483:iload           6
	//* 705 1485:ifle            1509
	//* 706 1488:aload           26
	//* 707 1490:aload           21
	//* 708 1492:aload           20
	//* 709 1494:iload           8
	//* 710 1496:iload           7
	//* 711 1498:iload           14
	//* 712 1500:iload           18
	//* 713 1502:invokestatic    #284 <Method Image ProcessExtraSamples(DeflaterOutputStream, DeflaterOutputStream, byte[], int, int, int, int)>
	//* 714 1505:pop             
	//* 715 1506:goto            2059
	//* 716 1509:aload           26
	//* 717 1511:aload           20
	//* 718 1513:invokevirtual   #286 <Method void DeflaterOutputStream.write(byte[])>
	//* 719 1516:goto            2059
	//* 720 1519:iload           14
	//* 721 1521:iload           4
	//* 722 1523:iconst_0        
	//* 723 1524:sipush          256
	//* 724 1527:iload           5
	//* 725 1529:aload           27
	//* 726 1531:invokevirtual   #214 <Method byte[] CCITTG4Encoder.close()>
	//* 727 1534:invokestatic    #140 <Method Image Image.getInstance(int, int, boolean, int, int, byte[])>
	//* 728 1537:astore_1        
	//* 729 1538:goto            951
	//* 730 1541:aload           26
	//* 731 1543:invokevirtual   #288 <Method void DeflaterOutputStream.close()>
	//* 732 1546:new             #290 <Class ImgRaw>
	//* 733 1549:dup             
	//* 734 1550:iload           14
	//* 735 1552:iload           4
	//* 736 1554:iload           8
	//* 737 1556:iload           6
	//* 738 1558:isub            
	//* 739 1559:iload           7
	//* 740 1561:aload           25
	//* 741 1563:invokevirtual   #293 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 742 1566:invokespecial   #296 <Method void ImgRaw(int, int, int, int, byte[])>
	//* 743 1569:astore_1        
	//* 744 1570:aload_1         
	//* 745 1571:iconst_1        
	//* 746 1572:invokevirtual   #299 <Method void Image.setDeflated(boolean)>
	//* 747 1575:goto            951
	//* 748 1578:iload           9
	//* 749 1580:istore          8
	//* 750 1582:iload           5
	//* 751 1584:aload_0         
	//* 752 1585:arraylength     
	//* 753 1586:icmpge          2127
	//* 754 1589:aload_0         
	//* 755 1590:iload           5
	//* 756 1592:baload          
	//* 757 1593:ifeq            2197
	//* 758 1596:iconst_0        
	//* 759 1597:istore          8
	//* 760 1599:goto            2127
	//* 761 1602:new             #301 <Class PdfArray>
	//* 762 1605:dup             
	//* 763 1606:invokespecial   #302 <Method void PdfArray()>
	//* 764 1609:astore          20
	//* 765 1611:aload           20
	//* 766 1613:getstatic       #308 <Field PdfName PdfName.INDEXED>
	//* 767 1616:invokevirtual   #312 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 768 1619:pop             
	//* 769 1620:aload           20
	//* 770 1622:getstatic       #315 <Field PdfName PdfName.DEVICERGB>
	//* 771 1625:invokevirtual   #312 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 772 1628:pop             
	//* 773 1629:aload           20
	//* 774 1631:new             #317 <Class PdfNumber>
	//* 775 1634:dup             
	//* 776 1635:iload           10
	//* 777 1637:iconst_1        
	//* 778 1638:isub            
	//* 779 1639:invokespecial   #318 <Method void PdfNumber(int)>
	//* 780 1642:invokevirtual   #312 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 781 1645:pop             
	//* 782 1646:aload           20
	//* 783 1648:new             #320 <Class PdfString>
	//* 784 1651:dup             
	//* 785 1652:aload_0         
	//* 786 1653:invokespecial   #321 <Method void PdfString(byte[])>
	//* 787 1656:invokevirtual   #312 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 788 1659:pop             
	//* 789 1660:new             #323 <Class PdfDictionary>
	//* 790 1663:dup             
	//* 791 1664:invokespecial   #324 <Method void PdfDictionary()>
	//* 792 1667:astore_0        
	//* 793 1668:aload_0         
	//* 794 1669:getstatic       #327 <Field PdfName PdfName.COLORSPACE>
	//* 795 1672:aload           20
	//* 796 1674:invokevirtual   #331 <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//* 797 1677:aload_1         
	//* 798 1678:aload_0         
	//* 799 1679:invokevirtual   #335 <Method void Image.setAdditional(PdfDictionary)>
	//* 800 1682:aload_1         
	//* 801 1683:iconst_5        
	//* 802 1684:invokevirtual   #173 <Method void Image.setOriginalType(int)>
	//* 803 1687:iload           13
	//* 804 1689:ifne            1697
	//* 805 1692:aload_1         
	//* 806 1693:iconst_1        
	//* 807 1694:invokevirtual   #144 <Method void Image.setInverted(boolean)>
	//* 808 1697:fload_2         
	//* 809 1698:fconst_0        
	//* 810 1699:fcmpl           
	//* 811 1700:ifeq            1708
	//* 812 1703:aload_1         
	//* 813 1704:fload_2         
	//* 814 1705:invokevirtual   #176 <Method void Image.setInitialRotation(float)>
	//* 815 1708:iload           6
	//* 816 1710:ifle            1748
	//* 817 1713:aload           21
	//* 818 1715:invokevirtual   #288 <Method void DeflaterOutputStream.close()>
	//* 819 1718:iload           14
	//* 820 1720:iload           4
	//* 821 1722:iconst_1        
	//* 822 1723:iload           7
	//* 823 1725:aload           22
	//* 824 1727:invokevirtual   #293 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 825 1730:invokestatic    #338 <Method Image Image.getInstance(int, int, int, int, byte[])>
	//* 826 1733:astore_0        
	//* 827 1734:aload_0         
	//* 828 1735:invokevirtual   #341 <Method void Image.makeMask()>
	//* 829 1738:aload_0         
	//* 830 1739:iconst_1        
	//* 831 1740:invokevirtual   #299 <Method void Image.setDeflated(boolean)>
	//* 832 1743:aload_1         
	//* 833 1744:aload_0         
	//* 834 1745:invokevirtual   #345 <Method void Image.setImageMask(Image)>
	//* 835 1748:aload_1         
	//* 836 1749:areturn         
	//* 837 1750:astore          20
	//* 838 1752:goto            1019
	//* 839 1755:goto            84
	//* 840 1758:goto            160
	//* 841 1761:ldc1            #215 <Float 3.141593F>
	//* 842 1763:fstore_2        
	//* 843 1764:goto            228
	//* 844 1767:iload           4
	//* 845 1769:iconst_5        
	//* 846 1770:icmpeq          1780
	//* 847 1773:iload           4
	//* 848 1775:bipush          8
	//* 849 1777:icmpne          1786
	//* 850 1780:ldc1            #218 <Float 1.570796F>
	//* 851 1782:fstore_2        
	//* 852 1783:goto            228
	//* 853 1786:iload           4
	//* 854 1788:bipush          6
	//* 855 1790:icmpeq          1802
	//* 856 1793:fload_3         
	//* 857 1794:fstore_2        
	//* 858 1795:iload           4
	//* 859 1797:bipush          7
	//* 860 1799:icmpne          228
	//* 861 1802:ldc1            #219 <Float -1.570796F>
	//* 862 1804:fstore_2        
	//* 863 1805:goto            228
	//* 864 1808:iload           7
	//* 865 1810:tableswitch     1 8: default 1856
	//	               1 349
	//	               2 349
	//	               3 334
	//	               4 349
	//	               5 334
	//	               6 334
	//	               7 334
	//	               8 349
	//* 866 1856:goto            334
_L12:
		int k1;
		int i2;
		if(j == 2)
	//* 867 1859:iload           5
	//* 868 1861:iconst_2        
	//* 869 1862:icmpne          1922
			flag = true;
	//  870 1865:iconst_1        
	//  871 1866:istore          9
		else
	//* 872 1868:goto            448
	//* 873 1871:iload           5
	//* 874 1873:ifle            1887
	//* 875 1876:iload           5
	//* 876 1878:istore          10
	//* 877 1880:iload           5
	//* 878 1882:iload           4
	//* 879 1884:icmple          475
	//* 880 1887:iload           4
	//* 881 1889:istore          10
	//* 882 1891:goto            475
	//* 883 1894:iload           15
	//* 884 1896:iconst_5        
	//* 885 1897:icmpeq          573
	//* 886 1900:iload           15
	//* 887 1902:ldc2            #346 <Int 32946>
	//* 888 1905:icmpeq          573
	//* 889 1908:iload           11
	//* 890 1910:istore          5
	//* 891 1912:iload           15
	//* 892 1914:bipush          8
	//* 893 1916:icmpne          664
	//* 894 1919:goto            573
			flag = false;
	//  895 1922:iconst_0        
	//  896 1923:istore          9
		j = i;
		if(tiffdirectory.isTagPresent(278))
			j = (int)tiffdirectory.getFieldAsLong(278);
		  goto _L13
_L79:
		al1 = getArrayLongShort(tiffdirectory, 273);
		al = getArrayLongShort(tiffdirectory, 279);
		if(al == null) goto _L15; else goto _L14
_L14:
		obj1 = ((Object) (al));
		if(al.length != 1) goto _L17; else goto _L16
_L16:
		if(al[0] == 0L) goto _L15; else goto _L18
_L18:
		obj1 = ((Object) (al));
		if(al[0] + al1[0] <= randomaccessfileorarray.length()) goto _L17; else goto _L15
_L15:
		obj1 = ((Object) (al));
		if(i != k1) goto _L17; else goto _L19
_L19:
		obj1 = ((Object) (new long[1]));
		obj1[0] = randomaccessfileorarray.length() - (long)(int)al1[0];
		  goto _L17
_L80:
		al = ((long []) (tiffdirectory.getField(317)));
		j = l1;
		if(al == null)
			break MISSING_BLOCK_LABEL_664;
		l1 = ((TIFFField) (al)).getAsInt(0);
		if(l1 == 1 || l1 == 2) goto _L21; else goto _L20
_L20:
		throw new RuntimeException(MessageLocalization.getComposedMessage("illegal.value.for.predictor.in.tiff.file", new Object[0]));
_L21:
		j = l1;
		if(l1 != 2)
			break MISSING_BLOCK_LABEL_664;
		j = l1;
		if(l == 8)
			break MISSING_BLOCK_LABEL_664;
		throw new RuntimeException(MessageLocalization.getComposedMessage("1.bit.samples.are.not.supported.for.horizontal.differencing.predictor", l));
_L81:
		if(l2 != 5) goto _L23; else goto _L22
_L22:
		tifflzwdecoder = new TIFFLZWDecoder(k2, j, i1);
_L23:
		i2 = i;
		bytearrayoutputstream1 = null;
		bytearrayoutputstream = null;
		al = null;
		deflateroutputstream = null;
		if(k <= 0) goto _L25; else goto _L24
_L24:
		bytearrayoutputstream = new ByteArrayOutputStream();
		deflateroutputstream = new DeflaterOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
_L25:
		obj2 = null;
		if(l != 1 || i1 != 1 || j2 == 3) goto _L27; else goto _L26
_L26:
		ccittg4encoder = new CCITTG4Encoder(k2);
		deflateroutputstream1 = ((DeflaterOutputStream) (al));
_L32:
		if(l2 != 6) goto _L29; else goto _L28
_L28:
		if(!tiffdirectory.isTagPresent(513))
			throw new IOException(MessageLocalization.getComposedMessage("missing.tag.s.for.ojpeg.compression", new Object[0]));
		  goto _L30
_L27:
		bytearrayoutputstream2 = new ByteArrayOutputStream();
		deflateroutputstream1 = ((DeflaterOutputStream) (al));
		ccittg4encoder = ((CCITTG4Encoder) (obj2));
		bytearrayoutputstream1 = bytearrayoutputstream2;
		if(l2 == 6) goto _L32; else goto _L31
_L31:
		deflateroutputstream1 = ((DeflaterOutputStream) (al));
		ccittg4encoder = ((CCITTG4Encoder) (obj2));
		bytearrayoutputstream1 = bytearrayoutputstream2;
		if(l2 == 7) goto _L32; else goto _L33
_L33:
		deflateroutputstream1 = new DeflaterOutputStream(((java.io.OutputStream) (bytearrayoutputstream2)));
		ccittg4encoder = ((CCITTG4Encoder) (obj2));
		bytearrayoutputstream1 = bytearrayoutputstream2;
		  goto _L32
_L30:
		j1 = (int)tiffdirectory.getFieldAsLong(513);
		j = (int)randomaccessfileorarray.length() - j1;
		if(tiffdirectory.isTagPresent(514))
			j = (int)tiffdirectory.getFieldAsLong(514) + (int)obj1[0];
		al = ((long []) (new byte[Math.min(j, (int)randomaccessfileorarray.length() - j1)]));
		randomaccessfileorarray.seek(j1);
		randomaccessfileorarray.readFully(((byte []) (al)));
		randomaccessfileorarray = ((RandomAccessFileOrArray) (new Jpeg(((byte []) (al)))));
_L46:
		((Image) (randomaccessfileorarray)).setDpi(i3, j3);
		if(l2 == 6 || l2 == 7) goto _L35; else goto _L34
_L34:
		flag1 = tiffdirectory.isTagPresent(34675);
		if(!flag1) goto _L37; else goto _L36
_L36:
		try
		{
			al = ((long []) (ICC_Profile.getInstance(tiffdirectory.getField(34675).getAsBytes())));
			if(i1 - k == ((ICC_Profile) (al)).getNumComponents())
				((Image) (randomaccessfileorarray)).tagICC(((ICC_Profile) (al)));
		}
		// Misplaced declaration of an exception variable
		catch(long al[]) { }
_L37:
		if(!tiffdirectory.isTagPresent(320)) goto _L39; else goto _L38
_L38:
		al = ((long []) (tiffdirectory.getField(320).getAsChars()));
		tiffdirectory = ((TIFFDirectory) (new byte[al.length]));
		k1 = al.length / 3;
		  goto _L40
_L29:
		if(l2 != 7) goto _L42; else goto _L41
_L41:
		if(obj1.length > 1)
			throw new IOException(MessageLocalization.getComposedMessage("compression.jpeg.is.only.supported.with.a.single.strip.this.image.has.1.strips", obj1.length));
		al = ((long []) (new byte[(int)obj1[0]]));
		randomaccessfileorarray.seek(al1[0]);
		randomaccessfileorarray.readFully(((byte []) (al)));
		obj1 = ((Object) (tiffdirectory.getField(347)));
		randomaccessfileorarray = ((RandomAccessFileOrArray) (al));
		if(obj1 == null) goto _L44; else goto _L43
_L43:
		randomaccessfileorarray = ((RandomAccessFileOrArray) (((TIFFField) (obj1)).getAsBytes()));
		l1 = 0;
		k1 = randomaccessfileorarray.length;
		j = k1;
		j1 = l1;
		if(randomaccessfileorarray[0] == -1)
		{
			j = k1;
			j1 = l1;
			if(randomaccessfileorarray[1] == -40)
			{
				j1 = 2;
				j = k1 - 2;
			}
		}
		k1 = j;
		if(randomaccessfileorarray[randomaccessfileorarray.length - 2] != -1)
			break MISSING_BLOCK_LABEL_1225;
		k1 = j;
		if(randomaccessfileorarray[randomaccessfileorarray.length - 1] == -39)
			k1 = j - 2;
		obj1 = ((Object) (new byte[k1]));
		System.arraycopy(((Object) (randomaccessfileorarray)), j1, obj1, 0, k1);
		randomaccessfileorarray = ((RandomAccessFileOrArray) (new byte[al.length + obj1.length]));
		System.arraycopy(((Object) (al)), 0, ((Object) (randomaccessfileorarray)), 0, 2);
		System.arraycopy(obj1, 0, ((Object) (randomaccessfileorarray)), 2, obj1.length);
		System.arraycopy(((Object) (al)), 2, ((Object) (randomaccessfileorarray)), obj1.length + 2, al.length - 2);
_L44:
		al = ((long []) (new Jpeg(((byte []) (randomaccessfileorarray)))));
		randomaccessfileorarray = ((RandomAccessFileOrArray) (al));
		if(j2 != 2) goto _L46; else goto _L45
_L45:
		((Image) (al)).setColorTransform(0);
		randomaccessfileorarray = ((RandomAccessFileOrArray) (al));
		  goto _L46
_L82:
		if(l1 >= al1.length) goto _L48; else goto _L47
_L47:
		abyte0 = new byte[(int)obj1[l1]];
		randomaccessfileorarray.seek(al1[l1]);
		randomaccessfileorarray.readFully(abyte0);
		k3 = Math.min(k1, i2);
		al = null;
		if(l2 == 1) goto _L50; else goto _L49
_L49:
		al = ((long []) (new byte[((k2 * l * i1 + 7) / 8) * k3]));
_L50:
		if(!flag) goto _L52; else goto _L51
_L51:
		TIFFFaxDecoder.reverseBits(abyte0);
		  goto _L52
_L56:
		if(l != 1 || i1 != 1 || j2 == 3) goto _L54; else goto _L53
_L53:
		ccittg4encoder.fax4Encode(((byte []) (al)), k3);
		  goto _L55
_L85:
		inflate(abyte0, ((byte []) (al)));
		applyPredictor(((byte []) (al)), j, k2, k3, i1);
		  goto _L56
_L86:
		decodePackbits(abyte0, ((byte []) (al)));
		  goto _L56
_L84:
		tifflzwdecoder.decode(abyte0, ((byte []) (al)), k3);
		  goto _L56
_L54:
		if(k <= 0) goto _L58; else goto _L57
_L57:
		ProcessExtraSamples(deflateroutputstream1, deflateroutputstream, ((byte []) (al)), i1, l, k2, k3);
		  goto _L55
_L58:
		deflateroutputstream1.write(((byte []) (al)));
		  goto _L55
_L89:
		randomaccessfileorarray = ((RandomAccessFileOrArray) (Image.getInstance(k2, i, false, 256, j, ccittg4encoder.close())));
		  goto _L46
_L88:
		deflateroutputstream1.close();
		randomaccessfileorarray = ((RandomAccessFileOrArray) (new ImgRaw(k2, i, i1 - k, l, bytearrayoutputstream1.toByteArray())));
		((Image) (randomaccessfileorarray)).setDeflated(true);
		  goto _L46
_L90:
		i1 = ((int) (flag));
		if(j >= tiffdirectory.length) goto _L60; else goto _L59
_L59:
		if(tiffdirectory[j] == 0) goto _L62; else goto _L61
_L61:
		i1 = 0;
		  goto _L60
_L91:
		al = ((long []) (new PdfArray()));
		((PdfArray) (al)).add(((com.itextpdf.text.pdf.PdfObject) (PdfName.INDEXED)));
		((PdfArray) (al)).add(((com.itextpdf.text.pdf.PdfObject) (PdfName.DEVICERGB)));
		((PdfArray) (al)).add(((com.itextpdf.text.pdf.PdfObject) (new PdfNumber(k1 - 1))));
		((PdfArray) (al)).add(((com.itextpdf.text.pdf.PdfObject) (new PdfString(((byte []) (tiffdirectory))))));
		tiffdirectory = ((TIFFDirectory) (new PdfDictionary()));
		((PdfDictionary) (tiffdirectory)).put(PdfName.COLORSPACE, ((com.itextpdf.text.pdf.PdfObject) (al)));
		((Image) (randomaccessfileorarray)).setAdditional(((PdfDictionary) (tiffdirectory)));
_L39:
		((Image) (randomaccessfileorarray)).setOriginalType(5);
_L35:
		if(j2 != 0) goto _L64; else goto _L63
_L63:
		((Image) (randomaccessfileorarray)).setInverted(true);
_L64:
		if(f == 0.0F) goto _L66; else goto _L65
_L65:
		((Image) (randomaccessfileorarray)).setInitialRotation(f);
_L66:
		if(k <= 0) goto _L68; else goto _L67
_L67:
		deflateroutputstream.close();
		tiffdirectory = ((TIFFDirectory) (Image.getInstance(k2, i, 1, l, bytearrayoutputstream.toByteArray())));
		((Image) (tiffdirectory)).makeMask();
		((Image) (tiffdirectory)).setDeflated(true);
		((Image) (randomaccessfileorarray)).setImageMask(((Image) (tiffdirectory)));
_L68:
		return ((Image) (randomaccessfileorarray));
_L8:
		f = 3.141593F;
		  goto _L7
_L9:
		if(i != 5 && i != 8) goto _L70; else goto _L69
_L69:
		f = 1.570796F;
		  goto _L7
_L70:
		if(i == 6) goto _L72; else goto _L71
_L71:
		f = f1;
		if(i != 7) goto _L7; else goto _L72
_L72:
		f = -1.570796F;
		  goto _L7
_L10:
		l;
		JVM INSTR tableswitch 1 8: default 1856
	//	               1 349
	//	               2 349
	//	               3 334
	//	               4 349
	//	               5 334
	//	               6 334
	//	               7 334
	//	               8 349;
		   goto _L73 _L74 _L74 _L73 _L74 _L73 _L73 _L73 _L74
_L73:
		if(true) goto _L76; else goto _L75
_L75:
_L13:
		if(j <= 0) goto _L78; else goto _L77
_L77:
		k1 = j;
		if(j <= i) goto _L79; else goto _L78
_L78:
		k1 = i;
		  goto _L79
_L17:
		if(l2 == 5 || l2 == 32946)
			break; /* Loop/switch isn't completed */
		j = l1;
		if(l2 != 8) goto _L81; else goto _L80
	//* 897 1925:goto            448
	//* 898 1928:iload           5
	//* 899 1930:iload           10
	//* 900 1932:icmpge          2118
	//* 901 1935:aload_0         
	//* 902 1936:iload           5
	//* 903 1938:iconst_3        
	//* 904 1939:imul            
	//* 905 1940:aload           20
	//* 906 1942:iload           5
	//* 907 1944:caload          
	//* 908 1945:bipush          8
	//* 909 1947:iushr           
	//* 910 1948:int2byte        
	//* 911 1949:bastore         
	//* 912 1950:aload_0         
	//* 913 1951:iload           5
	//* 914 1953:iconst_3        
	//* 915 1954:imul            
	//* 916 1955:iconst_1        
	//* 917 1956:iadd            
	//* 918 1957:aload           20
	//* 919 1959:iload           5
	//* 920 1961:iload           10
	//* 921 1963:iadd            
	//* 922 1964:caload          
	//* 923 1965:bipush          8
	//* 924 1967:iushr           
	//* 925 1968:int2byte        
	//* 926 1969:bastore         
	//* 927 1970:aload_0         
	//* 928 1971:iload           5
	//* 929 1973:iconst_3        
	//* 930 1974:imul            
	//* 931 1975:iconst_2        
	//* 932 1976:iadd            
	//* 933 1977:aload           20
	//* 934 1979:iload           5
	//* 935 1981:iload           11
	//* 936 1983:iadd            
	//* 937 1984:caload          
	//* 938 1985:bipush          8
	//* 939 1987:iushr           
	//* 940 1988:int2byte        
	//* 941 1989:bastore         
	//* 942 1990:iload           5
	//* 943 1992:iconst_1        
	//* 944 1993:iadd            
	//* 945 1994:istore          5
	//* 946 1996:goto            1928
_L42:
		l1 = 0;
	//  947 1999:iconst_0        
	//  948 2000:istore          11
		  goto _L82
	//* 949 2002:goto            1320
_L52:
		l2;
	//  950 2005:iload           15
		JVM INSTR lookupswitch 5: default 2056
	//	               1: 2075
	//	               5: 1468
	//	               8: 1435
	//	               32773: 1458
	//	               32946: 1435;
	//  951 2007:lookupswitch    5: default 2056
	//	               1: 2075
	//	               5: 1468
	//	               8: 1435
	//	               32773: 1458
	//	               32946: 1435
		   goto _L56 _L83 _L84 _L85 _L86 _L85
	//* 952 2056:goto            1405
_L55:
		i2 -= k1;
	//  953 2059:iload           12
	//  954 2061:iload           10
	//  955 2063:isub            
	//  956 2064:istore          12
		l1++;
	//  957 2066:iload           11
	//  958 2068:iconst_1        
	//  959 2069:iadd            
	//  960 2070:istore          11
		  goto _L82
	//* 961 2072:goto            1320
_L83:
		al = ((long []) (abyte0));
	//  962 2075:aload           28
	//  963 2077:astore          20
		  goto _L56
	//* 964 2079:goto            1405
_L48:
		if(l != 1 || i1 != 1 || j2 == 3) goto _L88; else goto _L87
	//  965 2082:iload           7
	//  966 2084:iconst_1        
	//  967 2085:icmpne          1541
	//  968 2088:iload           8
	//  969 2090:iconst_1        
	//  970 2091:icmpne          1541
	//  971 2094:iload           13
	//  972 2096:iconst_3        
	//  973 2097:icmpeq          1541
_L87:
		if(j2 == 1)
	//* 974 2100:iload           13
	//* 975 2102:iconst_1        
	//* 976 2103:icmpne          2112
			j = 1;
	//  977 2106:iconst_1        
	//  978 2107:istore          5
		else
	//* 979 2109:goto            1519
			j = 0;
	//  980 2112:iconst_0        
	//  981 2113:istore          5
		  goto _L89
_L40:
		l1 = k1 * 2;
		boolean flag;
		byte abyte0[];
		for(j = 0; j < k1; j++)
		{
			tiffdirectory[j * 3] = (byte)(al[j] >>> 8);
			tiffdirectory[j * 3 + 1] = (byte)(al[j + k1] >>> 8);
			tiffdirectory[j * 3 + 2] = (byte)(al[j + l1] >>> 8);
		}

	//* 982 2115:goto            1519
		flag = true;
	//  983 2118:iconst_1        
	//  984 2119:istore          9
		j = 0;
	//  985 2121:iconst_0        
	//  986 2122:istore          5
		  goto _L90
	//* 987 2124:goto            1578
_L60:
		if(i1 != 0)
	//* 988 2127:iload           8
	//* 989 2129:ifeq            1602
		{
			j = 0;
	//  990 2132:iconst_0        
	//  991 2133:istore          5
			while(j < k1) 
	//* 992 2135:iload           5
	//* 993 2137:iload           10
	//* 994 2139:icmpge          1602
			{
				tiffdirectory[j * 3] = (byte)al[j];
	//  995 2142:aload_0         
	//  996 2143:iload           5
	//  997 2145:iconst_3        
	//  998 2146:imul            
	//  999 2147:aload           20
	// 1000 2149:iload           5
	// 1001 2151:caload          
	// 1002 2152:int2byte        
	// 1003 2153:bastore         
				tiffdirectory[j * 3 + 1] = (byte)al[j + k1];
	// 1004 2154:aload_0         
	// 1005 2155:iload           5
	// 1006 2157:iconst_3        
	// 1007 2158:imul            
	// 1008 2159:iconst_1        
	// 1009 2160:iadd            
	// 1010 2161:aload           20
	// 1011 2163:iload           5
	// 1012 2165:iload           10
	// 1013 2167:iadd            
	// 1014 2168:caload          
	// 1015 2169:int2byte        
	// 1016 2170:bastore         
				tiffdirectory[j * 3 + 2] = (byte)al[j + l1];
	// 1017 2171:aload_0         
	// 1018 2172:iload           5
	// 1019 2174:iconst_3        
	// 1020 2175:imul            
	// 1021 2176:iconst_2        
	// 1022 2177:iadd            
	// 1023 2178:aload           20
	// 1024 2180:iload           5
	// 1025 2182:iload           11
	// 1026 2184:iadd            
	// 1027 2185:caload          
	// 1028 2186:int2byte        
	// 1029 2187:bastore         
				j++;
	// 1030 2188:iload           5
	// 1031 2190:iconst_1        
	// 1032 2191:iadd            
	// 1033 2192:istore          5
			}
		}
		  goto _L91
	//*1034 2194:goto            2135
_L62:
		j++;
	// 1035 2197:iload           5
	// 1036 2199:iconst_1        
	// 1037 2200:iadd            
	// 1038 2201:istore          5
		  goto _L90
	//*1039 2203:goto            1578
	}

	public static void inflate(byte abyte0[], byte abyte1[])
	{
		Inflater inflater = new Inflater();
	//    0    0:new             #350 <Class Inflater>
	//    1    3:dup             
	//    2    4:invokespecial   #351 <Method void Inflater()>
	//    3    7:astore_2        
		inflater.setInput(abyte0);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #354 <Method void Inflater.setInput(byte[])>
		try
		{
			inflater.inflate(abyte1);
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #357 <Method int Inflater.inflate(byte[])>
	//   10   18:pop             
			return;
	//   11   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  12   20:astore_0        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   13   21:new             #78  <Class ExceptionConverter>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #81  <Method void ExceptionConverter(Exception)>
	//   17   29:athrow          
		}
	}
}
