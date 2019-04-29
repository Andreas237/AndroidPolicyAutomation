.class public final enum Lcom/mopub/mobileads/VastErrorCode;
.super Ljava/lang/Enum;
.source "VastErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/mobileads/VastErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/mobileads/VastErrorCode;

.field public static final enum GENERAL_COMPANION_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

.field public static final enum GENERAL_LINEAR_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

.field public static final enum NO_ADS_VAST_RESPONSE:Lcom/mopub/mobileads/VastErrorCode;

.field public static final enum UNDEFINED_ERROR:Lcom/mopub/mobileads/VastErrorCode;

.field public static final enum WRAPPER_TIMEOUT:Lcom/mopub/mobileads/VastErrorCode;

.field public static final enum XML_PARSING_ERROR:Lcom/mopub/mobileads/VastErrorCode;


# instance fields
.field private final mErrorCode:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 16
    new-instance v0, Lcom/mopub/mobileads/VastErrorCode;

    const-string v1, "XML_PARSING_ERROR"

    const-string v2, "100"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/mobileads/VastErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->XML_PARSING_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    .line 22
    new-instance v0, Lcom/mopub/mobileads/VastErrorCode;

    const-string v1, "WRAPPER_TIMEOUT"

    const-string v2, "301"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/mobileads/VastErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->WRAPPER_TIMEOUT:Lcom/mopub/mobileads/VastErrorCode;

    .line 28
    new-instance v0, Lcom/mopub/mobileads/VastErrorCode;

    const-string v1, "NO_ADS_VAST_RESPONSE"

    const-string v2, "303"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/mobileads/VastErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->NO_ADS_VAST_RESPONSE:Lcom/mopub/mobileads/VastErrorCode;

    .line 34
    new-instance v0, Lcom/mopub/mobileads/VastErrorCode;

    const-string v1, "GENERAL_LINEAR_AD_ERROR"

    const-string v2, "400"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/mobileads/VastErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->GENERAL_LINEAR_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    .line 40
    new-instance v0, Lcom/mopub/mobileads/VastErrorCode;

    const-string v1, "GENERAL_COMPANION_AD_ERROR"

    const-string v2, "600"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/mobileads/VastErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->GENERAL_COMPANION_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    .line 45
    new-instance v0, Lcom/mopub/mobileads/VastErrorCode;

    const-string v1, "UNDEFINED_ERROR"

    const-string v2, "900"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/mobileads/VastErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->UNDEFINED_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    const/4 v0, 0x6

    .line 11
    new-array v0, v0, [Lcom/mopub/mobileads/VastErrorCode;

    sget-object v1, Lcom/mopub/mobileads/VastErrorCode;->XML_PARSING_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/mobileads/VastErrorCode;->WRAPPER_TIMEOUT:Lcom/mopub/mobileads/VastErrorCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/mobileads/VastErrorCode;->NO_ADS_VAST_RESPONSE:Lcom/mopub/mobileads/VastErrorCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/mobileads/VastErrorCode;->GENERAL_LINEAR_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/mobileads/VastErrorCode;->GENERAL_COMPANION_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/mobileads/VastErrorCode;->UNDEFINED_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    aput-object v1, v0, v8

    sput-object v0, Lcom/mopub/mobileads/VastErrorCode;->$VALUES:[Lcom/mopub/mobileads/VastErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const-string p1, "errorCode cannot be null"

    .line 50
    invoke-static {p3, p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iput-object p3, p0, Lcom/mopub/mobileads/VastErrorCode;->mErrorCode:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mobileads/VastErrorCode;
    .locals 1

    .line 11
    const-class v0, Lcom/mopub/mobileads/VastErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/mobileads/VastErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/mopub/mobileads/VastErrorCode;
    .locals 1

    .line 11
    sget-object v0, Lcom/mopub/mobileads/VastErrorCode;->$VALUES:[Lcom/mopub/mobileads/VastErrorCode;

    invoke-virtual {v0}, [Lcom/mopub/mobileads/VastErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mobileads/VastErrorCode;

    return-object v0
.end method


# virtual methods
.method getErrorCode()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/mopub/mobileads/VastErrorCode;->mErrorCode:Ljava/lang/String;

    return-object v0
.end method
