.class Lo/erh$5$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erh$5;->e(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/erh$5;


# direct methods
.method constructor <init>(Lo/erh$5;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lo/erh$5$5;->c:Lo/erh$5;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 268
    iget-object v0, p0, Lo/erh$5$5;->c:Lo/erh$5;

    iget-object v0, v0, Lo/erh$5;->c:Lo/erh$b;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lo/erh$5$5;->c:Lo/erh$5;

    iget-object v0, v0, Lo/erh$5;->c:Lo/erh$b;

    invoke-interface {v0}, Lo/erh$b;->d()V

    .line 271
    :cond_0
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkoutsByTopicId() onfalure errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorinfo"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 278
    if-nez p1, :cond_1

    .line 279
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunCourseTopic data null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lo/erh$5$5;->c:Lo/erh$5;

    iget-object v0, v0, Lo/erh$5;->c:Lo/erh$b;

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lo/erh$5$5;->c:Lo/erh$5;

    iget-object v0, v0, Lo/erh$5;->c:Lo/erh$b;

    invoke-interface {v0}, Lo/erh$b;->d()V

    .line 283
    :cond_0
    return-void

    .line 286
    :cond_1
    invoke-static {p1}, Lo/erh;->b(Ljava/util/List;)V

    .line 287
    invoke-static {p1}, Lo/erh;->e(Ljava/util/List;)V

    .line 288
    invoke-static {p1}, Lo/erh;->d(Ljava/util/List;)V

    .line 289
    invoke-static {p1}, Lo/erh;->a(Ljava/util/List;)V

    .line 290
    invoke-static {p1}, Lo/erh;->c(Ljava/util/List;)V

    .line 291
    invoke-static {p1}, Lo/erh;->i(Ljava/util/List;)V

    .line 292
    invoke-static {p1}, Lo/erh;->g(Ljava/util/List;)V

    .line 294
    iget-object v0, p0, Lo/erh$5$5;->c:Lo/erh$5;

    iget-object v0, v0, Lo/erh$5;->c:Lo/erh$b;

    if-eqz v0, :cond_2

    .line 295
    iget-object v0, p0, Lo/erh$5$5;->c:Lo/erh$5;

    iget-object v0, v0, Lo/erh$5;->c:Lo/erh$b;

    invoke-interface {v0}, Lo/erh$b;->d()V

    .line 298
    :cond_2
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 265
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/erh$5$5;->c(Ljava/util/List;)V

    return-void
.end method
