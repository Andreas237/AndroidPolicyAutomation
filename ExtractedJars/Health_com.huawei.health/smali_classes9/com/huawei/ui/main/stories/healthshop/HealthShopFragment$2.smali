.class Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 64
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 66
    :pswitch_0
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_TITLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lo/emr;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 69
    goto/16 :goto_0

    .line 71
    :pswitch_1
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_PROGRESSBAR_GONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 73
    goto/16 :goto_0

    .line 75
    :pswitch_2
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_ONRECEIVED_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->a(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    goto/16 :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->d(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    .line 82
    goto :goto_0

    .line 84
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->d(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    .line 85
    goto :goto_0

    .line 87
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->h(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    goto :goto_0

    .line 92
    :pswitch_5
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 93
    const-string v0, "url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 94
    const-string v0, "type"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0, v6, v7}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    goto :goto_0

    .line 99
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->a(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 101
    goto :goto_0

    .line 103
    :pswitch_7
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_CONNECT_TIMEOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    .line 105
    .line 109
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 110
    return-void

    :pswitch_data_0
    .packed-switch 0x7d0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_7
    .end packed-switch
.end method
