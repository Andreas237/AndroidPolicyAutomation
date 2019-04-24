.class Lo/etd$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etd;->c(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/etd;


# direct methods
.method constructor <init>(Lo/etd;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lo/etd$2;->d:Lo/etd;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 313
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPlan Ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 315
    iget-object v0, p0, Lo/etd$2;->d:Lo/etd;

    invoke-static {v0, p1}, Lo/etd;->b(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    goto :goto_0

    .line 317
    :cond_0
    const-string v0, "Suggestion_TodoCardData-getCurrentPlan:mRunPlanData = null"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lo/etd$2;->d:Lo/etd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/etd;->b(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 320
    :goto_0
    const-string v0, "Suggestion_TodoCardData-getPlanData end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 321
    iget-object v0, p0, Lo/etd$2;->d:Lo/etd;

    invoke-static {v0}, Lo/etd;->c(Lo/etd;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 322
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 306
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentPlan errorCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorInfo ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lo/etd$2;->d:Lo/etd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/etd;->b(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 308
    iget-object v0, p0, Lo/etd$2;->d:Lo/etd;

    invoke-static {v0}, Lo/etd;->c(Lo/etd;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 309
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 303
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/etd$2;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
