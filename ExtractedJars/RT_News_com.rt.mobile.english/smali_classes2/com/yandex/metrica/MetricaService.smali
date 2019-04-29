.class public Lcom/yandex/metrica/MetricaService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/MetricaService$d;,
        Lcom/yandex/metrica/MetricaService$b;,
        Lcom/yandex/metrica/MetricaService$c;,
        Lcom/yandex/metrica/MetricaService$a;
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/MetricaService$d;

.field private b:Lcom/yandex/metrica/impl/ag;

.field private final c:Lcom/yandex/metrica/IMetricaService$Stub;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 53
    new-instance v0, Lcom/yandex/metrica/MetricaService$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/MetricaService$1;-><init>(Lcom/yandex/metrica/MetricaService;)V

    iput-object v0, p0, Lcom/yandex/metrica/MetricaService;->a:Lcom/yandex/metrica/MetricaService$d;

    .line 147
    new-instance v0, Lcom/yandex/metrica/MetricaService$2;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/MetricaService$2;-><init>(Lcom/yandex/metrica/MetricaService;)V

    iput-object v0, p0, Lcom/yandex/metrica/MetricaService;->c:Lcom/yandex/metrica/IMetricaService$Stub;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/MetricaService;)Lcom/yandex/metrica/impl/ag;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    return-object p0
.end method

.method private static a(Landroid/content/res/Configuration;)V
    .locals 2

    .line 142
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/p;

    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 143
    invoke-static {p0}, Lcom/yandex/metrica/impl/as;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 87
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER"

    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    new-instance v0, Lcom/yandex/metrica/MetricaService$c;

    invoke-direct {v0}, Lcom/yandex/metrica/MetricaService$c;-><init>()V

    goto :goto_0

    :cond_0
    const-string v1, "com.yandex.metrica.ACTION_C_BG_L"

    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    new-instance v0, Lcom/yandex/metrica/MetricaService$b;

    invoke-direct {v0}, Lcom/yandex/metrica/MetricaService$b;-><init>()V

    goto :goto_0

    .line 95
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->c:Lcom/yandex/metrica/IMetricaService$Stub;

    .line 97
    :goto_0
    iget-object v1, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v1, p1}, Lcom/yandex/metrica/impl/ag;->a(Landroid/content/Intent;)V

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 137
    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 138
    invoke-static {p1}, Lcom/yandex/metrica/MetricaService;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate()V
    .locals 3

    .line 63
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 64
    invoke-virtual {p0}, Lcom/yandex/metrica/MetricaService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/t;->a(Landroid/content/Context;)V

    .line 65
    invoke-virtual {p0}, Lcom/yandex/metrica/MetricaService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/MetricaService;->a(Landroid/content/res/Configuration;)V

    .line 66
    invoke-virtual {p0}, Lcom/yandex/metrica/MetricaService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lv;->a(Landroid/content/Context;)V

    .line 68
    new-instance v0, Lcom/yandex/metrica/impl/ai;

    invoke-virtual {p0}, Lcom/yandex/metrica/MetricaService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/MetricaService;->a:Lcom/yandex/metrica/MetricaService$d;

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ai;-><init>(Landroid/content/Context;Lcom/yandex/metrica/MetricaService$d;)V

    .line 69
    new-instance v1, Lcom/yandex/metrica/impl/ah;

    invoke-direct {v1, v0}, Lcom/yandex/metrica/impl/ah;-><init>(Lcom/yandex/metrica/impl/ag;)V

    iput-object v1, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ag;->a()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 111
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 113
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ag;->b()V

    return-void
.end method

.method public onRebind(Landroid/content/Intent;)V
    .locals 1

    .line 104
    invoke-super {p0, p1}, Landroid/app/Service;->onRebind(Landroid/content/Intent;)V

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ag;->b(Landroid/content/Intent;)V

    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0, p1, p2}, Lcom/yandex/metrica/impl/ag;->a(Landroid/content/Intent;I)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0, p1, p2, p3}, Lcom/yandex/metrica/impl/ag;->a(Landroid/content/Intent;II)V

    const/4 p1, 0x2

    return p1
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 3

    .line 119
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ag;->c(Landroid/content/Intent;)V

    .line 120
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER"

    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const-string v1, "com.yandex.metrica.ACTION_C_BG_L"

    .line 123
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    if-eqz p1, :cond_3

    .line 1162
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move p1, v2

    goto :goto_1

    :cond_3
    :goto_0
    move p1, v1

    :goto_1
    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v1
.end method
