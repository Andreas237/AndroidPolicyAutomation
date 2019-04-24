// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatsEvent, zzd

public final class WakeLockEvent extends StatsEvent
{

	WakeLockEvent(int i, long l, int j, String s, int k, List list, 
			String s1, long l1, int i1, String s2, String s3, float f, 
			long l2, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void StatsEvent()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int zzaiI>
		zzaHD = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #44  <Field long zzaHD>
		zzaHE = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #46  <Field int zzaHE>
		zzaHF = s;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #48  <Field String zzaHF>
		zzaHG = s2;
	//   14   26:aload_0         
	//   15   27:aload           12
	//   16   29:putfield        #50  <Field String zzaHG>
		zzaHH = s4;
	//   17   32:aload_0         
	//   18   33:aload           17
	//   19   35:putfield        #52  <Field String zzaHH>
		zzaHI = k;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:putfield        #54  <Field int zzaHI>
		zzaHP = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #55  <Long -1L>
	//   25   48:putfield        #58  <Field long zzaHP>
		zzaHJ = list;
	//   26   51:aload_0         
	//   27   52:aload           7
	//   28   54:putfield        #60  <Field List zzaHJ>
		zzaHK = s1;
	//   29   57:aload_0         
	//   30   58:aload           8
	//   31   60:putfield        #62  <Field String zzaHK>
		zzaHL = l1;
	//   32   63:aload_0         
	//   33   64:lload           9
	//   34   66:putfield        #64  <Field long zzaHL>
		zzaHM = i1;
	//   35   69:aload_0         
	//   36   70:iload           11
	//   37   72:putfield        #66  <Field int zzaHM>
		zzaHN = s3;
	//   38   75:aload_0         
	//   39   76:aload           13
	//   40   78:putfield        #68  <Field String zzaHN>
		zzaHO = f;
	//   41   81:aload_0         
	//   42   82:fload           14
	//   43   84:putfield        #70  <Field float zzaHO>
		mTimeout = l2;
	//   44   87:aload_0         
	//   45   88:lload           15
	//   46   90:putfield        #72  <Field long mTimeout>
	//   47   93:return          
	}

	public WakeLockEvent(long l, int i, String s, int j, List list, String s1, 
			long l1, int k, String s2, String s3, float f, long l2, String s4)
	{
		this(2, l, i, s, j, list, s1, l1, k, s2, s3, f, l2, s4);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:lload_1         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:lload           8
	//    9   14:iload           10
	//   10   16:aload           11
	//   11   18:aload           12
	//   12   20:fload           13
	//   13   22:lload           14
	//   14   24:aload           16
	//   15   26:invokespecial   #77  <Method void WakeLockEvent(int, long, int, String, int, List, String, long, int, String, String, float, long, String)>
	//   16   29:return          
	}

	public int getEventType()
	{
		return zzaHE;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int zzaHE>
	//    2    4:ireturn         
	}

	public long getTimeMillis()
	{
		return zzaHD;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long zzaHD>
	//    2    4:lreturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		zzd.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #88  <Method void zzd.zza(WakeLockEvent, Parcel, int)>
	//    4    6:return          
	}

	public long zzyK()
	{
		return zzaHP;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long zzaHP>
	//    2    4:lreturn         
	}

