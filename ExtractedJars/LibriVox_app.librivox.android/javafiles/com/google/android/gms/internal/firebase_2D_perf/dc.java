// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			gd, ev, fm, di, 
//			gp, dq, dy

public abstract class dc
	implements gd
{

	public dc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zznb = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int zznb>
	//    5    9:return          
	}

	protected static void a(Iterable iterable, List list)
	{
		ev.a(((Object) (iterable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method Object ev.a(Object)>
	//    2    4:pop             
		if(iterable instanceof fm)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #28  <Class fm>
	//*   5    9:ifeq            185
		{
			List list1 = ((fm)iterable).d();
	//    6   12:aload_0         
	//    7   13:checkcast       #28  <Class fm>
	//    8   16:invokeinterface #32  <Method List fm.d()>
	//    9   21:astore          4
			iterable = ((Iterable) ((fm)list));
	//   10   23:aload_1         
	//   11   24:checkcast       #28  <Class fm>
	//   12   27:astore_0        
			int i1 = list.size();
	//   13   28:aload_1         
	//   14   29:invokeinterface #38  <Method int List.size()>
	//   15   34:istore_3        
			for(list = ((List) (list1.iterator())); ((Iterator) (list)).hasNext();)
	//*  16   35:aload           4
	//*  17   37:invokeinterface #42  <Method Iterator List.iterator()>
	//*  18   42:astore_1        
	//*  19   43:aload_1         
	//*  20   44:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*  21   49:ifeq            184
			{
				Object obj = ((Iterator) (list)).next();
	//   22   52:aload_1         
	//   23   53:invokeinterface #52  <Method Object Iterator.next()>
	//   24   58:astore          4
				if(obj == null)
	//*  25   60:aload           4
	//*  26   62:ifnonnull       147
				{
					int i = ((fm) (iterable)).size();
	//   27   65:aload_0         
	//   28   66:invokeinterface #53  <Method int fm.size()>
	//   29   71:istore_2        
					list = ((List) (new StringBuilder(37)));
	//   30   72:new             #55  <Class StringBuilder>
	//   31   75:dup             
	//   32   76:bipush          37
	//   33   78:invokespecial   #58  <Method void StringBuilder(int)>
	//   34   81:astore_1        
					((StringBuilder) (list)).append("Element at index ");
	//   35   82:aload_1         
	//   36   83:ldc1            #60  <String "Element at index ">
	//   37   85:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   38   88:pop             
					((StringBuilder) (list)).append(i - i1);
	//   39   89:aload_1         
	//   40   90:iload_2         
	//   41   91:iload_3         
	//   42   92:isub            
	//   43   93:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   44   96:pop             
					((StringBuilder) (list)).append(" is null.");
	//   45   97:aload_1         
	//   46   98:ldc1            #69  <String " is null.">
	//   47  100:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   48  103:pop             
					list = ((List) (((StringBuilder) (list)).toString()));
	//   49  104:aload_1         
	//   50  105:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   51  108:astore_1        
					for(int j = ((fm) (iterable)).size() - 1; j >= i1; j--)
	//*  52  109:aload_0         
	//*  53  110:invokeinterface #53  <Method int fm.size()>
	//*  54  115:iconst_1        
	//*  55  116:isub            
	//*  56  117:istore_2        
	//*  57  118:iload_2         
	//*  58  119:iload_3         
	//*  59  120:icmplt          138
						((fm) (iterable)).remove(j);
	//   60  123:aload_0         
	//   61  124:iload_2         
	//   62  125:invokeinterface #77  <Method Object fm.remove(int)>
	//   63  130:pop             

	//   64  131:iload_2         
	//   65  132:iconst_1        
	//   66  133:isub            
	//   67  134:istore_2        
	//*  68  135:goto            118
					throw new NullPointerException(((String) (list)));
	//   69  138:new             #79  <Class NullPointerException>
	//   70  141:dup             
	//   71  142:aload_1         
	//   72  143:invokespecial   #82  <Method void NullPointerException(String)>
	//   73  146:athrow          
				}
				if(obj instanceof di)
	//*  74  147:aload           4
	//*  75  149:instanceof      #84  <Class di>
	//*  76  152:ifeq            169
					((fm) (iterable)).a((di)obj);
	//   77  155:aload_0         
	//   78  156:aload           4
	//   79  158:checkcast       #84  <Class di>
	//   80  161:invokeinterface #87  <Method void fm.a(di)>
				else
	//*  81  166:goto            43
					((fm) (iterable)).add(((Object) ((String)obj)));
	//   82  169:aload_0         
	//   83  170:aload           4
	//   84  172:checkcast       #89  <Class String>
	//   85  175:invokeinterface #93  <Method boolean fm.add(Object)>
	//   86  180:pop             
			}

	//*  87  181:goto            43
			return;
	//   88  184:return          
		}
		if(iterable instanceof gp)
	//*  89  185:aload_0         
	//*  90  186:instanceof      #95  <Class gp>
	//*  91  189:ifeq            204
		{
			list.addAll((Collection)iterable);
	//   92  192:aload_1         
	//   93  193:aload_0         
	//   94  194:checkcast       #97  <Class Collection>
	//   95  197:invokeinterface #101 <Method boolean List.addAll(Collection)>
	//   96  202:pop             
			return;
	//   97  203:return          
		}
		if((list instanceof ArrayList) && (iterable instanceof Collection))
	//*  98  204:aload_1         
	//*  99  205:instanceof      #103 <Class ArrayList>
	//* 100  208:ifeq            241
	//* 101  211:aload_0         
	//* 102  212:instanceof      #97  <Class Collection>
	//* 103  215:ifeq            241
			((ArrayList)list).ensureCapacity(list.size() + ((Collection)iterable).size());
	//  104  218:aload_1         
	//  105  219:checkcast       #103 <Class ArrayList>
	//  106  222:aload_1         
	//  107  223:invokeinterface #38  <Method int List.size()>
	//  108  228:aload_0         
	//  109  229:checkcast       #97  <Class Collection>
	//  110  232:invokeinterface #104 <Method int Collection.size()>
	//  111  237:iadd            
	//  112  238:invokevirtual   #107 <Method void ArrayList.ensureCapacity(int)>
		int j1 = list.size();
	//  113  241:aload_1         
	//  114  242:invokeinterface #38  <Method int List.size()>
	//  115  247:istore_3        
		Object obj1;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); list.add(obj1))
	//* 116  248:aload_0         
	//* 117  249:invokeinterface #110 <Method Iterator Iterable.iterator()>
	//* 118  254:astore_0        
	//* 119  255:aload_0         
	//* 120  256:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//* 121  261:ifeq            371
		{
			obj1 = ((Iterator) (iterable)).next();
	//  122  264:aload_0         
	//  123  265:invokeinterface #52  <Method Object Iterator.next()>
	//  124  270:astore          4
			if(obj1 == null)
	//* 125  272:aload           4
	//* 126  274:ifnonnull       359
			{
				int k = list.size();
	//  127  277:aload_1         
	//  128  278:invokeinterface #38  <Method int List.size()>
	//  129  283:istore_2        
				iterable = ((Iterable) (new StringBuilder(37)));
	//  130  284:new             #55  <Class StringBuilder>
	//  131  287:dup             
	//  132  288:bipush          37
	//  133  290:invokespecial   #58  <Method void StringBuilder(int)>
	//  134  293:astore_0        
				((StringBuilder) (iterable)).append("Element at index ");
	//  135  294:aload_0         
	//  136  295:ldc1            #60  <String "Element at index ">
	//  137  297:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//  138  300:pop             
				((StringBuilder) (iterable)).append(k - j1);
	//  139  301:aload_0         
	//  140  302:iload_2         
	//  141  303:iload_3         
	//  142  304:isub            
	//  143  305:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//  144  308:pop             
				((StringBuilder) (iterable)).append(" is null.");
	//  145  309:aload_0         
	//  146  310:ldc1            #69  <String " is null.">
	//  147  312:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//  148  315:pop             
				iterable = ((Iterable) (((StringBuilder) (iterable)).toString()));
	//  149  316:aload_0         
	//  150  317:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  151  320:astore_0        
				for(int l = list.size() - 1; l >= j1; l--)
	//* 152  321:aload_1         
	//* 153  322:invokeinterface #38  <Method int List.size()>
	//* 154  327:iconst_1        
	//* 155  328:isub            
	//* 156  329:istore_2        
	//* 157  330:iload_2         
	//* 158  331:iload_3         
	//* 159  332:icmplt          350
					list.remove(l);
	//  160  335:aload_1         
	//  161  336:iload_2         
	//  162  337:invokeinterface #111 <Method Object List.remove(int)>
	//  163  342:pop             

	//  164  343:iload_2         
	//  165  344:iconst_1        
	//  166  345:isub            
	//  167  346:istore_2        
	//* 168  347:goto            330
				throw new NullPointerException(((String) (iterable)));
	//  169  350:new             #79  <Class NullPointerException>
	//  170  353:dup             
	//  171  354:aload_0         
	//  172  355:invokespecial   #82  <Method void NullPointerException(String)>
	//  173  358:athrow          
			}
		}

	//  174  359:aload_1         
	//  175  360:aload           4
	//  176  362:invokeinterface #112 <Method boolean List.add(Object)>
	//  177  367:pop             
	//* 178  368:goto            255
	//  179  371:return          
	}

	void b(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #115 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final di v()
	{
		Object obj;
		try
		{
			obj = ((Object) (di.c(A())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method int A()>
	//    2    4:invokestatic    #127 <Method dq di.c(int)>
	//    3    7:astore_1        
			a(((dq) (obj)).b());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method dy dq.b()>
	//    7   13:invokevirtual   #135 <Method void a(dy)>
			obj = ((Object) (((dq) (obj)).a()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #137 <Method di dq.a()>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(IOException ioexception)
	//*  13   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #141 <Method Class Object.getClass()>
	//   16   28:invokevirtual   #146 <Method String Class.getName()>
	//   17   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 62 + String.valueOf("ByteString").length());
	//   18   32:new             #55  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:invokestatic    #150 <Method String String.valueOf(Object)>
	//   22   40:invokevirtual   #153 <Method int String.length()>
	//   23   43:bipush          62
	//   24   45:iadd            
	//   25   46:ldc1            #155 <String "ByteString">
	//   26   48:invokestatic    #150 <Method String String.valueOf(Object)>
	//   27   51:invokevirtual   #153 <Method int String.length()>
	//   28   54:iadd            
	//   29   55:invokespecial   #58  <Method void StringBuilder(int)>
	//   30   58:astore_3        
			stringbuilder.append("Serializing ");
	//   31   59:aload_3         
	//   32   60:ldc1            #157 <String "Serializing ">
	//   33   62:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			stringbuilder.append(s);
	//   35   66:aload_3         
	//   36   67:aload_2         
	//   37   68:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			stringbuilder.append(" to a ");
	//   39   72:aload_3         
	//   40   73:ldc1            #159 <String " to a ">
	//   41   75:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			stringbuilder.append("ByteString");
	//   43   79:aload_3         
	//   44   80:ldc1            #155 <String "ByteString">
	//   45   82:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   47   86:aload_3         
	//   48   87:ldc1            #161 <String " threw an IOException (should never happen).">
	//   49   89:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   51   93:new             #163 <Class RuntimeException>
	//   52   96:dup             
	//   53   97:aload_3         
	//   54   98:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   55  101:aload_1         
	//   56  102:invokespecial   #166 <Method void RuntimeException(String, Throwable)>
	//   57  105:athrow          
		}
		return ((di) (obj));
	}

	public final byte[] w()
	{
		byte abyte0[];
		try
		{
			abyte0 = new byte[A()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method int A()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
			dy dy1 = dy.a(abyte0);
	//    4    7:aload_1         
	//    5    8:invokestatic    #173 <Method dy dy.a(byte[])>
	//    6   11:astore_2        
			a(dy1);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #135 <Method void a(dy)>
			dy1.b();
	//   10   17:aload_2         
	//   11   18:invokevirtual   #175 <Method void dy.b()>
		}
	//*  12   21:aload_1         
	//*  13   22:areturn         
		catch(IOException ioexception)
	//*  14   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   15   24:aload_0         
	//   16   25:invokevirtual   #141 <Method Class Object.getClass()>
	//   17   28:invokevirtual   #146 <Method String Class.getName()>
	//   18   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 62 + String.valueOf("byte array").length());
	//   19   32:new             #55  <Class StringBuilder>
	//   20   35:dup             
	//   21   36:aload_2         
	//   22   37:invokestatic    #150 <Method String String.valueOf(Object)>
	//   23   40:invokevirtual   #153 <Method int String.length()>
	//   24   43:bipush          62
	//   25   45:iadd            
	//   26   46:ldc1            #177 <String "byte array">
	//   27   48:invokestatic    #150 <Method String String.valueOf(Object)>
	//   28   51:invokevirtual   #153 <Method int String.length()>
	//   29   54:iadd            
	//   30   55:invokespecial   #58  <Method void StringBuilder(int)>
	//   31   58:astore_3        
			stringbuilder.append("Serializing ");
	//   32   59:aload_3         
	//   33   60:ldc1            #157 <String "Serializing ">
	//   34   62:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
			stringbuilder.append(s);
	//   36   66:aload_3         
	//   37   67:aload_2         
	//   38   68:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
			stringbuilder.append(" to a ");
	//   40   72:aload_3         
	//   41   73:ldc1            #159 <String " to a ">
	//   42   75:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
			stringbuilder.append("byte array");
	//   44   79:aload_3         
	//   45   80:ldc1            #177 <String "byte array">
	//   46   82:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   48   86:aload_3         
	//   49   87:ldc1            #161 <String " threw an IOException (should never happen).">
	//   50   89:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   52   93:new             #163 <Class RuntimeException>
	//   53   96:dup             
	//   54   97:aload_3         
	//   55   98:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   56  101:aload_1         
	//   57  102:invokespecial   #166 <Method void RuntimeException(String, Throwable)>
	//   58  105:athrow          
		}
		return abyte0;
	}

	int x()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #115 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private static boolean zznc = false;
	protected int zznb;

	static 
	{
	//    0    0:return          
	}
}
