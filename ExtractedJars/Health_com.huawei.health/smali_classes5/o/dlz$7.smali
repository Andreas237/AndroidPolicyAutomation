.class Lo/dlz$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->a(Lcom/huawei/hihealth/HiHealthData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[J

.field final synthetic c:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;[J)V
    .locals 0

    .line 646
    iput-object p1, p0, Lo/dlz$7;->c:Lo/dlz;

    iput-object p2, p0, Lo/dlz$7;->a:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 649
    move-object v0, p2

    check-cast v0, [D

    move-object v4, v0

    check-cast v4, [D

    .line 650
    if-eqz v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 651
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteWeightWeekly,this week has data,set to db"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dlz$7;->c:Lo/dlz;

    iget-object v1, v1, Lo/dlz;->b:Landroid/content/Context;

    new-instance v2, Lo/dlz$7$1;

    invoke-direct {v2, p0, v4}, Lo/dlz$7$1;-><init>(Lo/dlz$7;[D)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 663
    :cond_0
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteWeightWeekly,this week has no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    :goto_0
    return-void
.end method
