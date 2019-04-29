.class final Lcom/google/android/gms/internal/measurement/zzgd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

.field private final synthetic zzall:Lcom/google/android/gms/internal/measurement/zzfh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgc;Lcom/google/android/gms/internal/measurement/zzgm;Lcom/google/android/gms/internal/measurement/zzfh;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzgd;->zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzgd;->zzall:Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgd;->zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzjw()Lcom/google/android/gms/internal/measurement/zzfy;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgd;->zzall:Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Install Referrer Reporter is null"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgd;->zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzjw()Lcom/google/android/gms/internal/measurement/zzfy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfy;->zzjo()V

    return-void
.end method
