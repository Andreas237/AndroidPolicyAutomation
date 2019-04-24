.class Lo/dlz$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->c(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;Z)V
    .locals 0

    .line 623
    iput-object p1, p0, Lo/dlz$6;->c:Lo/dlz;

    iput-boolean p2, p0, Lo/dlz$6;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 6

    .line 626
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteWeightWeekly err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    if-nez p1, :cond_0

    .line 628
    move-object v5, p2

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 629
    iget-object v0, p0, Lo/dlz$6;->c:Lo/dlz;

    invoke-static {v0, v5}, Lo/dlz;->d(Lo/dlz;Lcom/huawei/hihealth/HiHealthData;)V

    .line 630
    goto :goto_0

    .line 631
    :cond_0
    iget-boolean v0, p0, Lo/dlz$6;->b:Z

    if-eqz v0, :cond_1

    .line 632
    iget-object v0, p0, Lo/dlz$6;->c:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x4e27

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 634
    iget-object v0, p0, Lo/dlz$6;->c:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_weekly_start_time_key"

    const-string v3, ""

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 637
    :cond_1
    :goto_0
    return-void
.end method
