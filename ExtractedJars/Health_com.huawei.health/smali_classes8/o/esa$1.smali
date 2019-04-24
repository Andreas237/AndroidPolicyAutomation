.class Lo/esa$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esa;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/esa;


# direct methods
.method constructor <init>(Lo/esa;I)V
    .locals 0

    .line 113
    iput-object p1, p0, Lo/esa$1;->c:Lo/esa;

    iput p2, p0, Lo/esa$1;->a:I

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 127
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 128
    :cond_0
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunCourseTopic data null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lo/esa$1;->c:Lo/esa;

    iget v1, p0, Lo/esa$1;->a:I

    const-wide/16 v2, 0xc8

    invoke-static {v0, v1, v2, v3}, Lo/esa;->e(Lo/esa;IJ)V

    .line 131
    return-void

    .line 135
    :cond_1
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

    .line 136
    if-eqz v5, :cond_2

    .line 137
    const-string v0, "SF006"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Topic;->acquireSerialNum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 138
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 139
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunCourseTopic exist runcourse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/esa$1;->c:Lo/esa;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/esa;->a(Lo/esa;I)V

    goto :goto_1

    .line 145
    :cond_2
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess: topic is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :cond_3
    goto :goto_0

    .line 149
    :cond_4
    :goto_1
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 118
    const-string v0, "Track_InitRuncourseUtils"

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

    .line 120
    iget-object v0, p0, Lo/esa$1;->c:Lo/esa;

    iget v1, p0, Lo/esa$1;->a:I

    const-wide/16 v2, 0xc8

    invoke-static {v0, v1, v2, v3}, Lo/esa;->e(Lo/esa;IJ)V

    .line 121
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 113
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/esa$1;->a(Ljava/util/List;)V

    return-void
.end method
