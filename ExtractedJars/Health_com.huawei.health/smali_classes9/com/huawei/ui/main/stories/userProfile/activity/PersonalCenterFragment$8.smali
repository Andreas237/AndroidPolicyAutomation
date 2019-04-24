.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 2030
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 2033
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->q(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dth;

    move-result-object v4

    .line 2034
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->i(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/os/Handler;

    move-result-object v5

    .line 2035
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 2036
    :cond_0
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRefreshPersonalDataFromSQL::mPluginAchieve/mHandler is null, return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2037
    return-void

    .line 2039
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v4, v1}, Lo/dth;->c(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->c(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 2040
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dth;->d(Landroid/content/Context;)Lo/dwe;

    move-result-object v6

    .line 2041
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->E(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2042
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPersonalMedalData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$8;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->E(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2045
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 2046
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRefreshPersonalDataFromSQL personalData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lo/dwe;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2047
    const/4 v0, 0x2

    invoke-virtual {v5, v0, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2049
    :cond_3
    return-void
.end method
