.class Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V
    .locals 0

    .line 398
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 399
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;Landroid/os/Message;)V
    .locals 4

    .line 403
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 406
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_0

    .line 411
    :pswitch_1
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_USERINFO_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    goto :goto_0

    .line 414
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V

    .line 415
    .line 419
    :cond_0
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 396
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$a;->a(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;Landroid/os/Message;)V

    return-void
.end method
