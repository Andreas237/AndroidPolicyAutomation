// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.task.TaskExecutor;
import java.util.*;
import javax.net.ssl.SSLException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.comscore.utils:
//			Storage, FileUtils, Date, Connectivity, 
//			CSLog, Utils, TransmissionMode, XMLBuilder, 
//			Permissions, c

public class OfflineMeasurementsCache
{

	public OfflineMeasurementsCache(Core core)
	{
		this(core, "cs_cache_");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #27  <String "cs_cache_">
	//    3    4:invokespecial   #30  <Method void OfflineMeasurementsCache(Core, String)>
	//    4    7:return          
	}

	protected OfflineMeasurementsCache(Core core, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #36  <Field String g>
		i = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #38  <Field ArrayList i>
		j = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #40  <Field String j>
		k = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #42  <Field int k>
		l = 0L;
	//   14   24:aload_0         
	//   15   25:lconst_0        
	//   16   26:putfield        #44  <Field long l>
		m = 0L;
	//   17   29:aload_0         
	//   18   30:lconst_0        
	//   19   31:putfield        #46  <Field long m>
		a = core;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:putfield        #48  <Field Core a>
		h = s;
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:putfield        #50  <Field String h>
		setCacheMaxMeasurements(2000);
	//   26   44:aload_0         
	//   27   45:sipush          2000
	//   28   48:invokevirtual   #54  <Method void setCacheMaxMeasurements(int)>
		setCacheMaxBatchFiles(100);
	//   29   51:aload_0         
	//   30   52:bipush          100
	//   31   54:invokevirtual   #57  <Method void setCacheMaxBatchFiles(int)>
		setCacheMaxPosts(10);
	//   32   57:aload_0         
	//   33   58:bipush          10
	//   34   60:invokevirtual   #60  <Method void setCacheMaxPosts(int)>
		setCacheWaitMinutes(30);
	//   35   63:aload_0         
	//   36   64:bipush          30
	//   37   66:invokevirtual   #63  <Method void setCacheWaitMinutes(int)>
		setCacheMeasurementExpiry(31);
	//   38   69:aload_0         
	//   39   70:bipush          31
	//   40   72:invokevirtual   #66  <Method void setCacheMeasurementExpiry(int)>
		e();
	//   41   75:aload_0         
	//   42   76:invokespecial   #68  <Method void e()>
	//   43   79:return          
	}

	private void a(int i1)
	{
		Storage storage = a.getStorage();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Core a>
	//    2    4:invokevirtual   #74  <Method Storage Core.getStorage()>
	//    3    7:astore_3        
		int j1 = i1;
	//    4    8:iload_1         
	//    5    9:istore_2        
		if(storage.has("CACHE_DROPPED_MEASUREMENTS").booleanValue())
	//*   6   10:aload_3         
	//*   7   11:ldc1            #76  <String "CACHE_DROPPED_MEASUREMENTS">
	//*   8   13:invokevirtual   #82  <Method Boolean Storage.has(String)>
	//*   9   16:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*  10   19:ifeq            37
			j1 = i1 + Integer.valueOf(storage.get("CACHE_DROPPED_MEASUREMENTS")).intValue();
	//   11   22:iload_1         
	//   12   23:aload_3         
	//   13   24:ldc1            #76  <String "CACHE_DROPPED_MEASUREMENTS">
	//   14   26:invokevirtual   #92  <Method String Storage.get(String)>
	//   15   29:invokestatic    #98  <Method Integer Integer.valueOf(String)>
	//   16   32:invokevirtual   #102 <Method int Integer.intValue()>
	//   17   35:iadd            
	//   18   36:istore_2        
		storage.set("CACHE_DROPPED_MEASUREMENTS", String.valueOf(j1));
	//   19   37:aload_3         
	//   20   38:ldc1            #76  <String "CACHE_DROPPED_MEASUREMENTS">
	//   21   40:iload_2         
	//   22   41:invokestatic    #107 <Method String String.valueOf(int)>
	//   23   44:invokevirtual   #111 <Method void Storage.set(String, String)>
	//   24   47:return          
	}

	private void a(String s)
	{
		Storage storage = a.getStorage();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Core a>
	//    2    4:invokevirtual   #74  <Method Storage Core.getStorage()>
	//    3    7:astore_2        
		if(storage.has(s).booleanValue())
	//*   4    8:aload_2         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #82  <Method Boolean Storage.has(String)>
	//*   7   13:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   8   16:ifeq            34
			a(Integer.valueOf(storage.get(s)).intValue());
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #92  <Method String Storage.get(String)>
	//   13   25:invokestatic    #98  <Method Integer Integer.valueOf(String)>
	//   14   28:invokevirtual   #102 <Method int Integer.intValue()>
	//   15   31:invokespecial   #114 <Method void a(int)>
	//   16   34:return          
	}

