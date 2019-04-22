// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.io.BufferedInputStream;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpServer

private static class LightHttpServer$HttpMessageReader
{
	private static class NewLineDetector
	{

		public void accept(char c)
		{
			switch(state)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field int state>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 104
		//		               2 86
		//		               3 68
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

		private NewLineDetector()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			state = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #24  <Field int state>
		//    5    9:return          
		}

		NewLineDetector(LightHttpServer._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void LightHttpServer$HttpMessageReader$NewLineDetector()>
		//    2    4:return          
		}
	}


	public String readLine()
		throws IOException
	{
		do
		{
			int i = mIn.read();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field BufferedInputStream mIn>
	//    2    4:invokevirtual   #45  <Method int BufferedInputStream.read()>
	//    3    7:istore_2        
			if(i < 0)
	//*   4    8:iload_2         
	//*   5    9:ifge            14
				return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
			char c = (char)i;
	//    8   14:iload_2         
	//    9   15:int2char        
	//   10   16:istore_1        
			mNewLineDetector.accept(c);
	//   11   17:aload_0         
	//   12   18:getfield        #31  <Field LightHttpServer$HttpMessageReader$NewLineDetector mNewLineDetector>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #49  <Method void LightHttpServer$HttpMessageReader$NewLineDetector.accept(char)>
			switch(mNewLineDetector.state())
	//*  15   25:aload_0         
	//*  16   26:getfield        #31  <Field LightHttpServer$HttpMessageReader$NewLineDetector mNewLineDetector>
	//*  17   29:invokevirtual   #52  <Method int LightHttpServer$HttpMessageReader$NewLineDetector.state()>
			{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 81
	//	               2 0
	//	               3 63
	//*  19   60:goto            0
			case 3: // '\003'
				String s = mBuffer.toString();
	//   20   63:aload_0         
	//   21   64:getfield        #26  <Field StringBuilder mBuffer>
	//   22   67:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   23   70:astore_3        
				mBuffer.setLength(0);
	//   24   71:aload_0         
	//   25   72:getfield        #26  <Field StringBuilder mBuffer>
	//   26   75:iconst_0        
	//   27   76:invokevirtual   #59  <Method void StringBuilder.setLength(int)>
				return s;
	//   28   79:aload_3         
	//   29   80:areturn         

			case 1: // '\001'
				mBuffer.append(c);
	//   30   81:aload_0         
	//   31   82:getfield        #26  <Field StringBuilder mBuffer>
	//   32   85:iload_1         
	//   33   86:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   34   89:pop             
				break;
			}
		} while(true);
	//*  35   90:goto            0
	}

	private final StringBuilder mBuffer = new StringBuilder();
	private final BufferedInputStream mIn;
	private final NewLineDetector mNewLineDetector = new NewLineDetector(((LightHttpServer._cls1) (null)));

	public LightHttpServer$HttpMessageReader(BufferedInputStream bufferedinputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void StringBuilder()>
	//    6   12:putfield        #26  <Field StringBuilder mBuffer>
	//    7   15:aload_0         
	//    8   16:new             #9   <Class LightHttpServer$HttpMessageReader$NewLineDetector>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #29  <Method void LightHttpServer$HttpMessageReader$NewLineDetector(LightHttpServer$1)>
	//   12   24:putfield        #31  <Field LightHttpServer$HttpMessageReader$NewLineDetector mNewLineDetector>
		mIn = bufferedinputstream;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #33  <Field BufferedInputStream mIn>
	//   16   32:return          
	}
}
