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
		obj2 = ((Object) ((ActivityChooserModel.HistoricalRecord)list.remove(0)));
		((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
		((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", ((ActivityChooserModel.HistoricalRecord) (obj2)).activity.flattenToString());
		((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(((ActivityChooserModel.HistoricalRecord) (obj2)).time));
		((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(((ActivityChooserModel.HistoricalRecord) (obj2)).weight));
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

	ActivityChooserModel$PersistHistoryAsyncTask()
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
