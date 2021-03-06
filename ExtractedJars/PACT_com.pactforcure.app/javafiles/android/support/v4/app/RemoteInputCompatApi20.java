// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.RemoteInput;
import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import java.util.*;

class RemoteInputCompatApi20
{

	RemoteInputCompatApi20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static void addDataResultToIntent(RemoteInputCompatBase.RemoteInput remoteinput, Intent intent, Map map)
	{
		Intent intent2 = getClipDataIntentFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore          4
		Intent intent1 = intent2;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(intent2 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       22
			intent1 = new Intent();
	//    7   14:new             #24  <Class Intent>
	//    8   17:dup             
	//    9   18:invokespecial   #25  <Method void Intent()>
	//   10   21:astore_3        
		Iterator iterator = map.entrySet().iterator();
	//   11   22:aload_2         
	//   12   23:invokeinterface #31  <Method Set Map.entrySet()>
	//   13   28:invokeinterface #37  <Method Iterator Set.iterator()>
	//   14   33:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   35:aload           5
	//   16   37:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            137
			map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//   18   45:aload           5
	//   19   47:invokeinterface #47  <Method Object Iterator.next()>
	//   20   52:checkcast       #49  <Class java.util.Map$Entry>
	//   21   55:astore_2        
			String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   22   56:aload_2         
	//   23   57:invokeinterface #52  <Method Object java.util.Map$Entry.getKey()>
	//   24   62:checkcast       #54  <Class String>
	//   25   65:astore          6
			Uri uri = (Uri)((java.util.Map.Entry) (map)).getValue();
	//   26   67:aload_2         
	//   27   68:invokeinterface #57  <Method Object java.util.Map$Entry.getValue()>
	//   28   73:checkcast       #59  <Class Uri>
	//   29   76:astore          7
			if(s != null)
	//*  30   78:aload           6
	//*  31   80:ifnull          35
			{
				Bundle bundle = intent1.getBundleExtra(getExtraResultsKeyForData(s));
	//   32   83:aload_3         
	//   33   84:aload           6
	//   34   86:invokestatic    #63  <Method String getExtraResultsKeyForData(String)>
	//   35   89:invokevirtual   #67  <Method Bundle Intent.getBundleExtra(String)>
	//   36   92:astore          4
				map = ((Map) (bundle));
	//   37   94:aload           4
	//   38   96:astore_2        
				if(bundle == null)
	//*  39   97:aload           4
	//*  40   99:ifnonnull       110
					map = ((Map) (new Bundle()));
	//   41  102:new             #69  <Class Bundle>
	//   42  105:dup             
	//   43  106:invokespecial   #70  <Method void Bundle()>
	//   44  109:astore_2        
				((Bundle) (map)).putString(remoteinput.getResultKey(), uri.toString());
	//   45  110:aload_2         
	//   46  111:aload_0         
	//   47  112:invokevirtual   #76  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   48  115:aload           7
	//   49  117:invokevirtual   #79  <Method String Uri.toString()>
	//   50  120:invokevirtual   #83  <Method void Bundle.putString(String, String)>
				intent1.putExtra(getExtraResultsKeyForData(s), ((Bundle) (map)));
	//   51  123:aload_3         
	//   52  124:aload           6
	//   53  126:invokestatic    #63  <Method String getExtraResultsKeyForData(String)>
	//   54  129:aload_2         
	//   55  130:invokevirtual   #87  <Method Intent Intent.putExtra(String, Bundle)>
	//   56  133:pop             
			}
		} while(true);
	//   57  134:goto            35
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   58  137:aload_1         
	//   59  138:ldc1            #89  <String "android.remoteinput.results">
	//   60  140:aload_3         
	//   61  141:invokestatic    #95  <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   62  144:invokevirtual   #99  <Method void Intent.setClipData(ClipData)>
	//   63  147:return          
	}

