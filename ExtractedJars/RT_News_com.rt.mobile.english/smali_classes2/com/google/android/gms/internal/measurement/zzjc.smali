.class final Lcom/google/android/gms/internal/measurement/zzjc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzapw:Lcom/google/android/gms/internal/measurement/zzix;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzix;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjc;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjc;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzix;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzez;)Lcom/google/android/gms/internal/measurement/zzez;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjc;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzix;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzb(Lcom/google/android/gms/internal/measurement/zzij;)V

    return-void
.end method
