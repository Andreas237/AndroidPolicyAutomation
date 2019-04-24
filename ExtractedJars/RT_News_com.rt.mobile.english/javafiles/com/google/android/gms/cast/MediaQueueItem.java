// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzcu;
import java.util.Arrays;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			zzam, MediaInfo, zzal

public class MediaQueueItem extends AbstractSafeParcelable
{
	public static class Builder
	{

		public MediaQueueItem build()
		{
			zzeb.zzi();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:invokevirtual   #38  <Method void MediaQueueItem.zzi()>
			return zzeb;
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field MediaQueueItem zzeb>
		//    5   11:areturn         
		}

		public Builder clearItemId()
		{
			zzeb.zza(0);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #44  <Method void MediaQueueItem.zza(int)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setActiveTrackIds(long al[])
		{
			zzeb.zza(al);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #49  <Method void MediaQueueItem.zza(long[])>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setAutoplay(boolean flag)
		{
			zzeb.zze(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #55  <Method void MediaQueueItem.zze(boolean)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setCustomData(JSONObject jsonobject)
		{
			zzeb.setCustomData(jsonobject);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #59  <Method void MediaQueueItem.setCustomData(JSONObject)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setPlaybackDuration(double d)
		{
			zzeb.zzb(d);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:dload_1         
		//    3    5:invokevirtual   #65  <Method void MediaQueueItem.zzb(double)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setPreloadTime(double d)
			throws IllegalArgumentException
		{
			zzeb.zzc(d);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:dload_1         
		//    3    5:invokevirtual   #69  <Method void MediaQueueItem.zzc(double)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setStartTime(double d)
			throws IllegalArgumentException
		{
			zzeb.zza(d);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaQueueItem zzeb>
		//    2    4:dload_1         
		//    3    5:invokevirtual   #72  <Method void MediaQueueItem.zza(double)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final MediaQueueItem zzeb;

		public Builder(MediaInfo mediainfo)
			throws IllegalArgumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzeb = new MediaQueueItem(mediainfo, ((zzal) (null)));
		//    2    4:aload_0         
		//    3    5:new             #6   <Class MediaQueueItem>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aconst_null     
		//    7   11:invokespecial   #20  <Method void MediaQueueItem(MediaInfo, zzal)>
		//    8   14:putfield        #22  <Field MediaQueueItem zzeb>
		//    9   17:return          
		}

		public Builder(MediaQueueItem mediaqueueitem)
			throws IllegalArgumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzeb = new MediaQueueItem(mediaqueueitem, ((zzal) (null)));
		//    2    4:aload_0         
		//    3    5:new             #6   <Class MediaQueueItem>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aconst_null     
		//    7   11:invokespecial   #28  <Method void MediaQueueItem(MediaQueueItem, zzal)>
		//    8   14:putfield        #22  <Field MediaQueueItem zzeb>
		//    9   17:return          
		}

		public Builder(JSONObject jsonobject)
			throws JSONException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzeb = new MediaQueueItem(jsonobject);
		//    2    4:aload_0         
		//    3    5:new             #6   <Class MediaQueueItem>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #33  <Method void MediaQueueItem(JSONObject)>
		//    7   13:putfield        #22  <Field MediaQueueItem zzeb>
		//    8   16:return          
		}
	}


	private MediaQueueItem(MediaInfo mediainfo)
		throws IllegalArgumentException
	{
		this(mediainfo, 0, true, 0.0D, (1.0D / 0.0D), 0.0D, ((long []) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:dconst_0        
	//    5    5:ldc2w           #19  <Double (1.0D / 0.0D)>
	//    6    8:dconst_0        
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:invokespecial   #71  <Method void MediaQueueItem(MediaInfo, int, boolean, double, double, double, long[], String)>
		if(mediainfo == null)
	//*  10   14:aload_1         
	//*  11   15:ifnonnull       28
			throw new IllegalArgumentException("media cannot be null.");
	//   12   18:new             #68  <Class IllegalArgumentException>
	//   13   21:dup             
	//   14   22:ldc1            #73  <String "media cannot be null.">
	//   15   24:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   16   27:athrow          
		else
			return;
	//   17   28:return          
	}

	MediaQueueItem(MediaInfo mediainfo, int i, boolean flag, double d, double d1, 
			double d2, long al[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void AbstractSafeParcelable()>
		zzdw = mediainfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #84  <Field MediaInfo zzdw>
		zzdx = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #86  <Field int zzdx>
		zzdj = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #88  <Field boolean zzdj>
		zzdy = d;
	//   11   19:aload_0         
	//   12   20:dload           4
	//   13   22:putfield        #90  <Field double zzdy>
		zzdz = d1;
	//   14   25:aload_0         
	//   15   26:dload           6
	//   16   28:putfield        #92  <Field double zzdz>
		zzea = d2;
	//   17   31:aload_0         
	//   18   32:dload           8
	//   19   34:putfield        #94  <Field double zzea>
		zzdm = al;
	//   20   37:aload_0         
	//   21   38:aload           10
	//   22   40:putfield        #96  <Field long[] zzdm>
		zzj = s;
	//   23   43:aload_0         
	//   24   44:aload           11
	//   25   46:putfield        #98  <Field String zzj>
		if(zzj != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #98  <Field String zzj>
	//*  28   53:ifnull          83
		{
			try
			{
				zzp = new JSONObject(zzj);
	//   29   56:aload_0         
	//   30   57:new             #100 <Class JSONObject>
	//   31   60:dup             
	//   32   61:aload_0         
	//   33   62:getfield        #98  <Field String zzj>
	//   34   65:invokespecial   #101 <Method void JSONObject(String)>
	//   35   68:putfield        #103 <Field JSONObject zzp>
				return;
	//   36   71:return          
			}
	//*  37   72:aload_0         
	//*  38   73:aconst_null     
	//*  39   74:putfield        #103 <Field JSONObject zzp>
	//*  40   77:aload_0         
	//*  41   78:aconst_null     
	//*  42   79:putfield        #98  <Field String zzj>
	//*  43   82:return          
	//*  44   83:aload_0         
	//*  45   84:aconst_null     
	//*  46   85:putfield        #103 <Field JSONObject zzp>
	//*  47   88:return          
			// Misplaced declaration of an exception variable
			catch(MediaInfo mediainfo)
			{
				zzp = null;
			}
			zzj = null;
			return;
		} else
		{
			zzp = null;
			return;
		}
	//*  48   89:astore_1        
	//*  49   90:goto            72
	}

	MediaQueueItem(MediaInfo mediainfo, zzal zzal)
		throws IllegalArgumentException
	{
		this(mediainfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method void MediaQueueItem(MediaInfo)>
	//    3    5:return          
	}

	private MediaQueueItem(MediaQueueItem mediaqueueitem)
		throws IllegalArgumentException
	{
		this(mediaqueueitem.getMedia(), mediaqueueitem.getItemId(), mediaqueueitem.getAutoplay(), mediaqueueitem.getStartTime(), mediaqueueitem.getPlaybackDuration(), mediaqueueitem.getPreloadTime(), mediaqueueitem.getActiveTrackIds(), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #112 <Method MediaInfo getMedia()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #115 <Method int getItemId()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #118 <Method boolean getAutoplay()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #121 <Method double getStartTime()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #123 <Method double getPlaybackDuration()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #125 <Method double getPreloadTime()>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #128 <Method long[] getActiveTrackIds()>
	//   15   29:aconst_null     
	//   16   30:invokespecial   #71  <Method void MediaQueueItem(MediaInfo, int, boolean, double, double, double, long[], String)>
		if(zzdw == null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #84  <Field MediaInfo zzdw>
	//*  19   37:ifnonnull       50
		{
			throw new IllegalArgumentException("media cannot be null.");
	//   20   40:new             #68  <Class IllegalArgumentException>
	//   21   43:dup             
	//   22   44:ldc1            #73  <String "media cannot be null.">
	//   23   46:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   24   49:athrow          
		} else
		{
			zzp = mediaqueueitem.getCustomData();
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #132 <Method JSONObject getCustomData()>
	//   28   55:putfield        #103 <Field JSONObject zzp>
			return;
	//   29   58:return          
		}
	}

	MediaQueueItem(MediaQueueItem mediaqueueitem, zzal zzal)
		throws IllegalArgumentException
	{
		this(mediaqueueitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method void MediaQueueItem(MediaQueueItem)>
	//    3    5:return          
	}

	MediaQueueItem(JSONObject jsonobject)
		throws JSONException
	{
		this(((MediaInfo) (null)), 0, true, 0.0D, (1.0D / 0.0D), 0.0D, ((long []) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:dconst_0        
	//    5    5:ldc2w           #19  <Double (1.0D / 0.0D)>
	//    6    8:dconst_0        
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:invokespecial   #71  <Method void MediaQueueItem(MediaInfo, int, boolean, double, double, double, long[], String)>
		zzf(jsonobject);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokevirtual   #140 <Method boolean zzf(JSONObject)>
	//   13   19:pop             
	//   14   20:return          
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
		if(!(obj instanceof MediaQueueItem))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaQueueItem>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaQueueItem)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaQueueItem>
	//   12   20:astore_1        
		boolean flag;
		if(zzp == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #103 <Field JSONObject zzp>
	//*  15   25:ifnonnull       33
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
		else
	//*  18   30:goto            35
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		boolean flag1;
		if(((MediaQueueItem) (obj)).zzp == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #103 <Field JSONObject zzp>
	//*  23   39:ifnonnull       47
			flag1 = true;
	//   24   42:iconst_1        
	//   25   43:istore_3        
		else
	//*  26   44:goto            49
			flag1 = false;
	//   27   47:iconst_0        
	//   28   48:istore_3        
		if(flag != flag1)
	//*  29   49:iload_2         
	//*  30   50:iload_3         
	//*  31   51:icmpeq          56
			return false;
	//   32   54:iconst_0        
	//   33   55:ireturn         
		if(zzp != null && ((MediaQueueItem) (obj)).zzp != null && !JsonUtils.areJsonValuesEquivalent(((Object) (zzp)), ((Object) (((MediaQueueItem) (obj)).zzp))))
	//*  34   56:aload_0         
	//*  35   57:getfield        #103 <Field JSONObject zzp>
	//*  36   60:ifnull          86
	//*  37   63:aload_1         
	//*  38   64:getfield        #103 <Field JSONObject zzp>
	//*  39   67:ifnull          86
	//*  40   70:aload_0         
	//*  41   71:getfield        #103 <Field JSONObject zzp>
	//*  42   74:aload_1         
	//*  43   75:getfield        #103 <Field JSONObject zzp>
	//*  44   78:invokestatic    #148 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//*  45   81:ifne            86
			return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		return zzcu.zza(((Object) (zzdw)), ((Object) (((MediaQueueItem) (obj)).zzdw))) && zzdx == ((MediaQueueItem) (obj)).zzdx && zzdj == ((MediaQueueItem) (obj)).zzdj && zzdy == ((MediaQueueItem) (obj)).zzdy && zzdz == ((MediaQueueItem) (obj)).zzdz && zzea == ((MediaQueueItem) (obj)).zzea && Arrays.equals(zzdm, ((MediaQueueItem) (obj)).zzdm);
	//   48   86:aload_0         
	//   49   87:getfield        #84  <Field MediaInfo zzdw>
	//   50   90:aload_1         
	//   51   91:getfield        #84  <Field MediaInfo zzdw>
	//   52   94:invokestatic    #153 <Method boolean zzcu.zza(Object, Object)>
	//   53   97:ifeq            174
	//   54  100:aload_0         
	//   55  101:getfield        #86  <Field int zzdx>
	//   56  104:aload_1         
	//   57  105:getfield        #86  <Field int zzdx>
	//   58  108:icmpne          174
	//   59  111:aload_0         
	//   60  112:getfield        #88  <Field boolean zzdj>
	//   61  115:aload_1         
	//   62  116:getfield        #88  <Field boolean zzdj>
	//   63  119:icmpne          174
	//   64  122:aload_0         
	//   65  123:getfield        #90  <Field double zzdy>
	//   66  126:aload_1         
	//   67  127:getfield        #90  <Field double zzdy>
	//   68  130:dcmpl           
	//   69  131:ifne            174
	//   70  134:aload_0         
	//   71  135:getfield        #92  <Field double zzdz>
	//   72  138:aload_1         
	//   73  139:getfield        #92  <Field double zzdz>
	//   74  142:dcmpl           
	//   75  143:ifne            174
	//   76  146:aload_0         
	//   77  147:getfield        #94  <Field double zzea>
	//   78  150:aload_1         
	//   79  151:getfield        #94  <Field double zzea>
	//   80  154:dcmpl           
	//   81  155:ifne            174
	//   82  158:aload_0         
	//   83  159:getfield        #96  <Field long[] zzdm>
	//   84  162:aload_1         
	//   85  163:getfield        #96  <Field long[] zzdm>
	//   86  166:invokestatic    #158 <Method boolean Arrays.equals(long[], long[])>
	//   87  169:ifeq            174
	//   88  172:iconst_1        
	//   89  173:ireturn         
	//   90  174:iconst_0        
	//   91  175:ireturn         
	}

	public long[] getActiveTrackIds()
	{
		return zzdm;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field long[] zzdm>
	//    2    4:areturn         
	}

	public boolean getAutoplay()
	{
		return zzdj;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean zzdj>
	//    2    4:ireturn         
	}

	public JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public int getItemId()
	{
		return zzdx;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int zzdx>
	//    2    4:ireturn         
	}

	public MediaInfo getMedia()
	{
		return zzdw;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field MediaInfo zzdw>
	//    2    4:areturn         
	}

	public double getPlaybackDuration()
	{
		return zzdz;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field double zzdz>
	//    2    4:dreturn         
	}

	public double getPreloadTime()
	{
		return zzea;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field double zzea>
	//    2    4:dreturn         
	}

	public double getStartTime()
	{
		return zzdy;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field double zzdy>
	//    2    4:dreturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzdw, Integer.valueOf(zzdx), Boolean.valueOf(zzdj), Double.valueOf(zzdy), Double.valueOf(zzdz), Double.valueOf(zzea), Integer.valueOf(Arrays.hashCode(zzdm)), String.valueOf(((Object) (zzp)))
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #84  <Field MediaInfo zzdw>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #86  <Field int zzdx>
	//   11   18:invokestatic    #167 <Method Integer Integer.valueOf(int)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #88  <Field boolean zzdj>
	//   17   28:invokestatic    #172 <Method Boolean Boolean.valueOf(boolean)>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #90  <Field double zzdy>
	//   23   38:invokestatic    #177 <Method Double Double.valueOf(double)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #92  <Field double zzdz>
	//   29   48:invokestatic    #177 <Method Double Double.valueOf(double)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #94  <Field double zzea>
	//   35   58:invokestatic    #177 <Method Double Double.valueOf(double)>
	//   36   61:aastore         
	//   37   62:dup             
	//   38   63:bipush          6
	//   39   65:aload_0         
	//   40   66:getfield        #96  <Field long[] zzdm>
	//   41   69:invokestatic    #180 <Method int Arrays.hashCode(long[])>
	//   42   72:invokestatic    #167 <Method Integer Integer.valueOf(int)>
	//   43   75:aastore         
	//   44   76:dup             
	//   45   77:bipush          7
	//   46   79:aload_0         
	//   47   80:getfield        #103 <Field JSONObject zzp>
	//   48   83:invokestatic    #185 <Method String String.valueOf(Object)>
	//   49   86:aastore         
	//   50   87:invokestatic    #190 <Method int Objects.hashCode(Object[])>
	//   51   90:ireturn         
	}

	final void setCustomData(JSONObject jsonobject)
	{
		zzp = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field JSONObject zzp>
	//    3    5:return          
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #100 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void JSONObject()>
	//    3    7:astore_3        
		int j;
		JSONArray jsonarray;
		long al[];
		jsonobject.put("media", ((Object) (zzdw.toJson())));
	//    4    8:aload_3         
	//    5    9:ldc1            #195 <String "media">
	//    6   11:aload_0         
	//    7   12:getfield        #84  <Field MediaInfo zzdw>
	//    8   15:invokevirtual   #199 <Method JSONObject MediaInfo.toJson()>
	//    9   18:invokevirtual   #203 <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
		if(zzdx != 0)
	//*  11   22:aload_0         
	//*  12   23:getfield        #86  <Field int zzdx>
	//*  13   26:ifeq            40
			jsonobject.put("itemId", zzdx);
	//   14   29:aload_3         
	//   15   30:ldc1            #205 <String "itemId">
	//   16   32:aload_0         
	//   17   33:getfield        #86  <Field int zzdx>
	//   18   36:invokevirtual   #208 <Method JSONObject JSONObject.put(String, int)>
	//   19   39:pop             
		jsonobject.put("autoplay", zzdj);
	//   20   40:aload_3         
	//   21   41:ldc1            #210 <String "autoplay">
	//   22   43:aload_0         
	//   23   44:getfield        #88  <Field boolean zzdj>
	//   24   47:invokevirtual   #213 <Method JSONObject JSONObject.put(String, boolean)>
	//   25   50:pop             
		jsonobject.put("startTime", zzdy);
	//   26   51:aload_3         
	//   27   52:ldc1            #215 <String "startTime">
	//   28   54:aload_0         
	//   29   55:getfield        #90  <Field double zzdy>
	//   30   58:invokevirtual   #218 <Method JSONObject JSONObject.put(String, double)>
	//   31   61:pop             
		if(zzdz != (1.0D / 0.0D))
	//*  32   62:aload_0         
	//*  33   63:getfield        #92  <Field double zzdz>
	//*  34   66:ldc2w           #19  <Double (1.0D / 0.0D)>
	//*  35   69:dcmpl           
	//*  36   70:ifeq            84
			jsonobject.put("playbackDuration", zzdz);
	//   37   73:aload_3         
	//   38   74:ldc1            #220 <String "playbackDuration">
	//   39   76:aload_0         
	//   40   77:getfield        #92  <Field double zzdz>
	//   41   80:invokevirtual   #218 <Method JSONObject JSONObject.put(String, double)>
	//   42   83:pop             
		jsonobject.put("preloadTime", zzea);
	//   43   84:aload_3         
	//   44   85:ldc1            #222 <String "preloadTime">
	//   45   87:aload_0         
	//   46   88:getfield        #94  <Field double zzea>
	//   47   91:invokevirtual   #218 <Method JSONObject JSONObject.put(String, double)>
	//   48   94:pop             
		if(zzdm == null)
			break MISSING_BLOCK_LABEL_154;
	//   49   95:aload_0         
	//   50   96:getfield        #96  <Field long[] zzdm>
	//   51   99:ifnull          154
		jsonarray = new JSONArray();
	//   52  102:new             #224 <Class JSONArray>
	//   53  105:dup             
	//   54  106:invokespecial   #225 <Method void JSONArray()>
	//   55  109:astore          4
		al = zzdm;
	//   56  111:aload_0         
	//   57  112:getfield        #96  <Field long[] zzdm>
	//   58  115:astore          5
		j = al.length;
	//   59  117:aload           5
	//   60  119:arraylength     
	//   61  120:istore_2        
		int i = 0;
	//   62  121:iconst_0        
	//   63  122:istore_1        
		while(i < j) 
	//*  64  123:iload_1         
	//*  65  124:iload_2         
	//*  66  125:icmpge          145
		{
			try
			{
				jsonarray.put(al[i]);
	//   67  128:aload           4
	//   68  130:aload           5
	//   69  132:iload_1         
	//   70  133:laload          
	//   71  134:invokevirtual   #228 <Method JSONArray JSONArray.put(long)>
	//   72  137:pop             
			}
	//*  73  138:iload_1         
	//*  74  139:iconst_1        
	//*  75  140:iadd            
	//*  76  141:istore_1        
	//*  77  142:goto            123
	//*  78  145:aload_3         
	//*  79  146:ldc1            #230 <String "activeTrackIds">
	//*  80  148:aload           4
	//*  81  150:invokevirtual   #203 <Method JSONObject JSONObject.put(String, Object)>
	//*  82  153:pop             
	//*  83  154:aload_0         
	//*  84  155:getfield        #103 <Field JSONObject zzp>
	//*  85  158:ifnull          172
	//*  86  161:aload_3         
	//*  87  162:ldc1            #232 <String "customData">
	//*  88  164:aload_0         
	//*  89  165:getfield        #103 <Field JSONObject zzp>
	//*  90  168:invokevirtual   #203 <Method JSONObject JSONObject.put(String, Object)>
	//*  91  171:pop             
	//*  92  172:aload_3         
	//*  93  173:areturn         
			catch(JSONException jsonexception)
	//*  94  174:astore          4
			{
				return jsonobject;
	//   95  176:aload_3         
	//   96  177:areturn         
			}
			i++;
		}
		jsonobject.put("activeTrackIds", ((Object) (jsonarray)));
		if(zzp != null)
			jsonobject.put("customData", ((Object) (zzp)));
		return jsonobject;
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		String s;
		if(zzp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field JSONObject zzp>
	//*   2    4:ifnonnull       13
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore          4
		else
	//*   5   10:goto            22
			s = zzp.toString();
	//    6   13:aload_0         
	//    7   14:getfield        #103 <Field JSONObject zzp>
	//    8   17:invokevirtual   #238 <Method String JSONObject.toString()>
	//    9   20:astore          4
		zzj = s;
	//   10   22:aload_0         
	//   11   23:aload           4
	//   12   25:putfield        #98  <Field String zzj>
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//   13   28:aload_1         
	//   14   29:invokestatic    #244 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   15   32:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getMedia())), i, false);
	//   16   33:aload_1         
	//   17   34:iconst_2        
	//   18   35:aload_0         
	//   19   36:invokevirtual   #112 <Method MediaInfo getMedia()>
	//   20   39:iload_2         
	//   21   40:iconst_0        
	//   22   41:invokestatic    #248 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getItemId());
	//   23   44:aload_1         
	//   24   45:iconst_3        
	//   25   46:aload_0         
	//   26   47:invokevirtual   #115 <Method int getItemId()>
	//   27   50:invokestatic    #252 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 4, getAutoplay());
	//   28   53:aload_1         
	//   29   54:iconst_4        
	//   30   55:aload_0         
	//   31   56:invokevirtual   #118 <Method boolean getAutoplay()>
	//   32   59:invokestatic    #256 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeDouble(parcel, 5, getStartTime());
	//   33   62:aload_1         
	//   34   63:iconst_5        
	//   35   64:aload_0         
	//   36   65:invokevirtual   #121 <Method double getStartTime()>
	//   37   68:invokestatic    #260 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeDouble(parcel, 6, getPlaybackDuration());
	//   38   71:aload_1         
	//   39   72:bipush          6
	//   40   74:aload_0         
	//   41   75:invokevirtual   #123 <Method double getPlaybackDuration()>
	//   42   78:invokestatic    #260 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeDouble(parcel, 7, getPreloadTime());
	//   43   81:aload_1         
	//   44   82:bipush          7
	//   45   84:aload_0         
	//   46   85:invokevirtual   #125 <Method double getPreloadTime()>
	//   47   88:invokestatic    #260 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeLongArray(parcel, 8, getActiveTrackIds(), false);
	//   48   91:aload_1         
	//   49   92:bipush          8
	//   50   94:aload_0         
	//   51   95:invokevirtual   #128 <Method long[] getActiveTrackIds()>
	//   52   98:iconst_0        
	//   53   99:invokestatic    #264 <Method void SafeParcelWriter.writeLongArray(Parcel, int, long[], boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzj, false);
	//   54  102:aload_1         
	//   55  103:bipush          9
	//   56  105:aload_0         
	//   57  106:getfield        #98  <Field String zzj>
	//   58  109:iconst_0        
	//   59  110:invokestatic    #268 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   60  113:aload_1         
	//   61  114:iload_3         
	//   62  115:invokestatic    #271 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   63  118:return          
	}

	final void zza(double d)
		throws IllegalArgumentException
	{
		if(!Double.isNaN(d) && d >= 0.0D)
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #276 <Method boolean Double.isNaN(double)>
	//*   2    4:ifne            22
	//*   3    7:dload_1         
	//*   4    8:dconst_0        
	//*   5    9:dcmpg           
	//*   6   10:ifge            16
	//*   7   13:goto            22
		{
			zzdy = d;
	//    8   16:aload_0         
	//    9   17:dload_1         
	//   10   18:putfield        #90  <Field double zzdy>
			return;
	//   11   21:return          
		} else
		{
			throw new IllegalArgumentException("startTime cannot be negative or NaN.");
	//   12   22:new             #68  <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc2            #278 <String "startTime cannot be negative or NaN.">
	//   15   29:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   16   32:athrow          
		}
	}

	final void zza(int i)
	{
		zzdx = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #86  <Field int zzdx>
	//    3    5:return          
	}

	final void zza(long al[])
	{
		zzdm = al;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field long[] zzdm>
	//    3    5:return          
	}

	final void zzb(double d)
		throws IllegalArgumentException
	{
		if(Double.isNaN(d))
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #276 <Method boolean Double.isNaN(double)>
	//*   2    4:ifeq            18
		{
			throw new IllegalArgumentException("playbackDuration cannot be NaN.");
	//    3    7:new             #68  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #283 <String "playbackDuration cannot be NaN.">
	//    6   14:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		} else
		{
			zzdz = d;
	//    8   18:aload_0         
	//    9   19:dload_1         
	//   10   20:putfield        #92  <Field double zzdz>
			return;
	//   11   23:return          
		}
	}

	final void zzc(double d)
		throws IllegalArgumentException
	{
		if(!Double.isNaN(d) && d >= 0.0D)
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #276 <Method boolean Double.isNaN(double)>
	//*   2    4:ifne            22
	//*   3    7:dload_1         
	//*   4    8:dconst_0        
	//*   5    9:dcmpg           
	//*   6   10:ifge            16
	//*   7   13:goto            22
		{
			zzea = d;
	//    8   16:aload_0         
	//    9   17:dload_1         
	//   10   18:putfield        #94  <Field double zzea>
			return;
	//   11   21:return          
		} else
		{
			throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
	//   12   22:new             #68  <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc2            #286 <String "preloadTime cannot be negative or NaN.">
	//   15   29:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   16   32:athrow          
		}
	}

	final void zze(boolean flag)
	{
		zzdj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean zzdj>
	//    3    5:return          
	}

	public final boolean zzf(JSONObject jsonobject)
		throws JSONException
	{
		boolean flag1;
		int l;
		boolean flag2;
		long al1[];
		flag2 = jsonobject.has("media");
	//    0    0:aload_1         
	//    1    1:ldc1            #195 <String "media">
	//    2    3:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//    3    6:istore          8
		flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore          6
		boolean flag3;
		if(flag2)
	//*   6   11:iload           8
	//*   7   13:ifeq            39
		{
			zzdw = new MediaInfo(jsonobject.getJSONObject("media"));
	//    8   16:aload_0         
	//    9   17:new             #197 <Class MediaInfo>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:ldc1            #195 <String "media">
	//   13   24:invokevirtual   #296 <Method JSONObject JSONObject.getJSONObject(String)>
	//   14   27:invokespecial   #298 <Method void MediaInfo(JSONObject)>
	//   15   30:putfield        #84  <Field MediaInfo zzdw>
			flag3 = true;
	//   16   33:iconst_1        
	//   17   34:istore          9
		} else
	//*  18   36:goto            42
		{
			flag3 = false;
	//   19   39:iconst_0        
	//   20   40:istore          9
		}
		flag2 = flag3;
	//   21   42:iload           9
	//   22   44:istore          8
		if(jsonobject.has("itemId"))
	//*  23   46:aload_1         
	//*  24   47:ldc1            #205 <String "itemId">
	//*  25   49:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//*  26   52:ifeq            85
		{
			int i = jsonobject.getInt("itemId");
	//   27   55:aload_1         
	//   28   56:ldc1            #205 <String "itemId">
	//   29   58:invokevirtual   #302 <Method int JSONObject.getInt(String)>
	//   30   61:istore          4
			flag2 = flag3;
	//   31   63:iload           9
	//   32   65:istore          8
			if(zzdx != i)
	//*  33   67:aload_0         
	//*  34   68:getfield        #86  <Field int zzdx>
	//*  35   71:iload           4
	//*  36   73:icmpeq          85
			{
				zzdx = i;
	//   37   76:aload_0         
	//   38   77:iload           4
	//   39   79:putfield        #86  <Field int zzdx>
				flag2 = true;
	//   40   82:iconst_1        
	//   41   83:istore          8
			}
		}
		flag3 = flag2;
	//   42   85:iload           8
	//   43   87:istore          9
		if(jsonobject.has("autoplay"))
	//*  44   89:aload_1         
	//*  45   90:ldc1            #210 <String "autoplay">
	//*  46   92:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//*  47   95:ifeq            128
		{
			boolean flag4 = jsonobject.getBoolean("autoplay");
	//   48   98:aload_1         
	//   49   99:ldc1            #210 <String "autoplay">
	//   50  101:invokevirtual   #305 <Method boolean JSONObject.getBoolean(String)>
	//   51  104:istore          10
			flag3 = flag2;
	//   52  106:iload           8
	//   53  108:istore          9
			if(zzdj != flag4)
	//*  54  110:aload_0         
	//*  55  111:getfield        #88  <Field boolean zzdj>
	//*  56  114:iload           10
	//*  57  116:icmpeq          128
			{
				zzdj = flag4;
	//   58  119:aload_0         
	//   59  120:iload           10
	//   60  122:putfield        #88  <Field boolean zzdj>
				flag3 = true;
	//   61  125:iconst_1        
	//   62  126:istore          9
			}
		}
		flag2 = flag3;
	//   63  128:iload           9
	//   64  130:istore          8
		if(jsonobject.has("startTime"))
	//*  65  132:aload_1         
	//*  66  133:ldc1            #215 <String "startTime">
	//*  67  135:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//*  68  138:ifeq            176
		{
			double d = jsonobject.getDouble("startTime");
	//   69  141:aload_1         
	//   70  142:ldc1            #215 <String "startTime">
	//   71  144:invokevirtual   #309 <Method double JSONObject.getDouble(String)>
	//   72  147:dstore_2        
			flag2 = flag3;
	//   73  148:iload           9
	//   74  150:istore          8
			if(Math.abs(d - zzdy) > 9.9999999999999995E-08D)
	//*  75  152:dload_2         
	//*  76  153:aload_0         
	//*  77  154:getfield        #90  <Field double zzdy>
	//*  78  157:dsub            
	//*  79  158:invokestatic    #315 <Method double Math.abs(double)>
	//*  80  161:ldc2w           #316 <Double 9.9999999999999995E-08D>
	//*  81  164:dcmpl           
	//*  82  165:ifle            176
			{
				zzdy = d;
	//   83  168:aload_0         
	//   84  169:dload_2         
	//   85  170:putfield        #90  <Field double zzdy>
				flag2 = true;
	//   86  173:iconst_1        
	//   87  174:istore          8
			}
		}
		flag3 = flag2;
	//   88  176:iload           8
	//   89  178:istore          9
		if(jsonobject.has("playbackDuration"))
	//*  90  180:aload_1         
	//*  91  181:ldc1            #220 <String "playbackDuration">
	//*  92  183:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//*  93  186:ifeq            224
		{
			double d1 = jsonobject.getDouble("playbackDuration");
	//   94  189:aload_1         
	//   95  190:ldc1            #220 <String "playbackDuration">
	//   96  192:invokevirtual   #309 <Method double JSONObject.getDouble(String)>
	//   97  195:dstore_2        
			flag3 = flag2;
	//   98  196:iload           8
	//   99  198:istore          9
			if(Math.abs(d1 - zzdz) > 9.9999999999999995E-08D)
	//* 100  200:dload_2         
	//* 101  201:aload_0         
	//* 102  202:getfield        #92  <Field double zzdz>
	//* 103  205:dsub            
	//* 104  206:invokestatic    #315 <Method double Math.abs(double)>
	//* 105  209:ldc2w           #316 <Double 9.9999999999999995E-08D>
	//* 106  212:dcmpl           
	//* 107  213:ifle            224
			{
				zzdz = d1;
	//  108  216:aload_0         
	//  109  217:dload_2         
	//  110  218:putfield        #92  <Field double zzdz>
				flag3 = true;
	//  111  221:iconst_1        
	//  112  222:istore          9
			}
		}
		flag2 = flag3;
	//  113  224:iload           9
	//  114  226:istore          8
		if(jsonobject.has("preloadTime"))
	//* 115  228:aload_1         
	//* 116  229:ldc1            #222 <String "preloadTime">
	//* 117  231:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//* 118  234:ifeq            272
		{
			double d2 = jsonobject.getDouble("preloadTime");
	//  119  237:aload_1         
	//  120  238:ldc1            #222 <String "preloadTime">
	//  121  240:invokevirtual   #309 <Method double JSONObject.getDouble(String)>
	//  122  243:dstore_2        
			flag2 = flag3;
	//  123  244:iload           9
	//  124  246:istore          8
			if(Math.abs(d2 - zzea) > 9.9999999999999995E-08D)
	//* 125  248:dload_2         
	//* 126  249:aload_0         
	//* 127  250:getfield        #94  <Field double zzea>
	//* 128  253:dsub            
	//* 129  254:invokestatic    #315 <Method double Math.abs(double)>
	//* 130  257:ldc2w           #316 <Double 9.9999999999999995E-08D>
	//* 131  260:dcmpl           
	//* 132  261:ifle            272
			{
				zzea = d2;
	//  133  264:aload_0         
	//  134  265:dload_2         
	//  135  266:putfield        #94  <Field double zzea>
				flag2 = true;
	//  136  269:iconst_1        
	//  137  270:istore          8
			}
		}
		if(jsonobject.has("activeTrackIds"))
	//* 138  272:aload_1         
	//* 139  273:ldc1            #230 <String "activeTrackIds">
	//* 140  275:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//* 141  278:ifeq            409
		{
			JSONArray jsonarray = jsonobject.getJSONArray("activeTrackIds");
	//  142  281:aload_1         
	//  143  282:ldc1            #230 <String "activeTrackIds">
	//  144  284:invokevirtual   #321 <Method JSONArray JSONObject.getJSONArray(String)>
	//  145  287:astore          11
			l = jsonarray.length();
	//  146  289:aload           11
	//  147  291:invokevirtual   #324 <Method int JSONArray.length()>
	//  148  294:istore          7
			al1 = new long[l];
	//  149  296:iload           7
	//  150  298:newarray        long[]
	//  151  300:astore          12
			for(int j = 0; j < l; j++)
	//* 152  302:iconst_0        
	//* 153  303:istore          4
	//* 154  305:iload           4
	//* 155  307:iload           7
	//* 156  309:icmpge          333
				al1[j] = jsonarray.getLong(j);
	//  157  312:aload           12
	//  158  314:iload           4
	//  159  316:aload           11
	//  160  318:iload           4
	//  161  320:invokevirtual   #328 <Method long JSONArray.getLong(int)>
	//  162  323:lastore         

	//  163  324:iload           4
	//  164  326:iconst_1        
	//  165  327:iadd            
	//  166  328:istore          4
			break MISSING_BLOCK_LABEL_333;
	//  167  330:goto            305
		}
		break MISSING_BLOCK_LABEL_409;
		boolean flag;
		long al[];
		while(true) 
		{
			do
	//* 168  333:aload_0         
	//* 169  334:getfield        #96  <Field long[] zzdm>
	//* 170  337:ifnonnull       350
			{
				flag = true;
	//  171  340:iconst_1        
	//  172  341:istore          5
				al = al1;
	//  173  343:aload           12
	//  174  345:astore          11
				break MISSING_BLOCK_LABEL_416;
	//  175  347:goto            416
			} while(zzdm == null || zzdm.length != l);
	//  176  350:aload_0         
	//  177  351:getfield        #96  <Field long[] zzdm>
	//  178  354:arraylength     
	//  179  355:iload           7
	//  180  357:icmpeq          363
	//* 181  360:goto            340
			int k = 0;
	//  182  363:iconst_0        
	//  183  364:istore          4
			do
			{
				flag = flag1;
	//  184  366:iload           6
	//  185  368:istore          5
				al = al1;
	//  186  370:aload           12
	//  187  372:astore          11
				if(k >= l)
					break MISSING_BLOCK_LABEL_416;
	//  188  374:iload           4
	//  189  376:iload           7
	//  190  378:icmpge          416
				if(zzdm[k] != al1[k])
	//* 191  381:aload_0         
	//* 192  382:getfield        #96  <Field long[] zzdm>
	//* 193  385:iload           4
	//* 194  387:laload          
	//* 195  388:aload           12
	//* 196  390:iload           4
	//* 197  392:laload          
	//* 198  393:lcmp            
	//* 199  394:ifeq            400
					break;
	//  200  397:goto            340
				k++;
	//  201  400:iload           4
	//  202  402:iconst_1        
	//  203  403:iadd            
	//  204  404:istore          4
			} while(true);
	//  205  406:goto            366
		}
		al = null;
	//  206  409:aconst_null     
	//  207  410:astore          11
		flag = flag1;
	//  208  412:iload           6
	//  209  414:istore          5
		if(flag)
	//* 210  416:iload           5
	//* 211  418:ifeq            430
		{
			zzdm = al;
	//  212  421:aload_0         
	//  213  422:aload           11
	//  214  424:putfield        #96  <Field long[] zzdm>
			flag2 = true;
	//  215  427:iconst_1        
	//  216  428:istore          8
		}
		if(jsonobject.has("customData"))
	//* 217  430:aload_1         
	//* 218  431:ldc1            #232 <String "customData">
	//* 219  433:invokevirtual   #292 <Method boolean JSONObject.has(String)>
	//* 220  436:ifeq            452
		{
			zzp = jsonobject.getJSONObject("customData");
	//  221  439:aload_0         
	//  222  440:aload_1         
	//  223  441:ldc1            #232 <String "customData">
	//  224  443:invokevirtual   #296 <Method JSONObject JSONObject.getJSONObject(String)>
	//  225  446:putfield        #103 <Field JSONObject zzp>
			flag2 = true;
	//  226  449:iconst_1        
	//  227  450:istore          8
		}
		return flag2;
	//  228  452:iload           8
	//  229  454:ireturn         
	}

	final void zzi()
		throws IllegalArgumentException
	{
		if(zzdw == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field MediaInfo zzdw>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("media cannot be null.");
	//    3    7:new             #68  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #73  <String "media cannot be null.">
	//    6   13:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(!Double.isNaN(zzdy) && zzdy >= 0.0D)
	//*   8   17:aload_0         
	//*   9   18:getfield        #90  <Field double zzdy>
	//*  10   21:invokestatic    #276 <Method boolean Double.isNaN(double)>
	//*  11   24:ifne            94
	//*  12   27:aload_0         
	//*  13   28:getfield        #90  <Field double zzdy>
	//*  14   31:dconst_0        
	//*  15   32:dcmpg           
	//*  16   33:ifge            39
	//*  17   36:goto            94
		{
			if(Double.isNaN(zzdz))
	//*  18   39:aload_0         
	//*  19   40:getfield        #92  <Field double zzdz>
	//*  20   43:invokestatic    #276 <Method boolean Double.isNaN(double)>
	//*  21   46:ifeq            60
				throw new IllegalArgumentException("playbackDuration cannot be NaN.");
	//   22   49:new             #68  <Class IllegalArgumentException>
	//   23   52:dup             
	//   24   53:ldc2            #283 <String "playbackDuration cannot be NaN.">
	//   25   56:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   26   59:athrow          
			if(!Double.isNaN(zzea) && zzea >= 0.0D)
	//*  27   60:aload_0         
	//*  28   61:getfield        #94  <Field double zzea>
	//*  29   64:invokestatic    #276 <Method boolean Double.isNaN(double)>
	//*  30   67:ifne            83
	//*  31   70:aload_0         
	//*  32   71:getfield        #94  <Field double zzea>
	//*  33   74:dconst_0        
	//*  34   75:dcmpg           
	//*  35   76:ifge            82
	//*  36   79:goto            83
				return;
	//   37   82:return          
			else
				throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
	//   38   83:new             #68  <Class IllegalArgumentException>
	//   39   86:dup             
	//   40   87:ldc2            #331 <String "preloadTime cannot be negative or Nan.">
	//   41   90:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   42   93:athrow          
		} else
		{
			throw new IllegalArgumentException("startTime cannot be negative or NaN.");
	//   43   94:new             #68  <Class IllegalArgumentException>
	//   44   97:dup             
	//   45   98:ldc2            #278 <String "startTime cannot be negative or NaN.">
	//   46  101:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   47  104:athrow          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzam();
	public static final double DEFAULT_PLAYBACK_DURATION = (1.0D / 0.0D);
	public static final int INVALID_ITEM_ID = 0;
	private boolean zzdj;
	private long zzdm[];
	private MediaInfo zzdw;
	private int zzdx;
	private double zzdy;
	private double zzdz;
	private double zzea;
	private String zzj;
	private JSONObject zzp;

	static 
	{
	//    0    0:new             #59  <Class zzam>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void zzam()>
	//    3    7:putstatic       #64  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
