// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
	extends MessageOrBuilder
{

	public abstract int getBegin();

	public abstract int getEnd();

	public abstract int getPath(int i);

	public abstract int getPathCount();

	public abstract List getPathList();

	public abstract String getSourceFile();

	public abstract ByteString getSourceFileBytes();

	public abstract boolean hasBegin();

	public abstract boolean hasEnd();

	public abstract boolean hasSourceFile();
}
