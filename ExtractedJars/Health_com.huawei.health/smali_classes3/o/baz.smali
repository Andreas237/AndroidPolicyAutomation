.class final Lo/baz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[B

.field private static final c:Lo/baz;


# instance fields
.field private a:J

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Lo/baz;

    invoke-direct {v0}, Lo/baz;-><init>()V

    sput-object v0, Lo/baz;->c:Lo/baz;

    .line 22
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/baz;->b:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/baz;->a:J

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/baz;->d:J

    .line 34
    return-void
.end method

.method public static b()Lo/baz;
    .locals 1

    .line 26
    sget-object v0, Lo/baz;->c:Lo/baz;

    return-object v0
.end method


# virtual methods
.method a(J)V
    .locals 4

    .line 57
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 59
    sget-object v2, Lo/baz;->b:[B

    monitor-enter v2

    .line 61
    :try_start_0
    iput-wide p1, p0, Lo/baz;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 64
    :cond_0
    :goto_0
    return-void
.end method

.method d(J)V
    .locals 4

    .line 73
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 75
    sget-object v2, Lo/baz;->b:[B

    monitor-enter v2

    .line 77
    :try_start_0
    iput-wide p1, p0, Lo/baz;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 80
    :cond_0
    :goto_0
    return-void
.end method
