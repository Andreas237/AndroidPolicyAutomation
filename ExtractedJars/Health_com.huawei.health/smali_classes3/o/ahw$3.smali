.class Lo/ahw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahw;->b(Ljava/util/List;Lo/cma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cma;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lo/ahw;


# direct methods
.method constructor <init>(Lo/ahw;Ljava/util/List;Lo/cma;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lo/ahw$3;->d:Lo/ahw;

    iput-object p2, p0, Lo/ahw$3;->c:Ljava/util/List;

    iput-object p3, p0, Lo/ahw$3;->b:Lo/cma;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 455
    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 456
    if-eqz v4, :cond_0

    .line 457
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData ErrorConstants.SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 459
    :cond_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData ErrorConstants.ERR_NONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 461
    :goto_0
    iget-object v0, p0, Lo/ahw$3;->d:Lo/ahw;

    iget-object v1, p0, Lo/ahw$3;->d:Lo/ahw;

    invoke-static {v1}, Lo/ahw;->f(Lo/ahw;)I

    move-result v1

    iget-object v2, p0, Lo/ahw$3;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/ahw;->b(Lo/ahw;I)I

    .line 463
    iget-object v0, p0, Lo/ahw$3;->d:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->k(Lo/ahw;)I

    move-result v0

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    .line 464
    iget-object v0, p0, Lo/ahw$3;->d:Lo/ahw;

    const/16 v1, 0x65

    invoke-static {v0, v1}, Lo/ahw;->c(Lo/ahw;I)V

    .line 466
    :cond_1
    iget-object v0, p0, Lo/ahw$3;->d:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->f(Lo/ahw;)I

    move-result v0

    iget-object v1, p0, Lo/ahw$3;->d:Lo/ahw;

    invoke-static {v1}, Lo/ahw;->k(Lo/ahw;)I

    move-result v1

    if-lt v0, v1, :cond_4

    .line 467
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData complete listener "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahw$3;->b:Lo/cma;

    const/4 v3, 0x0

    if-eq v3, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 468
    iget-object v0, p0, Lo/ahw$3;->b:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 469
    iget-object v0, p0, Lo/ahw$3;->b:Lo/cma;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/cma;->onResult(ILjava/lang/Object;)V

    .line 471
    :cond_3
    iget-object v0, p0, Lo/ahw$3;->d:Lo/ahw;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/ahw;->c(Lo/ahw;I)V

    goto :goto_2

    .line 473
    :cond_4
    iget-object v0, p0, Lo/ahw$3;->d:Lo/ahw;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/ahw;->c(Lo/ahw;I)V

    .line 475
    :goto_2
    return-void
.end method
