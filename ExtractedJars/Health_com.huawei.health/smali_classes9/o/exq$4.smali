.class Lo/exq$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exq;->d(JLo/exn$d;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic b:Lo/exq;


# direct methods
.method constructor <init>(Lo/exq;Lo/egg;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/exq$4;->b:Lo/exq;

    iput-object p2, p0, Lo/exq$4;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 7

    .line 156
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailHistogramData requsetGetFitnessDataDetailBySportType 01 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    const/4 v4, -0x1

    .line 158
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 160
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 161
    const/4 v4, 0x0

    .line 162
    move-object v5, p2

    .line 163
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 164
    iget-object v0, p0, Lo/exq$4;->b:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/exm;->a(Ljava/util/List;)V

    .line 165
    iget-object v0, p0, Lo/exq$4;->b:Lo/exq;

    invoke-static {v0, v6}, Lo/exq;->e(Lo/exq;Ljava/util/List;)Ljava/util/List;

    .line 168
    :cond_0
    iget-object v0, p0, Lo/exq$4;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 169
    iget-object v0, p0, Lo/exq$4;->a:Lo/egg;

    invoke-interface {v0, v4, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 171
    :cond_1
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailHistogramData requsetGetFitnessDataDetailBySportType 01 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-void
.end method
