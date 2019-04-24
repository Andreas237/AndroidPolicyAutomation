.class public final enum Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;
.super Ljava/lang/Enum;
.source "FirstUseNoNetworkScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FailedEventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

.field public static final enum FIRST_USE_CONFIG_FETCH:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

.field public static final enum GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

.field public static final enum NO_NETWORK:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

.field public static final enum TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

.field private static map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 44
    new-instance v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    const-string v1, "NO_NETWORK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->NO_NETWORK:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 45
    new-instance v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    const-string v1, "TIMEOUT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 46
    new-instance v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    const-string v1, "GUEST_ACCOUNT_CREATE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 47
    new-instance v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    const-string v1, "FIRST_USE_CONFIG_FETCH"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v5}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->FIRST_USE_CONFIG_FETCH:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    const/4 v0, 0x4

    .line 43
    new-array v0, v0, [Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    sget-object v1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->NO_NETWORK:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->FIRST_USE_CONFIG_FETCH:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->$VALUES:[Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->map:Ljava/util/Map;

    .line 57
    invoke-static {}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->values()[Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 58
    sget-object v4, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->map:Ljava/util/Map;

    iget v5, v3, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->value:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 53
    iput p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->value:I

    return-void
.end method

.method public static valueOf(I)Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;
    .locals 1

    .line 63
    sget-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->map:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;
    .locals 1

    .line 43
    const-class v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;
    .locals 1

    .line 43
    sget-object v0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->$VALUES:[Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    invoke-virtual {v0}, [Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->value:I

    return v0
.end method
