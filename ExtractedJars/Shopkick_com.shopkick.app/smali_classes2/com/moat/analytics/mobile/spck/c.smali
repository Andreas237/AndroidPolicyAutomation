.class abstract Lcom/moat/analytics/mobile/spck/c;
.super Lcom/moat/analytics/mobile/spck/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PlayerOrIMAAd:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/moat/analytics/mobile/spck/b;"
    }
.end annotation


# static fields
.field static final f:[Lcom/moat/analytics/mobile/spck/MoatAdEventType;


# instance fields
.field final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/moat/analytics/mobile/spck/MoatAdEventType;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final h:Landroid/os/Handler;

.field i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "TPlayerOrIMAAd;>;"
        }
    .end annotation
.end field

.field k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:Ljava/lang/Double;

.field private final n:Lcom/moat/analytics/mobile/spck/h;

.field private final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_FIRST_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_MID_POINT:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_THIRD_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/moat/analytics/mobile/spck/c;->f:[Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/moat/analytics/mobile/spck/b;-><init>(Landroid/view/View;ZZ)V

    const-string v1, "BaseVideoTracker"

    const-string v2, "Initializing."

    const/4 v3, 0x3

    invoke-static {v3, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->o:Ljava/lang/String;

    new-instance v1, Lcom/moat/analytics/mobile/spck/h;

    invoke-static {}, Lcom/moat/analytics/mobile/spck/a;->a()Landroid/app/Application;

    move-result-object v2

    sget-object v3, Lcom/moat/analytics/mobile/spck/h$a;->b:Lcom/moat/analytics/mobile/spck/h$a;

    invoke-direct {v1, v2, v3}, Lcom/moat/analytics/mobile/spck/h;-><init>(Landroid/content/Context;Lcom/moat/analytics/mobile/spck/h$a;)V

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    invoke-virtual {v1, p1}, Lcom/moat/analytics/mobile/spck/h;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    iget-object p1, p1, Lcom/moat/analytics/mobile/spck/h;->b:Lcom/moat/analytics/mobile/spck/k;

    invoke-super {p0, p1}, Lcom/moat/analytics/mobile/spck/b;->a(Lcom/moat/analytics/mobile/spck/k;)V

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    iget-object p1, p1, Lcom/moat/analytics/mobile/spck/h;->a:Landroid/webkit/WebView;

    invoke-super {p0, p1}, Lcom/moat/analytics/mobile/spck/b;->a(Landroid/webkit/WebView;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->g:Ljava/util/Map;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->h:Landroid/os/Handler;

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/c;->l:Z

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->m:Ljava/lang/Double;

    return-void
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/c;)Lcom/moat/analytics/mobile/spck/h;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    return-object p0
.end method

.method private b(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)V
    .locals 8

    invoke-virtual {p0, p1}, Lcom/moat/analytics/mobile/spck/c;->a(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "BaseVideoTracker"

    const-string v2, "Received event: %s"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x3

    invoke-static {v4, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "[SUCCESS] "

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Received event: %s"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/c;->a:Lcom/moat/analytics/mobile/spck/k;

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    iget-object v2, v2, Lcom/moat/analytics/mobile/spck/h;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/moat/analytics/mobile/spck/k;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    iget-object p1, p1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;->e:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_COMPLETE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_STOPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_SKIPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    if-ne p1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->g:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->j()V

    :cond_1
    return-void
.end method

.method private l()V
    .locals 9

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->g()Ljava/util/Map;

    move-result-object v0

    const-string/jumbo v1, "width"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/Integer;

    const-string v1, "height"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Integer;

    const-string v1, "duration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    const-string v0, "BaseVideoTracker"

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "Player metadata: height = %d, width = %d, duration = %d"

    const/4 v3, 0x3

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v6, v4, v8

    const/4 v8, 0x1

    aput-object v5, v4, v8

    const/4 v8, 0x2

    aput-object v7, v4, v8

    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/c;->n:Lcom/moat/analytics/mobile/spck/h;

    iget-object v3, p0, Lcom/moat/analytics/mobile/spck/c;->o:Ljava/lang/String;

    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/c;->i:Ljava/util/Map;

    invoke-virtual/range {v2 .. v7}, Lcom/moat/analytics/mobile/spck/h;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-super {p0, v0}, Lcom/moat/analytics/mobile/spck/b;->changeTargetView(Landroid/view/View;)V

    invoke-super {p0}, Lcom/moat/analytics/mobile/spck/b;->b()Z

    return-void
.end method


# virtual methods
.method a(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)Lorg/json/JSONObject;
    .locals 2

    iget-object v0, p1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;->c:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->m:Ljava/lang/Double;

    iput-object v0, p1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;->c:Ljava/lang/Double;

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/moat/analytics/mobile/spck/MoatAdEvent;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method a(Ljava/lang/Integer;Ljava/lang/Integer;)Z
    .locals 4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-double v0, p2

    const-wide v2, 0x3fa999999999999aL    # 0.05

    mul-double/2addr v0, v2

    const-wide v2, 0x4087700000000000L    # 750.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    int-to-double p1, p1

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public a(Ljava/util/Map;Ljava/lang/Object;Landroid/view/View;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;TPlayerOrIMAAd;",
            "Landroid/view/View;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x3

    :try_start_0
    iget-boolean v2, p0, Lcom/moat/analytics/mobile/spck/c;->e:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const-string v2, "BaseVideoTracker"

    const-string/jumbo v4, "trackVideoAd already called"

    invoke-static {v1, v2, p0, v4}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "[ERROR] "

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " trackVideoAd can\'t be called twice"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-nez p1, :cond_1

    const-string v2, "BaseVideoTracker"

    const-string/jumbo v4, "trackVideoAd received null adIds object. Not tracking."

    invoke-static {v1, v2, p0, v4}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "[ERROR] "

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " trackVideoAd failed, received null adIds object"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    :cond_1
    if-nez p3, :cond_2

    const-string v4, "BaseVideoTracker"

    const-string/jumbo v5, "trackVideoAd received null video view instance"

    invoke-static {v1, v4, p0, v5}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    if-nez p2, :cond_3

    const-string v2, "BaseVideoTracker"

    const-string/jumbo v4, "trackVideoAd received null ad instance. Not tracking."

    invoke-static {v1, v2, p0, v4}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "[ERROR] "

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " trackVideoAd failed, received null ad instance"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    :cond_3
    if-eqz v2, :cond_6

    const-string v4, "BaseVideoTracker"

    const-string/jumbo v5, "trackVideoAd tracking ids: %s | ad: %s | view: %s"

    new-array v6, v1, [Ljava/lang/Object;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    if-eqz p3, :cond_4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "@"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_4
    const-string v7, "null"

    :goto_1
    const/4 v8, 0x2

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v4, p0, v5}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "[SUCCESS] "

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " trackVideoAd succeeded with ids: %s | ad: %s | view: %s"

    new-array v7, v1, [Ljava/lang/Object;

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v3

    if-eqz p3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "@"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result v9

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_5
    const-string v3, "null"

    :goto_2
    aput-object v3, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->i:Ljava/util/Map;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->j:Ljava/lang/ref/WeakReference;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->k:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/c;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    move v0, v2

    goto :goto_3

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_3
    const-string p1, "BaseVideoTracker"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Attempt to start tracking ad was "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_7

    const-string p3, ""

    goto :goto_4

    :cond_7
    const-string/jumbo p3, "un"

    :goto_4
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p3, "successful."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p1, p0, p2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return v0
.end method

.method public changeTargetView(Landroid/view/View;)V
    .locals 5

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    const/4 v1, 0x3

    const-string v2, "BaseVideoTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "changing view to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->k:Ljava/lang/ref/WeakReference;

    :try_start_0
    invoke-super {p0, p1}, Lcom/moat/analytics/mobile/spck/b;->changeTargetView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method public dispatchEvent(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/c;->b(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method protected abstract g()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method protected h()Ljava/lang/Double;
    .locals 4

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->i()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->a()D

    move-result-wide v2

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method protected i()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->m:Ljava/lang/Double;

    return-object v0
.end method

.method j()V
    .locals 4

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/c;->l:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/moat/analytics/mobile/spck/c$1;

    invoke-direct {v0, p0}, Lcom/moat/analytics/mobile/spck/c$1;-><init>(Lcom/moat/analytics/mobile/spck/c;)V

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/c;->h:Landroid/os/Handler;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/c;->l:Z

    :cond_0
    return-void
.end method

.method k()Z
    .locals 2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->g:Ljava/util/Map;

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_COMPLETE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->g:Ljava/util/Map;

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_STOPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/c;->g:Ljava/util/Map;

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_SKIPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public setPlayerVolume(Ljava/lang/Double;)V
    .locals 7

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->h()Ljava/lang/Double;

    move-result-object v0

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/c;->m:Ljava/lang/Double;

    invoke-virtual {p1, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x3

    const-string v2, "BaseVideoTracker"

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "player volume changed to %f "

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/c;->m:Ljava/lang/Double;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->h()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_VOLUME_CHANGE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/c;->m:Ljava/lang/Double;

    invoke-direct {p1, v0, v1, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEvent;-><init>(Lcom/moat/analytics/mobile/spck/MoatAdEventType;Ljava/lang/Integer;Ljava/lang/Double;)V

    invoke-virtual {p0, p1}, Lcom/moat/analytics/mobile/spck/c;->dispatchEvent(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)V

    :cond_0
    return-void
.end method

.method public stopTracking()V
    .locals 4

    :try_start_0
    invoke-super {p0}, Lcom/moat/analytics/mobile/spck/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "[SUCCESS] "

    goto :goto_0

    :cond_0
    const-string v1, "[ERROR] "

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " stopTracking "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    const-string/jumbo v0, "succeeded"

    goto :goto_1

    :cond_1
    const-string v0, "failed"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/c;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method
