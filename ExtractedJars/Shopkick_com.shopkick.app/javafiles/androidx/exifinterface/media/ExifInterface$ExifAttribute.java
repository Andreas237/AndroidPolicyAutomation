// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.exifinterface.media;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package androidx.exifinterface.media:
//			ExifInterface

private static class ExifInterface$ExifAttribute
{

	public static ExifInterface$ExifAttribute createByte(String s)
	{
		if(s.length() == 1 && s.charAt(0) >= '0' && s.charAt(0) <= '1')
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #32  <Method int String.length()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          56
	//*   4    8:aload_0         
	//*   5    9:iconst_0        
	//*   6   10:invokevirtual   #36  <Method char String.charAt(int)>
	//*   7   13:bipush          48
	//*   8   15:icmplt          56
	//*   9   18:aload_0         
	//*  10   19:iconst_0        
	//*  11   20:invokevirtual   #36  <Method char String.charAt(int)>
	//*  12   23:bipush          49
	//*  13   25:icmpgt          56
		{
			byte abyte0[] = new byte[1];
	//   14   28:iconst_1        
	//   15   29:newarray        byte[]
	//   16   31:astore_1        
			abyte0[0] = (byte)(s.charAt(0) - 48);
	//   17   32:aload_1         
	//   18   33:iconst_0        
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:invokevirtual   #36  <Method char String.charAt(int)>
	//   22   39:bipush          48
	//   23   41:isub            
	//   24   42:int2byte        
	//   25   43:bastore         
			return new ExifInterface$ExifAttribute(1, abyte0.length, abyte0);
	//   26   44:new             #2   <Class ExifInterface$ExifAttribute>
	//   27   47:dup             
	//   28   48:iconst_1        
	//   29   49:aload_1         
	//   30   50:arraylength     
	//   31   51:aload_1         
	//   32   52:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   33   55:areturn         
		} else
		{
			s = ((String) (s.getBytes(ExifInterface.ASCII)));
	//   34   56:aload_0         
	//   35   57:getstatic       #42  <Field java.nio.charset.Charset ExifInterface.ASCII>
	//   36   60:invokevirtual   #46  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   37   63:astore_0        
			return new ExifInterface$ExifAttribute(1, s.length, ((byte []) (s)));
	//   38   64:new             #2   <Class ExifInterface$ExifAttribute>
	//   39   67:dup             
	//   40   68:iconst_1        
	//   41   69:aload_0         
	//   42   70:arraylength     
	//   43   71:aload_0         
	//   44   72:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   45   75:areturn         
		}
	}

	public static ExifInterface$ExifAttribute createDouble(double d, ByteOrder byteorder)
	{
		return createDouble(new double[] {
			d
		}, byteorder);
	//    0    0:iconst_1        
	//    1    1:newarray        double[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:dload_0         
	//    5    6:dastore         
	//    6    7:aload_2         
	//    7    8:invokestatic    #51  <Method ExifInterface$ExifAttribute createDouble(double[], ByteOrder)>
	//    8   11:areturn         
	}

