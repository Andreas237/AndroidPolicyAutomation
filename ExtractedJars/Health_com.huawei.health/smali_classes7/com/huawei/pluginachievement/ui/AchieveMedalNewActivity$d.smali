.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 795
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 796
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Landroid/os/Message;)V
    .locals 4

    .line 800
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 803
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_0

    .line 804
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_0

    .line 808
    :pswitch_1
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_USERINFO_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    goto :goto_0

    .line 811
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->m(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    .line 812
    .line 816
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

    .line 793
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$d;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Landroid/os/Message;)V

    return-void
.end method
