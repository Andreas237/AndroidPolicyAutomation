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
		Intent intent1 = getClipDataIntentFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore_3        
		if(intent1 == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       143
			intent1 = new Intent();
	//    5    9:new             #42  <Class Intent>
	//    6   12:dup             
	//    7   13:invokespecial   #43  <Method void Intent()>
	//    8   16:astore_3        
		Iterator iterator = map.entrySet().iterator();
	//    9   17:aload_2         
	//   10   18:invokeinterface #49  <Method Set Map.entrySet()>
	//   11   23:invokeinterface #55  <Method Iterator Set.iterator()>
	//   12   28:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   30:aload           5
	//   14   32:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            132
			map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//   16   40:aload           5
	//   17   42:invokeinterface #65  <Method Object Iterator.next()>
	//   18   47:checkcast       #67  <Class java.util.Map$Entry>
	//   19   50:astore_2        
			String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   20   51:aload_2         
	//   21   52:invokeinterface #70  <Method Object java.util.Map$Entry.getKey()>
	//   22   57:checkcast       #72  <Class String>
	//   23   60:astore          6
			Uri uri = (Uri)((java.util.Map.Entry) (map)).getValue();
	//   24   62:aload_2         
	//   25   63:invokeinterface #75  <Method Object java.util.Map$Entry.getValue()>
	//   26   68:checkcast       #77  <Class Uri>
	//   27   71:astore          7
			if(s != null)
	//*  28   73:aload           6
	//*  29   75:ifnull          30
			{
				Bundle bundle = intent1.getBundleExtra(getExtraResultsKeyForData(s));
	//   30   78:aload_3         
	//   31   79:aload           6
	//   32   81:invokestatic    #81  <Method String getExtraResultsKeyForData(String)>
	//   33   84:invokevirtual   #85  <Method Bundle Intent.getBundleExtra(String)>
	//   34   87:astore          4
				map = ((Map) (bundle));
	//   35   89:aload           4
	//   36   91:astore_2        
				if(bundle == null)
	//*  37   92:aload           4
	//*  38   94:ifnonnull       105
					map = ((Map) (new Bundle()));
	//   39   97:new             #87  <Class Bundle>
	//   40  100:dup             
	//   41  101:invokespecial   #88  <Method void Bundle()>
	//   42  104:astore_2        
				((Bundle) (map)).putString(remoteinput.getResultKey(), uri.toString());
	//   43  105:aload_2         
	//   44  106:aload_0         
	//   45  107:invokevirtual   #94  <Method String RemoteInput.getResultKey()>
	//   46  110:aload           7
	//   47  112:invokevirtual   #97  <Method String Uri.toString()>
	//   48  115:invokevirtual   #101 <Method void Bundle.putString(String, String)>
				intent1.putExtra(getExtraResultsKeyForData(s), ((Bundle) (map)));
	//   49  118:aload_3         
	//   50  119:aload           6
	//   51  121:invokestatic    #81  <Method String getExtraResultsKeyForData(String)>
	//   52  124:aload_2         
	//   53  125:invokevirtual   #105 <Method Intent Intent.putExtra(String, Bundle)>
	//   54  128:pop             
			}
		} while(true);
	//   55  129:goto            30
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   56  132:aload_1         
	//   57  133:ldc1            #107 <String "android.remoteinput.results">
	//   58  135:aload_3         
	//   59  136:invokestatic    #113 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   60  139:invokevirtual   #117 <Method void Intent.setClipData(ClipData)>
	//   61  142:return          
	//*  62  143:goto            17
	}

	static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		Intent intent1 = getClipDataIntentFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore          5
		if(intent1 == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       126
			intent1 = new Intent();
	//    5   11:new             #42  <Class Intent>
	//    6   14:dup             
	//    7   15:invokespecial   #43  <Method void Intent()>
	//    8   18:astore          5
		Bundle bundle1 = intent1.getBundleExtra("android.remoteinput.resultsData");
	//    9   20:aload           5
	//   10   22:ldc1            #123 <String "android.remoteinput.resultsData">
	//   11   24:invokevirtual   #85  <Method Bundle Intent.getBundleExtra(String)>
	//   12   27:astore          6
		if(bundle1 == null)
	//*  13   29:aload           6
	//*  14   31:ifnonnull       123
			bundle1 = new Bundle();
	//   15   34:new             #87  <Class Bundle>
	//   16   37:dup             
	//   17   38:invokespecial   #88  <Method void Bundle()>
	//   18   41:astore          6
		int j = aremoteinput.length;
	//   19   43:aload_0         
	//   20   44:arraylength     
	//   21   45:istore          4
		for(int i = 0; i < j; i++)
	//*  22   47:iconst_0        
	//*  23   48:istore_3        
	//*  24   49:iload_3         
	//*  25   50:iload           4
	//*  26   52:icmpge          101
		{
			RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
	//   27   55:aload_0         
	//   28   56:iload_3         
	//   29   57:aaload          
	//   30   58:astore          7
			Object obj = bundle.get(remoteinput.getResultKey());
	//   31   60:aload_2         
	//   32   61:aload           7
	//   33   63:invokevirtual   #126 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   34   66:invokevirtual   #130 <Method Object Bundle.get(String)>
	//   35   69:astore          8
			if(obj instanceof CharSequence)
	//*  36   71:aload           8
	//*  37   73:instanceof      #132 <Class CharSequence>
	//*  38   76:ifeq            94
				bundle1.putCharSequence(remoteinput.getResultKey(), (CharSequence)obj);
	//   39   79:aload           6
	//   40   81:aload           7
	//   41   83:invokevirtual   #126 <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   42   86:aload           8
	//   43   88:checkcast       #132 <Class CharSequence>
	//   44   91:invokevirtual   #136 <Method void Bundle.putCharSequence(String, CharSequence)>
		}

	//   45   94:iload_3         
	//   46   95:iconst_1        
	//   47   96:iadd            
	//   48   97:istore_3        
	//*  49   98:goto            49
		intent1.putExtra("android.remoteinput.resultsData", bundle1);
	//   50  101:aload           5
	//   51  103:ldc1            #123 <String "android.remoteinput.resultsData">
	//   52  105:aload           6
	//   53  107:invokevirtual   #105 <Method Intent Intent.putExtra(String, Bundle)>
	//   54  110:pop             
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   55  111:aload_1         
	//   56  112:ldc1            #107 <String "android.remoteinput.results">
	//   57  114:aload           5
	//   58  116:invokestatic    #113 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   59  119:invokevirtual   #117 <Method void Intent.setClipData(ClipData)>
	//   60  122:return          
	//*  61  123:goto            43
	//*  62  126:goto            20
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
	//    7    9:invokeinterface #182 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatBase$RemoteInput$Factory.newArray(int)>
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
	//   21   29:invokestatic    #184 <Method RemoteInputCompatBase$RemoteInput fromBundle(Bundle, RemoteInputCompatBase$RemoteInput$Factory)>
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
		Intent intent1 = getClipDataIntentFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore_2        
		if(intent1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		intent = ((Intent) (new HashMap()));
	//    7   11:new             #220 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #221 <Method void HashMap()>
	//   10   18:astore_0        
		Iterator iterator = intent1.getExtras().keySet().iterator();
	//   11   19:aload_2         
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
					s2 = intent1.getBundleExtra(s2).getString(s);
	//   37   87:aload_2         
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
						((Map) (intent)).put(((Object) (s1)), ((Object) (Uri.parse(s2))));
	//   48  112:aload_0         
	//   49  113:aload           4
	//   50  115:aload           5
	//   51  117:invokestatic    #246 <Method Uri Uri.parse(String)>
	//   52  120:invokeinterface #250 <Method Object Map.put(Object, Object)>
	//   53  125:pop             
				}
			}
		} while(true);
	//   54  126:goto            32
		if(((Map) (intent)).isEmpty())
	//*  55  129:aload_0         
	//*  56  130:invokeinterface #251 <Method boolean Map.isEmpty()>
	//*  57  135:ifeq            142
			intent = null;
	//   58  138:aconst_null     
	//   59  139:astore_0        
		return ((Map) (intent));
	//   60  140:aload_0         
	//   61  141:areturn         
	//*  62  142:goto            140
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
	//   19   25:invokestatic    #308 <Method Bundle toBundle(RemoteInputCompatBase$RemoteInput)>
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
	private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
	private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
	private static final String KEY_CHOICES = "choices";
	private static final String KEY_EXTRAS = "extras";
	private static final String KEY_LABEL = "label";
	private static final String KEY_RESULT_KEY = "resultKey";
}
