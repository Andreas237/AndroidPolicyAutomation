// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.eia608;


// Referenced classes of package com.google.android.exoplayer.text.eia608:
//			ClosedCaption

final class ClosedCaptionCtrl extends ClosedCaption
{

	protected ClosedCaptionCtrl(byte byte0, byte byte1)
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #44  <Method void ClosedCaption(int)>
		cc1 = byte0;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #46  <Field byte cc1>
		cc2 = byte1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #48  <Field byte cc2>
	//    9   15:return          
	}

	public boolean isMidRowCode()
	{
		byte byte0 = cc1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte cc1>
	//    2    4:istore_1        
		if(byte0 == 17 || byte0 == 25)
	//*   3    5:iload_1         
	//*   4    6:bipush          17
	//*   5    8:icmpeq          17
	//*   6   11:iload_1         
	//*   7   12:bipush          25
	//*   8   14:icmpne          36
		{
			byte byte1 = cc2;
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field byte cc2>
	//   11   21:istore_1        
			if(byte1 >= 32 && byte1 <= 47)
	//*  12   22:iload_1         
	//*  13   23:bipush          32
	//*  14   25:icmplt          36
	//*  15   28:iload_1         
	//*  16   29:bipush          47
	//*  17   31:icmpgt          36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		}
		return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	public boolean isMiscCode()
	{
		byte byte0 = cc1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte cc1>
	//    2    4:istore_1        
		if(byte0 == 20 || byte0 == 28)
	//*   3    5:iload_1         
	//*   4    6:bipush          20
	//*   5    8:icmpeq          17
	//*   6   11:iload_1         
	//*   7   12:bipush          28
	//*   8   14:icmpne          36
		{
			byte byte1 = cc2;
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field byte cc2>
	//   11   21:istore_1        
			if(byte1 >= 32 && byte1 <= 47)
	//*  12   22:iload_1         
	//*  13   23:bipush          32
	//*  14   25:icmplt          36
	//*  15   28:iload_1         
	//*  16   29:bipush          47
	//*  17   31:icmpgt          36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		}
		return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	public boolean isPreambleAddressCode()
	{
		byte byte0 = cc1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte cc1>
	//    2    4:istore_1        
		if(byte0 >= 16 && byte0 <= 31)
	//*   3    5:iload_1         
	//*   4    6:bipush          16
	//*   5    8:icmplt          36
	//*   6   11:iload_1         
	//*   7   12:bipush          31
	//*   8   14:icmpgt          36
		{
			byte byte1 = cc2;
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field byte cc2>
	//   11   21:istore_1        
			if(byte1 >= 64 && byte1 <= 127)
	//*  12   22:iload_1         
	//*  13   23:bipush          64
	//*  14   25:icmplt          36
	//*  15   28:iload_1         
	//*  16   29:bipush          127
	//*  17   31:icmpgt          36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		}
		return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	public boolean isRepeatable()
	{
		byte byte0 = cc1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte cc1>
	//    2    4:istore_1        
		return byte0 >= 16 && byte0 <= 31;
	//    3    5:iload_1         
	//    4    6:bipush          16
	//    5    8:icmplt          19
	//    6   11:iload_1         
	//    7   12:bipush          31
	//    8   14:icmpgt          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public boolean isTabOffsetCode()
	{
		byte byte0 = cc1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte cc1>
	//    2    4:istore_1        
		if(byte0 == 23 || byte0 == 31)
	//*   3    5:iload_1         
	//*   4    6:bipush          23
	//*   5    8:icmpeq          17
	//*   6   11:iload_1         
	//*   7   12:bipush          31
	//*   8   14:icmpne          36
		{
			byte byte1 = cc2;
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field byte cc2>
	//   11   21:istore_1        
			if(byte1 >= 33 && byte1 <= 35)
	//*  12   22:iload_1         
	//*  13   23:bipush          33
	//*  14   25:icmplt          36
	//*  15   28:iload_1         
	//*  16   29:bipush          35
	//*  17   31:icmpgt          36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		}
		return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	public static final byte BACKSPACE = 33;
	public static final byte CARRIAGE_RETURN = 45;
	public static final byte END_OF_CAPTION = 47;
	public static final byte ERASE_DISPLAYED_MEMORY = 44;
	public static final byte ERASE_NON_DISPLAYED_MEMORY = 46;
	public static final byte MID_ROW_CHAN_1 = 17;
	public static final byte MID_ROW_CHAN_2 = 25;
	public static final byte MISC_CHAN_1 = 20;
	public static final byte MISC_CHAN_2 = 28;
	public static final byte RESUME_CAPTION_LOADING = 32;
	public static final byte RESUME_DIRECT_CAPTIONING = 41;
	public static final byte ROLL_UP_CAPTIONS_2_ROWS = 37;
	public static final byte ROLL_UP_CAPTIONS_3_ROWS = 38;
	public static final byte ROLL_UP_CAPTIONS_4_ROWS = 39;
	public static final byte TAB_OFFSET_CHAN_1 = 23;
	public static final byte TAB_OFFSET_CHAN_2 = 31;
	public final byte cc1;
	public final byte cc2;
}
