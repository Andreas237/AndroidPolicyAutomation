.class public Lhuawei/widget/HwSubTabWidget;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhuawei/widget/HwSubTabWidget$SavedState;,
        Lhuawei/widget/HwSubTabWidget$SubTabClickListener;,
        Lhuawei/widget/HwSubTabWidget$SubTabView;,
        Lhuawei/widget/HwSubTabWidget$SubTab;,
        Lhuawei/widget/HwSubTabWidget$SubTabListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SubTabWidget"


# instance fields
.field private isBlurEnable:Z

.field private mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

.field private mClickable:Z

.field private mContext:Landroid/content/Context;

.field private mFunctionView:Landroid/widget/ImageView;

.field private mMedium:Landroid/graphics/Typeface;

.field private mRegular:Landroid/graphics/Typeface;

.field private mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private mSubTabClickListener:Lhuawei/widget/HwSubTabWidget$SubTabClickListener;

.field private mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

.field public mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

.field private mSubTabItemBg:I

.field private mSubTabItemMargin:I

.field private mSubTabItemMinWidth:I

.field private mSubTabItemPadding:I

.field private mSubTabItemTextColor:Landroid/content/res/ColorStateList;

.field private mSubTabItemTextSize:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSubTabWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 59
    sget v0, Lhuawei/widget/hwsubtab/R$attr;->hwSubTabBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwSubTabWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

    .line 63
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwSubTabWidget;->mClickable:Z

    .line 51
    invoke-static {}, Lhuawei/widget/effect/engine/HwBlurEngine;->getInstance()Lhuawei/widget/effect/engine/HwBlurEngine;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwSubTabWidget;->isBlurEnable:Z

    .line 65
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget;->mContext:Landroid/content/Context;

    .line 68
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    .line 69
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 70
    sget v0, Lhuawei/widget/hwsubtab/R$layout;->hwsubtab_content:I

    const/4 v1, 0x1

    invoke-virtual {v3, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 72
    sget v0, Lhuawei/widget/hwsubtab/R$id;->hwSubTabViewContainer:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwSubTabViewContainer;

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

    .line 74
    sget v0, Lhuawei/widget/hwsubtab/R$id;->hwsubtab_function_icon:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mFunctionView:Landroid/widget/ImageView;

    .line 75
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer;->getmTabStrip()Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    .line 78
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget;->setOrientation(I)V

    .line 81
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mMedium:Landroid/graphics/Typeface;

    .line 82
    const-string v0, "sans-serif"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mRegular:Landroid/graphics/Typeface;

    .line 85
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 86
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, v5}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setSelectedIndicatorMargin(I)V

    .line 87
    sget-object v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget:[I

    sget v1, Lhuawei/widget/hwsubtab/R$style;->Widget_Emui_HwSubTabBar:I

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 89
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_indicator_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    .line 90
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    sget v1, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabIndicatorHeight:I

    .line 91
    invoke-virtual {v6, v1, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setSelectedIndicatorHeight(I)V

    .line 92
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    sget v1, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabIndicatorPadding:I

    .line 93
    const/4 v2, 0x0

    invoke-virtual {v6, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    .line 92
    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setSelectedIndicatorPadding(I)V

    .line 94
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$color;->hwsubtab_emui_accent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    .line 95
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    sget v1, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabIndicatorColor:I

    .line 96
    invoke-virtual {v6, v1, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    .line 95
    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setSelectedIndicatorColor(I)V

    .line 97
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v9

    .line 98
    sget v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabItemPadding:I

    invoke-virtual {v6, v0, v9}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemPadding:I

    .line 99
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_item_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v10

    .line 100
    sget v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabItemMargin:I

    invoke-virtual {v6, v0, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMargin:I

    .line 101
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

    iget v1, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMargin:I

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabViewContainer;->setSubTabItemMargin(I)V

    .line 103
    sget v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabItemBg:I

    sget v1, Lhuawei/widget/hwsubtab/R$drawable;->hwsubtab_item_bg:I

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemBg:I

    .line 105
    sget v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabItemMinWidth:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMinWidth:I

    .line 106
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v11

    .line 107
    sget v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabItemTextSize:I

    invoke-virtual {v6, v0, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemTextSize:I

    .line 108
    sget v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget_hwSubTabItemTextColor:I

    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemTextColor:Landroid/content/res/ColorStateList;

    .line 109
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    return-void
.end method

.method static synthetic access$000(Lhuawei/widget/HwSubTabWidget;)I
    .locals 1

    .line 30
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemPadding:I

    return v0
.end method

.method static synthetic access$100(Lhuawei/widget/HwSubTabWidget;)I
    .locals 1

    .line 30
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemTextSize:I

    return v0
.end method

.method static synthetic access$200(Lhuawei/widget/HwSubTabWidget;)Landroid/content/res/ColorStateList;
    .locals 1

    .line 30
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemTextColor:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method static synthetic access$300(Lhuawei/widget/HwSubTabWidget;)I
    .locals 1

    .line 30
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemBg:I

    return v0
.end method

.method static synthetic access$400(Lhuawei/widget/HwSubTabWidget;)I
    .locals 1

    .line 30
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMinWidth:I

    return v0
.end method

.method static synthetic access$600(Lhuawei/widget/HwSubTabWidget;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lhuawei/widget/HwSubTabWidget;->mClickable:Z

    return v0
.end method

.method static synthetic access$700(Lhuawei/widget/HwSubTabWidget;)Lhuawei/widget/HwSubTabViewContainer;
    .locals 1

    .line 30
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

    return-object v0
.end method

.method private createSubTabView(Lhuawei/widget/HwSubTabWidget$SubTab;)Lhuawei/widget/HwSubTabWidget$SubTabView;
    .locals 3

    .line 478
    new-instance v2, Lhuawei/widget/HwSubTabWidget$SubTabView;

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, p0, v0, p1}, Lhuawei/widget/HwSubTabWidget$SubTabView;-><init>(Lhuawei/widget/HwSubTabWidget;Landroid/content/Context;Lhuawei/widget/HwSubTabWidget$SubTab;)V

    .line 479
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setFocusable(Z)V

    .line 480
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabClickListener:Lhuawei/widget/HwSubTabWidget$SubTabClickListener;

    if-nez v0, :cond_0

    .line 481
    new-instance v0, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhuawei/widget/HwSubTabWidget$SubTabClickListener;-><init>(Lhuawei/widget/HwSubTabWidget;Lhuawei/widget/HwSubTabWidget$1;)V

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabClickListener:Lhuawei/widget/HwSubTabWidget$SubTabClickListener;

    .line 483
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabClickListener:Lhuawei/widget/HwSubTabWidget$SubTabClickListener;

    invoke-virtual {v2, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 484
    return-object v2
.end method

.method private setSubTabSelectedInner(I)V
    .locals 5

    .line 224
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v1

    .line 225
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 226
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, v2}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 227
    if-ne v2, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 228
    :goto_1
    if-ne v2, p1, :cond_1

    .line 229
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mMedium:Landroid/graphics/Typeface;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_2

    .line 231
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mRegular:Landroid/graphics/Typeface;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 233
    :goto_2
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setSelected(Z)V

    .line 225
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 235
    :cond_2
    return-void
.end method


# virtual methods
.method public addFunctionMenu(ILandroid/view/View$OnClickListener;)V
    .locals 2

    .line 554
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mFunctionView:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 555
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mFunctionView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 556
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mFunctionView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 557
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mFunctionView:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 559
    :cond_0
    return-void
.end method

.method public addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;IZ)V
    .locals 4

    .line 114
    invoke-direct {p0, p1}, Lhuawei/widget/HwSubTabWidget;->createSubTabView(Lhuawei/widget/HwSubTabWidget$SubTab;)Lhuawei/widget/HwSubTabWidget$SubTabView;

    move-result-object v2

    .line 115
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {v3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 117
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMargin:I

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 118
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMargin:I

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 119
    invoke-virtual {v2, v3}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, v2, p2, v3}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 121
    invoke-virtual {p1, p2}, Lhuawei/widget/HwSubTabWidget$SubTab;->setPosition(I)V

    .line 122
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSubTabCount()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, p2, v0, v1}, Lhuawei/widget/HwSubTabWidget;->updateSubTabPosition(IIZ)V

    .line 123
    if-eqz p3, :cond_0

    .line 124
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->select()V

    .line 125
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setSelected(Z)V

    .line 127
    :cond_0
    return-void
.end method

.method public addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V
    .locals 4

    .line 131
    invoke-direct {p0, p1}, Lhuawei/widget/HwSubTabWidget;->createSubTabView(Lhuawei/widget/HwSubTabWidget$SubTab;)Lhuawei/widget/HwSubTabWidget$SubTabView;

    move-result-object v2

    .line 132
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {v3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 134
    invoke-virtual {v2, v3}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMargin:I

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 136
    iget v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabItemMargin:I

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 137
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, v2, v3}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSubTabCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setPosition(I)V

    .line 139
    if-eqz p2, :cond_0

    .line 140
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->select()V

    .line 141
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setSelected(Z)V

    .line 143
    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 563
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {v0, p0}, Lhuawei/widget/effect/engine/HwBlurEngine;->isShowHwBlur(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 564
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {v0, p1, p0}, Lhuawei/widget/effect/engine/HwBlurEngine;->draw(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 565
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 567
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 569
    :goto_0
    return-void
.end method

.method public getSelectedSubTab()Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 1

    .line 183
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    return-object v0
.end method

.method public getSelectedSubTabPostion()I
    .locals 5

    .line 188
    const/4 v2, -0x1

    .line 189
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSubTabCount()I

    move-result v3

    .line 190
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 191
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {p0, v4}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 192
    move v2, v4

    .line 193
    goto :goto_1

    .line 190
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 196
    :cond_1
    :goto_1
    return v2
.end method

.method public getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 2

    .line 238
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 239
    if-eqz v1, :cond_0

    move-object v0, v1

    check-cast v0, Lhuawei/widget/HwSubTabWidget$SubTabView;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->getSubTab()Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSubTabCount()I
    .locals 1

    .line 243
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v0

    return v0
.end method

.method public isBlurEnable()Z
    .locals 1

    .line 583
    iget-boolean v0, p0, Lhuawei/widget/HwSubTabWidget;->isBlurEnable:Z

    return v0
.end method

.method public newSubTab()Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 1

    .line 247
    new-instance v0, Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-direct {v0, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;)V

    return-object v0
.end method

.method public newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 1

    .line 251
    new-instance v0, Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-direct {v0, p0, p1}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public newSubTab(Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 1

    .line 255
    new-instance v0, Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-direct {v0, p0, p1, p2, p3}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)V

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 515
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 516
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5

    .line 161
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0x12

    if-gt v0, v1, :cond_0

    .line 164
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 165
    return-void

    .line 167
    :cond_0
    move-object v2, p1

    check-cast v2, Lhuawei/widget/HwSubTabWidget$SavedState;

    .line 168
    invoke-virtual {v2}, Lhuawei/widget/HwSubTabWidget$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 169
    iget v3, v2, Lhuawei/widget/HwSubTabWidget$SavedState;->mSavedPosition:I

    .line 170
    if-ltz v3, :cond_1

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSubTabCount()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 171
    invoke-virtual {p0, v3}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->select()V

    .line 172
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, v3}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwSubTabWidget$SubTabView;

    move-object v4, v0

    check-cast v4, Lhuawei/widget/HwSubTabWidget$SubTabView;

    .line 173
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lhuawei/widget/HwSubTabWidget$SubTabView;->setSelected(Z)V

    .line 175
    :cond_1
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 148
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0x12

    if-gt v0, v1, :cond_0

    .line 150
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0

    .line 152
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSelectedSubTabPostion()I

    move-result v2

    .line 153
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v3

    .line 154
    new-instance v4, Lhuawei/widget/HwSubTabWidget$SavedState;

    invoke-direct {v4, v3}, Lhuawei/widget/HwSubTabWidget$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 155
    iput v2, v4, Lhuawei/widget/HwSubTabWidget$SavedState;->mSavedPosition:I

    .line 156
    return-object v4
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 3

    .line 573
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowVisibilityChanged(I)V

    .line 574
    if-nez p1, :cond_0

    .line 575
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    iget-object v1, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    const-string v2, "LightBlurWithGray"

    invoke-virtual {v1, v2}, Lhuawei/widget/effect/engine/HwBlurEngine;->getBlurType(Ljava/lang/String;)Lo/fkx$a;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lhuawei/widget/effect/engine/HwBlurEngine;->addBlurTargetView(Landroid/view/View;Lo/fkx$a;)V

    .line 576
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->isBlurEnable()Z

    move-result v1

    invoke-virtual {v0, p0, v1}, Lhuawei/widget/effect/engine/HwBlurEngine;->setTargetViewBlurEnable(Landroid/view/View;Z)V

    goto :goto_0

    .line 578
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {v0, p0}, Lhuawei/widget/effect/engine/HwBlurEngine;->removeBlurTargetView(Landroid/view/View;)V

    .line 580
    :goto_0
    return-void
.end method

.method public removeAllSubTabs()V
    .locals 2

    .line 291
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 292
    return-void

    .line 294
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->removeAllViews()V

    .line 295
    const/4 v0, 0x0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 296
    return-void
.end method

.method public removeSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V
    .locals 1

    .line 259
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget;->removeSubTabAt(I)V

    .line 260
    return-void
.end method

.method public removeSubTabAt(I)V
    .locals 3

    .line 263
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 264
    return-void

    .line 268
    :cond_0
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v2

    .line 269
    if-eqz v2, :cond_1

    .line 270
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setPosition(I)V

    .line 274
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->removeViewAt(I)V

    .line 275
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSubTabCount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 276
    const/4 v0, 0x0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 281
    :cond_2
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->getSubTabCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lhuawei/widget/HwSubTabWidget;->updateSubTabPosition(IIZ)V

    .line 285
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne v2, v0, :cond_4

    .line 286
    add-int/lit8 v0, p1, -0x1

    if-lez v0, :cond_3

    add-int/lit8 v0, p1, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget;->selectSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V

    .line 288
    :cond_4
    return-void
.end method

.method public selectSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V
    .locals 4

    .line 397
    const/4 v3, 0x0

    .line 401
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mContext:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    .line 403
    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 404
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->disallowAddToBackStack()Landroid/app/FragmentTransaction;

    move-result-object v3

    .line 406
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    :cond_1
    if-eqz p1, :cond_2

    .line 407
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getPosition()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 408
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getPosition()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwSubTabViewContainer;->setScrollPosition(IF)V

    .line 410
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne v0, p1, :cond_3

    .line 411
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_6

    .line 413
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    iget-object v1, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1, v3}, Lhuawei/widget/HwSubTabWidget$SubTabListener;->onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V

    goto :goto_1

    .line 417
    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getPosition()I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, -0x1

    :goto_0
    invoke-direct {p0, v0}, Lhuawei/widget/HwSubTabWidget;->setSubTabSelectedInner(I)V

    .line 419
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_5

    .line 420
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    iget-object v1, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1, v3}, Lhuawei/widget/HwSubTabWidget$SubTabListener;->onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V

    .line 422
    :cond_5
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 423
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_6

    .line 424
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    iget-object v1, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1, v3}, Lhuawei/widget/HwSubTabWidget$SubTabListener;->onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V

    .line 427
    :cond_6
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_7

    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 428
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commit()I

    .line 430
    :cond_7
    return-void
.end method

.method public setBlurEnable(Z)V
    .locals 2

    .line 587
    iput-boolean p1, p0, Lhuawei/widget/HwSubTabWidget;->isBlurEnable:Z

    .line 588
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabWidget;->isBlurEnable()Z

    move-result v1

    invoke-virtual {v0, p0, v1}, Lhuawei/widget/effect/engine/HwBlurEngine;->setTargetViewBlurEnable(Landroid/view/View;Z)V

    .line 589
    return-void
.end method

.method public setClickable(Z)V
    .locals 0

    .line 179
    iput-boolean p1, p0, Lhuawei/widget/HwSubTabWidget;->mClickable:Z

    .line 180
    return-void
.end method

.method public setSubTabScrollingOffsets(IF)V
    .locals 1

    .line 509
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContainer:Lhuawei/widget/HwSubTabViewContainer;

    invoke-virtual {v0, p1, p2}, Lhuawei/widget/HwSubTabViewContainer;->setScrollPosition(IF)V

    .line 511
    return-void
.end method

.method public setSubTabSelected(I)V
    .locals 1

    .line 200
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSelectedSubTab:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 201
    invoke-direct {p0, p1}, Lhuawei/widget/HwSubTabWidget;->setSubTabSelectedInner(I)V

    .line 202
    return-void
.end method

.method public updateSubTab(I)V
    .locals 2

    .line 471
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget;->mSubTabContentView:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lhuawei/widget/HwSubTabWidget$SubTabView;

    .line 472
    if-eqz v1, :cond_0

    .line 473
    invoke-virtual {v1}, Lhuawei/widget/HwSubTabWidget$SubTabView;->update()V

    .line 475
    :cond_0
    return-void
.end method

.method public updateSubTabPosition(IIZ)V
    .locals 3

    .line 205
    if-eqz p3, :cond_2

    .line 206
    add-int/lit8 v1, p1, 0x1

    :goto_0
    if-ge v1, p2, :cond_1

    .line 207
    invoke-virtual {p0, v1}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v2

    .line 208
    if-eqz v2, :cond_0

    .line 209
    invoke-virtual {v2, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setPosition(I)V

    .line 206
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    goto :goto_2

    .line 213
    :cond_2
    move v1, p1

    :goto_1
    if-ge v1, p2, :cond_4

    .line 214
    invoke-virtual {p0, v1}, Lhuawei/widget/HwSubTabWidget;->getSubTabAt(I)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v2

    .line 215
    if-eqz v2, :cond_3

    .line 216
    invoke-virtual {v2, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setPosition(I)V

    .line 213
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 220
    :cond_4
    :goto_2
    return-void
.end method
