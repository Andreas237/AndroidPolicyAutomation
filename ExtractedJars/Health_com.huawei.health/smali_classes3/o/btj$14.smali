.class Lo/btj$14;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->a(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/btj;


# direct methods
.method constructor <init>(Lo/btj;)V
    .locals 0

    .line 1311
    iput-object p1, p0, Lo/btj$14;->a:Lo/btj;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 1331
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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1332
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "allFitnessPkgs"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1333
    iget-object v0, p0, Lo/btj$14;->a:Lo/btj;

    iget-object v1, p0, Lo/btj$14;->a:Lo/btj;

    invoke-virtual {v1, p1}, Lo/btj;->e(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->c(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1334
    iget-object v0, p0, Lo/btj$14;->a:Lo/btj;

    iget-object v1, p0, Lo/btj$14;->a:Lo/btj;

    invoke-static {v1}, Lo/btj;->c(Lo/btj;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->a(Lo/btj;Ljava/util/ArrayList;)V

    .line 1335
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 6

    .line 1315
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

    .line 1316
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "allFitnessPkgs"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1317
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1318
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "local has no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1321
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/btj$14;->a:Lo/btj;

    iget-object v1, p0, Lo/btj$14;->a:Lo/btj;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lo/btj;->e(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->c(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1322
    iget-object v0, p0, Lo/btj$14;->a:Lo/btj;

    iget-object v1, p0, Lo/btj$14;->a:Lo/btj;

    invoke-static {v1}, Lo/btj;->c(Lo/btj;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->a(Lo/btj;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1325
    goto :goto_0

    .line 1323
    :catch_0
    move-exception v5

    .line 1324
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessPkgInfos JSONException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1327
    :goto_0
    return-void
.end method
