// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avh, atb, arh, atv, 
//			atd, aqq, ati, avf, 
//			asr, awf, aru, arx, 
//			avm, atq, ash, asn, 
//			aun

final class aup
{

	static int a(int i1, Object obj, aun aun)
	{
		if(obj instanceof atb)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #35  <Class atb>
	//*   2    4:ifeq            16
			return arh.a(i1, (atb)obj);
	//    3    7:iload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #35  <Class atb>
	//    6   12:invokestatic    #40  <Method int arh.a(int, atb)>
	//    7   15:ireturn         
		else
			return arh.b(i1, (atv)obj, aun);
	//    8   16:iload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #42  <Class atv>
	//   11   21:aload_2         
	//   12   22:invokestatic    #45  <Method int arh.b(int, atv, aun)>
	//   13   25:ireturn         
	}

	static int a(int i1, List list)
	{
		int l1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          5
		int j1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		if(l1 == 0)
	//*   7   13:iload           5
	//*   8   15:ifne            20
			return 0;
	//    9   18:iconst_0        
	//   10   19:ireturn         
		int k1 = arh.e(i1) * l1;
	//   11   20:iload_0         
	//   12   21:invokestatic    #56  <Method int arh.e(int)>
	//   13   24:iload           5
	//   14   26:imul            
	//   15   27:istore_3        
		i1 = k1;
	//   16   28:iload_3         
	//   17   29:istore_0        
		if(list instanceof atd)
	//*  18   30:aload_1         
	//*  19   31:instanceof      #58  <Class atd>
	//*  20   34:ifeq            104
		{
			list = ((List) ((atd)list));
	//   21   37:aload_1         
	//   22   38:checkcast       #58  <Class atd>
	//   23   41:astore_1        
			i1 = k1;
	//   24   42:iload_3         
	//   25   43:istore_0        
			j1 = ((int) (flag));
	//   26   44:iload           4
	//   27   46:istore_2        
			do
			{
				k1 = i1;
	//   28   47:iload_0         
	//   29   48:istore_3        
				if(j1 >= l1)
					break;
	//   30   49:iload_2         
	//   31   50:iload           5
	//   32   52:icmpge          161
				Object obj = ((atd) (list)).b(j1);
	//   33   55:aload_1         
	//   34   56:iload_2         
	//   35   57:invokeinterface #61  <Method Object atd.b(int)>
	//   36   62:astore          6
				if(obj instanceof aqq)
	//*  37   64:aload           6
	//*  38   66:instanceof      #63  <Class aqq>
	//*  39   69:ifeq            86
					i1 += arh.b((aqq)obj);
	//   40   72:iload_0         
	//   41   73:aload           6
	//   42   75:checkcast       #63  <Class aqq>
	//   43   78:invokestatic    #66  <Method int arh.b(aqq)>
	//   44   81:iadd            
	//   45   82:istore_0        
				else
	//*  46   83:goto            97
					i1 += arh.b((String)obj);
	//   47   86:iload_0         
	//   48   87:aload           6
	//   49   89:checkcast       #68  <Class String>
	//   50   92:invokestatic    #71  <Method int arh.b(String)>
	//   51   95:iadd            
	//   52   96:istore_0        
				j1++;
	//   53   97:iload_2         
	//   54   98:iconst_1        
	//   55   99:iadd            
	//   56  100:istore_2        
			} while(true);
	//   57  101:goto            47
		} else
		{
			do
			{
				k1 = i1;
	//   58  104:iload_0         
	//   59  105:istore_3        
				if(j1 >= l1)
					break;
	//   60  106:iload_2         
	//   61  107:iload           5
	//   62  109:icmpge          161
				Object obj1 = list.get(j1);
	//   63  112:aload_1         
	//   64  113:iload_2         
	//   65  114:invokeinterface #74  <Method Object List.get(int)>
	//   66  119:astore          6
				if(obj1 instanceof aqq)
	//*  67  121:aload           6
	//*  68  123:instanceof      #63  <Class aqq>
	//*  69  126:ifeq            143
					i1 += arh.b((aqq)obj1);
	//   70  129:iload_0         
	//   71  130:aload           6
	//   72  132:checkcast       #63  <Class aqq>
	//   73  135:invokestatic    #66  <Method int arh.b(aqq)>
	//   74  138:iadd            
	//   75  139:istore_0        
				else
	//*  76  140:goto            154
					i1 += arh.b((String)obj1);
	//   77  143:iload_0         
	//   78  144:aload           6
	//   79  146:checkcast       #68  <Class String>
	//   80  149:invokestatic    #71  <Method int arh.b(String)>
	//   81  152:iadd            
	//   82  153:istore_0        
				j1++;
	//   83  154:iload_2         
	//   84  155:iconst_1        
	//   85  156:iadd            
	//   86  157:istore_2        
			} while(true);
	//   87  158:goto            104
		}
		return k1;
	//   88  161:iload_3         
	//   89  162:ireturn         
	}

