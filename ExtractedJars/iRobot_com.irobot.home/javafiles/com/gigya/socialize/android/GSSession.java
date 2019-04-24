// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSObject;

public class GSSession
{

	public GSSession()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	protected GSSession(GSObject gsobject)
	{
		this(gsobject.getString("access_token", ((String) (null))), gsobject.getString("x_access_token_secret", ((String) (null))), gsobject.getLong("expires_in", -1L));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #20  <String "access_token">
	//    3    4:aconst_null     
	//    4    5:invokevirtual   #26  <Method String GSObject.getString(String, String)>
	//    5    8:aload_1         
	//    6    9:ldc1            #28  <String "x_access_token_secret">
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #26  <Method String GSObject.getString(String, String)>
	//    9   15:aload_1         
	//   10   16:ldc1            #30  <String "expires_in">
	//   11   18:ldc2w           #31  <Long -1L>
	//   12   21:invokevirtual   #36  <Method long GSObject.getLong(String, long)>
	//   13   24:invokespecial   #39  <Method void GSSession(String, String, long)>
	//   14   27:return          
	}

	public GSSession(String s, String s1)
	{
		this(s, s1, 0xffffffffL);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc2w           #41  <Long 0xffffffffL>
	//    4    6:invokespecial   #39  <Method void GSSession(String, String, long)>
	//    5    9:return          
	}

	public GSSession(String s, String s1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mToken = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field String mToken>
		mSecret = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field String mSecret>
		if(l != 0L && l != -1L && l != 0xffffffffL)
	//*   8   14:lload_3         
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifeq            53
	//*  12   20:lload_3         
	//*  13   21:ldc2w           #31  <Long -1L>
	//*  14   24:lcmp            
	//*  15   25:ifeq            53
	//*  16   28:lload_3         
	//*  17   29:ldc2w           #41  <Long 0xffffffffL>
	//*  18   32:lcmp            
	//*  19   33:ifne            39
	//*  20   36:goto            53
		{
			mExpirationTime = System.currentTimeMillis() + l * 1000L;
	//   21   39:aload_0         
	//   22   40:invokestatic    #52  <Method long System.currentTimeMillis()>
	//   23   43:lload_3         
	//   24   44:ldc2w           #53  <Long 1000L>
	//   25   47:lmul            
	//   26   48:ladd            
	//   27   49:putfield        #56  <Field long mExpirationTime>
			return;
	//   28   52:return          
		} else
		{
			mExpirationTime = 0xffffffffL;
	//   29   53:aload_0         
	//   30   54:ldc2w           #41  <Long 0xffffffffL>
	//   31   57:putfield        #56  <Field long mExpirationTime>
			return;
	//   32   60:return          
		}
	}

	public long getExpirationTime()
	{
		return mExpirationTime;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field long mExpirationTime>
	//    2    4:lreturn         
	}

	public String getSecret()
	{
		return mSecret;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mSecret>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String mToken>
	//    2    4:areturn         
	}

	public boolean isValid()
	{
		return getToken() != null && getSecret() != null && System.currentTimeMillis() < getExpirationTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method String getToken()>
	//    2    4:ifnull          27
	//    3    7:aload_0         
	//    4    8:invokevirtual   #66  <Method String getSecret()>
	//    5   11:ifnull          27
	//    6   14:invokestatic    #52  <Method long System.currentTimeMillis()>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #68  <Method long getExpirationTime()>
	//    9   21:lcmp            
	//   10   22:ifge            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public void setExpirationTime(long l)
	{
		mExpirationTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #56  <Field long mExpirationTime>
	//    3    5:return          
	}

	public void setSecret(String s)
	{
		mSecret = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String mSecret>
	//    3    5:return          
	}

	public void setToken(String s)
	{
		mToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String mToken>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\nSecret:  ");
	//    4    8:aload_1         
	//    5    9:ldc1            #79  <String "\nSecret:  ">
	//    6   11:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mSecret);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #46  <Field String mSecret>
	//   11   20:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("\nToken: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #85  <String "\nToken: ">
	//   15   27:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mToken);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #44  <Field String mToken>
	//   20   36:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("\nExpirationTime: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #87  <String "\nExpirationTime: ">
	//   24   43:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mExpirationTime);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #56  <Field long mExpirationTime>
	//   29   52:invokevirtual   #90  <Method StringBuilder StringBuilder.append(long)>
	//   30   55:pop             
		stringbuilder.append("\n");
	//   31   56:aload_1         
	//   32   57:ldc1            #92  <String "\n">
	//   33   59:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	private static final String TAG = "GSSession";
	private long mExpirationTime;
	private String mSecret;
	private String mToken;
}
