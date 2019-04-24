// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.irobot.core.SkuType;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.model:
//			m

public class RobotTypeListItem
	implements Parcelable, m
{

	public RobotTypeListItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method String Parcel.readString()>
	//    5    9:putfield        #38  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #36  <Method String Parcel.readString()>
	//    9   17:putfield        #40  <Field String b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #44  <Method int Parcel.readInt()>
	//   13   25:putfield        #46  <Field int c>
		d = (SkuType)parcel.readSerializable();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #50  <Method java.io.Serializable Parcel.readSerializable()>
	//   17   33:checkcast       #52  <Class SkuType>
	//   18   36:putfield        #54  <Field SkuType d>
	//   19   39:return          
	}

	public RobotTypeListItem(String s, String s1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a(s, s1, i, SkuType.Unknown);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:getstatic       #58  <Field SkuType SkuType.Unknown>
	//    7   11:invokespecial   #61  <Method void a(String, String, int, SkuType)>
	//    8   14:return          
	}

	public RobotTypeListItem(String s, String s1, int i, SkuType skutype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a(s, s1, i, skutype);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #61  <Method void a(String, String, int, SkuType)>
	//    8   13:return          
	}

	private void a(String s, String s1, int i, SkuType skutype)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String a>
		b = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #40  <Field String b>
		c = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #46  <Field int c>
		d = skutype;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #54  <Field SkuType d>
	//   12   21:return          
	}

	public int a()
	{
		return m.b.LIST_ITEM.ordinal();
	//    0    0:getstatic       #67  <Field m$b m$b.LIST_ITEM>
	//    1    3:invokevirtual   #70  <Method int m$b.ordinal()>
	//    2    6:ireturn         
	}

	public View a(Context context, LayoutInflater layoutinflater, View view, m.a a1)
	{
		View view1 = view;
	//    0    0:aload_3         
	//    1    1:astore          5
		if(view == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       68
		{
			view1 = view;
	//    4    7:aload_3         
	//    5    8:astore          5
			if(layoutinflater != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          68
			{
				view1 = layoutinflater.inflate(0x7f0b0138, ((android.view.ViewGroup) (null)));
	//    8   14:aload_2         
	//    9   15:ldc1            #72  <Int 0x7f0b0138>
	//   10   17:aconst_null     
	//   11   18:invokevirtual   #78  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   12   21:astore          5
				a1.a = (CustomTextView)view1.findViewById(0x7f09036b);
	//   13   23:aload           4
	//   14   25:aload           5
	//   15   27:ldc1            #79  <Int 0x7f09036b>
	//   16   29:invokevirtual   #85  <Method View View.findViewById(int)>
	//   17   32:checkcast       #87  <Class CustomTextView>
	//   18   35:putfield        #92  <Field CustomTextView m$a.a>
				a1.b = (CustomTextView)view1.findViewById(0x7f090369);
	//   19   38:aload           4
	//   20   40:aload           5
	//   21   42:ldc1            #93  <Int 0x7f090369>
	//   22   44:invokevirtual   #85  <Method View View.findViewById(int)>
	//   23   47:checkcast       #87  <Class CustomTextView>
	//   24   50:putfield        #95  <Field CustomTextView m$a.b>
				a1.c = (ImageView)view1.findViewById(0x7f09036a);
	//   25   53:aload           4
	//   26   55:aload           5
	//   27   57:ldc1            #96  <Int 0x7f09036a>
	//   28   59:invokevirtual   #85  <Method View View.findViewById(int)>
	//   29   62:checkcast       #98  <Class ImageView>
	//   30   65:putfield        #101 <Field ImageView m$a.c>
			}
		}
		context = ((Context) (context.getResources()));
	//   31   68:aload_1         
	//   32   69:invokevirtual   #107 <Method Resources Context.getResources()>
	//   33   72:astore_1        
		a1.a.setText(((CharSequence) (b())));
	//   34   73:aload           4
	//   35   75:getfield        #92  <Field CustomTextView m$a.a>
	//   36   78:aload_0         
	//   37   79:invokevirtual   #109 <Method String b()>
	//   38   82:invokevirtual   #113 <Method void CustomTextView.setText(CharSequence)>
		a1.b.setText(((CharSequence) (c())));
	//   39   85:aload           4
	//   40   87:getfield        #95  <Field CustomTextView m$a.b>
	//   41   90:aload_0         
	//   42   91:invokevirtual   #115 <Method String c()>
	//   43   94:invokevirtual   #113 <Method void CustomTextView.setText(CharSequence)>
		a1.c.setImageDrawable(((Resources) (context)).getDrawable(d()));
	//   44   97:aload           4
	//   45   99:getfield        #101 <Field ImageView m$a.c>
	//   46  102:aload_1         
	//   47  103:aload_0         
	//   48  104:invokevirtual   #117 <Method int d()>
	//   49  107:invokevirtual   #123 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   50  110:invokevirtual   #127 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		return view1;
	//   51  113:aload           5
	//   52  115:areturn         
	}

	public String b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String a>
	//    2    4:areturn         
	}

	public String c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String b>
	//    2    4:areturn         
	}

	public int d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int c>
	//    2    4:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public SkuType e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field SkuType d>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field String a>
	//    3    5:invokevirtual   #136 <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field String b>
	//    7   13:invokevirtual   #136 <Method void Parcel.writeString(String)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #46  <Field int c>
	//   11   21:invokevirtual   #140 <Method void Parcel.writeInt(int)>
		parcel.writeSerializable(((java.io.Serializable) (d)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #54  <Field SkuType d>
	//   15   29:invokevirtual   #144 <Method void Parcel.writeSerializable(java.io.Serializable)>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotTypeListItem a(Parcel parcel)
		{
			return new RobotTypeListItem(parcel);
		//    0    0:new             #9   <Class RobotTypeListItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotTypeListItem(Parcel)>
		//    4    8:areturn         
		}

		public RobotTypeListItem[] a(int i)
		{
			return new RobotTypeListItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotTypeListItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotTypeListItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotTypeListItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private int c;
	private SkuType d;

	static 
	{
	//    0    0:new             #10  <Class RobotTypeListItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void RobotTypeListItem$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
