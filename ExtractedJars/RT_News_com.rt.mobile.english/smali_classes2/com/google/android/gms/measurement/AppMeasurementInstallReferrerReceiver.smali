.class public final Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;
.super Landroid/content/BroadcastReceiver;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzgf;


# instance fields
.field private zzadd:Lcom/google/android/gms/internal/measurement/zzgc;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final doGoAsync()Landroid/content/BroadcastReceiver$PendingResult;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final doStartService(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->zzadd:Lcom/google/android/gms/internal/measurement/zzgc;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzgc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzgc;-><init>(Lcom/google/android/gms/internal/measurement/zzgf;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->zzadd:Lcom/google/android/gms/internal/measurement/zzgc;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->zzadd:Lcom/google/android/gms/internal/measurement/zzgc;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzgc;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
