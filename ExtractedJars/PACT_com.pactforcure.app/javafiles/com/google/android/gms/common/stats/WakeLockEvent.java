// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatsEvent, zzf

public final class WakeLockEvent extends StatsEvent
{

	WakeLockEvent(int i, long l, int j, String s, int k, List list, 
			String s1, long l1, int i1, String s2, String s3, float f, 
			long l2, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void StatsEvent()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int mVersionCode>
		zzaGu = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #44  <Field long zzaGu>
		zzaGv = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #46  <Field int zzaGv>
		zzaGw = s;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #48  <Field String zzaGw>
		zzaGx = s2;
	//   14   26:aload_0         
	//   15   27:aload           12
	//   16   29:putfield        #50  <Field String zzaGx>
		zzaGy = s4;
	//   17   32:aload_0         
	//   18   33:aload           17
	//   19   35:putfield        #52  <Field String zzaGy>
		zzaGz = k;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:putfield        #54  <Field int zzaGz>
		zzaGG = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #55  <Long -1L>
	//   25   48:putfield        #58  <Field long zzaGG>
		zzaGA = list;
	//   26   51:aload_0         
	//   27   52:aload           7
	//   28   54:putfield        #60  <Field List zzaGA>
		zzaGB = s1;
	//   29   57:aload_0         
	//   30   58:aload           8
	//   31   60:putfield        #62  <Field String zzaGB>
		zzaGC = l1;
	//   32   63:aload_0         
	//   33   64:lload           9
	//   34   66:putfield        #64  <Field long zzaGC>
		zzaGD = i1;
	//   35   69:aload_0         
	//   36   70:iload           11
	//   37   72:putfield        #66  <Field int zzaGD>
		zzaGE = s3;
	//   38   75:aload_0         
	//   39   76:aload           13
	//   40   78:putfield        #68  <Field String zzaGE>
		zzaGF = f;
	//   41   81:aload_0         
	//   42   82:fload           14
	//   43   84:putfield        #70  <Field float zzaGF>
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
		return zzaGv;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int zzaGv>
	//    2    4:ireturn         
	}

	public long getTimeMillis()
	{
		return zzaGu;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long zzaGu>
	//    2    4:lreturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		zzf.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #88  <Method void zzf.zza(WakeLockEvent, Parcel, int)>
	//    4    6:return          
	}

	public long zzye()
	{
		return zzaGG;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long zzaGG>
	//    2    4:lreturn         
	}

