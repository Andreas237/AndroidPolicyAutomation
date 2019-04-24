.class public Lo/cmt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmz;
.implements Lo/cmr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cmt$a;
    }
.end annotation


# static fields
.field private static a:Lo/cmt;

.field private static h:Lo/cmo;


# instance fields
.field private b:Z

.field private c:Lo/cmt$a;

.field private d:Landroid/os/HandlerThread;

.field private e:Ljava/lang/String;

.field private g:Lo/cmu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/cmu<Lo/aba;>;"
        }
    .end annotation
.end field

.field private i:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/cmt;->a:Lo/cmt;

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lo/cmt;->h:Lo/cmo;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->e:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cmt;->b:Z

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->i:Landroid/content/Context;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->g:Lo/cmu;

    .line 83
    invoke-direct {p0}, Lo/cmt;->e()V

    .line 84
    return-void
.end method

.method static synthetic a()Lo/cmo;
    .locals 1

    .line 26
    sget-object v0, Lo/cmt;->h:Lo/cmo;

    return-object v0
.end method

.method public static b()V
    .locals 5

    .line 197
    const-class v2, Lo/cmt;

    monitor-enter v2

    .line 198
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0, v1}, Lo/cmt;->e(Landroid/content/Context;Lo/cmo;)Lo/cmz;

    move-result-object v3

    .line 199
    if-nez v3, :cond_0

    .line 200
    const-string v0, "healthOpenSDK_HealthDeviceOper"

    const-string v1, "no instance need release"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    const/4 v0, 0x0

    sput-object v0, Lo/cmt;->a:Lo/cmt;

    .line 202
    const/4 v0, 0x0

    sput-object v0, Lo/cmt;->h:Lo/cmo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit v2

    return-void

    .line 205
    :cond_0
    :try_start_1
    invoke-interface {v3}, Lo/cmz;->c()V

    .line 206
    const/4 v0, 0x0

    sput-object v0, Lo/cmt;->a:Lo/cmt;

    .line 207
    const/4 v0, 0x0

    sput-object v0, Lo/cmt;->h:Lo/cmo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 209
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/cmt;Z)Z
    .locals 0

    .line 26
    iput-boolean p1, p0, Lo/cmt;->b:Z

    return p1
.end method

.method static synthetic d(Lo/cmt;)Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/cmt;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static e(Landroid/content/Context;Lo/cmo;)Lo/cmz;
    .locals 7

    .line 40
    const-class v5, Lo/cmt;

    monitor-enter v5

    .line 41
    :try_start_0
    sget-object v0, Lo/cmt;->a:Lo/cmt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 42
    if-nez p0, :cond_0

    .line 43
    monitor-exit v5

    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_0
    :try_start_1
    new-instance v0, Lo/cmt;

    invoke-direct {v0}, Lo/cmt;-><init>()V

    sput-object v0, Lo/cmt;->a:Lo/cmt;

    .line 46
    sput-object p1, Lo/cmt;->h:Lo/cmo;

    .line 47
    sget-object v0, Lo/cmt;->a:Lo/cmt;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    sget-object v1, Lo/cmt;->a:Lo/cmt;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lo/cmw;

    sget-object v3, Lo/cmt;->a:Lo/cmt;

    invoke-direct {v2, v3}, Lo/cmw;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cmz;

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {v4, v0}, Lo/cmz;->e(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    monitor-exit v5

    return-object v4

    .line 51
    :cond_1
    :try_start_2
    sget-object v0, Lo/cmt;->a:Lo/cmt;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    sget-object v1, Lo/cmt;->a:Lo/cmt;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lo/cmw;

    sget-object v3, Lo/cmt;->a:Lo/cmt;

    invoke-direct {v2, v3}, Lo/cmw;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cmz;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    monitor-exit v5

    return-object v4

    .line 53
    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6
.end method

.method private e()V
    .locals 2

    .line 90
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Health_sdk"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    .line 91
    iget-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 92
    new-instance v0, Lo/cmt$a;

    iget-object v1, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cmt$a;-><init>(Lo/cmt;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    .line 93
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 6

    .line 143
    const-string v0, "healthOpenSDK_HealthDeviceOper"

    const-string v1, "HealthDeviceOper holdDevice()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    iput-object p1, p0, Lo/cmt;->e:Ljava/lang/String;

    .line 145
    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cmt$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cmt$a;->removeMessages(I)V

    .line 148
    :cond_0
    iget-object v0, p0, Lo/cmt;->g:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aba;

    .line 149
    if-eqz v4, :cond_1

    .line 151
    :try_start_0
    invoke-interface {v4, p1}, Lo/aba;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    goto :goto_0

    .line 152
    :catch_0
    move-exception v5

    .line 153
    invoke-virtual {v5}, Landroid/os/RemoteException;->printStackTrace()V

    .line 155
    :goto_0
    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    if-eqz v0, :cond_1

    .line 156
    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    const/4 v1, 0x1

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Lo/cmt$a;->sendEmptyMessageDelayed(IJ)Z

    .line 159
    :cond_1
    return-void
.end method

.method public c()V
    .locals 4

    .line 179
    const-string v0, "healthOpenSDK_HealthDeviceOper"

    const-string v1, "release() ..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    iget-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 183
    :try_start_0
    iget-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/os/HandlerThread;->join(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_0

    .line 184
    :catch_0
    move-exception v3

    .line 185
    const-string v0, "healthOpenSDK_HealthDeviceOper"

    const-string v1, "worker thread couldnt join"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->d:Landroid/os/HandlerThread;

    .line 188
    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmt$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 190
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmt;->c:Lo/cmt$a;

    .line 193
    :cond_0
    iget-object v0, p0, Lo/cmt;->g:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->i()V

    .line 194
    return-void
.end method

.method public d()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lo/cmt;->b:Z

    return v0
.end method

.method public e(Landroid/content/Context;)V
    .locals 3

    .line 99
    iput-object p1, p0, Lo/cmt;->i:Landroid/content/Context;

    .line 100
    const-string v0, "healthOpenSDK_HealthDeviceOper"

    const-string v1, "HealthDeviceOper bindDaemonService..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 102
    const-string v0, "com.huawei.health.device.oper"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    new-instance v0, Lo/cmt$1;

    iget-object v1, p0, Lo/cmt;->i:Landroid/content/Context;

    invoke-direct {v0, p0, v1, v2}, Lo/cmt$1;-><init>(Lo/cmt;Landroid/content/Context;Landroid/content/Intent;)V

    iput-object v0, p0, Lo/cmt;->g:Lo/cmu;

    .line 139
    return-void
.end method
