.class public Lo/cna;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cnc;
.implements Lo/cmr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cna$d;
    }
.end annotation


# static fields
.field private static a:Lo/cmo;

.field private static c:Lo/cna;


# instance fields
.field private b:Lo/cmu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/cmu<Lo/aav;>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Landroid/content/Context;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cnf;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cna$d;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lo/cna;->c:Lo/cna;

    .line 35
    const/4 v0, 0x0

    sput-object v0, Lo/cna;->a:Lo/cmo;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cna;->e:Landroid/content/Context;

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cna;->d:Z

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cna;->b:Lo/cmu;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cna;->f:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cna;->g:Ljava/util/List;

    .line 59
    return-void
.end method

.method private a(Lo/cnf;)Z
    .locals 6

    .line 296
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unRegisterStepReportInner "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 299
    const/4 v4, 0x0

    .line 300
    if-eqz v3, :cond_0

    .line 303
    :try_start_0
    invoke-interface {v3, p1}, Lo/aav;->a(Lo/abg;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 307
    goto :goto_0

    .line 305
    :catch_0
    move-exception v5

    .line 306
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unRegisterStepReport : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    :cond_0
    :goto_0
    return v4
.end method

.method public static b(Landroid/content/Context;Lo/cmo;)Lo/cnc;
    .locals 7

    .line 39
    const-class v5, Lo/cna;

    monitor-enter v5

    .line 40
    :try_start_0
    sget-object v0, Lo/cna;->c:Lo/cna;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 41
    if-nez p0, :cond_0

    .line 42
    monitor-exit v5

    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_0
    :try_start_1
    new-instance v0, Lo/cna;

    invoke-direct {v0}, Lo/cna;-><init>()V

    sput-object v0, Lo/cna;->c:Lo/cna;

    .line 45
    sput-object p1, Lo/cna;->a:Lo/cmo;

    .line 46
    sget-object v0, Lo/cna;->c:Lo/cna;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    sget-object v1, Lo/cna;->c:Lo/cna;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lo/cmw;

    sget-object v3, Lo/cna;->c:Lo/cna;

    invoke-direct {v2, v3}, Lo/cmw;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cnc;

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {v4, v0}, Lo/cnc;->b(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    monitor-exit v5

    return-object v4

    .line 50
    :cond_1
    :try_start_2
    sget-object v0, Lo/cna;->c:Lo/cna;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    sget-object v1, Lo/cna;->c:Lo/cna;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lo/cmw;

    sget-object v3, Lo/cna;->c:Lo/cna;

    invoke-direct {v2, v3}, Lo/cmw;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cnc;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    monitor-exit v5

    return-object v4

    .line 52
    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6
.end method

.method private b(Lo/cmq;)Lo/cnf;
    .locals 4

    .line 313
    iget-object v1, p0, Lo/cna;->f:Ljava/util/List;

    monitor-enter v1

    .line 314
    const/4 v2, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 315
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnf;

    invoke-virtual {v0, p1}, Lo/cnf;->b(Lo/cmq;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 314
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 319
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 320
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Lo/cna;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/cna;->d:Z

    return p1
.end method

.method static synthetic c(Lo/cna;)Ljava/util/List;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/cna;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/cna;Lo/cnf;)Z
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lo/cna;->e(Lo/cnf;)Z

    move-result v0

    return v0
.end method

.method private d(Lo/cnh;I)Z
    .locals 7

    .line 347
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "registerRealTimeReportInner ..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    move v3, p2

    .line 351
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 352
    const/4 v5, 0x0

    .line 353
    if-eqz v4, :cond_0

    .line 355
    :try_start_0
    invoke-interface {v4, p1, v3}, Lo/aav;->d(Lo/abb;I)Z

    move-result v0

    move v5, v0

    .line 356
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerRealTimeReport reporter\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    goto :goto_0

    .line 357
    :catch_0
    move-exception v6

    .line 358
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerRealTimeReport : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 359
    goto :goto_0

    .line 361
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "registerRealTimeReport : mDaemonRemoteManager = null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 364
    :goto_0
    return v5
.end method

.method static synthetic e(Lo/cna;)Ljava/util/List;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lo/cna;Lo/cnh;I)Z
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Lo/cna;->d(Lo/cnh;I)Z

    move-result v0

    return v0
.end method

.method private e(Lo/cnf;)Z
    .locals 6

    .line 265
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerStepReportInner "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 267
    const/4 v4, 0x0

    .line 268
    if-eqz v3, :cond_0

    .line 270
    :try_start_0
    invoke-interface {v3, p1}, Lo/aav;->b(Lo/abg;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 273
    goto :goto_0

    .line 271
    :catch_0
    move-exception v5

    .line 272
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerStepCallbackInter : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    :cond_0
    :goto_0
    return v4
.end method

.method static synthetic h()Lo/cmo;
    .locals 1

    .line 31
    sget-object v0, Lo/cna;->a:Lo/cmo;

    return-object v0
.end method

.method public static i()V
    .locals 5

    .line 728
    const-class v2, Lo/cna;

    monitor-enter v2

    .line 729
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0, v1}, Lo/cna;->b(Landroid/content/Context;Lo/cmo;)Lo/cnc;

    move-result-object v3

    .line 730
    if-nez v3, :cond_0

    .line 731
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "no instance need release"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 732
    const/4 v0, 0x0

    sput-object v0, Lo/cna;->c:Lo/cna;

    .line 733
    const/4 v0, 0x0

    sput-object v0, Lo/cna;->a:Lo/cmo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 734
    monitor-exit v2

    return-void

    .line 736
    :cond_0
    :try_start_1
    invoke-interface {v3}, Lo/cnc;->c()V

    .line 737
    const/4 v0, 0x0

    sput-object v0, Lo/cna;->c:Lo/cna;

    .line 738
    const/4 v0, 0x0

    sput-object v0, Lo/cna;->a:Lo/cmo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 739
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 740
    :goto_0
    return-void
.end method

.method private m()Z
    .locals 6

    .line 380
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "unRegisterRealTimeReportInner"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 382
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 383
    const/4 v4, 0x0

    .line 384
    if-eqz v3, :cond_0

    .line 386
    :try_start_0
    invoke-interface {v3}, Lo/aav;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 389
    goto :goto_0

    .line 387
    :catch_0
    move-exception v5

    .line 388
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unRegisterRealTimeReport : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 389
    goto :goto_0

    .line 391
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "unRegisterRealTimeReport : mDaemonRemoteManager = null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 394
    :goto_0
    return v4
.end method


# virtual methods
.method public a(Lo/cmo;)V
    .locals 6

    .line 559
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStandSteps callback:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 561
    move-object v3, p1

    .line 563
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 565
    if-eqz v4, :cond_0

    .line 567
    :try_start_0
    new-instance v0, Lo/cng;

    invoke-direct {v0, v3}, Lo/cng;-><init>(Lo/cmo;)V

    invoke-interface {v4, v0}, Lo/aav;->d(Lo/aay;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 570
    goto :goto_0

    .line 568
    :catch_0
    move-exception v5

    .line 569
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStandSteps : Exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 572
    :cond_0
    :goto_0
    return-void
.end method

.method public a(Lo/cmq;Lo/cmo;)V
    .locals 7

    .line 239
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerStepReport "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    invoke-direct {p0, p1}, Lo/cna;->b(Lo/cmq;)Lo/cnf;

    move-result-object v3

    .line 243
    if-eqz v3, :cond_0

    .line 244
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "registerStepReport report already exists!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    return-void

    .line 248
    :cond_0
    new-instance v3, Lo/cnf;

    invoke-direct {v3, p1}, Lo/cnf;-><init>(Lo/cmq;)V

    .line 250
    invoke-direct {p0, v3}, Lo/cna;->e(Lo/cnf;)Z

    move-result v4

    .line 252
    if-eqz v4, :cond_1

    .line 253
    iget-object v5, p0, Lo/cna;->f:Ljava/util/List;

    monitor-enter v5

    .line 254
    :try_start_0
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 256
    :goto_0
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lo/cmo;->b(Ljava/lang/Object;)V

    goto :goto_1

    .line 258
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 261
    :goto_1
    return-void
.end method

.method public a(Z)V
    .locals 6

    .line 476
    move v3, p1

    .line 477
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setStepCounterSwitchStatus "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 479
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 481
    if-eqz v4, :cond_0

    .line 483
    :try_start_0
    invoke-interface {v4, v3}, Lo/aav;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 486
    goto :goto_0

    .line 484
    :catch_0
    move-exception v5

    .line 485
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setStepCounterSwitchStatus : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 488
    :cond_0
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 6

    .line 492
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getStepCounterSwitchStatus"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 496
    const/4 v4, 0x0

    .line 498
    if-eqz v3, :cond_0

    .line 500
    :try_start_0
    invoke-interface {v3}, Lo/aav;->d()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 503
    goto :goto_0

    .line 501
    :catch_0
    move-exception v5

    .line 502
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setStepCounterSwitchStatus : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 506
    :cond_0
    :goto_0
    return v4
.end method

.method public b()I
    .locals 6

    .line 512
    const/4 v3, 0x3

    .line 514
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 516
    if-eqz v4, :cond_0

    .line 518
    :try_start_0
    invoke-interface {v4}, Lo/aav;->e()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 521
    goto :goto_0

    .line 519
    :catch_0
    move-exception v5

    .line 520
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStepCounterClass : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 522
    :goto_0
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStepCounterClass result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 525
    :cond_0
    return v3
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 87
    iput-object p1, p0, Lo/cna;->e:Landroid/content/Context;

    .line 89
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "bindStepService ..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 93
    const-string v0, "com.huawei.health"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    new-instance v0, Lo/cna$3;

    iget-object v1, p0, Lo/cna;->e:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v3, v2}, Lo/cna$3;-><init>(Lo/cna;Landroid/content/Context;Landroid/content/Intent;Z)V

    iput-object v0, p0, Lo/cna;->b:Lo/cmu;

    .line 138
    return-void
.end method

.method public b(Lo/cmo;)V
    .locals 6

    .line 398
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getNotificationSupport"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 400
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 402
    if-eqz v3, :cond_1

    .line 404
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 405
    invoke-interface {v3}, Lo/aav;->h()Z

    move-result v5

    .line 406
    const-string v0, "notificationSupport"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 407
    if-eqz p1, :cond_0

    .line 408
    invoke-interface {p1, v4}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 410
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getNotificationSupport success: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    return-void

    .line 412
    :catch_0
    move-exception v4

    .line 413
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setNotificationEnable : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    :cond_1
    if-eqz p1, :cond_2

    .line 417
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 419
    :cond_2
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getNotificationSupport failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 421
    return-void
.end method

.method public b(Lo/cms;)V
    .locals 6

    .line 189
    move-object v3, p1

    .line 191
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "flushCacheToDB "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 195
    if-eqz v4, :cond_0

    .line 198
    :try_start_0
    new-instance v0, Lo/cnd;

    invoke-direct {v0, v3}, Lo/cnd;-><init>(Lo/cms;)V

    invoke-interface {v4, v0}, Lo/aav;->c(Lo/aay;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    goto :goto_0

    .line 200
    :catch_0
    move-exception v5

    .line 201
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "flushCacheToDB : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    goto :goto_0

    .line 205
    :cond_0
    if-eqz v3, :cond_1

    .line 206
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Lo/cms;->d(Landroid/os/Bundle;)V

    .line 210
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 5

    .line 674
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 676
    if-eqz v3, :cond_0

    .line 678
    :try_start_0
    invoke-interface {v3, p1}, Lo/aav;->d(Z)V

    .line 679
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "switchTrackMonitor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 682
    goto :goto_0

    .line 680
    :catch_0
    move-exception v4

    .line 681
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "switchTrackMonitor : RemoteEx "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 684
    :cond_0
    :goto_0
    return-void
.end method

.method public b(ZLo/cmo;)V
    .locals 5

    .line 214
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setGoalNotifiEnable "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 218
    if-eqz v3, :cond_1

    .line 220
    :try_start_0
    invoke-interface {v3, p1}, Lo/aav;->c(Z)V

    .line 221
    if-eqz p2, :cond_0

    .line 222
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 224
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "setGoalNotifiEnable success"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    return-void

    .line 226
    :catch_0
    move-exception v4

    .line 227
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setGoalNotifiEnable : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    :cond_1
    if-eqz p2, :cond_2

    .line 231
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 233
    :cond_2
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "setGoalNotifiEnable failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    return-void
.end method

.method public c()V
    .locals 6

    .line 709
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "release"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 710
    iget-object v2, p0, Lo/cna;->f:Ljava/util/List;

    monitor-enter v2

    .line 712
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 713
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnf;

    invoke-direct {p0, v0}, Lo/cna;->a(Lo/cnf;)Z

    .line 712
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 715
    :cond_0
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 716
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 717
    :goto_1
    iget-object v2, p0, Lo/cna;->g:Ljava/util/List;

    monitor-enter v2

    .line 719
    :try_start_1
    invoke-direct {p0}, Lo/cna;->m()Z

    .line 720
    iget-object v0, p0, Lo/cna;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 721
    monitor-exit v2

    goto :goto_2

    :catchall_1
    move-exception v5

    monitor-exit v2

    throw v5

    .line 723
    :goto_2
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->i()V

    .line 725
    return-void
.end method

.method public c(Lo/cmo;)V
    .locals 6

    .line 546
    move-object v3, p1

    .line 548
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 551
    :try_start_0
    new-instance v0, Lo/cng;

    invoke-direct {v0, v3}, Lo/cng;-><init>(Lo/cmo;)V

    invoke-interface {v4, v0}, Lo/aav;->a(Lo/aay;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 554
    goto :goto_0

    .line 552
    :catch_0
    move-exception v5

    .line 553
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getTodaySportData : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 555
    :goto_0
    return-void
.end method

.method public d(Lo/cmo;)V
    .locals 6

    .line 424
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getStepsNotifiState"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 428
    if-eqz v3, :cond_1

    .line 430
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 431
    invoke-interface {v3}, Lo/aav;->g()Z

    move-result v5

    .line 432
    const-string v0, "stepsNotifiState"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 433
    if-eqz p1, :cond_0

    .line 434
    invoke-interface {p1, v4}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 436
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStepsNotifiState success: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 437
    return-void

    .line 438
    :catch_0
    move-exception v4

    .line 439
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStepsNotifiState : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 442
    :cond_1
    if-eqz p1, :cond_2

    .line 443
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 445
    :cond_2
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getStepsNotifiState failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 447
    return-void
.end method

.method public d(Lo/cmx;I)V
    .locals 5

    .line 326
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "registerRealTimeReport ..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 328
    if-nez p1, :cond_0

    .line 329
    return-void

    .line 332
    :cond_0
    new-instance v2, Lo/cnh;

    invoke-direct {v2, p1}, Lo/cnh;-><init>(Lo/cmx;)V

    .line 334
    invoke-direct {p0, v2, p2}, Lo/cna;->d(Lo/cnh;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 335
    return-void

    .line 338
    :cond_1
    iget-object v3, p0, Lo/cna;->g:Ljava/util/List;

    monitor-enter v3

    .line 339
    :try_start_0
    iget-object v0, p0, Lo/cna;->g:Ljava/util/List;

    new-instance v1, Lo/cna$d;

    invoke-direct {v1, v2, p2}, Lo/cna$d;-><init>(Lo/cnh;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 342
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/cna;->d:Z

    return v0
.end method

.method public e()V
    .locals 3

    .line 369
    invoke-direct {p0}, Lo/cna;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 370
    return-void

    .line 372
    :cond_0
    iget-object v1, p0, Lo/cna;->g:Ljava/util/List;

    monitor-enter v1

    .line 373
    :try_start_0
    iget-object v0, p0, Lo/cna;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 375
    :goto_0
    return-void
.end method

.method public e(Lo/cmo;)V
    .locals 6

    .line 450
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getGoalNotifiState"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 452
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 454
    if-eqz v3, :cond_1

    .line 456
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 457
    invoke-interface {v3}, Lo/aav;->f()Z

    move-result v5

    .line 458
    const-string v0, "goalNotifiState"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 459
    if-eqz p1, :cond_0

    .line 460
    invoke-interface {p1, v4}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 462
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGoalNotifiState success: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 463
    return-void

    .line 464
    :catch_0
    move-exception v4

    .line 465
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGoalNotifiState : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 468
    :cond_1
    if-eqz p1, :cond_2

    .line 469
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 471
    :cond_2
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "getGoalNotifiState failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 473
    return-void
.end method

.method public e(Lo/cmq;)V
    .locals 6

    .line 280
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unRegisterStepReport "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 282
    invoke-direct {p0, p1}, Lo/cna;->b(Lo/cmq;)Lo/cnf;

    move-result-object v3

    .line 284
    if-nez v3, :cond_0

    .line 285
    return-void

    .line 287
    :cond_0
    invoke-direct {p0, v3}, Lo/cna;->a(Lo/cnf;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    iget-object v4, p0, Lo/cna;->f:Ljava/util/List;

    monitor-enter v4

    .line 289
    :try_start_0
    iget-object v0, p0, Lo/cna;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 292
    :cond_1
    :goto_0
    return-void
.end method

.method public e(ZLo/cmo;)V
    .locals 5

    .line 164
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setStepsNotifiEnable "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 168
    if-eqz v3, :cond_1

    .line 170
    :try_start_0
    invoke-interface {v3, p1}, Lo/aav;->b(Z)V

    .line 171
    if-eqz p2, :cond_0

    .line 172
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 174
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "setStepsNotifiEnable success"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    return-void

    .line 176
    :catch_0
    move-exception v4

    .line 177
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setStepsNotifiEnable : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    :cond_1
    if-eqz p2, :cond_2

    .line 181
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 183
    :cond_2
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "setStepsNotifiEnable failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    return-void
.end method

.method public f()V
    .locals 5

    .line 660
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 662
    if-eqz v3, :cond_0

    .line 664
    :try_start_0
    invoke-interface {v3}, Lo/aav;->o()V

    .line 665
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "tickTrackDog over "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 668
    goto :goto_0

    .line 666
    :catch_0
    move-exception v4

    .line 667
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tickTrackDog : RemoteEx "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 670
    :cond_0
    :goto_0
    return-void
.end method

.method public f(Lo/cmo;)V
    .locals 6

    .line 594
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isNeedPromptKeepAlive callback:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 596
    move-object v3, p1

    .line 598
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 600
    if-nez v4, :cond_0

    .line 601
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "isNeedPromptKeepAlive remote null,return"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    return-void

    .line 606
    :cond_0
    :try_start_0
    new-instance v0, Lo/cng;

    invoke-direct {v0, v3}, Lo/cng;-><init>(Lo/cmo;)V

    invoke-interface {v4, v0}, Lo/aav;->f(Lo/aay;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 609
    goto :goto_0

    .line 607
    :catch_0
    move-exception v5

    .line 608
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isNeedPromptKeepAlive : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 610
    :goto_0
    return-void
.end method

.method public g()V
    .locals 5

    .line 615
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "makePromptNoSense"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 617
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 619
    if-nez v3, :cond_0

    .line 620
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "makePromptNoSense remote null,return"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 621
    return-void

    .line 625
    :cond_0
    :try_start_0
    invoke-interface {v3}, Lo/aav;->p()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 628
    goto :goto_0

    .line 626
    :catch_0
    move-exception v4

    .line 627
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "makePromptNoSense : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 629
    :goto_0
    return-void
.end method

.method public h(Lo/cmo;)V
    .locals 5

    .line 635
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "notifyUserInfoChanged "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 637
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aav;

    .line 639
    if-eqz v3, :cond_1

    .line 641
    :try_start_0
    invoke-interface {v3}, Lo/aav;->i()V

    .line 642
    if-eqz p1, :cond_0

    .line 643
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 645
    :cond_0
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "notifyUserInfoChanged success"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 646
    return-void

    .line 647
    :catch_0
    move-exception v4

    .line 648
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyUserInfoChanged : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 651
    :cond_1
    if-eqz p1, :cond_2

    .line 652
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 654
    :cond_2
    const-string v0, "HealthOpenSDK_HSC"

    const-string v1, "notifyUserInfoChanged failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 656
    return-void
.end method

.method public k()I
    .locals 6

    .line 688
    const/4 v3, 0x3

    .line 690
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 692
    if-eqz v4, :cond_0

    .line 694
    :try_start_0
    invoke-interface {v4}, Lo/aav;->n()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 697
    goto :goto_0

    .line 695
    :catch_0
    move-exception v5

    .line 696
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDeviceOriginalClass : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 698
    :goto_0
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDeviceOriginalClass result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 701
    :cond_0
    return v3
.end method

.method public k(Lo/cmo;)V
    .locals 6

    .line 576
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDebugInfo callback:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 578
    move-object v3, p1

    .line 580
    iget-object v0, p0, Lo/cna;->b:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aav;

    .line 582
    if-eqz v4, :cond_0

    .line 584
    :try_start_0
    new-instance v0, Lo/cng;

    invoke-direct {v0, v3}, Lo/cng;-><init>(Lo/cmo;)V

    invoke-interface {v4, v0}, Lo/aav;->b(Lo/aay;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 587
    goto :goto_0

    .line 585
    :catch_0
    move-exception v5

    .line 586
    const-string v0, "HealthOpenSDK_HSC"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDebugInfo : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 589
    :cond_0
    :goto_0
    return-void
.end method
