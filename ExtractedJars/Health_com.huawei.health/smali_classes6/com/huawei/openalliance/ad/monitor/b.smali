.class public abstract Lcom/huawei/openalliance/ad/monitor/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# static fields
.field protected static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Landroid/view/View;Lcom/huawei/openalliance/ad/monitor/b;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/view/View;

.field private c:Z

.field private d:J

.field private e:I

.field private f:Landroid/graphics/Rect;

.field private g:Z

.field private h:Landroid/content/BroadcastReceiver;

.field private i:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/monitor/b;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->f:Landroid/graphics/Rect;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->g:Z

    new-instance v0, Lcom/huawei/openalliance/ad/monitor/b$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/monitor/b$1;-><init>(Lcom/huawei/openalliance/ad/monitor/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->h:Landroid/content/BroadcastReceiver;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/monitor/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->c()V

    return-void
.end method

.method private b()V
    .locals 5

    const-string v0, "ViewMonitor"

    const-string v1, "registerObservers"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    sget-object v0, Lcom/huawei/openalliance/ad/monitor/b;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/monitor/b;

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/monitor/b;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_2
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->h:Landroid/content/BroadcastReceiver;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->i:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->i:Landroid/content/BroadcastReceiver;

    invoke-interface {v0, v1, v4}, Lcom/huawei/openalliance/ad/inter/a;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->g:Z

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/monitor/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->h()V

    return-void
.end method

.method private c()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/content/Context;)Z

    move-result v6

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ag;->b(Landroid/content/Context;)Z

    move-result v7

    if-eqz v6, :cond_0

    if-nez v7, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->g:Z

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ViewMonitor"

    const-string v1, "checkScreenState screen available: %s "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/monitor/b;->g:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private d()V
    .locals 3

    const-string v0, "ViewMonitor"

    const-string v1, "unregisterObservers"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->i:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->i:Landroid/content/BroadcastReceiver;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/a;->a(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->i:Landroid/content/BroadcastReceiver;

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/monitor/b;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private h()V
    .locals 6

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->f:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    mul-int v3, v0, v1

    if-eqz v2, :cond_2

    if-lez v3, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->f:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/monitor/b;->f:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    mul-int v4, v0, v1

    mul-int/lit8 v0, v4, 0x64

    div-int v5, v0, v3

    iget v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->e:I

    if-le v5, v0, :cond_1

    iput v5, p0, Lcom/huawei/openalliance/ad/monitor/b;->e:I

    :cond_1
    invoke-virtual {p0, v5}, Lcom/huawei/openalliance/ad/monitor/b;->a(I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->i()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->j()V

    :goto_1
    return-void
.end method

.method private i()V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ViewMonitor"

    const-string v1, "onViewShown"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->c:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->d:J

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/monitor/b;->a()V

    return-void
.end method

.method private j()V
    .locals 9

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ViewMonitor"

    const-string v1, "onViewHidden"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->c:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->d:J

    sub-long v7, v5, v0

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ViewMonitor"

    const-string v1, "max physical visible area percentage: %d duration: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/monitor/b;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->e:I

    invoke-virtual {p0, v7, v8, v0}, Lcom/huawei/openalliance/ad/monitor/b;->a(JI)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/monitor/b;->e:I

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    return-void
.end method

.method protected a(I)V
    .locals 0

    return-void
.end method

.method protected a(JI)V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ViewMonitor"

    const-string v1, "onViewAttachedToWindow"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->b()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->h()V

    return-void
.end method

.method public f()V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ViewMonitor"

    const-string v1, "onViewDetachedFromWindow"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->d()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->j()V

    return-void
.end method

.method public g()V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ViewMonitor"

    const-string v1, "onViewVisibilityChanged"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->h()V

    return-void
.end method

.method public onGlobalLayout()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->h()V

    return-void
.end method

.method public onScrollChanged()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/monitor/b;->h()V

    return-void
.end method
