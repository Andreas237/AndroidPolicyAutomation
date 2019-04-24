.class Lo/eaa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eaa;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Lo/eaa;


# direct methods
.method constructor <init>(Lo/eaa;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 691
    iput-object p1, p0, Lo/eaa$1;->c:Lo/eaa;

    iput-object p2, p0, Lo/eaa$1;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 694
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 695
    iget-object v0, p0, Lo/eaa$1;->c:Lo/eaa;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eaa;->c(II)Ljava/util/List;

    move-result-object v4

    .line 696
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 697
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 698
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_0

    .line 699
    invoke-virtual {v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getReadFlag()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 700
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 702
    :cond_0
    goto :goto_0

    .line 704
    :cond_1
    iget-object v0, p0, Lo/eaa$1;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 705
    iget-object v0, p0, Lo/eaa$1;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 708
    :cond_2
    return-void
.end method
