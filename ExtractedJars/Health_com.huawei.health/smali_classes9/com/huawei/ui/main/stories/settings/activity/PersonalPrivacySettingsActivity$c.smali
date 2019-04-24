.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V
    .locals 0

    .line 892
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 893
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Landroid/os/Message;)V
    .locals 3

    .line 898
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 901
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiUserPreference;

    .line 902
    invoke-static {p1, v2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Lcom/huawei/hihealth/HiUserPreference;)V

    .line 903
    goto :goto_0

    .line 905
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 906
    goto :goto_0

    .line 908
    :pswitch_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;J)V

    .line 909
    .line 913
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 888
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$c;->d(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Landroid/os/Message;)V

    return-void
.end method
