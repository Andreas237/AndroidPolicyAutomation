.class final Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(ILandroid/os/Handler;)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Landroid/os/Handler;

.field final synthetic d:I


# direct methods
.method constructor <init>(Landroid/os/Handler;I)V
    .locals 0

    .line 478
    iput-object p1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;->b:Landroid/os/Handler;

    iput p2, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;)V"
        }
    .end annotation

    .line 483
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 484
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 485
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 486
    if-eqz v3, :cond_0

    .line 488
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 489
    const-string v0, "keyContactMatchList"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 490
    const-string v0, "keyContactQueryEventType"

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;->d:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 491
    invoke-virtual {v2, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 493
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 494
    return-void
.end method
