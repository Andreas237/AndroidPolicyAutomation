.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 268
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 269
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parent is not a Activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->a()V

    .line 274
    sget-object v0, Lo/dae;->cM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fej;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 276
    return-void
.end method
