.class public Lo/dky;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/dky;


# instance fields
.field private c:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>()V
    .locals 5

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Lo/dky$2;

    invoke-direct {v0, p0}, Lo/dky$2;-><init>(Lo/dky;)V

    iput-object v0, p0, Lo/dky;->c:Landroid/content/BroadcastReceiver;

    .line 40
    invoke-static {}, Lo/dkx;->a()V

    .line 43
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/dky;->c:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 45
    return-void
.end method

.method public static b()Lo/dky;
    .locals 2

    .line 33
    sget-object v0, Lo/dky;->d:Lo/dky;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 34
    new-instance v0, Lo/dky;

    invoke-direct {v0}, Lo/dky;-><init>()V

    sput-object v0, Lo/dky;->d:Lo/dky;

    .line 36
    :cond_0
    sget-object v0, Lo/dky;->d:Lo/dky;

    return-object v0
.end method


# virtual methods
.method public c([B)V
    .locals 4

    .line 80
    const-string v0, "HWFileServicesManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult()  message = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {}, Lo/dlb;->e()I

    move-result v0

    invoke-static {p1, v0}, Lo/dld;->d([BI)V

    .line 82
    return-void
.end method
