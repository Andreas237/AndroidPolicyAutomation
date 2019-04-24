.class public final enum Lcom/shopkick/sdk/zone/ZoneError;
.super Ljava/lang/Enum;
.source "ZoneError.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/zone/ZoneError;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum BLUETOOTH_OFF:Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum GEOFENCE_ERROR:Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum GOOGLE_PLAY_SERVICES_OUT_OF_DATE:Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum GOOGLE_PLAY_SERVICES_UNAVAILABLE:Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum LOCATION_DISABLED:Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/zone/ZoneError;

.field public static final enum NETWORK_ERROR:Lcom/shopkick/sdk/zone/ZoneError;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 10
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "LOCATION_DISABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->LOCATION_DISABLED:Lcom/shopkick/sdk/zone/ZoneError;

    .line 15
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "NETWORK_ERROR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->NETWORK_ERROR:Lcom/shopkick/sdk/zone/ZoneError;

    .line 20
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "GOOGLE_PLAY_SERVICES_UNAVAILABLE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->GOOGLE_PLAY_SERVICES_UNAVAILABLE:Lcom/shopkick/sdk/zone/ZoneError;

    .line 24
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "GOOGLE_PLAY_SERVICES_OUT_OF_DATE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->GOOGLE_PLAY_SERVICES_OUT_OF_DATE:Lcom/shopkick/sdk/zone/ZoneError;

    .line 28
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "GEOFENCE_ERROR"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->GEOFENCE_ERROR:Lcom/shopkick/sdk/zone/ZoneError;

    .line 32
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "BLUETOOTH_OFF"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->BLUETOOTH_OFF:Lcom/shopkick/sdk/zone/ZoneError;

    .line 38
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneError;

    const-string v1, "LOCATION_PERMISSION_DENIED"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/shopkick/sdk/zone/ZoneError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/zone/ZoneError;

    const/4 v0, 0x7

    .line 6
    new-array v0, v0, [Lcom/shopkick/sdk/zone/ZoneError;

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->LOCATION_DISABLED:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->NETWORK_ERROR:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->GOOGLE_PLAY_SERVICES_UNAVAILABLE:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->GOOGLE_PLAY_SERVICES_OUT_OF_DATE:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->GEOFENCE_ERROR:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->BLUETOOTH_OFF:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/sdk/zone/ZoneError;->LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/zone/ZoneError;

    aput-object v1, v0, v8

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneError;->$VALUES:[Lcom/shopkick/sdk/zone/ZoneError;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/zone/ZoneError;
    .locals 1

    .line 6
    const-class v0, Lcom/shopkick/sdk/zone/ZoneError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/zone/ZoneError;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/zone/ZoneError;
    .locals 1

    .line 6
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneError;->$VALUES:[Lcom/shopkick/sdk/zone/ZoneError;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/zone/ZoneError;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/zone/ZoneError;

    return-object v0
.end method
