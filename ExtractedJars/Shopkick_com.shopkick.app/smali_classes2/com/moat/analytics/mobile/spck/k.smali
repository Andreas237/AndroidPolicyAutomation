.class Lcom/moat/analytics/mobile/spck/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/moat/analytics/mobile/spck/k$a;
    }
.end annotation


# instance fields
.field a:Z

.field private b:I

.field private c:Z

.field private d:Z

.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/moat/analytics/mobile/spck/b;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final i:J

.field private final j:Lcom/moat/analytics/mobile/spck/t$a;

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/moat/analytics/mobile/spck/k$a;

.field private final m:Landroid/content/BroadcastReceiver;

.field private final n:Landroid/content/BroadcastReceiver;


# direct methods
.method constructor <init>(Landroid/webkit/WebView;Lcom/moat/analytics/mobile/spck/k$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/moat/analytics/mobile/spck/k;->b:I

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->c:Z

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->a:Z

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->d:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lcom/moat/analytics/mobile/spck/k$2;

    invoke-direct {v0, p0}, Lcom/moat/analytics/mobile/spck/k$2;-><init>(Lcom/moat/analytics/mobile/spck/k;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->m:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/moat/analytics/mobile/spck/k$3;

    invoke-direct {v0, p0}, Lcom/moat/analytics/mobile/spck/k$3;-><init>(Lcom/moat/analytics/mobile/spck/k;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->n:Landroid/content/BroadcastReceiver;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->e:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/k;->l:Lcom/moat/analytics/mobile/spck/k$a;

    new-instance p1, Lcom/moat/analytics/mobile/spck/t$a;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/t$a;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/k;->j:Lcom/moat/analytics/mobile/spck/t$a;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/k;->k:Ljava/util/List;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/k;->f:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/moat/analytics/mobile/spck/k;->i:J

    new-instance p1, Landroid/content/IntentFilter;

    const-string p2, "UPDATE_METADATA"

    invoke-direct {p1, p2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance p2, Landroid/content/IntentFilter;

    const-string v0, "UPDATE_VIEW_INFO"

    invoke-direct {p2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/k;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, p1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0, p2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    :try_start_0
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->b()Z

    move-result p1

    const/4 p2, 0x3

    const-string v0, "JavaScriptBridge"

    if-eqz p1, :cond_0

    const-string p1, "bridge installed"

    goto :goto_0

    :cond_0
    const-string p1, "bridge not installed"

    :goto_0
    invoke-static {p2, v0, p0, p1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/k;)I
    .locals 0

    iget p0, p0, Lcom/moat/analytics/mobile/spck/k;->b:I

    return p0
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/k;I)I
    .locals 0

    iput p1, p0, Lcom/moat/analytics/mobile/spck/k;->b:I

    return p1
.end method

.method private a(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x6

    if-nez p1, :cond_0

    const-string p1, "JavaScriptBridge"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebView is null. Can\'t "

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p1, p0, p2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "JavaScriptBridge"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JavaScript is not enabled in the given WebView. Can\'t "

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method static synthetic b(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->f()V

    return-void
.end method

.method private b()Z
    .locals 3

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "installBridge"

    invoke-direct {p0, v0, v1}, Lcom/moat/analytics/mobile/spck/k;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->a:Z

    invoke-static {}, Lcom/moat/analytics/mobile/spck/j;->a()Lcom/moat/analytics/mobile/spck/j;

    move-result-object v1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->c()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Lcom/moat/analytics/mobile/spck/j;->a(Landroid/content/Context;Lcom/moat/analytics/mobile/spck/k;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->c()V

    return v0
.end method

.method static synthetic c(Lcom/moat/analytics/mobile/spck/k;)I
    .locals 2

    iget v0, p0, Lcom/moat/analytics/mobile/spck/k;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/moat/analytics/mobile/spck/k;->b:I

    return v0
.end method

.method private c()V
    .locals 4

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    :try_start_0
    iget-object v0, v0, Lcom/moat/analytics/mobile/spck/x;->a:Lcom/moat/analytics/mobile/spck/x$d;

    sget-object v1, Lcom/moat/analytics/mobile/spck/x$d;->a:Lcom/moat/analytics/mobile/spck/x$d;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->d:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const-string v2, "JavaScriptBridge"

    const-string v3, "Ready for communication (setting environment variables)."

    invoke-static {v0, v2, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v1, p0, Lcom/moat/analytics/mobile/spck/k;->d:Z

    :cond_1
    const-string v0, "javascript:(function(f,k){function l(){function e(a){var b=a.c,c=a.a,e=a.b;a=a.f;var d=[];if(c)b[c]&&d.push(b[c].fn[0]);else for(key in b)if(b[key])for(var h=0,f=b[key].fn.length;h<f;h++)d.push(b[key].fn[h]);h=0;for(f=d.length;h<f;h++){var g=d[h];if(\'function\'===typeof g)try{e?g(e):g()}catch(k){}a&&delete b[c]}}function d(a,b,c){\'function\'===typeof a&&(b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]})}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};csif={};this.h=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId};this.nvsj=function(a){briz||(d(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea;c!==kuea&&bjmk[c]||d(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||d(a,c,uqaj)};this.lgpr=function(a,b){d(a,b||kuea,yhgt)};this.hgen=function(a,b){d(a,b||kuea,csif)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){g();var b={c:iymv,b:a,a:ewat};briz?e(b):bnkr.push(a)};this.mqjh=function(a){g();var b=a||kuea;dptk[b]=!0;var c={c:bjmk,f:!0};b!==kuea&&(c.b=a,c.a=a);e(c)};this.egpw=function(a){var b=a||kuea;ryup[b]=!0;var c={c:uqaj,f:!0};b!==kuea&&(c.b=a,c.a=a);e(c)};this.sglu=function(a){g();var b={c:yhgt,b:a.event||a,f:!1};(a.adKey||kuea)!==kuea&&(b.a=a.adKey);e(b);return 0<Object.keys(yhgt).length};this.ucbx=function(a){e({a:a.adKey||kuea,c:csif,b:a.event,f:!1})}}function g(){if(0===parseInt(f.MoatMAK.isNative)&&!g.g)if(document.getElementById(\'moat-frame\'))g.g=!0;else{var e=document.createElement(\'script\');e.src=\'https://z.moatads.com/mmakh092348539847/moatframe.js\';e.id=\'moat-frame\';var d=document.getElementsByTagName(\'head\')[0]||document.documentElement;d&&d.insertBefore(e,d.firstChild)}}\'undefined\'===typeof f.MoatMAK&&(f.MoatMAK=new l,f.MoatMAK.h(k),f.__zMoatInit__=!0)})(window,%s);"

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->i()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "JavaScriptBridge"

    const-string v2, "Failed to initialize communication (did not set environment variables)."

    invoke-static {v1, p0, v2, v0}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private d()V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    iget-object v0, v0, Lcom/moat/analytics/mobile/spck/x;->a:Lcom/moat/analytics/mobile/spck/x$d;

    sget-object v1, Lcom/moat/analytics/mobile/spck/x$d;->a:Lcom/moat/analytics/mobile/spck/x$d;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->e:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x3

    if-eqz v0, :cond_8

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->c:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Lcom/moat/analytics/mobile/spck/k;->c:Z

    :cond_2
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/moat/analytics/mobile/spck/b;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/moat/analytics/mobile/spck/b;->d()Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_5

    :cond_4
    const-string v4, "JavaScriptBridge"

    const-string v5, "Tracker has no subject"

    invoke-static {v1, v4, p0, v5}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_7

    iget-boolean v4, v3, Lcom/moat/analytics/mobile/spck/b;->c:Z

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    iget-boolean v4, v3, Lcom/moat/analytics/mobile/spck/b;->d:Z

    if-eqz v4, :cond_3

    const-string v4, "javascript: if(typeof MoatMAK !== \'undefined\'){MoatMAK.mqjh(\"%s\");}"

    new-array v5, v2, [Ljava/lang/Object;

    iget-object v6, v3, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/moat/analytics/mobile/spck/b;->f()Ljava/lang/String;

    move-result-object v3

    const-string v4, "javascript: if(typeof MoatMAK !== \'undefined\'){MoatMAK.sglu(%s);}"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v3, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_6

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v4

    new-instance v5, Lcom/moat/analytics/mobile/spck/k$1;

    invoke-direct {v5, p0}, Lcom/moat/analytics/mobile/spck/k$1;-><init>(Lcom/moat/analytics/mobile/spck/k;)V

    invoke-virtual {v4, v3, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    :goto_1
    invoke-virtual {p0, v3}, Lcom/moat/analytics/mobile/spck/k;->c(Lcom/moat/analytics/mobile/spck/b;)Z

    goto :goto_0

    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->e:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_9

    const-string v0, "JavaScriptBridge"

    const-string v2, "WebView ref became null, stopping tracking loop"

    :goto_3
    invoke-static {v1, v0, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    const-string v0, "JavaScriptBridge"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebView became null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v3

    if-nez v3, :cond_a

    const-string v3, ""

    goto :goto_4

    :cond_a
    const-string v3, "based on null url"

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", stopping tracking loop"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :goto_5
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->f()V

    :cond_b
    return-void
.end method

.method private d(Lcom/moat/analytics/mobile/spck/b;)V
    .locals 3

    const-string v0, "JavaScriptBridge"

    const-string v1, "Stopping view update loop"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/moat/analytics/mobile/spck/j;->a()Lcom/moat/analytics/mobile/spck/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/moat/analytics/mobile/spck/j;->a(Lcom/moat/analytics/mobile/spck/b;)V

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->e()V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->k:Ljava/util/List;

    const/4 v1, 0x0

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private e()V
    .locals 3

    const-string v0, "JavaScriptBridge"

    const-string v1, "Stopping metadata reporting loop"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/j;->a()Lcom/moat/analytics/mobile/spck/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/moat/analytics/mobile/spck/j;->a(Lcom/moat/analytics/mobile/spck/k;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/k;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method static synthetic e(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->c()V

    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/k;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x6

    const-string v1, "JavaScriptBridge"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bridge is not installed in the given WebView. Can\'t "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p0, p1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method static synthetic f(Lcom/moat/analytics/mobile/spck/k;)J
    .locals 2

    iget-wide v0, p0, Lcom/moat/analytics/mobile/spck/k;->i:J

    return-wide v0
.end method

.method private f()V
    .locals 3

    const-string v0, "JavaScriptBridge"

    const-string v1, "Cleaning up"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->e()V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/moat/analytics/mobile/spck/b;

    invoke-direct {p0, v1}, Lcom/moat/analytics/mobile/spck/k;->d(Lcom/moat/analytics/mobile/spck/b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/k;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->d()V

    return-void
.end method

.method private g()Z
    .locals 1

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private h()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    return-object v0
.end method

.method private i()Ljava/lang/String;
    .locals 8

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/k;->j:Lcom/moat/analytics/mobile/spck/t$a;

    invoke-virtual {v1}, Lcom/moat/analytics/mobile/spck/t$a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/k;->j:Lcom/moat/analytics/mobile/spck/t$a;

    invoke-virtual {v2}, Lcom/moat/analytics/mobile/spck/t$a;->b()Ljava/lang/String;

    move-result-object v2

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/moat/analytics/mobile/spck/k;->l:Lcom/moat/analytics/mobile/spck/k$a;

    sget-object v6, Lcom/moat/analytics/mobile/spck/k$a;->a:Lcom/moat/analytics/mobile/spck/k$a;

    if-ne v5, v6, :cond_0

    const-string v5, "0"

    goto :goto_0

    :cond_0
    const-string v5, "1"

    :goto_0
    const-string/jumbo v6, "versionHash"

    const-string v7, "c6a99fb64fb971fa3879135f32fb2d3306d2d7ff"

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "appName"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "namespace"

    const-string v6, "SPCK"

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "version"

    const-string v6, "2.3.1"

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "deviceOS"

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "isNative"

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "appId"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_1

    const-string v1, "aqzx"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string/jumbo v0, "{}"

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 3

    const-string v0, "JavaScriptBridge"

    const-string/jumbo v1, "webViewReady"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->e()V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method a(Lcom/moat/analytics/mobile/spck/b;)V
    .locals 4

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    const-string v1, "JavaScriptBridge"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "adding tracker"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->f:Ljava/util/Map;

    const-string v1, ""

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "javascript: if(typeof MoatMAK !== \'undefined\'){MoatMAK.crts(%s);}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/k;->d(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "javascript:%s.dispatchEvent(%s);"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "JavaScriptBridge"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "markUserInteractionEvent:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javascript: if(typeof MoatMAK !== \'undefined\'){MoatMAK.ucbx(%s);}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/k;->d(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method b(Lcom/moat/analytics/mobile/spck/b;)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v1

    const-string/jumbo v2, "startTracking"

    invoke-direct {p0, v1, v2}, Lcom/moat/analytics/mobile/spck/k;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string/jumbo v1, "startTracking"

    invoke-direct {p0, v1}, Lcom/moat/analytics/mobile/spck/k;->e(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/moat/analytics/mobile/spck/b;->d()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x3

    if-nez v1, :cond_2

    iget-boolean v1, p1, Lcom/moat/analytics/mobile/spck/b;->c:Z

    if-nez v1, :cond_1

    const-string p1, "JavaScriptBridge"

    const-string v1, "Tracker subject is null, won\'t start tracking"

    invoke-static {v2, p1, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return v0

    :cond_1
    const-string v1, "JavaScriptBridge"

    const-string v3, "Tracker subject is null at start"

    invoke-static {v2, v1, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    const-string v1, "JavaScriptBridge"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Starting tracking on tracker"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "javascript: if(typeof MoatMAK !== \'undefined\'){MoatMAK.mqjh(\"%s\");}"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/j;->a()Lcom/moat/analytics/mobile/spck/j;

    move-result-object v1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->c()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v3, p1}, Lcom/moat/analytics/mobile/spck/j;->a(Landroid/content/Context;Lcom/moat/analytics/mobile/spck/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :cond_3
    :goto_0
    return v0

    :catch_0
    move-exception p1

    const-string v1, "JavaScriptBridge"

    const-string v2, "Failed to initialize impression start."

    invoke-static {v1, p0, v2, p1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method c(Ljava/lang/String;)V
    .locals 10

    const-string v0, "JavaScriptBridge"

    const-string v1, "flushDispatchQueue"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v3, 0xc8

    if-lt v0, v3, :cond_2

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move v4, v1

    :goto_0
    const/16 v5, 0xa

    if-ge v4, v5, :cond_0

    iget-object v5, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4

    div-int/2addr v4, v3

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/2addr v4, v3

    iget-object v5, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_1

    iget-object v6, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v6}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v5, v4}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_3
    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    if-ge v0, v3, :cond_6

    add-int/lit8 v0, v0, 0x1

    const-string v4, "javascript:%s.dispatchMany([%s])"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move v6, v2

    :goto_4
    iget-object v7, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v7}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    if-ge v0, v3, :cond_5

    add-int/lit8 v0, v0, 0x1

    iget-object v7, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v7}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    const/16 v9, 0x7d0

    if-le v8, v9, :cond_3

    goto :goto_6

    :cond_3
    iget-object v8, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {v8}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    if-eqz v6, :cond_4

    move v6, v1

    goto :goto_5

    :cond_4
    const-string v8, ","

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_5
    :goto_6
    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, v1

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v2

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/k;->g:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    return-void
.end method

.method c(Lcom/moat/analytics/mobile/spck/b;)Z
    .locals 6

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->g()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->h()Landroid/webkit/WebView;

    move-result-object v0

    const-string/jumbo v3, "stopTracking"

    invoke-direct {p0, v0, v3}, Lcom/moat/analytics/mobile/spck/k;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo v0, "stopTracking"

    invoke-direct {p0, v0}, Lcom/moat/analytics/mobile/spck/k;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    :try_start_0
    const-string v3, "JavaScriptBridge"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Ending tracking on tracker"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, p0, v4}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javascript: if(typeof MoatMAK !== \'undefined\'){MoatMAK.egpw(\"%s\");}"

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/moat/analytics/mobile/spck/b;->b:Ljava/lang/String;

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/moat/analytics/mobile/spck/k;->f(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "JavaScriptBridge"

    const-string v3, "Failed to end impression."

    invoke-static {v1, p0, v3, v0}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    move v1, v2

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->l:Lcom/moat/analytics/mobile/spck/k$a;

    sget-object v2, Lcom/moat/analytics/mobile/spck/k$a;->b:Lcom/moat/analytics/mobile/spck/k$a;

    if-ne v0, v2, :cond_1

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/k;->d(Lcom/moat/analytics/mobile/spck/b;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->f()V

    :goto_1
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/k;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return v1
.end method

.method protected finalize()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    const/4 v0, 0x3

    const-string v1, "JavaScriptBridge"

    const-string v2, "finalize"

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/k;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
