.class final Lcom/google/android/gms/internal/measurement/zzba;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzws:Lcom/google/android/gms/internal/measurement/zzci;

.field private final synthetic zzwt:Lcom/google/android/gms/internal/measurement/zzaz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzaz;Lcom/google/android/gms/internal/measurement/zzci;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzba;->zzwt:Lcom/google/android/gms/internal/measurement/zzaz;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzba;->zzws:Lcom/google/android/gms/internal/measurement/zzci;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzba;->zzwt:Lcom/google/android/gms/internal/measurement/zzaz;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzaz;->zzwp:Lcom/google/android/gms/internal/measurement/zzax;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzax;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzba;->zzwt:Lcom/google/android/gms/internal/measurement/zzaz;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzaz;->zzwp:Lcom/google/android/gms/internal/measurement/zzax;

    const-string v1, "Connected to service after a timeout"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzr(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzba;->zzwt:Lcom/google/android/gms/internal/measurement/zzaz;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzaz;->zzwp:Lcom/google/android/gms/internal/measurement/zzax;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzba;->zzws:Lcom/google/android/gms/internal/measurement/zzci;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzax;->zza(Lcom/google/android/gms/internal/measurement/zzax;Lcom/google/android/gms/internal/measurement/zzci;)V

    :cond_0
    return-void
.end method
