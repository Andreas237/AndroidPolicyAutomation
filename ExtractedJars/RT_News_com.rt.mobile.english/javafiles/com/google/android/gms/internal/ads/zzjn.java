// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjo, zzkb, zzamu

public class zzjn extends AbstractSafeParcelable
{

	public zzjn()
	{
		this("interstitial_mb", 0, 0, true, 0, 0, ((zzjn []) (null)), false, false, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #52  <String "interstitial_mb">
	//    2    3:iconst_0        
	//    3    4:iconst_0        
	//    4    5:iconst_1        
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:aconst_null     
	//    8    9:iconst_0        
	//    9   10:iconst_0        
	//   10   11:iconst_0        
	//   11   12:invokespecial   #55  <Method void zzjn(String, int, int, boolean, int, int, zzjn[], boolean, boolean, boolean)>
	//   12   15:return          
	}

	public zzjn(Context context, AdSize adsize)
	{
		this(context, new AdSize[] {
			adsize
		});
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:anewarray       AdSize[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:invokespecial   #61  <Method void zzjn(Context, AdSize[])>
	//    9   13:return          
	}

	public zzjn(Context context, AdSize aadsize[])
	{
		int i;
		boolean flag;
		boolean flag1;
		Object obj;
		DisplayMetrics displaymetrics;
label0:
		{
label1:
			{
label2:
				{
					super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void AbstractSafeParcelable()>
					obj = ((Object) (aadsize[0]));
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:aaload          
	//    5    7:astore          9
					zzarc = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #64  <Field boolean zzarc>
					zzarf = ((AdSize) (obj)).isFluid();
	//    9   14:aload_0         
	//   10   15:aload           9
	//   11   17:invokevirtual   #68  <Method boolean AdSize.isFluid()>
	//   12   20:putfield        #70  <Field boolean zzarf>
					if(zzarf)
	//*  13   23:aload_0         
	//*  14   24:getfield        #70  <Field boolean zzarf>
	//*  15   27:ifeq            57
					{
						width = AdSize.BANNER.getWidth();
	//   16   30:aload_0         
	//   17   31:getstatic       #74  <Field AdSize AdSize.BANNER>
	//   18   34:invokevirtual   #78  <Method int AdSize.getWidth()>
	//   19   37:putfield        #80  <Field int width>
						i = AdSize.BANNER.getHeight();
	//   20   40:getstatic       #74  <Field AdSize AdSize.BANNER>
	//   21   43:invokevirtual   #83  <Method int AdSize.getHeight()>
	//   22   46:istore          5
					} else
	//*  23   48:aload_0         
	//*  24   49:iload           5
	//*  25   51:putfield        #85  <Field int height>
	//*  26   54:goto            76
					{
						width = ((AdSize) (obj)).getWidth();
	//   27   57:aload_0         
	//   28   58:aload           9
	//   29   60:invokevirtual   #78  <Method int AdSize.getWidth()>
	//   30   63:putfield        #80  <Field int width>
						i = ((AdSize) (obj)).getHeight();
	//   31   66:aload           9
	//   32   68:invokevirtual   #83  <Method int AdSize.getHeight()>
	//   33   71:istore          5
					}
					height = i;
	//*  34   73:goto            48
					if(width == -1)
	//*  35   76:aload_0         
	//*  36   77:getfield        #80  <Field int width>
	//*  37   80:iconst_m1       
	//*  38   81:icmpne          90
						flag = true;
	//   39   84:iconst_1        
	//   40   85:istore          6
					else
	//*  41   87:goto            93
						flag = false;
	//   42   90:iconst_0        
	//   43   91:istore          6
					if(height == -2)
	//*  44   93:aload_0         
	//*  45   94:getfield        #85  <Field int height>
	//*  46   97:bipush          -2
	//*  47   99:icmpne          108
						flag1 = true;
	//   48  102:iconst_1        
	//   49  103:istore          7
					else
	//*  50  105:goto            111
						flag1 = false;
	//   51  108:iconst_0        
	//   52  109:istore          7
					displaymetrics = context.getResources().getDisplayMetrics();
	//   53  111:aload_1         
	//   54  112:invokevirtual   #91  <Method Resources Context.getResources()>
	//   55  115:invokevirtual   #97  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   56  118:astore          10
					if(!flag)
						break label1;
	//   57  120:iload           6
	//   58  122:ifeq            225
					zzkb.zzif();
	//   59  125:invokestatic    #103 <Method zzamu zzkb.zzif()>
	//   60  128:pop             
					if(zzamu.zzbi(context))
	//*  61  129:aload_1         
	//*  62  130:invokestatic    #109 <Method boolean zzamu.zzbi(Context)>
	//*  63  133:ifeq            170
					{
						zzkb.zzif();
	//   64  136:invokestatic    #103 <Method zzamu zzkb.zzif()>
	//   65  139:pop             
						if(zzamu.zzbj(context))
	//*  66  140:aload_1         
	//*  67  141:invokestatic    #112 <Method boolean zzamu.zzbj(Context)>
	//*  68  144:ifeq            170
						{
							i = displaymetrics.widthPixels;
	//   69  147:aload           10
	//   70  149:getfield        #116 <Field int DisplayMetrics.widthPixels>
	//   71  152:istore          5
							zzkb.zzif();
	//   72  154:invokestatic    #103 <Method zzamu zzkb.zzif()>
	//   73  157:pop             
							i -= zzamu.zzbk(context);
	//   74  158:iload           5
	//   75  160:aload_1         
	//   76  161:invokestatic    #120 <Method int zzamu.zzbk(Context)>
	//   77  164:isub            
	//   78  165:istore          5
							break label2;
	//   79  167:goto            177
						}
					}
					i = displaymetrics.widthPixels;
	//   80  170:aload           10
	//   81  172:getfield        #116 <Field int DisplayMetrics.widthPixels>
	//   82  175:istore          5
				}
				widthPixels = i;
	//   83  177:aload_0         
	//   84  178:iload           5
	//   85  180:putfield        #121 <Field int widthPixels>
				double d = (float)widthPixels / displaymetrics.density;
	//   86  183:aload_0         
	//   87  184:getfield        #121 <Field int widthPixels>
	//   88  187:i2f             
	//   89  188:aload           10
	//   90  190:getfield        #125 <Field float DisplayMetrics.density>
	//   91  193:fdiv            
	//   92  194:f2d             
	//   93  195:dstore_3        
				int k = (int)d;
	//   94  196:dload_3         
	//   95  197:d2i             
	//   96  198:istore          8
				i = k;
	//   97  200:iload           8
	//   98  202:istore          5
				if(d - (double)k >= 0.01D)
	//*  99  204:dload_3         
	//* 100  205:iload           8
	//* 101  207:i2d             
	//* 102  208:dsub            
	//* 103  209:ldc2w           #126 <Double 0.01D>
	//* 104  212:dcmpl           
	//* 105  213:iflt            248
					i = k + 1;
	//  106  216:iload           8
	//  107  218:iconst_1        
	//  108  219:iadd            
	//  109  220:istore          5
				break label0;
	//  110  222:goto            248
			}
			i = width;
	//  111  225:aload_0         
	//  112  226:getfield        #80  <Field int width>
	//  113  229:istore          5
			zzkb.zzif();
	//  114  231:invokestatic    #103 <Method zzamu zzkb.zzif()>
	//  115  234:pop             
			widthPixels = zzamu.zza(displaymetrics, width);
	//  116  235:aload_0         
	//  117  236:aload           10
	//  118  238:aload_0         
	//  119  239:getfield        #80  <Field int width>
	//  120  242:invokestatic    #131 <Method int zzamu.zza(DisplayMetrics, int)>
	//  121  245:putfield        #121 <Field int widthPixels>
		}
		int l;
		if(flag1)
	//* 122  248:iload           7
	//* 123  250:ifeq            263
			l = zzd(displaymetrics);
	//  124  253:aload           10
	//  125  255:invokestatic    #135 <Method int zzd(DisplayMetrics)>
	//  126  258:istore          8
		else
	//* 127  260:goto            269
			l = height;
	//  128  263:aload_0         
	//  129  264:getfield        #85  <Field int height>
	//  130  267:istore          8
		zzkb.zzif();
	//  131  269:invokestatic    #103 <Method zzamu zzkb.zzif()>
	//  132  272:pop             
		heightPixels = zzamu.zza(displaymetrics, l);
	//  133  273:aload_0         
	//  134  274:aload           10
	//  135  276:iload           8
	//  136  278:invokestatic    #131 <Method int zzamu.zza(DisplayMetrics, int)>
	//  137  281:putfield        #137 <Field int heightPixels>
		if(!flag && !flag1)
	//* 138  284:iload           6
	//* 139  286:ifne            321
	//* 140  289:iload           7
	//* 141  291:ifeq            297
	//* 142  294:goto            321
		{
			if(zzarf)
	//* 143  297:aload_0         
	//* 144  298:getfield        #70  <Field boolean zzarf>
	//* 145  301:ifeq            311
				obj = "320x50_mb";
	//  146  304:ldc1            #139 <String "320x50_mb">
	//  147  306:astore          9
			else
	//* 148  308:goto            371
				obj = ((Object) (((AdSize) (obj)).toString()));
	//  149  311:aload           9
	//  150  313:invokevirtual   #143 <Method String AdSize.toString()>
	//  151  316:astore          9
		} else
	//* 152  318:goto            371
		{
			obj = ((Object) (new StringBuilder(26)));
	//  153  321:new             #145 <Class StringBuilder>
	//  154  324:dup             
	//  155  325:bipush          26
	//  156  327:invokespecial   #148 <Method void StringBuilder(int)>
	//  157  330:astore          9
			((StringBuilder) (obj)).append(i);
	//  158  332:aload           9
	//  159  334:iload           5
	//  160  336:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//  161  339:pop             
			((StringBuilder) (obj)).append("x");
	//  162  340:aload           9
	//  163  342:ldc1            #154 <String "x">
	//  164  344:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  165  347:pop             
			((StringBuilder) (obj)).append(l);
	//  166  348:aload           9
	//  167  350:iload           8
	//  168  352:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//  169  355:pop             
			((StringBuilder) (obj)).append("_as");
	//  170  356:aload           9
	//  171  358:ldc1            #159 <String "_as">
	//  172  360:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  173  363:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  174  364:aload           9
	//  175  366:invokevirtual   #160 <Method String StringBuilder.toString()>
	//  176  369:astore          9
		}
		zzarb = ((String) (obj));
	//  177  371:aload_0         
	//  178  372:aload           9
	//  179  374:putfield        #162 <Field String zzarb>
		if(aadsize.length > 1)
	//* 180  377:aload_2         
	//* 181  378:arraylength     
	//* 182  379:iconst_1        
	//* 183  380:icmple          430
		{
			zzard = new zzjn[aadsize.length];
	//  184  383:aload_0         
	//  185  384:aload_2         
	//  186  385:arraylength     
	//  187  386:anewarray       zzjn[]
	//  188  389:putfield        #164 <Field zzjn[] zzard>
			for(int j = 0; j < aadsize.length; j++)
	//* 189  392:iconst_0        
	//* 190  393:istore          5
	//* 191  395:iload           5
	//* 192  397:aload_2         
	//* 193  398:arraylength     
	//* 194  399:icmpge          435
				zzard[j] = new zzjn(context, aadsize[j]);
	//  195  402:aload_0         
	//  196  403:getfield        #164 <Field zzjn[] zzard>
	//  197  406:iload           5
	//  198  408:new             #2   <Class zzjn>
	//  199  411:dup             
	//  200  412:aload_1         
	//  201  413:aload_2         
	//  202  414:iload           5
	//  203  416:aaload          
	//  204  417:invokespecial   #166 <Method void zzjn(Context, AdSize)>
	//  205  420:aastore         

	//  206  421:iload           5
	//  207  423:iconst_1        
	//  208  424:iadd            
	//  209  425:istore          5
		} else
	//* 210  427:goto            395
		{
			zzard = null;
	//  211  430:aload_0         
	//  212  431:aconst_null     
	//  213  432:putfield        #164 <Field zzjn[] zzard>
		}
		zzare = false;
	//  214  435:aload_0         
	//  215  436:iconst_0        
	//  216  437:putfield        #168 <Field boolean zzare>
		zzarg = false;
	//  217  440:aload_0         
	//  218  441:iconst_0        
	//  219  442:putfield        #170 <Field boolean zzarg>
	//  220  445:return          
	}

	public zzjn(zzjn zzjn1, zzjn azzjn[])
	{
		this(zzjn1.zzarb, zzjn1.height, zzjn1.heightPixels, zzjn1.zzarc, zzjn1.width, zzjn1.widthPixels, azzjn, zzjn1.zzare, zzjn1.zzarf, zzjn1.zzarg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #162 <Field String zzarb>
	//    3    5:aload_1         
	//    4    6:getfield        #85  <Field int height>
	//    5    9:aload_1         
	//    6   10:getfield        #137 <Field int heightPixels>
	//    7   13:aload_1         
	//    8   14:getfield        #64  <Field boolean zzarc>
	//    9   17:aload_1         
	//   10   18:getfield        #80  <Field int width>
	//   11   21:aload_1         
	//   12   22:getfield        #121 <Field int widthPixels>
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:getfield        #168 <Field boolean zzare>
	//   16   30:aload_1         
	//   17   31:getfield        #70  <Field boolean zzarf>
	//   18   34:aload_1         
	//   19   35:getfield        #170 <Field boolean zzarg>
	//   20   38:invokespecial   #55  <Method void zzjn(String, int, int, boolean, int, int, zzjn[], boolean, boolean, boolean)>
	//   21   41:return          
	}

	zzjn(String s, int i, int j, boolean flag, int k, int l, zzjn azzjn[], 
			boolean flag1, boolean flag2, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void AbstractSafeParcelable()>
		zzarb = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #162 <Field String zzarb>
		height = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #85  <Field int height>
		heightPixels = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #137 <Field int heightPixels>
		zzarc = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #64  <Field boolean zzarc>
		width = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #80  <Field int width>
		widthPixels = l;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #121 <Field int widthPixels>
		zzard = azzjn;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #164 <Field zzjn[] zzard>
		zzare = flag1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #168 <Field boolean zzare>
		zzarf = flag2;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #70  <Field boolean zzarf>
		zzarg = flag3;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #170 <Field boolean zzarg>
	//   32   61:return          
	}

	public static int zzb(DisplayMetrics displaymetrics)
	{
		return displaymetrics.widthPixels;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int DisplayMetrics.widthPixels>
	//    2    4:ireturn         
	}

	public static int zzc(DisplayMetrics displaymetrics)
	{
		return (int)((float)zzd(displaymetrics) * displaymetrics.density);
	//    0    0:aload_0         
	//    1    1:invokestatic    #135 <Method int zzd(DisplayMetrics)>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field float DisplayMetrics.density>
	//    5    9:fmul            
	//    6   10:f2i             
	//    7   11:ireturn         
	}

	private static int zzd(DisplayMetrics displaymetrics)
	{
		int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field int DisplayMetrics.heightPixels>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field float DisplayMetrics.density>
	//    5    9:fdiv            
	//    6   10:f2i             
	//    7   11:istore_1        
		if(i <= 400)
	//*   8   12:iload_1         
	//*   9   13:sipush          400
	//*  10   16:icmpgt          22
			return 32;
	//   11   19:bipush          32
	//   12   21:ireturn         
		return i > 720 ? 90 : 50;
	//   13   22:iload_1         
	//   14   23:sipush          720
	//   15   26:icmpgt          32
	//   16   29:bipush          50
	//   17   31:ireturn         
	//   18   32:bipush          90
	//   19   34:ireturn         
	}

	public static zzjn zzf(Context context)
	{
		return new zzjn("320x50_mb", 0, 0, false, 0, 0, ((zzjn []) (null)), true, false, false);
	//    0    0:new             #2   <Class zzjn>
	//    1    3:dup             
	//    2    4:ldc1            #139 <String "320x50_mb">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:iconst_0        
	//    7   10:iconst_0        
	//    8   11:aconst_null     
	//    9   12:iconst_1        
	//   10   13:iconst_0        
	//   11   14:iconst_0        
	//   12   15:invokespecial   #55  <Method void zzjn(String, int, int, boolean, int, int, zzjn[], boolean, boolean, boolean)>
	//   13   18:areturn         
	}

	public static zzjn zzhx()
	{
		return new zzjn("reward_mb", 0, 0, true, 0, 0, ((zzjn []) (null)), false, false, false);
	//    0    0:new             #2   <Class zzjn>
	//    1    3:dup             
	//    2    4:ldc1            #184 <String "reward_mb">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:iconst_1        
	//    6    9:iconst_0        
	//    7   10:iconst_0        
	//    8   11:aconst_null     
	//    9   12:iconst_0        
	//   10   13:iconst_0        
	//   11   14:iconst_0        
	//   12   15:invokespecial   #55  <Method void zzjn(String, int, int, boolean, int, int, zzjn[], boolean, boolean, boolean)>
	//   13   18:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #192 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 2, zzarb, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #162 <Field String zzarb>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #196 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, height);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #85  <Field int height>
	//   13   21:invokestatic    #200 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 4, heightPixels);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #137 <Field int heightPixels>
	//   18   30:invokestatic    #200 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 5, zzarc);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #64  <Field boolean zzarc>
	//   23   39:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 6, width);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #80  <Field int width>
	//   28   49:invokestatic    #200 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 7, widthPixels);
	//   29   52:aload_1         
	//   30   53:bipush          7
	//   31   55:aload_0         
	//   32   56:getfield        #121 <Field int widthPixels>
	//   33   59:invokestatic    #200 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedArray(parcel, 8, ((android.os.Parcelable []) (zzard)), i, false);
	//   34   62:aload_1         
	//   35   63:bipush          8
	//   36   65:aload_0         
	//   37   66:getfield        #164 <Field zzjn[] zzard>
	//   38   69:iload_2         
	//   39   70:iconst_0        
	//   40   71:invokestatic    #208 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 9, zzare);
	//   41   74:aload_1         
	//   42   75:bipush          9
	//   43   77:aload_0         
	//   44   78:getfield        #168 <Field boolean zzare>
	//   45   81:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 10, zzarf);
	//   46   84:aload_1         
	//   47   85:bipush          10
	//   48   87:aload_0         
	//   49   88:getfield        #70  <Field boolean zzarf>
	//   50   91:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 11, zzarg);
	//   51   94:aload_1         
	//   52   95:bipush          11
	//   53   97:aload_0         
	//   54   98:getfield        #170 <Field boolean zzarg>
	//   55  101:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   56  104:aload_1         
	//   57  105:iload_3         
	//   58  106:invokestatic    #211 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   59  109:return          
	}

	public final AdSize zzhy()
	{
		return com.google.android.gms.ads.zzb.zza(width, height, zzarb);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int width>
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field int height>
	//    4    8:aload_0         
	//    5    9:getfield        #162 <Field String zzarb>
	//    6   12:invokestatic    #218 <Method AdSize zzb.zza(int, int, String)>
	//    7   15:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzjo();
	public final int height;
	public final int heightPixels;
	public final int width;
	public final int widthPixels;
	public final String zzarb;
	public final boolean zzarc;
	public final zzjn zzard[];
	public final boolean zzare;
	public final boolean zzarf;
	public boolean zzarg;

	static 
	{
	//    0    0:new             #44  <Class zzjo>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void zzjo()>
	//    3    7:putstatic       #49  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
