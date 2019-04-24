.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fdf;

    invoke-virtual {v1}, Lo/fdf;->c()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;D)D

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fdf;

    invoke-virtual {v1}, Lo/fdf;->d()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;D)D

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fdf;

    invoke-virtual {v1}, Lo/fdf;->a()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;D)D

    .line 320
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 321
    const-string v0, "high"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)D

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 322
    const-string v0, "low"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)D

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 323
    const-string v0, "BI_Tag"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 324
    const-string v0, "isShowInput"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 325
    const-string v0, "bmp"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)D

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 326
    const-string v0, "deletetime"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fdf;

    invoke-virtual {v1}, Lo/fdf;->b()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 328
    return-void
.end method
