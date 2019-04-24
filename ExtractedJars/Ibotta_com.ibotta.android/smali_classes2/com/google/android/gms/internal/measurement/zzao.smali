.class final Lcom/google/android/gms/internal/measurement/zzao;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzvh:Lcom/google/android/gms/internal/measurement/zzai;

.field private final synthetic zzvm:Lcom/google/android/gms/internal/measurement/zzca;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzai;Lcom/google/android/gms/internal/measurement/zzca;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzao;->zzvh:Lcom/google/android/gms/internal/measurement/zzai;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzao;->zzvm:Lcom/google/android/gms/internal/measurement/zzca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzao;->zzvh:Lcom/google/android/gms/internal/measurement/zzai;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzai;->zza(Lcom/google/android/gms/internal/measurement/zzai;)Lcom/google/android/gms/internal/measurement/zzbf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzao;->zzvm:Lcom/google/android/gms/internal/measurement/zzca;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzbf;->zzb(Lcom/google/android/gms/internal/measurement/zzca;)V

    return-void
.end method
