.class public Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
.super Landroid/widget/FrameLayout;
.source "NavButtonView.java"


# instance fields
.field appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private imDataConnected:Z

.field protected ivNavIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b7
    .end annotation
.end field

.field protected lavNavBeaconAnimation:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902e6
    .end annotation
.end field

.field private navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private showBuyableGiftCard:Z

.field protected tvNavLabel:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->imDataConnected:Z

    .line 43
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->showBuyableGiftCard:Z

    .line 61
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private applyAttributes(Landroid/util/AttributeSet;)V
    .locals 3

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/R$styleable;->NavButton:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v0, -0x1

    .line 107
    :try_start_0
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->fromOrdinal(I)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setNavButtonType(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private initLayout(Landroid/util/AttributeSet;)V
    .locals 3

    .line 89
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    const/4 v0, 0x1

    .line 91
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setClickable(Z)V

    .line 92
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0181

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 95
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 97
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->applyAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private onNavButtonSet()V
    .locals 6

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-nez v0, :cond_0

    return-void

    .line 118
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->ivNavIcon:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->imDataConnected:Z

    iget-boolean v5, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->showBuyableGiftCard:Z

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->getIconResId(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->tvNavLabel:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->imDataConnected:Z

    iget-boolean v5, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->showBuyableGiftCard:Z

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->getLabelResId(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 127
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->isTextColorIsStateList()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->tvNavLabel:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->getTextColorResId()I

    move-result v3

    invoke-interface {v2, v0, v3}, Lcom/ibotta/android/util/AppHelper;->getColorStateList(Landroid/content/res/Resources;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->tvNavLabel:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->getTextColorResId()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method

.method public setIconVisible(Z)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->ivNavIcon:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public setNavButtonIcon(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->ivNavIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public setNavButtonType(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->navButtonType:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->onNavButtonSet()V

    return-void
.end method

.method public setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 66
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->imDataConnected:Z

    .line 67
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->showBuyableGiftCard:Z

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->onNavButtonSet()V

    return-void
.end method
