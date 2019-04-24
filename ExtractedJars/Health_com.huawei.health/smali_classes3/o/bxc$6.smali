.class Lo/bxc$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxc;->e(Lo/bxc$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bxc;

.field final synthetic b:Lcom/huawei/health/suggestion/model/PlanWorkout;

.field final synthetic e:Lcom/huawei/health/suggestion/model/Plan;


# direct methods
.method constructor <init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanWorkout;)V
    .locals 0

    .line 321
    iput-object p1, p0, Lo/bxc$6;->a:Lo/bxc;

    iput-object p2, p0, Lo/bxc$6;->e:Lcom/huawei/health/suggestion/model/Plan;

    iput-object p3, p0, Lo/bxc$6;->b:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 324
    iget-object v0, p0, Lo/bxc$6;->e:Lcom/huawei/health/suggestion/model/Plan;

    invoke-static {v0}, Lo/bsv;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 325
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/bxc$6;->b:Lcom/huawei/health/suggestion/model/PlanWorkout;

    iget-object v2, p0, Lo/bxc$6;->e:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bxc$6;->a:Lo/bxc;

    invoke-static {v3}, Lo/bxc;->c(Lo/bxc;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/brt;->e(Lcom/huawei/health/suggestion/model/PlanWorkout;Ljava/lang/String;Landroid/content/Context;)V

    .line 326
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 327
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    sget-object v0, Lo/dae;->bm:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 330
    return-void
.end method
