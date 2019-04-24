.class Lo/acc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/acc;


# direct methods
.method constructor <init>(Lo/acc;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/acc$1;->d:Lo/acc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 201
    iget-object v0, p0, Lo/acc$1;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->d(Lo/acc;)V

    .line 202
    iget-object v0, p0, Lo/acc$1;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->b(Lo/acc;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 203
    :try_start_0
    iget-object v0, p0, Lo/acc$1;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->a(Lo/acc;)Lo/aby;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lo/acc$1;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->a(Lo/acc;)Lo/aby;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/aby;->onScanFailed(I)V

    .line 205
    iget-object v0, p0, Lo/acc$1;->d:Lo/acc;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/acc;->b(Lo/acc;Lo/aby;)Lo/aby;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 208
    :goto_0
    return-void
.end method
