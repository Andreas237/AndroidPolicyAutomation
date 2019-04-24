.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Lo/elk;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Lo/elk;Ljava/util/ArrayList;I)V
    .locals 0

    .line 542
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->e:Lo/elk;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->d:Ljava/util/ArrayList;

    iput p4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 545
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->e:Lo/elk;

    invoke-virtual {v0}, Lo/elk;->getValue()I

    move-result v4

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 547
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selectItem = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, " index = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    if-eqz v5, :cond_0

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/fdd;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;I)I

    .line 550
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timePeriod = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->b:I

    if-nez v0, :cond_1

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    goto :goto_0

    .line 555
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Ljava/lang/String;)V

    .line 557
    :goto_0
    return-void
.end method
