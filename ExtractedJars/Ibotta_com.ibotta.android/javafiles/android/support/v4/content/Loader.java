// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Context;
import android.support.v4.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader
{
	public static interface OnLoadCanceledListener
	{

		public abstract void onLoadCanceled(Loader loader);
	}

	public static interface OnLoadCompleteListener
	{

		public abstract void onLoadComplete(Loader loader, Object obj);
	}


	public Loader(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mStarted = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #35  <Field boolean mStarted>
		mAbandoned = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #37  <Field boolean mAbandoned>
		mReset = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #39  <Field boolean mReset>
		mContentChanged = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #41  <Field boolean mContentChanged>
		mProcessingChange = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #43  <Field boolean mProcessingChange>
		mContext = context.getApplicationContext();
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #49  <Method Context Context.getApplicationContext()>
	//   20   34:putfield        #51  <Field Context mContext>
	//   21   37:return          
	}

	public void abandon()
	{
		mAbandoned = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #37  <Field boolean mAbandoned>
		onAbandon();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #58  <Method void onAbandon()>
	//    5    9:return          
	}

	public boolean cancelLoad()
	{
		return onCancelLoad();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method boolean onCancelLoad()>
	//    2    4:ireturn         
	}

	public void commitContentChanged()
	{
		mProcessingChange = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #43  <Field boolean mProcessingChange>
	//    3    5:return          
	}

	public String dataToString(Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #73  <Method void StringBuilder(int)>
	//    4    9:astore_2        
		DebugUtils.buildShortClassTag(obj, stringbuilder);
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokestatic    #79  <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}");
	//    8   15:aload_2         
	//    9   16:ldc1            #81  <String "}">
	//   10   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		return stringbuilder.toString();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   14   26:areturn         
	}

	public void deliverCancellation()
	{
		OnLoadCanceledListener onloadcanceledlistener = mOnLoadCanceledListener;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Loader$OnLoadCanceledListener mOnLoadCanceledListener>
	//    2    4:astore_1        
		if(onloadcanceledlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			onloadcanceledlistener.onLoadCanceled(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #98  <Method void Loader$OnLoadCanceledListener.onLoadCanceled(Loader)>
	//    8   16:return          
	}

	public void deliverResult(Object obj)
	{
		OnLoadCompleteListener onloadcompletelistener = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Loader$OnLoadCompleteListener mListener>
	//    2    4:astore_2        
		if(onloadcompletelistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			onloadcompletelistener.onLoadComplete(this, obj);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #106 <Method void Loader$OnLoadCompleteListener.onLoadComplete(Loader, Object)>
	//    9   17:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method void PrintWriter.print(String)>
		printwriter.print("mId=");
	//    3    5:aload_3         
	//    4    6:ldc1            #118 <String "mId=">
	//    5    8:invokevirtual   #116 <Method void PrintWriter.print(String)>
		printwriter.print(mId);
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #120 <Field int mId>
	//    9   16:invokevirtual   #122 <Method void PrintWriter.print(int)>
		printwriter.print(" mListener=");
	//   10   19:aload_3         
	//   11   20:ldc1            #124 <String " mListener=">
	//   12   22:invokevirtual   #116 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mListener)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getfield        #102 <Field Loader$OnLoadCompleteListener mListener>
	//   16   30:invokevirtual   #127 <Method void PrintWriter.println(Object)>
		if(mStarted || mContentChanged || mProcessingChange)
	//*  17   33:aload_0         
	//*  18   34:getfield        #35  <Field boolean mStarted>
	//*  19   37:ifne            54
	//*  20   40:aload_0         
	//*  21   41:getfield        #41  <Field boolean mContentChanged>
	//*  22   44:ifne            54
	//*  23   47:aload_0         
	//*  24   48:getfield        #43  <Field boolean mProcessingChange>
	//*  25   51:ifeq            101
		{
			printwriter.print(s);
	//   26   54:aload_3         
	//   27   55:aload_1         
	//   28   56:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.print("mStarted=");
	//   29   59:aload_3         
	//   30   60:ldc1            #129 <String "mStarted=">
	//   31   62:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.print(mStarted);
	//   32   65:aload_3         
	//   33   66:aload_0         
	//   34   67:getfield        #35  <Field boolean mStarted>
	//   35   70:invokevirtual   #132 <Method void PrintWriter.print(boolean)>
			printwriter.print(" mContentChanged=");
	//   36   73:aload_3         
	//   37   74:ldc1            #134 <String " mContentChanged=">
	//   38   76:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.print(mContentChanged);
	//   39   79:aload_3         
	//   40   80:aload_0         
	//   41   81:getfield        #41  <Field boolean mContentChanged>
	//   42   84:invokevirtual   #132 <Method void PrintWriter.print(boolean)>
			printwriter.print(" mProcessingChange=");
	//   43   87:aload_3         
	//   44   88:ldc1            #136 <String " mProcessingChange=">
	//   45   90:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.println(mProcessingChange);
	//   46   93:aload_3         
	//   47   94:aload_0         
	//   48   95:getfield        #43  <Field boolean mProcessingChange>
	//   49   98:invokevirtual   #138 <Method void PrintWriter.println(boolean)>
		}
		if(mAbandoned || mReset)
	//*  50  101:aload_0         
	//*  51  102:getfield        #37  <Field boolean mAbandoned>
	//*  52  105:ifne            115
	//*  53  108:aload_0         
	//*  54  109:getfield        #39  <Field boolean mReset>
	//*  55  112:ifeq            148
		{
			printwriter.print(s);
	//   56  115:aload_3         
	//   57  116:aload_1         
	//   58  117:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.print("mAbandoned=");
	//   59  120:aload_3         
	//   60  121:ldc1            #140 <String "mAbandoned=">
	//   61  123:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.print(mAbandoned);
	//   62  126:aload_3         
	//   63  127:aload_0         
	//   64  128:getfield        #37  <Field boolean mAbandoned>
	//   65  131:invokevirtual   #132 <Method void PrintWriter.print(boolean)>
			printwriter.print(" mReset=");
	//   66  134:aload_3         
	//   67  135:ldc1            #142 <String " mReset=">
	//   68  137:invokevirtual   #116 <Method void PrintWriter.print(String)>
			printwriter.println(mReset);
	//   69  140:aload_3         
	//   70  141:aload_0         
	//   71  142:getfield        #39  <Field boolean mReset>
	//   72  145:invokevirtual   #138 <Method void PrintWriter.println(boolean)>
		}
	//   73  148:return          
	}

	public void forceLoad()
	{
		onForceLoad();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method void onForceLoad()>
	//    2    4:return          
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Context mContext>
	//    2    4:areturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int mId>
	//    2    4:ireturn         
	}

	public boolean isAbandoned()
	{
		return mAbandoned;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean mAbandoned>
	//    2    4:ireturn         
	}

	public boolean isReset()
	{
		return mReset;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mReset>
	//    2    4:ireturn         
	}

	public boolean isStarted()
	{
		return mStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean mStarted>
	//    2    4:ireturn         
	}

	protected void onAbandon()
	{
	//    0    0:return          
	}

	protected boolean onCancelLoad()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onContentChanged()
	{
		if(mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean mStarted>
	//*   2    4:ifeq            12
		{
			forceLoad();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #156 <Method void forceLoad()>
			return;
	//    5   11:return          
		} else
		{
			mContentChanged = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #41  <Field boolean mContentChanged>
			return;
	//    9   17:return          
		}
	}

	protected void onForceLoad()
	{
	//    0    0:return          
	}

	protected void onReset()
	{
	//    0    0:return          
	}

	protected void onStartLoading()
	{
	//    0    0:return          
	}

	protected void onStopLoading()
	{
	//    0    0:return          
	}

	public void registerListener(int i, OnLoadCompleteListener onloadcompletelistener)
	{
		if(mListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field Loader$OnLoadCompleteListener mListener>
	//*   2    4:ifnonnull       18
		{
			mListener = onloadcompletelistener;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #102 <Field Loader$OnLoadCompleteListener mListener>
			mId = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #120 <Field int mId>
			return;
	//    9   17:return          
		} else
		{
			throw new IllegalStateException("There is already a listener registered");
	//   10   18:new             #163 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc1            #165 <String "There is already a listener registered">
	//   13   24:invokespecial   #167 <Method void IllegalStateException(String)>
	//   14   27:athrow          
		}
	}

	public void registerOnLoadCanceledListener(OnLoadCanceledListener onloadcanceledlistener)
	{
		if(mOnLoadCanceledListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field Loader$OnLoadCanceledListener mOnLoadCanceledListener>
	//*   2    4:ifnonnull       13
		{
			mOnLoadCanceledListener = onloadcanceledlistener;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #94  <Field Loader$OnLoadCanceledListener mOnLoadCanceledListener>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("There is already a listener registered");
	//    7   13:new             #163 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #165 <String "There is already a listener registered">
	//   10   19:invokespecial   #167 <Method void IllegalStateException(String)>
	//   11   22:athrow          
		}
	}

	public void reset()
	{
		onReset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method void onReset()>
		mReset = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #39  <Field boolean mReset>
		mStarted = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #35  <Field boolean mStarted>
		mAbandoned = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #37  <Field boolean mAbandoned>
		mContentChanged = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #41  <Field boolean mContentChanged>
		mProcessingChange = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #43  <Field boolean mProcessingChange>
	//   17   29:return          
	}

	public void rollbackContentChanged()
	{
		if(mProcessingChange)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean mProcessingChange>
	//*   2    4:ifeq            11
			onContentChanged();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #177 <Method void onContentChanged()>
	//    5   11:return          
	}

	public final void startLoading()
	{
		mStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #35  <Field boolean mStarted>
		mReset = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #39  <Field boolean mReset>
		mAbandoned = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #37  <Field boolean mAbandoned>
		onStartLoading();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #180 <Method void onStartLoading()>
	//   11   19:return          
	}

	public void stopLoading()
	{
		mStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #35  <Field boolean mStarted>
		onStopLoading();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #183 <Method void onStopLoading()>
	//    5    9:return          
	}

	public boolean takeContentChanged()
	{
		boolean flag = mContentChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean mContentChanged>
	//    2    4:istore_1        
		mContentChanged = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #41  <Field boolean mContentChanged>
		mProcessingChange = mProcessingChange | flag;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #43  <Field boolean mProcessingChange>
	//    9   15:iload_1         
	//   10   16:ior             
	//   11   17:putfield        #43  <Field boolean mProcessingChange>
		return flag;
	//   12   20:iload_1         
	//   13   21:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #73  <Method void StringBuilder(int)>
	//    4    9:astore_1        
		DebugUtils.buildShortClassTag(((Object) (this)), stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokestatic    #79  <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append(" id=");
	//    8   15:aload_1         
	//    9   16:ldc1            #186 <String " id=">
	//   10   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(mId);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #120 <Field int mId>
	//   15   27:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
		stringbuilder.append("}");
	//   17   31:aload_1         
	//   18   32:ldc1            #81  <String "}">
	//   19   34:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		return stringbuilder.toString();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   23   42:areturn         
	}

	public void unregisterListener(OnLoadCompleteListener onloadcompletelistener)
	{
		OnLoadCompleteListener onloadcompletelistener1 = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Loader$OnLoadCompleteListener mListener>
	//    2    4:astore_2        
		if(onloadcompletelistener1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
		{
			if(onloadcompletelistener1 == onloadcompletelistener)
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       20
			{
				mListener = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #102 <Field Loader$OnLoadCompleteListener mListener>
				return;
	//   11   19:return          
			} else
			{
				throw new IllegalArgumentException("Attempting to unregister the wrong listener");
	//   12   20:new             #193 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc1            #195 <String "Attempting to unregister the wrong listener">
	//   15   26:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   16   29:athrow          
			}
		} else
		{
			throw new IllegalStateException("No listener register");
	//   17   30:new             #163 <Class IllegalStateException>
	//   18   33:dup             
	//   19   34:ldc1            #198 <String "No listener register">
	//   20   36:invokespecial   #167 <Method void IllegalStateException(String)>
	//   21   39:athrow          
		}
	}

	public void unregisterOnLoadCanceledListener(OnLoadCanceledListener onloadcanceledlistener)
	{
		OnLoadCanceledListener onloadcanceledlistener1 = mOnLoadCanceledListener;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Loader$OnLoadCanceledListener mOnLoadCanceledListener>
	//    2    4:astore_2        
		if(onloadcanceledlistener1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
		{
			if(onloadcanceledlistener1 == onloadcanceledlistener)
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       20
			{
				mOnLoadCanceledListener = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #94  <Field Loader$OnLoadCanceledListener mOnLoadCanceledListener>
				return;
	//   11   19:return          
			} else
			{
				throw new IllegalArgumentException("Attempting to unregister the wrong listener");
	//   12   20:new             #193 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc1            #195 <String "Attempting to unregister the wrong listener">
	//   15   26:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   16   29:athrow          
			}
		} else
		{
			throw new IllegalStateException("No listener register");
	//   17   30:new             #163 <Class IllegalStateException>
	//   18   33:dup             
	//   19   34:ldc1            #198 <String "No listener register">
	//   20   36:invokespecial   #167 <Method void IllegalStateException(String)>
	//   21   39:athrow          
		}
	}

	boolean mAbandoned;
	boolean mContentChanged;
	Context mContext;
	int mId;
	OnLoadCompleteListener mListener;
	OnLoadCanceledListener mOnLoadCanceledListener;
	boolean mProcessingChange;
	boolean mReset;
	boolean mStarted;
}
