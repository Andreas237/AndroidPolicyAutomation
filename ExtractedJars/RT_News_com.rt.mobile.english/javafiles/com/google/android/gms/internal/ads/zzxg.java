// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajh, zzwy, zzkb, zzwx, 
//			zzajb, zzakk, zzamy, zzaig

public final class zzxg
{

	public zzxg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	private static String zza(String s, String s1, String s2)
	{
		String s3 = s2;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s2))))
	//*   2    2:aload_2         
	//*   3    3:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifeq            12
			s3 = "";
	//    5    9:ldc1            #20  <String "">
	//    6   11:astore_3        
		return s.replaceAll(s1, s3);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload_3         
	//   10   15:invokevirtual   #26  <Method String String.replaceAll(String, String)>
	//   11   18:areturn         
	}

	public static List zza(JSONObject jsonobject, String s)
		throws JSONException
	{
		jsonobject = ((JSONObject) (jsonobject.optJSONArray(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    5:astore_0        
		if(jsonobject != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          56
		{
			s = ((String) (new ArrayList(((JSONArray) (jsonobject)).length())));
	//    6   10:new             #37  <Class ArrayList>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokevirtual   #43  <Method int JSONArray.length()>
	//   10   18:invokespecial   #46  <Method void ArrayList(int)>
	//   11   21:astore_1        
			for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #43  <Method int JSONArray.length()>
	//*  17   29:icmpge          51
				((List) (s)).add(((Object) (((JSONArray) (jsonobject)).getString(i))));
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #50  <Method String JSONArray.getString(int)>
	//   22   38:invokeinterface #56  <Method boolean List.add(Object)>
	//   23   43:pop             

	//   24   44:iload_2         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_2        
	//*  28   48:goto            24
			return Collections.unmodifiableList(((List) (s)));
	//   29   51:aload_1         
	//   30   52:invokestatic    #62  <Method List Collections.unmodifiableList(List)>
	//   31   55:areturn         
		} else
		{
			return null;
	//   32   56:aconst_null     
	//   33   57:areturn         
		}
	}

	public static void zza(Context context, String s, zzajh zzajh1, String s1, boolean flag, List list)
	{
		if(list != null)
	//*   0    0:aload           5
	//*   1    2:ifnull          181
		{
			if(list.isEmpty())
	//*   2    5:aload           5
	//*   3    7:invokeinterface #69  <Method boolean List.isEmpty()>
	//*   4   12:ifeq            16
				return;
	//    5   15:return          
			String s2;
			if(flag)
	//*   6   16:iload           4
	//*   7   18:ifeq            28
				s2 = "1";
	//    8   21:ldc1            #71  <String "1">
	//    9   23:astore          6
			else
	//*  10   25:goto            32
				s2 = "0";
	//   11   28:ldc1            #73  <String "0">
	//   12   30:astore          6
			for(Iterator iterator = list.iterator(); iterator.hasNext(); zzakk.zzd(context, s, ((String) (list))))
	//*  13   32:aload           5
	//*  14   34:invokeinterface #77  <Method Iterator List.iterator()>
	//*  15   39:astore          8
	//*  16   41:aload           8
	//*  17   43:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*  18   48:ifeq            181
			{
				String s3 = zza(zza(zza(zza(zza(zza(zza((String)iterator.next(), "@gw_adlocid@", s1), "@gw_adnetrefresh@", s2), "@gw_qdata@", zzajh1.zzcod.zzbst), "@gw_sdkver@", s), "@gw_sessid@", zzkb.zzih()), "@gw_seqnum@", zzajh1.zzccy), "@gw_adnetstatus@", zzajh1.zzcoe);
	//   19   51:aload           8
	//   20   53:invokeinterface #86  <Method Object Iterator.next()>
	//   21   58:checkcast       #22  <Class String>
	//   22   61:ldc1            #88  <String "@gw_adlocid@">
	//   23   63:aload_3         
	//   24   64:invokestatic    #90  <Method String zza(String, String, String)>
	//   25   67:ldc1            #92  <String "@gw_adnetrefresh@">
	//   26   69:aload           6
	//   27   71:invokestatic    #90  <Method String zza(String, String, String)>
	//   28   74:ldc1            #94  <String "@gw_qdata@">
	//   29   76:aload_2         
	//   30   77:getfield        #100 <Field zzwy zzajh.zzcod>
	//   31   80:getfield        #106 <Field String zzwy.zzbst>
	//   32   83:invokestatic    #90  <Method String zza(String, String, String)>
	//   33   86:ldc1            #108 <String "@gw_sdkver@">
	//   34   88:aload_1         
	//   35   89:invokestatic    #90  <Method String zza(String, String, String)>
	//   36   92:ldc1            #110 <String "@gw_sessid@">
	//   37   94:invokestatic    #116 <Method String zzkb.zzih()>
	//   38   97:invokestatic    #90  <Method String zza(String, String, String)>
	//   39  100:ldc1            #118 <String "@gw_seqnum@">
	//   40  102:aload_2         
	//   41  103:getfield        #121 <Field String zzajh.zzccy>
	//   42  106:invokestatic    #90  <Method String zza(String, String, String)>
	//   43  109:ldc1            #123 <String "@gw_adnetstatus@">
	//   44  111:aload_2         
	//   45  112:getfield        #126 <Field String zzajh.zzcoe>
	//   46  115:invokestatic    #90  <Method String zza(String, String, String)>
	//   47  118:astore          7
				list = ((List) (s3));
	//   48  120:aload           7
	//   49  122:astore          5
				if(zzajh1.zzbtw != null)
	//*  50  124:aload_2         
	//*  51  125:getfield        #130 <Field zzwx zzajh.zzbtw>
	//*  52  128:ifnull          159
					list = ((List) (zza(zza(s3, "@gw_adnetid@", zzajh1.zzbtw.zzbrs), "@gw_allocid@", zzajh1.zzbtw.zzbru)));
	//   53  131:aload           7
	//   54  133:ldc1            #132 <String "@gw_adnetid@">
	//   55  135:aload_2         
	//   56  136:getfield        #130 <Field zzwx zzajh.zzbtw>
	//   57  139:getfield        #137 <Field String zzwx.zzbrs>
	//   58  142:invokestatic    #90  <Method String zza(String, String, String)>
	//   59  145:ldc1            #139 <String "@gw_allocid@">
	//   60  147:aload_2         
	//   61  148:getfield        #130 <Field zzwx zzajh.zzbtw>
	//   62  151:getfield        #142 <Field String zzwx.zzbru>
	//   63  154:invokestatic    #90  <Method String zza(String, String, String)>
	//   64  157:astore          5
				list = ((List) (zzajb.zzb(((String) (list)), context)));
	//   65  159:aload           5
	//   66  161:aload_0         
	//   67  162:invokestatic    #148 <Method String zzajb.zzb(String, Context)>
	//   68  165:astore          5
				zzbv.zzek();
	//   69  167:invokestatic    #154 <Method zzakk zzbv.zzek()>
	//   70  170:pop             
			}

	//   71  171:aload_0         
	//   72  172:aload_1         
	//   73  173:aload           5
	//   74  175:invokestatic    #160 <Method void zzakk.zzd(Context, String, String)>
		}
	//*  75  178:goto            41
	//   76  181:return          
	}

	public static void zza(Context context, String s, List list, String s1, zzaig zzaig1)
	{
		if(list != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          144
		{
			if(list.isEmpty())
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #69  <Method boolean List.isEmpty()>
	//*   4   10:ifeq            14
				return;
	//    5   13:return          
			String s2 = s1;
	//    6   14:aload_3         
	//    7   15:astore          7
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   8   17:aload_3         
	//*   9   18:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   21:ifne            37
			{
				s2 = s1;
	//   11   24:aload_3         
	//   12   25:astore          7
				if(zzamy.isEnabled())
	//*  13   27:invokestatic    #168 <Method boolean zzamy.isEnabled()>
	//*  14   30:ifeq            37
					s2 = "fakeUserForAdDebugLog";
	//   15   33:ldc1            #170 <String "fakeUserForAdDebugLog">
	//   16   35:astore          7
			}
			long l = zzbv.zzer().currentTimeMillis();
	//   17   37:invokestatic    #174 <Method Clock zzbv.zzer()>
	//   18   40:invokeinterface #180 <Method long Clock.currentTimeMillis()>
	//   19   45:lstore          5
			for(Iterator iterator = list.iterator(); iterator.hasNext(); zzakk.zzd(context, s, ((String) (list))))
	//*  20   47:aload_2         
	//*  21   48:invokeinterface #77  <Method Iterator List.iterator()>
	//*  22   53:astore          8
	//*  23   55:aload           8
	//*  24   57:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*  25   62:ifeq            144
			{
				s1 = zza(zza((String)iterator.next(), "@gw_rwd_userid@", Uri.encode(s2)), "@gw_tmstmp@", Long.toString(l));
	//   26   65:aload           8
	//   27   67:invokeinterface #86  <Method Object Iterator.next()>
	//   28   72:checkcast       #22  <Class String>
	//   29   75:ldc1            #182 <String "@gw_rwd_userid@">
	//   30   77:aload           7
	//   31   79:invokestatic    #188 <Method String Uri.encode(String)>
	//   32   82:invokestatic    #90  <Method String zza(String, String, String)>
	//   33   85:ldc1            #190 <String "@gw_tmstmp@">
	//   34   87:lload           5
	//   35   89:invokestatic    #196 <Method String Long.toString(long)>
	//   36   92:invokestatic    #90  <Method String zza(String, String, String)>
	//   37   95:astore_3        
				list = ((List) (s1));
	//   38   96:aload_3         
	//   39   97:astore_2        
				if(zzaig1 != null)
	//*  40   98:aload           4
	//*  41  100:ifnull          131
					list = ((List) (zza(zza(s1, "@gw_rwd_itm@", Uri.encode(zzaig1.type)), "@gw_rwd_amt@", Integer.toString(zzaig1.zzcmk))));
	//   42  103:aload_3         
	//   43  104:ldc1            #198 <String "@gw_rwd_itm@">
	//   44  106:aload           4
	//   45  108:getfield        #203 <Field String zzaig.type>
	//   46  111:invokestatic    #188 <Method String Uri.encode(String)>
	//   47  114:invokestatic    #90  <Method String zza(String, String, String)>
	//   48  117:ldc1            #205 <String "@gw_rwd_amt@">
	//   49  119:aload           4
	//   50  121:getfield        #209 <Field int zzaig.zzcmk>
	//   51  124:invokestatic    #213 <Method String Integer.toString(int)>
	//   52  127:invokestatic    #90  <Method String zza(String, String, String)>
	//   53  130:astore_2        
				zzbv.zzek();
	//   54  131:invokestatic    #154 <Method zzakk zzbv.zzek()>
	//   55  134:pop             
			}

	//   56  135:aload_0         
	//   57  136:aload_1         
	//   58  137:aload_2         
	//   59  138:invokestatic    #160 <Method void zzakk.zzd(Context, String, String)>
		}
	//*  60  141:goto            55
	//   61  144:return          
	}

	public static boolean zza(String s, int ai[])
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(ai.length != 2)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          17
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		s = ((String) (s.split("x")));
	//   11   17:aload_0         
	//   12   18:ldc1            #220 <String "x">
	//   13   20:invokevirtual   #224 <Method String[] String.split(String)>
	//   14   23:astore_0        
		if(s.length != 2)
	//*  15   24:aload_0         
	//*  16   25:arraylength     
	//*  17   26:iconst_2        
	//*  18   27:icmpeq          32
			return false;
	//   19   30:iconst_0        
	//   20   31:ireturn         
		try
		{
			ai[0] = Integer.parseInt(((String) (s[0])));
	//   21   32:aload_1         
	//   22   33:iconst_0        
	//   23   34:aload_0         
	//   24   35:iconst_0        
	//   25   36:aaload          
	//   26   37:invokestatic    #228 <Method int Integer.parseInt(String)>
	//   27   40:iastore         
			ai[1] = Integer.parseInt(((String) (s[1])));
	//   28   41:aload_1         
	//   29   42:iconst_1        
	//   30   43:aload_0         
	//   31   44:iconst_1        
	//   32   45:aaload          
	//   33   46:invokestatic    #228 <Method int Integer.parseInt(String)>
	//   34   49:iastore         
		}
	//*  35   50:iconst_1        
	//*  36   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  37   52:astore_0        
		{
			return false;
	//   38   53:iconst_0        
	//   39   54:ireturn         
		}
		return true;
	}
}
