// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package com.google.firebase.appindexing.internal:
//			b, a

public final class Thing extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public Thing(int i, Bundle bundle, zza zza, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int a>
		b = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field Bundle b>
		c = zza;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field Thing$zza c>
		d = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field String d>
		e = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #39  <Field String e>
		b.setClassLoader(((Object)this).getClass().getClassLoader());
	//   17   31:aload_0         
	//   18   32:getfield        #33  <Field Bundle b>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #45  <Method Class Object.getClass()>
	//   21   39:invokevirtual   #51  <Method ClassLoader Class.getClassLoader()>
	//   22   42:invokevirtual   #57  <Method void Bundle.setClassLoader(ClassLoader)>
	//   23   45:return          
	}

	static int a(Bundle bundle)
	{
		return b(bundle);
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method int b(Bundle)>
	//    2    4:ireturn         
	}

	static final int a(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return s1 != null ? -1 : 0;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:iconst_m1       
	//    7   11:ireturn         
		if(s1 == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       18
			return 1;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		else
			return s.compareTo(s1);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #67  <Method int String.compareTo(String)>
	//   15   23:ireturn         
	}

	static void a(Bundle bundle, StringBuilder stringbuilder)
	{
		b(bundle, stringbuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #70  <Method void b(Bundle, StringBuilder)>
	//    3    5:return          
	}

	static boolean a(Bundle bundle, Bundle bundle1)
	{
		return b(bundle, bundle1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #73  <Method boolean b(Bundle, Bundle)>
	//    3    5:ireturn         
	}

	private static int b(Bundle bundle)
	{
		ArrayList arraylist1 = new ArrayList(((java.util.Collection) (bundle.keySet())));
	//    0    0:new             #75  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #79  <Method Set Bundle.keySet()>
	//    4    8:invokespecial   #82  <Method void ArrayList(java.util.Collection)>
	//    5   11:astore          4
		Collections.sort(((java.util.List) (arraylist1)));
	//    6   13:aload           4
	//    7   15:invokestatic    #88  <Method void Collections.sort(java.util.List)>
		ArrayList arraylist = new ArrayList();
	//    8   18:new             #75  <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #89  <Method void ArrayList()>
	//   11   25:astore_3        
		arraylist1 = (ArrayList)arraylist1;
	//   12   26:aload           4
	//   13   28:checkcast       #75  <Class ArrayList>
	//   14   31:astore          4
		int j = arraylist1.size();
	//   15   33:aload           4
	//   16   35:invokevirtual   #93  <Method int ArrayList.size()>
	//   17   38:istore_2        
		for(int i = 0; i < j;)
	//*  18   39:iconst_0        
	//*  19   40:istore_1        
	//*  20   41:iload_1         
	//*  21   42:iload_2         
	//*  22   43:icmpge          227
		{
			Object obj = arraylist1.get(i);
	//   23   46:aload           4
	//   24   48:iload_1         
	//   25   49:invokevirtual   #97  <Method Object ArrayList.get(int)>
	//   26   52:astore          5
			i++;
	//   27   54:iload_1         
	//   28   55:iconst_1        
	//   29   56:iadd            
	//   30   57:istore_1        
			obj = bundle.get((String)obj);
	//   31   58:aload_0         
	//   32   59:aload           5
	//   33   61:checkcast       #63  <Class String>
	//   34   64:invokevirtual   #100 <Method Object Bundle.get(String)>
	//   35   67:astore          5
			if(obj instanceof boolean[])
	//*  36   69:aload           5
	//*  37   71:instanceof      #102 <Class boolean[]>
	//*  38   74:ifeq            96
				arraylist.add(((Object) (Integer.valueOf(Arrays.hashCode((boolean[])obj)))));
	//   39   77:aload_3         
	//   40   78:aload           5
	//   41   80:checkcast       #102 <Class boolean[]>
	//   42   83:invokestatic    #108 <Method int Arrays.hashCode(boolean[])>
	//   43   86:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   44   89:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   45   92:pop             
			else
	//*  46   93:goto            41
			if(obj instanceof long[])
	//*  47   96:aload           5
	//*  48   98:instanceof      #120 <Class long[]>
	//*  49  101:ifeq            123
				arraylist.add(((Object) (Integer.valueOf(Arrays.hashCode((long[])obj)))));
	//   50  104:aload_3         
	//   51  105:aload           5
	//   52  107:checkcast       #120 <Class long[]>
	//   53  110:invokestatic    #123 <Method int Arrays.hashCode(long[])>
	//   54  113:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   55  116:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   56  119:pop             
			else
	//*  57  120:goto            41
			if(obj instanceof double[])
	//*  58  123:aload           5
	//*  59  125:instanceof      #125 <Class double[]>
	//*  60  128:ifeq            150
				arraylist.add(((Object) (Integer.valueOf(Arrays.hashCode((double[])obj)))));
	//   61  131:aload_3         
	//   62  132:aload           5
	//   63  134:checkcast       #125 <Class double[]>
	//   64  137:invokestatic    #128 <Method int Arrays.hashCode(double[])>
	//   65  140:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   66  143:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   67  146:pop             
			else
	//*  68  147:goto            41
			if(obj instanceof byte[])
	//*  69  150:aload           5
	//*  70  152:instanceof      #130 <Class byte[]>
	//*  71  155:ifeq            177
				arraylist.add(((Object) (Integer.valueOf(Arrays.hashCode((byte[])obj)))));
	//   72  158:aload_3         
	//   73  159:aload           5
	//   74  161:checkcast       #130 <Class byte[]>
	//   75  164:invokestatic    #133 <Method int Arrays.hashCode(byte[])>
	//   76  167:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   77  170:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   78  173:pop             
			else
	//*  79  174:goto            41
			if(obj instanceof Object[])
	//*  80  177:aload           5
	//*  81  179:instanceof      #135 <Class Object[]>
	//*  82  182:ifeq            204
				arraylist.add(((Object) (Integer.valueOf(Arrays.hashCode((Object[])obj)))));
	//   83  185:aload_3         
	//   84  186:aload           5
	//   85  188:checkcast       #135 <Class Object[]>
	//   86  191:invokestatic    #138 <Method int Arrays.hashCode(Object[])>
	//   87  194:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   88  197:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   89  200:pop             
			else
	//*  90  201:goto            41
				arraylist.add(((Object) (Integer.valueOf(ak.a(new Object[] {
					obj
				})))));
	//   91  204:aload_3         
	//   92  205:iconst_1        
	//   93  206:anewarray       Object[]
	//   94  209:dup             
	//   95  210:iconst_0        
	//   96  211:aload           5
	//   97  213:aastore         
	//   98  214:invokestatic    #142 <Method int ak.a(Object[])>
	//   99  217:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  100  220:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//  101  223:pop             
		}

	//* 102  224:goto            41
		return ak.a(arraylist.toArray());
	//  103  227:aload_3         
	//  104  228:invokevirtual   #146 <Method Object[] ArrayList.toArray()>
	//  105  231:invokestatic    #142 <Method int ak.a(Object[])>
	//  106  234:ireturn         
	}

	private static void b(Bundle bundle, StringBuilder stringbuilder)
	{
		int i;
		int j;
		int k;
		String as[];
		Object obj;
		try
		{
			Set set = bundle.keySet();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method Set Bundle.keySet()>
	//    2    4:astore          5
			as = (String[])set.toArray(((Object []) (new String[set.size()])));
	//    3    6:aload           5
	//    4    8:aload           5
	//    5   10:invokeinterface #151 <Method int Set.size()>
	//    6   15:anewarray       String[]
	//    7   18:invokeinterface #154 <Method Object[] Set.toArray(Object[])>
	//    8   23:checkcast       #156 <Class String[]>
	//    9   26:astore          5
			Arrays.sort(((Object []) (as)), a.a);
	//   10   28:aload           5
	//   11   30:getstatic       #161 <Field java.util.Comparator a.a>
	//   12   33:invokestatic    #164 <Method void Arrays.sort(Object[], java.util.Comparator)>
			k = as.length;
	//   13   36:aload           5
	//   14   38:arraylength     
	//   15   39:istore          4
		}
	//*  16   41:iconst_0        
	//*  17   42:istore_2        
	//*  18   43:iload_2         
	//*  19   44:iload           4
	//*  20   46:icmpge          194
	//*  21   49:aload           5
	//*  22   51:iload_2         
	//*  23   52:aaload          
	//*  24   53:astore          6
	//*  25   55:aload_1         
	//*  26   56:ldc1            #166 <String "{ key: '">
	//*  27   58:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  28   61:pop             
	//*  29   62:aload_1         
	//*  30   63:aload           6
	//*  31   65:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  32   68:pop             
	//*  33   69:aload_1         
	//*  34   70:ldc1            #174 <String "' value: ">
	//*  35   72:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  36   75:pop             
	//*  37   76:aload_0         
	//*  38   77:aload           6
	//*  39   79:invokevirtual   #100 <Method Object Bundle.get(String)>
	//*  40   82:astore          6
	//*  41   84:aload           6
	//*  42   86:ifnonnull       99
	//*  43   89:aload_1         
	//*  44   90:ldc1            #176 <String "<null>">
	//*  45   92:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  46   95:pop             
	//*  47   96:goto            180
	//*  48   99:aload           6
	//*  49  101:invokevirtual   #45  <Method Class Object.getClass()>
	//*  50  104:invokevirtual   #180 <Method boolean Class.isArray()>
	//*  51  107:ifeq            170
	//*  52  110:aload_1         
	//*  53  111:ldc1            #182 <String "[ ">
	//*  54  113:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  55  116:pop             
	//*  56  117:iconst_0        
	//*  57  118:istore_3        
	//*  58  119:iload_3         
	//*  59  120:aload           6
	//*  60  122:invokestatic    #188 <Method int Array.getLength(Object)>
	//*  61  125:icmpge          160
	//*  62  128:aload_1         
	//*  63  129:ldc1            #190 <String "'">
	//*  64  131:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  65  134:pop             
	//*  66  135:aload_1         
	//*  67  136:aload           6
	//*  68  138:iload_3         
	//*  69  139:invokestatic    #193 <Method Object Array.get(Object, int)>
	//*  70  142:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//*  71  145:pop             
	//*  72  146:aload_1         
	//*  73  147:ldc1            #198 <String "' ">
	//*  74  149:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  75  152:pop             
	//*  76  153:iload_3         
	//*  77  154:iconst_1        
	//*  78  155:iadd            
	//*  79  156:istore_3        
	//*  80  157:goto            119
	//*  81  160:aload_1         
	//*  82  161:ldc1            #200 <String "]">
	//*  83  163:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  84  166:pop             
	//*  85  167:goto            180
	//*  86  170:aload_1         
	//*  87  171:aload           6
	//*  88  173:invokevirtual   #204 <Method String Object.toString()>
	//*  89  176:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  90  179:pop             
	//*  91  180:aload_1         
	//*  92  181:ldc1            #206 <String " } ">
	//*  93  183:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  94  186:pop             
	//*  95  187:iload_2         
	//*  96  188:iconst_1        
	//*  97  189:iadd            
	//*  98  190:istore_2        
	//*  99  191:goto            43
	//* 100  194:return          
	//* 101  195:aload_1         
	//* 102  196:ldc1            #208 <String "<error>">
	//* 103  198:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//* 104  201:pop             
	//* 105  202:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			stringbuilder.append("<error>");
			return;
		}
		i = 0;
		if(i >= k)
			break; /* Loop/switch isn't completed */
		obj = ((Object) (as[i]));
		stringbuilder.append("{ key: '");
		stringbuilder.append(((String) (obj)));
		stringbuilder.append("' value: ");
		obj = bundle.get(((String) (obj)));
		if(obj != null)
			break MISSING_BLOCK_LABEL_99;
		stringbuilder.append("<null>");
		break MISSING_BLOCK_LABEL_180;
		if(!obj.getClass().isArray())
			break MISSING_BLOCK_LABEL_170;
		stringbuilder.append("[ ");
		j = 0;
_L2:
		if(j >= Array.getLength(obj))
			break; /* Loop/switch isn't completed */
		stringbuilder.append("'");
		stringbuilder.append(Array.get(obj, j));
		stringbuilder.append("' ");
		j++;
		if(true) goto _L2; else goto _L1
_L1:
		stringbuilder.append("]");
		break MISSING_BLOCK_LABEL_180;
		stringbuilder.append(obj.toString());
		stringbuilder.append(" } ");
		i++;
		if(true) goto _L4; else goto _L3
_L4:
		break MISSING_BLOCK_LABEL_43;
_L3:
	//* 106  203:astore_0        
	//* 107  204:goto            195
	}

	private static boolean b(Bundle bundle, Bundle bundle1)
	{
label0:
		{
			if(bundle.size() != bundle1.size())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #209 <Method int Bundle.size()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #209 <Method int Bundle.size()>
	//*   4    8:icmpeq          13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			Iterator iterator = bundle.keySet().iterator();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #79  <Method Set Bundle.keySet()>
	//    9   17:invokeinterface #213 <Method Iterator Set.iterator()>
	//   10   22:astore_2        
			Object obj;
			Object obj1;
label1:
			do
			{
				do
				{
					do
					{
						if(!iterator.hasNext())
							break label0;
	//   11   23:aload_2         
	//   12   24:invokeinterface #218 <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            280
						String s = (String)iterator.next();
	//   14   32:aload_2         
	//   15   33:invokeinterface #222 <Method Object Iterator.next()>
	//   16   38:checkcast       #63  <Class String>
	//   17   41:astore_3        
						obj = bundle.get(s);
	//   18   42:aload_0         
	//   19   43:aload_3         
	//   20   44:invokevirtual   #100 <Method Object Bundle.get(String)>
	//   21   47:astore          4
						obj1 = bundle1.get(s);
	//   22   49:aload_1         
	//   23   50:aload_3         
	//   24   51:invokevirtual   #100 <Method Object Bundle.get(String)>
	//   25   54:astore          5
						if((obj instanceof Bundle) && (obj1 instanceof Bundle) && !b((Bundle)obj, (Bundle)obj1))
	//*  26   56:aload           4
	//*  27   58:instanceof      #53  <Class Bundle>
	//*  28   61:ifeq            90
	//*  29   64:aload           5
	//*  30   66:instanceof      #53  <Class Bundle>
	//*  31   69:ifeq            90
	//*  32   72:aload           4
	//*  33   74:checkcast       #53  <Class Bundle>
	//*  34   77:aload           5
	//*  35   79:checkcast       #53  <Class Bundle>
	//*  36   82:invokestatic    #73  <Method boolean b(Bundle, Bundle)>
	//*  37   85:ifne            90
							return false;
	//   38   88:iconst_0        
	//   39   89:ireturn         
						if(obj == null && (obj1 != null || !bundle1.containsKey(s)))
	//*  40   90:aload           4
	//*  41   92:ifnonnull       110
	//*  42   95:aload           5
	//*  43   97:ifnonnull       108
	//*  44  100:aload_1         
	//*  45  101:aload_3         
	//*  46  102:invokevirtual   #226 <Method boolean Bundle.containsKey(String)>
	//*  47  105:ifne            110
							return false;
	//   48  108:iconst_0        
	//   49  109:ireturn         
						if(obj instanceof boolean[])
	//*  50  110:aload           4
	//*  51  112:instanceof      #102 <Class boolean[]>
	//*  52  115:ifeq            144
						{
							if(!(obj1 instanceof boolean[]) || !Arrays.equals((boolean[])obj, (boolean[])obj1))
	//*  53  118:aload           5
	//*  54  120:instanceof      #102 <Class boolean[]>
	//*  55  123:ifeq            142
	//*  56  126:aload           4
	//*  57  128:checkcast       #102 <Class boolean[]>
	//*  58  131:aload           5
	//*  59  133:checkcast       #102 <Class boolean[]>
	//*  60  136:invokestatic    #230 <Method boolean Arrays.equals(boolean[], boolean[])>
	//*  61  139:ifne            23
								return false;
	//   62  142:iconst_0        
	//   63  143:ireturn         
							continue;
						}
						if(obj instanceof long[])
	//*  64  144:aload           4
	//*  65  146:instanceof      #120 <Class long[]>
	//*  66  149:ifeq            178
						{
							if(!(obj1 instanceof long[]) || !Arrays.equals((long[])obj, (long[])obj1))
	//*  67  152:aload           5
	//*  68  154:instanceof      #120 <Class long[]>
	//*  69  157:ifeq            176
	//*  70  160:aload           4
	//*  71  162:checkcast       #120 <Class long[]>
	//*  72  165:aload           5
	//*  73  167:checkcast       #120 <Class long[]>
	//*  74  170:invokestatic    #233 <Method boolean Arrays.equals(long[], long[])>
	//*  75  173:ifne            23
								return false;
	//   76  176:iconst_0        
	//   77  177:ireturn         
							continue;
						}
						if(!(obj instanceof double[]))
							break;
	//   78  178:aload           4
	//   79  180:instanceof      #125 <Class double[]>
	//   80  183:ifeq            212
						if(!(obj1 instanceof double[]) || !Arrays.equals((double[])obj, (double[])obj1))
	//*  81  186:aload           5
	//*  82  188:instanceof      #125 <Class double[]>
	//*  83  191:ifeq            210
	//*  84  194:aload           4
	//*  85  196:checkcast       #125 <Class double[]>
	//*  86  199:aload           5
	//*  87  201:checkcast       #125 <Class double[]>
	//*  88  204:invokestatic    #236 <Method boolean Arrays.equals(double[], double[])>
	//*  89  207:ifne            23
							return false;
	//   90  210:iconst_0        
	//   91  211:ireturn         
					} while(true);
					if(!(obj instanceof byte[]))
						continue label1;
	//   92  212:aload           4
	//   93  214:instanceof      #130 <Class byte[]>
	//   94  217:ifeq            246
				} while((obj1 instanceof byte[]) && Arrays.equals((byte[])obj, (byte[])obj1));
	//   95  220:aload           5
	//   96  222:instanceof      #130 <Class byte[]>
	//   97  225:ifeq            244
	//   98  228:aload           4
	//   99  230:checkcast       #130 <Class byte[]>
	//  100  233:aload           5
	//  101  235:checkcast       #130 <Class byte[]>
	//  102  238:invokestatic    #239 <Method boolean Arrays.equals(byte[], byte[])>
	//  103  241:ifne            23
				return false;
	//  104  244:iconst_0        
	//  105  245:ireturn         
			} while(!(obj instanceof Object[]) || (obj1 instanceof Object[]) && Arrays.equals((Object[])obj, (Object[])obj1));
	//  106  246:aload           4
	//  107  248:instanceof      #135 <Class Object[]>
	//  108  251:ifeq            23
	//  109  254:aload           5
	//  110  256:instanceof      #135 <Class Object[]>
	//  111  259:ifeq            278
	//  112  262:aload           4
	//  113  264:checkcast       #135 <Class Object[]>
	//  114  267:aload           5
	//  115  269:checkcast       #135 <Class Object[]>
	//  116  272:invokestatic    #242 <Method boolean Arrays.equals(Object[], Object[])>
	//  117  275:ifne            23
			return false;
	//  118  278:iconst_0        
	//  119  279:ireturn         
		}
		return true;
	//  120  280:iconst_1        
	//  121  281:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof Thing))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Thing>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Thing)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Thing>
	//   12   20:astore_1        
		return ak.a(((Object) (Integer.valueOf(a))), ((Object) (Integer.valueOf(((Thing) (obj)).a)))) && ak.a(((Object) (d)), ((Object) (((Thing) (obj)).d))) && ak.a(((Object) (e)), ((Object) (((Thing) (obj)).e))) && ak.a(((Object) (c)), ((Object) (((Thing) (obj)).c))) && b(b, ((Thing) (obj)).b);
	//   13   21:aload_0         
	//   14   22:getfield        #31  <Field int a>
	//   15   25:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   16   28:aload_1         
	//   17   29:getfield        #31  <Field int a>
	//   18   32:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   19   35:invokestatic    #245 <Method boolean ak.a(Object, Object)>
	//   20   38:ifeq            99
	//   21   41:aload_0         
	//   22   42:getfield        #37  <Field String d>
	//   23   45:aload_1         
	//   24   46:getfield        #37  <Field String d>
	//   25   49:invokestatic    #245 <Method boolean ak.a(Object, Object)>
	//   26   52:ifeq            99
	//   27   55:aload_0         
	//   28   56:getfield        #39  <Field String e>
	//   29   59:aload_1         
	//   30   60:getfield        #39  <Field String e>
	//   31   63:invokestatic    #245 <Method boolean ak.a(Object, Object)>
	//   32   66:ifeq            99
	//   33   69:aload_0         
	//   34   70:getfield        #35  <Field Thing$zza c>
	//   35   73:aload_1         
	//   36   74:getfield        #35  <Field Thing$zza c>
	//   37   77:invokestatic    #245 <Method boolean ak.a(Object, Object)>
	//   38   80:ifeq            99
	//   39   83:aload_0         
	//   40   84:getfield        #33  <Field Bundle b>
	//   41   87:aload_1         
	//   42   88:getfield        #33  <Field Bundle b>
	//   43   91:invokestatic    #73  <Method boolean b(Bundle, Bundle)>
	//   44   94:ifeq            99
	//   45   97:iconst_1        
	//   46   98:ireturn         
	//   47   99:iconst_0        
	//   48  100:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Integer.valueOf(a), d, e, Integer.valueOf(c.hashCode()), Integer.valueOf(b(b))
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field int a>
	//    6   10:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field String d>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #39  <Field String e>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #35  <Field Thing$zza c>
	//   22   34:invokevirtual   #249 <Method int Thing$zza.hashCode()>
	//   23   37:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:aload_0         
	//   28   44:getfield        #33  <Field Bundle b>
	//   29   47:invokestatic    #60  <Method int b(Bundle)>
	//   30   50:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   31   53:aastore         
	//   32   54:invokestatic    #142 <Method int ak.a(Object[])>
	//   33   57:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #168 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void StringBuilder()>
	//    3    7:astore_2        
		String s;
		if(e.equals("Thing"))
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field String e>
	//*   6   12:ldc1            #252 <String "Thing">
	//*   7   14:invokevirtual   #254 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            27
			s = "Indexable";
	//    9   20:ldc2            #256 <String "Indexable">
	//   10   23:astore_1        
		else
	//*  11   24:goto            32
			s = e;
	//   12   27:aload_0         
	//   13   28:getfield        #39  <Field String e>
	//   14   31:astore_1        
		stringbuilder.append(s);
	//   15   32:aload_2         
	//   16   33:aload_1         
	//   17   34:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		stringbuilder.append(" { { id: ");
	//   19   38:aload_2         
	//   20   39:ldc2            #258 <String " { { id: ">
	//   21   42:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		if(d == null)
	//*  23   46:aload_0         
	//*  24   47:getfield        #37  <Field String d>
	//*  25   50:ifnonnull       63
		{
			stringbuilder.append("<null>");
	//   26   53:aload_2         
	//   27   54:ldc1            #176 <String "<null>">
	//   28   56:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		} else
	//*  30   60:goto            86
		{
			stringbuilder.append("'");
	//   31   63:aload_2         
	//   32   64:ldc1            #190 <String "'">
	//   33   66:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   34   69:pop             
			stringbuilder.append(d);
	//   35   70:aload_2         
	//   36   71:aload_0         
	//   37   72:getfield        #37  <Field String d>
	//   38   75:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder.append("'");
	//   40   79:aload_2         
	//   41   80:ldc1            #190 <String "'">
	//   42   82:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
		}
		stringbuilder.append(" } Properties { ");
	//   44   86:aload_2         
	//   45   87:ldc2            #260 <String " } Properties { ">
	//   46   90:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
		b(b, stringbuilder);
	//   48   94:aload_0         
	//   49   95:getfield        #33  <Field Bundle b>
	//   50   98:aload_2         
	//   51   99:invokestatic    #70  <Method void b(Bundle, StringBuilder)>
		stringbuilder.append("} ");
	//   52  102:aload_2         
	//   53  103:ldc2            #262 <String "} ">
	//   54  106:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
		stringbuilder.append("Metadata { ");
	//   56  110:aload_2         
	//   57  111:ldc2            #264 <String "Metadata { ">
	//   58  114:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
		stringbuilder.append(c.toString());
	//   60  118:aload_2         
	//   61  119:aload_0         
	//   62  120:getfield        #35  <Field Thing$zza c>
	//   63  123:invokevirtual   #265 <Method String Thing$zza.toString()>
	//   64  126:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   65  129:pop             
		stringbuilder.append(" } ");
	//   66  130:aload_2         
	//   67  131:ldc1            #206 <String " } ">
	//   68  133:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   69  136:pop             
		stringbuilder.append("}");
	//   70  137:aload_2         
	//   71  138:ldc2            #267 <String "}">
	//   72  141:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   73  144:pop             
		return stringbuilder.toString();
	//   74  145:aload_2         
	//   75  146:invokevirtual   #268 <Method String StringBuilder.toString()>
	//   76  149:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #275 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field Bundle b>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #278 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (c)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #35  <Field Thing$zza c>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #281 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d, false);
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:getfield        #37  <Field String d>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #284 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e, false);
	//   22   36:aload_1         
	//   23   37:iconst_4        
	//   24   38:aload_0         
	//   25   39:getfield        #39  <Field String e>
	//   26   42:iconst_0        
	//   27   43:invokestatic    #284 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, a);
	//   28   46:aload_1         
	//   29   47:sipush          1000
	//   30   50:aload_0         
	//   31   51:getfield        #31  <Field int a>
	//   32   54:invokestatic    #287 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   33   57:aload_1         
	//   34   58:iload_3         
	//   35   59:invokestatic    #289 <Method void c.a(Parcel, int)>
	//   36   62:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	private final int a;
	private final Bundle b;
	private final zza c;
	private final String d;
	private final String e;

	static 
	{
	//    0    0:new             #21  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void b()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private class zza extends AbstractSafeParcelable
	{

		public final boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof zza))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class Thing$zza>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((zza)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class Thing$zza>
		//   12   20:astore_1        
			return ak.a(((Object) (Boolean.valueOf(a))), ((Object) (Boolean.valueOf(((zza) (obj)).a)))) && ak.a(((Object) (Integer.valueOf(b))), ((Object) (Integer.valueOf(((zza) (obj)).b)))) && ak.a(((Object) (c)), ((Object) (((zza) (obj)).c))) && Thing.a(d, ((zza) (obj)).d);
		//   13   21:aload_0         
		//   14   22:getfield        #28  <Field boolean a>
		//   15   25:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
		//   16   28:aload_1         
		//   17   29:getfield        #28  <Field boolean a>
		//   18   32:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
		//   19   35:invokestatic    #50  <Method boolean ak.a(Object, Object)>
		//   20   38:ifeq            91
		//   21   41:aload_0         
		//   22   42:getfield        #30  <Field int b>
		//   23   45:invokestatic    #55  <Method Integer Integer.valueOf(int)>
		//   24   48:aload_1         
		//   25   49:getfield        #30  <Field int b>
		//   26   52:invokestatic    #55  <Method Integer Integer.valueOf(int)>
		//   27   55:invokestatic    #50  <Method boolean ak.a(Object, Object)>
		//   28   58:ifeq            91
		//   29   61:aload_0         
		//   30   62:getfield        #32  <Field String c>
		//   31   65:aload_1         
		//   32   66:getfield        #32  <Field String c>
		//   33   69:invokestatic    #50  <Method boolean ak.a(Object, Object)>
		//   34   72:ifeq            91
		//   35   75:aload_0         
		//   36   76:getfield        #37  <Field Bundle d>
		//   37   79:aload_1         
		//   38   80:getfield        #37  <Field Bundle d>
		//   39   83:invokestatic    #60  <Method boolean Thing.a(Bundle, Bundle)>
		//   40   86:ifeq            91
		//   41   89:iconst_1        
		//   42   90:ireturn         
		//   43   91:iconst_0        
		//   44   92:ireturn         
		}

		public final int hashCode()
		{
			return ak.a(new Object[] {
				Boolean.valueOf(a), Integer.valueOf(b), c, Integer.valueOf(Thing.a(d))
			});
		//    0    0:iconst_4        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #28  <Field boolean a>
		//    6   10:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
		//    7   13:aastore         
		//    8   14:dup             
		//    9   15:iconst_1        
		//   10   16:aload_0         
		//   11   17:getfield        #30  <Field int b>
		//   12   20:invokestatic    #55  <Method Integer Integer.valueOf(int)>
		//   13   23:aastore         
		//   14   24:dup             
		//   15   25:iconst_2        
		//   16   26:aload_0         
		//   17   27:getfield        #32  <Field String c>
		//   18   30:aastore         
		//   19   31:dup             
		//   20   32:iconst_3        
		//   21   33:aload_0         
		//   22   34:getfield        #37  <Field Bundle d>
		//   23   37:invokestatic    #67  <Method int Thing.a(Bundle)>
		//   24   40:invokestatic    #55  <Method Integer Integer.valueOf(int)>
		//   25   43:aastore         
		//   26   44:invokestatic    #70  <Method int ak.a(Object[])>
		//   27   47:ireturn         
		}

		public final String toString()
		{
			StringBuilder stringbuilder = new StringBuilder("worksOffline: ");
		//    0    0:new             #74  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:ldc1            #76  <String "worksOffline: ">
		//    3    6:invokespecial   #79  <Method void StringBuilder(String)>
		//    4    9:astore_1        
			stringbuilder.append(a);
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #28  <Field boolean a>
		//    8   15:invokevirtual   #83  <Method StringBuilder StringBuilder.append(boolean)>
		//    9   18:pop             
			stringbuilder.append(", score: ");
		//   10   19:aload_1         
		//   11   20:ldc1            #85  <String ", score: ">
		//   12   22:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
		//   13   25:pop             
			stringbuilder.append(b);
		//   14   26:aload_1         
		//   15   27:aload_0         
		//   16   28:getfield        #30  <Field int b>
		//   17   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
		//   18   34:pop             
			if(!c.isEmpty())
		//*  19   35:aload_0         
		//*  20   36:getfield        #32  <Field String c>
		//*  21   39:invokevirtual   #97  <Method boolean String.isEmpty()>
		//*  22   42:ifne            61
			{
				stringbuilder.append(", accountEmail: ");
		//   23   45:aload_1         
		//   24   46:ldc1            #99  <String ", accountEmail: ">
		//   25   48:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
		//   26   51:pop             
				stringbuilder.append(c);
		//   27   52:aload_1         
		//   28   53:aload_0         
		//   29   54:getfield        #32  <Field String c>
		//   30   57:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
		//   31   60:pop             
			}
			Bundle bundle = d;
		//   32   61:aload_0         
		//   33   62:getfield        #37  <Field Bundle d>
		//   34   65:astore_2        
			if(bundle != null && !bundle.isEmpty())
		//*  35   66:aload_2         
		//*  36   67:ifnull          99
		//*  37   70:aload_2         
		//*  38   71:invokevirtual   #100 <Method boolean Bundle.isEmpty()>
		//*  39   74:ifne            99
			{
				stringbuilder.append(", Properties { ");
		//   40   77:aload_1         
		//   41   78:ldc1            #102 <String ", Properties { ">
		//   42   80:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
		//   43   83:pop             
				Thing.a(d, stringbuilder);
		//   44   84:aload_0         
		//   45   85:getfield        #37  <Field Bundle d>
		//   46   88:aload_1         
		//   47   89:invokestatic    #105 <Method void Thing.a(Bundle, StringBuilder)>
				stringbuilder.append("}");
		//   48   92:aload_1         
		//   49   93:ldc1            #107 <String "}">
		//   50   95:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
		//   51   98:pop             
			}
			return stringbuilder.toString();
		//   52   99:aload_1         
		//   53  100:invokevirtual   #109 <Method String StringBuilder.toString()>
		//   54  103:areturn         
		}

		public final void writeToParcel(Parcel parcel, int i)
		{
			i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #116 <Method int c.a(Parcel)>
		//    2    4:istore_2        
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #28  <Field boolean a>
		//    7   11:invokestatic    #119 <Method void c.a(Parcel, int, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #30  <Field int b>
		//   12   20:invokestatic    #122 <Method void c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
		//   13   23:aload_1         
		//   14   24:iconst_3        
		//   15   25:aload_0         
		//   16   26:getfield        #32  <Field String c>
		//   17   29:iconst_0        
		//   18   30:invokestatic    #125 <Method void c.a(Parcel, int, String, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
		//   19   33:aload_1         
		//   20   34:iconst_4        
		//   21   35:aload_0         
		//   22   36:getfield        #37  <Field Bundle d>
		//   23   39:iconst_0        
		//   24   40:invokestatic    #128 <Method void c.a(Parcel, int, Bundle, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
		//   25   43:aload_1         
		//   26   44:iload_2         
		//   27   45:invokestatic    #130 <Method void c.a(Parcel, int)>
		//   28   48:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new e();
		private final boolean a;
		private final int b;
		private final String c;
		private final Bundle d;

		static 
		{
		//    0    0:new             #18  <Class e>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void e()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public zza(boolean flag, int i, String s, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void AbstractSafeParcelable()>
			a = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #28  <Field boolean a>
			b = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #30  <Field int b>
			c = s;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #32  <Field String c>
			s = ((String) (bundle));
		//   11   19:aload           4
		//   12   21:astore_3        
			if(bundle == null)
		//*  13   22:aload           4
		//*  14   24:ifnonnull       35
				s = ((String) (new Bundle()));
		//   15   27:new             #34  <Class Bundle>
		//   16   30:dup             
		//   17   31:invokespecial   #35  <Method void Bundle()>
		//   18   34:astore_3        
			d = ((Bundle) (s));
		//   19   35:aload_0         
		//   20   36:aload_3         
		//   21   37:putfield        #37  <Field Bundle d>
		//   22   40:return          
		}
	}

}
