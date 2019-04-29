.class final Lcom/google/android/gms/internal/measurement/zzam;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzvh:Lcom/google/android/gms/internal/measurement/zzai;

.field private final synthetic zzvl:Lcom/google/android/gms/internal/measurement/zzch;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzai;Lcom/google/android/gms/internal/measurement/zzch;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzam;->zzvh:Lcom/google/android/gms/internal/measurement/zzai;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzam;->zzvl:Lcom/google/android/gms/internal/measurement/zzch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzam;->zzvh:Lcom/google/android/gms/internal/measurement/zzai;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzai;->zza(Lcom/google/android/gms/internal/measurement/zzai;)Lcom/google/android/gms/internal/measurement/zzbf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzam;->zzvl:Lcom/google/android/gms/internal/measurement/zzch;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzbf;->zza(Lcom/google/android/gms/internal/measurement/zzch;)V

    return-void
.end method
