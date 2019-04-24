.class Lcom/huawei/bone/social/ui/RankingFragment$6;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/RankingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/bone/social/ui/RankingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 671
    iput-object p1, p0, Lcom/huawei/bone/social/ui/RankingFragment$6;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 674
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 675
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/xh;

    .line 676
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 677
    return-void

    .line 679
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 681
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/xh;

    .line 682
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_FROM_DB:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/xh;->a()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$6;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v5}, Lo/xh;->e()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->a(Lcom/huawei/bone/social/ui/RankingFragment;I)V

    .line 684
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$6;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v5}, Lo/xh;->b()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/bone/social/ui/RankingFragment;->e(Lcom/huawei/bone/social/ui/RankingFragment;D)V

    .line 685
    goto :goto_0

    .line 687
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/xh;

    .line 688
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE_FROM_CLOUD:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/xh;->a()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$6;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v5}, Lo/xh;->e()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->a(Lcom/huawei/bone/social/ui/RankingFragment;I)V

    .line 690
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$6;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v5}, Lo/xh;->b()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/bone/social/ui/RankingFragment;->e(Lcom/huawei/bone/social/ui/RankingFragment;D)V

    .line 691
    .line 696
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
