.class public Lo/cym;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyn;
.implements Lcom/google/android/gms/wearable/DataApi$DataListener;
.implements Lcom/google/android/gms/wearable/MessageApi$MessageListener;
.implements Lcom/google/android/gms/wearable/NodeApi$NodeListener;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.implements Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cym$d;,
        Lo/cym$b;,
        Lo/cym$a;
    }
.end annotation


# static fields
.field private static n:Ljava/lang/String;

.field private static o:Ljava/lang/String;

.field private static r:Lo/cym;


# instance fields
.field private a:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private c:Lo/cym$a;

.field private d:Lo/cym$b;

.field private e:Landroid/content/Context;

.field private f:Lo/cxx;

.field private g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private h:Lcom/google/android/gms/wearable/Node;

.field private i:I

.field private k:Landroid/os/HandlerThread;

.field private l:Lo/cym$d;

.field private m:I

.field private p:I

.field private q:Landroid/os/Handler;

.field private u:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 157
    const-string v0, "health_watch_message"

    sput-object v0, Lo/cym;->n:Ljava/lang/String;

    .line 158
    const-string v0, "health_watch_file"

    sput-object v0, Lo/cym;->o:Ljava/lang/String;

    .line 160
    const/4 v0, 0x0

    sput-object v0, Lo/cym;->r:Lo/cym;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->d:Lo/cym$b;

    .line 122
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    iput-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->f:Lo/cxx;

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 136
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    .line 138
    const/4 v0, 0x0

    iput v0, p0, Lo/cym;->i:I

    .line 146
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BTDeviceAWService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cym;->k:Landroid/os/HandlerThread;

    .line 148
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->l:Lo/cym$d;

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lo/cym;->m:I

    .line 154
    const/4 v0, 0x0

    iput v0, p0, Lo/cym;->p:I

    .line 163
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BTDeviceAWServiceData"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cym;->u:Landroid/os/HandlerThread;

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->q:Landroid/os/Handler;

    .line 211
    iget-object v0, p0, Lo/cym;->k:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 212
    new-instance v0, Lo/cym$d;

    iget-object v1, p0, Lo/cym;->k:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cym$d;-><init>(Lo/cym;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cym;->l:Lo/cym$d;

    .line 213
    iget-object v0, p0, Lo/cym;->u:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 214
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/cym;->u:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cym;->q:Landroid/os/Handler;

    .line 215
    return-void
.end method

.method static synthetic b(Lo/cym;)I
    .locals 1

    .line 80
    iget v0, p0, Lo/cym;->i:I

    return v0
.end method

.method public static b()Lo/cym;
    .locals 2

    .line 168
    sget-object v0, Lo/cym;->r:Lo/cym;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 169
    new-instance v0, Lo/cym;

    invoke-direct {v0}, Lo/cym;-><init>()V

    sput-object v0, Lo/cym;->r:Lo/cym;

    .line 171
    :cond_0
    sget-object v0, Lo/cym;->r:Lo/cym;

    return-object v0
.end method

.method private static c([B)Lcom/google/android/gms/wearable/Asset;
    .locals 1

    .line 1101
    invoke-static {p0}, Lcom/google/android/gms/wearable/Asset;->createFromBytes([B)Lcom/google/android/gms/wearable/Asset;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/cym;Lcom/google/android/gms/wearable/Node;)Lcom/google/android/gms/wearable/Node;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    return-object p1
.end method

.method static synthetic c(Lo/cym;)Ljava/util/Collection;
    .locals 1

    .line 80
    invoke-direct {p0}, Lo/cym;->g()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized c(I)V
    .locals 5

    monitor-enter p0

    .line 965
    :try_start_0
    iget-object v0, p0, Lo/cym;->f:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 966
    iget v0, p0, Lo/cym;->i:I

    if-ne p1, v0, :cond_0

    .line 967
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reportConnectState , status not changed = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 968
    monitor-exit p0

    return-void

    .line 970
    :cond_0
    iput p1, p0, Lo/cym;->i:I

    .line 971
    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    if-eq p1, v0, :cond_4

    .line 974
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 975
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/Node;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cym;->c(Ljava/lang/String;)V

    .line 978
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reportConnectState , awConnectState = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";add:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 980
    const/4 v0, 0x2

    if-eq v0, p1, :cond_2

    .line 981
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "clear path extend num and current channel flag."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 982
    const/4 v0, 0x0

    iput v0, p0, Lo/cym;->m:I

    .line 983
    const/4 v0, 0x0

    iput v0, p0, Lo/cym;->p:I

    .line 986
    :cond_2
    iget-object v0, p0, Lo/cym;->f:Lo/cxx;

    iget-object v1, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-interface {v0, v1, p1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto :goto_0

    .line 989
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "reportConnectState error with mBTDeviceStateCallback is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 991
    :cond_4
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c(Ljava/lang/String;)V
    .locals 5

    .line 999
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setName , AndroidWear name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1002
    const-string v0, "HUAWEI"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1003
    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->configureDeviceName(Ljava/lang/String;)V

    goto :goto_0

    .line 1005
    :cond_0
    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const-string v1, "HUAWEI WATCH"

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->configureDeviceName(Ljava/lang/String;)V

    .line 1008
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/cym;I)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lo/cym;->c(I)V

    return-void
.end method

.method static synthetic d(Lo/cym;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method static synthetic e(Lo/cym;)Lcom/google/android/gms/wearable/Node;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 681
    sget-object v0, Lcom/google/android/gms/wearable/Wearable;->CapabilityApi:Lcom/google/android/gms/wearable/CapabilityApi;

    iget-object v1, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v2, 0x1

    invoke-interface {v0, v1, p1, v2}, Lcom/google/android/gms/wearable/CapabilityApi;->getCapability(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/wearable/CapabilityApi$GetCapabilityResult;

    .line 682
    invoke-interface {v6}, Lcom/google/android/gms/wearable/CapabilityApi$GetCapabilityResult;->getCapability()Lcom/google/android/gms/wearable/CapabilityInfo;

    move-result-object v7

    .line 684
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 685
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getNodeId GetCapabilityResult info is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 686
    const-string v0, ""

    return-object v0

    .line 688
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initConnectStatus CapabilityInfo = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 690
    invoke-interface {v7}, Lcom/google/android/gms/wearable/CapabilityInfo;->getNodes()Ljava/util/Set;

    move-result-object v8

    .line 691
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 692
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getNodeId GetCapabilityResult info.getNodes() is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 693
    const-string v0, ""

    return-object v0

    .line 696
    :cond_1
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 697
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getNodeId GetCapabilityResult list is empty"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 698
    const-string v0, ""

    return-object v0

    .line 701
    :cond_2
    const/4 v9, 0x0

    .line 702
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getNodeId CapabilityInfo count\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 703
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/google/android/gms/wearable/Node;

    .line 704
    invoke-interface {v11}, Lcom/google/android/gms/wearable/Node;->isNearby()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 705
    invoke-interface {v11}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v9

    .line 706
    goto :goto_1

    .line 709
    :cond_3
    invoke-interface {v11}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v9

    .line 710
    goto :goto_0

    .line 711
    :cond_4
    :goto_1
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getNodeId CapabilityInfo node name:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " node Id:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 712
    return-object v9
.end method

.method static synthetic e(Lo/cym;Lo/cym$b;)Lo/cym$b;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cym;->d:Lo/cym$b;

    return-object p1
.end method

.method public static e(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;)Lo/cym;
    .locals 3

    .line 175
    invoke-static {}, Lo/cym;->b()Lo/cym;

    move-result-object v2

    .line 176
    iput-object p0, v2, Lo/cym;->e:Landroid/content/Context;

    .line 177
    iput-object p2, v2, Lo/cym;->f:Lo/cxx;

    .line 178
    iget-object v0, v2, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 179
    iget-object v0, v2, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const-string v1, "AndroidWear"

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->configureDeviceIdentify(Ljava/lang/String;)V

    .line 180
    iget-object v0, v2, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const-string v1, "HUAWEI WATCH"

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->configureDeviceName(Ljava/lang/String;)V

    .line 182
    iget-object v0, v2, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->configureDeviceBTType(I)V

    .line 184
    :cond_0
    sget-object v0, Lo/cym;->r:Lo/cym;

    return-object v0
.end method

.method private e([B)V
    .locals 5

    .line 1188
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendV1CheckCommand()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x6

    if-le v0, v1, :cond_0

    .line 1190
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x5

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1191
    iget-object v0, p0, Lo/cym;->l:Lo/cym$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1193
    iget-object v0, p0, Lo/cym;->l:Lo/cym$d;

    const/4 v1, 0x1

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Lo/cym$d;->sendEmptyMessageDelayed(IJ)Z

    .line 1197
    :cond_0
    return-void
.end method

.method private g()Ljava/util/Collection;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lcom/google/android/gms/wearable/Node;>;"
        }
    .end annotation

    .line 720
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 721
    sget-object v0, Lcom/google/android/gms/wearable/Wearable;->NodeApi:Lcom/google/android/gms/wearable/NodeApi;

    iget-object v1, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 722
    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/NodeApi;->getConnectedNodes(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;

    .line 724
    invoke-interface {v6}, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;->getNodes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/wearable/Node;

    .line 725
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getNodes() already found watch\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v8}, Lcom/google/android/gms/wearable/Node;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",ID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v8}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 726
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 727
    goto :goto_0

    .line 729
    :cond_0
    return-object v5
.end method

.method private i()V
    .locals 4

    .line 391
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Enter connectedSuccess"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    iget-object v0, p0, Lo/cym;->d:Lo/cym$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 424
    new-instance v0, Lo/cym$b;

    invoke-direct {v0, p0}, Lo/cym$b;-><init>(Lo/cym;)V

    iput-object v0, p0, Lo/cym;->d:Lo/cym$b;

    .line 425
    iget-object v0, p0, Lo/cym;->d:Lo/cym$b;

    invoke-virtual {v0}, Lo/cym$b;->start()V

    .line 427
    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    .line 956
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "connectionLost() called"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 957
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->d:Lo/cym$b;

    .line 958
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    .line 959
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 433
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "start to disconnect."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    invoke-virtual {p0}, Lo/cym;->d()V

    .line 437
    invoke-direct {p0}, Lo/cym;->k()V

    .line 438
    return-void
.end method

.method public a(I)V
    .locals 5

    .line 1255
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setPathExtendNum with pathExtendNum = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1256
    iput p1, p0, Lo/cym;->m:I

    .line 1257
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1106
    iput-object p1, p0, Lo/cym;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1107
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 11

    .line 1073
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceAssetData,assetpath = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    const-string v6, "/mobile_response_asset"

    .line 1078
    const-string v7, "mobile_response_asset"

    .line 1079
    const-string v8, "mobile_response_asset_name"

    .line 1081
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceAssetData,path = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " ; key : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceAssetData,assetpath = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1083
    invoke-static {p1}, Lo/dbf;->a(Ljava/lang/String;)[B

    move-result-object v9

    .line 1084
    invoke-static {v6}, Lcom/google/android/gms/wearable/PutDataMapRequest;->create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;

    move-result-object v10

    .line 1085
    invoke-virtual {v10}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    invoke-static {v9}, Lo/cym;->c([B)Lcom/google/android/gms/wearable/Asset;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Lcom/google/android/gms/wearable/DataMap;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V

    .line 1086
    invoke-virtual {v10}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    invoke-virtual {v0, v8, p1}, Lcom/google/android/gms/wearable/DataMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1088
    invoke-virtual {v10}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    const-string v1, "current_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/wearable/DataMap;->putLong(Ljava/lang/String;J)V

    .line 1089
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1090
    invoke-virtual {v10}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    const-string v1, "NODE"

    iget-object v2, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v2}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/wearable/DataMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1091
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "NODE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v4}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1094
    :cond_0
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "sendBTFilePath NODE = null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    :goto_0
    invoke-virtual {p0, v10}, Lo/cym;->c(Lcom/google/android/gms/wearable/PutDataMapRequest;)V

    .line 1097
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDK-->Device : Asset : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    return-void
.end method

.method public a([B)Z
    .locals 10

    .line 619
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceData, watch layer = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 620
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDK-->Device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 621
    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 622
    iget v0, p0, Lo/cym;->m:I

    if-lez v0, :cond_1

    .line 623
    iget v0, p0, Lo/cym;->p:I

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    iget v0, p0, Lo/cym;->p:I

    iget v1, p0, Lo/cym;->m:I

    add-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_0

    .line 625
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/mobile_response_data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cym;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 627
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cym;->p:I

    .line 628
    const-string v5, "/mobile_response_data"

    .line 632
    :goto_0
    const-string v6, "mobile_response_data"

    .line 634
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mCurrentChannel = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cym;->p:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 635
    iget v0, p0, Lo/cym;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cym;->p:I

    goto :goto_1

    .line 637
    :cond_1
    const-string v5, "/mobile_response_data"

    .line 638
    const-string v6, "mobile_response_data"

    goto :goto_1

    .line 641
    :cond_2
    const-string v5, "/phone"

    .line 642
    const-string v6, "byte"

    .line 644
    :goto_1
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceData,path = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 645
    invoke-static {v5}, Lcom/google/android/gms/wearable/PutDataMapRequest;->create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;

    move-result-object v7

    .line 648
    invoke-virtual {v7}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    invoke-virtual {v0, v6, p1}, Lcom/google/android/gms/wearable/DataMap;->putByteArray(Ljava/lang/String;[B)V

    .line 650
    invoke-virtual {v7}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    const-string v1, "current_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/wearable/DataMap;->putLong(Ljava/lang/String;J)V

    .line 651
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 652
    invoke-virtual {v7}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    const-string v1, "NODE"

    iget-object v2, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v2}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/wearable/DataMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " NODE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v4}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 655
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendBTDeviceData NODE = null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 659
    :goto_2
    sget-object v0, Lo/cym;->n:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/cym;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 660
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 661
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendBTDeviceData use dataLayer"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 662
    invoke-virtual {p0, v7}, Lo/cym;->c(Lcom/google/android/gms/wearable/PutDataMapRequest;)V

    goto :goto_3

    .line 664
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendBTDeviceData use messageApi"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 665
    sget-object v0, Lcom/google/android/gms/wearable/Wearable;->MessageApi:Lcom/google/android/gms/wearable/MessageApi;

    iget-object v1, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v8, v5, p1}, Lcom/google/android/gms/wearable/MessageApi;->sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v9

    .line 666
    invoke-virtual {p0, v9, v7}, Lo/cym;->c(Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/wearable/PutDataMapRequest;)V

    .line 670
    :goto_3
    invoke-direct {p0, p1}, Lo/cym;->e([B)V

    .line 672
    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 7

    .line 256
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter connectBTDevice() with device state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cym;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 258
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    .line 259
    return-void

    .line 261
    :cond_0
    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 262
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "connectBTDevice, now is connecting or connected"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 263
    return-void

    .line 265
    :cond_2
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->e(Landroid/content/Context;)V

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    .line 269
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    .line 274
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 275
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "blockingConnect mGoogleApiClient is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 294
    return-void

    .line 296
    :cond_3
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 319
    invoke-direct {p0}, Lo/cym;->i()V

    goto :goto_0

    .line 321
    :cond_4
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 322
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "GoogleApiClient isConnecting"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 327
    :cond_5
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 328
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.google.android.wearable.app.cn"

    const-string v2, "com.google.android.gms.wearable.service.WearableService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 329
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 330
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "started gms service"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 331
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 332
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "GoogleApiClient try connect"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 334
    :goto_0
    return-void
.end method

.method public c()V
    .locals 13

    .line 834
    const/4 v5, 0x0

    .line 836
    :try_start_0
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.bone"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 839
    goto :goto_0

    .line 837
    :catch_0
    move-exception v6

    .line 838
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "NameNotFoundException e= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 840
    :goto_0
    if-nez v5, :cond_0

    .line 841
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "packageInfo is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 842
    return-void

    .line 846
    :cond_0
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    const/4 v1, 0x0

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 847
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 848
    iget-object v0, v5, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 851
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v7

    .line 852
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/content/pm/ResolveInfo;

    .line 853
    if-eqz v8, :cond_1

    .line 855
    iget-object v0, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v9, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 857
    iget-object v0, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v10, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 859
    new-instance v11, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v11, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 860
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v11, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 861
    const/high16 v0, 0x10000000

    invoke-virtual {v11, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 864
    new-instance v12, Landroid/content/ComponentName;

    invoke-direct {v12, v9, v10}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 865
    invoke-virtual {v11, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 866
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    invoke-virtual {v0, v11}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 867
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "startAPP ,startActivity intent = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 869
    :cond_1
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 6

    .line 188
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter gmsConnect "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 191
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 192
    return-void

    .line 194
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/wearable/Wearable;->API:Lcom/google/android/gms/common/api/Api;

    .line 195
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 196
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 197
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lo/cym;->q:Landroid/os/Handler;

    .line 198
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->setHandler(Landroid/os/Handler;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 199
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 200
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 201
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mGoogleApiClient is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 203
    :cond_1
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 205
    :goto_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/wearable/PutDataMapRequest;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/android/gms/common/api/PendingResult<Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;>;Lcom/google/android/gms/wearable/PutDataMapRequest;)V"
        }
    .end annotation

    .line 594
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 595
    new-instance v0, Lo/cym$4;

    invoke-direct {v0, p0, p2}, Lo/cym$4;-><init>(Lo/cym;Lcom/google/android/gms/wearable/PutDataMapRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 607
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "pendingResult is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 609
    :goto_0
    return-void
.end method

.method public c(Lcom/google/android/gms/wearable/PutDataMapRequest;)V
    .locals 6

    .line 569
    invoke-virtual {p1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->asPutDataRequest()Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v5

    .line 570
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Generating DataItem: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "isConnected = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v4}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 571
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 573
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V

    .line 574
    return-void

    .line 576
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mGoogleApiClient.isConnected() = true"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 577
    invoke-virtual {v5}, Lcom/google/android/gms/wearable/PutDataRequest;->setUrgent()Lcom/google/android/gms/wearable/PutDataRequest;

    .line 579
    sget-object v0, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v1, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v5}, Lcom/google/android/gms/wearable/DataApi;->putDataItem(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/PutDataRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lo/cym$1;

    invoke-direct {v1, p0}, Lo/cym$1;-><init>(Lo/cym;)V

    .line 580
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    .line 587
    return-void
.end method

.method public c(Lcom/google/android/gms/wearable/Asset;)[B
    .locals 11

    .line 1110
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1111
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Asset must be non-null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1115
    :cond_0
    sget-object v0, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v1, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/wearable/DataApi;->getFdForAsset(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1116
    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    .line 1118
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 1119
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "transToByteArrayFromAsset,Requested an unknown Asset."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1120
    const/4 v0, 0x0

    return-object v0

    .line 1122
    :cond_1
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1124
    :try_start_0
    invoke-virtual {v6}, Ljava/io/InputStream;->available()I

    move-result v8

    .line 1125
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "transToByteArrayFromAsset() length = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    new-array v9, v8, [B

    .line 1128
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v6, v9, v0, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 1129
    const/4 v0, 0x0

    invoke-virtual {v7, v9, v0, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1133
    :cond_2
    goto :goto_1

    .line 1131
    :catch_0
    move-exception v8

    .line 1132
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "output stream write err"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1135
    :goto_1
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v8

    .line 1137
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 1138
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1141
    goto :goto_2

    .line 1139
    :catch_1
    move-exception v9

    .line 1140
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "transToByteArrayFromAsset ,Stream close err"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1142
    :goto_2
    return-object v8
.end method

.method public d()V
    .locals 5

    .line 1149
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to disconnectGMS."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1151
    invoke-direct {p0}, Lo/cym;->k()V

    .line 1181
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 1057
    iget-object v0, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method public e(I)V
    .locals 5

    .line 1064
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter btSwitchChangeInfo() with status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1065
    return-void
.end method

.method public f()I
    .locals 1

    .line 1263
    iget v0, p0, Lo/cym;->i:I

    return v0
.end method

.method public h()V
    .locals 2

    .line 1203
    iget-object v0, p0, Lo/cym;->l:Lo/cym$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1205
    iget-object v0, p0, Lo/cym;->l:Lo/cym$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cym$d;->removeMessages(I)V

    .line 1207
    :cond_0
    return-void
.end method

.method public onCapabilityChanged(Lcom/google/android/gms/wearable/CapabilityInfo;)V
    .locals 9

    .line 348
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 349
    return-void

    .line 351
    :cond_0
    iget-object v0, p0, Lo/cym;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 353
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 354
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceInfo is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 355
    return-void

    .line 357
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 358
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deviceInfo is not AW "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 359
    return-void

    .line 363
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onCapabilityChanged:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 365
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onCapabilityChanged mDeviceNode is null "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 366
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/cym;->b(Landroid/bluetooth/BluetoothDevice;)V

    .line 367
    return-void

    .line 369
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/wearable/CapabilityInfo;->getNodes()Ljava/util/Set;

    move-result-object v6

    .line 371
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 372
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onCapabilityChanged nodeSet is null "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 373
    return-void

    .line 376
    :cond_4
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/wearable/Node;

    .line 377
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 378
    invoke-virtual {p0, v8}, Lo/cym;->onPeerConnected(Lcom/google/android/gms/wearable/Node;)V

    .line 379
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onCapabilityChanged onPeerConnected"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 380
    return-void

    .line 382
    :cond_5
    goto :goto_0

    .line 383
    :cond_6
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onCapabilityChanged null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    const v0, 0xf4df9

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 385
    invoke-direct {p0}, Lo/cym;->k()V

    .line 387
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 341
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "onConnected"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    invoke-direct {p0}, Lo/cym;->i()V

    .line 343
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    .line 947
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onConnectionFailed, errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 948
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v0

    const v1, 0xf4240

    add-int/2addr v0, v1

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 949
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    .line 950
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 445
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onConnectionSuspended i="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    const v0, 0xf4df9

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 447
    invoke-direct {p0}, Lo/cym;->k()V

    .line 466
    return-void
.end method

.method public onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    .locals 16

    .line 473
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/data/FreezableUtils;->freezeIterable(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    .line 476
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 477
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDataChanged, watch layer = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 479
    const-string v7, "/wear_request_data"

    .line 480
    const-string v8, "wear_request_data"

    goto :goto_0

    .line 482
    :cond_0
    const-string v7, "/wear"

    .line 483
    const-string v8, "byte"

    .line 485
    :goto_0
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDataChanged, rev_path = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 487
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/google/android/gms/wearable/DataEvent;

    .line 488
    invoke-interface {v10}, Lcom/google/android/gms/wearable/DataEvent;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    .line 489
    invoke-interface {v10}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataItem;->getUri()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v11

    .line 490
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDataChanged, watch path = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 491
    invoke-interface {v10}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/wearable/DataMapItem;->fromDataItem(Lcom/google/android/gms/wearable/DataItem;)Lcom/google/android/gms/wearable/DataMapItem;

    move-result-object v12

    .line 493
    invoke-virtual {v12}, Lcom/google/android/gms/wearable/DataMapItem;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v13

    .line 494
    const-string v0, "/wear_request_data"

    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 495
    const/4 v0, 0x0

    if-eq v0, v13, :cond_5

    .line 496
    invoke-virtual {v13, v8}, Lcom/google/android/gms/wearable/DataMap;->getByteArray(Ljava/lang/String;)[B

    move-result-object v14

    .line 497
    const/4 v0, 0x0

    if-eq v0, v14, :cond_4

    .line 498
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device-->SDK\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v14}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/cxq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 499
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->f:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 501
    move-object/from16 v0, p0

    iget v0, v0, Lo/cym;->i:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    move-object/from16 v0, p0

    iget v0, v0, Lo/cym;->i:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 503
    :cond_1
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onDataChanged() status error drop data, mBTConnectState="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v5, p0

    iget v5, v5, Lo/cym;->i:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 504
    return-void

    .line 506
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->f:Lo/cxx;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    array-length v2, v14

    invoke-interface {v0, v1, v2, v14}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 507
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged() bytes handle success!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 509
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), mBTDeviceStateCallback is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 512
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), bytes is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 514
    :goto_2
    goto/16 :goto_6

    .line 515
    :cond_5
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), dataMap is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 517
    :cond_6
    const-string v0, "/wear"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 518
    const/4 v0, 0x0

    if-eq v0, v13, :cond_9

    .line 519
    const-string v0, "byte"

    invoke-virtual {v13, v0}, Lcom/google/android/gms/wearable/DataMap;->getByteArray(Ljava/lang/String;)[B

    move-result-object v14

    .line 521
    const/4 v0, 0x0

    if-eq v0, v14, :cond_8

    .line 522
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device-->SDK\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v14}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/cxq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 523
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->f:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 524
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->f:Lo/cxx;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    array-length v2, v14

    invoke-interface {v0, v1, v2, v14}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 525
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged() bytes handle success!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 527
    :cond_7
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), mBTDeviceStateCallback is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 530
    :cond_8
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), bytes is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 532
    :goto_3
    goto/16 :goto_6

    .line 533
    :cond_9
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), dataMap is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 535
    :cond_a
    const-string v0, "/wear_request_asset"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 536
    const/4 v0, 0x0

    if-eq v0, v13, :cond_d

    .line 537
    const-string v0, "wear_request_asset"

    invoke-virtual {v13, v0}, Lcom/google/android/gms/wearable/DataMap;->getAsset(Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;

    move-result-object v14

    .line 538
    const/4 v0, 0x0

    if-eq v0, v14, :cond_c

    .line 539
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lo/cym;->c(Lcom/google/android/gms/wearable/Asset;)[B

    move-result-object v15

    .line 540
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Asset Device-->SDK\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v15}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/cxq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 541
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 542
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cym;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v15}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 543
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged() asset handle success"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 545
    :cond_b
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), mBTDeviceFileCallback is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 547
    :goto_4
    goto :goto_5

    .line 548
    :cond_c
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), asset is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 550
    :goto_5
    goto :goto_6

    .line 551
    :cond_d
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged(), dataMap is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 554
    :cond_e
    :goto_6
    goto :goto_7

    :cond_f
    invoke-interface {v10}, Lcom/google/android/gms/wearable/DataEvent;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_10

    .line 555
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDataChanged() DataItem Deleted: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v10}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 557
    :cond_10
    :goto_7
    goto/16 :goto_1

    :cond_11
    goto :goto_8

    .line 560
    :cond_12
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDataChanged() mDeviceInfo is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 562
    :goto_8
    return-void
.end method

.method public onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V
    .locals 8

    .line 784
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 785
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onMessageReceived messageEvent or path is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 786
    return-void

    .line 789
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onMessageReceived() RequestId = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getRequestId()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "Path = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 790
    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 791
    iget-object v0, p0, Lo/cym;->c:Lo/cym$a;

    if-eqz v0, :cond_2

    .line 792
    iget-object v0, p0, Lo/cym;->c:Lo/cym$a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-virtual {v0, v1}, Lo/cym$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 795
    :cond_2
    const-string v0, "/wear_request_message"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 796
    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getData()[B

    move-result-object v7

    .line 797
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onMessageReceived message data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 798
    array-length v0, v7

    const/4 v1, 0x6

    if-le v0, v1, :cond_3

    .line 800
    const/4 v0, 0x4

    aget-byte v0, v7, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    const/4 v0, 0x5

    aget-byte v0, v7, v0

    const/16 v1, 0x15

    if-ne v1, v0, :cond_3

    .line 801
    invoke-virtual {p0}, Lo/cym;->c()V

    .line 806
    :cond_3
    const-string v0, "/wear_request_data"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 807
    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getData()[B

    move-result-object v7

    .line 809
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    .line 810
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MessageAPI Device-->SDK: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/cxq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 811
    iget-object v0, p0, Lo/cym;->f:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 813
    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_5

    .line 815
    :cond_4
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onMessageReceived() status error drop data, mBTConnectState="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lo/cym;->i:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 816
    return-void

    .line 818
    :cond_5
    iget-object v0, p0, Lo/cym;->f:Lo/cxx;

    iget-object v1, p0, Lo/cym;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    array-length v2, v7

    invoke-interface {v0, v1, v2, v7}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 819
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onMessageReceived() handle success"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 821
    :cond_6
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "onMessageReceived(), mBTDeviceStateCallback is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 824
    :cond_7
    const-string v0, "0xA0200009"

    const-string v1, "01"

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "onMessageReceived(), bytes is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 827
    :cond_8
    :goto_0
    return-void
.end method

.method public onPeerConnected(Lcom/google/android/gms/wearable/Node;)V
    .locals 5

    .line 895
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPeerConnected, connected watch: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/wearable/Node;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 896
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 898
    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 899
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    .line 902
    :cond_0
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    .line 903
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V

    goto :goto_0

    .line 905
    :cond_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    goto :goto_0

    .line 907
    :cond_2
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 908
    iput-object p1, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    .line 910
    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_3

    iget v0, p0, Lo/cym;->i:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_3

    .line 911
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    .line 914
    :cond_3
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_4

    .line 915
    iget-object v0, p0, Lo/cym;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V

    goto :goto_0

    .line 917
    :cond_4
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/cym;->c(I)V

    goto :goto_0

    .line 921
    :cond_5
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onPeerConnected with connected different watch."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 923
    :goto_0
    return-void
.end method

.method public onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V
    .locals 5

    .line 931
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "aw device disconnected with displayName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/wearable/Node;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cym;->h:Lcom/google/android/gms/wearable/Node;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/wearable/Node;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 933
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onPeerDisconnected lost"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    const v0, 0xf4df9

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 935
    invoke-direct {p0}, Lo/cym;->k()V

    goto :goto_0

    .line 937
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onPeerDisconnected but not wanted aw device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 939
    :goto_0
    return-void
.end method
