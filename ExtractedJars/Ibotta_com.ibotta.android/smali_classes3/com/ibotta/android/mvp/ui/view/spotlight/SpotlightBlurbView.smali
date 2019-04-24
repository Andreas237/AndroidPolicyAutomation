.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;
.super Landroid/widget/LinearLayout;
.source "SpotlightBlurbView.java"


# instance fields
.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field protected titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvBlurb:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904fc
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 56
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private applyAttributes(Landroid/util/AttributeSet;)V
    .locals 4

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/R$styleable;->SpotlightBlurb:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 89
    :try_start_0
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-lez v0, :cond_0

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    .line 92
    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private initLayout(Landroid/util/AttributeSet;)V
    .locals 3

    .line 72
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;)V

    const/4 v0, 0x1

    .line 73
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->setOrientation(I)V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01cc

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 78
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->applyAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public setBlurb(Ljava/lang/String;)V
    .locals 2

    .line 64
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->tvBlurb:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->tvBlurb:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
