// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzcu;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			zzan, MediaQueueItem, AdBreakStatus, MediaInfo, 
//			AdBreakInfo, AdBreakClipInfo, VideoInfo

public class MediaStatus extends AbstractSafeParcelable
{

	MediaStatus(MediaInfo mediainfo, long l, int i, double d, int j, 
			int k, long l1, long l2, double d1, 
			boolean flag, long al[], int i1, int j1, String s, int k1, List list, 
			boolean flag1, AdBreakStatus adbreakstatus, VideoInfo videoinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void AbstractSafeParcelable()>
		zzen = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #137 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #138 <Method void ArrayList()>
	//    6   12:putfield        #140 <Field ArrayList zzen>
		zzer = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #142 <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #143 <Method void SparseArray()>
	//   11   23:putfield        #145 <Field SparseArray zzer>
		zzdi = mediainfo;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #147 <Field MediaInfo zzdi>
		zzec = l;
	//   15   31:aload_0         
	//   16   32:lload_2         
	//   17   33:putfield        #149 <Field long zzec>
		zzed = i;
	//   18   36:aload_0         
	//   19   37:iload           4
	//   20   39:putfield        #151 <Field int zzed>
		zzdl = d;
	//   21   42:aload_0         
	//   22   43:dload           5
	//   23   45:putfield        #153 <Field double zzdl>
		zzee = j;
	//   24   48:aload_0         
	//   25   49:iload           7
	//   26   51:putfield        #155 <Field int zzee>
		zzef = k;
	//   27   54:aload_0         
	//   28   55:iload           8
	//   29   57:putfield        #157 <Field int zzef>
		zzeg = l1;
	//   30   60:aload_0         
	//   31   61:lload           9
	//   32   63:putfield        #159 <Field long zzeg>
		zzeh = l2;
	//   33   66:aload_0         
	//   34   67:lload           11
	//   35   69:putfield        #161 <Field long zzeh>
		zzei = d1;
	//   36   72:aload_0         
	//   37   73:dload           13
	//   38   75:putfield        #163 <Field double zzei>
		zzej = flag;
	//   39   78:aload_0         
	//   40   79:iload           15
	//   41   81:putfield        #165 <Field boolean zzej>
		zzdm = al;
	//   42   84:aload_0         
	//   43   85:aload           16
	//   44   87:putfield        #167 <Field long[] zzdm>
		zzek = i1;
	//   45   90:aload_0         
	//   46   91:iload           17
	//   47   93:putfield        #169 <Field int zzek>
		zzel = j1;
	//   48   96:aload_0         
	//   49   97:iload           18
	//   50   99:putfield        #171 <Field int zzel>
		zzj = s;
	//   51  102:aload_0         
	//   52  103:aload           19
	//   53  105:putfield        #173 <Field String zzj>
		if(zzj != null)
	//*  54  108:aload_0         
	//*  55  109:getfield        #173 <Field String zzj>
	//*  56  112:ifnull          146
			try
			{
				zzp = new JSONObject(zzj);
	//   57  115:aload_0         
	//   58  116:new             #175 <Class JSONObject>
	//   59  119:dup             
	//   60  120:aload_0         
	//   61  121:getfield        #173 <Field String zzj>
	//   62  124:invokespecial   #178 <Method void JSONObject(String)>
	//   63  127:putfield        #180 <Field JSONObject zzp>
			}
	//*  64  130:goto            151
	//*  65  133:aload_0         
	//*  66  134:aconst_null     
	//*  67  135:putfield        #180 <Field JSONObject zzp>
	//*  68  138:aload_0         
	//*  69  139:aconst_null     
	//*  70  140:putfield        #173 <Field String zzj>
	//*  71  143:goto            151
	//*  72  146:aload_0         
	//*  73  147:aconst_null     
	//*  74  148:putfield        #180 <Field JSONObject zzp>
	//*  75  151:aload_0         
	//*  76  152:iload           20
	//*  77  154:putfield        #182 <Field int zzem>
	//*  78  157:aload           21
	//*  79  159:ifnull          196
	//*  80  162:aload           21
	//*  81  164:invokeinterface #188 <Method boolean List.isEmpty()>
	//*  82  169:ifne            196
	//*  83  172:aload_0         
	//*  84  173:aload           21
	//*  85  175:aload           21
	//*  86  177:invokeinterface #192 <Method int List.size()>
	//*  87  182:anewarray       MediaQueueItem[]
	//*  88  185:invokeinterface #198 <Method Object[] List.toArray(Object[])>
	//*  89  190:checkcast       #200 <Class MediaQueueItem[]>
	//*  90  193:invokespecial   #204 <Method void zza(MediaQueueItem[])>
	//*  91  196:aload_0         
	//*  92  197:iload           22
	//*  93  199:putfield        #206 <Field boolean zzeo>
	//*  94  202:aload_0         
	//*  95  203:aload           23
	//*  96  205:putfield        #208 <Field AdBreakStatus zzep>
	//*  97  208:aload_0         
	//*  98  209:aload           24
	//*  99  211:putfield        #210 <Field VideoInfo zzeq>
	//* 100  214:return          
			// Misplaced declaration of an exception variable
			catch(MediaInfo mediainfo)
			{
				zzp = null;
				zzj = null;
			}
		else
			zzp = null;
		zzem = k1;
		if(list != null && !list.isEmpty())
			zza((MediaQueueItem[])list.toArray(((Object []) (new MediaQueueItem[list.size()]))));
		zzeo = flag1;
		zzep = adbreakstatus;
		zzeq = videoinfo;
	//* 101  215:astore_1        
	//* 102  216:goto            133
	}

