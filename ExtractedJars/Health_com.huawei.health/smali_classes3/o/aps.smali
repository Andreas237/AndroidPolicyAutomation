.class public final Lo/aps;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/aps;


# instance fields
.field private b:Z

.field private c:Lo/auz;

.field private final e:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 5

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aps;->b:Z

    .line 63
    new-instance v0, Lo/aps$1;

    invoke-direct {v0, p0}, Lo/aps$1;-><init>(Lo/aps;)V

    iput-object v0, p0, Lo/aps;->c:Lo/auz;

    .line 39
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 41
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {v3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/aps;->e:Landroid/os/Handler;

    .line 42
    new-instance v4, Lo/ava;

    iget-object v0, p0, Lo/aps;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/aps;->c:Lo/auz;

    invoke-direct {v4, v0, v1}, Lo/ava;-><init>(Landroid/os/Handler;Lo/auz;)V

    .line 43
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 44
    return-void
.end method

.method public static declared-synchronized a()Lo/aps;
    .locals 3

    const-class v1, Lo/aps;

    monitor-enter v1

    .line 53
    :try_start_0
    sget-object v0, Lo/aps;->a:Lo/aps;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Lo/aps;

    invoke-direct {v0}, Lo/aps;-><init>()V

    sput-object v0, Lo/aps;->a:Lo/aps;

    .line 57
    :cond_0
    sget-object v0, Lo/aps;->a:Lo/aps;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic d(Lo/aps;Z)Z
    .locals 0

    .line 17
    iput-boolean p1, p0, Lo/aps;->b:Z

    return p1
.end method


# virtual methods
.method public d()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/aps;->b:Z

    return v0
.end method

.method public e()V
    .locals 1

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aps;->b:Z

    .line 89
    return-void
.end method
