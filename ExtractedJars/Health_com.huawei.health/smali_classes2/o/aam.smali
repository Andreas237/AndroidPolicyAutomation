.class public final Lo/aam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[B

.field private static volatile d:Lo/aam;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/aam;->c:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method public static a()Lo/aam;
    .locals 2

    .line 44
    sget-object v0, Lo/aam;->d:Lo/aam;

    if-nez v0, :cond_1

    .line 46
    sget-object v1, Lo/aam;->c:[B

    monitor-enter v1

    .line 48
    :try_start_0
    sget-object v0, Lo/aam;->d:Lo/aam;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Lo/aam;

    invoke-direct {v0}, Lo/aam;-><init>()V

    sput-object v0, Lo/aam;->d:Lo/aam;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 55
    :cond_1
    :goto_0
    sget-object v0, Lo/aam;->d:Lo/aam;

    return-object v0
.end method


# virtual methods
.method public d(Lo/aal;)V
    .locals 2

    .line 66
    if-eqz p1, :cond_0

    .line 68
    new-instance v1, Lo/aak;

    invoke-direct {v1, p1}, Lo/aak;-><init>(Lo/aal;)V

    .line 69
    invoke-static {}, Lo/aaq;->a()Lo/aaq;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/aaq;->c(Ljava/lang/Runnable;)V

    .line 71
    :cond_0
    return-void
.end method
