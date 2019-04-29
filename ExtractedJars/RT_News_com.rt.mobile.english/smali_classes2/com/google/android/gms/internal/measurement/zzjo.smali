.class public final Lcom/google/android/gms/internal/measurement/zzjo;
.super Lcom/google/android/gms/internal/measurement/zzjr;


# instance fields
.field private final zzaqh:Lcom/google/android/gms/internal/measurement/zzeo;

.field private final zzyi:Landroid/app/AlarmManager;

.field private zzyj:Ljava/lang/Integer;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyi:Landroid/app/AlarmManager;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlj()Lcom/google/android/gms/internal/measurement/zzgm;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzjp;-><init>(Lcom/google/android/gms/internal/measurement/zzjo;Lcom/google/android/gms/internal/measurement/zzhj;Lcom/google/android/gms/internal/measurement/zzjs;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzaqh:Lcom/google/android/gms/internal/measurement/zzeo;

    return-void
.end method

.method private final getJobId()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyj:Ljava/lang/Integer;

    if-nez v0, :cond_1

    const-string v0, "measurement"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyj:Ljava/lang/Integer;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyj:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private final zzek()Landroid/app/PendingIntent;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.AppMeasurementReceiver"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private final zzku()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "jobscheduler"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Cancelling job. JobID"

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->getJobId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->getJobId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->cancel(I)V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyi:Landroid/app/AlarmManager;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->zzek()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzaqh:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->zzku()V

    :cond_0
    return-void
.end method

.method public final bridge synthetic getContext()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzab()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzab()V

    return-void
.end method

.method public final bridge synthetic zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfr()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfr()V

    return-void
.end method

.method public final bridge synthetic zzfs()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfs()V

    return-void
.end method

.method public final bridge synthetic zzft()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzft()V

    return-void
.end method

.method public final bridge synthetic zzfu()Lcom/google/android/gms/internal/measurement/zzdu;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfu()Lcom/google/android/gms/internal/measurement/zzdu;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfv()Lcom/google/android/gms/internal/measurement/zzhl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfw()Lcom/google/android/gms/internal/measurement/zzfc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfx()Lcom/google/android/gms/internal/measurement/zzeq;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfy()Lcom/google/android/gms/internal/measurement/zzij;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfz()Lcom/google/android/gms/internal/measurement/zzig;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzga()Lcom/google/android/gms/internal/measurement/zzfd;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgb()Lcom/google/android/gms/internal/measurement/zzff;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgc()Lcom/google/android/gms/internal/measurement/zzkc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgd()Lcom/google/android/gms/internal/measurement/zzji;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgd()Lcom/google/android/gms/internal/measurement/zzji;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzge()Lcom/google/android/gms/internal/measurement/zzgh;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgf()Lcom/google/android/gms/internal/measurement/zzfh;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgg()Lcom/google/android/gms/internal/measurement/zzfs;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgh()Lcom/google/android/gms/internal/measurement/zzeg;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgi()Lcom/google/android/gms/internal/measurement/zzec;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(J)V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgc;->zza(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Receiver not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Service not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->cancel()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    add-long v4, v0, p1

    const-wide/16 v0, 0x0

    sget-object v2, Lcom/google/android/gms/internal/measurement/zzey;->zzahm:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-gez v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzaqh:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->zzef()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Scheduling upload with DelayedRunnable"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzaqh:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzeo;->zzh(J)V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Scheduling upload with JobScheduler"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.AppMeasurementJobService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "jobscheduler"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/job/JobScheduler;

    new-instance v2, Landroid/app/job/JobInfo$Builder;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->getJobId()I

    move-result v3

    invoke-direct {v2, v3, v0}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    invoke-virtual {v2, p1, p2}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    const/4 v0, 0x1

    shl-long/2addr p1, v0

    invoke-virtual {v2, p1, p2}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    new-instance p1, Landroid/os/PersistableBundle;

    invoke-direct {p1}, Landroid/os/PersistableBundle;-><init>()V

    const-string p2, "action"

    const-string v0, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {p1, p2, v0}, Landroid/os/PersistableBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    invoke-virtual {v2}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string v0, "Scheduling job. JobID"

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->getJobId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Scheduling upload with AlarmManager"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyi:Landroid/app/AlarmManager;

    const/4 v3, 0x2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzey;->zzahh:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->zzek()Landroid/app/PendingIntent;

    move-result-object v8

    invoke-virtual/range {v2 .. v8}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    return-void
.end method

.method protected final zzhh()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjo;->zzyi:Landroid/app/AlarmManager;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->zzek()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjo;->zzku()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic zzjc()Lcom/google/android/gms/internal/measurement/zzjy;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzjd()Lcom/google/android/gms/internal/measurement/zzeb;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzjd()Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzje()Lcom/google/android/gms/internal/measurement/zzej;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    return-object v0
.end method
