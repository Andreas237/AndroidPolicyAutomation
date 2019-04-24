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

final class ActivityChooserModel$PersistHistoryAsyncTask extends AsyncTask
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
		List list;
		Object obj1;
		list = (List)aobj[0];
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:checkcast       #33  <Class List>
	//    4    6:astore          4
		obj1 = ((Object) ((String)aobj[1]));
	//    5    8:aload_1         
	//    6    9:iconst_1        
	//    7   10:aaload          
	//    8   11:checkcast       #35  <Class String>
	//    9   14:astore          5
		try
		{
			aobj = ((Object []) (mContext.openFileOutput(((String) (obj1)), 0)));
	//   10   16:aload_0         
	//   11   17:getfield        #14  <Field ActivityChooserModel this$0>
	//   12   20:getfield        #39  <Field Context ActivityChooserModel.mContext>
	//   13   23:aload           5
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #45  <Method FileOutputStream Context.openFileOutput(String, int)>
	//   16   29:astore_1        
		}
	//*  17   30:goto            64
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//*  18   33:astore_1        
		{
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
	//   19   34:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
	//   20   37:new             #51  <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #52  <Method void StringBuilder()>
	//   23   44:ldc1            #54  <String "Error writing historical record file: ">
	//   24   46:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:aload           5
	//   26   51:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   28   57:aload_1         
	//   29   58:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
	//   30   61:pop             
			return null;
	//   31   62:aconst_null     
	//   32   63:areturn         
		}
		obj1 = ((Object) (Xml.newSerializer()));
	//   33   64:invokestatic    #74  <Method XmlSerializer Xml.newSerializer()>
	//   34   67:astore          5
		int j;
		((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), ((String) (null)));
	//   35   69:aload           5
	//   36   71:aload_1         
	//   37   72:aconst_null     
	//   38   73:invokeinterface #80  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
		((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
	//   39   78:aload           5
	//   40   80:ldc1            #82  <String "UTF-8">
	//   41   82:iconst_1        
	//   42   83:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
	//   43   86:invokeinterface #92  <Method void XmlSerializer.startDocument(String, Boolean)>
		((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-records");
	//   44   91:aload           5
	//   45   93:aconst_null     
	//   46   94:ldc1            #94  <String "historical-records">
	//   47   96:invokeinterface #98  <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//   48  101:pop             
		j = list.size();
	//   49  102:aload           4
	//   50  104:invokeinterface #102 <Method int List.size()>
	//   51  109:istore_3        
		int i = 0;
	//   52  110:iconst_0        
	//   53  111:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   54  112:iload_2         
	//   55  113:iload_3         
	//   56  114:icmpge          216
		ActivityChooserModel.HistoricalRecord historicalrecord = (ActivityChooserModel.HistoricalRecord)list.remove(0);
	//   57  117:aload           4
	//   58  119:iconst_0        
	//   59  120:invokeinterface #106 <Method Object List.remove(int)>
	//   60  125:checkcast       #108 <Class ActivityChooserModel$HistoricalRecord>
	//   61  128:astore          6
		((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
	//   62  130:aload           5
	//   63  132:aconst_null     
	//   64  133:ldc1            #110 <String "historical-record">
	//   65  135:invokeinterface #98  <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//   66  140:pop             
		((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", historicalrecord.activity.flattenToString());
	//   67  141:aload           5
	//   68  143:aconst_null     
	//   69  144:ldc1            #112 <String "activity">
	//   70  146:aload           6
	//   71  148:getfield        #115 <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
	//   72  151:invokevirtual   #120 <Method String ComponentName.flattenToString()>
	//   73  154:invokeinterface #124 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   74  159:pop             
		((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(historicalrecord.time));
	//   75  160:aload           5
	//   76  162:aconst_null     
	//   77  163:ldc1            #126 <String "time">
	//   78  165:aload           6
	//   79  167:getfield        #129 <Field long ActivityChooserModel$HistoricalRecord.time>
	//   80  170:invokestatic    #132 <Method String String.valueOf(long)>
	//   81  173:invokeinterface #124 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   82  178:pop             
		((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(historicalrecord.weight));
	//   83  179:aload           5
	//   84  181:aconst_null     
	//   85  182:ldc1            #134 <String "weight">
	//   86  184:aload           6
	//   87  186:getfield        #137 <Field float ActivityChooserModel$HistoricalRecord.weight>
	//   88  189:invokestatic    #140 <Method String String.valueOf(float)>
	//   89  192:invokeinterface #124 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//   90  197:pop             
		((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-record");
	//   91  198:aload           5
	//   92  200:aconst_null     
	//   93  201:ldc1            #110 <String "historical-record">
	//   94  203:invokeinterface #143 <Method XmlSerializer XmlSerializer.endTag(String, String)>
	//   95  208:pop             
		i++;
	//   96  209:iload_2         
	//   97  210:iconst_1        
	//   98  211:iadd            
	//   99  212:istore_2        
		if(true) goto _L2; else goto _L1
	//  100  213:goto            112
_L1:
		((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-records");
	//  101  216:aload           5
	//  102  218:aconst_null     
	//  103  219:ldc1            #94  <String "historical-records">
	//  104  221:invokeinterface #143 <Method XmlSerializer XmlSerializer.endTag(String, String)>
	//  105  226:pop             
		((XmlSerializer) (obj1)).endDocument();
	//  106  227:aload           5
	//  107  229:invokeinterface #146 <Method void XmlSerializer.endDocument()>
		mCanReadHistoricalData = true;
	//  108  234:aload_0         
	//  109  235:getfield        #14  <Field ActivityChooserModel this$0>
	//  110  238:iconst_1        
	//  111  239:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 112  242:aload_1         
	//* 113  243:ifnull          459
			try
			{
				((FileOutputStream) (aobj)).close();
	//  114  246:aload_1         
	//  115  247:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 116  250:goto            459
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  117  253:astore_1        
		break MISSING_BLOCK_LABEL_459;
	//  118  254:goto            459
		Object obj;
		obj;
	//  119  257:astore          4
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
	//  120  259:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
	//  121  262:new             #51  <Class StringBuilder>
	//  122  265:dup             
	//  123  266:invokespecial   #52  <Method void StringBuilder()>
	//  124  269:ldc1            #54  <String "Error writing historical record file: ">
	//  125  271:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  126  274:aload_0         
	//  127  275:getfield        #14  <Field ActivityChooserModel this$0>
	//  128  278:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//  129  281:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  130  284:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  131  287:aload           4
	//  132  289:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
	//  133  292:pop             
		mCanReadHistoricalData = true;
	//  134  293:aload_0         
	//  135  294:getfield        #14  <Field ActivityChooserModel this$0>
	//  136  297:iconst_1        
	//  137  298:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 138  301:aload_1         
	//* 139  302:ifnull          459
			try
			{
				((FileOutputStream) (aobj)).close();
	//  140  305:aload_1         
	//  141  306:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 142  309:goto            459
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  143  312:astore_1        
		break MISSING_BLOCK_LABEL_459;
	//  144  313:goto            459
		obj;
	//  145  316:astore          4
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
	//  146  318:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
	//  147  321:new             #51  <Class StringBuilder>
	//  148  324:dup             
	//  149  325:invokespecial   #52  <Method void StringBuilder()>
	//  150  328:ldc1            #54  <String "Error writing historical record file: ">
	//  151  330:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  152  333:aload_0         
	//  153  334:getfield        #14  <Field ActivityChooserModel this$0>
	//  154  337:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//  155  340:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  156  343:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  157  346:aload           4
	//  158  348:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
	//  159  351:pop             
		mCanReadHistoricalData = true;
	//  160  352:aload_0         
	//  161  353:getfield        #14  <Field ActivityChooserModel this$0>
	//  162  356:iconst_1        
	//  163  357:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 164  360:aload_1         
	//* 165  361:ifnull          459
			try
			{
				((FileOutputStream) (aobj)).close();
	//  166  364:aload_1         
	//  167  365:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 168  368:goto            459
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  169  371:astore_1        
		break MISSING_BLOCK_LABEL_459;
	//  170  372:goto            459
		obj;
	//  171  375:astore          4
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
	//  172  377:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
	//  173  380:new             #51  <Class StringBuilder>
	//  174  383:dup             
	//  175  384:invokespecial   #52  <Method void StringBuilder()>
	//  176  387:ldc1            #54  <String "Error writing historical record file: ">
	//  177  389:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  178  392:aload_0         
	//  179  393:getfield        #14  <Field ActivityChooserModel this$0>
	//  180  396:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//  181  399:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  182  402:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  183  405:aload           4
	//  184  407:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
	//  185  410:pop             
		mCanReadHistoricalData = true;
	//  186  411:aload_0         
	//  187  412:getfield        #14  <Field ActivityChooserModel this$0>
	//  188  415:iconst_1        
	//  189  416:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 190  419:aload_1         
	//* 191  420:ifnull          459
			try
			{
				((FileOutputStream) (aobj)).close();
	//  192  423:aload_1         
	//  193  424:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 194  427:goto            459
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  195  430:astore_1        
		break MISSING_BLOCK_LABEL_459;
	//  196  431:goto            459
		obj;
	//  197  434:astore          4
		mCanReadHistoricalData = true;
	//  198  436:aload_0         
	//  199  437:getfield        #14  <Field ActivityChooserModel this$0>
	//  200  440:iconst_1        
	//  201  441:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
		if(aobj != null)
	//* 202  444:aload_1         
	//* 203  445:ifnull          456
			try
			{
				((FileOutputStream) (aobj)).close();
	//  204  448:aload_1         
	//  205  449:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 206  452:goto            456
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  207  455:astore_1        
		throw obj;
	//  208  456:aload           4
	//  209  458:athrow          
		return null;
	//  210  459:aconst_null     
	//  211  460:areturn         
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
