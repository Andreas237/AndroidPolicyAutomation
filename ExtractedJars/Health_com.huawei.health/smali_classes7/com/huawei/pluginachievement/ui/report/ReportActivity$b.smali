.class public Lcom/huawei/pluginachievement/ui/report/ReportActivity$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/pluginachievement/ui/report/ReportActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V
    .locals 0

    .line 435
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 436
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Landroid/os/Message;)V
    .locals 3

    .line 445
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 447
    :pswitch_0
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "refresh WHAT_REFRESH_DATA_FROM_NET"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    const-string v2, ""

    .line 449
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 450
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 452
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 453
    iget v0, p2, Landroid/os/Message;->arg1:I

    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->p(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;

    move-result-object v1

    invoke-static {p1, v0, v2, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;ILjava/lang/String;Lo/dvf;)V

    .line 455
    :cond_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Z)Z

    .line 456
    goto :goto_0

    .line 458
    :pswitch_1
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "refresh WHAT_REFRESH_DATA_FROM_SQL"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Lo/dvf;)V

    .line 460
    goto :goto_0

    .line 462
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Ljava/util/List;)V

    .line 463
    goto :goto_0

    .line 465
    :pswitch_3
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    .line 466
    goto :goto_0

    .line 468
    :pswitch_4
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->o(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    .line 469
    .line 473
    :goto_0
    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 440
    invoke-super {p0, p1}, Lo/dbb;->handleMessage(Landroid/os/Message;)V

    .line 441
    return-void
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 433
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$b;->d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Landroid/os/Message;)V

    return-void
.end method
