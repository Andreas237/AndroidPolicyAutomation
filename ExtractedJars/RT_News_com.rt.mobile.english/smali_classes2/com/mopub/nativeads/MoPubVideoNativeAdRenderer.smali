.class public Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;
.super Ljava/lang/Object;
.source "MoPubVideoNativeAdRenderer.java"

# interfaces
.implements Lcom/mopub/nativeads/MoPubAdRenderer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mopub/nativeads/MoPubAdRenderer<",
        "Lcom/mopub/nativeads/VideoNativeAd;",
        ">;"
    }
.end annotation


# instance fields
.field private final mMediaViewBinder:Lcom/mopub/nativeads/MediaViewBinder;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field final mMediaViewHolderMap:Ljava/util/WeakHashMap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/MediaViewHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mopub/nativeads/MediaViewBinder;)V
    .locals 0
    .param p1    # Lcom/mopub/nativeads/MediaViewBinder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewBinder:Lcom/mopub/nativeads/MediaViewBinder;

    .line 32
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewHolderMap:Ljava/util/WeakHashMap;

    return-void
.end method

.method private setViewVisibility(Lcom/mopub/nativeads/MediaViewHolder;I)V
    .locals 1
    .param p1    # Lcom/mopub/nativeads/MediaViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 88
    iget-object v0, p1, Lcom/mopub/nativeads/MediaViewHolder;->mainView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 89
    iget-object p1, p1, Lcom/mopub/nativeads/MediaViewHolder;->mainView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private update(Lcom/mopub/nativeads/MediaViewHolder;Lcom/mopub/nativeads/VideoNativeAd;)V
    .locals 3
    .param p1    # Lcom/mopub/nativeads/MediaViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/VideoNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 68
    iget-object v0, p1, Lcom/mopub/nativeads/MediaViewHolder;->titleView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeRendererHelper;->addTextView(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 70
    iget-object v0, p1, Lcom/mopub/nativeads/MediaViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeRendererHelper;->addTextView(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 71
    iget-object v0, p1, Lcom/mopub/nativeads/MediaViewHolder;->callToActionView:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/mopub/nativeads/MediaViewHolder;->mainView:Landroid/view/View;

    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getCallToAction()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/mopub/nativeads/NativeRendererHelper;->addCtaButton(Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;)V

    .line 74
    iget-object v0, p1, Lcom/mopub/nativeads/MediaViewHolder;->mediaLayout:Lcom/mopub/nativeads/MediaLayout;

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getMainImageUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/mopub/nativeads/MediaViewHolder;->mediaLayout:Lcom/mopub/nativeads/MediaLayout;

    invoke-virtual {v1}, Lcom/mopub/nativeads/MediaLayout;->getMainImageView()Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeImageHelper;->loadImageView(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 78
    :cond_0
    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/mopub/nativeads/MediaViewHolder;->iconImageView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/mopub/nativeads/NativeImageHelper;->loadImageView(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 80
    iget-object p1, p1, Lcom/mopub/nativeads/MediaViewHolder;->privacyInformationIconImageView:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getPrivacyInformationIconImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getPrivacyInformationIconClickThroughUrl()Ljava/lang/String;

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

    .line 38
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewBinder:Lcom/mopub/nativeads/MediaViewBinder;

    iget v0, v0, Lcom/mopub/nativeads/MediaViewBinder;->layoutId:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic renderAdView(Landroid/view/View;Lcom/mopub/nativeads/BaseNativeAd;)V
    .locals 0

    .line 17
    check-cast p2, Lcom/mopub/nativeads/VideoNativeAd;

    invoke-virtual {p0, p1, p2}, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->renderAdView(Landroid/view/View;Lcom/mopub/nativeads/VideoNativeAd;)V

    return-void
.end method

.method public renderAdView(Landroid/view/View;Lcom/mopub/nativeads/VideoNativeAd;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/VideoNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 46
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewHolderMap:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/MediaViewHolder;

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewBinder:Lcom/mopub/nativeads/MediaViewBinder;

    invoke-static {p1, v0}, Lcom/mopub/nativeads/MediaViewHolder;->fromViewBinder(Landroid/view/View;Lcom/mopub/nativeads/MediaViewBinder;)Lcom/mopub/nativeads/MediaViewHolder;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewHolderMap:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_0
    invoke-direct {p0, v0, p2}, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->update(Lcom/mopub/nativeads/MediaViewHolder;Lcom/mopub/nativeads/VideoNativeAd;)V

    .line 53
    iget-object v1, v0, Lcom/mopub/nativeads/MediaViewHolder;->mainView:Landroid/view/View;

    iget-object v2, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewBinder:Lcom/mopub/nativeads/MediaViewBinder;

    iget-object v2, v2, Lcom/mopub/nativeads/MediaViewBinder;->extras:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/mopub/nativeads/VideoNativeAd;->getExtras()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/mopub/nativeads/NativeRendererHelper;->updateExtras(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V

    const/4 v1, 0x0

    .line 54
    invoke-direct {p0, v0, v1}, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->setViewVisibility(Lcom/mopub/nativeads/MediaViewHolder;I)V

    .line 56
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubVideoNativeAdRenderer;->mMediaViewBinder:Lcom/mopub/nativeads/MediaViewBinder;

    iget v0, v0, Lcom/mopub/nativeads/MediaViewBinder;->mediaLayoutId:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/mopub/nativeads/MediaLayout;

    .line 57
    invoke-virtual {p2, p1}, Lcom/mopub/nativeads/VideoNativeAd;->render(Lcom/mopub/nativeads/MediaLayout;)V

    return-void
.end method

.method public supports(Lcom/mopub/nativeads/BaseNativeAd;)Z
    .locals 0
    .param p1    # Lcom/mopub/nativeads/BaseNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 62
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 63
    instance-of p1, p1, Lcom/mopub/nativeads/VideoNativeAd;

    return p1
.end method