	static int a(int i1, List list, aun aun)
	{
		int k1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int j1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_3        
		if(k1 == 0)
	//*   5   10:iload           4
	//*   6   12:ifne            17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		i1 = arh.e(i1) * k1;
	//    9   17:iload_0         
	//   10   18:invokestatic    #56  <Method int arh.e(int)>
	//   11   21:iload           4
	//   12   23:imul            
	//   13   24:istore_0        
		for(; j1 < k1; j1++)
	//*  14   25:iload_3         
	//*  15   26:iload           4
	//*  16   28:icmpge          81
		{
			Object obj = list.get(j1);
	//   17   31:aload_1         
	//   18   32:iload_3         
	//   19   33:invokeinterface #74  <Method Object List.get(int)>
	//   20   38:astore          5
			if(obj instanceof atb)
	//*  21   40:aload           5
	//*  22   42:instanceof      #35  <Class atb>
	//*  23   45:ifeq            62
				i1 += arh.a((atb)obj);
	//   24   48:iload_0         
	//   25   49:aload           5
	//   26   51:checkcast       #35  <Class atb>
	//   27   54:invokestatic    #78  <Method int arh.a(atb)>
	//   28   57:iadd            
	//   29   58:istore_0        
			else
	//*  30   59:goto            74
				i1 += arh.b((atv)obj, aun);
	//   31   62:iload_0         
	//   32   63:aload           5
	//   33   65:checkcast       #42  <Class atv>
	//   34   68:aload_2         
	//   35   69:invokestatic    #81  <Method int arh.b(atv, aun)>
	//   36   72:iadd            
	//   37   73:istore_0        
		}

	//   38   74:iload_3         
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:istore_3        
	//*  42   78:goto            25
		return i1;
	//   43   81:iload_0         
	//   44   82:ireturn         
	}

