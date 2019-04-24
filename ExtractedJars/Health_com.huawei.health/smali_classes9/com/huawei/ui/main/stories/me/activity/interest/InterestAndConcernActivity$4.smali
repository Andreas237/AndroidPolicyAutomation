.class Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.onboarding_concern_status"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v2

    .line 95
    if-eqz v2, :cond_0

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 99
    :cond_0
    return-void
.end method
