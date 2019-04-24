.class public final Lcom/google/android/gms/measurement/internal/zzbf;
.super Ljava/lang/Object;


# instance fields
.field private value:Z

.field private final zzanr:Z

.field private zzans:Z

.field private final synthetic zzant:Lcom/google/android/gms/measurement/internal/zzbd;

.field private final zzoj:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzbd;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzant:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzoj:Ljava/lang/String;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzanr:Z

    return-void
.end method


# virtual methods
.method public final get()Z
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 7
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzans:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzans:Z

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzant:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zza(Lcom/google/android/gms/measurement/internal/zzbd;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzoj:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzanr:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbf;->value:Z

    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbf;->value:Z

    return v0
.end method

.method public final set(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzant:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zza(Lcom/google/android/gms/measurement/internal/zzbd;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbf;->zzoj:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzbf;->value:Z

    return-void
.end method
