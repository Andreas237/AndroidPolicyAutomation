.class public abstract Lcom/huawei/hidatamanager/DataListenerService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hidatamanager/DataListenerService$MyHandler;,
        Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "DataListenerService"


# instance fields
.field private mHandler:Landroid/os/Handler;

.field private final mLock:Ljava/lang/Object;

.field protected mWrapper:Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mLock:Ljava/lang/Object;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mWrapper:Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hidatamanager/DataListenerService;)Ljava/lang/Object;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mLock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/hidatamanager/DataListenerService;)Landroid/os/Handler;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mHandler:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 2

    .line 50
    invoke-super {p0, p1}, Landroid/app/Service;->attachBaseContext(Landroid/content/Context;)V

    .line 51
    new-instance v0, Lcom/huawei/hidatamanager/DataListenerService$MyHandler;

    invoke-virtual {p0}, Lcom/huawei/hidatamanager/DataListenerService;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/hidatamanager/DataListenerService$MyHandler;-><init>(Lcom/huawei/hidatamanager/DataListenerService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mHandler:Landroid/os/Handler;

    .line 52
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 39
    const-string v0, "DataListenerService"

    const-string v1, "onBind"

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/util/LogUtils;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mWrapper:Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;

    invoke-direct {v0, p0}, Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;-><init>(Lcom/huawei/hidatamanager/DataListenerService;)V

    iput-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mWrapper:Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService;->mWrapper:Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;

    return-object v0
.end method

.method protected abstract onFeatureDataAdded(JJLjava/lang/String;)V
.end method
