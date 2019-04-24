// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.CancellationSignal;
import android.support.v4.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

// Referenced classes of package android.support.v4.content:
//			AsyncTaskLoader, ContentResolverCompat

public class CursorLoader extends AsyncTaskLoader
{

	public CursorLoader(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void AsyncTaskLoader(Context)>
		mObserver = new Loader.ForceLoadContentObserver(((Loader) (this)));
	//    3    5:aload_0         
	//    4    6:new             #26  <Class Loader$ForceLoadContentObserver>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #29  <Method void Loader$ForceLoadContentObserver(Loader)>
	//    8   14:putfield        #31  <Field Loader$ForceLoadContentObserver mObserver>
	//    9   17:return          
	}

	public CursorLoader(Context context, Uri uri, String as[], String s, String as1[], String s1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void AsyncTaskLoader(Context)>
		mObserver = new Loader.ForceLoadContentObserver(((Loader) (this)));
	//    3    5:aload_0         
	//    4    6:new             #26  <Class Loader$ForceLoadContentObserver>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #29  <Method void Loader$ForceLoadContentObserver(Loader)>
	//    8   14:putfield        #31  <Field Loader$ForceLoadContentObserver mObserver>
		mUri = uri;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #35  <Field Uri mUri>
		mProjection = as;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #37  <Field String[] mProjection>
		mSelection = s;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #39  <Field String mSelection>
		mSelectionArgs = as1;
	//   18   33:aload_0         
	//   19   34:aload           5
	//   20   36:putfield        #41  <Field String[] mSelectionArgs>
		mSortOrder = s1;
	//   21   39:aload_0         
	//   22   40:aload           6
	//   23   42:putfield        #43  <Field String mSortOrder>
	//   24   45:return          
	}

