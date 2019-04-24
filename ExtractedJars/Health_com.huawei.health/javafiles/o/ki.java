// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.List;

public final class ki
{

	protected ki(List list, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean a>
		b = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <String "">
	//    7   12:putfield        #23  <Field String b>
		e = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #25  <Field boolean e>
		c = 0.0D;
	//   11   20:aload_0         
	//   12   21:dconst_0        
	//   13   22:putfield        #27  <Field double c>
		d = 0.0D;
	//   14   25:aload_0         
	//   15   26:dconst_0        
	//   16   27:putfield        #29  <Field double d>
		b = s2;
	//   17   30:aload_0         
	//   18   31:aload           4
	//   19   33:putfield        #23  <Field String b>
		a();
	//   20   36:aload_0         
	//   21   37:invokespecial   #31  <Method void a()>
	//   22   40:return          
	}

	private void a()
	{
		String s = b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String b>
	//    2    4:astore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int k = ((int) (flag));
	//    5    8:iload_3         
	//    6    9:istore_2        
		if(s != null)
	//*   7   10:aload           4
	//*   8   12:ifnull          89
		{
			k = ((int) (flag));
	//    9   15:iload_3         
	//   10   16:istore_2        
			if(s.length() > 8)
	//*  11   17:aload           4
	//*  12   19:invokevirtual   #38  <Method int String.length()>
	//*  13   22:bipush          8
	//*  14   24:icmple          89
			{
				int i = 0;
	//   15   27:iconst_0        
	//   16   28:istore_1        
				for(k = 1; k < s.length() - 3; k++)
	//*  17   29:iconst_1        
	//*  18   30:istore_2        
	//*  19   31:iload_2         
	//*  20   32:aload           4
	//*  21   34:invokevirtual   #38  <Method int String.length()>
	//*  22   37:iconst_3        
	//*  23   38:isub            
	//*  24   39:icmpge          58
					i ^= ((int) (s.charAt(k)));
	//   25   42:iload_1         
	//   26   43:aload           4
	//   27   45:iload_2         
	//   28   46:invokevirtual   #42  <Method char String.charAt(int)>
	//   29   49:ixor            
	//   30   50:istore_1        

	//   31   51:iload_2         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_2        
	//*  35   55:goto            31
				k = ((int) (flag));
	//   36   58:iload_3         
	//   37   59:istore_2        
				if(Integer.toHexString(i).equalsIgnoreCase(s.substring(s.length() - 2, s.length())))
	//*  38   60:iload_1         
	//*  39   61:invokestatic    #48  <Method String Integer.toHexString(int)>
	//*  40   64:aload           4
	//*  41   66:aload           4
	//*  42   68:invokevirtual   #38  <Method int String.length()>
	//*  43   71:iconst_2        
	//*  44   72:isub            
	//*  45   73:aload           4
	//*  46   75:invokevirtual   #38  <Method int String.length()>
	//*  47   78:invokevirtual   #52  <Method String String.substring(int, int)>
	//*  48   81:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  49   84:ifeq            89
					k = 1;
	//   50   87:iconst_1        
	//   51   88:istore_2        
			}
		}
		if(k != 0)
	//*  52   89:iload_2         
	//*  53   90:ifeq            284
		{
			String s1 = b.substring(0, b.length() - 3);
	//   54   93:aload_0         
	//   55   94:getfield        #23  <Field String b>
	//   56   97:iconst_0        
	//   57   98:aload_0         
	//   58   99:getfield        #23  <Field String b>
	//   59  102:invokevirtual   #38  <Method int String.length()>
	//   60  105:iconst_3        
	//   61  106:isub            
	//   62  107:invokevirtual   #52  <Method String String.substring(int, int)>
	//   63  110:astore          4
			int l = 0;
	//   64  112:iconst_0        
	//   65  113:istore_2        
			for(int j = 0; j < s1.length();)
	//*  66  114:iconst_0        
	//*  67  115:istore_1        
	//*  68  116:iload_1         
	//*  69  117:aload           4
	//*  70  119:invokevirtual   #38  <Method int String.length()>
	//*  71  122:icmpge          151
			{
				int i1 = l;
	//   72  125:iload_2         
	//   73  126:istore_3        
				if(s1.charAt(j) == ',')
	//*  74  127:aload           4
	//*  75  129:iload_1         
	//*  76  130:invokevirtual   #42  <Method char String.charAt(int)>
	//*  77  133:bipush          44
	//*  78  135:icmpne          142
					i1 = l + 1;
	//   79  138:iload_2         
	//   80  139:iconst_1        
	//   81  140:iadd            
	//   82  141:istore_3        
				j++;
	//   83  142:iload_1         
	//   84  143:iconst_1        
	//   85  144:iadd            
	//   86  145:istore_1        
				l = i1;
	//   87  146:iload_3         
	//   88  147:istore_2        
			}

	//*  89  148:goto            116
			String as[] = s1.split(",", l + 1);
	//   90  151:aload           4
	//   91  153:ldc1            #58  <String ",">
	//   92  155:iload_2         
	//   93  156:iconst_1        
	//   94  157:iadd            
	//   95  158:invokevirtual   #62  <Method String[] String.split(String, int)>
	//   96  161:astore          4
			if(as.length < 6)
	//*  97  163:aload           4
	//*  98  165:arraylength     
	//*  99  166:bipush          6
	//* 100  168:icmpge          172
				return;
	//  101  171:return          
			if(!as[2].equals("") && !as[as.length - 3].equals("") && !as[as.length - 2].equals("") && !as[as.length - 1].equals(""))
	//* 102  172:aload           4
	//* 103  174:iconst_2        
	//* 104  175:aaload          
	//* 105  176:ldc1            #21  <String "">
	//* 106  178:invokevirtual   #66  <Method boolean String.equals(Object)>
	//* 107  181:ifne            284
	//* 108  184:aload           4
	//* 109  186:aload           4
	//* 110  188:arraylength     
	//* 111  189:iconst_3        
	//* 112  190:isub            
	//* 113  191:aaload          
	//* 114  192:ldc1            #21  <String "">
	//* 115  194:invokevirtual   #66  <Method boolean String.equals(Object)>
	//* 116  197:ifne            284
	//* 117  200:aload           4
	//* 118  202:aload           4
	//* 119  204:arraylength     
	//* 120  205:iconst_2        
	//* 121  206:isub            
	//* 122  207:aaload          
	//* 123  208:ldc1            #21  <String "">
	//* 124  210:invokevirtual   #66  <Method boolean String.equals(Object)>
	//* 125  213:ifne            284
	//* 126  216:aload           4
	//* 127  218:aload           4
	//* 128  220:arraylength     
	//* 129  221:iconst_1        
	//* 130  222:isub            
	//* 131  223:aaload          
	//* 132  224:ldc1            #21  <String "">
	//* 133  226:invokevirtual   #66  <Method boolean String.equals(Object)>
	//* 134  229:ifne            284
			{
				Integer.valueOf(as[2]).intValue();
	//  135  232:aload           4
	//  136  234:iconst_2        
	//  137  235:aaload          
	//  138  236:invokestatic    #70  <Method Integer Integer.valueOf(String)>
	//  139  239:invokevirtual   #73  <Method int Integer.intValue()>
	//  140  242:pop             
				c = Double.valueOf(as[as.length - 3]).doubleValue();
	//  141  243:aload_0         
	//  142  244:aload           4
	//  143  246:aload           4
	//  144  248:arraylength     
	//  145  249:iconst_3        
	//  146  250:isub            
	//  147  251:aaload          
	//  148  252:invokestatic    #78  <Method Double Double.valueOf(String)>
	//  149  255:invokevirtual   #82  <Method double Double.doubleValue()>
	//  150  258:putfield        #27  <Field double c>
				d = Double.valueOf(as[as.length - 2]).doubleValue();
	//  151  261:aload_0         
	//  152  262:aload           4
	//  153  264:aload           4
	//  154  266:arraylength     
	//  155  267:iconst_2        
	//  156  268:isub            
	//  157  269:aaload          
	//  158  270:invokestatic    #78  <Method Double Double.valueOf(String)>
	//  159  273:invokevirtual   #82  <Method double Double.doubleValue()>
	//  160  276:putfield        #29  <Field double d>
				e = true;
	//  161  279:aload_0         
	//  162  280:iconst_1        
	//  163  281:putfield        #25  <Field boolean e>
			}
		}
		a = e;
	//  164  284:aload_0         
	//  165  285:aload_0         
	//  166  286:getfield        #25  <Field boolean e>
	//  167  289:putfield        #19  <Field boolean a>
	//  168  292:return          
	}

	protected final boolean c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean a>
	//    2    4:ireturn         
	}

	protected final double d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field double c>
	//    2    4:dreturn         
	}

	protected final double e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field double d>
	//    2    4:dreturn         
	}

	private boolean a;
	private String b;
	private double c;
	private double d;
	private boolean e;
}
