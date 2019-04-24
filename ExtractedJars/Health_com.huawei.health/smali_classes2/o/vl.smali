.class public Lo/vl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/vl;


# instance fields
.field private a:Lo/vn;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    const/4 v0, 0x0

    sput-object v0, Lo/vl;->c:Lo/vl;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lo/vq;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vl;->a:Lo/vn;

    .line 41
    iput-object p1, p0, Lo/vl;->e:Landroid/content/Context;

    .line 42
    new-instance v0, Lo/vn;

    invoke-direct {v0, p1, p2}, Lo/vn;-><init>(Landroid/content/Context;Lo/vq;)V

    iput-object v0, p0, Lo/vl;->a:Lo/vn;

    .line 43
    return-void
.end method

.method public static e(Landroid/content/Context;Lo/vq;)Lo/vl;
    .locals 3

    .line 32
    const-class v1, Lo/vl;

    monitor-enter v1

    .line 33
    :try_start_0
    sget-object v0, Lo/vl;->c:Lo/vl;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Lo/vl;

    invoke-direct {v0, p0, p1}, Lo/vl;-><init>(Landroid/content/Context;Lo/vq;)V

    sput-object v0, Lo/vl;->c:Lo/vl;

    .line 36
    :cond_0
    sget-object v0, Lo/vl;->c:Lo/vl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 37
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public d(Ljava/lang/String;IJLjava/lang/String;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lo/vl;->a:Lo/vn;

    iget-object v1, p0, Lo/vl;->e:Landroid/content/Context;

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    move-object v7, p5

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/vn;->c(Landroid/content/Context;ZLjava/lang/String;IJLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;I)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lo/vl;->a:Lo/vn;

    iget-object v1, p0, Lo/vl;->e:Landroid/content/Context;

    move-object v3, p1

    move v4, p2

    const/4 v2, 0x0

    const-wide/16 v5, -0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/vn;->c(Landroid/content/Context;ZLjava/lang/String;IJLjava/lang/String;)Z

    move-result v0

    return v0
.end method
