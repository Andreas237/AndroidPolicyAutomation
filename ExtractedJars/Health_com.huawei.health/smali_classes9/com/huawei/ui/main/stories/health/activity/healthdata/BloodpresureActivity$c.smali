.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 617
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;)V
    .locals 0

    .line 617
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 622
    sget-object v0, Lo/dae;->cN:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 623
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 624
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 626
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 627
    const-string v0, "isShowInput"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 631
    return-void
.end method
