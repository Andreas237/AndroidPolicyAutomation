.class public Lcom/huawei/healthcloud/plugintrack/open/TrackService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private b:Lo/cgc;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->b:Lo/cgc;

    .line 25
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->b:Lo/cgc;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 29
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 30
    const-string v0, "Track_TrackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    new-instance v0, Lo/cgc;

    invoke-direct {v0, p0}, Lo/cgc;-><init>(Lcom/huawei/healthcloud/plugintrack/open/TrackService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->b:Lo/cgc;

    .line 38
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 47
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 48
    const-string v0, "Track_TrackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackService ondestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->b:Lo/cgc;

    invoke-virtual {v0}, Lo/cgc;->i()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->b:Lo/cgc;

    .line 52
    return-void
.end method
