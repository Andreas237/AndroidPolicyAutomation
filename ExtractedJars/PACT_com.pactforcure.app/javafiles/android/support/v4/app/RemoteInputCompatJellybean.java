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
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		Intent intent2 = getClipDataIntentFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore          4
		Intent intent1 = intent2;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(intent2 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       22
			intent1 = new Intent();
	//    7   14:new             #42  <Class Intent>
	//    8   17:dup             
	//    9   18:invokespecial   #43  <Method void Intent()>
	//   10   21:astore_3        
		Iterator iterator = map.entrySet().iterator();
	//   11   22:aload_2         
	//   12   23:invokeinterface #49  <Method Set Map.entrySet()>
	//   13   28:invokeinterface #55  <Method Iterator Set.iterator()>
	//   14   33:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   35:aload           5
	//   16   37:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            137
			map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//   18   45:aload           5
	//   19   47:invokeinterface #65  <Method Object Iterator.next()>
	//   20   52:checkcast       #67  <Class java.util.Map$Entry>
	//   21   55:astore_2        
			String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   22   56:aload_2         
	//   23   57:invokeinterface #70  <Method Object java.util.Map$Entry.getKey()>
	//   24   62:checkcast       #72  <Class String>
	//   25   65:astore          6
			Uri uri = (Uri)((java.util.Map.Entry) (map)).getValue();
	//   26   67:aload_2         
	//   27   68:invokeinterface #75  <Method Object java.util.Map$Entry.getValue()>
	//   28   73:checkcast       #77  <Class Uri>
	//   29   76:astore          7
			if(s != null)
	//*  30   78:aload           6
	//*  31   80:ifnull          35
			{
				Bundle bundle = intent1.getBundleExtra(getExtraResultsKeyForData(s));
	//   32   83:aload_3         
	//   33   84:aload           6
	//   34   86:invokestatic    #81  <Method String getExtraResultsKeyForData(String)>
	//   35   89:invokevirtual   #85  <Method Bundle Intent.getBundleExtra(String)>
	//   36   92:astore          4
				map = ((Map) (bundle));
	//   37   94:aload           4
	//   38   96:astore_2        
				if(bundle == null)
	//*  39   97:aload           4
	//*  40   99:ifnonnull       110
					map = ((Map) (new Bundle()));
	//   41  102:new             #87  <Class Bundle>
	//   42  105:dup             
	//   43  106:invokespecial   #88  <Method void Bundle()>
	//   44  109:astore_2        
				((Bundle) (map)).putString(remoteinput.getResultKey(), uri.toString());
	//   45  110:aload_2         
	//   46  111:aload_0         
	//   47  112:invokevirtual   #94  <Method String RemoteInput.getResultKey()>
	//   48  115:aload           7
	//   49  117:invokevirtual   #97  <Method String Uri.toString()>
	//   50  120:invokevirtual   #101 <Method void Bundle.putString(String, String)>
				intent1.putExtra(getExtraResultsKeyForData(s), ((Bundle) (map)));
	//   51  123:aload_3         
	//   52  124:aload           6
	//   53  126:invokestatic    #81  <Method String getExtraResultsKeyForData(String)>
	//   54  129:aload_2         
	//   55  130:invokevirtual   #105 <Method Intent Intent.putExtra(String, Bundle)>
	//   56  133:pop             
			}
		} while(true);
	//   57  134:goto            35
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   58  137:aload_1         
	//   59  138:ldc1            #107 <String "android.remoteinput.results">
	//   60  140:aload_3         
	//   61  141:invokestatic    #113 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   62  144:invokevirtual   #117 <Method void Intent.setClipData(ClipData)>
	//   63  147:return          
	}

	static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		Object obj = ((Object) (getClipDataIntentFromIntent(intent)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore          6
		Intent intent1 = ((Intent) (obj));
	//    3    6:aload           6
	//    4    8:astore          5
		if(obj == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       24
			intent1 = new Intent();
	//    7   15:new             #42  <Class Intent>
	//    8   18:dup             
	//    9   19:invokespecial   #43  <Method void Intent()>
	//   10   22:astore          5
		Bundle bundle1 = intent1.getBundleExtra("android.remoteinput.resultsData");
	//   11   24:aload           5
	//   12   26:ldc1            #123 <String "android.remoteinput.resultsData">
	//   13   28:invokevirtual   #85  <Method Bundle Intent.getBundleExtra(String)>
	//   14   31:astore          7
		obj = ((Object) (bundle1));
	//   15   33:aload           7
	//   16   35:astore          6
		if(bundle1 == null)
	//*  17   37:aload           7
	//*  18   39:ifnonnull       51
			obj = ((Object) (new Bundle()));
	//   19   42:new             #87  <Class Bundle>
	//   20   45:dup             
	//   21   46:invokespecial   #88  <Method void Bundle()>
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
	//   37   71:invokevirtual   #126 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   38   74:invokevirtual   #130 <Method Object Bundle.get(String)>
	//   39   77:astore          8
			if(obj1 instanceof CharSequence)
	//*  40   79:aload           8
	//*  41   81:instanceof      #132 <Class CharSequence>
	//*  42   84:ifeq            102
				((Bundle) (obj)).putCharSequence(remoteinput.getResultKey(), (CharSequence)obj1);
	//   43   87:aload           6
	//   44   89:aload           7
	//   45   91:invokevirtual   #126 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   46   94:aload           8
	//   47   96:checkcast       #132 <Class CharSequence>
	//   48   99:invokevirtual   #136 <Method void Bundle.putCharSequence(String, CharSequence)>
		}

	//   49  102:iload_3         
	//   50  103:iconst_1        
	//   51  104:iadd            
	//   52  105:istore_3        
	//*  53  106:goto            57
		intent1.putExtra("android.remoteinput.resultsData", ((Bundle) (obj)));
	//   54  109:aload           5
	//   55  111:ldc1            #123 <String "android.remoteinput.resultsData">
	//   56  113:aload           6
	//   57  115:invokevirtual   #105 <Method Intent Intent.putExtra(String, Bundle)>
	//   58  118:pop             
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   59  119:aload_1         
	//   60  120:ldc1            #107 <String "android.remoteinput.results">
	//   61  122:aload           5
	//   62  124:invokestatic    #113 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   63  127:invokevirtual   #117 <Method void Intent.setClipData(ClipData)>
	//   64  130:return          
	}

	static RemoteInputCompatBase.RemoteInput fromBundle(Bundle bundle, RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		Object obj = ((Object) (bundle.getStringArrayList("allowedDataTypes")));
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "allowedDataTypes">
	//    2    3:invokevirtual   #142 <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    6:astore_3        
		HashSet hashset = new HashSet();
	//    4    7:new             #144 <Class HashSet>
	//    5   10:dup             
	//    6   11:invokespecial   #145 <Method void HashSet()>
	//    7   14:astore_2        
		if(obj != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          52
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Set) (hashset)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   10   19:aload_3         
	//   11   20:invokevirtual   #148 <Method Iterator ArrayList.iterator()>
	//   12   23:astore_3        
	//   13   24:aload_3         
	//   14   25:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   15   30:ifeq            52
	//   16   33:aload_2         
	//   17   34:aload_3         
	//   18   35:invokeinterface #65  <Method Object Iterator.next()>
	//   19   40:checkcast       #72  <Class String>
	//   20   43:invokeinterface #152 <Method boolean Set.add(Object)>
	//   21   48:pop             
	//*  22   49:goto            24
		return factory.build(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), bundle.getBundle("extras"), ((Set) (hashset)));
	//   23   52:aload_1         
	//   24   53:aload_0         
	//   25   54:ldc1            #29  <String "resultKey">
	//   26   56:invokevirtual   #155 <Method String Bundle.getString(String)>
	//   27   59:aload_0         
	//   28   60:ldc1            #26  <String "label">
	//   29   62:invokevirtual   #159 <Method CharSequence Bundle.getCharSequence(String)>
	//   30   65:aload_0         
	//   31   66:ldc1            #20  <String "choices">
	//   32   68:invokevirtual   #163 <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   33   71:aload_0         
	//   34   72:ldc1            #17  <String "allowFreeFormInput">
	//   35   74:invokevirtual   #167 <Method boolean Bundle.getBoolean(String)>
	//   36   77:aload_0         
	//   37   78:ldc1            #23  <String "extras">
	//   38   80:invokevirtual   #170 <Method Bundle Bundle.getBundle(String)>
	//   39   83:aload_2         
	//   40   84:invokeinterface #176 <Method RemoteInputCompatBase$RemoteInput RemoteInputCompatBase$RemoteInput$Factory.build(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
	//   41   89:areturn         
	}

	static RemoteInputCompatBase.RemoteInput[] fromBundleArray(Bundle abundle[], RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		if(abundle != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		RemoteInputCompatBase.RemoteInput aremoteinput[] = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
_L4:
		return aremoteinput;
	//    4    6:aload_3         
	//    5    7:areturn         
_L2:
		RemoteInputCompatBase.RemoteInput aremoteinput1[] = factory.newArray(abundle.length);
	//    6    8:aload_1         
	//    7    9:aload_0         
	//    8   10:arraylength     
	//    9   11:invokeinterface #182 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatBase$RemoteInput$Factory.newArray(int)>
	//   10   16:astore          4
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		do
		{
			aremoteinput = aremoteinput1;
	//   13   20:aload           4
	//   14   22:astore_3        
			if(i >= abundle.length)
				continue;
	//   15   23:iload_2         
	//   16   24:aload_0         
	//   17   25:arraylength     
	//   18   26:icmpge          6
			aremoteinput1[i] = fromBundle(abundle[i], factory);
	//   19   29:aload           4
	//   20   31:iload_2         
	//   21   32:aload_0         
	//   22   33:iload_2         
	//   23   34:aaload          
	//   24   35:aload_1         
	//   25   36:invokestatic    #184 <Method RemoteInputCompatBase$RemoteInput fromBundle(Bundle, RemoteInputCompatBase$RemoteInput$Factory)>
	//   26   39:aastore         
			i++;
	//   27   40:iload_2         
	//   28   41:iconst_1        
	//   29   42:iadd            
	//   30   43:istore_2        
		} while(true);
	//   31   44:goto            20
		if(true) goto _L4; else goto _L3
_L3:
	}

	private static Intent getClipDataIntentFromIntent(Intent intent)
	{
		intent = ((Intent) (intent.getClipData()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method ClipData Intent.getClipData()>
	//    2    4:astore_0        
		ClipDescription clipdescription;
		if(intent != null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #192 <Method ClipDescription ClipData.getDescription()>
	//*   9   15:astore_1        
			if((clipdescription = ((ClipData) (intent)).getDescription()).hasMimeType("text/vnd.android.intent") && ((Object) (clipdescription.getLabel())).equals("android.remoteinput.results"))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #194 <String "text/vnd.android.intent">
	//*  12   19:invokevirtual   #199 <Method boolean ClipDescription.hasMimeType(String)>
	//*  13   22:ifeq            9
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #203 <Method CharSequence ClipDescription.getLabel()>
	//*  16   29:ldc1            #107 <String "android.remoteinput.results">
	//*  17   31:invokevirtual   #206 <Method boolean Object.equals(Object)>
	//*  18   34:ifeq            9
				return ((ClipData) (intent)).getItemAt(0).getIntent();
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #210 <Method android.content.ClipData$Item ClipData.getItemAt(int)>
	//   22   42:invokevirtual   #216 <Method Intent android.content.ClipData$Item.getIntent()>
	//   23   45:areturn         
		return null;
	}

	static Map getDataResultsFromIntent(Intent intent, String s)
	{
		intent = getClipDataIntentFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #220 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #221 <Method void HashMap()>
	//   10   18:astore_2        
		Iterator iterator = intent.getExtras().keySet().iterator();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #225 <Method Bundle Intent.getExtras()>
	//   13   23:invokevirtual   #228 <Method Set Bundle.keySet()>
	//   14   26:invokeinterface #55  <Method Iterator Set.iterator()>
	//   15   31:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   16   32:aload_3         
	//   17   33:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            129
			String s2 = (String)iterator.next();
	//   19   41:aload_3         
	//   20   42:invokeinterface #65  <Method Object Iterator.next()>
	//   21   47:checkcast       #72  <Class String>
	//   22   50:astore          5
			if(s2.startsWith("android.remoteinput.dataTypeResultsData"))
	//*  23   52:aload           5
	//*  24   54:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//*  25   56:invokevirtual   #231 <Method boolean String.startsWith(String)>
	//*  26   59:ifeq            32
			{
				String s1 = s2.substring("android.remoteinput.dataTypeResultsData".length());
	//   27   62:aload           5
	//   28   64:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//   29   66:invokevirtual   #235 <Method int String.length()>
	//   30   69:invokevirtual   #239 <Method String String.substring(int)>
	//   31   72:astore          4
				if(s1 != null && !s1.isEmpty())
	//*  32   74:aload           4
	//*  33   76:ifnull          32
	//*  34   79:aload           4
	//*  35   81:invokevirtual   #242 <Method boolean String.isEmpty()>
	//*  36   84:ifne            32
				{
					s2 = intent.getBundleExtra(s2).getString(s);
	//   37   87:aload_0         
	//   38   88:aload           5
	//   39   90:invokevirtual   #85  <Method Bundle Intent.getBundleExtra(String)>
	//   40   93:aload_1         
	//   41   94:invokevirtual   #155 <Method String Bundle.getString(String)>
	//   42   97:astore          5
					if(s2 != null && !s2.isEmpty())
	//*  43   99:aload           5
	//*  44  101:ifnull          32
	//*  45  104:aload           5
	//*  46  106:invokevirtual   #242 <Method boolean String.isEmpty()>
	//*  47  109:ifne            32
						((Map) (hashmap)).put(((Object) (s1)), ((Object) (Uri.parse(s2))));
	//   48  112:aload_2         
	//   49  113:aload           4
	//   50  115:aload           5
	//   51  117:invokestatic    #246 <Method Uri Uri.parse(String)>
	//   52  120:invokeinterface #250 <Method Object Map.put(Object, Object)>
	//   53  125:pop             
				}
			}
		} while(true);
	//   54  126:goto            32
		intent = ((Intent) (hashmap));
	//   55  129:aload_2         
	//   56  130:astore_0        
		if(((Map) (hashmap)).isEmpty())
	//*  57  131:aload_2         
	//*  58  132:invokeinterface #251 <Method boolean Map.isEmpty()>
	//*  59  137:ifeq            142
			intent = null;
	//   60  140:aconst_null     
	//   61  141:astore_0        
		return ((Map) (intent));
	//   62  142:aload_0         
	//   63  143:areturn         
	}

	private static String getExtraResultsKeyForData(String s)
	{
		return (new StringBuilder()).append("android.remoteinput.dataTypeResultsData").append(s).toString();
	//    0    0:new             #254 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #255 <Method void StringBuilder()>
	//    3    7:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//    4    9:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #260 <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	static Bundle getResultsFromIntent(Intent intent)
	{
		intent = getClipDataIntentFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
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
	//    8   12:invokevirtual   #225 <Method Bundle Intent.getExtras()>
	//    9   15:ldc1            #123 <String "android.remoteinput.resultsData">
	//   10   17:invokevirtual   #266 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   20:checkcast       #87  <Class Bundle>
	//   12   23:areturn         
	}

	static Bundle toBundle(RemoteInputCompatBase.RemoteInput remoteinput)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #87  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("resultKey", remoteinput.getResultKey());
	//    4    8:aload_1         
	//    5    9:ldc1            #29  <String "resultKey">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #126 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//    8   15:invokevirtual   #101 <Method void Bundle.putString(String, String)>
		bundle.putCharSequence("label", remoteinput.getLabel());
	//    9   18:aload_1         
	//   10   19:ldc1            #26  <String "label">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #269 <Method CharSequence RemoteInputCompatBase$RemoteInput.getLabel()>
	//   13   25:invokevirtual   #136 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequenceArray("choices", remoteinput.getChoices());
	//   14   28:aload_1         
	//   15   29:ldc1            #20  <String "choices">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #273 <Method CharSequence[] RemoteInputCompatBase$RemoteInput.getChoices()>
	//   18   35:invokevirtual   #277 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
		bundle.putBoolean("allowFreeFormInput", remoteinput.getAllowFreeFormInput());
	//   19   38:aload_1         
	//   20   39:ldc1            #17  <String "allowFreeFormInput">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #280 <Method boolean RemoteInputCompatBase$RemoteInput.getAllowFreeFormInput()>
	//   23   45:invokevirtual   #284 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBundle("extras", remoteinput.getExtras());
	//   24   48:aload_1         
	//   25   49:ldc1            #23  <String "extras">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #285 <Method Bundle RemoteInputCompatBase$RemoteInput.getExtras()>
	//   28   55:invokevirtual   #289 <Method void Bundle.putBundle(String, Bundle)>
		Object obj = ((Object) (remoteinput.getAllowedDataTypes()));
	//   29   58:aload_0         
	//   30   59:invokevirtual   #292 <Method Set RemoteInputCompatBase$RemoteInput.getAllowedDataTypes()>
	//   31   62:astore_2        
		if(obj != null && !((Set) (obj)).isEmpty())
	//*  32   63:aload_2         
	//*  33   64:ifnull          130
	//*  34   67:aload_2         
	//*  35   68:invokeinterface #293 <Method boolean Set.isEmpty()>
	//*  36   73:ifne            130
		{
			remoteinput = ((RemoteInputCompatBase.RemoteInput) (new ArrayList(((Set) (obj)).size())));
	//   37   76:new             #147 <Class ArrayList>
	//   38   79:dup             
	//   39   80:aload_2         
	//   40   81:invokeinterface #296 <Method int Set.size()>
	//   41   86:invokespecial   #299 <Method void ArrayList(int)>
	//   42   89:astore_0        
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ArrayList) (remoteinput)).add(((Object) ((String)((Iterator) (obj)).next()))));
	//   43   90:aload_2         
	//   44   91:invokeinterface #55  <Method Iterator Set.iterator()>
	//   45   96:astore_2        
	//   46   97:aload_2         
	//   47   98:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   48  103:ifeq            123
	//   49  106:aload_0         
	//   50  107:aload_2         
	//   51  108:invokeinterface #65  <Method Object Iterator.next()>
	//   52  113:checkcast       #72  <Class String>
	//   53  116:invokevirtual   #300 <Method boolean ArrayList.add(Object)>
	//   54  119:pop             
	//*  55  120:goto            97
			bundle.putStringArrayList("allowedDataTypes", ((ArrayList) (remoteinput)));
	//   56  123:aload_1         
	//   57  124:ldc1            #14  <String "allowedDataTypes">
	//   58  126:aload_0         
	//   59  127:invokevirtual   #304 <Method void Bundle.putStringArrayList(String, ArrayList)>
		}
		return bundle;
	//   60  130:aload_1         
	//   61  131:areturn         
	}

	static Bundle[] toBundleArray(RemoteInputCompatBase.RemoteInput aremoteinput[])
	{
		if(aremoteinput != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		Bundle abundle[] = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
_L4:
		return abundle;
	//    4    6:aload_2         
	//    5    7:areturn         
_L2:
		Bundle abundle1[] = new Bundle[aremoteinput.length];
	//    6    8:aload_0         
	//    7    9:arraylength     
	//    8   10:anewarray       Bundle[]
	//    9   13:astore_3        
		int i = 0;
	//   10   14:iconst_0        
	//   11   15:istore_1        
		do
		{
			abundle = abundle1;
	//   12   16:aload_3         
	//   13   17:astore_2        
			if(i >= aremoteinput.length)
				continue;
	//   14   18:iload_1         
	//   15   19:aload_0         
	//   16   20:arraylength     
	//   17   21:icmpge          6
			abundle1[i] = toBundle(aremoteinput[i]);
	//   18   24:aload_3         
	//   19   25:iload_1         
	//   20   26:aload_0         
	//   21   27:iload_1         
	//   22   28:aaload          
	//   23   29:invokestatic    #308 <Method Bundle toBundle(RemoteInputCompatBase$RemoteInput)>
	//   24   32:aastore         
			i++;
	//   25   33:iload_1         
	//   26   34:iconst_1        
	//   27   35:iadd            
	//   28   36:istore_1        
		} while(true);
	//   29   37:goto            16
		if(true) goto _L4; else goto _L3
_L3:
	}

	private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
	private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
	private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
	private static final String KEY_CHOICES = "choices";
	private static final String KEY_EXTRAS = "extras";
	private static final String KEY_LABEL = "label";
	private static final String KEY_RESULT_KEY = "resultKey";
}
