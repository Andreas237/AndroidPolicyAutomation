// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			l, j, k, Fragment, 
//			ah

final class BackStackState
	implements Parcelable
{

	public BackStackState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		a = parcel.createIntArray();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method int[] Parcel.createIntArray()>
	//    5    9:putfield        #46  <Field int[] a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #50  <Method int Parcel.readInt()>
	//    9   17:putfield        #52  <Field int b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #50  <Method int Parcel.readInt()>
	//   13   25:putfield        #54  <Field int c>
		d = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #58  <Method String Parcel.readString()>
	//   17   33:putfield        #60  <Field String d>
		e = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #50  <Method int Parcel.readInt()>
	//   21   41:putfield        #62  <Field int e>
		f = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #50  <Method int Parcel.readInt()>
	//   25   49:putfield        #64  <Field int f>
		g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #69  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #75  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #77  <Class CharSequence>
	//   31   65:putfield        #79  <Field CharSequence g>
		h = parcel.readInt();
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokevirtual   #50  <Method int Parcel.readInt()>
	//   35   73:putfield        #81  <Field int h>
		i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   36   76:aload_0         
	//   37   77:getstatic       #69  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   38   80:aload_1         
	//   39   81:invokeinterface #75  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   40   86:checkcast       #77  <Class CharSequence>
	//   41   89:putfield        #83  <Field CharSequence i>
		j = parcel.createStringArrayList();
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:invokevirtual   #87  <Method ArrayList Parcel.createStringArrayList()>
	//   45   97:putfield        #89  <Field ArrayList j>
		k = parcel.createStringArrayList();
	//   46  100:aload_0         
	//   47  101:aload_1         
	//   48  102:invokevirtual   #87  <Method ArrayList Parcel.createStringArrayList()>
	//   49  105:putfield        #91  <Field ArrayList k>
		boolean flag;
		if(parcel.readInt() != 0)
	//*  50  108:aload_1         
	//*  51  109:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  52  112:ifeq            120
			flag = true;
	//   53  115:iconst_1        
	//   54  116:istore_2        
		else
	//*  55  117:goto            122
			flag = false;
	//   56  120:iconst_0        
	//   57  121:istore_2        
		l = flag;
	//   58  122:aload_0         
	//   59  123:iload_2         
	//   60  124:putfield        #93  <Field boolean l>
	//   61  127:return          
	}

	public BackStackState(j j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		int l1 = j1.b.size();
	//    2    4:aload_1         
	//    3    5:getfield        #98  <Field ArrayList j.b>
	//    4    8:invokevirtual   #103 <Method int ArrayList.size()>
	//    5   11:istore          4
		a = new int[l1 * 6];
	//    6   13:aload_0         
	//    7   14:iload           4
	//    8   16:bipush          6
	//    9   18:imul            
	//   10   19:newarray        int[]
	//   11   21:putfield        #46  <Field int[] a>
		if(j1.i)
	//*  12   24:aload_1         
	//*  13   25:getfield        #105 <Field boolean j.i>
	//*  14   28:ifeq            287
		{
			int i1 = 0;
	//   15   31:iconst_0        
	//   16   32:istore_2        
			for(int k1 = 0; i1 < l1; k1++)
	//*  17   33:iconst_0        
	//*  18   34:istore_3        
	//*  19   35:iload_2         
	//*  20   36:iload           4
	//*  21   38:icmpge          198
			{
				k k2 = (k)j1.b.get(i1);
	//   22   41:aload_1         
	//   23   42:getfield        #98  <Field ArrayList j.b>
	//   24   45:iload_2         
	//   25   46:invokevirtual   #109 <Method Object ArrayList.get(int)>
	//   26   49:checkcast       #111 <Class k>
	//   27   52:astore          7
				int ai[] = a;
	//   28   54:aload_0         
	//   29   55:getfield        #46  <Field int[] a>
	//   30   58:astore          8
				int i2 = k1 + 1;
	//   31   60:iload_3         
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore          5
				ai[k1] = k2.a;
	//   35   65:aload           8
	//   36   67:iload_3         
	//   37   68:aload           7
	//   38   70:getfield        #113 <Field int k.a>
	//   39   73:iastore         
				ai = a;
	//   40   74:aload_0         
	//   41   75:getfield        #46  <Field int[] a>
	//   42   78:astore          8
				int j2 = i2 + 1;
	//   43   80:iload           5
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore          6
				if(k2.b != null)
	//*  47   86:aload           7
	//*  48   88:getfield        #116 <Field Fragment k.b>
	//*  49   91:ifnull          106
					k1 = k2.b.mIndex;
	//   50   94:aload           7
	//   51   96:getfield        #116 <Field Fragment k.b>
	//   52   99:getfield        #121 <Field int Fragment.mIndex>
	//   53  102:istore_3        
				else
	//*  54  103:goto            108
					k1 = -1;
	//   55  106:iconst_m1       
	//   56  107:istore_3        
				ai[i2] = k1;
	//   57  108:aload           8
	//   58  110:iload           5
	//   59  112:iload_3         
	//   60  113:iastore         
				ai = a;
	//   61  114:aload_0         
	//   62  115:getfield        #46  <Field int[] a>
	//   63  118:astore          8
				k1 = j2 + 1;
	//   64  120:iload           6
	//   65  122:iconst_1        
	//   66  123:iadd            
	//   67  124:istore_3        
				ai[j2] = k2.c;
	//   68  125:aload           8
	//   69  127:iload           6
	//   70  129:aload           7
	//   71  131:getfield        #122 <Field int k.c>
	//   72  134:iastore         
				ai = a;
	//   73  135:aload_0         
	//   74  136:getfield        #46  <Field int[] a>
	//   75  139:astore          8
				i2 = k1 + 1;
	//   76  141:iload_3         
	//   77  142:iconst_1        
	//   78  143:iadd            
	//   79  144:istore          5
				ai[k1] = k2.d;
	//   80  146:aload           8
	//   81  148:iload_3         
	//   82  149:aload           7
	//   83  151:getfield        #124 <Field int k.d>
	//   84  154:iastore         
				ai = a;
	//   85  155:aload_0         
	//   86  156:getfield        #46  <Field int[] a>
	//   87  159:astore          8
				k1 = i2 + 1;
	//   88  161:iload           5
	//   89  163:iconst_1        
	//   90  164:iadd            
	//   91  165:istore_3        
				ai[i2] = k2.e;
	//   92  166:aload           8
	//   93  168:iload           5
	//   94  170:aload           7
	//   95  172:getfield        #125 <Field int k.e>
	//   96  175:iastore         
				a[k1] = k2.f;
	//   97  176:aload_0         
	//   98  177:getfield        #46  <Field int[] a>
	//   99  180:iload_3         
	//  100  181:aload           7
	//  101  183:getfield        #126 <Field int k.f>
	//  102  186:iastore         
				i1++;
	//  103  187:iload_2         
	//  104  188:iconst_1        
	//  105  189:iadd            
	//  106  190:istore_2        
			}

	//  107  191:iload_3         
	//  108  192:iconst_1        
	//  109  193:iadd            
	//  110  194:istore_3        
	//* 111  195:goto            35
			b = j1.g;
	//  112  198:aload_0         
	//  113  199:aload_1         
	//  114  200:getfield        #128 <Field int j.g>
	//  115  203:putfield        #52  <Field int b>
			c = j1.h;
	//  116  206:aload_0         
	//  117  207:aload_1         
	//  118  208:getfield        #129 <Field int j.h>
	//  119  211:putfield        #54  <Field int c>
			d = j1.k;
	//  120  214:aload_0         
	//  121  215:aload_1         
	//  122  216:getfield        #131 <Field String j.k>
	//  123  219:putfield        #60  <Field String d>
			e = j1.m;
	//  124  222:aload_0         
	//  125  223:aload_1         
	//  126  224:getfield        #134 <Field int j.m>
	//  127  227:putfield        #62  <Field int e>
			f = j1.n;
	//  128  230:aload_0         
	//  129  231:aload_1         
	//  130  232:getfield        #137 <Field int j.n>
	//  131  235:putfield        #64  <Field int f>
			g = j1.o;
	//  132  238:aload_0         
	//  133  239:aload_1         
	//  134  240:getfield        #140 <Field CharSequence j.o>
	//  135  243:putfield        #79  <Field CharSequence g>
			h = j1.p;
	//  136  246:aload_0         
	//  137  247:aload_1         
	//  138  248:getfield        #143 <Field int j.p>
	//  139  251:putfield        #81  <Field int h>
			i = j1.q;
	//  140  254:aload_0         
	//  141  255:aload_1         
	//  142  256:getfield        #146 <Field CharSequence j.q>
	//  143  259:putfield        #83  <Field CharSequence i>
			j = j1.r;
	//  144  262:aload_0         
	//  145  263:aload_1         
	//  146  264:getfield        #149 <Field ArrayList j.r>
	//  147  267:putfield        #89  <Field ArrayList j>
			k = j1.s;
	//  148  270:aload_0         
	//  149  271:aload_1         
	//  150  272:getfield        #152 <Field ArrayList j.s>
	//  151  275:putfield        #91  <Field ArrayList k>
			l = j1.t;
	//  152  278:aload_0         
	//  153  279:aload_1         
	//  154  280:getfield        #155 <Field boolean j.t>
	//  155  283:putfield        #93  <Field boolean l>
			return;
	//  156  286:return          
		} else
		{
			throw new IllegalStateException("Not on back stack");
	//  157  287:new             #157 <Class IllegalStateException>
	//  158  290:dup             
	//  159  291:ldc1            #159 <String "Not on back stack">
	//  160  293:invokespecial   #162 <Method void IllegalStateException(String)>
	//  161  296:athrow          
		}
	}

	public j a(ah ah1)
	{
		j j2 = new j(ah1);
	//    0    0:new             #96  <Class j>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #166 <Method void j(ah)>
	//    4    8:astore          5
		int j1 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		int i1 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		int k1;
		for(; j1 < a.length; j1 = k1 + 1)
	//*   9   14:iload_3         
	//*  10   15:aload_0         
	//*  11   16:getfield        #46  <Field int[] a>
	//*  12   19:arraylength     
	//*  13   20:icmpge          297
		{
			k k2 = new k();
	//   14   23:new             #111 <Class k>
	//   15   26:dup             
	//   16   27:invokespecial   #167 <Method void k()>
	//   17   30:astore          6
			int ai[] = a;
	//   18   32:aload_0         
	//   19   33:getfield        #46  <Field int[] a>
	//   20   36:astore          7
			k1 = j1 + 1;
	//   21   38:iload_3         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore          4
			k2.a = ai[j1];
	//   25   43:aload           6
	//   26   45:aload           7
	//   27   47:iload_3         
	//   28   48:iaload          
	//   29   49:putfield        #113 <Field int k.a>
			if(ah.a)
	//*  30   52:getstatic       #171 <Field boolean ah.a>
	//*  31   55:ifeq            130
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   32   58:new             #173 <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #174 <Method void StringBuilder()>
	//   35   65:astore          7
				stringbuilder.append("Instantiate ");
	//   36   67:aload           7
	//   37   69:ldc1            #176 <String "Instantiate ">
	//   38   71:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
				stringbuilder.append(((Object) (j2)));
	//   40   75:aload           7
	//   41   77:aload           5
	//   42   79:invokevirtual   #183 <Method StringBuilder StringBuilder.append(Object)>
	//   43   82:pop             
				stringbuilder.append(" op #");
	//   44   83:aload           7
	//   45   85:ldc1            #185 <String " op #">
	//   46   87:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
				stringbuilder.append(i1);
	//   48   91:aload           7
	//   49   93:iload_2         
	//   50   94:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   51   97:pop             
				stringbuilder.append(" base fragment #");
	//   52   98:aload           7
	//   53  100:ldc1            #190 <String " base fragment #">
	//   54  102:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   55  105:pop             
				stringbuilder.append(a[k1]);
	//   56  106:aload           7
	//   57  108:aload_0         
	//   58  109:getfield        #46  <Field int[] a>
	//   59  112:iload           4
	//   60  114:iaload          
	//   61  115:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   62  118:pop             
				Log.v("FragmentManager", stringbuilder.toString());
	//   63  119:ldc1            #192 <String "FragmentManager">
	//   64  121:aload           7
	//   65  123:invokevirtual   #195 <Method String StringBuilder.toString()>
	//   66  126:invokestatic    #201 <Method int Log.v(String, String)>
	//   67  129:pop             
			}
			stringbuilder = ((StringBuilder) (a));
	//   68  130:aload_0         
	//   69  131:getfield        #46  <Field int[] a>
	//   70  134:astore          7
			j1 = k1 + 1;
	//   71  136:iload           4
	//   72  138:iconst_1        
	//   73  139:iadd            
	//   74  140:istore_3        
			k1 = stringbuilder[k1];
	//   75  141:aload           7
	//   76  143:iload           4
	//   77  145:iaload          
	//   78  146:istore          4
			if(k1 >= 0)
	//*  79  148:iload           4
	//*  80  150:iflt            173
				k2.b = (Fragment)ah1.f.get(k1);
	//   81  153:aload           6
	//   82  155:aload_1         
	//   83  156:getfield        #204 <Field SparseArray ah.f>
	//   84  159:iload           4
	//   85  161:invokevirtual   #207 <Method Object SparseArray.get(int)>
	//   86  164:checkcast       #118 <Class Fragment>
	//   87  167:putfield        #116 <Field Fragment k.b>
			else
	//*  88  170:goto            179
				k2.b = null;
	//   89  173:aload           6
	//   90  175:aconst_null     
	//   91  176:putfield        #116 <Field Fragment k.b>
			stringbuilder = ((StringBuilder) (a));
	//   92  179:aload_0         
	//   93  180:getfield        #46  <Field int[] a>
	//   94  183:astore          7
			k1 = j1 + 1;
	//   95  185:iload_3         
	//   96  186:iconst_1        
	//   97  187:iadd            
	//   98  188:istore          4
			k2.c = stringbuilder[j1];
	//   99  190:aload           6
	//  100  192:aload           7
	//  101  194:iload_3         
	//  102  195:iaload          
	//  103  196:putfield        #122 <Field int k.c>
			j1 = k1 + 1;
	//  104  199:iload           4
	//  105  201:iconst_1        
	//  106  202:iadd            
	//  107  203:istore_3        
			k2.d = stringbuilder[k1];
	//  108  204:aload           6
	//  109  206:aload           7
	//  110  208:iload           4
	//  111  210:iaload          
	//  112  211:putfield        #124 <Field int k.d>
			k1 = j1 + 1;
	//  113  214:iload_3         
	//  114  215:iconst_1        
	//  115  216:iadd            
	//  116  217:istore          4
			k2.e = stringbuilder[j1];
	//  117  219:aload           6
	//  118  221:aload           7
	//  119  223:iload_3         
	//  120  224:iaload          
	//  121  225:putfield        #125 <Field int k.e>
			k2.f = stringbuilder[k1];
	//  122  228:aload           6
	//  123  230:aload           7
	//  124  232:iload           4
	//  125  234:iaload          
	//  126  235:putfield        #126 <Field int k.f>
			j2.c = k2.c;
	//  127  238:aload           5
	//  128  240:aload           6
	//  129  242:getfield        #122 <Field int k.c>
	//  130  245:putfield        #208 <Field int j.c>
			j2.d = k2.d;
	//  131  248:aload           5
	//  132  250:aload           6
	//  133  252:getfield        #124 <Field int k.d>
	//  134  255:putfield        #209 <Field int j.d>
			j2.e = k2.e;
	//  135  258:aload           5
	//  136  260:aload           6
	//  137  262:getfield        #125 <Field int k.e>
	//  138  265:putfield        #210 <Field int j.e>
			j2.f = k2.f;
	//  139  268:aload           5
	//  140  270:aload           6
	//  141  272:getfield        #126 <Field int k.f>
	//  142  275:putfield        #211 <Field int j.f>
			j2.a(k2);
	//  143  278:aload           5
	//  144  280:aload           6
	//  145  282:invokevirtual   #214 <Method void j.a(k)>
			i1++;
	//  146  285:iload_2         
	//  147  286:iconst_1        
	//  148  287:iadd            
	//  149  288:istore_2        
		}

	//  150  289:iload           4
	//  151  291:iconst_1        
	//  152  292:iadd            
	//  153  293:istore_3        
	//* 154  294:goto            14
		j2.g = b;
	//  155  297:aload           5
	//  156  299:aload_0         
	//  157  300:getfield        #52  <Field int b>
	//  158  303:putfield        #128 <Field int j.g>
		j2.h = c;
	//  159  306:aload           5
	//  160  308:aload_0         
	//  161  309:getfield        #54  <Field int c>
	//  162  312:putfield        #129 <Field int j.h>
		j2.k = d;
	//  163  315:aload           5
	//  164  317:aload_0         
	//  165  318:getfield        #60  <Field String d>
	//  166  321:putfield        #131 <Field String j.k>
		j2.m = e;
	//  167  324:aload           5
	//  168  326:aload_0         
	//  169  327:getfield        #62  <Field int e>
	//  170  330:putfield        #134 <Field int j.m>
		j2.i = true;
	//  171  333:aload           5
	//  172  335:iconst_1        
	//  173  336:putfield        #105 <Field boolean j.i>
		j2.n = f;
	//  174  339:aload           5
	//  175  341:aload_0         
	//  176  342:getfield        #64  <Field int f>
	//  177  345:putfield        #137 <Field int j.n>
		j2.o = g;
	//  178  348:aload           5
	//  179  350:aload_0         
	//  180  351:getfield        #79  <Field CharSequence g>
	//  181  354:putfield        #140 <Field CharSequence j.o>
		j2.p = h;
	//  182  357:aload           5
	//  183  359:aload_0         
	//  184  360:getfield        #81  <Field int h>
	//  185  363:putfield        #143 <Field int j.p>
		j2.q = i;
	//  186  366:aload           5
	//  187  368:aload_0         
	//  188  369:getfield        #83  <Field CharSequence i>
	//  189  372:putfield        #146 <Field CharSequence j.q>
		j2.r = j;
	//  190  375:aload           5
	//  191  377:aload_0         
	//  192  378:getfield        #89  <Field ArrayList j>
	//  193  381:putfield        #149 <Field ArrayList j.r>
		j2.s = k;
	//  194  384:aload           5
	//  195  386:aload_0         
	//  196  387:getfield        #91  <Field ArrayList k>
	//  197  390:putfield        #152 <Field ArrayList j.s>
		j2.t = l;
	//  198  393:aload           5
	//  199  395:aload_0         
	//  200  396:getfield        #93  <Field boolean l>
	//  201  399:putfield        #155 <Field boolean j.t>
		j2.a(1);
	//  202  402:aload           5
	//  203  404:iconst_1        
	//  204  405:invokevirtual   #217 <Method void j.a(int)>
		return j2;
	//  205  408:aload           5
	//  206  410:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #222 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #224 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #227 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new l();
	final int a[];
	final int b;
	final int c;
	final String d;
	final int e;
	final int f;
	final CharSequence g;
	final int h;
	final CharSequence i;
	final ArrayList j;
	final ArrayList k;
	final boolean l;

	static 
	{
	//    0    0:new             #30  <Class l>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void l()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
