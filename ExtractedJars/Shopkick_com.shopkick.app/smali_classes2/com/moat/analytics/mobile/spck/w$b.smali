.class public Lcom/moat/analytics/mobile/spck/w$b;
.super Lcom/moat/analytics/mobile/spck/MoatFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/moat/analytics/mobile/spck/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/MoatFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public createCustomTracker(Lcom/moat/analytics/mobile/spck/MoatPlugin;)Ljava/lang/Object;
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

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$c;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$c;-><init>()V

    return-object p1
.end method

.method public createNativeVideoTracker(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/NativeVideoTracker;
    .locals 0

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$d;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$d;-><init>()V

    return-object p1
.end method

.method public createWebAdTracker(Landroid/view/ViewGroup;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .locals 0

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$e;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$e;-><init>()V

    return-object p1
.end method

.method public createWebAdTracker(Landroid/webkit/WebView;)Lcom/moat/analytics/mobile/spck/WebAdTracker;
    .locals 0

    new-instance p1, Lcom/moat/analytics/mobile/spck/w$e;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/w$e;-><init>()V

    return-object p1
.end method
