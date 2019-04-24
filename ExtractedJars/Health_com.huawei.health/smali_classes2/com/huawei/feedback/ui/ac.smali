.class Lcom/huawei/feedback/ui/ac;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 608
    iput-object p1, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 612
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 618
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->c(I)V

    .line 626
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 627
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->b(Ljava/lang/String;)V

    .line 635
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 636
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->m(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;I)V

    .line 638
    const-string v0, "FeedbackEditActivity"

    const-string v1, "FeedbackEditActivity.this.isFinishing().ZIP_SUCCESS"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    return-void

    .line 645
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->n(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 647
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/FeedbackEditActivity$i;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    .line 654
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->m(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 672
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;I)V

    .line 678
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 681
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 682
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 683
    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_no_network_connection_prompt"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 682
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 681
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 684
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 690
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 692
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->o(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    goto :goto_0

    .line 721
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 722
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;I)V

    .line 723
    const-string v0, "FeedbackEditActivity"

    const-string v1, "FeedbackEditActivity.this.isFinishing().ZIP_FAIL"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    return-void

    .line 730
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->n(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 732
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;I)V

    .line 733
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->p(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 734
    goto :goto_0

    .line 736
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->q(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 737
    goto :goto_0

    .line 741
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->r(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 742
    goto :goto_0

    .line 744
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/Object;)V

    .line 745
    goto :goto_0

    .line 747
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/feedback/ui/ac;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->s(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 748
    .line 752
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 753
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x3e8 -> :sswitch_4
        0x3e9 -> :sswitch_5
    .end sparse-switch
.end method
