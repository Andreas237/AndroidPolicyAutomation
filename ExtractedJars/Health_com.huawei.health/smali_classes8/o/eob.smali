.class public Lo/eob;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eob$e;
    }
.end annotation


# static fields
.field private static s:Lo/eob;


# instance fields
.field private A:I

.field private B:Z

.field private final C:Landroid/content/BroadcastReceiver;

.field private D:Ljava/lang/Boolean;

.field private G:Landroid/os/HandlerThread;

.field private I:Landroid/os/Handler;

.field public a:Ljava/lang/String;

.field public b:Lcom/huawei/datatype/DataDeviceInfo;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field private final j:Landroid/content/BroadcastReceiver;

.field public k:I

.field private l:Lo/dde;

.field private m:Lo/dpb;

.field private n:Landroid/content/Context;

.field public o:I

.field p:Lo/djw$d;

.field private q:Lo/djg;

.field private r:Z

.field private t:Ljava/lang/String;

.field private u:I

.field private v:Lo/djw$d;

.field private w:Lo/djw$d;

.field private x:I

.field private y:Z

.field private z:Landroid/os/PowerManager$WakeLock;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lo/eob;->e:I

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->d:Ljava/lang/String;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->a:Ljava/lang/String;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->c:Ljava/lang/String;

    .line 100
    const/4 v0, -0x1

    iput v0, p0, Lo/eob;->k:I

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->h:Ljava/lang/String;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->t:Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->i:Ljava/lang/String;

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lo/eob;->g:Ljava/lang/String;

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lo/eob;->o:I

    .line 116
    const/4 v0, 0x2

    iput v0, p0, Lo/eob;->u:I

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eob;->r:Z

    .line 575
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eob;->y:Z

    .line 591
    new-instance v0, Lo/eob$9;

    invoke-direct {v0, p0}, Lo/eob$9;-><init>(Lo/eob;)V

    iput-object v0, p0, Lo/eob;->p:Lo/djw$d;

    .line 1079
    const/4 v0, 0x0

    iput v0, p0, Lo/eob;->x:I

    .line 1080
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->w:Lo/djw$d;

    .line 1098
    new-instance v0, Lo/eob$11;

    invoke-direct {v0, p0}, Lo/eob$11;-><init>(Lo/eob;)V

    iput-object v0, p0, Lo/eob;->v:Lo/djw$d;

    .line 1147
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    .line 1172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eob;->B:Z

    .line 1205
    new-instance v0, Lo/eob$3;

    invoke-direct {v0, p0}, Lo/eob$3;-><init>(Lo/eob;)V

    iput-object v0, p0, Lo/eob;->C:Landroid/content/BroadcastReceiver;

    .line 1282
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->D:Ljava/lang/Boolean;

    .line 1304
    new-instance v0, Lo/eob$5;

    invoke-direct {v0, p0}, Lo/eob$5;-><init>(Lo/eob;)V

    iput-object v0, p0, Lo/eob;->j:Landroid/content/BroadcastReceiver;

    .line 1342
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    .line 1344
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->G:Landroid/os/HandlerThread;

    .line 137
    iput-object p1, p0, Lo/eob;->n:Landroid/content/Context;

    .line 138
    const/4 v0, 0x0

    iput v0, p0, Lo/eob;->o:I

    .line 139
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->m:Lo/dpb;

    .line 140
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->l:Lo/dde;

    .line 141
    invoke-direct {p0}, Lo/eob;->E()V

    .line 143
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->e(Ljava/lang/Boolean;)V

    .line 144
    return-void
.end method