	public static ExifInterface$ExifAttribute createDouble(double ad[], ByteOrder byteorder)
	{
		ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * ad.length]);
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:bipush          12
	//    2    5:iaload          
	//    3    6:aload_0         
	//    4    7:arraylength     
	//    5    8:imul            
	//    6    9:newarray        byte[]
	//    7   11:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    8   14:astore          4
		bytebuffer.order(byteorder);
	//    9   16:aload           4
	//   10   18:aload_1         
	//   11   19:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   22:pop             
		int j = ad.length;
	//   13   23:aload_0         
	//   14   24:arraylength     
	//   15   25:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   26:iconst_0        
	//*  17   27:istore_2        
	//*  18   28:iload_2         
	//*  19   29:iload_3         
	//*  20   30:icmpge          49
			bytebuffer.putDouble(ad[i]);
	//   21   33:aload           4
	//   22   35:aload_0         
	//   23   36:iload_2         
	//   24   37:daload          
	//   25   38:invokevirtual   #69  <Method ByteBuffer ByteBuffer.putDouble(double)>
	//   26   41:pop             

	//   27   42:iload_2         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_2        
	//*  31   46:goto            28
		return new ExifInterface$ExifAttribute(12, ad.length, bytebuffer.array());
	//   32   49:new             #2   <Class ExifInterface$ExifAttribute>
	//   33   52:dup             
	//   34   53:bipush          12
	//   35   55:aload_0         
	//   36   56:arraylength     
	//   37   57:aload           4
	//   38   59:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   39   62:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   40   65:areturn         
	}

	public static ExifInterface$ExifAttribute createSLong(int i, ByteOrder byteorder)
	{
		return createSLong(new int[] {
			i
		}, byteorder);
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:iastore         
	//    6    7:aload_1         
	//    7    8:invokestatic    #78  <Method ExifInterface$ExifAttribute createSLong(int[], ByteOrder)>
	//    8   11:areturn         
	}

	public static ExifInterface$ExifAttribute createSLong(int ai[], ByteOrder byteorder)
	{
		ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * ai.length]);
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:bipush          9
	//    2    5:iaload          
	//    3    6:aload_0         
	//    4    7:arraylength     
	//    5    8:imul            
	//    6    9:newarray        byte[]
	//    7   11:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    8   14:astore          4
		bytebuffer.order(byteorder);
	//    9   16:aload           4
	//   10   18:aload_1         
	//   11   19:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   22:pop             
		int j = ai.length;
	//   13   23:aload_0         
	//   14   24:arraylength     
	//   15   25:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   26:iconst_0        
	//*  17   27:istore_2        
	//*  18   28:iload_2         
	//*  19   29:iload_3         
	//*  20   30:icmpge          49
			bytebuffer.putInt(ai[i]);
	//   21   33:aload           4
	//   22   35:aload_0         
	//   23   36:iload_2         
	//   24   37:iaload          
	//   25   38:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   26   41:pop             

	//   27   42:iload_2         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_2        
	//*  31   46:goto            28
		return new ExifInterface$ExifAttribute(9, ai.length, bytebuffer.array());
	//   32   49:new             #2   <Class ExifInterface$ExifAttribute>
	//   33   52:dup             
	//   34   53:bipush          9
	//   35   55:aload_0         
	//   36   56:arraylength     
	//   37   57:aload           4
	//   38   59:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   39   62:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   40   65:areturn         
	}

	public static ExifInterface$ExifAttribute createSRational(ExifInterface.Rational rational, ByteOrder byteorder)
	{
		return createSRational(new ExifInterface.Rational[] {
			rational
		}, byteorder);
	//    0    0:iconst_1        
	//    1    1:anewarray       ExifInterface.Rational[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:aload_1         
	//    7    9:invokestatic    #89  <Method ExifInterface$ExifAttribute createSRational(ExifInterface$Rational[], ByteOrder)>
	//    8   12:areturn         
	}

	public static ExifInterface$ExifAttribute createSRational(ExifInterface.Rational arational[], ByteOrder byteorder)
	{
		ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * arational.length]);
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:bipush          10
	//    2    5:iaload          
	//    3    6:aload_0         
	//    4    7:arraylength     
	//    5    8:imul            
	//    6    9:newarray        byte[]
	//    7   11:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    8   14:astore          4
		bytebuffer.order(byteorder);
	//    9   16:aload           4
	//   10   18:aload_1         
	//   11   19:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   22:pop             
		int j = arational.length;
	//   13   23:aload_0         
	//   14   24:arraylength     
	//   15   25:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   26:iconst_0        
	//*  17   27:istore_2        
	//*  18   28:iload_2         
	//*  19   29:iload_3         
	//*  20   30:icmpge          66
		{
			byteorder = ((ByteOrder) (arational[i]));
	//   21   33:aload_0         
	//   22   34:iload_2         
	//   23   35:aaload          
	//   24   36:astore_1        
			bytebuffer.putInt((int)((ExifInterface.Rational) (byteorder)).numerator);
	//   25   37:aload           4
	//   26   39:aload_1         
	//   27   40:getfield        #93  <Field long ExifInterface$Rational.numerator>
	//   28   43:l2i             
	//   29   44:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   30   47:pop             
			bytebuffer.putInt((int)((ExifInterface.Rational) (byteorder)).denominator);
	//   31   48:aload           4
	//   32   50:aload_1         
	//   33   51:getfield        #96  <Field long ExifInterface$Rational.denominator>
	//   34   54:l2i             
	//   35   55:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   36   58:pop             
		}

	//   37   59:iload_2         
	//   38   60:iconst_1        
	//   39   61:iadd            
	//   40   62:istore_2        
	//*  41   63:goto            28
		return new ExifInterface$ExifAttribute(10, arational.length, bytebuffer.array());
	//   42   66:new             #2   <Class ExifInterface$ExifAttribute>
	//   43   69:dup             
	//   44   70:bipush          10
	//   45   72:aload_0         
	//   46   73:arraylength     
	//   47   74:aload           4
	//   48   76:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   49   79:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   50   82:areturn         
	}

	public static ExifInterface$ExifAttribute createString(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append('\0');
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//   11   19:pop             
		s = ((String) (stringbuilder.toString().getBytes(ExifInterface.ASCII)));
	//   12   20:aload_1         
	//   13   21:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   14   24:getstatic       #42  <Field java.nio.charset.Charset ExifInterface.ASCII>
	//   15   27:invokevirtual   #46  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   16   30:astore_0        
		return new ExifInterface$ExifAttribute(2, s.length, ((byte []) (s)));
	//   17   31:new             #2   <Class ExifInterface$ExifAttribute>
	//   18   34:dup             
	//   19   35:iconst_2        
	//   20   36:aload_0         
	//   21   37:arraylength     
	//   22   38:aload_0         
	//   23   39:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   24   42:areturn         
	}

	public static ExifInterface$ExifAttribute createULong(long l, ByteOrder byteorder)
	{
		return createULong(new long[] {
			l
		}, byteorder);
	//    0    0:iconst_1        
	//    1    1:newarray        long[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:lload_0         
	//    5    6:lastore         
	//    6    7:aload_2         
	//    7    8:invokestatic    #116 <Method ExifInterface$ExifAttribute createULong(long[], ByteOrder)>
	//    8   11:areturn         
	}

	public static ExifInterface$ExifAttribute createULong(long al[], ByteOrder byteorder)
	{
		ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * al.length]);
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:iconst_4        
	//    2    4:iaload          
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:imul            
	//    6    8:newarray        byte[]
	//    7   10:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    8   13:astore          4
		bytebuffer.order(byteorder);
	//    9   15:aload           4
	//   10   17:aload_1         
	//   11   18:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   21:pop             
		int j = al.length;
	//   13   22:aload_0         
	//   14   23:arraylength     
	//   15   24:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   25:iconst_0        
	//*  17   26:istore_2        
	//*  18   27:iload_2         
	//*  19   28:iload_3         
	//*  20   29:icmpge          49
			bytebuffer.putInt((int)al[i]);
	//   21   32:aload           4
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:laload          
	//   25   37:l2i             
	//   26   38:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   27   41:pop             

	//   28   42:iload_2         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore_2        
	//*  32   46:goto            27
		return new ExifInterface$ExifAttribute(4, al.length, bytebuffer.array());
	//   33   49:new             #2   <Class ExifInterface$ExifAttribute>
	//   34   52:dup             
	//   35   53:iconst_4        
	//   36   54:aload_0         
	//   37   55:arraylength     
	//   38   56:aload           4
	//   39   58:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   40   61:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   41   64:areturn         
	}

	public static ExifInterface$ExifAttribute createURational(ExifInterface.Rational rational, ByteOrder byteorder)
	{
		return createURational(new ExifInterface.Rational[] {
			rational
		}, byteorder);
	//    0    0:iconst_1        
	//    1    1:anewarray       ExifInterface.Rational[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:aload_1         
	//    7    9:invokestatic    #119 <Method ExifInterface$ExifAttribute createURational(ExifInterface$Rational[], ByteOrder)>
	//    8   12:areturn         
	}

	public static ExifInterface$ExifAttribute createURational(ExifInterface.Rational arational[], ByteOrder byteorder)
	{
		ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * arational.length]);
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:iconst_5        
	//    2    4:iaload          
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:imul            
	//    6    8:newarray        byte[]
	//    7   10:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    8   13:astore          4
		bytebuffer.order(byteorder);
	//    9   15:aload           4
	//   10   17:aload_1         
	//   11   18:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   21:pop             
		int j = arational.length;
	//   13   22:aload_0         
	//   14   23:arraylength     
	//   15   24:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   25:iconst_0        
	//*  17   26:istore_2        
	//*  18   27:iload_2         
	//*  19   28:iload_3         
	//*  20   29:icmpge          65
		{
			byteorder = ((ByteOrder) (arational[i]));
	//   21   32:aload_0         
	//   22   33:iload_2         
	//   23   34:aaload          
	//   24   35:astore_1        
			bytebuffer.putInt((int)((ExifInterface.Rational) (byteorder)).numerator);
	//   25   36:aload           4
	//   26   38:aload_1         
	//   27   39:getfield        #93  <Field long ExifInterface$Rational.numerator>
	//   28   42:l2i             
	//   29   43:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   30   46:pop             
			bytebuffer.putInt((int)((ExifInterface.Rational) (byteorder)).denominator);
	//   31   47:aload           4
	//   32   49:aload_1         
	//   33   50:getfield        #96  <Field long ExifInterface$Rational.denominator>
	//   34   53:l2i             
	//   35   54:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   36   57:pop             
		}

	//   37   58:iload_2         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:istore_2        
	//*  41   62:goto            27
		return new ExifInterface$ExifAttribute(5, arational.length, bytebuffer.array());
	//   42   65:new             #2   <Class ExifInterface$ExifAttribute>
	//   43   68:dup             
	//   44   69:iconst_5        
	//   45   70:aload_0         
	//   46   71:arraylength     
	//   47   72:aload           4
	//   48   74:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   49   77:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   50   80:areturn         
	}

	public static ExifInterface$ExifAttribute createUShort(int i, ByteOrder byteorder)
	{
		return createUShort(new int[] {
			i
		}, byteorder);
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:iastore         
	//    6    7:aload_1         
	//    7    8:invokestatic    #122 <Method ExifInterface$ExifAttribute createUShort(int[], ByteOrder)>
	//    8   11:areturn         
	}

	public static ExifInterface$ExifAttribute createUShort(int ai[], ByteOrder byteorder)
	{
		ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * ai.length]);
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:iconst_3        
	//    2    4:iaload          
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:imul            
	//    6    8:newarray        byte[]
	//    7   10:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    8   13:astore          4
		bytebuffer.order(byteorder);
	//    9   15:aload           4
	//   10   17:aload_1         
	//   11   18:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   21:pop             
		int j = ai.length;
	//   13   22:aload_0         
	//   14   23:arraylength     
	//   15   24:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   25:iconst_0        
	//*  17   26:istore_2        
	//*  18   27:iload_2         
	//*  19   28:iload_3         
	//*  20   29:icmpge          49
			bytebuffer.putShort((short)ai[i]);
	//   21   32:aload           4
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:iaload          
	//   25   37:int2short       
	//   26   38:invokevirtual   #126 <Method ByteBuffer ByteBuffer.putShort(short)>
	//   27   41:pop             

	//   28   42:iload_2         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore_2        
	//*  32   46:goto            27
		return new ExifInterface$ExifAttribute(3, ai.length, bytebuffer.array());
	//   33   49:new             #2   <Class ExifInterface$ExifAttribute>
	//   34   52:dup             
	//   35   53:iconst_3        
	//   36   54:aload_0         
	//   37   55:arraylength     
	//   38   56:aload           4
	//   39   58:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   40   61:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//   41   64:areturn         
	}

	public double getDoubleValue(ByteOrder byteorder)
	{
		byteorder = ((ByteOrder) (getValue(byteorder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method Object getValue(ByteOrder)>
	//    3    5:astore_1        
		if(byteorder != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          168
		{
			if(byteorder instanceof String)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #28  <Class String>
	//*   8   14:ifeq            25
				return Double.parseDouble((String)byteorder);
	//    9   17:aload_1         
	//   10   18:checkcast       #28  <Class String>
	//   11   21:invokestatic    #138 <Method double Double.parseDouble(String)>
	//   12   24:dreturn         
			if(byteorder instanceof long[])
	//*  13   25:aload_1         
	//*  14   26:instanceof      #140 <Class long[]>
	//*  15   29:ifeq            58
			{
				byteorder = ((ByteOrder) ((long[])byteorder));
	//   16   32:aload_1         
	//   17   33:checkcast       #140 <Class long[]>
	//   18   36:astore_1        
				if(byteorder.length == 1)
	//*  19   37:aload_1         
	//*  20   38:arraylength     
	//*  21   39:iconst_1        
	//*  22   40:icmpne          48
					return (double)byteorder[0];
	//   23   43:aload_1         
	//   24   44:iconst_0        
	//   25   45:laload          
	//   26   46:l2d             
	//   27   47:dreturn         
				else
					throw new NumberFormatException("There are more than one component");
	//   28   48:new             #142 <Class NumberFormatException>
	//   29   51:dup             
	//   30   52:ldc1            #144 <String "There are more than one component">
	//   31   54:invokespecial   #147 <Method void NumberFormatException(String)>
	//   32   57:athrow          
			}
			if(byteorder instanceof int[])
	//*  33   58:aload_1         
	//*  34   59:instanceof      #148 <Class int[]>
	//*  35   62:ifeq            91
			{
				byteorder = ((ByteOrder) ((int[])byteorder));
	//   36   65:aload_1         
	//   37   66:checkcast       #148 <Class int[]>
	//   38   69:astore_1        
				if(byteorder.length == 1)
	//*  39   70:aload_1         
	//*  40   71:arraylength     
	//*  41   72:iconst_1        
	//*  42   73:icmpne          81
					return (double)byteorder[0];
	//   43   76:aload_1         
	//   44   77:iconst_0        
	//   45   78:iaload          
	//   46   79:i2d             
	//   47   80:dreturn         
				else
					throw new NumberFormatException("There are more than one component");
	//   48   81:new             #142 <Class NumberFormatException>
	//   49   84:dup             
	//   50   85:ldc1            #144 <String "There are more than one component">
	//   51   87:invokespecial   #147 <Method void NumberFormatException(String)>
	//   52   90:athrow          
			}
			if(byteorder instanceof double[])
	//*  53   91:aload_1         
	//*  54   92:instanceof      #150 <Class double[]>
	//*  55   95:ifeq            123
			{
				byteorder = ((ByteOrder) ((double[])byteorder));
	//   56   98:aload_1         
	//   57   99:checkcast       #150 <Class double[]>
	//   58  102:astore_1        
				if(byteorder.length == 1)
	//*  59  103:aload_1         
	//*  60  104:arraylength     
	//*  61  105:iconst_1        
	//*  62  106:icmpne          113
					return byteorder[0];
	//   63  109:aload_1         
	//   64  110:iconst_0        
	//   65  111:daload          
	//   66  112:dreturn         
				else
					throw new NumberFormatException("There are more than one component");
	//   67  113:new             #142 <Class NumberFormatException>
	//   68  116:dup             
	//   69  117:ldc1            #144 <String "There are more than one component">
	//   70  119:invokespecial   #147 <Method void NumberFormatException(String)>
	//   71  122:athrow          
			}
			if(byteorder instanceof ExifInterface.Rational[])
	//*  72  123:aload_1         
	//*  73  124:instanceof      #152 <Class ExifInterface$Rational[]>
	//*  74  127:ifeq            158
			{
				byteorder = ((ByteOrder) ((ExifInterface.Rational[])byteorder));
	//   75  130:aload_1         
	//   76  131:checkcast       #152 <Class ExifInterface$Rational[]>
	//   77  134:astore_1        
				if(byteorder.length == 1)
	//*  78  135:aload_1         
	//*  79  136:arraylength     
	//*  80  137:iconst_1        
	//*  81  138:icmpne          148
					return ((ExifInterface.Rational) (byteorder[0])).calculate();
	//   82  141:aload_1         
	//   83  142:iconst_0        
	//   84  143:aaload          
	//   85  144:invokevirtual   #156 <Method double ExifInterface$Rational.calculate()>
	//   86  147:dreturn         
				else
					throw new NumberFormatException("There are more than one component");
	//   87  148:new             #142 <Class NumberFormatException>
	//   88  151:dup             
	//   89  152:ldc1            #144 <String "There are more than one component">
	//   90  154:invokespecial   #147 <Method void NumberFormatException(String)>
	//   91  157:athrow          
			} else
			{
				throw new NumberFormatException("Couldn't find a double value");
	//   92  158:new             #142 <Class NumberFormatException>
	//   93  161:dup             
	//   94  162:ldc1            #158 <String "Couldn't find a double value">
	//   95  164:invokespecial   #147 <Method void NumberFormatException(String)>
	//   96  167:athrow          
			}
		} else
		{
			throw new NumberFormatException("NULL can't be converted to a double value");
	//   97  168:new             #142 <Class NumberFormatException>
	//   98  171:dup             
	//   99  172:ldc1            #160 <String "NULL can't be converted to a double value">
	//  100  174:invokespecial   #147 <Method void NumberFormatException(String)>
	//  101  177:athrow          
		}
	}

	public int getIntValue(ByteOrder byteorder)
	{
		byteorder = ((ByteOrder) (getValue(byteorder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method Object getValue(ByteOrder)>
	//    3    5:astore_1        
		if(byteorder != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          100
		{
			if(byteorder instanceof String)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #28  <Class String>
	//*   8   14:ifeq            25
				return Integer.parseInt((String)byteorder);
	//    9   17:aload_1         
	//   10   18:checkcast       #28  <Class String>
	//   11   21:invokestatic    #168 <Method int Integer.parseInt(String)>
	//   12   24:ireturn         
			if(byteorder instanceof long[])
	//*  13   25:aload_1         
	//*  14   26:instanceof      #140 <Class long[]>
	//*  15   29:ifeq            58
			{
				byteorder = ((ByteOrder) ((long[])byteorder));
	//   16   32:aload_1         
	//   17   33:checkcast       #140 <Class long[]>
	//   18   36:astore_1        
				if(byteorder.length == 1)
	//*  19   37:aload_1         
	//*  20   38:arraylength     
	//*  21   39:iconst_1        
	//*  22   40:icmpne          48
					return (int)byteorder[0];
	//   23   43:aload_1         
	//   24   44:iconst_0        
	//   25   45:laload          
	//   26   46:l2i             
	//   27   47:ireturn         
				else
					throw new NumberFormatException("There are more than one component");
	//   28   48:new             #142 <Class NumberFormatException>
	//   29   51:dup             
	//   30   52:ldc1            #144 <String "There are more than one component">
	//   31   54:invokespecial   #147 <Method void NumberFormatException(String)>
	//   32   57:athrow          
			}
			if(byteorder instanceof int[])
	//*  33   58:aload_1         
	//*  34   59:instanceof      #148 <Class int[]>
	//*  35   62:ifeq            90
			{
				byteorder = ((ByteOrder) ((int[])byteorder));
	//   36   65:aload_1         
	//   37   66:checkcast       #148 <Class int[]>
	//   38   69:astore_1        
				if(byteorder.length == 1)
	//*  39   70:aload_1         
	//*  40   71:arraylength     
	//*  41   72:iconst_1        
	//*  42   73:icmpne          80
					return byteorder[0];
	//   43   76:aload_1         
	//   44   77:iconst_0        
	//   45   78:iaload          
	//   46   79:ireturn         
				else
					throw new NumberFormatException("There are more than one component");
	//   47   80:new             #142 <Class NumberFormatException>
	//   48   83:dup             
	//   49   84:ldc1            #144 <String "There are more than one component">
	//   50   86:invokespecial   #147 <Method void NumberFormatException(String)>
	//   51   89:athrow          
			} else
			{
				throw new NumberFormatException("Couldn't find a integer value");
	//   52   90:new             #142 <Class NumberFormatException>
	//   53   93:dup             
	//   54   94:ldc1            #170 <String "Couldn't find a integer value">
	//   55   96:invokespecial   #147 <Method void NumberFormatException(String)>
	//   56   99:athrow          
			}
		} else
		{
			throw new NumberFormatException("NULL can't be converted to a integer value");
	//   57  100:new             #142 <Class NumberFormatException>
	//   58  103:dup             
	//   59  104:ldc1            #172 <String "NULL can't be converted to a integer value">
	//   60  106:invokespecial   #147 <Method void NumberFormatException(String)>
	//   61  109:athrow          
		}
	}

	public String getStringValue(ByteOrder byteorder)
	{
		Object obj = getValue(byteorder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method Object getValue(ByteOrder)>
	//    3    5:astore          7
		if(obj == null)
	//*   4    7:aload           7
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		if(obj instanceof String)
	//*   8   14:aload           7
	//*   9   16:instanceof      #28  <Class String>
	//*  10   19:ifeq            28
			return (String)obj;
	//   11   22:aload           7
	//   12   24:checkcast       #28  <Class String>
	//   13   27:areturn         
		byteorder = ((ByteOrder) (new StringBuilder()));
	//   14   28:new             #99  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #100 <Method void StringBuilder()>
	//   17   35:astore_1        
		boolean flag2 = obj instanceof long[];
	//   18   36:aload           7
	//   19   38:instanceof      #140 <Class long[]>
	//   20   41:istore          6
		int i1 = 0;
	//   21   43:iconst_0        
	//   22   44:istore_3        
		boolean flag = false;
	//   23   45:iconst_0        
	//   24   46:istore          4
		boolean flag1 = false;
	//   25   48:iconst_0        
	//   26   49:istore          5
		int i = 0;
	//   27   51:iconst_0        
	//   28   52:istore_2        
		if(flag2)
	//*  29   53:iload           6
	//*  30   55:ifeq            111
		{
			obj = ((Object) ((long[])obj));
	//   31   58:aload           7
	//   32   60:checkcast       #140 <Class long[]>
	//   33   63:astore          7
			do
			{
				if(i >= obj.length)
					break;
	//   34   65:iload_2         
	//   35   66:aload           7
	//   36   68:arraylength     
	//   37   69:icmpge          106
				((StringBuilder) (byteorder)).append(obj[i]);
	//   38   72:aload_1         
	//   39   73:aload           7
	//   40   75:iload_2         
	//   41   76:laload          
	//   42   77:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
	//   43   80:pop             
				i1 = i + 1;
	//   44   81:iload_2         
	//   45   82:iconst_1        
	//   46   83:iadd            
	//   47   84:istore_3        
				i = i1;
	//   48   85:iload_3         
	//   49   86:istore_2        
				if(i1 != obj.length)
	//*  50   87:iload_3         
	//*  51   88:aload           7
	//*  52   90:arraylength     
	//*  53   91:icmpeq          65
				{
					((StringBuilder) (byteorder)).append(",");
	//   54   94:aload_1         
	//   55   95:ldc1            #179 <String ",">
	//   56   97:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   57  100:pop             
					i = i1;
	//   58  101:iload_3         
	//   59  102:istore_2        
				}
			} while(true);
	//   60  103:goto            65
			return ((StringBuilder) (byteorder)).toString();
	//   61  106:aload_1         
	//   62  107:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   63  110:areturn         
		}
		if(obj instanceof int[])
	//*  64  111:aload           7
	//*  65  113:instanceof      #148 <Class int[]>
	//*  66  116:ifeq            174
		{
			obj = ((Object) ((int[])obj));
	//   67  119:aload           7
	//   68  121:checkcast       #148 <Class int[]>
	//   69  124:astore          7
			int j = i1;
	//   70  126:iload_3         
	//   71  127:istore_2        
			do
			{
				if(j >= obj.length)
					break;
	//   72  128:iload_2         
	//   73  129:aload           7
	//   74  131:arraylength     
	//   75  132:icmpge          169
				((StringBuilder) (byteorder)).append(obj[j]);
	//   76  135:aload_1         
	//   77  136:aload           7
	//   78  138:iload_2         
	//   79  139:iaload          
	//   80  140:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   81  143:pop             
				int j1 = j + 1;
	//   82  144:iload_2         
	//   83  145:iconst_1        
	//   84  146:iadd            
	//   85  147:istore_3        
				j = j1;
	//   86  148:iload_3         
	//   87  149:istore_2        
				if(j1 != obj.length)
	//*  88  150:iload_3         
	//*  89  151:aload           7
	//*  90  153:arraylength     
	//*  91  154:icmpeq          128
				{
					((StringBuilder) (byteorder)).append(",");
	//   92  157:aload_1         
	//   93  158:ldc1            #179 <String ",">
	//   94  160:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   95  163:pop             
					j = j1;
	//   96  164:iload_3         
	//   97  165:istore_2        
				}
			} while(true);
	//   98  166:goto            128
			return ((StringBuilder) (byteorder)).toString();
	//   99  169:aload_1         
	//  100  170:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  101  173:areturn         
		}
		if(obj instanceof double[])
	//* 102  174:aload           7
	//* 103  176:instanceof      #150 <Class double[]>
	//* 104  179:ifeq            238
		{
			obj = ((Object) ((double[])obj));
	//  105  182:aload           7
	//  106  184:checkcast       #150 <Class double[]>
	//  107  187:astore          7
			int k = ((int) (flag));
	//  108  189:iload           4
	//  109  191:istore_2        
			do
			{
				if(k >= obj.length)
					break;
	//  110  192:iload_2         
	//  111  193:aload           7
	//  112  195:arraylength     
	//  113  196:icmpge          233
				((StringBuilder) (byteorder)).append(obj[k]);
	//  114  199:aload_1         
	//  115  200:aload           7
	//  116  202:iload_2         
	//  117  203:daload          
	//  118  204:invokevirtual   #185 <Method StringBuilder StringBuilder.append(double)>
	//  119  207:pop             
				int k1 = k + 1;
	//  120  208:iload_2         
	//  121  209:iconst_1        
	//  122  210:iadd            
	//  123  211:istore_3        
				k = k1;
	//  124  212:iload_3         
	//  125  213:istore_2        
				if(k1 != obj.length)
	//* 126  214:iload_3         
	//* 127  215:aload           7
	//* 128  217:arraylength     
	//* 129  218:icmpeq          192
				{
					((StringBuilder) (byteorder)).append(",");
	//  130  221:aload_1         
	//  131  222:ldc1            #179 <String ",">
	//  132  224:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  133  227:pop             
					k = k1;
	//  134  228:iload_3         
	//  135  229:istore_2        
				}
			} while(true);
	//  136  230:goto            192
			return ((StringBuilder) (byteorder)).toString();
	//  137  233:aload_1         
	//  138  234:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  139  237:areturn         
		}
		if(obj instanceof ExifInterface.Rational[])
	//* 140  238:aload           7
	//* 141  240:instanceof      #152 <Class ExifInterface$Rational[]>
	//* 142  243:ifeq            324
		{
			ExifInterface.Rational arational[] = (ExifInterface.Rational[])obj;
	//  143  246:aload           7
	//  144  248:checkcast       #152 <Class ExifInterface$Rational[]>
	//  145  251:astore          7
			int l = ((int) (flag1));
	//  146  253:iload           5
	//  147  255:istore_2        
			do
			{
				if(l >= arational.length)
					break;
	//  148  256:iload_2         
	//  149  257:aload           7
	//  150  259:arraylength     
	//  151  260:icmpge          319
				((StringBuilder) (byteorder)).append(arational[l].numerator);
	//  152  263:aload_1         
	//  153  264:aload           7
	//  154  266:iload_2         
	//  155  267:aaload          
	//  156  268:getfield        #93  <Field long ExifInterface$Rational.numerator>
	//  157  271:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
	//  158  274:pop             
				((StringBuilder) (byteorder)).append('/');
	//  159  275:aload_1         
	//  160  276:bipush          47
	//  161  278:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//  162  281:pop             
				((StringBuilder) (byteorder)).append(arational[l].denominator);
	//  163  282:aload_1         
	//  164  283:aload           7
	//  165  285:iload_2         
	//  166  286:aaload          
	//  167  287:getfield        #96  <Field long ExifInterface$Rational.denominator>
	//  168  290:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
	//  169  293:pop             
				int l1 = l + 1;
	//  170  294:iload_2         
	//  171  295:iconst_1        
	//  172  296:iadd            
	//  173  297:istore_3        
				l = l1;
	//  174  298:iload_3         
	//  175  299:istore_2        
				if(l1 != arational.length)
	//* 176  300:iload_3         
	//* 177  301:aload           7
	//* 178  303:arraylength     
	//* 179  304:icmpeq          256
				{
					((StringBuilder) (byteorder)).append(",");
	//  180  307:aload_1         
	//  181  308:ldc1            #179 <String ",">
	//  182  310:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  183  313:pop             
					l = l1;
	//  184  314:iload_3         
	//  185  315:istore_2        
				}
			} while(true);
	//  186  316:goto            256
			return ((StringBuilder) (byteorder)).toString();
	//  187  319:aload_1         
	//  188  320:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  189  323:areturn         
		} else
		{
			return null;
	//  190  324:aconst_null     
	//  191  325:areturn         
		}
	}

	Object getValue(ByteOrder byteorder)
	{
		aInputStream ainputstream = new aInputStream(bytes);
	//    0    0:new             #189 <Class ExifInterface$ByteOrderedDataInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field byte[] bytes>
	//    4    8:invokespecial   #192 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
	//    5   11:astore          14
		Object obj = ((Object) (ainputstream));
	//    6   13:aload           14
	//    7   15:astore          13
		ainputstream.setByteOrder(byteorder);
	//    8   17:aload           14
	//    9   19:aload_1         
	//   10   20:invokevirtual   #196 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		obj = ((Object) (ainputstream));
	//   11   23:aload           14
	//   12   25:astore          13
		int j = format;
	//   13   27:aload_0         
	//   14   28:getfield        #19  <Field int format>
	//   15   31:istore          12
		int i;
		byte byte0;
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		boolean flag6;
		boolean flag7;
		flag1 = true;
	//   16   33:iconst_1        
	//   17   34:istore          5
		byte0 = 0;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		flag2 = false;
	//   20   38:iconst_0        
	//   21   39:istore          6
		flag3 = false;
	//   22   41:iconst_0        
	//   23   42:istore          7
		flag4 = false;
	//   24   44:iconst_0        
	//   25   45:istore          8
		flag5 = false;
	//   26   47:iconst_0        
	//   27   48:istore          9
		flag6 = false;
	//   28   50:iconst_0        
	//   29   51:istore          10
		flag7 = false;
	//   30   53:iconst_0        
	//   31   54:istore          11
		flag = false;
	//   32   56:iconst_0        
	//   33   57:istore          4
		i = 0;
	//   34   59:iconst_0        
	//   35   60:istore_2        
		j;
	//   36   61:iload           12
		JVM INSTR tableswitch 1 12: default 1091
	//	               1 857
	//	               2 677
	//	               3 611
	//	               4 545
	//	               5 466
	//	               6 857
	//	               7 677
	//	               8 400
	//	               9 334
	//	               10 253
	//	               11 187
	//	               12 124;
	//   37   63:tableswitch     1 12: default 1091
	//	               1 857
	//	               2 677
	//	               3 611
	//	               4 545
	//	               5 466
	//	               6 857
	//	               7 677
	//	               8 400
	//	               9 334
	//	               10 253
	//	               11 187
	//	               12 124
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L2 _L3 _L7 _L8 _L9 _L10 _L11
_L11:
		obj = ((Object) (ainputstream));
	//   38  124:aload           14
	//   39  126:astore          13
		byteorder = ((ByteOrder) (new double[numberOfComponents]));
	//   40  128:aload_0         
	//   41  129:getfield        #21  <Field int numberOfComponents>
	//   42  132:newarray        double[]
	//   43  134:astore_1        
_L13:
		obj = ((Object) (ainputstream));
	//   44  135:aload           14
	//   45  137:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//   46  139:iload_2         
	//   47  140:aload_0         
	//   48  141:getfield        #21  <Field int numberOfComponents>
	//   49  144:icmpge          166
		obj = ((Object) (ainputstream));
	//   50  147:aload           14
	//   51  149:astore          13
		byteorder[i] = ainputstream.readDouble();
	//   52  151:aload_1         
	//   53  152:iload_2         
	//   54  153:aload           14
	//   55  155:invokevirtual   #199 <Method double ExifInterface$ByteOrderedDataInputStream.readDouble()>
	//   56  158:dastore         
		i++;
	//   57  159:iload_2         
	//   58  160:iconst_1        
	//   59  161:iadd            
	//   60  162:istore_2        
		if(true) goto _L13; else goto _L12
	//   61  163:goto            135
_L12:
		try
		{
			ainputstream.close();
	//   62  166:aload           14
	//   63  168:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//*  64  171:aload_1         
	//*  65  172:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  66  173:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//   67  175:ldc1            #204 <String "ExifInterface">
	//   68  177:ldc1            #206 <String "IOException occurred while closing InputStream">
	//   69  179:aload           13
	//   70  181:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//   71  184:pop             
			return ((Object) (byteorder));
	//   72  185:aload_1         
	//   73  186:areturn         
		}
		return ((Object) (byteorder));
_L10:
		obj = ((Object) (ainputstream));
	//   74  187:aload           14
	//   75  189:astore          13
		byteorder = ((ByteOrder) (new double[numberOfComponents]));
	//   76  191:aload_0         
	//   77  192:getfield        #21  <Field int numberOfComponents>
	//   78  195:newarray        double[]
	//   79  197:astore_1        
		i = ((int) (byte0));
	//   80  198:iload_3         
	//   81  199:istore_2        
_L15:
		obj = ((Object) (ainputstream));
	//   82  200:aload           14
	//   83  202:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//   84  204:iload_2         
	//   85  205:aload_0         
	//   86  206:getfield        #21  <Field int numberOfComponents>
	//   87  209:icmpge          232
		obj = ((Object) (ainputstream));
	//   88  212:aload           14
	//   89  214:astore          13
		byteorder[i] = ainputstream.readFloat();
	//   90  216:aload_1         
	//   91  217:iload_2         
	//   92  218:aload           14
	//   93  220:invokevirtual   #216 <Method float ExifInterface$ByteOrderedDataInputStream.readFloat()>
	//   94  223:f2d             
	//   95  224:dastore         
		i++;
	//   96  225:iload_2         
	//   97  226:iconst_1        
	//   98  227:iadd            
	//   99  228:istore_2        
		if(true) goto _L15; else goto _L14
	//  100  229:goto            200
_L14:
		try
		{
			ainputstream.close();
	//  101  232:aload           14
	//  102  234:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 103  237:aload_1         
	//* 104  238:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 105  239:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  106  241:ldc1            #204 <String "ExifInterface">
	//  107  243:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  108  245:aload           13
	//  109  247:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  110  250:pop             
			return ((Object) (byteorder));
	//  111  251:aload_1         
	//  112  252:areturn         
		}
		return ((Object) (byteorder));
_L9:
		obj = ((Object) (ainputstream));
	//  113  253:aload           14
	//  114  255:astore          13
		byteorder = ((ByteOrder) (new ExifInterface.Rational[numberOfComponents]));
	//  115  257:aload_0         
	//  116  258:getfield        #21  <Field int numberOfComponents>
	//  117  261:anewarray       ExifInterface.Rational[]
	//  118  264:astore_1        
		i = ((int) (flag2));
	//  119  265:iload           6
	//  120  267:istore_2        
_L17:
		obj = ((Object) (ainputstream));
	//  121  268:aload           14
	//  122  270:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//  123  272:iload_2         
	//  124  273:aload_0         
	//  125  274:getfield        #21  <Field int numberOfComponents>
	//  126  277:icmpge          313
		obj = ((Object) (ainputstream));
	//  127  280:aload           14
	//  128  282:astore          13
		byteorder[i] = ((/*<invalid signature>*/java.lang.Object) (new ExifInterface.Rational(ainputstream.readInt(), ainputstream.readInt())));
	//  129  284:aload_1         
	//  130  285:iload_2         
	//  131  286:new             #86  <Class ExifInterface$Rational>
	//  132  289:dup             
	//  133  290:aload           14
	//  134  292:invokevirtual   #219 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//  135  295:i2l             
	//  136  296:aload           14
	//  137  298:invokevirtual   #219 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//  138  301:i2l             
	//  139  302:invokespecial   #222 <Method void ExifInterface$Rational(long, long)>
	//  140  305:aastore         
		i++;
	//  141  306:iload_2         
	//  142  307:iconst_1        
	//  143  308:iadd            
	//  144  309:istore_2        
		if(true) goto _L17; else goto _L16
	//  145  310:goto            268
_L16:
		try
		{
			ainputstream.close();
	//  146  313:aload           14
	//  147  315:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 148  318:aload_1         
	//* 149  319:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 150  320:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  151  322:ldc1            #204 <String "ExifInterface">
	//  152  324:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  153  326:aload           13
	//  154  328:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  155  331:pop             
			return ((Object) (byteorder));
	//  156  332:aload_1         
	//  157  333:areturn         
		}
		return ((Object) (byteorder));
_L8:
		obj = ((Object) (ainputstream));
	//  158  334:aload           14
	//  159  336:astore          13
		byteorder = ((ByteOrder) (new int[numberOfComponents]));
	//  160  338:aload_0         
	//  161  339:getfield        #21  <Field int numberOfComponents>
	//  162  342:newarray        int[]
	//  163  344:astore_1        
		i = ((int) (flag3));
	//  164  345:iload           7
	//  165  347:istore_2        
_L19:
		obj = ((Object) (ainputstream));
	//  166  348:aload           14
	//  167  350:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//  168  352:iload_2         
	//  169  353:aload_0         
	//  170  354:getfield        #21  <Field int numberOfComponents>
	//  171  357:icmpge          379
		obj = ((Object) (ainputstream));
	//  172  360:aload           14
	//  173  362:astore          13
		byteorder[i] = ainputstream.readInt();
	//  174  364:aload_1         
	//  175  365:iload_2         
	//  176  366:aload           14
	//  177  368:invokevirtual   #219 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//  178  371:iastore         
		i++;
	//  179  372:iload_2         
	//  180  373:iconst_1        
	//  181  374:iadd            
	//  182  375:istore_2        
		if(true) goto _L19; else goto _L18
	//  183  376:goto            348
_L18:
		try
		{
			ainputstream.close();
	//  184  379:aload           14
	//  185  381:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 186  384:aload_1         
	//* 187  385:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 188  386:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  189  388:ldc1            #204 <String "ExifInterface">
	//  190  390:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  191  392:aload           13
	//  192  394:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  193  397:pop             
			return ((Object) (byteorder));
	//  194  398:aload_1         
	//  195  399:areturn         
		}
		return ((Object) (byteorder));
_L7:
		obj = ((Object) (ainputstream));
	//  196  400:aload           14
	//  197  402:astore          13
		byteorder = ((ByteOrder) (new int[numberOfComponents]));
	//  198  404:aload_0         
	//  199  405:getfield        #21  <Field int numberOfComponents>
	//  200  408:newarray        int[]
	//  201  410:astore_1        
		i = ((int) (flag4));
	//  202  411:iload           8
	//  203  413:istore_2        
_L21:
		obj = ((Object) (ainputstream));
	//  204  414:aload           14
	//  205  416:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//  206  418:iload_2         
	//  207  419:aload_0         
	//  208  420:getfield        #21  <Field int numberOfComponents>
	//  209  423:icmpge          445
		obj = ((Object) (ainputstream));
	//  210  426:aload           14
	//  211  428:astore          13
		byteorder[i] = ((int) (ainputstream.readShort()));
	//  212  430:aload_1         
	//  213  431:iload_2         
	//  214  432:aload           14
	//  215  434:invokevirtual   #226 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//  216  437:iastore         
		i++;
	//  217  438:iload_2         
	//  218  439:iconst_1        
	//  219  440:iadd            
	//  220  441:istore_2        
		if(true) goto _L21; else goto _L20
	//  221  442:goto            414
_L20:
		try
		{
			ainputstream.close();
	//  222  445:aload           14
	//  223  447:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 224  450:aload_1         
	//* 225  451:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 226  452:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  227  454:ldc1            #204 <String "ExifInterface">
	//  228  456:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  229  458:aload           13
	//  230  460:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  231  463:pop             
			return ((Object) (byteorder));
	//  232  464:aload_1         
	//  233  465:areturn         
		}
		return ((Object) (byteorder));
_L6:
		obj = ((Object) (ainputstream));
	//  234  466:aload           14
	//  235  468:astore          13
		byteorder = ((ByteOrder) (new ExifInterface.Rational[numberOfComponents]));
	//  236  470:aload_0         
	//  237  471:getfield        #21  <Field int numberOfComponents>
	//  238  474:anewarray       ExifInterface.Rational[]
	//  239  477:astore_1        
		i = ((int) (flag5));
	//  240  478:iload           9
	//  241  480:istore_2        
_L23:
		obj = ((Object) (ainputstream));
	//  242  481:aload           14
	//  243  483:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//  244  485:iload_2         
	//  245  486:aload_0         
	//  246  487:getfield        #21  <Field int numberOfComponents>
	//  247  490:icmpge          524
		obj = ((Object) (ainputstream));
	//  248  493:aload           14
	//  249  495:astore          13
		byteorder[i] = ((/*<invalid signature>*/java.lang.Object) (new ExifInterface.Rational(ainputstream.readUnsignedInt(), ainputstream.readUnsignedInt())));
	//  250  497:aload_1         
	//  251  498:iload_2         
	//  252  499:new             #86  <Class ExifInterface$Rational>
	//  253  502:dup             
	//  254  503:aload           14
	//  255  505:invokevirtual   #230 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
	//  256  508:aload           14
	//  257  510:invokevirtual   #230 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
	//  258  513:invokespecial   #222 <Method void ExifInterface$Rational(long, long)>
	//  259  516:aastore         
		i++;
	//  260  517:iload_2         
	//  261  518:iconst_1        
	//  262  519:iadd            
	//  263  520:istore_2        
		if(true) goto _L23; else goto _L22
	//  264  521:goto            481
_L22:
		try
		{
			ainputstream.close();
	//  265  524:aload           14
	//  266  526:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 267  529:aload_1         
	//* 268  530:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 269  531:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  270  533:ldc1            #204 <String "ExifInterface">
	//  271  535:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  272  537:aload           13
	//  273  539:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  274  542:pop             
			return ((Object) (byteorder));
	//  275  543:aload_1         
	//  276  544:areturn         
		}
		return ((Object) (byteorder));
_L5:
		obj = ((Object) (ainputstream));
	//  277  545:aload           14
	//  278  547:astore          13
		byteorder = ((ByteOrder) (new long[numberOfComponents]));
	//  279  549:aload_0         
	//  280  550:getfield        #21  <Field int numberOfComponents>
	//  281  553:newarray        long[]
	//  282  555:astore_1        
		i = ((int) (flag6));
	//  283  556:iload           10
	//  284  558:istore_2        
_L25:
		obj = ((Object) (ainputstream));
	//  285  559:aload           14
	//  286  561:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//  287  563:iload_2         
	//  288  564:aload_0         
	//  289  565:getfield        #21  <Field int numberOfComponents>
	//  290  568:icmpge          590
		obj = ((Object) (ainputstream));
	//  291  571:aload           14
	//  292  573:astore          13
		byteorder[i] = ainputstream.readUnsignedInt();
	//  293  575:aload_1         
	//  294  576:iload_2         
	//  295  577:aload           14
	//  296  579:invokevirtual   #230 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
	//  297  582:lastore         
		i++;
	//  298  583:iload_2         
	//  299  584:iconst_1        
	//  300  585:iadd            
	//  301  586:istore_2        
		if(true) goto _L25; else goto _L24
	//  302  587:goto            559
_L24:
		try
		{
			ainputstream.close();
	//  303  590:aload           14
	//  304  592:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 305  595:aload_1         
	//* 306  596:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 307  597:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  308  599:ldc1            #204 <String "ExifInterface">
	//  309  601:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  310  603:aload           13
	//  311  605:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  312  608:pop             
			return ((Object) (byteorder));
	//  313  609:aload_1         
	//  314  610:areturn         
		}
		return ((Object) (byteorder));
_L4:
		obj = ((Object) (ainputstream));
	//  315  611:aload           14
	//  316  613:astore          13
		byteorder = ((ByteOrder) (new int[numberOfComponents]));
	//  317  615:aload_0         
	//  318  616:getfield        #21  <Field int numberOfComponents>
	//  319  619:newarray        int[]
	//  320  621:astore_1        
		i = ((int) (flag7));
	//  321  622:iload           11
	//  322  624:istore_2        
_L27:
		obj = ((Object) (ainputstream));
	//  323  625:aload           14
	//  324  627:astore          13
		if(i >= numberOfComponents)
			break; /* Loop/switch isn't completed */
	//  325  629:iload_2         
	//  326  630:aload_0         
	//  327  631:getfield        #21  <Field int numberOfComponents>
	//  328  634:icmpge          656
		obj = ((Object) (ainputstream));
	//  329  637:aload           14
	//  330  639:astore          13
		byteorder[i] = ainputstream.readUnsignedShort();
	//  331  641:aload_1         
	//  332  642:iload_2         
	//  333  643:aload           14
	//  334  645:invokevirtual   #233 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//  335  648:iastore         
		i++;
	//  336  649:iload_2         
	//  337  650:iconst_1        
	//  338  651:iadd            
	//  339  652:istore_2        
		if(true) goto _L27; else goto _L26
	//  340  653:goto            625
_L26:
		try
		{
			ainputstream.close();
	//  341  656:aload           14
	//  342  658:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 343  661:aload_1         
	//* 344  662:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 345  663:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  346  665:ldc1            #204 <String "ExifInterface">
	//  347  667:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  348  669:aload           13
	//  349  671:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  350  674:pop             
			return ((Object) (byteorder));
	//  351  675:aload_1         
	//  352  676:areturn         
		}
		return ((Object) (byteorder));
_L3:
		i = ((int) (flag));
	//  353  677:iload           4
	//  354  679:istore_2        
		obj = ((Object) (ainputstream));
	//  355  680:aload           14
	//  356  682:astore          13
		if(numberOfComponents < ExifInterface.EXIF_ASCII_PREFIX.length) goto _L29; else goto _L28
	//  357  684:aload_0         
	//  358  685:getfield        #21  <Field int numberOfComponents>
	//  359  688:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
	//  360  691:arraylength     
	//  361  692:icmplt          751
_L28:
		i = 0;
	//  362  695:iconst_0        
	//  363  696:istore_2        
_L45:
		byte0 = ((byte) (flag1));
	//  364  697:iload           5
	//  365  699:istore_3        
		obj = ((Object) (ainputstream));
	//  366  700:aload           14
	//  367  702:astore          13
		if(i >= ExifInterface.EXIF_ASCII_PREFIX.length) goto _L31; else goto _L30
	//  368  704:iload_2         
	//  369  705:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
	//  370  708:arraylength     
	//  371  709:icmpge          735
_L30:
		obj = ((Object) (ainputstream));
	//  372  712:aload           14
	//  373  714:astore          13
		if(bytes[i] == ExifInterface.EXIF_ASCII_PREFIX[i]) goto _L33; else goto _L32
	//  374  716:aload_0         
	//  375  717:getfield        #23  <Field byte[] bytes>
	//  376  720:iload_2         
	//  377  721:baload          
	//  378  722:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
	//  379  725:iload_2         
	//  380  726:baload          
	//  381  727:icmpeq          1094
_L32:
		byte0 = 0;
	//  382  730:iconst_0        
	//  383  731:istore_3        
	//* 384  732:goto            735
_L31:
		i = ((int) (flag));
	//  385  735:iload           4
	//  386  737:istore_2        
		if(!byte0) goto _L29; else goto _L34
	//  387  738:iload_3         
	//  388  739:ifeq            751
_L34:
		obj = ((Object) (ainputstream));
	//  389  742:aload           14
	//  390  744:astore          13
		i = ExifInterface.EXIF_ASCII_PREFIX.length;
	//  391  746:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
	//  392  749:arraylength     
	//  393  750:istore_2        
_L29:
		obj = ((Object) (ainputstream));
	//  394  751:aload           14
	//  395  753:astore          13
		byteorder = ((ByteOrder) (new StringBuilder()));
	//  396  755:new             #99  <Class StringBuilder>
	//  397  758:dup             
	//  398  759:invokespecial   #100 <Method void StringBuilder()>
	//  399  762:astore_1        
_L46:
		obj = ((Object) (ainputstream));
	//  400  763:aload           14
	//  401  765:astore          13
		if(i >= numberOfComponents) goto _L36; else goto _L35
	//  402  767:iload_2         
	//  403  768:aload_0         
	//  404  769:getfield        #21  <Field int numberOfComponents>
	//  405  772:icmpge          827
_L35:
		obj = ((Object) (ainputstream));
	//  406  775:aload           14
	//  407  777:astore          13
		byte0 = bytes[i];
	//  408  779:aload_0         
	//  409  780:getfield        #23  <Field byte[] bytes>
	//  410  783:iload_2         
	//  411  784:baload          
	//  412  785:istore_3        
		if(byte0 != 0) goto _L37; else goto _L36
	//  413  786:iload_3         
	//  414  787:ifne            793
	//* 415  790:goto            827
_L37:
		if(byte0 < 32) goto _L39; else goto _L38
	//  416  793:iload_3         
	//  417  794:bipush          32
	//  418  796:icmplt          813
_L38:
		obj = ((Object) (ainputstream));
	//  419  799:aload           14
	//  420  801:astore          13
		((StringBuilder) (byteorder)).append((char)byte0);
	//  421  803:aload_1         
	//  422  804:iload_3         
	//  423  805:int2char        
	//  424  806:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//  425  809:pop             
		  goto _L40
	//* 426  810:goto            1101
_L39:
		obj = ((Object) (ainputstream));
	//  427  813:aload           14
	//  428  815:astore          13
		((StringBuilder) (byteorder)).append('?');
	//  429  817:aload_1         
	//  430  818:bipush          63
	//  431  820:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//  432  823:pop             
		  goto _L40
	//* 433  824:goto            1101
_L36:
		obj = ((Object) (ainputstream));
	//  434  827:aload           14
	//  435  829:astore          13
		byteorder = ((ByteOrder) (((StringBuilder) (byteorder)).toString()));
	//  436  831:aload_1         
	//  437  832:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  438  835:astore_1        
		try
		{
			ainputstream.close();
	//  439  836:aload           14
	//  440  838:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 441  841:aload_1         
	//* 442  842:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 443  843:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  444  845:ldc1            #204 <String "ExifInterface">
	//  445  847:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  446  849:aload           13
	//  447  851:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  448  854:pop             
			return ((Object) (byteorder));
	//  449  855:aload_1         
	//  450  856:areturn         
		}
		return ((Object) (byteorder));
_L2:
		obj = ((Object) (ainputstream));
	//  451  857:aload           14
	//  452  859:astore          13
		if(bytes.length != 1)
			break MISSING_BLOCK_LABEL_946;
	//  453  861:aload_0         
	//  454  862:getfield        #23  <Field byte[] bytes>
	//  455  865:arraylength     
	//  456  866:iconst_1        
	//  457  867:icmpne          946
		obj = ((Object) (ainputstream));
	//  458  870:aload           14
	//  459  872:astore          13
		if(bytes[0] < 0)
			break MISSING_BLOCK_LABEL_946;
	//  460  874:aload_0         
	//  461  875:getfield        #23  <Field byte[] bytes>
	//  462  878:iconst_0        
	//  463  879:baload          
	//  464  880:iflt            946
		obj = ((Object) (ainputstream));
	//  465  883:aload           14
	//  466  885:astore          13
		if(bytes[0] > 1)
			break MISSING_BLOCK_LABEL_946;
	//  467  887:aload_0         
	//  468  888:getfield        #23  <Field byte[] bytes>
	//  469  891:iconst_0        
	//  470  892:baload          
	//  471  893:iconst_1        
	//  472  894:icmpgt          946
		obj = ((Object) (ainputstream));
	//  473  897:aload           14
	//  474  899:astore          13
		byteorder = ((ByteOrder) (new String(new char[] {
			(char)(bytes[0] + 48)
		})));
	//  475  901:new             #28  <Class String>
	//  476  904:dup             
	//  477  905:iconst_1        
	//  478  906:newarray        char[]
	//  479  908:dup             
	//  480  909:iconst_0        
	//  481  910:aload_0         
	//  482  911:getfield        #23  <Field byte[] bytes>
	//  483  914:iconst_0        
	//  484  915:baload          
	//  485  916:bipush          48
	//  486  918:iadd            
	//  487  919:int2char        
	//  488  920:castore         
	//  489  921:invokespecial   #239 <Method void String(char[])>
	//  490  924:astore_1        
		try
		{
			ainputstream.close();
	//  491  925:aload           14
	//  492  927:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 493  930:aload_1         
	//* 494  931:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 495  932:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  496  934:ldc1            #204 <String "ExifInterface">
	//  497  936:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  498  938:aload           13
	//  499  940:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  500  943:pop             
			return ((Object) (byteorder));
	//  501  944:aload_1         
	//  502  945:areturn         
		}
		return ((Object) (byteorder));
		obj = ((Object) (ainputstream));
	//  503  946:aload           14
	//  504  948:astore          13
		byteorder = ((ByteOrder) (new String(bytes, ExifInterface.ASCII)));
	//  505  950:new             #28  <Class String>
	//  506  953:dup             
	//  507  954:aload_0         
	//  508  955:getfield        #23  <Field byte[] bytes>
	//  509  958:getstatic       #42  <Field java.nio.charset.Charset ExifInterface.ASCII>
	//  510  961:invokespecial   #242 <Method void String(byte[], java.nio.charset.Charset)>
	//  511  964:astore_1        
		try
		{
			ainputstream.close();
	//  512  965:aload           14
	//  513  967:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 514  970:aload_1         
	//* 515  971:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 516  972:astore          13
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
	//  517  974:ldc1            #204 <String "ExifInterface">
	//  518  976:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  519  978:aload           13
	//  520  980:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  521  983:pop             
			return ((Object) (byteorder));
	//  522  984:aload_1         
	//  523  985:areturn         
		}
		return ((Object) (byteorder));
_L1:
		try
		{
			ainputstream.close();
	//  524  986:aload           14
	//  525  988:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		}
	//* 526  991:aconst_null     
	//* 527  992:areturn         
		// Misplaced declaration of an exception variable
		catch(ByteOrder byteorder)
	//* 528  993:astore_1        
		{
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (byteorder)));
	//  529  994:ldc1            #204 <String "ExifInterface">
	//  530  996:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  531  998:aload_1         
	//  532  999:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  533 1002:pop             
			return ((Object) (null));
	//  534 1003:aconst_null     
	//  535 1004:areturn         
		}
		return ((Object) (null));
		obj;
	//  536 1005:astore          13
		Object obj1;
		byteorder = ((ByteOrder) (ainputstream));
	//  537 1007:aload           14
	//  538 1009:astore_1        
		obj1 = obj;
	//  539 1010:aload           13
	//  540 1012:astore          14
		  goto _L41
	//* 541 1014:goto            1028
		byteorder;
	//  542 1017:astore_1        
		obj = null;
	//  543 1018:aconst_null     
	//  544 1019:astore          13
		  goto _L42
	//* 545 1021:goto            1064
		obj1;
	//  546 1024:astore          14
		byteorder = null;
	//  547 1026:aconst_null     
	//  548 1027:astore_1        
_L41:
		obj = ((Object) (byteorder));
	//  549 1028:aload_1         
	//  550 1029:astore          13
		Log.w("ExifInterface", "IOException occurred during reading a value", ((Throwable) (obj1)));
	//  551 1031:ldc1            #204 <String "ExifInterface">
	//  552 1033:ldc1            #244 <String "IOException occurred during reading a value">
	//  553 1035:aload           14
	//  554 1037:invokestatic    #247 <Method int Log.w(String, String, Throwable)>
	//  555 1040:pop             
		if(byteorder == null) goto _L44; else goto _L43
	//  556 1041:aload_1         
	//  557 1042:ifnull          1061
_L43:
		((aInputStream) (byteorder)).close();
	//  558 1045:aload_1         
	//  559 1046:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		return ((Object) (null));
	//  560 1049:aconst_null     
	//  561 1050:areturn         
		byteorder;
	//  562 1051:astore_1        
		Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (byteorder)));
	//  563 1052:ldc1            #204 <String "ExifInterface">
	//  564 1054:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  565 1056:aload_1         
	//  566 1057:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  567 1060:pop             
_L44:
		return ((Object) (null));
	//  568 1061:aconst_null     
	//  569 1062:areturn         
		byteorder;
	//  570 1063:astore_1        
_L42:
		if(obj != null)
	//* 571 1064:aload           13
	//* 572 1066:ifnull          1089
			try
			{
				((aInputStream) (obj)).close();
	//  573 1069:aload           13
	//  574 1071:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
	//* 575 1074:goto            1089
			catch(IOException ioexception)
	//* 576 1077:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (ioexception)));
	//  577 1079:ldc1            #204 <String "ExifInterface">
	//  578 1081:ldc1            #206 <String "IOException occurred while closing InputStream">
	//  579 1083:aload           13
	//  580 1085:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
	//  581 1088:pop             
			}
		throw byteorder;
	//  582 1089:aload_1         
	//  583 1090:athrow          
	//* 584 1091:goto            986
_L33:
		i++;
	//  585 1094:iload_2         
	//  586 1095:iconst_1        
	//  587 1096:iadd            
	//  588 1097:istore_2        
		  goto _L45
	//* 589 1098:goto            697
_L40:
		i++;
	//  590 1101:iload_2         
	//  591 1102:iconst_1        
	//  592 1103:iadd            
	//  593 1104:istore_2        
		  goto _L46
	//* 594 1105:goto            763
	}

	public int size()
	{
		return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[format] * numberOfComponents;
	//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
	//    1    3:aload_0         
	//    2    4:getfield        #19  <Field int format>
	//    3    7:iaload          
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field int numberOfComponents>
	//    6   12:imul            
	//    7   13:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("(");
	//    4    8:aload_1         
	//    5    9:ldc1            #250 <String "(">
	//    6   11:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(ExifInterface.IFD_FORMAT_NAMES[format]);
	//    8   15:aload_1         
	//    9   16:getstatic       #254 <Field String[] ExifInterface.IFD_FORMAT_NAMES>
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field int format>
	//   12   23:aaload          
	//   13   24:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(", data length:");
	//   15   28:aload_1         
	//   16   29:ldc2            #256 <String ", data length:">
	//   17   32:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append(bytes.length);
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #23  <Field byte[] bytes>
	//   22   41:arraylength     
	//   23   42:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		stringbuilder.append(")");
	//   25   46:aload_1         
	//   26   47:ldc2            #258 <String ")">
	//   27   50:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		return stringbuilder.toString();
	//   29   54:aload_1         
	//   30   55:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   31   58:areturn         
	}

	public final byte bytes[];
	public final int format;
	public final int numberOfComponents;

	ExifInterface$ExifAttribute(int i, int j, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		format = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int format>
		numberOfComponents = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int numberOfComponents>
		bytes = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field byte[] bytes>
	//   11   19:return          
	}
}
