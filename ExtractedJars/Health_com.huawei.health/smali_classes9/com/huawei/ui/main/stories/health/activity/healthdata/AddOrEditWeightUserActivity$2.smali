.class Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

.field final synthetic e:Lo/acu;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/acu;)V
    .locals 0

    .line 748
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;->e:Lo/acu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 752
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 753
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 754
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 755
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->setResult(ILandroid/content/Intent;)V

    .line 757
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->finish()V

    .line 758
    return-void
.end method