	static int a(int i1, List list, boolean flag)
	{
		if(list.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #52  <Method int List.size()>
	//*   2    6:ifne            11
			return 0;
	//    3    9:iconst_0        
	//    4   10:ireturn         
		else
			return a(list) + list.size() * arh.e(i1);
	//    5   11:aload_1         
	//    6   12:invokestatic    #85  <Method int a(List)>
	//    7   15:aload_1         
	//    8   16:invokeinterface #52  <Method int List.size()>
	//    9   21:iload_0         
	//   10   22:invokestatic    #56  <Method int arh.e(int)>
	//   11   25:imul            
	//   12   26:iadd            
	//   13   27:ireturn         
	}

	static int a(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof ati)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #87  <Class ati>
	//*  13   23:ifeq            59
		{
			list = ((List) ((ati)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #87  <Class ati>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.d(((ati) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #90  <Method long ati.b(int)>
	//   28   47:invokestatic    #93  <Method int arh.d(long)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.d(((Long)list.get(i2)).longValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #95  <Class Long>
	//   50   82:invokevirtual   #99  <Method long Long.longValue()>
	//   51   85:invokestatic    #93  <Method int arh.d(long)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	public static avf a()
	{
		return b;
	//    0    0:getstatic       #22  <Field avf b>
	//    1    3:areturn         
	}

	private static avf a(boolean flag)
	{
		Object obj;
		try
		{
			obj = ((Object) (e()));
	//    0    0:invokestatic    #104 <Method Class e()>
	//    1    3:astore_1        
		}
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
	//*   4    8:aconst_null     
	//*   5    9:areturn         
	//*   6   10:aload_1         
	//*   7   11:iconst_1        
	//*   8   12:anewarray       Class[]
	//*   9   15:dup             
	//*  10   16:iconst_0        
	//*  11   17:getstatic       #111 <Field Class Boolean.TYPE>
	//*  12   20:aastore         
	//*  13   21:invokevirtual   #115 <Method Constructor Class.getConstructor(Class[])>
	//*  14   24:iconst_1        
	//*  15   25:anewarray       Object[]
	//*  16   28:dup             
	//*  17   29:iconst_0        
	//*  18   30:iload_0         
	//*  19   31:invokestatic    #119 <Method Boolean Boolean.valueOf(boolean)>
	//*  20   34:aastore         
	//*  21   35:invokevirtual   #125 <Method Object Constructor.newInstance(Object[])>
	//*  22   38:checkcast       #127 <Class avf>
	//*  23   41:astore_1        
	//*  24   42:aload_1         
	//*  25   43:areturn         
		catch(Throwable throwable)
	//*  26   44:astore_1        
		{
			return null;
	//   27   45:aconst_null     
	//   28   46:areturn         
		}
		if(obj == null)
			return null;
		obj = ((Object) ((avf)((Class) (obj)).getConstructor(new Class[] {
			Boolean.TYPE
		}).newInstance(new Object[] {
			Boolean.valueOf(flag)
		})));
		return ((avf) (obj));
	}

	static Object a(int i1, int j1, Object obj, avf avf1)
	{
		Object obj1 = obj;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(obj == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       13
			obj1 = avf1.a();
	//    4    7:aload_3         
	//    5    8:invokevirtual   #131 <Method Object avf.a()>
	//    6   11:astore          4
		avf1.a(obj1, i1, j1);
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:iload_0         
	//   10   17:iload_1         
	//   11   18:i2l             
	//   12   19:invokevirtual   #134 <Method void avf.a(Object, int, long)>
		return obj1;
	//   13   22:aload           4
	//   14   24:areturn         
	}

	static Object a(int i1, List list, asr asr1, Object obj, avf avf1)
	{
		if(asr1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return obj;
	//    2    4:aload_3         
	//    3    5:areturn         
		Object obj1;
		if(list instanceof RandomAccess)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #137 <Class RandomAccess>
	//*   6   10:ifeq            137
		{
			int i2 = list.size();
	//    7   13:aload_1         
	//    8   14:invokeinterface #52  <Method int List.size()>
	//    9   19:istore          7
			int j1 = 0;
	//   10   21:iconst_0        
	//   11   22:istore          5
			int l1 = 0;
	//   12   24:iconst_0        
	//   13   25:istore          6
			for(; j1 < i2; j1++)
	//*  14   27:iload           5
	//*  15   29:iload           7
	//*  16   31:icmpge          110
			{
				int j2 = ((Integer)list.get(j1)).intValue();
	//   17   34:aload_1         
	//   18   35:iload           5
	//   19   37:invokeinterface #74  <Method Object List.get(int)>
	//   20   42:checkcast       #139 <Class Integer>
	//   21   45:invokevirtual   #142 <Method int Integer.intValue()>
	//   22   48:istore          8
				if(asr1.a(j2))
	//*  23   50:aload_2         
	//*  24   51:iload           8
	//*  25   53:invokeinterface #147 <Method boolean asr.a(int)>
	//*  26   58:ifeq            91
				{
					if(j1 != l1)
	//*  27   61:iload           5
	//*  28   63:iload           6
	//*  29   65:icmpeq          82
						list.set(l1, ((Object) (Integer.valueOf(j2))));
	//   30   68:aload_1         
	//   31   69:iload           6
	//   32   71:iload           8
	//   33   73:invokestatic    #150 <Method Integer Integer.valueOf(int)>
	//   34   76:invokeinterface #154 <Method Object List.set(int, Object)>
	//   35   81:pop             
					l1++;
	//   36   82:iload           6
	//   37   84:iconst_1        
	//   38   85:iadd            
	//   39   86:istore          6
				} else
	//*  40   88:goto            101
				{
					obj = a(i1, j2, obj, avf1);
	//   41   91:iload_0         
	//   42   92:iload           8
	//   43   94:aload_3         
	//   44   95:aload           4
	//   45   97:invokestatic    #156 <Method Object a(int, int, Object, avf)>
	//   46  100:astore_3        
				}
			}

	//   47  101:iload           5
	//   48  103:iconst_1        
	//   49  104:iadd            
	//   50  105:istore          5
	//*  51  107:goto            27
			obj1 = obj;
	//   52  110:aload_3         
	//   53  111:astore          9
			if(l1 != i2)
	//*  54  113:iload           6
	//*  55  115:iload           7
	//*  56  117:icmpeq          206
			{
				list.subList(l1, i2).clear();
	//   57  120:aload_1         
	//   58  121:iload           6
	//   59  123:iload           7
	//   60  125:invokeinterface #160 <Method List List.subList(int, int)>
	//   61  130:invokeinterface #163 <Method void List.clear()>
				return obj;
	//   62  135:aload_3         
	//   63  136:areturn         
			}
		} else
		{
			Iterator iterator = list.iterator();
	//   64  137:aload_1         
	//   65  138:invokeinterface #167 <Method Iterator List.iterator()>
	//   66  143:astore          10
			list = ((List) (obj));
	//   67  145:aload_3         
	//   68  146:astore_1        
			do
			{
				obj1 = ((Object) (list));
	//   69  147:aload_1         
	//   70  148:astore          9
				if(!iterator.hasNext())
					break;
	//   71  150:aload           10
	//   72  152:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//   73  157:ifeq            206
				int k1 = ((Integer)iterator.next()).intValue();
	//   74  160:aload           10
	//   75  162:invokeinterface #176 <Method Object Iterator.next()>
	//   76  167:checkcast       #139 <Class Integer>
	//   77  170:invokevirtual   #142 <Method int Integer.intValue()>
	//   78  173:istore          5
				if(!asr1.a(k1))
	//*  79  175:aload_2         
	//*  80  176:iload           5
	//*  81  178:invokeinterface #147 <Method boolean asr.a(int)>
	//*  82  183:ifne            147
				{
					list = ((List) (a(i1, k1, ((Object) (list)), avf1)));
	//   83  186:iload_0         
	//   84  187:iload           5
	//   85  189:aload_1         
	//   86  190:aload           4
	//   87  192:invokestatic    #156 <Method Object a(int, int, Object, avf)>
	//   88  195:astore_1        
					iterator.remove();
	//   89  196:aload           10
	//   90  198:invokeinterface #179 <Method void Iterator.remove()>
				}
			} while(true);
	//   91  203:goto            147
		}
		return obj1;
	//   92  206:aload           9
	//   93  208:areturn         
	}

	public static void a(int i1, List list, awf awf1)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            21
			awf1.a(i1, list);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #188 <Method void awf.a(int, List)>
	//    9   21:return          
	}

	public static void a(int i1, List list, awf awf1, aun aun)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.a(i1, list, aun);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokeinterface #192 <Method void awf.a(int, List, aun)>
	//   10   22:return          
	}

	public static void a(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.g(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #197 <Method void awf.g(int, List, boolean)>
	//   10   22:return          
	}

	static void a(aru aru1, Object obj, Object obj1)
	{
		obj1 = ((Object) (aru1.a(obj1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #203 <Method arx aru.a(Object)>
	//    3    5:astore_2        
		if(!((arx) (obj1)).b())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #207 <Method boolean arx.b()>
	//*   6   10:ifne            22
			aru1.b(obj).a(((arx) (obj1)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #209 <Method arx aru.b(Object)>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #212 <Method void arx.a(arx)>
	//   12   22:return          
	}

	static void a(atq atq1, Object obj, Object obj1, long l1)
	{
		avm.a(obj, l1, atq1.a(avm.f(obj, l1), avm.f(obj1, l1)));
	//    0    0:aload_1         
	//    1    1:lload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_3         
	//    5    5:invokestatic    #219 <Method Object avm.f(Object, long)>
	//    6    8:aload_2         
	//    7    9:lload_3         
	//    8   10:invokestatic    #219 <Method Object avm.f(Object, long)>
	//    9   13:invokeinterface #224 <Method Object atq.a(Object, Object)>
	//   10   18:invokestatic    #227 <Method void avm.a(Object, long, Object)>
	//   11   21:return          
	}

	static void a(avf avf1, Object obj, Object obj1)
	{
		avf1.a(obj, avf1.c(avf1.b(obj), avf1.b(obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #231 <Method Object avf.b(Object)>
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #231 <Method Object avf.b(Object)>
	//    9   13:invokevirtual   #233 <Method Object avf.c(Object, Object)>
	//   10   16:invokevirtual   #236 <Method void avf.a(Object, Object)>
	//   11   19:return          
	}

	public static void a(Class class1)
	{
		if(!((Class) (com/google/android/gms/internal/ads/ash)).isAssignableFrom(class1))
	//*   0    0:ldc1            #239 <Class ash>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #243 <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifne            36
		{
			Class class2 = a;
	//    4    9:getstatic       #17  <Field Class a>
	//    5   12:astore_1        
			if(class2 != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          36
				if(class2.isAssignableFrom(class1))
	//*   8   17:aload_1         
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #243 <Method boolean Class.isAssignableFrom(Class)>
	//*  11   22:ifeq            26
					return;
	//   12   25:return          
				else
					throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
	//   13   26:new             #245 <Class IllegalArgumentException>
	//   14   29:dup             
	//   15   30:ldc1            #247 <String "Message classes must extend GeneratedMessage or GeneratedMessageLite">
	//   16   32:invokespecial   #250 <Method void IllegalArgumentException(String)>
	//   17   35:athrow          
		}
	//   18   36:return          
	}

	static boolean a(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       22
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #255 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	static int b(int i1, List list)
	{
		int k1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		int j1 = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		if(k1 == 0)
	//*   5    9:iload_3         
	//*   6   10:ifne            15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		k1 *= arh.e(i1);
	//    9   15:iload_3         
	//   10   16:iload_0         
	//   11   17:invokestatic    #56  <Method int arh.e(int)>
	//   12   20:imul            
	//   13   21:istore_3        
		i1 = j1;
	//   14   22:iload_2         
	//   15   23:istore_0        
		j1 = k1;
	//   16   24:iload_3         
	//   17   25:istore_2        
		for(; i1 < list.size(); i1++)
	//*  18   26:iload_0         
	//*  19   27:aload_1         
	//*  20   28:invokeinterface #52  <Method int List.size()>
	//*  21   33:icmpge          59
			j1 += arh.b((aqq)list.get(i1));
	//   22   36:iload_2         
	//   23   37:aload_1         
	//   24   38:iload_0         
	//   25   39:invokeinterface #74  <Method Object List.get(int)>
	//   26   44:checkcast       #63  <Class aqq>
	//   27   47:invokestatic    #66  <Method int arh.b(aqq)>
	//   28   50:iadd            
	//   29   51:istore_2        

	//   30   52:iload_0         
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:istore_0        
	//*  34   56:goto            26
		return j1;
	//   35   59:iload_2         
	//   36   60:ireturn         
	}

	static int b(int i1, List list, aun aun)
	{
		int l1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          5
		int j1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_3        
		if(l1 == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		int k1 = 0;
	//    9   17:iconst_0        
	//   10   18:istore          4
		for(; j1 < l1; j1++)
	//*  11   20:iload_3         
	//*  12   21:iload           5
	//*  13   23:icmpge          53
			k1 += arh.c(i1, (atv)list.get(j1), aun);
	//   14   26:iload           4
	//   15   28:iload_0         
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokeinterface #74  <Method Object List.get(int)>
	//   19   36:checkcast       #42  <Class atv>
	//   20   39:aload_2         
	//   21   40:invokestatic    #257 <Method int arh.c(int, atv, aun)>
	//   22   43:iadd            
	//   23   44:istore          4

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_3        
	//*  28   50:goto            20
		return k1;
	//   29   53:iload           4
	//   30   55:ireturn         
	}

	static int b(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return b(list) + j1 * arh.e(i1);
	//    7   13:aload_1         
	//    8   14:invokestatic    #259 <Method int b(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #56  <Method int arh.e(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int b(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof ati)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #87  <Class ati>
	//*  13   23:ifeq            59
		{
			list = ((List) ((ati)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #87  <Class ati>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.e(((ati) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #90  <Method long ati.b(int)>
	//   28   47:invokestatic    #261 <Method int arh.e(long)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.e(((Long)list.get(i2)).longValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #95  <Class Long>
	//   50   82:invokevirtual   #99  <Method long Long.longValue()>
	//   51   85:invokestatic    #261 <Method int arh.e(long)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	public static avf b()
	{
		return c;
	//    0    0:getstatic       #24  <Field avf c>
	//    1    3:areturn         
	}

	public static void b(int i1, List list, awf awf1)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            21
			awf1.b(i1, list);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #263 <Method void awf.b(int, List)>
	//    9   21:return          
	}

	public static void b(int i1, List list, awf awf1, aun aun)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.b(i1, list, aun);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokeinterface #265 <Method void awf.b(int, List, aun)>
	//   10   22:return          
	}

	public static void b(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.f(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #267 <Method void awf.f(int, List, boolean)>
	//   10   22:return          
	}

	static int c(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return c(list) + j1 * arh.e(i1);
	//    7   13:aload_1         
	//    8   14:invokestatic    #269 <Method int c(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #56  <Method int arh.e(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int c(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof ati)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #87  <Class ati>
	//*  13   23:ifeq            59
		{
			list = ((List) ((ati)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #87  <Class ati>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.f(((ati) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #90  <Method long ati.b(int)>
	//   28   47:invokestatic    #271 <Method int arh.f(long)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.f(((Long)list.get(i2)).longValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #95  <Class Long>
	//   50   82:invokevirtual   #99  <Method long Long.longValue()>
	//   51   85:invokestatic    #271 <Method int arh.f(long)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	public static avf c()
	{
		return d;
	//    0    0:getstatic       #31  <Field avf d>
	//    1    3:areturn         
	}

	public static void c(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.c(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #273 <Method void awf.c(int, List, boolean)>
	//   10   22:return          
	}

	static int d(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return d(list) + j1 * arh.e(i1);
	//    7   13:aload_1         
	//    8   14:invokestatic    #275 <Method int d(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #56  <Method int arh.e(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int d(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof asn)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #277 <Class asn>
	//*  13   23:ifeq            59
		{
			list = ((List) ((asn)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #277 <Class asn>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.k(((asn) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #279 <Method int asn.b(int)>
	//   28   47:invokestatic    #282 <Method int arh.k(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.k(((Integer)list.get(i2)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #139 <Class Integer>
	//   50   82:invokevirtual   #142 <Method int Integer.intValue()>
	//   51   85:invokestatic    #282 <Method int arh.k(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	private static Class d()
	{
		Throwable throwable;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.GeneratedMessage");
	//    0    0:ldc2            #284 <String "com.google.protobuf.GeneratedMessage">
	//    1    3:invokestatic    #288 <Method Class Class.forName(String)>
	//    2    6:astore_0        
		}
	//*   3    7:aload_0         
	//*   4    8:areturn         
	//*   5    9:aconst_null     
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return class1;
	//*   7   11:astore_0        
	//*   8   12:goto            9
	}

	public static void d(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.d(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #290 <Method void awf.d(int, List, boolean)>
	//   10   22:return          
	}

	static int e(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return e(list) + j1 * arh.e(i1);
	//    7   13:aload_1         
	//    8   14:invokestatic    #292 <Method int e(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #56  <Method int arh.e(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int e(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof asn)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #277 <Class asn>
	//*  13   23:ifeq            59
		{
			list = ((List) ((asn)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #277 <Class asn>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.f(((asn) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #279 <Method int asn.b(int)>
	//   28   47:invokestatic    #294 <Method int arh.f(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.f(((Integer)list.get(i2)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #139 <Class Integer>
	//   50   82:invokevirtual   #142 <Method int Integer.intValue()>
	//   51   85:invokestatic    #294 <Method int arh.f(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	private static Class e()
	{
		Throwable throwable;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
	//    0    0:ldc2            #296 <String "com.google.protobuf.UnknownFieldSetSchema">
	//    1    3:invokestatic    #288 <Method Class Class.forName(String)>
	//    2    6:astore_0        
		}
	//*   3    7:aload_0         
	//*   4    8:areturn         
	//*   5    9:aconst_null     
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return class1;
	//*   7   11:astore_0        
	//*   8   12:goto            9
	}

	public static void e(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.n(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #299 <Method void awf.n(int, List, boolean)>
	//   10   22:return          
	}

	static int f(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return f(list) + j1 * arh.e(i1);
	//    7   13:aload_1         
	//    8   14:invokestatic    #301 <Method int f(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #56  <Method int arh.e(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int f(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof asn)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #277 <Class asn>
	//*  13   23:ifeq            59
		{
			list = ((List) ((asn)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #277 <Class asn>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.g(((asn) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #279 <Method int asn.b(int)>
	//   28   47:invokestatic    #303 <Method int arh.g(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.g(((Integer)list.get(i2)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #139 <Class Integer>
	//   50   82:invokevirtual   #142 <Method int Integer.intValue()>
	//   51   85:invokestatic    #303 <Method int arh.g(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	public static void f(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.e(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #305 <Method void awf.e(int, List, boolean)>
	//   10   22:return          
	}

	static int g(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return g(list) + j1 * arh.e(i1);
	//    7   13:aload_1         
	//    8   14:invokestatic    #307 <Method int g(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #56  <Method int arh.e(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int g(List list)
	{
		int j2 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore          4
		int k1 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j2 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof asn)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #277 <Class asn>
	//*  13   23:ifeq            59
		{
			list = ((List) ((asn)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #277 <Class asn>
	//   16   30:astore_0        
			int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k1 = i1;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l1 >= j2)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i1 += arh.h(((asn) (list)).b(l1));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #279 <Method int asn.b(int)>
	//   28   47:invokestatic    #310 <Method int arh.h(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l1++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j1 = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i2 = k1;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k1 = j1;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i2 >= j2)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j1 += arh.h(((Integer)list.get(i2)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #74  <Method Object List.get(int)>
	//   49   79:checkcast       #139 <Class Integer>
	//   50   82:invokevirtual   #142 <Method int Integer.intValue()>
	//   51   85:invokestatic    #310 <Method int arh.h(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i2++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k1;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	public static void g(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.l(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #313 <Method void awf.l(int, List, boolean)>
	//   10   22:return          
	}

	static int h(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return j1 * arh.i(i1, 0);
	//    7   13:iload_3         
	//    8   14:iload_0         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #317 <Method int arh.i(int, int)>
	//   11   19:imul            
	//   12   20:ireturn         
	}

	static int h(List list)
	{
		return list.size() << 2;
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:iconst_2        
	//    3    7:ishl            
	//    4    8:ireturn         
	}

	public static void h(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.a(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #319 <Method void awf.a(int, List, boolean)>
	//   10   22:return          
	}

	static int i(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return j1 * arh.g(i1, 0L);
	//    7   13:iload_3         
	//    8   14:iload_0         
	//    9   15:lconst_0        
	//   10   16:invokestatic    #322 <Method int arh.g(int, long)>
	//   11   19:imul            
	//   12   20:ireturn         
	}

	static int i(List list)
	{
		return list.size() << 3;
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:iconst_3        
	//    3    7:ishl            
	//    4    8:ireturn         
	}

	public static void i(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.j(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #325 <Method void awf.j(int, List, boolean)>
	//   10   22:return          
	}

	static int j(int i1, List list, boolean flag)
	{
		int j1 = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:istore_3        
		if(j1 == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return j1 * arh.b(i1, true);
	//    7   13:iload_3         
	//    8   14:iload_0         
	//    9   15:iconst_1        
	//   10   16:invokestatic    #328 <Method int arh.b(int, boolean)>
	//   11   19:imul            
	//   12   20:ireturn         
	}

	static int j(List list)
	{
		return list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method int List.size()>
	//    2    6:ireturn         
	}

	public static void j(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.m(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #331 <Method void awf.m(int, List, boolean)>
	//   10   22:return          
	}

	public static void k(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.b(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #333 <Method void awf.b(int, List, boolean)>
	//   10   22:return          
	}

	public static void l(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.k(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #335 <Method void awf.k(int, List, boolean)>
	//   10   22:return          
	}

	public static void m(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.h(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #337 <Method void awf.h(int, List, boolean)>
	//   10   22:return          
	}

	public static void n(int i1, List list, awf awf1, boolean flag)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #183 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			awf1.i(i1, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #339 <Method void awf.i(int, List, boolean)>
	//   10   22:return          
	}

	private static final Class a = d();
	private static final avf b = a(false);
	private static final avf c = a(true);
	private static final avf d = new avh();

	static 
	{
	//    0    0:invokestatic    #15  <Method Class d()>
	//    1    3:putstatic       #17  <Field Class a>
	//    2    6:iconst_0        
	//    3    7:invokestatic    #20  <Method avf a(boolean)>
	//    4   10:putstatic       #22  <Field avf b>
	//    5   13:iconst_1        
	//    6   14:invokestatic    #20  <Method avf a(boolean)>
	//    7   17:putstatic       #24  <Field avf c>
	//    8   20:new             #26  <Class avh>
	//    9   23:dup             
	//   10   24:invokespecial   #29  <Method void avh()>
	//   11   27:putstatic       #31  <Field avf d>
	//*  12   30:return          
	}
}
