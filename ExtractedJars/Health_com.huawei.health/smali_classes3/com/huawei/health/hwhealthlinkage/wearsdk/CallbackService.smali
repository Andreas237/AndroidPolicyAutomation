.class public Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;,
        Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;,
        Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;,
        Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;
    }
.end annotation


# static fields
.field private static g:Ljava/lang/String;

.field private static h:Z

.field private static i:Z

.field private static o:Ljava/lang/Object;


# instance fields
.field private a:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<Lo/aaz;>;"
        }
    .end annotation
.end field

.field private final b:Landroid/os/IBinder;

.field private c:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<Lo/aaz;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private k:Lorg/json/JSONObject;

.field private l:Lorg/json/JSONObject;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private p:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private q:Lcom/google/gson/Gson;

.field private r:[B

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;>;"
        }
    .end annotation
.end field

.field private v:Lo/aat$e;

.field private w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;>;"
        }
    .end annotation
.end field

.field private x:Lo/aau$e;

.field private y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 76
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h:Z

    .line 77
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i:Z

    .line 78
    const-string v0, ""

    sput-object v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->g:Ljava/lang/String;

    .line 87
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 69
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c:Landroid/os/RemoteCallbackList;

    .line 70
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a:Landroid/os/RemoteCallbackList;

    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e:Ljava/util/Map;

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d:Ljava/util/Map;

    .line 75
    new-instance v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b:Landroid/os/IBinder;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->u:Ljava/util/List;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 93
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q:Lcom/google/gson/Gson;

    .line 94
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r:[B

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->z:Ljava/util/Map;

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->w:Ljava/util/Map;

    .line 129
    new-instance v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->v:Lo/aat$e;

    .line 145
    new-instance v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->x:Lo/aau$e;

    .line 810
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lo/aau$e;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->x:Lo/aau$e;

    return-object v0
.end method

.method private a(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1083
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v4

    .line 1084
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling remote callback, the length is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1085
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 1086
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v5}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v6

    .line 1087
    new-instance v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;

    invoke-direct {v0, p0, v6, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Landroid/os/IInterface;Ljava/util/Map;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 1085
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1103
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 1104
    return-void
.end method

.method public static a()Z
    .locals 4

    .line 101
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHuaweiWearConnected:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isHuaweiHealthConnected:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    sget-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private a(Lcom/huawei/datatype/RunPlanInfo;)Z
    .locals 5

    .line 874
    const/4 v4, 0x0

    .line 875
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 876
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 877
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    .line 878
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    goto :goto_2

    .line 880
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    .line 881
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    goto :goto_2

    .line 884
    :cond_4
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runplanlog isMatchWear runPlanInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 887
    :goto_2
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog isMatchWear:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 889
    return v4
.end method

.method static synthetic a(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Z
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;)Z"
        }
    .end annotation

    .line 1200
    const-string v2, ""

    .line 1201
    const-string v3, ""

    .line 1202
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 1203
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 1204
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1205
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v2

    .line 1207
    :cond_0
    goto :goto_0

    .line 1208
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 1209
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1210
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v3

    .line 1212
    :cond_2
    goto :goto_1

    .line 1215
    :cond_3
    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1216
    const/4 v0, 0x1

    return v0

    .line 1218
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Landroid/os/RemoteCallbackList;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a:Landroid/os/RemoteCallbackList;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Z
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;)Z"
        }
    .end annotation

    .line 1223
    const-string v2, ""

    .line 1224
    const-string v3, ""

    .line 1225
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 1226
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 1227
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1228
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v2

    .line 1230
    :cond_0
    goto :goto_0

    .line 1231
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 1232
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1233
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v3

    .line 1235
    :cond_2
    goto :goto_1

    .line 1238
    :cond_3
    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1239
    const/4 v0, 0x1

    return v0

    .line 1241
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Z)Z
    .locals 0

    .line 68
    sput-boolean p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h:Z

    return p0
.end method

