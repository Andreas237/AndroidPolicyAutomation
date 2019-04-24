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
	//    2    2:invokespecial   #25  <Method void AsyncTaskLoader(Context)>
		mObserver = new Loader.ForceLoadContentObserver(((Loader) (this)));
	//    3    5:aload_0         
	//    4    6:new             #27  <Class Loader$ForceLoadContentObserver>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #30  <Method void Loader$ForceLoadContentObserver(Loader)>
	//    8   14:putfield        #32  <Field Loader$ForceLoadContentObserver mObserver>
	//    9   17:return          
	}

	public CursorLoader(Context context, Uri uri, String as[], String s, String as1[], String s1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void AsyncTaskLoader(Context)>
		mObserver = new Loader.ForceLoadContentObserver(((Loader) (this)));
	//    3    5:aload_0         
	//    4    6:new             #27  <Class Loader$ForceLoadContentObserver>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #30  <Method void Loader$ForceLoadContentObserver(Loader)>
	//    8   14:putfield        #32  <Field Loader$ForceLoadContentObserver mObserver>
		mUri = uri;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #38  <Field Uri mUri>
		mProjection = as;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #40  <Field String[] mProjection>
		mSelection = s;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #42  <Field String mSelection>
		mSelectionArgs = as1;
	//   18   33:aload_0         
	//   19   34:aload           5
	//   20   36:putfield        #44  <Field String[] mSelectionArgs>
		mSortOrder = s1;
	//   21   39:aload_0         
	//   22   40:aload           6
	//   23   42:putfield        #46  <Field String mSortOrder>
	//   24   45:return          
	}

	public void cancelLoadInBackground()
	{
		super.cancelLoadInBackground();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AsyncTaskLoader.cancelLoadInBackground()>
		this;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(mCancellationSignal != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//*   6   10:ifnull          20
			mCancellationSignal.cancel();
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//    9   17:invokevirtual   #57  <Method void CancellationSignal.cancel()>
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
	//*   1    1:invokevirtual   #63  <Method boolean isReset()>
	//*   2    4:ifeq            18
		{
			if(cursor != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          17
				cursor.close();
	//    5   11:aload_1         
	//    6   12:invokeinterface #68  <Method void Cursor.close()>
			return;
	//    7   17:return          
		}
		Cursor cursor1 = mCursor;
	//    8   18:aload_0         
	//    9   19:getfield        #70  <Field Cursor mCursor>
	//   10   22:astore_2        
		mCursor = cursor;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #70  <Field Cursor mCursor>
		if(isStarted())
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #73  <Method boolean isStarted()>
	//*  16   32:ifeq            40
			super.deliverResult(((Object) (cursor)));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #76  <Method void AsyncTaskLoader.deliverResult(Object)>
		if(cursor1 != null && cursor1 != cursor && !cursor1.isClosed())
	//*  20   40:aload_2         
	//*  21   41:ifnull          64
	//*  22   44:aload_2         
	//*  23   45:aload_1         
	//*  24   46:if_acmpeq       64
	//*  25   49:aload_2         
	//*  26   50:invokeinterface #79  <Method boolean Cursor.isClosed()>
	//*  27   55:ifne            64
			cursor1.close();
	//   28   58:aload_2         
	//   29   59:invokeinterface #68  <Method void Cursor.close()>
	//   30   64:return          
	}

	public volatile void deliverResult(Object obj)
	{
		deliverResult((Cursor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #65  <Class Cursor>
	//    3    5:invokevirtual   #81  <Method void deliverResult(Cursor)>
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
	//    5    6:invokespecial   #85  <Method void AsyncTaskLoader.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.print(s);
	//    6    9:aload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mUri=");
	//    9   14:aload_3         
	//   10   15:ldc1            #93  <String "mUri=">
	//   11   17:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mUri)));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:getfield        #38  <Field Uri mUri>
	//   15   25:invokevirtual   #96  <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mProjection=");
	//   19   33:aload_3         
	//   20   34:ldc1            #98  <String "mProjection=">
	//   21   36:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(Arrays.toString(((Object []) (mProjection))));
	//   22   39:aload_3         
	//   23   40:aload_0         
	//   24   41:getfield        #40  <Field String[] mProjection>
	//   25   44:invokestatic    #104 <Method String Arrays.toString(Object[])>
	//   26   47:invokevirtual   #106 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   27   50:aload_3         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mSelection=");
	//   30   55:aload_3         
	//   31   56:ldc1            #108 <String "mSelection=">
	//   32   58:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(mSelection);
	//   33   61:aload_3         
	//   34   62:aload_0         
	//   35   63:getfield        #42  <Field String mSelection>
	//   36   66:invokevirtual   #106 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   37   69:aload_3         
	//   38   70:aload_1         
	//   39   71:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mSelectionArgs=");
	//   40   74:aload_3         
	//   41   75:ldc1            #110 <String "mSelectionArgs=">
	//   42   77:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(Arrays.toString(((Object []) (mSelectionArgs))));
	//   43   80:aload_3         
	//   44   81:aload_0         
	//   45   82:getfield        #44  <Field String[] mSelectionArgs>
	//   46   85:invokestatic    #104 <Method String Arrays.toString(Object[])>
	//   47   88:invokevirtual   #106 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   48   91:aload_3         
	//   49   92:aload_1         
	//   50   93:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mSortOrder=");
	//   51   96:aload_3         
	//   52   97:ldc1            #112 <String "mSortOrder=">
	//   53   99:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(mSortOrder);
	//   54  102:aload_3         
	//   55  103:aload_0         
	//   56  104:getfield        #46  <Field String mSortOrder>
	//   57  107:invokevirtual   #106 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   58  110:aload_3         
	//   59  111:aload_1         
	//   60  112:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mCursor=");
	//   61  115:aload_3         
	//   62  116:ldc1            #114 <String "mCursor=">
	//   63  118:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mCursor)));
	//   64  121:aload_3         
	//   65  122:aload_0         
	//   66  123:getfield        #70  <Field Cursor mCursor>
	//   67  126:invokevirtual   #96  <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   68  129:aload_3         
	//   69  130:aload_1         
	//   70  131:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.print("mContentChanged=");
	//   71  134:aload_3         
	//   72  135:ldc1            #116 <String "mContentChanged=">
	//   73  137:invokevirtual   #91  <Method void PrintWriter.print(String)>
		printwriter.println(mContentChanged);
	//   74  140:aload_3         
	//   75  141:aload_0         
	//   76  142:getfield        #120 <Field boolean mContentChanged>
	//   77  145:invokevirtual   #123 <Method void PrintWriter.println(boolean)>
	//   78  148:return          
	}

	public String[] getProjection()
	{
		return mProjection;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String[] mProjection>
	//    2    4:areturn         
	}

	public String getSelection()
	{
		return mSelection;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String mSelection>
	//    2    4:areturn         
	}

	public String[] getSelectionArgs()
	{
		return mSelectionArgs;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String[] mSelectionArgs>
	//    2    4:areturn         
	}

	public String getSortOrder()
	{
		return mSortOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mSortOrder>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Uri mUri>
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
	//*   3    3:invokevirtual   #139 <Method boolean isLoadInBackgroundCanceled()>
	//*   4    6:ifeq            17
			throw new OperationCanceledException();
	//    5    9:new             #141 <Class OperationCanceledException>
	//    6   12:dup             
	//    7   13:invokespecial   #143 <Method void OperationCanceledException()>
	//    8   16:athrow          
		mCancellationSignal = new CancellationSignal();
	//    9   17:aload_0         
	//   10   18:new             #54  <Class CancellationSignal>
	//   11   21:dup             
	//   12   22:invokespecial   #144 <Method void CancellationSignal()>
	//   13   25:putfield        #52  <Field CancellationSignal mCancellationSignal>
		this;
	//   14   28:aload_0         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		Cursor cursor = ContentResolverCompat.query(getContext().getContentResolver(), mUri, mProjection, mSelection, mSelectionArgs, mSortOrder, mCancellationSignal);
	//   16   30:aload_0         
	//   17   31:invokevirtual   #148 <Method Context getContext()>
	//   18   34:invokevirtual   #154 <Method android.content.ContentResolver Context.getContentResolver()>
	//   19   37:aload_0         
	//   20   38:getfield        #38  <Field Uri mUri>
	//   21   41:aload_0         
	//   22   42:getfield        #40  <Field String[] mProjection>
	//   23   45:aload_0         
	//   24   46:getfield        #42  <Field String mSelection>
	//   25   49:aload_0         
	//   26   50:getfield        #44  <Field String[] mSelectionArgs>
	//   27   53:aload_0         
	//   28   54:getfield        #46  <Field String mSortOrder>
	//   29   57:aload_0         
	//   30   58:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//   31   61:invokestatic    #160 <Method Cursor ContentResolverCompat.query(android.content.ContentResolver, Uri, String[], String, String[], String, CancellationSignal)>
	//   32   64:astore_1        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_98;
	//   33   65:aload_1         
	//   34   66:ifnull          98
		cursor.getCount();
	//   35   69:aload_1         
	//   36   70:invokeinterface #164 <Method int Cursor.getCount()>
	//   37   75:pop             
		cursor.registerContentObserver(((android.database.ContentObserver) (mObserver)));
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:getfield        #32  <Field Loader$ForceLoadContentObserver mObserver>
	//   41   81:invokeinterface #168 <Method void Cursor.registerContentObserver(android.database.ContentObserver)>
		break MISSING_BLOCK_LABEL_98;
	//   42   86:goto            98
		RuntimeException runtimeexception;
		runtimeexception;
	//   43   89:astore_2        
		cursor.close();
	//   44   90:aload_1         
	//   45   91:invokeinterface #68  <Method void Cursor.close()>
		throw runtimeexception;
	//   46   96:aload_2         
	//   47   97:athrow          
		this;
	//   48   98:aload_0         
		JVM INSTR monitorenter ;
	//   49   99:monitorenter    
		mCancellationSignal = null;
	//   50  100:aload_0         
	//   51  101:aconst_null     
	//   52  102:putfield        #52  <Field CancellationSignal mCancellationSignal>
		this;
	//   53  105:aload_0         
		JVM INSTR monitorexit ;
	//   54  106:monitorexit     
		return cursor;
	//   55  107:aload_1         
	//   56  108:areturn         
		Exception exception;
		exception;
	//   57  109:astore_1        
		this;
	//   58  110:aload_0         
		JVM INSTR monitorexit ;
	//   59  111:monitorexit     
		throw exception;
	//   60  112:aload_1         
	//   61  113:athrow          
		exception;
	//   62  114:astore_1        
		this;
	//   63  115:aload_0         
		JVM INSTR monitorenter ;
	//   64  116:monitorenter    
		mCancellationSignal = null;
	//   65  117:aload_0         
	//   66  118:aconst_null     
	//   67  119:putfield        #52  <Field CancellationSignal mCancellationSignal>
		this;
	//   68  122:aload_0         
		JVM INSTR monitorexit ;
	//   69  123:monitorexit     
		throw exception;
	//   70  124:aload_1         
	//   71  125:athrow          
		exception;
	//   72  126:astore_1        
		this;
	//   73  127:aload_0         
		JVM INSTR monitorexit ;
	//   74  128:monitorexit     
		throw exception;
	//   75  129:aload_1         
	//   76  130:athrow          
		exception;
	//   77  131:astore_1        
		this;
	//   78  132:aload_0         
		JVM INSTR monitorexit ;
	//   79  133:monitorexit     
		throw exception;
	//   80  134:aload_1         
	//   81  135:athrow          
	}

	public volatile Object loadInBackground()
	{
		return ((Object) (loadInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method Cursor loadInBackground()>
	//    2    4:areturn         
	}

	public void onCanceled(Cursor cursor)
	{
		if(cursor != null && !cursor.isClosed())
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #79  <Method boolean Cursor.isClosed()>
	//*   4   10:ifne            19
			cursor.close();
	//    5   13:aload_1         
	//    6   14:invokeinterface #68  <Method void Cursor.close()>
	//    7   19:return          
	}

	public volatile void onCanceled(Object obj)
	{
		onCanceled((Cursor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #65  <Class Cursor>
	//    3    5:invokevirtual   #174 <Method void onCanceled(Cursor)>
	//    4    8:return          
	}

	protected void onReset()
	{
		super.onReset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void AsyncTaskLoader.onReset()>
		onStopLoading();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #180 <Method void onStopLoading()>
		if(mCursor != null && !mCursor.isClosed())
	//*   4    8:aload_0         
	//*   5    9:getfield        #70  <Field Cursor mCursor>
	//*   6   12:ifnull          36
	//*   7   15:aload_0         
	//*   8   16:getfield        #70  <Field Cursor mCursor>
	//*   9   19:invokeinterface #79  <Method boolean Cursor.isClosed()>
	//*  10   24:ifne            36
			mCursor.close();
	//   11   27:aload_0         
	//   12   28:getfield        #70  <Field Cursor mCursor>
	//   13   31:invokeinterface #68  <Method void Cursor.close()>
		mCursor = null;
	//   14   36:aload_0         
	//   15   37:aconst_null     
	//   16   38:putfield        #70  <Field Cursor mCursor>
	//   17   41:return          
	}

	protected void onStartLoading()
	{
		if(mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Cursor mCursor>
	//*   2    4:ifnull          15
			deliverResult(mCursor);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field Cursor mCursor>
	//    6   12:invokevirtual   #81  <Method void deliverResult(Cursor)>
		if(takeContentChanged() || mCursor == null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #184 <Method boolean takeContentChanged()>
	//*   9   19:ifne            29
	//*  10   22:aload_0         
	//*  11   23:getfield        #70  <Field Cursor mCursor>
	//*  12   26:ifnonnull       33
			forceLoad();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #187 <Method void forceLoad()>
	//   15   33:return          
	}

	protected void onStopLoading()
	{
		cancelLoad();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method boolean cancelLoad()>
	//    2    4:pop             
	//    3    5:return          
	}

	public void setProjection(String as[])
	{
		mProjection = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String[] mProjection>
	//    3    5:return          
	}

	public void setSelection(String s)
	{
		mSelection = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String mSelection>
	//    3    5:return          
	}

	public void setSelectionArgs(String as[])
	{
		mSelectionArgs = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String[] mSelectionArgs>
	//    3    5:return          
	}

	public void setSortOrder(String s)
	{
		mSortOrder = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String mSortOrder>
	//    3    5:return          
	}

	public void setUri(Uri uri)
	{
		mUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field Uri mUri>
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
