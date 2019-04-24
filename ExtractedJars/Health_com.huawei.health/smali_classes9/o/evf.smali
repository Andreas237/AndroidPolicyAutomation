.class public Lo/evf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/euy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const/4 v0, 0x0

    sput-object v0, Lo/evf;->a:Lo/euy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    return-void
.end method

.method public static e()Lo/euy;
    .locals 4

    .line 14
    sget-object v0, Lo/evf;->a:Lo/euy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 15
    const-class v2, Lo/evf;

    monitor-enter v2

    .line 16
    :try_start_0
    sget-object v0, Lo/evf;->a:Lo/euy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 17
    new-instance v0, Lo/evb;

    invoke-direct {v0}, Lo/evb;-><init>()V

    sput-object v0, Lo/evf;->a:Lo/euy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 21
    :cond_1
    :goto_0
    sget-object v0, Lo/evf;->a:Lo/euy;

    return-object v0
.end method
