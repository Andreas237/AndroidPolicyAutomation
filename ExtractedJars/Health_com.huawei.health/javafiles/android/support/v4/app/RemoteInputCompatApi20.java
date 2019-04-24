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
	//   17   42:ifeq            140
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
	//*  31   80:ifnonnull       86
	//*  32   83:goto            35
			{
				Bundle bundle = intent1.getBundleExtra(getExtraResultsKeyForData(s));
	//   33   86:aload_3         
	//   34   87:aload           6
	//   35   89:invokestatic    #63  <Method String getExtraResultsKeyForData(String)>
	//   36   92:invokevirtual   #67  <Method Bundle Intent.getBundleExtra(String)>
	//   37   95:astore          4
				map = ((Map) (bundle));
	//   38   97:aload           4
	//   39   99:astore_2        
				if(bundle == null)
	//*  40  100:aload           4
	//*  41  102:ifnonnull       113
					map = ((Map) (new Bundle()));
	//   42  105:new             #69  <Class Bundle>
	//   43  108:dup             
	//   44  109:invokespecial   #70  <Method void Bundle()>
	//   45  112:astore_2        
				((Bundle) (map)).putString(remoteinput.getResultKey(), uri.toString());
	//   46  113:aload_2         
	//   47  114:aload_0         
	//   48  115:invokevirtual   #76  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   49  118:aload           7
	//   50  120:invokevirtual   #79  <Method String Uri.toString()>
	//   51  123:invokevirtual   #83  <Method void Bundle.putString(String, String)>
				intent1.putExtra(getExtraResultsKeyForData(s), ((Bundle) (map)));
	//   52  126:aload_3         
	//   53  127:aload           6
	//   54  129:invokestatic    #63  <Method String getExtraResultsKeyForData(String)>
	//   55  132:aload_2         
	//   56  133:invokevirtual   #87  <Method Intent Intent.putExtra(String, Bundle)>
	//   57  136:pop             
			}
		} while(true);
	//   58  137:goto            35
		intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   59  140:aload_1         
	//   60  141:ldc1            #89  <String "android.remoteinput.results">
	//   61  143:aload_3         
	//   62  144:invokestatic    #95  <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   63  147:invokevirtual   #99  <Method void Intent.setClipData(ClipData)>
	//   64  150:return          
	}

	static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		Bundle bundle1 = getResultsFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #107 <Method Bundle getResultsFromIntent(Intent)>
	//    2    4:astore          5
		if(bundle1 != null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       14
	//*   5   11:goto            23
		{
			bundle1.putAll(bundle);
	//    6   14:aload           5
	//    7   16:aload_2         
	//    8   17:invokevirtual   #111 <Method void Bundle.putAll(Bundle)>
			bundle = bundle1;
	//    9   20:aload           5
	//   10   22:astore_2        
		}
		int j = aremoteinput.length;
	//   11   23:aload_0         
	//   12   24:arraylength     
	//   13   25:istore          4
		for(int i = 0; i < j; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_3        
	//*  16   29:iload_3         
	//*  17   30:iload           4
	//*  18   32:icmpge          88
		{
			RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:aaload          
	//   22   38:astore          5
			Map map = getDataResultsFromIntent(intent, remoteinput.getResultKey());
	//   23   40:aload_1         
	//   24   41:aload           5
	//   25   43:invokevirtual   #76  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   26   46:invokestatic    #115 <Method Map getDataResultsFromIntent(Intent, String)>
	//   27   49:astore          6
			RemoteInput.addResultsToIntent(fromCompat(new RemoteInputCompatBase.RemoteInput[] {
				remoteinput
			}), intent, bundle);
	//   28   51:iconst_1        
	//   29   52:anewarray       RemoteInputCompatBase.RemoteInput[]
	//   30   55:dup             
	//   31   56:iconst_0        
	//   32   57:aload           5
	//   33   59:aastore         
	//   34   60:invokestatic    #119 <Method RemoteInput[] fromCompat(RemoteInputCompatBase$RemoteInput[])>
	//   35   63:aload_1         
	//   36   64:aload_2         
	//   37   65:invokestatic    #124 <Method void RemoteInput.addResultsToIntent(RemoteInput[], Intent, Bundle)>
			if(map != null)
	//*  38   68:aload           6
	//*  39   70:ifnull          81
				addDataResultToIntent(remoteinput, intent, map);
	//   40   73:aload           5
	//   41   75:aload_1         
	//   42   76:aload           6
	//   43   78:invokestatic    #126 <Method void addDataResultToIntent(RemoteInputCompatBase$RemoteInput, Intent, Map)>
		}

	//   44   81:iload_3         
	//   45   82:iconst_1        
	//   46   83:iadd            
	//   47   84:istore_3        
	//*  48   85:goto            29
	//   49   88:return          
	}

	static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput aremoteinput[])
	{
		if(aremoteinput == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		RemoteInput aremoteinput1[] = new RemoteInput[aremoteinput.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       RemoteInput[]
	//    7   11:astore_2        
		for(int i = 0; i < aremoteinput.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          76
		{
			RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
	//   14   20:aload_0         
	//   15   21:iload_1         
	//   16   22:aaload          
	//   17   23:astore_3        
			aremoteinput1[i] = (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
	//   18   24:aload_2         
	//   19   25:iload_1         
	//   20   26:new             #128 <Class android.app.RemoteInput$Builder>
	//   21   29:dup             
	//   22   30:aload_3         
	//   23   31:invokevirtual   #76  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//   24   34:invokespecial   #131 <Method void android.app.RemoteInput$Builder(String)>
	//   25   37:aload_3         
	//   26   38:invokevirtual   #135 <Method CharSequence RemoteInputCompatBase$RemoteInput.getLabel()>
	//   27   41:invokevirtual   #139 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//   28   44:aload_3         
	//   29   45:invokevirtual   #143 <Method CharSequence[] RemoteInputCompatBase$RemoteInput.getChoices()>
	//   30   48:invokevirtual   #147 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   31   51:aload_3         
	//   32   52:invokevirtual   #150 <Method boolean RemoteInputCompatBase$RemoteInput.getAllowFreeFormInput()>
	//   33   55:invokevirtual   #154 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   34   58:aload_3         
	//   35   59:invokevirtual   #158 <Method Bundle RemoteInputCompatBase$RemoteInput.getExtras()>
	//   36   62:invokevirtual   #162 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   37   65:invokevirtual   #166 <Method RemoteInput android.app.RemoteInput$Builder.build()>
	//   38   68:aastore         
		}

	//   39   69:iload_1         
	//   40   70:iconst_1        
	//   41   71:iadd            
	//   42   72:istore_1        
	//*  43   73:goto            14
		return aremoteinput1;
	//   44   76:aload_2         
	//   45   77:areturn         
	}

	private static Intent getClipDataIntentFromIntent(Intent intent)
	{
		intent = ((Intent) (intent.getClipData()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method ClipData Intent.getClipData()>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		ClipDescription clipdescription = ((ClipData) (intent)).getDescription();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #174 <Method ClipDescription ClipData.getDescription()>
	//    9   15:astore_1        
		if(!clipdescription.hasMimeType("text/vnd.android.intent"))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #176 <String "text/vnd.android.intent">
	//*  12   19:invokevirtual   #182 <Method boolean ClipDescription.hasMimeType(String)>
	//*  13   22:ifne            27
			return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
		if(!((Object) (clipdescription.getLabel())).equals("android.remoteinput.results"))
	//*  16   27:aload_1         
	//*  17   28:invokevirtual   #183 <Method CharSequence ClipDescription.getLabel()>
	//*  18   31:ldc1            #89  <String "android.remoteinput.results">
	//*  19   33:invokevirtual   #187 <Method boolean Object.equals(Object)>
	//*  20   36:ifne            41
			return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
		else
			return ((ClipData) (intent)).getItemAt(0).getIntent();
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #191 <Method android.content.ClipData$Item ClipData.getItemAt(int)>
	//   26   46:invokevirtual   #197 <Method Intent android.content.ClipData$Item.getIntent()>
	//   27   49:areturn         
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
	//   18   38:ifeq            135
			String s2 = (String)iterator.next();
	//   19   41:aload_3         
	//   20   42:invokeinterface #47  <Method Object Iterator.next()>
	//   21   47:checkcast       #54  <Class String>
	//   22   50:astore          5
			if(s2.startsWith("android.remoteinput.dataTypeResultsData"))
	//*  23   52:aload           5
	//*  24   54:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//*  25   56:invokevirtual   #207 <Method boolean String.startsWith(String)>
	//*  26   59:ifeq            132
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
	//*  36   84:ifeq            90
	//*  37   87:goto            32
				{
					s2 = intent.getBundleExtra(s2).getString(s);
	//   38   90:aload_0         
	//   39   91:aload           5
	//   40   93:invokevirtual   #67  <Method Bundle Intent.getBundleExtra(String)>
	//   41   96:aload_1         
	//   42   97:invokevirtual   #221 <Method String Bundle.getString(String)>
	//   43  100:astore          5
					if(s2 != null && !s2.isEmpty())
	//*  44  102:aload           5
	//*  45  104:ifnull          32
	//*  46  107:aload           5
	//*  47  109:invokevirtual   #218 <Method boolean String.isEmpty()>
	//*  48  112:ifeq            118
	//*  49  115:goto            32
						((Map) (hashmap)).put(((Object) (s1)), ((Object) (Uri.parse(s2))));
	//   50  118:aload_2         
	//   51  119:aload           4
	//   52  121:aload           5
	//   53  123:invokestatic    #225 <Method Uri Uri.parse(String)>
	//   54  126:invokeinterface #229 <Method Object Map.put(Object, Object)>
	//   55  131:pop             
				}
			}
		} while(true);
	//   56  132:goto            32
		if(((Map) (hashmap)).isEmpty())
	//*  57  135:aload_2         
	//*  58  136:invokeinterface #230 <Method boolean Map.isEmpty()>
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
