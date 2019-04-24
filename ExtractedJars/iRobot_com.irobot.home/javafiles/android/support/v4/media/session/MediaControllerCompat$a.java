// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, c, PlaybackStateCompat, ParcelableVolumeInfo

public static abstract class MediaControllerCompat$a
	implements android.os.IBinder.DeathRecipient
{
	private class a extends Handler
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
		//		               1 247
		//		               2 232
		//		               3 217
		//		               4 202
		//		               5 187
		//		               6 172
		//		               7 157
		//		               8 149
		//		               9 131
		//		               10 113
		//		               11 95
		//		               12 77
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

	private static class b
		implements c.a
	{

		public void a()
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_1        
			if(a1 != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          19
				a1.a();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #33  <Method void MediaControllerCompat$a.a()>
		//    9   19:return          
		}

		public void a(int i, int j, int k, int l, int i1)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore          6
			if(a1 != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          36
				a1.a(new MediaControllerCompat.f(i, j, k, l, i1));
		//    7   17:aload           6
		//    8   19:new             #36  <Class MediaControllerCompat$f>
		//    9   22:dup             
		//   10   23:iload_1         
		//   11   24:iload_2         
		//   12   25:iload_3         
		//   13   26:iload           4
		//   14   28:iload           5
		//   15   30:invokespecial   #38  <Method void MediaControllerCompat$f(int, int, int, int, int)>
		//   16   33:invokevirtual   #41  <Method void MediaControllerCompat$a.a(MediaControllerCompat$f)>
		//   17   36:return          
		}

		public void a(Bundle bundle)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				a1.a(bundle);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #44  <Method void MediaControllerCompat$a.a(Bundle)>
		//   10   20:return          
		}

		public void a(CharSequence charsequence)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				a1.a(charsequence);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #47  <Method void MediaControllerCompat$a.a(CharSequence)>
		//   10   20:return          
		}

		public void a(Object obj)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          31
			{
				if(a1.b)
		//*   7   15:aload_2         
		//*   8   16:getfield        #50  <Field boolean MediaControllerCompat$a.b>
		//*   9   19:ifeq            23
					return;
		//   10   22:return          
				a1.a(PlaybackStateCompat.a(obj));
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokestatic    #55  <Method PlaybackStateCompat PlaybackStateCompat.a(Object)>
		//   14   28:invokevirtual   #58  <Method void MediaControllerCompat$a.a(PlaybackStateCompat)>
			}
		//   15   31:return          
		}

		public void a(String s, Bundle bundle)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_3        
			if(a1 != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          37
			{
				if(a1.b && android.os.Build.VERSION.SDK_INT < 23)
		//*   7   15:aload_3         
		//*   8   16:getfield        #50  <Field boolean MediaControllerCompat$a.b>
		//*   9   19:ifeq            31
		//*  10   22:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
		//*  11   25:bipush          23
		//*  12   27:icmpge          31
					return;
		//   13   30:return          
				a1.a(s, bundle);
		//   14   31:aload_3         
		//   15   32:aload_1         
		//   16   33:aload_2         
		//   17   34:invokevirtual   #67  <Method void MediaControllerCompat$a.a(String, Bundle)>
			}
		//   18   37:return          
		}

		public void a(List list)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(MediaSessionCompat.QueueItem.a(list));
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #73  <Method List MediaSessionCompat$QueueItem.a(List)>
		//   10   20:invokevirtual   #75  <Method void MediaControllerCompat$a.a(List)>
		//   11   23:return          
		}

		public void b(Object obj)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(MediaMetadataCompat.a(obj));
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #82  <Method MediaMetadataCompat MediaMetadataCompat.a(Object)>
		//   10   20:invokevirtual   #85  <Method void MediaControllerCompat$a.a(MediaMetadataCompat)>
		//   11   23:return          
		}

		private final WeakReference a;

		b(MediaControllerCompat.a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			a = new WeakReference(((Object) (a1)));
		//    2    4:aload_0         
		//    3    5:new             #21  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #24  <Method void WeakReference(Object)>
		//    7   13:putfield        #26  <Field WeakReference a>
		//    8   16:return          
		}
	}

	private static class c extends a.a
	{

		public void a()
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_1        
			if(a1 != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          23
				a1.a(8, ((Object) (null)), ((Bundle) (null)));
		//    7   15:aload_1         
		//    8   16:bipush          8
		//    9   18:aconst_null     
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   23:return          
		}

		public void a(int i)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          9
		//    9   18:iload_1         
		//   10   19:invokestatic    #39  <Method Integer Integer.valueOf(int)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		public void a(Bundle bundle)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(7, ((Object) (bundle)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          7
		//    9   18:aload_1         
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   23:return          
		}

		public void a(MediaMetadataCompat mediametadatacompat)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				a1.a(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_3        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(ParcelableVolumeInfo parcelablevolumeinfo)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          59
			{
				if(parcelablevolumeinfo != null)
		//*   7   15:aload_1         
		//*   8   16:ifnull          50
					parcelablevolumeinfo = ((ParcelableVolumeInfo) (new MediaControllerCompat.f(parcelablevolumeinfo.a, parcelablevolumeinfo.b, parcelablevolumeinfo.c, parcelablevolumeinfo.d, parcelablevolumeinfo.e)));
		//    9   19:new             #44  <Class MediaControllerCompat$f>
		//   10   22:dup             
		//   11   23:aload_1         
		//   12   24:getfield        #49  <Field int ParcelableVolumeInfo.a>
		//   13   27:aload_1         
		//   14   28:getfield        #52  <Field int ParcelableVolumeInfo.b>
		//   15   31:aload_1         
		//   16   32:getfield        #54  <Field int ParcelableVolumeInfo.c>
		//   17   35:aload_1         
		//   18   36:getfield        #57  <Field int ParcelableVolumeInfo.d>
		//   19   39:aload_1         
		//   20   40:getfield        #60  <Field int ParcelableVolumeInfo.e>
		//   21   43:invokespecial   #63  <Method void MediaControllerCompat$f(int, int, int, int, int)>
		//   22   46:astore_1        
				else
		//*  23   47:goto            52
					parcelablevolumeinfo = null;
		//   24   50:aconst_null     
		//   25   51:astore_1        
				a1.a(4, ((Object) (parcelablevolumeinfo)), ((Bundle) (null)));
		//   26   52:aload_2         
		//   27   53:iconst_4        
		//   28   54:aload_1         
		//   29   55:aconst_null     
		//   30   56:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
			}
		//   31   59:return          
		}

		public void a(PlaybackStateCompat playbackstatecompat)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				a1.a(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_2        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(CharSequence charsequence)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(6, ((Object) (charsequence)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          6
		//    9   18:aload_1         
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   23:return          
		}

		public void a(String s, Bundle bundle)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_3        
			if(a1 != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          22
				a1.a(1, ((Object) (s)), bundle);
		//    7   15:aload_3         
		//    8   16:iconst_1        
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(List list)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				a1.a(5, ((Object) (list)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_5        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(boolean flag)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(10, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          10
		//    9   18:iload_1         
		//   10   19:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		public void b(int i)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(12, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          12
		//    9   18:iload_1         
		//   10   19:invokestatic    #39  <Method Integer Integer.valueOf(int)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		public void b(boolean flag)
		{
			MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(11, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          11
		//    9   18:iload_1         
		//   10   19:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		private final WeakReference a;

		c(MediaControllerCompat.a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void a$a()>
			a = new WeakReference(((Object) (a1)));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
		//    7   13:putfield        #24  <Field WeakReference a>
		//    8   16:return          
		}
	}


	public void a()
	{
	//    0    0:return          
	}

	public void a(int i)
	{
	//    0    0:return          
	}

	void a(int i, Object obj, Bundle bundle)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field MediaControllerCompat$a$a a>
	//*   2    4:ifnull          26
		{
			obj = ((Object) (a.obtainMessage(i, obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field MediaControllerCompat$a$a a>
	//    5   11:iload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #50  <Method Message MediaControllerCompat$a$a.obtainMessage(int, Object)>
	//    8   16:astore_2        
			((Message) (obj)).setData(bundle);
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #56  <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #59  <Method void Message.sendToTarget()>
		}
	//   14   26:return          
	}

	public void a(Bundle bundle)
	{
	//    0    0:return          
	}

	public void a(MediaMetadataCompat mediametadatacompat)
	{
	//    0    0:return          
	}

	public void a(MediaControllerCompat$f mediacontrollercompat$f)
	{
	//    0    0:return          
	}

	public void a(PlaybackStateCompat playbackstatecompat)
	{
	//    0    0:return          
	}

	public void a(CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void a(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public void a(List list)
	{
	//    0    0:return          
	}

	public void a(boolean flag)
	{
	//    0    0:return          
	}

	public void b(int i)
	{
	//    0    0:return          
	}

	public void b(boolean flag)
	{
	//    0    0:return          
	}

	a a;
	boolean b;
	private final Object c;

	public MediaControllerCompat$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          30
			obj = android.support.v4.media.session.c.a(((c.a) (new b(this))));
	//    5   12:new             #13  <Class MediaControllerCompat$a$b>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokespecial   #33  <Method void MediaControllerCompat$a$b(MediaControllerCompat$a)>
	//    9   20:invokestatic    #38  <Method Object c.a(c$a)>
	//   10   23:astore_1        
		else
	//*  11   24:aload_0         
	//*  12   25:aload_1         
	//*  13   26:putfield        #40  <Field Object c>
	//*  14   29:return          
			obj = ((Object) (new c(this)));
	//   15   30:new             #16  <Class MediaControllerCompat$a$c>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #41  <Method void MediaControllerCompat$a$c(MediaControllerCompat$a)>
	//   19   38:astore_1        
		c = obj;
	//*  20   39:goto            24
	}
}
