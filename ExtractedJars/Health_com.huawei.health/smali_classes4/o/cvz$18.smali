.class Lo/cvz$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->a(Landroid/content/Context;JJILo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lo/duh;

.field final synthetic d:Lo/cvz;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;I)V
    .locals 0

    .line 448
    iput-object p1, p0, Lo/cvz$18;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$18;->c:Lo/duh;

    iput p3, p0, Lo/cvz$18;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 6

    .line 451
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 452
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackSumList return data is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lo/cvz$18;->c:Lo/duh;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 454
    return-void

    .line 457
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 458
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 459
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackSumList return map is empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Lo/cvz$18;->c:Lo/duh;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 461
    return-void

    .line 464
    :cond_1
    iget-object v0, p0, Lo/cvz$18;->d:Lo/cvz;

    iget v1, p0, Lo/cvz$18;->b:I

    invoke-static {v0, v1}, Lo/cvz;->d(Lo/cvz;I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 465
    iget-object v0, p0, Lo/cvz$18;->c:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 466
    return-void
.end method
