// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.*;
import android.content.pm.*;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.*;
import java.util.*;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class ActivityChooserModel extends DataSetObservable
{

	private ActivityChooserModel(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void DataSetObservable()>
	//    2    4:aload_0         
	//    3    5:new             #68  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #71  <Method void Object()>
	//    6   12:putfield        #83  <Field Object mInstanceLock>
	//    7   15:aload_0         
	//    8   16:new             #85  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void ArrayList()>
	//   11   23:putfield        #88  <Field List mActivities>
	//   12   26:aload_0         
	//   13   27:new             #85  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #86  <Method void ArrayList()>
	//   16   34:putfield        #90  <Field List mHistoricalRecords>
		mActivitySorter = ((ActivitySorter) (new DefaultSorter()));
	//   17   37:aload_0         
	//   18   38:new             #92  <Class ActivityChooserModel$DefaultSorter>
	//   19   41:dup             
	//   20   42:invokespecial   #93  <Method void ActivityChooserModel$DefaultSorter()>
	//   21   45:putfield        #95  <Field ActivityChooserModel$ActivitySorter mActivitySorter>
		mHistoryMaxSize = 50;
	//   22   48:aload_0         
	//   23   49:bipush          50
	//   24   51:putfield        #97  <Field int mHistoryMaxSize>
		mCanReadHistoricalData = true;
	//   25   54:aload_0         
	//   26   55:iconst_1        
	//   27   56:putfield        #99  <Field boolean mCanReadHistoricalData>
		mReadShareHistoryCalled = false;
	//   28   59:aload_0         
	//   29   60:iconst_0        
	//   30   61:putfield        #101 <Field boolean mReadShareHistoryCalled>
		mHistoricalRecordsChanged = true;
	//   31   64:aload_0         
	//   32   65:iconst_1        
	//   33   66:putfield        #103 <Field boolean mHistoricalRecordsChanged>
		mReloadActivities = false;
	//   34   69:aload_0         
	//   35   70:iconst_0        
	//   36   71:putfield        #105 <Field boolean mReloadActivities>
		mContext = context.getApplicationContext();
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:invokevirtual   #111 <Method Context Context.getApplicationContext()>
	//   40   79:putfield        #113 <Field Context mContext>
		if(!TextUtils.isEmpty(((CharSequence) (s))) && !s.endsWith(".xml"))
	//*  41   82:aload_2         
	//*  42   83:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   86:ifne            128
	//*  44   89:aload_2         
	//*  45   90:ldc1            #31  <String ".xml">
	//*  46   92:invokevirtual   #125 <Method boolean String.endsWith(String)>
	//*  47   95:ifne            128
		{
			context = ((Context) (new StringBuilder()));
	//   48   98:new             #127 <Class StringBuilder>
	//   49  101:dup             
	//   50  102:invokespecial   #128 <Method void StringBuilder()>
	//   51  105:astore_1        
			((StringBuilder) (context)).append(s);
	//   52  106:aload_1         
	//   53  107:aload_2         
	//   54  108:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
			((StringBuilder) (context)).append(".xml");
	//   56  112:aload_1         
	//   57  113:ldc1            #31  <String ".xml">
	//   58  115:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   59  118:pop             
			mHistoryFileName = ((StringBuilder) (context)).toString();
	//   60  119:aload_0         
	//   61  120:aload_1         
	//   62  121:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   63  124:putfield        #138 <Field String mHistoryFileName>
			return;
	//   64  127:return          
		} else
		{
			mHistoryFileName = s;
	//   65  128:aload_0         
	//   66  129:aload_2         
	//   67  130:putfield        #138 <Field String mHistoryFileName>
			return;
	//   68  133:return          
		}
	}

	private boolean addHistoricalRecord(HistoricalRecord historicalrecord)
	{
		boolean flag = mHistoricalRecords.add(((Object) (historicalrecord)));
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field List mHistoricalRecords>
	//    2    4:aload_1         
	//    3    5:invokeinterface #146 <Method boolean List.add(Object)>
	//    4   10:istore_2        
		if(flag)
	//*   5   11:iload_2         
	//*   6   12:ifeq            37
		{
			mHistoricalRecordsChanged = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #103 <Field boolean mHistoricalRecordsChanged>
			pruneExcessiveHistoricalRecordsIfNeeded();
	//   10   20:aload_0         
	//   11   21:invokespecial   #149 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
			persistHistoricalDataIfNeeded();
	//   12   24:aload_0         
	//   13   25:invokespecial   #152 <Method void persistHistoricalDataIfNeeded()>
			sortActivitiesIfNeeded();
	//   14   28:aload_0         
	//   15   29:invokespecial   #156 <Method boolean sortActivitiesIfNeeded()>
	//   16   32:pop             
			notifyChanged();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #159 <Method void notifyChanged()>
		}
		return flag;
	//   19   37:iload_2         
	//   20   38:ireturn         
	}

	private void ensureConsistentState()
	{
		boolean flag = loadActivitiesIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method boolean loadActivitiesIfNeeded()>
	//    2    4:istore_1        
		boolean flag1 = readHistoricalDataIfNeeded();
	//    3    5:aload_0         
	//    4    6:invokespecial   #166 <Method boolean readHistoricalDataIfNeeded()>
	//    5    9:istore_2        
		pruneExcessiveHistoricalRecordsIfNeeded();
	//    6   10:aload_0         
	//    7   11:invokespecial   #149 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
		if(flag | flag1)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:ior             
	//*  11   17:ifeq            29
		{
			sortActivitiesIfNeeded();
	//   12   20:aload_0         
	//   13   21:invokespecial   #156 <Method boolean sortActivitiesIfNeeded()>
	//   14   24:pop             
			notifyChanged();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #159 <Method void notifyChanged()>
		}
	//   17   29:return          
	}

	public static ActivityChooserModel get(Context context, String s)
	{
		Object obj = sRegistryLock;
	//    0    0:getstatic       #73  <Field Object sRegistryLock>
	//    1    3:astore          4
		obj;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		ActivityChooserModel activitychoosermodel1 = (ActivityChooserModel)sDataModelRegistry.get(((Object) (s)));
	//    4    8:getstatic       #78  <Field Map sDataModelRegistry>
	//    5   11:aload_1         
	//    6   12:invokeinterface #173 <Method Object Map.get(Object)>
	//    7   17:checkcast       #2   <Class ActivityChooserModel>
	//    8   20:astore_3        
		ActivityChooserModel activitychoosermodel;
		activitychoosermodel = activitychoosermodel1;
	//    9   21:aload_3         
	//   10   22:astore_2        
		if(activitychoosermodel1 != null)
			break MISSING_BLOCK_LABEL_48;
	//   11   23:aload_3         
	//   12   24:ifnonnull       48
		activitychoosermodel = new ActivityChooserModel(context, s);
	//   13   27:new             #2   <Class ActivityChooserModel>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #175 <Method void ActivityChooserModel(Context, String)>
	//   18   36:astore_2        
		sDataModelRegistry.put(((Object) (s)), ((Object) (activitychoosermodel)));
	//   19   37:getstatic       #78  <Field Map sDataModelRegistry>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokeinterface #179 <Method Object Map.put(Object, Object)>
	//   23   47:pop             
		obj;
	//   24   48:aload           4
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		return activitychoosermodel;
	//   26   51:aload_2         
	//   27   52:areturn         
		context;
	//   28   53:astore_0        
		obj;
	//   29   54:aload           4
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		throw context;
	//   31   57:aload_0         
	//   32   58:athrow          
	}

	private boolean loadActivitiesIfNeeded()
	{
		boolean flag = mReloadActivities;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean mReloadActivities>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(flag && mIntent != null)
	//*   5    7:iload_3         
	//*   6    8:ifeq            103
	//*   7   11:aload_0         
	//*   8   12:getfield        #181 <Field Intent mIntent>
	//*   9   15:ifnull          103
		{
			mReloadActivities = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #105 <Field boolean mReloadActivities>
			mActivities.clear();
	//   13   23:aload_0         
	//   14   24:getfield        #88  <Field List mActivities>
	//   15   27:invokeinterface #184 <Method void List.clear()>
			List list = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
	//   16   32:aload_0         
	//   17   33:getfield        #113 <Field Context mContext>
	//   18   36:invokevirtual   #188 <Method PackageManager Context.getPackageManager()>
	//   19   39:aload_0         
	//   20   40:getfield        #181 <Field Intent mIntent>
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #194 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   23   47:astore          4
			for(int j = list.size(); i < j; i++)
	//*  24   49:aload           4
	//*  25   51:invokeinterface #198 <Method int List.size()>
	//*  26   56:istore_2        
	//*  27   57:iload_1         
	//*  28   58:iload_2         
	//*  29   59:icmpge          101
			{
				ResolveInfo resolveinfo = (ResolveInfo)list.get(i);
	//   30   62:aload           4
	//   31   64:iload_1         
	//   32   65:invokeinterface #201 <Method Object List.get(int)>
	//   33   70:checkcast       #203 <Class ResolveInfo>
	//   34   73:astore          5
				mActivities.add(((Object) (new ActivityResolveInfo(resolveinfo))));
	//   35   75:aload_0         
	//   36   76:getfield        #88  <Field List mActivities>
	//   37   79:new             #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   38   82:dup             
	//   39   83:aload           5
	//   40   85:invokespecial   #208 <Method void ActivityChooserModel$ActivityResolveInfo(ResolveInfo)>
	//   41   88:invokeinterface #146 <Method boolean List.add(Object)>
	//   42   93:pop             
			}

	//   43   94:iload_1         
	//   44   95:iconst_1        
	//   45   96:iadd            
	//   46   97:istore_1        
	//*  47   98:goto            57
			return true;
	//   48  101:iconst_1        
	//   49  102:ireturn         
		} else
		{
			return false;
	//   50  103:iconst_0        
	//   51  104:ireturn         
		}
	}

	private void persistHistoricalDataIfNeeded()
	{
		if(mReadShareHistoryCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean mReadShareHistoryCalled>
	//*   2    4:ifeq            71
		{
			if(!mHistoricalRecordsChanged)
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field boolean mHistoricalRecordsChanged>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			mHistoricalRecordsChanged = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #103 <Field boolean mHistoricalRecordsChanged>
			if(!TextUtils.isEmpty(((CharSequence) (mHistoryFileName))))
	//*  10   20:aload_0         
	//*  11   21:getfield        #138 <Field String mHistoryFileName>
	//*  12   24:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   27:ifne            70
				(new PersistHistoryAsyncTask()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
					new ArrayList(((java.util.Collection) (mHistoricalRecords))), mHistoryFileName
				});
	//   14   30:new             #210 <Class ActivityChooserModel$PersistHistoryAsyncTask>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #213 <Method void ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel)>
	//   18   38:getstatic       #219 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   19   41:iconst_2        
	//   20   42:anewarray       Object[]
	//   21   45:dup             
	//   22   46:iconst_0        
	//   23   47:new             #85  <Class ArrayList>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #90  <Field List mHistoricalRecords>
	//   27   55:invokespecial   #222 <Method void ArrayList(java.util.Collection)>
	//   28   58:aastore         
	//   29   59:dup             
	//   30   60:iconst_1        
	//   31   61:aload_0         
	//   32   62:getfield        #138 <Field String mHistoryFileName>
	//   33   65:aastore         
	//   34   66:invokevirtual   #226 <Method AsyncTask ActivityChooserModel$PersistHistoryAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   35   69:pop             
			return;
	//   36   70:return          
		} else
		{
			throw new IllegalStateException("No preceding call to #readHistoricalData");
	//   37   71:new             #228 <Class IllegalStateException>
	//   38   74:dup             
	//   39   75:ldc1            #230 <String "No preceding call to #readHistoricalData">
	//   40   77:invokespecial   #233 <Method void IllegalStateException(String)>
	//   41   80:athrow          
		}
	}

	private void pruneExcessiveHistoricalRecordsIfNeeded()
	{
		int j = mHistoricalRecords.size() - mHistoryMaxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field List mHistoricalRecords>
	//    2    4:invokeinterface #198 <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #97  <Field int mHistoryMaxSize>
	//    5   13:isub            
	//    6   14:istore_2        
		if(j <= 0)
	//*   7   15:iload_2         
	//*   8   16:ifgt            20
			return;
	//    9   19:return          
		mHistoricalRecordsChanged = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #103 <Field boolean mHistoricalRecordsChanged>
		for(int i = 0; i < j; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_1        
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:icmpge          53
		{
			HistoricalRecord historicalrecord = (HistoricalRecord)mHistoricalRecords.remove(0);
	//   18   32:aload_0         
	//   19   33:getfield        #90  <Field List mHistoricalRecords>
	//   20   36:iconst_0        
	//   21   37:invokeinterface #236 <Method Object List.remove(int)>
	//   22   42:checkcast       #238 <Class ActivityChooserModel$HistoricalRecord>
	//   23   45:astore_3        
		}

	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
	//*  28   50:goto            27
	//   29   53:return          
	}

	private boolean readHistoricalDataIfNeeded()
	{
		if(mCanReadHistoricalData && mHistoricalRecordsChanged && !TextUtils.isEmpty(((CharSequence) (mHistoryFileName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean mCanReadHistoricalData>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field boolean mHistoricalRecordsChanged>
	//*   5   11:ifeq            40
	//*   6   14:aload_0         
	//*   7   15:getfield        #138 <Field String mHistoryFileName>
	//*   8   18:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   21:ifne            40
		{
			mCanReadHistoricalData = false;
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:putfield        #99  <Field boolean mCanReadHistoricalData>
			mReadShareHistoryCalled = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #101 <Field boolean mReadShareHistoryCalled>
			readHistoricalDataImpl();
	//   16   34:aload_0         
	//   17   35:invokespecial   #241 <Method void readHistoricalDataImpl()>
			return true;
	//   18   38:iconst_1        
	//   19   39:ireturn         
		} else
		{
			return false;
	//   20   40:iconst_0        
	//   21   41:ireturn         
		}
	}

	private void readHistoricalDataImpl()
	{
		int i;
		FileInputStream fileinputstream;
		XmlPullParser xmlpullparser;
		Object obj;
		List list;
		try
		{
			fileinputstream = mContext.openFileInput(mHistoryFileName);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #138 <Field String mHistoryFileName>
	//    4    8:invokevirtual   #251 <Method FileInputStream Context.openFileInput(String)>
	//    5   11:astore_2        
		}
	//*   6   12:invokestatic    #257 <Method XmlPullParser Xml.newPullParser()>
	//*   7   15:astore_3        
	//*   8   16:aload_3         
	//*   9   17:aload_2         
	//*  10   18:ldc2            #259 <String "UTF-8">
	//*  11   21:invokeinterface #265 <Method void XmlPullParser.setInput(java.io.InputStream, String)>
	//*  12   26:iconst_0        
	//*  13   27:istore_1        
	//*  14   28:iload_1         
	//*  15   29:iconst_1        
	//*  16   30:icmpeq          48
	//*  17   33:iload_1         
	//*  18   34:iconst_2        
	//*  19   35:icmpeq          48
	//*  20   38:aload_3         
	//*  21   39:invokeinterface #268 <Method int XmlPullParser.next()>
	//*  22   44:istore_1        
	//*  23   45:goto            28
	//*  24   48:ldc1            #42  <String "historical-records">
	//*  25   50:aload_3         
	//*  26   51:invokeinterface #271 <Method String XmlPullParser.getName()>
	//*  27   56:invokevirtual   #274 <Method boolean String.equals(Object)>
	//*  28   59:ifeq            185
	//*  29   62:aload_0         
	//*  30   63:getfield        #90  <Field List mHistoricalRecords>
	//*  31   66:astore          4
	//*  32   68:aload           4
	//*  33   70:invokeinterface #184 <Method void List.clear()>
	//*  34   75:aload_3         
	//*  35   76:invokeinterface #268 <Method int XmlPullParser.next()>
	//*  36   81:istore_1        
	//*  37   82:iload_1         
	//*  38   83:iconst_1        
	//*  39   84:icmpne          96
	//*  40   87:aload_2         
	//*  41   88:ifnull          306
	//*  42   91:aload_2         
	//*  43   92:invokevirtual   #279 <Method void FileInputStream.close()>
	//*  44   95:return          
	//*  45   96:iload_1         
	//*  46   97:iconst_3        
	//*  47   98:icmpeq          75
	//*  48  101:iload_1         
	//*  49  102:iconst_4        
	//*  50  103:icmpne          109
	//*  51  106:goto            75
	//*  52  109:ldc1            #39  <String "historical-record">
	//*  53  111:aload_3         
	//*  54  112:invokeinterface #271 <Method String XmlPullParser.getName()>
	//*  55  117:invokevirtual   #274 <Method boolean String.equals(Object)>
	//*  56  120:ifeq            174
	//*  57  123:aload           4
	//*  58  125:new             #238 <Class ActivityChooserModel$HistoricalRecord>
	//*  59  128:dup             
	//*  60  129:aload_3         
	//*  61  130:aconst_null     
	//*  62  131:ldc1            #8   <String "activity">
	//*  63  133:invokeinterface #283 <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  64  138:aload_3         
	//*  65  139:aconst_null     
	//*  66  140:ldc1            #11  <String "time">
	//*  67  142:invokeinterface #283 <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  68  147:invokestatic    #289 <Method long Long.parseLong(String)>
	//*  69  150:aload_3         
	//*  70  151:aconst_null     
	//*  71  152:ldc1            #14  <String "weight">
	//*  72  154:invokeinterface #283 <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  73  159:invokestatic    #295 <Method float Float.parseFloat(String)>
	//*  74  162:invokespecial   #298 <Method void ActivityChooserModel$HistoricalRecord(String, long, float)>
	//*  75  165:invokeinterface #146 <Method boolean List.add(Object)>
	//*  76  170:pop             
	//*  77  171:goto            75
	//*  78  174:new             #245 <Class XmlPullParserException>
	//*  79  177:dup             
	//*  80  178:ldc2            #300 <String "Share records file not well-formed.">
	//*  81  181:invokespecial   #301 <Method void XmlPullParserException(String)>
	//*  82  184:athrow          
	//*  83  185:new             #245 <Class XmlPullParserException>
	//*  84  188:dup             
	//*  85  189:ldc2            #303 <String "Share records file does not start with historical-records tag.">
	//*  86  192:invokespecial   #301 <Method void XmlPullParserException(String)>
	//*  87  195:athrow          
	//*  88  196:astore_3        
	//*  89  197:goto            307
	//*  90  200:astore_3        
	//*  91  201:getstatic       #305 <Field String LOG_TAG>
	//*  92  204:astore          4
	//*  93  206:new             #127 <Class StringBuilder>
	//*  94  209:dup             
	//*  95  210:invokespecial   #128 <Method void StringBuilder()>
	//*  96  213:astore          5
	//*  97  215:aload           5
	//*  98  217:ldc2            #307 <String "Error reading historical recrod file: ">
	//*  99  220:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//* 100  223:pop             
	//* 101  224:aload           5
	//* 102  226:aload_0         
	//* 103  227:getfield        #138 <Field String mHistoryFileName>
	//* 104  230:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//* 105  233:pop             
	//* 106  234:aload           4
	//* 107  236:aload           5
	//* 108  238:invokevirtual   #136 <Method String StringBuilder.toString()>
	//* 109  241:aload_3         
	//* 110  242:invokestatic    #313 <Method int Log.e(String, String, Throwable)>
	//* 111  245:pop             
	//* 112  246:aload_2         
	//* 113  247:ifnull          306
	//* 114  250:goto            91
	//* 115  253:astore_3        
	//* 116  254:getstatic       #305 <Field String LOG_TAG>
	//* 117  257:astore          4
	//* 118  259:new             #127 <Class StringBuilder>
	//* 119  262:dup             
	//* 120  263:invokespecial   #128 <Method void StringBuilder()>
	//* 121  266:astore          5
	//* 122  268:aload           5
	//* 123  270:ldc2            #307 <String "Error reading historical recrod file: ">
	//* 124  273:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//* 125  276:pop             
	//* 126  277:aload           5
	//* 127  279:aload_0         
	//* 128  280:getfield        #138 <Field String mHistoryFileName>
	//* 129  283:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//* 130  286:pop             
	//* 131  287:aload           4
	//* 132  289:aload           5
	//* 133  291:invokevirtual   #136 <Method String StringBuilder.toString()>
	//* 134  294:aload_3         
	//* 135  295:invokestatic    #313 <Method int Log.e(String, String, Throwable)>
	//* 136  298:pop             
	//* 137  299:aload_2         
	//* 138  300:ifnull          306
	//* 139  303:goto            91
	//* 140  306:return          
	//* 141  307:aload_2         
	//* 142  308:ifnull          315
	//* 143  311:aload_2         
	//* 144  312:invokevirtual   #279 <Method void FileInputStream.close()>
	//* 145  315:aload_3         
	//* 146  316:athrow          
		catch(FileNotFoundException filenotfoundexception)
	//* 147  317:astore_2        
		{
			return;
	//  148  318:return          
		}
		xmlpullparser = Xml.newPullParser();
		xmlpullparser.setInput(((java.io.InputStream) (fileinputstream)), "UTF-8");
		i = 0;
_L1:
		if(i == 1 || i == 2)
			break MISSING_BLOCK_LABEL_48;
		i = xmlpullparser.next();
		  goto _L1
		if(!"historical-records".equals(((Object) (xmlpullparser.getName())))) goto _L3; else goto _L2
_L2:
		list = mHistoricalRecords;
		list.clear();
_L8:
		i = xmlpullparser.next();
		if(i != 1) goto _L5; else goto _L4
_L4:
		if(fileinputstream == null) goto _L7; else goto _L6
_L6:
		try
		{
			fileinputstream.close();
			return;
		}
		catch(IOException ioexception)
	//* 149  319:astore_2        
		{
			return;
	//  150  320:return          
		}
_L5:
		if(i != 3 && i != 4) goto _L9; else goto _L8
_L9:
label0:
		{
			if(!"historical-record".equals(((Object) (xmlpullparser.getName()))))
				break label0;
			list.add(((Object) (new HistoricalRecord(xmlpullparser.getAttributeValue(((String) (null)), "activity"), Long.parseLong(xmlpullparser.getAttributeValue(((String) (null)), "time")), Float.parseFloat(xmlpullparser.getAttributeValue(((String) (null)), "weight"))))));
		}
		  goto _L8
		throw new XmlPullParserException("Share records file not well-formed.");
_L3:
		throw new XmlPullParserException("Share records file does not start with historical-records tag.");
		obj;
		break MISSING_BLOCK_LABEL_307;
		obj;
		String s = LOG_TAG;
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("Error reading historical recrod file: ");
		stringbuilder.append(mHistoryFileName);
		Log.e(s, stringbuilder.toString(), ((Throwable) (obj)));
		if(fileinputstream == null)
			break; /* Loop/switch isn't completed */
		  goto _L6
		obj;
		String s1 = LOG_TAG;
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Error reading historical recrod file: ");
		stringbuilder1.append(mHistoryFileName);
		Log.e(s1, stringbuilder1.toString(), ((Throwable) (obj)));
		if(fileinputstream == null) goto _L7; else goto _L6
_L7:
		return;
		if(fileinputstream != null)
			try
			{
				fileinputstream.close();
			}
			catch(IOException ioexception1) { }
	//  151  321:astore_2        
		throw obj;
		  goto _L8
	//* 152  322:goto            315
	}

	private boolean sortActivitiesIfNeeded()
	{
		if(mActivitySorter != null && mIntent != null && !mActivities.isEmpty() && !mHistoricalRecords.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//*   2    4:ifnull          64
	//*   3    7:aload_0         
	//*   4    8:getfield        #181 <Field Intent mIntent>
	//*   5   11:ifnull          64
	//*   6   14:aload_0         
	//*   7   15:getfield        #88  <Field List mActivities>
	//*   8   18:invokeinterface #315 <Method boolean List.isEmpty()>
	//*   9   23:ifne            64
	//*  10   26:aload_0         
	//*  11   27:getfield        #90  <Field List mHistoricalRecords>
	//*  12   30:invokeinterface #315 <Method boolean List.isEmpty()>
	//*  13   35:ifne            64
		{
			mActivitySorter.sort(mIntent, mActivities, Collections.unmodifiableList(mHistoricalRecords));
	//   14   38:aload_0         
	//   15   39:getfield        #95  <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//   16   42:aload_0         
	//   17   43:getfield        #181 <Field Intent mIntent>
	//   18   46:aload_0         
	//   19   47:getfield        #88  <Field List mActivities>
	//   20   50:aload_0         
	//   21   51:getfield        #90  <Field List mHistoricalRecords>
	//   22   54:invokestatic    #321 <Method List Collections.unmodifiableList(List)>
	//   23   57:invokeinterface #327 <Method void ActivityChooserModel$ActivitySorter.sort(Intent, List, List)>
			return true;
	//   24   62:iconst_1        
	//   25   63:ireturn         
		} else
		{
			return false;
	//   26   64:iconst_0        
	//   27   65:ireturn         
		}
	}

	public Intent chooseActivity(int i)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mIntent != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #181 <Field Intent mIntent>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		Object obj1;
		Intent intent;
		ensureConsistentState();
	//   12   18:aload_0         
	//   13   19:invokespecial   #331 <Method void ensureConsistentState()>
		obj1 = ((Object) ((ActivityResolveInfo)mActivities.get(i)));
	//   14   22:aload_0         
	//   15   23:getfield        #88  <Field List mActivities>
	//   16   26:iload_1         
	//   17   27:invokeinterface #201 <Method Object List.get(int)>
	//   18   32:checkcast       #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   19   35:astore_3        
		obj1 = ((Object) (new ComponentName(((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.name)));
	//   20   36:new             #333 <Class ComponentName>
	//   21   39:dup             
	//   22   40:aload_3         
	//   23   41:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   24   44:getfield        #341 <Field ActivityInfo ResolveInfo.activityInfo>
	//   25   47:getfield        #346 <Field String ActivityInfo.packageName>
	//   26   50:aload_3         
	//   27   51:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   28   54:getfield        #341 <Field ActivityInfo ResolveInfo.activityInfo>
	//   29   57:getfield        #349 <Field String ActivityInfo.name>
	//   30   60:invokespecial   #352 <Method void ComponentName(String, String)>
	//   31   63:astore_3        
		intent = new Intent(mIntent);
	//   32   64:new             #354 <Class Intent>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:getfield        #181 <Field Intent mIntent>
	//   36   72:invokespecial   #357 <Method void Intent(Intent)>
	//   37   75:astore          4
		intent.setComponent(((ComponentName) (obj1)));
	//   38   77:aload           4
	//   39   79:aload_3         
	//   40   80:invokevirtual   #361 <Method Intent Intent.setComponent(ComponentName)>
	//   41   83:pop             
		if(mActivityChoserModelPolicy == null)
			break MISSING_BLOCK_LABEL_121;
	//   42   84:aload_0         
	//   43   85:getfield        #363 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
	//   44   88:ifnull          121
		Intent intent1 = new Intent(intent);
	//   45   91:new             #354 <Class Intent>
	//   46   94:dup             
	//   47   95:aload           4
	//   48   97:invokespecial   #357 <Method void Intent(Intent)>
	//   49  100:astore          5
		if(!mActivityChoserModelPolicy.onChooseActivity(this, intent1))
			break MISSING_BLOCK_LABEL_121;
	//   50  102:aload_0         
	//   51  103:getfield        #363 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
	//   52  106:aload_0         
	//   53  107:aload           5
	//   54  109:invokeinterface #369 <Method boolean ActivityChooserModel$OnChooseActivityListener.onChooseActivity(ActivityChooserModel, Intent)>
	//   55  114:ifeq            121
		obj;
	//   56  117:aload_2         
		JVM INSTR monitorexit ;
	//   57  118:monitorexit     
		return null;
	//   58  119:aconst_null     
	//   59  120:areturn         
		addHistoricalRecord(new HistoricalRecord(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
	//   60  121:aload_0         
	//   61  122:new             #238 <Class ActivityChooserModel$HistoricalRecord>
	//   62  125:dup             
	//   63  126:aload_3         
	//   64  127:invokestatic    #375 <Method long System.currentTimeMillis()>
	//   65  130:fconst_1        
	//   66  131:invokespecial   #378 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//   67  134:invokespecial   #380 <Method boolean addHistoricalRecord(ActivityChooserModel$HistoricalRecord)>
	//   68  137:pop             
		obj;
	//   69  138:aload_2         
		JVM INSTR monitorexit ;
	//   70  139:monitorexit     
		return intent;
	//   71  140:aload           4
	//   72  142:areturn         
		exception;
	//   73  143:astore_3        
		obj;
	//   74  144:aload_2         
		JVM INSTR monitorexit ;
	//   75  145:monitorexit     
		throw exception;
	//   76  146:aload_3         
	//   77  147:athrow          
	}

	public ResolveInfo getActivity(int i)
	{
		ResolveInfo resolveinfo;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #331 <Method void ensureConsistentState()>
			resolveinfo = ((ActivityResolveInfo)mActivities.get(i)).resolveInfo;
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field List mActivities>
	//    9   15:iload_1         
	//   10   16:invokeinterface #201 <Method Object List.get(int)>
	//   11   21:checkcast       #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   12   24:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   13   27:astore_3        
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return resolveinfo;
	//   16   30:aload_3         
	//   17   31:areturn         
		exception;
	//   18   32:astore_3        
		obj;
	//   19   33:aload_2         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw exception;
	//   21   35:aload_3         
	//   22   36:athrow          
	}

	public int getActivityCount()
	{
		int i;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #331 <Method void ensureConsistentState()>
			i = mActivities.size();
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field List mActivities>
	//    9   15:invokeinterface #198 <Method int List.size()>
	//   10   20:istore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		exception;
	//   15   25:astore_3        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public int getActivityIndex(ResolveInfo resolveinfo)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mInstanceLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j;
		List list;
		ensureConsistentState();
	//    5    9:aload_0         
	//    6   10:invokespecial   #331 <Method void ensureConsistentState()>
		list = mActivities;
	//    7   13:aload_0         
	//    8   14:getfield        #88  <Field List mActivities>
	//    9   17:astore          5
		j = list.size();
	//   10   19:aload           5
	//   11   21:invokeinterface #198 <Method int List.size()>
	//   12   26:istore_3        
		int i = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_57;
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:icmpge          57
		if(((ActivityResolveInfo)list.get(i)).resolveInfo != resolveinfo)
			break MISSING_BLOCK_LABEL_68;
	//   18   34:aload           5
	//   19   36:iload_2         
	//   20   37:invokeinterface #201 <Method Object List.get(int)>
	//   21   42:checkcast       #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   22   45:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   23   48:aload_1         
	//   24   49:if_acmpne       68
		obj;
	//   25   52:aload           4
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		return i;
	//   27   55:iload_2         
	//   28   56:ireturn         
		obj;
	//   29   57:aload           4
		JVM INSTR monitorexit ;
	//   30   59:monitorexit     
		return -1;
	//   31   60:iconst_m1       
	//   32   61:ireturn         
		resolveinfo;
	//   33   62:astore_1        
		obj;
	//   34   63:aload           4
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		throw resolveinfo;
	//   36   66:aload_1         
	//   37   67:athrow          
		i++;
	//   38   68:iload_2         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_2        
		if(true) goto _L2; else goto _L1
	//   42   72:goto            29
_L1:
	}

	public ResolveInfo getDefaultActivity()
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mInstanceLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ResolveInfo resolveinfo;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #331 <Method void ensureConsistentState()>
		if(mActivities.isEmpty())
			break MISSING_BLOCK_LABEL_44;
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field List mActivities>
	//    9   15:invokeinterface #315 <Method boolean List.isEmpty()>
	//   10   20:ifne            44
		resolveinfo = ((ActivityResolveInfo)mActivities.get(0)).resolveInfo;
	//   11   23:aload_0         
	//   12   24:getfield        #88  <Field List mActivities>
	//   13   27:iconst_0        
	//   14   28:invokeinterface #201 <Method Object List.get(int)>
	//   15   33:checkcast       #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   16   36:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   17   39:astore_2        
	//*  18   40:aload_1         
	//*  19   41:monitorexit     
		return resolveinfo;
	//   20   42:aload_2         
	//   21   43:areturn         
		obj;
	//   22   44:aload_1         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		Exception exception;
		exception;
	//   26   48:astore_2        
		obj;
	//   27   49:aload_1         
		JVM INSTR monitorexit ;
	//   28   50:monitorexit     
		throw exception;
	//   29   51:aload_2         
	//   30   52:athrow          
	}

	public int getHistoryMaxSize()
	{
		int i;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = mHistoryMaxSize;
	//    5    7:aload_0         
	//    6    8:getfield        #97  <Field int mHistoryMaxSize>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return i;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public int getHistorySize()
	{
		int i;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #331 <Method void ensureConsistentState()>
			i = mHistoricalRecords.size();
	//    7   11:aload_0         
	//    8   12:getfield        #90  <Field List mHistoricalRecords>
	//    9   15:invokeinterface #198 <Method int List.size()>
	//   10   20:istore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		exception;
	//   15   25:astore_3        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public Intent getIntent()
	{
		Intent intent;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			intent = mIntent;
	//    5    7:aload_0         
	//    6    8:getfield        #181 <Field Intent mIntent>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return intent;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public void setActivitySorter(ActivitySorter activitysorter)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mActivitySorter != activitysorter)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #95  <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//    7   11:aload_1         
	//    8   12:if_acmpne       18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		mActivitySorter = activitysorter;
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:putfield        #95  <Field ActivityChooserModel$ActivitySorter mActivitySorter>
		if(sortActivitiesIfNeeded())
	//*  15   23:aload_0         
	//*  16   24:invokespecial   #156 <Method boolean sortActivitiesIfNeeded()>
	//*  17   27:ifeq            34
			notifyChanged();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #159 <Method void notifyChanged()>
		obj;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		activitysorter;
	//   23   37:astore_1        
		obj;
	//   24   38:aload_2         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		throw activitysorter;
	//   26   40:aload_1         
	//   27   41:athrow          
	}

	public void setDefaultActivity(int i)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mInstanceLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ActivityResolveInfo activityresolveinfo;
		ActivityResolveInfo activityresolveinfo1;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #331 <Method void ensureConsistentState()>
		activityresolveinfo = (ActivityResolveInfo)mActivities.get(i);
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field List mActivities>
	//    9   15:iload_1         
	//   10   16:invokeinterface #201 <Method Object List.get(int)>
	//   11   21:checkcast       #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   12   24:astore          4
		activityresolveinfo1 = (ActivityResolveInfo)mActivities.get(0);
	//   13   26:aload_0         
	//   14   27:getfield        #88  <Field List mActivities>
	//   15   30:iconst_0        
	//   16   31:invokeinterface #201 <Method Object List.get(int)>
	//   17   36:checkcast       #205 <Class ActivityChooserModel$ActivityResolveInfo>
	//   18   39:astore          5
		if(activityresolveinfo1 == null) goto _L2; else goto _L1
	//   19   41:aload           5
	//   20   43:ifnull          120
_L1:
		float f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
	//   21   46:aload           5
	//   22   48:getfield        #397 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   23   51:aload           4
	//   24   53:getfield        #397 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   25   56:fsub            
	//   26   57:ldc2            #398 <Float 5F>
	//   27   60:fadd            
	//   28   61:fstore_2        
	//*  29   62:goto            65
_L4:
		addHistoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
	//   30   65:aload_0         
	//   31   66:new             #238 <Class ActivityChooserModel$HistoricalRecord>
	//   32   69:dup             
	//   33   70:new             #333 <Class ComponentName>
	//   34   73:dup             
	//   35   74:aload           4
	//   36   76:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   37   79:getfield        #341 <Field ActivityInfo ResolveInfo.activityInfo>
	//   38   82:getfield        #346 <Field String ActivityInfo.packageName>
	//   39   85:aload           4
	//   40   87:getfield        #337 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   41   90:getfield        #341 <Field ActivityInfo ResolveInfo.activityInfo>
	//   42   93:getfield        #349 <Field String ActivityInfo.name>
	//   43   96:invokespecial   #352 <Method void ComponentName(String, String)>
	//   44   99:invokestatic    #375 <Method long System.currentTimeMillis()>
	//   45  102:fload_2         
	//   46  103:invokespecial   #378 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//   47  106:invokespecial   #380 <Method boolean addHistoricalRecord(ActivityChooserModel$HistoricalRecord)>
	//   48  109:pop             
		obj;
	//   49  110:aload_3         
		JVM INSTR monitorexit ;
	//   50  111:monitorexit     
		return;
	//   51  112:return          
		Exception exception;
		exception;
	//   52  113:astore          4
		obj;
	//   53  115:aload_3         
		JVM INSTR monitorexit ;
	//   54  116:monitorexit     
		throw exception;
	//   55  117:aload           4
	//   56  119:athrow          
_L2:
		f = 1.0F;
	//   57  120:fconst_1        
	//   58  121:fstore_2        
		if(true) goto _L4; else goto _L3
	//   59  122:goto            65
_L3:
	}

	public void setHistoryMaxSize(int i)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mHistoryMaxSize != i)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #97  <Field int mHistoryMaxSize>
	//    7   11:iload_1         
	//    8   12:icmpne          18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		mHistoryMaxSize = i;
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:putfield        #97  <Field int mHistoryMaxSize>
		pruneExcessiveHistoricalRecordsIfNeeded();
	//   15   23:aload_0         
	//   16   24:invokespecial   #149 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
		if(sortActivitiesIfNeeded())
	//*  17   27:aload_0         
	//*  18   28:invokespecial   #156 <Method boolean sortActivitiesIfNeeded()>
	//*  19   31:ifeq            38
			notifyChanged();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #159 <Method void notifyChanged()>
		obj;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return;
	//   24   40:return          
		exception;
	//   25   41:astore_3        
		obj;
	//   26   42:aload_2         
		JVM INSTR monitorexit ;
	//   27   43:monitorexit     
		throw exception;
	//   28   44:aload_3         
	//   29   45:athrow          
	}

	public void setIntent(Intent intent)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mIntent != intent)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #181 <Field Intent mIntent>
	//    7   11:aload_1         
	//    8   12:if_acmpne       18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		mIntent = intent;
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:putfield        #181 <Field Intent mIntent>
		mReloadActivities = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #105 <Field boolean mReloadActivities>
		ensureConsistentState();
	//   18   28:aload_0         
	//   19   29:invokespecial   #331 <Method void ensureConsistentState()>
		obj;
	//   20   32:aload_2         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		return;
	//   22   34:return          
		intent;
	//   23   35:astore_1        
		obj;
	//   24   36:aload_2         
		JVM INSTR monitorexit ;
	//   25   37:monitorexit     
		throw intent;
	//   26   38:aload_1         
	//   27   39:athrow          
	}

	public void setOnChooseActivityListener(OnChooseActivityListener onchooseactivitylistener)
	{
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mActivityChoserModelPolicy = onchooseactivitylistener;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #363 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		onchooseactivitylistener;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw onchooseactivitylistener;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	static final String ATTRIBUTE_ACTIVITY = "activity";
	static final String ATTRIBUTE_TIME = "time";
	static final String ATTRIBUTE_WEIGHT = "weight";
	static final boolean DEBUG = false;
	private static final int DEFAULT_ACTIVITY_INFLATION = 5;
	private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1F;
	public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
	public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
	private static final String HISTORY_FILE_EXTENSION = ".xml";
	private static final int INVALID_INDEX = -1;
	static final String LOG_TAG = "ActivityChooserModel";
	static final String TAG_HISTORICAL_RECORD = "historical-record";
	static final String TAG_HISTORICAL_RECORDS = "historical-records";
	private static final Map sDataModelRegistry = new HashMap();
	private static final Object sRegistryLock = new Object();
	private final List mActivities = new ArrayList();
	private OnChooseActivityListener mActivityChoserModelPolicy;
	private ActivitySorter mActivitySorter;
	boolean mCanReadHistoricalData;
	final Context mContext;
	private final List mHistoricalRecords = new ArrayList();
	private boolean mHistoricalRecordsChanged;
	final String mHistoryFileName;
	private int mHistoryMaxSize;
	private final Object mInstanceLock = new Object();
	private Intent mIntent;
	private boolean mReadShareHistoryCalled;
	private boolean mReloadActivities;

	static 
	{
	//    0    0:new             #68  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void Object()>
	//    3    7:putstatic       #73  <Field Object sRegistryLock>
	//    4   10:new             #75  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #76  <Method void HashMap()>
	//    7   17:putstatic       #78  <Field Map sDataModelRegistry>
	//*   8   20:return          
	}

	private class DefaultSorter
		implements ActivitySorter
	{

		public void sort(Intent intent, List list, List list1)
		{
			intent = ((Intent) (mPackageNameToActivityMap));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Map mPackageNameToActivityMap>
		//    2    4:astore_1        
			((Map) (intent)).clear();
		//    3    5:aload_1         
		//    4    6:invokeinterface #28  <Method void Map.clear()>
			int k = list.size();
		//    5   11:aload_2         
		//    6   12:invokeinterface #34  <Method int List.size()>
		//    7   17:istore          7
			for(int i = 0; i < k; i++)
		//*   8   19:iconst_0        
		//*   9   20:istore          6
		//*  10   22:iload           6
		//*  11   24:iload           7
		//*  12   26:icmpge          95
			{
				ActivityResolveInfo activityresolveinfo = (ActivityResolveInfo)list.get(i);
		//   13   29:aload_2         
		//   14   30:iload           6
		//   15   32:invokeinterface #38  <Method Object List.get(int)>
		//   16   37:checkcast       #40  <Class ActivityChooserModel$ActivityResolveInfo>
		//   17   40:astore          8
				activityresolveinfo.weight = 0.0F;
		//   18   42:aload           8
		//   19   44:fconst_0        
		//   20   45:putfield        #43  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
				((Map) (intent)).put(((Object) (new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name))), ((Object) (activityresolveinfo)));
		//   21   48:aload_1         
		//   22   49:new             #45  <Class ComponentName>
		//   23   52:dup             
		//   24   53:aload           8
		//   25   55:getfield        #49  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
		//   26   58:getfield        #55  <Field ActivityInfo ResolveInfo.activityInfo>
		//   27   61:getfield        #61  <Field String ActivityInfo.packageName>
		//   28   64:aload           8
		//   29   66:getfield        #49  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
		//   30   69:getfield        #55  <Field ActivityInfo ResolveInfo.activityInfo>
		//   31   72:getfield        #64  <Field String ActivityInfo.name>
		//   32   75:invokespecial   #67  <Method void ComponentName(String, String)>
		//   33   78:aload           8
		//   34   80:invokeinterface #71  <Method Object Map.put(Object, Object)>
		//   35   85:pop             
			}

		//   36   86:iload           6
		//   37   88:iconst_1        
		//   38   89:iadd            
		//   39   90:istore          6
		//*  40   92:goto            22
			int j = list1.size() - 1;
		//   41   95:aload_3         
		//   42   96:invokeinterface #34  <Method int List.size()>
		//   43  101:iconst_1        
		//   44  102:isub            
		//   45  103:istore          6
			float f1;
			for(float f = 1.0F; j >= 0; f = f1)
		//*  46  105:fconst_1        
		//*  47  106:fstore          4
		//*  48  108:iload           6
		//*  49  110:iflt            190
			{
				HistoricalRecord historicalrecord = (HistoricalRecord)list1.get(j);
		//   50  113:aload_3         
		//   51  114:iload           6
		//   52  116:invokeinterface #38  <Method Object List.get(int)>
		//   53  121:checkcast       #73  <Class ActivityChooserModel$HistoricalRecord>
		//   54  124:astore          8
				ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)((Map) (intent)).get(((Object) (historicalrecord.activity)));
		//   55  126:aload_1         
		//   56  127:aload           8
		//   57  129:getfield        #77  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
		//   58  132:invokeinterface #80  <Method Object Map.get(Object)>
		//   59  137:checkcast       #40  <Class ActivityChooserModel$ActivityResolveInfo>
		//   60  140:astore          9
				f1 = f;
		//   61  142:fload           4
		//   62  144:fstore          5
				if(activityresolveinfo1 != null)
		//*  63  146:aload           9
		//*  64  148:ifnull          177
				{
					activityresolveinfo1.weight = activityresolveinfo1.weight + historicalrecord.weight * f;
		//   65  151:aload           9
		//   66  153:aload           9
		//   67  155:getfield        #43  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
		//   68  158:aload           8
		//   69  160:getfield        #81  <Field float ActivityChooserModel$HistoricalRecord.weight>
		//   70  163:fload           4
		//   71  165:fmul            
		//   72  166:fadd            
		//   73  167:putfield        #43  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
					f1 = f * 0.95F;
		//   74  170:fload           4
		//   75  172:ldc1            #9   <Float 0.95F>
		//   76  174:fmul            
		//   77  175:fstore          5
				}
				j--;
		//   78  177:iload           6
		//   79  179:iconst_1        
		//   80  180:isub            
		//   81  181:istore          6
			}

		//   82  183:fload           5
		//   83  185:fstore          4
		//*  84  187:goto            108
			Collections.sort(list);
		//   85  190:aload_2         
		//   86  191:invokestatic    #86  <Method void Collections.sort(List)>
		//   87  194:return          
		}

		private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
		private final Map mPackageNameToActivityMap = new HashMap();

		DefaultSorter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #17  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void HashMap()>
		//    6   12:putfield        #20  <Field Map mPackageNameToActivityMap>
		//    7   15:return          
		}
	}


	private class ActivityResolveInfo
		implements Comparable
	{

		public int compareTo(ActivityResolveInfo activityresolveinfo)
		{
			return Float.floatToIntBits(activityresolveinfo.weight) - Float.floatToIntBits(weight);
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field float weight>
		//    2    4:invokestatic    #28  <Method int Float.floatToIntBits(float)>
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field float weight>
		//    5   11:invokestatic    #28  <Method int Float.floatToIntBits(float)>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((ActivityResolveInfo)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
		//    3    5:invokevirtual   #31  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
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
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
		//*   9   13:aload_0         
		//*  10   14:invokevirtual   #37  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #37  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((ActivityResolveInfo)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
		//   18   30:astore_1        
			return Float.floatToIntBits(weight) == Float.floatToIntBits(((ActivityResolveInfo) (obj)).weight);
		//   19   31:aload_0         
		//   20   32:getfield        #22  <Field float weight>
		//   21   35:invokestatic    #28  <Method int Float.floatToIntBits(float)>
		//   22   38:aload_1         
		//   23   39:getfield        #22  <Field float weight>
		//   24   42:invokestatic    #28  <Method int Float.floatToIntBits(float)>
		//   25   45:icmpeq          50
		//   26   48:iconst_0        
		//   27   49:ireturn         
		//   28   50:iconst_1        
		//   29   51:ireturn         
		}

		public int hashCode()
		{
			return Float.floatToIntBits(weight) + 31;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field float weight>
		//    2    4:invokestatic    #28  <Method int Float.floatToIntBits(float)>
		//    3    7:bipush          31
		//    4    9:iadd            
		//    5   10:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #43  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #44  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("[");
		//    4    8:aload_1         
		//    5    9:ldc1            #46  <String "[">
		//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append("resolveInfo:");
		//    8   15:aload_1         
		//    9   16:ldc1            #52  <String "resolveInfo:">
		//   10   18:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   11   21:pop             
			stringbuilder.append(resolveInfo.toString());
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #17  <Field ResolveInfo resolveInfo>
		//   15   27:invokevirtual   #56  <Method String ResolveInfo.toString()>
		//   16   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append("; weight:");
		//   18   34:aload_1         
		//   19   35:ldc1            #58  <String "; weight:">
		//   20   37:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   21   40:pop             
			stringbuilder.append(((Object) (new BigDecimal(weight))));
		//   22   41:aload_1         
		//   23   42:new             #60  <Class BigDecimal>
		//   24   45:dup             
		//   25   46:aload_0         
		//   26   47:getfield        #22  <Field float weight>
		//   27   50:f2d             
		//   28   51:invokespecial   #63  <Method void BigDecimal(double)>
		//   29   54:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
		//   30   57:pop             
			stringbuilder.append("]");
		//   31   58:aload_1         
		//   32   59:ldc1            #68  <String "]">
		//   33   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   34   64:pop             
			return stringbuilder.toString();
		//   35   65:aload_1         
		//   36   66:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   37   69:areturn         
		}

		public final ResolveInfo resolveInfo;
		public float weight;

		public ActivityResolveInfo(ResolveInfo resolveinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			resolveInfo = resolveinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field ResolveInfo resolveInfo>
		//    5    9:return          
		}
	}


	private class PersistHistoryAsyncTask extends AsyncTask
	{

		public volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground(aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method Void doInBackground(Object[])>
		//    3    5:areturn         
		}

		public transient Void doInBackground(Object aobj[])
		{
			List list = (List)aobj[0];
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:aaload          
		//    3    3:checkcast       #29  <Class List>
		//    4    6:astore          4
			Object obj1 = ((Object) ((String)aobj[1]));
		//    5    8:aload_1         
		//    6    9:iconst_1        
		//    7   10:aaload          
		//    8   11:checkcast       #31  <Class String>
		//    9   14:astore          5
			int i;
			int j;
			Object obj;
			Object obj2;
			try
			{
				aobj = ((Object []) (mContext.openFileOutput(((String) (obj1)), 0)));
		//   10   16:aload_0         
		//   11   17:getfield        #10  <Field ActivityChooserModel this$0>
		//   12   20:getfield        #37  <Field Context ActivityChooserModel.mContext>
		//   13   23:aload           5
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #43  <Method FileOutputStream Context.openFileOutput(String, int)>
		//   16   29:astore_1        
			}
		//*  17   30:invokestatic    #49  <Method XmlSerializer Xml.newSerializer()>
		//*  18   33:astore          5
		//*  19   35:aload           5
		//*  20   37:aload_1         
		//*  21   38:aconst_null     
		//*  22   39:invokeinterface #55  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
		//*  23   44:aload           5
		//*  24   46:ldc1            #57  <String "UTF-8">
		//*  25   48:iconst_1        
		//*  26   49:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
		//*  27   52:invokeinterface #67  <Method void XmlSerializer.startDocument(String, Boolean)>
		//*  28   57:aload           5
		//*  29   59:aconst_null     
		//*  30   60:ldc1            #69  <String "historical-records">
		//*  31   62:invokeinterface #73  <Method XmlSerializer XmlSerializer.startTag(String, String)>
		//*  32   67:pop             
		//*  33   68:aload           4
		//*  34   70:invokeinterface #77  <Method int List.size()>
		//*  35   75:istore_3        
		//*  36   76:iconst_0        
		//*  37   77:istore_2        
		//*  38   78:iload_2         
		//*  39   79:iload_3         
		//*  40   80:icmpge          182
		//*  41   83:aload           4
		//*  42   85:iconst_0        
		//*  43   86:invokeinterface #81  <Method Object List.remove(int)>
		//*  44   91:checkcast       #83  <Class ActivityChooserModel$HistoricalRecord>
		//*  45   94:astore          6
		//*  46   96:aload           5
		//*  47   98:aconst_null     
		//*  48   99:ldc1            #85  <String "historical-record">
		//*  49  101:invokeinterface #73  <Method XmlSerializer XmlSerializer.startTag(String, String)>
		//*  50  106:pop             
		//*  51  107:aload           5
		//*  52  109:aconst_null     
		//*  53  110:ldc1            #87  <String "activity">
		//*  54  112:aload           6
		//*  55  114:getfield        #90  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
		//*  56  117:invokevirtual   #96  <Method String ComponentName.flattenToString()>
		//*  57  120:invokeinterface #100 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//*  58  125:pop             
		//*  59  126:aload           5
		//*  60  128:aconst_null     
		//*  61  129:ldc1            #102 <String "time">
		//*  62  131:aload           6
		//*  63  133:getfield        #105 <Field long ActivityChooserModel$HistoricalRecord.time>
		//*  64  136:invokestatic    #108 <Method String String.valueOf(long)>
		//*  65  139:invokeinterface #100 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//*  66  144:pop             
		//*  67  145:aload           5
		//*  68  147:aconst_null     
		//*  69  148:ldc1            #110 <String "weight">
		//*  70  150:aload           6
		//*  71  152:getfield        #113 <Field float ActivityChooserModel$HistoricalRecord.weight>
		//*  72  155:invokestatic    #116 <Method String String.valueOf(float)>
		//*  73  158:invokeinterface #100 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//*  74  163:pop             
		//*  75  164:aload           5
		//*  76  166:aconst_null     
		//*  77  167:ldc1            #85  <String "historical-record">
		//*  78  169:invokeinterface #119 <Method XmlSerializer XmlSerializer.endTag(String, String)>
		//*  79  174:pop             
		//*  80  175:iload_2         
		//*  81  176:iconst_1        
		//*  82  177:iadd            
		//*  83  178:istore_2        
		//*  84  179:goto            78
		//*  85  182:aload           5
		//*  86  184:aconst_null     
		//*  87  185:ldc1            #69  <String "historical-records">
		//*  88  187:invokeinterface #119 <Method XmlSerializer XmlSerializer.endTag(String, String)>
		//*  89  192:pop             
		//*  90  193:aload           5
		//*  91  195:invokeinterface #122 <Method void XmlSerializer.endDocument()>
		//*  92  200:aload_0         
		//*  93  201:getfield        #10  <Field ActivityChooserModel this$0>
		//*  94  204:iconst_1        
		//*  95  205:putfield        #126 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		//*  96  208:aload_1         
		//*  97  209:ifnull          418
		//*  98  212:aload_1         
		//*  99  213:invokevirtual   #131 <Method void FileOutputStream.close()>
		//* 100  216:aconst_null     
		//* 101  217:areturn         
		//* 102  218:astore          4
		//* 103  220:goto            420
		//* 104  223:astore          4
		//* 105  225:getstatic       #135 <Field String ActivityChooserModel.LOG_TAG>
		//* 106  228:astore          5
		//* 107  230:new             #137 <Class StringBuilder>
		//* 108  233:dup             
		//* 109  234:invokespecial   #138 <Method void StringBuilder()>
		//* 110  237:astore          6
		//* 111  239:aload           6
		//* 112  241:ldc1            #140 <String "Error writing historical record file: ">
		//* 113  243:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//* 114  246:pop             
		//* 115  247:aload           6
		//* 116  249:aload_0         
		//* 117  250:getfield        #10  <Field ActivityChooserModel this$0>
		//* 118  253:getfield        #147 <Field String ActivityChooserModel.mHistoryFileName>
		//* 119  256:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//* 120  259:pop             
		//* 121  260:aload           5
		//* 122  262:aload           6
		//* 123  264:invokevirtual   #150 <Method String StringBuilder.toString()>
		//* 124  267:aload           4
		//* 125  269:invokestatic    #156 <Method int Log.e(String, String, Throwable)>
		//* 126  272:pop             
		//* 127  273:aload_0         
		//* 128  274:getfield        #10  <Field ActivityChooserModel this$0>
		//* 129  277:iconst_1        
		//* 130  278:putfield        #126 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		//* 131  281:aload_1         
		//* 132  282:ifnull          418
		//* 133  285:goto            212
		//* 134  288:astore          4
		//* 135  290:getstatic       #135 <Field String ActivityChooserModel.LOG_TAG>
		//* 136  293:astore          5
		//* 137  295:new             #137 <Class StringBuilder>
		//* 138  298:dup             
		//* 139  299:invokespecial   #138 <Method void StringBuilder()>
		//* 140  302:astore          6
		//* 141  304:aload           6
		//* 142  306:ldc1            #140 <String "Error writing historical record file: ">
		//* 143  308:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//* 144  311:pop             
		//* 145  312:aload           6
		//* 146  314:aload_0         
		//* 147  315:getfield        #10  <Field ActivityChooserModel this$0>
		//* 148  318:getfield        #147 <Field String ActivityChooserModel.mHistoryFileName>
		//* 149  321:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//* 150  324:pop             
		//* 151  325:aload           5
		//* 152  327:aload           6
		//* 153  329:invokevirtual   #150 <Method String StringBuilder.toString()>
		//* 154  332:aload           4
		//* 155  334:invokestatic    #156 <Method int Log.e(String, String, Throwable)>
		//* 156  337:pop             
		//* 157  338:aload_0         
		//* 158  339:getfield        #10  <Field ActivityChooserModel this$0>
		//* 159  342:iconst_1        
		//* 160  343:putfield        #126 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		//* 161  346:aload_1         
		//* 162  347:ifnull          418
		//* 163  350:goto            212
		//* 164  353:astore          4
		//* 165  355:getstatic       #135 <Field String ActivityChooserModel.LOG_TAG>
		//* 166  358:astore          5
		//* 167  360:new             #137 <Class StringBuilder>
		//* 168  363:dup             
		//* 169  364:invokespecial   #138 <Method void StringBuilder()>
		//* 170  367:astore          6
		//* 171  369:aload           6
		//* 172  371:ldc1            #140 <String "Error writing historical record file: ">
		//* 173  373:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//* 174  376:pop             
		//* 175  377:aload           6
		//* 176  379:aload_0         
		//* 177  380:getfield        #10  <Field ActivityChooserModel this$0>
		//* 178  383:getfield        #147 <Field String ActivityChooserModel.mHistoryFileName>
		//* 179  386:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//* 180  389:pop             
		//* 181  390:aload           5
		//* 182  392:aload           6
		//* 183  394:invokevirtual   #150 <Method String StringBuilder.toString()>
		//* 184  397:aload           4
		//* 185  399:invokestatic    #156 <Method int Log.e(String, String, Throwable)>
		//* 186  402:pop             
		//* 187  403:aload_0         
		//* 188  404:getfield        #10  <Field ActivityChooserModel this$0>
		//* 189  407:iconst_1        
		//* 190  408:putfield        #126 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		//* 191  411:aload_1         
		//* 192  412:ifnull          418
		//* 193  415:goto            212
		//* 194  418:aconst_null     
		//* 195  419:areturn         
		//* 196  420:aload_0         
		//* 197  421:getfield        #10  <Field ActivityChooserModel this$0>
		//* 198  424:iconst_1        
		//* 199  425:putfield        #126 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		//* 200  428:aload_1         
		//* 201  429:ifnull          436
		//* 202  432:aload_1         
		//* 203  433:invokevirtual   #131 <Method void FileOutputStream.close()>
		//* 204  436:aload           4
		//* 205  438:athrow          
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
		//* 206  439:astore_1        
			{
				String s = ActivityChooserModel.LOG_TAG;
		//  207  440:getstatic       #135 <Field String ActivityChooserModel.LOG_TAG>
		//  208  443:astore          4
				StringBuilder stringbuilder = new StringBuilder();
		//  209  445:new             #137 <Class StringBuilder>
		//  210  448:dup             
		//  211  449:invokespecial   #138 <Method void StringBuilder()>
		//  212  452:astore          6
				stringbuilder.append("Error writing historical record file: ");
		//  213  454:aload           6
		//  214  456:ldc1            #140 <String "Error writing historical record file: ">
		//  215  458:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//  216  461:pop             
				stringbuilder.append(((String) (obj1)));
		//  217  462:aload           6
		//  218  464:aload           5
		//  219  466:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
		//  220  469:pop             
				Log.e(s, stringbuilder.toString(), ((Throwable) (aobj)));
		//  221  470:aload           4
		//  222  472:aload           6
		//  223  474:invokevirtual   #150 <Method String StringBuilder.toString()>
		//  224  477:aload_1         
		//  225  478:invokestatic    #156 <Method int Log.e(String, String, Throwable)>
		//  226  481:pop             
				return null;
		//  227  482:aconst_null     
		//  228  483:areturn         
			}
			obj1 = ((Object) (Xml.newSerializer()));
			((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), ((String) (null)));
			((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
			((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-records");
			j = list.size();
			i = 0;
_L2:
			if(i >= j)
				break; /* Loop/switch isn't completed */
			obj2 = ((Object) ((HistoricalRecord)list.remove(0)));
			((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
			((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", ((HistoricalRecord) (obj2)).activity.flattenToString());
			((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(((HistoricalRecord) (obj2)).time));
			((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(((HistoricalRecord) (obj2)).weight));
			((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-record");
			i++;
			if(true) goto _L2; else goto _L1
_L1:
			((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-records");
			((XmlSerializer) (obj1)).endDocument();
			mCanReadHistoricalData = true;
			if(aobj == null) goto _L4; else goto _L3
_L3:
			try
			{
				((FileOutputStream) (aobj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
		//* 229  484:astore_1        
			{
				return null;
		//  230  485:aconst_null     
		//  231  486:areturn         
			}
			return null;
			obj;
			break MISSING_BLOCK_LABEL_420;
			obj;
			obj1 = ((Object) (ActivityChooserModel.LOG_TAG));
			obj2 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj2)).append("Error writing historical record file: ");
			((StringBuilder) (obj2)).append(mHistoryFileName);
			Log.e(((String) (obj1)), ((StringBuilder) (obj2)).toString(), ((Throwable) (obj)));
			mCanReadHistoricalData = true;
			if(aobj == null) goto _L5; else goto _L3
_L5:
			break; /* Loop/switch isn't completed */
			obj;
			obj1 = ((Object) (ActivityChooserModel.LOG_TAG));
			obj2 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj2)).append("Error writing historical record file: ");
			((StringBuilder) (obj2)).append(mHistoryFileName);
			Log.e(((String) (obj1)), ((StringBuilder) (obj2)).toString(), ((Throwable) (obj)));
			mCanReadHistoricalData = true;
			if(aobj == null) goto _L6; else goto _L3
_L6:
			break; /* Loop/switch isn't completed */
			obj;
			obj1 = ((Object) (ActivityChooserModel.LOG_TAG));
			obj2 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj2)).append("Error writing historical record file: ");
			((StringBuilder) (obj2)).append(mHistoryFileName);
			Log.e(((String) (obj1)), ((StringBuilder) (obj2)).toString(), ((Throwable) (obj)));
			mCanReadHistoricalData = true;
			if(aobj == null) goto _L4; else goto _L3
_L4:
			return null;
			mCanReadHistoricalData = true;
			if(aobj != null)
				try
				{
					((FileOutputStream) (aobj)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  232  487:astore_1        
			throw obj;
		//* 233  488:goto            436
		}

		final ActivityChooserModel this$0;

		PersistHistoryAsyncTask()
		{
			this$0 = ActivityChooserModel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field ActivityChooserModel this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void AsyncTask()>
		//    5    9:return          
		}
	}


	private class HistoricalRecord
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
		//*   9   13:aload_0         
		//*  10   14:invokevirtual   #37  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #37  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((HistoricalRecord)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class ActivityChooserModel$HistoricalRecord>
		//   18   30:astore_1        
			ComponentName componentname = activity;
		//   19   31:aload_0         
		//   20   32:getfield        #17  <Field ComponentName activity>
		//   21   35:astore_2        
			if(componentname == null)
		//*  22   36:aload_2         
		//*  23   37:ifnonnull       49
			{
				if(((HistoricalRecord) (obj)).activity != null)
		//*  24   40:aload_1         
		//*  25   41:getfield        #17  <Field ComponentName activity>
		//*  26   44:ifnull          62
					return false;
		//   27   47:iconst_0        
		//   28   48:ireturn         
			} else
			if(!componentname.equals(((Object) (((HistoricalRecord) (obj)).activity))))
		//*  29   49:aload_2         
		//*  30   50:aload_1         
		//*  31   51:getfield        #17  <Field ComponentName activity>
		//*  32   54:invokevirtual   #39  <Method boolean ComponentName.equals(Object)>
		//*  33   57:ifne            62
				return false;
		//   34   60:iconst_0        
		//   35   61:ireturn         
			if(time != ((HistoricalRecord) (obj)).time)
		//*  36   62:aload_0         
		//*  37   63:getfield        #19  <Field long time>
		//*  38   66:aload_1         
		//*  39   67:getfield        #19  <Field long time>
		//*  40   70:lcmp            
		//*  41   71:ifeq            76
				return false;
		//   42   74:iconst_0        
		//   43   75:ireturn         
			return Float.floatToIntBits(weight) == Float.floatToIntBits(((HistoricalRecord) (obj)).weight);
		//   44   76:aload_0         
		//   45   77:getfield        #21  <Field float weight>
		//   46   80:invokestatic    #45  <Method int Float.floatToIntBits(float)>
		//   47   83:aload_1         
		//   48   84:getfield        #21  <Field float weight>
		//   49   87:invokestatic    #45  <Method int Float.floatToIntBits(float)>
		//   50   90:icmpeq          95
		//   51   93:iconst_0        
		//   52   94:ireturn         
		//   53   95:iconst_1        
		//   54   96:ireturn         
		}

		public int hashCode()
		{
			ComponentName componentname = activity;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ComponentName activity>
		//    2    4:astore          4
			int i;
			if(componentname == null)
		//*   3    6:aload           4
		//*   4    8:ifnonnull       16
				i = 0;
		//    5   11:iconst_0        
		//    6   12:istore_1        
			else
		//*   7   13:goto            22
				i = componentname.hashCode();
		//    8   16:aload           4
		//    9   18:invokevirtual   #49  <Method int ComponentName.hashCode()>
		//   10   21:istore_1        
			long l = time;
		//   11   22:aload_0         
		//   12   23:getfield        #19  <Field long time>
		//   13   26:lstore_2        
			return ((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(weight);
		//   14   27:iload_1         
		//   15   28:bipush          31
		//   16   30:iadd            
		//   17   31:bipush          31
		//   18   33:imul            
		//   19   34:lload_2         
		//   20   35:lload_2         
		//   21   36:bipush          32
		//   22   38:lushr           
		//   23   39:lxor            
		//   24   40:l2i             
		//   25   41:iadd            
		//   26   42:bipush          31
		//   27   44:imul            
		//   28   45:aload_0         
		//   29   46:getfield        #21  <Field float weight>
		//   30   49:invokestatic    #45  <Method int Float.floatToIntBits(float)>
		//   31   52:iadd            
		//   32   53:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #53  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #54  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("[");
		//    4    8:aload_1         
		//    5    9:ldc1            #56  <String "[">
		//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append("; activity:");
		//    8   15:aload_1         
		//    9   16:ldc1            #62  <String "; activity:">
		//   10   18:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   11   21:pop             
			stringbuilder.append(((Object) (activity)));
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #17  <Field ComponentName activity>
		//   15   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   16   30:pop             
			stringbuilder.append("; time:");
		//   17   31:aload_1         
		//   18   32:ldc1            #67  <String "; time:">
		//   19   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   20   37:pop             
			stringbuilder.append(time);
		//   21   38:aload_1         
		//   22   39:aload_0         
		//   23   40:getfield        #19  <Field long time>
		//   24   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(long)>
		//   25   46:pop             
			stringbuilder.append("; weight:");
		//   26   47:aload_1         
		//   27   48:ldc1            #72  <String "; weight:">
		//   28   50:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   29   53:pop             
			stringbuilder.append(((Object) (new BigDecimal(weight))));
		//   30   54:aload_1         
		//   31   55:new             #74  <Class BigDecimal>
		//   32   58:dup             
		//   33   59:aload_0         
		//   34   60:getfield        #21  <Field float weight>
		//   35   63:f2d             
		//   36   64:invokespecial   #77  <Method void BigDecimal(double)>
		//   37   67:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   38   70:pop             
			stringbuilder.append("]");
		//   39   71:aload_1         
		//   40   72:ldc1            #79  <String "]">
		//   41   74:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   42   77:pop             
			return stringbuilder.toString();
		//   43   78:aload_1         
		//   44   79:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   45   82:areturn         
		}

		public final ComponentName activity;
		public final long time;
		public final float weight;

		public HistoricalRecord(ComponentName componentname, long l, float f)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			activity = componentname;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field ComponentName activity>
			time = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #19  <Field long time>
			weight = f;
		//    8   14:aload_0         
		//    9   15:fload           4
		//   10   17:putfield        #21  <Field float weight>
		//   11   20:return          
		}

		public HistoricalRecord(String s, long l, float f)
		{
			this(ComponentName.unflattenFromString(s), l, f);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #29  <Method ComponentName ComponentName.unflattenFromString(String)>
		//    3    5:lload_2         
		//    4    6:fload           4
		//    5    8:invokespecial   #31  <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
		//    6   11:return          
		}
	}


	private class ActivitySorter
	{

		public abstract void sort(Intent intent, List list, List list1);
	}


	private class OnChooseActivityListener
	{

		public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
	}

}
