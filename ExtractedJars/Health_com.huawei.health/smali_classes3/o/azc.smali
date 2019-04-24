.class public final Lo/azc;
.super Lo/ayt;
.source "SourceFile"


# static fields
.field private static b:Lo/azc;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/ayt;-><init>()V

    .line 25
    return-void
.end method

.method public static declared-synchronized c()Lo/azc;
    .locals 4

    const-class v2, Lo/azc;

    monitor-enter v2

    .line 29
    :try_start_0
    sget-object v0, Lo/azc;->b:Lo/azc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 31
    new-instance v0, Lo/azc;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/azc;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/azc;->b:Lo/azc;

    .line 33
    :cond_0
    sget-object v0, Lo/azc;->b:Lo/azc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method
