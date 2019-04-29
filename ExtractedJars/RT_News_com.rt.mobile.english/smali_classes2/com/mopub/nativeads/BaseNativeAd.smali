.class public abstract Lcom/mopub/nativeads/BaseNativeAd;
.super Ljava/lang/Object;
.source "BaseNativeAd.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;
    }
.end annotation


# instance fields
.field private final mClickTrackers:Ljava/util/Set;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mImpressionTrackers:Ljava/util/Set;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mNativeEventListener:Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mImpressionTrackers:Ljava/util/Set;

    .line 34
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mClickTrackers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final addClickTracker(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "clickTracker url is not allowed to be null"

    .line 131
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mClickTrackers:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final addClickTrackers(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassCastException;
        }
    .end annotation

    .line 108
    instance-of v0, p1, Lorg/json/JSONArray;

    if-nez v0, :cond_0

    .line 109
    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "Expected click trackers of type JSONArray."

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_0
    check-cast p1, Lorg/json/JSONArray;

    const/4 v0, 0x0

    .line 113
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 115
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/mopub/nativeads/BaseNativeAd;->addClickTracker(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v1, "Unable to parse click trackers."

    .line 118
    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final addImpressionTracker(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "impressionTracker url is not allowed to be null"

    .line 124
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mImpressionTrackers:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final addImpressionTrackers(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassCastException;
        }
    .end annotation

    .line 92
    instance-of v0, p1, Lorg/json/JSONArray;

    if-nez v0, :cond_0

    .line 93
    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "Expected impression trackers of type JSONArray."

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :cond_0
    check-cast p1, Lorg/json/JSONArray;

    const/4 v0, 0x0

    .line 97
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 99
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/mopub/nativeads/BaseNativeAd;->addImpressionTracker(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v1, "Unable to parse impression trackers."

    .line 102
    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract clear(Landroid/view/View;)V
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract destroy()V
.end method

.method getClickTrackers()Ljava/util/Set;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 156
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/mopub/nativeads/BaseNativeAd;->mClickTrackers:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method getImpressionTrackers()Ljava/util/Set;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 146
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/mopub/nativeads/BaseNativeAd;->mImpressionTrackers:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected final notifyAdClicked()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mNativeEventListener:Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mNativeEventListener:Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;

    invoke-interface {v0}, Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;->onAdClicked()V

    :cond_0
    return-void
.end method

.method protected final notifyAdImpressed()V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mNativeEventListener:Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/mopub/nativeads/BaseNativeAd;->mNativeEventListener:Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;

    invoke-interface {v0}, Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;->onAdImpressed()V

    :cond_0
    return-void
.end method

.method public abstract prepare(Landroid/view/View;)V
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public setNativeEventListener(Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;)V
    .locals 0
    .param p1    # Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    iput-object p1, p0, Lcom/mopub/nativeads/BaseNativeAd;->mNativeEventListener:Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;

    return-void
.end method