	public String zzyL()
	{
		String s4 = String.valueOf("\t");
	//    0    0:ldc1            #93  <String "\t">
	//    1    2:invokestatic    #99  <Method String String.valueOf(Object)>
	//    2    5:astore          20
		String s5 = String.valueOf(((Object) (zzyM())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #102 <Method String zzyM()>
	//    5   11:invokestatic    #99  <Method String String.valueOf(Object)>
	//    6   14:astore          21
		String s6 = String.valueOf("\t");
	//    7   16:ldc1            #93  <String "\t">
	//    8   18:invokestatic    #99  <Method String String.valueOf(Object)>
	//    9   21:astore          22
		int i = zzyP();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #105 <Method int zzyP()>
	//   12   27:istore_2        
		String s7 = String.valueOf("\t");
	//   13   28:ldc1            #93  <String "\t">
	//   14   30:invokestatic    #99  <Method String String.valueOf(Object)>
	//   15   33:astore          23
		String s;
		if(zzyQ() == null)
	//*  16   35:aload_0         
	//*  17   36:invokevirtual   #109 <Method List zzyQ()>
	//*  18   39:ifnonnull       49
			s = "";
	//   19   42:ldc1            #111 <String "">
	//   20   44:astore          16
		else
	//*  21   46:goto            60
			s = TextUtils.join(",", ((Iterable) (zzyQ())));
	//   22   49:ldc1            #113 <String ",">
	//   23   51:aload_0         
	//   24   52:invokevirtual   #109 <Method List zzyQ()>
	//   25   55:invokestatic    #119 <Method String TextUtils.join(CharSequence, Iterable)>
	//   26   58:astore          16
		String s8 = String.valueOf("\t");
	//   27   60:ldc1            #93  <String "\t">
	//   28   62:invokestatic    #99  <Method String String.valueOf(Object)>
	//   29   65:astore          24
		int j = zzyT();
	//   30   67:aload_0         
	//   31   68:invokevirtual   #122 <Method int zzyT()>
	//   32   71:istore_3        
		String s9 = String.valueOf("\t");
	//   33   72:ldc1            #93  <String "\t">
	//   34   74:invokestatic    #99  <Method String String.valueOf(Object)>
	//   35   77:astore          25
		String s1;
		if(zzyN() == null)
	//*  36   79:aload_0         
	//*  37   80:invokevirtual   #125 <Method String zzyN()>
	//*  38   83:ifnonnull       93
			s1 = "";
	//   39   86:ldc1            #111 <String "">
	//   40   88:astore          17
		else
	//*  41   90:goto            99
			s1 = zzyN();
	//   42   93:aload_0         
	//   43   94:invokevirtual   #125 <Method String zzyN()>
	//   44   97:astore          17
		String s10 = String.valueOf("\t");
	//   45   99:ldc1            #93  <String "\t">
	//   46  101:invokestatic    #99  <Method String String.valueOf(Object)>
	//   47  104:astore          26
		String s2;
		if(zzyU() == null)
	//*  48  106:aload_0         
	//*  49  107:invokevirtual   #128 <Method String zzyU()>
	//*  50  110:ifnonnull       120
			s2 = "";
	//   51  113:ldc1            #111 <String "">
	//   52  115:astore          18
		else
	//*  53  117:goto            126
			s2 = zzyU();
	//   54  120:aload_0         
	//   55  121:invokevirtual   #128 <Method String zzyU()>
	//   56  124:astore          18
		String s11 = String.valueOf("\t");
	//   57  126:ldc1            #93  <String "\t">
	//   58  128:invokestatic    #99  <Method String String.valueOf(Object)>
	//   59  131:astore          27
		float f = zzyV();
	//   60  133:aload_0         
	//   61  134:invokevirtual   #132 <Method float zzyV()>
	//   62  137:fstore_1        
		String s12 = String.valueOf("\t");
	//   63  138:ldc1            #93  <String "\t">
	//   64  140:invokestatic    #99  <Method String String.valueOf(Object)>
	//   65  143:astore          28
		String s3;
		if(zzyO() == null)
	//*  66  145:aload_0         
	//*  67  146:invokevirtual   #135 <Method String zzyO()>
	//*  68  149:ifnonnull       159
			s3 = "";
	//   69  152:ldc1            #111 <String "">
	//   70  154:astore          19
		else
	//*  71  156:goto            165
			s3 = zzyO();
	//   72  159:aload_0         
	//   73  160:invokevirtual   #135 <Method String zzyO()>
	//   74  163:astore          19
		int k = String.valueOf(((Object) (s4))).length();
	//   75  165:aload           20
	//   76  167:invokestatic    #99  <Method String String.valueOf(Object)>
	//   77  170:invokevirtual   #138 <Method int String.length()>
	//   78  173:istore          4
		int l = String.valueOf(((Object) (s5))).length();
	//   79  175:aload           21
	//   80  177:invokestatic    #99  <Method String String.valueOf(Object)>
	//   81  180:invokevirtual   #138 <Method int String.length()>
	//   82  183:istore          5
		int i1 = String.valueOf(((Object) (s6))).length();
	//   83  185:aload           22
	//   84  187:invokestatic    #99  <Method String String.valueOf(Object)>
	//   85  190:invokevirtual   #138 <Method int String.length()>
	//   86  193:istore          6
		int j1 = String.valueOf(((Object) (s7))).length();
	//   87  195:aload           23
	//   88  197:invokestatic    #99  <Method String String.valueOf(Object)>
	//   89  200:invokevirtual   #138 <Method int String.length()>
	//   90  203:istore          7
		int k1 = String.valueOf(((Object) (s))).length();
	//   91  205:aload           16
	//   92  207:invokestatic    #99  <Method String String.valueOf(Object)>
	//   93  210:invokevirtual   #138 <Method int String.length()>
	//   94  213:istore          8
		int l1 = String.valueOf(((Object) (s8))).length();
	//   95  215:aload           24
	//   96  217:invokestatic    #99  <Method String String.valueOf(Object)>
	//   97  220:invokevirtual   #138 <Method int String.length()>
	//   98  223:istore          9
		int i2 = String.valueOf(((Object) (s9))).length();
	//   99  225:aload           25
	//  100  227:invokestatic    #99  <Method String String.valueOf(Object)>
	//  101  230:invokevirtual   #138 <Method int String.length()>
	//  102  233:istore          10
		int j2 = String.valueOf(((Object) (s1))).length();
	//  103  235:aload           17
	//  104  237:invokestatic    #99  <Method String String.valueOf(Object)>
	//  105  240:invokevirtual   #138 <Method int String.length()>
	//  106  243:istore          11
		int k2 = String.valueOf(((Object) (s10))).length();
	//  107  245:aload           26
	//  108  247:invokestatic    #99  <Method String String.valueOf(Object)>
	//  109  250:invokevirtual   #138 <Method int String.length()>
	//  110  253:istore          12
		int l2 = String.valueOf(((Object) (s2))).length();
	//  111  255:aload           18
	//  112  257:invokestatic    #99  <Method String String.valueOf(Object)>
	//  113  260:invokevirtual   #138 <Method int String.length()>
	//  114  263:istore          13
		int i3 = String.valueOf(((Object) (s11))).length();
	//  115  265:aload           27
	//  116  267:invokestatic    #99  <Method String String.valueOf(Object)>
	//  117  270:invokevirtual   #138 <Method int String.length()>
	//  118  273:istore          14
		int j3 = String.valueOf(((Object) (s12))).length();
	//  119  275:aload           28
	//  120  277:invokestatic    #99  <Method String String.valueOf(Object)>
	//  121  280:invokevirtual   #138 <Method int String.length()>
	//  122  283:istore          15
		return (new StringBuilder(String.valueOf(((Object) (s3))).length() + (k + 37 + l + i1 + j1 + k1 + l1 + i2 + j2 + k2 + l2 + i3 + j3))).append(s4).append(s5).append(s6).append(i).append(s7).append(s).append(s8).append(j).append(s9).append(s1).append(s10).append(s2).append(s11).append(f).append(s12).append(s3).toString();
	//  123  285:new             #140 <Class StringBuilder>
	//  124  288:dup             
	//  125  289:aload           19
	//  126  291:invokestatic    #99  <Method String String.valueOf(Object)>
	//  127  294:invokevirtual   #138 <Method int String.length()>
	//  128  297:iload           4
	//  129  299:bipush          37
	//  130  301:iadd            
	//  131  302:iload           5
	//  132  304:iadd            
	//  133  305:iload           6
	//  134  307:iadd            
	//  135  308:iload           7
	//  136  310:iadd            
	//  137  311:iload           8
	//  138  313:iadd            
	//  139  314:iload           9
	//  140  316:iadd            
	//  141  317:iload           10
	//  142  319:iadd            
	//  143  320:iload           11
	//  144  322:iadd            
	//  145  323:iload           12
	//  146  325:iadd            
	//  147  326:iload           13
	//  148  328:iadd            
	//  149  329:iload           14
	//  150  331:iadd            
	//  151  332:iload           15
	//  152  334:iadd            
	//  153  335:iadd            
	//  154  336:invokespecial   #143 <Method void StringBuilder(int)>
	//  155  339:aload           20
	//  156  341:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  157  344:aload           21
	//  158  346:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  159  349:aload           22
	//  160  351:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  161  354:iload_2         
	//  162  355:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//  163  358:aload           23
	//  164  360:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  165  363:aload           16
	//  166  365:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  167  368:aload           24
	//  168  370:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  169  373:iload_3         
	//  170  374:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//  171  377:aload           25
	//  172  379:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  173  382:aload           17
	//  174  384:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  175  387:aload           26
	//  176  389:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  177  392:aload           18
	//  178  394:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  179  397:aload           27
	//  180  399:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  181  402:fload_1         
	//  182  403:invokevirtual   #153 <Method StringBuilder StringBuilder.append(float)>
	//  183  406:aload           28
	//  184  408:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  185  411:aload           19
	//  186  413:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//  187  416:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  188  419:areturn         
	}

	public String zzyM()
	{
		return zzaHF;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String zzaHF>
	//    2    4:areturn         
	}

	public String zzyN()
	{
		return zzaHG;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzaHG>
	//    2    4:areturn         
	}

	public String zzyO()
	{
		return zzaHH;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzaHH>
	//    2    4:areturn         
	}

	public int zzyP()
	{
		return zzaHI;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int zzaHI>
	//    2    4:ireturn         
	}

	public List zzyQ()
	{
		return zzaHJ;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List zzaHJ>
	//    2    4:areturn         
	}

	public String zzyR()
	{
		return zzaHK;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String zzaHK>
	//    2    4:areturn         
	}

	public long zzyS()
	{
		return zzaHL;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long zzaHL>
	//    2    4:lreturn         
	}

	public int zzyT()
	{
		return zzaHM;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int zzaHM>
	//    2    4:ireturn         
	}

	public String zzyU()
	{
		return zzaHN;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String zzaHN>
	//    2    4:areturn         
	}

	public float zzyV()
	{
		return zzaHO;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float zzaHO>
	//    2    4:freturn         
	}

	public long zzyW()
	{
		return mTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mTimeout>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	private final long mTimeout;
	private final long zzaHD;
	private int zzaHE;
	private final String zzaHF;
	private final String zzaHG;
	private final String zzaHH;
	private final int zzaHI;
	private final List zzaHJ;
	private final String zzaHK;
	private final long zzaHL;
	private int zzaHM;
	private final String zzaHN;
	private final float zzaHO;
	private long zzaHP;
	final int zzaiI;

	static 
	{
	//    0    0:new             #32  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zzd()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
