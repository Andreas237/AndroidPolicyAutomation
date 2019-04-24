.class Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 74
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 76
    :sswitch_0
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_TITLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Lo/emr;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 79
    goto/16 :goto_0

    .line 81
    :sswitch_1
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_PROGRESSBAR_GONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->b(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 83
    goto/16 :goto_0

    .line 85
    :sswitch_2
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_ONRECEIVED_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    goto/16 :goto_0

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->e(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    .line 92
    goto/16 :goto_0

    .line 94
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->e(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    .line 95
    goto/16 :goto_0

    .line 97
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->k(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    goto/16 :goto_0

    .line 102
    :sswitch_5
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 103
    const-string v0, "url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 104
    const-string v0, "type"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0, v6, v7}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    goto/16 :goto_0

    .line 109
    :sswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 111
    goto :goto_0

    .line 113
    :sswitch_7
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_CONNECT_TIMEOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    .line 115
    goto :goto_0

    .line 117
    :sswitch_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 118
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->f(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    goto :goto_0

    .line 123
    :sswitch_9
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_START_WEB_PAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v7

    .line 125
    const-string v0, "url"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;->a:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0, v8}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Ljava/lang/String;)V

    .line 127
    .line 132
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 133
    return-void

    :sswitch_data_0
    .sparse-switch
        0x42 -> :sswitch_8
        0x7d0 -> :sswitch_1
        0x7d1 -> :sswitch_2
        0x7d2 -> :sswitch_0
        0x7d3 -> :sswitch_3
        0x7d4 -> :sswitch_5
        0x7d5 -> :sswitch_6
        0x7d6 -> :sswitch_4
        0x7d7 -> :sswitch_7
        0x7e0 -> :sswitch_9
    .end sparse-switch
.end method
