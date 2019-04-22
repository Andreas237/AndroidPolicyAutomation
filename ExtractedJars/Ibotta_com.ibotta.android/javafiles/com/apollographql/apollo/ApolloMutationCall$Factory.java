// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Mutation;

// Referenced classes of package com.apollographql.apollo:
//			ApolloMutationCall

public static interface ApolloMutationCall$Factory
{

	public abstract ApolloMutationCall mutate(Mutation mutation);

	public abstract ApolloMutationCall mutate(Mutation mutation, com.apollographql.apollo.api.Operation.Data data);
}
