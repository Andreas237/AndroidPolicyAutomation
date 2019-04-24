.class Lcom/huawei/bone/social/ui/LauncherActivity$10;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/LauncherActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/bone/social/ui/LauncherActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 0

    .line 383
    iput-object p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 386
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

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

    .line 387
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 388
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 390
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->d(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "socialRankSwitch"

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->e(Lcom/huawei/bone/social/ui/LauncherActivity;)Lcom/huawei/bone/social/ui/RankingFragment;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->e(Lcom/huawei/bone/social/ui/LauncherActivity;)Lcom/huawei/bone/social/ui/RankingFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->c()V

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->b(Lcom/huawei/bone/social/ui/LauncherActivity;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->b(Lcom/huawei/bone/social/ui/LauncherActivity;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 396
    goto :goto_1

    .line 398
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->h(Lcom/huawei/bone/social/ui/LauncherActivity;)V

    .line 399
    goto :goto_1

    .line 402
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$10;->e:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->b(Lcom/huawei/bone/social/ui/LauncherActivity;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyVisibility(I)V

    .line 403
    goto :goto_1

    .line 405
    :goto_0
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
