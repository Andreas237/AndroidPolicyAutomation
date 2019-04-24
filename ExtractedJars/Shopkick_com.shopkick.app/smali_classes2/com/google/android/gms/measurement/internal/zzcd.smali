.class final Lcom/google/android/gms/measurement/internal/zzcd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaql:Lcom/google/android/gms/measurement/internal/zzby;

.field private final synthetic zzaqm:Lcom/google/android/gms/measurement/internal/zzo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzby;Lcom/google/android/gms/measurement/internal/zzo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzcd;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzcd;->zzaqm:Lcom/google/android/gms/measurement/internal/zzo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcd;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzme()V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcd;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzcd;->zzaqm:Lcom/google/android/gms/measurement/internal/zzo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfo;->zze(Lcom/google/android/gms/measurement/internal/zzo;)V

    return-void
.end method
