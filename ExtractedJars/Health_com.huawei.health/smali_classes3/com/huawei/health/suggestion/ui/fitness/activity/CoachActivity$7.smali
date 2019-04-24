.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwa;->d(Z)V

    .line 235
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "is_first_to_coachacitivyt"

    const-string v2, "notfirst"

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->o()V

    .line 238
    return-void
.end method
