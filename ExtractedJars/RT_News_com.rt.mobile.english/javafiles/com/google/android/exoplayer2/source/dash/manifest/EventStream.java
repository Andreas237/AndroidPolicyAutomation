// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

public final class EventStream
{

	public EventStream(String s, String s1, long l, long al[], EventMessage aeventmessage[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		schemeIdUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String schemeIdUri>
		value = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String value>
		timescale = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #24  <Field long timescale>
		presentationTimesUs = al;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #26  <Field long[] presentationTimesUs>
		events = aeventmessage;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #28  <Field EventMessage[] events>
	//   17   31:return          
	}

	public String id()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(schemeIdUri);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field String schemeIdUri>
	//    7   13:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("/");
	//    9   17:aload_1         
	//   10   18:ldc1            #40  <String "/">
	//   11   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(value);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #22  <Field String value>
	//   16   29:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public final EventMessage events[];
	public final long presentationTimesUs[];
	public final String schemeIdUri;
	public final long timescale;
	public final String value;
}
