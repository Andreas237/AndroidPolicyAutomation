.class public final Lcom/tencent/map/b/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/tencent/map/b/l;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public static a()Lcom/tencent/map/b/l;
    .locals 1

    .line 20
    sget-object v0, Lcom/tencent/map/b/l;->b:Lcom/tencent/map/b/l;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/tencent/map/b/l;

    invoke-direct {v0}, Lcom/tencent/map/b/l;-><init>()V

    sput-object v0, Lcom/tencent/map/b/l;->b:Lcom/tencent/map/b/l;

    .line 23
    :cond_0
    sget-object v0, Lcom/tencent/map/b/l;->b:Lcom/tencent/map/b/l;

    return-object v0
.end method

.method public static b()Landroid/content/Context;
    .locals 1

    .line 55
    invoke-static {}, Lcom/tencent/map/b/l;->a()Lcom/tencent/map/b/l;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/map/b/l;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static c()Z
    .locals 3

    .line 81
    :try_start_0
    invoke-static {}, Lcom/tencent/map/b/l;->a()Lcom/tencent/map/b/l;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/map/b/l;->a:Landroid/content/Context;

    .line 82
    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 81
    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 83
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 84
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 85
    const/4 v0, 0x1

    return v0

    .line 87
    .line 89
    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d()Z
    .locals 3

    .line 122
    :try_start_0
    invoke-static {}, Lcom/tencent/map/b/l;->a()Lcom/tencent/map/b/l;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/map/b/l;->a:Landroid/content/Context;

    .line 123
    const-string v1, "connectivity"

    .line 122
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 124
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 125
    if-eqz v2, :cond_0

    .line 126
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 128
    .line 131
    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/tencent/map/b/l;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/map/b/l;->a:Landroid/content/Context;

    .line 38
    :cond_0
    return-void
.end method
