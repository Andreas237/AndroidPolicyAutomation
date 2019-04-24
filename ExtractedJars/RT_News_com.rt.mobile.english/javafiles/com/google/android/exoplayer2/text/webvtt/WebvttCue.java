// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.exoplayer2.text.Cue;

public final class WebvttCue extends Cue
{
	public static class Builder
	{

		private Builder derivePositionAnchorFromAlignment()
		{
			if(textAlignment == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field android.text.Layout$Alignment textAlignment>
		//*   2    4:ifnonnull       15
			{
				positionAnchor = 0x80000000;
		//    3    7:aload_0         
		//    4    8:ldc1            #39  <Int 0x80000000>
		//    5   10:putfield        #41  <Field int positionAnchor>
				return this;
		//    6   13:aload_0         
		//    7   14:areturn         
			}
			static class _cls1
			{

				static final int $SwitchMap$android$text$Layout$Alignment[];

				static 
				{
					$SwitchMap$android$text$Layout$Alignment = new int[android.text.Layout.Alignment.values().length];
				//    0    0:invokestatic    #18  <Method android.text.Layout$Alignment[] android.text.Layout$Alignment.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
					try
					{
						$SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
				//    5   12:getstatic       #24  <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
				//    6   15:invokevirtual   #28  <Method int android.text.Layout$Alignment.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
				//*  10   23:getstatic       #31  <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
				//*  11   26:invokevirtual   #28  <Method int android.text.Layout$Alignment.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
				//*  15   34:getstatic       #34  <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
				//*  16   37:invokevirtual   #28  <Method int android.text.Layout$Alignment.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   20   43:astore_0        
					try
					{
						$SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
					}
				//*  21   44:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   22   47:astore_0        
					try
					{
						$SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
					}
				//*  23   48:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   51:astore_0        
				//*  25   52:return          
				}
			}

			switch(_cls1..SwitchMap.android.text.Layout.Alignment[textAlignment.ordinal()])
		//*   8   15:getstatic       #47  <Field int[] WebvttCue$1.$SwitchMap$android$text$Layout$Alignment>
		//*   9   18:aload_0         
		//*  10   19:getfield        #38  <Field android.text.Layout$Alignment textAlignment>
		//*  11   22:invokevirtual   #53  <Method int android.text.Layout$Alignment.ordinal()>
		//*  12   25:iaload          
			{
		//*  13   26:tableswitch     1 3: default 52
		//		               1 107
		//		               2 100
		//		               3 93
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//   14   52:new             #55  <Class StringBuilder>
		//   15   55:dup             
		//   16   56:invokespecial   #56  <Method void StringBuilder()>
		//   17   59:astore_1        
				stringbuilder.append("Unrecognized alignment: ");
		//   18   60:aload_1         
		//   19   61:ldc1            #58  <String "Unrecognized alignment: ">
		//   20   63:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   21   66:pop             
				stringbuilder.append(((Object) (textAlignment)));
		//   22   67:aload_1         
		//   23   68:aload_0         
		//   24   69:getfield        #38  <Field android.text.Layout$Alignment textAlignment>
		//   25   72:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   26   75:pop             
				Log.w("WebvttCueBuilder", stringbuilder.toString());
		//   27   76:ldc1            #11  <String "WebvttCueBuilder">
		//   28   78:aload_1         
		//   29   79:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   30   82:invokestatic    #75  <Method int Log.w(String, String)>
		//   31   85:pop             
				positionAnchor = 0;
		//   32   86:aload_0         
		//   33   87:iconst_0        
		//   34   88:putfield        #41  <Field int positionAnchor>
				return this;
		//   35   91:aload_0         
		//   36   92:areturn         

			case 3: // '\003'
				positionAnchor = 2;
		//   37   93:aload_0         
		//   38   94:iconst_2        
		//   39   95:putfield        #41  <Field int positionAnchor>
				return this;
		//   40   98:aload_0         
		//   41   99:areturn         

			case 2: // '\002'
				positionAnchor = 1;
		//   42  100:aload_0         
		//   43  101:iconst_1        
		//   44  102:putfield        #41  <Field int positionAnchor>
				return this;
		//   45  105:aload_0         
		//   46  106:areturn         

			case 1: // '\001'
				positionAnchor = 0;
		//   47  107:aload_0         
		//   48  108:iconst_0        
		//   49  109:putfield        #41  <Field int positionAnchor>
				return this;
		//   50  112:aload_0         
		//   51  113:areturn         
			}
		}

		public WebvttCue build()
		{
			if(position != 1.401298E-45F && positionAnchor == 0x80000000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #79  <Field float position>
		//*   2    4:ldc1            #80  <Float 1.401298E-45F>
		//*   3    6:fcmpl           
		//*   4    7:ifeq            24
		//*   5   10:aload_0         
		//*   6   11:getfield        #41  <Field int positionAnchor>
		//*   7   14:ldc1            #39  <Int 0x80000000>
		//*   8   16:icmpne          24
				derivePositionAnchorFromAlignment();
		//    9   19:aload_0         
		//   10   20:invokespecial   #82  <Method WebvttCue$Builder derivePositionAnchorFromAlignment()>
		//   11   23:pop             
			return new WebvttCue(startTime, endTime, ((CharSequence) (text)), textAlignment, line, lineType, lineAnchor, position, positionAnchor, width);
		//   12   24:new             #6   <Class WebvttCue>
		//   13   27:dup             
		//   14   28:aload_0         
		//   15   29:getfield        #84  <Field long startTime>
		//   16   32:aload_0         
		//   17   33:getfield        #86  <Field long endTime>
		//   18   36:aload_0         
		//   19   37:getfield        #88  <Field SpannableStringBuilder text>
		//   20   40:aload_0         
		//   21   41:getfield        #38  <Field android.text.Layout$Alignment textAlignment>
		//   22   44:aload_0         
		//   23   45:getfield        #90  <Field float line>
		//   24   48:aload_0         
		//   25   49:getfield        #92  <Field int lineType>
		//   26   52:aload_0         
		//   27   53:getfield        #94  <Field int lineAnchor>
		//   28   56:aload_0         
		//   29   57:getfield        #79  <Field float position>
		//   30   60:aload_0         
		//   31   61:getfield        #41  <Field int positionAnchor>
		//   32   64:aload_0         
		//   33   65:getfield        #96  <Field float width>
		//   34   68:invokespecial   #99  <Method void WebvttCue(long, long, CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
		//   35   71:areturn         
		}

		public void reset()
		{
			startTime = 0L;
		//    0    0:aload_0         
		//    1    1:lconst_0        
		//    2    2:putfield        #84  <Field long startTime>
			endTime = 0L;
		//    3    5:aload_0         
		//    4    6:lconst_0        
		//    5    7:putfield        #86  <Field long endTime>
			text = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #88  <Field SpannableStringBuilder text>
			textAlignment = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #38  <Field android.text.Layout$Alignment textAlignment>
			line = 1.401298E-45F;
		//   12   20:aload_0         
		//   13   21:ldc1            #80  <Float 1.401298E-45F>
		//   14   23:putfield        #90  <Field float line>
			lineType = 0x80000000;
		//   15   26:aload_0         
		//   16   27:ldc1            #39  <Int 0x80000000>
		//   17   29:putfield        #92  <Field int lineType>
			lineAnchor = 0x80000000;
		//   18   32:aload_0         
		//   19   33:ldc1            #39  <Int 0x80000000>
		//   20   35:putfield        #94  <Field int lineAnchor>
			position = 1.401298E-45F;
		//   21   38:aload_0         
		//   22   39:ldc1            #80  <Float 1.401298E-45F>
		//   23   41:putfield        #79  <Field float position>
			positionAnchor = 0x80000000;
		//   24   44:aload_0         
		//   25   45:ldc1            #39  <Int 0x80000000>
		//   26   47:putfield        #41  <Field int positionAnchor>
			width = 1.401298E-45F;
		//   27   50:aload_0         
		//   28   51:ldc1            #80  <Float 1.401298E-45F>
		//   29   53:putfield        #96  <Field float width>
		//   30   56:return          
		}

		public Builder setEndTime(long l)
		{
			endTime = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #86  <Field long endTime>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLine(float f)
		{
			line = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #90  <Field float line>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLineAnchor(int i)
		{
			lineAnchor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #94  <Field int lineAnchor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLineType(int i)
		{
			lineType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #92  <Field int lineType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPosition(float f)
		{
			position = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #79  <Field float position>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPositionAnchor(int i)
		{
			positionAnchor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #41  <Field int positionAnchor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setStartTime(long l)
		{
			startTime = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #84  <Field long startTime>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setText(SpannableStringBuilder spannablestringbuilder)
		{
			text = spannablestringbuilder;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #88  <Field SpannableStringBuilder text>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTextAlignment(android.text.Layout.Alignment alignment)
		{
			textAlignment = alignment;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field android.text.Layout$Alignment textAlignment>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWidth(float f)
		{
			width = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #96  <Field float width>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static final String TAG = "WebvttCueBuilder";
		private long endTime;
		private float line;
		private int lineAnchor;
		private int lineType;
		private float position;
		private int positionAnchor;
		private long startTime;
		private SpannableStringBuilder text;
		private android.text.Layout.Alignment textAlignment;
		private float width;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			reset();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #33  <Method void reset()>
		//    4    8:return          
		}
	}


	public WebvttCue(long l, long l1, CharSequence charsequence)
	{
		this(l, l1, charsequence, ((android.text.Layout.Alignment) (null)), 1.401298E-45F, 0x80000000, 0x80000000, 1.401298E-45F, 0x80000000, 1.401298E-45F);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:aconst_null     
	//    5    6:ldc1            #15  <Float 1.401298E-45F>
	//    6    8:ldc1            #16  <Int 0x80000000>
	//    7   10:ldc1            #16  <Int 0x80000000>
	//    8   12:ldc1            #15  <Float 1.401298E-45F>
	//    9   14:ldc1            #16  <Int 0x80000000>
	//   10   16:ldc1            #15  <Float 1.401298E-45F>
	//   11   18:invokespecial   #19  <Method void WebvttCue(long, long, CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
	//   12   21:return          
	}

	public WebvttCue(long l, long l1, CharSequence charsequence, android.text.Layout.Alignment alignment, float f, 
			int i, int j, float f1, int k, float f2)
	{
		super(charsequence, alignment, f, i, j, f1, k, f2);
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:aload           6
	//    3    5:fload           7
	//    4    7:iload           8
	//    5    9:iload           9
	//    6   11:fload           10
	//    7   13:iload           11
	//    8   15:fload           12
	//    9   17:invokespecial   #23  <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
		startTime = l;
	//   10   20:aload_0         
	//   11   21:lload_1         
	//   12   22:putfield        #25  <Field long startTime>
		endTime = l1;
	//   13   25:aload_0         
	//   14   26:lload_3         
	//   15   27:putfield        #27  <Field long endTime>
	//   16   30:return          
	}

	public WebvttCue(CharSequence charsequence)
	{
		this(0L, 0L, charsequence);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:lconst_0        
	//    3    3:aload_1         
	//    4    4:invokespecial   #30  <Method void WebvttCue(long, long, CharSequence)>
	//    5    7:return          
	}

	public boolean isNormalCue()
	{
		return line == 1.401298E-45F && position == 1.401298E-45F;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float line>
	//    2    4:ldc1            #15  <Float 1.401298E-45F>
	//    3    6:fcmpl           
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #39  <Field float position>
	//    7   14:ldc1            #15  <Float 1.401298E-45F>
	//    8   16:fcmpl           
	//    9   17:ifne            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public final long endTime;
	public final long startTime;
}
