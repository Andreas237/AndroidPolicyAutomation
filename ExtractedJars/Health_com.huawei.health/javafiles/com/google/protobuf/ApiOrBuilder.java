// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, Method, MethodOrBuilder, Mixin, 
//			MixinOrBuilder, ByteString, Option, OptionOrBuilder, 
//			SourceContext, SourceContextOrBuilder, Syntax

public interface ApiOrBuilder
	extends MessageOrBuilder
{

	public abstract Method getMethods(int i);

	public abstract int getMethodsCount();

	public abstract List getMethodsList();

	public abstract MethodOrBuilder getMethodsOrBuilder(int i);

	public abstract List getMethodsOrBuilderList();

	public abstract Mixin getMixins(int i);

	public abstract int getMixinsCount();

	public abstract List getMixinsList();

	public abstract MixinOrBuilder getMixinsOrBuilder(int i);

	public abstract List getMixinsOrBuilderList();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract Option getOptions(int i);

	public abstract int getOptionsCount();

	public abstract List getOptionsList();

	public abstract OptionOrBuilder getOptionsOrBuilder(int i);

	public abstract List getOptionsOrBuilderList();

	public abstract SourceContext getSourceContext();

	public abstract SourceContextOrBuilder getSourceContextOrBuilder();

	public abstract Syntax getSyntax();

	public abstract int getSyntaxValue();

	public abstract String getVersion();

	public abstract ByteString getVersionBytes();

	public abstract boolean hasSourceContext();
}
