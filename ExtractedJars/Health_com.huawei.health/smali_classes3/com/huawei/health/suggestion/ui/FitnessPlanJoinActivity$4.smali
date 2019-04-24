.class Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;->e:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 134
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick setPositiveButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;->e:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 136
    const-string v0, "plan"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;->e:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->c(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 137
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;->e:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->startActivity(Landroid/content/Intent;)V

    .line 138
    return-void
.end method
