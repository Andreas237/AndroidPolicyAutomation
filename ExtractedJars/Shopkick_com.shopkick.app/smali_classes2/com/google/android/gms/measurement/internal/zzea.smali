.class final Lcom/google/android/gms/measurement/internal/zzea;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzarz:Lcom/google/android/gms/measurement/internal/zzdy;

.field private final synthetic zzasa:Lcom/google/android/gms/measurement/internal/zzdx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzdy;Lcom/google/android/gms/measurement/internal/zzdx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzea;->zzarz:Lcom/google/android/gms/measurement/internal/zzdy;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzea;->zzasa:Lcom/google/android/gms/measurement/internal/zzdx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzea;->zzarz:Lcom/google/android/gms/measurement/internal/zzdy;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzea;->zzasa:Lcom/google/android/gms/measurement/internal/zzdx;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzdy;->zza(Lcom/google/android/gms/measurement/internal/zzdy;Lcom/google/android/gms/measurement/internal/zzdx;Z)V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzea;->zzarz:Lcom/google/android/gms/measurement/internal/zzdy;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/zzdy;->zzarq:Lcom/google/android/gms/measurement/internal/zzdx;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zze;->zzgl()Lcom/google/android/gms/measurement/internal/zzeb;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Lcom/google/android/gms/measurement/internal/zzdx;)V

    return-void
.end method
