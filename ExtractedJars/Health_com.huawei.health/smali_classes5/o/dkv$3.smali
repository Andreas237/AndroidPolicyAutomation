.class Lo/dkv$3;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkv;->a(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dkv;


# direct methods
.method constructor <init>(Lo/dkv;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/dkv$3;->a:Lo/dkv;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 107
    invoke-static {}, Lo/dkq;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-static {}, Lo/dkq;->b()V

    .line 110
    :cond_0
    invoke-static {}, Lo/dkq;->d()I

    move-result v0

    const/16 v1, 0xc

    if-le v0, v1, :cond_3

    .line 112
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forced interruption"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lo/dkv$3;->a:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->e(Lo/dkv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 115
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 116
    iget-object v0, p0, Lo/dkv$3;->a:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->c(Lo/dkv;)Lo/dkw;

    move-result-object v0

    invoke-virtual {v0}, Lo/dkw;->d()V

    goto :goto_0

    .line 118
    :cond_1
    iget-object v0, p0, Lo/dkv$3;->a:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->c(Lo/dkv;)Lo/dkw;

    move-result-object v0

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 121
    :goto_0
    iget-object v0, p0, Lo/dkv$3;->a:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->e(Lo/dkv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "forced interruption"

    const v2, 0x19643

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 124
    :cond_2
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "times reched,no task cancle Timer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkq;->a(I)V

    .line 126
    invoke-static {}, Lo/dkq;->i()V

    goto :goto_1

    .line 129
    :cond_3
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 130
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no task cancle Timer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkq;->a(I)V

    .line 132
    invoke-static {}, Lo/dkq;->i()V

    .line 136
    :cond_4
    :goto_1
    return-void
.end method
