.class public final Lcom/google/android/gms/measurement/AppMeasurement$UserProperty;
.super Lcom/google/firebase/analytics/FirebaseAnalytics$UserProperty;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/measurement/AppMeasurement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UserProperty"
.end annotation


# static fields
.field public static final FIREBASE_LAST_NOTIFICATION:Ljava/lang/String; = "_ln"
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final zzadb:[Ljava/lang/String;

.field public static final zzadc:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x7

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "firebase_last_notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "first_open_time"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "first_visit_time"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "last_deep_link_referrer"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "user_id"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "first_open_after_install"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "lifetime_user_engagement"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    sput-object v1, Lcom/google/android/gms/measurement/AppMeasurement$UserProperty;->zzadb:[Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_ln"

    aput-object v1, v0, v3

    const-string v1, "_fot"

    aput-object v1, v0, v4

    const-string v1, "_fvt"

    aput-object v1, v0, v5

    const-string v1, "_ldl"

    aput-object v1, v0, v6

    const-string v1, "_id"

    aput-object v1, v0, v7

    const-string v1, "_fi"

    aput-object v1, v0, v8

    const-string v1, "_lte"

    aput-object v1, v0, v9

    sput-object v0, Lcom/google/android/gms/measurement/AppMeasurement$UserProperty;->zzadc:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/analytics/FirebaseAnalytics$UserProperty;-><init>()V

    return-void
.end method

.method public static zzaj(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/google/android/gms/measurement/AppMeasurement$UserProperty;->zzadb:[Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/measurement/AppMeasurement$UserProperty;->zzadc:[Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
