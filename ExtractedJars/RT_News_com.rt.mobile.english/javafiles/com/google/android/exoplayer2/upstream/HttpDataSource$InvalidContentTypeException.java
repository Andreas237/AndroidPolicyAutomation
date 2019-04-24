// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource, DataSpec

public static final class HttpDataSource$InvalidContentTypeException extends HttpDataSource.HttpDataSourceException
{

	public final String contentType;

	public HttpDataSource$InvalidContentTypeException(String s, DataSpec dataspec)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Invalid content type: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #18  <String "Invalid content type: ">
	//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(stringbuilder.toString(), dataspec, 1);
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #26  <Method String StringBuilder.toString()>
	//   15   26:aload_2         
	//   16   27:iconst_1        
	//   17   28:invokespecial   #29  <Method void HttpDataSource$HttpDataSourceException(String, DataSpec, int)>
		contentType = s;
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:putfield        #31  <Field String contentType>
	//   21   36:return          
	}
}
