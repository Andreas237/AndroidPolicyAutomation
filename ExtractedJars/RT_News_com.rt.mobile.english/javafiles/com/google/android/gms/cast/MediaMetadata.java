// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzdp;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzak

public class MediaMetadata extends AbstractSafeParcelable
{
	private static final class zza
	{

		public final zza zza(String s, String s1, int i)
		{
			zzdt.put(((Object) (s)), ((Object) (s1)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Map zzdt>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #34  <Method Object Map.put(Object, Object)>
		//    5   11:pop             
			zzdu.put(((Object) (s1)), ((Object) (s)));
		//    6   12:aload_0         
		//    7   13:getfield        #24  <Field Map zzdu>
		//    8   16:aload_2         
		//    9   17:aload_1         
		//   10   18:invokeinterface #34  <Method Object Map.put(Object, Object)>
		//   11   23:pop             
			zzdv.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
		//   12   24:aload_0         
		//   13   25:getfield        #26  <Field Map zzdv>
		//   14   28:aload_1         
		//   15   29:iload_3         
		//   16   30:invokestatic    #40  <Method Integer Integer.valueOf(int)>
		//   17   33:invokeinterface #34  <Method Object Map.put(Object, Object)>
		//   18   38:pop             
			return this;
		//   19   39:aload_0         
		//   20   40:areturn         
		}

		public final String zze(String s)
		{
			return (String)zzdt.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Map zzdt>
		//    2    4:aload_1         
		//    3    5:invokeinterface #46  <Method Object Map.get(Object)>
		//    4   10:checkcast       #48  <Class String>
		//    5   13:areturn         
		}

		public final String zzf(String s)
		{
			return (String)zzdu.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Map zzdu>
		//    2    4:aload_1         
		//    3    5:invokeinterface #46  <Method Object Map.get(Object)>
		//    4   10:checkcast       #48  <Class String>
		//    5   13:areturn         
		}

		public final int zzg(String s)
		{
			s = ((String) ((Integer)zzdv.get(((Object) (s)))));
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map zzdv>
		//    2    4:aload_1         
		//    3    5:invokeinterface #46  <Method Object Map.get(Object)>
		//    4   10:checkcast       #36  <Class Integer>
		//    5   13:astore_1        
			if(s != null)
		//*   6   14:aload_1         
		//*   7   15:ifnull          23
				return ((Integer) (s)).intValue();
		//    8   18:aload_1         
		//    9   19:invokevirtual   #55  <Method int Integer.intValue()>
		//   10   22:ireturn         
			else
				return 0;
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		private final Map zzdt = new HashMap();
		private final Map zzdu = new HashMap();
		private final Map zzdv = new HashMap();

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void HashMap()>
		//    6   12:putfield        #22  <Field Map zzdt>
		//    7   15:aload_0         
		//    8   16:new             #19  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #20  <Method void HashMap()>
		//   11   23:putfield        #24  <Field Map zzdu>
		//   12   26:aload_0         
		//   13   27:new             #19  <Class HashMap>
		//   14   30:dup             
		//   15   31:invokespecial   #20  <Method void HashMap()>
		//   16   34:putfield        #26  <Field Map zzdv>
		//   17   37:return          
		}
	}


	public MediaMetadata()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #175 <Method void MediaMetadata(int)>
	//    3    5:return          
	}

	public MediaMetadata(int i)
	{
		this(((List) (new ArrayList())), new Bundle(), i);
	//    0    0:aload_0         
	//    1    1:new             #177 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #178 <Method void ArrayList()>
	//    4    8:new             #180 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #181 <Method void Bundle()>
	//    7   15:iload_1         
	//    8   16:invokespecial   #184 <Method void MediaMetadata(List, Bundle, int)>
	//    9   19:return          
	}

	MediaMetadata(List list, Bundle bundle, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method void AbstractSafeParcelable()>
		zzz = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #189 <Field List zzz>
		zzdr = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #191 <Field Bundle zzdr>
		zzds = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #193 <Field int zzds>
	//   11   19:return          
	}

	private static void zza(String s, int i)
		throws IllegalArgumentException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("null and empty keys are not allowed");
	//    3    7:new             #200 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #208 <String "null and empty keys are not allowed">
	//    6   13:invokespecial   #211 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		int j = zzdq.zzg(s);
	//    8   17:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//    9   20:aload_0         
	//   10   21:invokevirtual   #215 <Method int MediaMetadata$zza.zzg(String)>
	//   11   24:istore_2        
		if(j != i && j != 0)
	//*  12   25:iload_2         
	//*  13   26:iload_1         
	//*  14   27:icmpeq          110
	//*  15   30:iload_2         
	//*  16   31:ifeq            110
		{
			String s1 = zzdp[i];
	//   17   34:getstatic       #118 <Field String[] zzdp>
	//   18   37:iload_1         
	//   19   38:aaload          
	//   20   39:astore_3        
			StringBuilder stringbuilder = new StringBuilder(21 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//   21   40:new             #217 <Class StringBuilder>
	//   22   43:dup             
	//   23   44:bipush          21
	//   24   46:aload_0         
	//   25   47:invokestatic    #221 <Method String String.valueOf(Object)>
	//   26   50:invokevirtual   #225 <Method int String.length()>
	//   27   53:iadd            
	//   28   54:aload_3         
	//   29   55:invokestatic    #221 <Method String String.valueOf(Object)>
	//   30   58:invokevirtual   #225 <Method int String.length()>
	//   31   61:iadd            
	//   32   62:invokespecial   #226 <Method void StringBuilder(int)>
	//   33   65:astore          4
			stringbuilder.append("Value for ");
	//   34   67:aload           4
	//   35   69:ldc1            #228 <String "Value for ">
	//   36   71:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
			stringbuilder.append(s);
	//   38   75:aload           4
	//   39   77:aload_0         
	//   40   78:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
			stringbuilder.append(" must be a ");
	//   42   82:aload           4
	//   43   84:ldc1            #234 <String " must be a ">
	//   44   86:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
			stringbuilder.append(s1);
	//   46   90:aload           4
	//   47   92:aload_3         
	//   48   93:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   49   96:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   50   97:new             #200 <Class IllegalArgumentException>
	//   51  100:dup             
	//   52  101:aload           4
	//   53  103:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   54  106:invokespecial   #211 <Method void IllegalArgumentException(String)>
	//   55  109:athrow          
		} else
		{
			return;
	//   56  110:return          
		}
	}

