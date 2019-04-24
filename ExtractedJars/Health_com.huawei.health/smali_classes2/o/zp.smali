.class public Lo/zp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/zp$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:[B


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/zp;->a:Ljava/util/Map;

    .line 29
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/zp;->e:[B

    .line 38
    return-void
.end method

.method synthetic constructor <init>(Lo/zp;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/zp;-><init>()V

    return-void
.end method

.method public static b()Lo/zp;
    .locals 1

    .line 53
    sget-object v0, Lo/zp$b;->a:Lo/zp;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 65
    iget-object v1, p0, Lo/zp;->e:[B

    monitor-enter v1

    .line 67
    :try_start_0
    iget-object v0, p0, Lo/zp;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 69
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 80
    const-string v2, ""

    .line 81
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const-string v0, "getTimeOutValue id is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 84
    return-object v2

    .line 86
    :cond_0
    iget-object v0, p0, Lo/zp;->a:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 88
    return-object v2

    .line 90
    :cond_1
    iget-object v0, p0, Lo/zp;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    iget-object v0, p0, Lo/zp;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 96
    :cond_2
    const-string v0, "getTimeOutValue is not exist."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 98
    return-object v2
.end method
