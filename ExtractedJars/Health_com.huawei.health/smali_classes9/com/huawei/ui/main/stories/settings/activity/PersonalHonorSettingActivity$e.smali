.class Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V
    .locals 0

    .line 280
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 281
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;Landroid/os/Message;)V
    .locals 3

    .line 285
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 287
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo/fhr;

    .line 288
    invoke-static {p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v2}, Lo/fhr;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    invoke-static {p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v2}, Lo/fhr;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    goto :goto_0

    .line 292
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V

    .line 293
    .line 297
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x64 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 277
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$e;->a(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;Landroid/os/Message;)V

    return-void
.end method
