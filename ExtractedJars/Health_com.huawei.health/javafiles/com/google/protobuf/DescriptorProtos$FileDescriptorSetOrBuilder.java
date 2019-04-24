// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos

public static interface DescriptorProtos$FileDescriptorSetOrBuilder
	extends MessageOrBuilder
{

	public abstract DescriptorProtos.FileDescriptorProto getFile(int i);

	public abstract int getFileCount();

	public abstract List getFileList();

	public abstract r getFileOrBuilder(int i);

	public abstract List getFileOrBuilderList();
}
