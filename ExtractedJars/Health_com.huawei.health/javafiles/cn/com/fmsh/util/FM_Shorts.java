// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;


public class FM_Shorts
{

	public FM_Shorts()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		data = new short[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        short[]
	//    5    8:putfield        #12  <Field short[] data>
	//    6   11:return          
	}

	public static short[] copyOf(short aword0[], int i)
	{
		if(aword0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException(" original Arrays is null");
	//    2    4:new             #17  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #19  <String " original Arrays is null">
	//    5   10:invokespecial   #22  <Method void NullPointerException(String)>
	//    6   13:athrow          
		short aword1[] = new short[i];
	//    7   14:iload_1         
	//    8   15:newarray        short[]
	//    9   17:astore_3        
		if(aword0.length < i)
	//*  10   18:aload_0         
	//*  11   19:arraylength     
	//*  12   20:iload_1         
	//*  13   21:icmpge          47
		{
			for(i = 0; i < aword0.length; i++)
	//*  14   24:iconst_0        
	//*  15   25:istore_1        
	//*  16   26:goto            39
				aword1[i] = aword0[i];
	//   17   29:aload_3         
	//   18   30:iload_1         
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:saload          
	//   22   34:sastore         

	//   23   35:iload_1         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:istore_1        
	//   27   39:iload_1         
	//   28   40:aload_0         
	//   29   41:arraylength     
	//   30   42:icmplt          29
			return aword1;
	//   31   45:aload_3         
	//   32   46:areturn         
		}
		for(int j = 0; j < i; j++)
	//*  33   47:iconst_0        
	//*  34   48:istore_2        
	//*  35   49:goto            62
			aword1[j] = aword0[j];
	//   36   52:aload_3         
	//   37   53:iload_2         
	//   38   54:aload_0         
	//   39   55:iload_2         
	//   40   56:saload          
	//   41   57:sastore         

	//   42   58:iload_2         
	//   43   59:iconst_1        
	//   44   60:iadd            
	//   45   61:istore_2        
	//   46   62:iload_2         
	//   47   63:iload_1         
	//   48   64:icmplt          52
		return aword1;
	//   49   67:aload_3         
	//   50   68:areturn         
	}

	public static short[] copyOfRange(short aword0[], int i, int j)
	{
		if(aword0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException(" original Arrays is null");
	//    2    4:new             #17  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #19  <String " original Arrays is null">
	//    5   10:invokespecial   #22  <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(j - i <= 0)
	//*   7   14:iload_2         
	//*   8   15:iload_1         
	//*   9   16:isub            
	//*  10   17:ifgt            58
			throw new IllegalArgumentException((new StringBuilder(" from[")).append(i).append("]>to[").append(j).append("]").toString());
	//   11   20:new             #26  <Class IllegalArgumentException>
	//   12   23:dup             
	//   13   24:new             #28  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:ldc1            #30  <String " from[">
	//   16   30:invokespecial   #31  <Method void StringBuilder(String)>
	//   17   33:iload_1         
	//   18   34:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   19   37:ldc1            #37  <String "]>to[">
	//   20   39:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:iload_2         
	//   22   43:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   23   46:ldc1            #42  <String "]">
	//   24   48:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   26   54:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   27   57:athrow          
		if(aword0.length < i)
	//*  28   58:aload_0         
	//*  29   59:arraylength     
	//*  30   60:iload_1         
	//*  31   61:icmpge          103
			throw new IllegalArgumentException((new StringBuilder(" original.length[")).append(aword0.length).append("]<to[").append(i).append("]").toString());
	//   32   64:new             #26  <Class IllegalArgumentException>
	//   33   67:dup             
	//   34   68:new             #28  <Class StringBuilder>
	//   35   71:dup             
	//   36   72:ldc1            #49  <String " original.length[">
	//   37   74:invokespecial   #31  <Method void StringBuilder(String)>
	//   38   77:aload_0         
	//   39   78:arraylength     
	//   40   79:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   41   82:ldc1            #51  <String "]<to[">
	//   42   84:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   43   87:iload_1         
	//   44   88:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   45   91:ldc1            #42  <String "]">
	//   46   93:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   47   96:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   48   99:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   49  102:athrow          
		if(aword0.length < j)
	//*  50  103:aload_0         
	//*  51  104:arraylength     
	//*  52  105:iload_2         
	//*  53  106:icmpge          148
			throw new IllegalArgumentException((new StringBuilder(" original.length[")).append(aword0.length).append("]<to[").append(j).append("]").toString());
	//   54  109:new             #26  <Class IllegalArgumentException>
	//   55  112:dup             
	//   56  113:new             #28  <Class StringBuilder>
	//   57  116:dup             
	//   58  117:ldc1            #49  <String " original.length[">
	//   59  119:invokespecial   #31  <Method void StringBuilder(String)>
	//   60  122:aload_0         
	//   61  123:arraylength     
	//   62  124:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   63  127:ldc1            #51  <String "]<to[">
	//   64  129:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   65  132:iload_2         
	//   66  133:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   67  136:ldc1            #42  <String "]">
	//   68  138:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   69  141:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   70  144:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   71  147:athrow          
		int k = j - i;
	//   72  148:iload_2         
	//   73  149:iload_1         
	//   74  150:isub            
	//   75  151:istore_3        
		short aword1[] = new short[k];
	//   76  152:iload_3         
	//   77  153:newarray        short[]
	//   78  155:astore          4
		for(j = 0; j < k; j++)
	//*  79  157:iconst_0        
	//*  80  158:istore_2        
	//*  81  159:goto            175
			aword1[j] = aword0[j + i];
	//   82  162:aload           4
	//   83  164:iload_2         
	//   84  165:aload_0         
	//   85  166:iload_2         
	//   86  167:iload_1         
	//   87  168:iadd            
	//   88  169:saload          
	//   89  170:sastore         

	//   90  171:iload_2         
	//   91  172:iconst_1        
	//   92  173:iadd            
	//   93  174:istore_2        
	//   94  175:iload_2         
	//   95  176:iload_3         
	//   96  177:icmplt          162
		return aword1;
	//   97  180:aload           4
	//   98  182:areturn         
	}

	public static short[] join(short aword0[], short aword1[])
	{
		if(aword0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException(" data1 Arrays is null");
	//    2    4:new             #17  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #55  <String " data1 Arrays is null">
	//    5   10:invokespecial   #22  <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(aword1 == null)
	//*   7   14:aload_1         
	//*   8   15:ifnonnull       28
			throw new NullPointerException(" data2 Arrays is null");
	//    9   18:new             #17  <Class NullPointerException>
	//   10   21:dup             
	//   11   22:ldc1            #57  <String " data2 Arrays is null">
	//   12   24:invokespecial   #22  <Method void NullPointerException(String)>
	//   13   27:athrow          
		int k = aword0.length;
	//   14   28:aload_0         
	//   15   29:arraylength     
	//   16   30:istore_3        
		short aword2[] = new short[aword0.length + aword1.length];
	//   17   31:aload_0         
	//   18   32:arraylength     
	//   19   33:aload_1         
	//   20   34:arraylength     
	//   21   35:iadd            
	//   22   36:newarray        short[]
	//   23   38:astore          4
		for(int i = 0; i < k; i++)
	//*  24   40:iconst_0        
	//*  25   41:istore_2        
	//*  26   42:goto            56
			aword2[i] = aword0[i];
	//   27   45:aload           4
	//   28   47:iload_2         
	//   29   48:aload_0         
	//   30   49:iload_2         
	//   31   50:saload          
	//   32   51:sastore         

	//   33   52:iload_2         
	//   34   53:iconst_1        
	//   35   54:iadd            
	//   36   55:istore_2        
	//   37   56:iload_2         
	//   38   57:iload_3         
	//   39   58:icmplt          45
		for(int j = 0; j < aword1.length; j++)
	//*  40   61:iconst_0        
	//*  41   62:istore_2        
	//*  42   63:goto            79
			aword2[k + j] = aword1[j];
	//   43   66:aload           4
	//   44   68:iload_3         
	//   45   69:iload_2         
	//   46   70:iadd            
	//   47   71:aload_1         
	//   48   72:iload_2         
	//   49   73:saload          
	//   50   74:sastore         

	//   51   75:iload_2         
	//   52   76:iconst_1        
	//   53   77:iadd            
	//   54   78:istore_2        
	//   55   79:iload_2         
	//   56   80:aload_1         
	//   57   81:arraylength     
	//   58   82:icmplt          66
		return aword2;
	//   59   85:aload           4
	//   60   87:areturn         
	}

	public short data[];
}
