.class public final Lcom/google/android/gms/internal/measurement/zzey$zza;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zzaab:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private zzaik:Lcom/google/android/gms/internal/measurement/zzwu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "TV;>;"
        }
    .end annotation
.end field

.field private final zzail:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private volatile zzaim:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private final zzny:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TV;TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzail:Ljava/lang/Object;

    return-void
.end method

.method static zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/measurement/zzey$zza;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "DD)",
            "Lcom/google/android/gms/internal/measurement/zzey$zza<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzey$zza;

    const-wide/high16 p2, -0x3ff8000000000000L    # -3.0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p4

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-direct {p1, p0, p4, p2}, Lcom/google/android/gms/internal/measurement/zzey$zza;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzey;->zzagi:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method static zzb(Ljava/lang/String;JJ)Lcom/google/android/gms/internal/measurement/zzey$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ)",
            "Lcom/google/android/gms/internal/measurement/zzey$zza<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzey$zza;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzey;->zzagf:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method static zzb(Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/measurement/zzey$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Lcom/google/android/gms/internal/measurement/zzey$zza<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzey$zza;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzey;->zzagg:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method static zzc(Ljava/lang/String;II)Lcom/google/android/gms/internal/measurement/zzey$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lcom/google/android/gms/internal/measurement/zzey$zza<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzey$zza;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzey;->zzage:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method static zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzey$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/measurement/zzey$zza<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzey$zza;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzey;->zzagh:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private static zzil()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/measurement/zzey$zza;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzec;->isMainThread()Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagg:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagh:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagf:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzage:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    goto :goto_3

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagi:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    goto :goto_4

    :cond_4
    monitor-exit v0

    return-void

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Tried to refresh flag cache on main thread or on package side."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic zzim()V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzm()V

    return-void
.end method

.method private static zzm()V
    .locals 7

    const-class v0, Lcom/google/android/gms/internal/measurement/zzey$zza;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagg:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey;->zzik()Lcom/google/android/gms/internal/measurement/zzxe;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzxe;->zzf(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagh:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey;->zzik()Lcom/google/android/gms/internal/measurement/zzxe;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzxe;->zzv(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagf:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey;->zzik()Lcom/google/android/gms/internal/measurement/zzxe;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzxe;->zze(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzage:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey;->zzik()Lcom/google/android/gms/internal/measurement/zzxe;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzxe;->zzd(Ljava/lang/String;I)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    goto :goto_3

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzagi:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey;->zzik()Lcom/google/android/gms/internal/measurement/zzxe;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzxe;->zzb(Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    goto :goto_4

    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzec;->isMainThread()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    return-object v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzil()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    return-object p1

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzey;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzec;->isMainThread()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaab:Ljava/lang/Object;

    return-object p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaim:Ljava/lang/Object;

    return-object p1

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzil()V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzaik:Lcom/google/android/gms/internal/measurement/zzwu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzwu;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzey$zza;->zzny:Ljava/lang/String;

    return-object v0
.end method
