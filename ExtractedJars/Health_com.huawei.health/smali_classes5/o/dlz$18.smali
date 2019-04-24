.class Lo/dlz$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;)V
    .locals 0

    .line 312
    iput-object p1, p0, Lo/dlz$18;->d:Lo/dlz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 315
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteSetWeightGoalMsg err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    const v0, 0x186a1

    if-ne p1, v0, :cond_0

    .line 317
    iget-object v0, p0, Lo/dlz$18;->d:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x4e20

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    goto :goto_0

    .line 321
    :cond_0
    if-nez p1, :cond_1

    .line 322
    iget-object v0, p0, Lo/dlz$18;->d:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->a(Lo/dlz;)Lo/dln;

    move-result-object v0

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v4

    .line 323
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 324
    iget-object v0, p0, Lo/dlz$18;->d:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->e(Lo/dlz;)V

    .line 328
    :cond_1
    :goto_0
    return-void
.end method
