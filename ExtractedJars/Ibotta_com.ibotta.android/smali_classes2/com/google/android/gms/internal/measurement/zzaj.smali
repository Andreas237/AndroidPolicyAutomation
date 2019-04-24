.class final Lcom/google/android/gms/internal/measurement/zzaj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzvg:I

.field private final synthetic zzvh:Lcom/google/android/gms/internal/measurement/zzai;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzai;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaj;->zzvh:Lcom/google/android/gms/internal/measurement/zzai;

    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzaj;->zzvg:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaj;->zzvh:Lcom/google/android/gms/internal/measurement/zzai;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzai;->zza(Lcom/google/android/gms/internal/measurement/zzai;)Lcom/google/android/gms/internal/measurement/zzbf;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzaj;->zzvg:I

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzbf;->zzg(J)V

    return-void
.end method
