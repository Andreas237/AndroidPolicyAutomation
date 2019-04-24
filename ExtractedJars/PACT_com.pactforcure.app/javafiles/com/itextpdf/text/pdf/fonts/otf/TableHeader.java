// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;


public class TableHeader
{

	public TableHeader(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		version = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int version>
		scriptListOffset = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int scriptListOffset>
		featureListOffset = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field int featureListOffset>
		lookupListOffset = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #22  <Field int lookupListOffset>
	//   14   25:return          
	}

	public int featureListOffset;
	public int lookupListOffset;
	public int scriptListOffset;
	public int version;
}
