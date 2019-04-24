.class Lo/alx$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/alx;


# direct methods
.method constructor <init>(Lo/alx;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lo/alx$5;->d:Lo/alx;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 48
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 50
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2766

    if-ne v0, v1, :cond_1

    .line 51
    iget-object v0, p0, Lo/alx$5;->d:Lo/alx;

    invoke-static {v0}, Lo/alx;->e(Lo/alx;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 52
    :try_start_0
    iget-object v0, p0, Lo/alx$5;->d:Lo/alx;

    invoke-static {v0}, Lo/alx;->a(Lo/alx;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 53
    iget-object v0, p0, Lo/alx$5;->d:Lo/alx;

    iget-object v1, p0, Lo/alx$5;->d:Lo/alx;

    invoke-static {v1}, Lo/alx;->a(Lo/alx;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/alx;->a(Lo/alx;Ljava/lang/String;)V

    .line 57
    const/16 v0, 0x2766

    const-wide/32 v1, 0x124f80

    invoke-virtual {p0, v0, v1, v2}, Lo/alx$5;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 61
    :cond_1
    :goto_0
    return-void
.end method
