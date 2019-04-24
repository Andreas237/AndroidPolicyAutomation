.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V
    .locals 0

    .line 761
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 762
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Landroid/os/Message;)V
    .locals 4

    .line 766
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 769
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_0

    .line 770
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_0

    .line 774
    :pswitch_1
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_USERINFO_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    goto :goto_0

    .line 777
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->q(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    .line 778
    .line 782
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

    .line 759
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$e;->c(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Landroid/os/Message;)V

    return-void
.end method
