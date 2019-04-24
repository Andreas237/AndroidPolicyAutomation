.class Lo/etd$4;
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
.field final synthetic e:Lo/etd;


# direct methods
.method constructor <init>(Lo/etd;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lo/etd$4;->e:Lo/etd;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 335
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentFitnessPlan errorCode="

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

    .line 336
    iget-object v0, p0, Lo/etd$4;->e:Lo/etd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/etd;->e(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 337
    iget-object v0, p0, Lo/etd$4;->e:Lo/etd;

    invoke-static {v0}, Lo/etd;->c(Lo/etd;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 338
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 342
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 343
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentFitnessPlan:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "null == data"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :cond_0
    const-string v0, "Suggestion_TodoCardData-getCurrentFitnessPlan end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 346
    iget-object v0, p0, Lo/etd$4;->e:Lo/etd;

    invoke-static {v0, p1}, Lo/etd;->e(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 347
    iget-object v0, p0, Lo/etd$4;->e:Lo/etd;

    invoke-static {v0}, Lo/etd;->c(Lo/etd;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 349
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 332
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/etd$4;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
