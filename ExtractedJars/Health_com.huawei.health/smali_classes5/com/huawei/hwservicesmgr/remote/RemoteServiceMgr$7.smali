.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initConnection()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 422
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1900(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 423
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$2000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    .line 424
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-nez v0, :cond_0

    .line 425
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$2200(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$2100(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 427
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$2302(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;J)J

    goto :goto_0

    .line 430
    :cond_1
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can\'t find health app, uninstalled?"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :goto_0
    return-void
.end method
