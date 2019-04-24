.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;

.field final synthetic d:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;Landroid/content/Intent;)V
    .locals 0

    .line 656
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;->d:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 660
    sget-object v0, Lo/dae;->cT:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 661
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 662
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 664
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;->d:Landroid/content/Intent;

    const-string v1, "view"

    const-string v2, "BondDevice"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 665
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;->d:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->startActivity(Landroid/content/Intent;)V

    .line 666
    return-void
.end method
