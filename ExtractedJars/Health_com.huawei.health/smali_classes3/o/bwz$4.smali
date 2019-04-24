.class Lo/bwz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwz;->b(Lo/bwz$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bwz;

.field final synthetic b:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;


# direct methods
.method constructor <init>(Lo/bwz;Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/bwz$4;->a:Lo/bwz;

    iput-object p2, p0, Lo/bwz$4;->b:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 164
    iget-object v0, p0, Lo/bwz$4;->a:Lo/bwz;

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v1

    invoke-virtual {v1}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bwz;->e(Lo/bwz;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 165
    iget-object v0, p0, Lo/bwz$4;->a:Lo/bwz;

    invoke-static {v0}, Lo/bwz;->c(Lo/bwz;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bwz$4;->a:Lo/bwz;

    .line 166
    invoke-static {v0}, Lo/bwz;->c(Lo/bwz;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v1, v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/bwz$4;->a:Lo/bwz;

    invoke-static {v0}, Lo/bwz;->e(Lo/bwz;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 168
    return-void

    .line 170
    :cond_0
    iget-object v0, p0, Lo/bwz$4;->a:Lo/bwz;

    iget-object v1, p0, Lo/bwz$4;->b:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-static {v0, v1}, Lo/bwz;->e(Lo/bwz;Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)V

    .line 171
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 172
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    sget-object v0, Lo/dae;->bl:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 176
    iget-object v0, p0, Lo/bwz$4;->a:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 178
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    sget-object v0, Lo/dae;->dq:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 181
    :cond_1
    return-void
.end method
