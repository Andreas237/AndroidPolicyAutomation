.class public final Lcom/google/android/gms/measurement/AppMeasurement$Param;
.super Lcom/google/firebase/analytics/FirebaseAnalytics$Param;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/measurement/AppMeasurement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Param"
.end annotation


# static fields
.field public static final FATAL:Ljava/lang/String; = "fatal"
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final TIMESTAMP:Ljava/lang/String; = "timestamp"
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final TYPE:Ljava/lang/String; = "type"
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final zzacz:[Ljava/lang/String;

.field public static final zzada:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    const/16 v0, 0x23

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "firebase_conversion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "engagement_time_msec"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "exposure_time"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "ad_event_id"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "ad_unit_id"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "firebase_error"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "firebase_error_value"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    const-string v2, "firebase_error_length"

    const/4 v10, 0x7

    aput-object v2, v1, v10

    const-string v2, "firebase_event_origin"

    const/16 v11, 0x8

    aput-object v2, v1, v11

    const-string v2, "firebase_screen"

    const/16 v12, 0x9

    aput-object v2, v1, v12

    const-string v2, "firebase_screen_class"

    const/16 v13, 0xa

    aput-object v2, v1, v13

    const-string v2, "firebase_screen_id"

    const/16 v14, 0xb

    aput-object v2, v1, v14

    const-string v2, "firebase_previous_screen"

    const/16 v15, 0xc

    aput-object v2, v1, v15

    const-string v2, "firebase_previous_class"

    const/16 v16, 0xd

    aput-object v2, v1, v16

    const-string v2, "firebase_previous_id"

    const/16 v17, 0xe

    aput-object v2, v1, v17

    const-string v2, "message_device_time"

    const/16 v17, 0xf

    aput-object v2, v1, v17

    const-string v2, "message_id"

    const/16 v17, 0x10

    aput-object v2, v1, v17

    const-string v2, "message_name"

    const/16 v17, 0x11

    aput-object v2, v1, v17

    const-string v2, "message_time"

    const/16 v17, 0x12

    aput-object v2, v1, v17

    const-string v2, "previous_app_version"

    const/16 v17, 0x13

    aput-object v2, v1, v17

    const-string v2, "previous_os_version"

    const/16 v17, 0x14

    aput-object v2, v1, v17

    const-string v2, "topic"

    const/16 v17, 0x15

    aput-object v2, v1, v17

    const-string v2, "update_with_analytics"

    const/16 v17, 0x16

    aput-object v2, v1, v17

    const-string v2, "previous_first_open_count"

    const/16 v17, 0x17

    aput-object v2, v1, v17

    const-string v2, "system_app"

    const/16 v17, 0x18

    aput-object v2, v1, v17

    const-string v2, "system_app_update"

    const/16 v17, 0x19

    aput-object v2, v1, v17

    const-string v2, "previous_install_count"

    const/16 v17, 0x1a

    aput-object v2, v1, v17

    const-string v2, "ga_event_id"

    const/16 v17, 0x1b

    aput-object v2, v1, v17

    const-string v2, "ga_extra_params_ct"

    const/16 v17, 0x1c

    aput-object v2, v1, v17

    const-string v2, "ga_group_name"

    const/16 v17, 0x1d

    aput-object v2, v1, v17

    const-string v2, "ga_list_length"

    const/16 v17, 0x1e

    aput-object v2, v1, v17

    const-string v2, "ga_index"

    const/16 v17, 0x1f

    aput-object v2, v1, v17

    const-string v2, "ga_event_name"

    const/16 v17, 0x20

    aput-object v2, v1, v17

    const-string v2, "campaign_info_source"

    const/16 v17, 0x21

    aput-object v2, v1, v17

    const-string v2, "deferred_analytics_collection"

    const/16 v17, 0x22

    aput-object v2, v1, v17

    sput-object v1, Lcom/google/android/gms/measurement/AppMeasurement$Param;->zzacz:[Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_c"

    aput-object v1, v0, v3

    const-string v1, "_et"

    aput-object v1, v0, v4

    const-string v1, "_xt"

    aput-object v1, v0, v5

    const-string v1, "_aeid"

    aput-object v1, v0, v6

    const-string v1, "_ai"

    aput-object v1, v0, v7

    const-string v1, "_err"

    aput-object v1, v0, v8

    const-string v1, "_ev"

    aput-object v1, v0, v9

    const-string v1, "_el"

    aput-object v1, v0, v10

    const-string v1, "_o"

    aput-object v1, v0, v11

    const-string v1, "_sn"

    aput-object v1, v0, v12

    const-string v1, "_sc"

    aput-object v1, v0, v13

    const-string v1, "_si"

    aput-object v1, v0, v14

    const-string v1, "_pn"

    aput-object v1, v0, v15

    const-string v1, "_pc"

    aput-object v1, v0, v16

    const-string v1, "_pi"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "_ndt"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "_nmid"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "_nmn"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "_nmt"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "_pv"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "_po"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "_nt"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "_uwa"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "_pfo"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "_sys"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "_sysu"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "_pin"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "_eid"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "_epc"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "_gn"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "_ll"

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "_i"

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "_en"

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const-string v1, "_cis"

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "_dac"

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/android/gms/measurement/AppMeasurement$Param;->zzada:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/analytics/FirebaseAnalytics$Param;-><init>()V

    return-void
.end method

.method public static zzaj(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/google/android/gms/measurement/AppMeasurement$Param;->zzacz:[Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/measurement/AppMeasurement$Param;->zzada:[Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
