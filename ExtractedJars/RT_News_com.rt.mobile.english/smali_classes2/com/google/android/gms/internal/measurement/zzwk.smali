.class public final Lcom/google/android/gms/internal/measurement/zzwk;
.super Ljava/lang/Object;


# static fields
.field private static final zzbmr:Ljava/lang/Integer;

.field private static final zzbms:Ljava/lang/Integer;


# instance fields
.field private final zzalw:Ljava/util/concurrent/ExecutorService;

.field private final zzqx:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzwk;->zzbmr:Ljava/lang/Integer;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzwk;->zzbms:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzwk;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwk;->zzqx:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzwk;->zzalw:Ljava/util/concurrent/ExecutorService;

    return-void
.end method
