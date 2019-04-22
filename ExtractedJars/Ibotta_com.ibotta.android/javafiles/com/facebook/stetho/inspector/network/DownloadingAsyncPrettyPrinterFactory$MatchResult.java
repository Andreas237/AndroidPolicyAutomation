// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;


// Referenced classes of package com.facebook.stetho.inspector.network:
//			DownloadingAsyncPrettyPrinterFactory, PrettyPrinterDisplayType

protected class DownloadingAsyncPrettyPrinterFactory$MatchResult
{

	public PrettyPrinterDisplayType getDisplayType()
	{
		return mDisplayType;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PrettyPrinterDisplayType mDisplayType>
	//    2    4:areturn         
	}

	public String getSchemaUri()
	{
		return mSchemaUri;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mSchemaUri>
	//    2    4:areturn         
	}

	private final PrettyPrinterDisplayType mDisplayType;
	private final String mSchemaUri;
	final DownloadingAsyncPrettyPrinterFactory this$0;

	public DownloadingAsyncPrettyPrinterFactory$MatchResult(String s, PrettyPrinterDisplayType prettyprinterdisplaytype)
	{
		this$0 = DownloadingAsyncPrettyPrinterFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DownloadingAsyncPrettyPrinterFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mSchemaUri = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String mSchemaUri>
		mDisplayType = prettyprinterdisplaytype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field PrettyPrinterDisplayType mDisplayType>
	//   11   19:return          
	}
}