	public MediaStatus(JSONObject jsonobject)
		throws JSONException
	{
		this(((MediaInfo) (null)), 0L, 0, 0.0D, 0, 0, 0L, 0L, 0.0D, false, ((long []) (null)), 0, 0, ((String) (null)), 0, ((List) (null)), false, ((AdBreakStatus) (null)), ((VideoInfo) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:lconst_0        
	//    3    3:iconst_0        
	//    4    4:dconst_0        
	//    5    5:iconst_0        
	//    6    6:iconst_0        
	//    7    7:lconst_0        
	//    8    8:lconst_0        
	//    9    9:dconst_0        
	//   10   10:iconst_0        
	//   11   11:aconst_null     
	//   12   12:iconst_0        
	//   13   13:iconst_0        
	//   14   14:aconst_null     
	//   15   15:iconst_0        
	//   16   16:aconst_null     
	//   17   17:iconst_0        
	//   18   18:aconst_null     
	//   19   19:aconst_null     
	//   20   20:invokespecial   #217 <Method void MediaStatus(MediaInfo, long, int, double, int, int, long, long, double, boolean, long[], int, int, String, int, List, boolean, AdBreakStatus, VideoInfo)>
		zza(jsonobject, 0);
	//   21   23:aload_0         
	//   22   24:aload_1         
	//   23   25:iconst_0        
	//   24   26:invokevirtual   #220 <Method int zza(JSONObject, int)>
	//   25   29:pop             
	//   26   30:return          
	}

	private final void zza(MediaQueueItem amediaqueueitem[])
	{
		zzen.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzen>
	//    2    4:invokevirtual   #224 <Method void ArrayList.clear()>
		zzer.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field SparseArray zzer>
	//    5   11:invokevirtual   #225 <Method void SparseArray.clear()>
		for(int i = 0; i < amediaqueueitem.length; i++)
	//*   6   14:iconst_0        
	//*   7   15:istore_2        
	//*   8   16:iload_2         
	//*   9   17:aload_1         
	//*  10   18:arraylength     
	//*  11   19:icmpge          57
		{
			MediaQueueItem mediaqueueitem = amediaqueueitem[i];
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:aaload          
	//   15   25:astore_3        
			zzen.add(((Object) (mediaqueueitem)));
	//   16   26:aload_0         
	//   17   27:getfield        #140 <Field ArrayList zzen>
	//   18   30:aload_3         
	//   19   31:invokevirtual   #229 <Method boolean ArrayList.add(Object)>
	//   20   34:pop             
			zzer.put(mediaqueueitem.getItemId(), ((Object) (Integer.valueOf(i))));
	//   21   35:aload_0         
	//   22   36:getfield        #145 <Field SparseArray zzer>
	//   23   39:aload_3         
	//   24   40:invokevirtual   #232 <Method int MediaQueueItem.getItemId()>
	//   25   43:iload_2         
	//   26   44:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   27   47:invokevirtual   #242 <Method void SparseArray.put(int, Object)>
		}

	//   28   50:iload_2         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:istore_2        
	//*  32   54:goto            16
	//   33   57:return          
	}

	private static boolean zza(int i, int j, int k, int l)
	{
		if(i != 1)
	//*   0    0:iload_0         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		switch(j)
	//*   5    7:iload_1         
		{
	//*   6    8:tableswitch     1 3: default 36
	//	               1 47
	//	               2 38
	//	               3 47
		default:
			return true;
	//    7   36:iconst_1        
	//    8   37:ireturn         

		case 2: // '\002'
			return l != 2;
	//    9   38:iload_3         
	//   10   39:iconst_2        
	//   11   40:icmpeq          45
	//   12   43:iconst_1        
	//   13   44:ireturn         
	//   14   45:iconst_0        
	//   15   46:ireturn         

		case 1: // '\001'
		case 3: // '\003'
			break;
		}
		return k == 0;
	//   16   47:iload_2         
	//   17   48:ifne            53
	//   18   51:iconst_1        
	//   19   52:ireturn         
	//   20   53:iconst_0        
	//   21   54:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof MediaStatus))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaStatus>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaStatus)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaStatus>
	//   12   20:astore_1        
		boolean flag;
		if(zzp == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #180 <Field JSONObject zzp>
	//*  15   25:ifnonnull       33
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
		else
	//*  18   30:goto            35
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		boolean flag2;
		if(((MediaStatus) (obj)).zzp == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #180 <Field JSONObject zzp>
	//*  23   39:ifnonnull       47
			flag2 = true;
	//   24   42:iconst_1        
	//   25   43:istore_3        
		else
	//*  26   44:goto            49
			flag2 = false;
	//   27   47:iconst_0        
	//   28   48:istore_3        
		if(flag != flag2)
	//*  29   49:iload_2         
	//*  30   50:iload_3         
	//*  31   51:icmpeq          56
			return false;
	//   32   54:iconst_0        
	//   33   55:ireturn         
		if(zzec == ((MediaStatus) (obj)).zzec && zzed == ((MediaStatus) (obj)).zzed && zzdl == ((MediaStatus) (obj)).zzdl && zzee == ((MediaStatus) (obj)).zzee && zzef == ((MediaStatus) (obj)).zzef && zzeg == ((MediaStatus) (obj)).zzeg && zzei == ((MediaStatus) (obj)).zzei && zzej == ((MediaStatus) (obj)).zzej && zzek == ((MediaStatus) (obj)).zzek && zzel == ((MediaStatus) (obj)).zzel && zzem == ((MediaStatus) (obj)).zzem && Arrays.equals(zzdm, ((MediaStatus) (obj)).zzdm) && zzcu.zza(((Object) (Long.valueOf(zzeh))), ((Object) (Long.valueOf(((MediaStatus) (obj)).zzeh)))) && zzcu.zza(((Object) (zzen)), ((Object) (((MediaStatus) (obj)).zzen))) && zzcu.zza(((Object) (zzdi)), ((Object) (((MediaStatus) (obj)).zzdi))))
	//*  34   56:aload_0         
	//*  35   57:getfield        #149 <Field long zzec>
	//*  36   60:aload_1         
	//*  37   61:getfield        #149 <Field long zzec>
	//*  38   64:lcmp            
	//*  39   65:ifne            295
	//*  40   68:aload_0         
	//*  41   69:getfield        #151 <Field int zzed>
	//*  42   72:aload_1         
	//*  43   73:getfield        #151 <Field int zzed>
	//*  44   76:icmpne          295
	//*  45   79:aload_0         
	//*  46   80:getfield        #153 <Field double zzdl>
	//*  47   83:aload_1         
	//*  48   84:getfield        #153 <Field double zzdl>
	//*  49   87:dcmpl           
	//*  50   88:ifne            295
	//*  51   91:aload_0         
	//*  52   92:getfield        #155 <Field int zzee>
	//*  53   95:aload_1         
	//*  54   96:getfield        #155 <Field int zzee>
	//*  55   99:icmpne          295
	//*  56  102:aload_0         
	//*  57  103:getfield        #157 <Field int zzef>
	//*  58  106:aload_1         
	//*  59  107:getfield        #157 <Field int zzef>
	//*  60  110:icmpne          295
	//*  61  113:aload_0         
	//*  62  114:getfield        #159 <Field long zzeg>
	//*  63  117:aload_1         
	//*  64  118:getfield        #159 <Field long zzeg>
	//*  65  121:lcmp            
	//*  66  122:ifne            295
	//*  67  125:aload_0         
	//*  68  126:getfield        #163 <Field double zzei>
	//*  69  129:aload_1         
	//*  70  130:getfield        #163 <Field double zzei>
	//*  71  133:dcmpl           
	//*  72  134:ifne            295
	//*  73  137:aload_0         
	//*  74  138:getfield        #165 <Field boolean zzej>
	//*  75  141:aload_1         
	//*  76  142:getfield        #165 <Field boolean zzej>
	//*  77  145:icmpne          295
	//*  78  148:aload_0         
	//*  79  149:getfield        #169 <Field int zzek>
	//*  80  152:aload_1         
	//*  81  153:getfield        #169 <Field int zzek>
	//*  82  156:icmpne          295
	//*  83  159:aload_0         
	//*  84  160:getfield        #171 <Field int zzel>
	//*  85  163:aload_1         
	//*  86  164:getfield        #171 <Field int zzel>
	//*  87  167:icmpne          295
	//*  88  170:aload_0         
	//*  89  171:getfield        #182 <Field int zzem>
	//*  90  174:aload_1         
	//*  91  175:getfield        #182 <Field int zzem>
	//*  92  178:icmpne          295
	//*  93  181:aload_0         
	//*  94  182:getfield        #167 <Field long[] zzdm>
	//*  95  185:aload_1         
	//*  96  186:getfield        #167 <Field long[] zzdm>
	//*  97  189:invokestatic    #249 <Method boolean Arrays.equals(long[], long[])>
	//*  98  192:ifeq            295
	//*  99  195:aload_0         
	//* 100  196:getfield        #161 <Field long zzeh>
	//* 101  199:invokestatic    #254 <Method Long Long.valueOf(long)>
	//* 102  202:aload_1         
	//* 103  203:getfield        #161 <Field long zzeh>
	//* 104  206:invokestatic    #254 <Method Long Long.valueOf(long)>
	//* 105  209:invokestatic    #259 <Method boolean zzcu.zza(Object, Object)>
	//* 106  212:ifeq            295
	//* 107  215:aload_0         
	//* 108  216:getfield        #140 <Field ArrayList zzen>
	//* 109  219:aload_1         
	//* 110  220:getfield        #140 <Field ArrayList zzen>
	//* 111  223:invokestatic    #259 <Method boolean zzcu.zza(Object, Object)>
	//* 112  226:ifeq            295
	//* 113  229:aload_0         
	//* 114  230:getfield        #147 <Field MediaInfo zzdi>
	//* 115  233:aload_1         
	//* 116  234:getfield        #147 <Field MediaInfo zzdi>
	//* 117  237:invokestatic    #259 <Method boolean zzcu.zza(Object, Object)>
	//* 118  240:ifeq            295
		{
			boolean flag1;
			if(zzp != null && ((MediaStatus) (obj)).zzp != null && !JsonUtils.areJsonValuesEquivalent(((Object) (zzp)), ((Object) (((MediaStatus) (obj)).zzp))))
	//* 119  243:aload_0         
	//* 120  244:getfield        #180 <Field JSONObject zzp>
	//* 121  247:ifnull          276
	//* 122  250:aload_1         
	//* 123  251:getfield        #180 <Field JSONObject zzp>
	//* 124  254:ifnull          276
	//* 125  257:aload_0         
	//* 126  258:getfield        #180 <Field JSONObject zzp>
	//* 127  261:aload_1         
	//* 128  262:getfield        #180 <Field JSONObject zzp>
	//* 129  265:invokestatic    #264 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//* 130  268:ifne            276
				flag1 = false;
	//  131  271:iconst_0        
	//  132  272:istore_2        
			else
	//* 133  273:goto            278
				flag1 = true;
	//  134  276:iconst_1        
	//  135  277:istore_2        
			if(flag1 && zzeo == ((MediaStatus) (obj)).isPlayingAd())
	//* 136  278:iload_2         
	//* 137  279:ifeq            295
	//* 138  282:aload_0         
	//* 139  283:getfield        #206 <Field boolean zzeo>
	//* 140  286:aload_1         
	//* 141  287:invokevirtual   #266 <Method boolean isPlayingAd()>
	//* 142  290:icmpne          295
				return true;
	//  143  293:iconst_1        
	//  144  294:ireturn         
		}
		return false;
	//  145  295:iconst_0        
	//  146  296:ireturn         
	}

	public long[] getActiveTrackIds()
	{
		return zzdm;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field long[] zzdm>
	//    2    4:areturn         
	}

	public AdBreakStatus getAdBreakStatus()
	{
		return zzep;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field AdBreakStatus zzep>
	//    2    4:areturn         
	}

	public AdBreakInfo getCurrentAdBreak()
	{
label0:
		{
			if(zzep == null)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field AdBreakStatus zzep>
	//    2    4:ifnull          95
			if(zzdi == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #147 <Field MediaInfo zzdi>
	//*   5   11:ifnonnull       16
				return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
			String s = zzep.getBreakId();
	//    8   16:aload_0         
	//    9   17:getfield        #208 <Field AdBreakStatus zzep>
	//   10   20:invokevirtual   #276 <Method String AdBreakStatus.getBreakId()>
	//   11   23:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #281 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifeq            33
				return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
			Object obj = ((Object) (zzdi.getAdBreaks()));
	//   17   33:aload_0         
	//   18   34:getfield        #147 <Field MediaInfo zzdi>
	//   19   37:invokevirtual   #287 <Method List MediaInfo.getAdBreaks()>
	//   20   40:astore_2        
			if(obj == null)
				break label0;
	//   21   41:aload_2         
	//   22   42:ifnull          95
			if(((List) (obj)).isEmpty())
	//*  23   45:aload_2         
	//*  24   46:invokeinterface #188 <Method boolean List.isEmpty()>
	//*  25   51:ifeq            56
				return null;
	//   26   54:aconst_null     
	//   27   55:areturn         
			obj = ((Object) (((List) (obj)).iterator()));
	//   28   56:aload_2         
	//   29   57:invokeinterface #291 <Method Iterator List.iterator()>
	//   30   62:astore_2        
			AdBreakInfo adbreakinfo;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   31   63:aload_2         
	//   32   64:invokeinterface #296 <Method boolean Iterator.hasNext()>
	//   33   69:ifeq            95
				adbreakinfo = (AdBreakInfo)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #300 <Method Object Iterator.next()>
	//   36   78:checkcast       #302 <Class AdBreakInfo>
	//   37   81:astore_3        
			} while(!s.equals(((Object) (adbreakinfo.getId()))));
	//   38   82:aload_1         
	//   39   83:aload_3         
	//   40   84:invokevirtual   #305 <Method String AdBreakInfo.getId()>
	//   41   87:invokevirtual   #309 <Method boolean String.equals(Object)>
	//   42   90:ifeq            63
			return adbreakinfo;
	//   43   93:aload_3         
	//   44   94:areturn         
		}
		return null;
	//   45   95:aconst_null     
	//   46   96:areturn         
	}

	public AdBreakClipInfo getCurrentAdBreakClip()
	{
label0:
		{
			if(zzep == null)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field AdBreakStatus zzep>
	//    2    4:ifnull          95
			if(zzdi == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #147 <Field MediaInfo zzdi>
	//*   5   11:ifnonnull       16
				return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
			String s = zzep.getBreakClipId();
	//    8   16:aload_0         
	//    9   17:getfield        #208 <Field AdBreakStatus zzep>
	//   10   20:invokevirtual   #314 <Method String AdBreakStatus.getBreakClipId()>
	//   11   23:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #281 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifeq            33
				return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
			Object obj = ((Object) (zzdi.getAdBreakClips()));
	//   17   33:aload_0         
	//   18   34:getfield        #147 <Field MediaInfo zzdi>
	//   19   37:invokevirtual   #317 <Method List MediaInfo.getAdBreakClips()>
	//   20   40:astore_2        
			if(obj == null)
				break label0;
	//   21   41:aload_2         
	//   22   42:ifnull          95
			if(((List) (obj)).isEmpty())
	//*  23   45:aload_2         
	//*  24   46:invokeinterface #188 <Method boolean List.isEmpty()>
	//*  25   51:ifeq            56
				return null;
	//   26   54:aconst_null     
	//   27   55:areturn         
			obj = ((Object) (((List) (obj)).iterator()));
	//   28   56:aload_2         
	//   29   57:invokeinterface #291 <Method Iterator List.iterator()>
	//   30   62:astore_2        
			AdBreakClipInfo adbreakclipinfo;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   31   63:aload_2         
	//   32   64:invokeinterface #296 <Method boolean Iterator.hasNext()>
	//   33   69:ifeq            95
				adbreakclipinfo = (AdBreakClipInfo)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #300 <Method Object Iterator.next()>
	//   36   78:checkcast       #319 <Class AdBreakClipInfo>
	//   37   81:astore_3        
			} while(!s.equals(((Object) (adbreakclipinfo.getId()))));
	//   38   82:aload_1         
	//   39   83:aload_3         
	//   40   84:invokevirtual   #320 <Method String AdBreakClipInfo.getId()>
	//   41   87:invokevirtual   #309 <Method boolean String.equals(Object)>
	//   42   90:ifeq            63
			return adbreakclipinfo;
	//   43   93:aload_3         
	//   44   94:areturn         
		}
		return null;
	//   45   95:aconst_null     
	//   46   96:areturn         
	}

	public int getCurrentItemId()
	{
		return zzed;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int zzed>
	//    2    4:ireturn         
	}

	public JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public int getIdleReason()
	{
		return zzef;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field int zzef>
	//    2    4:ireturn         
	}

	public Integer getIndexById(int i)
	{
		return (Integer)zzer.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field SparseArray zzer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #327 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #234 <Class Integer>
	//    5   11:areturn         
	}

	public MediaQueueItem getItemById(int i)
	{
		Integer integer = (Integer)zzer.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field SparseArray zzer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #327 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #234 <Class Integer>
	//    5   11:astore_2        
		if(integer == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return (MediaQueueItem)zzen.get(integer.intValue());
	//   10   18:aload_0         
	//   11   19:getfield        #140 <Field ArrayList zzen>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #332 <Method int Integer.intValue()>
	//   14   26:invokevirtual   #333 <Method Object ArrayList.get(int)>
	//   15   29:checkcast       #194 <Class MediaQueueItem>
	//   16   32:areturn         
	}

	public MediaQueueItem getItemByIndex(int i)
	{
		if(i >= 0 && i < zzen.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #140 <Field ArrayList zzen>
	//*   5    9:invokevirtual   #335 <Method int ArrayList.size()>
	//*   6   12:icmplt          18
	//*   7   15:goto            30
			return (MediaQueueItem)zzen.get(i);
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ArrayList zzen>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #333 <Method Object ArrayList.get(int)>
	//   12   26:checkcast       #194 <Class MediaQueueItem>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public int getLoadingItemId()
	{
		return zzek;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field int zzek>
	//    2    4:ireturn         
	}

	public MediaInfo getMediaInfo()
	{
		return zzdi;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field MediaInfo zzdi>
	//    2    4:areturn         
	}

	public double getPlaybackRate()
	{
		return zzdl;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field double zzdl>
	//    2    4:dreturn         
	}

	public int getPlayerState()
	{
		return zzee;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field int zzee>
	//    2    4:ireturn         
	}

	public int getPreloadedItemId()
	{
		return zzel;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int zzel>
	//    2    4:ireturn         
	}

	public MediaQueueItem getQueueItem(int i)
	{
		return getItemByIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #340 <Method MediaQueueItem getItemByIndex(int)>
	//    3    5:areturn         
	}

	public MediaQueueItem getQueueItemById(int i)
	{
		return getItemById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #343 <Method MediaQueueItem getItemById(int)>
	//    3    5:areturn         
	}

	public int getQueueItemCount()
	{
		return zzen.size();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzen>
	//    2    4:invokevirtual   #335 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public List getQueueItems()
	{
		return ((List) (zzen));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzen>
	//    2    4:areturn         
	}

	public int getQueueRepeatMode()
	{
		return zzem;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field int zzem>
	//    2    4:ireturn         
	}

	public long getStreamPosition()
	{
		return zzeg;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field long zzeg>
	//    2    4:lreturn         
	}

	public double getStreamVolume()
	{
		return zzei;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field double zzei>
	//    2    4:dreturn         
	}

	public VideoInfo getVideoInfo()
	{
		return zzeq;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field VideoInfo zzeq>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzdi, Long.valueOf(zzec), Integer.valueOf(zzed), Double.valueOf(zzdl), Integer.valueOf(zzee), Integer.valueOf(zzef), Long.valueOf(zzeg), Long.valueOf(zzeh), Double.valueOf(zzei), Boolean.valueOf(zzej), 
			Integer.valueOf(Arrays.hashCode(zzdm)), Integer.valueOf(zzek), Integer.valueOf(zzel), String.valueOf(((Object) (zzp))), Integer.valueOf(zzem), zzen, Boolean.valueOf(zzeo)
		});
	//    0    0:bipush          17
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #147 <Field MediaInfo zzdi>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #149 <Field long zzec>
	//   11   18:invokestatic    #254 <Method Long Long.valueOf(long)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #151 <Field int zzed>
	//   17   28:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #153 <Field double zzdl>
	//   23   38:invokestatic    #357 <Method Double Double.valueOf(double)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #155 <Field int zzee>
	//   29   48:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #157 <Field int zzef>
	//   35   58:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   36   61:aastore         
	//   37   62:dup             
	//   38   63:bipush          6
	//   39   65:aload_0         
	//   40   66:getfield        #159 <Field long zzeg>
	//   41   69:invokestatic    #254 <Method Long Long.valueOf(long)>
	//   42   72:aastore         
	//   43   73:dup             
	//   44   74:bipush          7
	//   45   76:aload_0         
	//   46   77:getfield        #161 <Field long zzeh>
	//   47   80:invokestatic    #254 <Method Long Long.valueOf(long)>
	//   48   83:aastore         
	//   49   84:dup             
	//   50   85:bipush          8
	//   51   87:aload_0         
	//   52   88:getfield        #163 <Field double zzei>
	//   53   91:invokestatic    #357 <Method Double Double.valueOf(double)>
	//   54   94:aastore         
	//   55   95:dup             
	//   56   96:bipush          9
	//   57   98:aload_0         
	//   58   99:getfield        #165 <Field boolean zzej>
	//   59  102:invokestatic    #362 <Method Boolean Boolean.valueOf(boolean)>
	//   60  105:aastore         
	//   61  106:dup             
	//   62  107:bipush          10
	//   63  109:aload_0         
	//   64  110:getfield        #167 <Field long[] zzdm>
	//   65  113:invokestatic    #365 <Method int Arrays.hashCode(long[])>
	//   66  116:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   67  119:aastore         
	//   68  120:dup             
	//   69  121:bipush          11
	//   70  123:aload_0         
	//   71  124:getfield        #169 <Field int zzek>
	//   72  127:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   73  130:aastore         
	//   74  131:dup             
	//   75  132:bipush          12
	//   76  134:aload_0         
	//   77  135:getfield        #171 <Field int zzel>
	//   78  138:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   79  141:aastore         
	//   80  142:dup             
	//   81  143:bipush          13
	//   82  145:aload_0         
	//   83  146:getfield        #180 <Field JSONObject zzp>
	//   84  149:invokestatic    #368 <Method String String.valueOf(Object)>
	//   85  152:aastore         
	//   86  153:dup             
	//   87  154:bipush          14
	//   88  156:aload_0         
	//   89  157:getfield        #182 <Field int zzem>
	//   90  160:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   91  163:aastore         
	//   92  164:dup             
	//   93  165:bipush          15
	//   94  167:aload_0         
	//   95  168:getfield        #140 <Field ArrayList zzen>
	//   96  171:aastore         
	//   97  172:dup             
	//   98  173:bipush          16
	//   99  175:aload_0         
	//  100  176:getfield        #206 <Field boolean zzeo>
	//  101  179:invokestatic    #362 <Method Boolean Boolean.valueOf(boolean)>
	//  102  182:aastore         
	//  103  183:invokestatic    #373 <Method int Objects.hashCode(Object[])>
	//  104  186:ireturn         
	}

	public boolean isMediaCommandSupported(long l)
	{
		return (zzeh & l) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field long zzeh>
	//    2    4:lload_1         
	//    3    5:land            
	//    4    6:lconst_0        
	//    5    7:lcmp            
	//    6    8:ifeq            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public boolean isMute()
	{
		return zzej;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean zzej>
	//    2    4:ireturn         
	}

	public boolean isPlayingAd()
	{
		return zzeo;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field boolean zzeo>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		String s;
		if(zzp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field JSONObject zzp>
	//*   2    4:ifnonnull       13
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore          4
		else
	//*   5   10:goto            22
			s = zzp.toString();
	//    6   13:aload_0         
	//    7   14:getfield        #180 <Field JSONObject zzp>
	//    8   17:invokevirtual   #380 <Method String JSONObject.toString()>
	//    9   20:astore          4
		zzj = s;
	//   10   22:aload_0         
	//   11   23:aload           4
	//   12   25:putfield        #173 <Field String zzj>
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//   13   28:aload_1         
	//   14   29:invokestatic    #386 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   15   32:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getMediaInfo())), i, false);
	//   16   33:aload_1         
	//   17   34:iconst_2        
	//   18   35:aload_0         
	//   19   36:invokevirtual   #388 <Method MediaInfo getMediaInfo()>
	//   20   39:iload_2         
	//   21   40:iconst_0        
	//   22   41:invokestatic    #392 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeLong(parcel, 3, zzec);
	//   23   44:aload_1         
	//   24   45:iconst_3        
	//   25   46:aload_0         
	//   26   47:getfield        #149 <Field long zzec>
	//   27   50:invokestatic    #396 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeInt(parcel, 4, getCurrentItemId());
	//   28   53:aload_1         
	//   29   54:iconst_4        
	//   30   55:aload_0         
	//   31   56:invokevirtual   #398 <Method int getCurrentItemId()>
	//   32   59:invokestatic    #402 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeDouble(parcel, 5, getPlaybackRate());
	//   33   62:aload_1         
	//   34   63:iconst_5        
	//   35   64:aload_0         
	//   36   65:invokevirtual   #404 <Method double getPlaybackRate()>
	//   37   68:invokestatic    #408 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeInt(parcel, 6, getPlayerState());
	//   38   71:aload_1         
	//   39   72:bipush          6
	//   40   74:aload_0         
	//   41   75:invokevirtual   #410 <Method int getPlayerState()>
	//   42   78:invokestatic    #402 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 7, getIdleReason());
	//   43   81:aload_1         
	//   44   82:bipush          7
	//   45   84:aload_0         
	//   46   85:invokevirtual   #412 <Method int getIdleReason()>
	//   47   88:invokestatic    #402 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 8, getStreamPosition());
	//   48   91:aload_1         
	//   49   92:bipush          8
	//   50   94:aload_0         
	//   51   95:invokevirtual   #414 <Method long getStreamPosition()>
	//   52   98:invokestatic    #396 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeLong(parcel, 9, zzeh);
	//   53  101:aload_1         
	//   54  102:bipush          9
	//   55  104:aload_0         
	//   56  105:getfield        #161 <Field long zzeh>
	//   57  108:invokestatic    #396 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeDouble(parcel, 10, getStreamVolume());
	//   58  111:aload_1         
	//   59  112:bipush          10
	//   60  114:aload_0         
	//   61  115:invokevirtual   #416 <Method double getStreamVolume()>
	//   62  118:invokestatic    #408 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeBoolean(parcel, 11, isMute());
	//   63  121:aload_1         
	//   64  122:bipush          11
	//   65  124:aload_0         
	//   66  125:invokevirtual   #418 <Method boolean isMute()>
	//   67  128:invokestatic    #422 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeLongArray(parcel, 12, getActiveTrackIds(), false);
	//   68  131:aload_1         
	//   69  132:bipush          12
	//   70  134:aload_0         
	//   71  135:invokevirtual   #424 <Method long[] getActiveTrackIds()>
	//   72  138:iconst_0        
	//   73  139:invokestatic    #428 <Method void SafeParcelWriter.writeLongArray(Parcel, int, long[], boolean)>
		SafeParcelWriter.writeInt(parcel, 13, getLoadingItemId());
	//   74  142:aload_1         
	//   75  143:bipush          13
	//   76  145:aload_0         
	//   77  146:invokevirtual   #430 <Method int getLoadingItemId()>
	//   78  149:invokestatic    #402 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 14, getPreloadedItemId());
	//   79  152:aload_1         
	//   80  153:bipush          14
	//   81  155:aload_0         
	//   82  156:invokevirtual   #432 <Method int getPreloadedItemId()>
	//   83  159:invokestatic    #402 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 15, zzj, false);
	//   84  162:aload_1         
	//   85  163:bipush          15
	//   86  165:aload_0         
	//   87  166:getfield        #173 <Field String zzj>
	//   88  169:iconst_0        
	//   89  170:invokestatic    #436 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 16, zzem);
	//   90  173:aload_1         
	//   91  174:bipush          16
	//   92  176:aload_0         
	//   93  177:getfield        #182 <Field int zzem>
	//   94  180:invokestatic    #402 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedList(parcel, 17, ((List) (zzen)), false);
	//   95  183:aload_1         
	//   96  184:bipush          17
	//   97  186:aload_0         
	//   98  187:getfield        #140 <Field ArrayList zzen>
	//   99  190:iconst_0        
	//  100  191:invokestatic    #440 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 18, isPlayingAd());
	//  101  194:aload_1         
	//  102  195:bipush          18
	//  103  197:aload_0         
	//  104  198:invokevirtual   #266 <Method boolean isPlayingAd()>
	//  105  201:invokestatic    #422 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 19, ((android.os.Parcelable) (getAdBreakStatus())), i, false);
	//  106  204:aload_1         
	//  107  205:bipush          19
	//  108  207:aload_0         
	//  109  208:invokevirtual   #442 <Method AdBreakStatus getAdBreakStatus()>
	//  110  211:iload_2         
	//  111  212:iconst_0        
	//  112  213:invokestatic    #392 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 20, ((android.os.Parcelable) (getVideoInfo())), i, false);
	//  113  216:aload_1         
	//  114  217:bipush          20
	//  115  219:aload_0         
	//  116  220:invokevirtual   #444 <Method VideoInfo getVideoInfo()>
	//  117  223:iload_2         
	//  118  224:iconst_0        
	//  119  225:invokestatic    #392 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//  120  228:aload_1         
	//  121  229:iload_3         
	//  122  230:invokestatic    #447 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//  123  233:return          
	}

	public final int zza(JSONObject jsonobject, int i)
		throws JSONException
	{
		int l;
		int i1;
		boolean flag;
		long al1[];
		long l3 = jsonobject.getLong("mediaSessionId");
	//    0    0:aload_1         
	//    1    1:ldc2            #449 <String "mediaSessionId">
	//    2    4:invokevirtual   #453 <Method long JSONObject.getLong(String)>
	//    3    7:lstore          10
		long l6 = zzec;
	//    4    9:aload_0         
	//    5   10:getfield        #149 <Field long zzec>
	//    6   13:lstore          12
		flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          14
		if(l3 != l6)
	//*   9   18:lload           10
	//*  10   20:lload           12
	//*  11   22:lcmp            
	//*  12   23:ifeq            38
		{
			zzec = l3;
	//   13   26:aload_0         
	//   14   27:lload           10
	//   15   29:putfield        #149 <Field long zzec>
			i1 = 1;
	//   16   32:iconst_1        
	//   17   33:istore          6
		} else
	//*  18   35:goto            41
		{
			i1 = 0;
	//   19   38:iconst_0        
	//   20   39:istore          6
		}
		int k2 = i1;
	//   21   41:iload           6
	//   22   43:istore          7
		if(jsonobject.has("playerState"))
	//*  23   45:aload_1         
	//*  24   46:ldc2            #455 <String "playerState">
	//*  25   49:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//*  26   52:ifeq            297
		{
			String s = jsonobject.getString("playerState");
	//   27   55:aload_1         
	//   28   56:ldc2            #455 <String "playerState">
	//   29   59:invokevirtual   #463 <Method String JSONObject.getString(String)>
	//   30   62:astore          16
			boolean flag1 = s.equals("IDLE");
	//   31   64:aload           16
	//   32   66:ldc2            #465 <String "IDLE">
	//   33   69:invokevirtual   #309 <Method boolean String.equals(Object)>
	//   34   72:istore          15
			byte byte1 = 4;
	//   35   74:iconst_4        
	//   36   75:istore          9
			int j;
			if(flag1)
	//*  37   77:iload           15
	//*  38   79:ifeq            88
				j = 1;
	//   39   82:iconst_1        
	//   40   83:istore          5
			else
	//*  41   85:goto            142
			if(s.equals("PLAYING"))
	//*  42   88:aload           16
	//*  43   90:ldc2            #467 <String "PLAYING">
	//*  44   93:invokevirtual   #309 <Method boolean String.equals(Object)>
	//*  45   96:ifeq            105
				j = 2;
	//   46   99:iconst_2        
	//   47  100:istore          5
			else
	//*  48  102:goto            142
			if(s.equals("PAUSED"))
	//*  49  105:aload           16
	//*  50  107:ldc2            #469 <String "PAUSED">
	//*  51  110:invokevirtual   #309 <Method boolean String.equals(Object)>
	//*  52  113:ifeq            122
				j = 3;
	//   53  116:iconst_3        
	//   54  117:istore          5
			else
	//*  55  119:goto            142
			if(s.equals("BUFFERING"))
	//*  56  122:aload           16
	//*  57  124:ldc2            #471 <String "BUFFERING">
	//*  58  127:invokevirtual   #309 <Method boolean String.equals(Object)>
	//*  59  130:ifeq            139
				j = 4;
	//   60  133:iconst_4        
	//   61  134:istore          5
			else
	//*  62  136:goto            142
				j = 0;
	//   63  139:iconst_0        
	//   64  140:istore          5
			int i3 = i1;
	//   65  142:iload           6
	//   66  144:istore          8
			if(j != zzee)
	//*  67  146:iload           5
	//*  68  148:aload_0         
	//*  69  149:getfield        #155 <Field int zzee>
	//*  70  152:icmpeq          167
			{
				zzee = j;
	//   71  155:aload_0         
	//   72  156:iload           5
	//   73  158:putfield        #155 <Field int zzee>
				i3 = i1 | 2;
	//   74  161:iload           6
	//   75  163:iconst_2        
	//   76  164:ior             
	//   77  165:istore          8
			}
			k2 = i3;
	//   78  167:iload           8
	//   79  169:istore          7
			if(j == 1)
	//*  80  171:iload           5
	//*  81  173:iconst_1        
	//*  82  174:icmpne          297
			{
				k2 = i3;
	//   83  177:iload           8
	//   84  179:istore          7
				if(jsonobject.has("idleReason"))
	//*  85  181:aload_1         
	//*  86  182:ldc2            #473 <String "idleReason">
	//*  87  185:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//*  88  188:ifeq            297
				{
					String s1 = jsonobject.getString("idleReason");
	//   89  191:aload_1         
	//   90  192:ldc2            #473 <String "idleReason">
	//   91  195:invokevirtual   #463 <Method String JSONObject.getString(String)>
	//   92  198:astore          16
					int k;
					if(s1.equals("CANCELLED"))
	//*  93  200:aload           16
	//*  94  202:ldc2            #475 <String "CANCELLED">
	//*  95  205:invokevirtual   #309 <Method boolean String.equals(Object)>
	//*  96  208:ifeq            217
						k = 2;
	//   97  211:iconst_2        
	//   98  212:istore          5
					else
	//*  99  214:goto            272
					if(s1.equals("INTERRUPTED"))
	//* 100  217:aload           16
	//* 101  219:ldc2            #477 <String "INTERRUPTED">
	//* 102  222:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 103  225:ifeq            234
						k = 3;
	//  104  228:iconst_3        
	//  105  229:istore          5
					else
	//* 106  231:goto            272
					if(s1.equals("FINISHED"))
	//* 107  234:aload           16
	//* 108  236:ldc2            #479 <String "FINISHED">
	//* 109  239:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 110  242:ifeq            251
						k = 1;
	//  111  245:iconst_1        
	//  112  246:istore          5
					else
	//* 113  248:goto            272
					if(s1.equals("ERROR"))
	//* 114  251:aload           16
	//* 115  253:ldc2            #481 <String "ERROR">
	//* 116  256:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 117  259:ifeq            269
						k = ((int) (byte1));
	//  118  262:iload           9
	//  119  264:istore          5
					else
	//* 120  266:goto            272
						k = 0;
	//  121  269:iconst_0        
	//  122  270:istore          5
					k2 = i3;
	//  123  272:iload           8
	//  124  274:istore          7
					if(k != zzef)
	//* 125  276:iload           5
	//* 126  278:aload_0         
	//* 127  279:getfield        #157 <Field int zzef>
	//* 128  282:icmpeq          297
					{
						zzef = k;
	//  129  285:aload_0         
	//  130  286:iload           5
	//  131  288:putfield        #157 <Field int zzef>
						k2 = i3 | 2;
	//  132  291:iload           8
	//  133  293:iconst_2        
	//  134  294:ior             
	//  135  295:istore          7
					}
				}
			}
		}
		l = k2;
	//  136  297:iload           7
	//  137  299:istore          5
		if(jsonobject.has("playbackRate"))
	//* 138  301:aload_1         
	//* 139  302:ldc2            #483 <String "playbackRate">
	//* 140  305:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 141  308:ifeq            343
		{
			double d = jsonobject.getDouble("playbackRate");
	//  142  311:aload_1         
	//  143  312:ldc2            #483 <String "playbackRate">
	//  144  315:invokevirtual   #487 <Method double JSONObject.getDouble(String)>
	//  145  318:dstore_3        
			l = k2;
	//  146  319:iload           7
	//  147  321:istore          5
			if(zzdl != d)
	//* 148  323:aload_0         
	//* 149  324:getfield        #153 <Field double zzdl>
	//* 150  327:dload_3         
	//* 151  328:dcmpl           
	//* 152  329:ifeq            343
			{
				zzdl = d;
	//  153  332:aload_0         
	//  154  333:dload_3         
	//  155  334:putfield        #153 <Field double zzdl>
				l = k2 | 2;
	//  156  337:iload           7
	//  157  339:iconst_2        
	//  158  340:ior             
	//  159  341:istore          5
			}
		}
		k2 = l;
	//  160  343:iload           5
	//  161  345:istore          7
		if(jsonobject.has("currentTime"))
	//* 162  347:aload_1         
	//* 163  348:ldc2            #489 <String "currentTime">
	//* 164  351:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 165  354:ifeq            407
		{
			k2 = l;
	//  166  357:iload           5
	//  167  359:istore          7
			if((i & 2) == 0)
	//* 168  361:iload_2         
	//* 169  362:iconst_2        
	//* 170  363:iand            
	//* 171  364:ifne            407
			{
				long l4 = (long)(jsonobject.getDouble("currentTime") * 1000D);
	//  172  367:aload_1         
	//  173  368:ldc2            #489 <String "currentTime">
	//  174  371:invokevirtual   #487 <Method double JSONObject.getDouble(String)>
	//  175  374:ldc2w           #490 <Double 1000D>
	//  176  377:dmul            
	//  177  378:d2l             
	//  178  379:lstore          10
				k2 = l;
	//  179  381:iload           5
	//  180  383:istore          7
				if(l4 != zzeg)
	//* 181  385:lload           10
	//* 182  387:aload_0         
	//* 183  388:getfield        #159 <Field long zzeg>
	//* 184  391:lcmp            
	//* 185  392:ifeq            407
				{
					zzeg = l4;
	//  186  395:aload_0         
	//  187  396:lload           10
	//  188  398:putfield        #159 <Field long zzeg>
					k2 = l | 2;
	//  189  401:iload           5
	//  190  403:iconst_2        
	//  191  404:ior             
	//  192  405:istore          7
				}
			}
		}
		i1 = k2;
	//  193  407:iload           7
	//  194  409:istore          6
		if(jsonobject.has("supportedMediaCommands"))
	//* 195  411:aload_1         
	//* 196  412:ldc2            #493 <String "supportedMediaCommands">
	//* 197  415:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 198  418:ifeq            456
		{
			long l5 = jsonobject.getLong("supportedMediaCommands");
	//  199  421:aload_1         
	//  200  422:ldc2            #493 <String "supportedMediaCommands">
	//  201  425:invokevirtual   #453 <Method long JSONObject.getLong(String)>
	//  202  428:lstore          10
			i1 = k2;
	//  203  430:iload           7
	//  204  432:istore          6
			if(l5 != zzeh)
	//* 205  434:lload           10
	//* 206  436:aload_0         
	//* 207  437:getfield        #161 <Field long zzeh>
	//* 208  440:lcmp            
	//* 209  441:ifeq            456
			{
				zzeh = l5;
	//  210  444:aload_0         
	//  211  445:lload           10
	//  212  447:putfield        #161 <Field long zzeh>
				i1 = k2 | 2;
	//  213  450:iload           7
	//  214  452:iconst_2        
	//  215  453:ior             
	//  216  454:istore          6
			}
		}
		l = i1;
	//  217  456:iload           6
	//  218  458:istore          5
		if(jsonobject.has("volume"))
	//* 219  460:aload_1         
	//* 220  461:ldc2            #495 <String "volume">
	//* 221  464:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 222  467:ifeq            553
		{
			l = i1;
	//  223  470:iload           6
	//  224  472:istore          5
			if((i & 1) == 0)
	//* 225  474:iload_2         
	//* 226  475:iconst_1        
	//* 227  476:iand            
	//* 228  477:ifne            553
			{
				JSONObject jsonobject1 = jsonobject.getJSONObject("volume");
	//  229  480:aload_1         
	//  230  481:ldc2            #495 <String "volume">
	//  231  484:invokevirtual   #499 <Method JSONObject JSONObject.getJSONObject(String)>
	//  232  487:astore          16
				double d1 = jsonobject1.getDouble("level");
	//  233  489:aload           16
	//  234  491:ldc2            #501 <String "level">
	//  235  494:invokevirtual   #487 <Method double JSONObject.getDouble(String)>
	//  236  497:dstore_3        
				i = i1;
	//  237  498:iload           6
	//  238  500:istore_2        
				if(d1 != zzei)
	//* 239  501:dload_3         
	//* 240  502:aload_0         
	//* 241  503:getfield        #163 <Field double zzei>
	//* 242  506:dcmpl           
	//* 243  507:ifeq            520
				{
					zzei = d1;
	//  244  510:aload_0         
	//  245  511:dload_3         
	//  246  512:putfield        #163 <Field double zzei>
					i = i1 | 2;
	//  247  515:iload           6
	//  248  517:iconst_2        
	//  249  518:ior             
	//  250  519:istore_2        
				}
				boolean flag2 = jsonobject1.getBoolean("muted");
	//  251  520:aload           16
	//  252  522:ldc2            #503 <String "muted">
	//  253  525:invokevirtual   #506 <Method boolean JSONObject.getBoolean(String)>
	//  254  528:istore          15
				l = i;
	//  255  530:iload_2         
	//  256  531:istore          5
				if(flag2 != zzej)
	//* 257  533:iload           15
	//* 258  535:aload_0         
	//* 259  536:getfield        #165 <Field boolean zzej>
	//* 260  539:icmpeq          553
				{
					zzej = flag2;
	//  261  542:aload_0         
	//  262  543:iload           15
	//  263  545:putfield        #165 <Field boolean zzej>
					l = i | 2;
	//  264  548:iload_2         
	//  265  549:iconst_2        
	//  266  550:ior             
	//  267  551:istore          5
				}
			}
		}
		if(!jsonobject.has("activeTrackIds"))
			break MISSING_BLOCK_LABEL_699;
	//  268  553:aload_1         
	//  269  554:ldc2            #508 <String "activeTrackIds">
	//  270  557:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//  271  560:ifeq            699
		JSONArray jsonarray = jsonobject.getJSONArray("activeTrackIds");
	//  272  563:aload_1         
	//  273  564:ldc2            #508 <String "activeTrackIds">
	//  274  567:invokevirtual   #512 <Method JSONArray JSONObject.getJSONArray(String)>
	//  275  570:astore          16
		i1 = jsonarray.length();
	//  276  572:aload           16
	//  277  574:invokevirtual   #517 <Method int JSONArray.length()>
	//  278  577:istore          6
		al1 = new long[i1];
	//  279  579:iload           6
	//  280  581:newarray        long[]
	//  281  583:astore          17
		for(i = 0; i < i1; i++)
	//* 282  585:iconst_0        
	//* 283  586:istore_2        
	//* 284  587:iload_2         
	//* 285  588:iload           6
	//* 286  590:icmpge          610
			al1[i] = jsonarray.getLong(i);
	//  287  593:aload           17
	//  288  595:iload_2         
	//  289  596:aload           16
	//  290  598:iload_2         
	//  291  599:invokevirtual   #520 <Method long JSONArray.getLong(int)>
	//  292  602:lastore         

	//  293  603:iload_2         
	//  294  604:iconst_1        
	//  295  605:iadd            
	//  296  606:istore_2        
		break MISSING_BLOCK_LABEL_610;
	//  297  607:goto            587
		long al[];
label0:
		{
label1:
			while(true) 
			{
				do
	//* 298  610:aload_0         
	//* 299  611:getfield        #167 <Field long[] zzdm>
	//* 300  614:ifnonnull       623
				{
					i1 = 1;
	//  301  617:iconst_1        
	//  302  618:istore          6
					break label0;
	//  303  620:goto            671
				} while(zzdm == null || zzdm.length != i1);
	//  304  623:aload_0         
	//  305  624:getfield        #167 <Field long[] zzdm>
	//  306  627:arraylength     
	//  307  628:iload           6
	//  308  630:icmpeq          636
	//* 309  633:goto            617
				i = 0;
	//  310  636:iconst_0        
	//  311  637:istore_2        
				do
				{
					if(i >= i1)
						break label1;
	//  312  638:iload_2         
	//  313  639:iload           6
	//  314  641:icmpge          668
					if(zzdm[i] != al1[i])
	//* 315  644:aload_0         
	//* 316  645:getfield        #167 <Field long[] zzdm>
	//* 317  648:iload_2         
	//* 318  649:laload          
	//* 319  650:aload           17
	//* 320  652:iload_2         
	//* 321  653:laload          
	//* 322  654:lcmp            
	//* 323  655:ifeq            661
						continue label1;
	//  324  658:goto            617
					i++;
	//  325  661:iload_2         
	//  326  662:iconst_1        
	//  327  663:iadd            
	//  328  664:istore_2        
				} while(true);
	//  329  665:goto            638
			}
			i1 = 0;
	//  330  668:iconst_0        
	//  331  669:istore          6
		}
		al = al1;
	//  332  671:aload           17
	//  333  673:astore          16
		i = i1;
	//  334  675:iload           6
	//  335  677:istore_2        
		if(i1 != 0)
	//* 336  678:iload           6
	//* 337  680:ifeq            719
		{
			zzdm = al1;
	//  338  683:aload_0         
	//  339  684:aload           17
	//  340  686:putfield        #167 <Field long[] zzdm>
			al = al1;
	//  341  689:aload           17
	//  342  691:astore          16
			i = i1;
	//  343  693:iload           6
	//  344  695:istore_2        
		}
		break MISSING_BLOCK_LABEL_719;
	//  345  696:goto            719
		if(zzdm != null)
	//* 346  699:aload_0         
	//* 347  700:getfield        #167 <Field long[] zzdm>
	//* 348  703:ifnull          714
		{
			al = null;
	//  349  706:aconst_null     
	//  350  707:astore          16
			i = 1;
	//  351  709:iconst_1        
	//  352  710:istore_2        
		} else
	//* 353  711:goto            719
		{
			al = null;
	//  354  714:aconst_null     
	//  355  715:astore          16
			i = 0;
	//  356  717:iconst_0        
	//  357  718:istore_2        
		}
label2:
		{
			int j1;
			JSONObject jsonobject2;
label3:
			{
				j1 = l;
	//  358  719:iload           5
	//  359  721:istore          6
				if(i != 0)
	//* 360  723:iload_2         
	//* 361  724:ifeq            739
				{
					zzdm = al;
	//  362  727:aload_0         
	//  363  728:aload           16
	//  364  730:putfield        #167 <Field long[] zzdm>
					j1 = l | 2;
	//  365  733:iload           5
	//  366  735:iconst_2        
	//  367  736:ior             
	//  368  737:istore          6
				}
				l = j1;
	//  369  739:iload           6
	//  370  741:istore          5
				if(jsonobject.has("customData"))
	//* 371  743:aload_1         
	//* 372  744:ldc2            #522 <String "customData">
	//* 373  747:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 374  750:ifeq            775
				{
					zzp = jsonobject.getJSONObject("customData");
	//  375  753:aload_0         
	//  376  754:aload_1         
	//  377  755:ldc2            #522 <String "customData">
	//  378  758:invokevirtual   #499 <Method JSONObject JSONObject.getJSONObject(String)>
	//  379  761:putfield        #180 <Field JSONObject zzp>
					zzj = null;
	//  380  764:aload_0         
	//  381  765:aconst_null     
	//  382  766:putfield        #173 <Field String zzj>
					l = j1 | 2;
	//  383  769:iload           6
	//  384  771:iconst_2        
	//  385  772:ior             
	//  386  773:istore          5
				}
				i = l;
	//  387  775:iload           5
	//  388  777:istore_2        
				if(!jsonobject.has("media"))
					break label2;
	//  389  778:aload_1         
	//  390  779:ldc2            #524 <String "media">
	//  391  782:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//  392  785:ifeq            873
				jsonobject2 = jsonobject.getJSONObject("media");
	//  393  788:aload_1         
	//  394  789:ldc2            #524 <String "media">
	//  395  792:invokevirtual   #499 <Method JSONObject JSONObject.getJSONObject(String)>
	//  396  795:astore          16
				MediaInfo mediainfo1 = new MediaInfo(jsonobject2);
	//  397  797:new             #283 <Class MediaInfo>
	//  398  800:dup             
	//  399  801:aload           16
	//  400  803:invokespecial   #526 <Method void MediaInfo(JSONObject)>
	//  401  806:astore          17
				if(zzdi != null)
	//* 402  808:aload_0         
	//* 403  809:getfield        #147 <Field MediaInfo zzdi>
	//* 404  812:ifnull          842
				{
					j1 = l;
	//  405  815:iload           5
	//  406  817:istore          6
					if(zzdi == null)
						break label3;
	//  407  819:aload_0         
	//  408  820:getfield        #147 <Field MediaInfo zzdi>
	//  409  823:ifnull          854
					j1 = l;
	//  410  826:iload           5
	//  411  828:istore          6
					if(zzdi.equals(((Object) (mediainfo1))))
						break label3;
	//  412  830:aload_0         
	//  413  831:getfield        #147 <Field MediaInfo zzdi>
	//  414  834:aload           17
	//  415  836:invokevirtual   #527 <Method boolean MediaInfo.equals(Object)>
	//  416  839:ifne            854
				}
				zzdi = mediainfo1;
	//  417  842:aload_0         
	//  418  843:aload           17
	//  419  845:putfield        #147 <Field MediaInfo zzdi>
				j1 = l | 2;
	//  420  848:iload           5
	//  421  850:iconst_2        
	//  422  851:ior             
	//  423  852:istore          6
			}
			i = j1;
	//  424  854:iload           6
	//  425  856:istore_2        
			if(jsonobject2.has("metadata"))
	//* 426  857:aload           16
	//* 427  859:ldc2            #529 <String "metadata">
	//* 428  862:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 429  865:ifeq            873
				i = j1 | 4;
	//  430  868:iload           6
	//  431  870:iconst_4        
	//  432  871:ior             
	//  433  872:istore_2        
		}
label4:
		{
label5:
			{
label6:
				{
label7:
					{
						l = i;
	//  434  873:iload_2         
	//  435  874:istore          5
						if(jsonobject.has("currentItemId"))
	//* 436  876:aload_1         
	//* 437  877:ldc2            #531 <String "currentItemId">
	//* 438  880:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 439  883:ifeq            918
						{
							int k1 = jsonobject.getInt("currentItemId");
	//  440  886:aload_1         
	//  441  887:ldc2            #531 <String "currentItemId">
	//  442  890:invokevirtual   #535 <Method int JSONObject.getInt(String)>
	//  443  893:istore          6
							l = i;
	//  444  895:iload_2         
	//  445  896:istore          5
							if(zzed != k1)
	//* 446  898:aload_0         
	//* 447  899:getfield        #151 <Field int zzed>
	//* 448  902:iload           6
	//* 449  904:icmpeq          918
							{
								zzed = k1;
	//  450  907:aload_0         
	//  451  908:iload           6
	//  452  910:putfield        #151 <Field int zzed>
								l = i | 2;
	//  453  913:iload_2         
	//  454  914:iconst_2        
	//  455  915:ior             
	//  456  916:istore          5
							}
						}
						int l1 = jsonobject.optInt("preloadedItemId", 0);
	//  457  918:aload_1         
	//  458  919:ldc2            #537 <String "preloadedItemId">
	//  459  922:iconst_0        
	//  460  923:invokevirtual   #541 <Method int JSONObject.optInt(String, int)>
	//  461  926:istore          6
						i = l;
	//  462  928:iload           5
	//  463  930:istore_2        
						if(zzel != l1)
	//* 464  931:aload_0         
	//* 465  932:getfield        #171 <Field int zzel>
	//* 466  935:iload           6
	//* 467  937:icmpeq          952
						{
							zzel = l1;
	//  468  940:aload_0         
	//  469  941:iload           6
	//  470  943:putfield        #171 <Field int zzel>
							i = l | 0x10;
	//  471  946:iload           5
	//  472  948:bipush          16
	//  473  950:ior             
	//  474  951:istore_2        
						}
						l1 = jsonobject.optInt("loadingItemId", 0);
	//  475  952:aload_1         
	//  476  953:ldc2            #543 <String "loadingItemId">
	//  477  956:iconst_0        
	//  478  957:invokevirtual   #541 <Method int JSONObject.optInt(String, int)>
	//  479  960:istore          6
						l = i;
	//  480  962:iload_2         
	//  481  963:istore          5
						if(zzek != l1)
	//* 482  965:aload_0         
	//* 483  966:getfield        #169 <Field int zzek>
	//* 484  969:iload           6
	//* 485  971:icmpeq          985
						{
							zzek = l1;
	//  486  974:aload_0         
	//  487  975:iload           6
	//  488  977:putfield        #169 <Field int zzek>
							l = i | 2;
	//  489  980:iload_2         
	//  490  981:iconst_2        
	//  491  982:ior             
	//  492  983:istore          5
						}
						MediaInfo mediainfo = zzdi;
	//  493  985:aload_0         
	//  494  986:getfield        #147 <Field MediaInfo zzdi>
	//  495  989:astore          16
						byte byte0 = -1;
	//  496  991:iconst_m1       
	//  497  992:istore          7
						if(mediainfo == null)
	//* 498  994:aload           16
	//* 499  996:ifnonnull       1004
							i = -1;
	//  500  999:iconst_m1       
	//  501 1000:istore_2        
						else
	//* 502 1001:goto            1012
							i = zzdi.getStreamType();
	//  503 1004:aload_0         
	//  504 1005:getfield        #147 <Field MediaInfo zzdi>
	//  505 1008:invokevirtual   #546 <Method int MediaInfo.getStreamType()>
	//  506 1011:istore_2        
						if(zza(zzee, zzef, zzek, i))
							break label6;
	//  507 1012:aload_0         
	//  508 1013:getfield        #155 <Field int zzee>
	//  509 1016:aload_0         
	//  510 1017:getfield        #157 <Field int zzef>
	//  511 1020:aload_0         
	//  512 1021:getfield        #169 <Field int zzek>
	//  513 1024:iload_2         
	//  514 1025:invokestatic    #548 <Method boolean zza(int, int, int, int)>
	//  515 1028:ifne            1531
						if(jsonobject.has("repeatMode"))
	//* 516 1031:aload_1         
	//* 517 1032:ldc2            #550 <String "repeatMode">
	//* 518 1035:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 519 1038:ifeq            1241
						{
							int i2 = zzem;
	//  520 1041:aload_0         
	//  521 1042:getfield        #182 <Field int zzem>
	//  522 1045:istore          6
							String s2 = jsonobject.getString("repeatMode");
	//  523 1047:aload_1         
	//  524 1048:ldc2            #550 <String "repeatMode">
	//  525 1051:invokevirtual   #463 <Method String JSONObject.getString(String)>
	//  526 1054:astore          16
							i = s2.hashCode();
	//  527 1056:aload           16
	//  528 1058:invokevirtual   #552 <Method int String.hashCode()>
	//  529 1061:istore_2        
							if(i != 0xbd57d3ef)
	//* 530 1062:iload_2         
	//* 531 1063:ldc2            #553 <Int 0xbd57d3ef>
	//* 532 1066:icmpeq          1153
							{
								if(i != 0xc69b5f6c)
	//* 533 1069:iload_2         
	//* 534 1070:ldc2            #554 <Int 0xc69b5f6c>
	//* 535 1073:icmpeq          1134
								{
									if(i != 0x621b08dd)
	//* 536 1076:iload_2         
	//* 537 1077:ldc2            #555 <Int 0x621b08dd>
	//* 538 1080:icmpeq          1115
									{
										if(i != 0x621b3cab)
	//* 539 1083:iload_2         
	//* 540 1084:ldc2            #556 <Int 0x621b3cab>
	//* 541 1087:icmpeq          1096
										{
											i = ((int) (byte0));
	//  542 1090:iload           7
	//  543 1092:istore_2        
										} else
	//* 544 1093:goto            1169
										{
											i = ((int) (byte0));
	//  545 1096:iload           7
	//  546 1098:istore_2        
											if(s2.equals("REPEAT_OFF"))
	//* 547 1099:aload           16
	//* 548 1101:ldc2            #558 <String "REPEAT_OFF">
	//* 549 1104:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 550 1107:ifeq            1169
												i = 0;
	//  551 1110:iconst_0        
	//  552 1111:istore_2        
										}
									} else
	//* 553 1112:goto            1169
									{
										i = ((int) (byte0));
	//  554 1115:iload           7
	//  555 1117:istore_2        
										if(s2.equals("REPEAT_ALL"))
	//* 556 1118:aload           16
	//* 557 1120:ldc2            #560 <String "REPEAT_ALL">
	//* 558 1123:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 559 1126:ifeq            1169
											i = 1;
	//  560 1129:iconst_1        
	//  561 1130:istore_2        
									}
								} else
	//* 562 1131:goto            1169
								{
									i = ((int) (byte0));
	//  563 1134:iload           7
	//  564 1136:istore_2        
									if(s2.equals("REPEAT_SINGLE"))
	//* 565 1137:aload           16
	//* 566 1139:ldc2            #562 <String "REPEAT_SINGLE">
	//* 567 1142:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 568 1145:ifeq            1169
										i = 2;
	//  569 1148:iconst_2        
	//  570 1149:istore_2        
								}
							} else
	//* 571 1150:goto            1169
							{
								i = ((int) (byte0));
	//  572 1153:iload           7
	//  573 1155:istore_2        
								if(s2.equals("REPEAT_ALL_AND_SHUFFLE"))
	//* 574 1156:aload           16
	//* 575 1158:ldc2            #564 <String "REPEAT_ALL_AND_SHUFFLE">
	//* 576 1161:invokevirtual   #309 <Method boolean String.equals(Object)>
	//* 577 1164:ifeq            1169
									i = 3;
	//  578 1167:iconst_3        
	//  579 1168:istore_2        
							}
							switch(i)
	//* 580 1169:iload_2         
							{
	//* 581 1170:tableswitch     0 3: default 1200
	//	               0 1221
	//	               1 1216
	//	               2 1211
	//	               3 1206
							default:
								i = i2;
	//  582 1200:iload           6
	//  583 1202:istore_2        
								break;

	//* 584 1203:goto            1223
							case 3: // '\003'
								i = 3;
	//  585 1206:iconst_3        
	//  586 1207:istore_2        
								break;

	//* 587 1208:goto            1223
							case 2: // '\002'
								i = 2;
	//  588 1211:iconst_2        
	//  589 1212:istore_2        
								break;

	//* 590 1213:goto            1223
							case 1: // '\001'
								i = 1;
	//  591 1216:iconst_1        
	//  592 1217:istore_2        
								break;

	//* 593 1218:goto            1223
							case 0: // '\0'
								i = 0;
	//  594 1221:iconst_0        
	//  595 1222:istore_2        
								break;
							}
							if(zzem != i)
	//* 596 1223:aload_0         
	//* 597 1224:getfield        #182 <Field int zzem>
	//* 598 1227:iload_2         
	//* 599 1228:icmpeq          1241
							{
								zzem = i;
	//  600 1231:aload_0         
	//  601 1232:iload_2         
	//  602 1233:putfield        #182 <Field int zzem>
								i = 1;
	//  603 1236:iconst_1        
	//  604 1237:istore_2        
								break label7;
	//  605 1238:goto            1243
							}
						}
						i = 0;
	//  606 1241:iconst_0        
	//  607 1242:istore_2        
					}
					int j2 = i;
	//  608 1243:iload_2         
	//  609 1244:istore          6
					if(jsonobject.has("items"))
	//* 610 1246:aload_1         
	//* 611 1247:ldc2            #566 <String "items">
	//* 612 1250:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 613 1253:ifeq            1520
					{
						JSONArray jsonarray1 = jsonobject.getJSONArray("items");
	//  614 1256:aload_1         
	//  615 1257:ldc2            #566 <String "items">
	//  616 1260:invokevirtual   #512 <Method JSONArray JSONObject.getJSONArray(String)>
	//  617 1263:astore          16
						int l2 = jsonarray1.length();
	//  618 1265:aload           16
	//  619 1267:invokevirtual   #517 <Method int JSONArray.length()>
	//  620 1270:istore          7
						SparseArray sparsearray = new SparseArray();
	//  621 1272:new             #142 <Class SparseArray>
	//  622 1275:dup             
	//  623 1276:invokespecial   #143 <Method void SparseArray()>
	//  624 1279:astore          17
						for(j2 = 0; j2 < l2; j2++)
	//* 625 1281:iconst_0        
	//* 626 1282:istore          6
	//* 627 1284:iload           6
	//* 628 1286:iload           7
	//* 629 1288:icmpge          1323
							sparsearray.put(j2, ((Object) (Integer.valueOf(jsonarray1.getJSONObject(j2).getInt("itemId")))));
	//  630 1291:aload           17
	//  631 1293:iload           6
	//  632 1295:aload           16
	//  633 1297:iload           6
	//  634 1299:invokevirtual   #569 <Method JSONObject JSONArray.getJSONObject(int)>
	//  635 1302:ldc2            #571 <String "itemId">
	//  636 1305:invokevirtual   #535 <Method int JSONObject.getInt(String)>
	//  637 1308:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//  638 1311:invokevirtual   #242 <Method void SparseArray.put(int, Object)>

	//  639 1314:iload           6
	//  640 1316:iconst_1        
	//  641 1317:iadd            
	//  642 1318:istore          6
	//* 643 1320:goto            1284
						MediaQueueItem amediaqueueitem[] = new MediaQueueItem[l2];
	//  644 1323:iload           7
	//  645 1325:anewarray       MediaQueueItem[]
	//  646 1328:astore          18
						for(j2 = 0; j2 < l2; j2++)
	//* 647 1330:iconst_0        
	//* 648 1331:istore          6
	//* 649 1333:iload           6
	//* 650 1335:iload           7
	//* 651 1337:icmpge          1494
						{
							Integer integer = (Integer)sparsearray.get(j2);
	//  652 1340:aload           17
	//  653 1342:iload           6
	//  654 1344:invokevirtual   #327 <Method Object SparseArray.get(int)>
	//  655 1347:checkcast       #234 <Class Integer>
	//  656 1350:astore          19
							JSONObject jsonobject3 = jsonarray1.getJSONObject(j2);
	//  657 1352:aload           16
	//  658 1354:iload           6
	//  659 1356:invokevirtual   #569 <Method JSONObject JSONArray.getJSONObject(int)>
	//  660 1359:astore          20
							MediaQueueItem mediaqueueitem = getItemById(integer.intValue());
	//  661 1361:aload_0         
	//  662 1362:aload           19
	//  663 1364:invokevirtual   #332 <Method int Integer.intValue()>
	//  664 1367:invokevirtual   #343 <Method MediaQueueItem getItemById(int)>
	//  665 1370:astore          21
							if(mediaqueueitem != null)
	//* 666 1372:aload           21
	//* 667 1374:ifnull          1416
							{
								i |= ((int) (mediaqueueitem.zzf(jsonobject3)));
	//  668 1377:iload_2         
	//  669 1378:aload           21
	//  670 1380:aload           20
	//  671 1382:invokevirtual   #575 <Method boolean MediaQueueItem.zzf(JSONObject)>
	//  672 1385:ior             
	//  673 1386:istore_2        
								amediaqueueitem[j2] = mediaqueueitem;
	//  674 1387:aload           18
	//  675 1389:iload           6
	//  676 1391:aload           21
	//  677 1393:aastore         
								if(j2 == getIndexById(integer.intValue()).intValue())
									continue;
	//  678 1394:iload           6
	//  679 1396:aload_0         
	//  680 1397:aload           19
	//  681 1399:invokevirtual   #332 <Method int Integer.intValue()>
	//  682 1402:invokevirtual   #577 <Method Integer getIndexById(int)>
	//  683 1405:invokevirtual   #332 <Method int Integer.intValue()>
	//  684 1408:icmpeq          1485
							} else
	//* 685 1411:iconst_1        
	//* 686 1412:istore_2        
	//* 687 1413:goto            1485
							if(integer.intValue() == zzed && zzdi != null)
	//* 688 1416:aload           19
	//* 689 1418:invokevirtual   #332 <Method int Integer.intValue()>
	//* 690 1421:aload_0         
	//* 691 1422:getfield        #151 <Field int zzed>
	//* 692 1425:icmpne          1468
	//* 693 1428:aload_0         
	//* 694 1429:getfield        #147 <Field MediaInfo zzdi>
	//* 695 1432:ifnull          1468
							{
								amediaqueueitem[j2] = (new MediaQueueItem.Builder(zzdi)).build();
	//  696 1435:aload           18
	//  697 1437:iload           6
	//  698 1439:new             #579 <Class MediaQueueItem$Builder>
	//  699 1442:dup             
	//  700 1443:aload_0         
	//  701 1444:getfield        #147 <Field MediaInfo zzdi>
	//  702 1447:invokespecial   #582 <Method void MediaQueueItem$Builder(MediaInfo)>
	//  703 1450:invokevirtual   #586 <Method MediaQueueItem MediaQueueItem$Builder.build()>
	//  704 1453:aastore         
								amediaqueueitem[j2].zzf(jsonobject3);
	//  705 1454:aload           18
	//  706 1456:iload           6
	//  707 1458:aaload          
	//  708 1459:aload           20
	//  709 1461:invokevirtual   #575 <Method boolean MediaQueueItem.zzf(JSONObject)>
	//  710 1464:pop             
							} else
	//* 711 1465:goto            1411
							{
								amediaqueueitem[j2] = new MediaQueueItem(jsonobject3);
	//  712 1468:aload           18
	//  713 1470:iload           6
	//  714 1472:new             #194 <Class MediaQueueItem>
	//  715 1475:dup             
	//  716 1476:aload           20
	//  717 1478:invokespecial   #587 <Method void MediaQueueItem(JSONObject)>
	//  718 1481:aastore         
							}
							i = 1;
						}

	//  719 1482:goto            1411
	//  720 1485:iload           6
	//  721 1487:iconst_1        
	//  722 1488:iadd            
	//  723 1489:istore          6
	//* 724 1491:goto            1333
						if(zzen.size() != l2)
	//* 725 1494:aload_0         
	//* 726 1495:getfield        #140 <Field ArrayList zzen>
	//* 727 1498:invokevirtual   #335 <Method int ArrayList.size()>
	//* 728 1501:iload           7
	//* 729 1503:icmpeq          1511
							i = 1;
	//  730 1506:iconst_1        
	//  731 1507:istore_2        
	//* 732 1508:goto            1511
						zza(amediaqueueitem);
	//  733 1511:aload_0         
	//  734 1512:aload           18
	//  735 1514:invokespecial   #204 <Method void zza(MediaQueueItem[])>
						j2 = i;
	//  736 1517:iload_2         
	//  737 1518:istore          6
					}
					i = l;
	//  738 1520:iload           5
	//  739 1522:istore_2        
					if(j2 == 0)
	//* 740 1523:iload           6
	//* 741 1525:ifeq            1584
						break label4;
	//  742 1528:goto            1578
					break label5;
				}
				zzed = 0;
	//  743 1531:aload_0         
	//  744 1532:iconst_0        
	//  745 1533:putfield        #151 <Field int zzed>
				zzek = 0;
	//  746 1536:aload_0         
	//  747 1537:iconst_0        
	//  748 1538:putfield        #169 <Field int zzek>
				zzel = 0;
	//  749 1541:aload_0         
	//  750 1542:iconst_0        
	//  751 1543:putfield        #171 <Field int zzel>
				i = l;
	//  752 1546:iload           5
	//  753 1548:istore_2        
				if(zzen.isEmpty())
					break label4;
	//  754 1549:aload_0         
	//  755 1550:getfield        #140 <Field ArrayList zzen>
	//  756 1553:invokevirtual   #588 <Method boolean ArrayList.isEmpty()>
	//  757 1556:ifne            1584
				zzem = 0;
	//  758 1559:aload_0         
	//  759 1560:iconst_0        
	//  760 1561:putfield        #182 <Field int zzem>
				zzen.clear();
	//  761 1564:aload_0         
	//  762 1565:getfield        #140 <Field ArrayList zzen>
	//  763 1568:invokevirtual   #224 <Method void ArrayList.clear()>
				zzer.clear();
	//  764 1571:aload_0         
	//  765 1572:getfield        #145 <Field SparseArray zzer>
	//  766 1575:invokevirtual   #225 <Method void SparseArray.clear()>
			}
			i = l | 8;
	//  767 1578:iload           5
	//  768 1580:bipush          8
	//  769 1582:ior             
	//  770 1583:istore_2        
		}
label8:
		{
			AdBreakStatus adbreakstatus = AdBreakStatus.zzc(jsonobject.optJSONObject("breakStatus"));
	//  771 1584:aload_1         
	//  772 1585:ldc2            #590 <String "breakStatus">
	//  773 1588:invokevirtual   #593 <Method JSONObject JSONObject.optJSONObject(String)>
	//  774 1591:invokestatic    #597 <Method AdBreakStatus AdBreakStatus.zzc(JSONObject)>
	//  775 1594:astore          16
			if(zzep != null || adbreakstatus == null)
	//* 776 1596:aload_0         
	//* 777 1597:getfield        #208 <Field AdBreakStatus zzep>
	//* 778 1600:ifnonnull       1608
	//* 779 1603:aload           16
	//* 780 1605:ifnonnull       1633
			{
				l = i;
	//  781 1608:iload_2         
	//  782 1609:istore          5
				if(zzep == null)
					break label8;
	//  783 1611:aload_0         
	//  784 1612:getfield        #208 <Field AdBreakStatus zzep>
	//  785 1615:ifnull          1659
				l = i;
	//  786 1618:iload_2         
	//  787 1619:istore          5
				if(zzep.equals(((Object) (adbreakstatus))))
					break label8;
	//  788 1621:aload_0         
	//  789 1622:getfield        #208 <Field AdBreakStatus zzep>
	//  790 1625:aload           16
	//  791 1627:invokevirtual   #598 <Method boolean AdBreakStatus.equals(Object)>
	//  792 1630:ifne            1659
			}
			if(adbreakstatus != null)
	//* 793 1633:aload           16
	//* 794 1635:ifnull          1641
				flag = true;
	//  795 1638:iconst_1        
	//  796 1639:istore          14
			zzeo = flag;
	//  797 1641:aload_0         
	//  798 1642:iload           14
	//  799 1644:putfield        #206 <Field boolean zzeo>
			zzep = adbreakstatus;
	//  800 1647:aload_0         
	//  801 1648:aload           16
	//  802 1650:putfield        #208 <Field AdBreakStatus zzep>
			l = i | 0x20;
	//  803 1653:iload_2         
	//  804 1654:bipush          32
	//  805 1656:ior             
	//  806 1657:istore          5
		}
label9:
		{
			VideoInfo videoinfo = VideoInfo.zzg(jsonobject.optJSONObject("videoInfo"));
	//  807 1659:aload_1         
	//  808 1660:ldc2            #600 <String "videoInfo">
	//  809 1663:invokevirtual   #593 <Method JSONObject JSONObject.optJSONObject(String)>
	//  810 1666:invokestatic    #606 <Method VideoInfo VideoInfo.zzg(JSONObject)>
	//  811 1669:astore          16
			if(zzeq != null || videoinfo == null)
	//* 812 1671:aload_0         
	//* 813 1672:getfield        #210 <Field VideoInfo zzeq>
	//* 814 1675:ifnonnull       1683
	//* 815 1678:aload           16
	//* 816 1680:ifnonnull       1708
			{
				i = l;
	//  817 1683:iload           5
	//  818 1685:istore_2        
				if(zzeq == null)
					break label9;
	//  819 1686:aload_0         
	//  820 1687:getfield        #210 <Field VideoInfo zzeq>
	//  821 1690:ifnull          1720
				i = l;
	//  822 1693:iload           5
	//  823 1695:istore_2        
				if(zzeq.equals(((Object) (videoinfo))))
					break label9;
	//  824 1696:aload_0         
	//  825 1697:getfield        #210 <Field VideoInfo zzeq>
	//  826 1700:aload           16
	//  827 1702:invokevirtual   #607 <Method boolean VideoInfo.equals(Object)>
	//  828 1705:ifne            1720
			}
			zzeq = videoinfo;
	//  829 1708:aload_0         
	//  830 1709:aload           16
	//  831 1711:putfield        #210 <Field VideoInfo zzeq>
			i = l | 0x40;
	//  832 1714:iload           5
	//  833 1716:bipush          64
	//  834 1718:ior             
	//  835 1719:istore_2        
		}
		l = i;
	//  836 1720:iload_2         
	//  837 1721:istore          5
		if(jsonobject.has("breakInfo"))
	//* 838 1723:aload_1         
	//* 839 1724:ldc2            #609 <String "breakInfo">
	//* 840 1727:invokevirtual   #459 <Method boolean JSONObject.has(String)>
	//* 841 1730:ifeq            1762
		{
			l = i;
	//  842 1733:iload_2         
	//  843 1734:istore          5
			if(zzdi != null)
	//* 844 1736:aload_0         
	//* 845 1737:getfield        #147 <Field MediaInfo zzdi>
	//* 846 1740:ifnull          1762
			{
				zzdi.zzd(jsonobject.getJSONObject("breakInfo"));
	//  847 1743:aload_0         
	//  848 1744:getfield        #147 <Field MediaInfo zzdi>
	//  849 1747:aload_1         
	//  850 1748:ldc2            #609 <String "breakInfo">
	//  851 1751:invokevirtual   #499 <Method JSONObject JSONObject.getJSONObject(String)>
	//  852 1754:invokevirtual   #612 <Method void MediaInfo.zzd(JSONObject)>
				l = i | 2;
	//  853 1757:iload_2         
	//  854 1758:iconst_2        
	//  855 1759:ior             
	//  856 1760:istore          5
			}
		}
		return l;
	//  857 1762:iload           5
	//  858 1764:ireturn         
	}

	public final void zzf(boolean flag)
	{
		zzeo = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #206 <Field boolean zzeo>
	//    3    5:return          
	}

	public final long zzj()
	{
		return zzec;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field long zzec>
	//    2    4:lreturn         
	}

	public final boolean zzk()
	{
		int i;
		if(zzdi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field MediaInfo zzdi>
	//*   2    4:ifnonnull       12
			i = -1;
	//    3    7:iconst_m1       
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = zzdi.getStreamType();
	//    6   12:aload_0         
	//    7   13:getfield        #147 <Field MediaInfo zzdi>
	//    8   16:invokevirtual   #546 <Method int MediaInfo.getStreamType()>
	//    9   19:istore_1        
		return zza(zzee, zzef, zzek, i);
	//   10   20:aload_0         
	//   11   21:getfield        #155 <Field int zzee>
	//   12   24:aload_0         
	//   13   25:getfield        #157 <Field int zzef>
	//   14   28:aload_0         
	//   15   29:getfield        #169 <Field int zzek>
	//   16   32:iload_1         
	//   17   33:invokestatic    #548 <Method boolean zza(int, int, int, int)>
	//   18   36:ireturn         
	}

	public static final long COMMAND_PAUSE = 1L;
	public static final long COMMAND_SEEK = 2L;
	public static final long COMMAND_SET_VOLUME = 4L;
	public static final long COMMAND_SKIP_BACKWARD = 32L;
	public static final long COMMAND_SKIP_FORWARD = 16L;
	public static final long COMMAND_TOGGLE_MUTE = 8L;
	public static final android.os.Parcelable.Creator CREATOR = new zzan();
	public static final int IDLE_REASON_CANCELED = 2;
	public static final int IDLE_REASON_ERROR = 4;
	public static final int IDLE_REASON_FINISHED = 1;
	public static final int IDLE_REASON_INTERRUPTED = 3;
	public static final int IDLE_REASON_NONE = 0;
	public static final int PLAYER_STATE_BUFFERING = 4;
	public static final int PLAYER_STATE_IDLE = 1;
	public static final int PLAYER_STATE_PAUSED = 3;
	public static final int PLAYER_STATE_PLAYING = 2;
	public static final int PLAYER_STATE_UNKNOWN = 0;
	public static final int REPEAT_MODE_REPEAT_ALL = 1;
	public static final int REPEAT_MODE_REPEAT_ALL_AND_SHUFFLE = 3;
	public static final int REPEAT_MODE_REPEAT_OFF = 0;
	public static final int REPEAT_MODE_REPEAT_SINGLE = 2;
	private MediaInfo zzdi;
	private double zzdl;
	private long zzdm[];
	private long zzec;
	private int zzed;
	private int zzee;
	private int zzef;
	private long zzeg;
	private long zzeh;
	private double zzei;
	private boolean zzej;
	private int zzek;
	private int zzel;
	private int zzem;
	private final ArrayList zzen;
	private boolean zzeo;
	private AdBreakStatus zzep;
	private VideoInfo zzeq;
	private final SparseArray zzer;
	private String zzj;
	private JSONObject zzp;

	static 
	{
	//    0    0:new             #123 <Class zzan>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void zzan()>
	//    3    7:putstatic       #128 <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
