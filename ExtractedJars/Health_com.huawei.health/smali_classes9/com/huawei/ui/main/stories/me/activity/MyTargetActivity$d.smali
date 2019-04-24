.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V
    .locals 0

    .line 621
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    .line 622
    invoke-direct {p0, p2}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 623
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Landroid/os/Message;)V
    .locals 4

    .line 626
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 628
    :sswitch_0
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->i(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lo/cmj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->f(Lo/cmo;)V

    .line 631
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->g(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 632
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->finish()V

    .line 634
    :cond_0
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savesuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    goto :goto_0

    .line 637
    :sswitch_1
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Ljava/lang/Object;)V

    .line 638
    goto :goto_0

    .line 640
    :sswitch_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e(Ljava/lang/Object;)V

    .line 641
    goto :goto_0

    .line 643
    :sswitch_3
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Ljava/lang/Object;)V

    .line 644
    goto :goto_0

    .line 646
    :sswitch_4
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Z)Z

    .line 647
    invoke-static {}, Lo/fhv;->d()Lo/fhv;

    iget-object v0, p1, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/fhv;->d(Landroid/content/Context;)V

    .line 648
    .line 652
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_4
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0x68 -> :sswitch_3
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 620
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$d;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Landroid/os/Message;)V

    return-void
.end method
