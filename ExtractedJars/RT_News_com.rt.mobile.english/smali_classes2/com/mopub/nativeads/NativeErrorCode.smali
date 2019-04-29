.class public final enum Lcom/mopub/nativeads/NativeErrorCode;
.super Ljava/lang/Enum;
.source "NativeErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/nativeads/NativeErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum INVALID_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NATIVE_ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NATIVE_ADAPTER_NOT_FOUND:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NATIVE_RENDERER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_INVALID_REQUEST:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_INVALID_STATE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_NO_FILL:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum NETWORK_TIMEOUT:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum UNEXPECTED_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

.field public static final enum UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;


# instance fields
.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 6
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "EMPTY_AD_RESPONSE"

    const-string v2, "Server returned empty response."

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 7
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "INVALID_RESPONSE"

    const-string v2, "Unable to parse response from server."

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 8
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "IMAGE_DOWNLOAD_FAILURE"

    const-string v2, "Unable to download images associated with ad."

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 9
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "INVALID_REQUEST_URL"

    const-string v2, "Invalid request url."

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

    .line 10
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "UNEXPECTED_RESPONSE_CODE"

    const-string v2, "Received unexpected response code from server."

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->UNEXPECTED_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 11
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "SERVER_ERROR_RESPONSE_CODE"

    const-string v2, "Server returned erroneous response code."

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 12
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "CONNECTION_ERROR"

    const-string v2, "Network is unavailable."

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    .line 13
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "UNSPECIFIED"

    const-string v2, "Unspecified error occurred."

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

    .line 15
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_INVALID_REQUEST"

    const-string v2, "Third-party network received invalid request."

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_REQUEST:Lcom/mopub/nativeads/NativeErrorCode;

    .line 16
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_TIMEOUT"

    const-string v2, "Third-party network failed to respond in a timely manner."

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/nativeads/NativeErrorCode;

    .line 17
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_NO_FILL"

    const-string v2, "Third-party network failed to provide an ad."

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_NO_FILL:Lcom/mopub/nativeads/NativeErrorCode;

    .line 18
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NETWORK_INVALID_STATE"

    const-string v2, "Third-party network failed due to invalid internal state."

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/nativeads/NativeErrorCode;

    .line 20
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NATIVE_RENDERER_CONFIGURATION_ERROR"

    const-string v2, "A required renderer was not registered for the CustomEventNative."

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_RENDERER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    .line 21
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NATIVE_ADAPTER_CONFIGURATION_ERROR"

    const-string v2, "CustomEventNative was configured incorrectly."

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    .line 22
    new-instance v0, Lcom/mopub/nativeads/NativeErrorCode;

    const-string v1, "NATIVE_ADAPTER_NOT_FOUND"

    const-string v2, "Unable to find CustomEventNative."

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/mopub/nativeads/NativeErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_NOT_FOUND:Lcom/mopub/nativeads/NativeErrorCode;

    const/16 v0, 0xf

    .line 5
    new-array v0, v0, [Lcom/mopub/nativeads/NativeErrorCode;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->UNEXPECTED_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v8

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v9

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v10

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_REQUEST:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v11

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v12

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_NO_FILL:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v13

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v14

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_RENDERER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_ADAPTER_NOT_FOUND:Lcom/mopub/nativeads/NativeErrorCode;

    aput-object v1, v0, v15

    sput-object v0, Lcom/mopub/nativeads/NativeErrorCode;->$VALUES:[Lcom/mopub/nativeads/NativeErrorCode;

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

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput-object p3, p0, Lcom/mopub/nativeads/NativeErrorCode;->message:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/NativeErrorCode;
    .locals 1

    .line 5
    const-class v0, Lcom/mopub/nativeads/NativeErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/nativeads/NativeErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/mopub/nativeads/NativeErrorCode;
    .locals 1

    .line 5
    sget-object v0, Lcom/mopub/nativeads/NativeErrorCode;->$VALUES:[Lcom/mopub/nativeads/NativeErrorCode;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/NativeErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/NativeErrorCode;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/mopub/nativeads/NativeErrorCode;->message:Ljava/lang/String;

    return-object v0
.end method
