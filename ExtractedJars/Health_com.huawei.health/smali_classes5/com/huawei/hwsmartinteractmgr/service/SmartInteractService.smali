.class public Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private a:Lo/dls;

.field private b:Lo/dlf;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 51
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->a:Lo/dls;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 25
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 26
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    iput-object p0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->e:Landroid/content/Context;

    .line 28
    new-instance v0, Lo/dls;

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dls;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->a:Lo/dls;

    .line 29
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->b:Lo/dlf;

    .line 30
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 63
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 64
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->a:Lo/dls;

    if-eqz v0, :cond_0

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->a:Lo/dls;

    .line 69
    :cond_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 34
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 36
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    const/4 v0, 0x0

    return v0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->b:Lo/dlf;

    new-instance v1, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService$4;-><init>(Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;)V

    invoke-virtual {v0, v1}, Lo/dlf;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 46
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 4

    .line 57
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUnbind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
