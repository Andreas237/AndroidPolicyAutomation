.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 601
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 607
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 614
    return-void
.end method
