.class public Lo/cal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/can;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cal$c;,
        Lo/cal$b;
    }
.end annotation


# instance fields
.field private a:Lo/cax;

.field private b:Lo/caq;

.field private c:Landroid/content/Context;

.field private d:Landroid/content/BroadcastReceiver;

.field private e:Lo/cav;

.field private h:Lo/cas;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cal;->c:Landroid/content/Context;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cal;->e:Lo/cav;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cal;->d:Landroid/content/BroadcastReceiver;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cal;->a:Lo/cax;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cal;->b:Lo/caq;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cal;->h:Lo/cas;

    .line 108
    iput-object p1, p0, Lo/cal;->c:Landroid/content/Context;

    .line 109
    new-instance v0, Lo/cav;

    new-instance v1, Lo/caz;

    invoke-direct {v1, p1}, Lo/caz;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lo/cav;-><init>(Lo/caz;)V

    iput-object v0, p0, Lo/cal;->e:Lo/cav;

    .line 110
    return-void
.end method

.method static synthetic c(Lo/cal;Lo/cav;)Lo/cav;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/cal;->e:Lo/cav;

    return-object p1
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 64
    iget-object v0, p0, Lo/cal;->b:Lo/caq;

    invoke-interface {v0, p1}, Lo/caq;->e(Z)V

    .line 65
    return-void
.end method

.method public a()Z
    .locals 1

    .line 76
    iget-object v0, p0, Lo/cal;->b:Lo/caq;

    invoke-interface {v0}, Lo/caq;->g()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    .line 72
    iget-object v0, p0, Lo/cal;->b:Lo/caq;

    invoke-interface {v0}, Lo/caq;->d()Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cal;->e:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->b()V

    .line 81
    iget-object v0, p0, Lo/cal;->e:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 82
    return-void
.end method

.method public c(Lo/ald;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lo/cal;->e:Lo/cav;

    invoke-virtual {v0, p1}, Lo/cav;->e(Lo/ald;)V

    .line 138
    return-void
.end method

.method public d(Z)V
    .locals 1

    .line 60
    iget-object v0, p0, Lo/cal;->b:Lo/caq;

    invoke-interface {v0, p1}, Lo/caq;->d(Z)V

    .line 61
    return-void
.end method

.method public d()Z
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cal;->b:Lo/caq;

    invoke-interface {v0}, Lo/caq;->c()Z

    move-result v0

    return v0
.end method

.method public e()V
    .locals 2

    .line 54
    iget-object v0, p0, Lo/cal;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cal;->d:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lo/cal;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cal;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 57
    :cond_0
    return-void
.end method

.method public f()Lo/can;
    .locals 4

    .line 46
    new-instance v3, Lo/cbd;

    invoke-direct {v3, p0}, Lo/cbd;-><init>(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/can;

    .line 50
    return-object v2
.end method

.method public h()Lo/alb;
    .locals 2

    .line 102
    new-instance v0, Lo/cal$c;

    iget-object v1, p0, Lo/cal;->e:Lo/cav;

    invoke-direct {v0, p0, v1}, Lo/cal$c;-><init>(Lo/cal;Lo/cav;)V

    return-object v0
.end method

.method public i()V
    .locals 6

    .line 114
    new-instance v4, Lo/car;

    iget-object v0, p0, Lo/cal;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/car;-><init>(Landroid/content/Context;)V

    .line 115
    iget-object v0, p0, Lo/cal;->e:Lo/cav;

    invoke-virtual {v4, v0}, Lo/car;->e(Lo/cav;)V

    .line 116
    invoke-virtual {v4}, Lo/car;->i()Lo/caq;

    move-result-object v0

    iput-object v0, p0, Lo/cal;->b:Lo/caq;

    .line 118
    new-instance v0, Lo/cas;

    iget-object v1, p0, Lo/cal;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cas;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cal;->h:Lo/cas;

    .line 119
    iget-object v0, p0, Lo/cal;->h:Lo/cas;

    iget-object v1, p0, Lo/cal;->e:Lo/cav;

    invoke-virtual {v0, p0, v1}, Lo/cas;->e(Lo/cal;Lo/cav;)V

    .line 121
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 122
    const-string v0, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 123
    new-instance v0, Lo/cal$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cal$b;-><init>(Lo/cal;Lo/cal$5;)V

    iput-object v0, p0, Lo/cal;->d:Landroid/content/BroadcastReceiver;

    .line 125
    const-string v0, "Step_UIManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDynamicBroadcastReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lo/cal;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/cal;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cal;->d:Landroid/content/BroadcastReceiver;

    const-string v2, "com.huawei.health.INTERNAL_PERMISSION"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 130
    new-instance v0, Lo/cax;

    iget-object v1, p0, Lo/cal;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cax;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cal;->a:Lo/cax;

    .line 131
    iget-object v0, p0, Lo/cal;->a:Lo/cax;

    iget-object v1, p0, Lo/cal;->b:Lo/caq;

    invoke-virtual {v0, v1}, Lo/cax;->b(Lo/caq;)V

    .line 134
    :cond_0
    return-void
.end method