	public String zzyf()
	{
		String s4 = String.valueOf("\t");
	//    0    0:ldc1            #93  <String "\t">
	//    1    2:invokestatic    #99  <Method String String.valueOf(Object)>
	//    2    5:astore          8
		String s5 = String.valueOf(((Object) (zzyg())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #102 <Method String zzyg()>
	//    5   11:invokestatic    #99  <Method String String.valueOf(Object)>
	//    6   14:astore          9
		String s6 = String.valueOf("\t");
	//    7   16:ldc1            #93  <String "\t">
	//    8   18:invokestatic    #99  <Method String String.valueOf(Object)>
	//    9   21:astore          10
		int i = zzyj();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #105 <Method int zzyj()>
	//   12   27:istore_2        
		String s7 = String.valueOf("\t");
	//   13   28:ldc1            #93  <String "\t">
	//   14   30:invokestatic    #99  <Method String String.valueOf(Object)>
	//   15   33:astore          11
		float f;
		int j;
		String s;
		String s1;
		String s2;
		String s3;
		String s8;
		String s9;
		String s10;
		String s11;
		String s12;
		if(zzyk() == null)
	//*  16   35:aload_0         
	//*  17   36:invokevirtual   #109 <Method List zzyk()>
	//*  18   39:ifnonnull       331
			s = "";
	//   19   42:ldc1            #111 <String "">
	//   20   44:astore          4
		else
	//*  21   46:ldc1            #93  <String "\t">
	//*  22   48:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  23   51:astore          12
	//*  24   53:aload_0         
	//*  25   54:invokevirtual   #114 <Method int zzyn()>
	//*  26   57:istore_3        
	//*  27   58:ldc1            #93  <String "\t">
	//*  28   60:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  29   63:astore          13
	//*  30   65:aload_0         
	//*  31   66:invokevirtual   #117 <Method String zzyh()>
	//*  32   69:ifnonnull       345
	//*  33   72:ldc1            #111 <String "">
	//*  34   74:astore          5
	//*  35   76:ldc1            #93  <String "\t">
	//*  36   78:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  37   81:astore          14
	//*  38   83:aload_0         
	//*  39   84:invokevirtual   #120 <Method String zzyo()>
	//*  40   87:ifnonnull       354
	//*  41   90:ldc1            #111 <String "">
	//*  42   92:astore          6
	//*  43   94:ldc1            #93  <String "\t">
	//*  44   96:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  45   99:astore          15
	//*  46  101:aload_0         
	//*  47  102:invokevirtual   #124 <Method float zzyp()>
	//*  48  105:fstore_1        
	//*  49  106:ldc1            #93  <String "\t">
	//*  50  108:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  51  111:astore          16
	//*  52  113:aload_0         
	//*  53  114:invokevirtual   #127 <Method String zzyi()>
	//*  54  117:ifnonnull       363
	//*  55  120:ldc1            #111 <String "">
	//*  56  122:astore          7
	//*  57  124:new             #129 <Class StringBuilder>
	//*  58  127:dup             
	//*  59  128:aload           8
	//*  60  130:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  61  133:invokevirtual   #132 <Method int String.length()>
	//*  62  136:bipush          37
	//*  63  138:iadd            
	//*  64  139:aload           9
	//*  65  141:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  66  144:invokevirtual   #132 <Method int String.length()>
	//*  67  147:iadd            
	//*  68  148:aload           10
	//*  69  150:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  70  153:invokevirtual   #132 <Method int String.length()>
	//*  71  156:iadd            
	//*  72  157:aload           11
	//*  73  159:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  74  162:invokevirtual   #132 <Method int String.length()>
	//*  75  165:iadd            
	//*  76  166:aload           4
	//*  77  168:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  78  171:invokevirtual   #132 <Method int String.length()>
	//*  79  174:iadd            
	//*  80  175:aload           12
	//*  81  177:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  82  180:invokevirtual   #132 <Method int String.length()>
	//*  83  183:iadd            
	//*  84  184:aload           13
	//*  85  186:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  86  189:invokevirtual   #132 <Method int String.length()>
	//*  87  192:iadd            
	//*  88  193:aload           5
	//*  89  195:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  90  198:invokevirtual   #132 <Method int String.length()>
	//*  91  201:iadd            
	//*  92  202:aload           14
	//*  93  204:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  94  207:invokevirtual   #132 <Method int String.length()>
	//*  95  210:iadd            
	//*  96  211:aload           6
	//*  97  213:invokestatic    #99  <Method String String.valueOf(Object)>
	//*  98  216:invokevirtual   #132 <Method int String.length()>
	//*  99  219:iadd            
	//* 100  220:aload           15
	//* 101  222:invokestatic    #99  <Method String String.valueOf(Object)>
	//* 102  225:invokevirtual   #132 <Method int String.length()>
	//* 103  228:iadd            
	//* 104  229:aload           16
	//* 105  231:invokestatic    #99  <Method String String.valueOf(Object)>
	//* 106  234:invokevirtual   #132 <Method int String.length()>
	//* 107  237:iadd            
	//* 108  238:aload           7
	//* 109  240:invokestatic    #99  <Method String String.valueOf(Object)>
	//* 110  243:invokevirtual   #132 <Method int String.length()>
	//* 111  246:iadd            
	//* 112  247:invokespecial   #135 <Method void StringBuilder(int)>
	//* 113  250:aload           8
	//* 114  252:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 115  255:aload           9
	//* 116  257:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 117  260:aload           10
	//* 118  262:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 119  265:iload_2         
	//* 120  266:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//* 121  269:aload           11
	//* 122  271:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 123  274:aload           4
	//* 124  276:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 125  279:aload           12
	//* 126  281:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 127  284:iload_3         
	//* 128  285:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//* 129  288:aload           13
	//* 130  290:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 131  293:aload           5
	//* 132  295:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 133  298:aload           14
	//* 134  300:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 135  303:aload           6
	//* 136  305:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 137  308:aload           15
	//* 138  310:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 139  313:fload_1         
	//* 140  314:invokevirtual   #145 <Method StringBuilder StringBuilder.append(float)>
	//* 141  317:aload           16
	//* 142  319:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 143  322:aload           7
	//* 144  324:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//* 145  327:invokevirtual   #148 <Method String StringBuilder.toString()>
	//* 146  330:areturn         
			s = TextUtils.join(",", ((Iterable) (zzyk())));
	//  147  331:ldc1            #150 <String ",">
	//  148  333:aload_0         
	//  149  334:invokevirtual   #109 <Method List zzyk()>
	//  150  337:invokestatic    #156 <Method String TextUtils.join(CharSequence, Iterable)>
	//  151  340:astore          4
		s8 = String.valueOf("\t");
		j = zzyn();
		s9 = String.valueOf("\t");
		if(zzyh() == null)
			s1 = "";
		else
	//* 152  342:goto            46
			s1 = zzyh();
	//  153  345:aload_0         
	//  154  346:invokevirtual   #117 <Method String zzyh()>
	//  155  349:astore          5
		s10 = String.valueOf("\t");
		if(zzyo() == null)
			s2 = "";
		else
	//* 156  351:goto            76
			s2 = zzyo();
	//  157  354:aload_0         
	//  158  355:invokevirtual   #120 <Method String zzyo()>
	//  159  358:astore          6
		s11 = String.valueOf("\t");
		f = zzyp();
		s12 = String.valueOf("\t");
		if(zzyi() == null)
			s3 = "";
		else
	//* 160  360:goto            94
			s3 = zzyi();
	//  161  363:aload_0         
	//  162  364:invokevirtual   #127 <Method String zzyi()>
	//  163  367:astore          7
		return (new StringBuilder(String.valueOf(((Object) (s4))).length() + 37 + String.valueOf(((Object) (s5))).length() + String.valueOf(((Object) (s6))).length() + String.valueOf(((Object) (s7))).length() + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s8))).length() + String.valueOf(((Object) (s9))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s10))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s11))).length() + String.valueOf(((Object) (s12))).length() + String.valueOf(((Object) (s3))).length())).append(s4).append(s5).append(s6).append(i).append(s7).append(s).append(s8).append(j).append(s9).append(s1).append(s10).append(s2).append(s11).append(f).append(s12).append(s3).toString();
	//* 164  369:goto            124
	}

	public String zzyg()
	{
		return zzaGw;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String zzaGw>
	//    2    4:areturn         
	}

	public String zzyh()
	{
		return zzaGx;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzaGx>
	//    2    4:areturn         
	}

	public String zzyi()
	{
		return zzaGy;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzaGy>
	//    2    4:areturn         
	}

	public int zzyj()
	{
		return zzaGz;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int zzaGz>
	//    2    4:ireturn         
	}

	public List zzyk()
	{
		return zzaGA;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List zzaGA>
	//    2    4:areturn         
	}

	public String zzyl()
	{
		return zzaGB;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String zzaGB>
	//    2    4:areturn         
	}

	public long zzym()
	{
		return zzaGC;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long zzaGC>
	//    2    4:lreturn         
	}

	public int zzyn()
	{
		return zzaGD;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int zzaGD>
	//    2    4:ireturn         
	}

	public String zzyo()
	{
		return zzaGE;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String zzaGE>
	//    2    4:areturn         
	}

	public float zzyp()
	{
		return zzaGF;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float zzaGF>
	//    2    4:freturn         
	}

	public long zzyq()
	{
		return mTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mTimeout>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzf();
	private final long mTimeout;
	final int mVersionCode;
	private final List zzaGA;
	private final String zzaGB;
	private final long zzaGC;
	private int zzaGD;
	private final String zzaGE;
	private final float zzaGF;
	private long zzaGG;
	private final long zzaGu;
	private int zzaGv;
	private final String zzaGw;
	private final String zzaGx;
	private final String zzaGy;
	private final int zzaGz;

	static 
	{
	//    0    0:new             #32  <Class zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zzf()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
