// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			ResponseJsonStreamReader

class ResponseJsonStreamReader$2
	implements stReader
{

	public Object read(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		if(val$streamReader.isNextList())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ResponseJsonStreamReader val$streamReader>
	//*   2    4:invokevirtual   #33  <Method boolean ResponseJsonStreamReader.isNextList()>
	//*   3    7:ifeq            19
			return ((Object) (readList(responsejsonstreamreader)));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field ResponseJsonStreamReader this$0>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #34  <Method java.util.List ResponseJsonStreamReader.readList(ResponseJsonStreamReader)>
	//    8   18:areturn         
		if(val$streamReader.isNextObject())
	//*   9   19:aload_0         
	//*  10   20:getfield        #21  <Field ResponseJsonStreamReader val$streamReader>
	//*  11   23:invokevirtual   #37  <Method boolean ResponseJsonStreamReader.isNextObject()>
	//*  12   26:ifeq            38
			return ((Object) (readObject(responsejsonstreamreader)));
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field ResponseJsonStreamReader this$0>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #41  <Method java.util.Map ResponseJsonStreamReader.readObject(ResponseJsonStreamReader)>
	//   17   37:areturn         
		else
			return responsejsonstreamreader.nextScalar(true);
	//   18   38:aload_1         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #45  <Method Object ResponseJsonStreamReader.nextScalar(boolean)>
	//   21   43:areturn         
	}

	final ResponseJsonStreamReader this$0;
	final ResponseJsonStreamReader val$streamReader;

	ResponseJsonStreamReader$2()
	{
		this$0 = final_responsejsonstreamreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ResponseJsonStreamReader this$0>
		val$streamReader = ResponseJsonStreamReader.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ResponseJsonStreamReader val$streamReader>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
