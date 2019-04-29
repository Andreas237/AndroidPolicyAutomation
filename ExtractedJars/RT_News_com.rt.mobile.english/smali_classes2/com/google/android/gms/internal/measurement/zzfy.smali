.class public final Lcom/google/android/gms/internal/measurement/zzfy;
.super Ljava/lang/Object;


# instance fields
.field private final zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

.field volatile zzalf:Lcom/google/android/gms/internal/measurement/zzr;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field private zzalg:Landroid/content/ServiceConnection;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzfy;)Lcom/google/android/gms/internal/measurement/zzgm;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    return-object p0
.end method

.method private final zzjp()Z
    .locals 4
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to retrieve Package Manager to check Play Store compatibility"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return v0

    :cond_0
    const-string v2, "com.android.vending"

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0x4d17ab4

    if-lt v1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Failed to retrieve Play Store version"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method


# virtual methods
.method final zzc(Landroid/os/Bundle;)V
    .locals 10
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "install_begin_timestamp_seconds"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    cmp-long v0, v3, v1

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Service response is missing Install Referrer install timestamp"

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "install_referrer"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v7

    const-string v8, "InstallReferrer API result"

    invoke-virtual {v7, v8, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v7

    const-string v8, "?"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "No campaign params defined in install referrer result"

    goto :goto_0

    :cond_4
    const-string v7, "medium"

    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    const-string v8, "(not set)"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "organic"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    const/4 v7, 0x1

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_7

    const-string v7, "referrer_click_timestamp_seconds"

    invoke-virtual {p1, v7, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    mul-long/2addr v7, v5

    cmp-long p1, v7, v1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Install Referrer is missing click timestamp for ad campaign"

    goto/16 :goto_0

    :cond_6
    const-string p1, "click_timestamp"

    invoke-virtual {v0, p1, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakj:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v1

    cmp-long p1, v3, v1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Campaign has already been logged"

    goto/16 :goto_0

    :cond_8
    const-string p1, "_cis"

    const-string v1, "referrer API"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakj:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {p1, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object p1

    const-string v1, "auto"

    const-string v2, "_cmp"

    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzhl;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalg:Landroid/content/ServiceConnection;

    if-eqz p1, :cond_9

    invoke-static {}, Lcom/google/android/gms/common/stats/ConnectionTracker;->getInstance()Lcom/google/android/gms/common/stats/ConnectionTracker;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalg:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/common/stats/ConnectionTracker;->unbindService(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    :cond_9
    return-void

    :cond_a
    :goto_3
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "No referrer defined in install referrer response"

    goto/16 :goto_0
.end method

.method protected final zzjo()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzfy;->zzjp()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Install Referrer Reporter is not available"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalg:Landroid/content/ServiceConnection;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzga;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/measurement/zzga;-><init>(Lcom/google/android/gms/internal/measurement/zzfy;Lcom/google/android/gms/internal/measurement/zzfz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalg:Landroid/content/ServiceConnection;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Install Referrer Reporter is initializing"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.android.vending"

    const-string v3, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Failed to obtain Package Manager to verify binding conditions"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    iget-object v2, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v2, :cond_4

    iget-object v2, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalg:Landroid/content/ServiceConnection;

    if-eqz v1, :cond_3

    const-string v1, "com.android.vending"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzfy;->zzjp()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/stats/ConnectionTracker;->getInstance()Lcom/google/android/gms/common/stats/ConnectionTracker;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalg:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v1, v3, v4}, Lcom/google/android/gms/common/stats/ConnectionTracker;->bindService(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Install Referrer Service is"

    if-eqz v0, :cond_2

    const-string v0, "available"

    goto :goto_0

    :cond_2
    const-string v0, "not available"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Exception occurred while binding to Install Referrer Service"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Play Store missing or incompatible. Version 8.3.73 or later required"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Play Service for fetching Install Referrer is unavailable on device"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void
.end method

.method final zzjq()Landroid/os/Bundle;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalf:Lcom/google/android/gms/internal/measurement/zzr;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Attempting to use Install Referrer Service while it is not initialized"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-object v1

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "package_name"

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzalf:Lcom/google/android/gms/internal/measurement/zzr;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/measurement/zzr;->zza(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Install Referrer Service returned a null response"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_1
    return-object v0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzfy;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Exception occurred while retrieving the Install Referrer"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1
.end method
