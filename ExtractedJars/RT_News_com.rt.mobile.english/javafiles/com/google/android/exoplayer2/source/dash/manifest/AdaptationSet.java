// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;

public class AdaptationSet
{

	public AdaptationSet(int i, int j, List list, List list1, List list2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int id>
		type = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int type>
		representations = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #30  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #32  <Field List representations>
		if(list1 == null)
	//*  12   22:aload           4
	//*  13   24:ifnonnull       34
			list = Collections.emptyList();
	//   14   27:invokestatic    #36  <Method List Collections.emptyList()>
	//   15   30:astore_3        
		else
	//*  16   31:goto            40
			list = Collections.unmodifiableList(list1);
	//   17   34:aload           4
	//   18   36:invokestatic    #30  <Method List Collections.unmodifiableList(List)>
	//   19   39:astore_3        
		accessibilityDescriptors = list;
	//   20   40:aload_0         
	//   21   41:aload_3         
	//   22   42:putfield        #38  <Field List accessibilityDescriptors>
		if(list2 == null)
	//*  23   45:aload           5
	//*  24   47:ifnonnull       57
			list = Collections.emptyList();
	//   25   50:invokestatic    #36  <Method List Collections.emptyList()>
	//   26   53:astore_3        
		else
	//*  27   54:goto            63
			list = Collections.unmodifiableList(list2);
	//   28   57:aload           5
	//   29   59:invokestatic    #30  <Method List Collections.unmodifiableList(List)>
	//   30   62:astore_3        
		supplementalProperties = list;
	//   31   63:aload_0         
	//   32   64:aload_3         
	//   33   65:putfield        #40  <Field List supplementalProperties>
	//   34   68:return          
	}

	public static final int ID_UNSET = -1;
	public final List accessibilityDescriptors;
	public final int id;
	public final List representations;
	public final List supplementalProperties;
	public final int type;
}
