// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.s;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.i;
import b.a.a.a.l;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			CreateReportSpiCall, Report, CreateReportRequest

class NativeCreateReportSpiCall extends a
	implements CreateReportSpiCall
{

	public NativeCreateReportSpiCall(i j, String s1, String s2, e e)
	{
		super(j, s1, s2, e, c.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #51  <Field c c.POST>
	//    6    9:invokespecial   #54  <Method void a(i, String, String, e, c)>
	//    7   12:return          
	}

	private d applyHeadersTo(d d1, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Crashlytics Android SDK/");
	//    4    8:aload_3         
	//    5    9:ldc1            #64  <String "Crashlytics Android SDK/">
	//    6   11:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(kit.getVersion());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #72  <Field i kit>
	//   11   20:invokevirtual   #78  <Method String i.getVersion()>
	//   12   23:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		d1.a("User-Agent", stringbuilder.toString()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).a("X-CRASHLYTICS-API-KEY", s1);
	//   14   27:aload_1         
	//   15   28:ldc1            #80  <String "User-Agent">
	//   16   30:aload_3         
	//   17   31:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   18   34:invokevirtual   #89  <Method d d.a(String, String)>
	//   19   37:ldc1            #91  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//   20   39:ldc1            #93  <String "android">
	//   21   41:invokevirtual   #89  <Method d d.a(String, String)>
	//   22   44:ldc1            #95  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//   23   46:aload_0         
	//   24   47:getfield        #72  <Field i kit>
	//   25   50:invokevirtual   #78  <Method String i.getVersion()>
	//   26   53:invokevirtual   #89  <Method d d.a(String, String)>
	//   27   56:ldc1            #97  <String "X-CRASHLYTICS-API-KEY">
	//   28   58:aload_2         
	//   29   59:invokevirtual   #89  <Method d d.a(String, String)>
	//   30   62:pop             
		return d1;
	//   31   63:aload_1         
	//   32   64:areturn         
	}

	private d applyMultipartDataTo(d d1, Report report)
	{
		d1.e("report_id", report.getIdentifier());
	//    0    0:aload_1         
	//    1    1:ldc1            #37  <String "report_id">
	//    2    3:aload_2         
	//    3    4:invokeinterface #104 <Method String Report.getIdentifier()>
	//    4    9:invokevirtual   #107 <Method d d.e(String, String)>
	//    5   12:pop             
		File afile[] = report.getFiles();
	//    6   13:aload_2         
	//    7   14:invokeinterface #111 <Method File[] Report.getFiles()>
	//    8   19:astore          5
		int k = afile.length;
	//    9   21:aload           5
	//   10   23:arraylength     
	//   11   24:istore          4
		for(int j = 0; j < k; j++)
	//*  12   26:iconst_0        
	//*  13   27:istore_3        
	//*  14   28:iload_3         
	//*  15   29:iload           4
	//*  16   31:icmpge          252
		{
			File file = afile[j];
	//   17   34:aload           5
	//   18   36:iload_3         
	//   19   37:aaload          
	//   20   38:astore          6
			if(file.getName().equals("minidump"))
	//*  21   40:aload           6
	//*  22   42:invokevirtual   #116 <Method String File.getName()>
	//*  23   45:ldc1            #118 <String "minidump">
	//*  24   47:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  25   50:ifeq            74
				report = "minidump_file";
	//   26   53:ldc1            #31  <String "minidump_file">
	//   27   55:astore_2        
			else
	//*  28   56:aload_1         
	//*  29   57:aload_2         
	//*  30   58:aload           6
	//*  31   60:invokevirtual   #116 <Method String File.getName()>
	//*  32   63:ldc1            #19  <String "application/octet-stream">
	//*  33   65:aload           6
	//*  34   67:invokevirtual   #127 <Method d d.a(String, String, String, File)>
	//*  35   70:pop             
	//*  36   71:goto            245
			if(file.getName().equals("metadata"))
	//*  37   74:aload           6
	//*  38   76:invokevirtual   #116 <Method String File.getName()>
	//*  39   79:ldc1            #129 <String "metadata">
	//*  40   81:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  41   84:ifeq            93
				report = "crash_meta_file";
	//   42   87:ldc1            #28  <String "crash_meta_file">
	//   43   89:astore_2        
			else
	//*  44   90:goto            56
			if(file.getName().equals("binaryImages"))
	//*  45   93:aload           6
	//*  46   95:invokevirtual   #116 <Method String File.getName()>
	//*  47   98:ldc1            #131 <String "binaryImages">
	//*  48  100:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  49  103:ifeq            112
				report = "binary_images_file";
	//   50  106:ldc1            #13  <String "binary_images_file">
	//   51  108:astore_2        
			else
	//*  52  109:goto            56
			if(file.getName().equals("session"))
	//*  53  112:aload           6
	//*  54  114:invokevirtual   #116 <Method String File.getName()>
	//*  55  117:ldc1            #133 <String "session">
	//*  56  119:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  57  122:ifeq            131
				report = "session_meta_file";
	//   58  125:ldc1            #40  <String "session_meta_file">
	//   59  127:astore_2        
			else
	//*  60  128:goto            56
			if(file.getName().equals("app"))
	//*  61  131:aload           6
	//*  62  133:invokevirtual   #116 <Method String File.getName()>
	//*  63  136:ldc1            #135 <String "app">
	//*  64  138:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  65  141:ifeq            150
				report = "app_meta_file";
	//   66  144:ldc1            #10  <String "app_meta_file">
	//   67  146:astore_2        
			else
	//*  68  147:goto            56
			if(file.getName().equals("device"))
	//*  69  150:aload           6
	//*  70  152:invokevirtual   #116 <Method String File.getName()>
	//*  71  155:ldc1            #137 <String "device">
	//*  72  157:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  73  160:ifeq            169
				report = "device_meta_file";
	//   74  163:ldc1            #16  <String "device_meta_file">
	//   75  165:astore_2        
			else
	//*  76  166:goto            56
			if(file.getName().equals("os"))
	//*  77  169:aload           6
	//*  78  171:invokevirtual   #116 <Method String File.getName()>
	//*  79  174:ldc1            #139 <String "os">
	//*  80  176:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  81  179:ifeq            188
				report = "os_meta_file";
	//   82  182:ldc1            #34  <String "os_meta_file">
	//   83  184:astore_2        
			else
	//*  84  185:goto            56
			if(file.getName().equals("user"))
	//*  85  188:aload           6
	//*  86  190:invokevirtual   #116 <Method String File.getName()>
	//*  87  193:ldc1            #141 <String "user">
	//*  88  195:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  89  198:ifeq            207
				report = "user_meta_file";
	//   90  201:ldc1            #43  <String "user_meta_file">
	//   91  203:astore_2        
			else
	//*  92  204:goto            56
			if(file.getName().equals("logs"))
	//*  93  207:aload           6
	//*  94  209:invokevirtual   #116 <Method String File.getName()>
	//*  95  212:ldc1            #143 <String "logs">
	//*  96  214:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  97  217:ifeq            226
			{
				report = "logs_file";
	//   98  220:ldc1            #25  <String "logs_file">
	//   99  222:astore_2        
			} else
	//* 100  223:goto            56
			{
				if(!file.getName().equals("keys"))
					continue;
	//  101  226:aload           6
	//  102  228:invokevirtual   #116 <Method String File.getName()>
	//  103  231:ldc1            #145 <String "keys">
	//  104  233:invokevirtual   #124 <Method boolean String.equals(Object)>
	//  105  236:ifeq            245
				report = "keys_file";
	//  106  239:ldc1            #22  <String "keys_file">
	//  107  241:astore_2        
			}
			d1.a(((String) (report)), file.getName(), "application/octet-stream", file);
		}

	//  108  242:goto            56
	//  109  245:iload_3         
	//  110  246:iconst_1        
	//  111  247:iadd            
	//  112  248:istore_3        
	//* 113  249:goto            28
		return d1;
	//  114  252:aload_1         
	//  115  253:areturn         
	}

	public boolean invoke(CreateReportRequest createreportrequest)
	{
		createreportrequest = ((CreateReportRequest) (applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest.apiKey), createreportrequest.report)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #151 <Method d getHttpRequest()>
	//    4    6:aload_1         
	//    5    7:getfield        #156 <Field String CreateReportRequest.apiKey>
	//    6   10:invokespecial   #158 <Method d applyHeadersTo(d, String)>
	//    7   13:aload_1         
	//    8   14:getfield        #162 <Field Report CreateReportRequest.report>
	//    9   17:invokespecial   #164 <Method d applyMultipartDataTo(d, Report)>
	//   10   20:astore_1        
		Object obj = ((Object) (b.a.a.a.c.g()));
	//   11   21:invokestatic    #170 <Method l b.a.a.a.c.g()>
	//   12   24:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   25:new             #59  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #62  <Method void StringBuilder()>
	//   16   32:astore          4
		stringbuilder.append("Sending report to: ");
	//   17   34:aload           4
	//   18   36:ldc1            #172 <String "Sending report to: ">
	//   19   38:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append(getUrl());
	//   21   42:aload           4
	//   22   44:aload_0         
	//   23   45:invokevirtual   #175 <Method String getUrl()>
	//   24   48:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
	//   26   52:aload_3         
	//   27   53:ldc1            #177 <String "CrashlyticsCore">
	//   28   55:aload           4
	//   29   57:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   30   60:invokeinterface #182 <Method void l.a(String, String)>
		int j = ((d) (createreportrequest)).b();
	//   31   65:aload_1         
	//   32   66:invokevirtual   #186 <Method int d.b()>
	//   33   69:istore_2        
		createreportrequest = ((CreateReportRequest) (b.a.a.a.c.g()));
	//   34   70:invokestatic    #170 <Method l b.a.a.a.c.g()>
	//   35   73:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   36   74:new             #59  <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #62  <Method void StringBuilder()>
	//   39   81:astore_3        
		((StringBuilder) (obj)).append("Result was: ");
	//   40   82:aload_3         
	//   41   83:ldc1            #188 <String "Result was: ">
	//   42   85:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
		((StringBuilder) (obj)).append(j);
	//   44   89:aload_3         
	//   45   90:iload_2         
	//   46   91:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//   47   94:pop             
		((l) (createreportrequest)).a("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//   48   95:aload_1         
	//   49   96:ldc1            #177 <String "CrashlyticsCore">
	//   50   98:aload_3         
	//   51   99:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   52  102:invokeinterface #182 <Method void l.a(String, String)>
		return s.a(j) == 0;
	//   53  107:iload_2         
	//   54  108:invokestatic    #196 <Method int s.a(int)>
	//   55  111:ifne            116
	//   56  114:iconst_1        
	//   57  115:ireturn         
	//   58  116:iconst_0        
	//   59  117:ireturn         
	}

	private static final String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
	private static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
	private static final String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
	private static final String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
	private static final String KEYS_FILE_MULTIPART_PARAM = "keys_file";
	private static final String LOGS_FILE_MULTIPART_PARAM = "logs_file";
	private static final String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
	private static final String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
	private static final String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
	private static final String REPORT_IDENTIFIER_PARAM = "report_id";
	private static final String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
	private static final String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";
}
