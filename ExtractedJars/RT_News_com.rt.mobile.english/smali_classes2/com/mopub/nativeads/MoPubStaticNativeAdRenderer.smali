.class public Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;
.super Ljava/lang/Object;
.source "MoPubStaticNativeAdRenderer.java"

# interfaces
.implements Lcom/mopub/nativeads/MoPubAdRenderer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mopub/nativeads/MoPubAdRenderer<",
        "Lcom/mopub/nativeads/StaticNativeAd;",
        ">;"
    }
.end annotation


# instance fields
.field private final mViewBinder:Lcom/mopub/nativeads/ViewBinder;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field final mViewHolderMap:Ljava/util/WeakHashMap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/StaticNativeViewHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mopub/nativeads/ViewBinder;)V
    .locals 0
    .param p1    # Lcom/mopub/nativeads/ViewBinder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewBinder:Lcom/mopub/nativeads/ViewBinder;

    .line 34
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewHolderMap:Ljava/util/WeakHashMap;

    return-void
.end method

.method private setViewVisibility(Lcom/mopub/nativeads/StaticNativeViewHolder;I)V
    .locals 1
    .param p1    # Lcom/mopub/nativeads/StaticNativeViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 86
    iget-object v0, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->mainView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 87
    iget-object p1, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->mainView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private update(Lcom/mopub/nativeads/StaticNativeViewHolder;Lcom/mopub/nativeads/StaticNativeAd;)V
    .locals 2
    .param p1    # Lcom/mopub/nativeads/StaticNativeViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/StaticNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 69
    iget-object v0, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->titleView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeRendererHelper;->addTextView(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 71
    iget-object v0, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeRendererHelper;->addTextView(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 72
    iget-object v0, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->callToActionView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getCallToAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeRendererHelper;->addTextView(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getMainImageUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->mainImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeImageHelper;->loadImageView(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 76
    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->iconImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeImageHelper;->loadImageView(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 78
    iget-object p1, p1, Lcom/mopub/nativeads/StaticNativeViewHolder;->privacyInformationIconImageView:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getPrivacyInformationIconImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getPrivacyInformationIconClickThroughUrl()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/mopub/nativeads/NativeRendererHelper;->addPrivacyInformationIcon(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAdView(Landroid/app/Activity;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 40
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewBinder:Lcom/mopub/nativeads/ViewBinder;

    iget v0, v0, Lcom/mopub/nativeads/ViewBinder;->layoutId:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic renderAdView(Landroid/view/View;Lcom/mopub/nativeads/BaseNativeAd;)V
    .locals 0

    .line 20
    check-cast p2, Lcom/mopub/nativeads/StaticNativeAd;

    invoke-virtual {p0, p1, p2}, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->renderAdView(Landroid/view/View;Lcom/mopub/nativeads/StaticNativeAd;)V

    return-void
.end method

.method public renderAdView(Landroid/view/View;Lcom/mopub/nativeads/StaticNativeAd;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/StaticNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 48
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewHolderMap:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/StaticNativeViewHolder;

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewBinder:Lcom/mopub/nativeads/ViewBinder;

    invoke-static {p1, v0}, Lcom/mopub/nativeads/StaticNativeViewHolder;->fromViewBinder(Landroid/view/View;Lcom/mopub/nativeads/ViewBinder;)Lcom/mopub/nativeads/StaticNativeViewHolder;

    move-result-object v0

    .line 51
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewHolderMap:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    :cond_0
    invoke-direct {p0, v0, p2}, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->update(Lcom/mopub/nativeads/StaticNativeViewHolder;Lcom/mopub/nativeads/StaticNativeAd;)V

    .line 55
    iget-object p1, v0, Lcom/mopub/nativeads/StaticNativeViewHolder;->mainView:Landroid/view/View;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->mViewBinder:Lcom/mopub/nativeads/ViewBinder;

    iget-object v1, v1, Lcom/mopub/nativeads/ViewBinder;->extras:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/mopub/nativeads/StaticNativeAd;->getExtras()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, v1, p2}, Lcom/mopub/nativeads/NativeRendererHelper;->updateExtras(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V

    const/4 p1, 0x0

    .line 58
    invoke-direct {p0, v0, p1}, Lcom/mopub/nativeads/MoPubStaticNativeAdRenderer;->setViewVisibility(Lcom/mopub/nativeads/StaticNativeViewHolder;I)V

    return-void
.end method

.method public supports(Lcom/mopub/nativeads/BaseNativeAd;)Z
    .locals 0
    .param p1    # Lcom/mopub/nativeads/BaseNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 63
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 64
    instance-of p1, p1, Lcom/mopub/nativeads/StaticNativeAd;

    return p1
.end method