	static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		Object obj = ((Object) (getResultsFromIntent(intent)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #107 <Method Bundle getResultsFromIntent(Intent)>
	//    2    4:astore          5
		int j;
		if(obj != null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       76
	//*   5   11:aload_0         
	//*   6   12:arraylength     
	//*   7   13:istore          4
	//*   8   15:iconst_0        
	//*   9   16:istore_3        
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          88
	//*  13   23:aload_0         
	//*  14   24:iload_3         
	//*  15   25:aaload          
	//*  16   26:astore          5
	//*  17   28:aload_1         
	//*  18   29:aload           5
	//*  19   31:invokevirtual   #76  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//*  20   34:invokestatic    #111 <Method Map getDataResultsFromIntent(Intent, String)>
	//*  21   37:astore          6
	//*  22   39:iconst_1        
	//*  23   40:anewarray       RemoteInputCompatBase.RemoteInput[]
	//*  24   43:dup             
	//*  25   44:iconst_0        
	//*  26   45:aload           5
	//*  27   47:aastore         
	//*  28   48:invokestatic    #115 <Method RemoteInput[] fromCompat(RemoteInputCompatBase$RemoteInput[])>
	//*  29   51:aload_1         
	//*  30   52:aload_2         
	//*  31   53:invokestatic    #120 <Method void RemoteInput.addResultsToIntent(RemoteInput[], Intent, Bundle)>
	//*  32   56:aload           6
	//*  33   58:ifnull          69
	//*  34   61:aload           5
	//*  35   63:aload_1         
	//*  36   64:aload           6
	//*  37   66:invokestatic    #122 <Method void addDataResultToIntent(RemoteInputCompatBase$RemoteInput, Intent, Map)>
	//*  38   69:iload_3         
	//*  39   70:iconst_1        
	//*  40   71:iadd            
	//*  41   72:istore_3        
	//*  42   73:goto            17
		{
			((Bundle) (obj)).putAll(bundle);
	//   43   76:aload           5
	//   44   78:aload_2         
	//   45   79:invokevirtual   #126 <Method void Bundle.putAll(Bundle)>
			bundle = ((Bundle) (obj));
	//   46   82:aload           5
	//   47   84:astore_2        
		}
		j = aremoteinput.length;
		for(int i = 0; i < j; i++)
		{
			obj = ((Object) (aremoteinput[i]));
			Map map = getDataResultsFromIntent(intent, ((RemoteInputCompatBase.RemoteInput) (obj)).getResultKey());
			RemoteInput.addResultsToIntent(fromCompat(new RemoteInputCompatBase.RemoteInput[] {
				obj
			}), intent, bundle);
			if(map != null)
				addDataResultToIntent(((RemoteInputCompatBase.RemoteInput) (obj)), intent, map);
		}

	//*  48   85:goto            11
	//   49   88:return          
	}

	static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput aremoteinput[])
	{
		if(aremoteinput != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		RemoteInput aremoteinput1[] = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
_L4:
		return aremoteinput1;
	//    4    6:aload_2         
	//    5    7:areturn         
_L2:
		RemoteInput aremoteinput2[] = new RemoteInput[aremoteinput.length];
	//    6    8:aload_0         
	//    7    9:arraylength     
	//    8   10:anewarray       RemoteInput[]
	//    9   13:astore_3        
		int i = 0;
	//   10   14:iconst_0        
	//   11   15:istore_1        
		do
		{
			aremoteinput1 = aremoteinput2;
	//   12   16:aload_3         
	//   13   17:astore_2        
			if(i >= aremoteinput.length)
				continue;
	//   14   18:iload_1         
	//   15   19:aload_0         
	//   16   20:arraylength     
	//   17   21:icmpge          6
			RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
	//   18   24:aload_0         
	//   19   25:iload_1         
	//   20   26:aaload          
	//   21   27:astore_2        
			aremoteinput2[i] = (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
	//   22   28:aload_3         
	//   23   29:iload_1         
	//   24   30:new             #128 <Class android.app.RemoteInput$Builder>
	//   25   33:dup             
	//   26   34:aload_2         
	//   27   35:invokevirtual   #76  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   28   38:invokespecial   #131 <Method void android.app.RemoteInput$Builder(String)>
	//   29   41:aload_2         
	//   30   42:invokevirtual   #135 <Method CharSequence RemoteInputCompatBase$RemoteInput.getLabel()>
	//   31   45:invokevirtual   #139 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//   32   48:aload_2         
	//   33   49:invokevirtual   #143 <Method CharSequence[] RemoteInputCompatBase$RemoteInput.getChoices()>
	//   34   52:invokevirtual   #147 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   35   55:aload_2         
	//   36   56:invokevirtual   #150 <Method boolean RemoteInputCompatBase$RemoteInput.getAllowFreeFormInput()>
	//   37   59:invokevirtual   #154 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   38   62:aload_2         
	//   39   63:invokevirtual   #158 <Method Bundle RemoteInputCompatBase$RemoteInput.getExtras()>
	//   40   66:invokevirtual   #162 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   41   69:invokevirtual   #166 <Method RemoteInput android.app.RemoteInput$Builder.build()>
	//   42   72:aastore         
			i++;
	//   43   73:iload_1         
	//   44   74:iconst_1        
	//   45   75:iadd            
	//   46   76:istore_1        
		} while(true);
	//   47   77:goto            16
		if(true) goto _L4; else goto _L3
_L3:
	}

	private static Intent getClipDataIntentFromIntent(Intent intent)
	{
		intent = ((Intent) (intent.getClipData()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method ClipData Intent.getClipData()>
	//    2    4:astore_0        
		ClipDescription clipdescription;
		if(intent != null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #174 <Method ClipDescription ClipData.getDescription()>
	//*   9   15:astore_1        
			if((clipdescription = ((ClipData) (intent)).getDescription()).hasMimeType("text/vnd.android.intent") && ((Object) (clipdescription.getLabel())).equals("android.remoteinput.results"))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #176 <String "text/vnd.android.intent">
	//*  12   19:invokevirtual   #182 <Method boolean ClipDescription.hasMimeType(String)>
	//*  13   22:ifeq            9
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #183 <Method CharSequence ClipDescription.getLabel()>
	//*  16   29:ldc1            #89  <String "android.remoteinput.results">
	//*  17   31:invokevirtual   #187 <Method boolean Object.equals(Object)>
	//*  18   34:ifeq            9
				return ((ClipData) (intent)).getItemAt(0).getIntent();
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #191 <Method android.content.ClipData$Item ClipData.getItemAt(int)>
	//   22   42:invokevirtual   #197 <Method Intent android.content.ClipData$Item.getIntent()>
	//   23   45:areturn         
		return null;
	}

	static Map getDataResultsFromIntent(Intent intent, String s)
	{
		intent = getClipDataIntentFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method Intent getClipDataIntentFromIntent(Intent)>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #199 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #200 <Method void HashMap()>
	//   10   18:astore_2        
		Iterator iterator = intent.getExtras().keySet().iterator();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #201 <Method Bundle Intent.getExtras()>
	//   13   23:invokevirtual   #204 <Method Set Bundle.keySet()>
	//   14   26:invokeinterface #37  <Method Iterator Set.iterator()>
	//   15   31:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   16   32:aload_3         
	//   17   33:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            129
			String s2 = (String)iterator.next();
	//   19   41:aload_3         
	//   20   42:invokeinterface #47  <Method Object Iterator.next()>
	//   21   47:checkcast       #54  <Class String>
	//   22   50:astore          5
			if(s2.startsWith("android.remoteinput.dataTypeResultsData"))
	//*  23   52:aload           5
	//*  24   54:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//*  25   56:invokevirtual   #207 <Method boolean String.startsWith(String)>
	//*  26   59:ifeq            32
			{
				String s1 = s2.substring("android.remoteinput.dataTypeResultsData".length());
	//   27   62:aload           5
	//   28   64:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//   29   66:invokevirtual   #211 <Method int String.length()>
	//   30   69:invokevirtual   #215 <Method String String.substring(int)>
	//   31   72:astore          4
				if(s1 != null && !s1.isEmpty())
	//*  32   74:aload           4
	//*  33   76:ifnull          32
	//*  34   79:aload           4
	//*  35   81:invokevirtual   #218 <Method boolean String.isEmpty()>
	//*  36   84:ifne            32
				{
					s2 = intent.getBundleExtra(s2).getString(s);
	//   37   87:aload_0         
	//   38   88:aload           5
	//   39   90:invokevirtual   #67  <Method Bundle Intent.getBundleExtra(String)>
	//   40   93:aload_1         
	//   41   94:invokevirtual   #221 <Method String Bundle.getString(String)>
	//   42   97:astore          5
					if(s2 != null && !s2.isEmpty())
	//*  43   99:aload           5
	//*  44  101:ifnull          32
	//*  45  104:aload           5
	//*  46  106:invokevirtual   #218 <Method boolean String.isEmpty()>
	//*  47  109:ifne            32
						((Map) (hashmap)).put(((Object) (s1)), ((Object) (Uri.parse(s2))));
	//   48  112:aload_2         
	//   49  113:aload           4
	//   50  115:aload           5
	//   51  117:invokestatic    #225 <Method Uri Uri.parse(String)>
	//   52  120:invokeinterface #229 <Method Object Map.put(Object, Object)>
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
	//*  58  132:invokeinterface #230 <Method boolean Map.isEmpty()>
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
	//    0    0:new             #233 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #234 <Method void StringBuilder()>
	//    3    7:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//    4    9:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #239 <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	static Bundle getResultsFromIntent(Intent intent)
	{
		return RemoteInput.getResultsFromIntent(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #240 <Method Bundle RemoteInput.getResultsFromIntent(Intent)>
	//    2    4:areturn         
	}

	static RemoteInputCompatBase.RemoteInput[] toCompat(RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		if(aremoteinput == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		RemoteInputCompatBase.RemoteInput aremoteinput1[] = factory.newArray(aremoteinput.length);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:arraylength     
	//    7    9:invokeinterface #248 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatBase$RemoteInput$Factory.newArray(int)>
	//    8   14:astore_3        
		for(int i = 0; i < aremoteinput.length; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:aload_0         
	//*  13   19:arraylength     
	//*  14   20:icmpge          70
		{
			RemoteInput remoteinput = aremoteinput[i];
	//   15   23:aload_0         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:astore          4
			aremoteinput1[i] = factory.build(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras(), ((Set) (null)));
	//   19   28:aload_3         
	//   20   29:iload_2         
	//   21   30:aload_1         
	//   22   31:aload           4
	//   23   33:invokevirtual   #249 <Method String RemoteInput.getResultKey()>
	//   24   36:aload           4
	//   25   38:invokevirtual   #250 <Method CharSequence RemoteInput.getLabel()>
	//   26   41:aload           4
	//   27   43:invokevirtual   #251 <Method CharSequence[] RemoteInput.getChoices()>
	//   28   46:aload           4
	//   29   48:invokevirtual   #252 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//   30   51:aload           4
	//   31   53:invokevirtual   #253 <Method Bundle RemoteInput.getExtras()>
	//   32   56:aconst_null     
	//   33   57:invokeinterface #256 <Method RemoteInputCompatBase$RemoteInput RemoteInputCompatBase$RemoteInput$Factory.build(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
	//   34   62:aastore         
		}

	//   35   63:iload_2         
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:istore_2        
	//*  39   67:goto            17
		return aremoteinput1;
	//   40   70:aload_3         
	//   41   71:areturn         
	}

	private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
}
