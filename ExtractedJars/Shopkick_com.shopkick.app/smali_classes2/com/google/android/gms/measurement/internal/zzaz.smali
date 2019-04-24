.class final Lcom/google/android/gms/measurement/internal/zzaz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/support/annotation/WorkerThread;
.end annotation


# instance fields
.field private final packageName:Ljava/lang/String;

.field private final status:I

.field private final zzamn:Lcom/google/android/gms/measurement/internal/zzay;

.field private final zzamo:Ljava/lang/Throwable;

.field private final zzamp:[B

.field private final zzamq:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzay;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/measurement/internal/zzay;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamn:Lcom/google/android/gms/measurement/internal/zzay;

    .line 4
    iput p3, p0, Lcom/google/android/gms/measurement/internal/zzaz;->status:I

    .line 5
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamo:Ljava/lang/Throwable;

    .line 6
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamp:[B

    .line 7
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzaz;->packageName:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamq:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzay;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zzax;)V
    .locals 0

    .line 12
    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/measurement/internal/zzaz;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzay;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamn:Lcom/google/android/gms/measurement/internal/zzay;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzaz;->packageName:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/measurement/internal/zzaz;->status:I

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamo:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamp:[B

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzaz;->zzamq:Ljava/util/Map;

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzay;->zza(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
