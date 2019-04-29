.class public Lcom/google/android/gms/internal/measurement/zzaaa;
.super Ljava/lang/Object;


# static fields
.field private static final zzbtg:Lcom/google/android/gms/internal/measurement/zzzk;


# instance fields
.field private zzbth:Lcom/google/android/gms/internal/measurement/zzyy;

.field private volatile zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

.field private volatile zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzk;->zztn()Lcom/google/android/gms/internal/measurement/zzzk;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtg:Lcom/google/android/gms/internal/measurement/zzzk;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzb(Lcom/google/android/gms/internal/measurement/zzaan;)Lcom/google/android/gms/internal/measurement/zzaan;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzyy;->zzbrh:Lcom/google/android/gms/internal/measurement/zzyy;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;
    :try_end_1
    .catch Lcom/google/android/gms/internal/measurement/zzzv; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    sget-object p1, Lcom/google/android/gms/internal/measurement/zzyy;->zzbrh:Lcom/google/android/gms/internal/measurement/zzyy;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    return-object p1
.end method

.method private final zzty()Lcom/google/android/gms/internal/measurement/zzyy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzyy;->zzbrh:Lcom/google/android/gms/internal/measurement/zzyy;

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaan;->zzty()Lcom/google/android/gms/internal/measurement/zzyy;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzaaa;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaaa;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaaa;->zzty()Lcom/google/android/gms/internal/measurement/zzyy;

    move-result-object v0

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzaaa;->zzty()Lcom/google/android/gms/internal/measurement/zzyy;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzyy;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaan;->zzui()Lcom/google/android/gms/internal/measurement/zzaan;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/measurement/zzaaa;->zzb(Lcom/google/android/gms/internal/measurement/zzaan;)Lcom/google/android/gms/internal/measurement/zzaan;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaan;->zzui()Lcom/google/android/gms/internal/measurement/zzaan;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaaa;->zzb(Lcom/google/android/gms/internal/measurement/zzaan;)Lcom/google/android/gms/internal/measurement/zzaan;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/measurement/zzaan;)Lcom/google/android/gms/internal/measurement/zzaan;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbth:Lcom/google/android/gms/internal/measurement/zzyy;

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbtj:Lcom/google/android/gms/internal/measurement/zzyy;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaaa;->zzbti:Lcom/google/android/gms/internal/measurement/zzaan;

    return-object v0
.end method
