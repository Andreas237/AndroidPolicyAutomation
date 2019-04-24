.class Lcom/huawei/bone/social/ui/RankingFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/xk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/RankingFragment;->s()V
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

    .line 704
    iput-object p1, p0, Lcom/huawei/bone/social/ui/RankingFragment$7;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/xh;)V
    .locals 5

    .line 708
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 709
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initAchieveData2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    return-void

    .line 713
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 714
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 715
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 716
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$7;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->o(Lcom/huawei/bone/social/ui/RankingFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 717
    return-void
.end method
