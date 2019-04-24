// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource, DataSpec

public static final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource.HttpDataSourceException
{

	public final Map headerFields;
	public final int responseCode;

	public HttpDataSource$InvalidResponseCodeException(int i, Map map, DataSpec dataspec)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #16  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("Response code: ");
	//    4    9:aload           4
	//    5   11:ldc1            #21  <String "Response code: ">
	//    6   13:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_1         
	//   10   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		super(stringbuilder.toString(), dataspec, 1);
	//   12   24:aload_0         
	//   13   25:aload           4
	//   14   27:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   15   30:aload_3         
	//   16   31:iconst_1        
	//   17   32:invokespecial   #35  <Method void HttpDataSource$HttpDataSourceException(String, DataSpec, int)>
		responseCode = i;
	//   18   35:aload_0         
	//   19   36:iload_1         
	//   20   37:putfield        #37  <Field int responseCode>
		headerFields = map;
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:putfield        #39  <Field Map headerFields>
	//   24   45:return          
	}
}
