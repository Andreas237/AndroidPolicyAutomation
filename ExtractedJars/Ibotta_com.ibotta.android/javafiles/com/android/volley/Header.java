// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.text.TextUtils;

public final class Header
{

	public Header(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String mName>
		mValue = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String mValue>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          61
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #23  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #23  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Header)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Header>
	//   16   28:astore_1        
			return TextUtils.equals(((CharSequence) (mName)), ((CharSequence) (((Header) (obj)).mName))) && TextUtils.equals(((CharSequence) (mValue)), ((CharSequence) (((Header) (obj)).mValue)));
	//   17   29:aload_0         
	//   18   30:getfield        #14  <Field String mName>
	//   19   33:aload_1         
	//   20   34:getfield        #14  <Field String mName>
	//   21   37:invokestatic    #28  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   22   40:ifeq            59
	//   23   43:aload_0         
	//   24   44:getfield        #16  <Field String mValue>
	//   25   47:aload_1         
	//   26   48:getfield        #16  <Field String mValue>
	//   27   51:invokestatic    #28  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   28   54:ifeq            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
		} else
		{
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
	}

	public final String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String mName>
	//    2    4:areturn         
	}

	public final String getValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String mValue>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return mName.hashCode() * 31 + mValue.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String mName>
	//    2    4:invokevirtual   #37  <Method int String.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #16  <Field String mValue>
	//    7   14:invokevirtual   #37  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Header[name=");
	//    4    8:aload_1         
	//    5    9:ldc1            #43  <String "Header[name=">
	//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mName);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #14  <Field String mName>
	//   11   20:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",value=");
	//   13   24:aload_1         
	//   14   25:ldc1            #49  <String ",value=">
	//   15   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mValue);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #16  <Field String mValue>
	//   20   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("]");
	//   22   40:aload_1         
	//   23   41:ldc1            #51  <String "]">
	//   24   43:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private final String mName;
	private final String mValue;
}
