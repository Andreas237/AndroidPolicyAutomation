.class public Lo/vn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/vn$d;
    }
.end annotation


# static fields
.field private static a:Lo/vo;


# instance fields
.field private b:Landroid/content/Context;

.field c:Landroid/content/ServiceConnection;

.field private d:Lo/vn;

.field private e:Lo/vq;

.field private final f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<Lo/vp;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/Object;

.field private final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private final i:Lo/vn$d;

.field private final k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lo/vp;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/vn;->a:Lo/vo;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/vq;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vn;->d:Lo/vn;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vn;->e:Lo/vq;

    .line 50
    new-instance v0, Lo/vn$5;

    invoke-direct {v0, p0}, Lo/vn$5;-><init>(Lo/vn;)V

    iput-object v0, p0, Lo/vn;->c:Landroid/content/ServiceConnection;

    .line 227
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo/vn;->f:Ljava/util/HashSet;

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/vn;->h:Ljava/util/ArrayList;

    .line 229
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/vn;->k:Ljava/util/HashMap;

    .line 232
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/vn;->g:Ljava/lang/Object;

    .line 233
    new-instance v0, Lo/vn$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/vn$d;-><init>(Lo/vn;Lo/vn$5;)V

    iput-object v0, p0, Lo/vn;->i:Lo/vn$d;

    .line 33
    iput-object p0, p0, Lo/vn;->d:Lo/vn;

    .line 34
    iput-object p2, p0, Lo/vn;->e:Lo/vq;

    .line 35
    iput-object p1, p0, Lo/vn;->b:Landroid/content/Context;

    .line 36
    invoke-direct {p0}, Lo/vn;->e()Z

    .line 37
    return-void
.end method

.method static synthetic a(Lo/vn;)Ljava/util/HashSet;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/vn;->f:Ljava/util/HashSet;

    return-object v0
.end method

.method static synthetic a(Lo/vo;)Lo/vo;
    .locals 0

    .line 24
    sput-object p0, Lo/vn;->a:Lo/vo;

    return-object p0
.end method

.method static synthetic b(Lo/vn;)Lo/vn;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/vn;->d:Lo/vn;

    return-object v0
.end method

.method static synthetic c(Lo/vn;)Ljava/util/HashMap;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/vn;->k:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic d()Lo/vo;
    .locals 1

    .line 24
    sget-object v0, Lo/vn;->a:Lo/vo;

    return-object v0
.end method

.method static synthetic d(Lo/vn;)Lo/vq;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/vn;->e:Lo/vq;

    return-object v0
.end method

.method private e(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 9

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 77
    const/4 v0, 0x0

    invoke-virtual {v3, p2, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v4

    .line 79
    const-string v5, "com.huawei.powergenie"

    .line 80
    const-string v6, "com.huawei.android.powerkit.PowerKitService"

    .line 83
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 84
    :cond_0
    const-string v0, "PowerKitApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not only one match for intent: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 87
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/content/pm/ResolveInfo;

    .line 88
    iget-object v0, v8, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v5, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 89
    iget-object v0, v8, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v6, v0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 92
    :goto_0
    new-instance v7, Landroid/content/ComponentName;

    invoke-direct {v7, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "PowerKitApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "match for intent,  packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " className:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 98
    invoke-virtual {v8, v7}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 99
    return-object v8
.end method

.method static synthetic e(Lo/vn;)Ljava/lang/Object;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/vn;->g:Ljava/lang/Object;

    return-object v0
.end method

.method private e()Z
    .locals 5

    .line 44
    iget-object v0, p0, Lo/vn;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.huawei.android.powerkit.PowerKitService"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lo/vn;->e(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v3

    .line 45
    iget-object v0, p0, Lo/vn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/vn;->c:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v4

    .line 46
    const-string v0, "PowerKitApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bind powerkit service, ret = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    return v4
.end method


# virtual methods
.method public binderDied()V
    .locals 6

    .line 295
    const-string v0, "PowerKitApi"

    const-string v1, "powerkit process binder was died and connecting ..."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 296
    const/4 v0, 0x0

    sput-object v0, Lo/vn;->a:Lo/vo;

    .line 298
    const/4 v4, 0x5

    .line 299
    :goto_0
    if-lez v4, :cond_1

    .line 300
    add-int/lit8 v4, v4, -0x1

    .line 301
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide v2, 0x409f400000000000L    # 2000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    add-int/lit16 v5, v0, 0x3e8

    .line 302
    int-to-long v0, v5

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 303
    invoke-direct {p0}, Lo/vn;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    goto :goto_1

    .line 306
    :cond_0
    goto :goto_0

    .line 307
    :cond_1
    :goto_1
    return-void
.end method

.method public c(Landroid/content/Context;ZLjava/lang/String;IJLjava/lang/String;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 154
    sget-object v0, Lo/vn;->a:Lo/vo;

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Landroid/os/RemoteException;

    const-string v1, "PowerKit server is not found"

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 157
    :cond_0
    sget-object v0, Lo/vn;->a:Lo/vo;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-wide v5, p5

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lo/vo;->d(Ljava/lang/String;ZLjava/lang/String;IJLjava/lang/String;)Z

    move-result v0

    return v0
.end method
