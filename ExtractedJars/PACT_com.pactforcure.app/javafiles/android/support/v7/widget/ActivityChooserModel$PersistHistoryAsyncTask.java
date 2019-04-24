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
		Object obj1;
		List list = (List)aobj[0];
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
		int i;
		int j;
		ActivityChooserModel.HistoricalRecord historicalrecord;
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
	//*  17   30:invokestatic    #51  <Method XmlSerializer Xml.newSerializer()>
	//*  18   33:astore          5
	//*  19   35:aload           5
	//*  20   37:aload_1         
	//*  21   38:aconst_null     
	//*  22   39:invokeinterface #57  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
	//*  23   44:aload           5
	//*  24   46:ldc1            #59  <String "UTF-8">
	//*  25   48:iconst_1        
	//*  26   49:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
	//*  27   52:invokeinterface #69  <Method void XmlSerializer.startDocument(String, Boolean)>
	//*  28   57:aload           5
	//*  29   59:aconst_null     
	//*  30   60:ldc1            #71  <String "historical-records">
	//*  31   62:invokeinterface #75  <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//*  32   67:pop             
	//*  33   68:aload           4
	//*  34   70:invokeinterface #79  <Method int List.size()>
	//*  35   75:istore_3        
	//*  36   76:iconst_0        
	//*  37   77:istore_2        
	//*  38   78:iload_2         
	//*  39   79:iload_3         
	//*  40   80:icmpge          213
	//*  41   83:aload           4
	//*  42   85:iconst_0        
	//*  43   86:invokeinterface #83  <Method Object List.remove(int)>
	//*  44   91:checkcast       #85  <Class ActivityChooserModel$HistoricalRecord>
	//*  45   94:astore          6
	//*  46   96:aload           5
	//*  47   98:aconst_null     
	//*  48   99:ldc1            #87  <String "historical-record">
	//*  49  101:invokeinterface #75  <Method XmlSerializer XmlSerializer.startTag(String, String)>
	//*  50  106:pop             
	//*  51  107:aload           5
	//*  52  109:aconst_null     
	//*  53  110:ldc1            #89  <String "activity">
	//*  54  112:aload           6
	//*  55  114:getfield        #92  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
	//*  56  117:invokevirtual   #98  <Method String ComponentName.flattenToString()>
	//*  57  120:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//*  58  125:pop             
	//*  59  126:aload           5
	//*  60  128:aconst_null     
	//*  61  129:ldc1            #104 <String "time">
	//*  62  131:aload           6
	//*  63  133:getfield        #107 <Field long ActivityChooserModel$HistoricalRecord.time>
	//*  64  136:invokestatic    #110 <Method String String.valueOf(long)>
	//*  65  139:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//*  66  144:pop             
	//*  67  145:aload           5
	//*  68  147:aconst_null     
	//*  69  148:ldc1            #112 <String "weight">
	//*  70  150:aload           6
	//*  71  152:getfield        #115 <Field float ActivityChooserModel$HistoricalRecord.weight>
	//*  72  155:invokestatic    #118 <Method String String.valueOf(float)>
	//*  73  158:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
	//*  74  163:pop             
	//*  75  164:aload           5
	//*  76  166:aconst_null     
	//*  77  167:ldc1            #87  <String "historical-record">
	//*  78  169:invokeinterface #121 <Method XmlSerializer XmlSerializer.endTag(String, String)>
	//*  79  174:pop             
	//*  80  175:iload_2         
	//*  81  176:iconst_1        
	//*  82  177:iadd            
	//*  83  178:istore_2        
	//*  84  179:goto            78
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//*  85  182:astore_1        
		{
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
			return null;
	//   98  211:aconst_null     
	//   99  212:areturn         
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
		historicalrecord = (ActivityChooserModel.HistoricalRecord)list.remove(0);
		((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
		((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", historicalrecord.activity.flattenToString());
		((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(historicalrecord.time));
		((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(historicalrecord.weight));
		((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-record");
		i++;
		if(true) goto _L2; else goto _L1
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
		Object obj;
		if(aobj != null)
	//* 111  239:aload_1         
	//* 112  240:ifnull          247
			try
			{
				((FileOutputStream) (aobj)).close();
	//  113  243:aload_1         
	//  114  244:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
	//* 115  247:aconst_null     
	//* 116  248:areturn         
	//* 117  249:astore          4
	//* 118  251:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//* 119  254:new             #127 <Class StringBuilder>
	//* 120  257:dup             
	//* 121  258:invokespecial   #128 <Method void StringBuilder()>
	//* 122  261:ldc1            #130 <String "Error writing historical record file: ">
	//* 123  263:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//* 124  266:aload_0         
	//* 125  267:getfield        #14  <Field ActivityChooserModel this$0>
	//* 126  270:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//* 127  273:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//* 128  276:invokevirtual   #137 <Method String StringBuilder.toString()>
	//* 129  279:aload           4
	//* 130  281:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 131  284:pop             
	//* 132  285:aload_0         
	//* 133  286:getfield        #14  <Field ActivityChooserModel this$0>
	//* 134  289:iconst_1        
	//* 135  290:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
	//* 136  293:aload_1         
	//* 137  294:ifnull          247
	//* 138  297:aload_1         
	//* 139  298:invokevirtual   #155 <Method void FileOutputStream.close()>
	//* 140  301:goto            247
	//* 141  304:astore_1        
	//* 142  305:goto            247
	//* 143  308:astore          4
	//* 144  310:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//* 145  313:new             #127 <Class StringBuilder>
	//* 146  316:dup             
	//* 147  317:invokespecial   #128 <Method void StringBuilder()>
	//* 148  320:ldc1            #130 <String "Error writing historical record file: ">
	//* 149  322:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//* 150  325:aload_0         
	//* 151  326:getfield        #14  <Field ActivityChooserModel this$0>
	//* 152  329:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//* 153  332:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//* 154  335:invokevirtual   #137 <Method String StringBuilder.toString()>
	//* 155  338:aload           4
	//* 156  340:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 157  343:pop             
	//* 158  344:aload_0         
	//* 159  345:getfield        #14  <Field ActivityChooserModel this$0>
	//* 160  348:iconst_1        
	//* 161  349:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
	//* 162  352:aload_1         
	//* 163  353:ifnull          247
	//* 164  356:aload_1         
	//* 165  357:invokevirtual   #155 <Method void FileOutputStream.close()>
	//* 166  360:goto            247
	//* 167  363:astore_1        
	//* 168  364:goto            247
	//* 169  367:astore          4
	//* 170  369:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
	//* 171  372:new             #127 <Class StringBuilder>
	//* 172  375:dup             
	//* 173  376:invokespecial   #128 <Method void StringBuilder()>
	//* 174  379:ldc1            #130 <String "Error writing historical record file: ">
	//* 175  381:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//* 176  384:aload_0         
	//* 177  385:getfield        #14  <Field ActivityChooserModel this$0>
	//* 178  388:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
	//* 179  391:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//* 180  394:invokevirtual   #137 <Method String StringBuilder.toString()>
	//* 181  397:aload           4
	//* 182  399:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 183  402:pop             
	//* 184  403:aload_0         
	//* 185  404:getfield        #14  <Field ActivityChooserModel this$0>
	//* 186  407:iconst_1        
	//* 187  408:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
	//* 188  411:aload_1         
	//* 189  412:ifnull          247
	//* 190  415:aload_1         
	//* 191  416:invokevirtual   #155 <Method void FileOutputStream.close()>
	//* 192  419:goto            247
	//* 193  422:astore_1        
	//* 194  423:goto            247
	//* 195  426:astore          4
	//* 196  428:aload_0         
	//* 197  429:getfield        #14  <Field ActivityChooserModel this$0>
	//* 198  432:iconst_1        
	//* 199  433:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
	//* 200  436:aload_1         
	//* 201  437:ifnull          444
	//* 202  440:aload_1         
	//* 203  441:invokevirtual   #155 <Method void FileOutputStream.close()>
	//* 204  444:aload           4
	//* 205  446:athrow          
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  206  447:astore_1        
		return null;
		obj;
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		mCanReadHistoricalData = true;
		if(aobj != null)
			try
			{
				((FileOutputStream) (aobj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
		continue; /* Loop/switch isn't completed */
		obj;
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		mCanReadHistoricalData = true;
		if(aobj != null)
			try
			{
				((FileOutputStream) (aobj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
		continue; /* Loop/switch isn't completed */
		obj;
		Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		mCanReadHistoricalData = true;
		if(aobj != null)
			try
			{
				((FileOutputStream) (aobj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
		if(true) goto _L4; else goto _L3
_L3:
		break MISSING_BLOCK_LABEL_425;
_L4:
		break MISSING_BLOCK_LABEL_247;
		obj;
		mCanReadHistoricalData = true;
		if(aobj != null)
			try
			{
				((FileOutputStream) (aobj)).close();
			}
	//* 207  448:goto            247
			// Misplaced declaration of an exception variable
			catch(Object aobj[]) { }
	//  208  451:astore_1        
		throw obj;
	//* 209  452:goto            444
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
