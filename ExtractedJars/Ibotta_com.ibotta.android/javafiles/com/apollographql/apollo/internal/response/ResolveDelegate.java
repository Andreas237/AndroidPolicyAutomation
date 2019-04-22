// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.internal.Optional;
import java.util.List;

public interface ResolveDelegate
{

	public abstract void didResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables);

	public abstract void didResolveElement(int i);

	public abstract void didResolveList(List list);

	public abstract void didResolveNull();

	public abstract void didResolveObject(ResponseField responsefield, Optional optional);

	public abstract void didResolveScalar(Object obj);

	public abstract void willResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables);

	public abstract void willResolveElement(int i);

	public abstract void willResolveObject(ResponseField responsefield, Optional optional);

	public abstract void willResolveRootQuery(Operation operation);
}
