.class Lo/dmp$3;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmp;->d(Lo/dml;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dmp;

.field final synthetic e:Lo/dml;


# direct methods
.method constructor <init>(Lo/dmp;Lo/dml;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lo/dmp$3;->b:Lo/dmp;

    iput-object p2, p0, Lo/dmp$3;->e:Lo/dml;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 258
    invoke-static {}, Lo/dmp;->c()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 259
    :try_start_0
    iget-object v0, p0, Lo/dmp$3;->b:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->e(Lo/dmp;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/dmp$3;->e:Lo/dml;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add observer!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/dmp$3;->b:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->e(Lo/dmp;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/dmp$3;->e:Lo/dml;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 264
    :goto_0
    return-void
.end method
