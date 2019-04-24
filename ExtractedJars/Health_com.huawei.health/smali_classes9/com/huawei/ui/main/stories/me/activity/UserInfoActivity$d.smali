.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 437
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 438
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Landroid/os/Message;)V
    .locals 4

    .line 441
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 446
    :pswitch_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c()V

    .line 448
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savesuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 452
    :pswitch_1
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d()V

    .line 453
    goto :goto_0

    .line 455
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 456
    goto :goto_0

    .line 458
    :pswitch_3
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b()V

    .line 459
    goto :goto_0

    .line 461
    :pswitch_4
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 462
    .line 466
    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 435
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$d;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Landroid/os/Message;)V

    return-void
.end method
