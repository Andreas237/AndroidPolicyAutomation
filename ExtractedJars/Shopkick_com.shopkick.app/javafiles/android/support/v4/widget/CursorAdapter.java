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
			CursorAdapter cursoradapter = CursorAdapter.this;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:astore_1        
			cursoradapter.mDataValid = true;
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:putfield        #22  <Field boolean CursorAdapter.mDataValid>
			cursoradapter.notifyDataSetChanged();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #25  <Method void CursorAdapter.notifyDataSetChanged()>
		//    8   14:return          
		}

		public void onInvalidated()
		{
			CursorAdapter cursoradapter = CursorAdapter.this;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:astore_1        
			cursoradapter.mDataValid = false;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:putfield        #22  <Field boolean CursorAdapter.mDataValid>
			cursoradapter.notifyDataSetInvalidated();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #29  <Method void CursorAdapter.notifyDataSetInvalidated()>
		//    8   14:return          
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
		if(mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            23
		{
			Cursor cursor = mCursor;
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Cursor mCursor>
	//    5   11:astore_1        
			if(cursor != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
				return cursor.getCount();
	//    8   16:aload_1         
	//    9   17:invokeinterface #83  <Method int Cursor.getCount()>
	//   10   22:ireturn         
		}
		return 0;
	//   11   23:iconst_0        
	//   12   24:ireturn         
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
		if(mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            29
		{
			Cursor cursor = mCursor;
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Cursor mCursor>
	//    5   11:astore_2        
			if(cursor != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          29
			{
				cursor.moveToPosition(i);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//   11   23:pop             
				return ((Object) (mCursor));
	//   12   24:aload_0         
	//   13   25:getfield        #81  <Field Cursor mCursor>
	//   14   28:areturn         
			}
		}
		return ((Object) (null));
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	public long getItemId(int i)
	{
		if(mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            42
		{
			Cursor cursor = mCursor;
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Cursor mCursor>
	//    5   11:astore_2        
			if(cursor != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          42
				if(cursor.moveToPosition(i))
	//*   8   16:aload_2         
	//*   9   17:iload_1         
	//*  10   18:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*  11   23:ifeq            40
					return mCursor.getLong(mRowIDColumn);
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field Cursor mCursor>
	//   14   30:aload_0         
	//   15   31:getfield        #118 <Field int mRowIDColumn>
	//   16   34:invokeinterface #121 <Method long Cursor.getLong(int)>
	//   17   39:lreturn         
				else
					return 0L;
	//   18   40:lconst_0        
	//   19   41:lreturn         
		}
		return 0L;
	//   20   42:lconst_0        
	//   21   43:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		if(mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            92
		{
			if(mCursor.moveToPosition(i))
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:iload_1         
	//*   6   12:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*   7   17:ifeq            59
			{
				View view1 = view;
	//    8   20:aload_2         
	//    9   21:astore          4
				if(view == null)
	//*  10   23:aload_2         
	//*  11   24:ifnonnull       42
					view1 = newView(mContext, mCursor, viewgroup);
	//   12   27:aload_0         
	//   13   28:aload_0         
	//   14   29:getfield        #93  <Field Context mContext>
	//   15   32:aload_0         
	//   16   33:getfield        #81  <Field Cursor mCursor>
	//   17   36:aload_3         
	//   18   37:invokevirtual   #125 <Method View newView(Context, Cursor, ViewGroup)>
	//   19   40:astore          4
				bindView(view1, mContext, mCursor);
	//   20   42:aload_0         
	//   21   43:aload           4
	//   22   45:aload_0         
	//   23   46:getfield        #93  <Field Context mContext>
	//   24   49:aload_0         
	//   25   50:getfield        #81  <Field Cursor mCursor>
	//   26   53:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
				return view1;
	//   27   56:aload           4
	//   28   58:areturn         
			} else
			{
				view = ((View) (new StringBuilder()));
	//   29   59:new             #127 <Class StringBuilder>
	//   30   62:dup             
	//   31   63:invokespecial   #128 <Method void StringBuilder()>
	//   32   66:astore_2        
				((StringBuilder) (view)).append("couldn't move cursor to position ");
	//   33   67:aload_2         
	//   34   68:ldc1            #130 <String "couldn't move cursor to position ">
	//   35   70:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   36   73:pop             
				((StringBuilder) (view)).append(i);
	//   37   74:aload_2         
	//   38   75:iload_1         
	//   39   76:invokevirtual   #137 <Method StringBuilder StringBuilder.append(int)>
	//   40   79:pop             
				throw new IllegalStateException(((StringBuilder) (view)).toString());
	//   41   80:new             #139 <Class IllegalStateException>
	//   42   83:dup             
	//   43   84:aload_2         
	//   44   85:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   45   88:invokespecial   #143 <Method void IllegalStateException(String)>
	//   46   91:athrow          
			}
		} else
		{
			throw new IllegalStateException("this should only be called when the cursor is valid");
	//   47   92:new             #139 <Class IllegalStateException>
	//   48   95:dup             
	//   49   96:ldc1            #145 <String "this should only be called when the cursor is valid">
	//   50   98:invokespecial   #143 <Method void IllegalStateException(String)>
	//   51  101:athrow          
		}
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
	//*  68  123:ifeq            158
		{
			context = ((Context) (mChangeObserver));
	//   69  126:aload_0         
	//   70  127:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   71  130:astore_1        
			if(context != null)
	//*  72  131:aload_1         
	//*  73  132:ifnull          142
				cursor.registerContentObserver(((ContentObserver) (context)));
	//   74  135:aload_2         
	//   75  136:aload_1         
	//   76  137:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
			context = ((Context) (mDataSetObserver));
	//   77  142:aload_0         
	//   78  143:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   79  146:astore_1        
			if(context != null)
	//*  80  147:aload_1         
	//*  81  148:ifnull          158
				cursor.registerDataSetObserver(((DataSetObserver) (context)));
	//   82  151:aload_2         
	//   83  152:aload_1         
	//   84  153:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
		}
	//   85  158:return          
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
	//    4    4:invokevirtual   #125 <Method View newView(Context, Cursor, ViewGroup)>
	//    5    7:areturn         
	}

	public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

	protected void onContentChanged()
	{
		if(mAutoRequery)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field boolean mAutoRequery>
	//*   2    4:ifeq            38
		{
			Cursor cursor = mCursor;
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Cursor mCursor>
	//    5   11:astore_1        
			if(cursor != null && !cursor.isClosed())
	//*   6   12:aload_1         
	//*   7   13:ifnull          38
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #175 <Method boolean Cursor.isClosed()>
	//*  10   22:ifne            38
				mDataValid = mCursor.requery();
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field Cursor mCursor>
	//   14   30:invokeinterface #178 <Method boolean Cursor.requery()>
	//   15   35:putfield        #79  <Field boolean mDataValid>
		}
	//   16   38:return          
	}

	public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
	{
		FilterQueryProvider filterqueryprovider = mFilterQueryProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    2    4:astore_2        
		if(filterqueryprovider != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return filterqueryprovider.runQuery(charsequence);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #185 <Method Cursor FilterQueryProvider.runQuery(CharSequence)>
	//    8   16:areturn         
		else
			return mCursor;
	//    9   17:aload_0         
	//   10   18:getfield        #81  <Field Cursor mCursor>
	//   11   21:areturn         
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
		Cursor cursor1 = mCursor;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Cursor mCursor>
	//    2    4:astore_2        
		if(cursor == cursor1)
	//*   3    5:aload_1         
	//*   4    6:aload_2         
	//*   5    7:if_acmpne       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(cursor1 != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          48
		{
			Object obj = ((Object) (mChangeObserver));
	//   10   16:aload_0         
	//   11   17:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   12   20:astore_3        
			if(obj != null)
	//*  13   21:aload_3         
	//*  14   22:ifnull          32
				cursor1.unregisterContentObserver(((ContentObserver) (obj)));
	//   15   25:aload_2         
	//   16   26:aload_3         
	//   17   27:invokeinterface #190 <Method void Cursor.unregisterContentObserver(ContentObserver)>
			obj = ((Object) (mDataSetObserver));
	//   18   32:aload_0         
	//   19   33:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   20   36:astore_3        
			if(obj != null)
	//*  21   37:aload_3         
	//*  22   38:ifnull          48
				cursor1.unregisterDataSetObserver(((DataSetObserver) (obj)));
	//   23   41:aload_2         
	//   24   42:aload_3         
	//   25   43:invokeinterface #193 <Method void Cursor.unregisterDataSetObserver(DataSetObserver)>
		}
		mCursor = cursor;
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:putfield        #81  <Field Cursor mCursor>
		if(cursor != null)
	//*  29   53:aload_1         
	//*  30   54:ifnull          112
		{
			Object obj1 = ((Object) (mChangeObserver));
	//   31   57:aload_0         
	//   32   58:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   33   61:astore_3        
			if(obj1 != null)
	//*  34   62:aload_3         
	//*  35   63:ifnull          73
				cursor.registerContentObserver(((ContentObserver) (obj1)));
	//   36   66:aload_1         
	//   37   67:aload_3         
	//   38   68:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
			obj1 = ((Object) (mDataSetObserver));
	//   39   73:aload_0         
	//   40   74:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   41   77:astore_3        
			if(obj1 != null)
	//*  42   78:aload_3         
	//*  43   79:ifnull          89
				cursor.registerDataSetObserver(((DataSetObserver) (obj1)));
	//   44   82:aload_1         
	//   45   83:aload_3         
	//   46   84:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
			mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:ldc1            #151 <String "_id">
	//   50   93:invokeinterface #155 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   51   98:putfield        #118 <Field int mRowIDColumn>
			mDataValid = true;
	//   52  101:aload_0         
	//   53  102:iconst_1        
	//   54  103:putfield        #79  <Field boolean mDataValid>
			notifyDataSetChanged();
	//   55  106:aload_0         
	//   56  107:invokevirtual   #196 <Method void notifyDataSetChanged()>
			return cursor1;
	//   57  110:aload_2         
	//   58  111:areturn         
		} else
		{
			mRowIDColumn = -1;
	//   59  112:aload_0         
	//   60  113:iconst_m1       
	//   61  114:putfield        #118 <Field int mRowIDColumn>
			mDataValid = false;
	//   62  117:aload_0         
	//   63  118:iconst_0        
	//   64  119:putfield        #79  <Field boolean mDataValid>
			notifyDataSetInvalidated();
	//   65  122:aload_0         
	//   66  123:invokevirtual   #199 <Method void notifyDataSetInvalidated()>
			return cursor1;
	//   67  126:aload_2         
	//   68  127:areturn         
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
