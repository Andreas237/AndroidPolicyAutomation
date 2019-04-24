.class public final Lo/ape;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/ape;


# instance fields
.field private a:Lo/axq;

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-object v0, Lo/ape;->e:Lo/ape;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ape;->a:Lo/axq;

    .line 20
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/ape;->d:J

    .line 30
    return-void
.end method

.method public static declared-synchronized d()Lo/ape;
    .locals 4

    const-class v2, Lo/ape;

    monitor-enter v2

    .line 34
    :try_start_0
    sget-object v0, Lo/ape;->e:Lo/ape;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 36
    new-instance v0, Lo/ape;

    invoke-direct {v0}, Lo/ape;-><init>()V

    sput-object v0, Lo/ape;->e:Lo/ape;

    .line 38
    :cond_0
    sget-object v0, Lo/ape;->e:Lo/ape;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 62
    iget-wide v0, p0, Lo/ape;->d:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .line 67
    iput-wide p1, p0, Lo/ape;->d:J

    .line 68
    return-void
.end method

.method public b(Lo/axq;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/ape;->a:Lo/axq;

    .line 49
    return-void
.end method

.method public c()V
    .locals 2

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ape;->a:Lo/axq;

    .line 57
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/ape;->d:J

    .line 58
    return-void
.end method

.method public e()Lo/axq;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/ape;->a:Lo/axq;

    return-object v0
.end method