	private final transient void zza(JSONObject jsonobject, String as[])
	{
		int i;
		int j;
		boolean flag;
		String s;
		Object obj;
		try
		{
			j = as.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		}
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          143
	//*   8   12:aload_2         
	//*   9   13:iload_3         
	//*  10   14:aaload          
	//*  11   15:astore          6
	//*  12   17:aload_0         
	//*  13   18:getfield        #191 <Field Bundle zzdr>
	//*  14   21:aload           6
	//*  15   23:invokevirtual   #246 <Method boolean Bundle.containsKey(String)>
	//*  16   26:ifeq            247
	//*  17   29:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//*  18   32:aload           6
	//*  19   34:invokevirtual   #215 <Method int MediaMetadata$zza.zzg(String)>
	//*  20   37:tableswitch     1 4: default 247
	//	               1 118
	//	               2 93
	//	               3 68
	//	               4 118
	//*  21   68:aload_1         
	//*  22   69:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//*  23   72:aload           6
	//*  24   74:invokevirtual   #250 <Method String MediaMetadata$zza.zze(String)>
	//*  25   77:aload_0         
	//*  26   78:getfield        #191 <Field Bundle zzdr>
	//*  27   81:aload           6
	//*  28   83:invokevirtual   #254 <Method double Bundle.getDouble(String)>
	//*  29   86:invokevirtual   #260 <Method JSONObject JSONObject.put(String, double)>
	//*  30   89:pop             
	//*  31   90:goto            247
	//*  32   93:aload_1         
	//*  33   94:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//*  34   97:aload           6
	//*  35   99:invokevirtual   #250 <Method String MediaMetadata$zza.zze(String)>
	//*  36  102:aload_0         
	//*  37  103:getfield        #191 <Field Bundle zzdr>
	//*  38  106:aload           6
	//*  39  108:invokevirtual   #263 <Method int Bundle.getInt(String)>
	//*  40  111:invokevirtual   #266 <Method JSONObject JSONObject.put(String, int)>
	//*  41  114:pop             
	//*  42  115:goto            247
	//*  43  118:aload_1         
	//*  44  119:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//*  45  122:aload           6
	//*  46  124:invokevirtual   #250 <Method String MediaMetadata$zza.zze(String)>
	//*  47  127:aload_0         
	//*  48  128:getfield        #191 <Field Bundle zzdr>
	//*  49  131:aload           6
	//*  50  133:invokevirtual   #269 <Method String Bundle.getString(String)>
	//*  51  136:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//*  52  139:pop             
	//*  53  140:goto            247
	//*  54  143:aload_0         
	//*  55  144:getfield        #191 <Field Bundle zzdr>
	//*  56  147:invokevirtual   #276 <Method Set Bundle.keySet()>
	//*  57  150:invokeinterface #282 <Method Iterator Set.iterator()>
	//*  58  155:astore_2        
	//*  59  156:aload_2         
	//*  60  157:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//*  61  162:ifeq            244
	//*  62  165:aload_2         
	//*  63  166:invokeinterface #292 <Method Object Iterator.next()>
	//*  64  171:checkcast       #108 <Class String>
	//*  65  174:astore          6
	//*  66  176:aload           6
	//*  67  178:ldc2            #294 <String "com.google.">
	//*  68  181:invokevirtual   #297 <Method boolean String.startsWith(String)>
	//*  69  184:ifne            156
	//*  70  187:aload_0         
	//*  71  188:getfield        #191 <Field Bundle zzdr>
	//*  72  191:aload           6
	//*  73  193:invokevirtual   #301 <Method Object Bundle.get(String)>
	//*  74  196:astore          7
	//*  75  198:aload           7
	//*  76  200:instanceof      #108 <Class String>
	//*  77  203:ifeq            218
	//*  78  206:aload_1         
	//*  79  207:aload           6
	//*  80  209:aload           7
	//*  81  211:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//*  82  214:pop             
	//*  83  215:goto            156
	//*  84  218:aload           7
	//*  85  220:instanceof      #303 <Class Integer>
	//*  86  223:ifeq            229
	//*  87  226:goto            206
	//*  88  229:aload           7
	//*  89  231:instanceof      #305 <Class Double>
	//*  90  234:istore          5
	//*  91  236:iload           5
	//*  92  238:ifeq            156
	//*  93  241:goto            206
	//*  94  244:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  95  245:astore_1        
		{
			return;
	//   96  246:return          
		}
		i = 0;
_L15:
		if(i >= j) goto _L2; else goto _L1
_L1:
		s = as[i];
		if(!zzdr.containsKey(s))
			break MISSING_BLOCK_LABEL_247;
		zzdq.zzg(s);
		JVM INSTR tableswitch 1 4: default 247
	//	               1 118
	//	               2 93
	//	               3 68
	//	               4 118;
		   goto _L3 _L4 _L5 _L6 _L4
_L3:
		break MISSING_BLOCK_LABEL_247;
_L6:
		jsonobject.put(zzdq.zze(s), zzdr.getDouble(s));
		break MISSING_BLOCK_LABEL_247;
_L5:
		jsonobject.put(zzdq.zze(s), zzdr.getInt(s));
		break MISSING_BLOCK_LABEL_247;
_L4:
		jsonobject.put(zzdq.zze(s), ((Object) (zzdr.getString(s))));
		break MISSING_BLOCK_LABEL_247;
_L2:
		as = ((String []) (zzdr.keySet().iterator()));
_L10:
		if(!((Iterator) (as)).hasNext()) goto _L8; else goto _L7
_L7:
		s = (String)((Iterator) (as)).next();
		if(s.startsWith("com.google.")) goto _L10; else goto _L9
_L9:
		obj = zzdr.get(s);
		if(!(obj instanceof String)) goto _L12; else goto _L11
_L11:
		jsonobject.put(s, obj);
		break; /* Loop/switch isn't completed */
_L12:
		if(!(obj instanceof Integer)) goto _L13; else goto _L11
_L13:
		flag = obj instanceof Double;
		if(!flag) goto _L10; else goto _L11
_L8:
		return;
		i++;
	//   97  247:iload_3         
	//   98  248:iconst_1        
	//   99  249:iadd            
	//  100  250:istore_3        
		if(true) goto _L15; else goto _L14
	//  101  251:goto            6
_L14:
	}

