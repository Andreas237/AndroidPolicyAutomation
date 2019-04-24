.class public final Lo/zm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B

.field private static volatile e:Lo/zm;


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/zm;->a:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/zm;->d:Landroid/content/Context;

    .line 35
    return-void
.end method

.method public static d()Lo/zm;
    .locals 2

    .line 45
    sget-object v0, Lo/zm;->e:Lo/zm;

    if-nez v0, :cond_1

    .line 47
    sget-object v1, Lo/zm;->a:[B

    monitor-enter v1

    .line 49
    :try_start_0
    sget-object v0, Lo/zm;->e:Lo/zm;

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lo/zm;

    invoke-direct {v0}, Lo/zm;-><init>()V

    sput-object v0, Lo/zm;->e:Lo/zm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 56
    :cond_1
    :goto_0
    sget-object v0, Lo/zm;->e:Lo/zm;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/zm;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 69
    if-eqz p1, :cond_0

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/zm;->d:Landroid/content/Context;

    .line 82
    :cond_0
    return-void
.end method

.method public e()Landroid/content/Context;
    .locals 1

    .line 92
    iget-object v0, p0, Lo/zm;->d:Landroid/content/Context;

    return-object v0
.end method
