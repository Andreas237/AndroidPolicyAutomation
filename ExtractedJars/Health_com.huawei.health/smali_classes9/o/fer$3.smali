.class Lo/fer$3;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fer;


# direct methods
.method constructor <init>(Lo/fer;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/fer$3;->e:Lo/fer;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 4

    .line 114
    iget-object v2, p0, Lo/fer$3;->e:Lo/fer;

    monitor-enter v2

    .line 115
    :try_start_0
    iget-object v0, p0, Lo/fer$3;->e:Lo/fer;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fer;->d(Lo/fer;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 117
    :goto_0
    iget-object v0, p0, Lo/fer$3;->e:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->invalidate()V

    .line 118
    iget-object v0, p0, Lo/fer$3;->e:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->requestLayout()V

    .line 119
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .line 107
    iget-object v0, p0, Lo/fer$3;->e:Lo/fer;

    invoke-static {v0}, Lo/fer;->e(Lo/fer;)V

    .line 108
    iget-object v0, p0, Lo/fer$3;->e:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->invalidate()V

    .line 109
    iget-object v0, p0, Lo/fer$3;->e:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->requestLayout()V

    .line 110
    return-void
.end method
