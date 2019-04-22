// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

// Referenced classes of package com.fasterxml.jackson.databind:
//			PropertyMetadata

public static final class PropertyMetadata$MergeInfo
{

	public static PropertyMetadata$MergeInfo createForDefaults(AnnotatedMember annotatedmember)
	{
		return new PropertyMetadata$MergeInfo(annotatedmember, true);
	//    0    0:new             #2   <Class PropertyMetadata$MergeInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #25  <Method void PropertyMetadata$MergeInfo(AnnotatedMember, boolean)>
	//    5    9:areturn         
	}

	public static PropertyMetadata$MergeInfo createForPropertyOverride(AnnotatedMember annotatedmember)
	{
		return new PropertyMetadata$MergeInfo(annotatedmember, false);
	//    0    0:new             #2   <Class PropertyMetadata$MergeInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #25  <Method void PropertyMetadata$MergeInfo(AnnotatedMember, boolean)>
	//    5    9:areturn         
	}

	public static PropertyMetadata$MergeInfo createForTypeOverride(AnnotatedMember annotatedmember)
	{
		return new PropertyMetadata$MergeInfo(annotatedmember, false);
	//    0    0:new             #2   <Class PropertyMetadata$MergeInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #25  <Method void PropertyMetadata$MergeInfo(AnnotatedMember, boolean)>
	//    5    9:areturn         
	}

	public final boolean fromDefaults;
	public final AnnotatedMember getter;

	protected PropertyMetadata$MergeInfo(AnnotatedMember annotatedmember, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		getter = annotatedmember;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field AnnotatedMember getter>
		fromDefaults = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean fromDefaults>
	//    8   14:return          
	}
}
