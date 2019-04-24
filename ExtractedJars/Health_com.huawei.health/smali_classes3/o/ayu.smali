.class public final Lo/ayu;
.super Lo/ayt;
.source "SourceFile"


# static fields
.field private static a:Lo/ayu;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lo/ayt;-><init>()V

    .line 19
    return-void
.end method

.method public static declared-synchronized e()Lo/ayu;
    .locals 4

    const-class v2, Lo/ayu;

    monitor-enter v2

    .line 23
    :try_start_0
    sget-object v0, Lo/ayu;->a:Lo/ayu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 25
    new-instance v0, Lo/ayu;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ayu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ayu;->a:Lo/ayu;

    .line 27
    :cond_0
    sget-object v0, Lo/ayu;->a:Lo/ayu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method
