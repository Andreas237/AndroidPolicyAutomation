.class Lo/dmp$5;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmp;->c(Lo/dml;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dml;

.field final synthetic e:Lo/dmp;


# direct methods
.method constructor <init>(Lo/dmp;Lo/dml;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lo/dmp$5;->e:Lo/dmp;

    iput-object p2, p0, Lo/dmp$5;->a:Lo/dml;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 273
    invoke-static {}, Lo/dmp;->c()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 274
    :try_start_0
    iget-object v0, p0, Lo/dmp$5;->e:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->e(Lo/dmp;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/dmp$5;->a:Lo/dml;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lo/dmp$5;->e:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->e(Lo/dmp;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/dmp$5;->a:Lo/dml;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 278
    :goto_0
    return-void
.end method
