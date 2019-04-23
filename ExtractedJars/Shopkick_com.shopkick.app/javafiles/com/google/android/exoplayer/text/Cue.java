// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;


public class Cue
{

	public Cue()
	{
		this(((CharSequence) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #33  <Method void Cue(CharSequence)>
	//    3    5:return          
	}

	public Cue(CharSequence charsequence)
	{
		this(charsequence, ((android.text.Layout.Alignment) (null)), 1.401298E-45F, 0x80000000, 0x80000000, 1.401298E-45F, 0x80000000, 1.401298E-45F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:ldc1            #14  <Float 1.401298E-45F>
	//    4    5:ldc1            #18  <Int 0x80000000>
	//    5    7:ldc1            #18  <Int 0x80000000>
	//    6    9:ldc1            #14  <Float 1.401298E-45F>
	//    7   11:ldc1            #18  <Int 0x80000000>
	//    8   13:ldc1            #14  <Float 1.401298E-45F>
	//    9   15:invokespecial   #37  <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
	//   10   18:return          
	}

	public Cue(CharSequence charsequence, android.text.Layout.Alignment alignment, float f, int i, int j, float f1, int k, 
			float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		text = charsequence;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field CharSequence text>
		textAlignment = alignment;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field android.text.Layout$Alignment textAlignment>
		line = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #45  <Field float line>
		lineType = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #47  <Field int lineType>
		lineAnchor = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #49  <Field int lineAnchor>
		position = f1;
	//   17   31:aload_0         
	//   18   32:fload           6
	//   19   34:putfield        #51  <Field float position>
		positionAnchor = k;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #53  <Field int positionAnchor>
		size = f2;
	//   23   43:aload_0         
	//   24   44:fload           8
	//   25   46:putfield        #55  <Field float size>
	//   26   49:return          
	}

	public static final int ANCHOR_TYPE_END = 2;
	public static final int ANCHOR_TYPE_MIDDLE = 1;
	public static final int ANCHOR_TYPE_START = 0;
	public static final float DIMEN_UNSET = 1.401298E-45F;
	public static final int LINE_TYPE_FRACTION = 0;
	public static final int LINE_TYPE_NUMBER = 1;
	public static final int TYPE_UNSET = 0x80000000;
	public final float line;
	public final int lineAnchor;
	public final int lineType;
	public final float position;
	public final int positionAnchor;
	public final float size;
	public final CharSequence text;
	public final android.text.Layout.Alignment textAlignment;
}
