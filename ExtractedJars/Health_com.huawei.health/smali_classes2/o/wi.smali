.class public Lo/wi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/wi;

.field public static final c:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private e:Lcom/android/volley/RequestQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const-class v0, Lo/wi;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/wi;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/wi;->b:Landroid/content/Context;

    .line 36
    invoke-direct {p0}, Lo/wi;->d()Lcom/android/volley/RequestQueue;

    move-result-object v0

    iput-object v0, p0, Lo/wi;->e:Lcom/android/volley/RequestQueue;

    .line 37
    return-void
.end method

.method private d()Lcom/android/volley/RequestQueue;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/wi;->e:Lcom/android/volley/RequestQueue;

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/wi;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;

    move-result-object v0

    iput-object v0, p0, Lo/wi;->e:Lcom/android/volley/RequestQueue;

    .line 53
    :cond_0
    iget-object v0, p0, Lo/wi;->e:Lcom/android/volley/RequestQueue;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/wi;
    .locals 3

    .line 40
    const-class v1, Lo/wi;

    monitor-enter v1

    .line 41
    :try_start_0
    sget-object v0, Lo/wi;->a:Lo/wi;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 42
    new-instance v0, Lo/wi;

    invoke-direct {v0, p0}, Lo/wi;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/wi;->a:Lo/wi;

    .line 44
    :cond_0
    sget-object v0, Lo/wi;->a:Lo/wi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 45
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lo/wi;->b:Landroid/content/Context;

    const-string v1, "Set-Cookie"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 104
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    const-string v0, "JSESSIONID"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    const-string v0, "="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    const-string v0, "Cookie"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    const-string v0, "; "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    const-string v0, "Cookie"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    :cond_0
    const-string v0, "Cookie"

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    :cond_1
    return-void
.end method

.method public d(Lcom/android/volley/Request;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lcom/android/volley/Request<TT;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 63
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lo/wi;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    invoke-virtual {p1, v0}, Lcom/android/volley/Request;->setTag(Ljava/lang/Object;)Lcom/android/volley/Request;

    .line 64
    invoke-direct {p0}, Lo/wi;->d()Lcom/android/volley/RequestQueue;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 65
    return-void
.end method

.method public final d(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 85
    const-string v0, "Set-Cookie"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Set-Cookie"

    .line 86
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "JSESSIONID"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const-string v0, "Set-Cookie"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 88
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 89
    const-string v0, ";"

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 90
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 91
    const/4 v0, 0x1

    aget-object v2, v4, v0

    .line 93
    iget-object v0, p0, Lo/wi;->b:Landroid/content/Context;

    const-string v1, "Set-Cookie"

    invoke-static {v0, v1, v2}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :cond_0
    return-void
.end method
