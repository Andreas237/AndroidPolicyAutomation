.class public Lo/cas;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cat;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cas$b;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Lo/cas$b;

.field private e:Lo/cav;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cas;->b:Lo/cas$b;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cas;->e:Lo/cav;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cas;->a:Landroid/os/Handler;

    .line 31
    new-instance v0, Lo/cas$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cas$b;-><init>(Lo/cas;Lo/cas$3;)V

    iput-object v0, p0, Lo/cas;->b:Lo/cas$b;

    .line 33
    const-string v0, "Step_UIWidgetManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDynamicBroadcastReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 37
    const-string v0, "com.huawei.health.WIDGET_ENABLE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 38
    const-string v0, "com.huawei.health.WIDGET_DISABLE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 39
    const-string v0, "com.huawei.health.WIDGET_FORCE_UPDATE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 40
    const-string v0, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 41
    const-string v0, "android.intent.action.WALLPAPER_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    if-eqz p1, :cond_0

    .line 44
    iget-object v0, p0, Lo/cas;->b:Lo/cas$b;

    const-string v1, "com.huawei.health.INTERNAL_PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 46
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/cas;->a:Landroid/os/Handler;

    .line 47
    return-void
.end method

.method static synthetic b(Lo/cas;)Lo/cav;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/cas;->e:Lo/cav;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 59
    iget-object v0, p0, Lo/cas;->e:Lo/cav;

    sget-object v1, Lo/cau;->e:Lo/cau;

    invoke-virtual {v0, v1}, Lo/cav;->c(Lo/cau;)V

    .line 60
    iget-object v0, p0, Lo/cas;->e:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 61
    return-void
.end method

.method public b()V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/cas;->e:Lo/cav;

    sget-object v1, Lo/cau;->e:Lo/cau;

    invoke-virtual {v0, v1}, Lo/cav;->a(Lo/cau;)V

    .line 65
    return-void
.end method

.method public c()V
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cas;->e:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 69
    return-void
.end method

.method public d()V
    .locals 6

    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v5, v0, :cond_0

    .line 74
    add-int/lit16 v4, v4, 0x3e8

    .line 75
    iget-object v0, p0, Lo/cas;->a:Landroid/os/Handler;

    new-instance v1, Lo/cas$3;

    invoke-direct {v1, p0}, Lo/cas$3;-><init>(Lo/cas;)V

    int-to-long v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 73
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 84
    :cond_0
    return-void
.end method

.method public e()Lo/cat;
    .locals 4

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lo/cbd;

    invoke-direct {v2, p0}, Lo/cbd;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cat;

    .line 51
    return-object v3
.end method

.method public e(Lo/cal;Lo/cav;)V
    .locals 0

    .line 55
    iput-object p2, p0, Lo/cas;->e:Lo/cav;

    .line 56
    return-void
.end method
