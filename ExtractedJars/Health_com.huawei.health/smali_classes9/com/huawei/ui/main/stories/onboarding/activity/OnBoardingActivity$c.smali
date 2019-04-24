.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 0

    .line 487
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 488
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Landroid/os/Message;)V
    .locals 2

    .line 493
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 496
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/huawei/hihealth/HiUserPreference;

    .line 497
    invoke-static {p1, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lcom/huawei/hihealth/HiUserPreference;)V

    .line 498
    .line 502
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x69 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 483
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$c;->c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Landroid/os/Message;)V

    return-void
.end method
