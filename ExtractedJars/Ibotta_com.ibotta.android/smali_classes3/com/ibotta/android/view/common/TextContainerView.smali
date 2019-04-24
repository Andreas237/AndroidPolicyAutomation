.class public Lcom/ibotta/android/view/common/TextContainerView;
.super Landroid/widget/LinearLayout;
.source "TextContainerView.java"


# instance fields
.field protected autoLinkBody:Z

.field protected forFlyUp:Z

.field protected ivDivider:Landroid/widget/ImageView;

.field protected ivHeaderIcon:Landroid/widget/ImageView;

.field protected llBody:Landroid/widget/LinearLayout;

.field protected llHeader:Landroid/widget/LinearLayout;

.field protected llHeaderControls:Landroid/widget/LinearLayout;

.field protected llTextContainer:Landroid/widget/LinearLayout;

.field protected padBottom:I

.field protected padLargeForFlyUp:Z

.field protected padLeft:I

.field protected padRight:I

.field protected padTop:I

.field protected psvSpinner:Lcom/ibotta/android/view/ProgressSpinnerView;

.field protected tvBody:Landroid/widget/TextView;

.field protected tvHeader:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/common/TextContainerView;->inflateContent(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/view/common/TextContainerView;->inflateContent(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private inflateContent(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    const/4 v0, 0x1

    .line 120
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/TextContainerView;->setOrientation(I)V

    const-string v1, "layout_inflater"

    .line 122
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    const v2, 0x7f0c01dd

    .line 123
    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v2, 0x7f09030d

    .line 125
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->llHeader:Landroid/widget/LinearLayout;

    const v2, 0x7f09030e

    .line 126
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->llHeaderControls:Landroid/widget/LinearLayout;

    const v2, 0x7f0902a0

    .line 127
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivDivider:Landroid/widget/ImageView;

    const v2, 0x7f090331

    .line 128
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->llTextContainer:Landroid/widget/LinearLayout;

    const v2, 0x7f0902ab

    .line 129
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivHeaderIcon:Landroid/widget/ImageView;

    const v2, 0x7f09052d

    .line 130
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvHeader:Landroid/widget/TextView;

    const v2, 0x7f0902fe

    .line 131
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->llBody:Landroid/widget/LinearLayout;

    const v2, 0x7f0904fd

    .line 132
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    const v2, 0x7f0903bc

    .line 133
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TextContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/ProgressSpinnerView;

    iput-object v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->psvSpinner:Lcom/ibotta/android/view/ProgressSpinnerView;

    if-eqz p2, :cond_8

    .line 136
    sget-object v2, Lcom/ibotta/android/R$styleable;->TextContainerView:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v2, 0x4

    const/4 v3, -0x1

    .line 138
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 140
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    const/4 v5, 0x5

    .line 141
    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 143
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 144
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/4 v6, 0x2

    .line 146
    invoke-virtual {p2, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    .line 148
    invoke-virtual {p2, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lcom/ibotta/android/view/common/TextContainerView;->forFlyUp:Z

    const/4 v9, 0x6

    .line 149
    invoke-virtual {p2, v9, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLargeForFlyUp:Z

    .line 150
    invoke-virtual {p2, v8, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/ibotta/android/view/common/TextContainerView;->autoLinkBody:Z

    .line 152
    iget-object p2, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivHeaderIcon:Landroid/widget/ImageView;

    const/16 v9, 0x8

    invoke-virtual {p2, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eq v2, v3, :cond_0

    .line 154
    iget-object p2, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivHeaderIcon:Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 155
    iget-object p2, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivHeaderIcon:Landroid/widget/ImageView;

    invoke-virtual {p2, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 159
    :cond_0
    iget p2, v4, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x0

    if-ne p2, v7, :cond_1

    .line 160
    iget-object p2, v4, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 161
    :cond_1
    iget p2, v4, Landroid/util/TypedValue;->type:I

    if-ne p2, v0, :cond_2

    .line 162
    iget p2, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    move-object p2, v2

    .line 166
    :goto_0
    iget v4, v5, Landroid/util/TypedValue;->type:I

    if-ne v4, v7, :cond_3

    .line 167
    iget-object p1, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 168
    :cond_3
    iget v4, v5, Landroid/util/TypedValue;->type:I

    if-ne v4, v0, :cond_4

    .line 169
    iget v0, v5, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v2

    .line 172
    :goto_1
    iget-boolean v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->forFlyUp:Z

    if-eqz v0, :cond_6

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvHeader:Landroid/widget/TextView;

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TextContainerView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0700e4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    int-to-float v4, v4

    .line 174
    invoke-virtual {v0, v8, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivDivider:Landroid/widget/ImageView;

    const v4, 0x7f080170

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 181
    iget-boolean v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLargeForFlyUp:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TextContainerView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0701f6

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    iput v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->padRight:I

    .line 182
    iput v8, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLeft:I

    .line 183
    iput v8, p0, Lcom/ibotta/android/view/common/TextContainerView;->padTop:I

    .line 184
    iput v8, p0, Lcom/ibotta/android/view/common/TextContainerView;->padBottom:I

    goto :goto_3

    .line 187
    :cond_6
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLeft:I

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->padTop:I

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->padRight:I

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->padBottom:I

    .line 193
    :goto_3
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->llHeader:Landroid/widget/LinearLayout;

    iget v4, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLeft:I

    iget v5, p0, Lcom/ibotta/android/view/common/TextContainerView;->padTop:I

    iget v9, p0, Lcom/ibotta/android/view/common/TextContainerView;->padRight:I

    iget v10, p0, Lcom/ibotta/android/view/common/TextContainerView;->padBottom:I

    invoke-virtual {v0, v4, v5, v9, v10}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    iget v4, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLeft:I

    iget v5, p0, Lcom/ibotta/android/view/common/TextContainerView;->padTop:I

    iget v9, p0, Lcom/ibotta/android/view/common/TextContainerView;->padRight:I

    iget v10, p0, Lcom/ibotta/android/view/common/TextContainerView;->padBottom:I

    invoke-virtual {v0, v4, v5, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 196
    iget-boolean v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->autoLinkBody:Z

    if-eqz v0, :cond_7

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    goto :goto_4

    .line 199
    :cond_7
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    .line 202
    :goto_4
    invoke-virtual {p0, p2}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    if-eq v6, v3, :cond_8

    .line 206
    invoke-virtual {v1, v6, v2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 207
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/TextContainerView;->addBodyChild(Landroid/view/View;)V

    :cond_8
    return-void
.end method


# virtual methods
.method public addBodyChild(Landroid/view/View;)V
    .locals 5

    .line 105
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TextContainerView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701e8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 110
    :goto_0
    iget v2, p0, Lcom/ibotta/android/view/common/TextContainerView;->padLeft:I

    iget v3, p0, Lcom/ibotta/android/view/common/TextContainerView;->padRight:I

    iget v4, p0, Lcom/ibotta/android/view/common/TextContainerView;->padBottom:I

    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/view/common/TextContainerView;->llBody:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addHeaderChild(Landroid/view/View;)V
    .locals 3

    .line 98
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x15

    .line 99
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/view/common/TextContainerView;->llHeaderControls:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getBodyChild(I)Landroid/view/View;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->llTextContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getTextContainer()Landroid/widget/LinearLayout;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->llTextContainer:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public setBody(I)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public setBodyHtml(Ljava/lang/String;)V
    .locals 3

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvBody:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public setHeader(I)V
    .locals 1

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TextContainerView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvHeader:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setHeader(Ljava/lang/String;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvHeader:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setHeaderHtml(Ljava/lang/String;)V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->tvHeader:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    sget-object v1, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method

.method public setHeaderIcon(I)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivHeaderIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextContainerView;->ivHeaderIcon:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public setLoading(Z)V
    .locals 3

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->llBody:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextContainerView;->psvSpinner:Lcom/ibotta/android/view/ProgressSpinnerView;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/ProgressSpinnerView;->setVisibility(I)V

    return-void
.end method