.method private A()V
    .locals 4

    .line 1231
    invoke-virtual {p0}, Lo/eob;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1232
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isBandShowing return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1233
    return-void

    .line 1235
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1236
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band new package is downloaded"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1237
    invoke-virtual {p0}, Lo/eob;->m()V

    .line 1238
    return-void

    .line 1240
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1241
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1242
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1243
    return-void

    .line 1246
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "wlan_auto_update"

    new-instance v2, Lo/eob$4;

    invoke-direct {v2, p0}, Lo/eob$4;-><init>(Lo/eob;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1271
    return-void
.end method

.method private B()V
    .locals 4

    .line 1165
    iget-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1166
    return-void

    .line 1168
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/PowerManager;

    .line 1169
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    .line 1170
    iget-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 1171
    return-void
.end method

.method private C()V
    .locals 5

    .line 1295
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unregisterConnectStateChangedBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1297
    :try_start_0
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/eob;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1302
    goto :goto_0

    .line 1298
    :catch_0
    move-exception v4

    .line 1299
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1302
    goto :goto_0

    .line 1300
    :catch_1
    move-exception v4

    .line 1301
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1303
    :goto_0
    return-void
.end method

.method private D()V
    .locals 4

    .line 1153
    iget-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1154
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeDone, release wacklock."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1155
    iget-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 1156
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->z:Landroid/os/PowerManager$WakeLock;

    .line 1158
    :cond_0
    return-void
.end method

.method private E()V
    .locals 2

    .line 1347
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "UpdateInteractors"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/eob;->G:Landroid/os/HandlerThread;

    .line 1348
    iget-object v0, p0, Lo/eob;->G:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 1349
    new-instance v0, Lo/eob$e;

    iget-object v1, p0, Lo/eob;->G:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/eob$e;-><init>(Lo/eob;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    .line 1350
    return-void
.end method

.method static synthetic a(Lo/eob;I)I
    .locals 0

    .line 86
    iput p1, p0, Lo/eob;->u:I

    return p1
.end method

.method static synthetic a(Lo/eob;)Lo/djg;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    return-object v0
.end method

.method static synthetic a(Lo/eob;Lo/djg;)Lo/djg;
    .locals 0

    .line 86
    iput-object p1, p0, Lo/eob;->q:Lo/djg;

    return-object p1
.end method

.method private a(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)Z"
        }
    .end annotation

    .line 785
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMessageExists enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 786
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 787
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMessageExists null == messageList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    const/4 v0, 0x0

    return v0

    .line 791
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 792
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device_ota"

    if-ne v0, v1, :cond_1

    .line 793
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMessageExists message exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 794
    const/4 v0, 0x1

    return v0

    .line 796
    :cond_1
    goto :goto_0

    .line 797
    :cond_2
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMessageExists message not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lo/eob;Ljava/util/List;)Z
    .locals 1

    .line 86
    invoke-direct {p0, p1}, Lo/eob;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/eob;)Lo/dpb;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    return-object v0
.end method

.method private b(Z)V
    .locals 8

    .line 802
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 803
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v4

    .line 805
    new-instance v5, Lo/fhd;

    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/fhd;-><init>(Landroid/content/Context;)V

    .line 806
    const-string v0, "device"

    const-string v1, "device_ota"

    invoke-virtual {v4, v0, v1}, Lo/eaa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 807
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "makeMessage, delete messageList, messageList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    const/4 v7, 0x0

    :goto_0
    :try_start_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 810
    if-nez p1, :cond_0

    .line 811
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eaa;->i(Ljava/lang/String;)Z

    .line 813
    :cond_0
    const v0, 0x133c913

    invoke-virtual {v5, v0}, Lo/fhd;->e(I)V

    .line 814
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelNotification device ota"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 809
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 818
    :cond_1
    goto :goto_1

    .line 816
    :catch_0
    move-exception v7

    .line 817
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 819
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/eob;Z)Z
    .locals 0

    .line 86
    iput-boolean p1, p0, Lo/eob;->y:Z

    return p1
.end method

