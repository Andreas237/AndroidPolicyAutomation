.class Lo/exq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exq;->b(JLo/exn$d;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exq;

.field final synthetic d:Lo/egg;

.field final synthetic e:Lo/exn$d;


# direct methods
.method constructor <init>(Lo/exq;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lo/exq$1;->a:Lo/exq;

    iput-object p2, p0, Lo/exq$1;->e:Lo/exn$d;

    iput-object p3, p0, Lo/exq$1;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 7

    .line 200
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailHistogramByType requsetGetFitnessDataDetailBySportType 02 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSportDetailHistogramByType requsetGetFitnessDataDetailBySportType queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$1;->e:Lo/exn$d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " onResponse ..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v4, -0x1

    .line 204
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 206
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 207
    const/4 v4, 0x0

    .line 208
    move-object v5, p2

    .line 209
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 210
    iget-object v0, p0, Lo/exq$1;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/exm;->a(Ljava/util/List;)V

    .line 211
    iget-object v0, p0, Lo/exq$1;->a:Lo/exq;

    invoke-static {v0, v6}, Lo/exq;->e(Lo/exq;Ljava/util/List;)Ljava/util/List;

    .line 212
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSportDetailHistogramByType requsetGetFitnessDataDetailBySportType queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$1;->e:Lo/exn$d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " onResponse resultObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    :cond_0
    iget-object v0, p0, Lo/exq$1;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 217
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailHistogramByType requsetGetFitnessDataDetailBySportType updateResponse.onResponse sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    iget-object v0, p0, Lo/exq$1;->d:Lo/egg;

    invoke-interface {v0, v4, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 221
    :cond_1
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailHistogramByType requsetGetFitnessDataDetailBySportType 02 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    return-void
.end method
