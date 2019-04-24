.class Lo/dde$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dde;

.field final synthetic d:Lo/eaa;

.field final synthetic e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;


# direct methods
.method constructor <init>(Lo/dde;Lo/eaa;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 3990
    iput-object p1, p0, Lo/dde$6;->c:Lo/dde;

    iput-object p2, p0, Lo/dde$6;->d:Lo/eaa;

    iput-object p3, p0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 3993
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 3994
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 3995
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage, delete messageList, messageList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3996
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    .line 3997
    new-instance v0, Lo/dde$6$5;

    invoke-direct {v0, p0, v4}, Lo/dde$6$5;-><init>(Lo/dde$6;Ljava/util/List;)V

    invoke-interface {v5, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 4091
    :cond_0
    return-void
.end method
