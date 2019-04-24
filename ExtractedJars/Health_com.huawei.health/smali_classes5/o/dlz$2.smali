.class Lo/dlz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->f(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egg;

.field final synthetic e:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;Lo/egg;)V
    .locals 0

    .line 587
    iput-object p1, p0, Lo/dlz$2;->e:Lo/dlz;

    iput-object p2, p0, Lo/dlz$2;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 590
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 591
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthWeekly,datas =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 593
    :cond_0
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthWeekly,getWeightData = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    iget-object v0, p0, Lo/dlz$2;->c:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 596
    :cond_1
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthWeekly,getWeightData has data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lo/dlz$2;->e:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "ai-weight-007"

    new-instance v2, Lo/dlz$2$3;

    invoke-direct {v2, p0, v4}, Lo/dlz$2$3;-><init>(Lo/dlz$2;Ljava/util/List;)V

    invoke-virtual {v0, v1, v2}, Lo/dly;->a(Ljava/lang/String;Lo/egg;)V

    .line 609
    :goto_0
    return-void
.end method
