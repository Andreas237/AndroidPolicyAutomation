// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import java.lang.annotation.Annotation;

public class Cue
{
	public static interface AnchorType
		extends Annotation
	{
	}

	public static interface LineType
		extends Annotation
	{
	}

	public static interface TextSizeType
		extends Annotation
	{
	}


	public Cue(Bitmap bitmap1, float f, int i, float f1, int j, float f2, float f3)
	{
		this(((CharSequence) (null)), ((android.text.Layout.Alignment) (null)), bitmap1, f1, 0, j, f, i, 0x80000000, 1.401298E-45F, f2, f3, false, 0xff000000);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:fload           4
	//    5    6:iconst_0        
	//    6    7:iload           5
	//    7    9:fload_2         
	//    8   10:iload_3         
	//    9   11:ldc1            #30  <Int 0x80000000>
	//   10   13:ldc1            #23  <Float 1.401298E-45F>
	//   11   15:fload           6
	//   12   17:fload           7
	//   13   19:iconst_0        
	//   14   20:ldc1            #51  <Int 0xff000000>
	//   15   22:invokespecial   #54  <Method void Cue(CharSequence, android.text.Layout$Alignment, Bitmap, float, int, int, float, int, int, float, float, float, boolean, int)>
	//   16   25:return          
	}

	public Cue(CharSequence charsequence)
	{
		this(charsequence, ((android.text.Layout.Alignment) (null)), 1.401298E-45F, 0x80000000, 0x80000000, 1.401298E-45F, 0x80000000, 1.401298E-45F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:ldc1            #23  <Float 1.401298E-45F>
	//    4    5:ldc1            #30  <Int 0x80000000>
	//    5    7:ldc1            #30  <Int 0x80000000>
	//    6    9:ldc1            #23  <Float 1.401298E-45F>
	//    7   11:ldc1            #30  <Int 0x80000000>
	//    8   13:ldc1            #23  <Float 1.401298E-45F>
	//    9   15:invokespecial   #59  <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
	//   10   18:return          
	}

	public Cue(CharSequence charsequence, android.text.Layout.Alignment alignment, float f, int i, int j, float f1, int k, 
			float f2)
	{
		this(charsequence, alignment, f, i, j, f1, k, f2, false, 0xff000000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:fload           6
	//    7   10:iload           7
	//    8   12:fload           8
	//    9   14:iconst_0        
	//   10   15:ldc1            #51  <Int 0xff000000>
	//   11   17:invokespecial   #62  <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float, boolean, int)>
	//   12   20:return          
	}

	public Cue(CharSequence charsequence, android.text.Layout.Alignment alignment, float f, int i, int j, float f1, int k, 
			float f2, int l, float f3)
	{
		this(charsequence, alignment, ((Bitmap) (null)), f, i, j, f1, k, l, f3, f2, 1.401298E-45F, false, 0xff000000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:fload_3         
	//    5    5:iload           4
	//    6    7:iload           5
	//    7    9:fload           6
	//    8   11:iload           7
	//    9   13:iload           9
	//   10   15:fload           10
	//   11   17:fload           8
	//   12   19:ldc1            #23  <Float 1.401298E-45F>
	//   13   21:iconst_0        
	//   14   22:ldc1            #51  <Int 0xff000000>
	//   15   24:invokespecial   #54  <Method void Cue(CharSequence, android.text.Layout$Alignment, Bitmap, float, int, int, float, int, int, float, float, float, boolean, int)>
	//   16   27:return          
	}

	public Cue(CharSequence charsequence, android.text.Layout.Alignment alignment, float f, int i, int j, float f1, int k, 
			float f2, boolean flag, int l)
	{
		this(charsequence, alignment, ((Bitmap) (null)), f, i, j, f1, k, 0x80000000, 1.401298E-45F, f2, 1.401298E-45F, flag, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:fload_3         
	//    5    5:iload           4
	//    6    7:iload           5
	//    7    9:fload           6
	//    8   11:iload           7
	//    9   13:ldc1            #30  <Int 0x80000000>
	//   10   15:ldc1            #23  <Float 1.401298E-45F>
	//   11   17:fload           8
	//   12   19:ldc1            #23  <Float 1.401298E-45F>
	//   13   21:iload           9
	//   14   23:iload           10
	//   15   25:invokespecial   #54  <Method void Cue(CharSequence, android.text.Layout$Alignment, Bitmap, float, int, int, float, int, int, float, float, float, boolean, int)>
	//   16   28:return          
	}

	private Cue(CharSequence charsequence, android.text.Layout.Alignment alignment, Bitmap bitmap1, float f, int i, int j, float f1, 
			int k, int l, float f2, float f3, float f4, boolean flag, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		text = charsequence;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #68  <Field CharSequence text>
		textAlignment = alignment;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #70  <Field android.text.Layout$Alignment textAlignment>
		bitmap = bitmap1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #72  <Field Bitmap bitmap>
		line = f;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #74  <Field float line>
		lineType = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #76  <Field int lineType>
		lineAnchor = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #78  <Field int lineAnchor>
		position = f1;
	//   20   37:aload_0         
	//   21   38:fload           7
	//   22   40:putfield        #80  <Field float position>
		positionAnchor = k;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #82  <Field int positionAnchor>
		size = f3;
	//   26   49:aload_0         
	//   27   50:fload           11
	//   28   52:putfield        #84  <Field float size>
		bitmapHeight = f4;
	//   29   55:aload_0         
	//   30   56:fload           12
	//   31   58:putfield        #86  <Field float bitmapHeight>
		windowColorSet = flag;
	//   32   61:aload_0         
	//   33   62:iload           13
	//   34   64:putfield        #88  <Field boolean windowColorSet>
		windowColor = i1;
	//   35   67:aload_0         
	//   36   68:iload           14
	//   37   70:putfield        #90  <Field int windowColor>
		textSizeType = l;
	//   38   73:aload_0         
	//   39   74:iload           9
	//   40   76:putfield        #92  <Field int textSizeType>
		textSize = f2;
	//   41   79:aload_0         
	//   42   80:fload           10
	//   43   82:putfield        #94  <Field float textSize>
	//   44   85:return          
	}

	public static final int ANCHOR_TYPE_END = 2;
	public static final int ANCHOR_TYPE_MIDDLE = 1;
	public static final int ANCHOR_TYPE_START = 0;
	public static final float DIMEN_UNSET = 1.401298E-45F;
	public static final int LINE_TYPE_FRACTION = 0;
	public static final int LINE_TYPE_NUMBER = 1;
	public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
	public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
	public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
	public static final int TYPE_UNSET = 0x80000000;
	public final Bitmap bitmap;
	public final float bitmapHeight;
	public final float line;
	public final int lineAnchor;
	public final int lineType;
	public final float position;
	public final int positionAnchor;
	public final float size;
	public final CharSequence text;
	public final android.text.Layout.Alignment textAlignment;
	public final float textSize;
	public final int textSizeType;
	public final int windowColor;
	public final boolean windowColorSet;
}
