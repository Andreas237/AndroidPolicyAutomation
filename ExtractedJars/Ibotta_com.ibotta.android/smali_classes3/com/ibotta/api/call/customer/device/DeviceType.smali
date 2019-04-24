.class public final enum Lcom/ibotta/api/call/customer/device/DeviceType;
.super Ljava/lang/Enum;
.source "DeviceType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/customer/device/DeviceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/customer/device/DeviceType;

.field public static final enum ANDROID:Lcom/ibotta/api/call/customer/device/DeviceType;

.field public static final enum IOS:Lcom/ibotta/api/call/customer/device/DeviceType;

.field public static final enum KINDLE:Lcom/ibotta/api/call/customer/device/DeviceType;

.field public static final enum UNKNOWN:Lcom/ibotta/api/call/customer/device/DeviceType;


# instance fields
.field private final apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 5
    new-instance v0, Lcom/ibotta/api/call/customer/device/DeviceType;

    const-string v1, "IOS"

    const-string v2, "ios"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/call/customer/device/DeviceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/device/DeviceType;->IOS:Lcom/ibotta/api/call/customer/device/DeviceType;

    new-instance v0, Lcom/ibotta/api/call/customer/device/DeviceType;

    const-string v1, "ANDROID"

    const-string v2, "android"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/call/customer/device/DeviceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/device/DeviceType;->ANDROID:Lcom/ibotta/api/call/customer/device/DeviceType;

    new-instance v0, Lcom/ibotta/api/call/customer/device/DeviceType;

    const-string v1, "KINDLE"

    const-string v2, "kindle"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/call/customer/device/DeviceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/device/DeviceType;->KINDLE:Lcom/ibotta/api/call/customer/device/DeviceType;

    new-instance v0, Lcom/ibotta/api/call/customer/device/DeviceType;

    const-string v1, "UNKNOWN"

    const-string v2, "unknown"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/api/call/customer/device/DeviceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/device/DeviceType;->UNKNOWN:Lcom/ibotta/api/call/customer/device/DeviceType;

    const/4 v0, 0x4

    .line 4
    new-array v0, v0, [Lcom/ibotta/api/call/customer/device/DeviceType;

    sget-object v1, Lcom/ibotta/api/call/customer/device/DeviceType;->IOS:Lcom/ibotta/api/call/customer/device/DeviceType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/call/customer/device/DeviceType;->ANDROID:Lcom/ibotta/api/call/customer/device/DeviceType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/call/customer/device/DeviceType;->KINDLE:Lcom/ibotta/api/call/customer/device/DeviceType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/call/customer/device/DeviceType;->UNKNOWN:Lcom/ibotta/api/call/customer/device/DeviceType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/api/call/customer/device/DeviceType;->$VALUES:[Lcom/ibotta/api/call/customer/device/DeviceType;

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

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 9
    iput-object p3, p0, Lcom/ibotta/api/call/customer/device/DeviceType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/DeviceType;
    .locals 0

    if-nez p0, :cond_0

    .line 18
    sget-object p0, Lcom/ibotta/api/call/customer/device/DeviceType;->UNKNOWN:Lcom/ibotta/api/call/customer/device/DeviceType;

    return-object p0

    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/call/customer/device/DeviceType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/DeviceType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 26
    :catch_0
    sget-object p0, Lcom/ibotta/api/call/customer/device/DeviceType;->UNKNOWN:Lcom/ibotta/api/call/customer/device/DeviceType;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/DeviceType;
    .locals 1

    .line 4
    const-class v0, Lcom/ibotta/api/call/customer/device/DeviceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/device/DeviceType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/customer/device/DeviceType;
    .locals 1

    .line 4
    sget-object v0, Lcom/ibotta/api/call/customer/device/DeviceType;->$VALUES:[Lcom/ibotta/api/call/customer/device/DeviceType;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/customer/device/DeviceType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/customer/device/DeviceType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/DeviceType;->apiName:Ljava/lang/String;

    return-object v0
.end method
