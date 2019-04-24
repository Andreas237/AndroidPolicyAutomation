// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			RemoteInput

class RemoteInputCompatJellybean
{

	RemoteInputCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public static void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		Intent intent2 = getClipDataIntentFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore          4
		Intent intent1 = intent2;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(intent2 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       22
			intent1 = new Intent();
	//    7   14:new             #48  <Class Intent>
	//    8   17:dup             
	//    9   18:invokespecial   #49  <Method void Intent()>
	//   10   21:astore_3        
		Iterator iterator = map.entrySet().iterator();
	//   11   22:aload_2         
	//   12   23:invokeinterface #55  <Method Set Map.entrySet()>
	//   13   28:invokeinterface #61  <Method Iterator Set.iterator()>
	//   14   33:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   35:aload           5
	//   16   37:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            140
			map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//   18   45:aload           5
	//   19   47:invokeinterface #71  <Method Object Iterator.next()>
	//   20   52:checkcast       #73  <Class java.util.Map$Entry>
	//   21   55:astore_2        
			String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   22   56:aload_2         
	//   23   57:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   24   62:checkcast       #78  <Class String>
	//   25   65:astore          6
			Uri uri = (Uri)((java.util.Map.Entry) (map)).getValue();
	//   26   67:aload_2         
	//   27   68:invokeinterface #81  <Method Object java.util.Map$Entry.getValue()>
	//   28   73:checkcast       #83  <Class Uri>
	//   29   76:astore          7
			if(s != null)
	//*  30   78:aload           6
	//*  31   80:ifnonnull       86
	//*  32   83:goto            35
			{
				Bundle bundle = intent1.getBundleExtra(getExtraResultsKeyForData(s));
	//   33   86:aload_3         
	//   34   87:aload           6
	//   35   89:invokestatic    #87  <Method String getExtraResultsKeyForData(String)>
	//   36   92:invokevirtual   #91  <Method Bundle Intent.getBundleExtra(String)>
	//   37   95:astore          4
				map = ((Map) (bundle));
	//   38   97:aload           4
	//   39   99:astore_2        
				if(bundle == null)
	//*  40  100:aload           4
	//*  41  102:ifnonnull       113
					map = ((Map) (new Bundle()));
	//   42  105:new             #93  <Class Bundle>
	//   43  108:dup             
	//   44  109:invokespecial   #94  <Method void Bundle()>
	//   45  112:astore_2        
				((Bundle) (map)).putString(remoteinput.getResultKey(), uri.toString());
	//   46  113:aload_2         
	//   47  114:aload_0         
	//   48  115:invokevirtual   #100 <Method String RemoteInput.getResultKey()>
	//   49  118:aload           7
	//   50  120:invokevirtual   #103 <Method String Uri.toString()>
	//   51  123:invokevirtual   #107 <Method void Bundle.putString(String, String)>
				intent1.putExtra(getExtraResultsKeyForData(s), ((Bundle) (map)));
	//   52  126:aload_3         
	//   53  127:aload           6
	//   54  129:invokestatic    #87  <Method String getExtraResultsKeyForData(String)>
	//   55  132:aload_2         
	//   56  133:invokevirtual   #111 <Method Intent Intent.putExtra(String, Bundle)>
	//   57  136:pop             
			}
		} while(true);
	//   58  137:goto            35
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   59  140:aload_1         
	//   60  141:ldc1            #35  <String "android.remoteinput.results">
	//   61  143:aload_3         
	//   62  144:invokestatic    #117 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   63  147:invokevirtual   #121 <Method void Intent.setClipData(ClipData)>
	//   64  150:return          
	}

	static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		Object obj = ((Object) (getClipDataIntentFromIntent(intent)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore          6
		Intent intent1 = ((Intent) (obj));
	//    3    6:aload           6
	//    4    8:astore          5
		if(obj == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       24
			intent1 = new Intent();
	//    7   15:new             #48  <Class Intent>
	//    8   18:dup             
	//    9   19:invokespecial   #49  <Method void Intent()>
	//   10   22:astore          5
		Bundle bundle1 = intent1.getBundleExtra("android.remoteinput.resultsData");
	//   11   24:aload           5
	//   12   26:ldc1            #14  <String "android.remoteinput.resultsData">
	//   13   28:invokevirtual   #91  <Method Bundle Intent.getBundleExtra(String)>
	//   14   31:astore          7
		obj = ((Object) (bundle1));
	//   15   33:aload           7
	//   16   35:astore          6
		if(bundle1 == null)
	//*  17   37:aload           7
	//*  18   39:ifnonnull       51
			obj = ((Object) (new Bundle()));
	//   19   42:new             #93  <Class Bundle>
	//   20   45:dup             
	//   21   46:invokespecial   #94  <Method void Bundle()>
	//   22   49:astore          6
		int j = aremoteinput.length;
	//   23   51:aload_0         
	//   24   52:arraylength     
	//   25   53:istore          4
		for(int i = 0; i < j; i++)
	//*  26   55:iconst_0        
	//*  27   56:istore_3        
	//*  28   57:iload_3         
	//*  29   58:iload           4
	//*  30   60:icmpge          109
		{
			RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
	//   31   63:aload_0         
	//   32   64:iload_3         
	//   33   65:aaload          
	//   34   66:astore          7
			Object obj1 = bundle.get(remoteinput.getResultKey());
	//   35   68:aload_2         
	//   36   69:aload           7
	//   37   71:invokevirtual   #128 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   38   74:invokevirtual   #132 <Method Object Bundle.get(String)>
	//   39   77:astore          8
			if(obj1 instanceof CharSequence)
	//*  40   79:aload           8
	//*  41   81:instanceof      #134 <Class CharSequence>
	//*  42   84:ifeq            102
				((Bundle) (obj)).putCharSequence(remoteinput.getResultKey(), (CharSequence)obj1);
	//   43   87:aload           6
	//   44   89:aload           7
	//   45   91:invokevirtual   #128 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   46   94:aload           8
	//   47   96:checkcast       #134 <Class CharSequence>
	//   48   99:invokevirtual   #138 <Method void Bundle.putCharSequence(String, CharSequence)>
		}

	//   49  102:iload_3         
	//   50  103:iconst_1        
	//   51  104:iadd            
	//   52  105:istore_3        
	//*  53  106:goto            57
		intent1.putExtra("android.remoteinput.resultsData", ((Bundle) (obj)));
	//   54  109:aload           5
	//   55  111:ldc1            #14  <String "android.remoteinput.resultsData">
	//   56  113:aload           6
	//   57  115:invokevirtual   #111 <Method Intent Intent.putExtra(String, Bundle)>
	//   58  118:pop             
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   59  119:aload_1         
	//   60  120:ldc1            #35  <String "android.remoteinput.results">
	//   61  122:aload           5
	//   62  124:invokestatic    #117 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   63  127:invokevirtual   #121 <Method void Intent.setClipData(ClipData)>
	//   64  130:return          
	}

	static RemoteInputCompatBase.RemoteInput fromBundle(Bundle bundle, RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		Object obj = ((Object) (bundle.getStringArrayList("allowedDataTypes")));
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "allowedDataTypes">
	//    2    3:invokevirtual   #144 <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    6:astore_3        
		HashSet hashset = new HashSet();
	//    4    7:new             #146 <Class HashSet>
	//    5   10:dup             
	//    6   11:invokespecial   #147 <Method void HashSet()>
	//    7   14:astore_2        
		if(obj != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          52
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Set) (hashset)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   10   19:aload_3         
	//   11   20:invokevirtual   #150 <Method Iterator ArrayList.iterator()>
	//   12   23:astore_3        
	//   13   24:aload_3         
	//   14   25:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   15   30:ifeq            52
	//   16   33:aload_2         
	//   17   34:aload_3         
	//   18   35:invokeinterface #71  <Method Object Iterator.next()>
	//   19   40:checkcast       #78  <Class String>
	//   20   43:invokeinterface #154 <Method boolean Set.add(Object)>
	//   21   48:pop             
	//*  22   49:goto            24
		return factory.build(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), bundle.getBundle("extras"), ((Set) (hashset)));
	//   23   52:aload_1         
	//   24   53:aload_0         
	//   25   54:ldc1            #32  <String "resultKey">
	//   26   56:invokevirtual   #157 <Method String Bundle.getString(String)>
	//   27   59:aload_0         
	//   28   60:ldc1            #29  <String "label">
	//   29   62:invokevirtual   #161 <Method CharSequence Bundle.getCharSequence(String)>
	//   30   65:aload_0         
	//   31   66:ldc1            #23  <String "choices">
	//   32   68:invokevirtual   #165 <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   33   71:aload_0         
	//   34   72:ldc1            #20  <String "allowFreeFormInput">
	//   35   74:invokevirtual   #169 <Method boolean Bundle.getBoolean(String)>
	//   36   77:aload_0         
	//   37   78:ldc1            #26  <String "extras">
	//   38   80:invokevirtual   #172 <Method Bundle Bundle.getBundle(String)>
	//   39   83:aload_2         
	//   40   84:invokeinterface #178 <Method RemoteInputCompatBase$RemoteInput RemoteInputCompatBase$RemoteInput$Factory.build(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
	//   41   89:areturn         
	}

	static RemoteInputCompatBase.RemoteInput[] fromBundleArray(Bundle abundle[], RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		if(abundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		RemoteInputCompatBase.RemoteInput aremoteinput[] = factory.newArray(abundle.length);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:arraylength     
	//    7    9:invokeinterface #184 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatBase$RemoteInput$Factory.newArray(int)>
	//    8   14:astore_3        
		for(int i = 0; i < abundle.length; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:aload_0         
	//*  13   19:arraylength     
	//*  14   20:icmpge          40
			aremoteinput[i] = fromBundle(abundle[i], factory);
	//   15   23:aload_3         
	//   16   24:iload_2         
	//   17   25:aload_0         
	//   18   26:iload_2         
	//   19   27:aaload          
	//   20   28:aload_1         
	//   21   29:invokestatic    #186 <Method RemoteInputCompatBase$RemoteInput fromBundle(Bundle, RemoteInputCompatBase$RemoteInput$Factory)>
	//   22   32:aastore         

	//   23   33:iload_2         
	//   24   34:iconst_1        
	//   25   35:iadd            
	//   26   36:istore_2        
	//*  27   37:goto            17
		return aremoteinput;
	//   28   40:aload_3         
	//   29   41:areturn         
	}

	private static Intent getClipDataIntentFromIntent(Intent intent)
	{
		intent = ((Intent) (intent.getClipData()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method ClipData Intent.getClipData()>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		ClipDescription clipdescription = ((ClipData) (intent)).getDescription();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #194 <Method ClipDescription ClipData.getDescription()>
	//    9   15:astore_1        
		if(!clipdescription.hasMimeType("text/vnd.android.intent"))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #196 <String "text/vnd.android.intent">
	//*  12   19:invokevirtual   #201 <Method boolean ClipDescription.hasMimeType(String)>
	//*  13   22:ifne            27
			return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
		if(!((Object) (clipdescription.getLabel())).equals("android.remoteinput.results"))
	//*  16   27:aload_1         
	//*  17   28:invokevirtual   #205 <Method CharSequence ClipDescription.getLabel()>
	//*  18   31:ldc1            #35  <String "android.remoteinput.results">
	//*  19   33:invokevirtual   #208 <Method boolean Object.equals(Object)>
	//*  20   36:ifne            41
			return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
		else
			return ((ClipData) (intent)).getItemAt(0).getIntent();
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #212 <Method android.content.ClipData$Item ClipData.getItemAt(int)>
	//   26   46:invokevirtual   #218 <Method Intent android.content.ClipData$Item.getIntent()>
	//   27   49:areturn         
	}

	static Map getDataResultsFromIntent(Intent intent, String s)
	{
		intent = getClipDataIntentFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #46  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #222 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #223 <Method void HashMap()>
	//   10   18:astore_2        
		Iterator iterator = intent.getExtras().keySet().iterator();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #227 <Method Bundle Intent.getExtras()>
	//   13   23:invokevirtual   #230 <Method Set Bundle.keySet()>
	//   14   26:invokeinterface #61  <Method Iterator Set.iterator()>
	//   15   31:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   16   32:aload_3         
	//   17   33:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            135
			String s2 = (String)iterator.next();
	//   19   41:aload_3         
	//   20   42:invokeinterface #71  <Method Object Iterator.next()>
	//   21   47:checkcast       #78  <Class String>
	//   22   50:astore          5
			if(s2.startsWith("android.remoteinput.dataTypeResultsData"))
	//*  23   52:aload           5
	//*  24   54:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//*  25   56:invokevirtual   #233 <Method boolean String.startsWith(String)>
	//*  26   59:ifeq            132
			{
				String s1 = s2.substring("android.remoteinput.dataTypeResultsData".length());
	//   27   62:aload           5
	//   28   64:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//   29   66:invokevirtual   #237 <Method int String.length()>
	//   30   69:invokevirtual   #241 <Method String String.substring(int)>
	//   31   72:astore          4
				if(s1 != null && !s1.isEmpty())
	//*  32   74:aload           4
	//*  33   76:ifnull          32
	//*  34   79:aload           4
	//*  35   81:invokevirtual   #244 <Method boolean String.isEmpty()>
	//*  36   84:ifeq            90
	//*  37   87:goto            32
				{
					s2 = intent.getBundleExtra(s2).getString(s);
	//   38   90:aload_0         
	//   39   91:aload           5
	//   40   93:invokevirtual   #91  <Method Bundle Intent.getBundleExtra(String)>
	//   41   96:aload_1         
	//   42   97:invokevirtual   #157 <Method String Bundle.getString(String)>
	//   43  100:astore          5
					if(s2 != null && !s2.isEmpty())
	//*  44  102:aload           5
	//*  45  104:ifnull          32
	//*  46  107:aload           5
	//*  47  109:invokevirtual   #244 <Method boolean String.isEmpty()>
	//*  48  112:ifeq            118
	//*  49  115:goto            32
						((Map) (hashmap)).put(((Object) (s1)), ((Object) (Uri.parse(s2))));
	//   50  118:aload_2         
	//   51  119:aload           4
	//   52  121:aload           5
	//   53  123:invokestatic    #248 <Method Uri Uri.parse(String)>
	//   54  126:invokeinterface #252 <Method Object Map.put(Object, Object)>
	//   55  131:pop             
				}
			}
		} while(true);
	//   56  132:goto            32
		if(((Map) (hashmap)).isEmpty())
	//*  57  135:aload_2         
	//*  58  136:invokeinterface #253 <Method boolean Map.isEmpty()>
	//*  59  141:ifeq            146
			return null;
	//   60  144:aconst_null     
	//   61  145:areturn         
		else
			return ((Map) (hashmap));
	//   62  146:aload_2         
	//   63  147:areturn         
	}

	private static String getExtraResultsKeyForData(String s)
	{
		return (new StringBuilder()).append("android.remoteinput.dataTypeResultsData").append(s).toString();
	//    0    0:new             #256 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #257 <Method void StringBuilder()>
	//    3    7:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//    4    9:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #262 <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	static Bundle getResultsFromIntent(Intent intent)
	{
		intent = getClipDataIntentFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #46  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (Bundle)intent.getExtras().getParcelable("android.remoteinput.resultsData");
	//    7   11:aload_0         
	//    8   12:invokevirtual   #227 <Method Bundle Intent.getExtras()>
	//    9   15:ldc1            #14  <String "android.remoteinput.resultsData">
	//   10   17:invokevirtual   #268 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   20:checkcast       #93  <Class Bundle>
	//   12   23:areturn         
	}

	static Bundle toBundle(RemoteInputCompatBase.RemoteInput remoteinput)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #93  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("resultKey", remoteinput.getResultKey());
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "resultKey">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #128 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//    8   15:invokevirtual   #107 <Method void Bundle.putString(String, String)>
		bundle.putCharSequence("label", remoteinput.getLabel());
	//    9   18:aload_1         
	//   10   19:ldc1            #29  <String "label">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #271 <Method CharSequence RemoteInputCompatBase$RemoteInput.getLabel()>
	//   13   25:invokevirtual   #138 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequenceArray("choices", remoteinput.getChoices());
	//   14   28:aload_1         
	//   15   29:ldc1            #23  <String "choices">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #275 <Method CharSequence[] RemoteInputCompatBase$RemoteInput.getChoices()>
	//   18   35:invokevirtual   #279 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
		bundle.putBoolean("allowFreeFormInput", remoteinput.getAllowFreeFormInput());
	//   19   38:aload_1         
	//   20   39:ldc1            #20  <String "allowFreeFormInput">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #282 <Method boolean RemoteInputCompatBase$RemoteInput.getAllowFreeFormInput()>
	//   23   45:invokevirtual   #286 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBundle("extras", remoteinput.getExtras());
	//   24   48:aload_1         
	//   25   49:ldc1            #26  <String "extras">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #287 <Method Bundle RemoteInputCompatBase$RemoteInput.getExtras()>
	//   28   55:invokevirtual   #291 <Method void Bundle.putBundle(String, Bundle)>
		Object obj = ((Object) (remoteinput.getAllowedDataTypes()));
	//   29   58:aload_0         
	//   30   59:invokevirtual   #294 <Method Set RemoteInputCompatBase$RemoteInput.getAllowedDataTypes()>
	//   31   62:astore_2        
		if(obj != null && !((Set) (obj)).isEmpty())
	//*  32   63:aload_2         
	//*  33   64:ifnull          130
	//*  34   67:aload_2         
	//*  35   68:invokeinterface #295 <Method boolean Set.isEmpty()>
	//*  36   73:ifne            130
		{
			remoteinput = ((RemoteInputCompatBase.RemoteInput) (new ArrayList(((Set) (obj)).size())));
	//   37   76:new             #149 <Class ArrayList>
	//   38   79:dup             
	//   39   80:aload_2         
	//   40   81:invokeinterface #298 <Method int Set.size()>
	//   41   86:invokespecial   #301 <Method void ArrayList(int)>
	//   42   89:astore_0        
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ArrayList) (remoteinput)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   43   90:aload_2         
	//   44   91:invokeinterface #61  <Method Iterator Set.iterator()>
	//   45   96:astore_2        
	//   46   97:aload_2         
	//   47   98:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   48  103:ifeq            123
	//   49  106:aload_0         
	//   50  107:aload_2         
	//   51  108:invokeinterface #71  <Method Object Iterator.next()>
	//   52  113:checkcast       #78  <Class String>
	//   53  116:invokevirtual   #302 <Method boolean ArrayList.add(Object)>
	//   54  119:pop             
	//*  55  120:goto            97
			bundle.putStringArrayList("allowedDataTypes", ((ArrayList) (remoteinput)));
	//   56  123:aload_1         
	//   57  124:ldc1            #17  <String "allowedDataTypes">
	//   58  126:aload_0         
	//   59  127:invokevirtual   #306 <Method void Bundle.putStringArrayList(String, ArrayList)>
		}
		return bundle;
	//   60  130:aload_1         
	//   61  131:areturn         
	}

	static Bundle[] toBundleArray(RemoteInputCompatBase.RemoteInput aremoteinput[])
	{
		if(aremoteinput == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bundle abundle[] = new Bundle[aremoteinput.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       Bundle[]
	//    7   11:astore_2        
		for(int i = 0; i < aremoteinput.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          36
			abundle[i] = toBundle(aremoteinput[i]);
	//   14   20:aload_2         
	//   15   21:iload_1         
	//   16   22:aload_0         
	//   17   23:iload_1         
	//   18   24:aaload          
	//   19   25:invokestatic    #310 <Method Bundle toBundle(RemoteInputCompatBase$RemoteInput)>
	//   20   28:aastore         

	//   21   29:iload_1         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_1        
	//*  25   33:goto            14
		return abundle;
	//   26   36:aload_2         
	//   27   37:areturn         
	}

	private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
	public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
	private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
	private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
	private static final String KEY_CHOICES = "choices";
	private static final String KEY_EXTRAS = "extras";
	private static final String KEY_LABEL = "label";
	private static final String KEY_RESULT_KEY = "resultKey";
	public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
}
