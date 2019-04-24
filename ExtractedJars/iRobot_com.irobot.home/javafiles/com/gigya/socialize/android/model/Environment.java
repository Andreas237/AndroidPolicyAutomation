// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.model;

import android.content.Context;
import android.text.TextUtils;
import com.gigya.socialize.android.GSAPI;

public class Environment
{

	public Environment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public String getGMID()
	{
		return mGmid;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mGmid>
	//    2    4:areturn         
	}

	public String getLastLoginProvider()
	{
		return mLastLoginProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mLastLoginProvider>
	//    2    4:areturn         
	}

	public long getTSOffset()
	{
		return mTSOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long mTSOffset>
	//    2    4:lreturn         
	}

	public String getUCID()
	{
		if(TextUtils.isEmpty(((CharSequence) (mUcid))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String mUcid>
	//*   2    4:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            28
			mUcid = android.provider.Settings.Secure.getString(GSAPI.getInstance().getContext().getContentResolver(), "android_id");
	//    4   10:aload_0         
	//    5   11:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//    6   14:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//    7   17:invokevirtual   #54  <Method android.content.ContentResolver Context.getContentResolver()>
	//    8   20:ldc1            #56  <String "android_id">
	//    9   22:invokestatic    #62  <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   10   25:putfield        #32  <Field String mUcid>
		return mUcid;
	//   11   28:aload_0         
	//   12   29:getfield        #32  <Field String mUcid>
	//   13   32:areturn         
	}

	public void setGMID(String s)
	{
		mGmid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String mGmid>
	//    3    5:return          
	}

	public void setLastLoginProvider(String s)
	{
		mLastLoginProvider = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String mLastLoginProvider>
	//    3    5:return          
	}

	public void setTSOffset(long l)
	{
		mTSOffset = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #29  <Field long mTSOffset>
	//    3    5:return          
	}

	public void setUCID(String s)
	{
		mUcid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String mUcid>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #71  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\nGmid: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #74  <String "\nGmid: ">
	//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mGmid);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field String mGmid>
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("\nUcid: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #80  <String "\nUcid: ">
	//   15   27:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mUcid);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #32  <Field String mUcid>
	//   20   36:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("\nLastLoginProvider: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #82  <String "\nLastLoginProvider: ">
	//   24   43:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mLastLoginProvider);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field String mLastLoginProvider>
	//   29   52:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append("\nTSOffset: ");
	//   31   56:aload_1         
	//   32   57:ldc1            #84  <String "\nTSOffset: ">
	//   33   59:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mTSOffset);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #29  <Field long mTSOffset>
	//   38   68:invokevirtual   #87  <Method StringBuilder StringBuilder.append(long)>
	//   39   71:pop             
		stringbuilder.append("\n");
	//   40   72:aload_1         
	//   41   73:ldc1            #89  <String "\n">
	//   42   75:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	private static final String TAG = "Environment";
	private String mGmid;
	private String mLastLoginProvider;
	private long mTSOffset;
	private String mUcid;
}