.method static synthetic c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i()V

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 911
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u7684\u8fde\u63a5\u72b6\u6001 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 912
    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 913
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "service is not connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    const-string v0, "syncFitnessDetailData"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 915
    if-eqz p3, :cond_0

    .line 916
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 919
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p()V

    .line 920
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestWearTask funcName "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    invoke-static {p1}, Lo/dax;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 922
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->w:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 923
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestWearTask funcName exist in noDeviceRemoteFunciotnDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 925
    :cond_1
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestWearTask funcName put noDeviceRemoteFunciotnDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 926
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->w:Ljava/util/Map;

    new-instance v1, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;

    invoke-direct {v1, p1, p2, p3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 928
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->z:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 929
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestWearTask funcName exist in remoteFunctionDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 931
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->z:Ljava/util/Map;

    new-instance v1, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;

    invoke-direct {v1, p1, p2, p3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 933
    :goto_0
    return-void

    .line 935
    :cond_4
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the callbackservice is calling "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 936
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 937
    const-string v0, "funcName"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 938
    if-eqz p2, :cond_5

    .line 939
    const-string v0, "parameters"

    invoke-interface {v4, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    :cond_5
    const-string v0, "setOperator"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "setHeartRateReportStatus"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 944
    const-string v0, "setStressReportStatus"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p2}, Lo/ahd;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 945
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 946
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send to requestWearTaskForWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Ljava/util/Map;)V

    goto/16 :goto_2

    .line 948
    :cond_6
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->g()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 949
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send to requestWearTaskForHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/util/Map;)V

    goto/16 :goto_2

    .line 952
    :cond_7
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send to other"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Ljava/util/Map;)V

    .line 954
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/util/Map;)V

    goto :goto_2

    .line 958
    :cond_8
    const-string v0, "syncFitnessDetailData"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_a

    :cond_9
    sget-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i:Z

    if-nez v0, :cond_b

    .line 959
    :cond_a
    invoke-static {p2}, Lo/ahd;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 960
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Ljava/util/Map;)V

    goto :goto_1

    .line 963
    :cond_b
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "don\'t send command:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    :cond_c
    :goto_1
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/util/Map;)V

    goto :goto_2

    .line 970
    :cond_d
    invoke-virtual {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p2}, Lo/ahd;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 971
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Ljava/util/Map;)V

    .line 973
    :cond_e
    invoke-virtual {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 974
    invoke-direct {p0, v4}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/util/Map;)V

    .line 978
    :cond_f
    :goto_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Landroid/os/RemoteCallbackList;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c:Landroid/os/RemoteCallbackList;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    return-object p1
.end method

