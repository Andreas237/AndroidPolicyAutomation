// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.hsr.geohash;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.hsr.geohash:
//			WGS84Point, BoundingBox

public final class GeoHash
	implements Serializable, Comparable
{

	protected GeoHash()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void Object()>
		bits = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #93  <Field long bits>
		significantBits = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #95  <Field byte significantBits>
	//    8   14:return          
	}

	private GeoHash(double d, double d1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void Object()>
		bits = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #93  <Field long bits>
		significantBits = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #95  <Field byte significantBits>
		point = new WGS84Point(d, d1);
	//    8   14:aload_0         
	//    9   15:new             #98  <Class WGS84Point>
	//   10   18:dup             
	//   11   19:dload_1         
	//   12   20:dload_3         
	//   13   21:invokespecial   #101 <Method void WGS84Point(double, double)>
	//   14   24:putfield        #103 <Field WGS84Point point>
		int j = Math.min(i, 64);
	//   15   27:iload           5
	//   16   29:bipush          64
	//   17   31:invokestatic    #109 <Method int Math.min(int, int)>
	//   18   34:istore          6
		double ad[] = new double[2];
	//   19   36:iconst_2        
	//   20   37:newarray        double[]
	//   21   39:astore          7
		double[] _tmp = ad;
	//   22   41:aload           7
	//   23   43:dup             
	//   24   44:iconst_0        
	//   25   45:ldc2w           #110 <Double -90D>
	//   26   48:dastore         
	//   27   49:dup             
	//   28   50:iconst_1        
	//   29   51:ldc2w           #112 <Double 90D>
	//   30   54:dastore         
	//   31   55:pop             
		ad[0] = -90D;
		ad[1] = 90D;
		double ad1[] = new double[2];
	//   32   56:iconst_2        
	//   33   57:newarray        double[]
	//   34   59:astore          8
		double[] _tmp1 = ad1;
	//   35   61:aload           8
	//   36   63:dup             
	//   37   64:iconst_0        
	//   38   65:ldc2w           #114 <Double -180D>
	//   39   68:dastore         
	//   40   69:dup             
	//   41   70:iconst_1        
	//   42   71:ldc2w           #116 <Double 180D>
	//   43   74:dastore         
	//   44   75:pop             
		ad1[0] = -180D;
		ad1[1] = 180D;
		for(i = 1; significantBits < j; i ^= 1)
	//*  45   76:iconst_1        
	//*  46   77:istore          5
	//*  47   79:aload_0         
	//*  48   80:getfield        #95  <Field byte significantBits>
	//*  49   83:iload           6
	//*  50   85:icmpge          119
			if(i != 0)
	//*  51   88:iload           5
	//*  52   90:ifeq            103
				divideRangeEncode(d1, ad1);
	//   53   93:aload_0         
	//   54   94:dload_3         
	//   55   95:aload           8
	//   56   97:invokespecial   #121 <Method void divideRangeEncode(double, double[])>
			else
	//*  57  100:goto            110
				divideRangeEncode(d, ad);
	//   58  103:aload_0         
	//   59  104:dload_1         
	//   60  105:aload           7
	//   61  107:invokespecial   #121 <Method void divideRangeEncode(double, double[])>

	//   62  110:iload           5
	//   63  112:iconst_1        
	//   64  113:ixor            
	//   65  114:istore          5
	//*  66  116:goto            79
		setBoundingBox(this, ad, ad1);
	//   67  119:aload_0         
	//   68  120:aload           7
	//   69  122:aload           8
	//   70  124:invokestatic    #125 <Method void setBoundingBox(GeoHash, double[], double[])>
		bits = bits << 64 - j;
	//   71  127:aload_0         
	//   72  128:aload_0         
	//   73  129:getfield        #93  <Field long bits>
	//   74  132:bipush          64
	//   75  134:iload           6
	//   76  136:isub            
	//   77  137:lshl            
	//   78  138:putfield        #93  <Field long bits>
	//   79  141:return          
	}

	private void divideRangeEncode(double d, double ad[])
	{
		double d1 = (ad[0] + ad[1]) / 2D;
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:daload          
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:daload          
	//    6    6:dadd            
	//    7    7:ldc2w           #126 <Double 2D>
	//    8   10:ddiv            
	//    9   11:dstore          4
		if(d >= d1)
	//*  10   13:dload_1         
	//*  11   14:dload           4
	//*  12   16:dcmpl           
	//*  13   17:iflt            30
		{
			addOnBitToEnd();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #130 <Method void addOnBitToEnd()>
			ad[0] = d1;
	//   16   24:aload_3         
	//   17   25:iconst_0        
	//   18   26:dload           4
	//   19   28:dastore         
			return;
	//   20   29:return          
		} else
		{
			addOffBitToEnd();
	//   21   30:aload_0         
	//   22   31:invokevirtual   #133 <Method void addOffBitToEnd()>
			ad[1] = d1;
	//   23   34:aload_3         
	//   24   35:iconst_1        
	//   25   36:dload           4
	//   26   38:dastore         
			return;
	//   27   39:return          
		}
	}

	private static void setBoundingBox(GeoHash geohash, double ad[], double ad1[])
	{
		geohash.boundingBox = new BoundingBox(new WGS84Point(ad[0], ad1[0]), new WGS84Point(ad[1], ad1[1]));
	//    0    0:aload_0         
	//    1    1:new             #135 <Class BoundingBox>
	//    2    4:dup             
	//    3    5:new             #98  <Class WGS84Point>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:daload          
	//    8   12:aload_2         
	//    9   13:iconst_0        
	//   10   14:daload          
	//   11   15:invokespecial   #101 <Method void WGS84Point(double, double)>
	//   12   18:new             #98  <Class WGS84Point>
	//   13   21:dup             
	//   14   22:aload_1         
	//   15   23:iconst_1        
	//   16   24:daload          
	//   17   25:aload_2         
	//   18   26:iconst_1        
	//   19   27:daload          
	//   20   28:invokespecial   #101 <Method void WGS84Point(double, double)>
	//   21   31:invokespecial   #138 <Method void BoundingBox(WGS84Point, WGS84Point)>
	//   22   34:putfield        #140 <Field BoundingBox boundingBox>
	//   23   37:return          
	}

	public static GeoHash withCharacterPrecision(double d, double d1, int i)
	{
		if(i <= 12)
	//*   0    0:iload           4
	//*   1    2:bipush          12
	//*   2    4:icmpgt          39
		{
			i *= 5;
	//    3    7:iload           4
	//    4    9:iconst_5        
	//    5   10:imul            
	//    6   11:istore          4
			if(i > 60)
	//*   7   13:iload           4
	//*   8   15:bipush          60
	//*   9   17:icmpgt          23
	//*  10   20:goto            27
				i = 60;
	//   11   23:bipush          60
	//   12   25:istore          4
			return new GeoHash(d, d1, i);
	//   13   27:new             #2   <Class GeoHash>
	//   14   30:dup             
	//   15   31:dload_0         
	//   16   32:dload_2         
	//   17   33:iload           4
	//   18   35:invokespecial   #144 <Method void GeoHash(double, double, int)>
	//   19   38:areturn         
		} else
		{
			throw new IllegalArgumentException("A geohash can only be 12 character long.");
	//   20   39:new             #146 <Class IllegalArgumentException>
	//   21   42:dup             
	//   22   43:ldc1            #148 <String "A geohash can only be 12 character long.">
	//   23   45:invokespecial   #151 <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		}
	}

	protected final void addOffBitToEnd()
	{
		significantBits = (byte)(significantBits + 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field byte significantBits>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:int2byte        
	//    6    8:putfield        #95  <Field byte significantBits>
		bits = bits << 1;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #93  <Field long bits>
	//   10   16:iconst_1        
	//   11   17:lshl            
	//   12   18:putfield        #93  <Field long bits>
	//   13   21:return          
	}

	protected final void addOnBitToEnd()
	{
		significantBits = (byte)(significantBits + 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field byte significantBits>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:int2byte        
	//    6    8:putfield        #95  <Field byte significantBits>
		bits = bits << 1;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #93  <Field long bits>
	//   10   16:iconst_1        
	//   11   17:lshl            
	//   12   18:putfield        #93  <Field long bits>
		bits = bits | 1L;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #93  <Field long bits>
	//   16   26:lconst_1        
	//   17   27:lor             
	//   18   28:putfield        #93  <Field long bits>
	//   19   31:return          
	}

	public int compareTo(GeoHash geohash)
	{
		int i = Long.compare(bits ^ 0x0L, 0x0L ^ geohash.bits);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field long bits>
	//    2    4:ldc2w           #154 <Long 0x0L>
	//    3    7:lxor            
	//    4    8:ldc2w           #154 <Long 0x0L>
	//    5   11:aload_1         
	//    6   12:getfield        #93  <Field long bits>
	//    7   15:lxor            
	//    8   16:invokestatic    #161 <Method int Long.compare(long, long)>
	//    9   19:istore_2        
		if(i != 0)
	//*  10   20:iload_2         
	//*  11   21:ifeq            26
			return i;
	//   12   24:iload_2         
	//   13   25:ireturn         
		else
			return Integer.compare(((int) (significantBits)), ((int) (geohash.significantBits)));
	//   14   26:aload_0         
	//   15   27:getfield        #95  <Field byte significantBits>
	//   16   30:aload_1         
	//   17   31:getfield        #95  <Field byte significantBits>
	//   18   34:invokestatic    #163 <Method int Integer.compare(int, int)>
	//   19   37:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((GeoHash)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class GeoHash>
	//    3    5:invokevirtual   #166 <Method int compareTo(GeoHash)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj instanceof GeoHash)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class GeoHash>
	//*   7   11:ifeq            44
		{
			obj = ((Object) ((GeoHash)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class GeoHash>
	//   10   18:astore_1        
			if(((GeoHash) (obj)).significantBits == significantBits && ((GeoHash) (obj)).bits == bits)
	//*  11   19:aload_1         
	//*  12   20:getfield        #95  <Field byte significantBits>
	//*  13   23:aload_0         
	//*  14   24:getfield        #95  <Field byte significantBits>
	//*  15   27:icmpne          44
	//*  16   30:aload_1         
	//*  17   31:getfield        #93  <Field long bits>
	//*  18   34:aload_0         
	//*  19   35:getfield        #93  <Field long bits>
	//*  20   38:lcmp            
	//*  21   39:ifne            44
				return true;
	//   22   42:iconst_1        
	//   23   43:ireturn         
		}
		return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
	}

	public int hashCode()
	{
		long l = bits;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field long bits>
	//    2    4:lstore_1        
		return (527 + (int)(l ^ l >>> 32)) * 31 + significantBits;
	//    3    5:sipush          527
	//    4    8:lload_1         
	//    5    9:lload_1         
	//    6   10:bipush          32
	//    7   12:lushr           
	//    8   13:lxor            
	//    9   14:l2i             
	//   10   15:iadd            
	//   11   16:bipush          31
	//   12   18:imul            
	//   13   19:aload_0         
	//   14   20:getfield        #95  <Field byte significantBits>
	//   15   23:iadd            
	//   16   24:ireturn         
	}

	public String toBase32()
	{
		if(significantBits % 5 == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field byte significantBits>
	//*   2    4:iconst_5        
	//*   3    5:irem            
	//*   4    6:ifne            86
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #174 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #175 <Method void StringBuilder()>
	//    8   16:astore          6
			long l = bits;
	//    9   18:aload_0         
	//   10   19:getfield        #93  <Field long bits>
	//   11   22:lstore          4
			int j = (int)Math.ceil((double)significantBits / 5D);
	//   12   24:aload_0         
	//   13   25:getfield        #95  <Field byte significantBits>
	//   14   28:i2d             
	//   15   29:ldc2w           #176 <Double 5D>
	//   16   32:ddiv            
	//   17   33:invokestatic    #181 <Method double Math.ceil(double)>
	//   18   36:d2i             
	//   19   37:istore_2        
			for(int i = 0; i < j; i++)
	//*  20   38:iconst_0        
	//*  21   39:istore_1        
	//*  22   40:iload_1         
	//*  23   41:iload_2         
	//*  24   42:icmpge          80
			{
				int k = (int)((l & 0x0L) >>> 59);
	//   25   45:lload           4
	//   26   47:ldc2w           #182 <Long 0x0L>
	//   27   50:land            
	//   28   51:bipush          59
	//   29   53:lushr           
	//   30   54:l2i             
	//   31   55:istore_3        
				stringbuilder.append(base32[k]);
	//   32   56:aload           6
	//   33   58:getstatic       #65  <Field char[] base32>
	//   34   61:iload_3         
	//   35   62:caload          
	//   36   63:invokevirtual   #187 <Method StringBuilder StringBuilder.append(char)>
	//   37   66:pop             
				l <<= 5;
	//   38   67:lload           4
	//   39   69:iconst_5        
	//   40   70:lshl            
	//   41   71:lstore          4
			}

	//   42   73:iload_1         
	//   43   74:iconst_1        
	//   44   75:iadd            
	//   45   76:istore_1        
	//*  46   77:goto            40
			return stringbuilder.toString();
	//   47   80:aload           6
	//   48   82:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   49   85:areturn         
		} else
		{
			throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
	//   50   86:new             #192 <Class IllegalStateException>
	//   51   89:dup             
	//   52   90:ldc1            #194 <String "Cannot convert a geohash to base32 if the precision is not a multiple of 5.">
	//   53   92:invokespecial   #195 <Method void IllegalStateException(String)>
	//   54   95:athrow          
		}
	}

	public String toBinaryString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #174 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void StringBuilder()>
	//    3    7:astore          4
		long l = bits;
	//    4    9:aload_0         
	//    5   10:getfield        #93  <Field long bits>
	//    6   13:lstore_2        
		for(int i = 0; i < significantBits; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_1        
	//*   9   16:iload_1         
	//*  10   17:aload_0         
	//*  11   18:getfield        #95  <Field byte significantBits>
	//*  12   21:icmpge          66
		{
			if((l & 0x0L) == 0x0L)
	//*  13   24:lload_2         
	//*  14   25:ldc2w           #154 <Long 0x0L>
	//*  15   28:land            
	//*  16   29:ldc2w           #154 <Long 0x0L>
	//*  17   32:lcmp            
	//*  18   33:ifne            47
				stringbuilder.append('1');
	//   19   36:aload           4
	//   20   38:bipush          49
	//   21   40:invokevirtual   #187 <Method StringBuilder StringBuilder.append(char)>
	//   22   43:pop             
			else
	//*  23   44:goto            55
				stringbuilder.append('0');
	//   24   47:aload           4
	//   25   49:bipush          48
	//   26   51:invokevirtual   #187 <Method StringBuilder StringBuilder.append(char)>
	//   27   54:pop             
			l <<= 1;
	//   28   55:lload_2         
	//   29   56:iconst_1        
	//   30   57:lshl            
	//   31   58:lstore_2        
		}

	//   32   59:iload_1         
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore_1        
	//*  36   63:goto            16
		return stringbuilder.toString();
	//   37   66:aload           4
	//   38   68:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   39   71:areturn         
	}

	public String toString()
	{
		if(significantBits % 5 == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field byte significantBits>
	//*   2    4:iconst_5        
	//*   3    5:irem            
	//*   4    6:ifne            43
			return String.format("%s -> %s -> %s", new Object[] {
				Long.toBinaryString(bits), boundingBox, toBase32()
			});
	//    5    9:ldc1            #198 <String "%s -> %s -> %s">
	//    6   11:iconst_3        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_0         
	//   11   18:getfield        #93  <Field long bits>
	//   12   21:invokestatic    #201 <Method String Long.toBinaryString(long)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_1        
	//   16   27:aload_0         
	//   17   28:getfield        #140 <Field BoundingBox boundingBox>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_2        
	//   21   34:aload_0         
	//   22   35:invokevirtual   #203 <Method String toBase32()>
	//   23   38:aastore         
	//   24   39:invokestatic    #209 <Method String String.format(String, Object[])>
	//   25   42:areturn         
		else
			return String.format("%s -> %s, bits: %d", new Object[] {
				Long.toBinaryString(bits), boundingBox, Byte.valueOf(significantBits)
			});
	//   26   43:ldc1            #211 <String "%s -> %s, bits: %d">
	//   27   45:iconst_3        
	//   28   46:anewarray       Object[]
	//   29   49:dup             
	//   30   50:iconst_0        
	//   31   51:aload_0         
	//   32   52:getfield        #93  <Field long bits>
	//   33   55:invokestatic    #201 <Method String Long.toBinaryString(long)>
	//   34   58:aastore         
	//   35   59:dup             
	//   36   60:iconst_1        
	//   37   61:aload_0         
	//   38   62:getfield        #140 <Field BoundingBox boundingBox>
	//   39   65:aastore         
	//   40   66:dup             
	//   41   67:iconst_2        
	//   42   68:aload_0         
	//   43   69:getfield        #95  <Field byte significantBits>
	//   44   72:invokestatic    #216 <Method Byte Byte.valueOf(byte)>
	//   45   75:aastore         
	//   46   76:invokestatic    #209 <Method String String.format(String, Object[])>
	//   47   79:areturn         
	}

	private static final int BITS[] = {
		16, 8, 4, 2, 1
	};
	private static final char base32[] = {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 
		'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
		'y', 'z'
	};
	private static final Map decodeMap;
	private static final long serialVersionUID = 0xf2fac371L;
	protected long bits;
	private BoundingBox boundingBox;
	private WGS84Point point;
	protected byte significantBits;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:bipush          16
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:bipush          8
	//    9   12:iastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:iconst_4        
	//   13   16:iastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:iconst_2        
	//   17   20:iastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:iconst_1        
	//   21   24:iastore         
	//   22   25:putstatic       #31  <Field int[] BITS>
	//   23   28:bipush          32
	//   24   30:newarray        char[]
	//   25   32:dup             
	//   26   33:iconst_0        
	//   27   34:ldc1            #32  <Int 48>
	//   28   36:castore         
	//   29   37:dup             
	//   30   38:iconst_1        
	//   31   39:ldc1            #33  <Int 49>
	//   32   41:castore         
	//   33   42:dup             
	//   34   43:iconst_2        
	//   35   44:ldc1            #34  <Int 50>
	//   36   46:castore         
	//   37   47:dup             
	//   38   48:iconst_3        
	//   39   49:ldc1            #35  <Int 51>
	//   40   51:castore         
	//   41   52:dup             
	//   42   53:iconst_4        
	//   43   54:ldc1            #36  <Int 52>
	//   44   56:castore         
	//   45   57:dup             
	//   46   58:iconst_5        
	//   47   59:ldc1            #37  <Int 53>
	//   48   61:castore         
	//   49   62:dup             
	//   50   63:bipush          6
	//   51   65:ldc1            #38  <Int 54>
	//   52   67:castore         
	//   53   68:dup             
	//   54   69:bipush          7
	//   55   71:ldc1            #39  <Int 55>
	//   56   73:castore         
	//   57   74:dup             
	//   58   75:bipush          8
	//   59   77:ldc1            #40  <Int 56>
	//   60   79:castore         
	//   61   80:dup             
	//   62   81:bipush          9
	//   63   83:ldc1            #41  <Int 57>
	//   64   85:castore         
	//   65   86:dup             
	//   66   87:bipush          10
	//   67   89:ldc1            #42  <Int 98>
	//   68   91:castore         
	//   69   92:dup             
	//   70   93:bipush          11
	//   71   95:ldc1            #43  <Int 99>
	//   72   97:castore         
	//   73   98:dup             
	//   74   99:bipush          12
	//   75  101:ldc1            #44  <Int 100>
	//   76  103:castore         
	//   77  104:dup             
	//   78  105:bipush          13
	//   79  107:ldc1            #45  <Int 101>
	//   80  109:castore         
	//   81  110:dup             
	//   82  111:bipush          14
	//   83  113:ldc1            #46  <Int 102>
	//   84  115:castore         
	//   85  116:dup             
	//   86  117:bipush          15
	//   87  119:ldc1            #47  <Int 103>
	//   88  121:castore         
	//   89  122:dup             
	//   90  123:bipush          16
	//   91  125:ldc1            #48  <Int 104>
	//   92  127:castore         
	//   93  128:dup             
	//   94  129:bipush          17
	//   95  131:ldc1            #49  <Int 106>
	//   96  133:castore         
	//   97  134:dup             
	//   98  135:bipush          18
	//   99  137:ldc1            #50  <Int 107>
	//  100  139:castore         
	//  101  140:dup             
	//  102  141:bipush          19
	//  103  143:ldc1            #51  <Int 109>
	//  104  145:castore         
	//  105  146:dup             
	//  106  147:bipush          20
	//  107  149:ldc1            #52  <Int 110>
	//  108  151:castore         
	//  109  152:dup             
	//  110  153:bipush          21
	//  111  155:ldc1            #53  <Int 112>
	//  112  157:castore         
	//  113  158:dup             
	//  114  159:bipush          22
	//  115  161:ldc1            #54  <Int 113>
	//  116  163:castore         
	//  117  164:dup             
	//  118  165:bipush          23
	//  119  167:ldc1            #55  <Int 114>
	//  120  169:castore         
	//  121  170:dup             
	//  122  171:bipush          24
	//  123  173:ldc1            #56  <Int 115>
	//  124  175:castore         
	//  125  176:dup             
	//  126  177:bipush          25
	//  127  179:ldc1            #57  <Int 116>
	//  128  181:castore         
	//  129  182:dup             
	//  130  183:bipush          26
	//  131  185:ldc1            #58  <Int 117>
	//  132  187:castore         
	//  133  188:dup             
	//  134  189:bipush          27
	//  135  191:ldc1            #59  <Int 118>
	//  136  193:castore         
	//  137  194:dup             
	//  138  195:bipush          28
	//  139  197:ldc1            #60  <Int 119>
	//  140  199:castore         
	//  141  200:dup             
	//  142  201:bipush          29
	//  143  203:ldc1            #61  <Int 120>
	//  144  205:castore         
	//  145  206:dup             
	//  146  207:bipush          30
	//  147  209:ldc1            #62  <Int 121>
	//  148  211:castore         
	//  149  212:dup             
	//  150  213:bipush          31
	//  151  215:ldc1            #63  <Int 122>
	//  152  217:castore         
	//  153  218:putstatic       #65  <Field char[] base32>
		decodeMap = ((Map) (new HashMap()));
	//  154  221:new             #67  <Class HashMap>
	//  155  224:dup             
	//  156  225:invokespecial   #70  <Method void HashMap()>
	//  157  228:putstatic       #72  <Field Map decodeMap>
		int j = base32.length;
	//  158  231:getstatic       #65  <Field char[] base32>
	//  159  234:arraylength     
	//  160  235:istore_1        
		for(int i = 0; i < j; i++)
	//* 161  236:iconst_0        
	//* 162  237:istore_0        
	//* 163  238:iload_0         
	//* 164  239:iload_1         
	//* 165  240:icmpge          271
			decodeMap.put(((Object) (Character.valueOf(base32[i]))), ((Object) (Integer.valueOf(i))));
	//  166  243:getstatic       #72  <Field Map decodeMap>
	//  167  246:getstatic       #65  <Field char[] base32>
	//  168  249:iload_0         
	//  169  250:caload          
	//  170  251:invokestatic    #78  <Method Character Character.valueOf(char)>
	//  171  254:iload_0         
	//  172  255:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//  173  258:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  174  263:pop             

	//  175  264:iload_0         
	//  176  265:iconst_1        
	//  177  266:iadd            
	//  178  267:istore_0        
	//* 179  268:goto            238
	//* 180  271:return          
	}
}
