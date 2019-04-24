.class public Lhuawei/widget/HwSearchView;
.super Landroid/widget/SearchView;
.source "SourceFile"


# static fields
.field public static final QUERY_TEXT_VIEW_GAP:I = 0x3

.field private static final TAG:Ljava/lang/String; = "HwSearchView"


# instance fields
.field private mActionModeEnabled:Z

.field private mBarcodeButton:Landroid/widget/ImageView;

.field private mBarcodeEnabled:Z

.field private mContext:Landroid/content/Context;

.field private mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

.field private mInActionMode:Z

.field private final mOnClickListener:Landroid/view/View$OnClickListener;

.field private mSearchBar:Landroid/widget/LinearLayout;

.field private searchPl:Landroid/view/ViewGroup;

.field private searchVoice:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 263
    new-instance v0, Lhuawei/widget/HwSearchView$1;

    invoke-direct {v0, p0}, Lhuawei/widget/HwSearchView$1;-><init>(Lhuawei/widget/HwSearchView;)V

    iput-object v0, p0, Lhuawei/widget/HwSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 49
    iput-object p1, p0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    .line 50
    invoke-direct {p0}, Lhuawei/widget/HwSearchView;->reflectMember()V

    .line 51
    invoke-direct {p0}, Lhuawei/widget/HwSearchView;->initHwStyle()V

    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSearchView;->initialBarcodeButton(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 263
    new-instance v0, Lhuawei/widget/HwSearchView$1;

    invoke-direct {v0, p0}, Lhuawei/widget/HwSearchView$1;-><init>(Lhuawei/widget/HwSearchView;)V

    iput-object v0, p0, Lhuawei/widget/HwSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 57
    iput-object p1, p0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    .line 58
    invoke-direct {p0}, Lhuawei/widget/HwSearchView;->reflectMember()V

    .line 59
    invoke-direct {p0}, Lhuawei/widget/HwSearchView;->initHwStyle()V

    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSearchView;->initialBarcodeButton(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 61
    return-void
.end method

.method static synthetic access$000(Lhuawei/widget/HwSearchView;)Landroid/widget/ImageView;
    .locals 1

    .line 29
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$100(Lhuawei/widget/HwSearchView;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lhuawei/widget/HwSearchView;->onBarcodeClicked()V

    return-void
.end method

.method private canShowSubmitButton()Z
    .locals 1

    .line 313
    const/4 v0, 0x0

    return v0
.end method

.method private getColor(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 430
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 431
    const-string v0, "color"

    invoke-direct {p0, p1, v0, p2}, Lhuawei/widget/HwSearchView;->getIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 432
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0

    .line 434
    :cond_0
    const-string v0, "ResLoaderUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getColor: context or colorResId can not be null! context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", colorResId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 435
    const/4 v0, 0x0

    return v0
.end method

.method private getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 410
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 411
    const-string v0, "dimen"

    invoke-direct {p0, p1, v0, p2}, Lhuawei/widget/HwSearchView;->getIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 412
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0

    .line 414
    :cond_0
    const-string v0, "ResLoaderUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDimensionPixelSize: context or dimenResId can not be null! context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", dimenResId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    const/4 v0, 0x0

    return v0
.end method

.method private getIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 421
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 422
    const/4 v0, 0x0

    return v0

    .line 424
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 425
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3, p2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private initHwStyle()V
    .locals 19

    .line 67
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_bar"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 68
    if-eqz v5, :cond_0

    .line 69
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lhuawei/widget/HwSearchView;->mSearchBar:Landroid/widget/LinearLayout;

    .line 70
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mSearchBar:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 71
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/searchview/R$dimen;->search_view_preferred_height_emui:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 72
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 73
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mSearchBar:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_badge"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    .line 77
    if-eqz v6, :cond_1

    .line 78
    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 79
    invoke-virtual {v7}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 80
    const/4 v0, -0x2

    iput v0, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 81
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/searchview/R$color;->hwsearchview_primary_text_emui:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    .line 83
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 84
    const/4 v0, 0x2

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v7, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 88
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_button"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    .line 89
    if-eqz v7, :cond_2

    .line 90
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 91
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 92
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/searchview/R$dimen;->hwsearchview_emui_action_button_min_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    .line 93
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setMinimumWidth(I)V

    .line 94
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setMinimumHeight(I)V

    .line 95
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/widget/ImageView;->setPaddingRelative(IIII)V

    .line 96
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 97
    invoke-virtual {v8}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 98
    const/4 v0, -0x2

    iput v0, v10, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 99
    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setFocusable(Z)V

    .line 101
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 104
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_edit_frame"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    .line 105
    if-eqz v8, :cond_4

    .line 106
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 107
    invoke-virtual {v9}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "padding_l"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v11

    .line 109
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v9, v11, v0, v11, v1}, Landroid/widget/LinearLayout;->setPaddingRelative(IIII)V

    .line 110
    const/4 v0, -0x2

    iput v0, v10, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 111
    const/16 v0, 0x10

    iput v0, v10, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 112
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 113
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 114
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-le v0, v1, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_3

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/fks;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 117
    :cond_3
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    new-instance v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    .line 120
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v12, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 122
    const/16 v0, 0x10

    iput v0, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    invoke-virtual {v0, v12}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 128
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_mag_icon"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    .line 129
    if-eqz v9, :cond_5

    .line 130
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 131
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 132
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 133
    invoke-virtual {v10}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 134
    const/4 v0, 0x0

    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 135
    const/4 v0, 0x0

    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 136
    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_plate"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    .line 141
    if-eqz v10, :cond_a

    .line 142
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object/from16 v1, p0

    iput-object v0, v1, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    .line 144
    const/4 v0, -0x2

    iput v0, v11, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 146
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 147
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/ViewGroup;->setPaddingRelative(IIII)V

    .line 148
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-gt v0, v1, :cond_6

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    sget v1, Lhuawei/widget/searchview/R$drawable;->hwsearchview_search_bg_selector:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    .line 152
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:id/search_src_icon"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    .line 153
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "padding_m"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v13

    .line 154
    if-nez v12, :cond_9

    .line 155
    new-instance v14, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    invoke-direct {v14, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "searchview_src_icon_width_emui"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v15

    .line 157
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    move v1, v15

    move v2, v15

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v16, v0

    .line 158
    const/16 v0, 0x10

    move-object/from16 v1, v16

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 159
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 160
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 161
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/searchview/R$drawable;->hwsearchview_ic_public_search:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v17

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "emui_color_gray_5"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getColor(Landroid/content/Context;Ljava/lang/String;)I

    move-result v18

    .line 164
    if-eqz v18, :cond_7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-le v0, v1, :cond_7

    .line 165
    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 167
    :cond_7
    move-object/from16 v0, v17

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 168
    invoke-direct/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->isRtlLocale()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    move-object/from16 v1, p0

    iget-object v1, v1, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_0

    .line 171
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 173
    :goto_0
    goto :goto_1

    .line 174
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v13, v1, v2, v3}, Landroid/view/ViewGroup;->setPaddingRelative(IIII)V

    .line 178
    :cond_a
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_c

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "searchview_src_text_height_emui"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v12

    .line 181
    iput v12, v11, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 182
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v11}, Landroid/widget/AutoCompleteTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "emui_color_gray_10"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getColor(Landroid/content/Context;Ljava/lang/String;)I

    move-result v13

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v13}, Landroid/widget/AutoCompleteTextView;->setTextColor(I)V

    .line 185
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x2

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/AutoCompleteTextView;->setTextSize(IF)V

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "emui_color_gray_5"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getColor(Landroid/content/Context;Ljava/lang/String;)I

    move-result v14

    .line 187
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v14}, Landroid/widget/AutoCompleteTextView;->setHintTextColor(I)V

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "searchview_src_text_min_width_emui"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v15

    .line 189
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v15}, Landroid/widget/AutoCompleteTextView;->setMinimumWidth(I)V

    .line 190
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    const-string v1, "Search query"

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "hwsearchview_src_text_padding_start_emui"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v16

    .line 192
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    instance-of v0, v0, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_b

    .line 193
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    move/from16 v1, v16

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/AutoCompleteTextView;->setPaddingRelative(IIII)V

    goto :goto_2

    .line 195
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/AutoCompleteTextView;->setPaddingRelative(IIII)V

    .line 200
    :cond_c
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_close_btn"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    .line 201
    if-eqz v11, :cond_d

    .line 202
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    .line 203
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/searchview/R$drawable;->hwsearchview_cancel_bg_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    .line 204
    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 205
    invoke-virtual {v12}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "searchview_closebutton_width_emui"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v15

    .line 207
    iput v15, v14, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 208
    invoke-virtual {v12, v14}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "padding_m"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v16

    .line 210
    move/from16 v0, v16

    move/from16 v1, v16

    move/from16 v2, v16

    move/from16 v3, v16

    invoke-virtual {v12, v0, v1, v2, v3}, Landroid/widget/ImageView;->setPaddingRelative(IIII)V

    .line 211
    const/16 v0, 0x8

    invoke-virtual {v12, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 214
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_voice_btn"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    .line 215
    if-eqz v12, :cond_e

    .line 216
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lhuawei/widget/HwSearchView;->searchVoice:Landroid/widget/ImageView;

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchVoice:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchVoice:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 221
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/submit_area"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v13

    .line 222
    if-eqz v13, :cond_f

    .line 223
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/LinearLayout;

    .line 224
    sget v0, Lhuawei/widget/searchview/R$drawable;->hwsearchview_submit_bg_selector:I

    invoke-virtual {v14, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchVoice:Landroid/widget/ImageView;

    invoke-virtual {v14, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 226
    new-instance v15, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    invoke-direct {v15, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchVoice:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    .line 228
    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->searchPl:Landroid/view/ViewGroup;

    const/4 v1, 0x2

    invoke-virtual {v0, v15, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 232
    :cond_f
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_go_btn"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v14

    .line 233
    if-eqz v14, :cond_10

    .line 234
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSearchView;->mContext:Landroid/content/Context;

    const-string v1, "searchview_gobutton_height_emui"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwSearchView;->getDimensionPixelSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result v16

    .line 236
    invoke-virtual {v15}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    .line 237
    move/from16 v0, v16

    move-object/from16 v1, v17

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 238
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 239
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/widget/ImageView;->setPaddingRelative(IIII)V

    .line 242
    :cond_10
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:id/barcode_button"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v15

    .line 243
    if-eqz v15, :cond_11

    .line 244
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/ImageView;

    .line 245
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_11

    .line 246
    move-object/from16 v0, v16

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 249
    :cond_11
    return-void
.end method

.method private initialBarcodeButton(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 252
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    iget-object v1, p0, Lhuawei/widget/HwSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    :cond_0
    return-void
.end method

.method private isLayoutRtl()Z
    .locals 2

    .line 446
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isRtlLocale()Z
    .locals 2

    .line 440
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 441
    const-string v0, "ar"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fa"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "iw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ug"

    .line 442
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ur"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lhuawei/widget/HwSearchView;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 441
    :goto_0
    return v0
.end method

.method private isSubmitAreaEnabled()Z
    .locals 1

    .line 317
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->isSubmitButtonEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->isIconified()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onBarcodeClicked()V
    .locals 0

    .line 261
    return-void
.end method

.method private reflectMember()V
    .locals 6

    .line 396
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_src_text"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 397
    if-eqz v4, :cond_0

    .line 398
    invoke-virtual {p0, v4}, Lhuawei/widget/HwSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 399
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 400
    move-object v0, v5

    check-cast v0, Landroid/widget/AutoCompleteTextView;

    iput-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    .line 403
    :cond_0
    return-void
.end method


# virtual methods
.method public adjustQueryTextView(Z)V
    .locals 8

    .line 339
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 340
    const-string v0, "HwSearchView"

    const-string v1, "mHwSearchSrcTextView is null on setActionModeEnabled"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    return-void

    .line 344
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getPaddingLeft()I

    move-result v2

    .line 345
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getPaddingTop()I

    move-result v3

    .line 346
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getPaddingRight()I

    move-result v4

    .line 347
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getPaddingBottom()I

    move-result v5

    .line 351
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    .line 352
    iget v0, v6, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    float-to-int v7, v0

    .line 353
    if-eqz p1, :cond_1

    if-gtz v5, :cond_1

    .line 354
    add-int/2addr v5, v7

    goto :goto_0

    .line 355
    :cond_1
    if-nez p1, :cond_2

    if-lez v5, :cond_2

    .line 356
    sub-int/2addr v5, v7

    .line 360
    :cond_2
    :goto_0
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/AutoCompleteTextView;->setPadding(IIII)V

    .line 362
    return-void
.end method

.method public getIcon(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 327
    const/4 v2, 0x0

    .line 328
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/searchview/R$drawable;->hwsearchview_ic_search_emui:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 329
    return-object v2
.end method

.method public getSearchSrcTextView()Landroid/widget/EditText;
    .locals 1

    .line 406
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    return-object v0
.end method

.method public isActionModeEnabled()Z
    .locals 1

    .line 304
    iget-boolean v0, p0, Lhuawei/widget/HwSearchView;->mActionModeEnabled:Z

    return v0
.end method

.method public isEmuiStyle()Z
    .locals 1

    .line 274
    const/4 v0, 0x1

    return v0
.end method

.method public isInActionMode()Z
    .locals 1

    .line 278
    iget-boolean v0, p0, Lhuawei/widget/HwSearchView;->mInActionMode:Z

    return v0
.end method

.method public onInActionMode()V
    .locals 1

    .line 282
    iget-boolean v0, p0, Lhuawei/widget/HwSearchView;->mInActionMode:Z

    if-eqz v0, :cond_0

    return-void

    .line 283
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwSearchView;->mInActionMode:Z

    .line 284
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwSearchView;->mActionModeEnabled:Z

    .line 285
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSearchView;->setSubmitButtonEnabled(Z)V

    .line 286
    return-void
.end method

.method public setActionModeEnabled(Z)V
    .locals 2

    .line 289
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 290
    const-string v0, "HwSearchView"

    const-string v1, "mHwSearchSrcTextView is null on setActionModeEnabled"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 291
    return-void

    .line 293
    :cond_0
    iput-boolean p1, p0, Lhuawei/widget/HwSearchView;->mActionModeEnabled:Z

    .line 294
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    if-nez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setClickable(Z)V

    .line 295
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    if-nez p1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setFocusable(Z)V

    .line 296
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-le v0, v1, :cond_4

    .line 297
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    if-nez p1, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setShowSoftInputOnFocus(Z)V

    .line 299
    :cond_4
    if-nez p1, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p0, v0}, Lhuawei/widget/HwSearchView;->setClickable(Z)V

    .line 300
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->isIconified()Z

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSearchView;->updateViewsVisibility(Z)V

    .line 301
    return-void
.end method

.method public setQrcodeEnabled(Z)V
    .locals 1

    .line 308
    iput-boolean p1, p0, Lhuawei/widget/HwSearchView;->mBarcodeEnabled:Z

    .line 309
    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->isIconified()Z

    move-result v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSearchView;->updateViewsVisibility(Z)V

    .line 310
    return-void
.end method

.method public setQuery(Ljava/lang/CharSequence;Z)V
    .locals 4

    .line 374
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 375
    const-string v0, "HwSearchView"

    const-string v1, "mHwSearchSrcTextView is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 376
    return-void

    .line 378
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 379
    if-eqz p1, :cond_1

    .line 380
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    iget-object v1, p0, Lhuawei/widget/HwSearchView;->mHwSearchSrcTextView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    .line 381
    const-string v0, "mUserQuery"

    const-class v1, Landroid/widget/SearchView;

    invoke-static {v0, p0, p1, v1}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 386
    :cond_1
    iget-boolean v0, p0, Lhuawei/widget/HwSearchView;->mInActionMode:Z

    if-nez v0, :cond_2

    if-eqz p2, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 387
    const-string v0, "onSubmitQuery"

    const-class v1, Landroid/widget/SearchView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v2, v3, v1}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 391
    :cond_2
    return-void
.end method

.method public updateQrcodeButton(Z)V
    .locals 2

    .line 321
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 322
    iget-object v0, p0, Lhuawei/widget/HwSearchView;->mBarcodeButton:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lhuawei/widget/HwSearchView;->mBarcodeEnabled:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lhuawei/widget/HwSearchView;->isIconfiedByDefault()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 324
    :cond_1
    return-void
.end method

.method public updateViewsVisibility(Z)V
    .locals 4

    .line 365
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Class;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 366
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 367
    const-string v0, "updateViewsVisibility"

    const-class v1, Landroid/widget/SearchView;

    invoke-static {p0, v0, v2, v3, v1}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 369
    invoke-virtual {p0, p1}, Lhuawei/widget/HwSearchView;->updateQrcodeButton(Z)V

    .line 370
    return-void
.end method
