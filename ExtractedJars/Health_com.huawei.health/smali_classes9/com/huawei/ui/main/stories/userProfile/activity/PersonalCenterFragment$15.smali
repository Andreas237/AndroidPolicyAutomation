.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$15;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 2876
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$15;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 2879
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 2880
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive: action = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2881
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2882
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$15;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0, p2}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->c(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Landroid/content/Intent;)V

    .line 2884
    :cond_0
    return-void
.end method
