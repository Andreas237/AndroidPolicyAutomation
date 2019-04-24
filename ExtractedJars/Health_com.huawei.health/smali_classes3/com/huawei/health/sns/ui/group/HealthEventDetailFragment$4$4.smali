.class Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 442
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",Object = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    if-nez p1, :cond_0

    .line 444
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 446
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " userInfoBean.size(): "

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

    .line 447
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 448
    const/16 v0, 0x3eb

    iput v0, v5, Landroid/os/Message;->what:I

    .line 449
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 454
    :cond_0
    return-void
.end method
