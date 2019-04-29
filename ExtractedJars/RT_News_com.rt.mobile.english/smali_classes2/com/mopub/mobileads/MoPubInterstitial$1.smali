.class synthetic Lcom/mopub/mobileads/MoPubInterstitial$1;
.super Ljava/lang/Object;
.source "MoPubInterstitial.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/MoPubInterstitial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$mopub$mobileads$MoPubInterstitial$InterstitialState:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 87
    invoke-static {}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->values()[Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/mopub/mobileads/MoPubInterstitial$1;->$SwitchMap$com$mopub$mobileads$MoPubInterstitial$InterstitialState:[I

    :try_start_0
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$1;->$SwitchMap$com$mopub$mobileads$MoPubInterstitial$InterstitialState:[I

    sget-object v1, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->CUSTOM_EVENT_AD_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
