.class final Lcom/google/android/gms/internal/measurement/zzie;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation build Landroid/support/annotation/MainThread;
.end annotation


# instance fields
.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Lcom/google/android/gms/internal/measurement/zzhm;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzie;-><init>(Lcom/google/android/gms/internal/measurement/zzhl;)V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "onActivityCreated"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/net/Uri;->isHierarchical()Z

    move-result v2

    if-eqz v2, :cond_6

    if-nez p2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzkc;->zzd(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "gs"

    goto :goto_0

    :cond_0
    const-string v0, "auto"

    :goto_0
    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    const-string v4, "_cmp"

    invoke-virtual {v3, v0, v4, v2}, Lcom/google/android/gms/internal/measurement/zzhl;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    const-string v0, "referrer"

    invoke-virtual {v1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    const-string v1, "gclid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "utm_campaign"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "utm_source"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "utm_medium"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "utm_term"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "utm_content"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Activity created with data \'referrer\' param without gclid and at least one utm field"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Activity created with referrer"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    const-string v2, "auto"

    const-string v3, "_ldl"

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzhl;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Throwable caught in onActivityCreated"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzig;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzig;->onActivityDestroyed(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 4
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzig;->onActivityPaused(Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgd()Lcom/google/android/gms/internal/measurement/zzji;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzjm;

    invoke-direct {v3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzjm;-><init>(Lcom/google/android/gms/internal/measurement/zzji;J)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzgh;->zzc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 4
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzig;->onActivityResumed(Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgd()Lcom/google/android/gms/internal/measurement/zzji;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzjl;

    invoke-direct {v3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzjl;-><init>(Lcom/google/android/gms/internal/measurement/zzji;J)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzgh;->zzc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzie;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzig;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
