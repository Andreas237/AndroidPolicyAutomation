.class Lcom/moat/analytics/mobile/spck/ab;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/view/ViewGroup;)Lcom/moat/analytics/mobile/spck/a/b/a;
    .locals 9
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lcom/moat/analytics/mobile/spck/a/b/a<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/webkit/WebView;

    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/a/b/a;->a(Ljava/lang/Object;)Lcom/moat/analytics/mobile/spck/a/b/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    const/4 v1, 0x0

    move v2, p0

    :goto_0
    move-object v3, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    const/16 v4, 0x64

    if-ge v2, v4, :cond_5

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    move-object v6, v3

    move v3, p0

    :goto_2
    if-ge v3, v5, :cond_4

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    instance-of v8, v7, Landroid/webkit/WebView;

    if-eqz v8, :cond_2

    if-nez v6, :cond_1

    move-object v6, v7

    check-cast v6, Landroid/webkit/WebView;

    goto :goto_3

    :cond_1
    const/4 v3, 0x3

    const-string v4, "WebViewHound"

    const-string v5, "Ambiguous ad container: multiple WebViews reside within it."

    invoke-static {v3, v4, v7, v5}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "[ERROR] "

    const-string v4, "WebAdTracker not created, ambiguous ad container: multiple WebViews reside within it"

    invoke-static {v3, v4}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_3
    instance-of v8, v7, Landroid/view/ViewGroup;

    if-eqz v8, :cond_3

    check-cast v7, Landroid/view/ViewGroup;

    invoke-interface {v0, v7}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    move-object v3, v6

    goto :goto_1

    :cond_5
    invoke-static {v3}, Lcom/moat/analytics/mobile/spck/a/b/a;->b(Ljava/lang/Object;)Lcom/moat/analytics/mobile/spck/a/b/a;

    move-result-object p0

    return-object p0
.end method
