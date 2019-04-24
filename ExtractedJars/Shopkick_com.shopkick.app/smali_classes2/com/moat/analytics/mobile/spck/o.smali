.class Lcom/moat/analytics/mobile/spck/o;
.super Lcom/moat/analytics/mobile/spck/MoatFactory;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/MoatFactory;-><init>()V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/o;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    const-string v1, "Factory"

    const-string v2, "Failed to initialize MoatFactory. Please check that you\'ve initialized the Moat SDK correctly."

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "[ERROR] "

    const-string v1, "Failed to initialize MoatFactory, SDK was not started"

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/moat/analytics/mobile/spck/n;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/n;-><init>()V

    throw v0
.end method

.method private a(Landroid/view/View;Ljava/util/Map;)Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;"
        }
    .end annotation

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/o$3;

    invoke-direct {p1, p0, v0, p2}, Lcom/moat/analytics/mobile/spck/o$3;-><init>(Lcom/moat/analytics/mobile/spck/o;Ljava/lang/ref/WeakReference;Ljava/util/Map;)V

    const-class p2, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    invoke-static {p1, p2}, Lcom/moat/analytics/mobile/spck/y;->a(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    return-object p1
.end method

.method private a(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/NativeVideoTracker;
    .locals 1

    new-instance v0, Lcom/moat/analytics/mobile/spck/o$4;

    invoke-direct {v0, p0, p1}, Lcom/moat/analytics/mobile/spck/o$4;-><init>(Lcom/moat/analytics/mobile/spck/o;Ljava/lang/String;)V

    const-class p1, Lcom/moat/analytics/mobile/spck/NativeVideoTracker;

    invoke-static {v0, p1}, Lcom/moat/analytics/mobile/spck/y;->a(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/moat/analytics/mobile/spck/NativeVideoTracker;

    return-object p1
.end method

.method private a(Landroid/view/ViewGroup;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .locals 1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/o$2;

    invoke-direct {p1, p0, v0}, Lcom/moat/analytics/mobile/spck/o$2;-><init>(Lcom/moat/analytics/mobile/spck/o;Ljava/lang/ref/WeakReference;)V

    const-class v0, Lcom/moat/analytics/mobile/spck/WebAdTracker;

    invoke-static {p1, v0}, Lcom/moat/analytics/mobile/spck/y;->a(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/moat/analytics/mobile/spck/WebAdTracker;

    return-object p1
.end method

.method private a(Landroid/webkit/WebView;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .locals 1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/o$1;

    invoke-direct {p1, p0, v0}, Lcom/moat/analytics/mobile/spck/o$1;-><init>(Lcom/moat/analytics/mobile/spck/o;Ljava/lang/ref/WeakReference;)V

    const-class v0, Lcom/moat/analytics/mobile/spck/WebAdTracker;

    invoke-static {p1, v0}, Lcom/moat/analytics/mobile/spck/y;->a(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/moat/analytics/mobile/spck/WebAdTracker;

    return-object p1
.end method

.method private a(Lcom/moat/analytics/mobile/spck/MoatPlugin;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/moat/analytics/mobile/spck/MoatPlugin<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/moat/analytics/mobile/spck/MoatPlugin;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private a()Z
    .locals 1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/l;->getInstance()Lcom/moat/analytics/mobile/spck/MoatAnalytics;

    move-result-object v0

    check-cast v0, Lcom/moat/analytics/mobile/spck/l;

    invoke-virtual {v0}, Lcom/moat/analytics/mobile/spck/l;->a()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public createCustomTracker(Lcom/moat/analytics/mobile/spck/MoatPlugin;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/moat/analytics/mobile/spck/MoatPlugin<",
            "TT;>;)TT;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/o;->a(Lcom/moat/analytics/mobile/spck/MoatPlugin;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    invoke-interface {p1}, Lcom/moat/analytics/mobile/spck/MoatPlugin;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createNativeDisplayTracker(Landroid/view/View;Ljava/util/Map;)Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/moat/analytics/mobile/spck/o;->a(Landroid/view/View;Ljava/util/Map;)Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$c;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$c;-><init>()V

    return-object p1
.end method

.method public createNativeVideoTracker(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/NativeVideoTracker;
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/o;->a(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/NativeVideoTracker;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$d;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$d;-><init>()V

    return-object p1
.end method

.method public createWebAdTracker(Landroid/view/ViewGroup;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/o;->a(Landroid/view/ViewGroup;)Lcom/moat/analytics/mobile/spck/WebAdTracker;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$e;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$e;-><init>()V

    return-object p1
.end method

.method public createWebAdTracker(Landroid/webkit/WebView;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/o;->a(Landroid/webkit/WebView;)Lcom/moat/analytics/mobile/spck/WebAdTracker;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$e;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$e;-><init>()V

    return-object p1
.end method
