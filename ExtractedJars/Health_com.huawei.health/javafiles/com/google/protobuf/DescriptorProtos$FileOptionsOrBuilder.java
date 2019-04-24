// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, ByteString

public static interface DescriptorProtos$FileOptionsOrBuilder
	extends Builder
{

	public abstract boolean getCcEnableArenas();

	public abstract boolean getCcGenericServices();

	public abstract String getCsharpNamespace();

	public abstract ByteString getCsharpNamespaceBytes();

	public abstract boolean getDeprecated();

	public abstract String getGoPackage();

	public abstract ByteString getGoPackageBytes();

	public abstract boolean getJavaGenerateEqualsAndHash();

	public abstract boolean getJavaGenericServices();

	public abstract boolean getJavaMultipleFiles();

	public abstract String getJavaOuterClassname();

	public abstract ByteString getJavaOuterClassnameBytes();

	public abstract String getJavaPackage();

	public abstract ByteString getJavaPackageBytes();

	public abstract boolean getJavaStringCheckUtf8();

	public abstract String getObjcClassPrefix();

	public abstract ByteString getObjcClassPrefixBytes();

	public abstract ode getOptimizeFor();

	public abstract String getPhpClassPrefix();

	public abstract ByteString getPhpClassPrefixBytes();

	public abstract boolean getPhpGenericServices();

	public abstract String getPhpNamespace();

	public abstract ByteString getPhpNamespaceBytes();

	public abstract boolean getPyGenericServices();

	public abstract String getSwiftPrefix();

	public abstract ByteString getSwiftPrefixBytes();

	public abstract DescriptorProtos.UninterpretedOption getUninterpretedOption(int i);

	public abstract int getUninterpretedOptionCount();

	public abstract List getUninterpretedOptionList();

	public abstract Builder getUninterpretedOptionOrBuilder(int i);

	public abstract List getUninterpretedOptionOrBuilderList();

	public abstract boolean hasCcEnableArenas();

	public abstract boolean hasCcGenericServices();

	public abstract boolean hasCsharpNamespace();

	public abstract boolean hasDeprecated();

	public abstract boolean hasGoPackage();

	public abstract boolean hasJavaGenerateEqualsAndHash();

	public abstract boolean hasJavaGenericServices();

	public abstract boolean hasJavaMultipleFiles();

	public abstract boolean hasJavaOuterClassname();

	public abstract boolean hasJavaPackage();

	public abstract boolean hasJavaStringCheckUtf8();

	public abstract boolean hasObjcClassPrefix();

	public abstract boolean hasOptimizeFor();

	public abstract boolean hasPhpClassPrefix();

	public abstract boolean hasPhpGenericServices();

	public abstract boolean hasPhpNamespace();

	public abstract boolean hasPyGenericServices();

	public abstract boolean hasSwiftPrefix();
}
