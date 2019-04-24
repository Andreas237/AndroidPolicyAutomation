.class public final Lorg/androidannotations/api/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/androidannotations/api/b$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/os/Handler;

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/androidannotations/api/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/androidannotations/api/b$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/androidannotations/api/b$1;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lorg/androidannotations/api/b;->a:Landroid/os/Handler;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    return-void
.end method

.method private static a(Ljava/lang/String;)Lorg/androidannotations/api/b$a;
    .locals 3

    sget-object v0, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/androidannotations/api/b$a;

    if-nez v1, :cond_0

    new-instance v1, Lorg/androidannotations/api/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lorg/androidannotations/api/b$a;-><init>(Ljava/lang/String;Lorg/androidannotations/api/b$1;)V

    sget-object v2, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p0, v1, Lorg/androidannotations/api/b$a;->a:I

    add-int/lit8 p0, p0, 0x1

    iput p0, v1, Lorg/androidannotations/api/b$a;->a:I

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Runnable;J)V
    .locals 2

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lorg/androidannotations/api/b;->a:Landroid/os/Handler;

    invoke-virtual {p0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p2

    sget-object p2, Lorg/androidannotations/api/b;->a:Landroid/os/Handler;

    invoke-static {p0}, Lorg/androidannotations/api/b;->a(Ljava/lang/String;)Lorg/androidannotations/api/b$a;

    move-result-object p0

    invoke-virtual {p2, p1, p0, v0, v1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method static synthetic a(Lorg/androidannotations/api/b$a;)V
    .locals 0

    invoke-static {p0}, Lorg/androidannotations/api/b;->b(Lorg/androidannotations/api/b$a;)V

    return-void
.end method

.method private static b(Lorg/androidannotations/api/b$a;)V
    .locals 3

    sget-object v0, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lorg/androidannotations/api/b$a;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/androidannotations/api/b$a;->a:I

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/androidannotations/api/b$a;->b:Ljava/lang/String;

    sget-object v2, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/androidannotations/api/b$a;

    if-eq v2, p0, :cond_0

    sget-object p0, Lorg/androidannotations/api/b;->b:Ljava/util/Map;

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
