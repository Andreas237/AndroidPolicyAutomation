.class abstract Lcom/moat/analytics/mobile/spck/b;
.super Ljava/lang/Object;


# instance fields
.field a:Lcom/moat/analytics/mobile/spck/k;

.field final b:Ljava/lang/String;

.field final c:Z

.field d:Z

.field e:Z

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/moat/analytics/mobile/spck/z;

.field private final i:Z


# direct methods
.method constructor <init>(Landroid/view/View;ZZ)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BaseTracker"

    const-string v1, "Initializing."

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->f:Ljava/lang/ref/WeakReference;

    iput-boolean p2, p0, Lcom/moat/analytics/mobile/spck/b;->i:Z

    iput-boolean p3, p0, Lcom/moat/analytics/mobile/spck/b;->c:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/moat/analytics/mobile/spck/b;->d:Z

    iput-boolean p1, p0, Lcom/moat/analytics/mobile/spck/b;->e:Z

    new-instance p1, Lcom/moat/analytics/mobile/spck/z;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/z;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/b;->h:Lcom/moat/analytics/mobile/spck/z;

    return-void
.end method

.method private g()V
    .locals 5

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->g:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    const-string v0, "BaseTracker"

    const-string v1, "Attempting bridge installation."

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/b;->i:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/b;->c:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/moat/analytics/mobile/spck/k;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/b;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    sget-object v3, Lcom/moat/analytics/mobile/spck/k$a;->a:Lcom/moat/analytics/mobile/spck/k$a;

    invoke-direct {v0, v1, v3}, Lcom/moat/analytics/mobile/spck/k;-><init>(Landroid/webkit/WebView;Lcom/moat/analytics/mobile/spck/k$a;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/k;->a:Z

    const-string v1, "BaseTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Bridge "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    const-string v0, "not "

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "installed."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    const-string v0, "BaseTracker"

    const-string v1, "Bridge not installed, WebView is null."

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method abstract a()Ljava/lang/String;
.end method

.method a(Landroid/webkit/WebView;)V
    .locals 1

    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->g:Ljava/lang/ref/WeakReference;

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/b;->g()V

    :cond_0
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    if-eqz p1, :cond_1

    iget-boolean p1, p1, Lcom/moat/analytics/mobile/spck/k;->a:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    invoke-virtual {p1, p0}, Lcom/moat/analytics/mobile/spck/k;->a(Lcom/moat/analytics/mobile/spck/b;)V

    :cond_1
    return-void
.end method

.method a(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    return-void
.end method

.method b()Z
    .locals 5

    const-string v0, "BaseTracker"

    const-string v1, "Attempting to start impression."

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/b;->e:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    invoke-virtual {v0, p0}, Lcom/moat/analytics/mobile/spck/k;->b(Lcom/moat/analytics/mobile/spck/b;)Z

    move-result v0

    const-string v1, "BaseTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Impression "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const-string v4, ""

    goto :goto_0

    :cond_0
    const-string v4, "not "

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "started."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/moat/analytics/mobile/spck/b;->d:Z

    iput-boolean v1, p0, Lcom/moat/analytics/mobile/spck/b;->e:Z

    goto :goto_1

    :cond_1
    const-string v0, "BaseTracker"

    const-string/jumbo v1, "startTracking failed, tracker already started"

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "[INFO] "

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " already started"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_2
    :goto_1
    return v0
.end method

.method c()Z
    .locals 5

    const-string v0, "BaseTracker"

    const-string v1, "Attempting to stop impression."

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/b;->d:Z

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->a:Lcom/moat/analytics/mobile/spck/k;

    invoke-virtual {v0, p0}, Lcom/moat/analytics/mobile/spck/k;->c(Lcom/moat/analytics/mobile/spck/b;)Z

    move-result v0

    const-string v1, "BaseTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Impression tracking "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const-string v4, ""

    goto :goto_0

    :cond_0
    const-string v4, "not "

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "stopped."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return v0
.end method

.method public changeTargetView(Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    const-string v0, "BaseTracker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "changing view to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "@"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, "null"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method d()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method e()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->d()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->d()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->d()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method f()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->h:Lcom/moat/analytics/mobile/spck/z;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->d()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/moat/analytics/mobile/spck/z;->a(Ljava/lang/String;Landroid/view/View;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/b;->h:Lcom/moat/analytics/mobile/spck/z;

    iget-object v0, v0, Lcom/moat/analytics/mobile/spck/z;->a:Ljava/lang/String;

    return-object v0
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public startTracking()V
    .locals 5

    const/4 v0, 0x3

    :try_start_0
    const-string v1, "BaseTracker"

    const-string v2, "In startTracking method."

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->b()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    const/4 v1, 0x0

    :goto_0
    const-string v2, "BaseTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attempt to start tracking ad impression was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    const-string v4, ""

    goto :goto_1

    :cond_0
    const-string/jumbo v4, "un"

    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "successful."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    const-string v0, "[SUCCESS] "

    goto :goto_2

    :cond_1
    const-string v0, "[ERROR] "

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " startTracking "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_2

    const-string/jumbo v1, "succeeded"

    goto :goto_3

    :cond_2
    const-string v1, "failed"

    :goto_3
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public stopTracking()V
    .locals 5

    const/4 v0, 0x3

    :try_start_0
    const-string v1, "BaseTracker"

    const-string v2, "In stopTracking method."

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->c()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    const/4 v1, 0x0

    :goto_0
    const-string v2, "BaseTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attempt to stop tracking ad impression was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    const-string v4, ""

    goto :goto_1

    :cond_0
    const-string/jumbo v4, "un"

    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "successful."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    const-string v0, "[SUCCESS] "

    goto :goto_2

    :cond_1
    const-string v0, "[ERROR] "

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " stopTracking "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_2

    const-string/jumbo v1, "succeeded"

    goto :goto_3

    :cond_2
    const-string v1, "failed"

    :goto_3
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
