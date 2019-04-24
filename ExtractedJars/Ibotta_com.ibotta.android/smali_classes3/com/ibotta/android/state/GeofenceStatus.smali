.class public final enum Lcom/ibotta/android/state/GeofenceStatus;
.super Ljava/lang/Enum;
.source "GeofenceStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/state/GeofenceStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum BATTERY_LOW:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum GEOFENCE_SETTING_OFF:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum INVALID_LOCALE:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum LOCATION_WIFI_OFF:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum LOGGED_OUT:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum MASTER_SWITCH_OFF:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum NO_GOOGLE_PLAY_SERVICES:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum OK:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum PERMISSION_DENIED:Lcom/ibotta/android/state/GeofenceStatus;

.field public static final enum UNKNOWN:Lcom/ibotta/android/state/GeofenceStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 4
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->OK:Lcom/ibotta/android/state/GeofenceStatus;

    .line 5
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "MASTER_SWITCH_OFF"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->MASTER_SWITCH_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    .line 6
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "LOGGED_OUT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->LOGGED_OUT:Lcom/ibotta/android/state/GeofenceStatus;

    .line 7
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "GEOFENCE_SETTING_OFF"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->GEOFENCE_SETTING_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    .line 8
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "NO_GOOGLE_PLAY_SERVICES"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->NO_GOOGLE_PLAY_SERVICES:Lcom/ibotta/android/state/GeofenceStatus;

    .line 9
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "LOCATION_WIFI_OFF"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->LOCATION_WIFI_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    .line 10
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "BATTERY_LOW"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->BATTERY_LOW:Lcom/ibotta/android/state/GeofenceStatus;

    .line 11
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "PERMISSION_DENIED"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->PERMISSION_DENIED:Lcom/ibotta/android/state/GeofenceStatus;

    .line 12
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "INVALID_LOCALE"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->INVALID_LOCALE:Lcom/ibotta/android/state/GeofenceStatus;

    .line 13
    new-instance v0, Lcom/ibotta/android/state/GeofenceStatus;

    const-string v1, "UNKNOWN"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/ibotta/android/state/GeofenceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->UNKNOWN:Lcom/ibotta/android/state/GeofenceStatus;

    const/16 v0, 0xa

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/state/GeofenceStatus;

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->OK:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->MASTER_SWITCH_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->LOGGED_OUT:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->GEOFENCE_SETTING_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->NO_GOOGLE_PLAY_SERVICES:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->LOCATION_WIFI_OFF:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->BATTERY_LOW:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->PERMISSION_DENIED:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->INVALID_LOCALE:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->UNKNOWN:Lcom/ibotta/android/state/GeofenceStatus;

    aput-object v1, v0, v11

    sput-object v0, Lcom/ibotta/android/state/GeofenceStatus;->$VALUES:[Lcom/ibotta/android/state/GeofenceStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/GeofenceStatus;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/state/GeofenceStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/GeofenceStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/state/GeofenceStatus;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/state/GeofenceStatus;->$VALUES:[Lcom/ibotta/android/state/GeofenceStatus;

    invoke-virtual {v0}, [Lcom/ibotta/android/state/GeofenceStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/state/GeofenceStatus;

    return-object v0
.end method
