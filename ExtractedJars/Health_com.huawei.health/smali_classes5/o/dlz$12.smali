.class Lo/dlz$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->a(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic c:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;Lo/egg;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lo/dlz$12;->c:Lo/dlz;

    iput-object p2, p0, Lo/dlz$12;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 290
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedSetWeightGoal getWeightGoal err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const v0, 0x186a1

    if-ne p1, v0, :cond_0

    .line 293
    iget-object v0, p0, Lo/dlz$12;->c:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "ai-weight-001"

    iget-object v2, p0, Lo/dlz$12;->a:Lo/egg;

    invoke-virtual {v0, v1, v2}, Lo/dly;->a(Ljava/lang/String;Lo/egg;)V

    goto :goto_0

    .line 296
    :cond_0
    iget-object v0, p0, Lo/dlz$12;->a:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 298
    :goto_0
    return-void
.end method
