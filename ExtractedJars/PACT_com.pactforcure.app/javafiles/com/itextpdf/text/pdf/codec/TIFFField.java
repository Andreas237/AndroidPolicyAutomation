// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.Serializable;

public class TIFFField
	implements Comparable, Serializable
{

	TIFFField()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	public TIFFField(int i, int j, int k, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		tag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field int tag>
		type = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field int type>
		count = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #55  <Field int count>
		data = obj;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field Object data>
	//   14   25:return          
	}

	public int compareTo(TIFFField tifffield)
	{
		if(tifffield == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new IllegalArgumentException();
	//    2    4:new             #61  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #62  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		int i = tifffield.getTag();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #66  <Method int getTag()>
	//    8   16:istore_2        
		if(tag < i)
	//*   9   17:aload_0         
	//*  10   18:getfield        #51  <Field int tag>
	//*  11   21:iload_2         
	//*  12   22:icmpge          27
			return -1;
	//   13   25:iconst_m1       
	//   14   26:ireturn         
		return tag <= i ? 0 : 1;
	//   15   27:aload_0         
	//   16   28:getfield        #51  <Field int tag>
	//   17   31:iload_2         
	//   18   32:icmple          37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((TIFFField)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class TIFFField>
	//    3    5:invokevirtual   #69  <Method int compareTo(TIFFField)>
	//    4    8:ireturn         
	}

	public byte[] getAsBytes()
	{
		return (byte[])(byte[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #73  <Class byte[]>
	//    3    7:checkcast       #73  <Class byte[]>
	//    4   10:areturn         
	}

	public char[] getAsChars()
	{
		return (char[])(char[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #77  <Class char[]>
	//    3    7:checkcast       #77  <Class char[]>
	//    4   10:areturn         
	}

	public double getAsDouble(int i)
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int type>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 76
	//	               2 68
	//	               3 108
	//	               4 153
	//	               5 210
	//	               6 94
	//	               7 68
	//	               8 125
	//	               9 139
	//	               10 194
	//	               11 167
	//	               12 181
		case 2: // '\002'
		case 7: // '\007'
		default:
			throw new ClassCastException();
	//    3   68:new             #81  <Class ClassCastException>
	//    4   71:dup             
	//    5   72:invokespecial   #82  <Method void ClassCastException()>
	//    6   75:athrow          

		case 1: // '\001'
			return (double)(((byte[])(byte[])data)[i] & 0xff);
	//    7   76:aload_0         
	//    8   77:getfield        #57  <Field Object data>
	//    9   80:checkcast       #73  <Class byte[]>
	//   10   83:checkcast       #73  <Class byte[]>
	//   11   86:iload_1         
	//   12   87:baload          
	//   13   88:sipush          255
	//   14   91:iand            
	//   15   92:i2d             
	//   16   93:dreturn         

		case 6: // '\006'
			return (double)((byte[])(byte[])data)[i];
	//   17   94:aload_0         
	//   18   95:getfield        #57  <Field Object data>
	//   19   98:checkcast       #73  <Class byte[]>
	//   20  101:checkcast       #73  <Class byte[]>
	//   21  104:iload_1         
	//   22  105:baload          
	//   23  106:i2d             
	//   24  107:dreturn         

		case 3: // '\003'
			return (double)(((char[])(char[])data)[i] & 0xffff);
	//   25  108:aload_0         
	//   26  109:getfield        #57  <Field Object data>
	//   27  112:checkcast       #77  <Class char[]>
	//   28  115:checkcast       #77  <Class char[]>
	//   29  118:iload_1         
	//   30  119:caload          
	//   31  120:ldc1            #83  <Int 65535>
	//   32  122:iand            
	//   33  123:i2d             
	//   34  124:dreturn         

		case 8: // '\b'
			return (double)((short[])(short[])data)[i];
	//   35  125:aload_0         
	//   36  126:getfield        #57  <Field Object data>
	//   37  129:checkcast       #85  <Class short[]>
	//   38  132:checkcast       #85  <Class short[]>
	//   39  135:iload_1         
	//   40  136:saload          
	//   41  137:i2d             
	//   42  138:dreturn         

		case 9: // '\t'
			return (double)((int[])(int[])data)[i];
	//   43  139:aload_0         
	//   44  140:getfield        #57  <Field Object data>
	//   45  143:checkcast       #87  <Class int[]>
	//   46  146:checkcast       #87  <Class int[]>
	//   47  149:iload_1         
	//   48  150:iaload          
	//   49  151:i2d             
	//   50  152:dreturn         

		case 4: // '\004'
			return (double)((long[])(long[])data)[i];
	//   51  153:aload_0         
	//   52  154:getfield        #57  <Field Object data>
	//   53  157:checkcast       #89  <Class long[]>
	//   54  160:checkcast       #89  <Class long[]>
	//   55  163:iload_1         
	//   56  164:laload          
	//   57  165:l2d             
	//   58  166:dreturn         

		case 11: // '\013'
			return (double)((float[])(float[])data)[i];
	//   59  167:aload_0         
	//   60  168:getfield        #57  <Field Object data>
	//   61  171:checkcast       #91  <Class float[]>
	//   62  174:checkcast       #91  <Class float[]>
	//   63  177:iload_1         
	//   64  178:faload          
	//   65  179:f2d             
	//   66  180:dreturn         

		case 12: // '\f'
			return ((double[])(double[])data)[i];
	//   67  181:aload_0         
	//   68  182:getfield        #57  <Field Object data>
	//   69  185:checkcast       #93  <Class double[]>
	//   70  188:checkcast       #93  <Class double[]>
	//   71  191:iload_1         
	//   72  192:daload          
	//   73  193:dreturn         

		case 10: // '\n'
			int ai[] = getAsSRational(i);
	//   74  194:aload_0         
	//   75  195:iload_1         
	//   76  196:invokevirtual   #97  <Method int[] getAsSRational(int)>
	//   77  199:astore_2        
			return (double)ai[0] / (double)ai[1];
	//   78  200:aload_2         
	//   79  201:iconst_0        
	//   80  202:iaload          
	//   81  203:i2d             
	//   82  204:aload_2         
	//   83  205:iconst_1        
	//   84  206:iaload          
	//   85  207:i2d             
	//   86  208:ddiv            
	//   87  209:dreturn         

		case 5: // '\005'
			long al[] = getAsRational(i);
	//   88  210:aload_0         
	//   89  211:iload_1         
	//   90  212:invokevirtual   #101 <Method long[] getAsRational(int)>
	//   91  215:astore_2        
			return (double)al[0] / (double)al[1];
	//   92  216:aload_2         
	//   93  217:iconst_0        
	//   94  218:laload          
	//   95  219:l2d             
	//   96  220:aload_2         
	//   97  221:iconst_1        
	//   98  222:laload          
	//   99  223:l2d             
	//  100  224:ddiv            
	//  101  225:dreturn         
		}
	}

	public double[] getAsDoubles()
	{
		return (double[])(double[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #93  <Class double[]>
	//    3    7:checkcast       #93  <Class double[]>
	//    4   10:areturn         
	}

	public float getAsFloat(int i)
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int type>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 76
	//	               2 68
	//	               3 108
	//	               4 153
	//	               5 211
	//	               6 94
	//	               7 68
	//	               8 125
	//	               9 139
	//	               10 194
	//	               11 167
	//	               12 180
		case 2: // '\002'
		case 7: // '\007'
		default:
			throw new ClassCastException();
	//    3   68:new             #81  <Class ClassCastException>
	//    4   71:dup             
	//    5   72:invokespecial   #82  <Method void ClassCastException()>
	//    6   75:athrow          

		case 1: // '\001'
			return (float)(((byte[])(byte[])data)[i] & 0xff);
	//    7   76:aload_0         
	//    8   77:getfield        #57  <Field Object data>
	//    9   80:checkcast       #73  <Class byte[]>
	//   10   83:checkcast       #73  <Class byte[]>
	//   11   86:iload_1         
	//   12   87:baload          
	//   13   88:sipush          255
	//   14   91:iand            
	//   15   92:i2f             
	//   16   93:freturn         

		case 6: // '\006'
			return (float)((byte[])(byte[])data)[i];
	//   17   94:aload_0         
	//   18   95:getfield        #57  <Field Object data>
	//   19   98:checkcast       #73  <Class byte[]>
	//   20  101:checkcast       #73  <Class byte[]>
	//   21  104:iload_1         
	//   22  105:baload          
	//   23  106:i2f             
	//   24  107:freturn         

		case 3: // '\003'
			return (float)(((char[])(char[])data)[i] & 0xffff);
	//   25  108:aload_0         
	//   26  109:getfield        #57  <Field Object data>
	//   27  112:checkcast       #77  <Class char[]>
	//   28  115:checkcast       #77  <Class char[]>
	//   29  118:iload_1         
	//   30  119:caload          
	//   31  120:ldc1            #83  <Int 65535>
	//   32  122:iand            
	//   33  123:i2f             
	//   34  124:freturn         

		case 8: // '\b'
			return (float)((short[])(short[])data)[i];
	//   35  125:aload_0         
	//   36  126:getfield        #57  <Field Object data>
	//   37  129:checkcast       #85  <Class short[]>
	//   38  132:checkcast       #85  <Class short[]>
	//   39  135:iload_1         
	//   40  136:saload          
	//   41  137:i2f             
	//   42  138:freturn         

		case 9: // '\t'
			return (float)((int[])(int[])data)[i];
	//   43  139:aload_0         
	//   44  140:getfield        #57  <Field Object data>
	//   45  143:checkcast       #87  <Class int[]>
	//   46  146:checkcast       #87  <Class int[]>
	//   47  149:iload_1         
	//   48  150:iaload          
	//   49  151:i2f             
	//   50  152:freturn         

		case 4: // '\004'
			return (float)((long[])(long[])data)[i];
	//   51  153:aload_0         
	//   52  154:getfield        #57  <Field Object data>
	//   53  157:checkcast       #89  <Class long[]>
	//   54  160:checkcast       #89  <Class long[]>
	//   55  163:iload_1         
	//   56  164:laload          
	//   57  165:l2f             
	//   58  166:freturn         

		case 11: // '\013'
			return ((float[])(float[])data)[i];
	//   59  167:aload_0         
	//   60  168:getfield        #57  <Field Object data>
	//   61  171:checkcast       #91  <Class float[]>
	//   62  174:checkcast       #91  <Class float[]>
	//   63  177:iload_1         
	//   64  178:faload          
	//   65  179:freturn         

		case 12: // '\f'
			return (float)((double[])(double[])data)[i];
	//   66  180:aload_0         
	//   67  181:getfield        #57  <Field Object data>
	//   68  184:checkcast       #93  <Class double[]>
	//   69  187:checkcast       #93  <Class double[]>
	//   70  190:iload_1         
	//   71  191:daload          
	//   72  192:d2f             
	//   73  193:freturn         

		case 10: // '\n'
			int ai[] = getAsSRational(i);
	//   74  194:aload_0         
	//   75  195:iload_1         
	//   76  196:invokevirtual   #97  <Method int[] getAsSRational(int)>
	//   77  199:astore_2        
			return (float)((double)ai[0] / (double)ai[1]);
	//   78  200:aload_2         
	//   79  201:iconst_0        
	//   80  202:iaload          
	//   81  203:i2d             
	//   82  204:aload_2         
	//   83  205:iconst_1        
	//   84  206:iaload          
	//   85  207:i2d             
	//   86  208:ddiv            
	//   87  209:d2f             
	//   88  210:freturn         

		case 5: // '\005'
			long al[] = getAsRational(i);
	//   89  211:aload_0         
	//   90  212:iload_1         
	//   91  213:invokevirtual   #101 <Method long[] getAsRational(int)>
	//   92  216:astore_2        
			return (float)((double)al[0] / (double)al[1]);
	//   93  217:aload_2         
	//   94  218:iconst_0        
	//   95  219:laload          
	//   96  220:l2d             
	//   97  221:aload_2         
	//   98  222:iconst_1        
	//   99  223:laload          
	//  100  224:l2d             
	//  101  225:ddiv            
	//  102  226:d2f             
	//  103  227:freturn         
		}
	}

	public float[] getAsFloats()
	{
		return (float[])(float[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #91  <Class float[]>
	//    3    7:checkcast       #91  <Class float[]>
	//    4   10:areturn         
	}

	public int getAsInt(int i)
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int type>
		{
	//*   2    4:tableswitch     1 9: default 56
	//	               1 64
	//	               2 56
	//	               3 94
	//	               4 56
	//	               5 56
	//	               6 81
	//	               7 64
	//	               8 110
	//	               9 123
		case 2: // '\002'
		case 4: // '\004'
		case 5: // '\005'
		default:
			throw new ClassCastException();
	//    3   56:new             #81  <Class ClassCastException>
	//    4   59:dup             
	//    5   60:invokespecial   #82  <Method void ClassCastException()>
	//    6   63:athrow          

		case 1: // '\001'
		case 7: // '\007'
			return ((byte[])(byte[])data)[i] & 0xff;
	//    7   64:aload_0         
	//    8   65:getfield        #57  <Field Object data>
	//    9   68:checkcast       #73  <Class byte[]>
	//   10   71:checkcast       #73  <Class byte[]>
	//   11   74:iload_1         
	//   12   75:baload          
	//   13   76:sipush          255
	//   14   79:iand            
	//   15   80:ireturn         

		case 6: // '\006'
			return ((int) (((byte[])(byte[])data)[i]));
	//   16   81:aload_0         
	//   17   82:getfield        #57  <Field Object data>
	//   18   85:checkcast       #73  <Class byte[]>
	//   19   88:checkcast       #73  <Class byte[]>
	//   20   91:iload_1         
	//   21   92:baload          
	//   22   93:ireturn         

		case 3: // '\003'
			return ((char[])(char[])data)[i] & 0xffff;
	//   23   94:aload_0         
	//   24   95:getfield        #57  <Field Object data>
	//   25   98:checkcast       #77  <Class char[]>
	//   26  101:checkcast       #77  <Class char[]>
	//   27  104:iload_1         
	//   28  105:caload          
	//   29  106:ldc1            #83  <Int 65535>
	//   30  108:iand            
	//   31  109:ireturn         

		case 8: // '\b'
			return ((int) (((short[])(short[])data)[i]));
	//   32  110:aload_0         
	//   33  111:getfield        #57  <Field Object data>
	//   34  114:checkcast       #85  <Class short[]>
	//   35  117:checkcast       #85  <Class short[]>
	//   36  120:iload_1         
	//   37  121:saload          
	//   38  122:ireturn         

		case 9: // '\t'
			return ((int[])(int[])data)[i];
	//   39  123:aload_0         
	//   40  124:getfield        #57  <Field Object data>
	//   41  127:checkcast       #87  <Class int[]>
	//   42  130:checkcast       #87  <Class int[]>
	//   43  133:iload_1         
	//   44  134:iaload          
	//   45  135:ireturn         
		}
	}

	public int[] getAsInts()
	{
		return (int[])(int[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #87  <Class int[]>
	//    3    7:checkcast       #87  <Class int[]>
	//    4   10:areturn         
	}

	public long getAsLong(int i)
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int type>
		{
	//*   2    4:tableswitch     1 9: default 56
	//	               1 64
	//	               2 56
	//	               3 96
	//	               4 141
	//	               5 56
	//	               6 82
	//	               7 64
	//	               8 113
	//	               9 127
		case 2: // '\002'
		case 5: // '\005'
		default:
			throw new ClassCastException();
	//    3   56:new             #81  <Class ClassCastException>
	//    4   59:dup             
	//    5   60:invokespecial   #82  <Method void ClassCastException()>
	//    6   63:athrow          

		case 1: // '\001'
		case 7: // '\007'
			return (long)(((byte[])(byte[])data)[i] & 0xff);
	//    7   64:aload_0         
	//    8   65:getfield        #57  <Field Object data>
	//    9   68:checkcast       #73  <Class byte[]>
	//   10   71:checkcast       #73  <Class byte[]>
	//   11   74:iload_1         
	//   12   75:baload          
	//   13   76:sipush          255
	//   14   79:iand            
	//   15   80:i2l             
	//   16   81:lreturn         

		case 6: // '\006'
			return (long)((byte[])(byte[])data)[i];
	//   17   82:aload_0         
	//   18   83:getfield        #57  <Field Object data>
	//   19   86:checkcast       #73  <Class byte[]>
	//   20   89:checkcast       #73  <Class byte[]>
	//   21   92:iload_1         
	//   22   93:baload          
	//   23   94:i2l             
	//   24   95:lreturn         

		case 3: // '\003'
			return (long)(((char[])(char[])data)[i] & 0xffff);
	//   25   96:aload_0         
	//   26   97:getfield        #57  <Field Object data>
	//   27  100:checkcast       #77  <Class char[]>
	//   28  103:checkcast       #77  <Class char[]>
	//   29  106:iload_1         
	//   30  107:caload          
	//   31  108:ldc1            #83  <Int 65535>
	//   32  110:iand            
	//   33  111:i2l             
	//   34  112:lreturn         

		case 8: // '\b'
			return (long)((short[])(short[])data)[i];
	//   35  113:aload_0         
	//   36  114:getfield        #57  <Field Object data>
	//   37  117:checkcast       #85  <Class short[]>
	//   38  120:checkcast       #85  <Class short[]>
	//   39  123:iload_1         
	//   40  124:saload          
	//   41  125:i2l             
	//   42  126:lreturn         

		case 9: // '\t'
			return (long)((int[])(int[])data)[i];
	//   43  127:aload_0         
	//   44  128:getfield        #57  <Field Object data>
	//   45  131:checkcast       #87  <Class int[]>
	//   46  134:checkcast       #87  <Class int[]>
	//   47  137:iload_1         
	//   48  138:iaload          
	//   49  139:i2l             
	//   50  140:lreturn         

		case 4: // '\004'
			return ((long[])(long[])data)[i];
	//   51  141:aload_0         
	//   52  142:getfield        #57  <Field Object data>
	//   53  145:checkcast       #89  <Class long[]>
	//   54  148:checkcast       #89  <Class long[]>
	//   55  151:iload_1         
	//   56  152:laload          
	//   57  153:lreturn         
		}
	}

	public long[] getAsLongs()
	{
		return (long[])(long[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #89  <Class long[]>
	//    3    7:checkcast       #89  <Class long[]>
	//    4   10:areturn         
	}

	public long[] getAsRational(int i)
	{
		if(type == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int type>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          13
			return getAsLongs();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #117 <Method long[] getAsLongs()>
	//    6   12:areturn         
		else
			return ((long[][])(long[][])data)[i];
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field Object data>
	//    9   17:checkcast       #119 <Class long[][]>
	//   10   20:checkcast       #119 <Class long[][]>
	//   11   23:iload_1         
	//   12   24:aaload          
	//   13   25:areturn         
	}

	public long[][] getAsRationals()
	{
		return (long[][])(long[][])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #119 <Class long[][]>
	//    3    7:checkcast       #119 <Class long[][]>
	//    4   10:areturn         
	}

	public int[] getAsSRational(int i)
	{
		return ((int[][])(int[][])data)[i];
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #123 <Class int[][]>
	//    3    7:checkcast       #123 <Class int[][]>
	//    4   10:iload_1         
	//    5   11:aaload          
	//    6   12:areturn         
	}

	public int[][] getAsSRationals()
	{
		return (int[][])(int[][])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #123 <Class int[][]>
	//    3    7:checkcast       #123 <Class int[][]>
	//    4   10:areturn         
	}

	public short[] getAsShorts()
	{
		return (short[])(short[])data;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #85  <Class short[]>
	//    3    7:checkcast       #85  <Class short[]>
	//    4   10:areturn         
	}

	public String getAsString(int i)
	{
		return ((String[])(String[])data)[i];
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object data>
	//    2    4:checkcast       #131 <Class String[]>
	//    3    7:checkcast       #131 <Class String[]>
	//    4   10:iload_1         
	//    5   11:aaload          
	//    6   12:areturn         
	}

	public int getCount()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int count>
	//    2    4:ireturn         
	}

	public int getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int tag>
	//    2    4:ireturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int type>
	//    2    4:ireturn         
	}

	public static final int TIFF_ASCII = 2;
	public static final int TIFF_BYTE = 1;
	public static final int TIFF_DOUBLE = 12;
	public static final int TIFF_FLOAT = 11;
	public static final int TIFF_LONG = 4;
	public static final int TIFF_RATIONAL = 5;
	public static final int TIFF_SBYTE = 6;
	public static final int TIFF_SHORT = 3;
	public static final int TIFF_SLONG = 9;
	public static final int TIFF_SRATIONAL = 10;
	public static final int TIFF_SSHORT = 8;
	public static final int TIFF_UNDEFINED = 7;
	private static final long serialVersionUID = 0x2d34e31aL;
	int count;
	Object data;
	int tag;
	int type;
}
