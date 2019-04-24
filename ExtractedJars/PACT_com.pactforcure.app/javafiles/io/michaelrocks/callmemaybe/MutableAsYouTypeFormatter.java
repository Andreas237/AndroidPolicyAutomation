// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;

import android.text.TextUtils;
import io.michaelrocks.libphonenumber.android.AsYouTypeFormatter;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;

class MutableAsYouTypeFormatter
{

	MutableAsYouTypeFormatter(PhoneNumberUtil phonenumberutil)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		isEmpty = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #19  <Field boolean isEmpty>
		phoneNumberUtil = phonenumberutil;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field PhoneNumberUtil phoneNumberUtil>
	//    8   14:return          
	}

	private AsYouTypeFormatter getAsYouTypeFormatter()
	{
		if(formatter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AsYouTypeFormatter formatter>
	//*   2    4:ifnonnull       33
		{
			PhoneNumberUtil phonenumberutil = phoneNumberUtil;
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field PhoneNumberUtil phoneNumberUtil>
	//    5   11:astore_2        
			String s;
			if(isValidRegion())
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #30  <Method boolean isValidRegion()>
	//*   8   16:ifeq            38
				s = region;
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field String region>
	//   11   23:astore_1        
			else
	//*  12   24:aload_0         
	//*  13   25:aload_2         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #37  <Method AsYouTypeFormatter PhoneNumberUtil.getAsYouTypeFormatter(String)>
	//*  16   30:putfield        #26  <Field AsYouTypeFormatter formatter>
	//*  17   33:aload_0         
	//*  18   34:getfield        #26  <Field AsYouTypeFormatter formatter>
	//*  19   37:areturn         
				s = "US";
	//   20   38:ldc1            #39  <String "US">
	//   21   40:astore_1        
			formatter = phonenumberutil.getAsYouTypeFormatter(s);
		}
		return formatter;
	//*  22   41:goto            24
	}

	private boolean isValidRegion()
	{
		return region != null;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String region>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void clear()
	{
		getAsYouTypeFormatter().clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method AsYouTypeFormatter getAsYouTypeFormatter()>
	//    2    4:invokevirtual   #46  <Method void AsYouTypeFormatter.clear()>
		isEmpty = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #19  <Field boolean isEmpty>
	//    6   12:return          
	}

	public String getRegion()
	{
		return region;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String region>
	//    2    4:areturn         
	}

	public int getRememberedPosition()
	{
		return getAsYouTypeFormatter().getRememberedPosition();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method AsYouTypeFormatter getAsYouTypeFormatter()>
	//    2    4:invokevirtual   #52  <Method int AsYouTypeFormatter.getRememberedPosition()>
	//    3    7:ireturn         
	}

	public String inputDigit(char c)
	{
		return inputDigit(c, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #57  <Method String inputDigit(char, boolean)>
	//    4    6:areturn         
	}

	public String inputDigit(char c, boolean flag)
	{
		AsYouTypeFormatter asyoutypeformatter = getAsYouTypeFormatter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method AsYouTypeFormatter getAsYouTypeFormatter()>
	//    2    4:astore_3        
		if(isEmpty && !isValidRegion())
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field boolean isEmpty>
	//*   5    9:ifeq            26
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #30  <Method boolean isValidRegion()>
	//*   8   16:ifne            26
			asyoutypeformatter.inputDigit('+');
	//    9   19:aload_3         
	//   10   20:bipush          43
	//   11   22:invokevirtual   #59  <Method String AsYouTypeFormatter.inputDigit(char)>
	//   12   25:pop             
		isEmpty = false;
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:putfield        #19  <Field boolean isEmpty>
		if(flag)
	//*  16   31:iload_2         
	//*  17   32:ifeq            41
			return asyoutypeformatter.inputDigitAndRememberPosition(c);
	//   18   35:aload_3         
	//   19   36:iload_1         
	//   20   37:invokevirtual   #62  <Method String AsYouTypeFormatter.inputDigitAndRememberPosition(char)>
	//   21   40:areturn         
		else
			return asyoutypeformatter.inputDigit(c);
	//   22   41:aload_3         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #59  <Method String AsYouTypeFormatter.inputDigit(char)>
	//   25   46:areturn         
	}

	public void setRegion(String s)
	{
		if(!TextUtils.equals(((CharSequence) (region)), ((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String region>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #70  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*   4    8:ifne            26
		{
			region = s;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #32  <Field String region>
			formatter = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #26  <Field AsYouTypeFormatter formatter>
			isEmpty = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #19  <Field boolean isEmpty>
		}
	//   14   26:return          
	}

	private AsYouTypeFormatter formatter;
	private boolean isEmpty;
	private final PhoneNumberUtil phoneNumberUtil;
	private String region;
}
