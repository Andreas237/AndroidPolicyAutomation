.class Lo/btj$7;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->d(Ljava/lang/String;ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic b:I

.field final synthetic c:Lo/btj;


# direct methods
.method constructor <init>(Lo/btj;Lo/bui;I)V
    .locals 0

    .line 962
    iput-object p1, p0, Lo/btj$7;->c:Lo/btj;

    iput-object p2, p0, Lo/btj$7;->a:Lo/bui;

    iput p3, p0, Lo/btj$7;->b:I

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 971
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateFitnessPlan success. data "

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

    .line 972
    iget v0, p0, Lo/btj$7;->b:I

    if-eqz v0, :cond_0

    .line 973
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateFitnessPlan user finish current fitness plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 974
    iget-object v0, p0, Lo/btj$7;->c:Lo/btj;

    invoke-virtual {v0}, Lo/btj;->k()V

    .line 975
    iget-object v0, p0, Lo/btj$7;->c:Lo/btj;

    invoke-static {v0}, Lo/btj;->a(Lo/btj;)V

    .line 976
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->i()V

    .line 977
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 979
    :cond_0
    iget-object v0, p0, Lo/btj$7;->a:Lo/bui;

    iget-object v1, p0, Lo/btj$7;->c:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 980
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 965
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateFitnessPlan onFailure errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    iget-object v0, p0, Lo/btj$7;->a:Lo/bui;

    iget-object v1, p0, Lo/btj$7;->c:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 967
    return-void
.end method
