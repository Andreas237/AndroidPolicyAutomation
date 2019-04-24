.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 657
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 660
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Z)Z

    .line 661
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 662
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z

    move-result v1

    const/4 v2, 0x3

    invoke-interface {v0, v2, v1}, Lo/brr;->c(IZ)V

    goto :goto_0

    .line 664
    :cond_0
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPersonalPrivacySettingValue:PluginSuggestionAdapterManager.getInstance() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 667
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->t(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 668
    return-void
.end method
