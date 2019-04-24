// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.SystemClock;
import android.view.KeyEvent;

public abstract class TransportPerformer
{

	public TransportPerformer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public void onAudioFocusChange(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		switch(i)
	//*   2    2:iload_1         
		{
	//*   3    3:lookupswitch    1: default 20
	//	               -1: 25
		default:
			i = ((int) (flag));
	//    4   20:iload_2         
	//    5   21:istore_1        
			break;

	//*   6   22:goto            28
		case -1: 
			i = 127;
	//    7   25:bipush          127
	//    8   27:istore_1        
			break;
		}
		if(i != 0)
	//*   9   28:iload_1         
	//*  10   29:ifeq            72
		{
			long l = SystemClock.uptimeMillis();
	//   11   32:invokestatic    #32  <Method long SystemClock.uptimeMillis()>
	//   12   35:lstore_3        
			onMediaButtonDown(i, new KeyEvent(l, l, 0, i, 0));
	//   13   36:aload_0         
	//   14   37:iload_1         
	//   15   38:new             #34  <Class KeyEvent>
	//   16   41:dup             
	//   17   42:lload_3         
	//   18   43:lload_3         
	//   19   44:iconst_0        
	//   20   45:iload_1         
	//   21   46:iconst_0        
	//   22   47:invokespecial   #37  <Method void KeyEvent(long, long, int, int, int)>
	//   23   50:invokevirtual   #41  <Method boolean onMediaButtonDown(int, KeyEvent)>
	//   24   53:pop             
			onMediaButtonUp(i, new KeyEvent(l, l, 1, i, 0));
	//   25   54:aload_0         
	//   26   55:iload_1         
	//   27   56:new             #34  <Class KeyEvent>
	//   28   59:dup             
	//   29   60:lload_3         
	//   30   61:lload_3         
	//   31   62:iconst_1        
	//   32   63:iload_1         
	//   33   64:iconst_0        
	//   34   65:invokespecial   #37  <Method void KeyEvent(long, long, int, int, int)>
	//   35   68:invokevirtual   #44  <Method boolean onMediaButtonUp(int, KeyEvent)>
	//   36   71:pop             
		}
	//   37   72:return          
	}

	public int onGetBufferPercentage()
	{
		return 100;
	//    0    0:bipush          100
	//    1    2:ireturn         
	}

	public abstract long onGetCurrentPosition();

	public abstract long onGetDuration();

	public int onGetTransportControlFlags()
	{
		return 60;
	//    0    0:bipush          60
	//    1    2:ireturn         
	}

	public abstract boolean onIsPlaying();

	public boolean onMediaButtonDown(int i, KeyEvent keyevent)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    5: default 52
	//	               79: 73
	//	               85: 73
	//	               86: 67
	//	               126: 55
	//	               127: 61
	//*   2   52:goto            91
		case 126: // '~'
			onStart();
	//    3   55:aload_0         
	//    4   56:invokevirtual   #54  <Method void onStart()>
			return true;
	//    5   59:iconst_1        
	//    6   60:ireturn         

		case 127: // '\177'
			onPause();
	//    7   61:aload_0         
	//    8   62:invokevirtual   #57  <Method void onPause()>
			return true;
	//    9   65:iconst_1        
	//   10   66:ireturn         

		case 86: // 'V'
			onStop();
	//   11   67:aload_0         
	//   12   68:invokevirtual   #60  <Method void onStop()>
			return true;
	//   13   71:iconst_1        
	//   14   72:ireturn         

		case 79: // 'O'
		case 85: // 'U'
			if(onIsPlaying())
	//*  15   73:aload_0         
	//*  16   74:invokevirtual   #62  <Method boolean onIsPlaying()>
	//*  17   77:ifeq            87
				onPause();
	//   18   80:aload_0         
	//   19   81:invokevirtual   #57  <Method void onPause()>
			else
	//*  20   84:goto            91
				onStart();
	//   21   87:aload_0         
	//   22   88:invokevirtual   #54  <Method void onStart()>
			break;
		}
		return true;
	//   23   91:iconst_1        
	//   24   92:ireturn         
	}

	public boolean onMediaButtonUp(int i, KeyEvent keyevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public abstract void onPause();

	public abstract void onSeekTo(long l);

	public abstract void onStart();

	public abstract void onStop();

	static final int AUDIOFOCUS_GAIN = 1;
	static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
	static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
	static final int AUDIOFOCUS_LOSS = -1;
	static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
	static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
}
