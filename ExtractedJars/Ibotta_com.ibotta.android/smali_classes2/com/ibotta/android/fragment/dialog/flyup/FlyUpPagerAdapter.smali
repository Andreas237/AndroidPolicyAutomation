.class public Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;
.super Lcom/ibotta/android/commons/view/pager/ViewPagerAdapter;
.source "FlyUpPagerAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/pager/ViewPagerAdapter<",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

.field private creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

.field private final fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

.field private final fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;Ljava/util/Collection;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;",
            "Ljava/util/Collection<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;",
            ")V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p4}, Lcom/ibotta/android/commons/view/pager/ViewPagerAdapter;-><init>(Ljava/util/Collection;)V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->context:Landroid/content/Context;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    .line 35
    iput-object p5, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    .line 36
    iput-object p6, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    return-void
.end method

.method private initControl(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;II)V
    .locals 4

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 111
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getTextView()Landroid/widget/TextView;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 112
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x0

    const/4 v2, -0x1

    if-eq p2, v2, :cond_0

    .line 115
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 116
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getImageView()Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    if-eq p3, v2, :cond_1

    .line 122
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getTextView()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 123
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 125
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method private initLeftControl(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 85
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->getImageId()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->getTextId()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->initControl(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;II)V

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpPagerAdapter$M33q1gfTXvpRYejyB4cQUUJ5x4c;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpPagerAdapter$M33q1gfTXvpRYejyB4cQUUJ5x4c;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void

    .line 86
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method private initRightControl(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 97
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->getImageId()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->getTextId()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->initControl(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;II)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpPagerAdapter$RokYlEA5FasFyI6VbpXGKI-g0DM;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/-$$Lambda$FlyUpPagerAdapter$RokYlEA5FasFyI6VbpXGKI-g0DM;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void

    .line 98
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method public static synthetic lambda$initLeftControl$0(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;Landroid/view/View;)V
    .locals 0

    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->onLeftControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)V

    return-void
.end method

.method public static synthetic lambda$initRightControl$1(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;Landroid/view/View;)V
    .locals 0

    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)V

    return-void
.end method

.method private onLeftControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->onLeftControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 139
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    if-eqz v0, :cond_2

    .line 140
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$LeftControl:[I

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 145
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    invoke-interface {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onCancelClicked()V

    goto :goto_0

    .line 142
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    invoke-interface {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onPreviousClicked()V

    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    if-eqz v0, :cond_2

    .line 162
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 177
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    invoke-interface {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onCloseClicked()V

    goto :goto_0

    .line 173
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    invoke-interface {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onCancelClicked()V

    goto :goto_0

    .line 166
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    invoke-interface {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onNextClicked()V

    :cond_2
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getLeftControl()Landroid/widget/FrameLayout;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchLeftControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRightControl()Landroid/widget/FrameLayout;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->fuchRightControl:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method

.method protected makePageView(Landroid/view/LayoutInflater;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Landroid/view/View;
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->getPageLayout()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    if-eqz v1, :cond_0

    .line 61
    invoke-interface {v1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->getPageContentView()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 62
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 64
    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    invoke-interface {v2, p1, v1, p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V

    :cond_0
    return-object v0
.end method

.method protected bridge synthetic makePageView(Landroid/view/LayoutInflater;Ljava/lang/Object;)Landroid/view/View;
    .locals 0

    .line 16
    check-cast p2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->makePageView(Landroid/view/LayoutInflater;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic makePageViewHolder(ILandroid/view/View;Ljava/lang/Object;)Lcom/ibotta/android/commons/view/pager/PageViewHolder;
    .locals 0

    .line 16
    check-cast p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->makePageViewHolder(ILandroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    return-object p1
.end method

.method protected makePageViewHolder(ILandroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 0

    .line 73
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    if-eqz p1, :cond_0

    .line 74
    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    goto :goto_0

    .line 76
    :cond_0
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    .line 78
    :goto_0
    check-cast p2, Landroid/view/ViewGroup;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;->vgPage:Landroid/view/ViewGroup;

    .line 79
    iget-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;->vgPage:Landroid/view/ViewGroup;

    iget-object p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->creator:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    invoke-interface {p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;->getPageContentView()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;->vgContent:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public setCurrentPage(I)V
    .locals 1

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->getData()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->getData()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->getData()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->getData()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 52
    iget-object v0, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->initLeftControl(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)V

    .line 53
    iget-object p1, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;->initRightControl(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
