.class public final Lcom/google/android/gms/measurement/internal/zzbi;
.super Ljava/lang/Object;


# instance fields
.field private value:Ljava/lang/String;

.field private zzans:Z

.field private final synthetic zzant:Lcom/google/android/gms/measurement/internal/zzbd;

.field private final zzany:Ljava/lang/String;

.field private final zzoj:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzbd;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzant:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzoj:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzany:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzcd(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->value:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzant:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zza(Lcom/google/android/gms/measurement/internal/zzbd;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzoj:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbi;->value:Ljava/lang/String;

    return-void
.end method

.method public final zzkd()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 7
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzans:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzans:Z

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzant:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zza(Lcom/google/android/gms/measurement/internal/zzbd;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbi;->zzoj:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->value:Ljava/lang/String;

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbi;->value:Ljava/lang/String;

    return-object v0
.end method
