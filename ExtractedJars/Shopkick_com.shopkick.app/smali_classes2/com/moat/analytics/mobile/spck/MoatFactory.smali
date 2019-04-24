.class public abstract Lcom/moat/analytics/mobile/spck/MoatFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/moat/analytics/mobile/spck/MoatFactory;
    .locals 1

    :try_start_0
    new-instance v0, Lcom/moat/analytics/mobile/spck/o;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/o;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    new-instance v0, Lcom/moat/analytics/mobile/spck/w$b;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/w$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract createCustomTracker(Lcom/moat/analytics/mobile/spck/MoatPlugin;)Ljava/lang/Object;
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/moat/analytics/mobile/spck/MoatPlugin<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract createNativeDisplayTracker(Landroid/view/View;Ljava/util/Map;)Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

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
.end method

.method public abstract createNativeVideoTracker(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/NativeVideoTracker;
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract createWebAdTracker(Landroid/view/ViewGroup;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract createWebAdTracker(Landroid/webkit/WebView;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method
