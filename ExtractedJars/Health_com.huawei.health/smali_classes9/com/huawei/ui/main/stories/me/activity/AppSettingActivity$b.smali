.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 757
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 758
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/os/Message;)V
    .locals 2

    .line 761
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 763
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/content/Intent;

    .line 764
    invoke-virtual {p1, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(Landroid/content/Intent;)V

    .line 765
    .line 769
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 755
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;->c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/os/Message;)V

    return-void
.end method
