.class public Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;
.super Landroid/support/constraint/ConstraintLayout;
.source "GridCardView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;
    }
.end annotation


# instance fields
.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->initView()V

    return-void
.end method

.method private initClickable()V
    .locals 1

    const/4 v0, 0x1

    .line 51
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->setClickable(Z)V

    const/4 v0, 0x0

    .line 52
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    return-void
.end method

.method private initView()V
    .locals 3

    .line 42
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;)V

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0161

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 45
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->initClickable()V

    return-void
.end method


# virtual methods
.method public updateViewModel(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;)V
    .locals 4

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->getGridCardClickListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 57
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->ivIcon:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->CARD_SMALL:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method