	private final boolean zza(Bundle bundle, Bundle bundle1)
	{
label0:
		{
			if(bundle.size() != bundle1.size())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #309 <Method int Bundle.size()>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #309 <Method int Bundle.size()>
	//*   4    8:icmpeq          13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			Iterator iterator = bundle.keySet().iterator();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #276 <Method Set Bundle.keySet()>
	//    9   17:invokeinterface #282 <Method Iterator Set.iterator()>
	//   10   22:astore_3        
			Object obj;
			Object obj1;
label1:
			do
			{
				String s;
				do
				{
					if(!iterator.hasNext())
						break label0;
	//   11   23:aload_3         
	//   12   24:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            127
					s = (String)iterator.next();
	//   14   32:aload_3         
	//   15   33:invokeinterface #292 <Method Object Iterator.next()>
	//   16   38:checkcast       #108 <Class String>
	//   17   41:astore          4
					obj = bundle.get(s);
	//   18   43:aload_1         
	//   19   44:aload           4
	//   20   46:invokevirtual   #301 <Method Object Bundle.get(String)>
	//   21   49:astore          5
					obj1 = bundle1.get(s);
	//   22   51:aload_2         
	//   23   52:aload           4
	//   24   54:invokevirtual   #301 <Method Object Bundle.get(String)>
	//   25   57:astore          6
					if((obj instanceof Bundle) && (obj1 instanceof Bundle) && !zza((Bundle)obj, (Bundle)obj1))
	//*  26   59:aload           5
	//*  27   61:instanceof      #180 <Class Bundle>
	//*  28   64:ifeq            94
	//*  29   67:aload           6
	//*  30   69:instanceof      #180 <Class Bundle>
	//*  31   72:ifeq            94
	//*  32   75:aload_0         
	//*  33   76:aload           5
	//*  34   78:checkcast       #180 <Class Bundle>
	//*  35   81:aload           6
	//*  36   83:checkcast       #180 <Class Bundle>
	//*  37   86:invokespecial   #311 <Method boolean zza(Bundle, Bundle)>
	//*  38   89:ifne            94
						return false;
	//   39   92:iconst_0        
	//   40   93:ireturn         
					if(obj != null)
						continue label1;
	//   41   94:aload           5
	//   42   96:ifnonnull       115
				} while(obj1 == null && bundle1.containsKey(s));
	//   43   99:aload           6
	//   44  101:ifnonnull       113
	//   45  104:aload_2         
	//   46  105:aload           4
	//   47  107:invokevirtual   #246 <Method boolean Bundle.containsKey(String)>
	//   48  110:ifne            23
				return false;
	//   49  113:iconst_0        
	//   50  114:ireturn         
			} while(obj.equals(obj1));
	//   51  115:aload           5
	//   52  117:aload           6
	//   53  119:invokevirtual   #317 <Method boolean Object.equals(Object)>
	//   54  122:ifne            23
			return false;
	//   55  125:iconst_0        
	//   56  126:ireturn         
		}
		return true;
	//   57  127:iconst_1        
	//   58  128:ireturn         
	}

	private final transient void zzb(JSONObject jsonobject, String as[])
	{
		HashSet hashset = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:new             #320 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokestatic    #326 <Method List Arrays.asList(Object[])>
	//    4    8:invokespecial   #329 <Method void HashSet(java.util.Collection)>
	//    5   11:astore          4
		Iterator iterator = jsonobject.keys();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #332 <Method Iterator JSONObject.keys()>
	//    8   17:astore          5
_L12:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    9   19:aload           5
	//   10   21:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//   11   26:ifeq            327
_L1:
		Object obj;
		as = ((String []) ((String)iterator.next()));
	//   12   29:aload           5
	//   13   31:invokeinterface #292 <Method Object Iterator.next()>
	//   14   36:checkcast       #108 <Class String>
	//   15   39:astore_2        
		if("metadataType".equals(((Object) (as))))
			continue; /* Loop/switch isn't completed */
	//   16   40:ldc2            #334 <String "metadataType">
	//   17   43:aload_2         
	//   18   44:invokevirtual   #335 <Method boolean String.equals(Object)>
	//   19   47:ifne            19
		obj = ((Object) (zzdq.zzf(((String) (as)))));
	//   20   50:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//   21   53:aload_2         
	//   22   54:invokevirtual   #338 <Method String MediaMetadata$zza.zzf(String)>
	//   23   57:astore          6
		if(obj == null) goto _L4; else goto _L3
	//   24   59:aload           6
	//   25   61:ifnull          242
_L3:
		boolean flag;
		Object obj1;
		try
		{
			flag = ((Set) (hashset)).contains(obj);
	//   26   64:aload           4
	//   27   66:aload           6
	//   28   68:invokeinterface #341 <Method boolean Set.contains(Object)>
	//   29   73:istore_3        
		}
	//*  30   74:iload_3         
	//*  31   75:ifeq            19
	//*  32   78:aload_1         
	//*  33   79:aload_2         
	//*  34   80:invokevirtual   #342 <Method Object JSONObject.get(String)>
	//*  35   83:astore          7
	//*  36   85:aload           7
	//*  37   87:ifnonnull       93
	//*  38   90:goto            19
	//*  39   93:getstatic       #171 <Field MediaMetadata$zza zzdq>
	//*  40   96:aload           6
	//*  41   98:invokevirtual   #215 <Method int MediaMetadata$zza.zzg(String)>
	//*  42  101:tableswitch     1 4: default 334
	//	               1 226
	//	               2 198
	//	               3 170
	//	               4 132
	//*  43  132:aload           7
	//*  44  134:instanceof      #108 <Class String>
	//*  45  137:ifeq            19
	//*  46  140:aload           7
	//*  47  142:checkcast       #108 <Class String>
	//*  48  145:invokestatic    #348 <Method Calendar zzdp.zzu(String)>
	//*  49  148:ifnull          19
	//*  50  151:aload_0         
	//*  51  152:getfield        #191 <Field Bundle zzdr>
	//*  52  155:astore_2        
	//*  53  156:aload_2         
	//*  54  157:aload           6
	//*  55  159:aload           7
	//*  56  161:checkcast       #108 <Class String>
	//*  57  164:invokevirtual   #352 <Method void Bundle.putString(String, String)>
	//*  58  167:goto            19
	//*  59  170:aload           7
	//*  60  172:instanceof      #305 <Class Double>
	//*  61  175:ifeq            19
	//*  62  178:aload_0         
	//*  63  179:getfield        #191 <Field Bundle zzdr>
	//*  64  182:aload           6
	//*  65  184:aload           7
	//*  66  186:checkcast       #305 <Class Double>
	//*  67  189:invokevirtual   #356 <Method double Double.doubleValue()>
	//*  68  192:invokevirtual   #360 <Method void Bundle.putDouble(String, double)>
	//*  69  195:goto            19
	//*  70  198:aload           7
	//*  71  200:instanceof      #303 <Class Integer>
	//*  72  203:ifeq            19
	//*  73  206:aload_0         
	//*  74  207:getfield        #191 <Field Bundle zzdr>
	//*  75  210:aload           6
	//*  76  212:aload           7
	//*  77  214:checkcast       #303 <Class Integer>
	//*  78  217:invokevirtual   #363 <Method int Integer.intValue()>
	//*  79  220:invokevirtual   #366 <Method void Bundle.putInt(String, int)>
	//*  80  223:goto            19
	//*  81  226:aload           7
	//*  82  228:instanceof      #108 <Class String>
	//*  83  231:ifeq            19
	//*  84  234:aload_0         
	//*  85  235:getfield        #191 <Field Bundle zzdr>
	//*  86  238:astore_2        
	//*  87  239:goto            156
	//*  88  242:aload_1         
	//*  89  243:aload_2         
	//*  90  244:invokevirtual   #342 <Method Object JSONObject.get(String)>
	//*  91  247:astore          6
	//*  92  249:aload           6
	//*  93  251:instanceof      #108 <Class String>
	//*  94  254:ifeq            273
	//*  95  257:aload_0         
	//*  96  258:getfield        #191 <Field Bundle zzdr>
	//*  97  261:aload_2         
	//*  98  262:aload           6
	//*  99  264:checkcast       #108 <Class String>
	//* 100  267:invokevirtual   #352 <Method void Bundle.putString(String, String)>
	//* 101  270:goto            19
	//* 102  273:aload           6
	//* 103  275:instanceof      #303 <Class Integer>
	//* 104  278:ifeq            300
	//* 105  281:aload_0         
	//* 106  282:getfield        #191 <Field Bundle zzdr>
	//* 107  285:aload_2         
	//* 108  286:aload           6
	//* 109  288:checkcast       #303 <Class Integer>
	//* 110  291:invokevirtual   #363 <Method int Integer.intValue()>
	//* 111  294:invokevirtual   #366 <Method void Bundle.putInt(String, int)>
	//* 112  297:goto            19
	//* 113  300:aload           6
	//* 114  302:instanceof      #305 <Class Double>
	//* 115  305:ifeq            19
	//* 116  308:aload_0         
	//* 117  309:getfield        #191 <Field Bundle zzdr>
	//* 118  312:aload_2         
	//* 119  313:aload           6
	//* 120  315:checkcast       #305 <Class Double>
	//* 121  318:invokevirtual   #356 <Method double Double.doubleValue()>
	//* 122  321:invokevirtual   #360 <Method void Bundle.putDouble(String, double)>
	//* 123  324:goto            19
	//* 124  327:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 125  328:astore_1        
		{
			return;
	//  126  329:return          
		}
		if(!flag)
			continue; /* Loop/switch isn't completed */
		obj1 = jsonobject.get(((String) (as)));
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
		zzdq.zzg(((String) (obj)));
		JVM INSTR tableswitch 1 4: default 334
	//	               1 226
	//	               2 198
	//	               3 170
	//	               4 132;
		   goto _L5 _L6 _L7 _L8 _L9
_L5:
		continue; /* Loop/switch isn't completed */
_L9:
		if(!(obj1 instanceof String) || com.google.android.gms.internal.cast.zzdp.zzu((String)obj1) == null)
			continue; /* Loop/switch isn't completed */
		as = ((String []) (zzdr));
_L10:
		((Bundle) (as)).putString(((String) (obj)), (String)obj1);
		continue; /* Loop/switch isn't completed */
_L8:
		try
		{
			if(obj1 instanceof Double)
				zzdr.putDouble(((String) (obj)), ((Double)obj1).doubleValue());
		}
		// Misplaced declaration of an exception variable
		catch(String as[]) { }
	//  127  330:astore_2        
		continue; /* Loop/switch isn't completed */
	//  128  331:goto            19
_L7:
		if(obj1 instanceof Integer)
			zzdr.putInt(((String) (obj)), ((Integer)obj1).intValue());
		continue; /* Loop/switch isn't completed */
_L6:
		if(!(obj1 instanceof String))
			continue; /* Loop/switch isn't completed */
		as = ((String []) (zzdr));
		if(true) goto _L10; else goto _L4
_L4:
		obj = jsonobject.get(((String) (as)));
		if(obj instanceof String)
		{
			zzdr.putString(((String) (as)), (String)obj);
			continue; /* Loop/switch isn't completed */
		}
		if(obj instanceof Integer)
		{
			zzdr.putInt(((String) (as)), ((Integer)obj).intValue());
			continue; /* Loop/switch isn't completed */
		}
		if(obj instanceof Double)
			zzdr.putDouble(((String) (as)), ((Double)obj).doubleValue());
		continue; /* Loop/switch isn't completed */
_L2:
		return;
		if(true) goto _L12; else goto _L11
_L11:
	//* 129  334:goto            19
	}

