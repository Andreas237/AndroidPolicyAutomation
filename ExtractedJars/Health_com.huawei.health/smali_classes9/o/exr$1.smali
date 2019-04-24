.class Lo/exr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exr;->b(Lo/exn$d;Lo/exn$d;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/exr;


# direct methods
.method constructor <init>(Lo/exr;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lo/exr$1;->e:Lo/exr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 216
    iget-object v0, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->b(Lo/exr;)V

    .line 217
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestHeartRateDetailData start! mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v3}, Lo/exr;->e(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iget-object v0, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->e(Lo/exr;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->a(Lo/exr;)Lo/egg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 220
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestHeartRateDetailData FITNESS_TYPE_DAY_HISTOGRAM onResponse sucess!  err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->a(Lo/exr;)Lo/egg;

    move-result-object v0

    iget-object v1, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v1}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 224
    :cond_0
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestHeartRateDetailData over! mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$1;->e:Lo/exr;

    invoke-static {v3}, Lo/exr;->e(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return-void
.end method
