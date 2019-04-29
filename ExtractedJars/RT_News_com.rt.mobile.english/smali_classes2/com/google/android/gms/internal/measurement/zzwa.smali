.class public final Lcom/google/android/gms/internal/measurement/zzwa;
.super Ljava/lang/Object;


# instance fields
.field private zzaxa:Ljava/lang/String;

.field private zzbka:Ljava/util/Map;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbkb:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbmk:Lcom/google/android/gms/internal/measurement/zzwk;

.field private final zzqx:Landroid/content/Context;

.field private final zzro:Lcom/google/android/gms/common/util/Clock;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzwk;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/measurement/zzwk;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzwa;-><init>(Landroid/content/Context;Ljava/util/Map;Lcom/google/android/gms/internal/measurement/zzwk;Lcom/google/android/gms/common/util/Clock;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/Map;Lcom/google/android/gms/internal/measurement/zzwk;Lcom/google/android/gms/common/util/Clock;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/measurement/zzwk;",
            "Lcom/google/android/gms/common/util/Clock;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzaxa:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzbka:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzqx:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzro:Lcom/google/android/gms/common/util/Clock;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzbmk:Lcom/google/android/gms/internal/measurement/zzwk;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzbkb:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final zzer(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwa;->zzaxa:Ljava/lang/String;

    return-void
.end method
