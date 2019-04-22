// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.*;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			AsyncPrettyPrinter, DownloadingAsyncPrettyPrinterFactory, PrettyPrinterDisplayType

static final class DownloadingAsyncPrettyPrinterFactory$2
	implements AsyncPrettyPrinter
{

	public PrettyPrinterDisplayType getPrettifiedType()
	{
		return PrettyPrinterDisplayType.TEXT;
	//    0    0:getstatic       #32  <Field PrettyPrinterDisplayType PrettyPrinterDisplayType.TEXT>
	//    1    3:areturn         
	}

	public void printTo(PrintWriter printwriter, InputStream inputstream)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("[Failed to parse header: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #41  <String "[Failed to parse header: ">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(val$headerName);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #18  <Field String val$headerName>
	//   11   20:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(" : ");
	//   13   24:aload_3         
	//   14   25:ldc1            #47  <String " : ">
	//   15   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(val$headerValue);
	//   17   31:aload_3         
	//   18   32:aload_0         
	//   19   33:getfield        #20  <Field String val$headerValue>
	//   20   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(" ]");
	//   22   40:aload_3         
	//   23   41:ldc1            #49  <String " ]">
	//   24   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		DownloadingAsyncPrettyPrinterFactory.access$000(printwriter, inputstream, stringbuilder.toString());
	//   26   47:aload_1         
	//   27   48:aload_2         
	//   28   49:aload_3         
	//   29   50:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   30   53:invokestatic    #57  <Method void DownloadingAsyncPrettyPrinterFactory.access$000(PrintWriter, InputStream, String)>
	//   31   56:return          
	}

	final String val$headerName;
	final String val$headerValue;

	DownloadingAsyncPrettyPrinterFactory$2(String s, String s1)
	{
		val$headerName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String val$headerName>
		val$headerValue = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String val$headerValue>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
