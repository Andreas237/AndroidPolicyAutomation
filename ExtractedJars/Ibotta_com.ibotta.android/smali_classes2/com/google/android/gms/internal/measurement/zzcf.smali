.class final Lcom/google/android/gms/internal/measurement/zzcf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzbt;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zzbt<",
        "Lcom/google/android/gms/internal/measurement/zzcg;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

.field private final zzvn:Lcom/google/android/gms/internal/measurement/zzat;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzcg;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzcg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "ga_dryRun"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    iput p2, p1, Lcom/google/android/gms/internal/measurement/zzcg;->zzaai:I

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p2

    const-string v0, "Bool xml configuration name not recognized"

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "ga_dispatchPeriod"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    iput p2, p1, Lcom/google/android/gms/internal/measurement/zzcg;->zzaah:I

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p2

    const-string v0, "Int xml configuration name not recognized"

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "ga_appName"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzcg;->zzaae:Ljava/lang/String;

    return-void

    :cond_0
    const-string v0, "ga_appVersion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzcg;->zzaaf:Ljava/lang/String;

    return-void

    :cond_1
    const-string v0, "ga_logLevel"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzcg;->zzaag:Ljava/lang/String;

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p2

    const-string v0, "String xml configuration name not recognized"

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic zzdr()Lcom/google/android/gms/internal/measurement/zzbr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcf;->zzaad:Lcom/google/android/gms/internal/measurement/zzcg;

    return-object v0
.end method
