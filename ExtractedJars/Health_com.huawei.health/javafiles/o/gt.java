// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class gt
{

	public gt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] c(byte abyte0[])
		throws IOException
	{
		GZIPOutputStream gzipoutputstream;
		ByteArrayOutputStream bytearrayoutputstream;
		byte abyte1[];
		ByteArrayOutputStream bytearrayoutputstream1;
		GZIPOutputStream gzipoutputstream1;
		abyte1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		bytearrayoutputstream1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		gzipoutputstream1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		bytearrayoutputstream = bytearrayoutputstream1;
	//    6    9:aload           5
	//    7   11:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//    8   12:aload           6
	//    9   14:astore_2        
		abyte0 = ((byte []) (new ByteArrayInputStream(abyte0)));
	//   10   15:new             #17  <Class ByteArrayInputStream>
	//   11   18:dup             
	//   12   19:aload_0         
	//   13   20:invokespecial   #20  <Method void ByteArrayInputStream(byte[])>
	//   14   23:astore_0        
		abyte1 = abyte0;
	//   15   24:aload_0         
	//   16   25:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   17   27:aload           5
	//   18   29:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   19   30:aload           6
	//   20   32:astore_2        
		bytearrayoutputstream1 = new ByteArrayOutputStream();
	//   21   33:new             #22  <Class ByteArrayOutputStream>
	//   22   36:dup             
	//   23   37:invokespecial   #23  <Method void ByteArrayOutputStream()>
	//   24   40:astore          5
		abyte1 = abyte0;
	//   25   42:aload_0         
	//   26   43:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   27   45:aload           5
	//   28   47:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   29   48:aload           6
	//   30   50:astore_2        
		gzipoutputstream1 = new GZIPOutputStream(((java.io.OutputStream) (bytearrayoutputstream1)));
	//   31   51:new             #25  <Class GZIPOutputStream>
	//   32   54:dup             
	//   33   55:aload           5
	//   34   57:invokespecial   #28  <Method void GZIPOutputStream(java.io.OutputStream)>
	//   35   60:astore          6
		abyte1 = abyte0;
	//   36   62:aload_0         
	//   37   63:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   38   65:aload           5
	//   39   67:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   40   68:aload           6
	//   41   70:astore_2        
		byte abyte2[] = new byte[4096];
	//   42   71:sipush          4096
	//   43   74:newarray        byte[]
	//   44   76:astore          7
_L2:
		abyte1 = abyte0;
	//   45   78:aload_0         
	//   46   79:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   47   81:aload           5
	//   48   83:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   49   84:aload           6
	//   50   86:astore_2        
		int i = ((ByteArrayInputStream) (abyte0)).read(abyte2);
	//   51   87:aload_0         
	//   52   88:aload           7
	//   53   90:invokevirtual   #32  <Method int ByteArrayInputStream.read(byte[])>
	//   54   93:istore_1        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   55   94:iload_1         
	//   56   95:iconst_m1       
	//   57   96:icmpeq          120
		abyte1 = abyte0;
	//   58   99:aload_0         
	//   59  100:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   60  102:aload           5
	//   61  104:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   62  105:aload           6
	//   63  107:astore_2        
		gzipoutputstream1.write(abyte2, 0, i);
	//   64  108:aload           6
	//   65  110:aload           7
	//   66  112:iconst_0        
	//   67  113:iload_1         
	//   68  114:invokevirtual   #36  <Method void GZIPOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   69  117:goto            78
_L1:
		abyte1 = abyte0;
	//   70  120:aload_0         
	//   71  121:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   72  123:aload           5
	//   73  125:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   74  126:aload           6
	//   75  128:astore_2        
		gzipoutputstream1.flush();
	//   76  129:aload           6
	//   77  131:invokevirtual   #39  <Method void GZIPOutputStream.flush()>
		abyte1 = abyte0;
	//   78  134:aload_0         
	//   79  135:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   80  137:aload           5
	//   81  139:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   82  140:aload           6
	//   83  142:astore_2        
		gzipoutputstream1.finish();
	//   84  143:aload           6
	//   85  145:invokevirtual   #42  <Method void GZIPOutputStream.finish()>
		abyte1 = abyte0;
	//   86  148:aload_0         
	//   87  149:astore          4
		bytearrayoutputstream = bytearrayoutputstream1;
	//   88  151:aload           5
	//   89  153:astore_3        
		gzipoutputstream = gzipoutputstream1;
	//   90  154:aload           6
	//   91  156:astore_2        
		abyte2 = bytearrayoutputstream1.toByteArray();
	//   92  157:aload           5
	//   93  159:invokevirtual   #46  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   94  162:astore          7
		try
		{
			((ByteArrayInputStream) (abyte0)).close();
	//   95  164:aload_0         
	//   96  165:invokevirtual   #49  <Method void ByteArrayInputStream.close()>
		}
	//*  97  168:aload           5
	//*  98  170:invokevirtual   #50  <Method void ByteArrayOutputStream.close()>
	//*  99  173:aload           6
	//* 100  175:invokevirtual   #51  <Method void GZIPOutputStream.close()>
	//* 101  178:aload           7
	//* 102  180:areturn         
	//* 103  181:astore_0        
	//* 104  182:aload           4
	//* 105  184:ifnull          192
	//* 106  187:aload           4
	//* 107  189:invokevirtual   #49  <Method void ByteArrayInputStream.close()>
	//* 108  192:aload_3         
	//* 109  193:ifnull          200
	//* 110  196:aload_3         
	//* 111  197:invokevirtual   #50  <Method void ByteArrayOutputStream.close()>
	//* 112  200:aload_2         
	//* 113  201:ifnull          208
	//* 114  204:aload_2         
	//* 115  205:invokevirtual   #51  <Method void GZIPOutputStream.close()>
	//* 116  208:aload_0         
	//* 117  209:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  118  210:astore_0        
		try
		{
			bytearrayoutputstream1.close();
		}
	//* 119  211:goto            168
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  120  214:astore_0        
		try
		{
			gzipoutputstream1.close();
		}
	//* 121  215:goto            173
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 122  218:astore_0        
		{
			return abyte2;
	//  123  219:aload           7
	//  124  221:areturn         
		}
		return abyte2;
		abyte0;
		if(abyte1 != null)
			try
			{
				((ByteArrayInputStream) (abyte1)).close();
			}
			catch(Exception exception2) { }
	//  125  222:astore          4
		if(bytearrayoutputstream != null)
			try
			{
				bytearrayoutputstream.close();
			}
	//* 126  224:goto            192
			catch(Exception exception1) { }
	//  127  227:astore_3        
		if(gzipoutputstream != null)
			try
			{
				gzipoutputstream.close();
			}
	//* 128  228:goto            200
			catch(Exception exception) { }
	//  129  231:astore_2        
		throw abyte0;
	//* 130  232:goto            208
	}

	public static byte[] e(byte abyte0[])
		throws IOException
	{
		byte abyte1[];
		GZIPInputStream gzipinputstream;
		ByteArrayOutputStream bytearrayoutputstream;
		ByteArrayOutputStream bytearrayoutputstream1;
		GZIPInputStream gzipinputstream1;
		abyte1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		bytearrayoutputstream1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		gzipinputstream1 = null;
	//    4    5:aconst_null     
	//    5    6:astore          6
		bytearrayoutputstream = bytearrayoutputstream1;
	//    6    8:aload           5
	//    7   10:astore          4
		gzipinputstream = gzipinputstream1;
	//    8   12:aload           6
	//    9   14:astore_3        
		abyte0 = ((byte []) (new ByteArrayInputStream(abyte0)));
	//   10   15:new             #17  <Class ByteArrayInputStream>
	//   11   18:dup             
	//   12   19:aload_0         
	//   13   20:invokespecial   #20  <Method void ByteArrayInputStream(byte[])>
	//   14   23:astore_0        
		abyte1 = abyte0;
	//   15   24:aload_0         
	//   16   25:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   17   26:aload           5
	//   18   28:astore          4
		gzipinputstream = gzipinputstream1;
	//   19   30:aload           6
	//   20   32:astore_3        
		gzipinputstream1 = new GZIPInputStream(((java.io.InputStream) (abyte0)));
	//   21   33:new             #55  <Class GZIPInputStream>
	//   22   36:dup             
	//   23   37:aload_0         
	//   24   38:invokespecial   #58  <Method void GZIPInputStream(java.io.InputStream)>
	//   25   41:astore          6
		abyte1 = abyte0;
	//   26   43:aload_0         
	//   27   44:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   28   45:aload           5
	//   29   47:astore          4
		gzipinputstream = gzipinputstream1;
	//   30   49:aload           6
	//   31   51:astore_3        
		byte abyte2[] = new byte[4096];
	//   32   52:sipush          4096
	//   33   55:newarray        byte[]
	//   34   57:astore          7
		abyte1 = abyte0;
	//   35   59:aload_0         
	//   36   60:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   37   61:aload           5
	//   38   63:astore          4
		gzipinputstream = gzipinputstream1;
	//   39   65:aload           6
	//   40   67:astore_3        
		bytearrayoutputstream1 = new ByteArrayOutputStream();
	//   41   68:new             #22  <Class ByteArrayOutputStream>
	//   42   71:dup             
	//   43   72:invokespecial   #23  <Method void ByteArrayOutputStream()>
	//   44   75:astore          5
_L2:
		abyte1 = abyte0;
	//   45   77:aload_0         
	//   46   78:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   47   79:aload           5
	//   48   81:astore          4
		gzipinputstream = gzipinputstream1;
	//   49   83:aload           6
	//   50   85:astore_3        
		int i = gzipinputstream1.read(abyte2, 0, 4096);
	//   51   86:aload           6
	//   52   88:aload           7
	//   53   90:iconst_0        
	//   54   91:sipush          4096
	//   55   94:invokevirtual   #61  <Method int GZIPInputStream.read(byte[], int, int)>
	//   56   97:istore_1        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   57   98:iload_1         
	//   58   99:iconst_m1       
	//   59  100:icmpeq          124
		abyte1 = abyte0;
	//   60  103:aload_0         
	//   61  104:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   62  105:aload           5
	//   63  107:astore          4
		gzipinputstream = gzipinputstream1;
	//   64  109:aload           6
	//   65  111:astore_3        
		bytearrayoutputstream1.write(abyte2, 0, i);
	//   66  112:aload           5
	//   67  114:aload           7
	//   68  116:iconst_0        
	//   69  117:iload_1         
	//   70  118:invokevirtual   #62  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   71  121:goto            77
_L1:
		abyte1 = abyte0;
	//   72  124:aload_0         
	//   73  125:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   74  126:aload           5
	//   75  128:astore          4
		gzipinputstream = gzipinputstream1;
	//   76  130:aload           6
	//   77  132:astore_3        
		bytearrayoutputstream1.flush();
	//   78  133:aload           5
	//   79  135:invokevirtual   #63  <Method void ByteArrayOutputStream.flush()>
		abyte1 = abyte0;
	//   80  138:aload_0         
	//   81  139:astore_2        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   82  140:aload           5
	//   83  142:astore          4
		gzipinputstream = gzipinputstream1;
	//   84  144:aload           6
	//   85  146:astore_3        
		abyte2 = bytearrayoutputstream1.toByteArray();
	//   86  147:aload           5
	//   87  149:invokevirtual   #46  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   88  152:astore          7
		try
		{
			bytearrayoutputstream1.close();
	//   89  154:aload           5
	//   90  156:invokevirtual   #50  <Method void ByteArrayOutputStream.close()>
		}
	//*  91  159:aload           6
	//*  92  161:invokevirtual   #64  <Method void GZIPInputStream.close()>
	//*  93  164:aload_0         
	//*  94  165:invokevirtual   #49  <Method void ByteArrayInputStream.close()>
	//*  95  168:aload           7
	//*  96  170:areturn         
	//*  97  171:astore_0        
	//*  98  172:aload           4
	//*  99  174:invokevirtual   #50  <Method void ByteArrayOutputStream.close()>
	//* 100  177:aload_3         
	//* 101  178:invokevirtual   #64  <Method void GZIPInputStream.close()>
	//* 102  181:aload_2         
	//* 103  182:invokevirtual   #49  <Method void ByteArrayInputStream.close()>
	//* 104  185:aload_0         
	//* 105  186:athrow          
		catch(Exception exception) { }
	//  106  187:astore_2        
		try
		{
			gzipinputstream1.close();
		}
	//* 107  188:goto            159
		catch(Exception exception1) { }
	//  108  191:astore_2        
		try
		{
			((ByteArrayInputStream) (abyte0)).close();
		}
	//* 109  192:goto            164
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 110  195:astore_0        
		{
			return abyte2;
	//  111  196:aload           7
	//  112  198:areturn         
		}
		return abyte2;
		abyte0;
		try
		{
			bytearrayoutputstream.close();
		}
		catch(Exception exception4) { }
	//  113  199:astore          4
		try
		{
			gzipinputstream.close();
		}
	//* 114  201:goto            177
		catch(Exception exception3) { }
	//  115  204:astore_3        
		try
		{
			((ByteArrayInputStream) (abyte1)).close();
		}
	//* 116  205:goto            181
		catch(Exception exception2) { }
	//  117  208:astore_2        
		throw abyte0;
	//* 118  209:goto            185
	}
}
