// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$FileDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract String getDependency(int i);

	public abstract ByteString getDependencyBytes(int i);

	public abstract int getDependencyCount();

	public abstract List getDependencyList();

	public abstract DescriptorProtos.EnumDescriptorProto getEnumType(int i);

	public abstract int getEnumTypeCount();

	public abstract List getEnumTypeList();

	public abstract DescriptorProtos$EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i);

	public abstract List getEnumTypeOrBuilderList();

	public abstract DescriptorProtos.FieldDescriptorProto getExtension(int i);

	public abstract int getExtensionCount();

	public abstract List getExtensionList();

	public abstract  getExtensionOrBuilder(int i);

	public abstract List getExtensionOrBuilderList();

	public abstract DescriptorProtos.DescriptorProto getMessageType(int i);

	public abstract int getMessageTypeCount();

	public abstract List getMessageTypeList();

	public abstract DescriptorProtos.DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i);

	public abstract List getMessageTypeOrBuilderList();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract DescriptorProtos.FileOptions getOptions();

	public abstract DescriptorProtos.FileOptionsOrBuilder getOptionsOrBuilder();

	public abstract String getPackage();

	public abstract ByteString getPackageBytes();

	public abstract int getPublicDependency(int i);

	public abstract int getPublicDependencyCount();

	public abstract List getPublicDependencyList();

	public abstract DescriptorProtos.ServiceDescriptorProto getService(int i);

	public abstract int getServiceCount();

	public abstract List getServiceList();

	public abstract er getServiceOrBuilder(int i);

	public abstract List getServiceOrBuilderList();

	public abstract DescriptorProtos.SourceCodeInfo getSourceCodeInfo();

	public abstract DescriptorProtos.SourceCodeInfoOrBuilder getSourceCodeInfoOrBuilder();

	public abstract String getSyntax();

	public abstract ByteString getSyntaxBytes();

	public abstract int getWeakDependency(int i);

	public abstract int getWeakDependencyCount();

	public abstract List getWeakDependencyList();

	public abstract boolean hasName();

	public abstract boolean hasOptions();

	public abstract boolean hasPackage();

	public abstract boolean hasSourceCodeInfo();

	public abstract boolean hasSyntax();
}
