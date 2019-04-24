// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$SourceCodeInfo$LocationOrBuilder
	extends MessageOrBuilder
{

	public abstract String getLeadingComments();

	public abstract ByteString getLeadingCommentsBytes();

	public abstract String getLeadingDetachedComments(int i);

	public abstract ByteString getLeadingDetachedCommentsBytes(int i);

	public abstract int getLeadingDetachedCommentsCount();

	public abstract List getLeadingDetachedCommentsList();

	public abstract int getPath(int i);

	public abstract int getPathCount();

	public abstract List getPathList();

	public abstract int getSpan(int i);

	public abstract int getSpanCount();

	public abstract List getSpanList();

	public abstract String getTrailingComments();

	public abstract ByteString getTrailingCommentsBytes();

	public abstract boolean hasLeadingComments();

	public abstract boolean hasTrailingComments();
}