	public void addImage(WebImage webimage)
	{
		zzz.add(((Object) (webimage)));
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field List zzz>
	//    2    4:aload_1         
	//    3    5:invokeinterface #373 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void clear()
	{
		zzdr.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Bundle zzdr>
	//    2    4:invokevirtual   #376 <Method void Bundle.clear()>
		zzz.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #189 <Field List zzz>
	//    5   11:invokeinterface #377 <Method void List.clear()>
	//    6   16:return          
	}

	public void clearImages()
	{
		zzz.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field List zzz>
	//    2    4:invokeinterface #377 <Method void List.clear()>
	//    3    9:return          
	}

	public boolean containsKey(String s)
	{
		return zzdr.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Bundle zzdr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #246 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
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
		if(!(obj instanceof MediaMetadata))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaMetadata>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaMetadata)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaMetadata>
	//   12   20:astore_1        
		return zza(zzdr, ((MediaMetadata) (obj)).zzdr) && zzz.equals(((Object) (((MediaMetadata) (obj)).zzz)));
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #191 <Field Bundle zzdr>
	//   16   26:aload_1         
	//   17   27:getfield        #191 <Field Bundle zzdr>
	//   18   30:invokespecial   #311 <Method boolean zza(Bundle, Bundle)>
	//   19   33:ifeq            54
	//   20   36:aload_0         
	//   21   37:getfield        #189 <Field List zzz>
	//   22   40:aload_1         
	//   23   41:getfield        #189 <Field List zzz>
	//   24   44:invokeinterface #379 <Method boolean List.equals(Object)>
	//   25   49:ifeq            54
	//   26   52:iconst_1        
	//   27   53:ireturn         
	//   28   54:iconst_0        
	//   29   55:ireturn         
	}

