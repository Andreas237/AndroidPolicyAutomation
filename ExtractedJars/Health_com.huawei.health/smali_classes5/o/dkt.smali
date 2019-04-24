.class public Lo/dkt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/djp;

.field private static c:Lo/djr;

.field private static d:Landroid/content/ServiceConnection;

.field private static e:Lo/djz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 143
    new-instance v0, Lo/dkt$1;

    invoke-direct {v0}, Lo/dkt$1;-><init>()V

    sput-object v0, Lo/dkt;->d:Landroid/content/ServiceConnection;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lo/djz;
    .locals 1

    .line 78
    sget-object v0, Lo/dkt;->e:Lo/djz;

    return-object v0
.end method

.method static synthetic a(Lo/djz;)V
    .locals 0

    .line 30
    invoke-static {p0}, Lo/dkt;->b(Lo/djz;)V

    return-void
.end method

.method static synthetic b()Lo/djr;
    .locals 1

    .line 30
    sget-object v0, Lo/dkt;->c:Lo/djr;

    return-object v0
.end method

.method private static b(Lo/djz;)V
    .locals 0

    .line 69
    sput-object p0, Lo/dkt;->e:Lo/djz;

    .line 70
    return-void
.end method

.method static synthetic c()Lo/djz;
    .locals 1

    .line 30
    sget-object v0, Lo/dkt;->e:Lo/djz;

    return-object v0
.end method

.method public static c(Lo/djr;)V
    .locals 5

    .line 91
    sput-object p0, Lo/dkt;->c:Lo/djr;

    .line 92
    sget-object v0, Lo/dkt;->e:Lo/djz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    :try_start_0
    sget-object v0, Lo/dkt;->e:Lo/djz;

    invoke-interface {v0, p0}, Lo/djz;->d(Lo/djr;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 95
    :catch_0
    move-exception v4

    .line 97
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException = "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :cond_0
    :goto_0
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 5

    .line 117
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 118
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "----bindService result is mConnection:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dkt;->d:Landroid/content/ServiceConnection;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v2, Lo/dkt;->d:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v4

    .line 121
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "----bindService result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :cond_0
    return-void
.end method

.method static synthetic e()Lo/djp;
    .locals 1

    .line 30
    sget-object v0, Lo/dkt;->a:Lo/djp;

    return-object v0
.end method

.method public static e(Lo/djp;)V
    .locals 0

    .line 108
    sput-object p0, Lo/dkt;->a:Lo/djp;

    .line 109
    return-void
.end method
