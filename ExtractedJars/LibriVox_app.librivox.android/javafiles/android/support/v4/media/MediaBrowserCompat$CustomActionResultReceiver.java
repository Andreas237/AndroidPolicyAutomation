// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			h

class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver
{

	protected void a(int i, Bundle bundle)
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field h f>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		MediaSessionCompat.a(bundle);
	//    4    8:aload_2         
	//    5    9:invokestatic    #19  <Method void MediaSessionCompat.a(Bundle)>
		switch(i)
	//*   6   12:iload_1         
		{
	//*   7   13:tableswitch     -1 1: default 40
	//	               -1 142
	//	               0 125
	//	               1 108
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    8   40:new             #21  <Class StringBuilder>
	//    9   43:dup             
	//   10   44:invokespecial   #25  <Method void StringBuilder()>
	//   11   47:astore_3        
			stringbuilder.append("Unknown result code: ");
	//   12   48:aload_3         
	//   13   49:ldc1            #27  <String "Unknown result code: ">
	//   14   51:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   15   54:pop             
			stringbuilder.append(i);
	//   16   55:aload_3         
	//   17   56:iload_1         
	//   18   57:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   19   60:pop             
			stringbuilder.append(" (extras=");
	//   20   61:aload_3         
	//   21   62:ldc1            #36  <String " (extras=">
	//   22   64:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   23   67:pop             
			stringbuilder.append(((Object) (e)));
	//   24   68:aload_3         
	//   25   69:aload_0         
	//   26   70:getfield        #38  <Field Bundle e>
	//   27   73:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   28   76:pop             
			stringbuilder.append(", resultData=");
	//   29   77:aload_3         
	//   30   78:ldc1            #43  <String ", resultData=">
	//   31   80:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   32   83:pop             
			stringbuilder.append(((Object) (bundle)));
	//   33   84:aload_3         
	//   34   85:aload_2         
	//   35   86:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   36   89:pop             
			stringbuilder.append(")");
	//   37   90:aload_3         
	//   38   91:ldc1            #45  <String ")">
	//   39   93:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   40   96:pop             
			Log.w("MediaBrowserCompat", stringbuilder.toString());
	//   41   97:ldc1            #47  <String "MediaBrowserCompat">
	//   42   99:aload_3         
	//   43  100:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   44  103:invokestatic    #57  <Method int Log.w(String, String)>
	//   45  106:pop             
			return;
	//   46  107:return          

		case 1: // '\001'
			f.a(d, e, bundle);
	//   47  108:aload_0         
	//   48  109:getfield        #14  <Field h f>
	//   49  112:aload_0         
	//   50  113:getfield        #59  <Field String d>
	//   51  116:aload_0         
	//   52  117:getfield        #38  <Field Bundle e>
	//   53  120:aload_2         
	//   54  121:invokevirtual   #64  <Method void h.a(String, Bundle, Bundle)>
			return;
	//   55  124:return          

		case 0: // '\0'
			f.b(d, e, bundle);
	//   56  125:aload_0         
	//   57  126:getfield        #14  <Field h f>
	//   58  129:aload_0         
	//   59  130:getfield        #59  <Field String d>
	//   60  133:aload_0         
	//   61  134:getfield        #38  <Field Bundle e>
	//   62  137:aload_2         
	//   63  138:invokevirtual   #67  <Method void h.b(String, Bundle, Bundle)>
			return;
	//   64  141:return          

		case -1: 
			f.c(d, e, bundle);
	//   65  142:aload_0         
	//   66  143:getfield        #14  <Field h f>
	//   67  146:aload_0         
	//   68  147:getfield        #59  <Field String d>
	//   69  150:aload_0         
	//   70  151:getfield        #38  <Field Bundle e>
	//   71  154:aload_2         
	//   72  155:invokevirtual   #70  <Method void h.c(String, Bundle, Bundle)>
			return;
	//   73  158:return          
		}
	}

	private final String d;
	private final Bundle e;
	private final h f;
}