	public Calendar getDate(String s)
	{
		zza(s, 4);
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		s = zzdr.getString(s);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #269 <Method String Bundle.getString(String)>
	//    7   13:astore_1        
		if(s != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
			return com.google.android.gms.internal.cast.zzdp.zzu(s);
	//   10   18:aload_1         
	//   11   19:invokestatic    #348 <Method Calendar zzdp.zzu(String)>
	//   12   22:areturn         
		else
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public String getDateAsString(String s)
	{
		zza(s, 4);
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		return zzdr.getString(s);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #269 <Method String Bundle.getString(String)>
	//    7   13:areturn         
	}

	public double getDouble(String s)
	{
		zza(s, 3);
	//    0    0:aload_1         
	//    1    1:iconst_3        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		return zzdr.getDouble(s);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #254 <Method double Bundle.getDouble(String)>
	//    7   13:dreturn         
	}

	public List getImages()
	{
		return zzz;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field List zzz>
	//    2    4:areturn         
	}

	public int getInt(String s)
	{
		zza(s, 2);
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		return zzdr.getInt(s);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #263 <Method int Bundle.getInt(String)>
	//    7   13:ireturn         
	}

	public int getMediaType()
	{
		return zzds;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field int zzds>
	//    2    4:ireturn         
	}

	public String getString(String s)
	{
		zza(s, 1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		return zzdr.getString(s);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #269 <Method String Bundle.getString(String)>
	//    7   13:areturn         
	}

	public boolean hasImages()
	{
		return zzz != null && !zzz.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field List zzz>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #189 <Field List zzz>
	//    5   11:invokeinterface #388 <Method boolean List.isEmpty()>
	//    6   16:ifne            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public int hashCode()
	{
		Iterator iterator = zzdr.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Bundle zzdr>
	//    2    4:invokevirtual   #276 <Method Set Bundle.keySet()>
	//    3    7:invokeinterface #282 <Method Iterator Set.iterator()>
	//    4   12:astore_2        
		int i;
		String s;
		for(i = 17; iterator.hasNext(); i = i * 31 + zzdr.get(s).hashCode())
	//*   5   13:bipush          17
	//*   6   15:istore_1        
	//*   7   16:aload_2         
	//*   8   17:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            55
			s = (String)iterator.next();
	//   10   25:aload_2         
	//   11   26:invokeinterface #292 <Method Object Iterator.next()>
	//   12   31:checkcast       #108 <Class String>
	//   13   34:astore_3        

	//   14   35:iload_1         
	//   15   36:bipush          31
	//   16   38:imul            
	//   17   39:aload_0         
	//   18   40:getfield        #191 <Field Bundle zzdr>
	//   19   43:aload_3         
	//   20   44:invokevirtual   #301 <Method Object Bundle.get(String)>
	//   21   47:invokevirtual   #391 <Method int Object.hashCode()>
	//   22   50:iadd            
	//   23   51:istore_1        
	//*  24   52:goto            16
		return i * 31 + zzz.hashCode();
	//   25   55:iload_1         
	//   26   56:bipush          31
	//   27   58:imul            
	//   28   59:aload_0         
	//   29   60:getfield        #189 <Field List zzz>
	//   30   63:invokeinterface #392 <Method int List.hashCode()>
	//   31   68:iadd            
	//   32   69:ireturn         
	}

	public Set keySet()
	{
		return zzdr.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Bundle zzdr>
	//    2    4:invokevirtual   #276 <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public void putDate(String s, Calendar calendar)
	{
		zza(s, 4);
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		zzdr.putString(s, com.google.android.gms.internal.cast.zzdp.zza(calendar));
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #398 <Method String zzdp.zza(Calendar)>
	//    8   14:invokevirtual   #352 <Method void Bundle.putString(String, String)>
	//    9   17:return          
	}

	public void putDouble(String s, double d)
	{
		zza(s, 3);
	//    0    0:aload_1         
	//    1    1:iconst_3        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		zzdr.putDouble(s, d);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:dload_2         
	//    7   11:invokevirtual   #360 <Method void Bundle.putDouble(String, double)>
	//    8   14:return          
	}

	public void putInt(String s, int i)
	{
		zza(s, 2);
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		zzdr.putInt(s, i);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #366 <Method void Bundle.putInt(String, int)>
	//    8   14:return          
	}

	public void putString(String s, String s1)
	{
		zza(s, 1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #382 <Method void zza(String, int)>
		zzdr.putString(s, s1);
	//    3    5:aload_0         
	//    4    6:getfield        #191 <Field Bundle zzdr>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #352 <Method void Bundle.putString(String, String)>
	//    8   14:return          
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #256 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #401 <Method void JSONObject()>
	//    3    7:astore_2        
		String as[];
		try
		{
			jsonobject.put("metadataType", zzds);
	//    4    8:aload_2         
	//    5    9:ldc2            #334 <String "metadataType">
	//    6   12:aload_0         
	//    7   13:getfield        #193 <Field int zzds>
	//    8   16:invokevirtual   #266 <Method JSONObject JSONObject.put(String, int)>
	//    9   19:pop             
		}
	//*  10   20:aload_2         
	//*  11   21:aload_0         
	//*  12   22:getfield        #189 <Field List zzz>
	//*  13   25:invokestatic    #404 <Method void zzdp.zza(JSONObject, List)>
	//*  14   28:aload_0         
	//*  15   29:getfield        #193 <Field int zzds>
	//*  16   32:tableswitch     0 4: default 68
	//	               0 244
	//	               1 216
	//	               2 183
	//	               3 132
	//	               4 81
	//*  17   68:iconst_0        
	//*  18   69:anewarray       String[]
	//*  19   72:astore_1        
	//*  20   73:aload_0         
	//*  21   74:aload_2         
	//*  22   75:aload_1         
	//*  23   76:invokespecial   #406 <Method void zza(JSONObject, String[])>
	//*  24   79:aload_2         
	//*  25   80:areturn         
	//*  26   81:bipush          8
	//*  27   83:anewarray       String[]
	//*  28   86:astore_1        
	//*  29   87:aload_1         
	//*  30   88:iconst_0        
	//*  31   89:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  32   91:aastore         
	//*  33   92:aload_1         
	//*  34   93:iconst_1        
	//*  35   94:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  36   96:aastore         
	//*  37   97:aload_1         
	//*  38   98:iconst_2        
	//*  39   99:ldc1            #53  <String "com.google.android.gms.cast.metadata.LOCATION_NAME">
	//*  40  101:aastore         
	//*  41  102:aload_1         
	//*  42  103:iconst_3        
	//*  43  104:ldc1            #47  <String "com.google.android.gms.cast.metadata.LOCATION_LATITUDE">
	//*  44  106:aastore         
	//*  45  107:aload_1         
	//*  46  108:iconst_4        
	//*  47  109:ldc1            #50  <String "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE">
	//*  48  111:aastore         
	//*  49  112:aload_1         
	//*  50  113:iconst_5        
	//*  51  114:ldc1            #77  <String "com.google.android.gms.cast.metadata.WIDTH">
	//*  52  116:aastore         
	//*  53  117:aload_1         
	//*  54  118:bipush          6
	//*  55  120:ldc1            #44  <String "com.google.android.gms.cast.metadata.HEIGHT">
	//*  56  122:aastore         
	//*  57  123:aload_1         
	//*  58  124:bipush          7
	//*  59  126:ldc1            #35  <String "com.google.android.gms.cast.metadata.CREATION_DATE">
	//*  60  128:aastore         
	//*  61  129:goto            73
	//*  62  132:bipush          8
	//*  63  134:anewarray       String[]
	//*  64  137:astore_1        
	//*  65  138:aload_1         
	//*  66  139:iconst_0        
	//*  67  140:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  68  142:aastore         
	//*  69  143:aload_1         
	//*  70  144:iconst_1        
	//*  71  145:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  72  147:aastore         
	//*  73  148:aload_1         
	//*  74  149:iconst_2        
	//*  75  150:ldc1            #23  <String "com.google.android.gms.cast.metadata.ALBUM_TITLE">
	//*  76  152:aastore         
	//*  77  153:aload_1         
	//*  78  154:iconst_3        
	//*  79  155:ldc1            #20  <String "com.google.android.gms.cast.metadata.ALBUM_ARTIST">
	//*  80  157:aastore         
	//*  81  158:aload_1         
	//*  82  159:iconst_4        
	//*  83  160:ldc1            #32  <String "com.google.android.gms.cast.metadata.COMPOSER">
	//*  84  162:aastore         
	//*  85  163:aload_1         
	//*  86  164:iconst_5        
	//*  87  165:ldc1            #74  <String "com.google.android.gms.cast.metadata.TRACK_NUMBER">
	//*  88  167:aastore         
	//*  89  168:aload_1         
	//*  90  169:bipush          6
	//*  91  171:ldc1            #38  <String "com.google.android.gms.cast.metadata.DISC_NUMBER">
	//*  92  173:aastore         
	//*  93  174:aload_1         
	//*  94  175:bipush          7
	//*  95  177:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//*  96  179:aastore         
	//*  97  180:goto            73
	//*  98  183:iconst_5        
	//*  99  184:anewarray       String[]
	//* 100  187:astore_1        
	//* 101  188:aload_1         
	//* 102  189:iconst_0        
	//* 103  190:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 104  192:aastore         
	//* 105  193:aload_1         
	//* 106  194:iconst_1        
	//* 107  195:ldc1            #62  <String "com.google.android.gms.cast.metadata.SERIES_TITLE">
	//* 108  197:aastore         
	//* 109  198:aload_1         
	//* 110  199:iconst_2        
	//* 111  200:ldc1            #59  <String "com.google.android.gms.cast.metadata.SEASON_NUMBER">
	//* 112  202:aastore         
	//* 113  203:aload_1         
	//* 114  204:iconst_3        
	//* 115  205:ldc1            #41  <String "com.google.android.gms.cast.metadata.EPISODE_NUMBER">
	//* 116  207:aastore         
	//* 117  208:aload_1         
	//* 118  209:iconst_4        
	//* 119  210:ldc1            #29  <String "com.google.android.gms.cast.metadata.BROADCAST_DATE">
	//* 120  212:aastore         
	//* 121  213:goto            73
	//* 122  216:iconst_4        
	//* 123  217:anewarray       String[]
	//* 124  220:astore_1        
	//* 125  221:aload_1         
	//* 126  222:iconst_0        
	//* 127  223:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 128  225:aastore         
	//* 129  226:aload_1         
	//* 130  227:iconst_1        
	//* 131  228:ldc1            #65  <String "com.google.android.gms.cast.metadata.STUDIO">
	//* 132  230:aastore         
	//* 133  231:aload_1         
	//* 134  232:iconst_2        
	//* 135  233:ldc1            #68  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 136  235:aastore         
	//* 137  236:aload_1         
	//* 138  237:iconst_3        
	//* 139  238:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 140  240:aastore         
	//* 141  241:goto            73
	//* 142  244:iconst_4        
	//* 143  245:anewarray       String[]
	//* 144  248:astore_1        
	//* 145  249:aload_1         
	//* 146  250:iconst_0        
	//* 147  251:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 148  253:aastore         
	//* 149  254:aload_1         
	//* 150  255:iconst_1        
	//* 151  256:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//* 152  258:aastore         
	//* 153  259:aload_1         
	//* 154  260:iconst_2        
	//* 155  261:ldc1            #68  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 156  263:aastore         
	//* 157  264:aload_1         
	//* 158  265:iconst_3        
	//* 159  266:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 160  268:aastore         
	//* 161  269:goto            73
		catch(JSONException jsonexception) { }
	//  162  272:astore_1        
		com.google.android.gms.internal.cast.zzdp.zza(jsonobject, zzz);
		zzds;
		JVM INSTR tableswitch 0 4: default 68
	//	               0 244
	//	               1 216
	//	               2 183
	//	               3 132
	//	               4 81;
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		as = new String[0];
_L8:
		zza(jsonobject, as);
		return jsonobject;
_L6:
		as = new String[8];
		as[0] = "com.google.android.gms.cast.metadata.TITLE";
		as[1] = "com.google.android.gms.cast.metadata.ARTIST";
		as[2] = "com.google.android.gms.cast.metadata.LOCATION_NAME";
		as[3] = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
		as[4] = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
		as[5] = "com.google.android.gms.cast.metadata.WIDTH";
		as[6] = "com.google.android.gms.cast.metadata.HEIGHT";
		as[7] = "com.google.android.gms.cast.metadata.CREATION_DATE";
		continue; /* Loop/switch isn't completed */
_L5:
		as = new String[8];
		as[0] = "com.google.android.gms.cast.metadata.TITLE";
		as[1] = "com.google.android.gms.cast.metadata.ARTIST";
		as[2] = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
		as[3] = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
		as[4] = "com.google.android.gms.cast.metadata.COMPOSER";
		as[5] = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
		as[6] = "com.google.android.gms.cast.metadata.DISC_NUMBER";
		as[7] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
		continue; /* Loop/switch isn't completed */
_L4:
		as = new String[5];
		as[0] = "com.google.android.gms.cast.metadata.TITLE";
		as[1] = "com.google.android.gms.cast.metadata.SERIES_TITLE";
		as[2] = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
		as[3] = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
		as[4] = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
		continue; /* Loop/switch isn't completed */
_L3:
		as = new String[4];
		as[0] = "com.google.android.gms.cast.metadata.TITLE";
		as[1] = "com.google.android.gms.cast.metadata.STUDIO";
		as[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
		as[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
		continue; /* Loop/switch isn't completed */
_L2:
		as = new String[4];
		as[0] = "com.google.android.gms.cast.metadata.TITLE";
		as[1] = "com.google.android.gms.cast.metadata.ARTIST";
		as[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
		as[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
		if(true) goto _L8; else goto _L7
_L7:
	//* 163  273:goto            20
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #414 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 2, getImages(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #416 <Method List getImages()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #420 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeBundle(parcel, 3, zzdr, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #191 <Field Bundle zzdr>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #424 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, getMediaType());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #426 <Method int getMediaType()>
	//   19   31:invokestatic    #430 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #433 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   23   39:return          
	}

	public final void zze(JSONObject jsonobject)
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #435 <Method void clear()>
		zzds = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #193 <Field int zzds>
		try
		{
			zzds = jsonobject.getInt("metadataType");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc2            #334 <String "metadataType">
	//    8   14:invokevirtual   #436 <Method int JSONObject.getInt(String)>
	//    9   17:putfield        #193 <Field int zzds>
		}
	//*  10   20:aload_0         
	//*  11   21:getfield        #189 <Field List zzz>
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #439 <Method void zzdp.zza(List, JSONObject)>
	//*  14   28:aload_0         
	//*  15   29:getfield        #193 <Field int zzds>
	//*  16   32:tableswitch     0 4: default 68
	//	               0 249
	//	               1 219
	//	               2 184
	//	               3 131
	//	               4 78
	//*  17   68:aload_0         
	//*  18   69:aload_1         
	//*  19   70:iconst_0        
	//*  20   71:anewarray       String[]
	//*  21   74:invokespecial   #441 <Method void zzb(JSONObject, String[])>
	//*  22   77:return          
	//*  23   78:aload_0         
	//*  24   79:aload_1         
	//*  25   80:bipush          8
	//*  26   82:anewarray       String[]
	//*  27   85:dup             
	//*  28   86:iconst_0        
	//*  29   87:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  30   89:aastore         
	//*  31   90:dup             
	//*  32   91:iconst_1        
	//*  33   92:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  34   94:aastore         
	//*  35   95:dup             
	//*  36   96:iconst_2        
	//*  37   97:ldc1            #53  <String "com.google.android.gms.cast.metadata.LOCATION_NAME">
	//*  38   99:aastore         
	//*  39  100:dup             
	//*  40  101:iconst_3        
	//*  41  102:ldc1            #47  <String "com.google.android.gms.cast.metadata.LOCATION_LATITUDE">
	//*  42  104:aastore         
	//*  43  105:dup             
	//*  44  106:iconst_4        
	//*  45  107:ldc1            #50  <String "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE">
	//*  46  109:aastore         
	//*  47  110:dup             
	//*  48  111:iconst_5        
	//*  49  112:ldc1            #77  <String "com.google.android.gms.cast.metadata.WIDTH">
	//*  50  114:aastore         
	//*  51  115:dup             
	//*  52  116:bipush          6
	//*  53  118:ldc1            #44  <String "com.google.android.gms.cast.metadata.HEIGHT">
	//*  54  120:aastore         
	//*  55  121:dup             
	//*  56  122:bipush          7
	//*  57  124:ldc1            #35  <String "com.google.android.gms.cast.metadata.CREATION_DATE">
	//*  58  126:aastore         
	//*  59  127:invokespecial   #441 <Method void zzb(JSONObject, String[])>
	//*  60  130:return          
	//*  61  131:aload_0         
	//*  62  132:aload_1         
	//*  63  133:bipush          8
	//*  64  135:anewarray       String[]
	//*  65  138:dup             
	//*  66  139:iconst_0        
	//*  67  140:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//*  68  142:aastore         
	//*  69  143:dup             
	//*  70  144:iconst_1        
	//*  71  145:ldc1            #23  <String "com.google.android.gms.cast.metadata.ALBUM_TITLE">
	//*  72  147:aastore         
	//*  73  148:dup             
	//*  74  149:iconst_2        
	//*  75  150:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//*  76  152:aastore         
	//*  77  153:dup             
	//*  78  154:iconst_3        
	//*  79  155:ldc1            #20  <String "com.google.android.gms.cast.metadata.ALBUM_ARTIST">
	//*  80  157:aastore         
	//*  81  158:dup             
	//*  82  159:iconst_4        
	//*  83  160:ldc1            #32  <String "com.google.android.gms.cast.metadata.COMPOSER">
	//*  84  162:aastore         
	//*  85  163:dup             
	//*  86  164:iconst_5        
	//*  87  165:ldc1            #74  <String "com.google.android.gms.cast.metadata.TRACK_NUMBER">
	//*  88  167:aastore         
	//*  89  168:dup             
	//*  90  169:bipush          6
	//*  91  171:ldc1            #38  <String "com.google.android.gms.cast.metadata.DISC_NUMBER">
	//*  92  173:aastore         
	//*  93  174:dup             
	//*  94  175:bipush          7
	//*  95  177:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//*  96  179:aastore         
	//*  97  180:invokespecial   #441 <Method void zzb(JSONObject, String[])>
	//*  98  183:return          
	//*  99  184:aload_0         
	//* 100  185:aload_1         
	//* 101  186:iconst_5        
	//* 102  187:anewarray       String[]
	//* 103  190:dup             
	//* 104  191:iconst_0        
	//* 105  192:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 106  194:aastore         
	//* 107  195:dup             
	//* 108  196:iconst_1        
	//* 109  197:ldc1            #62  <String "com.google.android.gms.cast.metadata.SERIES_TITLE">
	//* 110  199:aastore         
	//* 111  200:dup             
	//* 112  201:iconst_2        
	//* 113  202:ldc1            #59  <String "com.google.android.gms.cast.metadata.SEASON_NUMBER">
	//* 114  204:aastore         
	//* 115  205:dup             
	//* 116  206:iconst_3        
	//* 117  207:ldc1            #41  <String "com.google.android.gms.cast.metadata.EPISODE_NUMBER">
	//* 118  209:aastore         
	//* 119  210:dup             
	//* 120  211:iconst_4        
	//* 121  212:ldc1            #29  <String "com.google.android.gms.cast.metadata.BROADCAST_DATE">
	//* 122  214:aastore         
	//* 123  215:invokespecial   #441 <Method void zzb(JSONObject, String[])>
	//* 124  218:return          
	//* 125  219:aload_0         
	//* 126  220:aload_1         
	//* 127  221:iconst_4        
	//* 128  222:anewarray       String[]
	//* 129  225:dup             
	//* 130  226:iconst_0        
	//* 131  227:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 132  229:aastore         
	//* 133  230:dup             
	//* 134  231:iconst_1        
	//* 135  232:ldc1            #65  <String "com.google.android.gms.cast.metadata.STUDIO">
	//* 136  234:aastore         
	//* 137  235:dup             
	//* 138  236:iconst_2        
	//* 139  237:ldc1            #68  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 140  239:aastore         
	//* 141  240:dup             
	//* 142  241:iconst_3        
	//* 143  242:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 144  244:aastore         
	//* 145  245:invokespecial   #441 <Method void zzb(JSONObject, String[])>
	//* 146  248:return          
	//* 147  249:aload_0         
	//* 148  250:aload_1         
	//* 149  251:iconst_4        
	//* 150  252:anewarray       String[]
	//* 151  255:dup             
	//* 152  256:iconst_0        
	//* 153  257:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//* 154  259:aastore         
	//* 155  260:dup             
	//* 156  261:iconst_1        
	//* 157  262:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//* 158  264:aastore         
	//* 159  265:dup             
	//* 160  266:iconst_2        
	//* 161  267:ldc1            #68  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//* 162  269:aastore         
	//* 163  270:dup             
	//* 164  271:iconst_3        
	//* 165  272:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//* 166  274:aastore         
	//* 167  275:invokespecial   #441 <Method void zzb(JSONObject, String[])>
	//* 168  278:return          
		catch(JSONException jsonexception) { }
	//  169  279:astore_2        
		com.google.android.gms.internal.cast.zzdp.zza(zzz, jsonobject);
		switch(zzds)
		{
		default:
			zzb(jsonobject, new String[0]);
			return;

		case 4: // '\004'
			zzb(jsonobject, new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
			});
			return;

		case 3: // '\003'
			zzb(jsonobject, new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			});
			return;

		case 2: // '\002'
			zzb(jsonobject, new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
			});
			return;

		case 1: // '\001'
			zzb(jsonobject, new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			});
			return;

		case 0: // '\0'
			zzb(jsonobject, new String[] {
				"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
			});
			return;
		}
	//* 170  280:goto            20
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzak();
	public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
	public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
	public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
	public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
	public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
	public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
	public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
	public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
	public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
	public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
	public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
	public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
	public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
	public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
	public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
	public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
	public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
	public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
	public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
	public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
	public static final int MEDIA_TYPE_GENERIC = 0;
	public static final int MEDIA_TYPE_MOVIE = 1;
	public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
	public static final int MEDIA_TYPE_PHOTO = 4;
	public static final int MEDIA_TYPE_TV_SHOW = 2;
	public static final int MEDIA_TYPE_USER = 100;
	private static final String zzdp[] = {
		null, "String", "int", "double", "ISO-8601 date String"
	};
	private static final zza zzdq = (new zza()).zza("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).zza("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).zza("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).zza("com.google.android.gms.cast.metadata.TITLE", "title", 1).zza("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).zza("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).zza("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).zza("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).zza("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).zza("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).zza("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).zza("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).zza("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).zza("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).zza("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).zza("com.google.android.gms.cast.metadata.WIDTH", "width", 2).zza("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).zza("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).zza("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).zza("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
	private final Bundle zzdr;
	private int zzds;
	private final List zzz;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #110 <String "String">
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #112 <String "int">
	//   13   17:aastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #114 <String "double">
	//   17   22:aastore         
	//   18   23:dup             
	//   19   24:iconst_4        
	//   20   25:ldc1            #116 <String "ISO-8601 date String">
	//   21   27:aastore         
	//   22   28:putstatic       #118 <Field String[] zzdp>
	//   23   31:new             #120 <Class zzak>
	//   24   34:dup             
	//   25   35:invokespecial   #123 <Method void zzak()>
	//   26   38:putstatic       #125 <Field android.os.Parcelable$Creator CREATOR>
	//   27   41:new             #6   <Class MediaMetadata$zza>
	//   28   44:dup             
	//   29   45:invokespecial   #126 <Method void MediaMetadata$zza()>
	//   30   48:ldc1            #35  <String "com.google.android.gms.cast.metadata.CREATION_DATE">
	//   31   50:ldc1            #128 <String "creationDateTime">
	//   32   52:iconst_4        
	//   33   53:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   34   56:ldc1            #56  <String "com.google.android.gms.cast.metadata.RELEASE_DATE">
	//   35   58:ldc1            #133 <String "releaseDate">
	//   36   60:iconst_4        
	//   37   61:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   38   64:ldc1            #29  <String "com.google.android.gms.cast.metadata.BROADCAST_DATE">
	//   39   66:ldc1            #135 <String "originalAirdate">
	//   40   68:iconst_4        
	//   41   69:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   42   72:ldc1            #71  <String "com.google.android.gms.cast.metadata.TITLE">
	//   43   74:ldc1            #137 <String "title">
	//   44   76:iconst_1        
	//   45   77:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   46   80:ldc1            #68  <String "com.google.android.gms.cast.metadata.SUBTITLE">
	//   47   82:ldc1            #139 <String "subtitle">
	//   48   84:iconst_1        
	//   49   85:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   50   88:ldc1            #26  <String "com.google.android.gms.cast.metadata.ARTIST">
	//   51   90:ldc1            #141 <String "artist">
	//   52   92:iconst_1        
	//   53   93:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   54   96:ldc1            #20  <String "com.google.android.gms.cast.metadata.ALBUM_ARTIST">
	//   55   98:ldc1            #143 <String "albumArtist">
	//   56  100:iconst_1        
	//   57  101:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   58  104:ldc1            #23  <String "com.google.android.gms.cast.metadata.ALBUM_TITLE">
	//   59  106:ldc1            #145 <String "albumName">
	//   60  108:iconst_1        
	//   61  109:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   62  112:ldc1            #32  <String "com.google.android.gms.cast.metadata.COMPOSER">
	//   63  114:ldc1            #147 <String "composer">
	//   64  116:iconst_1        
	//   65  117:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   66  120:ldc1            #38  <String "com.google.android.gms.cast.metadata.DISC_NUMBER">
	//   67  122:ldc1            #149 <String "discNumber">
	//   68  124:iconst_2        
	//   69  125:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   70  128:ldc1            #74  <String "com.google.android.gms.cast.metadata.TRACK_NUMBER">
	//   71  130:ldc1            #151 <String "trackNumber">
	//   72  132:iconst_2        
	//   73  133:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   74  136:ldc1            #59  <String "com.google.android.gms.cast.metadata.SEASON_NUMBER">
	//   75  138:ldc1            #153 <String "season">
	//   76  140:iconst_2        
	//   77  141:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   78  144:ldc1            #41  <String "com.google.android.gms.cast.metadata.EPISODE_NUMBER">
	//   79  146:ldc1            #155 <String "episode">
	//   80  148:iconst_2        
	//   81  149:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   82  152:ldc1            #62  <String "com.google.android.gms.cast.metadata.SERIES_TITLE">
	//   83  154:ldc1            #157 <String "seriesTitle">
	//   84  156:iconst_1        
	//   85  157:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   86  160:ldc1            #65  <String "com.google.android.gms.cast.metadata.STUDIO">
	//   87  162:ldc1            #159 <String "studio">
	//   88  164:iconst_1        
	//   89  165:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   90  168:ldc1            #77  <String "com.google.android.gms.cast.metadata.WIDTH">
	//   91  170:ldc1            #161 <String "width">
	//   92  172:iconst_2        
	//   93  173:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   94  176:ldc1            #44  <String "com.google.android.gms.cast.metadata.HEIGHT">
	//   95  178:ldc1            #163 <String "height">
	//   96  180:iconst_2        
	//   97  181:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//   98  184:ldc1            #53  <String "com.google.android.gms.cast.metadata.LOCATION_NAME">
	//   99  186:ldc1            #165 <String "location">
	//  100  188:iconst_1        
	//  101  189:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//  102  192:ldc1            #47  <String "com.google.android.gms.cast.metadata.LOCATION_LATITUDE">
	//  103  194:ldc1            #167 <String "latitude">
	//  104  196:iconst_3        
	//  105  197:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//  106  200:ldc1            #50  <String "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE">
	//  107  202:ldc1            #169 <String "longitude">
	//  108  204:iconst_3        
	//  109  205:invokevirtual   #131 <Method MediaMetadata$zza MediaMetadata$zza.zza(String, String, int)>
	//  110  208:putstatic       #171 <Field MediaMetadata$zza zzdq>
	//* 111  211:return          
	}
}
