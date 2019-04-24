.class Lcom/huawei/hwservicesmgr/PhoneService$b$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService$b;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwservicesmgr/PhoneService$b;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService$b;)V
    .locals 0

    .line 1288
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1291
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1292
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1293
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1294
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-virtual {v0, v4}, Lcom/huawei/hwservicesmgr/PhoneService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1295
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "restart service:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/PhoneService$b;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " action is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/PhoneService$b;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1296
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService$b;->c(Lcom/huawei/hwservicesmgr/PhoneService$b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1297
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->i(Lcom/huawei/hwservicesmgr/PhoneService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/PhoneService;->f(Lcom/huawei/hwservicesmgr/PhoneService;)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 1299
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;J)J

    .line 1300
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1301
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b$4;->b:Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->reconnect()V

    .line 1304
    :cond_1
    :goto_0
    return-void
.end method