.method private d(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1059
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v4

    .line 1060
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling remote callback, the length is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1061
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 1062
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v5}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v6

    .line 1063
    new-instance v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;

    invoke-direct {v0, p0, v6, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Landroid/os/IInterface;Ljava/util/Map;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 1061
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1079
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 1080
    return-void
.end method

.method static synthetic e(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 68
    sput-object p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->g:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    return-object p1
.end method

.method private e(Lcom/huawei/datatype/RunPlanInfo;)Z
    .locals 5

    .line 893
    const/4 v4, 0x0

    .line 894
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 895
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 896
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    .line 897
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    goto :goto_2

    .line 899
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    .line 900
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    goto :goto_2

    .line 903
    :cond_4
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runplanlog isMatchHealth runPlanInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    :goto_2
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog isMatchHealth:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    return v4
.end method

.method static synthetic e(Z)Z
    .locals 0

    .line 68
    sput-boolean p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i:Z

    return p0
.end method

.method static synthetic e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r:[B

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->w:Ljava/util/Map;

    return-object v0
.end method

.method private f()Z
    .locals 5

    .line 1004
    const/4 v2, 0x0

    .line 1005
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 1006
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 1007
    invoke-virtual {v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1008
    invoke-virtual {v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_0

    .line 1009
    const/4 v2, 0x1

    .line 1011
    :cond_0
    goto :goto_0

    .line 1013
    :cond_1
    return v2
.end method

.method static synthetic g(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    return-object v0
.end method

.method private g()Z
    .locals 5

    .line 1018
    const/4 v2, 0x0

    .line 1019
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 1020
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 1021
    invoke-virtual {v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 1022
    invoke-virtual {v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_0

    .line 1023
    const/4 v2, 0x1

    .line 1025
    :cond_0
    goto :goto_0

    .line 1027
    :cond_1
    return v2
.end method

.method static synthetic h()Ljava/lang/String;
    .locals 1

    .line 68
    sget-object v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d:Ljava/util/Map;

    return-object v0
.end method

.method private i()V
    .locals 7

    .line 133
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter sendSupportDeviceToWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    new-instance v4, Lcom/huawei/hwcommonmodel/datatypes/HuaweiHealthData;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/datatypes/HuaweiHealthData;-><init>()V

    .line 136
    const/16 v0, 0x3e8

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/HuaweiHealthData;->setCommandType(I)V

    .line 137
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 138
    new-instance v6, Landroid/content/ComponentName;

    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.homewear21.intentservice.MessageCenterIntentService"

    invoke-direct {v6, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 140
    const-string v0, "data"

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q:Lcom/google/gson/Gson;

    invoke-virtual {v1, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 143
    return-void
.end method

.method static synthetic k()Ljava/lang/Object;
    .locals 1

    .line 68
    sget-object v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->o:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->u:Ljava/util/List;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n:Ljava/util/List;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->z:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q:Lcom/google/gson/Gson;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 1146
    new-instance v1, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_receive_push_restart"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1148
    const/16 v0, 0x20

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1149
    invoke-virtual {p0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->sendBroadcast(Landroid/content/Intent;)V

    .line 1150
    return-void
.end method

.method static synthetic q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k:Lorg/json/JSONObject;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l:Lorg/json/JSONObject;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 813
    iget-object v5, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r:[B

    monitor-enter v5

    .line 815
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear app has been installed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 816
    if-eqz p3, :cond_2

    .line 817
    const-string v0, "getRunPlanParameter"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 818
    sget-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h:Z

    if-eqz v0, :cond_0

    .line 819
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e:Ljava/util/Map;

    const-string v1, "getRunPlanParameter"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 821
    :cond_0
    sget-boolean v0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i:Z

    if-eqz v0, :cond_2

    .line 822
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e:Ljava/util/Map;

    const-string v1, "getRunPlanParameterforhealth"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 825
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    :cond_2
    :goto_0
    const-string v0, "setRunPlan"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    if-eq v0, p2, :cond_7

    .line 829
    const/4 v6, 0x0

    .line 831
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 832
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q:Lcom/google/gson/Gson;

    const-string v1, "runPlanInfo"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/datatype/RunPlanInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanInfo;
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v6, v0

    .line 837
    goto :goto_1

    .line 833
    :catch_0
    move-exception v7

    .line 834
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog JsonSyntaxException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    goto :goto_1

    .line 835
    :catch_1
    move-exception v7

    .line 836
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog JSONException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 839
    new-instance v6, Lcom/huawei/datatype/RunPlanInfo;

    invoke-direct {v6}, Lcom/huawei/datatype/RunPlanInfo;-><init>()V

    .line 841
    :cond_3
    invoke-virtual {v6}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 843
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog runPlanMap.get(\"health\") :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v4, "health"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog runPlanMap.get(\"wear\") :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v4, "wear"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog runPlanMap.get runPlanInfo size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    invoke-virtual {v6}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    const-string v0, "00000000000000000000000000000000"

    invoke-virtual {v6}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_total_sign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 848
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runplanlog finish plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 850
    const-string v0, "setRunPlanForHealth"

    invoke-direct {p0, v0, p2, p3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 851
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 853
    monitor-exit v5

    return-void

    .line 856
    :cond_4
    :try_start_3
    invoke-direct {p0, v6}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Lcom/huawei/datatype/RunPlanInfo;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 857
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "containsKey(wear)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 858
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "wear"

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    :cond_5
    invoke-direct {p0, v6}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/datatype/RunPlanInfo;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 861
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "containsKey(health)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 862
    const-string p1, "setRunPlanForHealth"

    .line 863
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->y:Ljava/util/Map;

    const-string v1, "health"

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 866
    :cond_6
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog runplan funcName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    :cond_7
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 870
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 871
    :goto_2
    return-void
.end method

.method public b()Z
    .locals 6

    .line 510
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 511
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 512
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 513
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 514
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 515
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthDeviceSupportHeart HAS device support heart rate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    const/4 v0, 0x1

    return v0

    .line 511
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 522
    :cond_1
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthDeviceSupportHeart no device support heart rate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 6

    .line 985
    const/4 v4, 0x0

    .line 986
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 988
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q:Lcom/google/gson/Gson;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 992
    goto :goto_0

    .line 989
    :catch_0
    move-exception v5

    .line 990
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wearDeviceCapability JsonSyntaxException:"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 994
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 995
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo()Z

    move-result v4

    .line 997
    :cond_1
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isWearDeviceSupportStress :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 998
    return v4
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 1125
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start ----unRegisterNotification "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " registered"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1127
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the callback is null. from function : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    return-void

    .line 1131
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1132
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 1133
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "You have not registerNotification any callback from function : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    return-void

    .line 1136
    :cond_1
    invoke-interface {v4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1137
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list do not contain callback. from function : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    return-void

    .line 1140
    :cond_2
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "done --- unRegisterNotification "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " registered"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1141
    invoke-interface {v4, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1142
    return-void
.end method

.method public d()Z
    .locals 6

    .line 553
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 554
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 555
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 556
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 557
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 558
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthDeviceSupportHeart no device support StressInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    const/4 v0, 0x1

    return v0

    .line 554
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 565
    :cond_1
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthDeviceSupportHeart no device support heart rate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 1108
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationName "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " registered"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1109
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1110
    if-nez v4, :cond_0

    .line 1111
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1112
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1114
    :cond_0
    invoke-interface {v4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1115
    invoke-interface {v4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1117
    :cond_1
    return-void
.end method

.method public e()Z
    .locals 6

    .line 471
    const/4 v4, 0x0

    .line 472
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 474
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q:Lcom/google/gson/Gson;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 478
    goto :goto_0

    .line 475
    :catch_0
    move-exception v5

    .line 476
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wearDeviceCapability JsonSyntaxException:"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 480
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 481
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo()Z

    move-result v4

    .line 483
    :cond_1
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isWearDeviceSupportHeart :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    return v4
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 439
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    const-string v0, "local.proxy"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b:Landroid/os/IBinder;

    return-object v0

    .line 443
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->v:Lo/aat$e;

    return-object v0
.end method

.method public onCreate()V
    .locals 5

    .line 448
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 450
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsWearAPPInstalled  is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_CONNECTION_TO_WEAR"

    const-string v3, "1"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 454
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p()V

    .line 463
    return-void
.end method
