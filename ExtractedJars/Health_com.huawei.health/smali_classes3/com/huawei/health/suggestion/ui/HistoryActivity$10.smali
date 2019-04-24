.class Lcom/huawei/health/suggestion/ui/HistoryActivity$10;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;)V"
        }
    .end annotation

    .line 345
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() onSuccess:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;)I

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 349
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->c()Ljava/util/ArrayList;

    move-result-object v4

    .line 350
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 351
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fitnessPlanRecords = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() onSuccess:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "fitnessPlanRecords:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    invoke-interface {p1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/util/List;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b()V

    .line 358
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 5

    .line 318
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "onFailure"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;)I

    move-result v0

    if-nez v0, :cond_2

    .line 322
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 323
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFailure mLocalPlanRecord = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->c()Ljava/util/ArrayList;

    move-result-object v4

    .line 326
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 327
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFailure fitnessPlanRecords = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 330
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/util/List;)V

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->e()V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/bvn;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 334
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/bvn;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvn;->e()Lo/bvn;

    goto :goto_0

    .line 337
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/bvn;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 338
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/bvn;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvn;->a()V

    .line 341
    :cond_3
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 315
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;->a(Ljava/util/List;)V

    return-void
.end method
