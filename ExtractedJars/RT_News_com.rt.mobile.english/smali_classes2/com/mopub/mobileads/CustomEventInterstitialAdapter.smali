.class public Lcom/mopub/mobileads/CustomEventInterstitialAdapter;
.super Ljava/lang/Object;
.source "CustomEventInterstitialAdapter.java"

# interfaces
.implements Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;
    }
.end annotation


# static fields
.field public static final DEFAULT_INTERSTITIAL_TIMEOUT_DELAY:I = 0x7530


# instance fields
.field private mContext:Landroid/content/Context;

.field private mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

.field private mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

.field private final mHandler:Landroid/os/Handler;

.field private mInvalidated:Z

.field private mLocalExtras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

.field private mServerExtras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mTimeout:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/MoPubInterstitial;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/MoPubInterstitial;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/mopub/common/AdReport;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/mobileads/MoPubInterstitial;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/mopub/common/AdReport;",
            ")V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {p3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 43
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mHandler:Landroid/os/Handler;

    .line 44
    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    .line 45
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubInterstitial;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mContext:Landroid/content/Context;

    .line 46
    new-instance p1, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$1;

    invoke-direct {p1, p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$1;-><init>(Lcom/mopub/mobileads/CustomEventInterstitialAdapter;)V

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mTimeout:Ljava/lang/Runnable;

    .line 55
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Attempting to invoke custom event: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 57
    :try_start_0
    invoke-static {p2}, Lcom/mopub/mobileads/factories/CustomEventInterstitialFactory;->create(Ljava/lang/String;)Lcom/mopub/mobileads/CustomEventInterstitial;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1, p3}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mServerExtras:Ljava/util/Map;

    .line 65
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubInterstitial;->getLocalExtras()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mLocalExtras:Ljava/util/Map;

    .line 66
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubInterstitial;->getLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 67
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "location"

    iget-object p3, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {p3}, Lcom/mopub/mobileads/MoPubInterstitial;->getLocation()Landroid/location/Location;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_0
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "broadcastIdentifier"

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "mopub-intent-ad-report"

    invoke-interface {p1, p2, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 59
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Couldn\'t locate or instantiate custom event: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 60
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    sget-object p2, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p1, p2}, Lcom/mopub/mobileads/MoPubInterstitial;->onCustomEventInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void
.end method

.method private cancelTimeout()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mTimeout:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private getTimeoutDelayMilliseconds()I
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mMoPubInterstitial:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    return v0

    :cond_1
    :goto_0
    const/16 v0, 0x7530

    return v0
.end method


# virtual methods
.method invalidate()V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    if-eqz v0, :cond_0

    .line 111
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitial;->onInvalidate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Invalidating a custom event interstitial threw an exception."

    .line 113
    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 116
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    .line 117
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mContext:Landroid/content/Context;

    .line 118
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mServerExtras:Ljava/util/Map;

    .line 119
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mLocalExtras:Ljava/util/Map;

    .line 120
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    const/4 v0, 0x1

    .line 121
    iput-boolean v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mInvalidated:Z

    return-void
.end method

.method isInvalidated()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mInvalidated:Z

    return v0
.end method

.method loadInterstitial()V
    .locals 4

    .line 74
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    if-nez v0, :cond_0

    goto :goto_1

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mTimeout:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->getTimeoutDelayMilliseconds()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    iget-object v1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mLocalExtras:Ljava/util/Map;

    iget-object v3, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mServerExtras:Ljava/util/Map;

    invoke-virtual {v0, v1, p0, v2, v3}, Lcom/mopub/mobileads/CustomEventInterstitial;->loadInterstitial(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Loading a custom event interstitial threw an exception."

    .line 85
    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    :goto_0
    return-void

    :cond_1
    :goto_1
    return-void
.end method

.method public onInterstitialClicked()V
    .locals 1

    .line 198
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    if-eqz v0, :cond_1

    .line 203
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;->onCustomEventInterstitialClicked()V

    :cond_1
    return-void
.end method

.method public onInterstitialDismissed()V
    .locals 1

    .line 214
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    if-eqz v0, :cond_1

    .line 219
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;->onCustomEventInterstitialDismissed()V

    :cond_1
    return-void
.end method

.method public onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .line 172
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    .line 178
    sget-object p1, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 180
    :cond_1
    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->cancelTimeout()V

    .line 181
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    invoke-interface {v0, p1}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;->onCustomEventInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    :cond_2
    return-void
.end method

.method public onInterstitialLoaded()V
    .locals 1

    .line 159
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 163
    :cond_0
    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->cancelTimeout()V

    .line 165
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    if-eqz v0, :cond_1

    .line 166
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;->onCustomEventInterstitialLoaded()V

    :cond_1
    return-void
.end method

.method public onInterstitialShown()V
    .locals 1

    .line 187
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;->onCustomEventInterstitialShown()V

    :cond_1
    return-void
.end method

.method public onLeaveApplication()V
    .locals 0

    .line 209
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->onInterstitialClicked()V

    return-void
.end method

.method setAdapterListener(Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitialAdapterListener:Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;

    return-void
.end method

.method setCustomEventInterstitial(Lcom/mopub/mobileads/CustomEventInterstitial;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 225
    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    return-void
.end method

.method showInterstitial()V
    .locals 2

    .line 91
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->isInvalidated()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    if-nez v0, :cond_0

    goto :goto_1

    .line 98
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->mCustomEventInterstitial:Lcom/mopub/mobileads/CustomEventInterstitial;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitial;->showInterstitial()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Showing a custom event interstitial threw an exception."

    .line 100
    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    :goto_0
    return-void

    :cond_1
    :goto_1
    return-void
.end method
