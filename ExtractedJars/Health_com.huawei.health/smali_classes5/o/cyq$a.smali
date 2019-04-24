.class Lo/cyq$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/cyq;


# direct methods
.method public constructor <init>(Lo/cyq;Landroid/os/Looper;)V
    .locals 0

    .line 739
    iput-object p1, p0, Lo/cyq$a;->d:Lo/cyq;

    .line 740
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 741
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 745
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 746
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 748
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v5, v0

    check-cast v5, [B

    .line 749
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lo/cyq$a;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->n(Lo/cyq;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 752
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device-->SDK: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v5}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/cxq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lo/cyq$a;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->n(Lo/cyq;)Lo/cxx;

    move-result-object v0

    iget-object v1, p0, Lo/cyq$a;->d:Lo/cyq;

    invoke-static {v1}, Lo/cyq;->p(Lo/cyq;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    array-length v2, v5

    invoke-interface {v0, v1, v2, v5}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 760
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
