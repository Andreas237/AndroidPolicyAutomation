.class Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

.field final synthetic c:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Ljava/util/List;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;->a:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 343
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;->a:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;->c:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 346
    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 347
    const/16 v0, 0x5b

    iput v0, v3, Landroid/os/Message;->what:I

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;->a:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->g(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    move-result-object v0

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 349
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;->a:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->k(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 351
    :cond_0
    return-void
.end method
