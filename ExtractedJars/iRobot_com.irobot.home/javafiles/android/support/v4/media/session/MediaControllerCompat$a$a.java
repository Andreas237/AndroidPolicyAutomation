// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

private class MediaControllerCompat$a$a extends Handler
{

	public void handleMessage(Message message)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean a>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #22  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 12: default 76
	//	               1 247
	//	               2 232
	//	               3 217
	//	               4 202
	//	               5 187
	//	               6 172
	//	               7 157
	//	               8 149
	//	               9 131
	//	               10 113
	//	               11 95
	//	               12 77
		default:
			return;
	//    7   76:return          

		case 12: // '\f'
			b.b(((Integer)message.obj).intValue());
	//    8   77:aload_0         
	//    9   78:getfield        #24  <Field MediaControllerCompat$a b>
	//   10   81:aload_1         
	//   11   82:getfield        #28  <Field Object Message.obj>
	//   12   85:checkcast       #30  <Class Integer>
	//   13   88:invokevirtual   #34  <Method int Integer.intValue()>
	//   14   91:invokevirtual   #37  <Method void MediaControllerCompat$a.b(int)>
			return;
	//   15   94:return          

		case 11: // '\013'
			b.a(((Boolean)message.obj).booleanValue());
	//   16   95:aload_0         
	//   17   96:getfield        #24  <Field MediaControllerCompat$a b>
	//   18   99:aload_1         
	//   19  100:getfield        #28  <Field Object Message.obj>
	//   20  103:checkcast       #39  <Class Boolean>
	//   21  106:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
	//   22  109:invokevirtual   #46  <Method void MediaControllerCompat$a.a(boolean)>
			return;
	//   23  112:return          

		case 10: // '\n'
			b.b(((Boolean)message.obj).booleanValue());
	//   24  113:aload_0         
	//   25  114:getfield        #24  <Field MediaControllerCompat$a b>
	//   26  117:aload_1         
	//   27  118:getfield        #28  <Field Object Message.obj>
	//   28  121:checkcast       #39  <Class Boolean>
	//   29  124:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
	//   30  127:invokevirtual   #48  <Method void MediaControllerCompat$a.b(boolean)>
			return;
	//   31  130:return          

		case 9: // '\t'
			b.a(((Integer)message.obj).intValue());
	//   32  131:aload_0         
	//   33  132:getfield        #24  <Field MediaControllerCompat$a b>
	//   34  135:aload_1         
	//   35  136:getfield        #28  <Field Object Message.obj>
	//   36  139:checkcast       #30  <Class Integer>
	//   37  142:invokevirtual   #34  <Method int Integer.intValue()>
	//   38  145:invokevirtual   #50  <Method void MediaControllerCompat$a.a(int)>
			return;
	//   39  148:return          

		case 8: // '\b'
			b.a();
	//   40  149:aload_0         
	//   41  150:getfield        #24  <Field MediaControllerCompat$a b>
	//   42  153:invokevirtual   #53  <Method void MediaControllerCompat$a.a()>
			return;
	//   43  156:return          

		case 7: // '\007'
			b.a((Bundle)message.obj);
	//   44  157:aload_0         
	//   45  158:getfield        #24  <Field MediaControllerCompat$a b>
	//   46  161:aload_1         
	//   47  162:getfield        #28  <Field Object Message.obj>
	//   48  165:checkcast       #55  <Class Bundle>
	//   49  168:invokevirtual   #58  <Method void MediaControllerCompat$a.a(Bundle)>
			return;
	//   50  171:return          

		case 6: // '\006'
			b.a((CharSequence)message.obj);
	//   51  172:aload_0         
	//   52  173:getfield        #24  <Field MediaControllerCompat$a b>
	//   53  176:aload_1         
	//   54  177:getfield        #28  <Field Object Message.obj>
	//   55  180:checkcast       #60  <Class CharSequence>
	//   56  183:invokevirtual   #63  <Method void MediaControllerCompat$a.a(CharSequence)>
			return;
	//   57  186:return          

		case 5: // '\005'
			b.a((List)message.obj);
	//   58  187:aload_0         
	//   59  188:getfield        #24  <Field MediaControllerCompat$a b>
	//   60  191:aload_1         
	//   61  192:getfield        #28  <Field Object Message.obj>
	//   62  195:checkcast       #65  <Class List>
	//   63  198:invokevirtual   #68  <Method void MediaControllerCompat$a.a(List)>
			return;
	//   64  201:return          

		case 4: // '\004'
			b.a((MediaControllerCompat.f)message.obj);
	//   65  202:aload_0         
	//   66  203:getfield        #24  <Field MediaControllerCompat$a b>
	//   67  206:aload_1         
	//   68  207:getfield        #28  <Field Object Message.obj>
	//   69  210:checkcast       #70  <Class MediaControllerCompat$f>
	//   70  213:invokevirtual   #73  <Method void MediaControllerCompat$a.a(MediaControllerCompat$f)>
			return;
	//   71  216:return          

		case 3: // '\003'
			b.a((MediaMetadataCompat)message.obj);
	//   72  217:aload_0         
	//   73  218:getfield        #24  <Field MediaControllerCompat$a b>
	//   74  221:aload_1         
	//   75  222:getfield        #28  <Field Object Message.obj>
	//   76  225:checkcast       #75  <Class MediaMetadataCompat>
	//   77  228:invokevirtual   #78  <Method void MediaControllerCompat$a.a(MediaMetadataCompat)>
			return;
	//   78  231:return          

		case 2: // '\002'
			b.a((PlaybackStateCompat)message.obj);
	//   79  232:aload_0         
	//   80  233:getfield        #24  <Field MediaControllerCompat$a b>
	//   81  236:aload_1         
	//   82  237:getfield        #28  <Field Object Message.obj>
	//   83  240:checkcast       #80  <Class PlaybackStateCompat>
	//   84  243:invokevirtual   #83  <Method void MediaControllerCompat$a.a(PlaybackStateCompat)>
			return;
	//   85  246:return          

		case 1: // '\001'
			b.a((String)message.obj, message.getData());
	//   86  247:aload_0         
	//   87  248:getfield        #24  <Field MediaControllerCompat$a b>
	//   88  251:aload_1         
	//   89  252:getfield        #28  <Field Object Message.obj>
	//   90  255:checkcast       #85  <Class String>
	//   91  258:aload_1         
	//   92  259:invokevirtual   #89  <Method Bundle Message.getData()>
	//   93  262:invokevirtual   #92  <Method void MediaControllerCompat$a.a(String, Bundle)>
			return;
	//   94  265:return          
		}
	}

	boolean a;
	final MediaControllerCompat.a b;
}
