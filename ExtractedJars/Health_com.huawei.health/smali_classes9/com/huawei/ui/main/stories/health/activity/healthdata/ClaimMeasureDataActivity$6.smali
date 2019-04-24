.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 606
    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 607
    if-eqz v4, :cond_0

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendEmptyMessage(I)Z

    .line 609
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCheckData ErrorConstants.SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 611
    :cond_0
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCheckData ErrorConstants.ERR_NONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    :goto_0
    return-void
.end method
