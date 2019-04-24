// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			ResourceCursorAdapter

public class SimpleCursorAdapter extends ResourceCursorAdapter
{
	public static interface CursorToStringConverter
	{

		public abstract CharSequence convertToString(Cursor cursor);
	}

	public static interface ViewBinder
	{

		public abstract boolean setViewValue(View view, Cursor cursor, int i);
	}


	public SimpleCursorAdapter(Context context, int i, Cursor cursor, String as[], int ai[])
	{
		super(context, i, cursor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #31  <Method void ResourceCursorAdapter(Context, int, Cursor)>
		mStringConversionColumn = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #33  <Field int mStringConversionColumn>
		mTo = ai;
	//    8   12:aload_0         
	//    9   13:aload           5
	//   10   15:putfield        #35  <Field int[] mTo>
		mOriginalFrom = as;
	//   11   18:aload_0         
	//   12   19:aload           4
	//   13   21:putfield        #37  <Field String[] mOriginalFrom>
		findColumns(cursor, as);
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:aload           4
	//   17   28:invokespecial   #41  <Method void findColumns(Cursor, String[])>
	//   18   31:return          
	}

	public SimpleCursorAdapter(Context context, int i, Cursor cursor, String as[], int ai[], int j)
	{
		super(context, i, cursor, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           6
	//    5    6:invokespecial   #47  <Method void ResourceCursorAdapter(Context, int, Cursor, int)>
		mStringConversionColumn = -1;
	//    6    9:aload_0         
	//    7   10:iconst_m1       
	//    8   11:putfield        #33  <Field int mStringConversionColumn>
		mTo = ai;
	//    9   14:aload_0         
	//   10   15:aload           5
	//   11   17:putfield        #35  <Field int[] mTo>
		mOriginalFrom = as;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #37  <Field String[] mOriginalFrom>
		findColumns(cursor, as);
	//   15   26:aload_0         
	//   16   27:aload_3         
	//   17   28:aload           4
	//   18   30:invokespecial   #41  <Method void findColumns(Cursor, String[])>
	//   19   33:return          
	}

	private void findColumns(Cursor cursor, String as[])
	{
		if(cursor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          63
		{
			int j = as.length;
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:istore          4
			if(mFrom == null || mFrom.length != j)
	//*   5    8:aload_0         
	//*   6    9:getfield        #49  <Field int[] mFrom>
	//*   7   12:ifnull          25
	//*   8   15:aload_0         
	//*   9   16:getfield        #49  <Field int[] mFrom>
	//*  10   19:arraylength     
	//*  11   20:iload           4
	//*  12   22:icmpeq          33
				mFrom = new int[j];
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:newarray        int[]
	//   16   30:putfield        #49  <Field int[] mFrom>
			for(int i = 0; i < j; i++)
	//*  17   33:iconst_0        
	//*  18   34:istore_3        
	//*  19   35:iload_3         
	//*  20   36:iload           4
	//*  21   38:icmpge          68
				mFrom[i] = cursor.getColumnIndexOrThrow(as[i]);
	//   22   41:aload_0         
	//   23   42:getfield        #49  <Field int[] mFrom>
	//   24   45:iload_3         
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:iload_3         
	//   28   49:aaload          
	//   29   50:invokeinterface #55  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   30   55:iastore         

	//   31   56:iload_3         
	//   32   57:iconst_1        
	//   33   58:iadd            
	//   34   59:istore_3        
		} else
	//*  35   60:goto            35
		{
			mFrom = null;
	//   36   63:aload_0         
	//   37   64:aconst_null     
	//   38   65:putfield        #49  <Field int[] mFrom>
		}
	//   39   68:return          
	}

	public void bindView(View view, Context context, Cursor cursor)
	{
		ViewBinder viewbinder = mViewBinder;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
	//    2    4:astore          8
		int j = mTo.length;
	//    3    6:aload_0         
	//    4    7:getfield        #35  <Field int[] mTo>
	//    5   10:arraylength     
	//    6   11:istore          5
		int ai[] = mFrom;
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field int[] mFrom>
	//    9   17:astore          9
		int ai1[] = mTo;
	//   10   19:aload_0         
	//   11   20:getfield        #35  <Field int[] mTo>
	//   12   23:astore          10
		int i = 0;
	//   13   25:iconst_0        
	//   14   26:istore          4
		while(i < j) 
	//*  15   28:iload           4
	//*  16   30:iload           5
	//*  17   32:icmpge          189
		{
			View view1 = view.findViewById(ai1[i]);
	//   18   35:aload_1         
	//   19   36:aload           10
	//   20   38:iload           4
	//   21   40:iaload          
	//   22   41:invokevirtual   #65  <Method View View.findViewById(int)>
	//   23   44:astore          11
			if(view1 == null)
				continue;
	//   24   46:aload           11
	//   25   48:ifnull          120
			boolean flag;
			if(viewbinder != null)
	//*  26   51:aload           8
	//*  27   53:ifnull          190
				flag = viewbinder.setViewValue(view1, cursor, ai[i]);
	//   28   56:aload           8
	//   29   58:aload           11
	//   30   60:aload_3         
	//   31   61:aload           9
	//   32   63:iload           4
	//   33   65:iaload          
	//   34   66:invokeinterface #69  <Method boolean SimpleCursorAdapter$ViewBinder.setViewValue(View, Cursor, int)>
	//   35   71:istore          6
			else
	//*  36   73:iload           6
	//*  37   75:ifne            120
	//*  38   78:aload_3         
	//*  39   79:aload           9
	//*  40   81:iload           4
	//*  41   83:iaload          
	//*  42   84:invokeinterface #73  <Method String Cursor.getString(int)>
	//*  43   89:astore          7
	//*  44   91:aload           7
	//*  45   93:astore_2        
	//*  46   94:aload           7
	//*  47   96:ifnonnull       102
	//*  48   99:ldc1            #75  <String "">
	//*  49  101:astore_2        
	//*  50  102:aload           11
	//*  51  104:instanceof      #77  <Class TextView>
	//*  52  107:ifeq            129
	//*  53  110:aload_0         
	//*  54  111:aload           11
	//*  55  113:checkcast       #77  <Class TextView>
	//*  56  116:aload_2         
	//*  57  117:invokevirtual   #81  <Method void setViewText(TextView, String)>
	//*  58  120:iload           4
	//*  59  122:iconst_1        
	//*  60  123:iadd            
	//*  61  124:istore          4
	//*  62  126:goto            28
	//*  63  129:aload           11
	//*  64  131:instanceof      #83  <Class ImageView>
	//*  65  134:ifeq            150
	//*  66  137:aload_0         
	//*  67  138:aload           11
	//*  68  140:checkcast       #83  <Class ImageView>
	//*  69  143:aload_2         
	//*  70  144:invokevirtual   #87  <Method void setViewImage(ImageView, String)>
	//*  71  147:goto            120
	//*  72  150:new             #89  <Class IllegalStateException>
	//*  73  153:dup             
	//*  74  154:new             #91  <Class StringBuilder>
	//*  75  157:dup             
	//*  76  158:invokespecial   #94  <Method void StringBuilder()>
	//*  77  161:aload           11
	//*  78  163:invokevirtual   #100 <Method Class Object.getClass()>
	//*  79  166:invokevirtual   #106 <Method String Class.getName()>
	//*  80  169:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//*  81  172:ldc1            #112 <String " is not a ">
	//*  82  174:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//*  83  177:ldc1            #114 <String " view that can be bounds by this SimpleCursorAdapter">
	//*  84  179:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//*  85  182:invokevirtual   #117 <Method String StringBuilder.toString()>
	//*  86  185:invokespecial   #120 <Method void IllegalStateException(String)>
	//*  87  188:athrow          
	//*  88  189:return          
				flag = false;
	//   89  190:iconst_0        
	//   90  191:istore          6
			if(!flag)
			{
				String s = cursor.getString(ai[i]);
				context = ((Context) (s));
				if(s == null)
					context = "";
				if(view1 instanceof TextView)
					setViewText((TextView)view1, ((String) (context)));
				else
				if(view1 instanceof ImageView)
					setViewImage((ImageView)view1, ((String) (context)));
				else
					throw new IllegalStateException((new StringBuilder()).append(((Object) (view1)).getClass().getName()).append(" is not a ").append(" view that can be bounds by this SimpleCursorAdapter").toString());
			}
			i++;
		}
	//*  91  193:goto            73
	}

	public void changeCursorAndColumns(Cursor cursor, String as[], int ai[])
	{
		mOriginalFrom = as;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #37  <Field String[] mOriginalFrom>
		mTo = ai;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #35  <Field int[] mTo>
		findColumns(cursor, mOriginalFrom);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #37  <Field String[] mOriginalFrom>
	//   10   16:invokespecial   #41  <Method void findColumns(Cursor, String[])>
		super.changeCursor(cursor);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #126 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
	//   14   24:return          
	}

	public CharSequence convertToString(Cursor cursor)
	{
		if(mCursorToStringConverter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
	//*   2    4:ifnull          18
			return mCursorToStringConverter.convertToString(cursor);
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
	//    5   11:aload_1         
	//    6   12:invokeinterface #132 <Method CharSequence SimpleCursorAdapter$CursorToStringConverter.convertToString(Cursor)>
	//    7   17:areturn         
		if(mStringConversionColumn > -1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field int mStringConversionColumn>
	//*  10   22:iconst_m1       
	//*  11   23:icmple          37
			return ((CharSequence) (cursor.getString(mStringConversionColumn)));
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #33  <Field int mStringConversionColumn>
	//   15   31:invokeinterface #73  <Method String Cursor.getString(int)>
	//   16   36:areturn         
		else
			return super.convertToString(cursor);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokespecial   #133 <Method CharSequence ResourceCursorAdapter.convertToString(Cursor)>
	//   20   42:areturn         
	}

	public CursorToStringConverter getCursorToStringConverter()
	{
		return mCursorToStringConverter;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
	//    2    4:areturn         
	}

	public int getStringConversionColumn()
	{
		return mStringConversionColumn;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mStringConversionColumn>
	//    2    4:ireturn         
	}

	public ViewBinder getViewBinder()
	{
		return mViewBinder;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
	//    2    4:areturn         
	}

	public void setCursorToStringConverter(CursorToStringConverter cursortostringconverter)
	{
		mCursorToStringConverter = cursortostringconverter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
	//    3    5:return          
	}

	public void setStringConversionColumn(int i)
	{
		mStringConversionColumn = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int mStringConversionColumn>
	//    3    5:return          
	}

	public void setViewBinder(ViewBinder viewbinder)
	{
		mViewBinder = viewbinder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
	//    3    5:return          
	}

	public void setViewImage(ImageView imageview, String s)
	{
		try
		{
			imageview.setImageResource(Integer.parseInt(s));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #152 <Method int Integer.parseInt(String)>
	//    3    5:invokevirtual   #155 <Method void ImageView.setImageResource(int)>
			return;
	//    4    8:return          
		}
		catch(NumberFormatException numberformatexception)
	//*   5    9:astore_3        
		{
			imageview.setImageURI(Uri.parse(s));
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokestatic    #161 <Method Uri Uri.parse(String)>
	//    9   15:invokevirtual   #165 <Method void ImageView.setImageURI(Uri)>
		}
	//   10   18:return          
	}

	public void setViewText(TextView textview, String s)
	{
		textview.setText(((CharSequence) (s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #169 <Method void TextView.setText(CharSequence)>
	//    3    5:return          
	}

	public Cursor swapCursor(Cursor cursor)
	{
		findColumns(cursor, mOriginalFrom);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field String[] mOriginalFrom>
	//    4    6:invokespecial   #41  <Method void findColumns(Cursor, String[])>
		return super.swapCursor(cursor);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #173 <Method Cursor ResourceCursorAdapter.swapCursor(Cursor)>
	//    8   14:areturn         
	}

	private CursorToStringConverter mCursorToStringConverter;
	protected int mFrom[];
	String mOriginalFrom[];
	private int mStringConversionColumn;
	protected int mTo[];
	private ViewBinder mViewBinder;
}
