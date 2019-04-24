.class public abstract Lo/akw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Ljava/util/concurrent/Executor;


# instance fields
.field private b:Landroid/content/Context;

.field private d:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/akw;->e:Ljava/util/concurrent/Executor;

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akw;->b:Landroid/content/Context;

    .line 40
    new-instance v0, Lo/akw$2;

    invoke-direct {v0, p0}, Lo/akw$2;-><init>(Lo/akw;)V

    iput-object v0, p0, Lo/akw;->d:Landroid/content/BroadcastReceiver;

    .line 63
    iput-object p1, p0, Lo/akw;->b:Landroid/content/Context;

    .line 65
    iget-object v0, p0, Lo/akw;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v3

    .line 66
    iget-object v0, p0, Lo/akw;->d:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "DaemonService_LocalBroadcast"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 67
    return-void
.end method

.method static synthetic c()Ljava/util/concurrent/Executor;
    .locals 1

    .line 27
    sget-object v0, Lo/akw;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static e()Ljava/util/concurrent/Executor;
    .locals 1

    .line 71
    sget-object v0, Lo/akw;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method


# virtual methods
.method protected abstract e(I)Z
.end method
