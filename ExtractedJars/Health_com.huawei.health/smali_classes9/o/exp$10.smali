.class Lo/exp$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->b(JILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exp;

.field final synthetic d:I

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/exp;ILo/egg;)V
    .locals 0

    .line 300
    iput-object p1, p0, Lo/exp$10;->b:Lo/exp;

    iput p2, p0, Lo/exp$10;->d:I

    iput-object p3, p0, Lo/exp$10;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 303
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "request totalData back,errorcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    iget-object v0, p0, Lo/exp$10;->b:Lo/exp;

    invoke-static {v0}, Lo/exp;->d(Lo/exp;)I

    .line 305
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSleepDetailUIData paraUIDataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/exp$10;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " requestCoreSleepDetailTotalData onResponse mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$10;->b:Lo/exp;

    .line 306
    invoke-static {v3}, Lo/exp;->a(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 305
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lo/exp$10;->b:Lo/exp;

    invoke-static {v0}, Lo/exp;->a(Lo/exp;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/exp$10;->e:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 308
    iget-object v0, p0, Lo/exp$10;->e:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 310
    :cond_0
    return-void
.end method
