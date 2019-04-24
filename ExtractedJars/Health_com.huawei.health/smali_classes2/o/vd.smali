.class public Lo/vd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/vd;

.field private static d:Ljava/lang/String;


# instance fields
.field private b:Lo/vh;

.field private c:Landroid/content/Context;

.field private e:Lcom/huawei/account/aidl/AccountAidlInfo;

.field private h:Landroid/content/ServiceConnection;

.field private i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-string v0, "PLGLOGIN_AccountAidlClient"

    sput-object v0, Lo/vd;->d:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vd;->i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 110
    new-instance v0, Lo/vd$1;

    invoke-direct {v0, p0}, Lo/vd$1;-><init>(Lo/vd;)V

    iput-object v0, p0, Lo/vd;->h:Landroid/content/ServiceConnection;

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/vd;->c:Landroid/content/Context;

    .line 31
    return-void
.end method

.method static synthetic a(Lo/vd;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 0

    .line 21
    iput-object p1, p0, Lo/vd;->i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object p1
.end method

.method static synthetic b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/vd;->i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic c(Lo/vd;)Lo/vh;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/vd;->b:Lo/vh;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 21
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/vd;
    .locals 1

    .line 34
    sget-object v0, Lo/vd;->a:Lo/vd;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lo/vd;

    invoke-direct {v0, p0}, Lo/vd;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/vd;->a:Lo/vd;

    .line 37
    :cond_0
    sget-object v0, Lo/vd;->a:Lo/vd;

    return-object v0
.end method

.method static synthetic e(Lo/vd;Lo/vh;)Lo/vh;
    .locals 0

    .line 21
    iput-object p1, p0, Lo/vd;->b:Lo/vh;

    return-object p1
.end method


# virtual methods
.method public b()Lcom/huawei/account/aidl/AccountAidlInfo;
    .locals 5

    .line 71
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter  getRemoteInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :try_start_0
    iget-object v0, p0, Lo/vd;->b:Lo/vh;

    if-nez v0, :cond_0

    .line 74
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRemoteInfo accountAidlInterface == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    const/4 v0, 0x0

    return-object v0

    .line 77
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/vd;->b:Lo/vh;

    invoke-interface {v0}, Lo/vh;->a()Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v0

    iput-object v0, p0, Lo/vd;->e:Lcom/huawei/account/aidl/AccountAidlInfo;

    .line 78
    iget-object v0, p0, Lo/vd;->e:Lcom/huawei/account/aidl/AccountAidlInfo;

    if-eqz v0, :cond_1

    .line 79
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountinfo get remote info success "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountinfo get remote info success accountAidlInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/vd;->e:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v3}, Lcom/huawei/account/aidl/AccountAidlInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lo/vd;->e:Lcom/huawei/account/aidl/AccountAidlInfo;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 83
    :cond_1
    :try_start_2
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountinfo = null,get remote info failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 84
    const/4 v0, 0x0

    return-object v0

    .line 86
    :catch_0
    move-exception v4

    .line 87
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException ERROR:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RemoteException ERROR:1111"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()V
    .locals 5

    .line 97
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter  getRemoteInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    :try_start_0
    iget-object v0, p0, Lo/vd;->b:Lo/vh;

    if-nez v0, :cond_0

    .line 100
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRemoteInfo accountAidlInterface == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    return-void

    .line 103
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/vd;->b:Lo/vh;

    invoke-interface {v0}, Lo/vh;->b()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    goto :goto_0

    .line 104
    :catch_0
    move-exception v4

    .line 105
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException ERROR:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RemoteException ERROR:2222"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 41
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter bindRemoteService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.remote.accountaidlservice"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lo/vd;->i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 44
    const-string v0, "com.huawei.bone"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget-object v0, p0, Lo/vd;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/vd;->h:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 49
    const-string v0, "bindService error"

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 51
    :cond_0
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback id null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vd;->i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 55
    :cond_1
    iget-object v0, p0, Lo/vd;->b:Lo/vh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 56
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 57
    const-string v0, "accountAidlInterface is not null"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 59
    :cond_2
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback id null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vd;->i:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 63
    :cond_3
    sget-object v0, Lo/vd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindresult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-void
.end method
