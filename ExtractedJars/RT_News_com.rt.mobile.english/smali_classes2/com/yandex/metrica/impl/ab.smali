.class public Lcom/yandex/metrica/impl/ab;
.super Lcom/yandex/metrica/impl/b;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ae;


# static fields
.field private static final c:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ne;

    const-string v2, "Deeplink"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ne;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/ab;->c:Lcom/yandex/metrica/impl/ob/nk;

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ne;

    const-string v2, "Referral url"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ne;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/ab;->d:Lcom/yandex/metrica/impl/ob/nk;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/e;Lcom/yandex/metrica/impl/bf;)V
    .locals 2

    .line 48
    new-instance v0, Lcom/yandex/metrica/impl/bc;

    new-instance v1, Lcom/yandex/metrica/CounterConfiguration;

    invoke-direct {v1, p3}, Lcom/yandex/metrica/CounterConfiguration;-><init>(Lcom/yandex/metrica/e;)V

    invoke-direct {v0, p2, v1}, Lcom/yandex/metrica/impl/bc;-><init>(Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/CounterConfiguration;)V

    invoke-direct {p0, p1, p4, v0}, Lcom/yandex/metrica/impl/b;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/bc;)V

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ab;->e:Z

    .line 55
    iget-object p2, p0, Lcom/yandex/metrica/impl/ab;->a:Lcom/yandex/metrica/impl/bc;

    new-instance p4, Lcom/yandex/metrica/impl/at;

    iget-object v0, p3, Lcom/yandex/metrica/e;->preloadInfo:Lcom/yandex/metrica/PreloadInfo;

    invoke-direct {p4, v0}, Lcom/yandex/metrica/impl/at;-><init>(Lcom/yandex/metrica/PreloadInfo;)V

    invoke-virtual {p2, p4}, Lcom/yandex/metrica/impl/bc;->a(Lcom/yandex/metrica/impl/at;)V

    .line 56
    iget-object p2, p3, Lcom/yandex/metrica/e;->crashReporting:Ljava/lang/Boolean;

    invoke-static {p2, p1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ab;->e:Z

    return-void
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event received: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, ". With value: "

    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 105
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 106
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object p1

    .line 108
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/yandex/metrica/impl/ab;->b:Lcom/yandex/metrica/impl/bf;

    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ab;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    :cond_0
    return-void

    .line 113
    :cond_1
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    const-string v0, "Null activity parameter for reportAppOpen(Activity)"

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public a(Landroid/app/Application;)V
    .locals 2

    .line 128
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 129
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Enable activity auto tracking"

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    .line 1139
    new-instance v0, Lcom/yandex/metrica/impl/m;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/m;-><init>(Lcom/yandex/metrica/impl/ab;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    .line 132
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    const-string v0, "Could not enable activity auto tracking. API level should be more than 14 (ICE_CREAM_SANDWICH)"

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/location/Location;)V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/yandex/metrica/impl/ab;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/CounterConfiguration;->a(Landroid/location/Location;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/e;Z)V
    .locals 1

    .line 159
    iget-object v0, p1, Lcom/yandex/metrica/e;->nativeCrashReporting:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ab;->a(Ljava/lang/Boolean;)V

    if-eqz p2, :cond_0

    .line 162
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ab;->b()V

    .line 164
    :cond_0
    iget-object p2, p1, Lcom/yandex/metrica/e;->i:Ljava/util/Map;

    invoke-virtual {p0, p2}, Lcom/yandex/metrica/impl/ab;->b(Ljava/util/Map;)V

    .line 165
    iget-object p1, p1, Lcom/yandex/metrica/e;->h:Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ab;->a(Ljava/util/Map;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/j;)V
    .locals 0

    .line 67
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/j;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/ko;)V
    .locals 0

    .line 62
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/ob/ko;)V

    return-void
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 2
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 173
    iget-object v0, p0, Lcom/yandex/metrica/impl/ab;->b:Lcom/yandex/metrica/impl/bf;

    const/4 v1, 0x1

    .line 174
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result p1

    .line 173
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bf;->a(Z)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/yandex/metrica/impl/ab;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/CounterConfiguration;->a(Z)V

    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 0

    .line 143
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ab;->d(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ab;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 200
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Invalid Error Environment (key,value) pair: (%s,%s)."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 203
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/yandex/metrica/impl/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 169
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ab;->e:Z

    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 0

    .line 147
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ab;->d(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ab;->b(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 190
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Invalid App Environment (key,value) pair: (%s,%s)."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    .line 192
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 194
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/yandex/metrica/impl/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method d(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 118
    sget-object v0, Lcom/yandex/metrica/impl/ab;->c:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 119
    iget-object v0, p0, Lcom/yandex/metrica/impl/ab;->b:Lcom/yandex/metrica/impl/bf;

    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ab;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 123
    sget-object v0, Lcom/yandex/metrica/impl/ab;->d:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 124
    iget-object v0, p0, Lcom/yandex/metrica/impl/ab;->b:Lcom/yandex/metrica/impl/bf;

    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ab;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public f()Z
    .locals 1

    .line 208
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ab;->e:Z

    return v0
.end method

.method public reportError(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 99
    invoke-super {p0, p1, p2}, Lcom/yandex/metrica/impl/b;->reportError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p2

    const-string v0, "Error received: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p2, v0, v1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;)V
    .locals 0

    .line 72
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/b;->reportEvent(Ljava/lang/String;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-super {p0, p1, p2}, Lcom/yandex/metrica/impl/b;->reportEvent(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ab;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 83
    invoke-super {p0, p1, p2}, Lcom/yandex/metrica/impl/b;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ab;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
