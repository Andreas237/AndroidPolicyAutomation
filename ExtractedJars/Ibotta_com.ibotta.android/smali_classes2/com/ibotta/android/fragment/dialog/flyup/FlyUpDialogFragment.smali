.class public Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "FlyUpDialogFragment.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;,
        Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;,
        Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;
    }
.end annotation


# static fields
.field private static final KEY_BLOCK_SWIPE:Ljava/lang/String; = "block_swipe"

.field private static final KEY_FULLSCREEN:Ljava/lang/String; = "fullscreen"

.field private static final KEY_LAYOUT_TYPE:Ljava/lang/String; = "layout_type"

.field private static final KEY_SCHEME:Ljava/lang/String; = "scheme"

.field private static final KEY_START_PAGE:Ljava/lang/String; = "start_page"

.field public static final LAYOUT_TYPE_DYNAMIC:I = 0x0

.field public static final LAYOUT_TYPE_STATIC:I = 0x1


# instance fields
.field private adapter:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

.field private blockSwipe:Z

.field private creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

.field private dialog:Landroid/app/Dialog;

.field private layoutType:I

.field private scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

.field private shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

.field private startPage:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->blockSwipe:Z

    const/4 v0, -0x1

    .line 45
    iput v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->startPage:I

    .line 46
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    return-void
.end method

