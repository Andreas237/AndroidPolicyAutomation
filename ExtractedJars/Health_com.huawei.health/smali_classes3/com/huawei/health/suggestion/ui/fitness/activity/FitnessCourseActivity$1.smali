.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$1;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 71
    const-string v0, "0"

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/bzm;->e(Ljava/lang/String;I)V

    .line 72
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$1;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$1;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->startActivity(Landroid/content/Intent;)V

    .line 74
    return-void
.end method
