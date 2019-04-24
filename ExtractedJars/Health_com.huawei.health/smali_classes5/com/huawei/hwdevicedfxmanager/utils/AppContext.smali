.class public final Lcom/huawei/hwdevicedfxmanager/utils/AppContext;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static context:Lcom/huawei/hwdevicedfxmanager/utils/AppContext;


# instance fields
.field private application:Landroid/app/Application;

.field private isAgreePrivacy:Z

.field private refreshHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;

    invoke-direct {v0}, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->context:Lcom/huawei/hwdevicedfxmanager/utils/AppContext;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->application:Landroid/app/Application;

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->isAgreePrivacy:Z

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->refreshHandler:Landroid/os/Handler;

    .line 39
    return-void
.end method

.method public static getInstance()Lcom/huawei/hwdevicedfxmanager/utils/AppContext;
    .locals 1

    .line 48
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->context:Lcom/huawei/hwdevicedfxmanager/utils/AppContext;

    return-object v0
.end method


# virtual methods
.method public getAgreePrivacy()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->isAgreePrivacy:Z

    return v0
.end method

.method public getApplication()Landroid/app/Application;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->application:Landroid/app/Application;

    return-object v0
.end method

.method public getRefreshHandler()Landroid/os/Handler;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->refreshHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public isNetOpen()Z
    .locals 4

    .line 79
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->application:Landroid/app/Application;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 80
    const/4 v3, 0x0

    .line 81
    if-eqz v2, :cond_0

    .line 83
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 85
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAgreePrivacy(Z)V
    .locals 0

    .line 93
    iput-boolean p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->isAgreePrivacy:Z

    .line 94
    return-void
.end method

.method public setApplication(Landroid/app/Application;)V
    .locals 0

    .line 57
    if-eqz p1, :cond_0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->application:Landroid/app/Application;

    .line 61
    :cond_0
    return-void
.end method

.method public setRefreshHandler(Landroid/os/Handler;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->refreshHandler:Landroid/os/Handler;

    .line 109
    return-void
.end method
