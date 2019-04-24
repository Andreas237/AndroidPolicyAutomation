.class Lcom/huawei/bone/social/ui/RankingFragment$1;
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
.field final synthetic a:Lcom/huawei/bone/social/ui/RankingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 294
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg.what ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 296
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 298
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->b(Lcom/huawei/bone/social/ui/RankingFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 299
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAttach is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    return-void

    .line 302
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 304
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/xp;->a(Landroid/content/Context;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->e(Lcom/huawei/bone/social/ui/RankingFragment;I)I

    .line 305
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    iget-object v2, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v2}, Lcom/huawei/bone/social/ui/RankingFragment;->d(Lcom/huawei/bone/social/ui/RankingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v5}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/huawei/bone/social/ui/RankingFragment;->c(Ljava/util/ArrayList;J)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->d(Lcom/huawei/bone/social/ui/RankingFragment;I)I

    .line 306
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v1}, Lcom/huawei/bone/social/ui/RankingFragment;->d(Lcom/huawei/bone/social/ui/RankingFragment;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v2}, Lcom/huawei/bone/social/ui/RankingFragment;->f(Lcom/huawei/bone/social/ui/RankingFragment;)Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v3}, Lcom/huawei/bone/social/ui/RankingFragment;->i(Lcom/huawei/bone/social/ui/RankingFragment;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/bone/social/ui/RankingFragment;->c(Ljava/util/ArrayList;Lcom/huawei/bone/social/manager/db/SocialRankingTable;I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->g(Lcom/huawei/bone/social/ui/RankingFragment;)V

    .line 308
    goto :goto_1

    .line 310
    :pswitch_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "socialRankSwitch"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->h(Lcom/huawei/bone/social/ui/RankingFragment;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->d(Z)V

    .line 313
    goto :goto_1

    .line 315
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$1;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->k(Lcom/huawei/bone/social/ui/RankingFragment;)V

    .line 316
    goto :goto_1

    .line 318
    :goto_0
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
