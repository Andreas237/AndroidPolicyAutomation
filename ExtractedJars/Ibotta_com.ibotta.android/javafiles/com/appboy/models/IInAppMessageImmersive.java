// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.enums.inappmessage.TextAlign;
import java.util.List;

// Referenced classes of package com.appboy.models:
//			IInAppMessage, MessageButton

public interface IInAppMessageImmersive
	extends IInAppMessage
{

	public abstract int getCloseButtonColor();

	public abstract Integer getFrameColor();

	public abstract String getHeader();

	public abstract TextAlign getHeaderTextAlign();

	public abstract int getHeaderTextColor();

	public abstract ImageStyle getImageStyle();

	public abstract List getMessageButtons();

	public abstract boolean logButtonClick(MessageButton messagebutton);

	public abstract void setCloseButtonColor(int i);

	public abstract void setFrameColor(Integer integer);

	public abstract void setHeader(String s);

	public abstract void setHeaderTextAlign(TextAlign textalign);

	public abstract void setHeaderTextColor(int i);

	public abstract void setImageStyle(ImageStyle imagestyle);

	public abstract void setMessageButtons(List list);
}
