.class public Lo/bzh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzq;


# static fields
.field private static volatile a:Lo/bzh;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Lo/bzh;
    .locals 4

    .line 20
    sget-object v0, Lo/bzh;->a:Lo/bzh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 21
    const-class v2, Lo/bzh;

    monitor-enter v2

    .line 22
    :try_start_0
    sget-object v0, Lo/bzh;->a:Lo/bzh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 23
    new-instance v0, Lo/bzh;

    invoke-direct {v0}, Lo/bzh;-><init>()V

    sput-object v0, Lo/bzh;->a:Lo/bzh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 27
    :cond_1
    :goto_0
    sget-object v0, Lo/bzh;->a:Lo/bzh;

    return-object v0
.end method


# virtual methods
.method public b(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 32
    const/4 v0, 0x0

    return-object v0
.end method
