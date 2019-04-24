.class Lo/dde$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dde;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/dde;


# direct methods
.method public constructor <init>(Lo/dde;Landroid/os/Looper;)V
    .locals 0

    .line 3804
    iput-object p1, p0, Lo/dde$e;->a:Lo/dde;

    .line 3805
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3806
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 3810
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 3811
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 3813
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/DBObject;

    .line 3814
    invoke-virtual {v4}, Lcom/huawei/datatype/DBObject;->getiBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v5

    .line 3815
    invoke-virtual {v4}, Lcom/huawei/datatype/DBObject;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 3816
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataDeviceAvoidDisturbList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3817
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3818
    return-void

    .line 3850
    :cond_0
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 3851
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/dde$e$5;

    invoke-direct {v1, p0, v5}, Lo/dde$e$5;-><init>(Lo/dde$e;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v6, v1}, Lo/dqi;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_1

    .line 3865
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/DBObject;

    .line 3866
    invoke-virtual {v4}, Lcom/huawei/datatype/DBObject;->getiBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v5

    .line 3867
    invoke-virtual {v4}, Lcom/huawei/datatype/DBObject;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 3868
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataDeviceAvoidDisturbList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3869
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 3870
    return-void

    .line 3886
    :cond_1
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 3887
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/dde$e$2;

    invoke-direct {v1, p0, v5}, Lo/dde$e$2;-><init>(Lo/dde$e;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v6, v1}, Lo/dqi;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_1

    .line 3902
    :sswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 3907
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 3908
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/dde$e$4;

    invoke-direct {v1, p0, v4}, Lo/dde$e$4;-><init>(Lo/dde$e;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/dqi;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 3948
    :sswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 3949
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 3950
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    const-string v1, "avoid_disturb"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "User_ID=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dde;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' AND indexs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/dde;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    .line 3951
    goto :goto_0

    .line 3952
    :cond_2
    goto :goto_1

    .line 3955
    :sswitch_4
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 3956
    iget-object v0, p0, Lo/dde$e;->a:Lo/dde;

    invoke-static {v0, v4}, Lo/dde;->b(Lo/dde;I)V

    .line 3957
    .line 3962
    :cond_3
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x21 -> :sswitch_4
    .end sparse-switch
.end method
