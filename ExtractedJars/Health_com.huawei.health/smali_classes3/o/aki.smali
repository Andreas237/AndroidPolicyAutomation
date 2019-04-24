.class public Lo/aki;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aki$e;,
        Lo/aki$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static volatile d:Lo/aki;


# instance fields
.field private b:Lo/ajm;

.field private c:Lo/aja;

.field private e:Landroid/content/Context;

.field private f:Lo/aki$c;

.field private i:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Lo/aki;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/aki;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    .line 53
    iput-object p1, p0, Lo/aki;->e:Landroid/content/Context;

    .line 54
    new-instance v0, Lo/aki$c;

    invoke-direct {v0, p0}, Lo/aki$c;-><init>(Lo/aki;)V

    iput-object v0, p0, Lo/aki;->f:Lo/aki$c;

    .line 55
    return-void
.end method

.method private a()V
    .locals 5

    .line 154
    invoke-virtual {p0}, Lo/aki;->d()V

    .line 155
    iget-object v0, p0, Lo/aki;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 156
    iget-object v0, p0, Lo/aki;->b:Lo/ajm;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lo/ajm;->onStatus(I)V

    .line 157
    invoke-virtual {p0}, Lo/aki;->d()V

    .line 158
    return-void

    .line 160
    :cond_0
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;-><init>()V

    .line 161
    iget-object v0, p0, Lo/aki;->c:Lo/aja;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/aki;->c:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    if-eqz v0, :cond_1

    .line 162
    iget-object v0, p0, Lo/aki;->c:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 163
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkOtaStatus device id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aki;->c:Lo/aja;

    iget-object v3, v3, Lo/aja;->c:Lo/aja$a;

    iget-object v3, v3, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 165
    :cond_1
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkOtaStatus device id is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void

    .line 168
    :goto_0
    const-string v0, "devOtaInfo"

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setSid(Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lo/aki;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/aki$5;

    invoke-direct {v1, p0}, Lo/aki$5;-><init>(Lo/aki;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V

    .line 208
    return-void
.end method

.method static synthetic a(Lo/aki;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lo/aki;->a()V

    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 33
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/aki;
    .locals 1

    .line 47
    sget-object v0, Lo/aki;->d:Lo/aki;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lo/aki;

    invoke-direct {v0, p0}, Lo/aki;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/aki;->d:Lo/aki;

    .line 50
    :cond_0
    sget-object v0, Lo/aki;->d:Lo/aki;

    return-object v0
.end method

.method static synthetic b(Lo/aki;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lo/aki;->e()V

    return-void
.end method

.method static synthetic c(Lo/aki;)Lo/aja;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/aki;->c:Lo/aja;

    return-object v0
.end method

.method static synthetic d(Lo/aki;)Lo/ajm;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/aki;->b:Lo/ajm;

    return-object v0
.end method

.method private declared-synchronized e()V
    .locals 5

    monitor-enter p0

    .line 88
    :try_start_0
    iget-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    .line 90
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Start the timer connected devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    new-instance v1, Lo/aki$e;

    invoke-direct {v1, p0}, Lo/aki$e;-><init>(Lo/aki;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method


# virtual methods
.method public b(Ljava/lang/String;Lo/ajm;)V
    .locals 4

    .line 139
    invoke-virtual {p0}, Lo/aki;->d()V

    .line 140
    invoke-virtual {p0}, Lo/aki;->c()V

    .line 141
    iput-object p2, p0, Lo/aki;->b:Lo/ajm;

    .line 142
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    check-cast v0, Lo/aja;

    iput-object v0, p0, Lo/aki;->c:Lo/aja;

    goto :goto_0

    .line 145
    :cond_0
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId is empty, can\'t get WiFiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_0
    iget-object v0, p0, Lo/aki;->f:Lo/aki$c;

    const/16 v1, 0x11

    const-wide/32 v2, 0x2bf20

    invoke-virtual {v0, v1, v2, v3}, Lo/aki$c;->sendEmptyMessageDelayed(IJ)Z

    .line 148
    invoke-direct {p0}, Lo/aki;->e()V

    .line 149
    return-void
.end method

.method public c()V
    .locals 2

    .line 107
    iget-object v0, p0, Lo/aki;->f:Lo/aki$c;

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lo/aki;->f:Lo/aki$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aki$c;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 110
    :cond_0
    invoke-virtual {p0}, Lo/aki;->d()V

    .line 111
    return-void
.end method

.method public c(Lo/ajm;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/aki;->b:Lo/ajm;

    .line 132
    return-void
.end method

.method public declared-synchronized d()V
    .locals 5

    monitor-enter p0

    .line 98
    :try_start_0
    iget-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aki;->i:Ljava/util/Timer;

    .line 101
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cancel the timer connected devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 103
    :cond_0
    sget-object v0, Lo/aki;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connection timer has been canceled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method
