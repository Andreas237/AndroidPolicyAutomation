.class public Lhuawei/widget/HwBottomNavigationView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;,
        Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;,
        Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;,
        Lhuawei/widget/HwBottomNavigationView$BottomNavListener;
    }
.end annotation


# static fields
.field private static final MENU_MAX_SIZE:I = 0x5


# instance fields
.field private TAG:Ljava/lang/String;

.field private isBlurEnable:Z

.field private mActiveColor:I

.field private mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

.field private mBottomNavItemClickListenr:Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;

.field private mContext:Landroid/content/Context;

.field private mDefaultColor:I

.field private mIconBounds:I

.field private mLastSelectItem:I

.field private mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

.field private mMenu:Landroid/view/Menu;

.field private mMenuInflater:Landroid/view/MenuInflater;

.field private mMenuSize:I

.field private mMessageBgColor:I

.field private mPortLayout:Z

.field private mResources:Landroid/content/res/Resources;

.field private mTextPadding:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 109
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwBottomNavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 110
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 113
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwBottomNavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 114
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 117
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    const-string v0, "HwBottomNavigationView"

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    .line 65
    const v0, -0xff8201

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mActiveColor:I

    .line 66
    const v0, -0x7f7f80

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mDefaultColor:I

    .line 67
    const/high16 v0, -0x10000

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMessageBgColor:I

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    .line 76
    invoke-static {}, Lhuawei/widget/effect/engine/HwBlurEngine;->getInstance()Lhuawei/widget/effect/engine/HwBlurEngine;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView;->isBlurEnable:Z

    .line 118
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView;->mContext:Landroid/content/Context;

    .line 119
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mResources:Landroid/content/res/Resources;

    .line 122
    const-string v0, "com.android.internal.view.menu.MenuBuilder"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 123
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Landroid/content/Context;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 124
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Menu;

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 135
    goto :goto_0

    .line 125
    :catch_0
    move-exception v3

    .line 126
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "HwBottomNavigationView: MenuBuilder init failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    goto :goto_0

    .line 127
    :catch_1
    move-exception v3

    .line 128
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "HwBottomNavigationView: MenuBuilder init failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    goto :goto_0

    .line 129
    :catch_2
    move-exception v3

    .line 130
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "HwBottomNavigationView: MenuBuilder init failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    goto :goto_0

    .line 131
    :catch_3
    move-exception v3

    .line 132
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "HwBottomNavigationView: MenuBuilder init failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    goto :goto_0

    .line 133
    :catch_4
    move-exception v3

    .line 134
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "HwBottomNavigationView: MenuBuilder init failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    :goto_0
    new-instance v0, Landroid/view/MenuInflater;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuInflater:Landroid/view/MenuInflater;

    .line 137
    const/4 v3, 0x0

    .line 139
    sget-object v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView:[I

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$style;->Widget_Emui_HwBottomNavigationView:I

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 141
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView_bottomNavMenu:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    .line 142
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView_iconDefaultColor:I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mDefaultColor:I

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mDefaultColor:I

    .line 143
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView_iconActiveColor:I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mActiveColor:I

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mActiveColor:I

    .line 144
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView_messageBgColor:I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMessageBgColor:I

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMessageBgColor:I

    .line 145
    sget v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView_android_background:I

    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 146
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 148
    if-eqz v3, :cond_0

    .line 149
    invoke-virtual {p0, v3}, Lhuawei/widget/HwBottomNavigationView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 154
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mResources:Landroid/content/res/Resources;

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_text_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mTextPadding:I

    .line 155
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mResources:Landroid/content/res/Resources;

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_icon_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mIconBounds:I

    .line 156
    if-lez v5, :cond_1

    .line 157
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuInflater:Landroid/view/MenuInflater;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-virtual {v0, v5, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 159
    :cond_1
    new-instance v0, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;-><init>(Lhuawei/widget/HwBottomNavigationView;Lhuawei/widget/HwBottomNavigationView$1;)V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBottomNavItemClickListenr:Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;

    .line 160
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-direct {p0, v0}, Lhuawei/widget/HwBottomNavigationView;->correctSize(Landroid/view/Menu;)Z

    .line 161
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-direct {p0, v0}, Lhuawei/widget/HwBottomNavigationView;->createNewItem(Landroid/view/Menu;)V

    .line 162
    return-void
.end method

.method static synthetic access$100(Lhuawei/widget/HwBottomNavigationView;)Landroid/content/res/Resources;
    .locals 1

    .line 58
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mResources:Landroid/content/res/Resources;

    return-object v0
.end method

.method static synthetic access$200(Lhuawei/widget/HwBottomNavigationView;)I
    .locals 1

    .line 58
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mTextPadding:I

    return v0
.end method

.method static synthetic access$300(Lhuawei/widget/HwBottomNavigationView;)Z
    .locals 1

    .line 58
    invoke-direct {p0}, Lhuawei/widget/HwBottomNavigationView;->isLayoutRtl()Z

    move-result v0

    return v0
.end method

.method static synthetic access$400(Lhuawei/widget/HwBottomNavigationView;Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;Z)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lhuawei/widget/HwBottomNavigationView;->changeItem(Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;Z)V

    return-void
.end method

.method private addMenu(IIIILandroid/graphics/drawable/Drawable;)Z
    .locals 5

    .line 237
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, p4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, p5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v4

    .line 238
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-direct {p0, v0}, Lhuawei/widget/HwBottomNavigationView;->correctSize(Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v4, v0}, Lhuawei/widget/HwBottomNavigationView;->createNewItem(Landroid/view/MenuItem;I)V

    .line 240
    const/4 v0, 0x1

    return v0

    .line 242
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private addMenu(IIILjava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    .line 202
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, p5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v2

    .line 204
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-direct {p0, v0}, Lhuawei/widget/HwBottomNavigationView;->correctSize(Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v2, v0}, Lhuawei/widget/HwBottomNavigationView;->createNewItem(Landroid/view/MenuItem;I)V

    .line 206
    const/4 v0, 0x1

    return v0

    .line 208
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private changeItem(Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;Z)V
    .locals 5

    .line 798
    invoke-virtual {p1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getItemIndex()I

    move-result v3

    .line 799
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    if-ne v3, v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    if-eqz v0, :cond_0

    .line 800
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-interface {v1, v3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Lhuawei/widget/HwBottomNavigationView$BottomNavListener;->onBottomNavItemReselected(Landroid/view/MenuItem;I)V

    goto/16 :goto_0

    .line 801
    :cond_0
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    if-eq v3, v0, :cond_3

    .line 802
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    if-ge v0, v1, :cond_1

    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    if-ltz v0, :cond_1

    .line 803
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    invoke-virtual {p0, v0}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 804
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setChecked(ZZ)V

    .line 805
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    if-eqz v0, :cond_1

    .line 806
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    invoke-interface {v1, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    invoke-interface {v0, v1, v2}, Lhuawei/widget/HwBottomNavigationView$BottomNavListener;->onBottomNavItemUnselected(Landroid/view/MenuItem;I)V

    .line 809
    :cond_1
    iput v3, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    .line 810
    if-eqz p2, :cond_2

    .line 811
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setChecked(ZZ)V

    .line 813
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    if-eqz v0, :cond_3

    .line 814
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    invoke-interface {v1, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    invoke-interface {v0, v1, v2}, Lhuawei/widget/HwBottomNavigationView$BottomNavListener;->onBottomNavItemSelected(Landroid/view/MenuItem;I)V

    .line 817
    :cond_3
    :goto_0
    return-void
.end method

.method private correctSize(Landroid/view/Menu;)Z
    .locals 2

    .line 165
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    .line 166
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "too big size"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    const/4 v0, 0x5

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    .line 168
    const/4 v0, 0x0

    return v0

    .line 170
    :cond_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    .line 171
    const/4 v0, 0x1

    return v0
.end method

.method private createNewItem(Landroid/view/Menu;)V
    .locals 3

    .line 294
    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    .line 295
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 296
    invoke-interface {p1, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Lhuawei/widget/HwBottomNavigationView;->createNewItem(Landroid/view/MenuItem;I)V

    .line 295
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 298
    :cond_0
    return-void
.end method

.method private createNewItem(Landroid/view/MenuItem;I)V
    .locals 7

    .line 301
    new-instance v0, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    move-object v1, p0

    iget-object v2, p0, Lhuawei/widget/HwBottomNavigationView;->mContext:Landroid/content/Context;

    move-object v3, p1

    .line 302
    invoke-direct {p0}, Lhuawei/widget/HwBottomNavigationView;->isLand()Z

    move-result v4

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;-><init>(Lhuawei/widget/HwBottomNavigationView;Landroid/content/Context;Landroid/view/MenuItem;ZI)V

    move-object v6, v0

    .line 303
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mActiveColor:I

    invoke-virtual {v6, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setActiveColor(I)Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 304
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mDefaultColor:I

    invoke-virtual {v6, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setDefaultColor(I)Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 305
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMessageBgColor:I

    invoke-virtual {v6, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setMsgBgColor(I)V

    .line 306
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBottomNavItemClickListenr:Lhuawei/widget/HwBottomNavigationView$BottomNavItemClickListenr;

    invoke-virtual {v6, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 307
    invoke-virtual {p0, v6}, Lhuawei/widget/HwBottomNavigationView;->addView(Landroid/view/View;)V

    .line 308
    return-void
.end method

.method private generateOffsetList(Ljava/util/List;IF)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;IF)V"
        }
    .end annotation

    .line 495
    invoke-virtual {p0, p2}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 496
    invoke-virtual {v3}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getContent()Landroid/widget/TextView;

    move-result-object v4

    .line 497
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    .line 498
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-interface {v0, p2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, v5}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v0

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mTextPadding:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float v6, v0, v1

    .line 499
    sub-float v7, p3, v6

    .line 500
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-lez v0, :cond_0

    .line 501
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 503
    :cond_0
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    :goto_0
    return-void
.end method

.method private isLand()Z
    .locals 2

    .line 185
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView;->mPortLayout:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isLayoutRtl()Z
    .locals 2

    .line 826
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 827
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 829
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private setMarginHorizontal(Landroid/view/View;II)V
    .locals 1

    .line 508
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0, p1, p2, p3, v0}, Lhuawei/widget/HwBottomNavigationView;->setMarginHorizontal(Landroid/view/View;IILandroid/view/ViewGroup$MarginLayoutParams;)V

    .line 509
    return-void
.end method

.method private setMarginHorizontal(Landroid/view/View;IILandroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 2

    .line 512
    invoke-direct {p0}, Lhuawei/widget/HwBottomNavigationView;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 513
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p4, p3, v0, p2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 515
    :cond_0
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p4, p2, v0, p3, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 517
    :goto_0
    invoke-virtual {p1, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 518
    return-void
.end method

.method private setStableWidth(Landroid/view/View;I)V
    .locals 1

    .line 521
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 522
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 523
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 524
    return-void
.end method


# virtual methods
.method public addMenu(ILandroid/graphics/drawable/Drawable;)Z
    .locals 6

    .line 232
    move-object v0, p0

    move v4, p1

    move-object v5, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lhuawei/widget/HwBottomNavigationView;->addMenu(IIIILandroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method

.method public addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z
    .locals 6

    .line 220
    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lhuawei/widget/HwBottomNavigationView;->addMenu(IIILjava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method

.method public addView(Landroid/view/View;ILandroid/widget/LinearLayout$LayoutParams;)V
    .locals 2

    .line 246
    instance-of v0, p1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    if-nez v0, :cond_0

    .line 247
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->TAG:Ljava/lang/String;

    const-string v1, "illegal to addView by this method"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 249
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 251
    :goto_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 834
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {v0, p0}, Lhuawei/widget/effect/engine/HwBlurEngine;->isShowHwBlur(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 835
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {v0, p1, p0}, Lhuawei/widget/effect/engine/HwBlurEngine;->draw(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 836
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 838
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 840
    :goto_0
    return-void
.end method

.method public isBlurEnable()Z
    .locals 1

    .line 854
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView;->isBlurEnable:Z

    return v0
.end method

.method public isHasMessage(I)Z
    .locals 2

    .line 273
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    if-ge p1, v0, :cond_0

    .line 274
    invoke-virtual {p0, p1}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 275
    invoke-virtual {v1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->isHasMessage()Z

    move-result v0

    return v0

    .line 277
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public notifyDotMessage(IZ)V
    .locals 2

    .line 260
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    if-ge p1, v0, :cond_0

    .line 261
    invoke-virtual {p0, p1}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 262
    invoke-virtual {v1, p2}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setHasMessage(Z)V

    .line 264
    :cond_0
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 176
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 177
    iget v1, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    .line 178
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 179
    invoke-virtual {p0, v2}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 180
    invoke-direct {p0}, Lhuawei/widget/HwBottomNavigationView;->isLand()Z

    move-result v0

    invoke-virtual {v3, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setDirection(Z)V

    .line 178
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 182
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 26

    .line 312
    invoke-direct/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->isLand()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 313
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 314
    const/4 v6, 0x0

    .line 315
    invoke-direct/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->isLayoutRtl()Z

    move-result v7

    .line 316
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->getPaddingTop()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->getPaddingBottom()I

    move-result v1

    add-int v8, v0, v1

    .line 317
    move/from16 v0, p2

    const/4 v1, -0x2

    invoke-static {v0, v8, v1}, Lhuawei/widget/HwBottomNavigationView;->getChildMeasureSpec(III)I

    move-result v9

    .line 319
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->getChildCount()I

    move-result v10

    .line 320
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_1

    .line 321
    int-to-float v0, v5

    int-to-float v1, v10

    div-float v12, v0, v1

    .line 322
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 323
    float-to-int v0, v12

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v13, v0, v9}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 326
    invoke-virtual {v13}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getContainer()Landroid/widget/LinearLayout;

    move-result-object v14

    .line 327
    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v14, v1, v2}, Lhuawei/widget/HwBottomNavigationView;->setMarginHorizontal(Landroid/view/View;II)V

    .line 328
    invoke-virtual {v13}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getMeasuredHeight()I

    move-result v15

    .line 329
    if-le v15, v6, :cond_0

    .line 330
    move v6, v15

    .line 332
    :cond_0
    float-to-int v0, v12

    move-object/from16 v1, p0

    invoke-direct {v1, v13, v0}, Lhuawei/widget/HwBottomNavigationView;->setStableWidth(Landroid/view/View;I)V

    .line 320
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 336
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 337
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v6, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 336
    move-object/from16 v2, p0

    invoke-super {v2, v0, v1}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 338
    goto/16 :goto_8

    .line 339
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 340
    const/4 v6, 0x0

    .line 341
    const/4 v7, 0x0

    .line 342
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    .line 343
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->getChildCount()I

    move-result v9

    .line 344
    if-nez v9, :cond_3

    .line 345
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-virtual {v0, v8, v1}, Lhuawei/widget/HwBottomNavigationView;->setMeasuredDimension(II)V

    .line 346
    return-void

    .line 348
    :cond_3
    int-to-float v0, v8

    int-to-float v1, v9

    div-float v10, v0, v1

    .line 349
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->getPaddingTop()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwBottomNavigationView;->getPaddingBottom()I

    move-result v1

    add-int v11, v0, v1

    .line 350
    move/from16 v0, p2

    const/4 v1, -0x2

    invoke-static {v0, v11, v1}, Lhuawei/widget/HwBottomNavigationView;->getChildMeasureSpec(III)I

    move-result v12

    .line 353
    const/4 v0, 0x2

    if-eq v9, v0, :cond_4

    const/4 v0, 0x1

    if-ne v9, v0, :cond_8

    .line 354
    :cond_4
    const/4 v13, 0x0

    :goto_1
    if-ge v13, v9, :cond_7

    .line 355
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 356
    float-to-int v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v14, v0, v12}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 358
    float-to-int v0, v10

    move-object/from16 v1, p0

    invoke-direct {v1, v14, v0}, Lhuawei/widget/HwBottomNavigationView;->setStableWidth(Landroid/view/View;I)V

    .line 359
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getContainer()Landroid/widget/LinearLayout;

    move-result-object v15

    .line 360
    invoke-virtual {v15}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    .line 362
    move-object/from16 v0, v16

    instance-of v0, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_5

    .line 363
    move-object/from16 v17, v16

    check-cast v17, Landroid/widget/LinearLayout$LayoutParams;

    .line 364
    const/4 v0, 0x1

    move-object/from16 v1, v17

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 365
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 367
    :cond_5
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getMeasuredHeight()I

    move-result v18

    .line 368
    move/from16 v0, v18

    if-le v0, v7, :cond_6

    .line 369
    move/from16 v7, v18

    .line 354
    :cond_6
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 372
    :cond_7
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v8, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 373
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v7, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 372
    move-object/from16 v2, p0

    invoke-super {v2, v0, v1}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 374
    return-void

    .line 377
    :cond_8
    const/4 v13, 0x0

    :goto_2
    if-ge v13, v9, :cond_9

    .line 378
    move-object/from16 v0, p0

    invoke-direct {v0, v5, v13, v10}, Lhuawei/widget/HwBottomNavigationView;->generateOffsetList(Ljava/util/List;IF)V

    .line 377
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 384
    :cond_9
    const/4 v13, 0x0

    :goto_3
    if-ge v13, v9, :cond_12

    .line 385
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 387
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v15

    .line 388
    const/4 v0, 0x0

    cmpg-float v0, v15, v0

    if-gez v0, :cond_11

    .line 389
    const/16 v16, 0x0

    .line 390
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getIcon()Landroid/widget/ImageView;

    move-result-object v17

    .line 391
    invoke-virtual/range {v17 .. v17}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v18

    .line 393
    move-object/from16 v0, v18

    instance-of v0, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_a

    .line 394
    move-object/from16 v19, v18

    check-cast v19, Landroid/widget/LinearLayout$LayoutParams;

    .line 395
    const/4 v0, 0x1

    move-object/from16 v1, v19

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 396
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, v19

    invoke-direct {v0, v1, v2, v3, v4}, Lhuawei/widget/HwBottomNavigationView;->setMarginHorizontal(Landroid/view/View;IILandroid/view/ViewGroup$MarginLayoutParams;)V

    .line 398
    :cond_a
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lhuawei/widget/HwBottomNavigationView;->setMarginHorizontal(Landroid/view/View;II)V

    .line 399
    if-eqz v13, :cond_b

    add-int/lit8 v0, v9, -0x1

    if-ne v13, v0, :cond_c

    .line 400
    :cond_b
    float-to-int v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v14, v0, v12}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 402
    float-to-int v0, v10

    move/from16 v16, v0

    goto/16 :goto_5

    .line 404
    :cond_c
    add-int/lit8 v0, v13, -0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v20

    .line 405
    add-int/lit8 v0, v13, 0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v21

    .line 406
    const/4 v0, 0x0

    cmpg-float v0, v20, v0

    if-ltz v0, :cond_d

    const/4 v0, 0x0

    cmpg-float v0, v21, v0

    if-gez v0, :cond_e

    .line 407
    :cond_d
    float-to-int v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v14, v0, v12}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 409
    float-to-int v0, v10

    move/from16 v16, v0

    goto/16 :goto_5

    .line 411
    :cond_e
    cmpl-float v0, v20, v21

    if-lez v0, :cond_f

    move/from16 v22, v21

    goto :goto_4

    :cond_f
    move/from16 v22, v20

    .line 413
    :goto_4
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v15, v0

    add-float v23, v22, v0

    .line 414
    add-int/lit8 v0, v13, -0x1

    .line 415
    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 416
    add-int/lit8 v0, v13, 0x1

    .line 417
    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 418
    const/4 v0, 0x0

    cmpl-float v0, v23, v0

    if-lez v0, :cond_10

    .line 419
    sub-float v0, v10, v15

    float-to-int v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v14, v0, v12}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 421
    neg-float v0, v15

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v24

    iput v0, v1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    .line 422
    neg-float v0, v15

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v25

    iput v0, v1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    .line 423
    sub-float v0, v10, v15

    float-to-int v1, v0

    move/from16 v16, v1

    goto :goto_5

    .line 425
    :cond_10
    const/high16 v0, 0x40000000    # 2.0f

    mul-float v0, v0, v22

    add-float/2addr v0, v10

    float-to-int v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v14, v0, v12}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 427
    move/from16 v0, v22

    move-object/from16 v1, v24

    iput v0, v1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    .line 428
    move/from16 v0, v22

    move-object/from16 v1, v25

    iput v0, v1, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    .line 429
    const/high16 v0, 0x40000000    # 2.0f

    mul-float v0, v0, v22

    add-float/2addr v0, v10

    float-to-int v1, v0

    move/from16 v16, v1

    .line 433
    :goto_5
    const/4 v0, 0x1

    iput-boolean v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mHasMeasured:Z

    .line 434
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v14, v1}, Lhuawei/widget/HwBottomNavigationView;->setStableWidth(Landroid/view/View;I)V

    .line 435
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v6, v0

    .line 436
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getMeasuredHeight()I

    move-result v20

    .line 437
    move/from16 v0, v20

    if-le v0, v7, :cond_11

    .line 438
    move/from16 v7, v20

    .line 384
    :cond_11
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_3

    .line 446
    :cond_12
    const/4 v13, 0x0

    :goto_6
    if-ge v13, v9, :cond_16

    .line 447
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 448
    iget-boolean v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mHasMeasured:Z

    if-eqz v0, :cond_13

    .line 449
    const/4 v0, 0x0

    iput-boolean v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mHasMeasured:Z

    .line 450
    goto/16 :goto_7

    .line 452
    :cond_13
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v15

    .line 453
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getContainer()Landroid/widget/LinearLayout;

    move-result-object v16

    .line 454
    iget v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    sub-float v0, v15, v0

    float-to-int v0, v0

    iget v1, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    sub-float v1, v15, v1

    float-to-int v1, v1

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    invoke-direct {v2, v3, v0, v1}, Lhuawei/widget/HwBottomNavigationView;->setMarginHorizontal(Landroid/view/View;II)V

    .line 457
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getIcon()Landroid/widget/ImageView;

    move-result-object v17

    .line 459
    invoke-virtual/range {v17 .. v17}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v19

    .line 460
    move-object/from16 v0, v19

    instance-of v0, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_14

    .line 461
    move-object/from16 v18, v19

    check-cast v18, Landroid/widget/LinearLayout$LayoutParams;

    .line 462
    const/4 v0, 0x0

    move-object/from16 v1, v18

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 463
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwBottomNavigationView;->mIconBounds:I

    int-to-float v0, v0

    sub-float v0, v10, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwBottomNavigationView;->mIconBounds:I

    int-to-float v1, v1

    sub-float v1, v10, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    move-object/from16 v2, p0

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    invoke-direct {v2, v3, v0, v1, v4}, Lhuawei/widget/HwBottomNavigationView;->setMarginHorizontal(Landroid/view/View;IILandroid/view/ViewGroup$MarginLayoutParams;)V

    .line 466
    :cond_14
    iget v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    sub-float v0, v10, v0

    iget v1, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v14, v0, v12}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->measure(II)V

    .line 468
    iget v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    sub-float v0, v10, v0

    iget v1, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, p0

    invoke-direct {v1, v14, v0}, Lhuawei/widget/HwBottomNavigationView;->setStableWidth(Landroid/view/View;I)V

    .line 469
    const/4 v0, 0x0

    iput v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mStartRent:F

    .line 470
    const/4 v0, 0x0

    iput v0, v14, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->mEndRent:F

    .line 471
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v6, v0

    .line 472
    invoke-virtual {v14}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->getMeasuredHeight()I

    move-result v20

    .line 473
    move/from16 v0, v20

    if-le v0, v7, :cond_15

    .line 474
    move/from16 v7, v20

    .line 446
    :cond_15
    :goto_7
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_6

    .line 478
    :cond_16
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v6, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 479
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v7, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 478
    move-object/from16 v2, p0

    invoke-super {v2, v0, v1}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 481
    :goto_8
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 3

    .line 844
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowVisibilityChanged(I)V

    .line 845
    if-nez p1, :cond_0

    .line 846
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    const-string v2, "LightBlurWithGray"

    invoke-virtual {v1, v2}, Lhuawei/widget/effect/engine/HwBlurEngine;->getBlurType(Ljava/lang/String;)Lo/fkx$a;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lhuawei/widget/effect/engine/HwBlurEngine;->addBlurTargetView(Landroid/view/View;Lo/fkx$a;)V

    .line 847
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView;->isBlurEnable()Z

    move-result v1

    invoke-virtual {v0, p0, v1}, Lhuawei/widget/effect/engine/HwBlurEngine;->setTargetViewBlurEnable(Landroid/view/View;Z)V

    goto :goto_0

    .line 849
    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {v0, p0}, Lhuawei/widget/effect/engine/HwBlurEngine;->removeBlurTargetView(Landroid/view/View;)V

    .line 851
    :goto_0
    return-void
.end method

.method public removeMenuItems()V
    .locals 1

    .line 585
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    .line 586
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenu:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 587
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    .line 588
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView;->removeAllViews()V

    .line 589
    return-void
.end method

.method public setBlurEnable(Z)V
    .locals 2

    .line 858
    iput-boolean p1, p0, Lhuawei/widget/HwBottomNavigationView;->isBlurEnable:Z

    .line 859
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView;->mBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView;->isBlurEnable()Z

    move-result v1

    invoke-virtual {v0, p0, v1}, Lhuawei/widget/effect/engine/HwBlurEngine;->setTargetViewBlurEnable(Landroid/view/View;Z)V

    .line 860
    return-void
.end method

.method public setBottomNavListener(Lhuawei/widget/HwBottomNavigationView$BottomNavListener;)V
    .locals 0

    .line 562
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView;->mListener:Lhuawei/widget/HwBottomNavigationView$BottomNavListener;

    .line 563
    return-void
.end method

.method public setItemChecked(I)V
    .locals 4

    .line 572
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView;->getChildCount()I

    move-result v2

    .line 574
    if-ltz p1, :cond_1

    if-ge p1, v2, :cond_1

    .line 575
    invoke-virtual {p0, p1}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 576
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mLastSelectItem:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setChecked(ZZ)V

    .line 577
    const/4 v0, 0x0

    invoke-direct {p0, v3, v0}, Lhuawei/widget/HwBottomNavigationView;->changeItem(Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;Z)V

    .line 579
    :cond_1
    return-void
.end method

.method public setMessageBgColor(I)V
    .locals 3

    .line 286
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView;->mMessageBgColor:I

    .line 287
    const/4 v1, 0x0

    :goto_0
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView;->mMenuSize:I

    if-ge v1, v0, :cond_0

    .line 288
    invoke-virtual {p0, v1}, Lhuawei/widget/HwBottomNavigationView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;

    .line 289
    invoke-virtual {v2, p1}, Lhuawei/widget/HwBottomNavigationView$BottomNavigationItemView;->setMsgBgColor(I)V

    .line 287
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 291
    :cond_0
    return-void
.end method

.method public setPortLayout(Z)V
    .locals 1

    .line 194
    iget-boolean v0, p0, Lhuawei/widget/HwBottomNavigationView;->mPortLayout:Z

    if-eq v0, p1, :cond_0

    .line 195
    iput-boolean p1, p0, Lhuawei/widget/HwBottomNavigationView;->mPortLayout:Z

    .line 196
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView;->requestLayout()V

    .line 198
    :cond_0
    return-void
.end method
