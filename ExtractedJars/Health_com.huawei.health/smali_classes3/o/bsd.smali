.class public Lo/bsd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/brz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    const/4 v0, 0x0

    sput-object v0, Lo/bsd;->a:Lo/brz;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public static d()Lo/brz;
    .locals 4

    .line 13
    sget-object v0, Lo/bsd;->a:Lo/brz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 14
    const-class v2, Lo/bsd;

    monitor-enter v2

    .line 15
    :try_start_0
    sget-object v0, Lo/bsd;->a:Lo/brz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 16
    new-instance v0, Lo/bsb;

    invoke-direct {v0}, Lo/bsb;-><init>()V

    sput-object v0, Lo/bsd;->a:Lo/brz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 20
    :cond_1
    :goto_0
    sget-object v0, Lo/bsd;->a:Lo/brz;

    return-object v0
.end method
