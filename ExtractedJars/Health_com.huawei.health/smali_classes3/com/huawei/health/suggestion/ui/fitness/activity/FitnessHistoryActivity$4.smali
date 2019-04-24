.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 222
    return-void
.end method