	private void a(String s, boolean flag)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			if(flag)
	//*   2    4:iload_2         
	//*   3    5:ifeq            13
				a(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #117 <Method void a(String)>
			FileUtils.deleteFile(a, s);
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field Core a>
	//    9   17:aload_1         
	//   10   18:invokestatic    #123 <Method boolean FileUtils.deleteFile(Core, String)>
	//   11   21:pop             
			i.remove(((Object) (s)));
	//   12   22:aload_0         
	//   13   23:getfield        #38  <Field ArrayList i>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #129 <Method boolean ArrayList.remove(Object)>
	//   16   30:pop             
		}
	//   17   31:return          
	}

	private boolean a(long l1)
	{
		long l2 = Date.unixTime();
	//    0    0:invokestatic    #136 <Method long Date.unixTime()>
	//    1    3:lstore_3        
		return f * 24L * 60L * 60L * 1000L - (l2 - l1) <= 0L;
	//    2    4:aload_0         
	//    3    5:getfield        #138 <Field long f>
	//    4    8:ldc2w           #139 <Long 24L>
	//    5   11:lmul            
	//    6   12:ldc2w           #141 <Long 60L>
	//    7   15:lmul            
	//    8   16:ldc2w           #141 <Long 60L>
	//    9   19:lmul            
	//   10   20:ldc2w           #143 <Long 1000L>
	//   11   23:lmul            
	//   12   24:lload_3         
	//   13   25:lload_1         
	//   14   26:lsub            
	//   15   27:lsub            
	//   16   28:lconst_0        
	//   17   29:lcmp            
	//   18   30:ifgt            35
	//   19   33:iconst_1        
	//   20   34:ireturn         
	//   21   35:iconst_0        
	//   22   36:ireturn         
	}

	private boolean a(String s, String s1)
	{
		HttpClient httpclient;
		httpclient = Connectivity.getHttpClient();
	//    0    0:invokestatic    #155 <Method HttpClient Connectivity.getHttpClient()>
	//    1    3:astore          5
		s1 = ((String) (new HttpPost(s1)));
	//    2    5:new             #157 <Class HttpPost>
	//    3    8:dup             
	//    4    9:aload_2         
	//    5   10:invokespecial   #159 <Method void HttpPost(String)>
	//    6   13:astore_2        
		int i1;
		s = ((String) (new StringEntity(s, "UTF-8")));
	//    7   14:new             #161 <Class StringEntity>
	//    8   17:dup             
	//    9   18:aload_1         
	//   10   19:ldc1            #163 <String "UTF-8">
	//   11   21:invokespecial   #165 <Method void StringEntity(String, String)>
	//   12   24:astore_1        
		((StringEntity) (s)).setContentType("text/xml");
	//   13   25:aload_1         
	//   14   26:ldc1            #167 <String "text/xml">
	//   15   28:invokevirtual   #170 <Method void StringEntity.setContentType(String)>
		((HttpPost) (s1)).setHeader("User-Agent", System.getProperty("http.agent"));
	//   16   31:aload_2         
	//   17   32:ldc1            #172 <String "User-Agent">
	//   18   34:ldc1            #174 <String "http.agent">
	//   19   36:invokestatic    #179 <Method String System.getProperty(String)>
	//   20   39:invokevirtual   #182 <Method void HttpPost.setHeader(String, String)>
		((HttpPost) (s1)).setEntity(((org.apache.http.HttpEntity) (s)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #186 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
		CSLog.d(((Object) (this)), "Sending POST request");
	//   24   47:aload_0         
	//   25   48:ldc1            #188 <String "Sending POST request">
	//   26   50:invokestatic    #193 <Method void CSLog.d(Object, String)>
		s = ((String) (httpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (s1)))));
	//   27   53:aload           5
	//   28   55:aload_2         
	//   29   56:invokeinterface #199 <Method HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
	//   30   61:astore_1        
		i1 = ((HttpResponse) (s)).getStatusLine().getStatusCode();
	//   31   62:aload_1         
	//   32   63:invokeinterface #205 <Method StatusLine HttpResponse.getStatusLine()>
	//   33   68:invokeinterface #210 <Method int StatusLine.getStatusCode()>
	//   34   73:istore_3        
		s1 = ((String) (new StringBuilder()));
	//   35   74:new             #212 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #213 <Method void StringBuilder()>
	//   38   81:astore_2        
		((StringBuilder) (s1)).append("Response:");
	//   39   82:aload_2         
	//   40   83:ldc1            #215 <String "Response:">
	//   41   85:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
		((StringBuilder) (s1)).append(i1);
	//   43   89:aload_2         
	//   44   90:iload_3         
	//   45   91:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   46   94:pop             
		CSLog.d(((Object) (this)), ((StringBuilder) (s1)).toString());
	//   47   95:aload_0         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   50  100:invokestatic    #193 <Method void CSLog.d(Object, String)>
		CSLog.d(((Object) (this)), "Cache flushed");
	//   51  103:aload_0         
	//   52  104:ldc1            #228 <String "Cache flushed">
	//   53  106:invokestatic    #193 <Method void CSLog.d(Object, String)>
		s = EntityUtils.toString(((HttpResponse) (s)).getEntity());
	//   54  109:aload_1         
	//   55  110:invokeinterface #232 <Method org.apache.http.HttpEntity HttpResponse.getEntity()>
	//   56  115:invokestatic    #237 <Method String EntityUtils.toString(org.apache.http.HttpEntity)>
	//   57  118:astore_1        
		if(i1 != 200)
			break MISSING_BLOCK_LABEL_212;
	//   58  119:iload_3         
	//   59  120:sipush          200
	//   60  123:icmpne          212
		boolean flag;
		if(!Utils.isNotEmpty(s))
			break MISSING_BLOCK_LABEL_212;
	//   61  126:aload_1         
	//   62  127:invokestatic    #243 <Method boolean Utils.isNotEmpty(String)>
	//   63  130:ifeq            212
		flag = s.startsWith("OK");
	//   64  133:aload_1         
	//   65  134:ldc1            #245 <String "OK">
	//   66  136:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   67  139:istore          4
		if(flag)
	//*  68  141:iload           4
	//*  69  143:ifeq            212
			return true;
	//   70  146:iconst_1        
	//   71  147:ireturn         
		break MISSING_BLOCK_LABEL_212;
		s;
	//   72  148:astore_1        
		s1 = ((String) (new StringBuilder()));
	//   73  149:new             #212 <Class StringBuilder>
	//   74  152:dup             
	//   75  153:invokespecial   #213 <Method void StringBuilder()>
	//   76  156:astore_2        
		((StringBuilder) (s1)).append("Exception in flush:");
	//   77  157:aload_2         
	//   78  158:ldc1            #250 <String "Exception in flush:">
	//   79  160:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
		((StringBuilder) (s1)).append(((Exception) (s)).getLocalizedMessage());
	//   81  164:aload_2         
	//   82  165:aload_1         
	//   83  166:invokevirtual   #253 <Method String Exception.getLocalizedMessage()>
	//   84  169:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   85  172:pop             
		CSLog.e(((Object) (this)), ((StringBuilder) (s1)).toString());
	//   86  173:aload_0         
	//   87  174:aload_2         
	//   88  175:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   89  178:invokestatic    #255 <Method void CSLog.e(Object, String)>
		CSLog.printStackTrace(((Exception) (s)));
	//   90  181:aload_1         
	//   91  182:invokestatic    #259 <Method void CSLog.printStackTrace(Exception)>
		break MISSING_BLOCK_LABEL_212;
	//   92  185:goto            212
		s;
	//   93  188:astore_1        
		CSLog.e(((Object) (this)), ((SSLException) (s)).getMessage());
	//   94  189:aload_0         
	//   95  190:aload_1         
	//   96  191:invokevirtual   #262 <Method String SSLException.getMessage()>
	//   97  194:invokestatic    #255 <Method void CSLog.e(Object, String)>
		a.allowOfflineTransmission(TransmissionMode.DISABLED, true);
	//   98  197:aload_0         
	//   99  198:getfield        #48  <Field Core a>
	//  100  201:getstatic       #268 <Field TransmissionMode TransmissionMode.DISABLED>
	//  101  204:iconst_1        
	//  102  205:invokevirtual   #272 <Method void Core.allowOfflineTransmission(TransmissionMode, boolean)>
		clear();
	//  103  208:aload_0         
	//  104  209:invokevirtual   #275 <Method void clear()>
		return false;
	//  105  212:iconst_0        
	//  106  213:ireturn         
	}

	private static String[] a(String as[], int i1, int j1)
	{
		if(i1 > j1)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          13
			throw new IllegalArgumentException();
	//    3    5:new             #278 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #279 <Method void IllegalArgumentException()>
	//    6   12:athrow          
		int k1 = as.length;
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:istore_3        
		if(i1 >= 0 && i1 <= k1)
	//*  10   16:iload_1         
	//*  11   17:iflt            58
	//*  12   20:iload_1         
	//*  13   21:iload_3         
	//*  14   22:icmple          28
	//*  15   25:goto            58
		{
			j1 -= i1;
	//   16   28:iload_2         
	//   17   29:iload_1         
	//   18   30:isub            
	//   19   31:istore_2        
			k1 = Math.min(j1, k1 - i1);
	//   20   32:iload_2         
	//   21   33:iload_3         
	//   22   34:iload_1         
	//   23   35:isub            
	//   24   36:invokestatic    #285 <Method int Math.min(int, int)>
	//   25   39:istore_3        
			String as1[] = new String[j1];
	//   26   40:iload_2         
	//   27   41:anewarray       String[]
	//   28   44:astore          4
			System.arraycopy(((Object) (as)), i1, ((Object) (as1)), 0, k1);
	//   29   46:aload_0         
	//   30   47:iload_1         
	//   31   48:aload           4
	//   32   50:iconst_0        
	//   33   51:iload_3         
	//   34   52:invokestatic    #289 <Method void System.arraycopy(Object, int, Object, int, int)>
			return as1;
	//   35   55:aload           4
	//   36   57:areturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   37   58:new             #291 <Class ArrayIndexOutOfBoundsException>
	//   38   61:dup             
	//   39   62:invokespecial   #292 <Method void ArrayIndexOutOfBoundsException()>
	//   40   65:athrow          
		}
	}

	private void b(String s)
	{
		CSLog.d(((Object) (this)), "Creating new cache batch file");
	//    0    0:aload_0         
	//    1    1:ldc2            #294 <String "Creating new cache batch file">
	//    2    4:invokestatic    #193 <Method void CSLog.d(Object, String)>
		Object obj = ((Object) (new StringBuilder()));
	//    3    7:new             #212 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #213 <Method void StringBuilder()>
	//    6   14:astore_2        
		((StringBuilder) (obj)).append(h);
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #50  <Field String h>
	//   10   20:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		((StringBuilder) (obj)).append(XMLBuilder.getLabelFromEvent(s, "ns_ts"));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:ldc2            #296 <String "ns_ts">
	//   15   29:invokestatic    #302 <Method String XMLBuilder.getLabelFromEvent(String, String)>
	//   16   32:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   18   36:aload_2         
	//   19   37:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   20   40:astore_2        
		FileUtils.writeEvent(a, ((String) (obj)), 0, s);
	//   21   41:aload_0         
	//   22   42:getfield        #48  <Field Core a>
	//   23   45:aload_2         
	//   24   46:iconst_0        
	//   25   47:aload_1         
	//   26   48:invokestatic    #306 <Method void FileUtils.writeEvent(Core, String, int, String)>
		if(i == null)
	//*  27   51:aload_0         
	//*  28   52:getfield        #38  <Field ArrayList i>
	//*  29   55:ifnonnull       69
			i = new ArrayList();
	//   30   58:aload_0         
	//   31   59:new             #125 <Class ArrayList>
	//   32   62:dup             
	//   33   63:invokespecial   #307 <Method void ArrayList()>
	//   34   66:putfield        #38  <Field ArrayList i>
		i.add(obj);
	//   35   69:aload_0         
	//   36   70:getfield        #38  <Field ArrayList i>
	//   37   73:aload_2         
	//   38   74:invokevirtual   #310 <Method boolean ArrayList.add(Object)>
	//   39   77:pop             
		c();
	//   40   78:aload_0         
	//   41   79:invokespecial   #312 <Method void c()>
	//   42   82:return          
	}

	private boolean b()
	{
		if(d().booleanValue() && !isEmpty() && a.getCustomerC2() != null)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #315 <Method Boolean d()>
	//*   2    4:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   3    7:ifeq            146
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #318 <Method boolean isEmpty()>
	//*   6   14:ifne            146
	//*   7   17:aload_0         
	//*   8   18:getfield        #48  <Field Core a>
	//*   9   21:invokevirtual   #321 <Method String Core.getCustomerC2()>
	//*  10   24:ifnull          146
		{
			if(k >= d)
	//*  11   27:aload_0         
	//*  12   28:getfield        #42  <Field int k>
	//*  13   31:aload_0         
	//*  14   32:getfield        #323 <Field int d>
	//*  15   35:icmplt          144
			{
				long l1 = e * 1000L * 60L - (Date.unixTime() - m);
	//   16   38:aload_0         
	//   17   39:getfield        #325 <Field long e>
	//   18   42:ldc2w           #143 <Long 1000L>
	//   19   45:lmul            
	//   20   46:ldc2w           #141 <Long 60L>
	//   21   49:lmul            
	//   22   50:invokestatic    #136 <Method long Date.unixTime()>
	//   23   53:aload_0         
	//   24   54:getfield        #46  <Field long m>
	//   25   57:lsub            
	//   26   58:lsub            
	//   27   59:lstore_1        
				if(l1 <= 0L)
	//*  28   60:lload_1         
	//*  29   61:lconst_0        
	//*  30   62:lcmp            
	//*  31   63:ifgt            78
				{
					k = 0;
	//   32   66:aload_0         
	//   33   67:iconst_0        
	//   34   68:putfield        #42  <Field int k>
					m = 0L;
	//   35   71:aload_0         
	//   36   72:lconst_0        
	//   37   73:putfield        #46  <Field long m>
					return true;
	//   38   76:iconst_1        
	//   39   77:ireturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   40   78:new             #212 <Class StringBuilder>
	//   41   81:dup             
	//   42   82:invokespecial   #213 <Method void StringBuilder()>
	//   43   85:astore_3        
					stringbuilder.append("Max flushes in a row (");
	//   44   86:aload_3         
	//   45   87:ldc2            #327 <String "Max flushes in a row (">
	//   46   90:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
					stringbuilder.append(d);
	//   48   94:aload_3         
	//   49   95:aload_0         
	//   50   96:getfield        #323 <Field int d>
	//   51   99:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   52  102:pop             
					stringbuilder.append(") reached. Waiting ");
	//   53  103:aload_3         
	//   54  104:ldc2            #329 <String ") reached. Waiting ">
	//   55  107:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
					stringbuilder.append((double)l1 / 1000D / 60D);
	//   57  111:aload_3         
	//   58  112:lload_1         
	//   59  113:l2d             
	//   60  114:ldc2w           #330 <Double 1000D>
	//   61  117:ddiv            
	//   62  118:ldc2w           #332 <Double 60D>
	//   63  121:ddiv            
	//   64  122:invokevirtual   #336 <Method StringBuilder StringBuilder.append(double)>
	//   65  125:pop             
					stringbuilder.append(" minutes");
	//   66  126:aload_3         
	//   67  127:ldc2            #338 <String " minutes">
	//   68  130:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   69  133:pop             
					CSLog.d(((Object) (this)), stringbuilder.toString());
	//   70  134:aload_0         
	//   71  135:aload_3         
	//   72  136:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   73  139:invokestatic    #193 <Method void CSLog.d(Object, String)>
					return false;
	//   74  142:iconst_0        
	//   75  143:ireturn         
				}
			} else
			{
				return true;
	//   76  144:iconst_1        
	//   77  145:ireturn         
			}
		} else
		{
			return false;
	//   78  146:iconst_0        
	//   79  147:ireturn         
		}
	}

	private int c(String s)
	{
		Storage storage = a.getStorage();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Core a>
	//    2    4:invokevirtual   #74  <Method Storage Core.getStorage()>
	//    3    7:astore_2        
		if(s != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          48
		{
			if(storage.has(s).booleanValue())
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #82  <Method Boolean Storage.has(String)>
	//*   9   17:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*  10   20:ifeq            35
				return Integer.valueOf(storage.get(s)).intValue();
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #92  <Method String Storage.get(String)>
	//   14   28:invokestatic    #98  <Method Integer Integer.valueOf(String)>
	//   15   31:invokevirtual   #102 <Method int Integer.intValue()>
	//   16   34:ireturn         
			else
				return FileUtils.readCachedEvents(a.getAppContext(), s).length;
	//   17   35:aload_0         
	//   18   36:getfield        #48  <Field Core a>
	//   19   39:invokevirtual   #343 <Method android.content.Context Core.getAppContext()>
	//   20   42:aload_1         
	//   21   43:invokestatic    #347 <Method String[] FileUtils.readCachedEvents(android.content.Context, String)>
	//   22   46:arraylength     
	//   23   47:ireturn         
		} else
		{
			return 0;
	//   24   48:iconst_0        
	//   25   49:ireturn         
		}
	}

	private void c()
	{
		l = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #44  <Field long l>
		if(j != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #40  <Field String j>
	//*   5    9:ifnull          17
			j = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #40  <Field String j>
	//    9   17:return          
	}

	private Boolean d()
	{
		android.content.Context context = a.getAppContext();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Core a>
	//    2    4:invokevirtual   #343 <Method android.content.Context Core.getAppContext()>
	//    3    7:astore_1        
		if(Connectivity.isEmulator())
	//*   4    8:invokestatic    #350 <Method boolean Connectivity.isEmulator()>
	//*   5   11:ifeq            19
			return Boolean.valueOf(true);
	//    6   14:iconst_1        
	//    7   15:invokestatic    #353 <Method Boolean Boolean.valueOf(boolean)>
	//    8   18:areturn         
		if(!Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue())
	//*   9   19:aload_1         
	//*  10   20:ldc2            #355 <String "android.permission.ACCESS_NETWORK_STATE">
	//*  11   23:invokestatic    #361 <Method Boolean Permissions.check(android.content.Context, String)>
	//*  12   26:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*  13   29:ifne            37
			return Boolean.valueOf(true);
	//   14   32:iconst_1        
	//   15   33:invokestatic    #353 <Method Boolean Boolean.valueOf(boolean)>
	//   16   36:areturn         
		if(Connectivity.isConnectedWiFi(context))
	//*  17   37:aload_1         
	//*  18   38:invokestatic    #365 <Method boolean Connectivity.isConnectedWiFi(android.content.Context)>
	//*  19   41:ifeq            49
			return Boolean.valueOf(true);
	//   20   44:iconst_1        
	//   21   45:invokestatic    #353 <Method Boolean Boolean.valueOf(boolean)>
	//   22   48:areturn         
		if(Connectivity.isConnectedMobile(context))
	//*  23   49:aload_1         
	//*  24   50:invokestatic    #368 <Method boolean Connectivity.isConnectedMobile(android.content.Context)>
	//*  25   53:ifeq            61
			return Boolean.valueOf(true);
	//   26   56:iconst_1        
	//   27   57:invokestatic    #353 <Method Boolean Boolean.valueOf(boolean)>
	//   28   60:areturn         
		else
			return Boolean.valueOf(false);
	//   29   61:iconst_0        
	//   30   62:invokestatic    #353 <Method Boolean Boolean.valueOf(boolean)>
	//   31   65:areturn         
	}

	private String[] d(String s)
	{
		boolean flag;
		int i1;
		String as[];
		as = FileUtils.readCachedEvents(a.getAppContext(), s);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Core a>
	//    2    4:invokevirtual   #343 <Method android.content.Context Core.getAppContext()>
	//    3    7:aload_1         
	//    4    8:invokestatic    #347 <Method String[] FileUtils.readCachedEvents(android.content.Context, String)>
	//    5   11:astore          7
		i1 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          4
		flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
_L2:
		boolean flag1;
		flag1 = flag;
	//   10   18:iload_2         
	//   11   19:istore_3        
		if(i1 >= as.length)
			break; /* Loop/switch isn't completed */
	//   12   20:iload           4
	//   13   22:aload           7
	//   14   24:arraylength     
	//   15   25:icmpge          122
		flag1 = flag;
	//   16   28:iload_2         
	//   17   29:istore_3        
		long l1 = Long.parseLong(XMLBuilder.getLabelFromEvent(as[i1], "ns_ts"));
	//   18   30:aload           7
	//   19   32:iload           4
	//   20   34:aaload          
	//   21   35:ldc2            #296 <String "ns_ts">
	//   22   38:invokestatic    #302 <Method String XMLBuilder.getLabelFromEvent(String, String)>
	//   23   41:invokestatic    #377 <Method long Long.parseLong(String)>
	//   24   44:lstore          5
		flag1 = flag;
	//   25   46:iload_2         
	//   26   47:istore_3        
		flag = a(l1) ^ true;
	//   27   48:aload_0         
	//   28   49:lload           5
	//   29   51:invokespecial   #379 <Method boolean a(long)>
	//   30   54:iconst_1        
	//   31   55:ixor            
	//   32   56:istore_2        
		flag1 = flag;
	//   33   57:iload_2         
	//   34   58:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_111;
	//   35   59:iload_2         
	//   36   60:ifeq            111
		flag1 = flag;
	//   37   63:iload_2         
	//   38   64:istore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   39   65:new             #212 <Class StringBuilder>
	//   40   68:dup             
	//   41   69:invokespecial   #213 <Method void StringBuilder()>
	//   42   72:astore          8
		flag1 = flag;
	//   43   74:iload_2         
	//   44   75:istore_3        
		stringbuilder.append("Valid timestamp found: ");
	//   45   76:aload           8
	//   46   78:ldc2            #381 <String "Valid timestamp found: ">
	//   47   81:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   48   84:pop             
		flag1 = flag;
	//   49   85:iload_2         
	//   50   86:istore_3        
		stringbuilder.append(l1);
	//   51   87:aload           8
	//   52   89:lload           5
	//   53   91:invokevirtual   #384 <Method StringBuilder StringBuilder.append(long)>
	//   54   94:pop             
		flag1 = flag;
	//   55   95:iload_2         
	//   56   96:istore_3        
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   57   97:aload_0         
	//   58   98:aload           8
	//   59  100:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   60  103:invokestatic    #193 <Method void CSLog.d(Object, String)>
		flag1 = flag;
	//   61  106:iload_2         
	//   62  107:istore_3        
		break; /* Loop/switch isn't completed */
	//   63  108:goto            122
_L3:
		i1++;
	//   64  111:iload           4
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:istore          4
		flag = flag1;
	//   68  117:iload_3         
	//   69  118:istore_2        
		if(true) goto _L2; else goto _L1
	//   70  119:goto            18
_L1:
		if(!flag1)
	//*  71  122:iload_3         
	//*  72  123:ifne            177
		{
			as = ((String []) (new StringBuilder()));
	//   73  126:new             #212 <Class StringBuilder>
	//   74  129:dup             
	//   75  130:invokespecial   #213 <Method void StringBuilder()>
	//   76  133:astore          7
			((StringBuilder) (as)).append("All events in the file ");
	//   77  135:aload           7
	//   78  137:ldc2            #386 <String "All events in the file ">
	//   79  140:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   80  143:pop             
			((StringBuilder) (as)).append(s);
	//   81  144:aload           7
	//   82  146:aload_1         
	//   83  147:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   84  150:pop             
			((StringBuilder) (as)).append(" are expired");
	//   85  151:aload           7
	//   86  153:ldc2            #388 <String " are expired">
	//   87  156:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   88  159:pop             
			CSLog.d(((Object) (this)), ((StringBuilder) (as)).toString());
	//   89  160:aload_0         
	//   90  161:aload           7
	//   91  163:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   92  166:invokestatic    #193 <Method void CSLog.d(Object, String)>
			a(s, true);
	//   93  169:aload_0         
	//   94  170:aload_1         
	//   95  171:iconst_1        
	//   96  172:invokespecial   #390 <Method void a(String, boolean)>
			return null;
	//   97  175:aconst_null     
	//   98  176:areturn         
		} else
		{
			a(i1);
	//   99  177:aload_0         
	//  100  178:iload           4
	//  101  180:invokespecial   #114 <Method void a(int)>
			return a(as, i1, as.length);
	//  102  183:aload           7
	//  103  185:iload           4
	//  104  187:aload           7
	//  105  189:arraylength     
	//  106  190:invokestatic    #392 <Method String[] a(String[], int, int)>
	//  107  193:areturn         
		}
		NumberFormatException numberformatexception;
		numberformatexception;
	//  108  194:astore          8
		  goto _L3
	//* 109  196:goto            111
	}

	private long e(String s)
	{
		return Long.valueOf(s.substring(h.length())).longValue();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field String h>
	//    3    5:invokevirtual   #395 <Method int String.length()>
	//    4    8:invokevirtual   #398 <Method String String.substring(int)>
	//    5   11:invokestatic    #401 <Method Long Long.valueOf(String)>
	//    6   14:invokevirtual   #404 <Method long Long.longValue()>
	//    7   17:lreturn         
	}

	private void e()
	{
		List list = f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #407 <Method List f()>
	//    2    4:astore_2        
		for(int i1 = list.size() - 1; i1 >= 0; i1--)
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #412 <Method int List.size()>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iflt            100
			if(a(e((String)list.get(i1))))
	//*  10   18:aload_0         
	//*  11   19:aload_0         
	//*  12   20:aload_2         
	//*  13   21:iload_1         
	//*  14   22:invokeinterface #415 <Method Object List.get(int)>
	//*  15   27:checkcast       #104 <Class String>
	//*  16   30:invokespecial   #417 <Method long e(String)>
	//*  17   33:invokespecial   #379 <Method boolean a(long)>
	//*  18   36:ifeq            93
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   19   39:new             #212 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #213 <Method void StringBuilder()>
	//   22   46:astore_3        
				stringbuilder.append("Deleting expired cache file ");
	//   23   47:aload_3         
	//   24   48:ldc2            #419 <String "Deleting expired cache file ">
	//   25   51:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
				stringbuilder.append((String)list.get(i1));
	//   27   55:aload_3         
	//   28   56:aload_2         
	//   29   57:iload_1         
	//   30   58:invokeinterface #415 <Method Object List.get(int)>
	//   31   63:checkcast       #104 <Class String>
	//   32   66:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
				CSLog.d(((Object) (this)), stringbuilder.toString());
	//   34   70:aload_0         
	//   35   71:aload_3         
	//   36   72:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   37   75:invokestatic    #193 <Method void CSLog.d(Object, String)>
				a((String)list.get(i1), true);
	//   38   78:aload_0         
	//   39   79:aload_2         
	//   40   80:iload_1         
	//   41   81:invokeinterface #415 <Method Object List.get(int)>
	//   42   86:checkcast       #104 <Class String>
	//   43   89:iconst_1        
	//   44   90:invokespecial   #390 <Method void a(String, boolean)>
			}

	//   45   93:iload_1         
	//   46   94:iconst_1        
	//   47   95:isub            
	//   48   96:istore_1        
	//*  49   97:goto            14
	//   50  100:return          
	}

	private List f()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ArrayList i>
	//*   2    4:ifnonnull       21
			i = FileUtils.getFileList(a.getAppContext());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field Core a>
	//    6   12:invokevirtual   #343 <Method android.content.Context Core.getAppContext()>
	//    7   15:invokestatic    #423 <Method ArrayList FileUtils.getFileList(android.content.Context)>
	//    8   18:putfield        #38  <Field ArrayList i>
		return ((List) (i));
	//    9   21:aload_0         
	//   10   22:getfield        #38  <Field ArrayList i>
	//   11   25:areturn         
	}

	private String g()
	{
		if(i != null && i.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ArrayList i>
	//*   2    4:ifnull          29
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field ArrayList i>
	//*   5   11:invokevirtual   #426 <Method int ArrayList.size()>
	//*   6   14:ifle            29
			return (String)i.get(0);
	//    7   17:aload_0         
	//    8   18:getfield        #38  <Field ArrayList i>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #427 <Method Object ArrayList.get(int)>
	//   11   25:checkcast       #104 <Class String>
	//   12   28:areturn         
		else
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	private String h()
	{
		if(i != null && i.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ArrayList i>
	//*   2    4:ifnull          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field ArrayList i>
	//*   5   11:invokevirtual   #426 <Method int ArrayList.size()>
	//*   6   14:ifle            37
			return (String)i.get(i.size() - 1);
	//    7   17:aload_0         
	//    8   18:getfield        #38  <Field ArrayList i>
	//    9   21:aload_0         
	//   10   22:getfield        #38  <Field ArrayList i>
	//   11   25:invokevirtual   #426 <Method int ArrayList.size()>
	//   12   28:iconst_1        
	//   13   29:isub            
	//   14   30:invokevirtual   #427 <Method Object ArrayList.get(int)>
	//   15   33:checkcast       #104 <Class String>
	//   16   36:areturn         
		else
			return null;
	//   17   37:aconst_null     
	//   18   38:areturn         
	}

	protected String a()
	{
		Object obj;
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field String g>
	//*   2    4:ifnull          22
		{
			obj = ((Object) (new StringBuilder(g)));
	//    3    7:new             #212 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field String g>
	//    7   15:invokespecial   #428 <Method void StringBuilder(String)>
	//    8   18:astore_3        
		} else
	//*   9   19:goto            52
		{
			if(a.isSecure())
	//*  10   22:aload_0         
	//*  11   23:getfield        #48  <Field Core a>
	//*  12   26:invokevirtual   #431 <Method boolean Core.isSecure()>
	//*  13   29:ifeq            39
				obj = "https://udm.scorecardresearch.com/offline";
	//   14   32:ldc2            #433 <String "https://udm.scorecardresearch.com/offline">
	//   15   35:astore_3        
			else
	//*  16   36:goto            43
				obj = "http://udm.scorecardresearch.com/offline";
	//   17   39:ldc2            #435 <String "http://udm.scorecardresearch.com/offline">
	//   18   42:astore_3        
			obj = ((Object) (new StringBuilder(((String) (obj)))));
	//   19   43:new             #212 <Class StringBuilder>
	//   20   46:dup             
	//   21   47:aload_3         
	//   22   48:invokespecial   #428 <Method void StringBuilder(String)>
	//   23   51:astore_3        
		}
		boolean flag;
		if(((StringBuilder) (obj)).indexOf("?") == -1)
	//*  24   52:aload_3         
	//*  25   53:ldc2            #437 <String "?">
	//*  26   56:invokevirtual   #440 <Method int StringBuilder.indexOf(String)>
	//*  27   59:iconst_m1       
	//*  28   60:icmpne          76
		{
			((StringBuilder) (obj)).append("?");
	//   29   63:aload_3         
	//   30   64:ldc2            #437 <String "?">
	//   31   67:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
			flag = false;
	//   33   71:iconst_0        
	//   34   72:istore_1        
		} else
	//*  35   73:goto            78
		{
			flag = true;
	//   36   76:iconst_1        
	//   37   77:istore_1        
		}
		String s = a.getCustomerC2();
	//   38   78:aload_0         
	//   39   79:getfield        #48  <Field Core a>
	//   40   82:invokevirtual   #321 <Method String Core.getCustomerC2()>
	//   41   85:astore          4
		boolean flag1 = flag;
	//   42   87:iload_1         
	//   43   88:istore_2        
		if(s != null)
	//*  44   89:aload           4
	//*  45   91:ifnull          136
		{
			flag1 = flag;
	//   46   94:iload_1         
	//   47   95:istore_2        
			if(!s.equals(""))
	//*  48   96:aload           4
	//*  49   98:ldc2            #442 <String "">
	//*  50  101:invokevirtual   #445 <Method boolean String.equals(Object)>
	//*  51  104:ifne            136
			{
				if(flag)
	//*  52  107:iload_1         
	//*  53  108:ifeq            119
					((StringBuilder) (obj)).append("&");
	//   54  111:aload_3         
	//   55  112:ldc2            #447 <String "&">
	//   56  115:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   57  118:pop             
				((StringBuilder) (obj)).append("c2=");
	//   58  119:aload_3         
	//   59  120:ldc2            #449 <String "c2=">
	//   60  123:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
				((StringBuilder) (obj)).append(s);
	//   62  127:aload_3         
	//   63  128:aload           4
	//   64  130:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   65  133:pop             
				flag1 = true;
	//   66  134:iconst_1        
	//   67  135:istore_2        
			}
		}
		s = Utils.md5(String.format("JetportGotAMaskOfThe%sS.D_K-", new Object[] {
			a.getPublisherSecret()
		}));
	//   68  136:ldc2            #451 <String "JetportGotAMaskOfThe%sS.D_K-">
	//   69  139:iconst_1        
	//   70  140:anewarray       Object[]
	//   71  143:dup             
	//   72  144:iconst_0        
	//   73  145:aload_0         
	//   74  146:getfield        #48  <Field Core a>
	//   75  149:invokevirtual   #454 <Method String Core.getPublisherSecret()>
	//   76  152:aastore         
	//   77  153:invokestatic    #458 <Method String String.format(String, Object[])>
	//   78  156:invokestatic    #461 <Method String Utils.md5(String)>
	//   79  159:astore          4
		if(s != null && !s.equals(""))
	//*  80  161:aload           4
	//*  81  163:ifnull          204
	//*  82  166:aload           4
	//*  83  168:ldc2            #442 <String "">
	//*  84  171:invokevirtual   #445 <Method boolean String.equals(Object)>
	//*  85  174:ifne            204
		{
			if(flag1)
	//*  86  177:iload_2         
	//*  87  178:ifeq            189
				((StringBuilder) (obj)).append("&");
	//   88  181:aload_3         
	//   89  182:ldc2            #447 <String "&">
	//   90  185:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   91  188:pop             
			((StringBuilder) (obj)).append("s=");
	//   92  189:aload_3         
	//   93  190:ldc2            #463 <String "s=">
	//   94  193:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   95  196:pop             
			((StringBuilder) (obj)).append(s);
	//   96  197:aload_3         
	//   97  198:aload           4
	//   98  200:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   99  203:pop             
		}
		return ((StringBuilder) (obj)).toString().toLowerCase(new Locale("en", "US"));
	//  100  204:aload_3         
	//  101  205:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  102  208:new             #465 <Class Locale>
	//  103  211:dup             
	//  104  212:ldc2            #467 <String "en">
	//  105  215:ldc2            #469 <String "US">
	//  106  218:invokespecial   #470 <Method void Locale(String, String)>
	//  107  221:invokevirtual   #474 <Method String String.toLowerCase(Locale)>
	//  108  224:areturn         
	}

	public void clear()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		List list = f();
	//    5   11:aload_0         
	//    6   12:invokespecial   #407 <Method List f()>
	//    7   15:astore_2        
		for(int i1 = list.size(); i1 > 0; i1--)
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #412 <Method int List.size()>
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:ifle            51
			a((String)list.get(i1 - 1), true);
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:invokeinterface #415 <Method Object List.get(int)>
	//   19   37:checkcast       #104 <Class String>
	//   20   40:iconst_1        
	//   21   41:invokespecial   #390 <Method void a(String, boolean)>

	//   22   44:iload_1         
	//   23   45:iconst_1        
	//   24   46:isub            
	//   25   47:istore_1        
	//*  26   48:goto            23
	//   27   51:return          
	}

	public boolean flush()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = a.isEnabled();
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field Core a>
	//    4    6:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//    5    9:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_18;
	//    6   10:iload_1         
	//    7   11:ifne            18
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		long l1;
		Storage storage;
		storage = a.getStorage();
	//   12   18:aload_0         
	//   13   19:getfield        #48  <Field Core a>
	//   14   22:invokevirtual   #74  <Method Storage Core.getStorage()>
	//   15   25:astore          7
		e();
	//   16   27:aload_0         
	//   17   28:invokespecial   #68  <Method void e()>
		l1 = e * 1000L * 60L - (Date.unixTime() - l);
	//   18   31:aload_0         
	//   19   32:getfield        #325 <Field long e>
	//   20   35:ldc2w           #143 <Long 1000L>
	//   21   38:lmul            
	//   22   39:ldc2w           #141 <Long 60L>
	//   23   42:lmul            
	//   24   43:invokestatic    #136 <Method long Date.unixTime()>
	//   25   46:aload_0         
	//   26   47:getfield        #44  <Field long l>
	//   27   50:lsub            
	//   28   51:lsub            
	//   29   52:lstore_3        
		if(l1 > 0L) goto _L2; else goto _L1
	//   30   53:lload_3         
	//   31   54:lconst_0        
	//   32   55:lcmp            
	//   33   56:ifgt            345
_L1:
		l = 0L;
	//   34   59:aload_0         
	//   35   60:lconst_0        
	//   36   61:putfield        #44  <Field long l>
		flag = false;
	//   37   64:iconst_0        
	//   38   65:istore_1        
_L10:
		boolean flag1 = flag;
	//   39   66:iload_1         
	//   40   67:istore_2        
		if(!b()) goto _L4; else goto _L3
	//   41   68:aload_0         
	//   42   69:invokespecial   #480 <Method boolean b()>
	//   43   72:ifeq            399
_L3:
		Object obj = null;
	//   44   75:aconst_null     
	//   45   76:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   46   78:new             #212 <Class StringBuilder>
	//   47   81:dup             
	//   48   82:invokespecial   #213 <Method void StringBuilder()>
	//   49   85:astore          6
		stringbuilder.append("Cache is not empty, contains ");
	//   50   87:aload           6
	//   51   89:ldc2            #482 <String "Cache is not empty, contains ">
	//   52   92:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   53   95:pop             
		stringbuilder.append(i.size());
	//   54   96:aload           6
	//   55   98:aload_0         
	//   56   99:getfield        #38  <Field ArrayList i>
	//   57  102:invokevirtual   #426 <Method int ArrayList.size()>
	//   58  105:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   59  108:pop             
		stringbuilder.append(" files");
	//   60  109:aload           6
	//   61  111:ldc2            #484 <String " files">
	//   62  114:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   63  117:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   64  118:aload_0         
	//   65  119:aload           6
	//   66  121:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   67  124:invokestatic    #193 <Method void CSLog.d(Object, String)>
		if(j != null) goto _L6; else goto _L5
	//   68  127:aload_0         
	//   69  128:getfield        #40  <Field String j>
	//   70  131:ifnonnull       242
_L5:
		String s;
		String as[];
		s = h();
	//   71  134:aload_0         
	//   72  135:invokespecial   #486 <Method String h()>
	//   73  138:astore          6
		obj = ((Object) (new StringBuilder()));
	//   74  140:new             #212 <Class StringBuilder>
	//   75  143:dup             
	//   76  144:invokespecial   #213 <Method void StringBuilder()>
	//   77  147:astore          5
		((StringBuilder) (obj)).append("reading events from the file ");
	//   78  149:aload           5
	//   79  151:ldc2            #488 <String "reading events from the file ">
	//   80  154:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   81  157:pop             
		((StringBuilder) (obj)).append(s);
	//   82  158:aload           5
	//   83  160:aload           6
	//   84  162:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   85  165:pop             
		CSLog.d(((Object) (this)), ((StringBuilder) (obj)).toString());
	//   86  166:aload_0         
	//   87  167:aload           5
	//   88  169:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   89  172:invokestatic    #193 <Method void CSLog.d(Object, String)>
		as = d(s);
	//   90  175:aload_0         
	//   91  176:aload           6
	//   92  178:invokespecial   #490 <Method String[] d(String)>
	//   93  181:astore          8
		obj = ((Object) (s));
	//   94  183:aload           6
	//   95  185:astore          5
		if(as == null) goto _L6; else goto _L7
	//   96  187:aload           8
	//   97  189:ifnull          242
_L7:
		obj = ((Object) (s));
	//   98  192:aload           6
	//   99  194:astore          5
		if(as.length <= 0) goto _L6; else goto _L8
	//  100  196:aload           8
	//  101  198:arraylength     
	//  102  199:ifle            242
_L8:
		if(!storage.has("CACHE_DROPPED_MEASUREMENTS").booleanValue())
			break MISSING_BLOCK_LABEL_410;
	//  103  202:aload           7
	//  104  204:ldc1            #76  <String "CACHE_DROPPED_MEASUREMENTS">
	//  105  206:invokevirtual   #82  <Method Boolean Storage.has(String)>
	//  106  209:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//  107  212:ifeq            410
		obj = ((Object) (storage.get("CACHE_DROPPED_MEASUREMENTS")));
	//  108  215:aload           7
	//  109  217:ldc1            #76  <String "CACHE_DROPPED_MEASUREMENTS">
	//  110  219:invokevirtual   #92  <Method String Storage.get(String)>
	//  111  222:astore          5
	//* 112  224:goto            227
_L11:
		j = XMLBuilder.generateXMLRequestString(as, ((String) (obj)));
	//  113  227:aload_0         
	//  114  228:aload           8
	//  115  230:aload           5
	//  116  232:invokestatic    #494 <Method String XMLBuilder.generateXMLRequestString(String[], String)>
	//  117  235:putfield        #40  <Field String j>
		obj = ((Object) (s));
	//  118  238:aload           6
	//  119  240:astore          5
_L6:
		if(j == null || j.length() <= 0) goto _L10; else goto _L9
	//  120  242:aload_0         
	//  121  243:getfield        #40  <Field String j>
	//  122  246:ifnull          66
	//  123  249:aload_0         
	//  124  250:getfield        #40  <Field String j>
	//  125  253:invokevirtual   #395 <Method int String.length()>
	//  126  256:ifle            66
_L9:
		flag = a(j, a());
	//  127  259:aload_0         
	//  128  260:aload_0         
	//  129  261:getfield        #40  <Field String j>
	//  130  264:aload_0         
	//  131  265:invokevirtual   #496 <Method String a()>
	//  132  268:invokespecial   #498 <Method boolean a(String, String)>
	//  133  271:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_333;
	//  134  272:iload_1         
	//  135  273:ifeq            333
		k = k + 1;
	//  136  276:aload_0         
	//  137  277:aload_0         
	//  138  278:getfield        #42  <Field int k>
	//  139  281:iconst_1        
	//  140  282:iadd            
	//  141  283:putfield        #42  <Field int k>
		a(((String) (obj)), false);
	//  142  286:aload_0         
	//  143  287:aload           5
	//  144  289:iconst_0        
	//  145  290:invokespecial   #390 <Method void a(String, boolean)>
		c();
	//  146  293:aload_0         
	//  147  294:invokespecial   #312 <Method void c()>
		m = Date.unixTime();
	//  148  297:aload_0         
	//  149  298:invokestatic    #136 <Method long Date.unixTime()>
	//  150  301:putfield        #46  <Field long m>
		storage.remove("CACHE_DROPPED_MEASUREMENTS");
	//  151  304:aload           7
	//  152  306:ldc1            #76  <String "CACHE_DROPPED_MEASUREMENTS">
	//  153  308:invokevirtual   #500 <Method void Storage.remove(String)>
		a.getStorage().set("lastMeasurementProcessedTimestamp", String.valueOf(System.currentTimeMillis()));
	//  154  311:aload_0         
	//  155  312:getfield        #48  <Field Core a>
	//  156  315:invokevirtual   #74  <Method Storage Core.getStorage()>
	//  157  318:ldc2            #502 <String "lastMeasurementProcessedTimestamp">
	//  158  321:invokestatic    #505 <Method long System.currentTimeMillis()>
	//  159  324:invokestatic    #508 <Method String String.valueOf(long)>
	//  160  327:invokevirtual   #111 <Method void Storage.set(String, String)>
		  goto _L10
	//* 161  330:goto            66
		l = Date.unixTime();
	//  162  333:aload_0         
	//  163  334:invokestatic    #136 <Method long Date.unixTime()>
	//  164  337:putfield        #44  <Field long l>
		flag1 = flag;
	//  165  340:iload_1         
	//  166  341:istore_2        
		  goto _L4
	//* 167  342:goto            399
_L2:
		obj = ((Object) (new StringBuilder()));
	//  168  345:new             #212 <Class StringBuilder>
	//  169  348:dup             
	//  170  349:invokespecial   #213 <Method void StringBuilder()>
	//  171  352:astore          5
		((StringBuilder) (obj)).append("Waiting ");
	//  172  354:aload           5
	//  173  356:ldc2            #510 <String "Waiting ">
	//  174  359:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  175  362:pop             
		((StringBuilder) (obj)).append((double)l1 / 1000D / 60D);
	//  176  363:aload           5
	//  177  365:lload_3         
	//  178  366:l2d             
	//  179  367:ldc2w           #330 <Double 1000D>
	//  180  370:ddiv            
	//  181  371:ldc2w           #332 <Double 60D>
	//  182  374:ddiv            
	//  183  375:invokevirtual   #336 <Method StringBuilder StringBuilder.append(double)>
	//  184  378:pop             
		((StringBuilder) (obj)).append(" minutes");
	//  185  379:aload           5
	//  186  381:ldc2            #338 <String " minutes">
	//  187  384:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  188  387:pop             
		CSLog.d(((Object) (this)), ((StringBuilder) (obj)).toString());
	//  189  388:aload_0         
	//  190  389:aload           5
	//  191  391:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  192  394:invokestatic    #193 <Method void CSLog.d(Object, String)>
		flag1 = false;
	//  193  397:iconst_0        
	//  194  398:istore_2        
_L4:
		this;
	//  195  399:aload_0         
		JVM INSTR monitorexit ;
	//  196  400:monitorexit     
		return flag1;
	//  197  401:iload_2         
	//  198  402:ireturn         
		obj;
	//  199  403:astore          5
	//* 200  405:aload_0         
		throw obj;
	//  201  406:monitorexit     
	//  202  407:aload           5
	//  203  409:athrow          
		obj = "0";
	//  204  410:ldc2            #512 <String "0">
	//  205  413:astore          5
		  goto _L11
	//* 206  415:goto            227
	}

	public int getCacheMaxBatchFiles()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #515 <Field int c>
	//    2    4:ireturn         
	}

	public int getCacheMaxMeasurements()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #518 <Field int b>
	//    2    4:ireturn         
	}

	public int getCacheMaxPosts()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field int d>
	//    2    4:ireturn         
	}

	public long getCacheMeasurementExpiry()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field long f>
	//    2    4:lreturn         
	}

	public long getCacheWaitMinutes()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field long e>
	//    2    4:lreturn         
	}

	public int getEventCount()
	{
		int j1 = c(h());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #486 <Method String h()>
	//    3    5:invokespecial   #524 <Method int c(String)>
	//    4    8:istore_2        
		List list = f();
	//    5    9:aload_0         
	//    6   10:invokespecial   #407 <Method List f()>
	//    7   13:astore_3        
		int i1 = j1;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(list.size() > 0)
	//*  10   16:aload_3         
	//*  11   17:invokeinterface #412 <Method int List.size()>
	//*  12   22:ifle            41
			i1 = j1 + (list.size() - 1) * getCacheMaxBatchFiles();
	//   13   25:iload_2         
	//   14   26:aload_3         
	//   15   27:invokeinterface #412 <Method int List.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:aload_0         
	//   19   35:invokevirtual   #526 <Method int getCacheMaxBatchFiles()>
	//   20   38:imul            
	//   21   39:iadd            
	//   22   40:istore_1        
		return i1;
	//   23   41:iload_1         
	//   24   42:ireturn         
	}

	public boolean isEmpty()
	{
		return getEventCount() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #528 <Method int getEventCount()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void saveApplicationMeasurement(EventType eventtype, HashMap hashmap)
	{
		saveApplicationMeasurement(eventtype, hashmap, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #533 <Method void saveApplicationMeasurement(EventType, HashMap, boolean)>
	//    5    7:return          
	}

	public void saveApplicationMeasurement(EventType eventtype, HashMap hashmap, boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			eventtype = ((EventType) (ApplicationMeasurement.newApplicationMeasurement(a, eventtype, hashmap, ((String) (null)))));
	//    5   11:aload_0         
	//    6   12:getfield        #48  <Field Core a>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aconst_null     
	//   10   18:invokestatic    #540 <Method ApplicationMeasurement ApplicationMeasurement.newApplicationMeasurement(Core, EventType, HashMap, String)>
	//   11   21:astore_1        
			a.getMeasurementDispatcher().addAggregateData(((Measurement) (eventtype)));
	//   12   22:aload_0         
	//   13   23:getfield        #48  <Field Core a>
	//   14   26:invokevirtual   #544 <Method MeasurementDispatcher Core.getMeasurementDispatcher()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #550 <Method void MeasurementDispatcher.addAggregateData(Measurement)>
			a.getMeasurementDispatcher().addEventCounter(((Measurement) (eventtype)));
	//   17   33:aload_0         
	//   18   34:getfield        #48  <Field Core a>
	//   19   37:invokevirtual   #544 <Method MeasurementDispatcher Core.getMeasurementDispatcher()>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #553 <Method void MeasurementDispatcher.addEventCounter(Measurement)>
			saveEvent(((Measurement) (eventtype)), flag);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:iload_3         
	//   25   47:invokevirtual   #557 <Method void saveEvent(Measurement, boolean)>
			return;
	//   26   50:return          
		}
	}

	public void saveEvent(Measurement measurement)
	{
		saveEvent(measurement, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #557 <Method void saveEvent(Measurement, boolean)>
	//    4    6:return          
	}

	public void saveEvent(Measurement measurement, boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(flag)
	//*   5   11:iload_2         
	//*   6   12:ifeq            37
		{
			a.getTaskExecutor().execute(((Runnable) (new c(this, measurement))), true);
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field Core a>
	//    9   19:invokevirtual   #562 <Method TaskExecutor Core.getTaskExecutor()>
	//   10   22:new             #564 <Class c>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #567 <Method void c(OfflineMeasurementsCache, Measurement)>
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #572 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   17   35:pop             
			return;
	//   18   36:return          
		} else
		{
			saveEvent(measurement.retrieveLabelsAsString(a.getMeasurementLabelOrder()));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #48  <Field Core a>
	//   23   43:invokevirtual   #576 <Method String[] Core.getMeasurementLabelOrder()>
	//   24   46:invokevirtual   #582 <Method String Measurement.retrieveLabelsAsString(String[])>
	//   25   49:invokevirtual   #584 <Method void saveEvent(String)>
			return;
	//   26   52:return          
		}
	}

	public void saveEvent(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = a.isEnabled();
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field Core a>
	//    4    6:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//    5    9:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_17;
	//    6   10:iload_2         
	//    7   11:ifne            17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		String s1;
		if(a.getOfflineTransmissionMode() == TransmissionMode.DISABLED || a.getCustomerC2() == null || !Utils.isNotEmpty(XMLBuilder.getLabelFromEvent(s, "ns_ts")))
			break MISSING_BLOCK_LABEL_207;
	//   11   17:aload_0         
	//   12   18:getfield        #48  <Field Core a>
	//   13   21:invokevirtual   #588 <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//   14   24:getstatic       #268 <Field TransmissionMode TransmissionMode.DISABLED>
	//   15   27:if_acmpeq       207
	//   16   30:aload_0         
	//   17   31:getfield        #48  <Field Core a>
	//   18   34:invokevirtual   #321 <Method String Core.getCustomerC2()>
	//   19   37:ifnull          207
	//   20   40:aload_1         
	//   21   41:ldc2            #296 <String "ns_ts">
	//   22   44:invokestatic    #302 <Method String XMLBuilder.getLabelFromEvent(String, String)>
	//   23   47:invokestatic    #243 <Method boolean Utils.isNotEmpty(String)>
	//   24   50:ifeq            207
		s1 = h();
	//   25   53:aload_0         
	//   26   54:invokespecial   #486 <Method String h()>
	//   27   57:astore_3        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_202;
	//   28   58:aload_3         
	//   29   59:ifnull          202
		if(c(s1) < getCacheMaxBatchFiles())
	//*  30   62:aload_0         
	//*  31   63:aload_3         
	//*  32   64:invokespecial   #524 <Method int c(String)>
	//*  33   67:aload_0         
	//*  34   68:invokevirtual   #526 <Method int getCacheMaxBatchFiles()>
	//*  35   71:icmpge          124
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   36   74:new             #212 <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #213 <Method void StringBuilder()>
	//   39   81:astore          4
			stringbuilder1.append("\n");
	//   40   83:aload           4
	//   41   85:ldc2            #590 <String "\n">
	//   42   88:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
			stringbuilder1.append(s);
	//   44   92:aload           4
	//   45   94:aload_1         
	//   46   95:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   47   98:pop             
			s = stringbuilder1.toString();
	//   48   99:aload           4
	//   49  101:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   50  104:astore_1        
			FileUtils.writeEvent(a, s1, 32768, s);
	//   51  105:aload_0         
	//   52  106:getfield        #48  <Field Core a>
	//   53  109:aload_3         
	//   54  110:ldc2            #591 <Int 32768>
	//   55  113:aload_1         
	//   56  114:invokestatic    #306 <Method void FileUtils.writeEvent(Core, String, int, String)>
			c();
	//   57  117:aload_0         
	//   58  118:invokespecial   #312 <Method void c()>
			break MISSING_BLOCK_LABEL_207;
	//   59  121:goto            207
		}
		CSLog.d(((Object) (this)), "The newest cache batch file is full");
	//   60  124:aload_0         
	//   61  125:ldc2            #593 <String "The newest cache batch file is full">
	//   62  128:invokestatic    #193 <Method void CSLog.d(Object, String)>
		if(f().size() >= getCacheMaxMeasurements() / getCacheMaxBatchFiles())
	//*  63  131:aload_0         
	//*  64  132:invokespecial   #407 <Method List f()>
	//*  65  135:invokeinterface #412 <Method int List.size()>
	//*  66  140:aload_0         
	//*  67  141:invokevirtual   #595 <Method int getCacheMaxMeasurements()>
	//*  68  144:aload_0         
	//*  69  145:invokevirtual   #526 <Method int getCacheMaxBatchFiles()>
	//*  70  148:idiv            
	//*  71  149:icmplt          202
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   72  152:new             #212 <Class StringBuilder>
	//   73  155:dup             
	//   74  156:invokespecial   #213 <Method void StringBuilder()>
	//   75  159:astore_3        
			stringbuilder.append("reached the cache max (");
	//   76  160:aload_3         
	//   77  161:ldc2            #597 <String "reached the cache max (">
	//   78  164:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   79  167:pop             
			stringbuilder.append(getCacheMaxMeasurements());
	//   80  168:aload_3         
	//   81  169:aload_0         
	//   82  170:invokevirtual   #595 <Method int getCacheMaxMeasurements()>
	//   83  173:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   84  176:pop             
			stringbuilder.append(") size");
	//   85  177:aload_3         
	//   86  178:ldc2            #599 <String ") size">
	//   87  181:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   88  184:pop             
			CSLog.d(((Object) (this)), stringbuilder.toString());
	//   89  185:aload_0         
	//   90  186:aload_3         
	//   91  187:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   92  190:invokestatic    #193 <Method void CSLog.d(Object, String)>
			a(g(), true);
	//   93  193:aload_0         
	//   94  194:aload_0         
	//   95  195:invokespecial   #601 <Method String g()>
	//   96  198:iconst_1        
	//   97  199:invokespecial   #390 <Method void a(String, boolean)>
		}
		b(s);
	//   98  202:aload_0         
	//   99  203:aload_1         
	//  100  204:invokespecial   #603 <Method void b(String)>
		this;
	//  101  207:aload_0         
		JVM INSTR monitorexit ;
	//  102  208:monitorexit     
		return;
	//  103  209:return          
		s;
	//  104  210:astore_1        
	//* 105  211:aload_0         
		throw s;
	//  106  212:monitorexit     
	//  107  213:aload_1         
	//  108  214:athrow          
	}

	public void setCacheMaxBatchFiles(int i1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(i1 <= 0)
	//*   5   11:iload_1         
	//*   6   12:ifgt            16
		{
			return;
	//    7   15:return          
		} else
		{
			c = i1;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #515 <Field int c>
			return;
	//   11   21:return          
		}
	}

	public void setCacheMaxMeasurements(int i1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			b = i1;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #518 <Field int b>
			return;
	//    8   16:return          
		}
	}

	public void setCacheMaxPosts(int i1)
	{
		d = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #323 <Field int d>
	//    3    5:return          
	}

	public void setCacheMeasurementExpiry(int i1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			f = i1;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:putfield        #138 <Field long f>
			return;
	//    9   17:return          
		}
	}

	public void setCacheWaitMinutes(int i1)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			e = i1;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:putfield        #325 <Field long e>
			return;
	//    9   17:return          
		}
	}

	public void setUrl(String s)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Core a>
	//*   2    4:invokevirtual   #477 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			g = s;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #36  <Field String g>
			return;
	//    8   16:return          
		}
	}

	protected final Core a;
	private int b;
	private int c;
	private int d;
	private long e;
	private long f;
	private String g;
	private final String h;
	private ArrayList i;
	private String j;
	private int k;
	private long l;
	private long m;
}
