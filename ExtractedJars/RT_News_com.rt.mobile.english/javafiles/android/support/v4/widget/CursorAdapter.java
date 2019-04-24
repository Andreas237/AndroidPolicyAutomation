// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.database.*;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

// Referenced classes of package android.support.v4.widget:
//			CursorFilter

public abstract class CursorAdapter extends BaseAdapter
	implements Filterable, CursorFilter.CursorFilterClient
{
	private class ChangeObserver extends ContentObserver
	{

		public boolean deliverSelfNotifications()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onChange(boolean flag)
		{
			onContentChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:invokevirtual   #29  <Method void CursorAdapter.onContentChanged()>
		//    3    7:return          
		}

		final CursorAdapter this$0;

		ChangeObserver()
		{
			this$0 = CursorAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CursorAdapter this$0>
			super(new Handler());
		//    3    5:aload_0         
		//    4    6:new             #15  <Class Handler>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void Handler()>
		//    7   13:invokespecial   #21  <Method void ContentObserver(Handler)>
		//    8   16:return          
		}
	}

	private class MyDataSetObserver extends DataSetObserver
	{

		public void onChanged()
		{
			mDataValid = true;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:iconst_1        
		//    3    5:putfield        #22  <Field boolean CursorAdapter.mDataValid>
			notifyDataSetChanged();
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field CursorAdapter this$0>
		//    6   12:invokevirtual   #25  <Method void CursorAdapter.notifyDataSetChanged()>
		//    7   15:return          
		}

		public void onInvalidated()
		{
			mDataValid = false;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:iconst_0        
		//    3    5:putfield        #22  <Field boolean CursorAdapter.mDataValid>
			notifyDataSetInvalidated();
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field CursorAdapter this$0>
		//    6   12:invokevirtual   #29  <Method void CursorAdapter.notifyDataSetInvalidated()>
		//    7   15:return          
		}

		final CursorAdapter this$0;

		MyDataSetObserver()
		{
			this$0 = CursorAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CursorAdapter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}


	public CursorAdapter(Context context, Cursor cursor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseAdapter()>
		init(context, cursor, 1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//    7   11:return          
	}

	public CursorAdapter(Context context, Cursor cursor, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseAdapter()>
		init(context, cursor, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//    7   11:return          
	}

	public CursorAdapter(Context context, Cursor cursor, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseAdapter()>
		byte byte0;
		if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
			byte0 = 1;
	//    4    8:iconst_1        
	//    5    9:istore          4
		else
	//*   6   11:goto            17
			byte0 = 2;
	//    7   14:iconst_2        
	//    8   15:istore          4
		init(context, cursor, ((int) (byte0)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:iload           4
	//   13   22:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//   14   25:return          
	}

	public abstract void bindView(View view, Context context, Cursor cursor);

	public void changeCursor(Cursor cursor)
	{
		cursor = swapCursor(cursor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method Cursor swapCursor(Cursor)>
	//    3    5:astore_1        
		if(cursor != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			cursor.close();
	//    6   10:aload_1         
	//    7   11:invokeinterface #65  <Method void Cursor.close()>
	//    8   16:return          
	}

	public CharSequence convertToString(Cursor cursor)
	{
		if(cursor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #69  <String "">
	//    3    6:areturn         
		else
			return ((CharSequence) (((Object) (cursor)).toString()));
	//    4    7:aload_1         
	//    5    8:invokevirtual   #75  <Method String Object.toString()>
	//    6   11:areturn         
	}

	public int getCount()
	{
		if(mDataValid && mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          24
			return mCursor.getCount();
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field Cursor mCursor>
	//    8   18:invokeinterface #83  <Method int Cursor.getCount()>
	//    9   23:ireturn         
		else
			return 0;
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	public Cursor getCursor()
	{
		return mCursor;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Cursor mCursor>
	//    2    4:areturn         
	}

	public View getDropDownView(int i, View view, ViewGroup viewgroup)
	{
		if(mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            57
		{
			mCursor.moveToPosition(i);
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Cursor mCursor>
	//    5   11:iload_1         
	//    6   12:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//    7   17:pop             
			View view1 = view;
	//    8   18:aload_2         
	//    9   19:astore          4
			if(view == null)
	//*  10   21:aload_2         
	//*  11   22:ifnonnull       40
				view1 = newDropDownView(mContext, mCursor, viewgroup);
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #93  <Field Context mContext>
	//   15   30:aload_0         
	//   16   31:getfield        #81  <Field Cursor mCursor>
	//   17   34:aload_3         
	//   18   35:invokevirtual   #97  <Method View newDropDownView(Context, Cursor, ViewGroup)>
	//   19   38:astore          4
			bindView(view1, mContext, mCursor);
	//   20   40:aload_0         
	//   21   41:aload           4
	//   22   43:aload_0         
	//   23   44:getfield        #93  <Field Context mContext>
	//   24   47:aload_0         
	//   25   48:getfield        #81  <Field Cursor mCursor>
	//   26   51:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
			return view1;
	//   27   54:aload           4
	//   28   56:areturn         
		} else
		{
			return null;
	//   29   57:aconst_null     
	//   30   58:areturn         
		}
	}

	public Filter getFilter()
	{
		if(mCursorFilter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field CursorFilter mCursorFilter>
	//*   2    4:ifnonnull       19
			mCursorFilter = new CursorFilter(((CursorFilter.CursorFilterClient) (this)));
	//    3    7:aload_0         
	//    4    8:new             #105 <Class CursorFilter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #108 <Method void CursorFilter(CursorFilter$CursorFilterClient)>
	//    8   16:putfield        #103 <Field CursorFilter mCursorFilter>
		return ((Filter) (mCursorFilter));
	//    9   19:aload_0         
	//   10   20:getfield        #103 <Field CursorFilter mCursorFilter>
	//   11   23:areturn         
	}

	public FilterQueryProvider getFilterQueryProvider()
	{
		return mFilterQueryProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    2    4:areturn         
	}

	public Object getItem(int i)
	{
		if(mDataValid && mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          30
		{
			mCursor.moveToPosition(i);
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field Cursor mCursor>
	//    8   18:iload_1         
	//    9   19:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//   10   24:pop             
			return ((Object) (mCursor));
	//   11   25:aload_0         
	//   12   26:getfield        #81  <Field Cursor mCursor>
	//   13   29:areturn         
		} else
		{
			return ((Object) (null));
	//   14   30:aconst_null     
	//   15   31:areturn         
		}
	}

	public long getItemId(int i)
	{
		if(mDataValid && mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            43
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          43
		{
			if(mCursor.moveToPosition(i))
	//*   6   14:aload_0         
	//*   7   15:getfield        #81  <Field Cursor mCursor>
	//*   8   18:iload_1         
	//*   9   19:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*  10   24:ifeq            41
				return mCursor.getLong(mRowIDColumn);
	//   11   27:aload_0         
	//   12   28:getfield        #81  <Field Cursor mCursor>
	//   13   31:aload_0         
	//   14   32:getfield        #118 <Field int mRowIDColumn>
	//   15   35:invokeinterface #121 <Method long Cursor.getLong(int)>
	//   16   40:lreturn         
			else
				return 0L;
	//   17   41:lconst_0        
	//   18   42:lreturn         
		} else
		{
			return 0L;
	//   19   43:lconst_0        
	//   20   44:lreturn         
		}
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		if(!mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("this should only be called when the cursor is valid");
	//    3    7:new             #124 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #126 <String "this should only be called when the cursor is valid">
	//    6   13:invokespecial   #129 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(!mCursor.moveToPosition(i))
	//*   8   17:aload_0         
	//*   9   18:getfield        #81  <Field Cursor mCursor>
	//*  10   21:iload_1         
	//*  11   22:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*  12   27:ifne            63
		{
			view = ((View) (new StringBuilder()));
	//   13   30:new             #131 <Class StringBuilder>
	//   14   33:dup             
	//   15   34:invokespecial   #132 <Method void StringBuilder()>
	//   16   37:astore_2        
			((StringBuilder) (view)).append("couldn't move cursor to position ");
	//   17   38:aload_2         
	//   18   39:ldc1            #134 <String "couldn't move cursor to position ">
	//   19   41:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
			((StringBuilder) (view)).append(i);
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #141 <Method StringBuilder StringBuilder.append(int)>
	//   24   50:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//   25   51:new             #124 <Class IllegalStateException>
	//   26   54:dup             
	//   27   55:aload_2         
	//   28   56:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   29   59:invokespecial   #129 <Method void IllegalStateException(String)>
	//   30   62:athrow          
		}
		View view1 = view;
	//   31   63:aload_2         
	//   32   64:astore          4
		if(view == null)
	//*  33   66:aload_2         
	//*  34   67:ifnonnull       85
			view1 = newView(mContext, mCursor, viewgroup);
	//   35   70:aload_0         
	//   36   71:aload_0         
	//   37   72:getfield        #93  <Field Context mContext>
	//   38   75:aload_0         
	//   39   76:getfield        #81  <Field Cursor mCursor>
	//   40   79:aload_3         
	//   41   80:invokevirtual   #145 <Method View newView(Context, Cursor, ViewGroup)>
	//   42   83:astore          4
		bindView(view1, mContext, mCursor);
	//   43   85:aload_0         
	//   44   86:aload           4
	//   45   88:aload_0         
	//   46   89:getfield        #93  <Field Context mContext>
	//   47   92:aload_0         
	//   48   93:getfield        #81  <Field Cursor mCursor>
	//   49   96:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
		return view1;
	//   50   99:aload           4
	//   51  101:areturn         
	}

	public boolean hasStableIds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void init(Context context, Cursor cursor, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if((i & 1) == 1)
	//*   2    3:iload_3         
	//*   3    4:iconst_1        
	//*   4    5:iand            
	//*   5    6:iconst_1        
	//*   6    7:icmpne          22
		{
			i |= 2;
	//    7   10:iload_3         
	//    8   11:iconst_2        
	//    9   12:ior             
	//   10   13:istore_3        
			mAutoRequery = true;
	//   11   14:aload_0         
	//   12   15:iconst_1        
	//   13   16:putfield        #149 <Field boolean mAutoRequery>
		} else
	//*  14   19:goto            27
		{
			mAutoRequery = false;
	//   15   22:aload_0         
	//   16   23:iconst_0        
	//   17   24:putfield        #149 <Field boolean mAutoRequery>
		}
		if(cursor != null)
	//*  18   27:aload_2         
	//*  19   28:ifnull          34
			flag = true;
	//   20   31:iconst_1        
	//   21   32:istore          5
		mCursor = cursor;
	//   22   34:aload_0         
	//   23   35:aload_2         
	//   24   36:putfield        #81  <Field Cursor mCursor>
		mDataValid = flag;
	//   25   39:aload_0         
	//   26   40:iload           5
	//   27   42:putfield        #79  <Field boolean mDataValid>
		mContext = context;
	//   28   45:aload_0         
	//   29   46:aload_1         
	//   30   47:putfield        #93  <Field Context mContext>
		int j;
		if(flag)
	//*  31   50:iload           5
	//*  32   52:ifeq            68
			j = cursor.getColumnIndexOrThrow("_id");
	//   33   55:aload_2         
	//   34   56:ldc1            #151 <String "_id">
	//   35   58:invokeinterface #155 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   36   63:istore          4
		else
	//*  37   65:goto            71
			j = -1;
	//   38   68:iconst_m1       
	//   39   69:istore          4
		mRowIDColumn = j;
	//   40   71:aload_0         
	//   41   72:iload           4
	//   42   74:putfield        #118 <Field int mRowIDColumn>
		if((i & 2) == 2)
	//*  43   77:iload_3         
	//*  44   78:iconst_2        
	//*  45   79:iand            
	//*  46   80:iconst_2        
	//*  47   81:icmpne          111
		{
			mChangeObserver = new ChangeObserver();
	//   48   84:aload_0         
	//   49   85:new             #10  <Class CursorAdapter$ChangeObserver>
	//   50   88:dup             
	//   51   89:aload_0         
	//   52   90:invokespecial   #158 <Method void CursorAdapter$ChangeObserver(CursorAdapter)>
	//   53   93:putfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
			mDataSetObserver = ((DataSetObserver) (new MyDataSetObserver()));
	//   54   96:aload_0         
	//   55   97:new             #13  <Class CursorAdapter$MyDataSetObserver>
	//   56  100:dup             
	//   57  101:aload_0         
	//   58  102:invokespecial   #161 <Method void CursorAdapter$MyDataSetObserver(CursorAdapter)>
	//   59  105:putfield        #163 <Field DataSetObserver mDataSetObserver>
		} else
	//*  60  108:goto            121
		{
			mChangeObserver = null;
	//   61  111:aload_0         
	//   62  112:aconst_null     
	//   63  113:putfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
			mDataSetObserver = null;
	//   64  116:aload_0         
	//   65  117:aconst_null     
	//   66  118:putfield        #163 <Field DataSetObserver mDataSetObserver>
		}
		if(flag)
	//*  67  121:iload           5
	//*  68  123:ifeq            160
		{
			if(mChangeObserver != null)
	//*  69  126:aload_0         
	//*  70  127:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  71  130:ifnull          143
				cursor.registerContentObserver(((ContentObserver) (mChangeObserver)));
	//   72  133:aload_2         
	//   73  134:aload_0         
	//   74  135:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   75  138:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
			if(mDataSetObserver != null)
	//*  76  143:aload_0         
	//*  77  144:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  78  147:ifnull          160
				cursor.registerDataSetObserver(mDataSetObserver);
	//   79  150:aload_2         
	//   80  151:aload_0         
	//   81  152:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   82  155:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
		}
	//   83  160:return          
	}

	protected void init(Context context, Cursor cursor, boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            10
			byte0 = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore          4
		init(context, cursor, ((int) (byte0)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:iload           4
	//   11   18:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//   12   21:return          
	}

	public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		return newView(context, cursor, viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #145 <Method View newView(Context, Cursor, ViewGroup)>
	//    5    7:areturn         
	}

	public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

	protected void onContentChanged()
	{
		if(mAutoRequery && mCursor != null && !mCursor.isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field boolean mAutoRequery>
	//*   2    4:ifeq            39
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          39
	//*   6   14:aload_0         
	//*   7   15:getfield        #81  <Field Cursor mCursor>
	//*   8   18:invokeinterface #175 <Method boolean Cursor.isClosed()>
	//*   9   23:ifne            39
			mDataValid = mCursor.requery();
	//   10   26:aload_0         
	//   11   27:aload_0         
	//   12   28:getfield        #81  <Field Cursor mCursor>
	//   13   31:invokeinterface #178 <Method boolean Cursor.requery()>
	//   14   36:putfield        #79  <Field boolean mDataValid>
	//   15   39:return          
	}

	public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
	{
		if(mFilterQueryProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//*   2    4:ifnull          18
			return mFilterQueryProvider.runQuery(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    5   11:aload_1         
	//    6   12:invokeinterface #185 <Method Cursor FilterQueryProvider.runQuery(CharSequence)>
	//    7   17:areturn         
		else
			return mCursor;
	//    8   18:aload_0         
	//    9   19:getfield        #81  <Field Cursor mCursor>
	//   10   22:areturn         
	}

	public void setFilterQueryProvider(FilterQueryProvider filterqueryprovider)
	{
		mFilterQueryProvider = filterqueryprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    3    5:return          
	}

	public Cursor swapCursor(Cursor cursor)
	{
		if(cursor == mCursor)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #81  <Field Cursor mCursor>
	//*   3    5:if_acmpne       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		Cursor cursor1 = mCursor;
	//    6   10:aload_0         
	//    7   11:getfield        #81  <Field Cursor mCursor>
	//    8   14:astore_2        
		if(cursor1 != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          53
		{
			if(mChangeObserver != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  13   23:ifnull          36
				cursor1.unregisterContentObserver(((ContentObserver) (mChangeObserver)));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   17   31:invokeinterface #190 <Method void Cursor.unregisterContentObserver(ContentObserver)>
			if(mDataSetObserver != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  20   40:ifnull          53
				cursor1.unregisterDataSetObserver(mDataSetObserver);
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   24   48:invokeinterface #193 <Method void Cursor.unregisterDataSetObserver(DataSetObserver)>
		}
		mCursor = cursor;
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:putfield        #81  <Field Cursor mCursor>
		if(cursor != null)
	//*  28   58:aload_1         
	//*  29   59:ifnull          119
		{
			if(mChangeObserver != null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  32   66:ifnull          79
				cursor.registerContentObserver(((ContentObserver) (mChangeObserver)));
	//   33   69:aload_1         
	//   34   70:aload_0         
	//   35   71:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   36   74:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
			if(mDataSetObserver != null)
	//*  37   79:aload_0         
	//*  38   80:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  39   83:ifnull          96
				cursor.registerDataSetObserver(mDataSetObserver);
	//   40   86:aload_1         
	//   41   87:aload_0         
	//   42   88:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   43   91:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
			mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
	//   44   96:aload_0         
	//   45   97:aload_1         
	//   46   98:ldc1            #151 <String "_id">
	//   47  100:invokeinterface #155 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   48  105:putfield        #118 <Field int mRowIDColumn>
			mDataValid = true;
	//   49  108:aload_0         
	//   50  109:iconst_1        
	//   51  110:putfield        #79  <Field boolean mDataValid>
			notifyDataSetChanged();
	//   52  113:aload_0         
	//   53  114:invokevirtual   #196 <Method void notifyDataSetChanged()>
			return cursor1;
	//   54  117:aload_2         
	//   55  118:areturn         
		} else
		{
			mRowIDColumn = -1;
	//   56  119:aload_0         
	//   57  120:iconst_m1       
	//   58  121:putfield        #118 <Field int mRowIDColumn>
			mDataValid = false;
	//   59  124:aload_0         
	//   60  125:iconst_0        
	//   61  126:putfield        #79  <Field boolean mDataValid>
			notifyDataSetInvalidated();
	//   62  129:aload_0         
	//   63  130:invokevirtual   #199 <Method void notifyDataSetInvalidated()>
			return cursor1;
	//   64  133:aload_2         
	//   65  134:areturn         
		}
	}

	public static final int FLAG_AUTO_REQUERY = 1;
	public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
	protected boolean mAutoRequery;
	protected ChangeObserver mChangeObserver;
	protected Context mContext;
	protected Cursor mCursor;
	protected CursorFilter mCursorFilter;
	protected DataSetObserver mDataSetObserver;
	protected boolean mDataValid;
	protected FilterQueryProvider mFilterQueryProvider;
	protected int mRowIDColumn;
}
