.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->p()V
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

    .line 161
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1706

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bvb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvb;->c()Lo/bvb;

    .line 172
    return-void
.end method
