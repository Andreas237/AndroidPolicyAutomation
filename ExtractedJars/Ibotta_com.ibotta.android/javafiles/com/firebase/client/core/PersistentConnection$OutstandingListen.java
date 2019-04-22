// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.QuerySpec;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection, Tag

static class PersistentConnection$OutstandingListen
{

	public SyncTree.SyncTreeHash getHashFunction()
	{
		return hashFunction;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SyncTree$SyncTreeHash hashFunction>
	//    2    4:areturn         
	}

	public QuerySpec getQuery()
	{
		return query;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field QuerySpec query>
	//    2    4:areturn         
	}

	public Tag getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Tag tag>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(query.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field QuerySpec query>
	//    7   13:invokevirtual   #51  <Method String QuerySpec.toString()>
	//    8   16:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(" (Tag: ");
	//   10   20:aload_1         
	//   11   21:ldc1            #57  <String " (Tag: ">
	//   12   23:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(((Object) (tag)));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #28  <Field Tag tag>
	//   17   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   18   35:pop             
		stringbuilder.append(")");
	//   19   36:aload_1         
	//   20   37:ldc1            #62  <String ")">
	//   21   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		return stringbuilder.toString();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   25   47:areturn         
	}

	private final SyncTree.SyncTreeHash hashFunction;
	private final QuerySpec query;
	private final ner resultListener;
	private final Tag tag;


/*
	static QuerySpec access$400(PersistentConnection$OutstandingListen persistentconnection$outstandinglisten)
	{
		return persistentconnection$outstandinglisten.query;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field QuerySpec query>
	//    2    4:areturn         
	}

*/


/*
	static ner access$500(PersistentConnection$OutstandingListen persistentconnection$outstandinglisten)
	{
		return persistentconnection$outstandinglisten.resultListener;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PersistentConnection$RequestResultListener resultListener>
	//    2    4:areturn         
	}

*/

	private PersistentConnection$OutstandingListen(ner ner, QuerySpec queryspec, Tag tag1, SyncTree.SyncTreeHash synctreehash)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		resultListener = ner;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field PersistentConnection$RequestResultListener resultListener>
		query = queryspec;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field QuerySpec query>
		hashFunction = synctreehash;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #26  <Field SyncTree$SyncTreeHash hashFunction>
		tag = tag1;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #28  <Field Tag tag>
	//   14   25:return          
	}

	PersistentConnection$OutstandingListen(ner ner, QuerySpec queryspec, Tag tag1, SyncTree.SyncTreeHash synctreehash, PersistentConnection._cls1 _pcls1)
	{
		this(ner, queryspec, tag1, synctreehash);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #32  <Method void PersistentConnection$OutstandingListen(PersistentConnection$RequestResultListener, QuerySpec, Tag, SyncTree$SyncTreeHash)>
	//    6    9:return          
	}
}
