.class Lo/bxk$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxk;->d(Z[I)V
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
.field final synthetic d:Lo/bxk;


# direct methods
.method constructor <init>(Lo/bxk;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 196
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAndStartMoudle getCurrentPlan onFailure "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v1

    invoke-interface {v1}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bxk;->d(Lo/bxk;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 198
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v1

    invoke-virtual {v1}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bxk;->e(Lo/bxk;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 199
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bxk;->d(Lo/bxk;Z)Z

    .line 200
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-static {v0}, Lo/bxk;->d(Lo/bxk;)V

    .line 201
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 205
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAndStartMoudle getCurrentPlan onSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-static {v0, p1}, Lo/bxk;->d(Lo/bxk;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 207
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v1

    invoke-virtual {v1}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bxk;->e(Lo/bxk;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 208
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bxk;->d(Lo/bxk;Z)Z

    .line 209
    iget-object v0, p0, Lo/bxk$3;->d:Lo/bxk;

    invoke-static {v0}, Lo/bxk;->d(Lo/bxk;)V

    .line 210
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 193
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/bxk$3;->c(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
