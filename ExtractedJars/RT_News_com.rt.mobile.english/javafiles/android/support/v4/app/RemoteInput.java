// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class RemoteInput
{
	public static final class Builder
	{

		public Builder addExtras(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				mExtras.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field Bundle mExtras>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #52  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public RemoteInput build()
		{
			return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormTextInput, mExtras, mAllowedDataTypes);
		//    0    0:new             #6   <Class RemoteInput>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #45  <Field String mResultKey>
		//    4    8:aload_0         
		//    5    9:getfield        #56  <Field CharSequence mLabel>
		//    6   12:aload_0         
		//    7   13:getfield        #58  <Field CharSequence[] mChoices>
		//    8   16:aload_0         
		//    9   17:getfield        #27  <Field boolean mAllowFreeFormTextInput>
		//   10   20:aload_0         
		//   11   21:getfield        #32  <Field Bundle mExtras>
		//   12   24:aload_0         
		//   13   25:getfield        #37  <Field Set mAllowedDataTypes>
		//   14   28:invokespecial   #61  <Method void RemoteInput(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
		//   15   31:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public Builder setAllowDataType(String s, boolean flag)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            17
			{
				mAllowedDataTypes.add(((Object) (s)));
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field Set mAllowedDataTypes>
		//    4    8:aload_1         
		//    5    9:invokeinterface #71  <Method boolean Set.add(Object)>
		//    6   14:pop             
				return this;
		//    7   15:aload_0         
		//    8   16:areturn         
			} else
			{
				mAllowedDataTypes.remove(((Object) (s)));
		//    9   17:aload_0         
		//   10   18:getfield        #37  <Field Set mAllowedDataTypes>
		//   11   21:aload_1         
		//   12   22:invokeinterface #74  <Method boolean Set.remove(Object)>
		//   13   27:pop             
				return this;
		//   14   28:aload_0         
		//   15   29:areturn         
			}
		}

		public Builder setAllowFreeFormInput(boolean flag)
		{
			mAllowFreeFormTextInput = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field boolean mAllowFreeFormTextInput>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setChoices(CharSequence acharsequence[])
		{
			mChoices = acharsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field CharSequence[] mChoices>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLabel(CharSequence charsequence)
		{
			mLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field CharSequence mLabel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean mAllowFreeFormTextInput;
		private final Set mAllowedDataTypes = new HashSet();
		private CharSequence mChoices[];
		private Bundle mExtras;
		private CharSequence mLabel;
		private final String mResultKey;

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mAllowFreeFormTextInput = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #27  <Field boolean mAllowFreeFormTextInput>
			mExtras = new Bundle();
		//    5    9:aload_0         
		//    6   10:new             #29  <Class Bundle>
		//    7   13:dup             
		//    8   14:invokespecial   #30  <Method void Bundle()>
		//    9   17:putfield        #32  <Field Bundle mExtras>
		//   10   20:aload_0         
		//   11   21:new             #34  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #35  <Method void HashSet()>
		//   14   28:putfield        #37  <Field Set mAllowedDataTypes>
			if(s == null)
		//*  15   31:aload_1         
		//*  16   32:ifnonnull       45
			{
				throw new IllegalArgumentException("Result key can't be null");
		//   17   35:new             #39  <Class IllegalArgumentException>
		//   18   38:dup             
		//   19   39:ldc1            #41  <String "Result key can't be null">
		//   20   41:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   21   44:athrow          
			} else
			{
				mResultKey = s;
		//   22   45:aload_0         
		//   23   46:aload_1         
		//   24   47:putfield        #45  <Field String mResultKey>
				return;
		//   25   50:return          
			}
		}
	}


	RemoteInput(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mResultKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String mResultKey>
		mLabel = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field CharSequence mLabel>
		mChoices = acharsequence;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field CharSequence[] mChoices>
		mAllowFreeFormTextInput = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #45  <Field boolean mAllowFreeFormTextInput>
		mExtras = bundle;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #47  <Field Bundle mExtras>
		mAllowedDataTypes = set;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #49  <Field Set mAllowedDataTypes>
	//   20   37:return          
	}

	public static void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          18
		{
			android.app.RemoteInput.addDataResultToIntent(fromCompat(remoteinput), intent, map);
	//    3    8:aload_0         
	//    4    9:invokestatic    #64  <Method android.app.RemoteInput fromCompat(RemoteInput)>
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:invokestatic    #69  <Method void android.app.RemoteInput.addDataResultToIntent(android.app.RemoteInput, Intent, Map)>
			return;
	//    8   17:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   9   18:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   21:bipush          16
	//*  11   23:icmplt          177
		{
			Intent intent2 = getClipDataIntentFromIntent(intent);
	//   12   26:aload_1         
	//   13   27:invokestatic    #73  <Method Intent getClipDataIntentFromIntent(Intent)>
	//   14   30:astore          4
			Intent intent1 = intent2;
	//   15   32:aload           4
	//   16   34:astore_3        
			if(intent2 == null)
	//*  17   35:aload           4
	//*  18   37:ifnonnull       48
				intent1 = new Intent();
	//   19   40:new             #75  <Class Intent>
	//   20   43:dup             
	//   21   44:invokespecial   #76  <Method void Intent()>
	//   22   47:astore_3        
			Iterator iterator = map.entrySet().iterator();
	//   23   48:aload_2         
	//   24   49:invokeinterface #82  <Method Set Map.entrySet()>
	//   25   54:invokeinterface #88  <Method Iterator Set.iterator()>
	//   26   59:astore          5
			do
			{
				if(!iterator.hasNext())
					break;
	//   27   61:aload           5
	//   28   63:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//   29   68:ifeq            166
				map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//   30   71:aload           5
	//   31   73:invokeinterface #98  <Method Object Iterator.next()>
	//   32   78:checkcast       #100 <Class java.util.Map$Entry>
	//   33   81:astore_2        
				String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   34   82:aload_2         
	//   35   83:invokeinterface #103 <Method Object java.util.Map$Entry.getKey()>
	//   36   88:checkcast       #105 <Class String>
	//   37   91:astore          6
				Uri uri = (Uri)((java.util.Map.Entry) (map)).getValue();
	//   38   93:aload_2         
	//   39   94:invokeinterface #108 <Method Object java.util.Map$Entry.getValue()>
	//   40   99:checkcast       #110 <Class Uri>
	//   41  102:astore          7
				if(s != null)
	//*  42  104:aload           6
	//*  43  106:ifnonnull       112
	//*  44  109:goto            61
				{
					Bundle bundle = intent1.getBundleExtra(getExtraResultsKeyForData(s));
	//   45  112:aload_3         
	//   46  113:aload           6
	//   47  115:invokestatic    #114 <Method String getExtraResultsKeyForData(String)>
	//   48  118:invokevirtual   #118 <Method Bundle Intent.getBundleExtra(String)>
	//   49  121:astore          4
					map = ((Map) (bundle));
	//   50  123:aload           4
	//   51  125:astore_2        
					if(bundle == null)
	//*  52  126:aload           4
	//*  53  128:ifnonnull       139
						map = ((Map) (new Bundle()));
	//   54  131:new             #120 <Class Bundle>
	//   55  134:dup             
	//   56  135:invokespecial   #121 <Method void Bundle()>
	//   57  138:astore_2        
					((Bundle) (map)).putString(remoteinput.getResultKey(), uri.toString());
	//   58  139:aload_2         
	//   59  140:aload_0         
	//   60  141:invokevirtual   #125 <Method String getResultKey()>
	//   61  144:aload           7
	//   62  146:invokevirtual   #128 <Method String Uri.toString()>
	//   63  149:invokevirtual   #132 <Method void Bundle.putString(String, String)>
					intent1.putExtra(getExtraResultsKeyForData(s), ((Bundle) (map)));
	//   64  152:aload_3         
	//   65  153:aload           6
	//   66  155:invokestatic    #114 <Method String getExtraResultsKeyForData(String)>
	//   67  158:aload_2         
	//   68  159:invokevirtual   #136 <Method Intent Intent.putExtra(String, Bundle)>
	//   69  162:pop             
				}
			} while(true);
	//   70  163:goto            61
			intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//   71  166:aload_1         
	//   72  167:ldc1            #17  <String "android.remoteinput.results">
	//   73  169:aload_3         
	//   74  170:invokestatic    #142 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//   75  173:invokevirtual   #146 <Method void Intent.setClipData(ClipData)>
			return;
	//   76  176:return          
		} else
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//   77  177:ldc1            #20  <String "RemoteInput">
	//   78  179:ldc1            #148 <String "RemoteInput is only supported from API Level 16">
	//   79  181:invokestatic    #154 <Method int Log.w(String, String)>
	//   80  184:pop             
			return;
	//   81  185:return          
		}
	}

	public static void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          18
		{
			android.app.RemoteInput.addResultsToIntent(fromCompat(aremoteinput), intent, bundle);
	//    3    8:aload_0         
	//    4    9:invokestatic    #160 <Method android.app.RemoteInput[] fromCompat(RemoteInput[])>
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:invokestatic    #163 <Method void android.app.RemoteInput.addResultsToIntent(android.app.RemoteInput[], Intent, Bundle)>
			return;
	//    8   17:return          
		}
		int j = android.os.Build.VERSION.SDK_INT;
	//    9   18:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//   10   21:istore          4
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_3        
		if(j >= 20)
	//*  13   25:iload           4
	//*  14   27:bipush          20
	//*  15   29:icmplt          120
		{
			Bundle bundle1 = getResultsFromIntent(intent);
	//   16   32:aload_1         
	//   17   33:invokestatic    #167 <Method Bundle getResultsFromIntent(Intent)>
	//   18   36:astore          5
			if(bundle1 != null)
	//*  19   38:aload           5
	//*  20   40:ifnonnull       46
	//*  21   43:goto            55
			{
				bundle1.putAll(bundle);
	//   22   46:aload           5
	//   23   48:aload_2         
	//   24   49:invokevirtual   #171 <Method void Bundle.putAll(Bundle)>
				bundle = bundle1;
	//   25   52:aload           5
	//   26   54:astore_2        
			}
			int k = aremoteinput.length;
	//   27   55:aload_0         
	//   28   56:arraylength     
	//   29   57:istore          4
			for(i = 0; i < k; i++)
	//*  30   59:iconst_0        
	//*  31   60:istore_3        
	//*  32   61:iload_3         
	//*  33   62:iload           4
	//*  34   64:icmpge          265
			{
				RemoteInput remoteinput = aremoteinput[i];
	//   35   67:aload_0         
	//   36   68:iload_3         
	//   37   69:aaload          
	//   38   70:astore          5
				Map map = getDataResultsFromIntent(intent, remoteinput.getResultKey());
	//   39   72:aload_1         
	//   40   73:aload           5
	//   41   75:invokevirtual   #125 <Method String getResultKey()>
	//   42   78:invokestatic    #175 <Method Map getDataResultsFromIntent(Intent, String)>
	//   43   81:astore          6
				android.app.RemoteInput.addResultsToIntent(fromCompat(new RemoteInput[] {
					remoteinput
				}), intent, bundle);
	//   44   83:iconst_1        
	//   45   84:anewarray       RemoteInput[]
	//   46   87:dup             
	//   47   88:iconst_0        
	//   48   89:aload           5
	//   49   91:aastore         
	//   50   92:invokestatic    #160 <Method android.app.RemoteInput[] fromCompat(RemoteInput[])>
	//   51   95:aload_1         
	//   52   96:aload_2         
	//   53   97:invokestatic    #163 <Method void android.app.RemoteInput.addResultsToIntent(android.app.RemoteInput[], Intent, Bundle)>
				if(map != null)
	//*  54  100:aload           6
	//*  55  102:ifnull          113
					addDataResultToIntent(remoteinput, intent, map);
	//   56  105:aload           5
	//   57  107:aload_1         
	//   58  108:aload           6
	//   59  110:invokestatic    #177 <Method void addDataResultToIntent(RemoteInput, Intent, Map)>
			}

	//   60  113:iload_3         
	//   61  114:iconst_1        
	//   62  115:iadd            
	//   63  116:istore_3        
		} else
	//*  64  117:goto            61
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  65  120:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*  66  123:bipush          16
	//*  67  125:icmplt          257
			{
				Object obj = ((Object) (getClipDataIntentFromIntent(intent)));
	//   68  128:aload_1         
	//   69  129:invokestatic    #73  <Method Intent getClipDataIntentFromIntent(Intent)>
	//   70  132:astore          6
				Intent intent1 = ((Intent) (obj));
	//   71  134:aload           6
	//   72  136:astore          5
				if(obj == null)
	//*  73  138:aload           6
	//*  74  140:ifnonnull       152
					intent1 = new Intent();
	//   75  143:new             #75  <Class Intent>
	//   76  146:dup             
	//   77  147:invokespecial   #76  <Method void Intent()>
	//   78  150:astore          5
				Bundle bundle2 = intent1.getBundleExtra("android.remoteinput.resultsData");
	//   79  152:aload           5
	//   80  154:ldc1            #14  <String "android.remoteinput.resultsData">
	//   81  156:invokevirtual   #118 <Method Bundle Intent.getBundleExtra(String)>
	//   82  159:astore          7
				obj = ((Object) (bundle2));
	//   83  161:aload           7
	//   84  163:astore          6
				if(bundle2 == null)
	//*  85  165:aload           7
	//*  86  167:ifnonnull       179
					obj = ((Object) (new Bundle()));
	//   87  170:new             #120 <Class Bundle>
	//   88  173:dup             
	//   89  174:invokespecial   #121 <Method void Bundle()>
	//   90  177:astore          6
				for(int l = aremoteinput.length; i < l; i++)
	//*  91  179:aload_0         
	//*  92  180:arraylength     
	//*  93  181:istore          4
	//*  94  183:iload_3         
	//*  95  184:iload           4
	//*  96  186:icmpge          235
				{
					RemoteInput remoteinput1 = aremoteinput[i];
	//   97  189:aload_0         
	//   98  190:iload_3         
	//   99  191:aaload          
	//  100  192:astore          7
					Object obj1 = bundle.get(remoteinput1.getResultKey());
	//  101  194:aload_2         
	//  102  195:aload           7
	//  103  197:invokevirtual   #125 <Method String getResultKey()>
	//  104  200:invokevirtual   #181 <Method Object Bundle.get(String)>
	//  105  203:astore          8
					if(obj1 instanceof CharSequence)
	//* 106  205:aload           8
	//* 107  207:instanceof      #183 <Class CharSequence>
	//* 108  210:ifeq            228
						((Bundle) (obj)).putCharSequence(remoteinput1.getResultKey(), (CharSequence)obj1);
	//  109  213:aload           6
	//  110  215:aload           7
	//  111  217:invokevirtual   #125 <Method String getResultKey()>
	//  112  220:aload           8
	//  113  222:checkcast       #183 <Class CharSequence>
	//  114  225:invokevirtual   #187 <Method void Bundle.putCharSequence(String, CharSequence)>
				}

	//  115  228:iload_3         
	//  116  229:iconst_1        
	//  117  230:iadd            
	//  118  231:istore_3        
	//* 119  232:goto            183
				intent1.putExtra("android.remoteinput.resultsData", ((Bundle) (obj)));
	//  120  235:aload           5
	//  121  237:ldc1            #14  <String "android.remoteinput.resultsData">
	//  122  239:aload           6
	//  123  241:invokevirtual   #136 <Method Intent Intent.putExtra(String, Bundle)>
	//  124  244:pop             
				intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
	//  125  245:aload_1         
	//  126  246:ldc1            #17  <String "android.remoteinput.results">
	//  127  248:aload           5
	//  128  250:invokestatic    #142 <Method ClipData ClipData.newIntent(CharSequence, Intent)>
	//  129  253:invokevirtual   #146 <Method void Intent.setClipData(ClipData)>
				return;
	//  130  256:return          
			}
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//  131  257:ldc1            #20  <String "RemoteInput">
	//  132  259:ldc1            #148 <String "RemoteInput is only supported from API Level 16">
	//  133  261:invokestatic    #154 <Method int Log.w(String, String)>
	//  134  264:pop             
		}
	//  135  265:return          
	}

	static android.app.RemoteInput fromCompat(RemoteInput remoteinput)
	{
		return (new android.app.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
	//    0    0:new             #192 <Class android.app.RemoteInput$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #125 <Method String getResultKey()>
	//    4    8:invokespecial   #195 <Method void android.app.RemoteInput$Builder(String)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #199 <Method CharSequence getLabel()>
	//    7   15:invokevirtual   #203 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #207 <Method CharSequence[] getChoices()>
	//   10   22:invokevirtual   #211 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method boolean getAllowFreeFormInput()>
	//   13   29:invokevirtual   #218 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #222 <Method Bundle getExtras()>
	//   16   36:invokevirtual   #226 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   17   39:invokevirtual   #230 <Method android.app.RemoteInput android.app.RemoteInput$Builder.build()>
	//   18   42:areturn         
	}

	static android.app.RemoteInput[] fromCompat(RemoteInput aremoteinput[])
	{
		if(aremoteinput == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.app.RemoteInput aremoteinput1[] = new android.app.RemoteInput[aremoteinput.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       android.app.RemoteInput[]
	//    7   11:astore_2        
		for(int i = 0; i < aremoteinput.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          36
			aremoteinput1[i] = fromCompat(aremoteinput[i]);
	//   14   20:aload_2         
	//   15   21:iload_1         
	//   16   22:aload_0         
	//   17   23:iload_1         
	//   18   24:aaload          
	//   19   25:invokestatic    #64  <Method android.app.RemoteInput fromCompat(RemoteInput)>
	//   20   28:aastore         

	//   21   29:iload_1         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_1        
	//*  25   33:goto            14
		return aremoteinput1;
	//   26   36:aload_2         
	//   27   37:areturn         
	}

	private static Intent getClipDataIntentFromIntent(Intent intent)
	{
		intent = ((Intent) (intent.getClipData()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #236 <Method ClipData Intent.getClipData()>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		ClipDescription clipdescription = ((ClipData) (intent)).getDescription();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #240 <Method ClipDescription ClipData.getDescription()>
	//    9   15:astore_1        
		if(!clipdescription.hasMimeType("text/vnd.android.intent"))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #242 <String "text/vnd.android.intent">
	//*  12   19:invokevirtual   #248 <Method boolean ClipDescription.hasMimeType(String)>
	//*  13   22:ifne            27
			return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
		if(!((Object) (clipdescription.getLabel())).equals("android.remoteinput.results"))
	//*  16   27:aload_1         
	//*  17   28:invokevirtual   #249 <Method CharSequence ClipDescription.getLabel()>
	//*  18   31:ldc1            #17  <String "android.remoteinput.results">
	//*  19   33:invokevirtual   #253 <Method boolean Object.equals(Object)>
	//*  20   36:ifne            41
			return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
		else
			return ((ClipData) (intent)).getItemAt(0).getIntent();
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #257 <Method android.content.ClipData$Item ClipData.getItemAt(int)>
	//   26   46:invokevirtual   #263 <Method Intent android.content.ClipData$Item.getIntent()>
	//   27   49:areturn         
	}

	public static Map getDataResultsFromIntent(Intent intent, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
			return android.app.RemoteInput.getDataResultsFromIntent(intent, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #264 <Method Map android.app.RemoteInput.getDataResultsFromIntent(Intent, String)>
	//    6   13:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   14:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          16
	//*   9   19:icmplt          167
		{
			intent = getClipDataIntentFromIntent(intent);
	//   10   22:aload_0         
	//   11   23:invokestatic    #73  <Method Intent getClipDataIntentFromIntent(Intent)>
	//   12   26:astore_0        
			if(intent == null)
	//*  13   27:aload_0         
	//*  14   28:ifnonnull       33
				return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
			HashMap hashmap = new HashMap();
	//   17   33:new             #266 <Class HashMap>
	//   18   36:dup             
	//   19   37:invokespecial   #267 <Method void HashMap()>
	//   20   40:astore_2        
			Iterator iterator = intent.getExtras().keySet().iterator();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #268 <Method Bundle Intent.getExtras()>
	//   23   45:invokevirtual   #271 <Method Set Bundle.keySet()>
	//   24   48:invokeinterface #88  <Method Iterator Set.iterator()>
	//   25   53:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   26   54:aload_3         
	//   27   55:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            152
				String s2 = (String)iterator.next();
	//   29   63:aload_3         
	//   30   64:invokeinterface #98  <Method Object Iterator.next()>
	//   31   69:checkcast       #105 <Class String>
	//   32   72:astore          5
				if(s2.startsWith("android.remoteinput.dataTypeResultsData"))
	//*  33   74:aload           5
	//*  34   76:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//*  35   78:invokevirtual   #274 <Method boolean String.startsWith(String)>
	//*  36   81:ifeq            54
				{
					String s1 = s2.substring("android.remoteinput.dataTypeResultsData".length());
	//   37   84:aload           5
	//   38   86:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//   39   88:invokevirtual   #278 <Method int String.length()>
	//   40   91:invokevirtual   #282 <Method String String.substring(int)>
	//   41   94:astore          4
					if(!s1.isEmpty())
	//*  42   96:aload           4
	//*  43   98:invokevirtual   #285 <Method boolean String.isEmpty()>
	//*  44  101:ifeq            107
	//*  45  104:goto            54
					{
						s2 = intent.getBundleExtra(s2).getString(s);
	//   46  107:aload_0         
	//   47  108:aload           5
	//   48  110:invokevirtual   #118 <Method Bundle Intent.getBundleExtra(String)>
	//   49  113:aload_1         
	//   50  114:invokevirtual   #288 <Method String Bundle.getString(String)>
	//   51  117:astore          5
						if(s2 != null && !s2.isEmpty())
	//*  52  119:aload           5
	//*  53  121:ifnull          54
	//*  54  124:aload           5
	//*  55  126:invokevirtual   #285 <Method boolean String.isEmpty()>
	//*  56  129:ifeq            135
	//*  57  132:goto            54
							((Map) (hashmap)).put(((Object) (s1)), ((Object) (Uri.parse(s2))));
	//   58  135:aload_2         
	//   59  136:aload           4
	//   60  138:aload           5
	//   61  140:invokestatic    #292 <Method Uri Uri.parse(String)>
	//   62  143:invokeinterface #296 <Method Object Map.put(Object, Object)>
	//   63  148:pop             
					}
				}
			} while(true);
	//   64  149:goto            54
			intent = ((Intent) (hashmap));
	//   65  152:aload_2         
	//   66  153:astore_0        
			if(((Map) (hashmap)).isEmpty())
	//*  67  154:aload_2         
	//*  68  155:invokeinterface #297 <Method boolean Map.isEmpty()>
	//*  69  160:ifeq            165
				intent = null;
	//   70  163:aconst_null     
	//   71  164:astore_0        
			return ((Map) (intent));
	//   72  165:aload_0         
	//   73  166:areturn         
		} else
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//   74  167:ldc1            #20  <String "RemoteInput">
	//   75  169:ldc1            #148 <String "RemoteInput is only supported from API Level 16">
	//   76  171:invokestatic    #154 <Method int Log.w(String, String)>
	//   77  174:pop             
			return null;
	//   78  175:aconst_null     
	//   79  176:areturn         
		}
	}

	private static String getExtraResultsKeyForData(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #300 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #301 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("android.remoteinput.dataTypeResultsData");
	//    4    8:aload_1         
	//    5    9:ldc1            #11  <String "android.remoteinput.dataTypeResultsData">
	//    6   11:invokevirtual   #305 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #305 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #306 <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	public static Bundle getResultsFromIntent(Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          13
			return android.app.RemoteInput.getResultsFromIntent(intent);
	//    3    8:aload_0         
	//    4    9:invokestatic    #307 <Method Bundle android.app.RemoteInput.getResultsFromIntent(Intent)>
	//    5   12:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   13:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          16
	//*   8   18:icmplt          45
		{
			intent = getClipDataIntentFromIntent(intent);
	//    9   21:aload_0         
	//   10   22:invokestatic    #73  <Method Intent getClipDataIntentFromIntent(Intent)>
	//   11   25:astore_0        
			if(intent == null)
	//*  12   26:aload_0         
	//*  13   27:ifnonnull       32
				return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
			else
				return (Bundle)intent.getExtras().getParcelable("android.remoteinput.resultsData");
	//   16   32:aload_0         
	//   17   33:invokevirtual   #268 <Method Bundle Intent.getExtras()>
	//   18   36:ldc1            #14  <String "android.remoteinput.resultsData">
	//   19   38:invokevirtual   #311 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   20   41:checkcast       #120 <Class Bundle>
	//   21   44:areturn         
		} else
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
	//   22   45:ldc1            #20  <String "RemoteInput">
	//   23   47:ldc1            #148 <String "RemoteInput is only supported from API Level 16">
	//   24   49:invokestatic    #154 <Method int Log.w(String, String)>
	//   25   52:pop             
			return null;
	//   26   53:aconst_null     
	//   27   54:areturn         
		}
	}

	public boolean getAllowFreeFormInput()
	{
		return mAllowFreeFormTextInput;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean mAllowFreeFormTextInput>
	//    2    4:ireturn         
	}

	public Set getAllowedDataTypes()
	{
		return mAllowedDataTypes;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Set mAllowedDataTypes>
	//    2    4:areturn         
	}

	public CharSequence[] getChoices()
	{
		return mChoices;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field CharSequence[] mChoices>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public CharSequence getLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field CharSequence mLabel>
	//    2    4:areturn         
	}

	public String getResultKey()
	{
		return mResultKey;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String mResultKey>
	//    2    4:areturn         
	}

	public boolean isDataOnly()
	{
		return !getAllowFreeFormInput() && (getChoices() == null || getChoices().length == 0) && getAllowedDataTypes() != null && !getAllowedDataTypes().isEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #214 <Method boolean getAllowFreeFormInput()>
	//    2    4:ifne            43
	//    3    7:aload_0         
	//    4    8:invokevirtual   #207 <Method CharSequence[] getChoices()>
	//    5   11:ifnull          22
	//    6   14:aload_0         
	//    7   15:invokevirtual   #207 <Method CharSequence[] getChoices()>
	//    8   18:arraylength     
	//    9   19:ifne            43
	//   10   22:aload_0         
	//   11   23:invokevirtual   #316 <Method Set getAllowedDataTypes()>
	//   12   26:ifnull          43
	//   13   29:aload_0         
	//   14   30:invokevirtual   #316 <Method Set getAllowedDataTypes()>
	//   15   33:invokeinterface #317 <Method boolean Set.isEmpty()>
	//   16   38:ifne            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
	public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
	public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
	private static final String TAG = "RemoteInput";
	private final boolean mAllowFreeFormTextInput;
	private final Set mAllowedDataTypes;
	private final CharSequence mChoices[];
	private final Bundle mExtras;
	private final CharSequence mLabel;
	private final String mResultKey;
}
