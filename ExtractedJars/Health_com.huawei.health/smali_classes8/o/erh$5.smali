.class final Lo/erh$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erh;->c(Lo/erh$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/erh$b;


# direct methods
.method constructor <init>(Lo/erh$b;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lo/erh$5;->c:Lo/erh$b;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 244
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessCourseTopicList() onfalure errorCode:"

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

    .line 245
    iget-object v0, p0, Lo/erh$5;->c:Lo/erh$b;

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/erh$5;->c:Lo/erh$b;

    invoke-interface {v0}, Lo/erh$b;->d()V

    .line 248
    :cond_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 240
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/erh$5;->e(Ljava/util/List;)V

    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 254
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 255
    :cond_0
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunCourseTopic data null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iget-object v0, p0, Lo/erh$5;->c:Lo/erh$b;

    if-eqz v0, :cond_1

    .line 257
    iget-object v0, p0, Lo/erh$5;->c:Lo/erh$b;

    invoke-interface {v0}, Lo/erh$b;->d()V

    .line 259
    :cond_1
    return-void

    .line 262
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/Topic;

    .line 264
    const-string v0, "SF006"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Topic;->acquireSerialNum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 265
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v1

    new-instance v2, Lo/erh$5$5;

    invoke-direct {v2, p0}, Lo/erh$5$5;-><init>(Lo/erh$5;)V

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Lo/bsp;->c(IILo/bui;)V

    .line 304
    goto :goto_1

    .line 306
    :cond_3
    goto :goto_0

    .line 308
    :cond_4
    :goto_1
    return-void
.end method
