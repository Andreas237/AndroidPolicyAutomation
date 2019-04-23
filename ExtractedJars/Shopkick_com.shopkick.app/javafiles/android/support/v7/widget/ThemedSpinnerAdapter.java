// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

public interface ThemedSpinnerAdapter
	extends SpinnerAdapter
{
	public static final class Helper
	{

		public LayoutInflater getDropDownViewInflater()
		{
			LayoutInflater layoutinflater = mDropDownInflater;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field LayoutInflater mDropDownInflater>
		//    2    4:astore_1        
			if(layoutinflater != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          11
				return layoutinflater;
		//    5    9:aload_1         
		//    6   10:areturn         
			else
				return mInflater;
		//    7   11:aload_0         
		//    8   12:getfield        #28  <Field LayoutInflater mInflater>
		//    9   15:areturn         
		}

		public android.content.res.Resources.Theme getDropDownViewTheme()
		{
			LayoutInflater layoutinflater = mDropDownInflater;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field LayoutInflater mDropDownInflater>
		//    2    4:astore_1        
			if(layoutinflater == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return layoutinflater.getContext().getTheme();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #42  <Method Context LayoutInflater.getContext()>
		//    9   15:invokevirtual   #47  <Method android.content.res.Resources$Theme Context.getTheme()>
		//   10   18:areturn         
		}

		public void setDropDownViewTheme(android.content.res.Resources.Theme theme)
		{
			if(theme == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       10
			{
				mDropDownInflater = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #34  <Field LayoutInflater mDropDownInflater>
				return;
		//    5    9:return          
			}
			if(theme == mContext.getTheme())
		//*   6   10:aload_1         
		//*   7   11:aload_0         
		//*   8   12:getfield        #20  <Field Context mContext>
		//*   9   15:invokevirtual   #47  <Method android.content.res.Resources$Theme Context.getTheme()>
		//*  10   18:if_acmpne       30
			{
				mDropDownInflater = mInflater;
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #28  <Field LayoutInflater mInflater>
		//   14   26:putfield        #34  <Field LayoutInflater mDropDownInflater>
				return;
		//   15   29:return          
			} else
			{
				mDropDownInflater = LayoutInflater.from(((Context) (new ContextThemeWrapper(mContext, theme))));
		//   16   30:aload_0         
		//   17   31:new             #51  <Class ContextThemeWrapper>
		//   18   34:dup             
		//   19   35:aload_0         
		//   20   36:getfield        #20  <Field Context mContext>
		//   21   39:aload_1         
		//   22   40:invokespecial   #54  <Method void ContextThemeWrapper(Context, android.content.res.Resources$Theme)>
		//   23   43:invokestatic    #26  <Method LayoutInflater LayoutInflater.from(Context)>
		//   24   46:putfield        #34  <Field LayoutInflater mDropDownInflater>
				return;
		//   25   49:return          
			}
		}

		private final Context mContext;
		private LayoutInflater mDropDownInflater;
		private final LayoutInflater mInflater;

		public Helper(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mContext = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Context mContext>
			mInflater = LayoutInflater.from(context);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #26  <Method LayoutInflater LayoutInflater.from(Context)>
		//    8   14:putfield        #28  <Field LayoutInflater mInflater>
		//    9   17:return          
		}
	}


	public abstract android.content.res.Resources.Theme getDropDownViewTheme();

	public abstract void setDropDownViewTheme(android.content.res.Resources.Theme theme);
}
