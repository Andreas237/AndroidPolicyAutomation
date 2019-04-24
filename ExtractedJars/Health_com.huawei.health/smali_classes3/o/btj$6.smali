.class Lo/btj$6;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->c(IILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/btj;

.field final synthetic c:Lo/bui;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/btj;Lo/bui;II)V
    .locals 0

    .line 359
    iput-object p1, p0, Lo/btj$6;->b:Lo/btj;

    iput-object p2, p0, Lo/btj$6;->c:Lo/bui;

    iput p3, p0, Lo/btj$6;->d:I

    iput p4, p0, Lo/btj$6;->a:I

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 383
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "allFitnessPkgs"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 385
    iget-object v0, p0, Lo/btj$6;->b:Lo/btj;

    invoke-virtual {v0, p1}, Lo/btj;->e(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v5

    .line 386
    iget-object v0, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v0, v5}, Lo/btj;->c(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 387
    iget-object v0, p0, Lo/btj$6;->b:Lo/btj;

    iget-object v1, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v1}, Lo/btj;->c(Lo/btj;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->a(Lo/btj;Ljava/util/ArrayList;)V

    .line 388
    iget-object v0, p0, Lo/btj$6;->c:Lo/bui;

    iget-object v1, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/btj$6;->b:Lo/btj;

    iget v3, p0, Lo/btj$6;->d:I

    iget v4, p0, Lo/btj$6;->a:I

    invoke-static {v2, v3, v4, v5}, Lo/btj;->b(Lo/btj;IILjava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 389
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 8

    .line 363
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessPkgInfos errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "allFitnessPkgs"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 365
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "local has no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    iget-object v0, p0, Lo/btj$6;->c:Lo/bui;

    iget-object v1, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    goto :goto_1

    .line 369
    :cond_1
    const/4 v6, 0x0

    .line 371
    :try_start_0
    iget-object v0, p0, Lo/btj$6;->b:Lo/btj;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/btj;->e(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v0

    move-object v6, v0

    .line 372
    iget-object v0, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v0, v6}, Lo/btj;->c(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 373
    iget-object v0, p0, Lo/btj$6;->b:Lo/btj;

    iget-object v1, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v1}, Lo/btj;->c(Lo/btj;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->a(Lo/btj;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    goto :goto_0

    .line 374
    :catch_0
    move-exception v7

    .line 375
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessPkgInfos JSONException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :goto_0
    iget-object v0, p0, Lo/btj$6;->c:Lo/bui;

    iget-object v1, p0, Lo/btj$6;->b:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/btj$6;->b:Lo/btj;

    iget v3, p0, Lo/btj$6;->d:I

    iget v4, p0, Lo/btj$6;->a:I

    invoke-static {v2, v3, v4, v6}, Lo/btj;->b(Lo/btj;IILjava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 379
    :goto_1
    return-void
.end method
