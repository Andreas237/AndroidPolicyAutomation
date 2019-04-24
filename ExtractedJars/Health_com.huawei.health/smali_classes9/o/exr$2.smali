.class Lo/exr$2;
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
.field final synthetic b:Lo/exr;


# direct methods
.method constructor <init>(Lo/exr;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/exr$2;->b:Lo/exr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 194
    iget-object v0, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v0}, Lo/exr;->b(Lo/exr;)V

    .line 195
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData FITNESS_TYPE_DAY_HISTOGRAM start mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v3}, Lo/exr;->e(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 198
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 199
    iget-object v0, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v0}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/exm;->a(Ljava/util/List;)V

    .line 200
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData FITNESS_TYPE_DAY_HISTOGRAM mHeartRateUIDataDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v3}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :cond_0
    iget-object v0, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v0}, Lo/exr;->e(Lo/exr;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v0}, Lo/exr;->a(Lo/exr;)Lo/egg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 204
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData requestHeartRateDetail FITNESS_TYPE_DAY_HISTOGRAM onResponse sucess!  err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-object v0, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v0}, Lo/exr;->a(Lo/exr;)Lo/egg;

    move-result-object v0

    iget-object v1, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v1}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 209
    :cond_1
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData FITNESS_TYPE_DAY_HISTOGRAM over mRequestReportCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$2;->b:Lo/exr;

    invoke-static {v3}, Lo/exr;->e(Lo/exr;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    return-void
.end method
