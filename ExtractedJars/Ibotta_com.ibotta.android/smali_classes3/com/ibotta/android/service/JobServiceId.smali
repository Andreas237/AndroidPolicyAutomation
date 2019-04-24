.class public final enum Lcom/ibotta/android/service/JobServiceId;
.super Ljava/lang/Enum;
.source "JobServiceId.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/service/JobServiceId;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/service/JobServiceId;

.field public static final enum API_WORK:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum FCM:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_BRAZE_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_DELAYED_REPORTING:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_EVENT:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_FETCH:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_INTEGRITY:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_LOCAL_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_REGISTRATION:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum GEOFENCE_SERVER_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum LOCATION_UPDATE:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum NOTIFICATION_WORK:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum PIXEL_TRACKING:Lcom/ibotta/android/service/JobServiceId;

.field public static final enum SCHEDULED_WORK:Lcom/ibotta/android/service/JobServiceId;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 8
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "LOCATION_UPDATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->LOCATION_UPDATE:Lcom/ibotta/android/service/JobServiceId;

    .line 9
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_FETCH"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_FETCH:Lcom/ibotta/android/service/JobServiceId;

    .line 10
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_REGISTRATION"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_REGISTRATION:Lcom/ibotta/android/service/JobServiceId;

    .line 11
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_EVENT"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_EVENT:Lcom/ibotta/android/service/JobServiceId;

    .line 12
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_INTEGRITY"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_INTEGRITY:Lcom/ibotta/android/service/JobServiceId;

    .line 13
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_DELAYED_REPORTING"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_DELAYED_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    .line 14
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_LOCAL_REALTIME_REPORTING"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_LOCAL_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    .line 15
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_SERVER_REALTIME_REPORTING"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_SERVER_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    .line 16
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "GEOFENCE_BRAZE_REALTIME_REPORTING"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_BRAZE_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    .line 17
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "SCHEDULED_WORK"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->SCHEDULED_WORK:Lcom/ibotta/android/service/JobServiceId;

    .line 18
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "API_WORK"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->API_WORK:Lcom/ibotta/android/service/JobServiceId;

    .line 19
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "PIXEL_TRACKING"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v13}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->PIXEL_TRACKING:Lcom/ibotta/android/service/JobServiceId;

    .line 20
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "NOTIFICATION_WORK"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v14}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->NOTIFICATION_WORK:Lcom/ibotta/android/service/JobServiceId;

    .line 21
    new-instance v0, Lcom/ibotta/android/service/JobServiceId;

    const-string v1, "FCM"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/service/JobServiceId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->FCM:Lcom/ibotta/android/service/JobServiceId;

    const/16 v0, 0xe

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/service/JobServiceId;

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->LOCATION_UPDATE:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_FETCH:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_REGISTRATION:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_EVENT:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_INTEGRITY:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_DELAYED_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_LOCAL_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_SERVER_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->GEOFENCE_BRAZE_REALTIME_REPORTING:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->SCHEDULED_WORK:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->API_WORK:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->PIXEL_TRACKING:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->NOTIFICATION_WORK:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->FCM:Lcom/ibotta/android/service/JobServiceId;

    aput-object v1, v0, v15

    sput-object v0, Lcom/ibotta/android/service/JobServiceId;->$VALUES:[Lcom/ibotta/android/service/JobServiceId;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/service/JobServiceId;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/service/JobServiceId;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/JobServiceId;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/service/JobServiceId;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/service/JobServiceId;->$VALUES:[Lcom/ibotta/android/service/JobServiceId;

    invoke-virtual {v0}, [Lcom/ibotta/android/service/JobServiceId;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/service/JobServiceId;

    return-object v0
.end method
