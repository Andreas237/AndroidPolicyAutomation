// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import java.util.Collections;
import java.util.List;

public class AdaptationSet
{

	public AdaptationSet(int i, int j, List list)
	{
		this(i, j, list, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #25  <Method void AdaptationSet(int, int, List, List)>
	//    6    8:return          
	}

	public AdaptationSet(int i, int j, List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int id>
		type = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #35  <Field int type>
		representations = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #41  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #43  <Field List representations>
		if(list1 == null)
	//*  12   22:aload           4
	//*  13   24:ifnonnull       35
		{
			contentProtections = Collections.emptyList();
	//   14   27:aload_0         
	//   15   28:invokestatic    #47  <Method List Collections.emptyList()>
	//   16   31:putfield        #49  <Field List contentProtections>
			return;
	//   17   34:return          
		} else
		{
			contentProtections = Collections.unmodifiableList(list1);
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:invokestatic    #41  <Method List Collections.unmodifiableList(List)>
	//   21   41:putfield        #49  <Field List contentProtections>
			return;
	//   22   44:return          
		}
	}

	public boolean hasContentProtection()
	{
		return contentProtections.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List contentProtections>
	//    2    4:invokeinterface #57  <Method boolean List.isEmpty()>
	//    3    9:iconst_1        
	//    4   10:ixor            
	//    5   11:ireturn         
	}

	public static final int TYPE_AUDIO = 1;
	public static final int TYPE_TEXT = 2;
	public static final int TYPE_UNKNOWN = -1;
	public static final int TYPE_VIDEO = 0;
	public final List contentProtections;
	public final int id;
	public final List representations;
	public final int type;
}
