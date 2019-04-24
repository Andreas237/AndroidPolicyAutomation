.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;->d:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;->d:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.onboarding_concern_status"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v2

    .line 259
    if-eqz v2, :cond_0

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;->d:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x69

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;->d:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 263
    :cond_0
    return-void
.end method
