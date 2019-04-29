.class final Lcom/google/android/gms/internal/measurement/zzih;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzapb:Z

.field private final synthetic zzapc:Lcom/google/android/gms/internal/measurement/zzif;

.field private final synthetic zzapd:Lcom/google/android/gms/internal/measurement/zzif;

.field private final synthetic zzape:Lcom/google/android/gms/internal/measurement/zzig;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzig;ZLcom/google/android/gms/internal/measurement/zzif;Lcom/google/android/gms/internal/measurement/zzif;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapb:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapb:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzig;->zzaov:Lcom/google/android/gms/internal/measurement/zzif;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzig;->zzaov:Lcom/google/android/gms/internal/measurement/zzif;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzig;->zza(Lcom/google/android/gms/internal/measurement/zzig;Lcom/google/android/gms/internal/measurement/zzif;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-wide v2, v0, Lcom/google/android/gms/internal/measurement/zzif;->zzaot:J

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    iget-wide v4, v0, Lcom/google/android/gms/internal/measurement/zzif;->zzaot:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzif;->zzaos:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzif;->zzaos:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/measurement/zzkc;->zzs(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzif;->zzul:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzif;->zzul:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/measurement/zzkc;->zzs(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/measurement/zzig;->zza(Lcom/google/android/gms/internal/measurement/zzif;Landroid/os/Bundle;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzif;->zzul:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v1, "_pn"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzif;->zzul:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v1, "_pc"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzif;->zzaos:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_pi"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapc:Lcom/google/android/gms/internal/measurement/zzif;

    iget-wide v2, v2, Lcom/google/android/gms/internal/measurement/zzif;->zzaot:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v1

    const-string v2, "auto"

    const-string v3, "_vs"

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzhl;->zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzig;->zzaov:Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzape:Lcom/google/android/gms/internal/measurement/zzig;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzih;->zzapd:Lcom/google/android/gms/internal/measurement/zzif;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzb(Lcom/google/android/gms/internal/measurement/zzif;)V

    return-void
.end method
