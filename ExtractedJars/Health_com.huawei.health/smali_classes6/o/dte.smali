.class public final Lo/dte;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dte;

.field private static final c:[B


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/dte;->c:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dte;->b:Landroid/content/Context;

    .line 27
    return-void
.end method

.method public static c()Lo/dte;
    .locals 3

    .line 37
    sget-object v1, Lo/dte;->c:[B

    monitor-enter v1

    .line 38
    :try_start_0
    sget-object v0, Lo/dte;->a:Lo/dte;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lo/dte;

    invoke-direct {v0}, Lo/dte;-><init>()V

    sput-object v0, Lo/dte;->a:Lo/dte;

    .line 41
    :cond_0
    sget-object v0, Lo/dte;->a:Lo/dte;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 42
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    .line 47
    iget-object v0, p0, Lo/dte;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 49
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dte;->b:Landroid/content/Context;

    goto :goto_0

    .line 55
    :cond_0
    const-string v0, "initBackGround applicationContext init failed! context==null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->e(Ljava/lang/String;Z)V

    goto :goto_0

    .line 60
    :cond_1
    const-string v0, "initBackGround applicationContext init not null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->c(Ljava/lang/String;Z)V

    .line 62
    :goto_0
    return-void
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/dte;->b:Landroid/content/Context;

    return-object v0
.end method