.method static synthetic c(Lo/eob;)Landroid/content/Context;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/eob;
    .locals 4

    .line 147
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance,instance-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/eob;->s:Lo/eob;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    sget-object v0, Lo/eob;->s:Lo/eob;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 149
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new UpdateInteractors()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    new-instance v0, Lo/eob;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eob;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/eob;->s:Lo/eob;

    .line 152
    :cond_0
    sget-object v0, Lo/eob;->s:Lo/eob;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 713
    invoke-virtual {p0}, Lo/eob;->l()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 714
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v3

    .line 715
    const-string v0, "device"

    const-string v1, "device_ota"

    new-instance v2, Lo/eob$6;

    invoke-direct {v2, p0, v3, p1}, Lo/eob$6;-><init>(Lo/eob;Lo/eaa;I)V

    invoke-virtual {v3, v0, v1, v2}, Lo/eaa;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 782
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4

    .line 586
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter startTransferOtaFile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    iget-object v1, p0, Lo/eob;->p:Lo/djw$d;

    invoke-virtual {v0, p1, p3, p2, v1}, Lo/djg;->c(Ljava/lang/String;ILjava/lang/String;Lo/djw;)V

    .line 588
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eob;->y:Z

    .line 589
    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 6

    .line 1024
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1025
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1026
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceActivated ,\u672c\u5730\u6ca1\u6709"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    const/4 v0, 0x0

    return v0

    .line 1030
    :cond_1
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/DataDeviceInfo;

    .line 1031
    const-string v0, "true"

    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_emmc_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 1033
    :catch_0
    move-exception v5

    .line 1034
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setActivateDevice  json exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceActivated ,\u672c\u5730\u672a\u6fc0\u6d3b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1037
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/eob;I)I
    .locals 0

    .line 86
    iput p1, p0, Lo/eob;->x:I

    return p1
.end method

.method private d(Ljava/util/Map;)Lcom/huawei/datatype/DataDeviceInfo;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lcom/huawei/datatype/DataDeviceInfo;"
        }
    .end annotation

    .line 1046
    const/4 v5, 0x0

    .line 1047
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v1, 0x9

    if-le v0, v1, :cond_3

    .line 1048
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1049
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 1050
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1051
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 1052
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/datatype/DataDeviceInfo;

    .line 1053
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    const-string v0, "false"

    invoke-virtual {v9}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_emmc_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1054
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1056
    :cond_0
    goto :goto_0

    .line 1057
    :cond_1
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;)I

    .line 1059
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 1060
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1061
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 1062
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/DataDeviceInfo;

    .line 1063
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1064
    goto :goto_1

    .line 1065
    :cond_2
    goto/16 :goto_3

    .line 1066
    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 1067
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1068
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 1069
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/DataDeviceInfo;

    .line 1070
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    const-string v0, "false"

    invoke-virtual {v8}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_emmc_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1071
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivatedDevice  ,device---="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v8}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_bt_mac()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1072
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/DataDeviceInfo;

    .line 1074
    :cond_4
    goto/16 :goto_2

    .line 1076
    :cond_5
    :goto_3
    return-object v5
.end method

.method static synthetic d(Lo/eob;)Lo/dde;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    return-object v0
.end method

.method static synthetic e(Lo/eob;I)I
    .locals 0

    .line 86
    iput p1, p0, Lo/eob;->A:I

    return p1
.end method

.method static synthetic e(Lo/eob;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 86
    iput-object p1, p0, Lo/eob;->t:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lo/eob;Lo/dde;)Lo/dde;
    .locals 0

    .line 86
    iput-object p1, p0, Lo/eob;->l:Lo/dde;

    return-object p1
.end method

.method static synthetic e(Lo/eob;Lo/dpb;)Lo/dpb;
    .locals 0

    .line 86
    iput-object p1, p0, Lo/eob;->m:Lo/dpb;

    return-object p1
.end method

.method static synthetic e(Lo/eob;)Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lo/eob;->r:Z

    return v0
.end method

.method static synthetic f(Lo/eob;)Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lo/eob;->y:Z

    return v0
.end method

.method static synthetic g(Lo/eob;)I
    .locals 1

    .line 86
    iget v0, p0, Lo/eob;->u:I

    return v0
.end method

.method static synthetic h(Lo/eob;)Lo/djw$d;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->w:Lo/djw$d;

    return-object v0
.end method

