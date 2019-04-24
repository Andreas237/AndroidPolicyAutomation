.class public final Lo/ayx;
.super Lo/ayt;
.source "SourceFile"


# static fields
.field private static a:Lo/ayx;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/ayt;-><init>()V

    .line 20
    return-void
.end method

.method public static declared-synchronized d()Lo/ayx;
    .locals 4

    const-class v2, Lo/ayx;

    monitor-enter v2

    .line 24
    :try_start_0
    sget-object v0, Lo/ayx;->a:Lo/ayx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 26
    new-instance v0, Lo/ayx;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ayx;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ayx;->a:Lo/ayx;

    .line 28
    :cond_0
    sget-object v0, Lo/ayx;->a:Lo/ayx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method
