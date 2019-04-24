// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//			StreamSenseEventType

public final class StreamSenseState extends Enum
{

	private StreamSenseState(String s, int i, String s1, int j, StreamSenseEventType streamsenseeventtype)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #64  <Method void Enum(String, int)>
		a = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #66  <Field String a>
		b = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #68  <Field int b>
		c = streamsenseeventtype;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #70  <Field StreamSenseEventType c>
	//   13   23:return          
	}

	public static StreamSenseState valueOf(String s)
	{
		return (StreamSenseState)Enum.valueOf(com/comscore/streaming/StreamSenseState, s);
	//    0    0:ldc1            #2   <Class StreamSenseState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #77  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StreamSenseState>
	//    4    9:areturn         
	}

	public static StreamSenseState[] values()
	{
		return (StreamSenseState[])((StreamSenseState []) (d)).clone();
	//    0    0:getstatic       #60  <Field StreamSenseState[] d>
	//    1    3:invokevirtual   #84  <Method Object _5B_Lcom.comscore.streaming.StreamSenseState_3B_.clone()>
	//    2    6:checkcast       #80  <Class StreamSenseState[]>
	//    3    9:areturn         
	}

	public int getCode()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int b>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String a>
	//    2    4:areturn         
	}

	public StreamSenseEventType toEventType()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field StreamSenseEventType c>
	//    2    4:areturn         
	}

	public String toString()
	{
		return getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method String getName()>
	//    2    4:areturn         
	}

	public static final StreamSenseState BUFFERING;
	public static final StreamSenseState IDLE;
	public static final StreamSenseState PAUSED;
	public static final StreamSenseState PLAYING;
	private static final StreamSenseState d[];
	private String a;
	private int b;
	private StreamSenseEventType c;

	static 
	{
		IDLE = new StreamSenseState("IDLE", 0, "idle", 0, StreamSenseEventType.END);
	//    0    0:new             #2   <Class StreamSenseState>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "IDLE">
	//    3    6:iconst_0        
	//    4    7:ldc1            #23  <String "idle">
	//    5    9:iconst_0        
	//    6   10:getstatic       #28  <Field StreamSenseEventType StreamSenseEventType.END>
	//    7   13:invokespecial   #32  <Method void StreamSenseState(String, int, String, int, StreamSenseEventType)>
	//    8   16:putstatic       #34  <Field StreamSenseState IDLE>
		PLAYING = new StreamSenseState("PLAYING", 1, "playing", 1, StreamSenseEventType.PLAY);
	//    9   19:new             #2   <Class StreamSenseState>
	//   10   22:dup             
	//   11   23:ldc1            #35  <String "PLAYING">
	//   12   25:iconst_1        
	//   13   26:ldc1            #37  <String "playing">
	//   14   28:iconst_1        
	//   15   29:getstatic       #40  <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//   16   32:invokespecial   #32  <Method void StreamSenseState(String, int, String, int, StreamSenseEventType)>
	//   17   35:putstatic       #42  <Field StreamSenseState PLAYING>
		PAUSED = new StreamSenseState("PAUSED", 2, "paused", 2, StreamSenseEventType.PAUSE);
	//   18   38:new             #2   <Class StreamSenseState>
	//   19   41:dup             
	//   20   42:ldc1            #43  <String "PAUSED">
	//   21   44:iconst_2        
	//   22   45:ldc1            #45  <String "paused">
	//   23   47:iconst_2        
	//   24   48:getstatic       #48  <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//   25   51:invokespecial   #32  <Method void StreamSenseState(String, int, String, int, StreamSenseEventType)>
	//   26   54:putstatic       #50  <Field StreamSenseState PAUSED>
		BUFFERING = new StreamSenseState("BUFFERING", 3, "buffering", 3, StreamSenseEventType.BUFFER);
	//   27   57:new             #2   <Class StreamSenseState>
	//   28   60:dup             
	//   29   61:ldc1            #51  <String "BUFFERING">
	//   30   63:iconst_3        
	//   31   64:ldc1            #53  <String "buffering">
	//   32   66:iconst_3        
	//   33   67:getstatic       #56  <Field StreamSenseEventType StreamSenseEventType.BUFFER>
	//   34   70:invokespecial   #32  <Method void StreamSenseState(String, int, String, int, StreamSenseEventType)>
	//   35   73:putstatic       #58  <Field StreamSenseState BUFFERING>
		d = (new StreamSenseState[] {
			IDLE, PLAYING, PAUSED, BUFFERING
		});
	//   36   76:iconst_4        
	//   37   77:anewarray       StreamSenseState[]
	//   38   80:dup             
	//   39   81:iconst_0        
	//   40   82:getstatic       #34  <Field StreamSenseState IDLE>
	//   41   85:aastore         
	//   42   86:dup             
	//   43   87:iconst_1        
	//   44   88:getstatic       #42  <Field StreamSenseState PLAYING>
	//   45   91:aastore         
	//   46   92:dup             
	//   47   93:iconst_2        
	//   48   94:getstatic       #50  <Field StreamSenseState PAUSED>
	//   49   97:aastore         
	//   50   98:dup             
	//   51   99:iconst_3        
	//   52  100:getstatic       #58  <Field StreamSenseState BUFFERING>
	//   53  103:aastore         
	//   54  104:putstatic       #60  <Field StreamSenseState[] d>
	//*  55  107:return          
	}
}
