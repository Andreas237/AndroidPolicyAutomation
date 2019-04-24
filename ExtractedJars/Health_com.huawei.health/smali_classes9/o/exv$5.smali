.class Lo/exv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exv;->e(Ljava/util/Date;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic c:Lo/exv;


# direct methods
.method constructor <init>(Lo/exv;Lo/egg;)V
    .locals 0

    .line 1466
    iput-object p1, p0, Lo/exv$5;->c:Lo/exv;

    iput-object p2, p0, Lo/exv$5;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 1471
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1472
    if-nez p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1473
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 1474
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sumListData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1475
    iget-object v0, p0, Lo/exv$5;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1476
    iget-object v0, p0, Lo/exv$5;->a:Lo/egg;

    invoke-interface {v0, p1, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 1479
    :cond_0
    iget-object v0, p0, Lo/exv$5;->a:Lo/egg;

    invoke-interface {v0, p1, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1481
    :cond_1
    :goto_0
    return-void
.end method
