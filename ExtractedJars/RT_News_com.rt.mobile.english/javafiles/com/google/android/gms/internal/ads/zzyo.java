// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmb, zzpl

public final class zzyo
	implements NativeMediationAdRequest
{

	public zzyo(Date date, int i, Set set, Location location, boolean flag, int j, zzpl zzpl1, 
			List list, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		zzhl = date;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field Date zzhl>
		zzaqn = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #38  <Field int zzaqn>
		zzhn = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field Set zzhn>
		zzhp = location;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #42  <Field Location zzhp>
		zzho = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #44  <Field boolean zzho>
		zzbur = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #46  <Field int zzbur>
		zzyb = zzpl1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #48  <Field zzpl zzyb>
		zzaqz = flag1;
	//   23   43:aload_0         
	//   24   44:iload           9
	//   25   46:putfield        #50  <Field boolean zzaqz>
	//   26   49:aload_0         
	//   27   50:new             #52  <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #53  <Method void ArrayList()>
	//   30   57:putfield        #55  <Field List zzyc>
	//   31   60:aload_0         
	//   32   61:new             #57  <Class HashMap>
	//   33   64:dup             
	//   34   65:invokespecial   #58  <Method void HashMap()>
	//   35   68:putfield        #60  <Field Map zzbva>
		if(list != null)
	//*  36   71:aload           8
	//*  37   73:ifnull          211
		{
			zzpl1 = ((zzpl) (list.iterator()));
	//   38   76:aload           8
	//   39   78:invokeinterface #66  <Method Iterator List.iterator()>
	//   40   83:astore          7
			do
			{
				if(!((Iterator) (zzpl1)).hasNext())
					break;
	//   41   85:aload           7
	//   42   87:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//   43   92:ifeq            211
				date = ((Date) ((String)((Iterator) (zzpl1)).next()));
	//   44   95:aload           7
	//   45   97:invokeinterface #76  <Method Object Iterator.next()>
	//   46  102:checkcast       #78  <Class String>
	//   47  105:astore_1        
				if(((String) (date)).startsWith("custom:"))
	//*  48  106:aload_1         
	//*  49  107:ldc1            #80  <String "custom:">
	//*  50  109:invokevirtual   #84  <Method boolean String.startsWith(String)>
	//*  51  112:ifeq            197
				{
					date = ((Date) (((String) (date)).split(":", 3)));
	//   52  115:aload_1         
	//   53  116:ldc1            #86  <String ":">
	//   54  118:iconst_3        
	//   55  119:invokevirtual   #90  <Method String[] String.split(String, int)>
	//   56  122:astore_1        
					if(date.length != 3)
						continue;
	//   57  123:aload_1         
	//   58  124:arraylength     
	//   59  125:iconst_3        
	//   60  126:icmpne          85
					if("true".equals(((Object) (date[2]))))
	//*  61  129:ldc1            #92  <String "true">
	//*  62  131:aload_1         
	//*  63  132:iconst_2        
	//*  64  133:aaload          
	//*  65  134:invokevirtual   #96  <Method boolean String.equals(Object)>
	//*  66  137:ifeq            168
					{
						set = ((Set) (zzbva));
	//   67  140:aload_0         
	//   68  141:getfield        #60  <Field Map zzbva>
	//   69  144:astore_3        
						date = ((Date) (date[1]));
	//   70  145:aload_1         
	//   71  146:iconst_1        
	//   72  147:aaload          
	//   73  148:astore_1        
						location = ((Location) (Boolean.valueOf(true)));
	//   74  149:iconst_1        
	//   75  150:invokestatic    #102 <Method Boolean Boolean.valueOf(boolean)>
	//   76  153:astore          4
					} else
	//*  77  155:aload_3         
	//*  78  156:aload_1         
	//*  79  157:aload           4
	//*  80  159:invokeinterface #108 <Method Object Map.put(Object, Object)>
	//*  81  164:pop             
	//*  82  165:goto            85
					{
						if(!"false".equals(((Object) (date[2]))))
							continue;
	//   83  168:ldc1            #110 <String "false">
	//   84  170:aload_1         
	//   85  171:iconst_2        
	//   86  172:aaload          
	//   87  173:invokevirtual   #96  <Method boolean String.equals(Object)>
	//   88  176:ifeq            85
						set = ((Set) (zzbva));
	//   89  179:aload_0         
	//   90  180:getfield        #60  <Field Map zzbva>
	//   91  183:astore_3        
						date = ((Date) (date[1]));
	//   92  184:aload_1         
	//   93  185:iconst_1        
	//   94  186:aaload          
	//   95  187:astore_1        
						location = ((Location) (Boolean.valueOf(false)));
	//   96  188:iconst_0        
	//   97  189:invokestatic    #102 <Method Boolean Boolean.valueOf(boolean)>
	//   98  192:astore          4
					}
					((Map) (set)).put(((Object) (date)), ((Object) (location)));
					continue;
				}
	//*  99  194:goto            155
				zzyc.add(((Object) (date)));
	//  100  197:aload_0         
	//  101  198:getfield        #55  <Field List zzyc>
	//  102  201:aload_1         
	//  103  202:invokeinterface #113 <Method boolean List.add(Object)>
	//  104  207:pop             
			} while(true);
	//  105  208:goto            85
		}
	//  106  211:return          
	}

	public final float getAdVolume()
	{
		return zzmb.zziv().zzdo();
	//    0    0:invokestatic    #125 <Method zzmb zzmb.zziv()>
	//    1    3:invokevirtual   #128 <Method float zzmb.zzdo()>
	//    2    6:freturn         
	}

	public final Date getBirthday()
	{
		return zzhl;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Date zzhl>
	//    2    4:areturn         
	}

	public final int getGender()
	{
		return zzaqn;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int zzaqn>
	//    2    4:ireturn         
	}

	public final Set getKeywords()
	{
		return zzhn;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Set zzhn>
	//    2    4:areturn         
	}

	public final Location getLocation()
	{
		return zzhp;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Location zzhp>
	//    2    4:areturn         
	}

	public final NativeAdOptions getNativeAdOptions()
	{
		if(zzyb == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field zzpl zzyb>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		com.google.android.gms.ads.formats.NativeAdOptions.Builder builder = (new com.google.android.gms.ads.formats.NativeAdOptions.Builder()).setReturnUrlsForImageAssets(zzyb.zzbjn).setImageOrientation(zzyb.zzbjo).setRequestMultipleImages(zzyb.zzbjp);
	//    5    9:new             #141 <Class com.google.android.gms.ads.formats.NativeAdOptions$Builder>
	//    6   12:dup             
	//    7   13:invokespecial   #142 <Method void com.google.android.gms.ads.formats.NativeAdOptions$Builder()>
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field zzpl zzyb>
	//   10   20:getfield        #147 <Field boolean zzpl.zzbjn>
	//   11   23:invokevirtual   #151 <Method com.google.android.gms.ads.formats.NativeAdOptions$Builder com.google.android.gms.ads.formats.NativeAdOptions$Builder.setReturnUrlsForImageAssets(boolean)>
	//   12   26:aload_0         
	//   13   27:getfield        #48  <Field zzpl zzyb>
	//   14   30:getfield        #154 <Field int zzpl.zzbjo>
	//   15   33:invokevirtual   #158 <Method com.google.android.gms.ads.formats.NativeAdOptions$Builder com.google.android.gms.ads.formats.NativeAdOptions$Builder.setImageOrientation(int)>
	//   16   36:aload_0         
	//   17   37:getfield        #48  <Field zzpl zzyb>
	//   18   40:getfield        #161 <Field boolean zzpl.zzbjp>
	//   19   43:invokevirtual   #164 <Method com.google.android.gms.ads.formats.NativeAdOptions$Builder com.google.android.gms.ads.formats.NativeAdOptions$Builder.setRequestMultipleImages(boolean)>
	//   20   46:astore_1        
		if(zzyb.versionCode >= 2)
	//*  21   47:aload_0         
	//*  22   48:getfield        #48  <Field zzpl zzyb>
	//*  23   51:getfield        #167 <Field int zzpl.versionCode>
	//*  24   54:iconst_2        
	//*  25   55:icmplt          70
			builder.setAdChoicesPlacement(zzyb.zzbjq);
	//   26   58:aload_1         
	//   27   59:aload_0         
	//   28   60:getfield        #48  <Field zzpl zzyb>
	//   29   63:getfield        #170 <Field int zzpl.zzbjq>
	//   30   66:invokevirtual   #173 <Method com.google.android.gms.ads.formats.NativeAdOptions$Builder com.google.android.gms.ads.formats.NativeAdOptions$Builder.setAdChoicesPlacement(int)>
	//   31   69:pop             
		if(zzyb.versionCode >= 3 && zzyb.zzbjr != null)
	//*  32   70:aload_0         
	//*  33   71:getfield        #48  <Field zzpl zzyb>
	//*  34   74:getfield        #167 <Field int zzpl.versionCode>
	//*  35   77:iconst_3        
	//*  36   78:icmplt          110
	//*  37   81:aload_0         
	//*  38   82:getfield        #48  <Field zzpl zzyb>
	//*  39   85:getfield        #177 <Field zzmu zzpl.zzbjr>
	//*  40   88:ifnull          110
			builder.setVideoOptions(new VideoOptions(zzyb.zzbjr));
	//   41   91:aload_1         
	//   42   92:new             #179 <Class VideoOptions>
	//   43   95:dup             
	//   44   96:aload_0         
	//   45   97:getfield        #48  <Field zzpl zzyb>
	//   46  100:getfield        #177 <Field zzmu zzpl.zzbjr>
	//   47  103:invokespecial   #182 <Method void VideoOptions(zzmu)>
	//   48  106:invokevirtual   #186 <Method com.google.android.gms.ads.formats.NativeAdOptions$Builder com.google.android.gms.ads.formats.NativeAdOptions$Builder.setVideoOptions(VideoOptions)>
	//   49  109:pop             
		return builder.build();
	//   50  110:aload_1         
	//   51  111:invokevirtual   #189 <Method NativeAdOptions com.google.android.gms.ads.formats.NativeAdOptions$Builder.build()>
	//   52  114:areturn         
	}

	public final boolean isAdMuted()
	{
		return zzmb.zziv().zzdp();
	//    0    0:invokestatic    #125 <Method zzmb zzmb.zziv()>
	//    1    3:invokevirtual   #193 <Method boolean zzmb.zzdp()>
	//    2    6:ireturn         
	}

	public final boolean isAppInstallAdRequested()
	{
		return zzyc != null && (zzyc.contains("2") || zzyc.contains("6"));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List zzyc>
	//    2    4:ifnull          37
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field List zzyc>
	//    5   11:ldc1            #196 <String "2">
	//    6   13:invokeinterface #199 <Method boolean List.contains(Object)>
	//    7   18:ifne            35
	//    8   21:aload_0         
	//    9   22:getfield        #55  <Field List zzyc>
	//   10   25:ldc1            #201 <String "6">
	//   11   27:invokeinterface #199 <Method boolean List.contains(Object)>
	//   12   32:ifeq            37
	//   13   35:iconst_1        
	//   14   36:ireturn         
	//   15   37:iconst_0        
	//   16   38:ireturn         
	}

	public final boolean isContentAdRequested()
	{
		return zzyc != null && (zzyc.contains("1") || zzyc.contains("6"));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List zzyc>
	//    2    4:ifnull          37
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field List zzyc>
	//    5   11:ldc1            #204 <String "1">
	//    6   13:invokeinterface #199 <Method boolean List.contains(Object)>
	//    7   18:ifne            35
	//    8   21:aload_0         
	//    9   22:getfield        #55  <Field List zzyc>
	//   10   25:ldc1            #201 <String "6">
	//   11   27:invokeinterface #199 <Method boolean List.contains(Object)>
	//   12   32:ifeq            37
	//   13   35:iconst_1        
	//   14   36:ireturn         
	//   15   37:iconst_0        
	//   16   38:ireturn         
	}

	public final boolean isDesignedForFamilies()
	{
		return zzaqz;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean zzaqz>
	//    2    4:ireturn         
	}

	public final boolean isTesting()
	{
		return zzho;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean zzho>
	//    2    4:ireturn         
	}

	public final boolean isUnifiedNativeAdRequested()
	{
		return zzyc != null && zzyc.contains("6");
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List zzyc>
	//    2    4:ifnull          23
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field List zzyc>
	//    5   11:ldc1            #201 <String "6">
	//    6   13:invokeinterface #199 <Method boolean List.contains(Object)>
	//    7   18:ifeq            23
	//    8   21:iconst_1        
	//    9   22:ireturn         
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public final int taggedForChildDirectedTreatment()
	{
		return zzbur;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int zzbur>
	//    2    4:ireturn         
	}

	public final boolean zzna()
	{
		return zzyc != null && zzyc.contains("3");
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List zzyc>
	//    2    4:ifnull          23
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field List zzyc>
	//    5   11:ldc1            #211 <String "3">
	//    6   13:invokeinterface #199 <Method boolean List.contains(Object)>
	//    7   18:ifeq            23
	//    8   21:iconst_1        
	//    9   22:ireturn         
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public final Map zznb()
	{
		return zzbva;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map zzbva>
	//    2    4:areturn         
	}

	private final int zzaqn;
	private final boolean zzaqz;
	private final int zzbur;
	private final Map zzbva = new HashMap();
	private final Date zzhl;
	private final Set zzhn;
	private final boolean zzho;
	private final Location zzhp;
	private final zzpl zzyb;
	private final List zzyc = new ArrayList();
}
