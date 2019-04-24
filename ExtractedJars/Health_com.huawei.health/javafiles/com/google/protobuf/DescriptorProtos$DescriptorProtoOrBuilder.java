// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$DescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract DescriptorProtos.EnumDescriptorProto getEnumType(int i);

	public abstract int getEnumTypeCount();

	public abstract List getEnumTypeList();

	public abstract der getEnumTypeOrBuilder(int i);

	public abstract List getEnumTypeOrBuilderList();

	public abstract DescriptorProtos.FieldDescriptorProto getExtension(int i);

	public abstract int getExtensionCount();

	public abstract List getExtensionList();

	public abstract lder getExtensionOrBuilder(int i);

	public abstract List getExtensionOrBuilderList();

	public abstract Range getExtensionRange(int i);

	public abstract int getExtensionRangeCount();

	public abstract List getExtensionRangeList();

	public abstract RangeOrBuilder getExtensionRangeOrBuilder(int i);

	public abstract List getExtensionRangeOrBuilderList();

	public abstract DescriptorProtos.FieldDescriptorProto getField(int i);

	public abstract int getFieldCount();

	public abstract List getFieldList();

	public abstract lder getFieldOrBuilder(int i);

	public abstract List getFieldOrBuilderList();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract DescriptorProtos.DescriptorProto getNestedType(int i);

	public abstract int getNestedTypeCount();

	public abstract List getNestedTypeList();

	public abstract DescriptorProtos$DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i);

	public abstract List getNestedTypeOrBuilderList();

	public abstract DescriptorProtos.OneofDescriptorProto getOneofDecl(int i);

	public abstract int getOneofDeclCount();

	public abstract List getOneofDeclList();

	public abstract lder getOneofDeclOrBuilder(int i);

	public abstract List getOneofDeclOrBuilderList();

	public abstract DescriptorProtos.MessageOptions getOptions();

	public abstract DescriptorProtos.MessageOptionsOrBuilder getOptionsOrBuilder();

	public abstract String getReservedName(int i);

	public abstract ByteString getReservedNameBytes(int i);

	public abstract int getReservedNameCount();

	public abstract List getReservedNameList();

	public abstract ange getReservedRange(int i);

	public abstract int getReservedRangeCount();

	public abstract List getReservedRangeList();

	public abstract angeOrBuilder getReservedRangeOrBuilder(int i);

	public abstract List getReservedRangeOrBuilderList();

	public abstract boolean hasName();

	public abstract boolean hasOptions();
}