	public void cancelLoadInBackground()
	{
		super.cancelLoadInBackground();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void AsyncTaskLoader.cancelLoadInBackground()>
		this;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(mCancellationSignal != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #49  <Field CancellationSignal mCancellationSignal>
	//*   6   10:ifnull          20
			mCancellationSignal.cancel();
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field CancellationSignal mCancellationSignal>
	//    9   17:invokevirtual   #54  <Method void CancellationSignal.cancel()>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
		this;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw exception;
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public void deliverResult(Cursor cursor)
	{
		if(isReset())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method boolean isReset()>
	//*   2    4:ifeq            18
		{
			if(cursor != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          17
				cursor.close();
	//    5   11:aload_1         
	//    6   12:invokeinterface #65  <Method void Cursor.close()>
		} else
	//*   7   17:return          
		{
			Cursor cursor1 = mCursor;
	//    8   18:aload_0         
	//    9   19:getfield        #67  <Field Cursor mCursor>
	//   10   22:astore_2        
			mCursor = cursor;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #67  <Field Cursor mCursor>
			if(isStarted())
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #70  <Method boolean isStarted()>
	//*  16   32:ifeq            40
				super.deliverResult(((Object) (cursor)));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #73  <Method void AsyncTaskLoader.deliverResult(Object)>
			if(cursor1 != null && cursor1 != cursor && !cursor1.isClosed())
	//*  20   40:aload_2         
	//*  21   41:ifnull          17
	//*  22   44:aload_2         
	//*  23   45:aload_1         
	//*  24   46:if_acmpeq       17
	//*  25   49:aload_2         
	//*  26   50:invokeinterface #76  <Method boolean Cursor.isClosed()>
	//*  27   55:ifne            17
			{
				cursor1.close();
	//   28   58:aload_2         
	//   29   59:invokeinterface #65  <Method void Cursor.close()>
				return;
	//   30   64:return          
			}
		}
	}

	public volatile void deliverResult(Object obj)
	{
		deliverResult((Cursor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class Cursor>
	//    3    5:invokevirtual   #78  <Method void deliverResult(Cursor)>
	//    4    8:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #82  <Method void AsyncTaskLoader.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.print(s);
	//    6    9:aload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mUri=");
	//    9   14:aload_3         
	//   10   15:ldc1            #90  <String "mUri=">
	//   11   17:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mUri)));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:getfield        #35  <Field Uri mUri>
	//   15   25:invokevirtual   #93  <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mProjection=");
	//   19   33:aload_3         
	//   20   34:ldc1            #95  <String "mProjection=">
	//   21   36:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(Arrays.toString(((Object []) (mProjection))));
	//   22   39:aload_3         
	//   23   40:aload_0         
	//   24   41:getfield        #37  <Field String[] mProjection>
	//   25   44:invokestatic    #101 <Method String Arrays.toString(Object[])>
	//   26   47:invokevirtual   #103 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   27   50:aload_3         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mSelection=");
	//   30   55:aload_3         
	//   31   56:ldc1            #105 <String "mSelection=">
	//   32   58:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(mSelection);
	//   33   61:aload_3         
	//   34   62:aload_0         
	//   35   63:getfield        #39  <Field String mSelection>
	//   36   66:invokevirtual   #103 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   37   69:aload_3         
	//   38   70:aload_1         
	//   39   71:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mSelectionArgs=");
	//   40   74:aload_3         
	//   41   75:ldc1            #107 <String "mSelectionArgs=">
	//   42   77:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(Arrays.toString(((Object []) (mSelectionArgs))));
	//   43   80:aload_3         
	//   44   81:aload_0         
	//   45   82:getfield        #41  <Field String[] mSelectionArgs>
	//   46   85:invokestatic    #101 <Method String Arrays.toString(Object[])>
	//   47   88:invokevirtual   #103 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   48   91:aload_3         
	//   49   92:aload_1         
	//   50   93:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mSortOrder=");
	//   51   96:aload_3         
	//   52   97:ldc1            #109 <String "mSortOrder=">
	//   53   99:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(mSortOrder);
	//   54  102:aload_3         
	//   55  103:aload_0         
	//   56  104:getfield        #43  <Field String mSortOrder>
	//   57  107:invokevirtual   #103 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   58  110:aload_3         
	//   59  111:aload_1         
	//   60  112:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mCursor=");
	//   61  115:aload_3         
	//   62  116:ldc1            #111 <String "mCursor=">
	//   63  118:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mCursor)));
	//   64  121:aload_3         
	//   65  122:aload_0         
	//   66  123:getfield        #67  <Field Cursor mCursor>
	//   67  126:invokevirtual   #93  <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   68  129:aload_3         
	//   69  130:aload_1         
	//   70  131:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.print("mContentChanged=");
	//   71  134:aload_3         
	//   72  135:ldc1            #113 <String "mContentChanged=">
	//   73  137:invokevirtual   #88  <Method void PrintWriter.print(String)>
		printwriter.println(mContentChanged);
	//   74  140:aload_3         
	//   75  141:aload_0         
	//   76  142:getfield        #117 <Field boolean mContentChanged>
	//   77  145:invokevirtual   #120 <Method void PrintWriter.println(boolean)>
	//   78  148:return          
	}

	public String[] getProjection()
	{
		return mProjection;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String[] mProjection>
	//    2    4:areturn         
	}

	public String getSelection()
	{
		return mSelection;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String mSelection>
	//    2    4:areturn         
	}

	public String[] getSelectionArgs()
	{
		return mSelectionArgs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String[] mSelectionArgs>
	//    2    4:areturn         
	}

	public String getSortOrder()
	{
		return mSortOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String mSortOrder>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Uri mUri>
	//    2    4:areturn         
	}

	public Cursor loadInBackground()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isLoadInBackgroundCanceled())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #135 <Method boolean isLoadInBackgroundCanceled()>
	//*   4    6:ifeq            22
			throw new OperationCanceledException();
	//    5    9:new             #137 <Class OperationCanceledException>
	//    6   12:dup             
	//    7   13:invokespecial   #139 <Method void OperationCanceledException()>
	//    8   16:athrow          
		break MISSING_BLOCK_LABEL_22;
		Exception exception;
		exception;
	//    9   17:astore_1        
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		throw exception;
	//   12   20:aload_1         
	//   13   21:athrow          
		mCancellationSignal = new CancellationSignal();
	//   14   22:aload_0         
	//   15   23:new             #51  <Class CancellationSignal>
	//   16   26:dup             
	//   17   27:invokespecial   #140 <Method void CancellationSignal()>
	//   18   30:putfield        #49  <Field CancellationSignal mCancellationSignal>
		this;
	//   19   33:aload_0         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		Cursor cursor = ContentResolverCompat.query(getContext().getContentResolver(), mUri, mProjection, mSelection, mSelectionArgs, mSortOrder, mCancellationSignal);
	//   21   35:aload_0         
	//   22   36:invokevirtual   #144 <Method Context getContext()>
	//   23   39:invokevirtual   #150 <Method android.content.ContentResolver Context.getContentResolver()>
	//   24   42:aload_0         
	//   25   43:getfield        #35  <Field Uri mUri>
	//   26   46:aload_0         
	//   27   47:getfield        #37  <Field String[] mProjection>
	//   28   50:aload_0         
	//   29   51:getfield        #39  <Field String mSelection>
	//   30   54:aload_0         
	//   31   55:getfield        #41  <Field String[] mSelectionArgs>
	//   32   58:aload_0         
	//   33   59:getfield        #43  <Field String mSortOrder>
	//   34   62:aload_0         
	//   35   63:getfield        #49  <Field CancellationSignal mCancellationSignal>
	//   36   66:invokestatic    #156 <Method Cursor ContentResolverCompat.query(android.content.ContentResolver, Uri, String[], String, String[], String, CancellationSignal)>
	//   37   69:astore_1        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_91;
	//   38   70:aload_1         
	//   39   71:ifnull          91
		cursor.getCount();
	//   40   74:aload_1         
	//   41   75:invokeinterface #160 <Method int Cursor.getCount()>
	//   42   80:pop             
		cursor.registerContentObserver(((android.database.ContentObserver) (mObserver)));
	//   43   81:aload_1         
	//   44   82:aload_0         
	//   45   83:getfield        #31  <Field Loader$ForceLoadContentObserver mObserver>
	//   46   86:invokeinterface #164 <Method void Cursor.registerContentObserver(android.database.ContentObserver)>
		this;
	//   47   91:aload_0         
		JVM INSTR monitorenter ;
	//   48   92:monitorenter    
		mCancellationSignal = null;
	//   49   93:aload_0         
	//   50   94:aconst_null     
	//   51   95:putfield        #49  <Field CancellationSignal mCancellationSignal>
		this;
	//   52   98:aload_0         
		JVM INSTR monitorexit ;
	//   53   99:monitorexit     
		return cursor;
	//   54  100:aload_1         
	//   55  101:areturn         
		RuntimeException runtimeexception;
		runtimeexception;
	//   56  102:astore_2        
		cursor.close();
	//   57  103:aload_1         
	//   58  104:invokeinterface #65  <Method void Cursor.close()>
		throw runtimeexception;
	//   59  109:aload_2         
	//   60  110:athrow          
		cursor;
	//   61  111:astore_1        
		this;
	//   62  112:aload_0         
		JVM INSTR monitorenter ;
	//   63  113:monitorenter    
		mCancellationSignal = null;
	//   64  114:aload_0         
	//   65  115:aconst_null     
	//   66  116:putfield        #49  <Field CancellationSignal mCancellationSignal>
		this;
	//   67  119:aload_0         
		JVM INSTR monitorexit ;
	//   68  120:monitorexit     
		throw cursor;
	//   69  121:aload_1         
	//   70  122:athrow          
		cursor;
	//   71  123:astore_1        
		this;
	//   72  124:aload_0         
		JVM INSTR monitorexit ;
	//   73  125:monitorexit     
		throw cursor;
	//   74  126:aload_1         
	//   75  127:athrow          
		cursor;
	//   76  128:astore_1        
		this;
	//   77  129:aload_0         
		JVM INSTR monitorexit ;
	//   78  130:monitorexit     
		throw cursor;
	//   79  131:aload_1         
	//   80  132:athrow          
	}

	public volatile Object loadInBackground()
	{
		return ((Object) (loadInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method Cursor loadInBackground()>
	//    2    4:areturn         
	}

	public void onCanceled(Cursor cursor)
	{
		if(cursor != null && !cursor.isClosed())
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #76  <Method boolean Cursor.isClosed()>
	//*   4   10:ifne            19
			cursor.close();
	//    5   13:aload_1         
	//    6   14:invokeinterface #65  <Method void Cursor.close()>
	//    7   19:return          
	}

	public volatile void onCanceled(Object obj)
	{
		onCanceled((Cursor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class Cursor>
	//    3    5:invokevirtual   #170 <Method void onCanceled(Cursor)>
	//    4    8:return          
	}

	protected void onReset()
	{
		super.onReset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method void AsyncTaskLoader.onReset()>
		onStopLoading();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #176 <Method void onStopLoading()>
		if(mCursor != null && !mCursor.isClosed())
	//*   4    8:aload_0         
	//*   5    9:getfield        #67  <Field Cursor mCursor>
	//*   6   12:ifnull          36
	//*   7   15:aload_0         
	//*   8   16:getfield        #67  <Field Cursor mCursor>
	//*   9   19:invokeinterface #76  <Method boolean Cursor.isClosed()>
	//*  10   24:ifne            36
			mCursor.close();
	//   11   27:aload_0         
	//   12   28:getfield        #67  <Field Cursor mCursor>
	//   13   31:invokeinterface #65  <Method void Cursor.close()>
		mCursor = null;
	//   14   36:aload_0         
	//   15   37:aconst_null     
	//   16   38:putfield        #67  <Field Cursor mCursor>
	//   17   41:return          
	}

	protected void onStartLoading()
	{
		if(mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field Cursor mCursor>
	//*   2    4:ifnull          15
			deliverResult(mCursor);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field Cursor mCursor>
	//    6   12:invokevirtual   #78  <Method void deliverResult(Cursor)>
		if(takeContentChanged() || mCursor == null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #180 <Method boolean takeContentChanged()>
	//*   9   19:ifne            29
	//*  10   22:aload_0         
	//*  11   23:getfield        #67  <Field Cursor mCursor>
	//*  12   26:ifnonnull       33
			forceLoad();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #183 <Method void forceLoad()>
	//   15   33:return          
	}

	protected void onStopLoading()
	{
		cancelLoad();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method boolean cancelLoad()>
	//    2    4:pop             
	//    3    5:return          
	}

	public void setProjection(String as[])
	{
		mProjection = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String[] mProjection>
	//    3    5:return          
	}

	public void setSelection(String s)
	{
		mSelection = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String mSelection>
	//    3    5:return          
	}

	public void setSelectionArgs(String as[])
	{
		mSelectionArgs = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String[] mSelectionArgs>
	//    3    5:return          
	}

	public void setSortOrder(String s)
	{
		mSortOrder = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String mSortOrder>
	//    3    5:return          
	}

	public void setUri(Uri uri)
	{
		mUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Uri mUri>
	//    3    5:return          
	}

	CancellationSignal mCancellationSignal;
	Cursor mCursor;
	final Loader.ForceLoadContentObserver mObserver;
	String mProjection[];
	String mSelection;
	String mSelectionArgs[];
	String mSortOrder;
	Uri mUri;
}
