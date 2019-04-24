// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.trackselection.TrackSelection;

public final class ChunkedTrackBlacklistUtil
{

	private ChunkedTrackBlacklistUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static boolean maybeBlacklistTrack(TrackSelection trackselection, int i, Exception exception)
	{
		return maybeBlacklistTrack(trackselection, i, exception, 60000L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:ldc2w           #7   <Long 60000L>
	//    4    6:invokestatic    #22  <Method boolean maybeBlacklistTrack(TrackSelection, int, Exception, long)>
	//    5    9:ireturn         
	}

	public static boolean maybeBlacklistTrack(TrackSelection trackselection, int i, Exception exception, long l)
	{
		if(shouldBlacklist(exception))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #26  <Method boolean shouldBlacklist(Exception)>
	//*   2    4:ifeq            152
		{
			boolean flag = trackselection.blacklist(i, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:lload_3         
	//    6   10:invokeinterface #32  <Method boolean TrackSelection.blacklist(int, long)>
	//    7   15:istore          6
			int j = ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException)exception).responseCode;
	//    8   17:aload_2         
	//    9   18:checkcast       #34  <Class com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException>
	//   10   21:getfield        #38  <Field int com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException.responseCode>
	//   11   24:istore          5
			if(flag)
	//*  12   26:iload           6
	//*  13   28:ifeq            98
			{
				exception = ((Exception) (new StringBuilder()));
	//   14   31:new             #40  <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #41  <Method void StringBuilder()>
	//   17   38:astore_2        
				((StringBuilder) (exception)).append("Blacklisted: duration=");
	//   18   39:aload_2         
	//   19   40:ldc1            #43  <String "Blacklisted: duration=">
	//   20   42:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
				((StringBuilder) (exception)).append(l);
	//   22   46:aload_2         
	//   23   47:lload_3         
	//   24   48:invokevirtual   #50  <Method StringBuilder StringBuilder.append(long)>
	//   25   51:pop             
				((StringBuilder) (exception)).append(", responseCode=");
	//   26   52:aload_2         
	//   27   53:ldc1            #52  <String ", responseCode=">
	//   28   55:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
				((StringBuilder) (exception)).append(j);
	//   30   59:aload_2         
	//   31   60:iload           5
	//   32   62:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   33   65:pop             
				((StringBuilder) (exception)).append(", format=");
	//   34   66:aload_2         
	//   35   67:ldc1            #57  <String ", format=">
	//   36   69:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
				((StringBuilder) (exception)).append(((Object) (trackselection.getFormat(i))));
	//   38   73:aload_2         
	//   39   74:aload_0         
	//   40   75:iload_1         
	//   41   76:invokeinterface #61  <Method com.google.android.exoplayer2.Format TrackSelection.getFormat(int)>
	//   42   81:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
	//   43   84:pop             
				Log.w("ChunkedTrackBlacklist", ((StringBuilder) (exception)).toString());
	//   44   85:ldc1            #12  <String "ChunkedTrackBlacklist">
	//   45   87:aload_2         
	//   46   88:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   47   91:invokestatic    #74  <Method int Log.w(String, String)>
	//   48   94:pop             
				return flag;
	//   49   95:iload           6
	//   50   97:ireturn         
			} else
			{
				exception = ((Exception) (new StringBuilder()));
	//   51   98:new             #40  <Class StringBuilder>
	//   52  101:dup             
	//   53  102:invokespecial   #41  <Method void StringBuilder()>
	//   54  105:astore_2        
				((StringBuilder) (exception)).append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
	//   55  106:aload_2         
	//   56  107:ldc1            #76  <String "Blacklisting failed (cannot blacklist last enabled track): responseCode=">
	//   57  109:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:pop             
				((StringBuilder) (exception)).append(j);
	//   59  113:aload_2         
	//   60  114:iload           5
	//   61  116:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   62  119:pop             
				((StringBuilder) (exception)).append(", format=");
	//   63  120:aload_2         
	//   64  121:ldc1            #57  <String ", format=">
	//   65  123:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   66  126:pop             
				((StringBuilder) (exception)).append(((Object) (trackselection.getFormat(i))));
	//   67  127:aload_2         
	//   68  128:aload_0         
	//   69  129:iload_1         
	//   70  130:invokeinterface #61  <Method com.google.android.exoplayer2.Format TrackSelection.getFormat(int)>
	//   71  135:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
	//   72  138:pop             
				Log.w("ChunkedTrackBlacklist", ((StringBuilder) (exception)).toString());
	//   73  139:ldc1            #12  <String "ChunkedTrackBlacklist">
	//   74  141:aload_2         
	//   75  142:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   76  145:invokestatic    #74  <Method int Log.w(String, String)>
	//   77  148:pop             
				return flag;
	//   78  149:iload           6
	//   79  151:ireturn         
			}
		} else
		{
			return false;
	//   80  152:iconst_0        
	//   81  153:ireturn         
		}
	}

	public static boolean shouldBlacklist(Exception exception)
	{
		boolean flag1 = exception instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
	//    0    0:aload_0         
	//    1    1:instanceof      #34  <Class com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            37
		{
			int i = ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException)exception).responseCode;
	//    7   11:aload_0         
	//    8   12:checkcast       #34  <Class com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException>
	//    9   15:getfield        #38  <Field int com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException.responseCode>
	//   10   18:istore_1        
			if(i == 404 || i == 410)
	//*  11   19:iload_1         
	//*  12   20:sipush          404
	//*  13   23:icmpeq          33
	//*  14   26:iload_1         
	//*  15   27:sipush          410
	//*  16   30:icmpne          35
				flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_2        
			return flag;
	//   19   35:iload_2         
	//   20   36:ireturn         
		} else
		{
			return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		}
	}

	public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000L;
	private static final String TAG = "ChunkedTrackBlacklist";
}
