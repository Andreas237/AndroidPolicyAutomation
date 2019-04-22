// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.utilities.Predicate;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			WriteTree, UserWriteRecord, Path

class WriteTree$1
	implements Predicate
{

	public boolean evaluate(UserWriteRecord userwriterecord)
	{
		return (userwriterecord.isVisible() || val$includeHiddenWrites) && !val$writeIdsToExclude.contains(((Object) (Long.valueOf(userwriterecord.getWriteId())))) && (userwriterecord.getPath().contains(val$treePath) || val$treePath.contains(userwriterecord.getPath()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method boolean UserWriteRecord.isVisible()>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field boolean val$includeHiddenWrites>
	//    5   11:ifeq            63
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field List val$writeIdsToExclude>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #46  <Method long UserWriteRecord.getWriteId()>
	//   10   22:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   11   25:invokeinterface #58  <Method boolean List.contains(Object)>
	//   12   30:ifne            63
	//   13   33:aload_1         
	//   14   34:invokevirtual   #62  <Method Path UserWriteRecord.getPath()>
	//   15   37:aload_0         
	//   16   38:getfield        #30  <Field Path val$treePath>
	//   17   41:invokevirtual   #67  <Method boolean Path.contains(Path)>
	//   18   44:ifne            61
	//   19   47:aload_0         
	//   20   48:getfield        #30  <Field Path val$treePath>
	//   21   51:aload_1         
	//   22   52:invokevirtual   #62  <Method Path UserWriteRecord.getPath()>
	//   23   55:invokevirtual   #67  <Method boolean Path.contains(Path)>
	//   24   58:ifeq            63
	//   25   61:iconst_1        
	//   26   62:ireturn         
	//   27   63:iconst_0        
	//   28   64:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((UserWriteRecord)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class UserWriteRecord>
	//    3    5:invokevirtual   #69  <Method boolean evaluate(UserWriteRecord)>
	//    4    8:ireturn         
	}

	final WriteTree this$0;
	final boolean val$includeHiddenWrites;
	final Path val$treePath;
	final List val$writeIdsToExclude;

	WriteTree$1()
	{
		this$0 = final_writetree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field WriteTree this$0>
		val$includeHiddenWrites = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #26  <Field boolean val$includeHiddenWrites>
		val$writeIdsToExclude = list;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field List val$writeIdsToExclude>
		val$treePath = Path.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Path val$treePath>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
