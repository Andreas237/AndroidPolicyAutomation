.class final enum Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;
.super Ljava/lang/Enum;
.source "MoPubInterstitial.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/MoPubInterstitial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "InterstitialState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

.field public static final enum CUSTOM_EVENT_AD_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

.field public static final enum NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 22
    new-instance v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    const-string v1, "CUSTOM_EVENT_AD_READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->CUSTOM_EVENT_AD_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    .line 23
    new-instance v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    const-string v1, "NOT_READY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    const/4 v0, 0x2

    .line 21
    new-array v0, v0, [Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    sget-object v1, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->CUSTOM_EVENT_AD_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    aput-object v1, v0, v3

    sput-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->$VALUES:[Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;
    .locals 1

    .line 21
    const-class v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    return-object p0
.end method

.method public static values()[Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;
    .locals 1

    .line 21
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->$VALUES:[Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    invoke-virtual {v0}, [Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    return-object v0
.end method


# virtual methods
.method isReady()Z
    .locals 1

    .line 26
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
