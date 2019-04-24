.class Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)V
    .locals 0

    .line 146
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 147
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;Landroid/os/Message;)V
    .locals 1

    .line 151
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 153
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->c(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;Ljava/lang/String;)V

    .line 154
    .line 158
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 144
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$c;->b(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;Landroid/os/Message;)V

    return-void
.end method
