.class public Lcom/tencent/open/yyb/TitleBar;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# static fields
.field public static final BACKBTN_LEFT_MARGIN:F = 20.0f

.field private static final BACK_BTN_HEIGHT:F = 18.0f

.field private static final BACK_BTN_WIDTH:F = 11.0f

.field private static final BACK_PADDING_BOTTOM:F = 7.0f

.field private static final BACK_PADDING_LEFT:F = 15.0f

.field private static final BACK_PADDING_RIGHT:F = 20.0f

.field private static final BACK_PADDING_TOP:F = 7.0f

.field private static final ID_BACK_BTN:I = 0x2710

.field public static final SHAREBTN_RIGHT_MARGIN:F = 10.0f

.field private static final SHARE_BTN_SIZE:F = 52.0f

.field private static final SOURCE_BACK_BTN:Ljava/lang/String; = "yyb_icon_back.png"

.field private static final SOURCE_MORE_BTN:Ljava/lang/String; = "yyb_appdetail_showmore.png"

.field private static final SOURCE_TITLEBAR:Ljava/lang/String; = "yyb_topbar.9.png"

.field public static final TITLEBAR_HEIGHT:F = 51.0f


# instance fields
.field private backBtn:Landroid/widget/ImageView;

.field private backLayout:Landroid/widget/RelativeLayout;

.field private density:F

.field private shareBtn:Landroid/widget/ImageView;

.field private title:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 42
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 44
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/WindowManager;

    .line 45
    new-instance v3, Landroid/util/DisplayMetrics;

    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 46
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 47
    iget v0, v3, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/tencent/open/yyb/TitleBar;->density:F

    .line 49
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v0, 0x424c0000    # 51.0f

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v0

    const/4 v1, -0x1

    invoke-direct {v4, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 50
    invoke-virtual {p0, v4}, Lcom/tencent/open/yyb/TitleBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    const-string v0, "yyb_topbar.9.png"

    invoke-static {v0, p1}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    invoke-direct {p0}, Lcom/tencent/open/yyb/TitleBar;->initBackLayout()V

    .line 54
    invoke-direct {p0}, Lcom/tencent/open/yyb/TitleBar;->initShareBtn()V

    .line 55
    return-void
.end method

.method private dip2px(F)I
    .locals 2

    .line 127
    iget v0, p0, Lcom/tencent/open/yyb/TitleBar;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private initBackBtn()V
    .locals 6

    .line 73
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    .line 74
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v0, 0x41300000    # 11.0f

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v0

    const/high16 v1, 0x41900000    # 18.0f

    invoke-direct {p0, v1}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v1

    invoke-direct {v5, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 75
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 76
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v0

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 77
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    .line 78
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 80
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    const-string v1, "yyb_icon_back.png"

    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-direct {p0, v1}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v1

    const/high16 v2, 0x40e00000    # 7.0f

    invoke-direct {p0, v2}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v2

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-direct {p0, v3}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v3

    const/high16 v4, 0x40e00000    # 7.0f

    invoke-direct {p0, v4}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 84
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backLayout:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/tencent/open/yyb/TitleBar;->backBtn:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 85
    return-void
.end method

.method private initBackLayout()V
    .locals 3

    .line 62
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backLayout:Landroid/widget/RelativeLayout;

    .line 63
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 64
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->addView(Landroid/view/View;)V

    .line 68
    invoke-direct {p0}, Lcom/tencent/open/yyb/TitleBar;->initBackBtn()V

    .line 69
    invoke-direct {p0}, Lcom/tencent/open/yyb/TitleBar;->initTitle()V

    .line 70
    return-void
.end method

.method private initShareBtn()V
    .locals 6

    .line 101
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->shareBtn:Landroid/widget/ImageView;

    .line 102
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v0, 0x42500000    # 52.0f

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v0

    const/high16 v1, 0x42500000    # 52.0f

    invoke-direct {p0, v1}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v1

    invoke-direct {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 103
    const/16 v0, 0xf

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 104
    const/16 v0, 0xb

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 106
    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 107
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    .line 110
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->shareBtn:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->shareBtn:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 112
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->shareBtn:Landroid/widget/ImageView;

    const-string v1, "yyb_appdetail_showmore.png"

    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 115
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->shareBtn:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->addView(Landroid/view/View;)V

    .line 116
    return-void
.end method

.method private initTitle()V
    .locals 6

    .line 88
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/tencent/open/yyb/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->title:Landroid/widget/TextView;

    .line 89
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v5, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 90
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 91
    const/4 v0, 0x1

    const/16 v1, 0x2710

    invoke-virtual {v5, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 92
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/TitleBar;->dip2px(F)I

    move-result v0

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 94
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->title:Landroid/widget/TextView;

    const-string v1, "#fefefe"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->title:Landroid/widget/TextView;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 96
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->title:Landroid/widget/TextView;

    const-string v1, "#2E000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 97
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backLayout:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/tencent/open/yyb/TitleBar;->title:Landroid/widget/TextView;

    invoke-virtual {v0, v1, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    return-void
.end method


# virtual methods
.method public getBackBtn()Landroid/widget/RelativeLayout;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->backLayout:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public getSharBtn()Landroid/widget/ImageView;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->shareBtn:Landroid/widget/ImageView;

    return-object v0
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/tencent/open/yyb/TitleBar;->title:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    return-void
.end method
