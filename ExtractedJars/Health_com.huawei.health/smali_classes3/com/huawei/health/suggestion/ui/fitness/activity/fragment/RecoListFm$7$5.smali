.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;->d(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;Ljava/util/List;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->d:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 353
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/bvp;->d(Ljava/util/List;)Lo/bvp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/bvp;->b(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    .line 354
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/bvp;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 355
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;

    invoke-direct {v1, p0, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 361
    return-void
.end method
