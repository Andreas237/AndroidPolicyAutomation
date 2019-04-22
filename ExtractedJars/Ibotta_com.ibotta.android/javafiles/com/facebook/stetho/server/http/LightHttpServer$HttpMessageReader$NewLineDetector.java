// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;


// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpServer

private static class LightHttpServer$HttpMessageReader$NewLineDetector
{

	public void accept(char c)
	{
		switch(state)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int state>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 104
	//	               2 86
	//	               3 68
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    3   32:new             #31  <Class StringBuilder>
	//    4   35:dup             
	//    5   36:invokespecial   #32  <Method void StringBuilder()>
	//    6   39:astore_2        
			stringbuilder.append("Unknown state: ");
	//    7   40:aload_2         
	//    8   41:ldc1            #34  <String "Unknown state: ">
	//    9   43:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   10   46:pop             
			stringbuilder.append(state);
	//   11   47:aload_2         
	//   12   48:aload_0         
	//   13   49:getfield        #24  <Field int state>
	//   14   52:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   15   55:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   16   56:new             #43  <Class IllegalArgumentException>
	//   17   59:dup             
	//   18   60:aload_2         
	//   19   61:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   20   64:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   21   67:athrow          

		case 3: // '\003'
			if(c == '\r')
	//*  22   68:iload_1         
	//*  23   69:bipush          13
	//*  24   71:icmpne          80
			{
				state = 2;
	//   25   74:aload_0         
	//   26   75:iconst_2        
	//   27   76:putfield        #24  <Field int state>
				return;
	//   28   79:return          
			} else
			{
				state = 1;
	//   29   80:aload_0         
	//   30   81:iconst_1        
	//   31   82:putfield        #24  <Field int state>
				return;
	//   32   85:return          
			}

		case 2: // '\002'
			if(c == '\n')
	//*  33   86:iload_1         
	//*  34   87:bipush          10
	//*  35   89:icmpne          98
			{
				state = 3;
	//   36   92:aload_0         
	//   37   93:iconst_3        
	//   38   94:putfield        #24  <Field int state>
				return;
	//   39   97:return          
			} else
			{
				state = 1;
	//   40   98:aload_0         
	//   41   99:iconst_1        
	//   42  100:putfield        #24  <Field int state>
				return;
	//   43  103:return          
			}

		case 1: // '\001'
			break;
		}
		if(c == '\r')
	//*  44  104:iload_1         
	//*  45  105:bipush          13
	//*  46  107:icmpne          115
			state = 2;
	//   47  110:aload_0         
	//   48  111:iconst_2        
	//   49  112:putfield        #24  <Field int state>
	//   50  115:return          
	}

	public int state()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int state>
	//    2    4:ireturn         
	}

	private static final int STATE_ON_CR = 2;
	private static final int STATE_ON_CRLF = 3;
	private static final int STATE_ON_OTHER = 1;
	private int state;

	private LightHttpServer$HttpMessageReader$NewLineDetector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		state = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #24  <Field int state>
	//    5    9:return          
	}

	LightHttpServer$HttpMessageReader$NewLineDetector(LightHttpServer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void LightHttpServer$HttpMessageReader$NewLineDetector()>
	//    2    4:return          
	}
}
