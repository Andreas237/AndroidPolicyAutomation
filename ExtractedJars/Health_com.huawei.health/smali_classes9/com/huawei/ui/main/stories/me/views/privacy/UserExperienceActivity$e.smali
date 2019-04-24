.class Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;)V
    .locals 0

    .line 109
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 110
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;Landroid/os/Message;)V
    .locals 1

    .line 115
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 117
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->b(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;Ljava/lang/String;)V

    .line 118
    .line 122
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 107
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$e;->c(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;Landroid/os/Message;)V

    return-void
.end method
