.class Lcom/huawei/bone/social/ui/RankingFragment$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/RankingFragment$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/bone/social/ui/RankingFragment$2;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment$2;)V
    .locals 0

    .line 561
    iput-object p1, p0, Lcom/huawei/bone/social/ui/RankingFragment$2$4;->a:Lcom/huawei/bone/social/ui/RankingFragment$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 564
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 566
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 567
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$2$4;->a:Lcom/huawei/bone/social/ui/RankingFragment$2;

    iget-object v0, v0, Lcom/huawei/bone/social/ui/RankingFragment$2;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->n(Lcom/huawei/bone/social/ui/RankingFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 568
    return-void
.end method

.method public b()V
    .locals 0

    .line 582
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 587
    return-void
.end method

.method public e()V
    .locals 5

    .line 572
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 574
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 575
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$2$4;->a:Lcom/huawei/bone/social/ui/RankingFragment$2;

    iget-object v0, v0, Lcom/huawei/bone/social/ui/RankingFragment$2;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->n(Lcom/huawei/bone/social/ui/RankingFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 577
    return-void
.end method
