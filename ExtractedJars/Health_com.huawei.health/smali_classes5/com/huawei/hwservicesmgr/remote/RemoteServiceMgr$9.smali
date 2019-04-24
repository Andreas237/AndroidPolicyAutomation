.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->isLoudspeakerMuteOpenOrCloseHeartRate(IILo/djt;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

.field final synthetic val$callback:Lo/djt;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Lo/djt;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$9;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$9;->val$callback:Lo/djt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 611
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$9;->val$callback:Lo/djt;

    invoke-interface {v0, p1}, Lo/djt;->e(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 614
    goto :goto_0

    .line 612
    :catch_0
    move-exception v4

    .line 613
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    :goto_0
    return-void
.end method
