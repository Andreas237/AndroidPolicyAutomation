.class public Lcom/huawei/healthcloud/plugintrack/manager/service/TrackJobService;
.super Landroid/app/job/JobService;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method


# virtual methods
.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 36
    invoke-super {p0, p1, p2, p3}, Landroid/app/job/JobService;->onStartCommand(Landroid/content/Intent;II)I

    .line 37
    const/4 v0, 0x1

    return v0
.end method

.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 2

    .line 19
    invoke-static {}, Lo/cbr;->c()Lo/cbr;

    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lo/cbr;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21
    invoke-static {p0}, Lo/cbr;->b(Landroid/content/Context;)V

    .line 22
    const/4 v0, 0x1

    return v0

    .line 23
    :cond_0
    invoke-virtual {v1}, Lo/cbr;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    invoke-virtual {v1}, Lo/cbr;->e()V

    .line 26
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 31
    const/4 v0, 0x0

    return v0
.end method
