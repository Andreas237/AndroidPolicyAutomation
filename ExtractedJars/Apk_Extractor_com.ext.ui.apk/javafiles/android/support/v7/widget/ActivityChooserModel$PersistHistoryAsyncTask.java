// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.*;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserModel

private final class ActivityChooserModel$PersistHistoryAsyncTask extends AsyncTask
{

	public volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground(aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #23  <Method Void doInBackground(Object[])>
	//    3    5:areturn         
	}

	public transient Void doInBackground(Object aobj[])
	{
		int i;
		List list;
		Object obj1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		list = (List)aobj[0];
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:aaload          
	//    5    5:checkcast       #33  <Class List>
	//    6    8:astore          4
		obj1 = ((Object) ((String)aobj[1]));
	//    7   10:aload_1         
	//    8   11:iconst_1        
	//    9   12:aaload          
	//   10   13:checkcast       #35  <Class String>
	//   11   16:astore          5
		aobj = ((Object []) (mContext.openFileOutput(((String) (obj1)), 0)));
	//   12   18:aload_0         
	//   13   19:getfield        #14  <Field ActivityChooserModel this$0>
	//   14   22:getfield        #39  <Field Context ActivityChooserModel.mContext>
	//   15   25:aload           5
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #45  <Method FileOutputStream Context.openFileOutput(String, int)>
	//   18   31:astore_1        
		obj1 = ((Object) (Xml.newSerializer()));
	//   19   32:invokestatic    #51  <Method XmlSerializer Xml.newSerializer()>
	//   20   35:astore          5
		int j;
		((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), ((String) (null)));
	//   21   37:aload           5
	//   22   39:aload_1         
	//   23   40:aconst_null     
	//   24   41:invokeinterface #57  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
		((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
	//   25   46:aload           5
	//   26   48:ldc1            #59  <String "UTF-8">
	//   27   50:iconst_1        
	//   28   51:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
	//   29   54:invokeinterface #69  <Method void XmlSerializer.startDocument(String, Boolean)>
		((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-records");
	//   30   59:aload           5
	//   31   61:aconst_null     
	//   32   62:ldc1            #71  <String "historical-records">
	//   33   64:invokeinterface #75  <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//   34   69:pop             
		j = list.size();
	//   35   70:aload           4
	//   36   72:invokeinterface #79  <Method int List.size()>
	//   37   77:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   38   78:iload_2         
	//   39   79:iload_3         
	//   40   80:icmpge          213
		ActivityChooserModel.HistoricalRecord historicalrecord = (ActivityChooserModel.HistoricalRecord)list.remove(0);
	//   41   83:aload           4
	//   42   85:iconst_0        
	//   43   86:invokeinterface #83  <Method Object List.remove(int)>
	//   44   91:checkcast       #85  <Class ActivityChooserModel$HistoricalRecord>
	//   45   94:astore          6
		((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
	//   46   96:aload           5
	//   47   98:aconst_null     
	//   48   99:ldc1            #87  <String "historical-record">
	//   49  101:invokeinterface #75  <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//   50  106:pop             
		((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", historicalrecord.activity.flattenToString());
	//   51  107:aload           5
	//   52  109:aconst_null     
	//   53  110:ldc1            #89  <String "activity">
	//   54  112:aload           6
	//   55  114:getfield        #92  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
	//   56  117:invokevirtual   #98  <Method String ComponentName.flattenToString()>
	//   57  120:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   58  125:pop             
		((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(historicalrecord.time));
	//   59  126:aload           5
	//   60  128:aconst_null     
	//   61  129:ldc1            #104 <String "time">
	//   62  131:aload           6
	//   63  133:getfield        #107 <Field long ActivityChooserModel$HistoricalRecord.time>
	//   64  136:invokestatic    #110 <Method String String.valueOf(long)>
	//   65  139:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   66  144:pop             
		((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(historicalrecord.weight));
	//   67  145:aload           5
	//   68  147:aconst_null     
	//   69  148:ldc1            #112 <String "weight">
	//   70  150:aload           6
	//   71  152:getfield        #115 <Field float ActivityChooserModel$HistoricalRecord.weight>
	//   72  155:invokestatic    #118 <Method String String.valueOf(float)>
	//   73  158:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   74  163:pop             
		((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-record");
	//   75  164:aload           5
	//   76  166:aconst_null     
	//   77  167:ldc1            #87  <String "historical-record">
	//   78  169:invokeinterface #121 <Method XmlSerializer XmlSerializer.endTag(String, String)>
	//   79  174:pop             
		i++;
	//   80  175:iload_2         
	//   81  176:iconst_1        
	//   82  177:iadd            
	//   83  178:istore_2        
		if(true) goto _L2; else goto _L1
	//   84  179:goto            78
		aobj;
	//   85  182:astore_1        
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
	//   86  183:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//   87  186:new             #127 <Class StringBuilder>
	//   88  189:dup             
	//   89  190:invokespecial   #128 <Method void StringBuilder()>
	//   90  193:ldc1            #130 <String "Error writing historical record file: ">
	//   91  195:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   92  198:aload           5
	//   93  200:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   94  203:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   95  206:aload_1         
	//   96  207:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//   97  210:pop             
_L3:
		return null;
	//   98  211:aconst_null     
	//   99  212:areturn         
_L1:
		((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-records");
	//  100  213:aload           5
	//  101  215:aconst_null     
	//  102  216:ldc1            #71  <String "historical-records">
	//  103  218:invokeinterface #121 <Method XmlSerializer XmlSerializer.endTag(String, String)>
	//  104  223:pop             
		((XmlSerializer) (obj1)).endDocument();
	//  105  224:aload           5
	//  106  226:invokeinterface #146 <Method void XmlSerializer.endDocument()>
		mCanReadHistoricalData = true;
	//  107  231:aload_0         
	//  108  232:getfield        #14  <Field ActivityChooserModel this$0>
	//  109  235:iconst_1        
	//  110  236:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 111  239:aload_1         
	//* 112  240:ifnull          211
		{
			try
			{
				((FileOutputStream) (aobj)).close();
	//  113  243:aload_1         
	//  114  244:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 115  247:aconst_null     
	//* 116  248:areturn         
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//* 117  249:astore_1        
			{
				return null;
	//  118  250:aconst_null     
	//  119  251:areturn         
			}
			return null;
		}
		  goto _L3
		Object obj;
		obj;
	//  120  252:astore          4
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
	//  121  254:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//  122  257:new             #127 <Class StringBuilder>
	//  123  260:dup             
	//  124  261:invokespecial   #128 <Method void StringBuilder()>
	//  125  264:ldc1            #130 <String "Error writing historical record file: ">
	//  126  266:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  127  269:aload_0         
	//  128  270:getfield        #14  <Field ActivityChooserModel this$0>
	//  129  273:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//  130  276:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  131  279:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  132  282:aload           4
	//  133  284:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//  134  287:pop             
		mCanReadHistoricalData = true;
	//  135  288:aload_0         
	//  136  289:getfield        #14  <Field ActivityChooserModel this$0>
	//  137  292:iconst_1        
	//  138  293:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 139  296:aload_1         
	//* 140  297:ifnull          211
		{
			try
			{
				((FileOutputStream) (aobj)).close();
	//  141  300:aload_1         
	//  142  301:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 143  304:aconst_null     
	//* 144  305:areturn         
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//* 145  306:astore_1        
			{
				return null;
	//  146  307:aconst_null     
	//  147  308:areturn         
			}
			return null;
		}
		  goto _L3
		obj;
	//  148  309:astore          4
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
	//  149  311:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//  150  314:new             #127 <Class StringBuilder>
	//  151  317:dup             
	//  152  318:invokespecial   #128 <Method void StringBuilder()>
	//  153  321:ldc1            #130 <String "Error writing historical record file: ">
	//  154  323:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  155  326:aload_0         
	//  156  327:getfield        #14  <Field ActivityChooserModel this$0>
	//  157  330:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//  158  333:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  159  336:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  160  339:aload           4
	//  161  341:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//  162  344:pop             
		mCanReadHistoricalData = true;
	//  163  345:aload_0         
	//  164  346:getfield        #14  <Field ActivityChooserModel this$0>
	//  165  349:iconst_1        
	//  166  350:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 167  353:aload_1         
	//* 168  354:ifnull          211
		{
			try
			{
				((FileOutputStream) (aobj)).close();
	//  169  357:aload_1         
	//  170  358:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 171  361:aconst_null     
	//* 172  362:areturn         
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//* 173  363:astore_1        
			{
				return null;
	//  174  364:aconst_null     
	//  175  365:areturn         
			}
			return null;
		}
		  goto _L3
		obj;
	//  176  366:astore          4
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
	//  177  368:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//  178  371:new             #127 <Class StringBuilder>
	//  179  374:dup             
	//  180  375:invokespecial   #128 <Method void StringBuilder()>
	//  181  378:ldc1            #130 <String "Error writing historical record file: ">
	//  182  380:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  183  383:aload_0         
	//  184  384:getfield        #14  <Field ActivityChooserModel this$0>
	//  185  387:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//  186  390:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  187  393:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  188  396:aload           4
	//  189  398:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//  190  401:pop             
		mCanReadHistoricalData = true;
	//  191  402:aload_0         
	//  192  403:getfield        #14  <Field ActivityChooserModel this$0>
	//  193  406:iconst_1        
	//  194  407:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj == null) goto _L3; else goto _L4
	//  195  410:aload_1         
	//  196  411:ifnull          211
_L4:
		try
		{
			((FileOutputStream) (aobj)).close();
	//  197  414:aload_1         
	//  198  415:invokevirtual   #155 <Method void FileOutputStream.close()>
		}
	//* 199  418:aconst_null     
	//* 200  419:areturn         
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//* 201  420:astore_1        
		{
			return null;
	//  202  421:aconst_null     
	//  203  422:areturn         
		}
		return null;
		obj;
	//  204  423:astore          4
		mCanReadHistoricalData = true;
	//  205  425:aload_0         
	//  206  426:getfield        #14  <Field ActivityChooserModel this$0>
	//  207  429:iconst_1        
	//  208  430:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 209  433:aload_1         
	//* 210  434:ifnull          441
			try
			{
				((FileOutputStream) (aobj)).close();
	//  211  437:aload_1         
	//  212  438:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 213  441:aload           4
	//* 214  443:athrow          
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  215  444:astore_1        
		throw obj;
	//* 216  445:goto            441
	}

	final ActivityChooserModel this$0;

	ActivityChooserModel$PersistHistoryAsyncTask()
	{
		this$0 = ActivityChooserModel.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActivityChooserModel this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AsyncTask()>
	//    5    9:return          
	}
}