.method private static buildArgs(IZZLcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;)Landroid/os/Bundle;
    .locals 2

    .line 111
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "layout_type"

    .line 112
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "fullscreen"

    .line 113
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "block_swipe"

    .line 114
    invoke-virtual {v0, p0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-nez p3, :cond_0

    .line 116
    sget-object p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    :cond_0
    const-string p0, "scheme"

    .line 118
    invoke-virtual {p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic lambda$onCreateDialog$1(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    .line 279
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 280
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onTrapClose(Z)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic lambda$onCreateView$0(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    .line 211
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onTrapClose(Z)V

    return-void
.end method

.method public static newInstance()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 86
    invoke-static {v0, v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(IZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
    .locals 1

    const/4 v0, 0x1

    .line 90
    invoke-static {p0, v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(IZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(IZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
    .locals 1

    const/4 v0, 0x0

    .line 94
    invoke-static {p0, v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(IZZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(IZZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
    .locals 2

    .line 98
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;-><init>()V

    .line 99
    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-static {p0, p1, p2, v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->buildArgs(IZZLcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static newInstance(IZZLcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
    .locals 1

    .line 105
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;-><init>()V

    .line 106
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->buildArgs(IZZLcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private onTrapClose(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 353
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 354
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {p1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getCurrentItem()I

    move-result p1

    .line 355
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->getData()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    if-eqz p1, :cond_0

    .line 356
    iget-boolean p1, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->prevPageOnBack:Z

    if-eqz p1, :cond_0

    .line 357
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onPreviousClicked()V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 363
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;

    if-eqz v0, :cond_1

    .line 364
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getCurrentItem()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;->onFlyUpCancel(Ljava/lang/String;I)Z

    move-result p1

    :cond_1
    if-eqz p1, :cond_2

    .line 367
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 368
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dismissAllowingStateLoss()V

    :cond_2
    return-void
.end method


# virtual methods
.method public getAdapter()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->adapter:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    return-object v0
.end method

.method public getCreator()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    return-object v0
.end method

.method public goToPage(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 329
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setCurrentItem(IZ)V

    .line 331
    iget p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->startPage:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onPageSelected(I)V

    :cond_0
    return-void
.end method

.method public onCancelClicked()V
    .locals 1

    const/4 v0, 0x0

    .line 312
    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onTrapClose(Z)V

    return-void
.end method

.method public onCloseClicked()V
    .locals 1

    const/4 v0, 0x0

    .line 317
    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onTrapClose(Z)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 132
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x7f120283

    .line 134
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 264
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    .line 265
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 266
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const v0, 0x7f120185

    invoke-virtual {p1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 269
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 270
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "fullscreen"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    :cond_0
    if-eqz v1, :cond_1

    .line 274
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 278
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpDialogFragment$SP-Mp6yMChhBjsJyOHdwozlyHEM;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpDialogFragment$SP-Mp6yMChhBjsJyOHdwozlyHEM;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 285
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dialog:Landroid/app/Dialog;

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 15

    move-object v8, p0

    move-object/from16 v0, p3

    const/4 v9, 0x0

    .line 139
    invoke-virtual {p0, v9}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setCancelable(Z)V

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const-string v4, "layout_type"

    .line 143
    invoke-virtual {v0, v4, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->layoutType:I

    const-string v4, "block_swipe"

    .line 144
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->blockSwipe:Z

    const-string v4, "start_page"

    .line 145
    invoke-virtual {v0, v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->startPage:I

    const-string v4, "scheme"

    .line 146
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 148
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v4, "layout_type"

    invoke-virtual {v0, v4, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->layoutType:I

    .line 149
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v4, "block_swipe"

    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->blockSwipe:Z

    .line 150
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v4, "scheme"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    .line 155
    :try_start_0
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    move-result-object v0

    iput-object v0, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 158
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    iput-object v0, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    goto :goto_1

    .line 161
    :cond_2
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    iput-object v0, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    :goto_1
    const v0, 0x7f0c00ee

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    .line 164
    invoke-virtual {v4, v0, v5, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v4, 0x7f0901fc

    .line 166
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    const v5, 0x7f090594

    .line 167
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f0902d2

    .line 168
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    const v7, 0x7f0901fd

    .line 170
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    const v10, 0x7f090595

    .line 171
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    const v11, 0x7f0902d3

    .line 172
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/ImageView;

    .line 174
    new-instance v12, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-direct {v12, v4, v5, v6, v3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$1;)V

    .line 175
    new-instance v4, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-direct {v4, v7, v10, v11, v3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$1;)V

    const v3, 0x7f0901ee

    .line 177
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v5, 0x7f09031d

    .line 178
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Landroid/widget/LinearLayout;

    const v5, 0x7f090411

    .line 179
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    iput-object v5, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    const v5, 0x7f090172

    .line 180
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;

    .line 182
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget-object v6, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-virtual {v6}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->getBgColorId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v10, v5}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 183
    iget-object v5, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setOffscreenPageLimit(I)V

    .line 184
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget-object v6, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-virtual {v6}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->getFilledColorId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v11, v5}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setFillColor(I)V

    .line 185
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget-object v6, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-virtual {v6}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->getUnfilledColorId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v11, v5}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setPageColor(I)V

    .line 187
    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 188
    invoke-virtual {v10}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 189
    iget-object v7, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v7}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 191
    iget v13, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->layoutType:I

    const/high16 v14, 0x3f800000    # 1.0f

    if-ne v13, v2, :cond_3

    .line 192
    iput v9, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const v2, 0x3e4ccccd    # 0.2f

    .line 193
    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 195
    iput v9, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const v2, 0x3f4ccccd    # 0.8f

    .line 196
    iput v2, v6, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 198
    iput v1, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 199
    iput v14, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    goto :goto_2

    .line 201
    :cond_3
    iput v9, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 202
    iput v14, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v1, -0x2

    .line 204
    iput v1, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v2, 0x0

    .line 205
    iput v2, v6, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 207
    iput v1, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 208
    iput v2, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 211
    :goto_2
    new-instance v1, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpDialogFragment$u4wktXp_S-r0Jianu3NB5qko-fY;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpDialogFragment$u4wktXp_S-r0Jianu3NB5qko-fY;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;)V

    instance-of v2, v3, Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {v3, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_4
    check-cast v3, Landroid/view/View;

    invoke-static {v3, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 213
    :goto_3
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    iget-boolean v2, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->blockSwipe:Z

    invoke-virtual {v1, v2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setBlockSwipe(Z)V

    .line 215
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v1, v1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;

    if-eqz v1, :cond_7

    .line 216
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast v1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;->getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    move-result-object v1

    iput-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    .line 218
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    if-eqz v1, :cond_7

    .line 219
    invoke-interface {v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->getFlyUpData()Ljava/util/List;

    move-result-object v5

    .line 220
    new-instance v13, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v6, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    move-object v1, v13

    move-object v3, v12

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;Ljava/util/Collection;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    iput-object v13, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->adapter:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    .line 221
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    iget-object v2, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->adapter:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 222
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    iget-object v2, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    invoke-interface {v2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->getOffscreenPageLimit()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setOffscreenPageLimit(I)V

    .line 223
    iget v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->startPage:I

    if-ltz v1, :cond_5

    .line 224
    invoke-virtual {p0, v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->goToPage(I)V

    goto :goto_4

    .line 226
    :cond_5
    invoke-virtual {p0, v9}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->onPageSelected(I)V

    .line 229
    :goto_4
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->isUsePageIndicator()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 230
    invoke-virtual {v11, v9}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setVisibility(I)V

    .line 231
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v11, v1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 232
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v1, v11}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 233
    invoke-virtual {v11, p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    goto :goto_5

    :cond_6
    const/16 v1, 0x8

    .line 235
    invoke-virtual {v11, v1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setVisibility(I)V

    .line 236
    iget-object v1, v8, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v1, p0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 241
    :cond_7
    :goto_5
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f01000c

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 242
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f01001b

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v10, v1}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-object v0
.end method

.method public onNextClicked()V
    .locals 3

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 303
    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getCurrentItem()I

    move-result v2

    add-int/2addr v2, v1

    if-ge v2, v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0, v2, v1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setCurrentItem(IZ)V

    :cond_0
    return-void
.end method

.method public onPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 2

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;->onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    :cond_0
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    if-eqz v0, :cond_0

    .line 379
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->setCurrentPage(I)V

    :cond_0
    return-void
.end method

.method public onPreviousClicked()V
    .locals 3

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 292
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getCurrentItem()I

    move-result v0

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    .line 294
    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v2, v0, v1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setCurrentItem(IZ)V

    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 248
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->dismissAllowingStateLoss()V

    .line 249
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    if-nez v0, :cond_0

    .line 252
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    .line 255
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "layout_type"

    .line 256
    iget v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->layoutType:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "block_swipe"

    .line 257
    iget-boolean v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->blockSwipe:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "start_page"

    .line 258
    iget v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->startPage:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "scheme"

    .line 259
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->scheme:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public reloadControls()V
    .locals 2

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->setCurrentPage(I)V

    :cond_0
    return-void
.end method

.method public setPageMargin(I)V
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->shvpPages:Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setPageMargin(I)V

    return-void
.end method

.method public setStartPage(I)V
    .locals 0

    .line 337
    iput p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->startPage:I

    return-void
.end method
