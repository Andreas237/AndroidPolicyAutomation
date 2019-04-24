// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PRTokeniser, ByteBuffer

public class PdfName extends PdfObject
	implements Comparable
{

	public PdfName(String s)
	{
		this(s, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #3804 <Method void PdfName(String, boolean)>
	//    4    6:return          
	}

	public PdfName(String s, boolean flag)
	{
		super(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #3805 <Method void PdfObject(int)>
		hash = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #3807 <Field int hash>
		int i = s.length();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #3812 <Method int String.length()>
	//    8   14:istore_3        
		if(flag && i > 127)
	//*   9   15:iload_2         
	//*  10   16:ifeq            54
	//*  11   19:iload_3         
	//*  12   20:bipush          127
	//*  13   22:icmple          54
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.name.1.is.too.long.2.characters", new Object[] {
				s, String.valueOf(i)
			}));
	//   14   25:new             #3814 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:ldc2            #3816 <String "the.name.1.is.too.long.2.characters">
	//   17   32:iconst_2        
	//   18   33:anewarray       Object[]
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:aload_1         
	//   22   39:aastore         
	//   23   40:dup             
	//   24   41:iconst_1        
	//   25   42:iload_3         
	//   26   43:invokestatic    #3820 <Method String String.valueOf(int)>
	//   27   46:aastore         
	//   28   47:invokestatic    #3826 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   29   50:invokespecial   #3827 <Method void IllegalArgumentException(String)>
	//   30   53:athrow          
		} else
		{
			bytes = encodeName(s);
	//   31   54:aload_0         
	//   32   55:aload_1         
	//   33   56:invokestatic    #3831 <Method byte[] encodeName(String)>
	//   34   59:putfield        #3835 <Field byte[] bytes>
			return;
	//   35   62:return          
		}
	}

	public PdfName(byte abyte0[])
	{
		super(4, abyte0);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_1         
	//    3    3:invokespecial   #3839 <Method void PdfObject(int, byte[])>
		hash = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #3807 <Field int hash>
	//    7   11:return          
	}

	public static String decodeName(String s)
	{
		StringBuffer stringbuffer;
		stringbuffer = new StringBuffer();
	//    0    0:new             #3843 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #3845 <Method void StringBuffer()>
	//    3    7:astore          7
		char c;
		char c1;
		int i;
		int j;
		int k;
		char c2;
		try
		{
			k = s.length();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #3812 <Method int String.length()>
	//    6   13:istore          5
		}
	//*   7   15:iconst_1        
	//*   8   16:istore_3        
	//*   9   17:iload_3         
	//*  10   18:iload           5
	//*  11   20:icmpge          94
	//*  12   23:aload_0         
	//*  13   24:iload_3         
	//*  14   25:invokevirtual   #3849 <Method char String.charAt(int)>
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:istore_1        
	//*  18   31:iload_3         
	//*  19   32:istore          4
	//*  20   34:iload_2         
	//*  21   35:bipush          35
	//*  22   37:icmpne          78
	//*  23   40:aload_0         
	//*  24   41:iload_3         
	//*  25   42:iconst_1        
	//*  26   43:iadd            
	//*  27   44:invokevirtual   #3849 <Method char String.charAt(int)>
	//*  28   47:istore          4
	//*  29   49:aload_0         
	//*  30   50:iload_3         
	//*  31   51:iconst_2        
	//*  32   52:iadd            
	//*  33   53:invokevirtual   #3849 <Method char String.charAt(int)>
	//*  34   56:istore          6
	//*  35   58:iload           4
	//*  36   60:invokestatic    #3855 <Method int PRTokeniser.getHex(int)>
	//*  37   63:iconst_4        
	//*  38   64:ishl            
	//*  39   65:iload           6
	//*  40   67:invokestatic    #3855 <Method int PRTokeniser.getHex(int)>
	//*  41   70:iadd            
	//*  42   71:int2char        
	//*  43   72:istore_1        
	//*  44   73:iload_3         
	//*  45   74:iconst_2        
	//*  46   75:iadd            
	//*  47   76:istore          4
	//*  48   78:aload           7
	//*  49   80:iload_1         
	//*  50   81:invokevirtual   #3859 <Method StringBuffer StringBuffer.append(char)>
	//*  51   84:pop             
	//*  52   85:iload           4
	//*  53   87:iconst_1        
	//*  54   88:iadd            
	//*  55   89:istore_3        
	//*  56   90:goto            17
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			break; /* Loop/switch isn't completed */
		}
	//   57   93:astore_0        
		i = 1;
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
		c1 = s.charAt(i);
		c = c1;
		j = i;
		if(c1 != '#')
			break MISSING_BLOCK_LABEL_78;
		j = ((int) (s.charAt(i + 1)));
		c2 = s.charAt(i + 2);
		c = (char)((PRTokeniser.getHex(j) << 4) + PRTokeniser.getHex(((int) (c2))));
		j = i + 2;
		stringbuffer.append(c);
		i = j + 1;
		continue; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L1
_L1:
		return stringbuffer.toString();
	//   58   94:aload           7
	//   59   96:invokevirtual   #3860 <Method String StringBuffer.toString()>
	//   60   99:areturn         
	}

	public static byte[] encodeName(String s)
	{
		int i;
		int j;
		ByteBuffer bytebuffer;
		j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #3812 <Method int String.length()>
	//    2    4:istore_3        
		bytebuffer = new ByteBuffer(j + 20);
	//    3    5:new             #3862 <Class ByteBuffer>
	//    4    8:dup             
	//    5    9:iload_3         
	//    6   10:bipush          20
	//    7   12:iadd            
	//    8   13:invokespecial   #3863 <Method void ByteBuffer(int)>
	//    9   16:astore          4
		bytebuffer.append('/');
	//   10   18:aload           4
	//   11   20:bipush          47
	//   12   22:invokevirtual   #3866 <Method ByteBuffer ByteBuffer.append(char)>
	//   13   25:pop             
		s = ((String) (s.toCharArray()));
	//   14   26:aload_0         
	//   15   27:invokevirtual   #3870 <Method char[] String.toCharArray()>
	//   16   30:astore_0        
		i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
_L7:
		if(i >= j) goto _L2; else goto _L1
	//   19   33:iload_2         
	//   20   34:iload_3         
	//   21   35:icmpge          242
_L1:
		char c = (char)(s[i] & 0xff);
	//   22   38:aload_0         
	//   23   39:iload_2         
	//   24   40:caload          
	//   25   41:sipush          255
	//   26   44:iand            
	//   27   45:int2char        
	//   28   46:istore_1        
		c;
	//   29   47:iload_1         
		JVM INSTR lookupswitch 12: default 156
	//	               32: 182
	//	               35: 182
	//	               37: 182
	//	               40: 182
	//	               41: 182
	//	               47: 182
	//	               60: 182
	//	               62: 182
	//	               91: 182
	//	               93: 182
	//	               123: 182
	//	               125: 182;
	//   30   48:lookupswitch    12: default 156
	//	               32: 182
	//	               35: 182
	//	               37: 182
	//	               40: 182
	//	               41: 182
	//	               47: 182
	//	               60: 182
	//	               62: 182
	//	               91: 182
	//	               93: 182
	//	               123: 182
	//	               125: 182
		   goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4
_L3:
		if(c >= ' ' && c <= '~')
	//*  31  156:iload_1         
	//*  32  157:bipush          32
	//*  33  159:icmplt          205
	//*  34  162:iload_1         
	//*  35  163:bipush          126
	//*  36  165:icmpgt          205
		{
			bytebuffer.append(c);
	//   37  168:aload           4
	//   38  170:iload_1         
	//   39  171:invokevirtual   #3866 <Method ByteBuffer ByteBuffer.append(char)>
	//   40  174:pop             
		} else
	//*  41  175:iload_2         
	//*  42  176:iconst_1        
	//*  43  177:iadd            
	//*  44  178:istore_2        
	//*  45  179:goto            33
	//*  46  182:aload           4
	//*  47  184:bipush          35
	//*  48  186:invokevirtual   #3866 <Method ByteBuffer ByteBuffer.append(char)>
	//*  49  189:pop             
	//*  50  190:aload           4
	//*  51  192:iload_1         
	//*  52  193:bipush          16
	//*  53  195:invokestatic    #3875 <Method String Integer.toString(int, int)>
	//*  54  198:invokevirtual   #3878 <Method ByteBuffer ByteBuffer.append(String)>
	//*  55  201:pop             
	//*  56  202:goto            175
		{
			bytebuffer.append('#');
	//   57  205:aload           4
	//   58  207:bipush          35
	//   59  209:invokevirtual   #3866 <Method ByteBuffer ByteBuffer.append(char)>
	//   60  212:pop             
			if(c < '\020')
	//*  61  213:iload_1         
	//*  62  214:bipush          16
	//*  63  216:icmpge          227
				bytebuffer.append('0');
	//   64  219:aload           4
	//   65  221:bipush          48
	//   66  223:invokevirtual   #3866 <Method ByteBuffer ByteBuffer.append(char)>
	//   67  226:pop             
			bytebuffer.append(Integer.toString(((int) (c)), 16));
	//   68  227:aload           4
	//   69  229:iload_1         
	//   70  230:bipush          16
	//   71  232:invokestatic    #3875 <Method String Integer.toString(int, int)>
	//   72  235:invokevirtual   #3878 <Method ByteBuffer ByteBuffer.append(String)>
	//   73  238:pop             
		}
_L5:
		i++;
		continue; /* Loop/switch isn't completed */
_L4:
		bytebuffer.append('#');
		bytebuffer.append(Integer.toString(((int) (c)), 16));
		if(true) goto _L5; else goto _L2
	//*  74  239:goto            175
_L2:
		return bytebuffer.toByteArray();
	//   75  242:aload           4
	//   76  244:invokevirtual   #3882 <Method byte[] ByteBuffer.toByteArray()>
	//   77  247:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public int compareTo(PdfName pdfname)
	{
		int i;
		int j;
		byte abyte0[];
		abyte0 = bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #3835 <Field byte[] bytes>
	//    2    4:astore          4
		pdfname = ((PdfName) (pdfname.bytes));
	//    3    6:aload_1         
	//    4    7:getfield        #3835 <Field byte[] bytes>
	//    5   10:astore_1        
		j = Math.min(abyte0.length, pdfname.length);
	//    6   11:aload           4
	//    7   13:arraylength     
	//    8   14:aload_1         
	//    9   15:arraylength     
	//   10   16:invokestatic    #3889 <Method int Math.min(int, int)>
	//   11   19:istore_3        
		i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
_L7:
		if(i >= j) goto _L2; else goto _L1
	//   14   22:iload_2         
	//   15   23:iload_3         
	//   16   24:icmpge          58
_L1:
		if(abyte0[i] <= pdfname[i]) goto _L4; else goto _L3
	//   17   27:aload           4
	//   18   29:iload_2         
	//   19   30:baload          
	//   20   31:aload_1         
	//   21   32:iload_2         
	//   22   33:baload          
	//   23   34:icmple          39
_L3:
		return 1;
	//   24   37:iconst_1        
	//   25   38:ireturn         
_L4:
		if(abyte0[i] < pdfname[i])
	//*  26   39:aload           4
	//*  27   41:iload_2         
	//*  28   42:baload          
	//*  29   43:aload_1         
	//*  30   44:iload_2         
	//*  31   45:baload          
	//*  32   46:icmpge          51
			return -1;
	//   33   49:iconst_m1       
	//   34   50:ireturn         
		i++;
	//   35   51:iload_2         
	//   36   52:iconst_1        
	//   37   53:iadd            
	//   38   54:istore_2        
		continue; /* Loop/switch isn't completed */
	//   39   55:goto            22
_L2:
		if(abyte0.length < pdfname.length)
	//*  40   58:aload           4
	//*  41   60:arraylength     
	//*  42   61:aload_1         
	//*  43   62:arraylength     
	//*  44   63:icmpge          68
			return -1;
	//   45   66:iconst_m1       
	//   46   67:ireturn         
		if(abyte0.length > pdfname.length) goto _L3; else goto _L5
	//   47   68:aload           4
	//   48   70:arraylength     
	//   49   71:aload_1         
	//   50   72:arraylength     
	//   51   73:icmpgt          37
_L5:
		return 0;
	//   52   76:iconst_0        
	//   53   77:ireturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((PdfName)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class PdfName>
	//    3    5:invokevirtual   #3892 <Method int compareTo(PdfName)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
			if(obj instanceof PdfName)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PdfName>
	//*   7   11:ifeq            27
			{
				if(compareTo((PdfName)obj) != 0)
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:checkcast       #2   <Class PdfName>
	//*  11   19:invokevirtual   #3892 <Method int compareTo(PdfName)>
	//*  12   22:ifeq            5
					return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			} else
			{
				return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
			}
		return true;
	}

	public int hashCode()
	{
		int i = hash;
	//    0    0:aload_0         
	//    1    1:getfield        #3807 <Field int hash>
	//    2    4:istore_1        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(i == 0)
	//*   5    7:iload_1         
	//*   6    8:ifne            62
		{
			int l = bytes.length;
	//    7   11:aload_0         
	//    8   12:getfield        #3835 <Field byte[] bytes>
	//    9   15:arraylength     
	//   10   16:istore          4
			int k = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
			for(j = 0; k < l; j++)
	//*  13   20:iconst_0        
	//*  14   21:istore_2        
	//*  15   22:iload_3         
	//*  16   23:iload           4
	//*  17   25:icmpge          55
			{
				i = i * 31 + (bytes[j] & 0xff);
	//   18   28:iload_1         
	//   19   29:bipush          31
	//   20   31:imul            
	//   21   32:aload_0         
	//   22   33:getfield        #3835 <Field byte[] bytes>
	//   23   36:iload_2         
	//   24   37:baload          
	//   25   38:sipush          255
	//   26   41:iand            
	//   27   42:iadd            
	//   28   43:istore_1        
				k++;
	//   29   44:iload_3         
	//   30   45:iconst_1        
	//   31   46:iadd            
	//   32   47:istore_3        
			}

	//   33   48:iload_2         
	//   34   49:iconst_1        
	//   35   50:iadd            
	//   36   51:istore_2        
	//*  37   52:goto            22
			hash = i;
	//   38   55:aload_0         
	//   39   56:iload_1         
	//   40   57:putfield        #3807 <Field int hash>
			j = i;
	//   41   60:iload_1         
	//   42   61:istore_2        
		}
		return j;
	//   43   62:iload_2         
	//   44   63:ireturn         
	}

	public static final PdfName A;
	public static final PdfName A85;
	public static final PdfName AA;
	public static final PdfName ABSOLUTECOLORIMETRIC;
	public static final PdfName AC;
	public static final PdfName ACROFORM;
	public static final PdfName ACTION;
	public static final PdfName ACTIVATION;
	public static final PdfName ACTUALTEXT;
	public static final PdfName ADBE;
	public static final PdfName ADBE_PKCS7_DETACHED;
	public static final PdfName ADBE_PKCS7_S4;
	public static final PdfName ADBE_PKCS7_S5;
	public static final PdfName ADBE_PKCS7_SHA1;
	public static final PdfName ADBE_X509_RSA_SHA1;
	public static final PdfName ADOBE_PPKLITE;
	public static final PdfName ADOBE_PPKMS;
	public static final PdfName AESV2;
	public static final PdfName AESV3;
	public static final PdfName AF;
	public static final PdfName AFRELATIONSHIP;
	public static final PdfName AHX;
	public static final PdfName AIS;
	public static final PdfName ALL;
	public static final PdfName ALLPAGES;
	public static final PdfName ALT;
	public static final PdfName ALTERNATE;
	public static final PdfName ALTERNATEPRESENTATION;
	public static final PdfName ALTERNATES;
	public static final PdfName AND;
	public static final PdfName ANIMATION;
	public static final PdfName ANNOT;
	public static final PdfName ANNOTS;
	public static final PdfName ANTIALIAS;
	public static final PdfName AP;
	public static final PdfName APP;
	public static final PdfName APPDEFAULT;
	public static final PdfName ART;
	public static final PdfName ARTBOX;
	public static final PdfName ARTIFACT;
	public static final PdfName AS;
	public static final PdfName ASCENT;
	public static final PdfName ASCII85DECODE;
	public static final PdfName ASCIIHEXDECODE;
	public static final PdfName ASSET;
	public static final PdfName ASSETS;
	public static final PdfName ATTACHED;
	public static final PdfName AUTHEVENT;
	public static final PdfName AUTHOR;
	public static final PdfName B;
	public static final PdfName BACKGROUND;
	public static final PdfName BACKGROUNDCOLOR;
	public static final PdfName BASEENCODING;
	public static final PdfName BASEFONT;
	public static final PdfName BASEVERSION;
	public static final PdfName BBOX;
	public static final PdfName BC;
	public static final PdfName BG;
	public static final PdfName BIBENTRY;
	public static final PdfName BIGFIVE;
	public static final PdfName BINDING;
	public static final PdfName BINDINGMATERIALNAME;
	public static final PdfName BITSPERCOMPONENT;
	public static final PdfName BITSPERSAMPLE;
	public static final PdfName BL;
	public static final PdfName BLACKIS1;
	public static final PdfName BLACKPOINT;
	public static final PdfName BLEEDBOX;
	public static final PdfName BLINDS;
	public static final PdfName BLOCKQUOTE;
	public static final PdfName BM;
	public static final PdfName BORDER;
	public static final PdfName BOTH;
	public static final PdfName BOUNDS;
	public static final PdfName BOX;
	public static final PdfName BS;
	public static final PdfName BTN;
	public static final PdfName BYTERANGE;
	public static final PdfName C;
	public static final PdfName C0;
	public static final PdfName C1;
	public static final PdfName CA;
	public static final PdfName CALGRAY;
	public static final PdfName CALRGB;
	public static final PdfName CAPHEIGHT;
	public static final PdfName CAPTION;
	public static final PdfName CARET;
	public static final PdfName CATALOG;
	public static final PdfName CATEGORY;
	public static final PdfName CB;
	public static final PdfName CCITTFAXDECODE;
	public static final PdfName CENTER;
	public static final PdfName CENTERWINDOW;
	public static final PdfName CERT;
	public static final PdfName CERTS;
	public static final PdfName CF;
	public static final PdfName CFM;
	public static final PdfName CH;
	public static final PdfName CHARPROCS;
	public static final PdfName CHECKSUM;
	public static final PdfName CI;
	public static final PdfName CIDFONTTYPE0;
	public static final PdfName CIDFONTTYPE2;
	public static final PdfName CIDSET;
	public static final PdfName CIDSYSTEMINFO;
	public static final PdfName CIDTOGIDMAP;
	public static final PdfName CIRCLE;
	public static final PdfName CLASSMAP;
	public static final PdfName CLOUD;
	public static final PdfName CMD;
	public static final PdfName CO;
	public static final PdfName CODE;
	public static final PdfName COLLECTION;
	public static final PdfName COLLECTIONFIELD;
	public static final PdfName COLLECTIONITEM;
	public static final PdfName COLLECTIONSCHEMA;
	public static final PdfName COLLECTIONSORT;
	public static final PdfName COLLECTIONSUBITEM;
	public static final PdfName COLOR;
	public static final PdfName COLORANTS;
	public static final PdfName COLORS;
	public static final PdfName COLORSPACE;
	public static final PdfName COLORTRANSFORM;
	public static final PdfName COLSPAN;
	public static final PdfName COLUMN;
	public static final PdfName COLUMNS;
	public static final PdfName CONDITION;
	public static final PdfName CONFIGS;
	public static final PdfName CONFIGURATION;
	public static final PdfName CONFIGURATIONS;
	public static final PdfName CONTACTINFO;
	public static final PdfName CONTENT;
	public static final PdfName CONTENTS;
	public static final PdfName COORDS;
	public static final PdfName COUNT;
	public static final PdfName COURIER;
	public static final PdfName COURIER_BOLD;
	public static final PdfName COURIER_BOLDOBLIQUE;
	public static final PdfName COURIER_OBLIQUE;
	public static final PdfName CREATIONDATE;
	public static final PdfName CREATOR;
	public static final PdfName CREATORINFO;
	public static final PdfName CRL;
	public static final PdfName CRLS;
	public static final PdfName CROPBOX;
	public static final PdfName CRYPT;
	public static final PdfName CS;
	public static final PdfName CUEPOINT;
	public static final PdfName CUEPOINTS;
	public static final PdfName CYX;
	public static final PdfName D;
	public static final PdfName DA;
	public static final PdfName DATA;
	public static final PdfName DC;
	public static final PdfName DCS;
	public static final PdfName DCTDECODE;
	public static final PdfName DEACTIVATION;
	public static final PdfName DECIMAL;
	public static final PdfName DECODE;
	public static final PdfName DECODEPARMS;
	public static final PdfName DEFAULT;
	public static final PdfName DEFAULTCMYK;
	public static final PdfName DEFAULTCRYPTFILTER;
	public static final PdfName DEFAULTGRAY;
	public static final PdfName DEFAULTRGB;
	public static final PdfName DESC;
	public static final PdfName DESCENDANTFONTS;
	public static final PdfName DESCENT;
	public static final PdfName DEST;
	public static final PdfName DESTOUTPUTPROFILE;
	public static final PdfName DESTS;
	public static final PdfName DEVICECMYK;
	public static final PdfName DEVICEGRAY;
	public static final PdfName DEVICEN;
	public static final PdfName DEVICERGB;
	public static final PdfName DI;
	public static final PdfName DIFFERENCES;
	public static final PdfName DIRECTION;
	public static final PdfName DISPLAYDOCTITLE;
	public static final PdfName DISSOLVE;
	public static final PdfName DIV;
	public static final PdfName DL;
	public static final PdfName DM;
	public static final PdfName DOCMDP;
	public static final PdfName DOCOPEN;
	public static final PdfName DOCTIMESTAMP;
	public static final PdfName DOCUMENT;
	public static final PdfName DOMAIN;
	public static final PdfName DOS;
	public static final PdfName DP;
	public static final PdfName DR;
	public static final PdfName DS;
	public static final PdfName DSS;
	public static final PdfName DUPLEX;
	public static final PdfName DUPLEXFLIPLONGEDGE;
	public static final PdfName DUPLEXFLIPSHORTEDGE;
	public static final PdfName DUR;
	public static final PdfName DV;
	public static final PdfName DW;
	public static final PdfName E;
	public static final PdfName EARLYCHANGE;
	public static final PdfName EF;
	public static final PdfName EFF;
	public static final PdfName EFOPEN;
	public static final PdfName EMBEDDED;
	public static final PdfName EMBEDDEDFILE;
	public static final PdfName EMBEDDEDFILES;
	public static final PdfName ENCODE;
	public static final PdfName ENCODEDBYTEALIGN;
	public static final PdfName ENCODING;
	public static final PdfName ENCRYPT;
	public static final PdfName ENCRYPTMETADATA;
	public static final PdfName END;
	public static final PdfName ENDINDENT;
	public static final PdfName ENDOFBLOCK;
	public static final PdfName ENDOFLINE;
	public static final PdfName EPSG;
	public static final PdfName ESIC;
	public static final PdfName ETSI_CADES_DETACHED;
	public static final PdfName ETSI_RFC3161;
	public static final PdfName EVENT;
	public static final PdfName EXCLUDE;
	public static final PdfName EXPORT;
	public static final PdfName EXPORTSTATE;
	public static final PdfName EXTEND;
	public static final PdfName EXTENSIONLEVEL;
	public static final PdfName EXTENSIONS;
	public static final PdfName EXTGSTATE;
	public static final PdfName F;
	public static final PdfName FAR;
	public static final PdfName FB;
	public static final PdfName FD;
	public static final PdfName FDECODEPARMS;
	public static final PdfName FDF;
	public static final PdfName FF;
	public static final PdfName FFILTER;
	public static final PdfName FG;
	public static final PdfName FIELDMDP;
	public static final PdfName FIELDS;
	public static final PdfName FIGURE;
	public static final PdfName FILEATTACHMENT;
	public static final PdfName FILESPEC;
	public static final PdfName FILTER;
	public static final PdfName FIRST;
	public static final PdfName FIRSTCHAR;
	public static final PdfName FIRSTPAGE;
	public static final PdfName FIT;
	public static final PdfName FITB;
	public static final PdfName FITBH;
	public static final PdfName FITBV;
	public static final PdfName FITH;
	public static final PdfName FITR;
	public static final PdfName FITV;
	public static final PdfName FITWINDOW;
	public static final PdfName FL;
	public static final PdfName FLAGS;
	public static final PdfName FLASH;
	public static final PdfName FLASHVARS;
	public static final PdfName FLATEDECODE;
	public static final PdfName FO;
	public static final PdfName FONT;
	public static final PdfName FONTBBOX;
	public static final PdfName FONTDESCRIPTOR;
	public static final PdfName FONTFAMILY;
	public static final PdfName FONTFILE;
	public static final PdfName FONTFILE2;
	public static final PdfName FONTFILE3;
	public static final PdfName FONTMATRIX;
	public static final PdfName FONTNAME;
	public static final PdfName FONTWEIGHT;
	public static final PdfName FOREGROUND;
	public static final PdfName FORM;
	public static final PdfName FORMTYPE;
	public static final PdfName FORMULA;
	public static final PdfName FREETEXT;
	public static final PdfName FRM;
	public static final PdfName FS;
	public static final PdfName FT;
	public static final PdfName FULLSCREEN;
	public static final PdfName FUNCTION;
	public static final PdfName FUNCTIONS;
	public static final PdfName FUNCTIONTYPE;
	public static final PdfName GAMMA;
	public static final PdfName GBK;
	public static final PdfName GCS;
	public static final PdfName GEO;
	public static final PdfName GEOGCS;
	public static final PdfName GLITTER;
	public static final PdfName GOTO;
	public static final PdfName GOTO3DVIEW;
	public static final PdfName GOTOE;
	public static final PdfName GOTOR;
	public static final PdfName GPTS;
	public static final PdfName GROUP;
	public static final PdfName GTS_PDFA1;
	public static final PdfName GTS_PDFX;
	public static final PdfName GTS_PDFXVERSION;
	public static final PdfName H;
	public static final PdfName H1;
	public static final PdfName H2;
	public static final PdfName H3;
	public static final PdfName H4;
	public static final PdfName H5;
	public static final PdfName H6;
	public static final PdfName HALFTONENAME;
	public static final PdfName HALFTONETYPE;
	public static final PdfName HALIGN;
	public static final PdfName HEADERS;
	public static final PdfName HEIGHT;
	public static final PdfName HELV;
	public static final PdfName HELVETICA;
	public static final PdfName HELVETICA_BOLD;
	public static final PdfName HELVETICA_BOLDOBLIQUE;
	public static final PdfName HELVETICA_OBLIQUE;
	public static final PdfName HF;
	public static final PdfName HID;
	public static final PdfName HIDE;
	public static final PdfName HIDEMENUBAR;
	public static final PdfName HIDETOOLBAR;
	public static final PdfName HIDEWINDOWUI;
	public static final PdfName HIGHLIGHT;
	public static final PdfName HOFFSET;
	public static final PdfName HT;
	public static final PdfName HTP;
	public static final PdfName I;
	public static final PdfName IC;
	public static final PdfName ICCBASED;
	public static final PdfName ID;
	public static final PdfName IDENTITY;
	public static final PdfName IDTREE;
	public static final PdfName IF;
	public static final PdfName IM;
	public static final PdfName IMAGE;
	public static final PdfName IMAGEB;
	public static final PdfName IMAGEC;
	public static final PdfName IMAGEI;
	public static final PdfName IMAGEMASK;
	public static final PdfName IMPORTDATA;
	public static final PdfName INCLUDE;
	public static final PdfName IND;
	public static final PdfName INDEX;
	public static final PdfName INDEXED;
	public static final PdfName INFO;
	public static final PdfName INK;
	public static final PdfName INKLIST;
	public static final PdfName INSTANCES;
	public static final PdfName INTENT;
	public static final PdfName INTERPOLATE;
	public static final PdfName IRT;
	public static final PdfName ISMAP;
	public static final PdfName ITALICANGLE;
	public static final PdfName ITXT;
	public static final PdfName IX;
	public static final PdfName JAVASCRIPT;
	public static final PdfName JBIG2DECODE;
	public static final PdfName JBIG2GLOBALS;
	public static final PdfName JPXDECODE;
	public static final PdfName JS;
	public static final PdfName JUSTIFY;
	public static final PdfName K;
	public static final PdfName KEYWORDS;
	public static final PdfName KIDS;
	public static final PdfName L;
	public static final PdfName L2R;
	public static final PdfName LAB;
	public static final PdfName LANG;
	public static final PdfName LANGUAGE;
	public static final PdfName LAST;
	public static final PdfName LASTCHAR;
	public static final PdfName LASTPAGE;
	public static final PdfName LAUNCH;
	public static final PdfName LAYOUT;
	public static final PdfName LBL;
	public static final PdfName LBODY;
	public static final PdfName LENGTH;
	public static final PdfName LENGTH1;
	public static final PdfName LI;
	public static final PdfName LIMITS;
	public static final PdfName LINE;
	public static final PdfName LINEAR;
	public static final PdfName LINEHEIGHT;
	public static final PdfName LINK;
	public static final PdfName LIST;
	public static final PdfName LISTMODE;
	public static final PdfName LISTNUMBERING;
	public static final PdfName LOCATION;
	public static final PdfName LOCK;
	public static final PdfName LOCKED;
	public static final PdfName LOWERALPHA;
	public static final PdfName LOWERROMAN;
	public static final PdfName LPTS;
	public static final PdfName LZWDECODE;
	public static final PdfName M;
	public static final PdfName MAC;
	public static final PdfName MAC_EXPERT_ENCODING;
	public static final PdfName MAC_ROMAN_ENCODING;
	public static final PdfName MARKED;
	public static final PdfName MARKINFO;
	public static final PdfName MASK;
	public static final PdfName MATERIAL;
	public static final PdfName MATRIX;
	public static final PdfName MAXLEN;
	public static final PdfName MAX_CAMEL_CASE;
	public static final PdfName MAX_LOWER_CASE;
	public static final PdfName MCID;
	public static final PdfName MCR;
	public static final PdfName MEASURE;
	public static final PdfName MEDIABOX;
	public static final PdfName METADATA;
	public static final PdfName MIN_CAMEL_CASE;
	public static final PdfName MIN_LOWER_CASE;
	public static final PdfName MK;
	public static final PdfName MMTYPE1;
	public static final PdfName MODDATE;
	public static final PdfName MOVIE;
	public static final PdfName N;
	public static final PdfName N0;
	public static final PdfName N1;
	public static final PdfName N2;
	public static final PdfName N3;
	public static final PdfName N4;
	public static final PdfName NAME;
	public static final PdfName NAMED;
	public static final PdfName NAMES;
	public static final PdfName NAVIGATION;
	public static final PdfName NAVIGATIONPANE;
	public static final PdfName NCHANNEL;
	public static final PdfName NEAR;
	public static final PdfName NEEDAPPEARANCES;
	public static final PdfName NEEDRENDERING;
	public static final PdfName NEWWINDOW;
	public static final PdfName NEXT;
	public static final PdfName NEXTPAGE;
	public static final PdfName NM;
	public static final PdfName NONE;
	public static final PdfName NONFULLSCREENPAGEMODE;
	public static final PdfName NONSTRUCT;
	public static final PdfName NOT;
	public static final PdfName NOTE;
	public static final PdfName NUMBERFORMAT;
	public static final PdfName NUMCOPIES;
	public static final PdfName NUMS;
	public static final PdfName O;
	public static final PdfName OBJ;
	public static final PdfName OBJR;
	public static final PdfName OBJSTM;
	public static final PdfName OC;
	public static final PdfName OCG;
	public static final PdfName OCGS;
	public static final PdfName OCMD;
	public static final PdfName OCPROPERTIES;
	public static final PdfName OCSP;
	public static final PdfName OCSPS;
	public static final PdfName OE;
	public static final PdfName OFF;
	public static final PdfName ON;
	public static final PdfName ONECOLUMN;
	public static final PdfName OP;
	public static final PdfName OPEN;
	public static final PdfName OPENACTION;
	public static final PdfName OPI;
	public static final PdfName OPM;
	public static final PdfName OPT;
	public static final PdfName OR;
	public static final PdfName ORDER;
	public static final PdfName ORDERING;
	public static final PdfName ORG;
	public static final PdfName OSCILLATING;
	public static final PdfName OUTLINES;
	public static final PdfName OUTPUTCONDITION;
	public static final PdfName OUTPUTCONDITIONIDENTIFIER;
	public static final PdfName OUTPUTINTENT;
	public static final PdfName OUTPUTINTENTS;
	public static final PdfName OVERLAYTEXT;
	public static final PdfName Off;
	public static final PdfName P;
	public static final PdfName PAGE;
	public static final PdfName PAGEELEMENT;
	public static final PdfName PAGELABELS;
	public static final PdfName PAGELAYOUT;
	public static final PdfName PAGEMODE;
	public static final PdfName PAGES;
	public static final PdfName PAINTTYPE;
	public static final PdfName PANOSE;
	public static final PdfName PARAMS;
	public static final PdfName PARENT;
	public static final PdfName PARENTTREE;
	public static final PdfName PARENTTREENEXTKEY;
	public static final PdfName PART;
	public static final PdfName PASSCONTEXTCLICK;
	public static final PdfName PATTERN;
	public static final PdfName PATTERNTYPE;
	public static final PdfName PB;
	public static final PdfName PC;
	public static final PdfName PDF;
	public static final PdfName PDFDOCENCODING;
	public static final PdfName PDU;
	public static final PdfName PERCEPTUAL;
	public static final PdfName PERMS;
	public static final PdfName PG;
	public static final PdfName PI;
	public static final PdfName PICKTRAYBYPDFSIZE;
	public static final PdfName PIECEINFO;
	public static final PdfName PLAYCOUNT;
	public static final PdfName PO;
	public static final PdfName POLYGON;
	public static final PdfName POLYLINE;
	public static final PdfName POPUP;
	public static final PdfName POSITION;
	public static final PdfName PREDICTOR;
	public static final PdfName PREFERRED;
	public static final PdfName PRESENTATION;
	public static final PdfName PRESERVERB;
	public static final PdfName PRESSTEPS;
	public static final PdfName PREV;
	public static final PdfName PREVPAGE;
	public static final PdfName PRINT;
	public static final PdfName PRINTAREA;
	public static final PdfName PRINTCLIP;
	public static final PdfName PRINTERMARK;
	public static final PdfName PRINTFIELD;
	public static final PdfName PRINTPAGERANGE;
	public static final PdfName PRINTSCALING;
	public static final PdfName PRINTSTATE;
	public static final PdfName PRIVATE;
	public static final PdfName PROCSET;
	public static final PdfName PRODUCER;
	public static final PdfName PROJCS;
	public static final PdfName PROPERTIES;
	public static final PdfName PROP_BUILD;
	public static final PdfName PS;
	public static final PdfName PTDATA;
	public static final PdfName PUBSEC;
	public static final PdfName PV;
	public static final PdfName Q;
	public static final PdfName QUADPOINTS;
	public static final PdfName QUOTE;
	public static final PdfName R;
	public static final PdfName R2L;
	public static final PdfName RANGE;
	public static final PdfName RB;
	public static final PdfName RBGROUPS;
	public static final PdfName RC;
	public static final PdfName RD;
	public static final PdfName REASON;
	public static final PdfName RECIPIENTS;
	public static final PdfName RECT;
	public static final PdfName REDACT;
	public static final PdfName REFERENCE;
	public static final PdfName REGISTRY;
	public static final PdfName REGISTRYNAME;
	public static final PdfName RELATIVECOLORIMETRIC;
	public static final PdfName RENDITION;
	public static final PdfName REPEAT;
	public static final PdfName REQUIREMENTS;
	public static final PdfName RESETFORM;
	public static final PdfName RESOURCES;
	public static final PdfName REVERSEDCHARS;
	public static final PdfName RI;
	public static final PdfName RICHMEDIA;
	public static final PdfName RICHMEDIAACTIVATION;
	public static final PdfName RICHMEDIAANIMATION;
	public static final PdfName RICHMEDIACOMMAND;
	public static final PdfName RICHMEDIACONFIGURATION;
	public static final PdfName RICHMEDIACONTENT;
	public static final PdfName RICHMEDIADEACTIVATION;
	public static final PdfName RICHMEDIAEXECUTE;
	public static final PdfName RICHMEDIAINSTANCE;
	public static final PdfName RICHMEDIAPARAMS;
	public static final PdfName RICHMEDIAPOSITION;
	public static final PdfName RICHMEDIAPRESENTATION;
	public static final PdfName RICHMEDIASETTINGS;
	public static final PdfName RICHMEDIAWINDOW;
	public static final PdfName RL;
	public static final PdfName RO;
	public static final PdfName ROLE;
	public static final PdfName ROLEMAP;
	public static final PdfName ROOT;
	public static final PdfName ROTATE;
	public static final PdfName ROW;
	public static final PdfName ROWS;
	public static final PdfName ROWSPAN;
	public static final PdfName RP;
	public static final PdfName RT;
	public static final PdfName RUBY;
	public static final PdfName RUNLENGTHDECODE;
	public static final PdfName RV;
	public static final PdfName S;
	public static final PdfName SATURATION;
	public static final PdfName SCHEMA;
	public static final PdfName SCOPE;
	public static final PdfName SCREEN;
	public static final PdfName SCRIPTS;
	public static final PdfName SECT;
	public static final PdfName SEPARATION;
	public static final PdfName SETOCGSTATE;
	public static final PdfName SETTINGS;
	public static final PdfName SHADING;
	public static final PdfName SHADINGTYPE;
	public static final PdfName SHIFT_JIS;
	public static final PdfName SIG;
	public static final PdfName SIGFIELDLOCK;
	public static final PdfName SIGFLAGS;
	public static final PdfName SIGREF;
	public static final PdfName SIMPLEX;
	public static final PdfName SINGLEPAGE;
	public static final PdfName SIZE;
	public static final PdfName SMASK;
	public static final PdfName SMASKINDATA;
	public static final PdfName SORT;
	public static final PdfName SOUND;
	public static final PdfName SPACEAFTER;
	public static final PdfName SPACEBEFORE;
	public static final PdfName SPAN;
	public static final PdfName SPEED;
	public static final PdfName SPLIT;
	public static final PdfName SQUARE;
	public static final PdfName SQUIGGLY;
	public static final PdfName SS;
	public static final PdfName ST;
	public static final PdfName STAMP;
	public static final PdfName STANDARD;
	public static final PdfName START;
	public static final PdfName STARTINDENT;
	public static final PdfName STATE;
	public static final PdfName STATUS;
	public static final PdfName STDCF;
	public static final PdfName STEMV;
	public static final PdfName STMF;
	public static final PdfName STRF;
	public static final PdfName STRIKEOUT;
	public static final PdfName STRUCTELEM;
	public static final PdfName STRUCTPARENT;
	public static final PdfName STRUCTPARENTS;
	public static final PdfName STRUCTTREEROOT;
	public static final PdfName STYLE;
	public static final PdfName SUBFILTER;
	public static final PdfName SUBJECT;
	public static final PdfName SUBMITFORM;
	public static final PdfName SUBTYPE;
	public static final PdfName SUMMARY;
	public static final PdfName SUPPLEMENT;
	public static final PdfName SV;
	public static final PdfName SW;
	public static final PdfName SYMBOL;
	public static final PdfName T;
	public static final PdfName TA;
	public static final PdfName TABLE;
	public static final PdfName TABLEROW;
	public static final PdfName TABS;
	public static final PdfName TBODY;
	public static final PdfName TD;
	public static final PdfName TEXT;
	public static final PdfName TEXTALIGN;
	public static final PdfName TEXTDECORATIONCOLOR;
	public static final PdfName TEXTDECORATIONTHICKNESS;
	public static final PdfName TEXTDECORATIONTYPE;
	public static final PdfName TEXTINDENT;
	public static final PdfName TFOOT;
	public static final PdfName TH;
	public static final PdfName THEAD;
	public static final PdfName THREADS;
	public static final PdfName THUMB;
	public static final PdfName TI;
	public static final PdfName TILINGTYPE;
	public static final PdfName TIME;
	public static final PdfName TIMES_BOLD;
	public static final PdfName TIMES_BOLDITALIC;
	public static final PdfName TIMES_ITALIC;
	public static final PdfName TIMES_ROMAN;
	public static final PdfName TITLE;
	public static final PdfName TK;
	public static final PdfName TM;
	public static final PdfName TOC;
	public static final PdfName TOCI;
	public static final PdfName TOGGLE;
	public static final PdfName TOOLBAR;
	public static final PdfName TOUNICODE;
	public static final PdfName TP;
	public static final PdfName TR;
	public static final PdfName TR2;
	public static final PdfName TRANS;
	public static final PdfName TRANSFORMMETHOD;
	public static final PdfName TRANSFORMPARAMS;
	public static final PdfName TRANSPARENCY;
	public static final PdfName TRANSPARENT;
	public static final PdfName TRAPNET;
	public static final PdfName TRAPPED;
	public static final PdfName TRIMBOX;
	public static final PdfName TRUETYPE;
	public static final PdfName TS;
	public static final PdfName TTL;
	public static final PdfName TU;
	public static final PdfName TV;
	public static final PdfName TWOCOLUMNLEFT;
	public static final PdfName TWOCOLUMNRIGHT;
	public static final PdfName TWOPAGELEFT;
	public static final PdfName TWOPAGERIGHT;
	public static final PdfName TX;
	public static final PdfName TYPE;
	public static final PdfName TYPE0;
	public static final PdfName TYPE1;
	public static final PdfName TYPE3;
	public static final PdfName U;
	public static final PdfName UE;
	public static final PdfName UF;
	public static final PdfName UHC;
	public static final PdfName UNDERLINE;
	public static final PdfName UNIX;
	public static final PdfName UPPERALPHA;
	public static final PdfName UPPERROMAN;
	public static final PdfName UR;
	public static final PdfName UR3;
	public static final PdfName URI;
	public static final PdfName URL;
	public static final PdfName USAGE;
	public static final PdfName USEATTACHMENTS;
	public static final PdfName USENONE;
	public static final PdfName USEOC;
	public static final PdfName USEOUTLINES;
	public static final PdfName USER;
	public static final PdfName USERPROPERTIES;
	public static final PdfName USERUNIT;
	public static final PdfName USETHUMBS;
	public static final PdfName UTF_8;
	public static final PdfName V;
	public static final PdfName V2;
	public static final PdfName VALIGN;
	public static final PdfName VE;
	public static final PdfName VERISIGN_PPKVS;
	public static final PdfName VERSION;
	public static final PdfName VERTICES;
	public static final PdfName VIDEO;
	public static final PdfName VIEW;
	public static final PdfName VIEWAREA;
	public static final PdfName VIEWCLIP;
	public static final PdfName VIEWERPREFERENCES;
	public static final PdfName VIEWPORT;
	public static final PdfName VIEWS;
	public static final PdfName VIEWSTATE;
	public static final PdfName VISIBLEPAGES;
	public static final PdfName VOFFSET;
	public static final PdfName VP;
	public static final PdfName VRI;
	public static final PdfName W;
	public static final PdfName W2;
	public static final PdfName WARICHU;
	public static final PdfName WATERMARK;
	public static final PdfName WC;
	public static final PdfName WHITEPOINT;
	public static final PdfName WIDGET;
	public static final PdfName WIDTH;
	public static final PdfName WIDTHS;
	public static final PdfName WIN;
	public static final PdfName WINDOW;
	public static final PdfName WINDOWED;
	public static final PdfName WIN_ANSI_ENCODING;
	public static final PdfName WIPE;
	public static final PdfName WKT;
	public static final PdfName WP;
	public static final PdfName WS;
	public static final PdfName WT;
	public static final PdfName X;
	public static final PdfName XA;
	public static final PdfName XD;
	public static final PdfName XFA;
	public static final PdfName XML;
	public static final PdfName XOBJECT;
	public static final PdfName XPTS;
	public static final PdfName XREF;
	public static final PdfName XREFSTM;
	public static final PdfName XSTEP;
	public static final PdfName XYZ;
	public static final PdfName YSTEP;
	public static final PdfName ZADB;
	public static final PdfName ZAPFDINGBATS;
	public static final PdfName ZOOM;
	public static final PdfName _3D;
	public static final PdfName ca;
	public static final PdfName op;
	public static final PdfName rb;
	public static Map staticNames;
	private int hash;

	static 
	{
		int i;
		Field afield[];
		_3D = new PdfName("3D");
	//    0    0:new             #2   <Class PdfName>
	//    1    3:dup             
	//    2    4:ldc2            #799 <String "3D">
	//    3    7:invokespecial   #803 <Method void PdfName(String)>
	//    4   10:putstatic       #805 <Field PdfName _3D>
		A = new PdfName("A");
	//    5   13:new             #2   <Class PdfName>
	//    6   16:dup             
	//    7   17:ldc2            #806 <String "A">
	//    8   20:invokespecial   #803 <Method void PdfName(String)>
	//    9   23:putstatic       #808 <Field PdfName A>
		A85 = new PdfName("A85");
	//   10   26:new             #2   <Class PdfName>
	//   11   29:dup             
	//   12   30:ldc2            #809 <String "A85">
	//   13   33:invokespecial   #803 <Method void PdfName(String)>
	//   14   36:putstatic       #811 <Field PdfName A85>
		AA = new PdfName("AA");
	//   15   39:new             #2   <Class PdfName>
	//   16   42:dup             
	//   17   43:ldc2            #812 <String "AA">
	//   18   46:invokespecial   #803 <Method void PdfName(String)>
	//   19   49:putstatic       #814 <Field PdfName AA>
		ABSOLUTECOLORIMETRIC = new PdfName("AbsoluteColorimetric");
	//   20   52:new             #2   <Class PdfName>
	//   21   55:dup             
	//   22   56:ldc2            #816 <String "AbsoluteColorimetric">
	//   23   59:invokespecial   #803 <Method void PdfName(String)>
	//   24   62:putstatic       #818 <Field PdfName ABSOLUTECOLORIMETRIC>
		AC = new PdfName("AC");
	//   25   65:new             #2   <Class PdfName>
	//   26   68:dup             
	//   27   69:ldc2            #819 <String "AC">
	//   28   72:invokespecial   #803 <Method void PdfName(String)>
	//   29   75:putstatic       #821 <Field PdfName AC>
		ACROFORM = new PdfName("AcroForm");
	//   30   78:new             #2   <Class PdfName>
	//   31   81:dup             
	//   32   82:ldc2            #823 <String "AcroForm">
	//   33   85:invokespecial   #803 <Method void PdfName(String)>
	//   34   88:putstatic       #825 <Field PdfName ACROFORM>
		ACTION = new PdfName("Action");
	//   35   91:new             #2   <Class PdfName>
	//   36   94:dup             
	//   37   95:ldc2            #827 <String "Action">
	//   38   98:invokespecial   #803 <Method void PdfName(String)>
	//   39  101:putstatic       #829 <Field PdfName ACTION>
		ACTIVATION = new PdfName("Activation");
	//   40  104:new             #2   <Class PdfName>
	//   41  107:dup             
	//   42  108:ldc2            #831 <String "Activation">
	//   43  111:invokespecial   #803 <Method void PdfName(String)>
	//   44  114:putstatic       #833 <Field PdfName ACTIVATION>
		ADBE = new PdfName("ADBE");
	//   45  117:new             #2   <Class PdfName>
	//   46  120:dup             
	//   47  121:ldc2            #834 <String "ADBE">
	//   48  124:invokespecial   #803 <Method void PdfName(String)>
	//   49  127:putstatic       #836 <Field PdfName ADBE>
		ACTUALTEXT = new PdfName("ActualText");
	//   50  130:new             #2   <Class PdfName>
	//   51  133:dup             
	//   52  134:ldc2            #838 <String "ActualText">
	//   53  137:invokespecial   #803 <Method void PdfName(String)>
	//   54  140:putstatic       #840 <Field PdfName ACTUALTEXT>
		ADBE_PKCS7_DETACHED = new PdfName("adbe.pkcs7.detached");
	//   55  143:new             #2   <Class PdfName>
	//   56  146:dup             
	//   57  147:ldc2            #842 <String "adbe.pkcs7.detached">
	//   58  150:invokespecial   #803 <Method void PdfName(String)>
	//   59  153:putstatic       #844 <Field PdfName ADBE_PKCS7_DETACHED>
		ADBE_PKCS7_S4 = new PdfName("adbe.pkcs7.s4");
	//   60  156:new             #2   <Class PdfName>
	//   61  159:dup             
	//   62  160:ldc2            #846 <String "adbe.pkcs7.s4">
	//   63  163:invokespecial   #803 <Method void PdfName(String)>
	//   64  166:putstatic       #848 <Field PdfName ADBE_PKCS7_S4>
		ADBE_PKCS7_S5 = new PdfName("adbe.pkcs7.s5");
	//   65  169:new             #2   <Class PdfName>
	//   66  172:dup             
	//   67  173:ldc2            #850 <String "adbe.pkcs7.s5">
	//   68  176:invokespecial   #803 <Method void PdfName(String)>
	//   69  179:putstatic       #852 <Field PdfName ADBE_PKCS7_S5>
		ADBE_PKCS7_SHA1 = new PdfName("adbe.pkcs7.sha1");
	//   70  182:new             #2   <Class PdfName>
	//   71  185:dup             
	//   72  186:ldc2            #854 <String "adbe.pkcs7.sha1">
	//   73  189:invokespecial   #803 <Method void PdfName(String)>
	//   74  192:putstatic       #856 <Field PdfName ADBE_PKCS7_SHA1>
		ADBE_X509_RSA_SHA1 = new PdfName("adbe.x509.rsa_sha1");
	//   75  195:new             #2   <Class PdfName>
	//   76  198:dup             
	//   77  199:ldc2            #858 <String "adbe.x509.rsa_sha1">
	//   78  202:invokespecial   #803 <Method void PdfName(String)>
	//   79  205:putstatic       #860 <Field PdfName ADBE_X509_RSA_SHA1>
		ADOBE_PPKLITE = new PdfName("Adobe.PPKLite");
	//   80  208:new             #2   <Class PdfName>
	//   81  211:dup             
	//   82  212:ldc2            #862 <String "Adobe.PPKLite">
	//   83  215:invokespecial   #803 <Method void PdfName(String)>
	//   84  218:putstatic       #864 <Field PdfName ADOBE_PPKLITE>
		ADOBE_PPKMS = new PdfName("Adobe.PPKMS");
	//   85  221:new             #2   <Class PdfName>
	//   86  224:dup             
	//   87  225:ldc2            #866 <String "Adobe.PPKMS">
	//   88  228:invokespecial   #803 <Method void PdfName(String)>
	//   89  231:putstatic       #868 <Field PdfName ADOBE_PPKMS>
		AESV2 = new PdfName("AESV2");
	//   90  234:new             #2   <Class PdfName>
	//   91  237:dup             
	//   92  238:ldc2            #869 <String "AESV2">
	//   93  241:invokespecial   #803 <Method void PdfName(String)>
	//   94  244:putstatic       #871 <Field PdfName AESV2>
		AESV3 = new PdfName("AESV3");
	//   95  247:new             #2   <Class PdfName>
	//   96  250:dup             
	//   97  251:ldc2            #872 <String "AESV3">
	//   98  254:invokespecial   #803 <Method void PdfName(String)>
	//   99  257:putstatic       #874 <Field PdfName AESV3>
		AF = new PdfName("AF");
	//  100  260:new             #2   <Class PdfName>
	//  101  263:dup             
	//  102  264:ldc2            #875 <String "AF">
	//  103  267:invokespecial   #803 <Method void PdfName(String)>
	//  104  270:putstatic       #877 <Field PdfName AF>
		AFRELATIONSHIP = new PdfName("AFRelationship");
	//  105  273:new             #2   <Class PdfName>
	//  106  276:dup             
	//  107  277:ldc2            #879 <String "AFRelationship">
	//  108  280:invokespecial   #803 <Method void PdfName(String)>
	//  109  283:putstatic       #881 <Field PdfName AFRELATIONSHIP>
		AHX = new PdfName("AHx");
	//  110  286:new             #2   <Class PdfName>
	//  111  289:dup             
	//  112  290:ldc2            #883 <String "AHx">
	//  113  293:invokespecial   #803 <Method void PdfName(String)>
	//  114  296:putstatic       #885 <Field PdfName AHX>
		AIS = new PdfName("AIS");
	//  115  299:new             #2   <Class PdfName>
	//  116  302:dup             
	//  117  303:ldc2            #886 <String "AIS">
	//  118  306:invokespecial   #803 <Method void PdfName(String)>
	//  119  309:putstatic       #888 <Field PdfName AIS>
		ALL = new PdfName("All");
	//  120  312:new             #2   <Class PdfName>
	//  121  315:dup             
	//  122  316:ldc2            #890 <String "All">
	//  123  319:invokespecial   #803 <Method void PdfName(String)>
	//  124  322:putstatic       #892 <Field PdfName ALL>
		ALLPAGES = new PdfName("AllPages");
	//  125  325:new             #2   <Class PdfName>
	//  126  328:dup             
	//  127  329:ldc2            #894 <String "AllPages">
	//  128  332:invokespecial   #803 <Method void PdfName(String)>
	//  129  335:putstatic       #896 <Field PdfName ALLPAGES>
		ALT = new PdfName("Alt");
	//  130  338:new             #2   <Class PdfName>
	//  131  341:dup             
	//  132  342:ldc2            #898 <String "Alt">
	//  133  345:invokespecial   #803 <Method void PdfName(String)>
	//  134  348:putstatic       #900 <Field PdfName ALT>
		ALTERNATE = new PdfName("Alternate");
	//  135  351:new             #2   <Class PdfName>
	//  136  354:dup             
	//  137  355:ldc2            #902 <String "Alternate">
	//  138  358:invokespecial   #803 <Method void PdfName(String)>
	//  139  361:putstatic       #904 <Field PdfName ALTERNATE>
		ALTERNATEPRESENTATION = new PdfName("AlternatePresentations");
	//  140  364:new             #2   <Class PdfName>
	//  141  367:dup             
	//  142  368:ldc2            #906 <String "AlternatePresentations">
	//  143  371:invokespecial   #803 <Method void PdfName(String)>
	//  144  374:putstatic       #908 <Field PdfName ALTERNATEPRESENTATION>
		ALTERNATES = new PdfName("Alternates");
	//  145  377:new             #2   <Class PdfName>
	//  146  380:dup             
	//  147  381:ldc2            #910 <String "Alternates">
	//  148  384:invokespecial   #803 <Method void PdfName(String)>
	//  149  387:putstatic       #912 <Field PdfName ALTERNATES>
		AND = new PdfName("And");
	//  150  390:new             #2   <Class PdfName>
	//  151  393:dup             
	//  152  394:ldc2            #914 <String "And">
	//  153  397:invokespecial   #803 <Method void PdfName(String)>
	//  154  400:putstatic       #916 <Field PdfName AND>
		ANIMATION = new PdfName("Animation");
	//  155  403:new             #2   <Class PdfName>
	//  156  406:dup             
	//  157  407:ldc2            #918 <String "Animation">
	//  158  410:invokespecial   #803 <Method void PdfName(String)>
	//  159  413:putstatic       #920 <Field PdfName ANIMATION>
		ANNOT = new PdfName("Annot");
	//  160  416:new             #2   <Class PdfName>
	//  161  419:dup             
	//  162  420:ldc2            #922 <String "Annot">
	//  163  423:invokespecial   #803 <Method void PdfName(String)>
	//  164  426:putstatic       #924 <Field PdfName ANNOT>
		ANNOTS = new PdfName("Annots");
	//  165  429:new             #2   <Class PdfName>
	//  166  432:dup             
	//  167  433:ldc2            #926 <String "Annots">
	//  168  436:invokespecial   #803 <Method void PdfName(String)>
	//  169  439:putstatic       #928 <Field PdfName ANNOTS>
		ANTIALIAS = new PdfName("AntiAlias");
	//  170  442:new             #2   <Class PdfName>
	//  171  445:dup             
	//  172  446:ldc2            #930 <String "AntiAlias">
	//  173  449:invokespecial   #803 <Method void PdfName(String)>
	//  174  452:putstatic       #932 <Field PdfName ANTIALIAS>
		AP = new PdfName("AP");
	//  175  455:new             #2   <Class PdfName>
	//  176  458:dup             
	//  177  459:ldc2            #933 <String "AP">
	//  178  462:invokespecial   #803 <Method void PdfName(String)>
	//  179  465:putstatic       #935 <Field PdfName AP>
		APP = new PdfName("App");
	//  180  468:new             #2   <Class PdfName>
	//  181  471:dup             
	//  182  472:ldc2            #937 <String "App">
	//  183  475:invokespecial   #803 <Method void PdfName(String)>
	//  184  478:putstatic       #939 <Field PdfName APP>
		APPDEFAULT = new PdfName("AppDefault");
	//  185  481:new             #2   <Class PdfName>
	//  186  484:dup             
	//  187  485:ldc2            #941 <String "AppDefault">
	//  188  488:invokespecial   #803 <Method void PdfName(String)>
	//  189  491:putstatic       #943 <Field PdfName APPDEFAULT>
		ART = new PdfName("Art");
	//  190  494:new             #2   <Class PdfName>
	//  191  497:dup             
	//  192  498:ldc2            #945 <String "Art">
	//  193  501:invokespecial   #803 <Method void PdfName(String)>
	//  194  504:putstatic       #947 <Field PdfName ART>
		ARTBOX = new PdfName("ArtBox");
	//  195  507:new             #2   <Class PdfName>
	//  196  510:dup             
	//  197  511:ldc2            #949 <String "ArtBox">
	//  198  514:invokespecial   #803 <Method void PdfName(String)>
	//  199  517:putstatic       #951 <Field PdfName ARTBOX>
		ARTIFACT = new PdfName("Artifact");
	//  200  520:new             #2   <Class PdfName>
	//  201  523:dup             
	//  202  524:ldc2            #953 <String "Artifact">
	//  203  527:invokespecial   #803 <Method void PdfName(String)>
	//  204  530:putstatic       #955 <Field PdfName ARTIFACT>
		ASCENT = new PdfName("Ascent");
	//  205  533:new             #2   <Class PdfName>
	//  206  536:dup             
	//  207  537:ldc2            #957 <String "Ascent">
	//  208  540:invokespecial   #803 <Method void PdfName(String)>
	//  209  543:putstatic       #959 <Field PdfName ASCENT>
		AS = new PdfName("AS");
	//  210  546:new             #2   <Class PdfName>
	//  211  549:dup             
	//  212  550:ldc2            #960 <String "AS">
	//  213  553:invokespecial   #803 <Method void PdfName(String)>
	//  214  556:putstatic       #962 <Field PdfName AS>
		ASCII85DECODE = new PdfName("ASCII85Decode");
	//  215  559:new             #2   <Class PdfName>
	//  216  562:dup             
	//  217  563:ldc2            #964 <String "ASCII85Decode">
	//  218  566:invokespecial   #803 <Method void PdfName(String)>
	//  219  569:putstatic       #966 <Field PdfName ASCII85DECODE>
		ASCIIHEXDECODE = new PdfName("ASCIIHexDecode");
	//  220  572:new             #2   <Class PdfName>
	//  221  575:dup             
	//  222  576:ldc2            #968 <String "ASCIIHexDecode">
	//  223  579:invokespecial   #803 <Method void PdfName(String)>
	//  224  582:putstatic       #970 <Field PdfName ASCIIHEXDECODE>
		ASSET = new PdfName("Asset");
	//  225  585:new             #2   <Class PdfName>
	//  226  588:dup             
	//  227  589:ldc2            #972 <String "Asset">
	//  228  592:invokespecial   #803 <Method void PdfName(String)>
	//  229  595:putstatic       #974 <Field PdfName ASSET>
		ASSETS = new PdfName("Assets");
	//  230  598:new             #2   <Class PdfName>
	//  231  601:dup             
	//  232  602:ldc2            #976 <String "Assets">
	//  233  605:invokespecial   #803 <Method void PdfName(String)>
	//  234  608:putstatic       #978 <Field PdfName ASSETS>
		ATTACHED = new PdfName("Attached");
	//  235  611:new             #2   <Class PdfName>
	//  236  614:dup             
	//  237  615:ldc2            #980 <String "Attached">
	//  238  618:invokespecial   #803 <Method void PdfName(String)>
	//  239  621:putstatic       #982 <Field PdfName ATTACHED>
		AUTHEVENT = new PdfName("AuthEvent");
	//  240  624:new             #2   <Class PdfName>
	//  241  627:dup             
	//  242  628:ldc2            #984 <String "AuthEvent">
	//  243  631:invokespecial   #803 <Method void PdfName(String)>
	//  244  634:putstatic       #986 <Field PdfName AUTHEVENT>
		AUTHOR = new PdfName("Author");
	//  245  637:new             #2   <Class PdfName>
	//  246  640:dup             
	//  247  641:ldc2            #988 <String "Author">
	//  248  644:invokespecial   #803 <Method void PdfName(String)>
	//  249  647:putstatic       #990 <Field PdfName AUTHOR>
		B = new PdfName("B");
	//  250  650:new             #2   <Class PdfName>
	//  251  653:dup             
	//  252  654:ldc2            #991 <String "B">
	//  253  657:invokespecial   #803 <Method void PdfName(String)>
	//  254  660:putstatic       #993 <Field PdfName B>
		BACKGROUND = new PdfName("Background");
	//  255  663:new             #2   <Class PdfName>
	//  256  666:dup             
	//  257  667:ldc2            #995 <String "Background">
	//  258  670:invokespecial   #803 <Method void PdfName(String)>
	//  259  673:putstatic       #997 <Field PdfName BACKGROUND>
		BACKGROUNDCOLOR = new PdfName("BackgroundColor");
	//  260  676:new             #2   <Class PdfName>
	//  261  679:dup             
	//  262  680:ldc2            #999 <String "BackgroundColor">
	//  263  683:invokespecial   #803 <Method void PdfName(String)>
	//  264  686:putstatic       #1001 <Field PdfName BACKGROUNDCOLOR>
		BASEENCODING = new PdfName("BaseEncoding");
	//  265  689:new             #2   <Class PdfName>
	//  266  692:dup             
	//  267  693:ldc2            #1003 <String "BaseEncoding">
	//  268  696:invokespecial   #803 <Method void PdfName(String)>
	//  269  699:putstatic       #1005 <Field PdfName BASEENCODING>
		BASEFONT = new PdfName("BaseFont");
	//  270  702:new             #2   <Class PdfName>
	//  271  705:dup             
	//  272  706:ldc2            #1007 <String "BaseFont">
	//  273  709:invokespecial   #803 <Method void PdfName(String)>
	//  274  712:putstatic       #1009 <Field PdfName BASEFONT>
		BASEVERSION = new PdfName("BaseVersion");
	//  275  715:new             #2   <Class PdfName>
	//  276  718:dup             
	//  277  719:ldc2            #1011 <String "BaseVersion">
	//  278  722:invokespecial   #803 <Method void PdfName(String)>
	//  279  725:putstatic       #1013 <Field PdfName BASEVERSION>
		BBOX = new PdfName("BBox");
	//  280  728:new             #2   <Class PdfName>
	//  281  731:dup             
	//  282  732:ldc2            #1015 <String "BBox">
	//  283  735:invokespecial   #803 <Method void PdfName(String)>
	//  284  738:putstatic       #1017 <Field PdfName BBOX>
		BC = new PdfName("BC");
	//  285  741:new             #2   <Class PdfName>
	//  286  744:dup             
	//  287  745:ldc2            #1018 <String "BC">
	//  288  748:invokespecial   #803 <Method void PdfName(String)>
	//  289  751:putstatic       #1020 <Field PdfName BC>
		BG = new PdfName("BG");
	//  290  754:new             #2   <Class PdfName>
	//  291  757:dup             
	//  292  758:ldc2            #1021 <String "BG">
	//  293  761:invokespecial   #803 <Method void PdfName(String)>
	//  294  764:putstatic       #1023 <Field PdfName BG>
		BIBENTRY = new PdfName("BibEntry");
	//  295  767:new             #2   <Class PdfName>
	//  296  770:dup             
	//  297  771:ldc2            #1025 <String "BibEntry">
	//  298  774:invokespecial   #803 <Method void PdfName(String)>
	//  299  777:putstatic       #1027 <Field PdfName BIBENTRY>
		BIGFIVE = new PdfName("BigFive");
	//  300  780:new             #2   <Class PdfName>
	//  301  783:dup             
	//  302  784:ldc2            #1029 <String "BigFive">
	//  303  787:invokespecial   #803 <Method void PdfName(String)>
	//  304  790:putstatic       #1031 <Field PdfName BIGFIVE>
		BINDING = new PdfName("Binding");
	//  305  793:new             #2   <Class PdfName>
	//  306  796:dup             
	//  307  797:ldc2            #1033 <String "Binding">
	//  308  800:invokespecial   #803 <Method void PdfName(String)>
	//  309  803:putstatic       #1035 <Field PdfName BINDING>
		BINDINGMATERIALNAME = new PdfName("BindingMaterialName");
	//  310  806:new             #2   <Class PdfName>
	//  311  809:dup             
	//  312  810:ldc2            #1037 <String "BindingMaterialName">
	//  313  813:invokespecial   #803 <Method void PdfName(String)>
	//  314  816:putstatic       #1039 <Field PdfName BINDINGMATERIALNAME>
		BITSPERCOMPONENT = new PdfName("BitsPerComponent");
	//  315  819:new             #2   <Class PdfName>
	//  316  822:dup             
	//  317  823:ldc2            #1041 <String "BitsPerComponent">
	//  318  826:invokespecial   #803 <Method void PdfName(String)>
	//  319  829:putstatic       #1043 <Field PdfName BITSPERCOMPONENT>
		BITSPERSAMPLE = new PdfName("BitsPerSample");
	//  320  832:new             #2   <Class PdfName>
	//  321  835:dup             
	//  322  836:ldc2            #1045 <String "BitsPerSample">
	//  323  839:invokespecial   #803 <Method void PdfName(String)>
	//  324  842:putstatic       #1047 <Field PdfName BITSPERSAMPLE>
		BL = new PdfName("Bl");
	//  325  845:new             #2   <Class PdfName>
	//  326  848:dup             
	//  327  849:ldc2            #1049 <String "Bl">
	//  328  852:invokespecial   #803 <Method void PdfName(String)>
	//  329  855:putstatic       #1051 <Field PdfName BL>
		BLACKIS1 = new PdfName("BlackIs1");
	//  330  858:new             #2   <Class PdfName>
	//  331  861:dup             
	//  332  862:ldc2            #1053 <String "BlackIs1">
	//  333  865:invokespecial   #803 <Method void PdfName(String)>
	//  334  868:putstatic       #1055 <Field PdfName BLACKIS1>
		BLACKPOINT = new PdfName("BlackPoint");
	//  335  871:new             #2   <Class PdfName>
	//  336  874:dup             
	//  337  875:ldc2            #1057 <String "BlackPoint">
	//  338  878:invokespecial   #803 <Method void PdfName(String)>
	//  339  881:putstatic       #1059 <Field PdfName BLACKPOINT>
		BLOCKQUOTE = new PdfName("BlockQuote");
	//  340  884:new             #2   <Class PdfName>
	//  341  887:dup             
	//  342  888:ldc2            #1061 <String "BlockQuote">
	//  343  891:invokespecial   #803 <Method void PdfName(String)>
	//  344  894:putstatic       #1063 <Field PdfName BLOCKQUOTE>
		BLEEDBOX = new PdfName("BleedBox");
	//  345  897:new             #2   <Class PdfName>
	//  346  900:dup             
	//  347  901:ldc2            #1065 <String "BleedBox">
	//  348  904:invokespecial   #803 <Method void PdfName(String)>
	//  349  907:putstatic       #1067 <Field PdfName BLEEDBOX>
		BLINDS = new PdfName("Blinds");
	//  350  910:new             #2   <Class PdfName>
	//  351  913:dup             
	//  352  914:ldc2            #1069 <String "Blinds">
	//  353  917:invokespecial   #803 <Method void PdfName(String)>
	//  354  920:putstatic       #1071 <Field PdfName BLINDS>
		BM = new PdfName("BM");
	//  355  923:new             #2   <Class PdfName>
	//  356  926:dup             
	//  357  927:ldc2            #1072 <String "BM">
	//  358  930:invokespecial   #803 <Method void PdfName(String)>
	//  359  933:putstatic       #1074 <Field PdfName BM>
		BORDER = new PdfName("Border");
	//  360  936:new             #2   <Class PdfName>
	//  361  939:dup             
	//  362  940:ldc2            #1076 <String "Border">
	//  363  943:invokespecial   #803 <Method void PdfName(String)>
	//  364  946:putstatic       #1078 <Field PdfName BORDER>
		BOTH = new PdfName("Both");
	//  365  949:new             #2   <Class PdfName>
	//  366  952:dup             
	//  367  953:ldc2            #1080 <String "Both">
	//  368  956:invokespecial   #803 <Method void PdfName(String)>
	//  369  959:putstatic       #1082 <Field PdfName BOTH>
		BOUNDS = new PdfName("Bounds");
	//  370  962:new             #2   <Class PdfName>
	//  371  965:dup             
	//  372  966:ldc2            #1084 <String "Bounds">
	//  373  969:invokespecial   #803 <Method void PdfName(String)>
	//  374  972:putstatic       #1086 <Field PdfName BOUNDS>
		BOX = new PdfName("Box");
	//  375  975:new             #2   <Class PdfName>
	//  376  978:dup             
	//  377  979:ldc2            #1088 <String "Box">
	//  378  982:invokespecial   #803 <Method void PdfName(String)>
	//  379  985:putstatic       #1090 <Field PdfName BOX>
		BS = new PdfName("BS");
	//  380  988:new             #2   <Class PdfName>
	//  381  991:dup             
	//  382  992:ldc2            #1091 <String "BS">
	//  383  995:invokespecial   #803 <Method void PdfName(String)>
	//  384  998:putstatic       #1093 <Field PdfName BS>
		BTN = new PdfName("Btn");
	//  385 1001:new             #2   <Class PdfName>
	//  386 1004:dup             
	//  387 1005:ldc2            #1095 <String "Btn">
	//  388 1008:invokespecial   #803 <Method void PdfName(String)>
	//  389 1011:putstatic       #1097 <Field PdfName BTN>
		BYTERANGE = new PdfName("ByteRange");
	//  390 1014:new             #2   <Class PdfName>
	//  391 1017:dup             
	//  392 1018:ldc2            #1099 <String "ByteRange">
	//  393 1021:invokespecial   #803 <Method void PdfName(String)>
	//  394 1024:putstatic       #1101 <Field PdfName BYTERANGE>
		C = new PdfName("C");
	//  395 1027:new             #2   <Class PdfName>
	//  396 1030:dup             
	//  397 1031:ldc2            #1102 <String "C">
	//  398 1034:invokespecial   #803 <Method void PdfName(String)>
	//  399 1037:putstatic       #1104 <Field PdfName C>
		C0 = new PdfName("C0");
	//  400 1040:new             #2   <Class PdfName>
	//  401 1043:dup             
	//  402 1044:ldc2            #1105 <String "C0">
	//  403 1047:invokespecial   #803 <Method void PdfName(String)>
	//  404 1050:putstatic       #1107 <Field PdfName C0>
		C1 = new PdfName("C1");
	//  405 1053:new             #2   <Class PdfName>
	//  406 1056:dup             
	//  407 1057:ldc2            #1108 <String "C1">
	//  408 1060:invokespecial   #803 <Method void PdfName(String)>
	//  409 1063:putstatic       #1110 <Field PdfName C1>
		CA = new PdfName("CA");
	//  410 1066:new             #2   <Class PdfName>
	//  411 1069:dup             
	//  412 1070:ldc2            #1111 <String "CA">
	//  413 1073:invokespecial   #803 <Method void PdfName(String)>
	//  414 1076:putstatic       #1113 <Field PdfName CA>
		ca = new PdfName("ca");
	//  415 1079:new             #2   <Class PdfName>
	//  416 1082:dup             
	//  417 1083:ldc2            #1114 <String "ca">
	//  418 1086:invokespecial   #803 <Method void PdfName(String)>
	//  419 1089:putstatic       #1116 <Field PdfName ca>
		CALGRAY = new PdfName("CalGray");
	//  420 1092:new             #2   <Class PdfName>
	//  421 1095:dup             
	//  422 1096:ldc2            #1118 <String "CalGray">
	//  423 1099:invokespecial   #803 <Method void PdfName(String)>
	//  424 1102:putstatic       #1120 <Field PdfName CALGRAY>
		CALRGB = new PdfName("CalRGB");
	//  425 1105:new             #2   <Class PdfName>
	//  426 1108:dup             
	//  427 1109:ldc2            #1122 <String "CalRGB">
	//  428 1112:invokespecial   #803 <Method void PdfName(String)>
	//  429 1115:putstatic       #1124 <Field PdfName CALRGB>
		CAPHEIGHT = new PdfName("CapHeight");
	//  430 1118:new             #2   <Class PdfName>
	//  431 1121:dup             
	//  432 1122:ldc2            #1126 <String "CapHeight">
	//  433 1125:invokespecial   #803 <Method void PdfName(String)>
	//  434 1128:putstatic       #1128 <Field PdfName CAPHEIGHT>
		CARET = new PdfName("Caret");
	//  435 1131:new             #2   <Class PdfName>
	//  436 1134:dup             
	//  437 1135:ldc2            #1130 <String "Caret">
	//  438 1138:invokespecial   #803 <Method void PdfName(String)>
	//  439 1141:putstatic       #1132 <Field PdfName CARET>
		CAPTION = new PdfName("Caption");
	//  440 1144:new             #2   <Class PdfName>
	//  441 1147:dup             
	//  442 1148:ldc2            #1134 <String "Caption">
	//  443 1151:invokespecial   #803 <Method void PdfName(String)>
	//  444 1154:putstatic       #1136 <Field PdfName CAPTION>
		CATALOG = new PdfName("Catalog");
	//  445 1157:new             #2   <Class PdfName>
	//  446 1160:dup             
	//  447 1161:ldc2            #1138 <String "Catalog">
	//  448 1164:invokespecial   #803 <Method void PdfName(String)>
	//  449 1167:putstatic       #1140 <Field PdfName CATALOG>
		CATEGORY = new PdfName("Category");
	//  450 1170:new             #2   <Class PdfName>
	//  451 1173:dup             
	//  452 1174:ldc2            #1142 <String "Category">
	//  453 1177:invokespecial   #803 <Method void PdfName(String)>
	//  454 1180:putstatic       #1144 <Field PdfName CATEGORY>
		CB = new PdfName("cb");
	//  455 1183:new             #2   <Class PdfName>
	//  456 1186:dup             
	//  457 1187:ldc2            #1146 <String "cb">
	//  458 1190:invokespecial   #803 <Method void PdfName(String)>
	//  459 1193:putstatic       #1148 <Field PdfName CB>
		CCITTFAXDECODE = new PdfName("CCITTFaxDecode");
	//  460 1196:new             #2   <Class PdfName>
	//  461 1199:dup             
	//  462 1200:ldc2            #1150 <String "CCITTFaxDecode">
	//  463 1203:invokespecial   #803 <Method void PdfName(String)>
	//  464 1206:putstatic       #1152 <Field PdfName CCITTFAXDECODE>
		CENTER = new PdfName("Center");
	//  465 1209:new             #2   <Class PdfName>
	//  466 1212:dup             
	//  467 1213:ldc2            #1154 <String "Center">
	//  468 1216:invokespecial   #803 <Method void PdfName(String)>
	//  469 1219:putstatic       #1156 <Field PdfName CENTER>
		CENTERWINDOW = new PdfName("CenterWindow");
	//  470 1222:new             #2   <Class PdfName>
	//  471 1225:dup             
	//  472 1226:ldc2            #1158 <String "CenterWindow">
	//  473 1229:invokespecial   #803 <Method void PdfName(String)>
	//  474 1232:putstatic       #1160 <Field PdfName CENTERWINDOW>
		CERT = new PdfName("Cert");
	//  475 1235:new             #2   <Class PdfName>
	//  476 1238:dup             
	//  477 1239:ldc2            #1162 <String "Cert">
	//  478 1242:invokespecial   #803 <Method void PdfName(String)>
	//  479 1245:putstatic       #1164 <Field PdfName CERT>
		CERTS = new PdfName("Certs");
	//  480 1248:new             #2   <Class PdfName>
	//  481 1251:dup             
	//  482 1252:ldc2            #1166 <String "Certs">
	//  483 1255:invokespecial   #803 <Method void PdfName(String)>
	//  484 1258:putstatic       #1168 <Field PdfName CERTS>
		CF = new PdfName("CF");
	//  485 1261:new             #2   <Class PdfName>
	//  486 1264:dup             
	//  487 1265:ldc2            #1169 <String "CF">
	//  488 1268:invokespecial   #803 <Method void PdfName(String)>
	//  489 1271:putstatic       #1171 <Field PdfName CF>
		CFM = new PdfName("CFM");
	//  490 1274:new             #2   <Class PdfName>
	//  491 1277:dup             
	//  492 1278:ldc2            #1172 <String "CFM">
	//  493 1281:invokespecial   #803 <Method void PdfName(String)>
	//  494 1284:putstatic       #1174 <Field PdfName CFM>
		CH = new PdfName("Ch");
	//  495 1287:new             #2   <Class PdfName>
	//  496 1290:dup             
	//  497 1291:ldc2            #1176 <String "Ch">
	//  498 1294:invokespecial   #803 <Method void PdfName(String)>
	//  499 1297:putstatic       #1178 <Field PdfName CH>
		CHARPROCS = new PdfName("CharProcs");
	//  500 1300:new             #2   <Class PdfName>
	//  501 1303:dup             
	//  502 1304:ldc2            #1180 <String "CharProcs">
	//  503 1307:invokespecial   #803 <Method void PdfName(String)>
	//  504 1310:putstatic       #1182 <Field PdfName CHARPROCS>
		CHECKSUM = new PdfName("CheckSum");
	//  505 1313:new             #2   <Class PdfName>
	//  506 1316:dup             
	//  507 1317:ldc2            #1184 <String "CheckSum">
	//  508 1320:invokespecial   #803 <Method void PdfName(String)>
	//  509 1323:putstatic       #1186 <Field PdfName CHECKSUM>
		CI = new PdfName("CI");
	//  510 1326:new             #2   <Class PdfName>
	//  511 1329:dup             
	//  512 1330:ldc2            #1187 <String "CI">
	//  513 1333:invokespecial   #803 <Method void PdfName(String)>
	//  514 1336:putstatic       #1189 <Field PdfName CI>
		CIDFONTTYPE0 = new PdfName("CIDFontType0");
	//  515 1339:new             #2   <Class PdfName>
	//  516 1342:dup             
	//  517 1343:ldc2            #1191 <String "CIDFontType0">
	//  518 1346:invokespecial   #803 <Method void PdfName(String)>
	//  519 1349:putstatic       #1193 <Field PdfName CIDFONTTYPE0>
		CIDFONTTYPE2 = new PdfName("CIDFontType2");
	//  520 1352:new             #2   <Class PdfName>
	//  521 1355:dup             
	//  522 1356:ldc2            #1195 <String "CIDFontType2">
	//  523 1359:invokespecial   #803 <Method void PdfName(String)>
	//  524 1362:putstatic       #1197 <Field PdfName CIDFONTTYPE2>
		CIDSET = new PdfName("CIDSet");
	//  525 1365:new             #2   <Class PdfName>
	//  526 1368:dup             
	//  527 1369:ldc2            #1199 <String "CIDSet">
	//  528 1372:invokespecial   #803 <Method void PdfName(String)>
	//  529 1375:putstatic       #1201 <Field PdfName CIDSET>
		CIDSYSTEMINFO = new PdfName("CIDSystemInfo");
	//  530 1378:new             #2   <Class PdfName>
	//  531 1381:dup             
	//  532 1382:ldc2            #1203 <String "CIDSystemInfo">
	//  533 1385:invokespecial   #803 <Method void PdfName(String)>
	//  534 1388:putstatic       #1205 <Field PdfName CIDSYSTEMINFO>
		CIDTOGIDMAP = new PdfName("CIDToGIDMap");
	//  535 1391:new             #2   <Class PdfName>
	//  536 1394:dup             
	//  537 1395:ldc2            #1207 <String "CIDToGIDMap">
	//  538 1398:invokespecial   #803 <Method void PdfName(String)>
	//  539 1401:putstatic       #1209 <Field PdfName CIDTOGIDMAP>
		CIRCLE = new PdfName("Circle");
	//  540 1404:new             #2   <Class PdfName>
	//  541 1407:dup             
	//  542 1408:ldc2            #1211 <String "Circle">
	//  543 1411:invokespecial   #803 <Method void PdfName(String)>
	//  544 1414:putstatic       #1213 <Field PdfName CIRCLE>
		CLASSMAP = new PdfName("ClassMap");
	//  545 1417:new             #2   <Class PdfName>
	//  546 1420:dup             
	//  547 1421:ldc2            #1215 <String "ClassMap">
	//  548 1424:invokespecial   #803 <Method void PdfName(String)>
	//  549 1427:putstatic       #1217 <Field PdfName CLASSMAP>
		CLOUD = new PdfName("Cloud");
	//  550 1430:new             #2   <Class PdfName>
	//  551 1433:dup             
	//  552 1434:ldc2            #1219 <String "Cloud">
	//  553 1437:invokespecial   #803 <Method void PdfName(String)>
	//  554 1440:putstatic       #1221 <Field PdfName CLOUD>
		CMD = new PdfName("CMD");
	//  555 1443:new             #2   <Class PdfName>
	//  556 1446:dup             
	//  557 1447:ldc2            #1222 <String "CMD">
	//  558 1450:invokespecial   #803 <Method void PdfName(String)>
	//  559 1453:putstatic       #1224 <Field PdfName CMD>
		CO = new PdfName("CO");
	//  560 1456:new             #2   <Class PdfName>
	//  561 1459:dup             
	//  562 1460:ldc2            #1225 <String "CO">
	//  563 1463:invokespecial   #803 <Method void PdfName(String)>
	//  564 1466:putstatic       #1227 <Field PdfName CO>
		CODE = new PdfName("Code");
	//  565 1469:new             #2   <Class PdfName>
	//  566 1472:dup             
	//  567 1473:ldc2            #1229 <String "Code">
	//  568 1476:invokespecial   #803 <Method void PdfName(String)>
	//  569 1479:putstatic       #1231 <Field PdfName CODE>
		COLOR = new PdfName("Color");
	//  570 1482:new             #2   <Class PdfName>
	//  571 1485:dup             
	//  572 1486:ldc2            #1233 <String "Color">
	//  573 1489:invokespecial   #803 <Method void PdfName(String)>
	//  574 1492:putstatic       #1235 <Field PdfName COLOR>
		COLORANTS = new PdfName("Colorants");
	//  575 1495:new             #2   <Class PdfName>
	//  576 1498:dup             
	//  577 1499:ldc2            #1237 <String "Colorants">
	//  578 1502:invokespecial   #803 <Method void PdfName(String)>
	//  579 1505:putstatic       #1239 <Field PdfName COLORANTS>
		COLORS = new PdfName("Colors");
	//  580 1508:new             #2   <Class PdfName>
	//  581 1511:dup             
	//  582 1512:ldc2            #1241 <String "Colors">
	//  583 1515:invokespecial   #803 <Method void PdfName(String)>
	//  584 1518:putstatic       #1243 <Field PdfName COLORS>
		COLORSPACE = new PdfName("ColorSpace");
	//  585 1521:new             #2   <Class PdfName>
	//  586 1524:dup             
	//  587 1525:ldc2            #1245 <String "ColorSpace">
	//  588 1528:invokespecial   #803 <Method void PdfName(String)>
	//  589 1531:putstatic       #1247 <Field PdfName COLORSPACE>
		COLORTRANSFORM = new PdfName("ColorTransform");
	//  590 1534:new             #2   <Class PdfName>
	//  591 1537:dup             
	//  592 1538:ldc2            #1249 <String "ColorTransform">
	//  593 1541:invokespecial   #803 <Method void PdfName(String)>
	//  594 1544:putstatic       #1251 <Field PdfName COLORTRANSFORM>
		COLLECTION = new PdfName("Collection");
	//  595 1547:new             #2   <Class PdfName>
	//  596 1550:dup             
	//  597 1551:ldc2            #1253 <String "Collection">
	//  598 1554:invokespecial   #803 <Method void PdfName(String)>
	//  599 1557:putstatic       #1255 <Field PdfName COLLECTION>
		COLLECTIONFIELD = new PdfName("CollectionField");
	//  600 1560:new             #2   <Class PdfName>
	//  601 1563:dup             
	//  602 1564:ldc2            #1257 <String "CollectionField">
	//  603 1567:invokespecial   #803 <Method void PdfName(String)>
	//  604 1570:putstatic       #1259 <Field PdfName COLLECTIONFIELD>
		COLLECTIONITEM = new PdfName("CollectionItem");
	//  605 1573:new             #2   <Class PdfName>
	//  606 1576:dup             
	//  607 1577:ldc2            #1261 <String "CollectionItem">
	//  608 1580:invokespecial   #803 <Method void PdfName(String)>
	//  609 1583:putstatic       #1263 <Field PdfName COLLECTIONITEM>
		COLLECTIONSCHEMA = new PdfName("CollectionSchema");
	//  610 1586:new             #2   <Class PdfName>
	//  611 1589:dup             
	//  612 1590:ldc2            #1265 <String "CollectionSchema">
	//  613 1593:invokespecial   #803 <Method void PdfName(String)>
	//  614 1596:putstatic       #1267 <Field PdfName COLLECTIONSCHEMA>
		COLLECTIONSORT = new PdfName("CollectionSort");
	//  615 1599:new             #2   <Class PdfName>
	//  616 1602:dup             
	//  617 1603:ldc2            #1269 <String "CollectionSort">
	//  618 1606:invokespecial   #803 <Method void PdfName(String)>
	//  619 1609:putstatic       #1271 <Field PdfName COLLECTIONSORT>
		COLLECTIONSUBITEM = new PdfName("CollectionSubitem");
	//  620 1612:new             #2   <Class PdfName>
	//  621 1615:dup             
	//  622 1616:ldc2            #1273 <String "CollectionSubitem">
	//  623 1619:invokespecial   #803 <Method void PdfName(String)>
	//  624 1622:putstatic       #1275 <Field PdfName COLLECTIONSUBITEM>
		COLSPAN = new PdfName("ColSpan");
	//  625 1625:new             #2   <Class PdfName>
	//  626 1628:dup             
	//  627 1629:ldc2            #1277 <String "ColSpan">
	//  628 1632:invokespecial   #803 <Method void PdfName(String)>
	//  629 1635:putstatic       #1279 <Field PdfName COLSPAN>
		COLUMN = new PdfName("Column");
	//  630 1638:new             #2   <Class PdfName>
	//  631 1641:dup             
	//  632 1642:ldc2            #1281 <String "Column">
	//  633 1645:invokespecial   #803 <Method void PdfName(String)>
	//  634 1648:putstatic       #1283 <Field PdfName COLUMN>
		COLUMNS = new PdfName("Columns");
	//  635 1651:new             #2   <Class PdfName>
	//  636 1654:dup             
	//  637 1655:ldc2            #1285 <String "Columns">
	//  638 1658:invokespecial   #803 <Method void PdfName(String)>
	//  639 1661:putstatic       #1287 <Field PdfName COLUMNS>
		CONDITION = new PdfName("Condition");
	//  640 1664:new             #2   <Class PdfName>
	//  641 1667:dup             
	//  642 1668:ldc2            #1289 <String "Condition">
	//  643 1671:invokespecial   #803 <Method void PdfName(String)>
	//  644 1674:putstatic       #1291 <Field PdfName CONDITION>
		CONFIGS = new PdfName("Configs");
	//  645 1677:new             #2   <Class PdfName>
	//  646 1680:dup             
	//  647 1681:ldc2            #1293 <String "Configs">
	//  648 1684:invokespecial   #803 <Method void PdfName(String)>
	//  649 1687:putstatic       #1295 <Field PdfName CONFIGS>
		CONFIGURATION = new PdfName("Configuration");
	//  650 1690:new             #2   <Class PdfName>
	//  651 1693:dup             
	//  652 1694:ldc2            #1297 <String "Configuration">
	//  653 1697:invokespecial   #803 <Method void PdfName(String)>
	//  654 1700:putstatic       #1299 <Field PdfName CONFIGURATION>
		CONFIGURATIONS = new PdfName("Configurations");
	//  655 1703:new             #2   <Class PdfName>
	//  656 1706:dup             
	//  657 1707:ldc2            #1301 <String "Configurations">
	//  658 1710:invokespecial   #803 <Method void PdfName(String)>
	//  659 1713:putstatic       #1303 <Field PdfName CONFIGURATIONS>
		CONTACTINFO = new PdfName("ContactInfo");
	//  660 1716:new             #2   <Class PdfName>
	//  661 1719:dup             
	//  662 1720:ldc2            #1305 <String "ContactInfo">
	//  663 1723:invokespecial   #803 <Method void PdfName(String)>
	//  664 1726:putstatic       #1307 <Field PdfName CONTACTINFO>
		CONTENT = new PdfName("Content");
	//  665 1729:new             #2   <Class PdfName>
	//  666 1732:dup             
	//  667 1733:ldc2            #1309 <String "Content">
	//  668 1736:invokespecial   #803 <Method void PdfName(String)>
	//  669 1739:putstatic       #1311 <Field PdfName CONTENT>
		CONTENTS = new PdfName("Contents");
	//  670 1742:new             #2   <Class PdfName>
	//  671 1745:dup             
	//  672 1746:ldc2            #1313 <String "Contents">
	//  673 1749:invokespecial   #803 <Method void PdfName(String)>
	//  674 1752:putstatic       #1315 <Field PdfName CONTENTS>
		COORDS = new PdfName("Coords");
	//  675 1755:new             #2   <Class PdfName>
	//  676 1758:dup             
	//  677 1759:ldc2            #1317 <String "Coords">
	//  678 1762:invokespecial   #803 <Method void PdfName(String)>
	//  679 1765:putstatic       #1319 <Field PdfName COORDS>
		COUNT = new PdfName("Count");
	//  680 1768:new             #2   <Class PdfName>
	//  681 1771:dup             
	//  682 1772:ldc2            #1321 <String "Count">
	//  683 1775:invokespecial   #803 <Method void PdfName(String)>
	//  684 1778:putstatic       #1323 <Field PdfName COUNT>
		COURIER = new PdfName("Courier");
	//  685 1781:new             #2   <Class PdfName>
	//  686 1784:dup             
	//  687 1785:ldc2            #1325 <String "Courier">
	//  688 1788:invokespecial   #803 <Method void PdfName(String)>
	//  689 1791:putstatic       #1327 <Field PdfName COURIER>
		COURIER_BOLD = new PdfName("Courier-Bold");
	//  690 1794:new             #2   <Class PdfName>
	//  691 1797:dup             
	//  692 1798:ldc2            #1329 <String "Courier-Bold">
	//  693 1801:invokespecial   #803 <Method void PdfName(String)>
	//  694 1804:putstatic       #1331 <Field PdfName COURIER_BOLD>
		COURIER_OBLIQUE = new PdfName("Courier-Oblique");
	//  695 1807:new             #2   <Class PdfName>
	//  696 1810:dup             
	//  697 1811:ldc2            #1333 <String "Courier-Oblique">
	//  698 1814:invokespecial   #803 <Method void PdfName(String)>
	//  699 1817:putstatic       #1335 <Field PdfName COURIER_OBLIQUE>
		COURIER_BOLDOBLIQUE = new PdfName("Courier-BoldOblique");
	//  700 1820:new             #2   <Class PdfName>
	//  701 1823:dup             
	//  702 1824:ldc2            #1337 <String "Courier-BoldOblique">
	//  703 1827:invokespecial   #803 <Method void PdfName(String)>
	//  704 1830:putstatic       #1339 <Field PdfName COURIER_BOLDOBLIQUE>
		CREATIONDATE = new PdfName("CreationDate");
	//  705 1833:new             #2   <Class PdfName>
	//  706 1836:dup             
	//  707 1837:ldc2            #1341 <String "CreationDate">
	//  708 1840:invokespecial   #803 <Method void PdfName(String)>
	//  709 1843:putstatic       #1343 <Field PdfName CREATIONDATE>
		CREATOR = new PdfName("Creator");
	//  710 1846:new             #2   <Class PdfName>
	//  711 1849:dup             
	//  712 1850:ldc2            #1345 <String "Creator">
	//  713 1853:invokespecial   #803 <Method void PdfName(String)>
	//  714 1856:putstatic       #1347 <Field PdfName CREATOR>
		CREATORINFO = new PdfName("CreatorInfo");
	//  715 1859:new             #2   <Class PdfName>
	//  716 1862:dup             
	//  717 1863:ldc2            #1349 <String "CreatorInfo">
	//  718 1866:invokespecial   #803 <Method void PdfName(String)>
	//  719 1869:putstatic       #1351 <Field PdfName CREATORINFO>
		CRL = new PdfName("CRL");
	//  720 1872:new             #2   <Class PdfName>
	//  721 1875:dup             
	//  722 1876:ldc2            #1352 <String "CRL">
	//  723 1879:invokespecial   #803 <Method void PdfName(String)>
	//  724 1882:putstatic       #1354 <Field PdfName CRL>
		CRLS = new PdfName("CRLs");
	//  725 1885:new             #2   <Class PdfName>
	//  726 1888:dup             
	//  727 1889:ldc2            #1356 <String "CRLs">
	//  728 1892:invokespecial   #803 <Method void PdfName(String)>
	//  729 1895:putstatic       #1358 <Field PdfName CRLS>
		CROPBOX = new PdfName("CropBox");
	//  730 1898:new             #2   <Class PdfName>
	//  731 1901:dup             
	//  732 1902:ldc2            #1360 <String "CropBox">
	//  733 1905:invokespecial   #803 <Method void PdfName(String)>
	//  734 1908:putstatic       #1362 <Field PdfName CROPBOX>
		CRYPT = new PdfName("Crypt");
	//  735 1911:new             #2   <Class PdfName>
	//  736 1914:dup             
	//  737 1915:ldc2            #1364 <String "Crypt">
	//  738 1918:invokespecial   #803 <Method void PdfName(String)>
	//  739 1921:putstatic       #1366 <Field PdfName CRYPT>
		CS = new PdfName("CS");
	//  740 1924:new             #2   <Class PdfName>
	//  741 1927:dup             
	//  742 1928:ldc2            #1367 <String "CS">
	//  743 1931:invokespecial   #803 <Method void PdfName(String)>
	//  744 1934:putstatic       #1369 <Field PdfName CS>
		CUEPOINT = new PdfName("CuePoint");
	//  745 1937:new             #2   <Class PdfName>
	//  746 1940:dup             
	//  747 1941:ldc2            #1371 <String "CuePoint">
	//  748 1944:invokespecial   #803 <Method void PdfName(String)>
	//  749 1947:putstatic       #1373 <Field PdfName CUEPOINT>
		CUEPOINTS = new PdfName("CuePoints");
	//  750 1950:new             #2   <Class PdfName>
	//  751 1953:dup             
	//  752 1954:ldc2            #1375 <String "CuePoints">
	//  753 1957:invokespecial   #803 <Method void PdfName(String)>
	//  754 1960:putstatic       #1377 <Field PdfName CUEPOINTS>
		CYX = new PdfName("CYX");
	//  755 1963:new             #2   <Class PdfName>
	//  756 1966:dup             
	//  757 1967:ldc2            #1378 <String "CYX">
	//  758 1970:invokespecial   #803 <Method void PdfName(String)>
	//  759 1973:putstatic       #1380 <Field PdfName CYX>
		D = new PdfName("D");
	//  760 1976:new             #2   <Class PdfName>
	//  761 1979:dup             
	//  762 1980:ldc2            #1381 <String "D">
	//  763 1983:invokespecial   #803 <Method void PdfName(String)>
	//  764 1986:putstatic       #1383 <Field PdfName D>
		DA = new PdfName("DA");
	//  765 1989:new             #2   <Class PdfName>
	//  766 1992:dup             
	//  767 1993:ldc2            #1384 <String "DA">
	//  768 1996:invokespecial   #803 <Method void PdfName(String)>
	//  769 1999:putstatic       #1386 <Field PdfName DA>
		DATA = new PdfName("Data");
	//  770 2002:new             #2   <Class PdfName>
	//  771 2005:dup             
	//  772 2006:ldc2            #1388 <String "Data">
	//  773 2009:invokespecial   #803 <Method void PdfName(String)>
	//  774 2012:putstatic       #1390 <Field PdfName DATA>
		DC = new PdfName("DC");
	//  775 2015:new             #2   <Class PdfName>
	//  776 2018:dup             
	//  777 2019:ldc2            #1391 <String "DC">
	//  778 2022:invokespecial   #803 <Method void PdfName(String)>
	//  779 2025:putstatic       #1393 <Field PdfName DC>
		DCS = new PdfName("DCS");
	//  780 2028:new             #2   <Class PdfName>
	//  781 2031:dup             
	//  782 2032:ldc2            #1394 <String "DCS">
	//  783 2035:invokespecial   #803 <Method void PdfName(String)>
	//  784 2038:putstatic       #1396 <Field PdfName DCS>
		DCTDECODE = new PdfName("DCTDecode");
	//  785 2041:new             #2   <Class PdfName>
	//  786 2044:dup             
	//  787 2045:ldc2            #1398 <String "DCTDecode">
	//  788 2048:invokespecial   #803 <Method void PdfName(String)>
	//  789 2051:putstatic       #1400 <Field PdfName DCTDECODE>
		DECIMAL = new PdfName("Decimal");
	//  790 2054:new             #2   <Class PdfName>
	//  791 2057:dup             
	//  792 2058:ldc2            #1402 <String "Decimal">
	//  793 2061:invokespecial   #803 <Method void PdfName(String)>
	//  794 2064:putstatic       #1404 <Field PdfName DECIMAL>
		DEACTIVATION = new PdfName("Deactivation");
	//  795 2067:new             #2   <Class PdfName>
	//  796 2070:dup             
	//  797 2071:ldc2            #1406 <String "Deactivation">
	//  798 2074:invokespecial   #803 <Method void PdfName(String)>
	//  799 2077:putstatic       #1408 <Field PdfName DEACTIVATION>
		DECODE = new PdfName("Decode");
	//  800 2080:new             #2   <Class PdfName>
	//  801 2083:dup             
	//  802 2084:ldc2            #1410 <String "Decode">
	//  803 2087:invokespecial   #803 <Method void PdfName(String)>
	//  804 2090:putstatic       #1412 <Field PdfName DECODE>
		DECODEPARMS = new PdfName("DecodeParms");
	//  805 2093:new             #2   <Class PdfName>
	//  806 2096:dup             
	//  807 2097:ldc2            #1414 <String "DecodeParms">
	//  808 2100:invokespecial   #803 <Method void PdfName(String)>
	//  809 2103:putstatic       #1416 <Field PdfName DECODEPARMS>
		DEFAULT = new PdfName("Default");
	//  810 2106:new             #2   <Class PdfName>
	//  811 2109:dup             
	//  812 2110:ldc2            #1418 <String "Default">
	//  813 2113:invokespecial   #803 <Method void PdfName(String)>
	//  814 2116:putstatic       #1420 <Field PdfName DEFAULT>
		DEFAULTCRYPTFILTER = new PdfName("DefaultCryptFilter");
	//  815 2119:new             #2   <Class PdfName>
	//  816 2122:dup             
	//  817 2123:ldc2            #1422 <String "DefaultCryptFilter">
	//  818 2126:invokespecial   #803 <Method void PdfName(String)>
	//  819 2129:putstatic       #1424 <Field PdfName DEFAULTCRYPTFILTER>
		DEFAULTCMYK = new PdfName("DefaultCMYK");
	//  820 2132:new             #2   <Class PdfName>
	//  821 2135:dup             
	//  822 2136:ldc2            #1426 <String "DefaultCMYK">
	//  823 2139:invokespecial   #803 <Method void PdfName(String)>
	//  824 2142:putstatic       #1428 <Field PdfName DEFAULTCMYK>
		DEFAULTGRAY = new PdfName("DefaultGray");
	//  825 2145:new             #2   <Class PdfName>
	//  826 2148:dup             
	//  827 2149:ldc2            #1430 <String "DefaultGray">
	//  828 2152:invokespecial   #803 <Method void PdfName(String)>
	//  829 2155:putstatic       #1432 <Field PdfName DEFAULTGRAY>
		DEFAULTRGB = new PdfName("DefaultRGB");
	//  830 2158:new             #2   <Class PdfName>
	//  831 2161:dup             
	//  832 2162:ldc2            #1434 <String "DefaultRGB">
	//  833 2165:invokespecial   #803 <Method void PdfName(String)>
	//  834 2168:putstatic       #1436 <Field PdfName DEFAULTRGB>
		DESC = new PdfName("Desc");
	//  835 2171:new             #2   <Class PdfName>
	//  836 2174:dup             
	//  837 2175:ldc2            #1438 <String "Desc">
	//  838 2178:invokespecial   #803 <Method void PdfName(String)>
	//  839 2181:putstatic       #1440 <Field PdfName DESC>
		DESCENDANTFONTS = new PdfName("DescendantFonts");
	//  840 2184:new             #2   <Class PdfName>
	//  841 2187:dup             
	//  842 2188:ldc2            #1442 <String "DescendantFonts">
	//  843 2191:invokespecial   #803 <Method void PdfName(String)>
	//  844 2194:putstatic       #1444 <Field PdfName DESCENDANTFONTS>
		DESCENT = new PdfName("Descent");
	//  845 2197:new             #2   <Class PdfName>
	//  846 2200:dup             
	//  847 2201:ldc2            #1446 <String "Descent">
	//  848 2204:invokespecial   #803 <Method void PdfName(String)>
	//  849 2207:putstatic       #1448 <Field PdfName DESCENT>
		DEST = new PdfName("Dest");
	//  850 2210:new             #2   <Class PdfName>
	//  851 2213:dup             
	//  852 2214:ldc2            #1450 <String "Dest">
	//  853 2217:invokespecial   #803 <Method void PdfName(String)>
	//  854 2220:putstatic       #1452 <Field PdfName DEST>
		DESTOUTPUTPROFILE = new PdfName("DestOutputProfile");
	//  855 2223:new             #2   <Class PdfName>
	//  856 2226:dup             
	//  857 2227:ldc2            #1454 <String "DestOutputProfile">
	//  858 2230:invokespecial   #803 <Method void PdfName(String)>
	//  859 2233:putstatic       #1456 <Field PdfName DESTOUTPUTPROFILE>
		DESTS = new PdfName("Dests");
	//  860 2236:new             #2   <Class PdfName>
	//  861 2239:dup             
	//  862 2240:ldc2            #1458 <String "Dests">
	//  863 2243:invokespecial   #803 <Method void PdfName(String)>
	//  864 2246:putstatic       #1460 <Field PdfName DESTS>
		DEVICEGRAY = new PdfName("DeviceGray");
	//  865 2249:new             #2   <Class PdfName>
	//  866 2252:dup             
	//  867 2253:ldc2            #1462 <String "DeviceGray">
	//  868 2256:invokespecial   #803 <Method void PdfName(String)>
	//  869 2259:putstatic       #1464 <Field PdfName DEVICEGRAY>
		DEVICERGB = new PdfName("DeviceRGB");
	//  870 2262:new             #2   <Class PdfName>
	//  871 2265:dup             
	//  872 2266:ldc2            #1466 <String "DeviceRGB">
	//  873 2269:invokespecial   #803 <Method void PdfName(String)>
	//  874 2272:putstatic       #1468 <Field PdfName DEVICERGB>
		DEVICECMYK = new PdfName("DeviceCMYK");
	//  875 2275:new             #2   <Class PdfName>
	//  876 2278:dup             
	//  877 2279:ldc2            #1470 <String "DeviceCMYK">
	//  878 2282:invokespecial   #803 <Method void PdfName(String)>
	//  879 2285:putstatic       #1472 <Field PdfName DEVICECMYK>
		DEVICEN = new PdfName("DeviceN");
	//  880 2288:new             #2   <Class PdfName>
	//  881 2291:dup             
	//  882 2292:ldc2            #1474 <String "DeviceN">
	//  883 2295:invokespecial   #803 <Method void PdfName(String)>
	//  884 2298:putstatic       #1476 <Field PdfName DEVICEN>
		DI = new PdfName("Di");
	//  885 2301:new             #2   <Class PdfName>
	//  886 2304:dup             
	//  887 2305:ldc2            #1478 <String "Di">
	//  888 2308:invokespecial   #803 <Method void PdfName(String)>
	//  889 2311:putstatic       #1480 <Field PdfName DI>
		DIFFERENCES = new PdfName("Differences");
	//  890 2314:new             #2   <Class PdfName>
	//  891 2317:dup             
	//  892 2318:ldc2            #1482 <String "Differences">
	//  893 2321:invokespecial   #803 <Method void PdfName(String)>
	//  894 2324:putstatic       #1484 <Field PdfName DIFFERENCES>
		DISSOLVE = new PdfName("Dissolve");
	//  895 2327:new             #2   <Class PdfName>
	//  896 2330:dup             
	//  897 2331:ldc2            #1486 <String "Dissolve">
	//  898 2334:invokespecial   #803 <Method void PdfName(String)>
	//  899 2337:putstatic       #1488 <Field PdfName DISSOLVE>
		DIRECTION = new PdfName("Direction");
	//  900 2340:new             #2   <Class PdfName>
	//  901 2343:dup             
	//  902 2344:ldc2            #1490 <String "Direction">
	//  903 2347:invokespecial   #803 <Method void PdfName(String)>
	//  904 2350:putstatic       #1492 <Field PdfName DIRECTION>
		DISPLAYDOCTITLE = new PdfName("DisplayDocTitle");
	//  905 2353:new             #2   <Class PdfName>
	//  906 2356:dup             
	//  907 2357:ldc2            #1494 <String "DisplayDocTitle">
	//  908 2360:invokespecial   #803 <Method void PdfName(String)>
	//  909 2363:putstatic       #1496 <Field PdfName DISPLAYDOCTITLE>
		DIV = new PdfName("Div");
	//  910 2366:new             #2   <Class PdfName>
	//  911 2369:dup             
	//  912 2370:ldc2            #1498 <String "Div">
	//  913 2373:invokespecial   #803 <Method void PdfName(String)>
	//  914 2376:putstatic       #1500 <Field PdfName DIV>
		DL = new PdfName("DL");
	//  915 2379:new             #2   <Class PdfName>
	//  916 2382:dup             
	//  917 2383:ldc2            #1501 <String "DL">
	//  918 2386:invokespecial   #803 <Method void PdfName(String)>
	//  919 2389:putstatic       #1503 <Field PdfName DL>
		DM = new PdfName("Dm");
	//  920 2392:new             #2   <Class PdfName>
	//  921 2395:dup             
	//  922 2396:ldc2            #1505 <String "Dm">
	//  923 2399:invokespecial   #803 <Method void PdfName(String)>
	//  924 2402:putstatic       #1507 <Field PdfName DM>
		DOCMDP = new PdfName("DocMDP");
	//  925 2405:new             #2   <Class PdfName>
	//  926 2408:dup             
	//  927 2409:ldc2            #1509 <String "DocMDP">
	//  928 2412:invokespecial   #803 <Method void PdfName(String)>
	//  929 2415:putstatic       #1511 <Field PdfName DOCMDP>
		DOCOPEN = new PdfName("DocOpen");
	//  930 2418:new             #2   <Class PdfName>
	//  931 2421:dup             
	//  932 2422:ldc2            #1513 <String "DocOpen">
	//  933 2425:invokespecial   #803 <Method void PdfName(String)>
	//  934 2428:putstatic       #1515 <Field PdfName DOCOPEN>
		DOCTIMESTAMP = new PdfName("DocTimeStamp");
	//  935 2431:new             #2   <Class PdfName>
	//  936 2434:dup             
	//  937 2435:ldc2            #1517 <String "DocTimeStamp">
	//  938 2438:invokespecial   #803 <Method void PdfName(String)>
	//  939 2441:putstatic       #1519 <Field PdfName DOCTIMESTAMP>
		DOCUMENT = new PdfName("Document");
	//  940 2444:new             #2   <Class PdfName>
	//  941 2447:dup             
	//  942 2448:ldc2            #1521 <String "Document">
	//  943 2451:invokespecial   #803 <Method void PdfName(String)>
	//  944 2454:putstatic       #1523 <Field PdfName DOCUMENT>
		DOMAIN = new PdfName("Domain");
	//  945 2457:new             #2   <Class PdfName>
	//  946 2460:dup             
	//  947 2461:ldc2            #1525 <String "Domain">
	//  948 2464:invokespecial   #803 <Method void PdfName(String)>
	//  949 2467:putstatic       #1527 <Field PdfName DOMAIN>
		DOS = new PdfName("DOS");
	//  950 2470:new             #2   <Class PdfName>
	//  951 2473:dup             
	//  952 2474:ldc2            #1528 <String "DOS">
	//  953 2477:invokespecial   #803 <Method void PdfName(String)>
	//  954 2480:putstatic       #1530 <Field PdfName DOS>
		DP = new PdfName("DP");
	//  955 2483:new             #2   <Class PdfName>
	//  956 2486:dup             
	//  957 2487:ldc2            #1531 <String "DP">
	//  958 2490:invokespecial   #803 <Method void PdfName(String)>
	//  959 2493:putstatic       #1533 <Field PdfName DP>
		DR = new PdfName("DR");
	//  960 2496:new             #2   <Class PdfName>
	//  961 2499:dup             
	//  962 2500:ldc2            #1534 <String "DR">
	//  963 2503:invokespecial   #803 <Method void PdfName(String)>
	//  964 2506:putstatic       #1536 <Field PdfName DR>
		DS = new PdfName("DS");
	//  965 2509:new             #2   <Class PdfName>
	//  966 2512:dup             
	//  967 2513:ldc2            #1537 <String "DS">
	//  968 2516:invokespecial   #803 <Method void PdfName(String)>
	//  969 2519:putstatic       #1539 <Field PdfName DS>
		DSS = new PdfName("DSS");
	//  970 2522:new             #2   <Class PdfName>
	//  971 2525:dup             
	//  972 2526:ldc2            #1540 <String "DSS">
	//  973 2529:invokespecial   #803 <Method void PdfName(String)>
	//  974 2532:putstatic       #1542 <Field PdfName DSS>
		DUR = new PdfName("Dur");
	//  975 2535:new             #2   <Class PdfName>
	//  976 2538:dup             
	//  977 2539:ldc2            #1544 <String "Dur">
	//  978 2542:invokespecial   #803 <Method void PdfName(String)>
	//  979 2545:putstatic       #1546 <Field PdfName DUR>
		DUPLEX = new PdfName("Duplex");
	//  980 2548:new             #2   <Class PdfName>
	//  981 2551:dup             
	//  982 2552:ldc2            #1548 <String "Duplex">
	//  983 2555:invokespecial   #803 <Method void PdfName(String)>
	//  984 2558:putstatic       #1550 <Field PdfName DUPLEX>
		DUPLEXFLIPSHORTEDGE = new PdfName("DuplexFlipShortEdge");
	//  985 2561:new             #2   <Class PdfName>
	//  986 2564:dup             
	//  987 2565:ldc2            #1552 <String "DuplexFlipShortEdge">
	//  988 2568:invokespecial   #803 <Method void PdfName(String)>
	//  989 2571:putstatic       #1554 <Field PdfName DUPLEXFLIPSHORTEDGE>
		DUPLEXFLIPLONGEDGE = new PdfName("DuplexFlipLongEdge");
	//  990 2574:new             #2   <Class PdfName>
	//  991 2577:dup             
	//  992 2578:ldc2            #1556 <String "DuplexFlipLongEdge">
	//  993 2581:invokespecial   #803 <Method void PdfName(String)>
	//  994 2584:putstatic       #1558 <Field PdfName DUPLEXFLIPLONGEDGE>
		DV = new PdfName("DV");
	//  995 2587:new             #2   <Class PdfName>
	//  996 2590:dup             
	//  997 2591:ldc2            #1559 <String "DV">
	//  998 2594:invokespecial   #803 <Method void PdfName(String)>
	//  999 2597:putstatic       #1561 <Field PdfName DV>
		DW = new PdfName("DW");
	// 1000 2600:new             #2   <Class PdfName>
	// 1001 2603:dup             
	// 1002 2604:ldc2            #1562 <String "DW">
	// 1003 2607:invokespecial   #803 <Method void PdfName(String)>
	// 1004 2610:putstatic       #1564 <Field PdfName DW>
		E = new PdfName("E");
	// 1005 2613:new             #2   <Class PdfName>
	// 1006 2616:dup             
	// 1007 2617:ldc2            #1565 <String "E">
	// 1008 2620:invokespecial   #803 <Method void PdfName(String)>
	// 1009 2623:putstatic       #1567 <Field PdfName E>
		EARLYCHANGE = new PdfName("EarlyChange");
	// 1010 2626:new             #2   <Class PdfName>
	// 1011 2629:dup             
	// 1012 2630:ldc2            #1569 <String "EarlyChange">
	// 1013 2633:invokespecial   #803 <Method void PdfName(String)>
	// 1014 2636:putstatic       #1571 <Field PdfName EARLYCHANGE>
		EF = new PdfName("EF");
	// 1015 2639:new             #2   <Class PdfName>
	// 1016 2642:dup             
	// 1017 2643:ldc2            #1572 <String "EF">
	// 1018 2646:invokespecial   #803 <Method void PdfName(String)>
	// 1019 2649:putstatic       #1574 <Field PdfName EF>
		EFF = new PdfName("EFF");
	// 1020 2652:new             #2   <Class PdfName>
	// 1021 2655:dup             
	// 1022 2656:ldc2            #1575 <String "EFF">
	// 1023 2659:invokespecial   #803 <Method void PdfName(String)>
	// 1024 2662:putstatic       #1577 <Field PdfName EFF>
		EFOPEN = new PdfName("EFOpen");
	// 1025 2665:new             #2   <Class PdfName>
	// 1026 2668:dup             
	// 1027 2669:ldc2            #1579 <String "EFOpen">
	// 1028 2672:invokespecial   #803 <Method void PdfName(String)>
	// 1029 2675:putstatic       #1581 <Field PdfName EFOPEN>
		EMBEDDED = new PdfName("Embedded");
	// 1030 2678:new             #2   <Class PdfName>
	// 1031 2681:dup             
	// 1032 2682:ldc2            #1583 <String "Embedded">
	// 1033 2685:invokespecial   #803 <Method void PdfName(String)>
	// 1034 2688:putstatic       #1585 <Field PdfName EMBEDDED>
		EMBEDDEDFILE = new PdfName("EmbeddedFile");
	// 1035 2691:new             #2   <Class PdfName>
	// 1036 2694:dup             
	// 1037 2695:ldc2            #1587 <String "EmbeddedFile">
	// 1038 2698:invokespecial   #803 <Method void PdfName(String)>
	// 1039 2701:putstatic       #1589 <Field PdfName EMBEDDEDFILE>
		EMBEDDEDFILES = new PdfName("EmbeddedFiles");
	// 1040 2704:new             #2   <Class PdfName>
	// 1041 2707:dup             
	// 1042 2708:ldc2            #1591 <String "EmbeddedFiles">
	// 1043 2711:invokespecial   #803 <Method void PdfName(String)>
	// 1044 2714:putstatic       #1593 <Field PdfName EMBEDDEDFILES>
		ENCODE = new PdfName("Encode");
	// 1045 2717:new             #2   <Class PdfName>
	// 1046 2720:dup             
	// 1047 2721:ldc2            #1595 <String "Encode">
	// 1048 2724:invokespecial   #803 <Method void PdfName(String)>
	// 1049 2727:putstatic       #1597 <Field PdfName ENCODE>
		ENCODEDBYTEALIGN = new PdfName("EncodedByteAlign");
	// 1050 2730:new             #2   <Class PdfName>
	// 1051 2733:dup             
	// 1052 2734:ldc2            #1599 <String "EncodedByteAlign">
	// 1053 2737:invokespecial   #803 <Method void PdfName(String)>
	// 1054 2740:putstatic       #1601 <Field PdfName ENCODEDBYTEALIGN>
		ENCODING = new PdfName("Encoding");
	// 1055 2743:new             #2   <Class PdfName>
	// 1056 2746:dup             
	// 1057 2747:ldc2            #1603 <String "Encoding">
	// 1058 2750:invokespecial   #803 <Method void PdfName(String)>
	// 1059 2753:putstatic       #1605 <Field PdfName ENCODING>
		ENCRYPT = new PdfName("Encrypt");
	// 1060 2756:new             #2   <Class PdfName>
	// 1061 2759:dup             
	// 1062 2760:ldc2            #1607 <String "Encrypt">
	// 1063 2763:invokespecial   #803 <Method void PdfName(String)>
	// 1064 2766:putstatic       #1609 <Field PdfName ENCRYPT>
		ENCRYPTMETADATA = new PdfName("EncryptMetadata");
	// 1065 2769:new             #2   <Class PdfName>
	// 1066 2772:dup             
	// 1067 2773:ldc2            #1611 <String "EncryptMetadata">
	// 1068 2776:invokespecial   #803 <Method void PdfName(String)>
	// 1069 2779:putstatic       #1613 <Field PdfName ENCRYPTMETADATA>
		END = new PdfName("End");
	// 1070 2782:new             #2   <Class PdfName>
	// 1071 2785:dup             
	// 1072 2786:ldc2            #1615 <String "End">
	// 1073 2789:invokespecial   #803 <Method void PdfName(String)>
	// 1074 2792:putstatic       #1617 <Field PdfName END>
		ENDINDENT = new PdfName("EndIndent");
	// 1075 2795:new             #2   <Class PdfName>
	// 1076 2798:dup             
	// 1077 2799:ldc2            #1619 <String "EndIndent">
	// 1078 2802:invokespecial   #803 <Method void PdfName(String)>
	// 1079 2805:putstatic       #1621 <Field PdfName ENDINDENT>
		ENDOFBLOCK = new PdfName("EndOfBlock");
	// 1080 2808:new             #2   <Class PdfName>
	// 1081 2811:dup             
	// 1082 2812:ldc2            #1623 <String "EndOfBlock">
	// 1083 2815:invokespecial   #803 <Method void PdfName(String)>
	// 1084 2818:putstatic       #1625 <Field PdfName ENDOFBLOCK>
		ENDOFLINE = new PdfName("EndOfLine");
	// 1085 2821:new             #2   <Class PdfName>
	// 1086 2824:dup             
	// 1087 2825:ldc2            #1627 <String "EndOfLine">
	// 1088 2828:invokespecial   #803 <Method void PdfName(String)>
	// 1089 2831:putstatic       #1629 <Field PdfName ENDOFLINE>
		EPSG = new PdfName("EPSG");
	// 1090 2834:new             #2   <Class PdfName>
	// 1091 2837:dup             
	// 1092 2838:ldc2            #1630 <String "EPSG">
	// 1093 2841:invokespecial   #803 <Method void PdfName(String)>
	// 1094 2844:putstatic       #1632 <Field PdfName EPSG>
		ESIC = new PdfName("ESIC");
	// 1095 2847:new             #2   <Class PdfName>
	// 1096 2850:dup             
	// 1097 2851:ldc2            #1633 <String "ESIC">
	// 1098 2854:invokespecial   #803 <Method void PdfName(String)>
	// 1099 2857:putstatic       #1635 <Field PdfName ESIC>
		ETSI_CADES_DETACHED = new PdfName("ETSI.CAdES.detached");
	// 1100 2860:new             #2   <Class PdfName>
	// 1101 2863:dup             
	// 1102 2864:ldc2            #1637 <String "ETSI.CAdES.detached">
	// 1103 2867:invokespecial   #803 <Method void PdfName(String)>
	// 1104 2870:putstatic       #1639 <Field PdfName ETSI_CADES_DETACHED>
		ETSI_RFC3161 = new PdfName("ETSI.RFC3161");
	// 1105 2873:new             #2   <Class PdfName>
	// 1106 2876:dup             
	// 1107 2877:ldc2            #1641 <String "ETSI.RFC3161">
	// 1108 2880:invokespecial   #803 <Method void PdfName(String)>
	// 1109 2883:putstatic       #1643 <Field PdfName ETSI_RFC3161>
		EXCLUDE = new PdfName("Exclude");
	// 1110 2886:new             #2   <Class PdfName>
	// 1111 2889:dup             
	// 1112 2890:ldc2            #1645 <String "Exclude">
	// 1113 2893:invokespecial   #803 <Method void PdfName(String)>
	// 1114 2896:putstatic       #1647 <Field PdfName EXCLUDE>
		EXTEND = new PdfName("Extend");
	// 1115 2899:new             #2   <Class PdfName>
	// 1116 2902:dup             
	// 1117 2903:ldc2            #1649 <String "Extend">
	// 1118 2906:invokespecial   #803 <Method void PdfName(String)>
	// 1119 2909:putstatic       #1651 <Field PdfName EXTEND>
		EXTENSIONS = new PdfName("Extensions");
	// 1120 2912:new             #2   <Class PdfName>
	// 1121 2915:dup             
	// 1122 2916:ldc2            #1653 <String "Extensions">
	// 1123 2919:invokespecial   #803 <Method void PdfName(String)>
	// 1124 2922:putstatic       #1655 <Field PdfName EXTENSIONS>
		EXTENSIONLEVEL = new PdfName("ExtensionLevel");
	// 1125 2925:new             #2   <Class PdfName>
	// 1126 2928:dup             
	// 1127 2929:ldc2            #1657 <String "ExtensionLevel">
	// 1128 2932:invokespecial   #803 <Method void PdfName(String)>
	// 1129 2935:putstatic       #1659 <Field PdfName EXTENSIONLEVEL>
		EXTGSTATE = new PdfName("ExtGState");
	// 1130 2938:new             #2   <Class PdfName>
	// 1131 2941:dup             
	// 1132 2942:ldc2            #1661 <String "ExtGState">
	// 1133 2945:invokespecial   #803 <Method void PdfName(String)>
	// 1134 2948:putstatic       #1663 <Field PdfName EXTGSTATE>
		EXPORT = new PdfName("Export");
	// 1135 2951:new             #2   <Class PdfName>
	// 1136 2954:dup             
	// 1137 2955:ldc2            #1665 <String "Export">
	// 1138 2958:invokespecial   #803 <Method void PdfName(String)>
	// 1139 2961:putstatic       #1667 <Field PdfName EXPORT>
		EXPORTSTATE = new PdfName("ExportState");
	// 1140 2964:new             #2   <Class PdfName>
	// 1141 2967:dup             
	// 1142 2968:ldc2            #1669 <String "ExportState">
	// 1143 2971:invokespecial   #803 <Method void PdfName(String)>
	// 1144 2974:putstatic       #1671 <Field PdfName EXPORTSTATE>
		EVENT = new PdfName("Event");
	// 1145 2977:new             #2   <Class PdfName>
	// 1146 2980:dup             
	// 1147 2981:ldc2            #1673 <String "Event">
	// 1148 2984:invokespecial   #803 <Method void PdfName(String)>
	// 1149 2987:putstatic       #1675 <Field PdfName EVENT>
		F = new PdfName("F");
	// 1150 2990:new             #2   <Class PdfName>
	// 1151 2993:dup             
	// 1152 2994:ldc2            #1676 <String "F">
	// 1153 2997:invokespecial   #803 <Method void PdfName(String)>
	// 1154 3000:putstatic       #1678 <Field PdfName F>
		FAR = new PdfName("Far");
	// 1155 3003:new             #2   <Class PdfName>
	// 1156 3006:dup             
	// 1157 3007:ldc2            #1680 <String "Far">
	// 1158 3010:invokespecial   #803 <Method void PdfName(String)>
	// 1159 3013:putstatic       #1682 <Field PdfName FAR>
		FB = new PdfName("FB");
	// 1160 3016:new             #2   <Class PdfName>
	// 1161 3019:dup             
	// 1162 3020:ldc2            #1683 <String "FB">
	// 1163 3023:invokespecial   #803 <Method void PdfName(String)>
	// 1164 3026:putstatic       #1685 <Field PdfName FB>
		FD = new PdfName("FD");
	// 1165 3029:new             #2   <Class PdfName>
	// 1166 3032:dup             
	// 1167 3033:ldc2            #1686 <String "FD">
	// 1168 3036:invokespecial   #803 <Method void PdfName(String)>
	// 1169 3039:putstatic       #1688 <Field PdfName FD>
		FDECODEPARMS = new PdfName("FDecodeParms");
	// 1170 3042:new             #2   <Class PdfName>
	// 1171 3045:dup             
	// 1172 3046:ldc2            #1690 <String "FDecodeParms">
	// 1173 3049:invokespecial   #803 <Method void PdfName(String)>
	// 1174 3052:putstatic       #1692 <Field PdfName FDECODEPARMS>
		FDF = new PdfName("FDF");
	// 1175 3055:new             #2   <Class PdfName>
	// 1176 3058:dup             
	// 1177 3059:ldc2            #1693 <String "FDF">
	// 1178 3062:invokespecial   #803 <Method void PdfName(String)>
	// 1179 3065:putstatic       #1695 <Field PdfName FDF>
		FF = new PdfName("Ff");
	// 1180 3068:new             #2   <Class PdfName>
	// 1181 3071:dup             
	// 1182 3072:ldc2            #1697 <String "Ff">
	// 1183 3075:invokespecial   #803 <Method void PdfName(String)>
	// 1184 3078:putstatic       #1699 <Field PdfName FF>
		FFILTER = new PdfName("FFilter");
	// 1185 3081:new             #2   <Class PdfName>
	// 1186 3084:dup             
	// 1187 3085:ldc2            #1701 <String "FFilter">
	// 1188 3088:invokespecial   #803 <Method void PdfName(String)>
	// 1189 3091:putstatic       #1703 <Field PdfName FFILTER>
		FG = new PdfName("FG");
	// 1190 3094:new             #2   <Class PdfName>
	// 1191 3097:dup             
	// 1192 3098:ldc2            #1704 <String "FG">
	// 1193 3101:invokespecial   #803 <Method void PdfName(String)>
	// 1194 3104:putstatic       #1706 <Field PdfName FG>
		FIELDMDP = new PdfName("FieldMDP");
	// 1195 3107:new             #2   <Class PdfName>
	// 1196 3110:dup             
	// 1197 3111:ldc2            #1708 <String "FieldMDP">
	// 1198 3114:invokespecial   #803 <Method void PdfName(String)>
	// 1199 3117:putstatic       #1710 <Field PdfName FIELDMDP>
		FIELDS = new PdfName("Fields");
	// 1200 3120:new             #2   <Class PdfName>
	// 1201 3123:dup             
	// 1202 3124:ldc2            #1712 <String "Fields">
	// 1203 3127:invokespecial   #803 <Method void PdfName(String)>
	// 1204 3130:putstatic       #1714 <Field PdfName FIELDS>
		FIGURE = new PdfName("Figure");
	// 1205 3133:new             #2   <Class PdfName>
	// 1206 3136:dup             
	// 1207 3137:ldc2            #1716 <String "Figure">
	// 1208 3140:invokespecial   #803 <Method void PdfName(String)>
	// 1209 3143:putstatic       #1718 <Field PdfName FIGURE>
		FILEATTACHMENT = new PdfName("FileAttachment");
	// 1210 3146:new             #2   <Class PdfName>
	// 1211 3149:dup             
	// 1212 3150:ldc2            #1720 <String "FileAttachment">
	// 1213 3153:invokespecial   #803 <Method void PdfName(String)>
	// 1214 3156:putstatic       #1722 <Field PdfName FILEATTACHMENT>
		FILESPEC = new PdfName("Filespec");
	// 1215 3159:new             #2   <Class PdfName>
	// 1216 3162:dup             
	// 1217 3163:ldc2            #1724 <String "Filespec">
	// 1218 3166:invokespecial   #803 <Method void PdfName(String)>
	// 1219 3169:putstatic       #1726 <Field PdfName FILESPEC>
		FILTER = new PdfName("Filter");
	// 1220 3172:new             #2   <Class PdfName>
	// 1221 3175:dup             
	// 1222 3176:ldc2            #1728 <String "Filter">
	// 1223 3179:invokespecial   #803 <Method void PdfName(String)>
	// 1224 3182:putstatic       #1730 <Field PdfName FILTER>
		FIRST = new PdfName("First");
	// 1225 3185:new             #2   <Class PdfName>
	// 1226 3188:dup             
	// 1227 3189:ldc2            #1732 <String "First">
	// 1228 3192:invokespecial   #803 <Method void PdfName(String)>
	// 1229 3195:putstatic       #1734 <Field PdfName FIRST>
		FIRSTCHAR = new PdfName("FirstChar");
	// 1230 3198:new             #2   <Class PdfName>
	// 1231 3201:dup             
	// 1232 3202:ldc2            #1736 <String "FirstChar">
	// 1233 3205:invokespecial   #803 <Method void PdfName(String)>
	// 1234 3208:putstatic       #1738 <Field PdfName FIRSTCHAR>
		FIRSTPAGE = new PdfName("FirstPage");
	// 1235 3211:new             #2   <Class PdfName>
	// 1236 3214:dup             
	// 1237 3215:ldc2            #1740 <String "FirstPage">
	// 1238 3218:invokespecial   #803 <Method void PdfName(String)>
	// 1239 3221:putstatic       #1742 <Field PdfName FIRSTPAGE>
		FIT = new PdfName("Fit");
	// 1240 3224:new             #2   <Class PdfName>
	// 1241 3227:dup             
	// 1242 3228:ldc2            #1744 <String "Fit">
	// 1243 3231:invokespecial   #803 <Method void PdfName(String)>
	// 1244 3234:putstatic       #1746 <Field PdfName FIT>
		FITH = new PdfName("FitH");
	// 1245 3237:new             #2   <Class PdfName>
	// 1246 3240:dup             
	// 1247 3241:ldc2            #1748 <String "FitH">
	// 1248 3244:invokespecial   #803 <Method void PdfName(String)>
	// 1249 3247:putstatic       #1750 <Field PdfName FITH>
		FITV = new PdfName("FitV");
	// 1250 3250:new             #2   <Class PdfName>
	// 1251 3253:dup             
	// 1252 3254:ldc2            #1752 <String "FitV">
	// 1253 3257:invokespecial   #803 <Method void PdfName(String)>
	// 1254 3260:putstatic       #1754 <Field PdfName FITV>
		FITR = new PdfName("FitR");
	// 1255 3263:new             #2   <Class PdfName>
	// 1256 3266:dup             
	// 1257 3267:ldc2            #1756 <String "FitR">
	// 1258 3270:invokespecial   #803 <Method void PdfName(String)>
	// 1259 3273:putstatic       #1758 <Field PdfName FITR>
		FITB = new PdfName("FitB");
	// 1260 3276:new             #2   <Class PdfName>
	// 1261 3279:dup             
	// 1262 3280:ldc2            #1760 <String "FitB">
	// 1263 3283:invokespecial   #803 <Method void PdfName(String)>
	// 1264 3286:putstatic       #1762 <Field PdfName FITB>
		FITBH = new PdfName("FitBH");
	// 1265 3289:new             #2   <Class PdfName>
	// 1266 3292:dup             
	// 1267 3293:ldc2            #1764 <String "FitBH">
	// 1268 3296:invokespecial   #803 <Method void PdfName(String)>
	// 1269 3299:putstatic       #1766 <Field PdfName FITBH>
		FITBV = new PdfName("FitBV");
	// 1270 3302:new             #2   <Class PdfName>
	// 1271 3305:dup             
	// 1272 3306:ldc2            #1768 <String "FitBV">
	// 1273 3309:invokespecial   #803 <Method void PdfName(String)>
	// 1274 3312:putstatic       #1770 <Field PdfName FITBV>
		FITWINDOW = new PdfName("FitWindow");
	// 1275 3315:new             #2   <Class PdfName>
	// 1276 3318:dup             
	// 1277 3319:ldc2            #1772 <String "FitWindow">
	// 1278 3322:invokespecial   #803 <Method void PdfName(String)>
	// 1279 3325:putstatic       #1774 <Field PdfName FITWINDOW>
		FL = new PdfName("Fl");
	// 1280 3328:new             #2   <Class PdfName>
	// 1281 3331:dup             
	// 1282 3332:ldc2            #1776 <String "Fl">
	// 1283 3335:invokespecial   #803 <Method void PdfName(String)>
	// 1284 3338:putstatic       #1778 <Field PdfName FL>
		FLAGS = new PdfName("Flags");
	// 1285 3341:new             #2   <Class PdfName>
	// 1286 3344:dup             
	// 1287 3345:ldc2            #1780 <String "Flags">
	// 1288 3348:invokespecial   #803 <Method void PdfName(String)>
	// 1289 3351:putstatic       #1782 <Field PdfName FLAGS>
		FLASH = new PdfName("Flash");
	// 1290 3354:new             #2   <Class PdfName>
	// 1291 3357:dup             
	// 1292 3358:ldc2            #1784 <String "Flash">
	// 1293 3361:invokespecial   #803 <Method void PdfName(String)>
	// 1294 3364:putstatic       #1786 <Field PdfName FLASH>
		FLASHVARS = new PdfName("FlashVars");
	// 1295 3367:new             #2   <Class PdfName>
	// 1296 3370:dup             
	// 1297 3371:ldc2            #1788 <String "FlashVars">
	// 1298 3374:invokespecial   #803 <Method void PdfName(String)>
	// 1299 3377:putstatic       #1790 <Field PdfName FLASHVARS>
		FLATEDECODE = new PdfName("FlateDecode");
	// 1300 3380:new             #2   <Class PdfName>
	// 1301 3383:dup             
	// 1302 3384:ldc2            #1792 <String "FlateDecode">
	// 1303 3387:invokespecial   #803 <Method void PdfName(String)>
	// 1304 3390:putstatic       #1794 <Field PdfName FLATEDECODE>
		FO = new PdfName("Fo");
	// 1305 3393:new             #2   <Class PdfName>
	// 1306 3396:dup             
	// 1307 3397:ldc2            #1796 <String "Fo">
	// 1308 3400:invokespecial   #803 <Method void PdfName(String)>
	// 1309 3403:putstatic       #1798 <Field PdfName FO>
		FONT = new PdfName("Font");
	// 1310 3406:new             #2   <Class PdfName>
	// 1311 3409:dup             
	// 1312 3410:ldc2            #1800 <String "Font">
	// 1313 3413:invokespecial   #803 <Method void PdfName(String)>
	// 1314 3416:putstatic       #1802 <Field PdfName FONT>
		FONTBBOX = new PdfName("FontBBox");
	// 1315 3419:new             #2   <Class PdfName>
	// 1316 3422:dup             
	// 1317 3423:ldc2            #1804 <String "FontBBox">
	// 1318 3426:invokespecial   #803 <Method void PdfName(String)>
	// 1319 3429:putstatic       #1806 <Field PdfName FONTBBOX>
		FONTDESCRIPTOR = new PdfName("FontDescriptor");
	// 1320 3432:new             #2   <Class PdfName>
	// 1321 3435:dup             
	// 1322 3436:ldc2            #1808 <String "FontDescriptor">
	// 1323 3439:invokespecial   #803 <Method void PdfName(String)>
	// 1324 3442:putstatic       #1810 <Field PdfName FONTDESCRIPTOR>
		FONTFAMILY = new PdfName("FontFamily");
	// 1325 3445:new             #2   <Class PdfName>
	// 1326 3448:dup             
	// 1327 3449:ldc2            #1812 <String "FontFamily">
	// 1328 3452:invokespecial   #803 <Method void PdfName(String)>
	// 1329 3455:putstatic       #1814 <Field PdfName FONTFAMILY>
		FONTFILE = new PdfName("FontFile");
	// 1330 3458:new             #2   <Class PdfName>
	// 1331 3461:dup             
	// 1332 3462:ldc2            #1816 <String "FontFile">
	// 1333 3465:invokespecial   #803 <Method void PdfName(String)>
	// 1334 3468:putstatic       #1818 <Field PdfName FONTFILE>
		FONTFILE2 = new PdfName("FontFile2");
	// 1335 3471:new             #2   <Class PdfName>
	// 1336 3474:dup             
	// 1337 3475:ldc2            #1820 <String "FontFile2">
	// 1338 3478:invokespecial   #803 <Method void PdfName(String)>
	// 1339 3481:putstatic       #1822 <Field PdfName FONTFILE2>
		FONTFILE3 = new PdfName("FontFile3");
	// 1340 3484:new             #2   <Class PdfName>
	// 1341 3487:dup             
	// 1342 3488:ldc2            #1824 <String "FontFile3">
	// 1343 3491:invokespecial   #803 <Method void PdfName(String)>
	// 1344 3494:putstatic       #1826 <Field PdfName FONTFILE3>
		FONTMATRIX = new PdfName("FontMatrix");
	// 1345 3497:new             #2   <Class PdfName>
	// 1346 3500:dup             
	// 1347 3501:ldc2            #1828 <String "FontMatrix">
	// 1348 3504:invokespecial   #803 <Method void PdfName(String)>
	// 1349 3507:putstatic       #1830 <Field PdfName FONTMATRIX>
		FONTNAME = new PdfName("FontName");
	// 1350 3510:new             #2   <Class PdfName>
	// 1351 3513:dup             
	// 1352 3514:ldc2            #1832 <String "FontName">
	// 1353 3517:invokespecial   #803 <Method void PdfName(String)>
	// 1354 3520:putstatic       #1834 <Field PdfName FONTNAME>
		FONTWEIGHT = new PdfName("FontWeight");
	// 1355 3523:new             #2   <Class PdfName>
	// 1356 3526:dup             
	// 1357 3527:ldc2            #1836 <String "FontWeight">
	// 1358 3530:invokespecial   #803 <Method void PdfName(String)>
	// 1359 3533:putstatic       #1838 <Field PdfName FONTWEIGHT>
		FOREGROUND = new PdfName("Foreground");
	// 1360 3536:new             #2   <Class PdfName>
	// 1361 3539:dup             
	// 1362 3540:ldc2            #1840 <String "Foreground">
	// 1363 3543:invokespecial   #803 <Method void PdfName(String)>
	// 1364 3546:putstatic       #1842 <Field PdfName FOREGROUND>
		FORM = new PdfName("Form");
	// 1365 3549:new             #2   <Class PdfName>
	// 1366 3552:dup             
	// 1367 3553:ldc2            #1844 <String "Form">
	// 1368 3556:invokespecial   #803 <Method void PdfName(String)>
	// 1369 3559:putstatic       #1846 <Field PdfName FORM>
		FORMTYPE = new PdfName("FormType");
	// 1370 3562:new             #2   <Class PdfName>
	// 1371 3565:dup             
	// 1372 3566:ldc2            #1848 <String "FormType">
	// 1373 3569:invokespecial   #803 <Method void PdfName(String)>
	// 1374 3572:putstatic       #1850 <Field PdfName FORMTYPE>
		FORMULA = new PdfName("Formula");
	// 1375 3575:new             #2   <Class PdfName>
	// 1376 3578:dup             
	// 1377 3579:ldc2            #1852 <String "Formula">
	// 1378 3582:invokespecial   #803 <Method void PdfName(String)>
	// 1379 3585:putstatic       #1854 <Field PdfName FORMULA>
		FREETEXT = new PdfName("FreeText");
	// 1380 3588:new             #2   <Class PdfName>
	// 1381 3591:dup             
	// 1382 3592:ldc2            #1856 <String "FreeText">
	// 1383 3595:invokespecial   #803 <Method void PdfName(String)>
	// 1384 3598:putstatic       #1858 <Field PdfName FREETEXT>
		FRM = new PdfName("FRM");
	// 1385 3601:new             #2   <Class PdfName>
	// 1386 3604:dup             
	// 1387 3605:ldc2            #1859 <String "FRM">
	// 1388 3608:invokespecial   #803 <Method void PdfName(String)>
	// 1389 3611:putstatic       #1861 <Field PdfName FRM>
		FS = new PdfName("FS");
	// 1390 3614:new             #2   <Class PdfName>
	// 1391 3617:dup             
	// 1392 3618:ldc2            #1862 <String "FS">
	// 1393 3621:invokespecial   #803 <Method void PdfName(String)>
	// 1394 3624:putstatic       #1864 <Field PdfName FS>
		FT = new PdfName("FT");
	// 1395 3627:new             #2   <Class PdfName>
	// 1396 3630:dup             
	// 1397 3631:ldc2            #1865 <String "FT">
	// 1398 3634:invokespecial   #803 <Method void PdfName(String)>
	// 1399 3637:putstatic       #1867 <Field PdfName FT>
		FULLSCREEN = new PdfName("FullScreen");
	// 1400 3640:new             #2   <Class PdfName>
	// 1401 3643:dup             
	// 1402 3644:ldc2            #1869 <String "FullScreen">
	// 1403 3647:invokespecial   #803 <Method void PdfName(String)>
	// 1404 3650:putstatic       #1871 <Field PdfName FULLSCREEN>
		FUNCTION = new PdfName("Function");
	// 1405 3653:new             #2   <Class PdfName>
	// 1406 3656:dup             
	// 1407 3657:ldc2            #1873 <String "Function">
	// 1408 3660:invokespecial   #803 <Method void PdfName(String)>
	// 1409 3663:putstatic       #1875 <Field PdfName FUNCTION>
		FUNCTIONS = new PdfName("Functions");
	// 1410 3666:new             #2   <Class PdfName>
	// 1411 3669:dup             
	// 1412 3670:ldc2            #1877 <String "Functions">
	// 1413 3673:invokespecial   #803 <Method void PdfName(String)>
	// 1414 3676:putstatic       #1879 <Field PdfName FUNCTIONS>
		FUNCTIONTYPE = new PdfName("FunctionType");
	// 1415 3679:new             #2   <Class PdfName>
	// 1416 3682:dup             
	// 1417 3683:ldc2            #1881 <String "FunctionType">
	// 1418 3686:invokespecial   #803 <Method void PdfName(String)>
	// 1419 3689:putstatic       #1883 <Field PdfName FUNCTIONTYPE>
		GAMMA = new PdfName("Gamma");
	// 1420 3692:new             #2   <Class PdfName>
	// 1421 3695:dup             
	// 1422 3696:ldc2            #1885 <String "Gamma">
	// 1423 3699:invokespecial   #803 <Method void PdfName(String)>
	// 1424 3702:putstatic       #1887 <Field PdfName GAMMA>
		GBK = new PdfName("GBK");
	// 1425 3705:new             #2   <Class PdfName>
	// 1426 3708:dup             
	// 1427 3709:ldc2            #1888 <String "GBK">
	// 1428 3712:invokespecial   #803 <Method void PdfName(String)>
	// 1429 3715:putstatic       #1890 <Field PdfName GBK>
		GCS = new PdfName("GCS");
	// 1430 3718:new             #2   <Class PdfName>
	// 1431 3721:dup             
	// 1432 3722:ldc2            #1891 <String "GCS">
	// 1433 3725:invokespecial   #803 <Method void PdfName(String)>
	// 1434 3728:putstatic       #1893 <Field PdfName GCS>
		GEO = new PdfName("GEO");
	// 1435 3731:new             #2   <Class PdfName>
	// 1436 3734:dup             
	// 1437 3735:ldc2            #1894 <String "GEO">
	// 1438 3738:invokespecial   #803 <Method void PdfName(String)>
	// 1439 3741:putstatic       #1896 <Field PdfName GEO>
		GEOGCS = new PdfName("GEOGCS");
	// 1440 3744:new             #2   <Class PdfName>
	// 1441 3747:dup             
	// 1442 3748:ldc2            #1897 <String "GEOGCS">
	// 1443 3751:invokespecial   #803 <Method void PdfName(String)>
	// 1444 3754:putstatic       #1899 <Field PdfName GEOGCS>
		GLITTER = new PdfName("Glitter");
	// 1445 3757:new             #2   <Class PdfName>
	// 1446 3760:dup             
	// 1447 3761:ldc2            #1901 <String "Glitter">
	// 1448 3764:invokespecial   #803 <Method void PdfName(String)>
	// 1449 3767:putstatic       #1903 <Field PdfName GLITTER>
		GOTO = new PdfName("GoTo");
	// 1450 3770:new             #2   <Class PdfName>
	// 1451 3773:dup             
	// 1452 3774:ldc2            #1905 <String "GoTo">
	// 1453 3777:invokespecial   #803 <Method void PdfName(String)>
	// 1454 3780:putstatic       #1907 <Field PdfName GOTO>
		GOTO3DVIEW = new PdfName("GoTo3DView");
	// 1455 3783:new             #2   <Class PdfName>
	// 1456 3786:dup             
	// 1457 3787:ldc2            #1909 <String "GoTo3DView">
	// 1458 3790:invokespecial   #803 <Method void PdfName(String)>
	// 1459 3793:putstatic       #1911 <Field PdfName GOTO3DVIEW>
		GOTOE = new PdfName("GoToE");
	// 1460 3796:new             #2   <Class PdfName>
	// 1461 3799:dup             
	// 1462 3800:ldc2            #1913 <String "GoToE">
	// 1463 3803:invokespecial   #803 <Method void PdfName(String)>
	// 1464 3806:putstatic       #1915 <Field PdfName GOTOE>
		GOTOR = new PdfName("GoToR");
	// 1465 3809:new             #2   <Class PdfName>
	// 1466 3812:dup             
	// 1467 3813:ldc2            #1917 <String "GoToR">
	// 1468 3816:invokespecial   #803 <Method void PdfName(String)>
	// 1469 3819:putstatic       #1919 <Field PdfName GOTOR>
		GPTS = new PdfName("GPTS");
	// 1470 3822:new             #2   <Class PdfName>
	// 1471 3825:dup             
	// 1472 3826:ldc2            #1920 <String "GPTS">
	// 1473 3829:invokespecial   #803 <Method void PdfName(String)>
	// 1474 3832:putstatic       #1922 <Field PdfName GPTS>
		GROUP = new PdfName("Group");
	// 1475 3835:new             #2   <Class PdfName>
	// 1476 3838:dup             
	// 1477 3839:ldc2            #1924 <String "Group">
	// 1478 3842:invokespecial   #803 <Method void PdfName(String)>
	// 1479 3845:putstatic       #1926 <Field PdfName GROUP>
		GTS_PDFA1 = new PdfName("GTS_PDFA1");
	// 1480 3848:new             #2   <Class PdfName>
	// 1481 3851:dup             
	// 1482 3852:ldc2            #1927 <String "GTS_PDFA1">
	// 1483 3855:invokespecial   #803 <Method void PdfName(String)>
	// 1484 3858:putstatic       #1929 <Field PdfName GTS_PDFA1>
		GTS_PDFX = new PdfName("GTS_PDFX");
	// 1485 3861:new             #2   <Class PdfName>
	// 1486 3864:dup             
	// 1487 3865:ldc2            #1930 <String "GTS_PDFX">
	// 1488 3868:invokespecial   #803 <Method void PdfName(String)>
	// 1489 3871:putstatic       #1932 <Field PdfName GTS_PDFX>
		GTS_PDFXVERSION = new PdfName("GTS_PDFXVersion");
	// 1490 3874:new             #2   <Class PdfName>
	// 1491 3877:dup             
	// 1492 3878:ldc2            #1934 <String "GTS_PDFXVersion">
	// 1493 3881:invokespecial   #803 <Method void PdfName(String)>
	// 1494 3884:putstatic       #1936 <Field PdfName GTS_PDFXVERSION>
		H = new PdfName("H");
	// 1495 3887:new             #2   <Class PdfName>
	// 1496 3890:dup             
	// 1497 3891:ldc2            #1937 <String "H">
	// 1498 3894:invokespecial   #803 <Method void PdfName(String)>
	// 1499 3897:putstatic       #1939 <Field PdfName H>
		H1 = new PdfName("H1");
	// 1500 3900:new             #2   <Class PdfName>
	// 1501 3903:dup             
	// 1502 3904:ldc2            #1940 <String "H1">
	// 1503 3907:invokespecial   #803 <Method void PdfName(String)>
	// 1504 3910:putstatic       #1942 <Field PdfName H1>
		H2 = new PdfName("H2");
	// 1505 3913:new             #2   <Class PdfName>
	// 1506 3916:dup             
	// 1507 3917:ldc2            #1943 <String "H2">
	// 1508 3920:invokespecial   #803 <Method void PdfName(String)>
	// 1509 3923:putstatic       #1945 <Field PdfName H2>
		H3 = new PdfName("H3");
	// 1510 3926:new             #2   <Class PdfName>
	// 1511 3929:dup             
	// 1512 3930:ldc2            #1946 <String "H3">
	// 1513 3933:invokespecial   #803 <Method void PdfName(String)>
	// 1514 3936:putstatic       #1948 <Field PdfName H3>
		H4 = new PdfName("H4");
	// 1515 3939:new             #2   <Class PdfName>
	// 1516 3942:dup             
	// 1517 3943:ldc2            #1949 <String "H4">
	// 1518 3946:invokespecial   #803 <Method void PdfName(String)>
	// 1519 3949:putstatic       #1951 <Field PdfName H4>
		H5 = new PdfName("H5");
	// 1520 3952:new             #2   <Class PdfName>
	// 1521 3955:dup             
	// 1522 3956:ldc2            #1952 <String "H5">
	// 1523 3959:invokespecial   #803 <Method void PdfName(String)>
	// 1524 3962:putstatic       #1954 <Field PdfName H5>
		H6 = new PdfName("H6");
	// 1525 3965:new             #2   <Class PdfName>
	// 1526 3968:dup             
	// 1527 3969:ldc2            #1955 <String "H6">
	// 1528 3972:invokespecial   #803 <Method void PdfName(String)>
	// 1529 3975:putstatic       #1957 <Field PdfName H6>
		HALFTONENAME = new PdfName("HalftoneName");
	// 1530 3978:new             #2   <Class PdfName>
	// 1531 3981:dup             
	// 1532 3982:ldc2            #1959 <String "HalftoneName">
	// 1533 3985:invokespecial   #803 <Method void PdfName(String)>
	// 1534 3988:putstatic       #1961 <Field PdfName HALFTONENAME>
		HALFTONETYPE = new PdfName("HalftoneType");
	// 1535 3991:new             #2   <Class PdfName>
	// 1536 3994:dup             
	// 1537 3995:ldc2            #1963 <String "HalftoneType">
	// 1538 3998:invokespecial   #803 <Method void PdfName(String)>
	// 1539 4001:putstatic       #1965 <Field PdfName HALFTONETYPE>
		HALIGN = new PdfName("HAlign");
	// 1540 4004:new             #2   <Class PdfName>
	// 1541 4007:dup             
	// 1542 4008:ldc2            #1967 <String "HAlign">
	// 1543 4011:invokespecial   #803 <Method void PdfName(String)>
	// 1544 4014:putstatic       #1969 <Field PdfName HALIGN>
		HEADERS = new PdfName("Headers");
	// 1545 4017:new             #2   <Class PdfName>
	// 1546 4020:dup             
	// 1547 4021:ldc2            #1971 <String "Headers">
	// 1548 4024:invokespecial   #803 <Method void PdfName(String)>
	// 1549 4027:putstatic       #1973 <Field PdfName HEADERS>
		HEIGHT = new PdfName("Height");
	// 1550 4030:new             #2   <Class PdfName>
	// 1551 4033:dup             
	// 1552 4034:ldc2            #1975 <String "Height">
	// 1553 4037:invokespecial   #803 <Method void PdfName(String)>
	// 1554 4040:putstatic       #1977 <Field PdfName HEIGHT>
		HELV = new PdfName("Helv");
	// 1555 4043:new             #2   <Class PdfName>
	// 1556 4046:dup             
	// 1557 4047:ldc2            #1979 <String "Helv">
	// 1558 4050:invokespecial   #803 <Method void PdfName(String)>
	// 1559 4053:putstatic       #1981 <Field PdfName HELV>
		HELVETICA = new PdfName("Helvetica");
	// 1560 4056:new             #2   <Class PdfName>
	// 1561 4059:dup             
	// 1562 4060:ldc2            #1983 <String "Helvetica">
	// 1563 4063:invokespecial   #803 <Method void PdfName(String)>
	// 1564 4066:putstatic       #1985 <Field PdfName HELVETICA>
		HELVETICA_BOLD = new PdfName("Helvetica-Bold");
	// 1565 4069:new             #2   <Class PdfName>
	// 1566 4072:dup             
	// 1567 4073:ldc2            #1987 <String "Helvetica-Bold">
	// 1568 4076:invokespecial   #803 <Method void PdfName(String)>
	// 1569 4079:putstatic       #1989 <Field PdfName HELVETICA_BOLD>
		HELVETICA_OBLIQUE = new PdfName("Helvetica-Oblique");
	// 1570 4082:new             #2   <Class PdfName>
	// 1571 4085:dup             
	// 1572 4086:ldc2            #1991 <String "Helvetica-Oblique">
	// 1573 4089:invokespecial   #803 <Method void PdfName(String)>
	// 1574 4092:putstatic       #1993 <Field PdfName HELVETICA_OBLIQUE>
		HELVETICA_BOLDOBLIQUE = new PdfName("Helvetica-BoldOblique");
	// 1575 4095:new             #2   <Class PdfName>
	// 1576 4098:dup             
	// 1577 4099:ldc2            #1995 <String "Helvetica-BoldOblique">
	// 1578 4102:invokespecial   #803 <Method void PdfName(String)>
	// 1579 4105:putstatic       #1997 <Field PdfName HELVETICA_BOLDOBLIQUE>
		HF = new PdfName("HF");
	// 1580 4108:new             #2   <Class PdfName>
	// 1581 4111:dup             
	// 1582 4112:ldc2            #1998 <String "HF">
	// 1583 4115:invokespecial   #803 <Method void PdfName(String)>
	// 1584 4118:putstatic       #2000 <Field PdfName HF>
		HID = new PdfName("Hid");
	// 1585 4121:new             #2   <Class PdfName>
	// 1586 4124:dup             
	// 1587 4125:ldc2            #2002 <String "Hid">
	// 1588 4128:invokespecial   #803 <Method void PdfName(String)>
	// 1589 4131:putstatic       #2004 <Field PdfName HID>
		HIDE = new PdfName("Hide");
	// 1590 4134:new             #2   <Class PdfName>
	// 1591 4137:dup             
	// 1592 4138:ldc2            #2006 <String "Hide">
	// 1593 4141:invokespecial   #803 <Method void PdfName(String)>
	// 1594 4144:putstatic       #2008 <Field PdfName HIDE>
		HIDEMENUBAR = new PdfName("HideMenubar");
	// 1595 4147:new             #2   <Class PdfName>
	// 1596 4150:dup             
	// 1597 4151:ldc2            #2010 <String "HideMenubar">
	// 1598 4154:invokespecial   #803 <Method void PdfName(String)>
	// 1599 4157:putstatic       #2012 <Field PdfName HIDEMENUBAR>
		HIDETOOLBAR = new PdfName("HideToolbar");
	// 1600 4160:new             #2   <Class PdfName>
	// 1601 4163:dup             
	// 1602 4164:ldc2            #2014 <String "HideToolbar">
	// 1603 4167:invokespecial   #803 <Method void PdfName(String)>
	// 1604 4170:putstatic       #2016 <Field PdfName HIDETOOLBAR>
		HIDEWINDOWUI = new PdfName("HideWindowUI");
	// 1605 4173:new             #2   <Class PdfName>
	// 1606 4176:dup             
	// 1607 4177:ldc2            #2018 <String "HideWindowUI">
	// 1608 4180:invokespecial   #803 <Method void PdfName(String)>
	// 1609 4183:putstatic       #2020 <Field PdfName HIDEWINDOWUI>
		HIGHLIGHT = new PdfName("Highlight");
	// 1610 4186:new             #2   <Class PdfName>
	// 1611 4189:dup             
	// 1612 4190:ldc2            #2022 <String "Highlight">
	// 1613 4193:invokespecial   #803 <Method void PdfName(String)>
	// 1614 4196:putstatic       #2024 <Field PdfName HIGHLIGHT>
		HOFFSET = new PdfName("HOffset");
	// 1615 4199:new             #2   <Class PdfName>
	// 1616 4202:dup             
	// 1617 4203:ldc2            #2026 <String "HOffset">
	// 1618 4206:invokespecial   #803 <Method void PdfName(String)>
	// 1619 4209:putstatic       #2028 <Field PdfName HOFFSET>
		HT = new PdfName("HT");
	// 1620 4212:new             #2   <Class PdfName>
	// 1621 4215:dup             
	// 1622 4216:ldc2            #2029 <String "HT">
	// 1623 4219:invokespecial   #803 <Method void PdfName(String)>
	// 1624 4222:putstatic       #2031 <Field PdfName HT>
		HTP = new PdfName("HTP");
	// 1625 4225:new             #2   <Class PdfName>
	// 1626 4228:dup             
	// 1627 4229:ldc2            #2032 <String "HTP">
	// 1628 4232:invokespecial   #803 <Method void PdfName(String)>
	// 1629 4235:putstatic       #2034 <Field PdfName HTP>
		I = new PdfName("I");
	// 1630 4238:new             #2   <Class PdfName>
	// 1631 4241:dup             
	// 1632 4242:ldc2            #2035 <String "I">
	// 1633 4245:invokespecial   #803 <Method void PdfName(String)>
	// 1634 4248:putstatic       #2037 <Field PdfName I>
		IC = new PdfName("IC");
	// 1635 4251:new             #2   <Class PdfName>
	// 1636 4254:dup             
	// 1637 4255:ldc2            #2038 <String "IC">
	// 1638 4258:invokespecial   #803 <Method void PdfName(String)>
	// 1639 4261:putstatic       #2040 <Field PdfName IC>
		ICCBASED = new PdfName("ICCBased");
	// 1640 4264:new             #2   <Class PdfName>
	// 1641 4267:dup             
	// 1642 4268:ldc2            #2042 <String "ICCBased">
	// 1643 4271:invokespecial   #803 <Method void PdfName(String)>
	// 1644 4274:putstatic       #2044 <Field PdfName ICCBASED>
		ID = new PdfName("ID");
	// 1645 4277:new             #2   <Class PdfName>
	// 1646 4280:dup             
	// 1647 4281:ldc2            #2045 <String "ID">
	// 1648 4284:invokespecial   #803 <Method void PdfName(String)>
	// 1649 4287:putstatic       #2047 <Field PdfName ID>
		IDENTITY = new PdfName("Identity");
	// 1650 4290:new             #2   <Class PdfName>
	// 1651 4293:dup             
	// 1652 4294:ldc2            #2049 <String "Identity">
	// 1653 4297:invokespecial   #803 <Method void PdfName(String)>
	// 1654 4300:putstatic       #2051 <Field PdfName IDENTITY>
		IDTREE = new PdfName("IDTree");
	// 1655 4303:new             #2   <Class PdfName>
	// 1656 4306:dup             
	// 1657 4307:ldc2            #2053 <String "IDTree">
	// 1658 4310:invokespecial   #803 <Method void PdfName(String)>
	// 1659 4313:putstatic       #2055 <Field PdfName IDTREE>
		IF = new PdfName("IF");
	// 1660 4316:new             #2   <Class PdfName>
	// 1661 4319:dup             
	// 1662 4320:ldc2            #2056 <String "IF">
	// 1663 4323:invokespecial   #803 <Method void PdfName(String)>
	// 1664 4326:putstatic       #2058 <Field PdfName IF>
		IM = new PdfName("IM");
	// 1665 4329:new             #2   <Class PdfName>
	// 1666 4332:dup             
	// 1667 4333:ldc2            #2059 <String "IM">
	// 1668 4336:invokespecial   #803 <Method void PdfName(String)>
	// 1669 4339:putstatic       #2061 <Field PdfName IM>
		IMAGE = new PdfName("Image");
	// 1670 4342:new             #2   <Class PdfName>
	// 1671 4345:dup             
	// 1672 4346:ldc2            #2063 <String "Image">
	// 1673 4349:invokespecial   #803 <Method void PdfName(String)>
	// 1674 4352:putstatic       #2065 <Field PdfName IMAGE>
		IMAGEB = new PdfName("ImageB");
	// 1675 4355:new             #2   <Class PdfName>
	// 1676 4358:dup             
	// 1677 4359:ldc2            #2067 <String "ImageB">
	// 1678 4362:invokespecial   #803 <Method void PdfName(String)>
	// 1679 4365:putstatic       #2069 <Field PdfName IMAGEB>
		IMAGEC = new PdfName("ImageC");
	// 1680 4368:new             #2   <Class PdfName>
	// 1681 4371:dup             
	// 1682 4372:ldc2            #2071 <String "ImageC">
	// 1683 4375:invokespecial   #803 <Method void PdfName(String)>
	// 1684 4378:putstatic       #2073 <Field PdfName IMAGEC>
		IMAGEI = new PdfName("ImageI");
	// 1685 4381:new             #2   <Class PdfName>
	// 1686 4384:dup             
	// 1687 4385:ldc2            #2075 <String "ImageI">
	// 1688 4388:invokespecial   #803 <Method void PdfName(String)>
	// 1689 4391:putstatic       #2077 <Field PdfName IMAGEI>
		IMAGEMASK = new PdfName("ImageMask");
	// 1690 4394:new             #2   <Class PdfName>
	// 1691 4397:dup             
	// 1692 4398:ldc2            #2079 <String "ImageMask">
	// 1693 4401:invokespecial   #803 <Method void PdfName(String)>
	// 1694 4404:putstatic       #2081 <Field PdfName IMAGEMASK>
		INCLUDE = new PdfName("Include");
	// 1695 4407:new             #2   <Class PdfName>
	// 1696 4410:dup             
	// 1697 4411:ldc2            #2083 <String "Include">
	// 1698 4414:invokespecial   #803 <Method void PdfName(String)>
	// 1699 4417:putstatic       #2085 <Field PdfName INCLUDE>
		IND = new PdfName("Ind");
	// 1700 4420:new             #2   <Class PdfName>
	// 1701 4423:dup             
	// 1702 4424:ldc2            #2087 <String "Ind">
	// 1703 4427:invokespecial   #803 <Method void PdfName(String)>
	// 1704 4430:putstatic       #2089 <Field PdfName IND>
		INDEX = new PdfName("Index");
	// 1705 4433:new             #2   <Class PdfName>
	// 1706 4436:dup             
	// 1707 4437:ldc2            #2091 <String "Index">
	// 1708 4440:invokespecial   #803 <Method void PdfName(String)>
	// 1709 4443:putstatic       #2093 <Field PdfName INDEX>
		INDEXED = new PdfName("Indexed");
	// 1710 4446:new             #2   <Class PdfName>
	// 1711 4449:dup             
	// 1712 4450:ldc2            #2095 <String "Indexed">
	// 1713 4453:invokespecial   #803 <Method void PdfName(String)>
	// 1714 4456:putstatic       #2097 <Field PdfName INDEXED>
		INFO = new PdfName("Info");
	// 1715 4459:new             #2   <Class PdfName>
	// 1716 4462:dup             
	// 1717 4463:ldc2            #2099 <String "Info">
	// 1718 4466:invokespecial   #803 <Method void PdfName(String)>
	// 1719 4469:putstatic       #2101 <Field PdfName INFO>
		INK = new PdfName("Ink");
	// 1720 4472:new             #2   <Class PdfName>
	// 1721 4475:dup             
	// 1722 4476:ldc2            #2103 <String "Ink">
	// 1723 4479:invokespecial   #803 <Method void PdfName(String)>
	// 1724 4482:putstatic       #2105 <Field PdfName INK>
		INKLIST = new PdfName("InkList");
	// 1725 4485:new             #2   <Class PdfName>
	// 1726 4488:dup             
	// 1727 4489:ldc2            #2107 <String "InkList">
	// 1728 4492:invokespecial   #803 <Method void PdfName(String)>
	// 1729 4495:putstatic       #2109 <Field PdfName INKLIST>
		INSTANCES = new PdfName("Instances");
	// 1730 4498:new             #2   <Class PdfName>
	// 1731 4501:dup             
	// 1732 4502:ldc2            #2111 <String "Instances">
	// 1733 4505:invokespecial   #803 <Method void PdfName(String)>
	// 1734 4508:putstatic       #2113 <Field PdfName INSTANCES>
		IMPORTDATA = new PdfName("ImportData");
	// 1735 4511:new             #2   <Class PdfName>
	// 1736 4514:dup             
	// 1737 4515:ldc2            #2115 <String "ImportData">
	// 1738 4518:invokespecial   #803 <Method void PdfName(String)>
	// 1739 4521:putstatic       #2117 <Field PdfName IMPORTDATA>
		INTENT = new PdfName("Intent");
	// 1740 4524:new             #2   <Class PdfName>
	// 1741 4527:dup             
	// 1742 4528:ldc2            #2119 <String "Intent">
	// 1743 4531:invokespecial   #803 <Method void PdfName(String)>
	// 1744 4534:putstatic       #2121 <Field PdfName INTENT>
		INTERPOLATE = new PdfName("Interpolate");
	// 1745 4537:new             #2   <Class PdfName>
	// 1746 4540:dup             
	// 1747 4541:ldc2            #2123 <String "Interpolate">
	// 1748 4544:invokespecial   #803 <Method void PdfName(String)>
	// 1749 4547:putstatic       #2125 <Field PdfName INTERPOLATE>
		ISMAP = new PdfName("IsMap");
	// 1750 4550:new             #2   <Class PdfName>
	// 1751 4553:dup             
	// 1752 4554:ldc2            #2127 <String "IsMap">
	// 1753 4557:invokespecial   #803 <Method void PdfName(String)>
	// 1754 4560:putstatic       #2129 <Field PdfName ISMAP>
		IRT = new PdfName("IRT");
	// 1755 4563:new             #2   <Class PdfName>
	// 1756 4566:dup             
	// 1757 4567:ldc2            #2130 <String "IRT">
	// 1758 4570:invokespecial   #803 <Method void PdfName(String)>
	// 1759 4573:putstatic       #2132 <Field PdfName IRT>
		ITALICANGLE = new PdfName("ItalicAngle");
	// 1760 4576:new             #2   <Class PdfName>
	// 1761 4579:dup             
	// 1762 4580:ldc2            #2134 <String "ItalicAngle">
	// 1763 4583:invokespecial   #803 <Method void PdfName(String)>
	// 1764 4586:putstatic       #2136 <Field PdfName ITALICANGLE>
		ITXT = new PdfName("ITXT");
	// 1765 4589:new             #2   <Class PdfName>
	// 1766 4592:dup             
	// 1767 4593:ldc2            #2137 <String "ITXT">
	// 1768 4596:invokespecial   #803 <Method void PdfName(String)>
	// 1769 4599:putstatic       #2139 <Field PdfName ITXT>
		IX = new PdfName("IX");
	// 1770 4602:new             #2   <Class PdfName>
	// 1771 4605:dup             
	// 1772 4606:ldc2            #2140 <String "IX">
	// 1773 4609:invokespecial   #803 <Method void PdfName(String)>
	// 1774 4612:putstatic       #2142 <Field PdfName IX>
		JAVASCRIPT = new PdfName("JavaScript");
	// 1775 4615:new             #2   <Class PdfName>
	// 1776 4618:dup             
	// 1777 4619:ldc2            #2144 <String "JavaScript">
	// 1778 4622:invokespecial   #803 <Method void PdfName(String)>
	// 1779 4625:putstatic       #2146 <Field PdfName JAVASCRIPT>
		JBIG2DECODE = new PdfName("JBIG2Decode");
	// 1780 4628:new             #2   <Class PdfName>
	// 1781 4631:dup             
	// 1782 4632:ldc2            #2148 <String "JBIG2Decode">
	// 1783 4635:invokespecial   #803 <Method void PdfName(String)>
	// 1784 4638:putstatic       #2150 <Field PdfName JBIG2DECODE>
		JBIG2GLOBALS = new PdfName("JBIG2Globals");
	// 1785 4641:new             #2   <Class PdfName>
	// 1786 4644:dup             
	// 1787 4645:ldc2            #2152 <String "JBIG2Globals">
	// 1788 4648:invokespecial   #803 <Method void PdfName(String)>
	// 1789 4651:putstatic       #2154 <Field PdfName JBIG2GLOBALS>
		JPXDECODE = new PdfName("JPXDecode");
	// 1790 4654:new             #2   <Class PdfName>
	// 1791 4657:dup             
	// 1792 4658:ldc2            #2156 <String "JPXDecode">
	// 1793 4661:invokespecial   #803 <Method void PdfName(String)>
	// 1794 4664:putstatic       #2158 <Field PdfName JPXDECODE>
		JS = new PdfName("JS");
	// 1795 4667:new             #2   <Class PdfName>
	// 1796 4670:dup             
	// 1797 4671:ldc2            #2159 <String "JS">
	// 1798 4674:invokespecial   #803 <Method void PdfName(String)>
	// 1799 4677:putstatic       #2161 <Field PdfName JS>
		JUSTIFY = new PdfName("Justify");
	// 1800 4680:new             #2   <Class PdfName>
	// 1801 4683:dup             
	// 1802 4684:ldc2            #2163 <String "Justify">
	// 1803 4687:invokespecial   #803 <Method void PdfName(String)>
	// 1804 4690:putstatic       #2165 <Field PdfName JUSTIFY>
		K = new PdfName("K");
	// 1805 4693:new             #2   <Class PdfName>
	// 1806 4696:dup             
	// 1807 4697:ldc2            #2166 <String "K">
	// 1808 4700:invokespecial   #803 <Method void PdfName(String)>
	// 1809 4703:putstatic       #2168 <Field PdfName K>
		KEYWORDS = new PdfName("Keywords");
	// 1810 4706:new             #2   <Class PdfName>
	// 1811 4709:dup             
	// 1812 4710:ldc2            #2170 <String "Keywords">
	// 1813 4713:invokespecial   #803 <Method void PdfName(String)>
	// 1814 4716:putstatic       #2172 <Field PdfName KEYWORDS>
		KIDS = new PdfName("Kids");
	// 1815 4719:new             #2   <Class PdfName>
	// 1816 4722:dup             
	// 1817 4723:ldc2            #2174 <String "Kids">
	// 1818 4726:invokespecial   #803 <Method void PdfName(String)>
	// 1819 4729:putstatic       #2176 <Field PdfName KIDS>
		L = new PdfName("L");
	// 1820 4732:new             #2   <Class PdfName>
	// 1821 4735:dup             
	// 1822 4736:ldc2            #2177 <String "L">
	// 1823 4739:invokespecial   #803 <Method void PdfName(String)>
	// 1824 4742:putstatic       #2179 <Field PdfName L>
		L2R = new PdfName("L2R");
	// 1825 4745:new             #2   <Class PdfName>
	// 1826 4748:dup             
	// 1827 4749:ldc2            #2180 <String "L2R">
	// 1828 4752:invokespecial   #803 <Method void PdfName(String)>
	// 1829 4755:putstatic       #2182 <Field PdfName L2R>
		LAB = new PdfName("Lab");
	// 1830 4758:new             #2   <Class PdfName>
	// 1831 4761:dup             
	// 1832 4762:ldc2            #2184 <String "Lab">
	// 1833 4765:invokespecial   #803 <Method void PdfName(String)>
	// 1834 4768:putstatic       #2186 <Field PdfName LAB>
		LANG = new PdfName("Lang");
	// 1835 4771:new             #2   <Class PdfName>
	// 1836 4774:dup             
	// 1837 4775:ldc2            #2188 <String "Lang">
	// 1838 4778:invokespecial   #803 <Method void PdfName(String)>
	// 1839 4781:putstatic       #2190 <Field PdfName LANG>
		LANGUAGE = new PdfName("Language");
	// 1840 4784:new             #2   <Class PdfName>
	// 1841 4787:dup             
	// 1842 4788:ldc2            #2192 <String "Language">
	// 1843 4791:invokespecial   #803 <Method void PdfName(String)>
	// 1844 4794:putstatic       #2194 <Field PdfName LANGUAGE>
		LAST = new PdfName("Last");
	// 1845 4797:new             #2   <Class PdfName>
	// 1846 4800:dup             
	// 1847 4801:ldc2            #2196 <String "Last">
	// 1848 4804:invokespecial   #803 <Method void PdfName(String)>
	// 1849 4807:putstatic       #2198 <Field PdfName LAST>
		LASTCHAR = new PdfName("LastChar");
	// 1850 4810:new             #2   <Class PdfName>
	// 1851 4813:dup             
	// 1852 4814:ldc2            #2200 <String "LastChar">
	// 1853 4817:invokespecial   #803 <Method void PdfName(String)>
	// 1854 4820:putstatic       #2202 <Field PdfName LASTCHAR>
		LASTPAGE = new PdfName("LastPage");
	// 1855 4823:new             #2   <Class PdfName>
	// 1856 4826:dup             
	// 1857 4827:ldc2            #2204 <String "LastPage">
	// 1858 4830:invokespecial   #803 <Method void PdfName(String)>
	// 1859 4833:putstatic       #2206 <Field PdfName LASTPAGE>
		LAUNCH = new PdfName("Launch");
	// 1860 4836:new             #2   <Class PdfName>
	// 1861 4839:dup             
	// 1862 4840:ldc2            #2208 <String "Launch">
	// 1863 4843:invokespecial   #803 <Method void PdfName(String)>
	// 1864 4846:putstatic       #2210 <Field PdfName LAUNCH>
		LAYOUT = new PdfName("Layout");
	// 1865 4849:new             #2   <Class PdfName>
	// 1866 4852:dup             
	// 1867 4853:ldc2            #2212 <String "Layout">
	// 1868 4856:invokespecial   #803 <Method void PdfName(String)>
	// 1869 4859:putstatic       #2214 <Field PdfName LAYOUT>
		LBL = new PdfName("Lbl");
	// 1870 4862:new             #2   <Class PdfName>
	// 1871 4865:dup             
	// 1872 4866:ldc2            #2216 <String "Lbl">
	// 1873 4869:invokespecial   #803 <Method void PdfName(String)>
	// 1874 4872:putstatic       #2218 <Field PdfName LBL>
		LBODY = new PdfName("LBody");
	// 1875 4875:new             #2   <Class PdfName>
	// 1876 4878:dup             
	// 1877 4879:ldc2            #2220 <String "LBody">
	// 1878 4882:invokespecial   #803 <Method void PdfName(String)>
	// 1879 4885:putstatic       #2222 <Field PdfName LBODY>
		LENGTH = new PdfName("Length");
	// 1880 4888:new             #2   <Class PdfName>
	// 1881 4891:dup             
	// 1882 4892:ldc2            #2224 <String "Length">
	// 1883 4895:invokespecial   #803 <Method void PdfName(String)>
	// 1884 4898:putstatic       #2226 <Field PdfName LENGTH>
		LENGTH1 = new PdfName("Length1");
	// 1885 4901:new             #2   <Class PdfName>
	// 1886 4904:dup             
	// 1887 4905:ldc2            #2228 <String "Length1">
	// 1888 4908:invokespecial   #803 <Method void PdfName(String)>
	// 1889 4911:putstatic       #2230 <Field PdfName LENGTH1>
		LI = new PdfName("LI");
	// 1890 4914:new             #2   <Class PdfName>
	// 1891 4917:dup             
	// 1892 4918:ldc2            #2231 <String "LI">
	// 1893 4921:invokespecial   #803 <Method void PdfName(String)>
	// 1894 4924:putstatic       #2233 <Field PdfName LI>
		LIMITS = new PdfName("Limits");
	// 1895 4927:new             #2   <Class PdfName>
	// 1896 4930:dup             
	// 1897 4931:ldc2            #2235 <String "Limits">
	// 1898 4934:invokespecial   #803 <Method void PdfName(String)>
	// 1899 4937:putstatic       #2237 <Field PdfName LIMITS>
		LINE = new PdfName("Line");
	// 1900 4940:new             #2   <Class PdfName>
	// 1901 4943:dup             
	// 1902 4944:ldc2            #2239 <String "Line">
	// 1903 4947:invokespecial   #803 <Method void PdfName(String)>
	// 1904 4950:putstatic       #2241 <Field PdfName LINE>
		LINEAR = new PdfName("Linear");
	// 1905 4953:new             #2   <Class PdfName>
	// 1906 4956:dup             
	// 1907 4957:ldc2            #2243 <String "Linear">
	// 1908 4960:invokespecial   #803 <Method void PdfName(String)>
	// 1909 4963:putstatic       #2245 <Field PdfName LINEAR>
		LINEHEIGHT = new PdfName("LineHeight");
	// 1910 4966:new             #2   <Class PdfName>
	// 1911 4969:dup             
	// 1912 4970:ldc2            #2247 <String "LineHeight">
	// 1913 4973:invokespecial   #803 <Method void PdfName(String)>
	// 1914 4976:putstatic       #2249 <Field PdfName LINEHEIGHT>
		LINK = new PdfName("Link");
	// 1915 4979:new             #2   <Class PdfName>
	// 1916 4982:dup             
	// 1917 4983:ldc2            #2251 <String "Link">
	// 1918 4986:invokespecial   #803 <Method void PdfName(String)>
	// 1919 4989:putstatic       #2253 <Field PdfName LINK>
		LIST = new PdfName("List");
	// 1920 4992:new             #2   <Class PdfName>
	// 1921 4995:dup             
	// 1922 4996:ldc2            #2255 <String "List">
	// 1923 4999:invokespecial   #803 <Method void PdfName(String)>
	// 1924 5002:putstatic       #2257 <Field PdfName LIST>
		LISTMODE = new PdfName("ListMode");
	// 1925 5005:new             #2   <Class PdfName>
	// 1926 5008:dup             
	// 1927 5009:ldc2            #2259 <String "ListMode">
	// 1928 5012:invokespecial   #803 <Method void PdfName(String)>
	// 1929 5015:putstatic       #2261 <Field PdfName LISTMODE>
		LISTNUMBERING = new PdfName("ListNumbering");
	// 1930 5018:new             #2   <Class PdfName>
	// 1931 5021:dup             
	// 1932 5022:ldc2            #2263 <String "ListNumbering">
	// 1933 5025:invokespecial   #803 <Method void PdfName(String)>
	// 1934 5028:putstatic       #2265 <Field PdfName LISTNUMBERING>
		LOCATION = new PdfName("Location");
	// 1935 5031:new             #2   <Class PdfName>
	// 1936 5034:dup             
	// 1937 5035:ldc2            #2267 <String "Location">
	// 1938 5038:invokespecial   #803 <Method void PdfName(String)>
	// 1939 5041:putstatic       #2269 <Field PdfName LOCATION>
		LOCK = new PdfName("Lock");
	// 1940 5044:new             #2   <Class PdfName>
	// 1941 5047:dup             
	// 1942 5048:ldc2            #2271 <String "Lock">
	// 1943 5051:invokespecial   #803 <Method void PdfName(String)>
	// 1944 5054:putstatic       #2273 <Field PdfName LOCK>
		LOCKED = new PdfName("Locked");
	// 1945 5057:new             #2   <Class PdfName>
	// 1946 5060:dup             
	// 1947 5061:ldc2            #2275 <String "Locked">
	// 1948 5064:invokespecial   #803 <Method void PdfName(String)>
	// 1949 5067:putstatic       #2277 <Field PdfName LOCKED>
		LOWERALPHA = new PdfName("LowerAlpha");
	// 1950 5070:new             #2   <Class PdfName>
	// 1951 5073:dup             
	// 1952 5074:ldc2            #2279 <String "LowerAlpha">
	// 1953 5077:invokespecial   #803 <Method void PdfName(String)>
	// 1954 5080:putstatic       #2281 <Field PdfName LOWERALPHA>
		LOWERROMAN = new PdfName("LowerRoman");
	// 1955 5083:new             #2   <Class PdfName>
	// 1956 5086:dup             
	// 1957 5087:ldc2            #2283 <String "LowerRoman">
	// 1958 5090:invokespecial   #803 <Method void PdfName(String)>
	// 1959 5093:putstatic       #2285 <Field PdfName LOWERROMAN>
		LPTS = new PdfName("LPTS");
	// 1960 5096:new             #2   <Class PdfName>
	// 1961 5099:dup             
	// 1962 5100:ldc2            #2286 <String "LPTS">
	// 1963 5103:invokespecial   #803 <Method void PdfName(String)>
	// 1964 5106:putstatic       #2288 <Field PdfName LPTS>
		LZWDECODE = new PdfName("LZWDecode");
	// 1965 5109:new             #2   <Class PdfName>
	// 1966 5112:dup             
	// 1967 5113:ldc2            #2290 <String "LZWDecode">
	// 1968 5116:invokespecial   #803 <Method void PdfName(String)>
	// 1969 5119:putstatic       #2292 <Field PdfName LZWDECODE>
		M = new PdfName("M");
	// 1970 5122:new             #2   <Class PdfName>
	// 1971 5125:dup             
	// 1972 5126:ldc2            #2293 <String "M">
	// 1973 5129:invokespecial   #803 <Method void PdfName(String)>
	// 1974 5132:putstatic       #2295 <Field PdfName M>
		MAC = new PdfName("Mac");
	// 1975 5135:new             #2   <Class PdfName>
	// 1976 5138:dup             
	// 1977 5139:ldc2            #2297 <String "Mac">
	// 1978 5142:invokespecial   #803 <Method void PdfName(String)>
	// 1979 5145:putstatic       #2299 <Field PdfName MAC>
		MATERIAL = new PdfName("Material");
	// 1980 5148:new             #2   <Class PdfName>
	// 1981 5151:dup             
	// 1982 5152:ldc2            #2301 <String "Material">
	// 1983 5155:invokespecial   #803 <Method void PdfName(String)>
	// 1984 5158:putstatic       #2303 <Field PdfName MATERIAL>
		MATRIX = new PdfName("Matrix");
	// 1985 5161:new             #2   <Class PdfName>
	// 1986 5164:dup             
	// 1987 5165:ldc2            #2305 <String "Matrix">
	// 1988 5168:invokespecial   #803 <Method void PdfName(String)>
	// 1989 5171:putstatic       #2307 <Field PdfName MATRIX>
		MAC_EXPERT_ENCODING = new PdfName("MacExpertEncoding");
	// 1990 5174:new             #2   <Class PdfName>
	// 1991 5177:dup             
	// 1992 5178:ldc2            #2309 <String "MacExpertEncoding">
	// 1993 5181:invokespecial   #803 <Method void PdfName(String)>
	// 1994 5184:putstatic       #2311 <Field PdfName MAC_EXPERT_ENCODING>
		MAC_ROMAN_ENCODING = new PdfName("MacRomanEncoding");
	// 1995 5187:new             #2   <Class PdfName>
	// 1996 5190:dup             
	// 1997 5191:ldc2            #2313 <String "MacRomanEncoding">
	// 1998 5194:invokespecial   #803 <Method void PdfName(String)>
	// 1999 5197:putstatic       #2315 <Field PdfName MAC_ROMAN_ENCODING>
		MARKED = new PdfName("Marked");
	// 2000 5200:new             #2   <Class PdfName>
	// 2001 5203:dup             
	// 2002 5204:ldc2            #2317 <String "Marked">
	// 2003 5207:invokespecial   #803 <Method void PdfName(String)>
	// 2004 5210:putstatic       #2319 <Field PdfName MARKED>
		MARKINFO = new PdfName("MarkInfo");
	// 2005 5213:new             #2   <Class PdfName>
	// 2006 5216:dup             
	// 2007 5217:ldc2            #2321 <String "MarkInfo">
	// 2008 5220:invokespecial   #803 <Method void PdfName(String)>
	// 2009 5223:putstatic       #2323 <Field PdfName MARKINFO>
		MASK = new PdfName("Mask");
	// 2010 5226:new             #2   <Class PdfName>
	// 2011 5229:dup             
	// 2012 5230:ldc2            #2325 <String "Mask">
	// 2013 5233:invokespecial   #803 <Method void PdfName(String)>
	// 2014 5236:putstatic       #2327 <Field PdfName MASK>
		MAX_LOWER_CASE = new PdfName("max");
	// 2015 5239:new             #2   <Class PdfName>
	// 2016 5242:dup             
	// 2017 5243:ldc2            #2329 <String "max">
	// 2018 5246:invokespecial   #803 <Method void PdfName(String)>
	// 2019 5249:putstatic       #2331 <Field PdfName MAX_LOWER_CASE>
		MAX_CAMEL_CASE = new PdfName("Max");
	// 2020 5252:new             #2   <Class PdfName>
	// 2021 5255:dup             
	// 2022 5256:ldc2            #2333 <String "Max">
	// 2023 5259:invokespecial   #803 <Method void PdfName(String)>
	// 2024 5262:putstatic       #2335 <Field PdfName MAX_CAMEL_CASE>
		MAXLEN = new PdfName("MaxLen");
	// 2025 5265:new             #2   <Class PdfName>
	// 2026 5268:dup             
	// 2027 5269:ldc2            #2337 <String "MaxLen">
	// 2028 5272:invokespecial   #803 <Method void PdfName(String)>
	// 2029 5275:putstatic       #2339 <Field PdfName MAXLEN>
		MEDIABOX = new PdfName("MediaBox");
	// 2030 5278:new             #2   <Class PdfName>
	// 2031 5281:dup             
	// 2032 5282:ldc2            #2341 <String "MediaBox">
	// 2033 5285:invokespecial   #803 <Method void PdfName(String)>
	// 2034 5288:putstatic       #2343 <Field PdfName MEDIABOX>
		MCID = new PdfName("MCID");
	// 2035 5291:new             #2   <Class PdfName>
	// 2036 5294:dup             
	// 2037 5295:ldc2            #2344 <String "MCID">
	// 2038 5298:invokespecial   #803 <Method void PdfName(String)>
	// 2039 5301:putstatic       #2346 <Field PdfName MCID>
		MCR = new PdfName("MCR");
	// 2040 5304:new             #2   <Class PdfName>
	// 2041 5307:dup             
	// 2042 5308:ldc2            #2347 <String "MCR">
	// 2043 5311:invokespecial   #803 <Method void PdfName(String)>
	// 2044 5314:putstatic       #2349 <Field PdfName MCR>
		MEASURE = new PdfName("Measure");
	// 2045 5317:new             #2   <Class PdfName>
	// 2046 5320:dup             
	// 2047 5321:ldc2            #2351 <String "Measure">
	// 2048 5324:invokespecial   #803 <Method void PdfName(String)>
	// 2049 5327:putstatic       #2353 <Field PdfName MEASURE>
		METADATA = new PdfName("Metadata");
	// 2050 5330:new             #2   <Class PdfName>
	// 2051 5333:dup             
	// 2052 5334:ldc2            #2355 <String "Metadata">
	// 2053 5337:invokespecial   #803 <Method void PdfName(String)>
	// 2054 5340:putstatic       #2357 <Field PdfName METADATA>
		MIN_LOWER_CASE = new PdfName("min");
	// 2055 5343:new             #2   <Class PdfName>
	// 2056 5346:dup             
	// 2057 5347:ldc2            #2359 <String "min">
	// 2058 5350:invokespecial   #803 <Method void PdfName(String)>
	// 2059 5353:putstatic       #2361 <Field PdfName MIN_LOWER_CASE>
		MIN_CAMEL_CASE = new PdfName("Min");
	// 2060 5356:new             #2   <Class PdfName>
	// 2061 5359:dup             
	// 2062 5360:ldc2            #2363 <String "Min">
	// 2063 5363:invokespecial   #803 <Method void PdfName(String)>
	// 2064 5366:putstatic       #2365 <Field PdfName MIN_CAMEL_CASE>
		MK = new PdfName("MK");
	// 2065 5369:new             #2   <Class PdfName>
	// 2066 5372:dup             
	// 2067 5373:ldc2            #2366 <String "MK">
	// 2068 5376:invokespecial   #803 <Method void PdfName(String)>
	// 2069 5379:putstatic       #2368 <Field PdfName MK>
		MMTYPE1 = new PdfName("MMType1");
	// 2070 5382:new             #2   <Class PdfName>
	// 2071 5385:dup             
	// 2072 5386:ldc2            #2370 <String "MMType1">
	// 2073 5389:invokespecial   #803 <Method void PdfName(String)>
	// 2074 5392:putstatic       #2372 <Field PdfName MMTYPE1>
		MODDATE = new PdfName("ModDate");
	// 2075 5395:new             #2   <Class PdfName>
	// 2076 5398:dup             
	// 2077 5399:ldc2            #2374 <String "ModDate">
	// 2078 5402:invokespecial   #803 <Method void PdfName(String)>
	// 2079 5405:putstatic       #2376 <Field PdfName MODDATE>
		MOVIE = new PdfName("Movie");
	// 2080 5408:new             #2   <Class PdfName>
	// 2081 5411:dup             
	// 2082 5412:ldc2            #2378 <String "Movie">
	// 2083 5415:invokespecial   #803 <Method void PdfName(String)>
	// 2084 5418:putstatic       #2380 <Field PdfName MOVIE>
		N = new PdfName("N");
	// 2085 5421:new             #2   <Class PdfName>
	// 2086 5424:dup             
	// 2087 5425:ldc2            #2381 <String "N">
	// 2088 5428:invokespecial   #803 <Method void PdfName(String)>
	// 2089 5431:putstatic       #2383 <Field PdfName N>
		N0 = new PdfName("n0");
	// 2090 5434:new             #2   <Class PdfName>
	// 2091 5437:dup             
	// 2092 5438:ldc2            #2385 <String "n0">
	// 2093 5441:invokespecial   #803 <Method void PdfName(String)>
	// 2094 5444:putstatic       #2387 <Field PdfName N0>
		N1 = new PdfName("n1");
	// 2095 5447:new             #2   <Class PdfName>
	// 2096 5450:dup             
	// 2097 5451:ldc2            #2389 <String "n1">
	// 2098 5454:invokespecial   #803 <Method void PdfName(String)>
	// 2099 5457:putstatic       #2391 <Field PdfName N1>
		N2 = new PdfName("n2");
	// 2100 5460:new             #2   <Class PdfName>
	// 2101 5463:dup             
	// 2102 5464:ldc2            #2393 <String "n2">
	// 2103 5467:invokespecial   #803 <Method void PdfName(String)>
	// 2104 5470:putstatic       #2395 <Field PdfName N2>
		N3 = new PdfName("n3");
	// 2105 5473:new             #2   <Class PdfName>
	// 2106 5476:dup             
	// 2107 5477:ldc2            #2397 <String "n3">
	// 2108 5480:invokespecial   #803 <Method void PdfName(String)>
	// 2109 5483:putstatic       #2399 <Field PdfName N3>
		N4 = new PdfName("n4");
	// 2110 5486:new             #2   <Class PdfName>
	// 2111 5489:dup             
	// 2112 5490:ldc2            #2401 <String "n4">
	// 2113 5493:invokespecial   #803 <Method void PdfName(String)>
	// 2114 5496:putstatic       #2403 <Field PdfName N4>
		NAME = new PdfName("Name");
	// 2115 5499:new             #2   <Class PdfName>
	// 2116 5502:dup             
	// 2117 5503:ldc2            #2405 <String "Name">
	// 2118 5506:invokespecial   #803 <Method void PdfName(String)>
	// 2119 5509:putstatic       #2407 <Field PdfName NAME>
		NAMED = new PdfName("Named");
	// 2120 5512:new             #2   <Class PdfName>
	// 2121 5515:dup             
	// 2122 5516:ldc2            #2409 <String "Named">
	// 2123 5519:invokespecial   #803 <Method void PdfName(String)>
	// 2124 5522:putstatic       #2411 <Field PdfName NAMED>
		NAMES = new PdfName("Names");
	// 2125 5525:new             #2   <Class PdfName>
	// 2126 5528:dup             
	// 2127 5529:ldc2            #2413 <String "Names">
	// 2128 5532:invokespecial   #803 <Method void PdfName(String)>
	// 2129 5535:putstatic       #2415 <Field PdfName NAMES>
		NAVIGATION = new PdfName("Navigation");
	// 2130 5538:new             #2   <Class PdfName>
	// 2131 5541:dup             
	// 2132 5542:ldc2            #2417 <String "Navigation">
	// 2133 5545:invokespecial   #803 <Method void PdfName(String)>
	// 2134 5548:putstatic       #2419 <Field PdfName NAVIGATION>
		NAVIGATIONPANE = new PdfName("NavigationPane");
	// 2135 5551:new             #2   <Class PdfName>
	// 2136 5554:dup             
	// 2137 5555:ldc2            #2421 <String "NavigationPane">
	// 2138 5558:invokespecial   #803 <Method void PdfName(String)>
	// 2139 5561:putstatic       #2423 <Field PdfName NAVIGATIONPANE>
		NCHANNEL = new PdfName("NChannel");
	// 2140 5564:new             #2   <Class PdfName>
	// 2141 5567:dup             
	// 2142 5568:ldc2            #2425 <String "NChannel">
	// 2143 5571:invokespecial   #803 <Method void PdfName(String)>
	// 2144 5574:putstatic       #2427 <Field PdfName NCHANNEL>
		NEAR = new PdfName("Near");
	// 2145 5577:new             #2   <Class PdfName>
	// 2146 5580:dup             
	// 2147 5581:ldc2            #2429 <String "Near">
	// 2148 5584:invokespecial   #803 <Method void PdfName(String)>
	// 2149 5587:putstatic       #2431 <Field PdfName NEAR>
		NEEDAPPEARANCES = new PdfName("NeedAppearances");
	// 2150 5590:new             #2   <Class PdfName>
	// 2151 5593:dup             
	// 2152 5594:ldc2            #2433 <String "NeedAppearances">
	// 2153 5597:invokespecial   #803 <Method void PdfName(String)>
	// 2154 5600:putstatic       #2435 <Field PdfName NEEDAPPEARANCES>
		NEEDRENDERING = new PdfName("NeedsRendering");
	// 2155 5603:new             #2   <Class PdfName>
	// 2156 5606:dup             
	// 2157 5607:ldc2            #2437 <String "NeedsRendering">
	// 2158 5610:invokespecial   #803 <Method void PdfName(String)>
	// 2159 5613:putstatic       #2439 <Field PdfName NEEDRENDERING>
		NEWWINDOW = new PdfName("NewWindow");
	// 2160 5616:new             #2   <Class PdfName>
	// 2161 5619:dup             
	// 2162 5620:ldc2            #2441 <String "NewWindow">
	// 2163 5623:invokespecial   #803 <Method void PdfName(String)>
	// 2164 5626:putstatic       #2443 <Field PdfName NEWWINDOW>
		NEXT = new PdfName("Next");
	// 2165 5629:new             #2   <Class PdfName>
	// 2166 5632:dup             
	// 2167 5633:ldc2            #2445 <String "Next">
	// 2168 5636:invokespecial   #803 <Method void PdfName(String)>
	// 2169 5639:putstatic       #2447 <Field PdfName NEXT>
		NEXTPAGE = new PdfName("NextPage");
	// 2170 5642:new             #2   <Class PdfName>
	// 2171 5645:dup             
	// 2172 5646:ldc2            #2449 <String "NextPage">
	// 2173 5649:invokespecial   #803 <Method void PdfName(String)>
	// 2174 5652:putstatic       #2451 <Field PdfName NEXTPAGE>
		NM = new PdfName("NM");
	// 2175 5655:new             #2   <Class PdfName>
	// 2176 5658:dup             
	// 2177 5659:ldc2            #2452 <String "NM">
	// 2178 5662:invokespecial   #803 <Method void PdfName(String)>
	// 2179 5665:putstatic       #2454 <Field PdfName NM>
		NONE = new PdfName("None");
	// 2180 5668:new             #2   <Class PdfName>
	// 2181 5671:dup             
	// 2182 5672:ldc2            #2456 <String "None">
	// 2183 5675:invokespecial   #803 <Method void PdfName(String)>
	// 2184 5678:putstatic       #2458 <Field PdfName NONE>
		NONFULLSCREENPAGEMODE = new PdfName("NonFullScreenPageMode");
	// 2185 5681:new             #2   <Class PdfName>
	// 2186 5684:dup             
	// 2187 5685:ldc2            #2460 <String "NonFullScreenPageMode">
	// 2188 5688:invokespecial   #803 <Method void PdfName(String)>
	// 2189 5691:putstatic       #2462 <Field PdfName NONFULLSCREENPAGEMODE>
		NONSTRUCT = new PdfName("NonStruct");
	// 2190 5694:new             #2   <Class PdfName>
	// 2191 5697:dup             
	// 2192 5698:ldc2            #2464 <String "NonStruct">
	// 2193 5701:invokespecial   #803 <Method void PdfName(String)>
	// 2194 5704:putstatic       #2466 <Field PdfName NONSTRUCT>
		NOT = new PdfName("Not");
	// 2195 5707:new             #2   <Class PdfName>
	// 2196 5710:dup             
	// 2197 5711:ldc2            #2468 <String "Not">
	// 2198 5714:invokespecial   #803 <Method void PdfName(String)>
	// 2199 5717:putstatic       #2470 <Field PdfName NOT>
		NOTE = new PdfName("Note");
	// 2200 5720:new             #2   <Class PdfName>
	// 2201 5723:dup             
	// 2202 5724:ldc2            #2472 <String "Note">
	// 2203 5727:invokespecial   #803 <Method void PdfName(String)>
	// 2204 5730:putstatic       #2474 <Field PdfName NOTE>
		NUMBERFORMAT = new PdfName("NumberFormat");
	// 2205 5733:new             #2   <Class PdfName>
	// 2206 5736:dup             
	// 2207 5737:ldc2            #2476 <String "NumberFormat">
	// 2208 5740:invokespecial   #803 <Method void PdfName(String)>
	// 2209 5743:putstatic       #2478 <Field PdfName NUMBERFORMAT>
		NUMCOPIES = new PdfName("NumCopies");
	// 2210 5746:new             #2   <Class PdfName>
	// 2211 5749:dup             
	// 2212 5750:ldc2            #2480 <String "NumCopies">
	// 2213 5753:invokespecial   #803 <Method void PdfName(String)>
	// 2214 5756:putstatic       #2482 <Field PdfName NUMCOPIES>
		NUMS = new PdfName("Nums");
	// 2215 5759:new             #2   <Class PdfName>
	// 2216 5762:dup             
	// 2217 5763:ldc2            #2484 <String "Nums">
	// 2218 5766:invokespecial   #803 <Method void PdfName(String)>
	// 2219 5769:putstatic       #2486 <Field PdfName NUMS>
		O = new PdfName("O");
	// 2220 5772:new             #2   <Class PdfName>
	// 2221 5775:dup             
	// 2222 5776:ldc2            #2487 <String "O">
	// 2223 5779:invokespecial   #803 <Method void PdfName(String)>
	// 2224 5782:putstatic       #2489 <Field PdfName O>
		OBJ = new PdfName("Obj");
	// 2225 5785:new             #2   <Class PdfName>
	// 2226 5788:dup             
	// 2227 5789:ldc2            #2491 <String "Obj">
	// 2228 5792:invokespecial   #803 <Method void PdfName(String)>
	// 2229 5795:putstatic       #2493 <Field PdfName OBJ>
		OBJR = new PdfName("OBJR");
	// 2230 5798:new             #2   <Class PdfName>
	// 2231 5801:dup             
	// 2232 5802:ldc2            #2494 <String "OBJR">
	// 2233 5805:invokespecial   #803 <Method void PdfName(String)>
	// 2234 5808:putstatic       #2496 <Field PdfName OBJR>
		OBJSTM = new PdfName("ObjStm");
	// 2235 5811:new             #2   <Class PdfName>
	// 2236 5814:dup             
	// 2237 5815:ldc2            #2498 <String "ObjStm">
	// 2238 5818:invokespecial   #803 <Method void PdfName(String)>
	// 2239 5821:putstatic       #2500 <Field PdfName OBJSTM>
		OC = new PdfName("OC");
	// 2240 5824:new             #2   <Class PdfName>
	// 2241 5827:dup             
	// 2242 5828:ldc2            #2501 <String "OC">
	// 2243 5831:invokespecial   #803 <Method void PdfName(String)>
	// 2244 5834:putstatic       #2503 <Field PdfName OC>
		OCG = new PdfName("OCG");
	// 2245 5837:new             #2   <Class PdfName>
	// 2246 5840:dup             
	// 2247 5841:ldc2            #2504 <String "OCG">
	// 2248 5844:invokespecial   #803 <Method void PdfName(String)>
	// 2249 5847:putstatic       #2506 <Field PdfName OCG>
		OCGS = new PdfName("OCGs");
	// 2250 5850:new             #2   <Class PdfName>
	// 2251 5853:dup             
	// 2252 5854:ldc2            #2508 <String "OCGs">
	// 2253 5857:invokespecial   #803 <Method void PdfName(String)>
	// 2254 5860:putstatic       #2510 <Field PdfName OCGS>
		OCMD = new PdfName("OCMD");
	// 2255 5863:new             #2   <Class PdfName>
	// 2256 5866:dup             
	// 2257 5867:ldc2            #2511 <String "OCMD">
	// 2258 5870:invokespecial   #803 <Method void PdfName(String)>
	// 2259 5873:putstatic       #2513 <Field PdfName OCMD>
		OCPROPERTIES = new PdfName("OCProperties");
	// 2260 5876:new             #2   <Class PdfName>
	// 2261 5879:dup             
	// 2262 5880:ldc2            #2515 <String "OCProperties">
	// 2263 5883:invokespecial   #803 <Method void PdfName(String)>
	// 2264 5886:putstatic       #2517 <Field PdfName OCPROPERTIES>
		OCSP = new PdfName("OCSP");
	// 2265 5889:new             #2   <Class PdfName>
	// 2266 5892:dup             
	// 2267 5893:ldc2            #2518 <String "OCSP">
	// 2268 5896:invokespecial   #803 <Method void PdfName(String)>
	// 2269 5899:putstatic       #2520 <Field PdfName OCSP>
		OCSPS = new PdfName("OCSPs");
	// 2270 5902:new             #2   <Class PdfName>
	// 2271 5905:dup             
	// 2272 5906:ldc2            #2522 <String "OCSPs">
	// 2273 5909:invokespecial   #803 <Method void PdfName(String)>
	// 2274 5912:putstatic       #2524 <Field PdfName OCSPS>
		OE = new PdfName("OE");
	// 2275 5915:new             #2   <Class PdfName>
	// 2276 5918:dup             
	// 2277 5919:ldc2            #2525 <String "OE">
	// 2278 5922:invokespecial   #803 <Method void PdfName(String)>
	// 2279 5925:putstatic       #2527 <Field PdfName OE>
		Off = new PdfName("Off");
	// 2280 5928:new             #2   <Class PdfName>
	// 2281 5931:dup             
	// 2282 5932:ldc2            #2528 <String "Off">
	// 2283 5935:invokespecial   #803 <Method void PdfName(String)>
	// 2284 5938:putstatic       #2530 <Field PdfName Off>
		OFF = new PdfName("OFF");
	// 2285 5941:new             #2   <Class PdfName>
	// 2286 5944:dup             
	// 2287 5945:ldc2            #2531 <String "OFF">
	// 2288 5948:invokespecial   #803 <Method void PdfName(String)>
	// 2289 5951:putstatic       #2533 <Field PdfName OFF>
		ON = new PdfName("ON");
	// 2290 5954:new             #2   <Class PdfName>
	// 2291 5957:dup             
	// 2292 5958:ldc2            #2534 <String "ON">
	// 2293 5961:invokespecial   #803 <Method void PdfName(String)>
	// 2294 5964:putstatic       #2536 <Field PdfName ON>
		ONECOLUMN = new PdfName("OneColumn");
	// 2295 5967:new             #2   <Class PdfName>
	// 2296 5970:dup             
	// 2297 5971:ldc2            #2538 <String "OneColumn">
	// 2298 5974:invokespecial   #803 <Method void PdfName(String)>
	// 2299 5977:putstatic       #2540 <Field PdfName ONECOLUMN>
		OPEN = new PdfName("Open");
	// 2300 5980:new             #2   <Class PdfName>
	// 2301 5983:dup             
	// 2302 5984:ldc2            #2542 <String "Open">
	// 2303 5987:invokespecial   #803 <Method void PdfName(String)>
	// 2304 5990:putstatic       #2544 <Field PdfName OPEN>
		OPENACTION = new PdfName("OpenAction");
	// 2305 5993:new             #2   <Class PdfName>
	// 2306 5996:dup             
	// 2307 5997:ldc2            #2546 <String "OpenAction">
	// 2308 6000:invokespecial   #803 <Method void PdfName(String)>
	// 2309 6003:putstatic       #2548 <Field PdfName OPENACTION>
		OP = new PdfName("OP");
	// 2310 6006:new             #2   <Class PdfName>
	// 2311 6009:dup             
	// 2312 6010:ldc2            #2549 <String "OP">
	// 2313 6013:invokespecial   #803 <Method void PdfName(String)>
	// 2314 6016:putstatic       #2551 <Field PdfName OP>
		op = new PdfName("op");
	// 2315 6019:new             #2   <Class PdfName>
	// 2316 6022:dup             
	// 2317 6023:ldc2            #2552 <String "op">
	// 2318 6026:invokespecial   #803 <Method void PdfName(String)>
	// 2319 6029:putstatic       #2554 <Field PdfName op>
		OPI = new PdfName("OPI");
	// 2320 6032:new             #2   <Class PdfName>
	// 2321 6035:dup             
	// 2322 6036:ldc2            #2555 <String "OPI">
	// 2323 6039:invokespecial   #803 <Method void PdfName(String)>
	// 2324 6042:putstatic       #2557 <Field PdfName OPI>
		OPM = new PdfName("OPM");
	// 2325 6045:new             #2   <Class PdfName>
	// 2326 6048:dup             
	// 2327 6049:ldc2            #2558 <String "OPM">
	// 2328 6052:invokespecial   #803 <Method void PdfName(String)>
	// 2329 6055:putstatic       #2560 <Field PdfName OPM>
		OPT = new PdfName("Opt");
	// 2330 6058:new             #2   <Class PdfName>
	// 2331 6061:dup             
	// 2332 6062:ldc2            #2562 <String "Opt">
	// 2333 6065:invokespecial   #803 <Method void PdfName(String)>
	// 2334 6068:putstatic       #2564 <Field PdfName OPT>
		OR = new PdfName("Or");
	// 2335 6071:new             #2   <Class PdfName>
	// 2336 6074:dup             
	// 2337 6075:ldc2            #2566 <String "Or">
	// 2338 6078:invokespecial   #803 <Method void PdfName(String)>
	// 2339 6081:putstatic       #2568 <Field PdfName OR>
		ORDER = new PdfName("Order");
	// 2340 6084:new             #2   <Class PdfName>
	// 2341 6087:dup             
	// 2342 6088:ldc2            #2570 <String "Order">
	// 2343 6091:invokespecial   #803 <Method void PdfName(String)>
	// 2344 6094:putstatic       #2572 <Field PdfName ORDER>
		ORDERING = new PdfName("Ordering");
	// 2345 6097:new             #2   <Class PdfName>
	// 2346 6100:dup             
	// 2347 6101:ldc2            #2574 <String "Ordering">
	// 2348 6104:invokespecial   #803 <Method void PdfName(String)>
	// 2349 6107:putstatic       #2576 <Field PdfName ORDERING>
		ORG = new PdfName("Org");
	// 2350 6110:new             #2   <Class PdfName>
	// 2351 6113:dup             
	// 2352 6114:ldc2            #2578 <String "Org">
	// 2353 6117:invokespecial   #803 <Method void PdfName(String)>
	// 2354 6120:putstatic       #2580 <Field PdfName ORG>
		OSCILLATING = new PdfName("Oscillating");
	// 2355 6123:new             #2   <Class PdfName>
	// 2356 6126:dup             
	// 2357 6127:ldc2            #2582 <String "Oscillating">
	// 2358 6130:invokespecial   #803 <Method void PdfName(String)>
	// 2359 6133:putstatic       #2584 <Field PdfName OSCILLATING>
		OUTLINES = new PdfName("Outlines");
	// 2360 6136:new             #2   <Class PdfName>
	// 2361 6139:dup             
	// 2362 6140:ldc2            #2586 <String "Outlines">
	// 2363 6143:invokespecial   #803 <Method void PdfName(String)>
	// 2364 6146:putstatic       #2588 <Field PdfName OUTLINES>
		OUTPUTCONDITION = new PdfName("OutputCondition");
	// 2365 6149:new             #2   <Class PdfName>
	// 2366 6152:dup             
	// 2367 6153:ldc2            #2590 <String "OutputCondition">
	// 2368 6156:invokespecial   #803 <Method void PdfName(String)>
	// 2369 6159:putstatic       #2592 <Field PdfName OUTPUTCONDITION>
		OUTPUTCONDITIONIDENTIFIER = new PdfName("OutputConditionIdentifier");
	// 2370 6162:new             #2   <Class PdfName>
	// 2371 6165:dup             
	// 2372 6166:ldc2            #2594 <String "OutputConditionIdentifier">
	// 2373 6169:invokespecial   #803 <Method void PdfName(String)>
	// 2374 6172:putstatic       #2596 <Field PdfName OUTPUTCONDITIONIDENTIFIER>
		OUTPUTINTENT = new PdfName("OutputIntent");
	// 2375 6175:new             #2   <Class PdfName>
	// 2376 6178:dup             
	// 2377 6179:ldc2            #2598 <String "OutputIntent">
	// 2378 6182:invokespecial   #803 <Method void PdfName(String)>
	// 2379 6185:putstatic       #2600 <Field PdfName OUTPUTINTENT>
		OUTPUTINTENTS = new PdfName("OutputIntents");
	// 2380 6188:new             #2   <Class PdfName>
	// 2381 6191:dup             
	// 2382 6192:ldc2            #2602 <String "OutputIntents">
	// 2383 6195:invokespecial   #803 <Method void PdfName(String)>
	// 2384 6198:putstatic       #2604 <Field PdfName OUTPUTINTENTS>
		OVERLAYTEXT = new PdfName("OverlayText");
	// 2385 6201:new             #2   <Class PdfName>
	// 2386 6204:dup             
	// 2387 6205:ldc2            #2606 <String "OverlayText">
	// 2388 6208:invokespecial   #803 <Method void PdfName(String)>
	// 2389 6211:putstatic       #2608 <Field PdfName OVERLAYTEXT>
		P = new PdfName("P");
	// 2390 6214:new             #2   <Class PdfName>
	// 2391 6217:dup             
	// 2392 6218:ldc2            #2609 <String "P">
	// 2393 6221:invokespecial   #803 <Method void PdfName(String)>
	// 2394 6224:putstatic       #2611 <Field PdfName P>
		PAGE = new PdfName("Page");
	// 2395 6227:new             #2   <Class PdfName>
	// 2396 6230:dup             
	// 2397 6231:ldc2            #2613 <String "Page">
	// 2398 6234:invokespecial   #803 <Method void PdfName(String)>
	// 2399 6237:putstatic       #2615 <Field PdfName PAGE>
		PAGEELEMENT = new PdfName("PageElement");
	// 2400 6240:new             #2   <Class PdfName>
	// 2401 6243:dup             
	// 2402 6244:ldc2            #2617 <String "PageElement">
	// 2403 6247:invokespecial   #803 <Method void PdfName(String)>
	// 2404 6250:putstatic       #2619 <Field PdfName PAGEELEMENT>
		PAGELABELS = new PdfName("PageLabels");
	// 2405 6253:new             #2   <Class PdfName>
	// 2406 6256:dup             
	// 2407 6257:ldc2            #2621 <String "PageLabels">
	// 2408 6260:invokespecial   #803 <Method void PdfName(String)>
	// 2409 6263:putstatic       #2623 <Field PdfName PAGELABELS>
		PAGELAYOUT = new PdfName("PageLayout");
	// 2410 6266:new             #2   <Class PdfName>
	// 2411 6269:dup             
	// 2412 6270:ldc2            #2625 <String "PageLayout">
	// 2413 6273:invokespecial   #803 <Method void PdfName(String)>
	// 2414 6276:putstatic       #2627 <Field PdfName PAGELAYOUT>
		PAGEMODE = new PdfName("PageMode");
	// 2415 6279:new             #2   <Class PdfName>
	// 2416 6282:dup             
	// 2417 6283:ldc2            #2629 <String "PageMode">
	// 2418 6286:invokespecial   #803 <Method void PdfName(String)>
	// 2419 6289:putstatic       #2631 <Field PdfName PAGEMODE>
		PAGES = new PdfName("Pages");
	// 2420 6292:new             #2   <Class PdfName>
	// 2421 6295:dup             
	// 2422 6296:ldc2            #2633 <String "Pages">
	// 2423 6299:invokespecial   #803 <Method void PdfName(String)>
	// 2424 6302:putstatic       #2635 <Field PdfName PAGES>
		PAINTTYPE = new PdfName("PaintType");
	// 2425 6305:new             #2   <Class PdfName>
	// 2426 6308:dup             
	// 2427 6309:ldc2            #2637 <String "PaintType">
	// 2428 6312:invokespecial   #803 <Method void PdfName(String)>
	// 2429 6315:putstatic       #2639 <Field PdfName PAINTTYPE>
		PANOSE = new PdfName("Panose");
	// 2430 6318:new             #2   <Class PdfName>
	// 2431 6321:dup             
	// 2432 6322:ldc2            #2641 <String "Panose">
	// 2433 6325:invokespecial   #803 <Method void PdfName(String)>
	// 2434 6328:putstatic       #2643 <Field PdfName PANOSE>
		PARAMS = new PdfName("Params");
	// 2435 6331:new             #2   <Class PdfName>
	// 2436 6334:dup             
	// 2437 6335:ldc2            #2645 <String "Params">
	// 2438 6338:invokespecial   #803 <Method void PdfName(String)>
	// 2439 6341:putstatic       #2647 <Field PdfName PARAMS>
		PARENT = new PdfName("Parent");
	// 2440 6344:new             #2   <Class PdfName>
	// 2441 6347:dup             
	// 2442 6348:ldc2            #2649 <String "Parent">
	// 2443 6351:invokespecial   #803 <Method void PdfName(String)>
	// 2444 6354:putstatic       #2651 <Field PdfName PARENT>
		PARENTTREE = new PdfName("ParentTree");
	// 2445 6357:new             #2   <Class PdfName>
	// 2446 6360:dup             
	// 2447 6361:ldc2            #2653 <String "ParentTree">
	// 2448 6364:invokespecial   #803 <Method void PdfName(String)>
	// 2449 6367:putstatic       #2655 <Field PdfName PARENTTREE>
		PARENTTREENEXTKEY = new PdfName("ParentTreeNextKey");
	// 2450 6370:new             #2   <Class PdfName>
	// 2451 6373:dup             
	// 2452 6374:ldc2            #2657 <String "ParentTreeNextKey">
	// 2453 6377:invokespecial   #803 <Method void PdfName(String)>
	// 2454 6380:putstatic       #2659 <Field PdfName PARENTTREENEXTKEY>
		PART = new PdfName("Part");
	// 2455 6383:new             #2   <Class PdfName>
	// 2456 6386:dup             
	// 2457 6387:ldc2            #2661 <String "Part">
	// 2458 6390:invokespecial   #803 <Method void PdfName(String)>
	// 2459 6393:putstatic       #2663 <Field PdfName PART>
		PASSCONTEXTCLICK = new PdfName("PassContextClick");
	// 2460 6396:new             #2   <Class PdfName>
	// 2461 6399:dup             
	// 2462 6400:ldc2            #2665 <String "PassContextClick">
	// 2463 6403:invokespecial   #803 <Method void PdfName(String)>
	// 2464 6406:putstatic       #2667 <Field PdfName PASSCONTEXTCLICK>
		PATTERN = new PdfName("Pattern");
	// 2465 6409:new             #2   <Class PdfName>
	// 2466 6412:dup             
	// 2467 6413:ldc2            #2669 <String "Pattern">
	// 2468 6416:invokespecial   #803 <Method void PdfName(String)>
	// 2469 6419:putstatic       #2671 <Field PdfName PATTERN>
		PATTERNTYPE = new PdfName("PatternType");
	// 2470 6422:new             #2   <Class PdfName>
	// 2471 6425:dup             
	// 2472 6426:ldc2            #2673 <String "PatternType">
	// 2473 6429:invokespecial   #803 <Method void PdfName(String)>
	// 2474 6432:putstatic       #2675 <Field PdfName PATTERNTYPE>
		PB = new PdfName("pb");
	// 2475 6435:new             #2   <Class PdfName>
	// 2476 6438:dup             
	// 2477 6439:ldc2            #2677 <String "pb">
	// 2478 6442:invokespecial   #803 <Method void PdfName(String)>
	// 2479 6445:putstatic       #2679 <Field PdfName PB>
		PC = new PdfName("PC");
	// 2480 6448:new             #2   <Class PdfName>
	// 2481 6451:dup             
	// 2482 6452:ldc2            #2680 <String "PC">
	// 2483 6455:invokespecial   #803 <Method void PdfName(String)>
	// 2484 6458:putstatic       #2682 <Field PdfName PC>
		PDF = new PdfName("PDF");
	// 2485 6461:new             #2   <Class PdfName>
	// 2486 6464:dup             
	// 2487 6465:ldc2            #2683 <String "PDF">
	// 2488 6468:invokespecial   #803 <Method void PdfName(String)>
	// 2489 6471:putstatic       #2685 <Field PdfName PDF>
		PDFDOCENCODING = new PdfName("PDFDocEncoding");
	// 2490 6474:new             #2   <Class PdfName>
	// 2491 6477:dup             
	// 2492 6478:ldc2            #2687 <String "PDFDocEncoding">
	// 2493 6481:invokespecial   #803 <Method void PdfName(String)>
	// 2494 6484:putstatic       #2689 <Field PdfName PDFDOCENCODING>
		PDU = new PdfName("PDU");
	// 2495 6487:new             #2   <Class PdfName>
	// 2496 6490:dup             
	// 2497 6491:ldc2            #2690 <String "PDU">
	// 2498 6494:invokespecial   #803 <Method void PdfName(String)>
	// 2499 6497:putstatic       #2692 <Field PdfName PDU>
		PERCEPTUAL = new PdfName("Perceptual");
	// 2500 6500:new             #2   <Class PdfName>
	// 2501 6503:dup             
	// 2502 6504:ldc2            #2694 <String "Perceptual">
	// 2503 6507:invokespecial   #803 <Method void PdfName(String)>
	// 2504 6510:putstatic       #2696 <Field PdfName PERCEPTUAL>
		PERMS = new PdfName("Perms");
	// 2505 6513:new             #2   <Class PdfName>
	// 2506 6516:dup             
	// 2507 6517:ldc2            #2698 <String "Perms">
	// 2508 6520:invokespecial   #803 <Method void PdfName(String)>
	// 2509 6523:putstatic       #2700 <Field PdfName PERMS>
		PG = new PdfName("Pg");
	// 2510 6526:new             #2   <Class PdfName>
	// 2511 6529:dup             
	// 2512 6530:ldc2            #2702 <String "Pg">
	// 2513 6533:invokespecial   #803 <Method void PdfName(String)>
	// 2514 6536:putstatic       #2704 <Field PdfName PG>
		PI = new PdfName("PI");
	// 2515 6539:new             #2   <Class PdfName>
	// 2516 6542:dup             
	// 2517 6543:ldc2            #2705 <String "PI">
	// 2518 6546:invokespecial   #803 <Method void PdfName(String)>
	// 2519 6549:putstatic       #2707 <Field PdfName PI>
		PICKTRAYBYPDFSIZE = new PdfName("PickTrayByPDFSize");
	// 2520 6552:new             #2   <Class PdfName>
	// 2521 6555:dup             
	// 2522 6556:ldc2            #2709 <String "PickTrayByPDFSize">
	// 2523 6559:invokespecial   #803 <Method void PdfName(String)>
	// 2524 6562:putstatic       #2711 <Field PdfName PICKTRAYBYPDFSIZE>
		PIECEINFO = new PdfName("PieceInfo");
	// 2525 6565:new             #2   <Class PdfName>
	// 2526 6568:dup             
	// 2527 6569:ldc2            #2713 <String "PieceInfo">
	// 2528 6572:invokespecial   #803 <Method void PdfName(String)>
	// 2529 6575:putstatic       #2715 <Field PdfName PIECEINFO>
		PLAYCOUNT = new PdfName("PlayCount");
	// 2530 6578:new             #2   <Class PdfName>
	// 2531 6581:dup             
	// 2532 6582:ldc2            #2717 <String "PlayCount">
	// 2533 6585:invokespecial   #803 <Method void PdfName(String)>
	// 2534 6588:putstatic       #2719 <Field PdfName PLAYCOUNT>
		PO = new PdfName("PO");
	// 2535 6591:new             #2   <Class PdfName>
	// 2536 6594:dup             
	// 2537 6595:ldc2            #2720 <String "PO">
	// 2538 6598:invokespecial   #803 <Method void PdfName(String)>
	// 2539 6601:putstatic       #2722 <Field PdfName PO>
		POLYGON = new PdfName("Polygon");
	// 2540 6604:new             #2   <Class PdfName>
	// 2541 6607:dup             
	// 2542 6608:ldc2            #2724 <String "Polygon">
	// 2543 6611:invokespecial   #803 <Method void PdfName(String)>
	// 2544 6614:putstatic       #2726 <Field PdfName POLYGON>
		POLYLINE = new PdfName("PolyLine");
	// 2545 6617:new             #2   <Class PdfName>
	// 2546 6620:dup             
	// 2547 6621:ldc2            #2728 <String "PolyLine">
	// 2548 6624:invokespecial   #803 <Method void PdfName(String)>
	// 2549 6627:putstatic       #2730 <Field PdfName POLYLINE>
		POPUP = new PdfName("Popup");
	// 2550 6630:new             #2   <Class PdfName>
	// 2551 6633:dup             
	// 2552 6634:ldc2            #2732 <String "Popup">
	// 2553 6637:invokespecial   #803 <Method void PdfName(String)>
	// 2554 6640:putstatic       #2734 <Field PdfName POPUP>
		POSITION = new PdfName("Position");
	// 2555 6643:new             #2   <Class PdfName>
	// 2556 6646:dup             
	// 2557 6647:ldc2            #2736 <String "Position">
	// 2558 6650:invokespecial   #803 <Method void PdfName(String)>
	// 2559 6653:putstatic       #2738 <Field PdfName POSITION>
		PREDICTOR = new PdfName("Predictor");
	// 2560 6656:new             #2   <Class PdfName>
	// 2561 6659:dup             
	// 2562 6660:ldc2            #2740 <String "Predictor">
	// 2563 6663:invokespecial   #803 <Method void PdfName(String)>
	// 2564 6666:putstatic       #2742 <Field PdfName PREDICTOR>
		PREFERRED = new PdfName("Preferred");
	// 2565 6669:new             #2   <Class PdfName>
	// 2566 6672:dup             
	// 2567 6673:ldc2            #2744 <String "Preferred">
	// 2568 6676:invokespecial   #803 <Method void PdfName(String)>
	// 2569 6679:putstatic       #2746 <Field PdfName PREFERRED>
		PRESENTATION = new PdfName("Presentation");
	// 2570 6682:new             #2   <Class PdfName>
	// 2571 6685:dup             
	// 2572 6686:ldc2            #2748 <String "Presentation">
	// 2573 6689:invokespecial   #803 <Method void PdfName(String)>
	// 2574 6692:putstatic       #2750 <Field PdfName PRESENTATION>
		PRESERVERB = new PdfName("PreserveRB");
	// 2575 6695:new             #2   <Class PdfName>
	// 2576 6698:dup             
	// 2577 6699:ldc2            #2752 <String "PreserveRB">
	// 2578 6702:invokespecial   #803 <Method void PdfName(String)>
	// 2579 6705:putstatic       #2754 <Field PdfName PRESERVERB>
		PRESSTEPS = new PdfName("PresSteps");
	// 2580 6708:new             #2   <Class PdfName>
	// 2581 6711:dup             
	// 2582 6712:ldc2            #2756 <String "PresSteps">
	// 2583 6715:invokespecial   #803 <Method void PdfName(String)>
	// 2584 6718:putstatic       #2758 <Field PdfName PRESSTEPS>
		PREV = new PdfName("Prev");
	// 2585 6721:new             #2   <Class PdfName>
	// 2586 6724:dup             
	// 2587 6725:ldc2            #2760 <String "Prev">
	// 2588 6728:invokespecial   #803 <Method void PdfName(String)>
	// 2589 6731:putstatic       #2762 <Field PdfName PREV>
		PREVPAGE = new PdfName("PrevPage");
	// 2590 6734:new             #2   <Class PdfName>
	// 2591 6737:dup             
	// 2592 6738:ldc2            #2764 <String "PrevPage">
	// 2593 6741:invokespecial   #803 <Method void PdfName(String)>
	// 2594 6744:putstatic       #2766 <Field PdfName PREVPAGE>
		PRINT = new PdfName("Print");
	// 2595 6747:new             #2   <Class PdfName>
	// 2596 6750:dup             
	// 2597 6751:ldc2            #2768 <String "Print">
	// 2598 6754:invokespecial   #803 <Method void PdfName(String)>
	// 2599 6757:putstatic       #2770 <Field PdfName PRINT>
		PRINTAREA = new PdfName("PrintArea");
	// 2600 6760:new             #2   <Class PdfName>
	// 2601 6763:dup             
	// 2602 6764:ldc2            #2772 <String "PrintArea">
	// 2603 6767:invokespecial   #803 <Method void PdfName(String)>
	// 2604 6770:putstatic       #2774 <Field PdfName PRINTAREA>
		PRINTCLIP = new PdfName("PrintClip");
	// 2605 6773:new             #2   <Class PdfName>
	// 2606 6776:dup             
	// 2607 6777:ldc2            #2776 <String "PrintClip">
	// 2608 6780:invokespecial   #803 <Method void PdfName(String)>
	// 2609 6783:putstatic       #2778 <Field PdfName PRINTCLIP>
		PRINTERMARK = new PdfName("PrinterMark");
	// 2610 6786:new             #2   <Class PdfName>
	// 2611 6789:dup             
	// 2612 6790:ldc2            #2780 <String "PrinterMark">
	// 2613 6793:invokespecial   #803 <Method void PdfName(String)>
	// 2614 6796:putstatic       #2782 <Field PdfName PRINTERMARK>
		PRINTFIELD = new PdfName("PrintField");
	// 2615 6799:new             #2   <Class PdfName>
	// 2616 6802:dup             
	// 2617 6803:ldc2            #2784 <String "PrintField">
	// 2618 6806:invokespecial   #803 <Method void PdfName(String)>
	// 2619 6809:putstatic       #2786 <Field PdfName PRINTFIELD>
		PRINTPAGERANGE = new PdfName("PrintPageRange");
	// 2620 6812:new             #2   <Class PdfName>
	// 2621 6815:dup             
	// 2622 6816:ldc2            #2788 <String "PrintPageRange">
	// 2623 6819:invokespecial   #803 <Method void PdfName(String)>
	// 2624 6822:putstatic       #2790 <Field PdfName PRINTPAGERANGE>
		PRINTSCALING = new PdfName("PrintScaling");
	// 2625 6825:new             #2   <Class PdfName>
	// 2626 6828:dup             
	// 2627 6829:ldc2            #2792 <String "PrintScaling">
	// 2628 6832:invokespecial   #803 <Method void PdfName(String)>
	// 2629 6835:putstatic       #2794 <Field PdfName PRINTSCALING>
		PRINTSTATE = new PdfName("PrintState");
	// 2630 6838:new             #2   <Class PdfName>
	// 2631 6841:dup             
	// 2632 6842:ldc2            #2796 <String "PrintState">
	// 2633 6845:invokespecial   #803 <Method void PdfName(String)>
	// 2634 6848:putstatic       #2798 <Field PdfName PRINTSTATE>
		PRIVATE = new PdfName("Private");
	// 2635 6851:new             #2   <Class PdfName>
	// 2636 6854:dup             
	// 2637 6855:ldc2            #2800 <String "Private">
	// 2638 6858:invokespecial   #803 <Method void PdfName(String)>
	// 2639 6861:putstatic       #2802 <Field PdfName PRIVATE>
		PROCSET = new PdfName("ProcSet");
	// 2640 6864:new             #2   <Class PdfName>
	// 2641 6867:dup             
	// 2642 6868:ldc2            #2804 <String "ProcSet">
	// 2643 6871:invokespecial   #803 <Method void PdfName(String)>
	// 2644 6874:putstatic       #2806 <Field PdfName PROCSET>
		PRODUCER = new PdfName("Producer");
	// 2645 6877:new             #2   <Class PdfName>
	// 2646 6880:dup             
	// 2647 6881:ldc2            #2808 <String "Producer">
	// 2648 6884:invokespecial   #803 <Method void PdfName(String)>
	// 2649 6887:putstatic       #2810 <Field PdfName PRODUCER>
		PROJCS = new PdfName("PROJCS");
	// 2650 6890:new             #2   <Class PdfName>
	// 2651 6893:dup             
	// 2652 6894:ldc2            #2811 <String "PROJCS">
	// 2653 6897:invokespecial   #803 <Method void PdfName(String)>
	// 2654 6900:putstatic       #2813 <Field PdfName PROJCS>
		PROP_BUILD = new PdfName("Prop_Build");
	// 2655 6903:new             #2   <Class PdfName>
	// 2656 6906:dup             
	// 2657 6907:ldc2            #2815 <String "Prop_Build">
	// 2658 6910:invokespecial   #803 <Method void PdfName(String)>
	// 2659 6913:putstatic       #2817 <Field PdfName PROP_BUILD>
		PROPERTIES = new PdfName("Properties");
	// 2660 6916:new             #2   <Class PdfName>
	// 2661 6919:dup             
	// 2662 6920:ldc2            #2819 <String "Properties">
	// 2663 6923:invokespecial   #803 <Method void PdfName(String)>
	// 2664 6926:putstatic       #2821 <Field PdfName PROPERTIES>
		PS = new PdfName("PS");
	// 2665 6929:new             #2   <Class PdfName>
	// 2666 6932:dup             
	// 2667 6933:ldc2            #2822 <String "PS">
	// 2668 6936:invokespecial   #803 <Method void PdfName(String)>
	// 2669 6939:putstatic       #2824 <Field PdfName PS>
		PTDATA = new PdfName("PtData");
	// 2670 6942:new             #2   <Class PdfName>
	// 2671 6945:dup             
	// 2672 6946:ldc2            #2826 <String "PtData">
	// 2673 6949:invokespecial   #803 <Method void PdfName(String)>
	// 2674 6952:putstatic       #2828 <Field PdfName PTDATA>
		PUBSEC = new PdfName("Adobe.PubSec");
	// 2675 6955:new             #2   <Class PdfName>
	// 2676 6958:dup             
	// 2677 6959:ldc2            #2830 <String "Adobe.PubSec">
	// 2678 6962:invokespecial   #803 <Method void PdfName(String)>
	// 2679 6965:putstatic       #2832 <Field PdfName PUBSEC>
		PV = new PdfName("PV");
	// 2680 6968:new             #2   <Class PdfName>
	// 2681 6971:dup             
	// 2682 6972:ldc2            #2833 <String "PV">
	// 2683 6975:invokespecial   #803 <Method void PdfName(String)>
	// 2684 6978:putstatic       #2835 <Field PdfName PV>
		Q = new PdfName("Q");
	// 2685 6981:new             #2   <Class PdfName>
	// 2686 6984:dup             
	// 2687 6985:ldc2            #2836 <String "Q">
	// 2688 6988:invokespecial   #803 <Method void PdfName(String)>
	// 2689 6991:putstatic       #2838 <Field PdfName Q>
		QUADPOINTS = new PdfName("QuadPoints");
	// 2690 6994:new             #2   <Class PdfName>
	// 2691 6997:dup             
	// 2692 6998:ldc2            #2840 <String "QuadPoints">
	// 2693 7001:invokespecial   #803 <Method void PdfName(String)>
	// 2694 7004:putstatic       #2842 <Field PdfName QUADPOINTS>
		QUOTE = new PdfName("Quote");
	// 2695 7007:new             #2   <Class PdfName>
	// 2696 7010:dup             
	// 2697 7011:ldc2            #2844 <String "Quote">
	// 2698 7014:invokespecial   #803 <Method void PdfName(String)>
	// 2699 7017:putstatic       #2846 <Field PdfName QUOTE>
		R = new PdfName("R");
	// 2700 7020:new             #2   <Class PdfName>
	// 2701 7023:dup             
	// 2702 7024:ldc2            #2847 <String "R">
	// 2703 7027:invokespecial   #803 <Method void PdfName(String)>
	// 2704 7030:putstatic       #2849 <Field PdfName R>
		R2L = new PdfName("R2L");
	// 2705 7033:new             #2   <Class PdfName>
	// 2706 7036:dup             
	// 2707 7037:ldc2            #2850 <String "R2L">
	// 2708 7040:invokespecial   #803 <Method void PdfName(String)>
	// 2709 7043:putstatic       #2852 <Field PdfName R2L>
		RANGE = new PdfName("Range");
	// 2710 7046:new             #2   <Class PdfName>
	// 2711 7049:dup             
	// 2712 7050:ldc2            #2854 <String "Range">
	// 2713 7053:invokespecial   #803 <Method void PdfName(String)>
	// 2714 7056:putstatic       #2856 <Field PdfName RANGE>
		RB = new PdfName("RB");
	// 2715 7059:new             #2   <Class PdfName>
	// 2716 7062:dup             
	// 2717 7063:ldc2            #2857 <String "RB">
	// 2718 7066:invokespecial   #803 <Method void PdfName(String)>
	// 2719 7069:putstatic       #2859 <Field PdfName RB>
		rb = new PdfName("rb");
	// 2720 7072:new             #2   <Class PdfName>
	// 2721 7075:dup             
	// 2722 7076:ldc2            #2860 <String "rb">
	// 2723 7079:invokespecial   #803 <Method void PdfName(String)>
	// 2724 7082:putstatic       #2862 <Field PdfName rb>
		RBGROUPS = new PdfName("RBGroups");
	// 2725 7085:new             #2   <Class PdfName>
	// 2726 7088:dup             
	// 2727 7089:ldc2            #2864 <String "RBGroups">
	// 2728 7092:invokespecial   #803 <Method void PdfName(String)>
	// 2729 7095:putstatic       #2866 <Field PdfName RBGROUPS>
		RC = new PdfName("RC");
	// 2730 7098:new             #2   <Class PdfName>
	// 2731 7101:dup             
	// 2732 7102:ldc2            #2867 <String "RC">
	// 2733 7105:invokespecial   #803 <Method void PdfName(String)>
	// 2734 7108:putstatic       #2869 <Field PdfName RC>
		RD = new PdfName("RD");
	// 2735 7111:new             #2   <Class PdfName>
	// 2736 7114:dup             
	// 2737 7115:ldc2            #2870 <String "RD">
	// 2738 7118:invokespecial   #803 <Method void PdfName(String)>
	// 2739 7121:putstatic       #2872 <Field PdfName RD>
		REASON = new PdfName("Reason");
	// 2740 7124:new             #2   <Class PdfName>
	// 2741 7127:dup             
	// 2742 7128:ldc2            #2874 <String "Reason">
	// 2743 7131:invokespecial   #803 <Method void PdfName(String)>
	// 2744 7134:putstatic       #2876 <Field PdfName REASON>
		RECIPIENTS = new PdfName("Recipients");
	// 2745 7137:new             #2   <Class PdfName>
	// 2746 7140:dup             
	// 2747 7141:ldc2            #2878 <String "Recipients">
	// 2748 7144:invokespecial   #803 <Method void PdfName(String)>
	// 2749 7147:putstatic       #2880 <Field PdfName RECIPIENTS>
		RECT = new PdfName("Rect");
	// 2750 7150:new             #2   <Class PdfName>
	// 2751 7153:dup             
	// 2752 7154:ldc2            #2882 <String "Rect">
	// 2753 7157:invokespecial   #803 <Method void PdfName(String)>
	// 2754 7160:putstatic       #2884 <Field PdfName RECT>
		REDACT = new PdfName("Redact");
	// 2755 7163:new             #2   <Class PdfName>
	// 2756 7166:dup             
	// 2757 7167:ldc2            #2886 <String "Redact">
	// 2758 7170:invokespecial   #803 <Method void PdfName(String)>
	// 2759 7173:putstatic       #2888 <Field PdfName REDACT>
		REFERENCE = new PdfName("Reference");
	// 2760 7176:new             #2   <Class PdfName>
	// 2761 7179:dup             
	// 2762 7180:ldc2            #2890 <String "Reference">
	// 2763 7183:invokespecial   #803 <Method void PdfName(String)>
	// 2764 7186:putstatic       #2892 <Field PdfName REFERENCE>
		REGISTRY = new PdfName("Registry");
	// 2765 7189:new             #2   <Class PdfName>
	// 2766 7192:dup             
	// 2767 7193:ldc2            #2894 <String "Registry">
	// 2768 7196:invokespecial   #803 <Method void PdfName(String)>
	// 2769 7199:putstatic       #2896 <Field PdfName REGISTRY>
		REGISTRYNAME = new PdfName("RegistryName");
	// 2770 7202:new             #2   <Class PdfName>
	// 2771 7205:dup             
	// 2772 7206:ldc2            #2898 <String "RegistryName">
	// 2773 7209:invokespecial   #803 <Method void PdfName(String)>
	// 2774 7212:putstatic       #2900 <Field PdfName REGISTRYNAME>
		RELATIVECOLORIMETRIC = new PdfName("RelativeColorimetric");
	// 2775 7215:new             #2   <Class PdfName>
	// 2776 7218:dup             
	// 2777 7219:ldc2            #2902 <String "RelativeColorimetric">
	// 2778 7222:invokespecial   #803 <Method void PdfName(String)>
	// 2779 7225:putstatic       #2904 <Field PdfName RELATIVECOLORIMETRIC>
		RENDITION = new PdfName("Rendition");
	// 2780 7228:new             #2   <Class PdfName>
	// 2781 7231:dup             
	// 2782 7232:ldc2            #2906 <String "Rendition">
	// 2783 7235:invokespecial   #803 <Method void PdfName(String)>
	// 2784 7238:putstatic       #2908 <Field PdfName RENDITION>
		REPEAT = new PdfName("Repeat");
	// 2785 7241:new             #2   <Class PdfName>
	// 2786 7244:dup             
	// 2787 7245:ldc2            #2910 <String "Repeat">
	// 2788 7248:invokespecial   #803 <Method void PdfName(String)>
	// 2789 7251:putstatic       #2912 <Field PdfName REPEAT>
		RESETFORM = new PdfName("ResetForm");
	// 2790 7254:new             #2   <Class PdfName>
	// 2791 7257:dup             
	// 2792 7258:ldc2            #2914 <String "ResetForm">
	// 2793 7261:invokespecial   #803 <Method void PdfName(String)>
	// 2794 7264:putstatic       #2916 <Field PdfName RESETFORM>
		RESOURCES = new PdfName("Resources");
	// 2795 7267:new             #2   <Class PdfName>
	// 2796 7270:dup             
	// 2797 7271:ldc2            #2918 <String "Resources">
	// 2798 7274:invokespecial   #803 <Method void PdfName(String)>
	// 2799 7277:putstatic       #2920 <Field PdfName RESOURCES>
		REQUIREMENTS = new PdfName("Requirements");
	// 2800 7280:new             #2   <Class PdfName>
	// 2801 7283:dup             
	// 2802 7284:ldc2            #2922 <String "Requirements">
	// 2803 7287:invokespecial   #803 <Method void PdfName(String)>
	// 2804 7290:putstatic       #2924 <Field PdfName REQUIREMENTS>
		REVERSEDCHARS = new PdfName("ReversedChars");
	// 2805 7293:new             #2   <Class PdfName>
	// 2806 7296:dup             
	// 2807 7297:ldc2            #2926 <String "ReversedChars">
	// 2808 7300:invokespecial   #803 <Method void PdfName(String)>
	// 2809 7303:putstatic       #2928 <Field PdfName REVERSEDCHARS>
		RI = new PdfName("RI");
	// 2810 7306:new             #2   <Class PdfName>
	// 2811 7309:dup             
	// 2812 7310:ldc2            #2929 <String "RI">
	// 2813 7313:invokespecial   #803 <Method void PdfName(String)>
	// 2814 7316:putstatic       #2931 <Field PdfName RI>
		RICHMEDIA = new PdfName("RichMedia");
	// 2815 7319:new             #2   <Class PdfName>
	// 2816 7322:dup             
	// 2817 7323:ldc2            #2933 <String "RichMedia">
	// 2818 7326:invokespecial   #803 <Method void PdfName(String)>
	// 2819 7329:putstatic       #2935 <Field PdfName RICHMEDIA>
		RICHMEDIAACTIVATION = new PdfName("RichMediaActivation");
	// 2820 7332:new             #2   <Class PdfName>
	// 2821 7335:dup             
	// 2822 7336:ldc2            #2937 <String "RichMediaActivation">
	// 2823 7339:invokespecial   #803 <Method void PdfName(String)>
	// 2824 7342:putstatic       #2939 <Field PdfName RICHMEDIAACTIVATION>
		RICHMEDIAANIMATION = new PdfName("RichMediaAnimation");
	// 2825 7345:new             #2   <Class PdfName>
	// 2826 7348:dup             
	// 2827 7349:ldc2            #2941 <String "RichMediaAnimation">
	// 2828 7352:invokespecial   #803 <Method void PdfName(String)>
	// 2829 7355:putstatic       #2943 <Field PdfName RICHMEDIAANIMATION>
		RICHMEDIACOMMAND = new PdfName("RichMediaCommand");
	// 2830 7358:new             #2   <Class PdfName>
	// 2831 7361:dup             
	// 2832 7362:ldc2            #2945 <String "RichMediaCommand">
	// 2833 7365:invokespecial   #803 <Method void PdfName(String)>
	// 2834 7368:putstatic       #2947 <Field PdfName RICHMEDIACOMMAND>
		RICHMEDIACONFIGURATION = new PdfName("RichMediaConfiguration");
	// 2835 7371:new             #2   <Class PdfName>
	// 2836 7374:dup             
	// 2837 7375:ldc2            #2949 <String "RichMediaConfiguration">
	// 2838 7378:invokespecial   #803 <Method void PdfName(String)>
	// 2839 7381:putstatic       #2951 <Field PdfName RICHMEDIACONFIGURATION>
		RICHMEDIACONTENT = new PdfName("RichMediaContent");
	// 2840 7384:new             #2   <Class PdfName>
	// 2841 7387:dup             
	// 2842 7388:ldc2            #2953 <String "RichMediaContent">
	// 2843 7391:invokespecial   #803 <Method void PdfName(String)>
	// 2844 7394:putstatic       #2955 <Field PdfName RICHMEDIACONTENT>
		RICHMEDIADEACTIVATION = new PdfName("RichMediaDeactivation");
	// 2845 7397:new             #2   <Class PdfName>
	// 2846 7400:dup             
	// 2847 7401:ldc2            #2957 <String "RichMediaDeactivation">
	// 2848 7404:invokespecial   #803 <Method void PdfName(String)>
	// 2849 7407:putstatic       #2959 <Field PdfName RICHMEDIADEACTIVATION>
		RICHMEDIAEXECUTE = new PdfName("RichMediaExecute");
	// 2850 7410:new             #2   <Class PdfName>
	// 2851 7413:dup             
	// 2852 7414:ldc2            #2961 <String "RichMediaExecute">
	// 2853 7417:invokespecial   #803 <Method void PdfName(String)>
	// 2854 7420:putstatic       #2963 <Field PdfName RICHMEDIAEXECUTE>
		RICHMEDIAINSTANCE = new PdfName("RichMediaInstance");
	// 2855 7423:new             #2   <Class PdfName>
	// 2856 7426:dup             
	// 2857 7427:ldc2            #2965 <String "RichMediaInstance">
	// 2858 7430:invokespecial   #803 <Method void PdfName(String)>
	// 2859 7433:putstatic       #2967 <Field PdfName RICHMEDIAINSTANCE>
		RICHMEDIAPARAMS = new PdfName("RichMediaParams");
	// 2860 7436:new             #2   <Class PdfName>
	// 2861 7439:dup             
	// 2862 7440:ldc2            #2969 <String "RichMediaParams">
	// 2863 7443:invokespecial   #803 <Method void PdfName(String)>
	// 2864 7446:putstatic       #2971 <Field PdfName RICHMEDIAPARAMS>
		RICHMEDIAPOSITION = new PdfName("RichMediaPosition");
	// 2865 7449:new             #2   <Class PdfName>
	// 2866 7452:dup             
	// 2867 7453:ldc2            #2973 <String "RichMediaPosition">
	// 2868 7456:invokespecial   #803 <Method void PdfName(String)>
	// 2869 7459:putstatic       #2975 <Field PdfName RICHMEDIAPOSITION>
		RICHMEDIAPRESENTATION = new PdfName("RichMediaPresentation");
	// 2870 7462:new             #2   <Class PdfName>
	// 2871 7465:dup             
	// 2872 7466:ldc2            #2977 <String "RichMediaPresentation">
	// 2873 7469:invokespecial   #803 <Method void PdfName(String)>
	// 2874 7472:putstatic       #2979 <Field PdfName RICHMEDIAPRESENTATION>
		RICHMEDIASETTINGS = new PdfName("RichMediaSettings");
	// 2875 7475:new             #2   <Class PdfName>
	// 2876 7478:dup             
	// 2877 7479:ldc2            #2981 <String "RichMediaSettings">
	// 2878 7482:invokespecial   #803 <Method void PdfName(String)>
	// 2879 7485:putstatic       #2983 <Field PdfName RICHMEDIASETTINGS>
		RICHMEDIAWINDOW = new PdfName("RichMediaWindow");
	// 2880 7488:new             #2   <Class PdfName>
	// 2881 7491:dup             
	// 2882 7492:ldc2            #2985 <String "RichMediaWindow">
	// 2883 7495:invokespecial   #803 <Method void PdfName(String)>
	// 2884 7498:putstatic       #2987 <Field PdfName RICHMEDIAWINDOW>
		RL = new PdfName("RL");
	// 2885 7501:new             #2   <Class PdfName>
	// 2886 7504:dup             
	// 2887 7505:ldc2            #2988 <String "RL">
	// 2888 7508:invokespecial   #803 <Method void PdfName(String)>
	// 2889 7511:putstatic       #2990 <Field PdfName RL>
		ROLE = new PdfName("Role");
	// 2890 7514:new             #2   <Class PdfName>
	// 2891 7517:dup             
	// 2892 7518:ldc2            #2992 <String "Role">
	// 2893 7521:invokespecial   #803 <Method void PdfName(String)>
	// 2894 7524:putstatic       #2994 <Field PdfName ROLE>
		RO = new PdfName("RO");
	// 2895 7527:new             #2   <Class PdfName>
	// 2896 7530:dup             
	// 2897 7531:ldc2            #2995 <String "RO">
	// 2898 7534:invokespecial   #803 <Method void PdfName(String)>
	// 2899 7537:putstatic       #2997 <Field PdfName RO>
		ROLEMAP = new PdfName("RoleMap");
	// 2900 7540:new             #2   <Class PdfName>
	// 2901 7543:dup             
	// 2902 7544:ldc2            #2999 <String "RoleMap">
	// 2903 7547:invokespecial   #803 <Method void PdfName(String)>
	// 2904 7550:putstatic       #3001 <Field PdfName ROLEMAP>
		ROOT = new PdfName("Root");
	// 2905 7553:new             #2   <Class PdfName>
	// 2906 7556:dup             
	// 2907 7557:ldc2            #3003 <String "Root">
	// 2908 7560:invokespecial   #803 <Method void PdfName(String)>
	// 2909 7563:putstatic       #3005 <Field PdfName ROOT>
		ROTATE = new PdfName("Rotate");
	// 2910 7566:new             #2   <Class PdfName>
	// 2911 7569:dup             
	// 2912 7570:ldc2            #3007 <String "Rotate">
	// 2913 7573:invokespecial   #803 <Method void PdfName(String)>
	// 2914 7576:putstatic       #3009 <Field PdfName ROTATE>
		ROW = new PdfName("Row");
	// 2915 7579:new             #2   <Class PdfName>
	// 2916 7582:dup             
	// 2917 7583:ldc2            #3011 <String "Row">
	// 2918 7586:invokespecial   #803 <Method void PdfName(String)>
	// 2919 7589:putstatic       #3013 <Field PdfName ROW>
		ROWS = new PdfName("Rows");
	// 2920 7592:new             #2   <Class PdfName>
	// 2921 7595:dup             
	// 2922 7596:ldc2            #3015 <String "Rows">
	// 2923 7599:invokespecial   #803 <Method void PdfName(String)>
	// 2924 7602:putstatic       #3017 <Field PdfName ROWS>
		ROWSPAN = new PdfName("RowSpan");
	// 2925 7605:new             #2   <Class PdfName>
	// 2926 7608:dup             
	// 2927 7609:ldc2            #3019 <String "RowSpan">
	// 2928 7612:invokespecial   #803 <Method void PdfName(String)>
	// 2929 7615:putstatic       #3021 <Field PdfName ROWSPAN>
		RP = new PdfName("RP");
	// 2930 7618:new             #2   <Class PdfName>
	// 2931 7621:dup             
	// 2932 7622:ldc2            #3022 <String "RP">
	// 2933 7625:invokespecial   #803 <Method void PdfName(String)>
	// 2934 7628:putstatic       #3024 <Field PdfName RP>
		RT = new PdfName("RT");
	// 2935 7631:new             #2   <Class PdfName>
	// 2936 7634:dup             
	// 2937 7635:ldc2            #3025 <String "RT">
	// 2938 7638:invokespecial   #803 <Method void PdfName(String)>
	// 2939 7641:putstatic       #3027 <Field PdfName RT>
		RUBY = new PdfName("Ruby");
	// 2940 7644:new             #2   <Class PdfName>
	// 2941 7647:dup             
	// 2942 7648:ldc2            #3029 <String "Ruby">
	// 2943 7651:invokespecial   #803 <Method void PdfName(String)>
	// 2944 7654:putstatic       #3031 <Field PdfName RUBY>
		RUNLENGTHDECODE = new PdfName("RunLengthDecode");
	// 2945 7657:new             #2   <Class PdfName>
	// 2946 7660:dup             
	// 2947 7661:ldc2            #3033 <String "RunLengthDecode">
	// 2948 7664:invokespecial   #803 <Method void PdfName(String)>
	// 2949 7667:putstatic       #3035 <Field PdfName RUNLENGTHDECODE>
		RV = new PdfName("RV");
	// 2950 7670:new             #2   <Class PdfName>
	// 2951 7673:dup             
	// 2952 7674:ldc2            #3036 <String "RV">
	// 2953 7677:invokespecial   #803 <Method void PdfName(String)>
	// 2954 7680:putstatic       #3038 <Field PdfName RV>
		S = new PdfName("S");
	// 2955 7683:new             #2   <Class PdfName>
	// 2956 7686:dup             
	// 2957 7687:ldc2            #3039 <String "S">
	// 2958 7690:invokespecial   #803 <Method void PdfName(String)>
	// 2959 7693:putstatic       #3041 <Field PdfName S>
		SATURATION = new PdfName("Saturation");
	// 2960 7696:new             #2   <Class PdfName>
	// 2961 7699:dup             
	// 2962 7700:ldc2            #3043 <String "Saturation">
	// 2963 7703:invokespecial   #803 <Method void PdfName(String)>
	// 2964 7706:putstatic       #3045 <Field PdfName SATURATION>
		SCHEMA = new PdfName("Schema");
	// 2965 7709:new             #2   <Class PdfName>
	// 2966 7712:dup             
	// 2967 7713:ldc2            #3047 <String "Schema">
	// 2968 7716:invokespecial   #803 <Method void PdfName(String)>
	// 2969 7719:putstatic       #3049 <Field PdfName SCHEMA>
		SCOPE = new PdfName("Scope");
	// 2970 7722:new             #2   <Class PdfName>
	// 2971 7725:dup             
	// 2972 7726:ldc2            #3051 <String "Scope">
	// 2973 7729:invokespecial   #803 <Method void PdfName(String)>
	// 2974 7732:putstatic       #3053 <Field PdfName SCOPE>
		SCREEN = new PdfName("Screen");
	// 2975 7735:new             #2   <Class PdfName>
	// 2976 7738:dup             
	// 2977 7739:ldc2            #3055 <String "Screen">
	// 2978 7742:invokespecial   #803 <Method void PdfName(String)>
	// 2979 7745:putstatic       #3057 <Field PdfName SCREEN>
		SCRIPTS = new PdfName("Scripts");
	// 2980 7748:new             #2   <Class PdfName>
	// 2981 7751:dup             
	// 2982 7752:ldc2            #3059 <String "Scripts">
	// 2983 7755:invokespecial   #803 <Method void PdfName(String)>
	// 2984 7758:putstatic       #3061 <Field PdfName SCRIPTS>
		SECT = new PdfName("Sect");
	// 2985 7761:new             #2   <Class PdfName>
	// 2986 7764:dup             
	// 2987 7765:ldc2            #3063 <String "Sect">
	// 2988 7768:invokespecial   #803 <Method void PdfName(String)>
	// 2989 7771:putstatic       #3065 <Field PdfName SECT>
		SEPARATION = new PdfName("Separation");
	// 2990 7774:new             #2   <Class PdfName>
	// 2991 7777:dup             
	// 2992 7778:ldc2            #3067 <String "Separation">
	// 2993 7781:invokespecial   #803 <Method void PdfName(String)>
	// 2994 7784:putstatic       #3069 <Field PdfName SEPARATION>
		SETOCGSTATE = new PdfName("SetOCGState");
	// 2995 7787:new             #2   <Class PdfName>
	// 2996 7790:dup             
	// 2997 7791:ldc2            #3071 <String "SetOCGState">
	// 2998 7794:invokespecial   #803 <Method void PdfName(String)>
	// 2999 7797:putstatic       #3073 <Field PdfName SETOCGSTATE>
		SETTINGS = new PdfName("Settings");
	// 3000 7800:new             #2   <Class PdfName>
	// 3001 7803:dup             
	// 3002 7804:ldc2            #3075 <String "Settings">
	// 3003 7807:invokespecial   #803 <Method void PdfName(String)>
	// 3004 7810:putstatic       #3077 <Field PdfName SETTINGS>
		SHADING = new PdfName("Shading");
	// 3005 7813:new             #2   <Class PdfName>
	// 3006 7816:dup             
	// 3007 7817:ldc2            #3079 <String "Shading">
	// 3008 7820:invokespecial   #803 <Method void PdfName(String)>
	// 3009 7823:putstatic       #3081 <Field PdfName SHADING>
		SHADINGTYPE = new PdfName("ShadingType");
	// 3010 7826:new             #2   <Class PdfName>
	// 3011 7829:dup             
	// 3012 7830:ldc2            #3083 <String "ShadingType">
	// 3013 7833:invokespecial   #803 <Method void PdfName(String)>
	// 3014 7836:putstatic       #3085 <Field PdfName SHADINGTYPE>
		SHIFT_JIS = new PdfName("Shift-JIS");
	// 3015 7839:new             #2   <Class PdfName>
	// 3016 7842:dup             
	// 3017 7843:ldc2            #3087 <String "Shift-JIS">
	// 3018 7846:invokespecial   #803 <Method void PdfName(String)>
	// 3019 7849:putstatic       #3089 <Field PdfName SHIFT_JIS>
		SIG = new PdfName("Sig");
	// 3020 7852:new             #2   <Class PdfName>
	// 3021 7855:dup             
	// 3022 7856:ldc2            #3091 <String "Sig">
	// 3023 7859:invokespecial   #803 <Method void PdfName(String)>
	// 3024 7862:putstatic       #3093 <Field PdfName SIG>
		SIGFIELDLOCK = new PdfName("SigFieldLock");
	// 3025 7865:new             #2   <Class PdfName>
	// 3026 7868:dup             
	// 3027 7869:ldc2            #3095 <String "SigFieldLock">
	// 3028 7872:invokespecial   #803 <Method void PdfName(String)>
	// 3029 7875:putstatic       #3097 <Field PdfName SIGFIELDLOCK>
		SIGFLAGS = new PdfName("SigFlags");
	// 3030 7878:new             #2   <Class PdfName>
	// 3031 7881:dup             
	// 3032 7882:ldc2            #3099 <String "SigFlags">
	// 3033 7885:invokespecial   #803 <Method void PdfName(String)>
	// 3034 7888:putstatic       #3101 <Field PdfName SIGFLAGS>
		SIGREF = new PdfName("SigRef");
	// 3035 7891:new             #2   <Class PdfName>
	// 3036 7894:dup             
	// 3037 7895:ldc2            #3103 <String "SigRef">
	// 3038 7898:invokespecial   #803 <Method void PdfName(String)>
	// 3039 7901:putstatic       #3105 <Field PdfName SIGREF>
		SIMPLEX = new PdfName("Simplex");
	// 3040 7904:new             #2   <Class PdfName>
	// 3041 7907:dup             
	// 3042 7908:ldc2            #3107 <String "Simplex">
	// 3043 7911:invokespecial   #803 <Method void PdfName(String)>
	// 3044 7914:putstatic       #3109 <Field PdfName SIMPLEX>
		SINGLEPAGE = new PdfName("SinglePage");
	// 3045 7917:new             #2   <Class PdfName>
	// 3046 7920:dup             
	// 3047 7921:ldc2            #3111 <String "SinglePage">
	// 3048 7924:invokespecial   #803 <Method void PdfName(String)>
	// 3049 7927:putstatic       #3113 <Field PdfName SINGLEPAGE>
		SIZE = new PdfName("Size");
	// 3050 7930:new             #2   <Class PdfName>
	// 3051 7933:dup             
	// 3052 7934:ldc2            #3115 <String "Size">
	// 3053 7937:invokespecial   #803 <Method void PdfName(String)>
	// 3054 7940:putstatic       #3117 <Field PdfName SIZE>
		SMASK = new PdfName("SMask");
	// 3055 7943:new             #2   <Class PdfName>
	// 3056 7946:dup             
	// 3057 7947:ldc2            #3119 <String "SMask">
	// 3058 7950:invokespecial   #803 <Method void PdfName(String)>
	// 3059 7953:putstatic       #3121 <Field PdfName SMASK>
		SMASKINDATA = new PdfName("SMaskInData");
	// 3060 7956:new             #2   <Class PdfName>
	// 3061 7959:dup             
	// 3062 7960:ldc2            #3123 <String "SMaskInData">
	// 3063 7963:invokespecial   #803 <Method void PdfName(String)>
	// 3064 7966:putstatic       #3125 <Field PdfName SMASKINDATA>
		SORT = new PdfName("Sort");
	// 3065 7969:new             #2   <Class PdfName>
	// 3066 7972:dup             
	// 3067 7973:ldc2            #3127 <String "Sort">
	// 3068 7976:invokespecial   #803 <Method void PdfName(String)>
	// 3069 7979:putstatic       #3129 <Field PdfName SORT>
		SOUND = new PdfName("Sound");
	// 3070 7982:new             #2   <Class PdfName>
	// 3071 7985:dup             
	// 3072 7986:ldc2            #3131 <String "Sound">
	// 3073 7989:invokespecial   #803 <Method void PdfName(String)>
	// 3074 7992:putstatic       #3133 <Field PdfName SOUND>
		SPACEAFTER = new PdfName("SpaceAfter");
	// 3075 7995:new             #2   <Class PdfName>
	// 3076 7998:dup             
	// 3077 7999:ldc2            #3135 <String "SpaceAfter">
	// 3078 8002:invokespecial   #803 <Method void PdfName(String)>
	// 3079 8005:putstatic       #3137 <Field PdfName SPACEAFTER>
		SPACEBEFORE = new PdfName("SpaceBefore");
	// 3080 8008:new             #2   <Class PdfName>
	// 3081 8011:dup             
	// 3082 8012:ldc2            #3139 <String "SpaceBefore">
	// 3083 8015:invokespecial   #803 <Method void PdfName(String)>
	// 3084 8018:putstatic       #3141 <Field PdfName SPACEBEFORE>
		SPAN = new PdfName("Span");
	// 3085 8021:new             #2   <Class PdfName>
	// 3086 8024:dup             
	// 3087 8025:ldc2            #3143 <String "Span">
	// 3088 8028:invokespecial   #803 <Method void PdfName(String)>
	// 3089 8031:putstatic       #3145 <Field PdfName SPAN>
		SPEED = new PdfName("Speed");
	// 3090 8034:new             #2   <Class PdfName>
	// 3091 8037:dup             
	// 3092 8038:ldc2            #3147 <String "Speed">
	// 3093 8041:invokespecial   #803 <Method void PdfName(String)>
	// 3094 8044:putstatic       #3149 <Field PdfName SPEED>
		SPLIT = new PdfName("Split");
	// 3095 8047:new             #2   <Class PdfName>
	// 3096 8050:dup             
	// 3097 8051:ldc2            #3151 <String "Split">
	// 3098 8054:invokespecial   #803 <Method void PdfName(String)>
	// 3099 8057:putstatic       #3153 <Field PdfName SPLIT>
		SQUARE = new PdfName("Square");
	// 3100 8060:new             #2   <Class PdfName>
	// 3101 8063:dup             
	// 3102 8064:ldc2            #3155 <String "Square">
	// 3103 8067:invokespecial   #803 <Method void PdfName(String)>
	// 3104 8070:putstatic       #3157 <Field PdfName SQUARE>
		SQUIGGLY = new PdfName("Squiggly");
	// 3105 8073:new             #2   <Class PdfName>
	// 3106 8076:dup             
	// 3107 8077:ldc2            #3159 <String "Squiggly">
	// 3108 8080:invokespecial   #803 <Method void PdfName(String)>
	// 3109 8083:putstatic       #3161 <Field PdfName SQUIGGLY>
		SS = new PdfName("SS");
	// 3110 8086:new             #2   <Class PdfName>
	// 3111 8089:dup             
	// 3112 8090:ldc2            #3162 <String "SS">
	// 3113 8093:invokespecial   #803 <Method void PdfName(String)>
	// 3114 8096:putstatic       #3164 <Field PdfName SS>
		ST = new PdfName("St");
	// 3115 8099:new             #2   <Class PdfName>
	// 3116 8102:dup             
	// 3117 8103:ldc2            #3166 <String "St">
	// 3118 8106:invokespecial   #803 <Method void PdfName(String)>
	// 3119 8109:putstatic       #3168 <Field PdfName ST>
		STAMP = new PdfName("Stamp");
	// 3120 8112:new             #2   <Class PdfName>
	// 3121 8115:dup             
	// 3122 8116:ldc2            #3170 <String "Stamp">
	// 3123 8119:invokespecial   #803 <Method void PdfName(String)>
	// 3124 8122:putstatic       #3172 <Field PdfName STAMP>
		STATUS = new PdfName("Status");
	// 3125 8125:new             #2   <Class PdfName>
	// 3126 8128:dup             
	// 3127 8129:ldc2            #3174 <String "Status">
	// 3128 8132:invokespecial   #803 <Method void PdfName(String)>
	// 3129 8135:putstatic       #3176 <Field PdfName STATUS>
		STANDARD = new PdfName("Standard");
	// 3130 8138:new             #2   <Class PdfName>
	// 3131 8141:dup             
	// 3132 8142:ldc2            #3178 <String "Standard">
	// 3133 8145:invokespecial   #803 <Method void PdfName(String)>
	// 3134 8148:putstatic       #3180 <Field PdfName STANDARD>
		START = new PdfName("Start");
	// 3135 8151:new             #2   <Class PdfName>
	// 3136 8154:dup             
	// 3137 8155:ldc2            #3182 <String "Start">
	// 3138 8158:invokespecial   #803 <Method void PdfName(String)>
	// 3139 8161:putstatic       #3184 <Field PdfName START>
		STARTINDENT = new PdfName("StartIndent");
	// 3140 8164:new             #2   <Class PdfName>
	// 3141 8167:dup             
	// 3142 8168:ldc2            #3186 <String "StartIndent">
	// 3143 8171:invokespecial   #803 <Method void PdfName(String)>
	// 3144 8174:putstatic       #3188 <Field PdfName STARTINDENT>
		STATE = new PdfName("State");
	// 3145 8177:new             #2   <Class PdfName>
	// 3146 8180:dup             
	// 3147 8181:ldc2            #3190 <String "State">
	// 3148 8184:invokespecial   #803 <Method void PdfName(String)>
	// 3149 8187:putstatic       #3192 <Field PdfName STATE>
		STDCF = new PdfName("StdCF");
	// 3150 8190:new             #2   <Class PdfName>
	// 3151 8193:dup             
	// 3152 8194:ldc2            #3194 <String "StdCF">
	// 3153 8197:invokespecial   #803 <Method void PdfName(String)>
	// 3154 8200:putstatic       #3196 <Field PdfName STDCF>
		STEMV = new PdfName("StemV");
	// 3155 8203:new             #2   <Class PdfName>
	// 3156 8206:dup             
	// 3157 8207:ldc2            #3198 <String "StemV">
	// 3158 8210:invokespecial   #803 <Method void PdfName(String)>
	// 3159 8213:putstatic       #3200 <Field PdfName STEMV>
		STMF = new PdfName("StmF");
	// 3160 8216:new             #2   <Class PdfName>
	// 3161 8219:dup             
	// 3162 8220:ldc2            #3202 <String "StmF">
	// 3163 8223:invokespecial   #803 <Method void PdfName(String)>
	// 3164 8226:putstatic       #3204 <Field PdfName STMF>
		STRF = new PdfName("StrF");
	// 3165 8229:new             #2   <Class PdfName>
	// 3166 8232:dup             
	// 3167 8233:ldc2            #3206 <String "StrF">
	// 3168 8236:invokespecial   #803 <Method void PdfName(String)>
	// 3169 8239:putstatic       #3208 <Field PdfName STRF>
		STRIKEOUT = new PdfName("StrikeOut");
	// 3170 8242:new             #2   <Class PdfName>
	// 3171 8245:dup             
	// 3172 8246:ldc2            #3210 <String "StrikeOut">
	// 3173 8249:invokespecial   #803 <Method void PdfName(String)>
	// 3174 8252:putstatic       #3212 <Field PdfName STRIKEOUT>
		STRUCTELEM = new PdfName("StructElem");
	// 3175 8255:new             #2   <Class PdfName>
	// 3176 8258:dup             
	// 3177 8259:ldc2            #3214 <String "StructElem">
	// 3178 8262:invokespecial   #803 <Method void PdfName(String)>
	// 3179 8265:putstatic       #3216 <Field PdfName STRUCTELEM>
		STRUCTPARENT = new PdfName("StructParent");
	// 3180 8268:new             #2   <Class PdfName>
	// 3181 8271:dup             
	// 3182 8272:ldc2            #3218 <String "StructParent">
	// 3183 8275:invokespecial   #803 <Method void PdfName(String)>
	// 3184 8278:putstatic       #3220 <Field PdfName STRUCTPARENT>
		STRUCTPARENTS = new PdfName("StructParents");
	// 3185 8281:new             #2   <Class PdfName>
	// 3186 8284:dup             
	// 3187 8285:ldc2            #3222 <String "StructParents">
	// 3188 8288:invokespecial   #803 <Method void PdfName(String)>
	// 3189 8291:putstatic       #3224 <Field PdfName STRUCTPARENTS>
		STRUCTTREEROOT = new PdfName("StructTreeRoot");
	// 3190 8294:new             #2   <Class PdfName>
	// 3191 8297:dup             
	// 3192 8298:ldc2            #3226 <String "StructTreeRoot">
	// 3193 8301:invokespecial   #803 <Method void PdfName(String)>
	// 3194 8304:putstatic       #3228 <Field PdfName STRUCTTREEROOT>
		STYLE = new PdfName("Style");
	// 3195 8307:new             #2   <Class PdfName>
	// 3196 8310:dup             
	// 3197 8311:ldc2            #3230 <String "Style">
	// 3198 8314:invokespecial   #803 <Method void PdfName(String)>
	// 3199 8317:putstatic       #3232 <Field PdfName STYLE>
		SUBFILTER = new PdfName("SubFilter");
	// 3200 8320:new             #2   <Class PdfName>
	// 3201 8323:dup             
	// 3202 8324:ldc2            #3234 <String "SubFilter">
	// 3203 8327:invokespecial   #803 <Method void PdfName(String)>
	// 3204 8330:putstatic       #3236 <Field PdfName SUBFILTER>
		SUBJECT = new PdfName("Subject");
	// 3205 8333:new             #2   <Class PdfName>
	// 3206 8336:dup             
	// 3207 8337:ldc2            #3238 <String "Subject">
	// 3208 8340:invokespecial   #803 <Method void PdfName(String)>
	// 3209 8343:putstatic       #3240 <Field PdfName SUBJECT>
		SUBMITFORM = new PdfName("SubmitForm");
	// 3210 8346:new             #2   <Class PdfName>
	// 3211 8349:dup             
	// 3212 8350:ldc2            #3242 <String "SubmitForm">
	// 3213 8353:invokespecial   #803 <Method void PdfName(String)>
	// 3214 8356:putstatic       #3244 <Field PdfName SUBMITFORM>
		SUBTYPE = new PdfName("Subtype");
	// 3215 8359:new             #2   <Class PdfName>
	// 3216 8362:dup             
	// 3217 8363:ldc2            #3246 <String "Subtype">
	// 3218 8366:invokespecial   #803 <Method void PdfName(String)>
	// 3219 8369:putstatic       #3248 <Field PdfName SUBTYPE>
		SUMMARY = new PdfName("Summary");
	// 3220 8372:new             #2   <Class PdfName>
	// 3221 8375:dup             
	// 3222 8376:ldc2            #3250 <String "Summary">
	// 3223 8379:invokespecial   #803 <Method void PdfName(String)>
	// 3224 8382:putstatic       #3252 <Field PdfName SUMMARY>
		SUPPLEMENT = new PdfName("Supplement");
	// 3225 8385:new             #2   <Class PdfName>
	// 3226 8388:dup             
	// 3227 8389:ldc2            #3254 <String "Supplement">
	// 3228 8392:invokespecial   #803 <Method void PdfName(String)>
	// 3229 8395:putstatic       #3256 <Field PdfName SUPPLEMENT>
		SV = new PdfName("SV");
	// 3230 8398:new             #2   <Class PdfName>
	// 3231 8401:dup             
	// 3232 8402:ldc2            #3257 <String "SV">
	// 3233 8405:invokespecial   #803 <Method void PdfName(String)>
	// 3234 8408:putstatic       #3259 <Field PdfName SV>
		SW = new PdfName("SW");
	// 3235 8411:new             #2   <Class PdfName>
	// 3236 8414:dup             
	// 3237 8415:ldc2            #3260 <String "SW">
	// 3238 8418:invokespecial   #803 <Method void PdfName(String)>
	// 3239 8421:putstatic       #3262 <Field PdfName SW>
		SYMBOL = new PdfName("Symbol");
	// 3240 8424:new             #2   <Class PdfName>
	// 3241 8427:dup             
	// 3242 8428:ldc2            #3264 <String "Symbol">
	// 3243 8431:invokespecial   #803 <Method void PdfName(String)>
	// 3244 8434:putstatic       #3266 <Field PdfName SYMBOL>
		T = new PdfName("T");
	// 3245 8437:new             #2   <Class PdfName>
	// 3246 8440:dup             
	// 3247 8441:ldc2            #3267 <String "T">
	// 3248 8444:invokespecial   #803 <Method void PdfName(String)>
	// 3249 8447:putstatic       #3269 <Field PdfName T>
		TA = new PdfName("TA");
	// 3250 8450:new             #2   <Class PdfName>
	// 3251 8453:dup             
	// 3252 8454:ldc2            #3270 <String "TA">
	// 3253 8457:invokespecial   #803 <Method void PdfName(String)>
	// 3254 8460:putstatic       #3272 <Field PdfName TA>
		TABLE = new PdfName("Table");
	// 3255 8463:new             #2   <Class PdfName>
	// 3256 8466:dup             
	// 3257 8467:ldc2            #3274 <String "Table">
	// 3258 8470:invokespecial   #803 <Method void PdfName(String)>
	// 3259 8473:putstatic       #3276 <Field PdfName TABLE>
		TABS = new PdfName("Tabs");
	// 3260 8476:new             #2   <Class PdfName>
	// 3261 8479:dup             
	// 3262 8480:ldc2            #3278 <String "Tabs">
	// 3263 8483:invokespecial   #803 <Method void PdfName(String)>
	// 3264 8486:putstatic       #3280 <Field PdfName TABS>
		TBODY = new PdfName("TBody");
	// 3265 8489:new             #2   <Class PdfName>
	// 3266 8492:dup             
	// 3267 8493:ldc2            #3282 <String "TBody">
	// 3268 8496:invokespecial   #803 <Method void PdfName(String)>
	// 3269 8499:putstatic       #3284 <Field PdfName TBODY>
		TD = new PdfName("TD");
	// 3270 8502:new             #2   <Class PdfName>
	// 3271 8505:dup             
	// 3272 8506:ldc2            #3285 <String "TD">
	// 3273 8509:invokespecial   #803 <Method void PdfName(String)>
	// 3274 8512:putstatic       #3287 <Field PdfName TD>
		TR = new PdfName("TR");
	// 3275 8515:new             #2   <Class PdfName>
	// 3276 8518:dup             
	// 3277 8519:ldc2            #3288 <String "TR">
	// 3278 8522:invokespecial   #803 <Method void PdfName(String)>
	// 3279 8525:putstatic       #3290 <Field PdfName TR>
		TR2 = new PdfName("TR2");
	// 3280 8528:new             #2   <Class PdfName>
	// 3281 8531:dup             
	// 3282 8532:ldc2            #3291 <String "TR2">
	// 3283 8535:invokespecial   #803 <Method void PdfName(String)>
	// 3284 8538:putstatic       #3293 <Field PdfName TR2>
		TEXT = new PdfName("Text");
	// 3285 8541:new             #2   <Class PdfName>
	// 3286 8544:dup             
	// 3287 8545:ldc2            #3295 <String "Text">
	// 3288 8548:invokespecial   #803 <Method void PdfName(String)>
	// 3289 8551:putstatic       #3297 <Field PdfName TEXT>
		TEXTALIGN = new PdfName("TextAlign");
	// 3290 8554:new             #2   <Class PdfName>
	// 3291 8557:dup             
	// 3292 8558:ldc2            #3299 <String "TextAlign">
	// 3293 8561:invokespecial   #803 <Method void PdfName(String)>
	// 3294 8564:putstatic       #3301 <Field PdfName TEXTALIGN>
		TEXTDECORATIONCOLOR = new PdfName("TextDecorationColor");
	// 3295 8567:new             #2   <Class PdfName>
	// 3296 8570:dup             
	// 3297 8571:ldc2            #3303 <String "TextDecorationColor">
	// 3298 8574:invokespecial   #803 <Method void PdfName(String)>
	// 3299 8577:putstatic       #3305 <Field PdfName TEXTDECORATIONCOLOR>
		TEXTDECORATIONTHICKNESS = new PdfName("TextDecorationThickness");
	// 3300 8580:new             #2   <Class PdfName>
	// 3301 8583:dup             
	// 3302 8584:ldc2            #3307 <String "TextDecorationThickness">
	// 3303 8587:invokespecial   #803 <Method void PdfName(String)>
	// 3304 8590:putstatic       #3309 <Field PdfName TEXTDECORATIONTHICKNESS>
		TEXTDECORATIONTYPE = new PdfName("TextDecorationType");
	// 3305 8593:new             #2   <Class PdfName>
	// 3306 8596:dup             
	// 3307 8597:ldc2            #3311 <String "TextDecorationType">
	// 3308 8600:invokespecial   #803 <Method void PdfName(String)>
	// 3309 8603:putstatic       #3313 <Field PdfName TEXTDECORATIONTYPE>
		TEXTINDENT = new PdfName("TextIndent");
	// 3310 8606:new             #2   <Class PdfName>
	// 3311 8609:dup             
	// 3312 8610:ldc2            #3315 <String "TextIndent">
	// 3313 8613:invokespecial   #803 <Method void PdfName(String)>
	// 3314 8616:putstatic       #3317 <Field PdfName TEXTINDENT>
		TFOOT = new PdfName("TFoot");
	// 3315 8619:new             #2   <Class PdfName>
	// 3316 8622:dup             
	// 3317 8623:ldc2            #3319 <String "TFoot">
	// 3318 8626:invokespecial   #803 <Method void PdfName(String)>
	// 3319 8629:putstatic       #3321 <Field PdfName TFOOT>
		TH = new PdfName("TH");
	// 3320 8632:new             #2   <Class PdfName>
	// 3321 8635:dup             
	// 3322 8636:ldc2            #3322 <String "TH">
	// 3323 8639:invokespecial   #803 <Method void PdfName(String)>
	// 3324 8642:putstatic       #3324 <Field PdfName TH>
		THEAD = new PdfName("THead");
	// 3325 8645:new             #2   <Class PdfName>
	// 3326 8648:dup             
	// 3327 8649:ldc2            #3326 <String "THead">
	// 3328 8652:invokespecial   #803 <Method void PdfName(String)>
	// 3329 8655:putstatic       #3328 <Field PdfName THEAD>
		THUMB = new PdfName("Thumb");
	// 3330 8658:new             #2   <Class PdfName>
	// 3331 8661:dup             
	// 3332 8662:ldc2            #3330 <String "Thumb">
	// 3333 8665:invokespecial   #803 <Method void PdfName(String)>
	// 3334 8668:putstatic       #3332 <Field PdfName THUMB>
		THREADS = new PdfName("Threads");
	// 3335 8671:new             #2   <Class PdfName>
	// 3336 8674:dup             
	// 3337 8675:ldc2            #3334 <String "Threads">
	// 3338 8678:invokespecial   #803 <Method void PdfName(String)>
	// 3339 8681:putstatic       #3336 <Field PdfName THREADS>
		TI = new PdfName("TI");
	// 3340 8684:new             #2   <Class PdfName>
	// 3341 8687:dup             
	// 3342 8688:ldc2            #3337 <String "TI">
	// 3343 8691:invokespecial   #803 <Method void PdfName(String)>
	// 3344 8694:putstatic       #3339 <Field PdfName TI>
		TIME = new PdfName("Time");
	// 3345 8697:new             #2   <Class PdfName>
	// 3346 8700:dup             
	// 3347 8701:ldc2            #3341 <String "Time">
	// 3348 8704:invokespecial   #803 <Method void PdfName(String)>
	// 3349 8707:putstatic       #3343 <Field PdfName TIME>
		TILINGTYPE = new PdfName("TilingType");
	// 3350 8710:new             #2   <Class PdfName>
	// 3351 8713:dup             
	// 3352 8714:ldc2            #3345 <String "TilingType">
	// 3353 8717:invokespecial   #803 <Method void PdfName(String)>
	// 3354 8720:putstatic       #3347 <Field PdfName TILINGTYPE>
		TIMES_ROMAN = new PdfName("Times-Roman");
	// 3355 8723:new             #2   <Class PdfName>
	// 3356 8726:dup             
	// 3357 8727:ldc2            #3349 <String "Times-Roman">
	// 3358 8730:invokespecial   #803 <Method void PdfName(String)>
	// 3359 8733:putstatic       #3351 <Field PdfName TIMES_ROMAN>
		TIMES_BOLD = new PdfName("Times-Bold");
	// 3360 8736:new             #2   <Class PdfName>
	// 3361 8739:dup             
	// 3362 8740:ldc2            #3353 <String "Times-Bold">
	// 3363 8743:invokespecial   #803 <Method void PdfName(String)>
	// 3364 8746:putstatic       #3355 <Field PdfName TIMES_BOLD>
		TIMES_ITALIC = new PdfName("Times-Italic");
	// 3365 8749:new             #2   <Class PdfName>
	// 3366 8752:dup             
	// 3367 8753:ldc2            #3357 <String "Times-Italic">
	// 3368 8756:invokespecial   #803 <Method void PdfName(String)>
	// 3369 8759:putstatic       #3359 <Field PdfName TIMES_ITALIC>
		TIMES_BOLDITALIC = new PdfName("Times-BoldItalic");
	// 3370 8762:new             #2   <Class PdfName>
	// 3371 8765:dup             
	// 3372 8766:ldc2            #3361 <String "Times-BoldItalic">
	// 3373 8769:invokespecial   #803 <Method void PdfName(String)>
	// 3374 8772:putstatic       #3363 <Field PdfName TIMES_BOLDITALIC>
		TITLE = new PdfName("Title");
	// 3375 8775:new             #2   <Class PdfName>
	// 3376 8778:dup             
	// 3377 8779:ldc2            #3365 <String "Title">
	// 3378 8782:invokespecial   #803 <Method void PdfName(String)>
	// 3379 8785:putstatic       #3367 <Field PdfName TITLE>
		TK = new PdfName("TK");
	// 3380 8788:new             #2   <Class PdfName>
	// 3381 8791:dup             
	// 3382 8792:ldc2            #3368 <String "TK">
	// 3383 8795:invokespecial   #803 <Method void PdfName(String)>
	// 3384 8798:putstatic       #3370 <Field PdfName TK>
		TM = new PdfName("TM");
	// 3385 8801:new             #2   <Class PdfName>
	// 3386 8804:dup             
	// 3387 8805:ldc2            #3371 <String "TM">
	// 3388 8808:invokespecial   #803 <Method void PdfName(String)>
	// 3389 8811:putstatic       #3373 <Field PdfName TM>
		TOC = new PdfName("TOC");
	// 3390 8814:new             #2   <Class PdfName>
	// 3391 8817:dup             
	// 3392 8818:ldc2            #3374 <String "TOC">
	// 3393 8821:invokespecial   #803 <Method void PdfName(String)>
	// 3394 8824:putstatic       #3376 <Field PdfName TOC>
		TOCI = new PdfName("TOCI");
	// 3395 8827:new             #2   <Class PdfName>
	// 3396 8830:dup             
	// 3397 8831:ldc2            #3377 <String "TOCI">
	// 3398 8834:invokespecial   #803 <Method void PdfName(String)>
	// 3399 8837:putstatic       #3379 <Field PdfName TOCI>
		TOGGLE = new PdfName("Toggle");
	// 3400 8840:new             #2   <Class PdfName>
	// 3401 8843:dup             
	// 3402 8844:ldc2            #3381 <String "Toggle">
	// 3403 8847:invokespecial   #803 <Method void PdfName(String)>
	// 3404 8850:putstatic       #3383 <Field PdfName TOGGLE>
		TOOLBAR = new PdfName("Toolbar");
	// 3405 8853:new             #2   <Class PdfName>
	// 3406 8856:dup             
	// 3407 8857:ldc2            #3385 <String "Toolbar">
	// 3408 8860:invokespecial   #803 <Method void PdfName(String)>
	// 3409 8863:putstatic       #3387 <Field PdfName TOOLBAR>
		TOUNICODE = new PdfName("ToUnicode");
	// 3410 8866:new             #2   <Class PdfName>
	// 3411 8869:dup             
	// 3412 8870:ldc2            #3389 <String "ToUnicode">
	// 3413 8873:invokespecial   #803 <Method void PdfName(String)>
	// 3414 8876:putstatic       #3391 <Field PdfName TOUNICODE>
		TP = new PdfName("TP");
	// 3415 8879:new             #2   <Class PdfName>
	// 3416 8882:dup             
	// 3417 8883:ldc2            #3392 <String "TP">
	// 3418 8886:invokespecial   #803 <Method void PdfName(String)>
	// 3419 8889:putstatic       #3394 <Field PdfName TP>
		TABLEROW = new PdfName("TR");
	// 3420 8892:new             #2   <Class PdfName>
	// 3421 8895:dup             
	// 3422 8896:ldc2            #3288 <String "TR">
	// 3423 8899:invokespecial   #803 <Method void PdfName(String)>
	// 3424 8902:putstatic       #3396 <Field PdfName TABLEROW>
		TRANS = new PdfName("Trans");
	// 3425 8905:new             #2   <Class PdfName>
	// 3426 8908:dup             
	// 3427 8909:ldc2            #3398 <String "Trans">
	// 3428 8912:invokespecial   #803 <Method void PdfName(String)>
	// 3429 8915:putstatic       #3400 <Field PdfName TRANS>
		TRANSFORMPARAMS = new PdfName("TransformParams");
	// 3430 8918:new             #2   <Class PdfName>
	// 3431 8921:dup             
	// 3432 8922:ldc2            #3402 <String "TransformParams">
	// 3433 8925:invokespecial   #803 <Method void PdfName(String)>
	// 3434 8928:putstatic       #3404 <Field PdfName TRANSFORMPARAMS>
		TRANSFORMMETHOD = new PdfName("TransformMethod");
	// 3435 8931:new             #2   <Class PdfName>
	// 3436 8934:dup             
	// 3437 8935:ldc2            #3406 <String "TransformMethod">
	// 3438 8938:invokespecial   #803 <Method void PdfName(String)>
	// 3439 8941:putstatic       #3408 <Field PdfName TRANSFORMMETHOD>
		TRANSPARENCY = new PdfName("Transparency");
	// 3440 8944:new             #2   <Class PdfName>
	// 3441 8947:dup             
	// 3442 8948:ldc2            #3410 <String "Transparency">
	// 3443 8951:invokespecial   #803 <Method void PdfName(String)>
	// 3444 8954:putstatic       #3412 <Field PdfName TRANSPARENCY>
		TRANSPARENT = new PdfName("Transparent");
	// 3445 8957:new             #2   <Class PdfName>
	// 3446 8960:dup             
	// 3447 8961:ldc2            #3414 <String "Transparent">
	// 3448 8964:invokespecial   #803 <Method void PdfName(String)>
	// 3449 8967:putstatic       #3416 <Field PdfName TRANSPARENT>
		TRAPNET = new PdfName("TrapNet");
	// 3450 8970:new             #2   <Class PdfName>
	// 3451 8973:dup             
	// 3452 8974:ldc2            #3418 <String "TrapNet">
	// 3453 8977:invokespecial   #803 <Method void PdfName(String)>
	// 3454 8980:putstatic       #3420 <Field PdfName TRAPNET>
		TRAPPED = new PdfName("Trapped");
	// 3455 8983:new             #2   <Class PdfName>
	// 3456 8986:dup             
	// 3457 8987:ldc2            #3422 <String "Trapped">
	// 3458 8990:invokespecial   #803 <Method void PdfName(String)>
	// 3459 8993:putstatic       #3424 <Field PdfName TRAPPED>
		TRIMBOX = new PdfName("TrimBox");
	// 3460 8996:new             #2   <Class PdfName>
	// 3461 8999:dup             
	// 3462 9000:ldc2            #3426 <String "TrimBox">
	// 3463 9003:invokespecial   #803 <Method void PdfName(String)>
	// 3464 9006:putstatic       #3428 <Field PdfName TRIMBOX>
		TRUETYPE = new PdfName("TrueType");
	// 3465 9009:new             #2   <Class PdfName>
	// 3466 9012:dup             
	// 3467 9013:ldc2            #3430 <String "TrueType">
	// 3468 9016:invokespecial   #803 <Method void PdfName(String)>
	// 3469 9019:putstatic       #3432 <Field PdfName TRUETYPE>
		TS = new PdfName("TS");
	// 3470 9022:new             #2   <Class PdfName>
	// 3471 9025:dup             
	// 3472 9026:ldc2            #3433 <String "TS">
	// 3473 9029:invokespecial   #803 <Method void PdfName(String)>
	// 3474 9032:putstatic       #3435 <Field PdfName TS>
		TTL = new PdfName("Ttl");
	// 3475 9035:new             #2   <Class PdfName>
	// 3476 9038:dup             
	// 3477 9039:ldc2            #3437 <String "Ttl">
	// 3478 9042:invokespecial   #803 <Method void PdfName(String)>
	// 3479 9045:putstatic       #3439 <Field PdfName TTL>
		TU = new PdfName("TU");
	// 3480 9048:new             #2   <Class PdfName>
	// 3481 9051:dup             
	// 3482 9052:ldc2            #3440 <String "TU">
	// 3483 9055:invokespecial   #803 <Method void PdfName(String)>
	// 3484 9058:putstatic       #3442 <Field PdfName TU>
		TV = new PdfName("tv");
	// 3485 9061:new             #2   <Class PdfName>
	// 3486 9064:dup             
	// 3487 9065:ldc2            #3444 <String "tv">
	// 3488 9068:invokespecial   #803 <Method void PdfName(String)>
	// 3489 9071:putstatic       #3446 <Field PdfName TV>
		TWOCOLUMNLEFT = new PdfName("TwoColumnLeft");
	// 3490 9074:new             #2   <Class PdfName>
	// 3491 9077:dup             
	// 3492 9078:ldc2            #3448 <String "TwoColumnLeft">
	// 3493 9081:invokespecial   #803 <Method void PdfName(String)>
	// 3494 9084:putstatic       #3450 <Field PdfName TWOCOLUMNLEFT>
		TWOCOLUMNRIGHT = new PdfName("TwoColumnRight");
	// 3495 9087:new             #2   <Class PdfName>
	// 3496 9090:dup             
	// 3497 9091:ldc2            #3452 <String "TwoColumnRight">
	// 3498 9094:invokespecial   #803 <Method void PdfName(String)>
	// 3499 9097:putstatic       #3454 <Field PdfName TWOCOLUMNRIGHT>
		TWOPAGELEFT = new PdfName("TwoPageLeft");
	// 3500 9100:new             #2   <Class PdfName>
	// 3501 9103:dup             
	// 3502 9104:ldc2            #3456 <String "TwoPageLeft">
	// 3503 9107:invokespecial   #803 <Method void PdfName(String)>
	// 3504 9110:putstatic       #3458 <Field PdfName TWOPAGELEFT>
		TWOPAGERIGHT = new PdfName("TwoPageRight");
	// 3505 9113:new             #2   <Class PdfName>
	// 3506 9116:dup             
	// 3507 9117:ldc2            #3460 <String "TwoPageRight">
	// 3508 9120:invokespecial   #803 <Method void PdfName(String)>
	// 3509 9123:putstatic       #3462 <Field PdfName TWOPAGERIGHT>
		TX = new PdfName("Tx");
	// 3510 9126:new             #2   <Class PdfName>
	// 3511 9129:dup             
	// 3512 9130:ldc2            #3464 <String "Tx">
	// 3513 9133:invokespecial   #803 <Method void PdfName(String)>
	// 3514 9136:putstatic       #3466 <Field PdfName TX>
		TYPE = new PdfName("Type");
	// 3515 9139:new             #2   <Class PdfName>
	// 3516 9142:dup             
	// 3517 9143:ldc2            #3468 <String "Type">
	// 3518 9146:invokespecial   #803 <Method void PdfName(String)>
	// 3519 9149:putstatic       #3470 <Field PdfName TYPE>
		TYPE0 = new PdfName("Type0");
	// 3520 9152:new             #2   <Class PdfName>
	// 3521 9155:dup             
	// 3522 9156:ldc2            #3472 <String "Type0">
	// 3523 9159:invokespecial   #803 <Method void PdfName(String)>
	// 3524 9162:putstatic       #3474 <Field PdfName TYPE0>
		TYPE1 = new PdfName("Type1");
	// 3525 9165:new             #2   <Class PdfName>
	// 3526 9168:dup             
	// 3527 9169:ldc2            #3476 <String "Type1">
	// 3528 9172:invokespecial   #803 <Method void PdfName(String)>
	// 3529 9175:putstatic       #3478 <Field PdfName TYPE1>
		TYPE3 = new PdfName("Type3");
	// 3530 9178:new             #2   <Class PdfName>
	// 3531 9181:dup             
	// 3532 9182:ldc2            #3480 <String "Type3">
	// 3533 9185:invokespecial   #803 <Method void PdfName(String)>
	// 3534 9188:putstatic       #3482 <Field PdfName TYPE3>
		U = new PdfName("U");
	// 3535 9191:new             #2   <Class PdfName>
	// 3536 9194:dup             
	// 3537 9195:ldc2            #3483 <String "U">
	// 3538 9198:invokespecial   #803 <Method void PdfName(String)>
	// 3539 9201:putstatic       #3485 <Field PdfName U>
		UE = new PdfName("UE");
	// 3540 9204:new             #2   <Class PdfName>
	// 3541 9207:dup             
	// 3542 9208:ldc2            #3486 <String "UE">
	// 3543 9211:invokespecial   #803 <Method void PdfName(String)>
	// 3544 9214:putstatic       #3488 <Field PdfName UE>
		UF = new PdfName("UF");
	// 3545 9217:new             #2   <Class PdfName>
	// 3546 9220:dup             
	// 3547 9221:ldc2            #3489 <String "UF">
	// 3548 9224:invokespecial   #803 <Method void PdfName(String)>
	// 3549 9227:putstatic       #3491 <Field PdfName UF>
		UHC = new PdfName("UHC");
	// 3550 9230:new             #2   <Class PdfName>
	// 3551 9233:dup             
	// 3552 9234:ldc2            #3492 <String "UHC">
	// 3553 9237:invokespecial   #803 <Method void PdfName(String)>
	// 3554 9240:putstatic       #3494 <Field PdfName UHC>
		UNDERLINE = new PdfName("Underline");
	// 3555 9243:new             #2   <Class PdfName>
	// 3556 9246:dup             
	// 3557 9247:ldc2            #3496 <String "Underline">
	// 3558 9250:invokespecial   #803 <Method void PdfName(String)>
	// 3559 9253:putstatic       #3498 <Field PdfName UNDERLINE>
		UNIX = new PdfName("Unix");
	// 3560 9256:new             #2   <Class PdfName>
	// 3561 9259:dup             
	// 3562 9260:ldc2            #3500 <String "Unix">
	// 3563 9263:invokespecial   #803 <Method void PdfName(String)>
	// 3564 9266:putstatic       #3502 <Field PdfName UNIX>
		UPPERALPHA = new PdfName("UpperAlpha");
	// 3565 9269:new             #2   <Class PdfName>
	// 3566 9272:dup             
	// 3567 9273:ldc2            #3504 <String "UpperAlpha">
	// 3568 9276:invokespecial   #803 <Method void PdfName(String)>
	// 3569 9279:putstatic       #3506 <Field PdfName UPPERALPHA>
		UPPERROMAN = new PdfName("UpperRoman");
	// 3570 9282:new             #2   <Class PdfName>
	// 3571 9285:dup             
	// 3572 9286:ldc2            #3508 <String "UpperRoman">
	// 3573 9289:invokespecial   #803 <Method void PdfName(String)>
	// 3574 9292:putstatic       #3510 <Field PdfName UPPERROMAN>
		UR = new PdfName("UR");
	// 3575 9295:new             #2   <Class PdfName>
	// 3576 9298:dup             
	// 3577 9299:ldc2            #3511 <String "UR">
	// 3578 9302:invokespecial   #803 <Method void PdfName(String)>
	// 3579 9305:putstatic       #3513 <Field PdfName UR>
		UR3 = new PdfName("UR3");
	// 3580 9308:new             #2   <Class PdfName>
	// 3581 9311:dup             
	// 3582 9312:ldc2            #3514 <String "UR3">
	// 3583 9315:invokespecial   #803 <Method void PdfName(String)>
	// 3584 9318:putstatic       #3516 <Field PdfName UR3>
		URI = new PdfName("URI");
	// 3585 9321:new             #2   <Class PdfName>
	// 3586 9324:dup             
	// 3587 9325:ldc2            #3517 <String "URI">
	// 3588 9328:invokespecial   #803 <Method void PdfName(String)>
	// 3589 9331:putstatic       #3519 <Field PdfName URI>
		URL = new PdfName("URL");
	// 3590 9334:new             #2   <Class PdfName>
	// 3591 9337:dup             
	// 3592 9338:ldc2            #3520 <String "URL">
	// 3593 9341:invokespecial   #803 <Method void PdfName(String)>
	// 3594 9344:putstatic       #3522 <Field PdfName URL>
		USAGE = new PdfName("Usage");
	// 3595 9347:new             #2   <Class PdfName>
	// 3596 9350:dup             
	// 3597 9351:ldc2            #3524 <String "Usage">
	// 3598 9354:invokespecial   #803 <Method void PdfName(String)>
	// 3599 9357:putstatic       #3526 <Field PdfName USAGE>
		USEATTACHMENTS = new PdfName("UseAttachments");
	// 3600 9360:new             #2   <Class PdfName>
	// 3601 9363:dup             
	// 3602 9364:ldc2            #3528 <String "UseAttachments">
	// 3603 9367:invokespecial   #803 <Method void PdfName(String)>
	// 3604 9370:putstatic       #3530 <Field PdfName USEATTACHMENTS>
		USENONE = new PdfName("UseNone");
	// 3605 9373:new             #2   <Class PdfName>
	// 3606 9376:dup             
	// 3607 9377:ldc2            #3532 <String "UseNone">
	// 3608 9380:invokespecial   #803 <Method void PdfName(String)>
	// 3609 9383:putstatic       #3534 <Field PdfName USENONE>
		USEOC = new PdfName("UseOC");
	// 3610 9386:new             #2   <Class PdfName>
	// 3611 9389:dup             
	// 3612 9390:ldc2            #3536 <String "UseOC">
	// 3613 9393:invokespecial   #803 <Method void PdfName(String)>
	// 3614 9396:putstatic       #3538 <Field PdfName USEOC>
		USEOUTLINES = new PdfName("UseOutlines");
	// 3615 9399:new             #2   <Class PdfName>
	// 3616 9402:dup             
	// 3617 9403:ldc2            #3540 <String "UseOutlines">
	// 3618 9406:invokespecial   #803 <Method void PdfName(String)>
	// 3619 9409:putstatic       #3542 <Field PdfName USEOUTLINES>
		USER = new PdfName("User");
	// 3620 9412:new             #2   <Class PdfName>
	// 3621 9415:dup             
	// 3622 9416:ldc2            #3544 <String "User">
	// 3623 9419:invokespecial   #803 <Method void PdfName(String)>
	// 3624 9422:putstatic       #3546 <Field PdfName USER>
		USERPROPERTIES = new PdfName("UserProperties");
	// 3625 9425:new             #2   <Class PdfName>
	// 3626 9428:dup             
	// 3627 9429:ldc2            #3548 <String "UserProperties">
	// 3628 9432:invokespecial   #803 <Method void PdfName(String)>
	// 3629 9435:putstatic       #3550 <Field PdfName USERPROPERTIES>
		USERUNIT = new PdfName("UserUnit");
	// 3630 9438:new             #2   <Class PdfName>
	// 3631 9441:dup             
	// 3632 9442:ldc2            #3552 <String "UserUnit">
	// 3633 9445:invokespecial   #803 <Method void PdfName(String)>
	// 3634 9448:putstatic       #3554 <Field PdfName USERUNIT>
		USETHUMBS = new PdfName("UseThumbs");
	// 3635 9451:new             #2   <Class PdfName>
	// 3636 9454:dup             
	// 3637 9455:ldc2            #3556 <String "UseThumbs">
	// 3638 9458:invokespecial   #803 <Method void PdfName(String)>
	// 3639 9461:putstatic       #3558 <Field PdfName USETHUMBS>
		UTF_8 = new PdfName("utf_8");
	// 3640 9464:new             #2   <Class PdfName>
	// 3641 9467:dup             
	// 3642 9468:ldc2            #3560 <String "utf_8">
	// 3643 9471:invokespecial   #803 <Method void PdfName(String)>
	// 3644 9474:putstatic       #3562 <Field PdfName UTF_8>
		V = new PdfName("V");
	// 3645 9477:new             #2   <Class PdfName>
	// 3646 9480:dup             
	// 3647 9481:ldc2            #3563 <String "V">
	// 3648 9484:invokespecial   #803 <Method void PdfName(String)>
	// 3649 9487:putstatic       #3565 <Field PdfName V>
		V2 = new PdfName("V2");
	// 3650 9490:new             #2   <Class PdfName>
	// 3651 9493:dup             
	// 3652 9494:ldc2            #3566 <String "V2">
	// 3653 9497:invokespecial   #803 <Method void PdfName(String)>
	// 3654 9500:putstatic       #3568 <Field PdfName V2>
		VALIGN = new PdfName("VAlign");
	// 3655 9503:new             #2   <Class PdfName>
	// 3656 9506:dup             
	// 3657 9507:ldc2            #3570 <String "VAlign">
	// 3658 9510:invokespecial   #803 <Method void PdfName(String)>
	// 3659 9513:putstatic       #3572 <Field PdfName VALIGN>
		VE = new PdfName("VE");
	// 3660 9516:new             #2   <Class PdfName>
	// 3661 9519:dup             
	// 3662 9520:ldc2            #3573 <String "VE">
	// 3663 9523:invokespecial   #803 <Method void PdfName(String)>
	// 3664 9526:putstatic       #3575 <Field PdfName VE>
		VERISIGN_PPKVS = new PdfName("VeriSign.PPKVS");
	// 3665 9529:new             #2   <Class PdfName>
	// 3666 9532:dup             
	// 3667 9533:ldc2            #3577 <String "VeriSign.PPKVS">
	// 3668 9536:invokespecial   #803 <Method void PdfName(String)>
	// 3669 9539:putstatic       #3579 <Field PdfName VERISIGN_PPKVS>
		VERSION = new PdfName("Version");
	// 3670 9542:new             #2   <Class PdfName>
	// 3671 9545:dup             
	// 3672 9546:ldc2            #3581 <String "Version">
	// 3673 9549:invokespecial   #803 <Method void PdfName(String)>
	// 3674 9552:putstatic       #3583 <Field PdfName VERSION>
		VERTICES = new PdfName("Vertices");
	// 3675 9555:new             #2   <Class PdfName>
	// 3676 9558:dup             
	// 3677 9559:ldc2            #3585 <String "Vertices">
	// 3678 9562:invokespecial   #803 <Method void PdfName(String)>
	// 3679 9565:putstatic       #3587 <Field PdfName VERTICES>
		VIDEO = new PdfName("Video");
	// 3680 9568:new             #2   <Class PdfName>
	// 3681 9571:dup             
	// 3682 9572:ldc2            #3589 <String "Video">
	// 3683 9575:invokespecial   #803 <Method void PdfName(String)>
	// 3684 9578:putstatic       #3591 <Field PdfName VIDEO>
		VIEW = new PdfName("View");
	// 3685 9581:new             #2   <Class PdfName>
	// 3686 9584:dup             
	// 3687 9585:ldc2            #3593 <String "View">
	// 3688 9588:invokespecial   #803 <Method void PdfName(String)>
	// 3689 9591:putstatic       #3595 <Field PdfName VIEW>
		VIEWS = new PdfName("Views");
	// 3690 9594:new             #2   <Class PdfName>
	// 3691 9597:dup             
	// 3692 9598:ldc2            #3597 <String "Views">
	// 3693 9601:invokespecial   #803 <Method void PdfName(String)>
	// 3694 9604:putstatic       #3599 <Field PdfName VIEWS>
		VIEWAREA = new PdfName("ViewArea");
	// 3695 9607:new             #2   <Class PdfName>
	// 3696 9610:dup             
	// 3697 9611:ldc2            #3601 <String "ViewArea">
	// 3698 9614:invokespecial   #803 <Method void PdfName(String)>
	// 3699 9617:putstatic       #3603 <Field PdfName VIEWAREA>
		VIEWCLIP = new PdfName("ViewClip");
	// 3700 9620:new             #2   <Class PdfName>
	// 3701 9623:dup             
	// 3702 9624:ldc2            #3605 <String "ViewClip">
	// 3703 9627:invokespecial   #803 <Method void PdfName(String)>
	// 3704 9630:putstatic       #3607 <Field PdfName VIEWCLIP>
		VIEWERPREFERENCES = new PdfName("ViewerPreferences");
	// 3705 9633:new             #2   <Class PdfName>
	// 3706 9636:dup             
	// 3707 9637:ldc2            #3609 <String "ViewerPreferences">
	// 3708 9640:invokespecial   #803 <Method void PdfName(String)>
	// 3709 9643:putstatic       #3611 <Field PdfName VIEWERPREFERENCES>
		VIEWPORT = new PdfName("Viewport");
	// 3710 9646:new             #2   <Class PdfName>
	// 3711 9649:dup             
	// 3712 9650:ldc2            #3613 <String "Viewport">
	// 3713 9653:invokespecial   #803 <Method void PdfName(String)>
	// 3714 9656:putstatic       #3615 <Field PdfName VIEWPORT>
		VIEWSTATE = new PdfName("ViewState");
	// 3715 9659:new             #2   <Class PdfName>
	// 3716 9662:dup             
	// 3717 9663:ldc2            #3617 <String "ViewState">
	// 3718 9666:invokespecial   #803 <Method void PdfName(String)>
	// 3719 9669:putstatic       #3619 <Field PdfName VIEWSTATE>
		VISIBLEPAGES = new PdfName("VisiblePages");
	// 3720 9672:new             #2   <Class PdfName>
	// 3721 9675:dup             
	// 3722 9676:ldc2            #3621 <String "VisiblePages">
	// 3723 9679:invokespecial   #803 <Method void PdfName(String)>
	// 3724 9682:putstatic       #3623 <Field PdfName VISIBLEPAGES>
		VOFFSET = new PdfName("VOffset");
	// 3725 9685:new             #2   <Class PdfName>
	// 3726 9688:dup             
	// 3727 9689:ldc2            #3625 <String "VOffset">
	// 3728 9692:invokespecial   #803 <Method void PdfName(String)>
	// 3729 9695:putstatic       #3627 <Field PdfName VOFFSET>
		VP = new PdfName("VP");
	// 3730 9698:new             #2   <Class PdfName>
	// 3731 9701:dup             
	// 3732 9702:ldc2            #3628 <String "VP">
	// 3733 9705:invokespecial   #803 <Method void PdfName(String)>
	// 3734 9708:putstatic       #3630 <Field PdfName VP>
		VRI = new PdfName("VRI");
	// 3735 9711:new             #2   <Class PdfName>
	// 3736 9714:dup             
	// 3737 9715:ldc2            #3631 <String "VRI">
	// 3738 9718:invokespecial   #803 <Method void PdfName(String)>
	// 3739 9721:putstatic       #3633 <Field PdfName VRI>
		W = new PdfName("W");
	// 3740 9724:new             #2   <Class PdfName>
	// 3741 9727:dup             
	// 3742 9728:ldc2            #3634 <String "W">
	// 3743 9731:invokespecial   #803 <Method void PdfName(String)>
	// 3744 9734:putstatic       #3636 <Field PdfName W>
		W2 = new PdfName("W2");
	// 3745 9737:new             #2   <Class PdfName>
	// 3746 9740:dup             
	// 3747 9741:ldc2            #3637 <String "W2">
	// 3748 9744:invokespecial   #803 <Method void PdfName(String)>
	// 3749 9747:putstatic       #3639 <Field PdfName W2>
		WARICHU = new PdfName("Warichu");
	// 3750 9750:new             #2   <Class PdfName>
	// 3751 9753:dup             
	// 3752 9754:ldc2            #3641 <String "Warichu">
	// 3753 9757:invokespecial   #803 <Method void PdfName(String)>
	// 3754 9760:putstatic       #3643 <Field PdfName WARICHU>
		WATERMARK = new PdfName("Watermark");
	// 3755 9763:new             #2   <Class PdfName>
	// 3756 9766:dup             
	// 3757 9767:ldc2            #3645 <String "Watermark">
	// 3758 9770:invokespecial   #803 <Method void PdfName(String)>
	// 3759 9773:putstatic       #3647 <Field PdfName WATERMARK>
		WC = new PdfName("WC");
	// 3760 9776:new             #2   <Class PdfName>
	// 3761 9779:dup             
	// 3762 9780:ldc2            #3648 <String "WC">
	// 3763 9783:invokespecial   #803 <Method void PdfName(String)>
	// 3764 9786:putstatic       #3650 <Field PdfName WC>
		WIDGET = new PdfName("Widget");
	// 3765 9789:new             #2   <Class PdfName>
	// 3766 9792:dup             
	// 3767 9793:ldc2            #3652 <String "Widget">
	// 3768 9796:invokespecial   #803 <Method void PdfName(String)>
	// 3769 9799:putstatic       #3654 <Field PdfName WIDGET>
		WIDTH = new PdfName("Width");
	// 3770 9802:new             #2   <Class PdfName>
	// 3771 9805:dup             
	// 3772 9806:ldc2            #3656 <String "Width">
	// 3773 9809:invokespecial   #803 <Method void PdfName(String)>
	// 3774 9812:putstatic       #3658 <Field PdfName WIDTH>
		WIDTHS = new PdfName("Widths");
	// 3775 9815:new             #2   <Class PdfName>
	// 3776 9818:dup             
	// 3777 9819:ldc2            #3660 <String "Widths">
	// 3778 9822:invokespecial   #803 <Method void PdfName(String)>
	// 3779 9825:putstatic       #3662 <Field PdfName WIDTHS>
		WIN = new PdfName("Win");
	// 3780 9828:new             #2   <Class PdfName>
	// 3781 9831:dup             
	// 3782 9832:ldc2            #3664 <String "Win">
	// 3783 9835:invokespecial   #803 <Method void PdfName(String)>
	// 3784 9838:putstatic       #3666 <Field PdfName WIN>
		WIN_ANSI_ENCODING = new PdfName("WinAnsiEncoding");
	// 3785 9841:new             #2   <Class PdfName>
	// 3786 9844:dup             
	// 3787 9845:ldc2            #3668 <String "WinAnsiEncoding">
	// 3788 9848:invokespecial   #803 <Method void PdfName(String)>
	// 3789 9851:putstatic       #3670 <Field PdfName WIN_ANSI_ENCODING>
		WINDOW = new PdfName("Window");
	// 3790 9854:new             #2   <Class PdfName>
	// 3791 9857:dup             
	// 3792 9858:ldc2            #3672 <String "Window">
	// 3793 9861:invokespecial   #803 <Method void PdfName(String)>
	// 3794 9864:putstatic       #3674 <Field PdfName WINDOW>
		WINDOWED = new PdfName("Windowed");
	// 3795 9867:new             #2   <Class PdfName>
	// 3796 9870:dup             
	// 3797 9871:ldc2            #3676 <String "Windowed">
	// 3798 9874:invokespecial   #803 <Method void PdfName(String)>
	// 3799 9877:putstatic       #3678 <Field PdfName WINDOWED>
		WIPE = new PdfName("Wipe");
	// 3800 9880:new             #2   <Class PdfName>
	// 3801 9883:dup             
	// 3802 9884:ldc2            #3680 <String "Wipe">
	// 3803 9887:invokespecial   #803 <Method void PdfName(String)>
	// 3804 9890:putstatic       #3682 <Field PdfName WIPE>
		WHITEPOINT = new PdfName("WhitePoint");
	// 3805 9893:new             #2   <Class PdfName>
	// 3806 9896:dup             
	// 3807 9897:ldc2            #3684 <String "WhitePoint">
	// 3808 9900:invokespecial   #803 <Method void PdfName(String)>
	// 3809 9903:putstatic       #3686 <Field PdfName WHITEPOINT>
		WKT = new PdfName("WKT");
	// 3810 9906:new             #2   <Class PdfName>
	// 3811 9909:dup             
	// 3812 9910:ldc2            #3687 <String "WKT">
	// 3813 9913:invokespecial   #803 <Method void PdfName(String)>
	// 3814 9916:putstatic       #3689 <Field PdfName WKT>
		WP = new PdfName("WP");
	// 3815 9919:new             #2   <Class PdfName>
	// 3816 9922:dup             
	// 3817 9923:ldc2            #3690 <String "WP">
	// 3818 9926:invokespecial   #803 <Method void PdfName(String)>
	// 3819 9929:putstatic       #3692 <Field PdfName WP>
		WS = new PdfName("WS");
	// 3820 9932:new             #2   <Class PdfName>
	// 3821 9935:dup             
	// 3822 9936:ldc2            #3693 <String "WS">
	// 3823 9939:invokespecial   #803 <Method void PdfName(String)>
	// 3824 9942:putstatic       #3695 <Field PdfName WS>
		WT = new PdfName("WT");
	// 3825 9945:new             #2   <Class PdfName>
	// 3826 9948:dup             
	// 3827 9949:ldc2            #3696 <String "WT">
	// 3828 9952:invokespecial   #803 <Method void PdfName(String)>
	// 3829 9955:putstatic       #3698 <Field PdfName WT>
		X = new PdfName("X");
	// 3830 9958:new             #2   <Class PdfName>
	// 3831 9961:dup             
	// 3832 9962:ldc2            #3699 <String "X">
	// 3833 9965:invokespecial   #803 <Method void PdfName(String)>
	// 3834 9968:putstatic       #3701 <Field PdfName X>
		XA = new PdfName("XA");
	// 3835 9971:new             #2   <Class PdfName>
	// 3836 9974:dup             
	// 3837 9975:ldc2            #3702 <String "XA">
	// 3838 9978:invokespecial   #803 <Method void PdfName(String)>
	// 3839 9981:putstatic       #3704 <Field PdfName XA>
		XD = new PdfName("XD");
	// 3840 9984:new             #2   <Class PdfName>
	// 3841 9987:dup             
	// 3842 9988:ldc2            #3705 <String "XD">
	// 3843 9991:invokespecial   #803 <Method void PdfName(String)>
	// 3844 9994:putstatic       #3707 <Field PdfName XD>
		XFA = new PdfName("XFA");
	// 3845 9997:new             #2   <Class PdfName>
	// 3846 10000:dup             
	// 3847 10001:ldc2            #3708 <String "XFA">
	// 3848 10004:invokespecial   #803 <Method void PdfName(String)>
	// 3849 10007:putstatic       #3710 <Field PdfName XFA>
		XML = new PdfName("XML");
	// 3850 10010:new             #2   <Class PdfName>
	// 3851 10013:dup             
	// 3852 10014:ldc2            #3711 <String "XML">
	// 3853 10017:invokespecial   #803 <Method void PdfName(String)>
	// 3854 10020:putstatic       #3713 <Field PdfName XML>
		XOBJECT = new PdfName("XObject");
	// 3855 10023:new             #2   <Class PdfName>
	// 3856 10026:dup             
	// 3857 10027:ldc2            #3715 <String "XObject">
	// 3858 10030:invokespecial   #803 <Method void PdfName(String)>
	// 3859 10033:putstatic       #3717 <Field PdfName XOBJECT>
		XPTS = new PdfName("XPTS");
	// 3860 10036:new             #2   <Class PdfName>
	// 3861 10039:dup             
	// 3862 10040:ldc2            #3718 <String "XPTS">
	// 3863 10043:invokespecial   #803 <Method void PdfName(String)>
	// 3864 10046:putstatic       #3720 <Field PdfName XPTS>
		XREF = new PdfName("XRef");
	// 3865 10049:new             #2   <Class PdfName>
	// 3866 10052:dup             
	// 3867 10053:ldc2            #3722 <String "XRef">
	// 3868 10056:invokespecial   #803 <Method void PdfName(String)>
	// 3869 10059:putstatic       #3724 <Field PdfName XREF>
		XREFSTM = new PdfName("XRefStm");
	// 3870 10062:new             #2   <Class PdfName>
	// 3871 10065:dup             
	// 3872 10066:ldc2            #3726 <String "XRefStm">
	// 3873 10069:invokespecial   #803 <Method void PdfName(String)>
	// 3874 10072:putstatic       #3728 <Field PdfName XREFSTM>
		XSTEP = new PdfName("XStep");
	// 3875 10075:new             #2   <Class PdfName>
	// 3876 10078:dup             
	// 3877 10079:ldc2            #3730 <String "XStep">
	// 3878 10082:invokespecial   #803 <Method void PdfName(String)>
	// 3879 10085:putstatic       #3732 <Field PdfName XSTEP>
		XYZ = new PdfName("XYZ");
	// 3880 10088:new             #2   <Class PdfName>
	// 3881 10091:dup             
	// 3882 10092:ldc2            #3733 <String "XYZ">
	// 3883 10095:invokespecial   #803 <Method void PdfName(String)>
	// 3884 10098:putstatic       #3735 <Field PdfName XYZ>
		YSTEP = new PdfName("YStep");
	// 3885 10101:new             #2   <Class PdfName>
	// 3886 10104:dup             
	// 3887 10105:ldc2            #3737 <String "YStep">
	// 3888 10108:invokespecial   #803 <Method void PdfName(String)>
	// 3889 10111:putstatic       #3739 <Field PdfName YSTEP>
		ZADB = new PdfName("ZaDb");
	// 3890 10114:new             #2   <Class PdfName>
	// 3891 10117:dup             
	// 3892 10118:ldc2            #3741 <String "ZaDb">
	// 3893 10121:invokespecial   #803 <Method void PdfName(String)>
	// 3894 10124:putstatic       #3743 <Field PdfName ZADB>
		ZAPFDINGBATS = new PdfName("ZapfDingbats");
	// 3895 10127:new             #2   <Class PdfName>
	// 3896 10130:dup             
	// 3897 10131:ldc2            #3745 <String "ZapfDingbats">
	// 3898 10134:invokespecial   #803 <Method void PdfName(String)>
	// 3899 10137:putstatic       #3747 <Field PdfName ZAPFDINGBATS>
		ZOOM = new PdfName("Zoom");
	// 3900 10140:new             #2   <Class PdfName>
	// 3901 10143:dup             
	// 3902 10144:ldc2            #3749 <String "Zoom">
	// 3903 10147:invokespecial   #803 <Method void PdfName(String)>
	// 3904 10150:putstatic       #3751 <Field PdfName ZOOM>
		afield = ((Class) (com/itextpdf/text/pdf/PdfName)).getDeclaredFields();
	// 3905 10153:ldc1            #2   <Class PdfName>
	// 3906 10155:invokevirtual   #3757 <Method Field[] Class.getDeclaredFields()>
	// 3907 10158:astore_1        
		staticNames = ((Map) (new HashMap(afield.length)));
	// 3908 10159:new             #3759 <Class HashMap>
	// 3909 10162:dup             
	// 3910 10163:aload_1         
	// 3911 10164:arraylength     
	// 3912 10165:invokespecial   #3762 <Method void HashMap(int)>
	// 3913 10168:putstatic       #3764 <Field Map staticNames>
		i = 0;
	// 3914 10171:iconst_0        
	// 3915 10172:istore_0        
_L1:
		if(i >= afield.length)
			break MISSING_BLOCK_LABEL_10245;
	// 3916 10173:iload_0         
	// 3917 10174:aload_1         
	// 3918 10175:arraylength     
	// 3919 10176:icmpge          10245
		Object obj = ((Object) (afield[i]));
	// 3920 10179:aload_1         
	// 3921 10180:iload_0         
	// 3922 10181:aaload          
	// 3923 10182:astore_2        
		if((((Field) (obj)).getModifiers() & 0x19) == 25 && ((Object) (((Field) (obj)).getType())).equals(com/itextpdf/text/pdf/PdfName))
	//*3924 10183:aload_2         
	//*3925 10184:invokevirtual   #3770 <Method int Field.getModifiers()>
	//*3926 10187:bipush          25
	//*3927 10189:iand            
	//*3928 10190:bipush          25
	//*3929 10192:icmpne          10233
	//*3930 10195:aload_2         
	//*3931 10196:invokevirtual   #3774 <Method Class Field.getType()>
	//*3932 10199:ldc1            #2   <Class PdfName>
	//*3933 10201:invokevirtual   #3780 <Method boolean Object.equals(Object)>
	//*3934 10204:ifeq            10233
		{
			obj = ((Object) ((PdfName)((Field) (obj)).get(((Object) (null)))));
	// 3935 10207:aload_2         
	// 3936 10208:aconst_null     
	// 3937 10209:invokevirtual   #3784 <Method Object Field.get(Object)>
	// 3938 10212:checkcast       #2   <Class PdfName>
	// 3939 10215:astore_2        
			staticNames.put(((Object) (decodeName(((PdfName) (obj)).toString()))), obj);
	// 3940 10216:getstatic       #3764 <Field Map staticNames>
	// 3941 10219:aload_2         
	// 3942 10220:invokevirtual   #3788 <Method String toString()>
	// 3943 10223:invokestatic    #3792 <Method String decodeName(String)>
	// 3944 10226:aload_2         
	// 3945 10227:invokeinterface #3798 <Method Object Map.put(Object, Object)>
	// 3946 10232:pop             
		}
		i++;
	// 3947 10233:iload_0         
	// 3948 10234:iconst_1        
	// 3949 10235:iadd            
	// 3950 10236:istore_0        
		  goto _L1
	//*3951 10237:goto            10173
		Exception exception;
		exception;
	// 3952 10240:astore_1        
		exception.printStackTrace();
	// 3953 10241:aload_1         
	// 3954 10242:invokevirtual   #3801 <Method void Exception.printStackTrace()>
	//*3955 10245:return          
	}
}