.method static synthetic i(Lo/eob;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lo/eob;->D()V

    return-void
.end method

.method private j()V
    .locals 5

    .line 1288
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerConnectStateBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1289
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1290
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1291
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/eob;->j:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1292
    return-void
.end method

.method static synthetic k(Lo/eob;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lo/eob;->j()V

    return-void
.end method

.method static synthetic l(Lo/eob;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lo/eob;->C()V

    return-void
.end method

.method static synthetic m(Lo/eob;)Landroid/os/Handler;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic n(Lo/eob;)I
    .locals 1

    .line 86
    iget v0, p0, Lo/eob;->A:I

    return v0
.end method

.method static synthetic o(Lo/eob;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lo/eob;->A()V

    return-void
.end method

.method static synthetic p(Lo/eob;)Ljava/lang/Boolean;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/eob;->D:Ljava/lang/Boolean;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 242
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 243
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->m:Lo/dpb;

    .line 245
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter autoDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->D:Ljava/lang/Boolean;

    .line 247
    iget-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 248
    iget-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    const/16 v1, 0x1e

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 250
    :cond_1
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 251
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    iget-object v1, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/eob;->n:Landroid/content/Context;

    .line 252
    invoke-static {v2}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v2

    invoke-virtual {v2}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    .line 251
    invoke-virtual {v0, v1, v2}, Lo/dpb;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 254
    :cond_2
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current Device info is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    :goto_0
    return-void
.end method

.method public a(Lo/djw$d;)V
    .locals 5

    .line 1082
    iput-object p1, p0, Lo/eob;->w:Lo/djw$d;

    .line 1083
    iget v0, p0, Lo/eob;->x:I

    if-eqz v0, :cond_0

    .line 1085
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState,currentPercent:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eob;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1086
    iget v0, p0, Lo/eob;->x:I

    invoke-virtual {p1, v0}, Lo/djw$d;->b(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1089
    goto :goto_0

    .line 1087
    :catch_0
    move-exception v4

    .line 1088
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState,error:"

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

    .line 1091
    :cond_0
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 168
    iget-object v0, p0, Lo/eob;->i:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 169
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 172
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->l:Lo/dde;

    .line 174
    :cond_1
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    new-instance v1, Lo/eob$2;

    invoke-direct {v1, p0}, Lo/eob$2;-><init>(Lo/eob;)V

    invoke-virtual {v0, v1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 189
    return-void
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 1

    .line 705
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 706
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/eob;->c(I)V

    .line 708
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 898
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 899
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->m:Lo/dpb;

    .line 901
    :cond_0
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    invoke-virtual {v0, p1}, Lo/dpb;->c(Ljava/lang/String;)V

    .line 902
    return-void
.end method

.method public c()V
    .locals 4

    .line 197
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter autoCheckBandNewVersionService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 199
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->l:Lo/dde;

    .line 201
    :cond_0
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    new-instance v1, Lo/eob$1;

    invoke-direct {v1, p0}, Lo/eob$1;-><init>(Lo/eob;)V

    invoke-virtual {v0, v1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 231
    return-void
.end method

.method public c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 638
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is transfering :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/eob;->r:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    iget-boolean v0, p0, Lo/eob;->r:Z

    if-eqz v0, :cond_0

    .line 640
    return-void

    .line 642
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() mHWOTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob;->q:Lo/djg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_new_version_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 644
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    int-to-long v1, p2

    invoke-static {v0, v1, v2}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v5

    .line 645
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 646
    iput-object v6, p0, Lo/eob;->c:Ljava/lang/String;

    .line 647
    invoke-static {}, Lo/djg;->b()Lo/djg;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->q:Lo/djg;

    .line 648
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 649
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWOTABaseMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    return-void

    .line 652
    :cond_1
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() new mHWOTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob;->q:Lo/djg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    invoke-virtual {v0}, Lo/djg;->c()I

    move-result v0

    iput v0, p0, Lo/eob;->u:I

    .line 654
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() new mOtaType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eob;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    new-instance v1, Lo/eob$7;

    invoke-direct {v1, p0}, Lo/eob$7;-><init>(Lo/eob;)V

    invoke-virtual {v0, p1, v1}, Lo/djg;->a(Ljava/lang/String;Lo/djx;)V

    .line 681
    return-void
.end method

.method public c(Ljava/lang/String;ZZ)V
    .locals 7

    .line 967
    if-eqz p3, :cond_1

    .line 968
    iget-object v5, p0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    .line 969
    iget-object v0, p0, Lo/eob;->h:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_bt_mac(Ljava/lang/String;)V

    .line 970
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_bt_mac()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/eob;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 972
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setActivateDevice \u8bbe\u7f6e\u4e3a\u672a\u6fc0\u6d3b,mac= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_bt_mac()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    const-string v0, "false"

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_emmc_id(Ljava/lang/String;)V

    .line 974
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 975
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_bt_mac()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 974
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 977
    :cond_0
    goto/16 :goto_0

    .line 978
    :cond_1
    invoke-direct {p0, p1}, Lo/eob;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 980
    if-eqz p2, :cond_3

    .line 981
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setActivateDevice \u4fee\u6539\u4e3a\u6fc0\u6d3b macAddress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 982
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 984
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 985
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/DataDeviceInfo;

    .line 986
    const-string v0, "true"

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_emmc_id(Ljava/lang/String;)V

    .line 987
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, p1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 991
    :cond_2
    goto :goto_0

    .line 989
    :catch_0
    move-exception v6

    .line 990
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setActivateDevice  json exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    :cond_3
    :goto_0
    return-void
.end method

.method public c(J)Z
    .locals 8

    .line 372
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkMemory needSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    .line 374
    new-instance v5, Landroid/os/StatFs;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 375
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v2

    int-to-long v2, v2

    mul-long v6, v0, v2

    .line 376
    long-to-double v0, v6

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v0, v2

    double-to-long v6, v0

    .line 377
    cmp-long v0, v6, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Ljava/lang/Boolean;)V
    .locals 2

    .line 954
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 955
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/dpb;->a(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 957
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;ILjava/lang/String;Lo/djw$d;)V
    .locals 4

    .line 532
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() updateMode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() mHWOTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob;->q:Lo/djg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    invoke-static {}, Lo/djg;->b()Lo/djg;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->q:Lo/djg;

    .line 537
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 538
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is transfering "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/eob;->r:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eob;->e(Ljava/lang/Boolean;)V

    .line 540
    invoke-virtual {p0, p4}, Lo/eob;->a(Lo/djw$d;)V

    .line 541
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    iget-object v1, p0, Lo/eob;->v:Lo/djw$d;

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/djg;->c(Ljava/lang/String;ILjava/lang/String;Lo/djw;)V

    .line 542
    const/4 v0, 0x0

    iput v0, p0, Lo/eob;->x:I

    .line 544
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/eob;->h:Ljava/lang/String;

    iget-object v2, p0, Lo/eob;->t:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/dpb;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    invoke-direct {p0}, Lo/eob;->B()V

    goto :goto_0

    .line 548
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWOTABaseMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 120
    iget-boolean v0, p0, Lo/eob;->r:Z

    return v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 6

    .line 689
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOtaFileExist(): path = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 691
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOtaFileExist() error, file path is empty..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    const/4 v0, 0x0

    return v0

    .line 695
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 696
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    .line 697
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOtaFileExist: bExist = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    return v5
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 485
    const-string v2, ""

    .line 486
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 487
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 489
    :cond_0
    return-object v2
.end method

.method public e()V
    .locals 6

    .line 263
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 264
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->m:Lo/dpb;

    .line 266
    :cond_0
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 267
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->l:Lo/dde;

    .line 269
    :cond_1
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 271
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    invoke-virtual {v0}, Lo/dpb;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->i:Ljava/lang/String;

    .line 272
    iget-object v0, p0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 273
    iget-object v0, p0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lo/eob;->k:I

    .line 274
    iget-object v0, p0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->h:Ljava/lang/String;

    .line 275
    iget-object v0, p0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->t:Ljava/lang/String;

    .line 276
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eob;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " deviceSoftVersion: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deviceBtMac:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/eob;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    :cond_2
    iget v0, p0, Lo/eob;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/eob;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 281
    :cond_3
    new-instance v5, Landroid/content/Intent;

    const-string v0, "action_app_check_new_version_state"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 282
    const/high16 v0, 0x60000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 283
    const-string v0, "result"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 284
    const-string v0, "state"

    const/16 v1, 0xb

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 285
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 286
    goto :goto_0

    :cond_4
    iget-object v0, p0, Lo/eob;->i:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 287
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doManualCheckDeviceNewVersion,deviceSoftVersion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lo/eob;->l:Lo/dde;

    new-instance v1, Lo/eob$10;

    invoke-direct {v1, p0}, Lo/eob$10;-><init>(Lo/eob;)V

    invoke-virtual {v0, v1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 310
    :cond_5
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    iget v1, p0, Lo/eob;->k:I

    iget-object v2, p0, Lo/eob;->i:Ljava/lang/String;

    iget-object v3, p0, Lo/eob;->h:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dpb;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 312
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Boolean;)V
    .locals 4

    .line 123
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter setIsTransfer"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/eob;->r:Z

    .line 125
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->e(Ljava/lang/Boolean;)V

    .line 126
    return-void
.end method

.method public e(Z)V
    .locals 4

    .line 824
    invoke-direct {p0, p1}, Lo/eob;->b(Z)V

    .line 825
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage  ture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 5

    .line 344
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBandCheckNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const-string v4, ""

    .line 346
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 347
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->f()Ljava/lang/String;

    move-result-object v4

    .line 349
    :cond_0
    return-object v4
.end method

.method public g()Ljava/lang/String;
    .locals 5

    .line 358
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBandStorePath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    const-string v4, ""

    .line 360
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 361
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->h()Ljava/lang/String;

    move-result-object v4

    .line 363
    :cond_0
    return-object v4
.end method

.method public h()V
    .locals 4

    .line 319
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doDownloadAppFile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 321
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->c(Ljava/lang/Boolean;)V

    .line 323
    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    .line 331
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelDownloadApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 333
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->b()V

    .line 335
    :cond_0
    return-void
.end method

.method public k()Z
    .locals 6

    .line 386
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWifiConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 388
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 389
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 390
    const/4 v0, 0x1

    return v0

    .line 392
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 510
    const/4 v5, 0x0

    .line 511
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 512
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 514
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 515
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lo/eob;->k:I

    .line 516
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->g:Ljava/lang/String;

    .line 517
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->h:Ljava/lang/String;

    .line 518
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->t:Ljava/lang/String;

    .line 519
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eob;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() mDeviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceBtMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/eob;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    :cond_1
    return-object v5
.end method

.method public m()V
    .locals 7

    .line 557
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter startAutoTransfer :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/eob;->r:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    invoke-virtual {p0}, Lo/eob;->f()Ljava/lang/String;

    move-result-object v4

    .line 559
    const/4 v5, 0x2

    .line 560
    invoke-virtual {p0}, Lo/eob;->g()Ljava/lang/String;

    move-result-object v6

    .line 561
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() updateMode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    invoke-static {}, Lo/djg;->b()Lo/djg;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->q:Lo/djg;

    .line 565
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 566
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWOTABaseMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    return-void

    .line 569
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() new mHWOTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob;->q:Lo/djg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    iget-object v0, p0, Lo/eob;->q:Lo/djg;

    invoke-virtual {v0}, Lo/djg;->c()I

    move-result v0

    iput v0, p0, Lo/eob;->u:I

    .line 571
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() new mOtaType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eob;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    invoke-direct {p0, v4, v6, v5}, Lo/eob;->c(Ljava/lang/String;Ljava/lang/String;I)V

    .line 573
    return-void
.end method

.method public n()V
    .locals 1

    .line 710
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/eob;->c(I)V

    .line 711
    return-void
.end method

.method public o()Z
    .locals 4

    .line 401
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const-string v1, "connectivity"

    .line 402
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 403
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 404
    if-eqz v3, :cond_0

    .line 405
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_0

    .line 406
    const/4 v0, 0x1

    return v0

    .line 408
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public p()V
    .locals 3

    .line 416
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "wlan_auto_update"

    new-instance v2, Lo/eob$8;

    invoke-direct {v2, p0}, Lo/eob$8;-><init>(Lo/eob;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 477
    return-void
.end method

.method public q()V
    .locals 5

    .line 843
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUpdateInteractors "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 846
    new-instance v0, Lo/eob$15;

    invoke-direct {v0, p0}, Lo/eob$15;-><init>(Lo/eob;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 852
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 853
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->m()V

    .line 855
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eob;->o:I

    .line 869
    return-void
.end method

.method public r()V
    .locals 2

    .line 946
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 947
    return-void
.end method

.method public s()Z
    .locals 6

    .line 931
    const/4 v4, 0x0

    .line 932
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v5

    .line 933
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 934
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceConfigManager.getCurrentDeviceInfo() is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    const/4 v0, 0x0

    return v0

    .line 937
    :cond_1
    invoke-virtual {v5}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_2

    .line 938
    const/4 v4, 0x1

    .line 940
    :cond_2
    return v4
.end method

.method public t()Z
    .locals 8

    .line 907
    const/4 v4, 0x0

    .line 908
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/app/ActivityManager;

    .line 909
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v6

    .line 910
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 911
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 913
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 915
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.ui.device.activity.update.BandUpdateDialogActivity"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 916
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.ui.device.activity.update.UpdateVersionActivity"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 917
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.ui.device.activity.update.DeviceOtaActivity"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 918
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "band is showing ,current activity  :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v3, v3, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v3}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    const/4 v0, 0x1

    return v0

    .line 911
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 924
    :cond_2
    return v4
.end method

.method public u()V
    .locals 4

    .line 833
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/eob;->b(Z)V

    .line 834
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage  false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    return-void
.end method

.method public v()V
    .locals 5

    .line 1177
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerWifiBroadcast()! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/eob;->B:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    iget-boolean v0, p0, Lo/eob;->B:Z

    if-nez v0, :cond_0

    .line 1179
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 1181
    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1182
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/eob;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1183
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eob;->B:Z

    .line 1185
    :cond_0
    return-void
.end method

.method public w()V
    .locals 2

    .line 1277
    iget-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1278
    iget-object v0, p0, Lo/eob;->I:Landroid/os/Handler;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1280
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->D:Ljava/lang/Boolean;

    .line 1281
    return-void
.end method

.method public x()V
    .locals 1

    .line 1093
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eob;->w:Lo/djw$d;

    .line 1094
    return-void
.end method

.method public y()V
    .locals 6

    .line 1001
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activateDevice enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    const/16 v1, 0x3f9

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dct;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 1004
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1005
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activateDevice.getAllSharedPreferencesById() is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    return-void

    .line 1008
    :cond_0
    invoke-direct {p0, v4}, Lo/eob;->d(Ljava/util/Map;)Lcom/huawei/datatype/DataDeviceInfo;

    move-result-object v5

    .line 1009
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 1010
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1011
    iget-object v0, p0, Lo/eob;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lo/eob;->m:Lo/dpb;

    .line 1013
    :cond_1
    iget-object v0, p0, Lo/eob;->m:Lo/dpb;

    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v1

    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_bt_mac()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/dpb;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1016
    :cond_2
    return-void
.end method

.method public z()V
    .locals 5

    .line 1190
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter unregisterWifiBroadcast()! isRegistWifi:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/eob;->B:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1191
    iget-boolean v0, p0, Lo/eob;->B:Z

    if-eqz v0, :cond_0

    .line 1193
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/eob;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1198
    goto :goto_0

    .line 1194
    :catch_0
    move-exception v4

    .line 1195
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1198
    goto :goto_0

    .line 1196
    :catch_1
    move-exception v4

    .line 1197
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1199
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eob;->B:Z

    .line 1201
    :cond_0
    return-void
.end method
