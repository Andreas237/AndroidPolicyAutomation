.class public Lo/xu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Landroid/content/Context;

.field private static volatile c:Lo/xu;


# instance fields
.field private e:Landroid/net/ConnectivityManager;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lo/xu;->e:Landroid/net/ConnectivityManager;

    .line 22
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/xu;
    .locals 4

    .line 33
    sget-object v0, Lo/xu;->c:Lo/xu;

    if-nez v0, :cond_1

    .line 34
    const-class v2, Lo/xu;

    monitor-enter v2

    .line 36
    :try_start_0
    sget-object v0, Lo/xu;->c:Lo/xu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/xu;->b:Landroid/content/Context;

    .line 38
    new-instance v0, Lo/xu;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/xu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/xu;->c:Lo/xu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 43
    :cond_1
    :goto_0
    sget-object v0, Lo/xu;->c:Lo/xu;

    return-object v0
.end method


# virtual methods
.method public e()Z
    .locals 4

    .line 54
    const/4 v2, 0x0

    .line 64
    :try_start_0
    iget-object v0, p0, Lo/xu;->e:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 66
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v2, v0

    .line 67
    return v2

    .line 68
    :catch_0
    move-exception v3

    .line 72
    const-string v0, "connectivity"

    const-string v1, "Failed to connect to any active network at this moment"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    return v2
.end method
