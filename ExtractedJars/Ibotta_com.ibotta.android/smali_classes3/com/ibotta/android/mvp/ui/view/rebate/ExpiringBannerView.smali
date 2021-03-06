.class public Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;
.super Landroid/widget/FrameLayout;
.source "ExpiringBannerView.java"


# instance fields
.field protected ivBannerEnd:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090293
    .end annotation
.end field

.field protected ivBannerStart:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090294
    .end annotation
.end field

.field protected ivBannerStartOverlay:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090295
    .end annotation
.end field

.field protected llBannerMiddle:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902fd
    .end annotation
.end field

.field protected tvExpirationText:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090521
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 38
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->initLayout()V

    return-void
.end method


# virtual methods
.method protected initLayout()V
    .locals 3

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0156

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 60
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method public setBannerWrappingVisibility(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 65
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStart:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 66
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStartOverlay:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 68
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStart:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStartOverlay:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V
    .locals 1

    .line 74
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView$1;->$SwitchMap$com$ibotta$android$views$content$ContentStyle:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/16 v0, 0x8

    packed-switch p1, :pswitch_data_0

    .line 85
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->tvExpirationText:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 82
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->tvExpirationText:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 79
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->tvExpirationText:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 76
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->tvExpirationText:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
