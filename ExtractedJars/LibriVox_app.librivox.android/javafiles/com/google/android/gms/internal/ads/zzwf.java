// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bvx, bwk, zv

public class zzwf extends AbstractSafeParcelable
{

	public zzwf()
	{
		this("interstitial_mb", 0, 0, true, 0, 0, ((zzwf []) (null)), false, false, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "interstitial_mb">
	//    2    3:iconst_0        
	//    3    4:iconst_0        
	//    4    5:iconst_1        
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:aconst_null     
	//    8    9:iconst_0        
	//    9   10:iconst_0        
	//   10   11:iconst_0        
	//   11   12:invokespecial   #36  <Method void zzwf(String, int, int, boolean, int, int, zzwf[], boolean, boolean, boolean)>
	//   12   15:return          
	}

	public zzwf(Context context, f f1)
	{
		this(context, new f[] {
			f1
		});
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:anewarray       f[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:invokespecial   #42  <Method void zzwf(Context, f[])>
	//    9   13:return          
	}

	public zzwf(Context context, f af[])
	{
		int l;
		boolean flag;
		boolean flag1;
		f f1;
		DisplayMetrics displaymetrics;
label0:
		{
label1:
			{
label2:
				{
					super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
					f1 = af[0];
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:aaload          
	//    5    7:astore          11
					d = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #45  <Field boolean d>
					i = f1.c();
	//    9   14:aload_0         
	//   10   15:aload           11
	//   11   17:invokevirtual   #48  <Method boolean f.c()>
	//   12   20:putfield        #50  <Field boolean i>
					if(i)
	//*  13   23:aload_0         
	//*  14   24:getfield        #50  <Field boolean i>
	//*  15   27:ifeq            53
					{
						e = f.a.b();
	//   16   30:aload_0         
	//   17   31:getstatic       #53  <Field f f.a>
	//   18   34:invokevirtual   #56  <Method int f.b()>
	//   19   37:putfield        #58  <Field int e>
						b = f.a.a();
	//   20   40:aload_0         
	//   21   41:getstatic       #53  <Field f f.a>
	//   22   44:invokevirtual   #60  <Method int f.a()>
	//   23   47:putfield        #62  <Field int b>
					} else
	//*  24   50:goto            71
					{
						e = f1.b();
	//   25   53:aload_0         
	//   26   54:aload           11
	//   27   56:invokevirtual   #56  <Method int f.b()>
	//   28   59:putfield        #58  <Field int e>
						b = f1.a();
	//   29   62:aload_0         
	//   30   63:aload           11
	//   31   65:invokevirtual   #60  <Method int f.a()>
	//   32   68:putfield        #62  <Field int b>
					}
					if(e == -1)
	//*  33   71:aload_0         
	//*  34   72:getfield        #58  <Field int e>
	//*  35   75:iconst_m1       
	//*  36   76:icmpne          85
						flag = true;
	//   37   79:iconst_1        
	//   38   80:istore          8
					else
	//*  39   82:goto            88
						flag = false;
	//   40   85:iconst_0        
	//   41   86:istore          8
					if(b == -2)
	//*  42   88:aload_0         
	//*  43   89:getfield        #62  <Field int b>
	//*  44   92:bipush          -2
	//*  45   94:icmpne          103
						flag1 = true;
	//   46   97:iconst_1        
	//   47   98:istore          9
					else
	//*  48  100:goto            106
						flag1 = false;
	//   49  103:iconst_0        
	//   50  104:istore          9
					displaymetrics = context.getResources().getDisplayMetrics();
	//   51  106:aload_1         
	//   52  107:invokevirtual   #68  <Method Resources Context.getResources()>
	//   53  110:invokevirtual   #74  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   54  113:astore          12
					if(!flag)
						break label1;
	//   55  115:iload           8
	//   56  117:ifeq            233
					bwk.a();
	//   57  120:invokestatic    #79  <Method zv bwk.a()>
	//   58  123:pop             
					if(zv.d(context))
	//*  59  124:aload_1         
	//*  60  125:invokestatic    #84  <Method boolean zv.d(Context)>
	//*  61  128:ifeq            167
					{
						bwk.a();
	//   62  131:invokestatic    #79  <Method zv bwk.a()>
	//   63  134:pop             
						if(zv.e(context))
	//*  64  135:aload_1         
	//*  65  136:invokestatic    #86  <Method boolean zv.e(Context)>
	//*  66  139:ifeq            167
						{
							int k = displaymetrics.widthPixels;
	//   67  142:aload           12
	//   68  144:getfield        #91  <Field int DisplayMetrics.widthPixels>
	//   69  147:istore          7
							bwk.a();
	//   70  149:invokestatic    #79  <Method zv bwk.a()>
	//   71  152:pop             
							f = k - com.google.android.gms.internal.ads.zv.f(context);
	//   72  153:aload_0         
	//   73  154:iload           7
	//   74  156:aload_1         
	//   75  157:invokestatic    #94  <Method int com.google.android.gms.internal.ads.zv.f(Context)>
	//   76  160:isub            
	//   77  161:putfield        #96  <Field int f>
							break label2;
	//   78  164:goto            176
						}
					}
					f = displaymetrics.widthPixels;
	//   79  167:aload_0         
	//   80  168:aload           12
	//   81  170:getfield        #91  <Field int DisplayMetrics.widthPixels>
	//   82  173:putfield        #96  <Field int f>
				}
				double d1 = (float)f / displaymetrics.density;
	//   83  176:aload_0         
	//   84  177:getfield        #96  <Field int f>
	//   85  180:i2f             
	//   86  181:aload           12
	//   87  183:getfield        #100 <Field float DisplayMetrics.density>
	//   88  186:fdiv            
	//   89  187:f2d             
	//   90  188:dstore_3        
				int j1 = (int)d1;
	//   91  189:dload_3         
	//   92  190:d2i             
	//   93  191:istore          10
				double d2 = j1;
	//   94  193:iload           10
	//   95  195:i2d             
	//   96  196:dstore          5
				Double.isNaN(d1);
	//   97  198:dload_3         
	//   98  199:invokestatic    #106 <Method boolean Double.isNaN(double)>
	//   99  202:pop             
				Double.isNaN(d2);
	//  100  203:dload           5
	//  101  205:invokestatic    #106 <Method boolean Double.isNaN(double)>
	//  102  208:pop             
				l = j1;
	//  103  209:iload           10
	//  104  211:istore          7
				if(d1 - d2 >= 0.01D)
	//* 105  213:dload_3         
	//* 106  214:dload           5
	//* 107  216:dsub            
	//* 108  217:ldc2w           #107 <Double 0.01D>
	//* 109  220:dcmpl           
	//* 110  221:iflt            256
					l = j1 + 1;
	//  111  224:iload           10
	//  112  226:iconst_1        
	//  113  227:iadd            
	//  114  228:istore          7
				break label0;
	//  115  230:goto            256
			}
			l = e;
	//  116  233:aload_0         
	//  117  234:getfield        #58  <Field int e>
	//  118  237:istore          7
			bwk.a();
	//  119  239:invokestatic    #79  <Method zv bwk.a()>
	//  120  242:pop             
			f = zv.a(displaymetrics, e);
	//  121  243:aload_0         
	//  122  244:aload           12
	//  123  246:aload_0         
	//  124  247:getfield        #58  <Field int e>
	//  125  250:invokestatic    #111 <Method int zv.a(DisplayMetrics, int)>
	//  126  253:putfield        #96  <Field int f>
		}
		int k1;
		if(flag1)
	//* 127  256:iload           9
	//* 128  258:ifeq            271
			k1 = c(displaymetrics);
	//  129  261:aload           12
	//  130  263:invokestatic    #114 <Method int c(DisplayMetrics)>
	//  131  266:istore          10
		else
	//* 132  268:goto            277
			k1 = b;
	//  133  271:aload_0         
	//  134  272:getfield        #62  <Field int b>
	//  135  275:istore          10
		bwk.a();
	//  136  277:invokestatic    #79  <Method zv bwk.a()>
	//  137  280:pop             
		c = zv.a(displaymetrics, k1);
	//  138  281:aload_0         
	//  139  282:aload           12
	//  140  284:iload           10
	//  141  286:invokestatic    #111 <Method int zv.a(DisplayMetrics, int)>
	//  142  289:putfield        #116 <Field int c>
		if(!flag && !flag1)
	//* 143  292:iload           8
	//* 144  294:ifne            333
	//* 145  297:iload           9
	//* 146  299:ifeq            305
	//* 147  302:goto            333
		{
			if(i)
	//* 148  305:aload_0         
	//* 149  306:getfield        #50  <Field boolean i>
	//* 150  309:ifeq            321
				a = "320x50_mb";
	//  151  312:aload_0         
	//  152  313:ldc1            #118 <String "320x50_mb">
	//  153  315:putfield        #120 <Field String a>
			else
	//* 154  318:goto            385
				a = f1.toString();
	//  155  321:aload_0         
	//  156  322:aload           11
	//  157  324:invokevirtual   #124 <Method String f.toString()>
	//  158  327:putfield        #120 <Field String a>
		} else
	//* 159  330:goto            385
		{
			StringBuilder stringbuilder = new StringBuilder(26);
	//  160  333:new             #126 <Class StringBuilder>
	//  161  336:dup             
	//  162  337:bipush          26
	//  163  339:invokespecial   #129 <Method void StringBuilder(int)>
	//  164  342:astore          11
			stringbuilder.append(l);
	//  165  344:aload           11
	//  166  346:iload           7
	//  167  348:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//  168  351:pop             
			stringbuilder.append("x");
	//  169  352:aload           11
	//  170  354:ldc1            #135 <String "x">
	//  171  356:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  172  359:pop             
			stringbuilder.append(k1);
	//  173  360:aload           11
	//  174  362:iload           10
	//  175  364:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//  176  367:pop             
			stringbuilder.append("_as");
	//  177  368:aload           11
	//  178  370:ldc1            #140 <String "_as">
	//  179  372:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  180  375:pop             
			a = stringbuilder.toString();
	//  181  376:aload_0         
	//  182  377:aload           11
	//  183  379:invokevirtual   #141 <Method String StringBuilder.toString()>
	//  184  382:putfield        #120 <Field String a>
		}
		if(af.length > 1)
	//* 185  385:aload_2         
	//* 186  386:arraylength     
	//* 187  387:iconst_1        
	//* 188  388:icmple          438
		{
			g = new zzwf[af.length];
	//  189  391:aload_0         
	//  190  392:aload_2         
	//  191  393:arraylength     
	//  192  394:anewarray       zzwf[]
	//  193  397:putfield        #143 <Field zzwf[] g>
			for(int i1 = 0; i1 < af.length; i1++)
	//* 194  400:iconst_0        
	//* 195  401:istore          7
	//* 196  403:iload           7
	//* 197  405:aload_2         
	//* 198  406:arraylength     
	//* 199  407:icmpge          443
				g[i1] = new zzwf(context, af[i1]);
	//  200  410:aload_0         
	//  201  411:getfield        #143 <Field zzwf[] g>
	//  202  414:iload           7
	//  203  416:new             #2   <Class zzwf>
	//  204  419:dup             
	//  205  420:aload_1         
	//  206  421:aload_2         
	//  207  422:iload           7
	//  208  424:aaload          
	//  209  425:invokespecial   #145 <Method void zzwf(Context, f)>
	//  210  428:aastore         

	//  211  429:iload           7
	//  212  431:iconst_1        
	//  213  432:iadd            
	//  214  433:istore          7
		} else
	//* 215  435:goto            403
		{
			g = null;
	//  216  438:aload_0         
	//  217  439:aconst_null     
	//  218  440:putfield        #143 <Field zzwf[] g>
		}
		h = false;
	//  219  443:aload_0         
	//  220  444:iconst_0        
	//  221  445:putfield        #147 <Field boolean h>
		j = false;
	//  222  448:aload_0         
	//  223  449:iconst_0        
	//  224  450:putfield        #149 <Field boolean j>
	//  225  453:return          
	}

	public zzwf(zzwf zzwf1, zzwf azzwf[])
	{
		this(zzwf1.a, zzwf1.b, zzwf1.c, zzwf1.d, zzwf1.e, zzwf1.f, azzwf, zzwf1.h, zzwf1.i, zzwf1.j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #120 <Field String a>
	//    3    5:aload_1         
	//    4    6:getfield        #62  <Field int b>
	//    5    9:aload_1         
	//    6   10:getfield        #116 <Field int c>
	//    7   13:aload_1         
	//    8   14:getfield        #45  <Field boolean d>
	//    9   17:aload_1         
	//   10   18:getfield        #58  <Field int e>
	//   11   21:aload_1         
	//   12   22:getfield        #96  <Field int f>
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:getfield        #147 <Field boolean h>
	//   16   30:aload_1         
	//   17   31:getfield        #50  <Field boolean i>
	//   18   34:aload_1         
	//   19   35:getfield        #149 <Field boolean j>
	//   20   38:invokespecial   #36  <Method void zzwf(String, int, int, boolean, int, int, zzwf[], boolean, boolean, boolean)>
	//   21   41:return          
	}

	zzwf(String s, int k, int l, boolean flag, int i1, int j1, zzwf azzwf[], 
			boolean flag1, boolean flag2, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #120 <Field String a>
		b = k;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #62  <Field int b>
		c = l;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #116 <Field int c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #45  <Field boolean d>
		e = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #58  <Field int e>
		f = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #96  <Field int f>
		g = azzwf;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #143 <Field zzwf[] g>
		h = flag1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #147 <Field boolean h>
		i = flag2;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #50  <Field boolean i>
		j = flag3;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #149 <Field boolean j>
	//   32   61:return          
	}

	public static int a(DisplayMetrics displaymetrics)
	{
		return displaymetrics.widthPixels;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int DisplayMetrics.widthPixels>
	//    2    4:ireturn         
	}

	public static zzwf a()
	{
		return new zzwf("reward_mb", 0, 0, true, 0, 0, ((zzwf []) (null)), false, false, false);
	//    0    0:new             #2   <Class zzwf>
	//    1    3:dup             
	//    2    4:ldc1            #153 <String "reward_mb">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:iconst_1        
	//    6    9:iconst_0        
	//    7   10:iconst_0        
	//    8   11:aconst_null     
	//    9   12:iconst_0        
	//   10   13:iconst_0        
	//   11   14:iconst_0        
	//   12   15:invokespecial   #36  <Method void zzwf(String, int, int, boolean, int, int, zzwf[], boolean, boolean, boolean)>
	//   13   18:areturn         
	}

	public static zzwf a(Context context)
	{
		return new zzwf("320x50_mb", 0, 0, false, 0, 0, ((zzwf []) (null)), true, false, false);
	//    0    0:new             #2   <Class zzwf>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "320x50_mb">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:iconst_0        
	//    7   10:iconst_0        
	//    8   11:aconst_null     
	//    9   12:iconst_1        
	//   10   13:iconst_0        
	//   11   14:iconst_0        
	//   12   15:invokespecial   #36  <Method void zzwf(String, int, int, boolean, int, int, zzwf[], boolean, boolean, boolean)>
	//   13   18:areturn         
	}

	public static int b(DisplayMetrics displaymetrics)
	{
		return (int)((float)c(displaymetrics) * displaymetrics.density);
	//    0    0:aload_0         
	//    1    1:invokestatic    #114 <Method int c(DisplayMetrics)>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #100 <Field float DisplayMetrics.density>
	//    5    9:fmul            
	//    6   10:f2i             
	//    7   11:ireturn         
	}

	private static int c(DisplayMetrics displaymetrics)
	{
		int k = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field int DisplayMetrics.heightPixels>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #100 <Field float DisplayMetrics.density>
	//    5    9:fdiv            
	//    6   10:f2i             
	//    7   11:istore_1        
		if(k <= 400)
	//*   8   12:iload_1         
	//*   9   13:sipush          400
	//*  10   16:icmpgt          22
			return 32;
	//   11   19:bipush          32
	//   12   21:ireturn         
		return k > 720 ? 90 : 50;
	//   13   22:iload_1         
	//   14   23:sipush          720
	//   15   26:icmpgt          32
	//   16   29:bipush          50
	//   17   31:ireturn         
	//   18   32:bipush          90
	//   19   34:ireturn         
	}

	public final f b()
	{
		return t.a(e, b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int e>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field int b>
	//    4    8:aload_0         
	//    5    9:getfield        #120 <Field String a>
	//    6   12:invokestatic    #163 <Method f t.a(int, int, String)>
	//    7   15:areturn         
	}

	public void writeToParcel(Parcel parcel, int k)
	{
		int l = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #170 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #120 <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #173 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #62  <Field int b>
	//   13   21:invokestatic    #176 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #116 <Field int c>
	//   18   30:invokestatic    #176 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #45  <Field boolean d>
	//   23   39:invokestatic    #179 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #58  <Field int e>
	//   28   49:invokestatic    #176 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f);
	//   29   52:aload_1         
	//   30   53:bipush          7
	//   31   55:aload_0         
	//   32   56:getfield        #96  <Field int f>
	//   33   59:invokestatic    #176 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, ((android.os.Parcelable []) (g)), k, false);
	//   34   62:aload_1         
	//   35   63:bipush          8
	//   36   65:aload_0         
	//   37   66:getfield        #143 <Field zzwf[] g>
	//   38   69:iload_2         
	//   39   70:iconst_0        
	//   40   71:invokestatic    #182 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h);
	//   41   74:aload_1         
	//   42   75:bipush          9
	//   43   77:aload_0         
	//   44   78:getfield        #147 <Field boolean h>
	//   45   81:invokestatic    #179 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, i);
	//   46   84:aload_1         
	//   47   85:bipush          10
	//   48   87:aload_0         
	//   49   88:getfield        #50  <Field boolean i>
	//   50   91:invokestatic    #179 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, j);
	//   51   94:aload_1         
	//   52   95:bipush          11
	//   53   97:aload_0         
	//   54   98:getfield        #149 <Field boolean j>
	//   55  101:invokestatic    #179 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, l);
	//   56  104:aload_1         
	//   57  105:iload_3         
	//   58  106:invokestatic    #184 <Method void c.a(Parcel, int)>
	//   59  109:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bvx();
	public final String a;
	public final int b;
	public final int c;
	public final boolean d;
	public final int e;
	public final int f;
	public final zzwf g[];
	public final boolean h;
	public final boolean i;
	public boolean j;

	static 
	{
	//    0    0:new             #25  <Class bvx>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void bvx()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
