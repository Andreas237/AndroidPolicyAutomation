.class public final enum Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
.super Ljava/lang/Enum;
.source "AdTypeTranslator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/AdTypeTranslator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CustomEventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum GOOGLE_PLAY_SERVICES_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum GOOGLE_PLAY_SERVICES_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum HTML_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum HTML_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MILLENNIAL_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MILLENNIAL_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MOPUB_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MOPUB_VIDEO_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MRAID_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum MRAID_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

.field public static final enum VAST_VIDEO_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;


# instance fields
.field private final mClassName:Ljava/lang/String;

.field private final mKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 17
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "GOOGLE_PLAY_SERVICES_BANNER"

    const-string v2, "admob_native_banner"

    const-string v3, "com.mopub.mobileads.GooglePlayServicesBanner"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 18
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "GOOGLE_PLAY_SERVICES_INTERSTITIAL"

    const-string v2, "admob_full_interstitial"

    const-string v3, "com.mopub.mobileads.GooglePlayServicesInterstitial"

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 19
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MILLENNIAL_BANNER"

    const-string v2, "millennial_native_banner"

    const-string v3, "com.mopub.mobileads.MillennialBanner"

    const/4 v6, 0x2

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 20
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MILLENNIAL_INTERSTITIAL"

    const-string v2, "millennial_full_interstitial"

    const-string v3, "com.mopub.mobileads.MillennialInterstitial"

    const/4 v7, 0x3

    invoke-direct {v0, v1, v7, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 23
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MRAID_BANNER"

    const-string v2, "mraid_banner"

    const-string v3, "com.mopub.mraid.MraidBanner"

    const/4 v8, 0x4

    invoke-direct {v0, v1, v8, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 24
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MRAID_INTERSTITIAL"

    const-string v2, "mraid_interstitial"

    const-string v3, "com.mopub.mraid.MraidInterstitial"

    const/4 v9, 0x5

    invoke-direct {v0, v1, v9, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 25
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "HTML_BANNER"

    const-string v2, "html_banner"

    const-string v3, "com.mopub.mobileads.HtmlBanner"

    const/4 v10, 0x6

    invoke-direct {v0, v1, v10, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 26
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "HTML_INTERSTITIAL"

    const-string v2, "html_interstitial"

    const-string v3, "com.mopub.mobileads.HtmlInterstitial"

    const/4 v11, 0x7

    invoke-direct {v0, v1, v11, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 27
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "VAST_VIDEO_INTERSTITIAL"

    const-string v2, "vast_interstitial"

    const-string v3, "com.mopub.mobileads.VastVideoInterstitial"

    const/16 v12, 0x8

    invoke-direct {v0, v1, v12, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->VAST_VIDEO_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 28
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MOPUB_NATIVE"

    const-string v2, "mopub_native"

    const-string v3, "com.mopub.nativeads.MoPubCustomEventNative"

    const/16 v13, 0x9

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MOPUB_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 29
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "MOPUB_VIDEO_NATIVE"

    const-string v2, "mopub_video_native"

    const-string v3, "com.mopub.nativeads.MoPubCustomEventVideoNative"

    const/16 v14, 0xa

    invoke-direct {v0, v1, v14, v2, v3}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MOPUB_VIDEO_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    .line 31
    new-instance v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const-string v1, "UNSPECIFIED"

    const-string v2, ""

    const/16 v3, 0xb

    const/4 v15, 0x0

    invoke-direct {v0, v1, v3, v2, v15}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    const/16 v0, 0xc

    .line 15
    new-array v0, v0, [Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->GOOGLE_PLAY_SERVICES_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MILLENNIAL_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MRAID_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_BANNER:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->HTML_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->VAST_VIDEO_INTERSTITIAL:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MOPUB_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->MOPUB_VIDEO_NATIVE:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->$VALUES:[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput-object p3, p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->mKey:Ljava/lang/String;

    .line 38
    iput-object p4, p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->mClassName:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;)Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 0

    .line 15
    invoke-static {p0}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->fromString(Ljava/lang/String;)Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    move-result-object p0

    return-object p0
.end method

.method private static fromString(Ljava/lang/String;)Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 5

    .line 42
    invoke-static {}, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->values()[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 43
    iget-object v4, v3, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->mKey:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 48
    :cond_1
    sget-object p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->UNSPECIFIED:Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 1

    .line 15
    const-class v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-object p0
.end method

.method public static values()[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;
    .locals 1

    .line 15
    sget-object v0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->$VALUES:[Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    invoke-virtual {v0}, [Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/mopub/mobileads/AdTypeTranslator$CustomEventType;->mClassName:Ljava/lang/String;

    return-object v0
.end method
