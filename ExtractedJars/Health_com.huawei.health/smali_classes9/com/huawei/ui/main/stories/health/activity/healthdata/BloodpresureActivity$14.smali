.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;ZI)V
    .locals 0

    .line 436
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iput-boolean p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->c:Z

    iput p3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 439
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it is positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->c:Z

    if-eqz v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V

    goto :goto_0

    .line 445
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 449
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 450
    return-void
.end method
