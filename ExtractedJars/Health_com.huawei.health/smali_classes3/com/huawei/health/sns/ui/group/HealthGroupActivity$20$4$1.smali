.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;)V
    .locals 0

    .line 1585
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1588
    if-nez p1, :cond_0

    .line 1589
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 1590
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1591
    invoke-interface {v5, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1593
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handlerGroupRankInfoFromCloud groupRankList size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1595
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;)V

    .line 1596
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "processGroupUserInfo mHandler.sendMessage(msg) start"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1597
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 1598
    const v0, 0x8001

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1599
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1600
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1601
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "processGroupUserInfo mHandler.sendMessage(msg) end"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1603
    :cond_0
    return-void
.end method
