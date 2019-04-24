// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;


// Referenced classes of package com.facebook.stetho.inspector.network:
//			MimeMatcher

private class MimeMatcher$MimeMatcherRule
{

	public Object getResultIfMatched()
	{
		return mResultIfMatched;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mResultIfMatched>
	//    2    4:areturn         
	}

	public boolean match(String s)
	{
		boolean flag1 = s.startsWith(mMatchPrefix);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field String mMatchPrefix>
	//    3    5:invokevirtual   #80  <Method boolean String.startsWith(String)>
	//    4    8:istore_3        
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		if(!flag1)
	//*   7   11:iload_3         
	//*   8   12:ifne            17
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		if(mHasWildcard || s.length() == mMatchPrefix.length())
	//*  11   17:aload_0         
	//*  12   18:getfield        #36  <Field boolean mHasWildcard>
	//*  13   21:ifne            38
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #40  <Method int String.length()>
	//*  16   28:aload_0         
	//*  17   29:getfield        #46  <Field String mMatchPrefix>
	//*  18   32:invokevirtual   #40  <Method int String.length()>
	//*  19   35:icmpne          40
			flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_2        
		return flag;
	//   22   40:iload_2         
	//   23   41:ireturn         
	}

	private final boolean mHasWildcard;
	private final String mMatchPrefix;
	private final Object mResultIfMatched;
	final MimeMatcher this$0;

	public MimeMatcher$MimeMatcherRule(String s, Object obj)
	{
		this$0 = MimeMatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field MimeMatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		if(s.endsWith("*"))
	//*   5    9:aload_2         
	//*   6   10:ldc1            #28  <String "*">
	//*   7   12:invokevirtual   #34  <Method boolean String.endsWith(String)>
	//*   8   15:ifeq            41
		{
			mHasWildcard = true;
	//    9   18:aload_0         
	//   10   19:iconst_1        
	//   11   20:putfield        #36  <Field boolean mHasWildcard>
			mMatchPrefix = s.substring(0, s.length() - 1);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:aload_2         
	//   16   27:invokevirtual   #40  <Method int String.length()>
	//   17   30:iconst_1        
	//   18   31:isub            
	//   19   32:invokevirtual   #44  <Method String String.substring(int, int)>
	//   20   35:putfield        #46  <Field String mMatchPrefix>
		} else
	//*  21   38:goto            51
		{
			mHasWildcard = false;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #36  <Field boolean mHasWildcard>
			mMatchPrefix = s;
	//   25   46:aload_0         
	//   26   47:aload_2         
	//   27   48:putfield        #46  <Field String mMatchPrefix>
		}
		if(!mMatchPrefix.contains("*"))
	//*  28   51:aload_0         
	//*  29   52:getfield        #46  <Field String mMatchPrefix>
	//*  30   55:ldc1            #28  <String "*">
	//*  31   57:invokevirtual   #50  <Method boolean String.contains(CharSequence)>
	//*  32   60:ifne            69
		{
			mResultIfMatched = obj;
	//   33   63:aload_0         
	//   34   64:aload_3         
	//   35   65:putfield        #52  <Field Object mResultIfMatched>
			return;
	//   36   68:return          
		} else
		{
			mimematcher = ((MimeMatcher) (new StringBuilder()));
	//   37   69:new             #54  <Class StringBuilder>
	//   38   72:dup             
	//   39   73:invokespecial   #55  <Method void StringBuilder()>
	//   40   76:astore_1        
			append("Multiple wildcards present in rule expression ");
	//   41   77:aload_1         
	//   42   78:ldc1            #57  <String "Multiple wildcards present in rule expression ">
	//   43   80:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
			append(s);
	//   45   84:aload_1         
	//   46   85:aload_2         
	//   47   86:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   48   89:pop             
			throw new IllegalArgumentException(toString());
	//   49   90:new             #63  <Class IllegalArgumentException>
	//   50   93:dup             
	//   51   94:aload_1         
	//   52   95:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   53   98:invokespecial   #70  <Method void IllegalArgumentException(String)>
	//   54  101:athrow          
		}
	}
}