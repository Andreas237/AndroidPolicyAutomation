.class Lo/exl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exl;->e(JLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic e:Lo/exl;


# direct methods
.method constructor <init>(Lo/exl;Lo/egg;)V
    .locals 0

    .line 393
    iput-object p1, p0, Lo/exl$1;->e:Lo/exl;

    iput-object p2, p0, Lo/exl$1;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 396
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 397
    iget-object v0, p0, Lo/exl$1;->e:Lo/exl;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lo/exl;->g(Lo/exl;I)I

    .line 398
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSpecificOneDaySleepTotalData onResponse sucess!  mSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$1;->e:Lo/exl;

    invoke-static {v3}, Lo/exl;->h(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    :cond_0
    iget-object v0, p0, Lo/exl$1;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 402
    iget-object v0, p0, Lo/exl$1;->b:Lo/egg;

    iget-object v1, p0, Lo/exl$1;->e:Lo/exl;

    invoke-static {v1}, Lo/exl;->h(Lo/exl;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 404
    :cond_1
    return-void
.end method
