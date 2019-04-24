.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 158
    const-string v0, "1"

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/bzm;->e(Ljava/lang/String;I)V

    .line 159
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->startActivity(Landroid/content/Intent;)V

    .line 161
    return-void
.end method
