.class Lo/exl$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exl;->c(JLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/exl;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/exl;Lo/egg;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lo/exl$8;->c:Lo/exl;

    iput-object p2, p0, Lo/exl$8;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 232
    iget-object v0, p0, Lo/exl$8;->c:Lo/exl;

    invoke-static {v0}, Lo/exl;->d(Lo/exl;)I

    .line 233
    iget-object v0, p0, Lo/exl$8;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/exl$8;->c:Lo/exl;

    invoke-static {v0}, Lo/exl;->c(Lo/exl;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 234
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSpecificOneDayFitnessDataList requestSpecificOneDayFitnessTotalData onResponse sucess mRequsetNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$8;->c:Lo/exl;

    invoke-static {v3}, Lo/exl;->c(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-object v0, p0, Lo/exl$8;->d:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 237
    :cond_0
    return-void
.end method
