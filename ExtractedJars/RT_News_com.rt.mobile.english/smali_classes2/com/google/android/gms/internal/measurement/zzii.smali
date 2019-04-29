.class final Lcom/google/android/gms/internal/measurement/zzii;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzape:Lcom/google/android/gms/internal/measurement/zzig;

.field private final synthetic zzapf:Lcom/google/android/gms/internal/measurement/zzif;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzig;Lcom/google/android/gms/internal/measurement/zzif;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzii;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzii;->zzapf:Lcom/google/android/gms/internal/measurement/zzif;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzii;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzii;->zzapf:Lcom/google/android/gms/internal/measurement/zzif;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzig;->zza(Lcom/google/android/gms/internal/measurement/zzig;Lcom/google/android/gms/internal/measurement/zzif;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzii;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzig;->zzaov:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzii;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzb(Lcom/google/android/gms/internal/measurement/zzif;)V

    return-void
.end method
