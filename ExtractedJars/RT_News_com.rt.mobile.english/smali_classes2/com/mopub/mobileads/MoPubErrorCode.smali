.class public final enum Lcom/mopub/mobileads/MoPubErrorCode;
.super Ljava/lang/Enum;
.source "MoPubErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/mobileads/MoPubErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum CANCELLED:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum MRAID_LOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum NETWORK_INVALID_STATE:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum NETWORK_NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum NETWORK_TIMEOUT:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum NO_CONNECTION:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum SERVER_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum VIDEO_CACHE_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum VIDEO_DOWNLOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum VIDEO_NOT_AVAILABLE:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum VIDEO_PLAYBACK_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

.field public static final enum WARMUP:Lcom/mopub/mobileads/MoPubErrorCode;


# instance fields
.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 4
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "NO_FILL"

    const-string v2, "No ads found."

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 5
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "WARMUP"

    const-string v2, "Ad unit is warming up. Try again in a few minutes."

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->WARMUP:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 6
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "SERVER_ERROR"

    const-string v2, "Unable to connect to MoPub adserver."

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->SERVER_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 7
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "INTERNAL_ERROR"

    const-string v2, "Unable to serve ad due to invalid internal state."

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 8
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "CANCELLED"

    const-string v2, "Ad request was cancelled."

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->CANCELLED:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 9
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "NO_CONNECTION"

    const-string v2, "No internet connection detected."

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_CONNECTION:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 11
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "ADAPTER_NOT_FOUND"

    const-string v2, "Unable to find Native Network or Custom Event adapter."

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 12
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "ADAPTER_CONFIGURATION_ERROR"

    const-string v2, "Native Network or Custom Event adapter was configured incorrectly."

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 13
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "NETWORK_TIMEOUT"

    const-string v2, "Third-party network failed to respond in a timely manner."

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 14
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "NETWORK_NO_FILL"

    const-string v2, "Third-party network failed to provide an ad."

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 15
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "NETWORK_INVALID_STATE"

    const-string v2, "Third-party network failed due to invalid internal state."

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 16
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "MRAID_LOAD_ERROR"

    const-string v2, "Error loading MRAID ad."

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->MRAID_LOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 17
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "VIDEO_CACHE_ERROR"

    const-string v2, "Error creating a cache to store downloaded videos."

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_CACHE_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 18
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "VIDEO_DOWNLOAD_ERROR"

    const-string v2, "Error downloading video."

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_DOWNLOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 20
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "VIDEO_NOT_AVAILABLE"

    const-string v2, "No video loaded for ad unit."

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_NOT_AVAILABLE:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 21
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "VIDEO_PLAYBACK_ERROR"

    const-string v2, "Error playing a video."

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_PLAYBACK_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 23
    new-instance v0, Lcom/mopub/mobileads/MoPubErrorCode;

    const-string v1, "UNSPECIFIED"

    const-string v2, "Unspecified error."

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/mobileads/MoPubErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    const/16 v0, 0x11

    .line 3
    new-array v0, v0, [Lcom/mopub/mobileads/MoPubErrorCode;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->WARMUP:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->SERVER_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->CANCELLED:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->NO_CONNECTION:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v8

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v9

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v10

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v11

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v12

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v13

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->MRAID_LOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    aput-object v1, v0, v14

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_CACHE_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_DOWNLOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_NOT_AVAILABLE:Lcom/mopub/mobileads/MoPubErrorCode;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_PLAYBACK_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sput-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->$VALUES:[Lcom/mopub/mobileads/MoPubErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 28
    iput-object p3, p0, Lcom/mopub/mobileads/MoPubErrorCode;->message:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mobileads/MoPubErrorCode;
    .locals 1

    .line 3
    const-class v0, Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/mobileads/MoPubErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/mopub/mobileads/MoPubErrorCode;
    .locals 1

    .line 3
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->$VALUES:[Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {v0}, [Lcom/mopub/mobileads/MoPubErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mobileads/MoPubErrorCode;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubErrorCode;->message:Ljava/lang/String;

    return-object v0
.end method
