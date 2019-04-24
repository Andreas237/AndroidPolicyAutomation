.class public Lo/byf;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/ImageView;

.field private b:Landroid/content/Context;

.field c:Landroid/view/View;

.field d:Landroid/view/View;

.field private e:I

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 53
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byf;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    invoke-direct {p0, p1, p2}, Lo/byf;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 63
    invoke-direct {p0, p1, p2}, Lo/byf;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;)I
    .locals 12
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 244
    .line 246
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 248
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 250
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 244
    :goto_0
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 254
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 256
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 258
    invoke-virtual {p1, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 261
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Debug:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {v4, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmap(Landroid/graphics/Bitmap;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v6

    .line 262
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v6, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v0

    iput v0, p0, Lo/byf;->e:I

    .line 263
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v6, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v0

    iput v0, p0, Lo/byf;->h:I

    .line 265
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v6, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v7

    .line 266
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v6, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v8

    .line 268
    const/4 v0, 0x3

    new-array v9, v0, [F

    .line 269
    const/4 v0, 0x3

    new-array v10, v0, [F

    .line 271
    iget v0, p0, Lo/byf;->e:I

    invoke-static {v0, v9}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 272
    iget v0, p0, Lo/byf;->h:I

    invoke-static {v0, v10}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 275
    sub-int v0, v7, v8

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    const/4 v11, 0x1

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    .line 278
    :goto_1
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v9}, Lo/emw;->e([F)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v9, v10, v0, v1}, Lo/emw;->a([F[FLjava/lang/Boolean;Ljava/lang/Boolean;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/byf;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/byf;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/byf;Landroid/graphics/drawable/Drawable;)I
    .locals 1

    .line 38
    invoke-direct {p0, p1}, Lo/byf;->a(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0
.end method

.method private b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 77
    iput-object p1, p0, Lo/byf;->b:Landroid/content/Context;

    .line 78
    sget v0, Lcom/huawei/health/suggestion/R$layout;->auto_fill_color_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 79
    sget v0, Lcom/huawei/health/suggestion/R$id;->img_content:I

    invoke-virtual {p0, v0}, Lo/byf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    .line 80
    sget v0, Lcom/huawei/health/suggestion/R$id;->startView:I

    invoke-virtual {p0, v0}, Lo/byf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/byf;->c:Landroid/view/View;

    .line 81
    sget v0, Lcom/huawei/health/suggestion/R$id;->coverView:I

    invoke-virtual {p0, v0}, Lo/byf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/byf;->d:Landroid/view/View;

    .line 84
    if-eqz p2, :cond_4

    .line 85
    sget-object v0, Lcom/huawei/health/suggestion/R$styleable;->AutoFillColorView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->AutoFillColorView_contentImg:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$styleable;->AutoFillColorView_contentImg:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 89
    :cond_0
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 90
    if-nez v3, :cond_1

    .line 91
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 92
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->AutoFillColorView_contentWidth:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v4

    .line 96
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->AutoFillColorView_contentHeight:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v5

    .line 97
    if-eqz v4, :cond_2

    .line 98
    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 101
    :cond_2
    if-eqz v5, :cond_3

    .line 102
    iput v5, v3, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 104
    :cond_3
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 107
    :cond_4
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/byf$1;

    invoke-direct {v1, p0}, Lo/byf$1;-><init>(Lo/byf;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 115
    return-void
.end method

.method private e(Landroid/graphics/drawable/Drawable;)F
    .locals 2

    .line 287
    if-nez p1, :cond_0

    .line 288
    const/4 v0, 0x0

    return v0

    .line 290
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method static synthetic e(Lo/byf;Landroid/graphics/drawable/Drawable;)F
    .locals 1

    .line 38
    invoke-direct {p0, p1}, Lo/byf;->e(Landroid/graphics/drawable/Drawable;)F

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)V
    .locals 4

    .line 123
    const-string v0, "HS_AutoFillColorView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------------loadContentImage "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/byf;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 125
    :cond_0
    return-void

    .line 127
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 128
    const-string v0, "HS_AutoFillColorView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadContentImage url is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void

    .line 131
    :cond_2
    iget-object v0, p0, Lo/byf;->b:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_3

    .line 132
    iget-object v0, p0, Lo/byf;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 133
    const-string v0, "HS_AutoFillColorView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity isDestroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 138
    :cond_3
    if-eqz p2, :cond_4

    .line 139
    iget-object v0, p0, Lo/byf;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lo/byf$3;

    invoke-direct {v1, p0}, Lo/byf$3;-><init>(Lo/byf;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    goto :goto_0

    .line 151
    :cond_4
    iget-object v0, p0, Lo/byf;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/Target;

    .line 166
    :goto_0
    return-void
.end method

.method public d(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 174
    if-nez p1, :cond_0

    .line 175
    const-string v0, "HS_AutoFillColorView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillColorBg drawable is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    return-void

    .line 179
    :cond_0
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/byf$5;

    invoke-direct {v1, p0, p1}, Lo/byf$5;-><init>(Lo/byf;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 239
    return-void
.end method

.method public getContentImg()Landroid/widget/ImageView;
    .locals 1

    .line 296
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Lo/byf;->a:Landroid/widget/ImageView;

    return-object v0

    .line 299
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->img_content:I

    invoke-virtual {p0, v0}, Lo/byf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public getMainColor()I
    .locals 1

    .line 312
    iget v0, p0, Lo/byf;->e:I

    return v0
.end method

.method public getSecondColor()I
    .locals 1

    .line 316
    iget v0, p0, Lo/byf;->h:I

    return v0
.end method
