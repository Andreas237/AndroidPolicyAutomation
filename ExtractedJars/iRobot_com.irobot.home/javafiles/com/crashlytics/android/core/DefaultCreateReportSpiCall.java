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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//			CreateReportSpiCall, CreateReportRequest, Report

class DefaultCreateReportSpiCall extends a
	implements CreateReportSpiCall
{

	public DefaultCreateReportSpiCall(i j, String s1, String s2, e e)
	{
		super(j, s1, s2, e, c.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #27  <Field c c.POST>
	//    6    9:invokespecial   #30  <Method void a(i, String, String, e, c)>
	//    7   12:return          
	}

	DefaultCreateReportSpiCall(i j, String s1, String s2, e e, c c1)
	{
		super(j, s1, s2, e, c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #30  <Method void a(i, String, String, e, c)>
	//    7   11:return          
	}

	private d applyHeadersTo(d d1, CreateReportRequest createreportrequest)
	{
		d1 = d1.a("X-CRASHLYTICS-API-KEY", createreportrequest.apiKey).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion());
	//    0    0:aload_1         
	//    1    1:ldc1            #35  <String "X-CRASHLYTICS-API-KEY">
	//    2    3:aload_2         
	//    3    4:getfield        #40  <Field String CreateReportRequest.apiKey>
	//    4    7:invokevirtual   #46  <Method d d.a(String, String)>
	//    5   10:ldc1            #48  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    6   12:ldc1            #50  <String "android">
	//    7   14:invokevirtual   #46  <Method d d.a(String, String)>
	//    8   17:ldc1            #52  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field i kit>
	//   11   23:invokevirtual   #62  <Method String i.getVersion()>
	//   12   26:invokevirtual   #46  <Method d d.a(String, String)>
	//   13   29:astore_1        
		for(createreportrequest = ((CreateReportRequest) (createreportrequest.report.getCustomHeaders().entrySet().iterator())); ((Iterator) (createreportrequest)).hasNext();)
	//*  14   30:aload_2         
	//*  15   31:getfield        #66  <Field Report CreateReportRequest.report>
	//*  16   34:invokeinterface #72  <Method Map Report.getCustomHeaders()>
	//*  17   39:invokeinterface #78  <Method Set Map.entrySet()>
	//*  18   44:invokeinterface #84  <Method Iterator Set.iterator()>
	//*  19   49:astore_2        
	//*  20   50:aload_2         
	//*  21   51:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//*  22   56:ifeq            76
			d1 = d1.a((java.util.Map.Entry)((Iterator) (createreportrequest)).next());
	//   23   59:aload_1         
	//   24   60:aload_2         
	//   25   61:invokeinterface #94  <Method Object Iterator.next()>
	//   26   66:checkcast       #96  <Class java.util.Map$Entry>
	//   27   69:invokevirtual   #99  <Method d d.a(java.util.Map$Entry)>
	//   28   72:astore_1        

	//*  29   73:goto            50
		return d1;
	//   30   76:aload_1         
	//   31   77:areturn         
	}

	private d applyMultipartDataTo(d d1, Report report)
	{
		d1.e("report[identifier]", report.getIdentifier());
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "report[identifier]">
	//    2    3:aload_2         
	//    3    4:invokeinterface #104 <Method String Report.getIdentifier()>
	//    4    9:invokevirtual   #107 <Method d d.e(String, String)>
	//    5   12:pop             
		if(report.getFiles().length == 1)
	//*   6   13:aload_2         
	//*   7   14:invokeinterface #111 <Method File[] Report.getFiles()>
	//*   8   19:arraylength     
	//*   9   20:iconst_1        
	//*  10   21:icmpne          113
		{
			l l1 = b.a.a.a.c.g();
	//   11   24:invokestatic    #117 <Method l b.a.a.a.c.g()>
	//   12   27:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   13   29:new             #119 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #122 <Method void StringBuilder()>
	//   16   36:astore          7
			stringbuilder.append("Adding single file ");
	//   17   38:aload           7
	//   18   40:ldc1            #124 <String "Adding single file ">
	//   19   42:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			stringbuilder.append(report.getFileName());
	//   21   46:aload           7
	//   22   48:aload_2         
	//   23   49:invokeinterface #131 <Method String Report.getFileName()>
	//   24   54:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			stringbuilder.append(" to report ");
	//   26   58:aload           7
	//   27   60:ldc1            #133 <String " to report ">
	//   28   62:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:pop             
			stringbuilder.append(report.getIdentifier());
	//   30   66:aload           7
	//   31   68:aload_2         
	//   32   69:invokeinterface #104 <Method String Report.getIdentifier()>
	//   33   74:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   34   77:pop             
			l1.a("CrashlyticsCore", stringbuilder.toString());
	//   35   78:aload           6
	//   36   80:ldc1            #135 <String "CrashlyticsCore">
	//   37   82:aload           7
	//   38   84:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   39   87:invokeinterface #143 <Method void l.a(String, String)>
			return d1.a("report[file]", report.getFileName(), "application/octet-stream", report.getFile());
	//   40   92:aload_1         
	//   41   93:ldc1            #13  <String "report[file]">
	//   42   95:aload_2         
	//   43   96:invokeinterface #131 <Method String Report.getFileName()>
	//   44  101:ldc1            #10  <String "application/octet-stream">
	//   45  103:aload_2         
	//   46  104:invokeinterface #147 <Method File Report.getFile()>
	//   47  109:invokevirtual   #150 <Method d d.a(String, String, String, File)>
	//   48  112:areturn         
		}
		File afile[] = report.getFiles();
	//   49  113:aload_2         
	//   50  114:invokeinterface #111 <Method File[] Report.getFiles()>
	//   51  119:astore          6
		int i1 = afile.length;
	//   52  121:aload           6
	//   53  123:arraylength     
	//   54  124:istore          5
		int j = 0;
	//   55  126:iconst_0        
	//   56  127:istore_3        
		int k = 0;
	//   57  128:iconst_0        
	//   58  129:istore          4
		for(; j < i1; j++)
	//*  59  131:iload_3         
	//*  60  132:iload           5
	//*  61  134:icmpge          275
		{
			File file = afile[j];
	//   62  137:aload           6
	//   63  139:iload_3         
	//   64  140:aaload          
	//   65  141:astore          7
			Object obj = ((Object) (b.a.a.a.c.g()));
	//   66  143:invokestatic    #117 <Method l b.a.a.a.c.g()>
	//   67  146:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//   68  148:new             #119 <Class StringBuilder>
	//   69  151:dup             
	//   70  152:invokespecial   #122 <Method void StringBuilder()>
	//   71  155:astore          9
			stringbuilder1.append("Adding file ");
	//   72  157:aload           9
	//   73  159:ldc1            #152 <String "Adding file ">
	//   74  161:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   75  164:pop             
			stringbuilder1.append(file.getName());
	//   76  165:aload           9
	//   77  167:aload           7
	//   78  169:invokevirtual   #157 <Method String File.getName()>
	//   79  172:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   80  175:pop             
			stringbuilder1.append(" to report ");
	//   81  176:aload           9
	//   82  178:ldc1            #133 <String " to report ">
	//   83  180:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   84  183:pop             
			stringbuilder1.append(report.getIdentifier());
	//   85  184:aload           9
	//   86  186:aload_2         
	//   87  187:invokeinterface #104 <Method String Report.getIdentifier()>
	//   88  192:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   89  195:pop             
			((l) (obj)).a("CrashlyticsCore", stringbuilder1.toString());
	//   90  196:aload           8
	//   91  198:ldc1            #135 <String "CrashlyticsCore">
	//   92  200:aload           9
	//   93  202:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   94  205:invokeinterface #143 <Method void l.a(String, String)>
			obj = ((Object) (new StringBuilder()));
	//   95  210:new             #119 <Class StringBuilder>
	//   96  213:dup             
	//   97  214:invokespecial   #122 <Method void StringBuilder()>
	//   98  217:astore          8
			((StringBuilder) (obj)).append("report[file");
	//   99  219:aload           8
	//  100  221:ldc1            #19  <String "report[file">
	//  101  223:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  102  226:pop             
			((StringBuilder) (obj)).append(k);
	//  103  227:aload           8
	//  104  229:iload           4
	//  105  231:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  106  234:pop             
			((StringBuilder) (obj)).append("]");
	//  107  235:aload           8
	//  108  237:ldc1            #162 <String "]">
	//  109  239:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  110  242:pop             
			d1.a(((StringBuilder) (obj)).toString(), file.getName(), "application/octet-stream", file);
	//  111  243:aload_1         
	//  112  244:aload           8
	//  113  246:invokevirtual   #138 <Method String StringBuilder.toString()>
	//  114  249:aload           7
	//  115  251:invokevirtual   #157 <Method String File.getName()>
	//  116  254:ldc1            #10  <String "application/octet-stream">
	//  117  256:aload           7
	//  118  258:invokevirtual   #150 <Method d d.a(String, String, String, File)>
	//  119  261:pop             
			k++;
	//  120  262:iload           4
	//  121  264:iconst_1        
	//  122  265:iadd            
	//  123  266:istore          4
		}

	//  124  268:iload_3         
	//  125  269:iconst_1        
	//  126  270:iadd            
	//  127  271:istore_3        
	//* 128  272:goto            131
		return d1;
	//  129  275:aload_1         
	//  130  276:areturn         
	}

	public boolean invoke(CreateReportRequest createreportrequest)
	{
		createreportrequest = ((CreateReportRequest) (applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest), createreportrequest.report)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #168 <Method d getHttpRequest()>
	//    4    6:aload_1         
	//    5    7:invokespecial   #170 <Method d applyHeadersTo(d, CreateReportRequest)>
	//    6   10:aload_1         
	//    7   11:getfield        #66  <Field Report CreateReportRequest.report>
	//    8   14:invokespecial   #172 <Method d applyMultipartDataTo(d, Report)>
	//    9   17:astore_1        
		Object obj = ((Object) (b.a.a.a.c.g()));
	//   10   18:invokestatic    #117 <Method l b.a.a.a.c.g()>
	//   11   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #119 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #122 <Method void StringBuilder()>
	//   15   29:astore          4
		stringbuilder.append("Sending report to: ");
	//   16   31:aload           4
	//   17   33:ldc1            #174 <String "Sending report to: ">
	//   18   35:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append(getUrl());
	//   20   39:aload           4
	//   21   41:aload_0         
	//   22   42:invokevirtual   #177 <Method String getUrl()>
	//   23   45:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
	//   25   49:aload_3         
	//   26   50:ldc1            #135 <String "CrashlyticsCore">
	//   27   52:aload           4
	//   28   54:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   29   57:invokeinterface #143 <Method void l.a(String, String)>
		int j = ((d) (createreportrequest)).b();
	//   30   62:aload_1         
	//   31   63:invokevirtual   #181 <Method int d.b()>
	//   32   66:istore_2        
		obj = ((Object) (b.a.a.a.c.g()));
	//   33   67:invokestatic    #117 <Method l b.a.a.a.c.g()>
	//   34   70:astore_3        
		stringbuilder = new StringBuilder();
	//   35   71:new             #119 <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #122 <Method void StringBuilder()>
	//   38   78:astore          4
		stringbuilder.append("Create report request ID: ");
	//   39   80:aload           4
	//   40   82:ldc1            #183 <String "Create report request ID: ">
	//   41   84:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
		stringbuilder.append(((d) (createreportrequest)).b("X-REQUEST-ID"));
	//   43   88:aload           4
	//   44   90:aload_1         
	//   45   91:ldc1            #185 <String "X-REQUEST-ID">
	//   46   93:invokevirtual   #188 <Method String d.b(String)>
	//   47   96:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   48   99:pop             
		((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
	//   49  100:aload_3         
	//   50  101:ldc1            #135 <String "CrashlyticsCore">
	//   51  103:aload           4
	//   52  105:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   53  108:invokeinterface #143 <Method void l.a(String, String)>
		createreportrequest = ((CreateReportRequest) (b.a.a.a.c.g()));
	//   54  113:invokestatic    #117 <Method l b.a.a.a.c.g()>
	//   55  116:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   56  117:new             #119 <Class StringBuilder>
	//   57  120:dup             
	//   58  121:invokespecial   #122 <Method void StringBuilder()>
	//   59  124:astore_3        
		((StringBuilder) (obj)).append("Result was: ");
	//   60  125:aload_3         
	//   61  126:ldc1            #190 <String "Result was: ">
	//   62  128:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   63  131:pop             
		((StringBuilder) (obj)).append(j);
	//   64  132:aload_3         
	//   65  133:iload_2         
	//   66  134:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   67  137:pop             
		((l) (createreportrequest)).a("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//   68  138:aload_1         
	//   69  139:ldc1            #135 <String "CrashlyticsCore">
	//   70  141:aload_3         
	//   71  142:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   72  145:invokeinterface #143 <Method void l.a(String, String)>
		return s.a(j) == 0;
	//   73  150:iload_2         
	//   74  151:invokestatic    #195 <Method int s.a(int)>
	//   75  154:ifne            159
	//   76  157:iconst_1        
	//   77  158:ireturn         
	//   78  159:iconst_0        
	//   79  160:ireturn         
	}

	static final String FILE_CONTENT_TYPE = "application/octet-stream";
	static final String FILE_PARAM = "report[file]";
	static final String IDENTIFIER_PARAM = "report[identifier]";
	static final String MULTI_FILE_PARAM = "report[file";
}
