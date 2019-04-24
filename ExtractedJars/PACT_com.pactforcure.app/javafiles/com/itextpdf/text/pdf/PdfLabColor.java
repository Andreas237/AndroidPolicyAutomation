// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.Arrays;

// Referenced classes of package com.itextpdf.text.pdf:
//			ICachedColorSpace, PdfArray, PdfName, PdfDictionary, 
//			CMYKColor, LabColor, PdfWriter, PdfObject

public class PdfLabColor
	implements ICachedColorSpace
{

	public PdfLabColor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #15  <Float 0.9505F>
	//    8   12:fastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:fconst_1        
	//   12   16:fastore         
	//   13   17:dup             
	//   14   18:iconst_2        
	//   15   19:ldc1            #16  <Float 1.089F>
	//   16   21:fastore         
	//   17   22:putfield        #18  <Field float[] whitePoint>
		blackPoint = null;
	//   18   25:aload_0         
	//   19   26:aconst_null     
	//   20   27:putfield        #20  <Field float[] blackPoint>
		range = null;
	//   21   30:aload_0         
	//   22   31:aconst_null     
	//   23   32:putfield        #22  <Field float[] range>
	//   24   35:return          
	}

	public PdfLabColor(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #15  <Float 0.9505F>
	//    8   12:fastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:fconst_1        
	//   12   16:fastore         
	//   13   17:dup             
	//   14   18:iconst_2        
	//   15   19:ldc1            #16  <Float 1.089F>
	//   16   21:fastore         
	//   17   22:putfield        #18  <Field float[] whitePoint>
		blackPoint = null;
	//   18   25:aload_0         
	//   19   26:aconst_null     
	//   20   27:putfield        #20  <Field float[] blackPoint>
		range = null;
	//   21   30:aload_0         
	//   22   31:aconst_null     
	//   23   32:putfield        #22  <Field float[] range>
		if(af == null || af.length != 3 || af[0] < 1E-06F || af[2] < 1E-06F || af[1] < 0.999999F || af[1] > 1.000001F)
	//*  24   35:aload_1         
	//*  25   36:ifnull          81
	//*  26   39:aload_1         
	//*  27   40:arraylength     
	//*  28   41:iconst_3        
	//*  29   42:icmpne          81
	//*  30   45:aload_1         
	//*  31   46:iconst_0        
	//*  32   47:faload          
	//*  33   48:ldc1            #25  <Float 1E-06F>
	//*  34   50:fcmpg           
	//*  35   51:iflt            81
	//*  36   54:aload_1         
	//*  37   55:iconst_2        
	//*  38   56:faload          
	//*  39   57:ldc1            #25  <Float 1E-06F>
	//*  40   59:fcmpg           
	//*  41   60:iflt            81
	//*  42   63:aload_1         
	//*  43   64:iconst_1        
	//*  44   65:faload          
	//*  45   66:ldc1            #26  <Float 0.999999F>
	//*  46   68:fcmpg           
	//*  47   69:iflt            81
	//*  48   72:aload_1         
	//*  49   73:iconst_1        
	//*  50   74:faload          
	//*  51   75:ldc1            #27  <Float 1.000001F>
	//*  52   77:fcmpl           
	//*  53   78:ifle            98
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("lab.cs.white.point", new Object[0]));
	//   54   81:new             #29  <Class RuntimeException>
	//   55   84:dup             
	//   56   85:ldc1            #31  <String "lab.cs.white.point">
	//   57   87:iconst_0        
	//   58   88:anewarray       Object[]
	//   59   91:invokestatic    #37  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   60   94:invokespecial   #40  <Method void RuntimeException(String)>
	//   61   97:athrow          
		} else
		{
			whitePoint = af;
	//   62   98:aload_0         
	//   63   99:aload_1         
	//   64  100:putfield        #18  <Field float[] whitePoint>
			return;
	//   65  103:return          
		}
	}

	public PdfLabColor(float af[], float af1[])
	{
		this(af);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void PdfLabColor(float[])>
		blackPoint = af1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field float[] blackPoint>
	//    6   10:return          
	}

	public PdfLabColor(float af[], float af1[], float af2[])
	{
		this(af, af1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void PdfLabColor(float[], float[])>
		range = af2;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #22  <Field float[] range>
	//    7   11:return          
	}

	private static double fXyz(double d)
	{
		if(d > 0.0088559999999999993D)
	//*   0    0:dload_0         
	//*   1    1:ldc2w           #49  <Double 0.0088559999999999993D>
	//*   2    4:dcmpl           
	//*   3    5:ifle            16
			return Math.pow(d, 0.33333333333333331D);
	//    4    8:dload_0         
	//    5    9:ldc2w           #51  <Double 0.33333333333333331D>
	//    6   12:invokestatic    #58  <Method double Math.pow(double, double)>
	//    7   15:dreturn         
		else
			return 7.7869999999999999D * d + 0.13793103448275862D;
	//    8   16:ldc2w           #59  <Double 7.7869999999999999D>
	//    9   19:dload_0         
	//   10   20:dmul            
	//   11   21:ldc2w           #61  <Double 0.13793103448275862D>
	//   12   24:dadd            
	//   13   25:dreturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof PdfLabColor))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PdfLabColor>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((PdfLabColor)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PdfLabColor>
	//   12   20:astore_1        
			if(!Arrays.equals(blackPoint, ((PdfLabColor) (obj)).blackPoint))
	//*  13   21:aload_0         
	//*  14   22:getfield        #20  <Field float[] blackPoint>
	//*  15   25:aload_1         
	//*  16   26:getfield        #20  <Field float[] blackPoint>
	//*  17   29:invokestatic    #69  <Method boolean Arrays.equals(float[], float[])>
	//*  18   32:ifne            37
				return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
			if(!Arrays.equals(range, ((PdfLabColor) (obj)).range))
	//*  21   37:aload_0         
	//*  22   38:getfield        #22  <Field float[] range>
	//*  23   41:aload_1         
	//*  24   42:getfield        #22  <Field float[] range>
	//*  25   45:invokestatic    #69  <Method boolean Arrays.equals(float[], float[])>
	//*  26   48:ifne            53
				return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
			if(!Arrays.equals(whitePoint, ((PdfLabColor) (obj)).whitePoint))
	//*  29   53:aload_0         
	//*  30   54:getfield        #18  <Field float[] whitePoint>
	//*  31   57:aload_1         
	//*  32   58:getfield        #18  <Field float[] whitePoint>
	//*  33   61:invokestatic    #69  <Method boolean Arrays.equals(float[], float[])>
	//*  34   64:ifne            5
				return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		}
		return true;
	}

	public PdfObject getPdfObject(PdfWriter pdfwriter)
	{
		pdfwriter = ((PdfWriter) (new PdfArray(((PdfObject) (PdfName.LAB)))));
	//    0    0:new             #73  <Class PdfArray>
	//    1    3:dup             
	//    2    4:getstatic       #79  <Field PdfName PdfName.LAB>
	//    3    7:invokespecial   #82  <Method void PdfArray(PdfObject)>
	//    4   10:astore_1        
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    5   11:new             #84  <Class PdfDictionary>
	//    6   14:dup             
	//    7   15:invokespecial   #85  <Method void PdfDictionary()>
	//    8   18:astore_2        
		if(whitePoint == null || whitePoint.length != 3 || whitePoint[0] < 1E-06F || whitePoint[2] < 1E-06F || whitePoint[1] < 0.999999F || whitePoint[1] > 1.000001F)
	//*   9   19:aload_0         
	//*  10   20:getfield        #18  <Field float[] whitePoint>
	//*  11   23:ifnull          83
	//*  12   26:aload_0         
	//*  13   27:getfield        #18  <Field float[] whitePoint>
	//*  14   30:arraylength     
	//*  15   31:iconst_3        
	//*  16   32:icmpne          83
	//*  17   35:aload_0         
	//*  18   36:getfield        #18  <Field float[] whitePoint>
	//*  19   39:iconst_0        
	//*  20   40:faload          
	//*  21   41:ldc1            #25  <Float 1E-06F>
	//*  22   43:fcmpg           
	//*  23   44:iflt            83
	//*  24   47:aload_0         
	//*  25   48:getfield        #18  <Field float[] whitePoint>
	//*  26   51:iconst_2        
	//*  27   52:faload          
	//*  28   53:ldc1            #25  <Float 1E-06F>
	//*  29   55:fcmpg           
	//*  30   56:iflt            83
	//*  31   59:aload_0         
	//*  32   60:getfield        #18  <Field float[] whitePoint>
	//*  33   63:iconst_1        
	//*  34   64:faload          
	//*  35   65:ldc1            #26  <Float 0.999999F>
	//*  36   67:fcmpg           
	//*  37   68:iflt            83
	//*  38   71:aload_0         
	//*  39   72:getfield        #18  <Field float[] whitePoint>
	//*  40   75:iconst_1        
	//*  41   76:faload          
	//*  42   77:ldc1            #27  <Float 1.000001F>
	//*  43   79:fcmpl           
	//*  44   80:ifle            100
			throw new RuntimeException(MessageLocalization.getComposedMessage("lab.cs.white.point", new Object[0]));
	//   45   83:new             #29  <Class RuntimeException>
	//   46   86:dup             
	//   47   87:ldc1            #31  <String "lab.cs.white.point">
	//   48   89:iconst_0        
	//   49   90:anewarray       Object[]
	//   50   93:invokestatic    #37  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   51   96:invokespecial   #40  <Method void RuntimeException(String)>
	//   52   99:athrow          
		pdfdictionary.put(PdfName.WHITEPOINT, ((PdfObject) (new PdfArray(whitePoint))));
	//   53  100:aload_2         
	//   54  101:getstatic       #88  <Field PdfName PdfName.WHITEPOINT>
	//   55  104:new             #73  <Class PdfArray>
	//   56  107:dup             
	//   57  108:aload_0         
	//   58  109:getfield        #18  <Field float[] whitePoint>
	//   59  112:invokespecial   #89  <Method void PdfArray(float[])>
	//   60  115:invokevirtual   #93  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(blackPoint != null)
	//*  61  118:aload_0         
	//*  62  119:getfield        #20  <Field float[] blackPoint>
	//*  63  122:ifnull          205
		{
			if(blackPoint.length != 3 || blackPoint[0] < -1E-06F || blackPoint[1] < -1E-06F || blackPoint[2] < -1E-06F)
	//*  64  125:aload_0         
	//*  65  126:getfield        #20  <Field float[] blackPoint>
	//*  66  129:arraylength     
	//*  67  130:iconst_3        
	//*  68  131:icmpne          170
	//*  69  134:aload_0         
	//*  70  135:getfield        #20  <Field float[] blackPoint>
	//*  71  138:iconst_0        
	//*  72  139:faload          
	//*  73  140:ldc1            #94  <Float -1E-06F>
	//*  74  142:fcmpg           
	//*  75  143:iflt            170
	//*  76  146:aload_0         
	//*  77  147:getfield        #20  <Field float[] blackPoint>
	//*  78  150:iconst_1        
	//*  79  151:faload          
	//*  80  152:ldc1            #94  <Float -1E-06F>
	//*  81  154:fcmpg           
	//*  82  155:iflt            170
	//*  83  158:aload_0         
	//*  84  159:getfield        #20  <Field float[] blackPoint>
	//*  85  162:iconst_2        
	//*  86  163:faload          
	//*  87  164:ldc1            #94  <Float -1E-06F>
	//*  88  166:fcmpg           
	//*  89  167:ifge            187
				throw new RuntimeException(MessageLocalization.getComposedMessage("lab.cs.black.point", new Object[0]));
	//   90  170:new             #29  <Class RuntimeException>
	//   91  173:dup             
	//   92  174:ldc1            #96  <String "lab.cs.black.point">
	//   93  176:iconst_0        
	//   94  177:anewarray       Object[]
	//   95  180:invokestatic    #37  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   96  183:invokespecial   #40  <Method void RuntimeException(String)>
	//   97  186:athrow          
			pdfdictionary.put(PdfName.BLACKPOINT, ((PdfObject) (new PdfArray(blackPoint))));
	//   98  187:aload_2         
	//   99  188:getstatic       #99  <Field PdfName PdfName.BLACKPOINT>
	//  100  191:new             #73  <Class PdfArray>
	//  101  194:dup             
	//  102  195:aload_0         
	//  103  196:getfield        #20  <Field float[] blackPoint>
	//  104  199:invokespecial   #89  <Method void PdfArray(float[])>
	//  105  202:invokevirtual   #93  <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(range != null)
	//* 106  205:aload_0         
	//* 107  206:getfield        #22  <Field float[] range>
	//* 108  209:ifnull          288
		{
			if(range.length != 4 || range[0] > range[1] || range[2] > range[3])
	//* 109  212:aload_0         
	//* 110  213:getfield        #22  <Field float[] range>
	//* 111  216:arraylength     
	//* 112  217:iconst_4        
	//* 113  218:icmpne          253
	//* 114  221:aload_0         
	//* 115  222:getfield        #22  <Field float[] range>
	//* 116  225:iconst_0        
	//* 117  226:faload          
	//* 118  227:aload_0         
	//* 119  228:getfield        #22  <Field float[] range>
	//* 120  231:iconst_1        
	//* 121  232:faload          
	//* 122  233:fcmpl           
	//* 123  234:ifgt            253
	//* 124  237:aload_0         
	//* 125  238:getfield        #22  <Field float[] range>
	//* 126  241:iconst_2        
	//* 127  242:faload          
	//* 128  243:aload_0         
	//* 129  244:getfield        #22  <Field float[] range>
	//* 130  247:iconst_3        
	//* 131  248:faload          
	//* 132  249:fcmpl           
	//* 133  250:ifle            270
				throw new RuntimeException(MessageLocalization.getComposedMessage("lab.cs.range", new Object[0]));
	//  134  253:new             #29  <Class RuntimeException>
	//  135  256:dup             
	//  136  257:ldc1            #101 <String "lab.cs.range">
	//  137  259:iconst_0        
	//  138  260:anewarray       Object[]
	//  139  263:invokestatic    #37  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  140  266:invokespecial   #40  <Method void RuntimeException(String)>
	//  141  269:athrow          
			pdfdictionary.put(PdfName.RANGE, ((PdfObject) (new PdfArray(range))));
	//  142  270:aload_2         
	//  143  271:getstatic       #104 <Field PdfName PdfName.RANGE>
	//  144  274:new             #73  <Class PdfArray>
	//  145  277:dup             
	//  146  278:aload_0         
	//  147  279:getfield        #22  <Field float[] range>
	//  148  282:invokespecial   #89  <Method void PdfArray(float[])>
	//  149  285:invokevirtual   #93  <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		((PdfArray) (pdfwriter)).add(((PdfObject) (pdfdictionary)));
	//  150  288:aload_1         
	//  151  289:aload_2         
	//  152  290:invokevirtual   #108 <Method boolean PdfArray.add(PdfObject)>
	//  153  293:pop             
		return ((PdfObject) (pdfwriter));
	//  154  294:aload_1         
	//  155  295:areturn         
	}

	public int hashCode()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k = Arrays.hashCode(whitePoint);
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field float[] whitePoint>
	//    4    6:invokestatic    #113 <Method int Arrays.hashCode(float[])>
	//    5    9:istore_3        
		int i;
		if(blackPoint != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #20  <Field float[] blackPoint>
	//*   8   14:ifnull          52
			i = Arrays.hashCode(blackPoint);
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field float[] blackPoint>
	//   11   21:invokestatic    #113 <Method int Arrays.hashCode(float[])>
	//   12   24:istore_1        
		else
	//*  13   25:aload_0         
	//*  14   26:getfield        #22  <Field float[] range>
	//*  15   29:ifnull          40
	//*  16   32:aload_0         
	//*  17   33:getfield        #22  <Field float[] range>
	//*  18   36:invokestatic    #113 <Method int Arrays.hashCode(float[])>
	//*  19   39:istore_2        
	//*  20   40:iload_3         
	//*  21   41:bipush          31
	//*  22   43:imul            
	//*  23   44:iload_1         
	//*  24   45:iadd            
	//*  25   46:bipush          31
	//*  26   48:imul            
	//*  27   49:iload_2         
	//*  28   50:iadd            
	//*  29   51:ireturn         
			i = 0;
	//   30   52:iconst_0        
	//   31   53:istore_1        
		if(range != null)
			j = Arrays.hashCode(range);
		return (k * 31 + i) * 31 + j;
	//*  32   54:goto            25
	}

	CMYKColor lab2Cmyk(float f, float f1, float f2)
	{
		double ad[] = lab2RgbLinear(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:invokevirtual   #119 <Method double[] lab2RgbLinear(float, float, float)>
	//    5    7:astore          16
		double d5 = ad[0];
	//    6    9:aload           16
	//    7   11:iconst_0        
	//    8   12:daload          
	//    9   13:dstore          14
		double d4 = ad[1];
	//   10   15:aload           16
	//   11   17:iconst_1        
	//   12   18:daload          
	//   13   19:dstore          12
		double d1 = ad[2];
	//   14   21:aload           16
	//   15   23:iconst_2        
	//   16   24:daload          
	//   17   25:dstore          6
		double d = 0.0D;
	//   18   27:dconst_0        
	//   19   28:dstore          4
		double d2 = 0.0D;
	//   20   30:dconst_0        
	//   21   31:dstore          8
		double d3 = 0.0D;
	//   22   33:dconst_0        
	//   23   34:dstore          10
		if(d5 == 0.0D && d4 == 0.0D && f2 == 0.0F)
	//*  24   36:dload           14
	//*  25   38:dconst_0        
	//*  26   39:dcmpl           
	//*  27   40:ifne            79
	//*  28   43:dload           12
	//*  29   45:dconst_0        
	//*  30   46:dcmpl           
	//*  31   47:ifne            79
	//*  32   50:fload_3         
	//*  33   51:fconst_0        
	//*  34   52:fcmpl           
	//*  35   53:ifne            79
		{
			d1 = 1.0D;
	//   36   56:dconst_1        
	//   37   57:dstore          6
		} else
	//*  38   59:new             #121 <Class CMYKColor>
	//*  39   62:dup             
	//*  40   63:dload           4
	//*  41   65:d2f             
	//*  42   66:dload           8
	//*  43   68:d2f             
	//*  44   69:dload           10
	//*  45   71:d2f             
	//*  46   72:dload           6
	//*  47   74:d2f             
	//*  48   75:invokespecial   #124 <Method void CMYKColor(float, float, float, float)>
	//*  49   78:areturn         
		{
			d = 1.0D - d5;
	//   50   79:dconst_1        
	//   51   80:dload           14
	//   52   82:dsub            
	//   53   83:dstore          4
			d2 = 1.0D - d4;
	//   54   85:dconst_1        
	//   55   86:dload           12
	//   56   88:dsub            
	//   57   89:dstore          8
			d3 = 1.0D - d1;
	//   58   91:dconst_1        
	//   59   92:dload           6
	//   60   94:dsub            
	//   61   95:dstore          10
			d1 = Math.min(d, Math.min(d2, d3));
	//   62   97:dload           4
	//   63   99:dload           8
	//   64  101:dload           10
	//   65  103:invokestatic    #127 <Method double Math.min(double, double)>
	//   66  106:invokestatic    #127 <Method double Math.min(double, double)>
	//   67  109:dstore          6
			d = (d - d1) / (1.0D - d1);
	//   68  111:dload           4
	//   69  113:dload           6
	//   70  115:dsub            
	//   71  116:dconst_1        
	//   72  117:dload           6
	//   73  119:dsub            
	//   74  120:ddiv            
	//   75  121:dstore          4
			d2 = (d2 - d1) / (1.0D - d1);
	//   76  123:dload           8
	//   77  125:dload           6
	//   78  127:dsub            
	//   79  128:dconst_1        
	//   80  129:dload           6
	//   81  131:dsub            
	//   82  132:ddiv            
	//   83  133:dstore          8
			d3 = (d3 - d1) / (1.0D - d1);
	//   84  135:dload           10
	//   85  137:dload           6
	//   86  139:dsub            
	//   87  140:dconst_1        
	//   88  141:dload           6
	//   89  143:dsub            
	//   90  144:ddiv            
	//   91  145:dstore          10
		}
		return new CMYKColor((float)d, (float)d2, (float)d3, (float)d1);
	//*  92  147:goto            59
	}

	public BaseColor lab2Rgb(float f, float f1, float f2)
	{
		double ad[] = lab2RgbLinear(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:invokevirtual   #119 <Method double[] lab2RgbLinear(float, float, float)>
	//    5    7:astore          4
		return new BaseColor((float)ad[0], (float)ad[1], (float)ad[2]);
	//    6    9:new             #131 <Class BaseColor>
	//    7   12:dup             
	//    8   13:aload           4
	//    9   15:iconst_0        
	//   10   16:daload          
	//   11   17:d2f             
	//   12   18:aload           4
	//   13   20:iconst_1        
	//   14   21:daload          
	//   15   22:d2f             
	//   16   23:aload           4
	//   17   25:iconst_2        
	//   18   26:daload          
	//   19   27:d2f             
	//   20   28:invokespecial   #134 <Method void BaseColor(float, float, float)>
	//   21   31:areturn         
	}

	protected double[] lab2RgbLinear(float f, float f1, float f2)
	{
		float f5 = f1;
	//    0    0:fload_2         
	//    1    1:fstore          12
		float f3 = f2;
	//    2    3:fload_3         
	//    3    4:fstore          10
		if(range != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #22  <Field float[] range>
	//*   6   10:ifnull          124
		{
			f5 = f1;
	//    7   13:fload_2         
	//    8   14:fstore          12
			f3 = f2;
	//    9   16:fload_3         
	//   10   17:fstore          10
			if(range.length == 4)
	//*  11   19:aload_0         
	//*  12   20:getfield        #22  <Field float[] range>
	//*  13   23:arraylength     
	//*  14   24:iconst_4        
	//*  15   25:icmpne          124
			{
				f3 = f1;
	//   16   28:fload_2         
	//   17   29:fstore          10
				if(f1 < range[0])
	//*  18   31:fload_2         
	//*  19   32:aload_0         
	//*  20   33:getfield        #22  <Field float[] range>
	//*  21   36:iconst_0        
	//*  22   37:faload          
	//*  23   38:fcmpg           
	//*  24   39:ifge            50
					f3 = range[0];
	//   25   42:aload_0         
	//   26   43:getfield        #22  <Field float[] range>
	//   27   46:iconst_0        
	//   28   47:faload          
	//   29   48:fstore          10
				f1 = f3;
	//   30   50:fload           10
	//   31   52:fstore_2        
				if(f3 > range[1])
	//*  32   53:fload           10
	//*  33   55:aload_0         
	//*  34   56:getfield        #22  <Field float[] range>
	//*  35   59:iconst_1        
	//*  36   60:faload          
	//*  37   61:fcmpl           
	//*  38   62:ifle            72
					f1 = range[1];
	//   39   65:aload_0         
	//   40   66:getfield        #22  <Field float[] range>
	//   41   69:iconst_1        
	//   42   70:faload          
	//   43   71:fstore_2        
				float f4 = f2;
	//   44   72:fload_3         
	//   45   73:fstore          11
				if(f2 < range[2])
	//*  46   75:fload_3         
	//*  47   76:aload_0         
	//*  48   77:getfield        #22  <Field float[] range>
	//*  49   80:iconst_2        
	//*  50   81:faload          
	//*  51   82:fcmpg           
	//*  52   83:ifge            94
					f4 = range[2];
	//   53   86:aload_0         
	//   54   87:getfield        #22  <Field float[] range>
	//   55   90:iconst_2        
	//   56   91:faload          
	//   57   92:fstore          11
				f5 = f1;
	//   58   94:fload_2         
	//   59   95:fstore          12
				f3 = f4;
	//   60   97:fload           11
	//   61   99:fstore          10
				if(f4 > range[3])
	//*  62  101:fload           11
	//*  63  103:aload_0         
	//*  64  104:getfield        #22  <Field float[] range>
	//*  65  107:iconst_3        
	//*  66  108:faload          
	//*  67  109:fcmpl           
	//*  68  110:ifle            124
				{
					f3 = range[3];
	//   69  113:aload_0         
	//   70  114:getfield        #22  <Field float[] range>
	//   71  117:iconst_3        
	//   72  118:faload          
	//   73  119:fstore          10
					f5 = f1;
	//   74  121:fload_2         
	//   75  122:fstore          12
				}
			}
		}
		double d1 = (double)(16F + f) / 116D;
	//   76  124:ldc1            #135 <Float 16F>
	//   77  126:fload_1         
	//   78  127:fadd            
	//   79  128:f2d             
	//   80  129:ldc2w           #136 <Double 116D>
	//   81  132:ddiv            
	//   82  133:dstore          6
		double d = d1 + (double)f5 / 500D;
	//   83  135:dload           6
	//   84  137:fload           12
	//   85  139:f2d             
	//   86  140:ldc2w           #138 <Double 500D>
	//   87  143:ddiv            
	//   88  144:dadd            
	//   89  145:dstore          4
		double d2 = d1 - (double)f3 / 200D;
	//   90  147:dload           6
	//   91  149:fload           10
	//   92  151:f2d             
	//   93  152:ldc2w           #140 <Double 200D>
	//   94  155:ddiv            
	//   95  156:dsub            
	//   96  157:dstore          8
		int i;
		double ad[];
		if(d > 0.20689655172413793D)
	//*  97  159:dload           4
	//*  98  161:ldc2w           #142 <Double 0.20689655172413793D>
	//*  99  164:dcmpl           
	//* 100  165:ifle            382
			d = (double)whitePoint[0] * (d * d * d);
	//  101  168:aload_0         
	//  102  169:getfield        #18  <Field float[] whitePoint>
	//  103  172:iconst_0        
	//  104  173:faload          
	//  105  174:f2d             
	//  106  175:dload           4
	//  107  177:dload           4
	//  108  179:dmul            
	//  109  180:dload           4
	//  110  182:dmul            
	//  111  183:dmul            
	//  112  184:dstore          4
		else
	//* 113  186:dload           6
	//* 114  188:ldc2w           #142 <Double 0.20689655172413793D>
	//* 115  191:dcmpl           
	//* 116  192:ifle            413
	//* 117  195:aload_0         
	//* 118  196:getfield        #18  <Field float[] whitePoint>
	//* 119  199:iconst_1        
	//* 120  200:faload          
	//* 121  201:f2d             
	//* 122  202:dload           6
	//* 123  204:dload           6
	//* 124  206:dmul            
	//* 125  207:dload           6
	//* 126  209:dmul            
	//* 127  210:dmul            
	//* 128  211:dstore          6
	//* 129  213:dload           8
	//* 130  215:ldc2w           #142 <Double 0.20689655172413793D>
	//* 131  218:dcmpl           
	//* 132  219:ifle            444
	//* 133  222:aload_0         
	//* 134  223:getfield        #18  <Field float[] whitePoint>
	//* 135  226:iconst_2        
	//* 136  227:faload          
	//* 137  228:f2d             
	//* 138  229:dload           8
	//* 139  231:dload           8
	//* 140  233:dmul            
	//* 141  234:dload           8
	//* 142  236:dmul            
	//* 143  237:dmul            
	//* 144  238:dstore          8
	//* 145  240:iconst_3        
	//* 146  241:newarray        double[]
	//* 147  243:astore          14
	//* 148  245:aload           14
	//* 149  247:iconst_0        
	//* 150  248:ldc2w           #144 <Double 3.2410000000000001D>
	//* 151  251:dload           4
	//* 152  253:dmul            
	//* 153  254:ldc2w           #146 <Double 1.5374000000000001D>
	//* 154  257:dload           6
	//* 155  259:dmul            
	//* 156  260:dsub            
	//* 157  261:ldc2w           #148 <Double 0.49859999999999999D>
	//* 158  264:dload           8
	//* 159  266:dmul            
	//* 160  267:dsub            
	//* 161  268:dastore         
	//* 162  269:aload           14
	//* 163  271:iconst_1        
	//* 164  272:dload           4
	//* 165  274:dneg            
	//* 166  275:ldc2w           #150 <Double 0.96919999999999995D>
	//* 167  278:dmul            
	//* 168  279:ldc2w           #152 <Double 1.8759999999999999D>
	//* 169  282:dload           6
	//* 170  284:dmul            
	//* 171  285:dadd            
	//* 172  286:ldc2w           #154 <Double 0.041599999999999998D>
	//* 173  289:dload           8
	//* 174  291:dmul            
	//* 175  292:dsub            
	//* 176  293:dastore         
	//* 177  294:aload           14
	//* 178  296:iconst_2        
	//* 179  297:ldc2w           #156 <Double 0.055599999999999997D>
	//* 180  300:dload           4
	//* 181  302:dmul            
	//* 182  303:ldc2w           #158 <Double 0.20399999999999999D>
	//* 183  306:dload           6
	//* 184  308:dmul            
	//* 185  309:dsub            
	//* 186  310:ldc2w           #160 <Double 1.0569999999999999D>
	//* 187  313:dload           8
	//* 188  315:dmul            
	//* 189  316:dadd            
	//* 190  317:dastore         
	//* 191  318:iconst_0        
	//* 192  319:istore          13
	//* 193  321:iload           13
	//* 194  323:iconst_3        
	//* 195  324:icmpge          518
	//* 196  327:aload           14
	//* 197  329:iload           13
	//* 198  331:daload          
	//* 199  332:ldc2w           #162 <Double 0.0031308D>
	//* 200  335:dcmpg           
	//* 201  336:ifgt            475
	//* 202  339:ldc2w           #164 <Double 12.92D>
	//* 203  342:aload           14
	//* 204  344:iload           13
	//* 205  346:daload          
	//* 206  347:dmul            
	//* 207  348:dstore          4
	//* 208  350:aload           14
	//* 209  352:iload           13
	//* 210  354:dload           4
	//* 211  356:dastore         
	//* 212  357:aload           14
	//* 213  359:iload           13
	//* 214  361:daload          
	//* 215  362:dconst_0        
	//* 216  363:dcmpg           
	//* 217  364:ifge            499
	//* 218  367:aload           14
	//* 219  369:iload           13
	//* 220  371:dconst_0        
	//* 221  372:dastore         
	//* 222  373:iload           13
	//* 223  375:iconst_1        
	//* 224  376:iadd            
	//* 225  377:istore          13
	//* 226  379:goto            321
			d = (d - 0.13793103448275862D) * 3D * (0.20689655172413793D * 0.20689655172413793D) * (double)whitePoint[0];
	//  227  382:dload           4
	//  228  384:ldc2w           #61  <Double 0.13793103448275862D>
	//  229  387:dsub            
	//  230  388:ldc2w           #166 <Double 3D>
	//  231  391:dmul            
	//  232  392:ldc2w           #142 <Double 0.20689655172413793D>
	//  233  395:ldc2w           #142 <Double 0.20689655172413793D>
	//  234  398:dmul            
	//  235  399:dmul            
	//  236  400:aload_0         
	//  237  401:getfield        #18  <Field float[] whitePoint>
	//  238  404:iconst_0        
	//  239  405:faload          
	//  240  406:f2d             
	//  241  407:dmul            
	//  242  408:dstore          4
		if(d1 > 0.20689655172413793D)
			d1 = (double)whitePoint[1] * (d1 * d1 * d1);
		else
	//* 243  410:goto            186
			d1 = (d1 - 0.13793103448275862D) * 3D * (0.20689655172413793D * 0.20689655172413793D) * (double)whitePoint[1];
	//  244  413:dload           6
	//  245  415:ldc2w           #61  <Double 0.13793103448275862D>
	//  246  418:dsub            
	//  247  419:ldc2w           #166 <Double 3D>
	//  248  422:dmul            
	//  249  423:ldc2w           #142 <Double 0.20689655172413793D>
	//  250  426:ldc2w           #142 <Double 0.20689655172413793D>
	//  251  429:dmul            
	//  252  430:dmul            
	//  253  431:aload_0         
	//  254  432:getfield        #18  <Field float[] whitePoint>
	//  255  435:iconst_1        
	//  256  436:faload          
	//  257  437:f2d             
	//  258  438:dmul            
	//  259  439:dstore          6
		if(d2 > 0.20689655172413793D)
			d2 = (double)whitePoint[2] * (d2 * d2 * d2);
		else
	//* 260  441:goto            213
			d2 = (d2 - 0.13793103448275862D) * 3D * (0.20689655172413793D * 0.20689655172413793D) * (double)whitePoint[2];
	//  261  444:dload           8
	//  262  446:ldc2w           #61  <Double 0.13793103448275862D>
	//  263  449:dsub            
	//  264  450:ldc2w           #166 <Double 3D>
	//  265  453:dmul            
	//  266  454:ldc2w           #142 <Double 0.20689655172413793D>
	//  267  457:ldc2w           #142 <Double 0.20689655172413793D>
	//  268  460:dmul            
	//  269  461:dmul            
	//  270  462:aload_0         
	//  271  463:getfield        #18  <Field float[] whitePoint>
	//  272  466:iconst_2        
	//  273  467:faload          
	//  274  468:f2d             
	//  275  469:dmul            
	//  276  470:dstore          8
		ad = new double[3];
		ad[0] = 3.2410000000000001D * d - 1.5374000000000001D * d1 - 0.49859999999999999D * d2;
		ad[1] = (-d * 0.96919999999999995D + 1.8759999999999999D * d1) - 0.041599999999999998D * d2;
		ad[2] = (0.055599999999999997D * d - 0.20399999999999999D * d1) + 1.0569999999999999D * d2;
		i = 0;
		while(i < 3) 
		{
			if(ad[i] <= 0.0031308D)
				d = 12.92D * ad[i];
			else
	//* 277  472:goto            240
				d = 1.0549999999999999D * Math.pow(ad[i], 0.41666666666666669D) - 0.055D;
	//  278  475:ldc2w           #168 <Double 1.0549999999999999D>
	//  279  478:aload           14
	//  280  480:iload           13
	//  281  482:daload          
	//  282  483:ldc2w           #170 <Double 0.41666666666666669D>
	//  283  486:invokestatic    #58  <Method double Math.pow(double, double)>
	//  284  489:dmul            
	//  285  490:ldc2w           #172 <Double 0.055D>
	//  286  493:dsub            
	//  287  494:dstore          4
			ad[i] = d;
			if(ad[i] < 0.0D)
				ad[i] = 0.0D;
			else
	//* 288  496:goto            350
			if(ad[i] > 1.0D)
	//* 289  499:aload           14
	//* 290  501:iload           13
	//* 291  503:daload          
	//* 292  504:dconst_1        
	//* 293  505:dcmpl           
	//* 294  506:ifle            373
				ad[i] = 1.0D;
	//  295  509:aload           14
	//  296  511:iload           13
	//  297  513:dconst_1        
	//  298  514:dastore         
			i++;
		}
	//* 299  515:goto            373
		return ad;
	//  300  518:aload           14
	//  301  520:areturn         
	}

	public LabColor rgb2lab(BaseColor basecolor)
	{
		double d = (float)basecolor.getRed() / 255F;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #178 <Method int BaseColor.getRed()>
	//    2    4:i2f             
	//    3    5:ldc1            #179 <Float 255F>
	//    4    7:fdiv            
	//    5    8:f2d             
	//    6    9:dstore_2        
		double d1 = (float)basecolor.getGreen() / 255F;
	//    7   10:aload_1         
	//    8   11:invokevirtual   #182 <Method int BaseColor.getGreen()>
	//    9   14:i2f             
	//   10   15:ldc1            #179 <Float 255F>
	//   11   17:fdiv            
	//   12   18:f2d             
	//   13   19:dstore          4
		double d2 = (float)basecolor.getBlue() / 255F;
	//   14   21:aload_1         
	//   15   22:invokevirtual   #185 <Method int BaseColor.getBlue()>
	//   16   25:i2f             
	//   17   26:ldc1            #179 <Float 255F>
	//   18   28:fdiv            
	//   19   29:f2d             
	//   20   30:dstore          6
		double d3;
		if(d > 0.04045D)
	//*  21   32:dload_2         
	//*  22   33:ldc2w           #186 <Double 0.04045D>
	//*  23   36:dcmpl           
	//*  24   37:ifle            290
			d = Math.pow((0.055D + d) / 1.0549999999999999D, 2.2000000000000002D);
	//   25   40:ldc2w           #172 <Double 0.055D>
	//   26   43:dload_2         
	//   27   44:dadd            
	//   28   45:ldc2w           #168 <Double 1.0549999999999999D>
	//   29   48:ddiv            
	//   30   49:ldc2w           #188 <Double 2.2000000000000002D>
	//   31   52:invokestatic    #58  <Method double Math.pow(double, double)>
	//   32   55:dstore_2        
		else
	//*  33   56:dload           4
	//*  34   58:ldc2w           #186 <Double 0.04045D>
	//*  35   61:dcmpl           
	//*  36   62:ifle            299
	//*  37   65:ldc2w           #172 <Double 0.055D>
	//*  38   68:dload           4
	//*  39   70:dadd            
	//*  40   71:ldc2w           #168 <Double 1.0549999999999999D>
	//*  41   74:ddiv            
	//*  42   75:ldc2w           #188 <Double 2.2000000000000002D>
	//*  43   78:invokestatic    #58  <Method double Math.pow(double, double)>
	//*  44   81:dstore          4
	//*  45   83:dload           6
	//*  46   85:ldc2w           #186 <Double 0.04045D>
	//*  47   88:dcmpl           
	//*  48   89:ifle            310
	//*  49   92:ldc2w           #172 <Double 0.055D>
	//*  50   95:dload           6
	//*  51   97:dadd            
	//*  52   98:ldc2w           #168 <Double 1.0549999999999999D>
	//*  53  101:ddiv            
	//*  54  102:ldc2w           #188 <Double 2.2000000000000002D>
	//*  55  105:invokestatic    #58  <Method double Math.pow(double, double)>
	//*  56  108:dstore          6
	//*  57  110:ldc2w           #190 <Double 0.21260000000000001D>
	//*  58  113:dload_2         
	//*  59  114:dmul            
	//*  60  115:ldc2w           #192 <Double 0.71519999999999995D>
	//*  61  118:dload           4
	//*  62  120:dmul            
	//*  63  121:dadd            
	//*  64  122:ldc2w           #194 <Double 0.0722D>
	//*  65  125:dload           6
	//*  66  127:dmul            
	//*  67  128:dadd            
	//*  68  129:dstore          8
	//*  69  131:new             #197 <Class LabColor>
	//*  70  134:dup             
	//*  71  135:aload_0         
	//*  72  136:ldc2w           #136 <Double 116D>
	//*  73  139:dload           8
	//*  74  141:aload_0         
	//*  75  142:getfield        #18  <Field float[] whitePoint>
	//*  76  145:iconst_1        
	//*  77  146:faload          
	//*  78  147:f2d             
	//*  79  148:ddiv            
	//*  80  149:invokestatic    #199 <Method double fXyz(double)>
	//*  81  152:dmul            
	//*  82  153:ldc2w           #200 <Double 16D>
	//*  83  156:dsub            
	//*  84  157:ldc2w           #202 <Double 1000D>
	//*  85  160:dmul            
	//*  86  161:invokestatic    #207 <Method long Math.round(double)>
	//*  87  164:l2f             
	//*  88  165:ldc1            #208 <Float 1000F>
	//*  89  167:fdiv            
	//*  90  168:ldc2w           #138 <Double 500D>
	//*  91  171:ldc2w           #209 <Double 0.41239999999999999D>
	//*  92  174:dload_2         
	//*  93  175:dmul            
	//*  94  176:ldc2w           #211 <Double 0.35759999999999997D>
	//*  95  179:dload           4
	//*  96  181:dmul            
	//*  97  182:dadd            
	//*  98  183:ldc2w           #213 <Double 0.18049999999999999D>
	//*  99  186:dload           6
	//* 100  188:dmul            
	//* 101  189:dadd            
	//* 102  190:aload_0         
	//* 103  191:getfield        #18  <Field float[] whitePoint>
	//* 104  194:iconst_0        
	//* 105  195:faload          
	//* 106  196:f2d             
	//* 107  197:ddiv            
	//* 108  198:invokestatic    #199 <Method double fXyz(double)>
	//* 109  201:dload           8
	//* 110  203:aload_0         
	//* 111  204:getfield        #18  <Field float[] whitePoint>
	//* 112  207:iconst_1        
	//* 113  208:faload          
	//* 114  209:f2d             
	//* 115  210:ddiv            
	//* 116  211:invokestatic    #199 <Method double fXyz(double)>
	//* 117  214:dsub            
	//* 118  215:dmul            
	//* 119  216:ldc2w           #202 <Double 1000D>
	//* 120  219:dmul            
	//* 121  220:invokestatic    #207 <Method long Math.round(double)>
	//* 122  223:l2f             
	//* 123  224:ldc1            #208 <Float 1000F>
	//* 124  226:fdiv            
	//* 125  227:ldc2w           #140 <Double 200D>
	//* 126  230:dload           8
	//* 127  232:aload_0         
	//* 128  233:getfield        #18  <Field float[] whitePoint>
	//* 129  236:iconst_1        
	//* 130  237:faload          
	//* 131  238:f2d             
	//* 132  239:ddiv            
	//* 133  240:invokestatic    #199 <Method double fXyz(double)>
	//* 134  243:ldc2w           #215 <Double 0.019300000000000001D>
	//* 135  246:dload_2         
	//* 136  247:dmul            
	//* 137  248:ldc2w           #217 <Double 0.1192D>
	//* 138  251:dload           4
	//* 139  253:dmul            
	//* 140  254:dadd            
	//* 141  255:ldc2w           #219 <Double 0.95050000000000001D>
	//* 142  258:dload           6
	//* 143  260:dmul            
	//* 144  261:dadd            
	//* 145  262:aload_0         
	//* 146  263:getfield        #18  <Field float[] whitePoint>
	//* 147  266:iconst_2        
	//* 148  267:faload          
	//* 149  268:f2d             
	//* 150  269:ddiv            
	//* 151  270:invokestatic    #199 <Method double fXyz(double)>
	//* 152  273:dsub            
	//* 153  274:dmul            
	//* 154  275:ldc2w           #202 <Double 1000D>
	//* 155  278:dmul            
	//* 156  279:invokestatic    #207 <Method long Math.round(double)>
	//* 157  282:l2f             
	//* 158  283:ldc1            #208 <Float 1000F>
	//* 159  285:fdiv            
	//* 160  286:invokespecial   #223 <Method void LabColor(PdfLabColor, float, float, float)>
	//* 161  289:areturn         
			d /= 12.92D;
	//  162  290:dload_2         
	//  163  291:ldc2w           #164 <Double 12.92D>
	//  164  294:ddiv            
	//  165  295:dstore_2        
		if(d1 > 0.04045D)
			d1 = Math.pow((0.055D + d1) / 1.0549999999999999D, 2.2000000000000002D);
		else
	//* 166  296:goto            56
			d1 /= 12.92D;
	//  167  299:dload           4
	//  168  301:ldc2w           #164 <Double 12.92D>
	//  169  304:ddiv            
	//  170  305:dstore          4
		if(d2 > 0.04045D)
			d2 = Math.pow((0.055D + d2) / 1.0549999999999999D, 2.2000000000000002D);
		else
	//* 171  307:goto            83
			d2 /= 12.92D;
	//  172  310:dload           6
	//  173  312:ldc2w           #164 <Double 12.92D>
	//  174  315:ddiv            
	//  175  316:dstore          6
		d3 = 0.21260000000000001D * d + 0.71519999999999995D * d1 + 0.0722D * d2;
		return new LabColor(this, (float)Math.round((116D * fXyz(d3 / (double)whitePoint[1]) - 16D) * 1000D) / 1000F, (float)Math.round(500D * (fXyz((0.41239999999999999D * d + 0.35759999999999997D * d1 + 0.18049999999999999D * d2) / (double)whitePoint[0]) - fXyz(d3 / (double)whitePoint[1])) * 1000D) / 1000F, (float)Math.round(200D * (fXyz(d3 / (double)whitePoint[1]) - fXyz((0.019300000000000001D * d + 0.1192D * d1 + 0.95050000000000001D * d2) / (double)whitePoint[2])) * 1000D) / 1000F);
	//* 176  318:goto            110
	}

	float blackPoint[];
	float range[];
	float whitePoint[] = {
		0.9505F, 1.0F, 1.089F
	};
}
