.class public Lo/dkw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dkw$e;,
        Lo/dkw$d;
    }
.end annotation


# static fields
.field private static a:Lo/dkw;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:J

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:I

.field private G:Ljava/lang/String;

.field private H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

.field private I:I

.field private J:I

.field private K:I

.field private L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private S:I

.field private T:Lo/dla;

.field private U:Z

.field private V:I

.field private W:I

.field private X:I

.field private Y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private Z:Z

.field private aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private ab:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private ac:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private c:Z

.field private d:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

.field private e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dkj;>;"
        }
    .end annotation
.end field

.field private g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/os/Handler;>;"
        }
    .end annotation
.end field

.field private h:Landroid/os/Handler;

.field private i:I

.field private j:Ljava/util/Date;

.field private k:Ljava/util/ArrayList;

.field private l:I

.field private m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

.field private n:Ljava/lang/String;

.field private o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

.field private p:I

.field private q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Long;>;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Long;[D>;>;"
        }
    .end annotation
.end field

.field private t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->c:Z

    .line 87
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/dkw;->g:Landroid/util/SparseArray;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dkw;->s:Ljava/util/Map;

    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dkw;->r:Ljava/util/Map;

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    .line 112
    const/16 v0, 0x988

    iput v0, p0, Lo/dkw;->z:I

    .line 113
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dkw;->v:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->y:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->w:I

    .line 119
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->B:Z

    .line 122
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 123
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 124
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lo/dkw;->j:Ljava/util/Date;

    .line 125
    const/16 v0, 0x1388

    iput v0, p0, Lo/dkw;->I:I

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 127
    const-string v0, ""

    iput-object v0, p0, Lo/dkw;->G:Ljava/lang/String;

    .line 128
    const-string v0, ""

    iput-object v0, p0, Lo/dkw;->E:Ljava/lang/String;

    .line 129
    const/4 v0, -0x1

    iput v0, p0, Lo/dkw;->F:I

    .line 130
    const/4 v0, 0x1

    iput v0, p0, Lo/dkw;->J:I

    .line 131
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->N:I

    .line 137
    const/16 v0, 0xf4

    iput v0, p0, Lo/dkw;->R:I

    .line 138
    const/4 v0, -0x1

    iput v0, p0, Lo/dkw;->S:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->P:I

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->Q:I

    .line 146
    const/4 v0, -0x1

    iput v0, p0, Lo/dkw;->X:I

    .line 151
    const/4 v0, 0x1

    iput v0, p0, Lo/dkw;->W:I

    .line 153
    new-instance v0, Lo/dla;

    invoke-direct {v0}, Lo/dla;-><init>()V

    iput-object v0, p0, Lo/dkw;->T:Lo/dla;

    .line 154
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->U:Z

    .line 156
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->V:I

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->Z:Z

    .line 1012
    new-instance v0, Lo/dkw$15;

    invoke-direct {v0, p0}, Lo/dkw$15;-><init>(Lo/dkw;)V

    iput-object v0, p0, Lo/dkw;->ab:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1056
    new-instance v0, Lo/dkw$11;

    invoke-direct {v0, p0}, Lo/dkw$11;-><init>(Lo/dkw;)V

    iput-object v0, p0, Lo/dkw;->ac:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1084
    new-instance v0, Lo/dkw$13;

    invoke-direct {v0, p0}, Lo/dkw$13;-><init>(Lo/dkw;)V

    iput-object v0, p0, Lo/dkw;->Y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1829
    new-instance v0, Lo/dkw$9;

    invoke-direct {v0, p0}, Lo/dkw$9;-><init>(Lo/dkw;)V

    iput-object v0, p0, Lo/dkw;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 168
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->d:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    .line 169
    iget-object v0, p0, Lo/dkw;->g:Landroid/util/SparseArray;

    new-instance v1, Lo/dkw$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/dkw$d;-><init>(Lo/dkw;Lo/dkw$3;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lo/dkw;->g:Landroid/util/SparseArray;

    new-instance v1, Lo/dkw$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/dkw$e;-><init>(Lo/dkw;Lo/dkw$3;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 171
    return-void
.end method

.method static synthetic A(Lo/dkw;)Ljava/util/ArrayList;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic B(Lo/dkw;)Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lo/dkw;->c:Z

    return v0
.end method

.method static synthetic C(Lo/dkw;)Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lo/dkw;->Z:Z

    return v0
.end method

.method static synthetic D(Lo/dkw;)Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    return-object v0
.end method

.method static synthetic a(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->x:I

    return p1
.end method

.method static synthetic a(Lo/dkw;)Landroid/os/Handler;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private a(I)V
    .locals 6

    .line 446
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 447
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 448
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 450
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 451
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 452
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 455
    if-eqz p1, :cond_1

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xf

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 457
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 458
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 463
    :cond_1
    invoke-direct {p0, v4}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 464
    return-void
.end method

.method private a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 4

    .line 1815
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendCommand  deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v3

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1816
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1817
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 5

    .line 551
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    iput-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 553
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTimeout()I

    move-result v0

    iput v0, p0, Lo/dkw;->I:I

    .line 554
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTransfer_unit_size()I

    move-result v0

    iput v0, p0, Lo/dkw;->R:I

    .line 557
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_0

    .line 558
    iget v0, p0, Lo/dkw;->v:I

    iput v0, p0, Lo/dkw;->z:I

    goto :goto_0

    .line 560
    :cond_0
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getMax_apply_data_size()I

    move-result v0

    iput v0, p0, Lo/dkw;->v:I

    .line 564
    :goto_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getMaintSleepOrDFXParametersHandle() ok, protocalVersion :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 565
    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n transferUnitSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->R:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n maxApplyDataSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n waitTimeout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n breakPointEnable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 569
    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTransfer_bitmap_enable()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 564
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 573
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->deleteTenDayFile()V

    .line 574
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget v1, p0, Lo/dkw;->F:I

    iget-object v2, p0, Lo/dkw;->G:Ljava/lang/String;

    iget-object v3, p0, Lo/dkw;->E:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->initMaintenanceParame(ILjava/lang/String;Ljava/lang/String;)V

    .line 575
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 584
    :cond_1
    goto :goto_1

    .line 577
    :catch_0
    move-exception v4

    .line 578
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---getMaintSleepOrDFXParametersHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 580
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 581
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 585
    :cond_2
    :goto_1
    return-void
.end method

.method private a(Ljava/lang/Object;I)V
    .locals 5

    .line 959
    move-object v4, p1

    :try_start_0
    check-cast v4, Lo/dkh;

    .line 960
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 963
    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    .line 964
    invoke-direct {p0, p2, v4}, Lo/dkw;->d(ILo/dkh;)V

    goto :goto_0

    .line 966
    :cond_0
    invoke-direct {p0, v4}, Lo/dkw;->c(Lo/dkh;)V

    goto :goto_0

    .line 969
    :cond_1
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != maintLog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 978
    :goto_0
    goto :goto_1

    .line 972
    :catch_0
    move-exception v4

    .line 973
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 974
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 975
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 977
    :cond_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---applyDataFromDeviceHandle Exception---e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 979
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->b(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lo/dkw;[B)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->e([B)V

    return-void
.end method

.method private a([B)Z
    .locals 4

    .line 2427
    const/4 v2, 0x0

    .line 2428
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    .line 2429
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const v1, 0x1adb2

    if-ne v1, v0, :cond_0

    .line 2430
    const/4 v2, 0x1

    .line 2432
    :cond_0
    return v2
.end method

.method static synthetic b(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->l:I

    return p1
.end method

.method private b(I)Ljava/lang/String;
    .locals 1

    .line 1674
    const-string v0, ""

    .line 1675
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 1677
    :sswitch_0
    const-string v0, "SUCCESS"

    .line 1678
    goto :goto_0

    .line 1680
    :sswitch_1
    const-string v0, "UNKNOW ERROR"

    .line 1681
    goto :goto_0

    .line 1683
    :sswitch_2
    const-string v0, "NOT SUPPORT THIS REQUEST"

    .line 1684
    goto :goto_0

    .line 1686
    :sswitch_3
    const-string v0, "NO PERMISSION"

    .line 1687
    goto :goto_0

    .line 1689
    :sswitch_4
    const-string v0, "SYSTEM BUSY"

    .line 1690
    goto :goto_0

    .line 1692
    :sswitch_5
    const-string v0, "REQUEST FORMAT ERROR"

    .line 1693
    goto :goto_0

    .line 1695
    :sswitch_6
    const-string v0, "REQUEST PARAMETER ERROR"

    .line 1696
    goto :goto_0

    .line 1698
    :sswitch_7
    const-string v0, "MEMORY ERROR"

    .line 1699
    goto :goto_0

    .line 1701
    :sswitch_8
    const-string v0, "RESPONSE TIMEOUT"

    .line 1702
    goto :goto_0

    .line 1704
    :sswitch_9
    const-string v0, "\u4f4e\u7535\u91cf "

    .line 1705
    goto :goto_0

    .line 1707
    :sswitch_a
    const-string v0, "\u5355\u677f\u4e0d\u652f\u6301OTA\u5347\u7ea7"

    .line 1708
    .line 1712
    :goto_0
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x186a0 -> :sswitch_0
        0x186a1 -> :sswitch_1
        0x186a2 -> :sswitch_2
        0x186a3 -> :sswitch_3
        0x186a4 -> :sswitch_4
        0x186a5 -> :sswitch_5
        0x186a6 -> :sswitch_6
        0x186a7 -> :sswitch_7
        0x186a8 -> :sswitch_8
        0x19641 -> :sswitch_a
        0x19642 -> :sswitch_9
    .end sparse-switch
.end method

.method static synthetic b(Lo/dkw;)Ljava/util/ArrayList;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b(Ljava/lang/Object;)V
    .locals 12

    .line 616
    move-object v5, p1

    :try_start_0
    check-cast v5, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    .line 617
    invoke-virtual {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->getFileSize()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lo/dkw;->y:I

    .line 618
    invoke-virtual {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->getFileCrc()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dkw;->C:J

    .line 619
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " queryFileInformationHandle() ok, fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", fileCrc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dkw;->C:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    iget v0, p0, Lo/dkw;->y:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 621
    const/4 v6, -0x1

    .line 622
    const/4 v7, 0x0

    .line 623
    const/4 v8, -0x1

    .line 624
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 625
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->a()I

    move-result v6

    .line 626
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v7

    .line 627
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->c()I

    move-result v8

    .line 628
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 630
    :cond_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   name : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " id : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    const/4 v0, 0x2

    if-ne v6, v0, :cond_2

    .line 632
    move v9, v8

    .line 633
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    iget-boolean v1, p0, Lo/dkw;->U:Z

    new-instance v2, Lo/dkw$3;

    invoke-direct {v2, p0, v9}, Lo/dkw$3;-><init>(Lo/dkw;I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v7, v3, v1, v2}, Lo/dla;->e(Ljava/lang/String;Ljava/lang/String;ZLo/yg;)I

    move-result v10

    .line 647
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List()!,tatatee trackProcess result ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    if-eqz v10, :cond_1

    .line 649
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 650
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 651
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 652
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v11

    .line 653
    const/16 v0, 0xa

    iput v0, v11, Landroid/os/Message;->what:I

    .line 654
    iput v8, v11, Landroid/os/Message;->arg1:I

    .line 655
    const/16 v0, 0x2713

    iput v0, v11, Landroid/os/Message;->arg2:I

    .line 656
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 659
    :cond_1
    return-void

    .line 662
    :cond_2
    :try_start_1
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 663
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 664
    const/16 v0, 0xa

    iput v0, v9, Landroid/os/Message;->what:I

    .line 665
    iput v8, v9, Landroid/os/Message;->arg1:I

    .line 666
    const/16 v0, 0x2713

    iput v0, v9, Landroid/os/Message;->arg2:I

    .line 667
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 669
    :cond_3
    goto :goto_0

    .line 670
    :cond_4
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lo/dkw;->j:Ljava/util/Date;

    .line 671
    invoke-virtual {p0}, Lo/dkw;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 675
    :goto_0
    goto :goto_1

    .line 673
    :catch_0
    move-exception v5

    .line 674
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---queryFileInformationHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    :goto_1
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    .line 591
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 592
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 593
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 595
    :cond_0
    invoke-direct {p0}, Lo/dkw;->i()V

    .line 596
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 597
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 598
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 599
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.3 queryFileInformation : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 602
    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 603
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 604
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 605
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 607
    invoke-direct {p0, v6}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 608
    return-void
.end method

.method static synthetic b(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->k(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lo/dkw;[B)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->b([B)V

    return-void
.end method

.method private b([B)V
    .locals 4

    .line 2385
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isgetlog_from_aboutactivity  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dkw;->c:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2386
    iget-boolean v0, p0, Lo/dkw;->c:Z

    if-eqz v0, :cond_0

    .line 2387
    iget-object v0, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    iget-object v1, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p0, v0, v1}, Lo/dkw;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2388
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isgetlog_from_aboutactivity  =false= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2390
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->c:Z

    .line 2391
    iget-object v0, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsFromAbout(I)V

    .line 2392
    invoke-static {}, Lo/dad;->c()Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsFromAbout(I)V

    .line 2393
    return-void

    .line 2422
    :cond_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the version is not beta. do not support 11"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2424
    return-void
.end method

.method static synthetic c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    return-object v0
.end method

.method static synthetic c(Lo/dkw;I)Ljava/lang/String;
    .locals 1

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(II)V
    .locals 14

    .line 282
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 283
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 284
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 287
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 288
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 289
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 292
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 295
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {p2 .. p2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 297
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    invoke-static {p1}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 300
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x9

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 304
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x88

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 307
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x86

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 310
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 312
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v13

    .line 314
    array-length v0, v13

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 315
    invoke-virtual {v4, v13}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 317
    invoke-direct {p0, v4}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 318
    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 5

    .line 495
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    iput-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 497
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTimeout()I

    move-result v0

    iput v0, p0, Lo/dkw;->I:I

    .line 498
    iget v0, p0, Lo/dkw;->I:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 499
    const/16 v0, 0x1388

    iput v0, p0, Lo/dkw;->I:I

    .line 501
    :cond_0
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTransfer_unit_size()I

    move-result v0

    iput v0, p0, Lo/dkw;->R:I

    .line 503
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getMax_apply_data_size()I

    move-result v0

    iput v0, p0, Lo/dkw;->v:I

    .line 504
    iget v0, p0, Lo/dkw;->v:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 505
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dkw;->v:I

    .line 507
    :cond_1
    iget v0, p0, Lo/dkw;->v:I

    iput v0, p0, Lo/dkw;->z:I

    .line 510
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getMaintSleepOrDFXParametersHandle() ok, protocalVersion :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 511
    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n transferUnitSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->R:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n maxApplyDataSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n waitTimeout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n breakPointEnable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 515
    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTransfer_bitmap_enable()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 510
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 518
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 522
    :cond_2
    goto :goto_0

    .line 520
    :catch_0
    move-exception v4

    .line 521
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---getMaintParametersHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/Object;I)V
    .locals 5

    .line 791
    move-object v0, p1

    :try_start_0
    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 793
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---applyDataHandle is[0] = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v4, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";offset="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 794
    const/4 v0, 0x0

    aget v0, v4, v0

    const v1, 0x186a0

    if-ne v1, v0, :cond_1

    iget v0, p0, Lo/dkw;->w:I

    if-eq p2, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 795
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 796
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkw;->Z:Z

    .line 797
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 798
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 799
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    iget v1, p0, Lo/dkw;->I:I

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 801
    :cond_1
    iget v0, p0, Lo/dkw;->w:I

    if-ge p2, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 803
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 804
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 805
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    iget v1, p0, Lo/dkw;->I:I

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 808
    :cond_2
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 809
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 811
    :cond_3
    invoke-direct {p0}, Lo/dkw;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 815
    :cond_4
    :goto_0
    goto :goto_1

    .line 813
    :catch_0
    move-exception v4

    .line 814
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---errorCodeHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 816
    :goto_1
    return-void
.end method

.method private c(Lo/dkh;)V
    .locals 7

    .line 1408
    invoke-virtual {p1}, Lo/dkh;->b()I

    move-result v4

    .line 1410
    iget v0, p0, Lo/dkw;->O:I

    if-ne v4, v0, :cond_1

    .line 1411
    invoke-virtual {p1}, Lo/dkh;->e()[B

    move-result-object v5

    .line 1412
    iget v0, p0, Lo/dkw;->x:I

    array-length v1, v5

    add-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->x:I

    .line 1413
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->l:I

    .line 1415
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepDataFromAndroidWear() fileType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  valueByte.length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1417
    iget v0, p0, Lo/dkw;->l:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1418
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1422
    :cond_0
    :try_start_0
    invoke-static {v5}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    .line 1423
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1427
    goto :goto_0

    .line 1425
    :catch_0
    move-exception v6

    .line 1426
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepDataFromAndroidWear exception  is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1429
    :goto_0
    iget v0, p0, Lo/dkw;->w:I

    array-length v1, v5

    add-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->w:I

    .line 1430
    iget v0, p0, Lo/dkw;->O:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dkw;->O:I

    .line 1431
    goto :goto_1

    .line 1432
    :cond_1
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepDataFromAndroidWear() lost  index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1436
    :goto_1
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepDataFromAndroidWear() currentApplyDataSize ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+donePackatgeSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",currentSleepOrDFXFrameNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->S:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1437
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->y:I

    if-lt v0, v1, :cond_f

    .line 1438
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 1439
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 1440
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 1441
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1443
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1444
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget-object v1, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/dkw;->n:Ljava/lang/String;

    iget-object v3, p0, Lo/dkw;->j:Ljava/util/Date;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->writeLogToFile(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Date;)V

    .line 1447
    :cond_2
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1449
    iget v0, p0, Lo/dkw;->y:I

    if-gtz v0, :cond_6

    .line 1450
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepDataFromAndroidWear() lost  package error!!!!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1451
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 1452
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1453
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1454
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 1456
    :cond_3
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_4

    .line 1457
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 1459
    :cond_4
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "package error"

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1461
    :cond_5
    return-void

    .line 1465
    :cond_6
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->y:I

    if-lt v0, v1, :cond_d

    .line 1468
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 1469
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 1470
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1473
    :cond_7
    const/4 v5, 0x0

    .line 1475
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 1476
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->transferFileEndProcess()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v5

    .line 1479
    :cond_8
    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    .line 1483
    invoke-direct {p0, v5}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1486
    :cond_9
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1487
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_a

    .line 1488
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$2;

    invoke-direct {v1, p0}, Lo/dkw$2;-><init>(Lo/dkw;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_2

    .line 1495
    :cond_a
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_b

    .line 1496
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$1;

    invoke-direct {v1, p0}, Lo/dkw$1;-><init>(Lo/dkw;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_2

    .line 1504
    :cond_b
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1509
    :cond_c
    :goto_2
    invoke-direct {p0}, Lo/dkw;->f()V

    .line 1510
    goto :goto_3

    .line 1511
    :cond_d
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_e

    .line 1512
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$10;

    invoke-direct {v1, p0}, Lo/dkw$10;-><init>(Lo/dkw;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_3

    .line 1520
    :cond_e
    invoke-virtual {p0}, Lo/dkw;->b()V

    .line 1525
    :cond_f
    :goto_3
    return-void
.end method

.method static synthetic c(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->g(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lo/dkw;Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->b(Ljava/lang/String;)V

    return-void
.end method

.method private c([B)V
    .locals 6

    .line 2371
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_0

    .line 2372
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 2373
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackErrorCode messageHex = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2374
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 2375
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2376
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0, v5}, Lo/dkw;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2379
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->O:I

    return p1
.end method

.method static synthetic d(Lo/dkw;)Ljava/lang/String;
    .locals 1

    .line 66
    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/dkw;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 66
    iput-object p1, p0, Lo/dkw;->n:Ljava/lang/String;

    return-object p1
.end method

.method private d(II)V
    .locals 13

    .line 375
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 376
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 377
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 380
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 381
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 382
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 383
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 384
    int-to-long v0, p1

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v6

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 386
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v8, v0, 0x2

    .line 387
    int-to-long v0, p2

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v9

    .line 388
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 389
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v8, v0

    .line 390
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x83

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 391
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 393
    invoke-static {v12}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 394
    invoke-static {v12}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 397
    invoke-direct {p0, v4}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 398
    return-void
.end method

.method private d(ILo/dkh;)V
    .locals 4

    .line 982
    invoke-virtual {p2}, Lo/dkh;->e()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_2

    invoke-virtual {p2}, Lo/dkh;->e()[B

    move-result-object v0

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_2

    .line 983
    invoke-virtual {p2}, Lo/dkh;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, 0xa

    if-ne v1, v0, :cond_2

    invoke-virtual {p2}, Lo/dkh;->e()[B

    move-result-object v0

    const/4 v1, 0x1

    aget-byte v0, v0, v1

    const/4 v1, 0x5

    if-ne v1, v0, :cond_2

    .line 984
    invoke-virtual {p2}, Lo/dkh;->e()[B

    move-result-object v0

    const/4 v1, 0x3

    aget-byte v0, v0, v1

    const/4 v1, 0x4

    if-ne v1, v0, :cond_2

    .line 985
    invoke-direct {p0}, Lo/dkw;->i()V

    .line 986
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 987
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 988
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 990
    iget v0, p0, Lo/dkw;->N:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dkw;->N:I

    .line 991
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "applyDataFromDeviceHandle() sendNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->N:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 992
    iget v0, p0, Lo/dkw;->N:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    .line 995
    invoke-direct {p0}, Lo/dkw;->m()V

    .line 996
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 997
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 999
    :cond_0
    invoke-direct {p0}, Lo/dkw;->l()V

    .line 1000
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->N:I

    goto :goto_0

    .line 1002
    :cond_1
    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    iget v1, p0, Lo/dkw;->M:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/dkw;->c(II)V

    goto :goto_0

    .line 1005
    :cond_2
    invoke-direct {p0, p2}, Lo/dkw;->e(Lo/dkh;)V

    .line 1007
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/Object;)V
    .locals 6

    .line 326
    move-object v4, p1

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 328
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 329
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 330
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 331
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "error ,filelist is null"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 333
    :cond_0
    return-void

    .line 335
    :cond_1
    const/4 v5, 0x0

    :goto_0
    :try_start_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 336
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportTrackPostProcessing() isSupportTrackPostProcessing "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->T:Lo/dla;

    invoke-virtual {v3}, Lo/dla;->b()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    invoke-virtual {v0}, Lo/dla;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 338
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    goto :goto_1

    .line 341
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 342
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 345
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 346
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 350
    :cond_4
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintFileNameHandle() allFileListName "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->A:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 352
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintFileNameHandle fileList() = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 354
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 355
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_2

    .line 358
    :cond_5
    iget v0, p0, Lo/dkw;->M:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/dkw;->L:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    .line 359
    iget v0, p0, Lo/dkw;->M:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dkw;->M:I

    .line 360
    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    iget v1, p0, Lo/dkw;->M:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/dkw;->K:I

    invoke-direct {p0, v0, v1}, Lo/dkw;->c(II)V

    goto :goto_2

    .line 362
    :cond_6
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getMaintParameters()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    invoke-direct {p0}, Lo/dkw;->k()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 368
    :cond_7
    :goto_2
    goto :goto_3

    .line 366
    :catch_0
    move-exception v4

    .line 367
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---getMaintFileNameHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :goto_3
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 7

    .line 682
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 683
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 684
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 686
    :cond_0
    invoke-direct {p0}, Lo/dkw;->i()V

    .line 687
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 688
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 689
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 691
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 692
    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 693
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 694
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 695
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 698
    invoke-direct {p0, v6}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 699
    return-void
.end method

.method static synthetic d(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lo/dkw;Ljava/lang/Object;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lo/dkw;->c(Ljava/lang/Object;I)V

    return-void
.end method

.method static synthetic d(Lo/dkw;[B)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->c([B)V

    return-void
.end method

.method static synthetic e(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->w:I

    return p1
.end method

.method static synthetic e(Lo/dkw;)Ljava/util/Map;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->s:Ljava/util/Map;

    return-object v0
.end method

.method public static e()Lo/dkw;
    .locals 2

    .line 161
    sget-object v0, Lo/dkw;->a:Lo/dkw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 162
    new-instance v0, Lo/dkw;

    invoke-direct {v0}, Lo/dkw;-><init>()V

    sput-object v0, Lo/dkw;->a:Lo/dkw;

    .line 164
    :cond_0
    sget-object v0, Lo/dkw;->a:Lo/dkw;

    return-object v0
.end method

.method private e(I)V
    .locals 4

    .line 174
    iget-object v0, p0, Lo/dkw;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iput-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    .line 175
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4fee\u6539\u72b6\u6001\u673a\u72b6\u6001\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ||STATE_GPS = 0 STATE_SLEEP_DFX = 1"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    return-void
.end method

.method private e(II)V
    .locals 14

    .line 1585
    const-string v0, "1"

    const-string v1, "HWFileTransferTaskManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getPeriodRRIFile==="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1586
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1587
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1588
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1591
    :cond_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1592
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1593
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1595
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1596
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1598
    int-to-long v0, p1

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v7

    .line 1599
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x10

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1600
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v9, v0, 0x2

    .line 1601
    move/from16 v0, p2

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v10

    .line 1602
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x11

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1603
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v9, v0

    .line 1604
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8f

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 1606
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.1 getPeriodRRIFile---startTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---endTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.1 getPeriodRRIFile---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1610
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v13

    .line 1612
    array-length v0, v13

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1613
    invoke-virtual {v5, v13}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1615
    invoke-direct {p0, v5}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1616
    return-void
.end method

.method private e(Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;)V
    .locals 7

    .line 1271
    invoke-virtual {p1}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->getIndex()I

    move-result v4

    .line 1273
    iget v0, p0, Lo/dkw;->S:I

    if-ne v4, v0, :cond_0

    .line 1274
    invoke-virtual {p1}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 1276
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v6

    .line 1277
    iget v0, p0, Lo/dkw;->x:I

    array-length v1, v6

    add-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->x:I

    .line 1278
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1279
    iget v0, p0, Lo/dkw;->P:I

    array-length v1, v6

    add-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->P:I

    .line 1280
    iget v0, p0, Lo/dkw;->S:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dkw;->S:I

    .line 1282
    goto :goto_0

    .line 1283
    :cond_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepOrDFXPlayData2List() lost  index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    :goto_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepOrDFXPlayData2List() currentApplyDataSize ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+donePackatgeSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",currentSleepOrDFXFrameNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->S:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1288
    iget v0, p0, Lo/dkw;->z:I

    iget v1, p0, Lo/dkw;->x:I

    if-ne v0, v1, :cond_11

    .line 1289
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 1290
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 1292
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_11

    .line 1293
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1295
    iget v0, p0, Lo/dkw;->P:I

    iput v0, p0, Lo/dkw;->w:I

    .line 1296
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1297
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget-object v1, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/dkw;->n:Ljava/lang/String;

    iget-object v3, p0, Lo/dkw;->j:Ljava/util/Date;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->writeLogToFile(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Date;)V

    .line 1300
    :cond_1
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1302
    iget v0, p0, Lo/dkw;->y:I

    if-gtz v0, :cond_5

    .line 1303
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepOrDFXPlayData2List() lost  package error!!!!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1304
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 1305
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1306
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1307
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 1309
    :cond_2
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_3

    .line 1310
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 1312
    :cond_3
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "package error"

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1314
    :cond_4
    return-void

    .line 1317
    :cond_5
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "***addSleepOrDFXPlayData2List() send ok  doneTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", + file name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1318
    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    const-string v1, "sleep_data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1319
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "progress is sleep_data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1320
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget v0, p0, Lo/dkw;->y:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget v0, p0, Lo/dkw;->P:I

    iget v1, p0, Lo/dkw;->y:I

    if-gt v0, v1, :cond_6

    .line 1321
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "progress myCallback is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1322
    new-instance v5, Lo/dkb;

    invoke-direct {v5}, Lo/dkb;-><init>()V

    .line 1323
    iget v0, p0, Lo/dkw;->w:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p0, Lo/dkw;->y:I

    div-int/2addr v0, v1

    invoke-virtual {v5, v0}, Lo/dkb;->d(I)V

    .line 1324
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x4e20

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1327
    :cond_6
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_7

    .line 1328
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget v0, p0, Lo/dkw;->y:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget v0, p0, Lo/dkw;->P:I

    iget v1, p0, Lo/dkw;->y:I

    if-gt v0, v1, :cond_7

    .line 1329
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dfx  progress myCallback is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    iget v0, p0, Lo/dkw;->w:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p0, Lo/dkw;->y:I

    div-int v5, v0, v1

    .line 1331
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dkw;->i:I

    iget-object v3, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dkw;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1335
    :cond_7
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->y:I

    if-lt v0, v1, :cond_f

    .line 1338
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 1339
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 1340
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1343
    :cond_8
    const/4 v5, 0x0

    .line 1345
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 1346
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->transferFileEndProcess()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v5

    .line 1349
    :cond_9
    const/4 v0, 0x0

    if-eq v0, v5, :cond_a

    .line 1350
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepOrDFXPlayData2List transferFileEndProcess sendDeviceData ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1351
    invoke-direct {p0, v5}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1354
    :cond_a
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 1355
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_b

    .line 1356
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$12;

    invoke-direct {v1, p0}, Lo/dkw$12;-><init>(Lo/dkw;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_1

    .line 1363
    :cond_b
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_c

    .line 1364
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$20;

    invoke-direct {v1, p0}, Lo/dkw$20;-><init>(Lo/dkw;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_1

    .line 1372
    :cond_c
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    if-eqz v0, :cond_d

    .line 1373
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepOrDFXPlayData2List  maintenanceSleepOrDFXUtil instanceof PeriodRRIFileUtil"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1374
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$4;

    invoke-direct {v1, p0}, Lo/dkw$4;-><init>(Lo/dkw;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_1

    .line 1383
    :cond_d
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1387
    :cond_e
    :goto_1
    goto :goto_2

    .line 1388
    :cond_f
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_10

    .line 1389
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$5;

    invoke-direct {v1, p0}, Lo/dkw$5;-><init>(Lo/dkw;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_2

    .line 1397
    :cond_10
    invoke-virtual {p0}, Lo/dkw;->b()V

    .line 1402
    :cond_11
    :goto_2
    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 5

    .line 407
    move-object v0, p1

    :try_start_0
    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    .line 408
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 409
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 410
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 411
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_0

    .line 413
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 415
    :cond_0
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "error ,filelist is null"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 417
    :cond_1
    return-void

    .line 419
    :cond_2
    :try_start_1
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lo/dkw;->i:I

    .line 421
    iget v0, p0, Lo/dkw;->J:I

    if-eqz v0, :cond_3

    .line 422
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget-object v1, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    iget v2, p0, Lo/dkw;->J:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->filtertFile(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    .line 424
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 425
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintSleepOrDFXFileNameHandle() allFileListName "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->A:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 427
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintSleepOrDFXFileNameHandle fileList() = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 429
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 430
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 435
    :cond_4
    invoke-direct {p0}, Lo/dkw;->h()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 439
    :cond_5
    :goto_0
    goto :goto_1

    .line 437
    :catch_0
    move-exception v4

    .line 438
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---getMaintSleepOrDFXFileNameHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    :goto_1
    return-void
.end method

.method private e(Lo/dkh;)V
    .locals 13

    .line 1138
    invoke-virtual {p1}, Lo/dkh;->b()I

    move-result v5

    .line 1140
    iget v0, p0, Lo/dkw;->O:I

    if-ne v5, v0, :cond_1

    .line 1142
    invoke-virtual {p1}, Lo/dkh;->e()[B

    move-result-object v6

    .line 1143
    iget v0, p0, Lo/dkw;->x:I

    array-length v1, v6

    add-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->x:I

    .line 1145
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List() fileType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1146
    iget v0, p0, Lo/dkw;->l:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1147
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1151
    :cond_0
    :try_start_0
    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 1152
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1156
    goto :goto_0

    .line 1154
    :catch_0
    move-exception v7

    .line 1155
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception  is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1158
    :goto_0
    iget v0, p0, Lo/dkw;->w:I

    array-length v1, v6

    add-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->w:I

    .line 1159
    iget v0, p0, Lo/dkw;->O:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dkw;->O:I

    .line 1160
    goto :goto_1

    .line 1161
    :cond_1
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List() lost  index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1163
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->x:I

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    iget v0, p0, Lo/dkw;->x:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1164
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->x:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->w:I

    .line 1165
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 1166
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 1168
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1173
    :cond_2
    :goto_1
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List() donePackatgeSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",currentFrameNum"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->O:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " doneTotalSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1174
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v6

    .line 1175
    if-nez v6, :cond_3

    const/4 v7, 0x0

    goto :goto_2

    :cond_3
    const-string v0, "AW"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    .line 1176
    :goto_2
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    iget v0, p0, Lo/dkw;->z:I

    iget v1, p0, Lo/dkw;->x:I

    if-eq v0, v1, :cond_4

    if-eqz v7, :cond_c

    .line 1177
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 1178
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 1179
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1180
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1182
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send ok writeLogToFile fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "+maintLogs = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "+gpsLogs = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",doneTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->Z:Z

    .line 1187
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->y:I

    if-lt v0, v1, :cond_b

    .line 1190
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 1192
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_a

    .line 1194
    const/4 v8, 0x0

    .line 1195
    const/4 v9, 0x0

    :goto_3
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 1196
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    add-int/2addr v8, v0

    .line 1195
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 1198
    :cond_5
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 1199
    const/4 v10, 0x0

    :goto_4
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v10, v0, :cond_6

    .line 1200
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1199
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 1202
    :cond_6
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    invoke-virtual {v0}, Lo/dla;->b()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1204
    :try_start_1
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v10

    .line 1205
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Lo/dla;->b([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1208
    goto :goto_5

    .line 1206
    :catch_1
    move-exception v10

    .line 1207
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List3() e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1209
    :goto_5
    iget-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSFrameHeader([B)Lo/dki;

    move-result-object v10

    .line 1210
    iget-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-virtual {v0, v10}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSMapType(Lo/dki;)I

    move-result v11

    .line 1211
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List()!,mapType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1212
    iget-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1213
    iget-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget v2, p0, Lo/dkw;->l:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSMap([BI)Ljava/util/Map;

    move-result-object v12

    .line 1214
    iget-object v0, p0, Lo/dkw;->s:Ljava/util/Map;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1215
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1216
    goto/16 :goto_7

    .line 1218
    :cond_7
    :try_start_2
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v10

    .line 1220
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_8

    .line 1222
    iget-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSFrameHeader([B)Lo/dki;

    move-result-object v11

    .line 1223
    iget-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-virtual {v0, v11}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSMapType(Lo/dki;)I

    move-result v12

    .line 1224
    iget-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-virtual {v0, v11}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->isSupportAltitude(Lo/dki;)Z

    move-result v0

    iput-boolean v0, p0, Lo/dkw;->U:Z

    .line 1225
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List()!,mapType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,isSupportAltitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dkw;->U:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1226
    iget-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dkj;->d(I)V

    .line 1230
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Lo/dla;->b([BLjava/lang/String;)V

    .line 1231
    iget-object v0, p0, Lo/dkw;->r:Ljava/util/Map;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/dkw;->T:Lo/dla;

    invoke-virtual {v2, v10}, Lo/dla;->a([B)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1232
    goto/16 :goto_6

    .line 1233
    :cond_8
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Lo/dla;->b([BLjava/lang/String;)V

    .line 1234
    iget-object v0, p0, Lo/dkw;->T:Lo/dla;

    iget-object v1, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/dkj;

    invoke-virtual {v2}, Lo/dkj;->e()Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, p0, Lo/dkw;->U:Z

    new-instance v4, Lo/dkw$14;

    invoke-direct {v4, p0}, Lo/dkw$14;-><init>(Lo/dkw;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dla;->e(Ljava/lang/String;Ljava/lang/String;ZLo/yg;)I

    move-result v11

    .line 1244
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List()!,tatatee trackProcess result ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1245
    if-eqz v11, :cond_9

    .line 1246
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1247
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1248
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 1249
    invoke-direct {p0}, Lo/dkw;->f()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1251
    :cond_9
    return-void

    .line 1255
    :goto_6
    goto :goto_7

    .line 1253
    :catch_2
    move-exception v10

    .line 1254
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPlayData2List2() e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1257
    :goto_7
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1258
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 1260
    :cond_a
    invoke-direct {p0}, Lo/dkw;->f()V

    goto :goto_8

    .line 1262
    :cond_b
    invoke-virtual {p0}, Lo/dkw;->a()V

    .line 1265
    :cond_c
    :goto_8
    return-void
.end method

.method static synthetic e(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->d(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic e(Lo/dkw;Ljava/lang/Object;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lo/dkw;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method static synthetic e(Lo/dkw;Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->d(Ljava/lang/String;)V

    return-void
.end method

.method private e([B)V
    .locals 9

    .line 2082
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 2083
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2084
    const-string v0, "000186A7"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2086
    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2087
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2088
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 2089
    const/16 v0, 0xa

    iput v0, v3, Landroid/os/Message;->what:I

    .line 2090
    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v3, Landroid/os/Message;->arg1:I

    .line 2091
    const/16 v0, 0x2713

    iput v0, v3, Landroid/os/Message;->arg2:I

    .line 2092
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2094
    :cond_0
    return-void

    .line 2099
    :cond_1
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 2100
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 2101
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2102
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 2103
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2104
    const/4 v0, 0x3

    new-array v6, v0, [Ljava/lang/Object;

    .line 2105
    iget-object v0, p0, Lo/dkw;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 2106
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2108
    goto :goto_0

    .line 2109
    :cond_2
    iget-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 2110
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2112
    goto :goto_1

    .line 2113
    :cond_3
    iget-object v0, p0, Lo/dkw;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 2114
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2115
    goto :goto_2

    .line 2116
    :cond_4
    const/4 v0, 0x0

    aput-object v3, v6, v0

    .line 2117
    const/4 v0, 0x1

    aput-object v4, v6, v0

    .line 2118
    const/4 v0, 0x2

    aput-object v5, v6, v0

    .line 2119
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x27d8

    invoke-interface {v0, v1, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2121
    :cond_5
    return-void
.end method

.method static synthetic e(Lo/dkw;[B)Z
    .locals 1

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->a([B)Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->W:I

    return p1
.end method

.method static synthetic f(Lo/dkw;)Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    return-object v0
.end method

.method private f()V
    .locals 6

    .line 1118
    iget v0, p0, Lo/dkw;->X:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1119
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transfer next file."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1120
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1123
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1125
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1126
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1127
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1128
    invoke-static {v4}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1129
    invoke-static {v4}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1131
    invoke-direct {p0, v5}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1132
    return-void
.end method

.method private f(Ljava/lang/Object;)V
    .locals 5

    .line 1040
    move-object v4, p1

    :try_start_0
    check-cast v4, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    .line 1042
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 1044
    invoke-direct {p0, v4}, Lo/dkw;->e(Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;)V

    goto :goto_0

    .line 1046
    :cond_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != maintLog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1050
    :goto_0
    goto :goto_1

    .line 1048
    :catch_0
    move-exception v4

    .line 1049
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---queryOtaAllowHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    :goto_1
    return-void
.end method

.method static synthetic f(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private g(Ljava/lang/Object;)V
    .locals 5

    .line 1624
    move-object v0, p1

    :try_start_0
    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 1626
    const/4 v0, 0x0

    aget v0, v4, v0

    const v1, 0x186a0

    if-eq v1, v0, :cond_0

    .line 1627
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 1628
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1629
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x0

    aget v2, v4, v2

    invoke-direct {p0, v2}, Lo/dkw;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1634
    :cond_0
    goto :goto_0

    .line 1632
    :catch_0
    move-exception v4

    .line 1633
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---errorCodeHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1635
    :goto_0
    return-void
.end method

.method static synthetic g(Lo/dkw;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lo/dkw;->f()V

    return-void
.end method

.method static synthetic g(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->i(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic h(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->V:I

    return p1
.end method

.method static synthetic h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 529
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 530
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 531
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 538
    :cond_0
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 539
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->maintParametersCommand()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v4

    .line 541
    invoke-direct {p0, v4}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 543
    :cond_1
    return-void
.end method

.method private h(Ljava/lang/Object;)V
    .locals 6

    .line 707
    move-object v5, p1

    :try_start_0
    check-cast v5, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    .line 708
    invoke-virtual {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->getFileSize()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lo/dkw;->y:I

    .line 709
    invoke-virtual {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->getFileCrc()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dkw;->C:J

    .line 710
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " querySleepOrDFXFileInformationHandle() ok, fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", fileCrc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dkw;->C:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    iget v0, p0, Lo/dkw;->y:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 712
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 713
    iget-object v0, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 715
    :cond_0
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 716
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 719
    :cond_1
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_2

    iget v0, p0, Lo/dkw;->F:I

    const/16 v1, 0xa

    if-eq v1, v0, :cond_2

    .line 720
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget v0, p0, Lo/dkw;->y:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget v0, p0, Lo/dkw;->P:I

    iget v1, p0, Lo/dkw;->y:I

    if-gt v0, v1, :cond_2

    .line 721
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dfx  progress myCallback is not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wearhomeactivity:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dkw;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dkw;->i:I

    iget-object v3, p0, Lo/dkw;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dkw;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 726
    :cond_2
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lo/dkw;->j:Ljava/util/Date;

    .line 727
    invoke-virtual {p0}, Lo/dkw;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 731
    :cond_3
    :goto_0
    goto :goto_1

    .line 729
    :catch_0
    move-exception v5

    .line 730
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---querySleepOrDFXFileInformationHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    :goto_1
    return-void
.end method

.method static synthetic h(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->e(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic i(Lo/dkw;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/dkw;->S:I

    return p1
.end method

.method private i()V
    .locals 2

    .line 1720
    iget v0, p0, Lo/dkw;->v:I

    iput v0, p0, Lo/dkw;->z:I

    .line 1721
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->y:I

    .line 1722
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->w:I

    .line 1723
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->P:I

    .line 1724
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->Q:I

    .line 1725
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 1726
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dkw;->C:J

    .line 1727
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1728
    iget-object v0, p0, Lo/dkw;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1729
    return-void
.end method

.method private i(Ljava/lang/Object;)V
    .locals 8

    .line 893
    move-object v0, p1

    :try_start_0
    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 894
    const/4 v5, -0x1

    .line 895
    iget v6, p0, Lo/dkw;->Q:I

    .line 896
    array-length v0, v4

    if-lez v0, :cond_0

    .line 897
    const/4 v0, 0x0

    aget v5, v4, v0

    .line 900
    :cond_0
    array-length v0, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 901
    const/4 v0, 0x1

    aget v6, v4, v0

    .line 904
    :cond_1
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_2

    .line 906
    iget v6, p0, Lo/dkw;->Q:I

    .line 910
    :cond_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---applySleepOrDFXDataHandle is[0] = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is[1] = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " requestApplyOffset = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->Q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 912
    const v0, 0x186a0

    if-ne v0, v5, :cond_4

    .line 913
    iget v0, p0, Lo/dkw;->Q:I

    if-ne v6, v0, :cond_3

    .line 914
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->S:I

    .line 915
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 916
    iget v0, p0, Lo/dkw;->w:I

    iput v0, p0, Lo/dkw;->P:I

    .line 917
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 918
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 919
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 920
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 921
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    iget v1, p0, Lo/dkw;->I:I

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 924
    :cond_3
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applySleepOrDFXDataHandle responseApplyOffset != requestApplyOffset throw error package !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 927
    :cond_4
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 928
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 929
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_5

    .line 930
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b  0a04\u8fd4\u56de\u9519\u8bef \u4fdd\u5b58\u5df2\u91c7\u96c6\u65e5\u5fd7\u5230\u672c\u5730 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 931
    move v7, v5

    .line 932
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$8;

    invoke-direct {v1, p0, v7}, Lo/dkw$8;-><init>(Lo/dkw;I)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 939
    goto :goto_0

    .line 940
    :cond_5
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 941
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_6

    .line 942
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 944
    :cond_6
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 950
    :cond_7
    :goto_0
    goto :goto_1

    .line 948
    :catch_0
    move-exception v4

    .line 949
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---applySleepOrDFXDataHandle errorCodeHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    :goto_1
    return-void
.end method

.method static synthetic i(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic i(Lo/dkw;)Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lo/dkw;->B:Z

    return v0
.end method

.method static synthetic k(Lo/dkw;)Ljava/util/List;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    return-object v0
.end method

.method private k()V
    .locals 8

    .line 470
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 471
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 472
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 474
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 475
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 476
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 478
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 480
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v7

    .line 482
    invoke-virtual {v4, v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 483
    array-length v0, v7

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 486
    invoke-direct {p0, v4}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 487
    return-void
.end method

.method private k(Ljava/lang/Object;)V
    .locals 5

    .line 1642
    move-object v0, p1

    :try_start_0
    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 1644
    const/4 v0, 0x0

    aget v0, v4, v0

    const v1, 0x186a0

    if-eq v1, v0, :cond_1

    .line 1645
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 1646
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1647
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_0

    .line 1648
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b  \u56de\u8c03\u5931\u8d25 \u4fdd\u5b58\u5df2\u91c7\u96c6\u65e5\u5fd7\u5230\u672c\u5730 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1649
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$7;

    invoke-direct {v1, p0, v4}, Lo/dkw$7;-><init>(Lo/dkw;[I)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_0

    .line 1657
    :cond_0
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 1658
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x0

    aget v2, v4, v2

    invoke-direct {p0, v2}, Lo/dkw;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1664
    :cond_1
    :goto_0
    goto :goto_1

    .line 1662
    :catch_0
    move-exception v4

    .line 1663
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---errorCodeHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1665
    :goto_1
    return-void
.end method

.method static synthetic k(Lo/dkw;Ljava/lang/Object;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/dkw;->f(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic l(Lo/dkw;)Ljava/util/Map;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    return-object v0
.end method

.method private l()V
    .locals 8

    .line 2467
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 2468
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 2469
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 2470
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2471
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2472
    const/4 v0, 0x3

    new-array v5, v0, [Ljava/lang/Object;

    .line 2473
    iget-object v0, p0, Lo/dkw;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 2474
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2476
    goto :goto_0

    .line 2477
    :cond_0
    iget-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 2478
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2480
    goto :goto_1

    .line 2481
    :cond_1
    iget-object v0, p0, Lo/dkw;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 2482
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2483
    goto :goto_2

    .line 2484
    :cond_2
    const/4 v0, 0x0

    aput-object v2, v5, v0

    .line 2485
    const/4 v0, 0x1

    aput-object v3, v5, v0

    .line 2486
    const/4 v0, 0x2

    aput-object v4, v5, v0

    .line 2487
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x27d8

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2489
    :cond_3
    return-void
.end method

.method static synthetic m(Lo/dkw;)Ljava/util/Map;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->r:Ljava/util/Map;

    return-object v0
.end method

.method private m()V
    .locals 0

    .line 2453
    return-void
.end method

.method static synthetic n(Lo/dkw;)I
    .locals 2

    .line 66
    iget v0, p0, Lo/dkw;->p:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/dkw;->p:I

    return v0
.end method

.method private n()Ljava/lang/String;
    .locals 5

    .line 1798
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dkw;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1799
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportStatusFileList result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1800
    return-object v4
.end method

.method static synthetic o(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->p:I

    return v0
.end method

.method static synthetic p(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->l:I

    return v0
.end method

.method private p()V
    .locals 2

    .line 2457
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->x:I

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lo/dkw;->x:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2458
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->x:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/dkw;->w:I

    .line 2459
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 2460
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->x:I

    .line 2462
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2464
    :cond_0
    return-void
.end method

.method static synthetic q(Lo/dkw;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lo/dkw;->l()V

    return-void
.end method

.method static synthetic r(Lo/dkw;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lo/dkw;->m()V

    return-void
.end method

.method static synthetic s(Lo/dkw;)Ljava/util/ArrayList;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->t:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic t(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->x:I

    return v0
.end method

.method static synthetic u(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->w:I

    return v0
.end method

.method static synthetic v(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->I:I

    return v0
.end method

.method static synthetic w(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->V:I

    return v0
.end method

.method static synthetic x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/dkw;->d:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    return-object v0
.end method

.method static synthetic y(Lo/dkw;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/dkw;->z:I

    return v0
.end method

.method static synthetic z(Lo/dkw;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lo/dkw;->p()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1531
    iget v0, p0, Lo/dkw;->y:I

    iget v1, p0, Lo/dkw;->w:I

    sub-int v4, v0, v1

    .line 1532
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getApplyDataFromDevice spareSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1533
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getApplyDataFromDevice() doneTotalSize "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1534
    iget v0, p0, Lo/dkw;->w:I

    iget v1, p0, Lo/dkw;->v:I

    rem-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget v0, p0, Lo/dkw;->y:I

    if-ne v4, v0, :cond_2

    .line 1535
    :cond_0
    iget v0, p0, Lo/dkw;->v:I

    if-ge v4, v0, :cond_1

    .line 1537
    iput v4, p0, Lo/dkw;->z:I

    .line 1538
    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    iget v1, p0, Lo/dkw;->w:I

    iget v2, p0, Lo/dkw;->z:I

    const-string v3, ""

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dkw;->b(Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_0

    .line 1541
    :cond_1
    iget v0, p0, Lo/dkw;->v:I

    iput v0, p0, Lo/dkw;->z:I

    .line 1542
    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    iget v1, p0, Lo/dkw;->w:I

    iget v2, p0, Lo/dkw;->z:I

    const-string v3, ""

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dkw;->b(Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_0

    .line 1545
    :cond_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getApplyDataFromDevice fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", maxApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1547
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;IILjava/lang/String;)V
    .locals 11

    .line 823
    const/4 v0, 0x1

    iput v0, p0, Lo/dkw;->X:I

    .line 824
    invoke-static {}, Lo/dad;->c()Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getSuspend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 825
    iget-object v0, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 826
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.4 \u4efb\u52a1\u7531\u4e8e\u4f18\u5148\u7ea7\u8f83\u4f4e\u88ab\u4e2d\u65ad\uff0c\u4efb\u52a1\u7c7b\u578b\u4e3a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 828
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 830
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_0

    .line 831
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4efb\u52a1\u7531\u4e8e\u4f18\u5148\u7ea7\u8f83\u4f4e\u88ab\u4e2d\u65ad \u4fdd\u5b58\u5df2\u91c7\u96c6\u65e5\u5fd7\u5230\u672c\u5730\uff0c\u4efb\u52a1\u5165\u53e3\u662f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getTaskType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dkw$6;

    invoke-direct {v1, p0}, Lo/dkw$6;-><init>(Lo/dkw;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto/16 :goto_1

    .line 840
    :cond_0
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_1

    .line 842
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 844
    :cond_1
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const v2, 0x19643

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 847
    :cond_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenanceCallback is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 851
    :cond_3
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 854
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 855
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    iget v1, p0, Lo/dkw;->I:I

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 858
    :cond_4
    iput p2, p0, Lo/dkw;->Q:I

    .line 859
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 860
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 861
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p2

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 862
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p3

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 864
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v8

    .line 867
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 868
    const-string v0, "AW"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 869
    move-object v9, v5

    goto :goto_0

    .line 871
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 874
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 877
    :goto_0
    new-instance v10, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v10}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 878
    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 879
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 880
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 881
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 884
    invoke-direct {p0, v10}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 886
    :goto_1
    return-void
.end method

.method public b()V
    .locals 7

    .line 1553
    iget v0, p0, Lo/dkw;->y:I

    iget v1, p0, Lo/dkw;->w:I

    sub-int v4, v0, v1

    .line 1554
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter getSleepOrDFXApplyDataFromDevice spareSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1555
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v5

    .line 1556
    const/4 v6, 0x0

    .line 1557
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1558
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepOrDFXApplyDataFromDevice version : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1559
    const-string v0, "AW"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1560
    const/4 v6, 0x1

    .line 1564
    :cond_0
    iget v0, p0, Lo/dkw;->z:I

    if-le v4, v0, :cond_1

    if-eqz v6, :cond_2

    .line 1566
    :cond_1
    iput v4, p0, Lo/dkw;->z:I

    .line 1567
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepOrDFXApplyDataFromDevice requeset final package currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1568
    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    iget v1, p0, Lo/dkw;->w:I

    iget v2, p0, Lo/dkw;->z:I

    const-string v3, ""

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dkw;->a(Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_0

    .line 1571
    :cond_2
    iget v0, p0, Lo/dkw;->v:I

    iput v0, p0, Lo/dkw;->z:I

    .line 1572
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepOrDFXApplyDataFromDevice requeset next package currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkw;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1573
    iget-object v0, p0, Lo/dkw;->n:Ljava/lang/String;

    iget v1, p0, Lo/dkw;->w:I

    iget v2, p0, Lo/dkw;->z:I

    const-string v3, ""

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dkw;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 1575
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;IILjava/lang/String;)V
    .locals 11

    .line 739
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->X:I

    .line 740
    invoke-static {}, Lo/dad;->c()Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getSuspend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 741
    iget-object v0, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 742
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.10.4 \u4efb\u52a1\u7531\u4e8e\u4f18\u5148\u7ea7\u8f83\u4f4e\u88ab\u4e2d\u65ad\uff0c\u4efb\u52a1\u7c7b\u578b\u4e3a GPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    invoke-direct {p0}, Lo/dkw;->m()V

    .line 745
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 746
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 747
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dkw;->n()Ljava/lang/String;

    move-result-object v1

    const v2, 0x19643

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 749
    :cond_0
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 750
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto/16 :goto_2

    .line 753
    :cond_1
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 754
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 755
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 757
    :cond_2
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 758
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 759
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p2

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 760
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p3

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 762
    iget-object v0, p0, Lo/dkw;->H:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v8

    .line 765
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 766
    const-string v0, "AW"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 767
    move-object v9, v5

    goto :goto_0

    .line 769
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 772
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 774
    :goto_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.10.4 applyDataFromDevice : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " version:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v8, :cond_5

    const-string v3, "null"

    goto :goto_1

    :cond_5
    move-object v3, v8

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    new-instance v10, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v10}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 777
    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 778
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 779
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 780
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 782
    invoke-direct {p0, v10}, Lo/dkw;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 784
    :cond_6
    :goto_2
    return-void
.end method

.method public c()V
    .locals 4

    .line 1757
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetSleepOrDFXMaintenance()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1758
    invoke-direct {p0}, Lo/dkw;->i()V

    .line 1759
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1760
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1762
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lo/dkw;->S:I

    .line 1763
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->B:Z

    .line 1764
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 1765
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 1766
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 1767
    const/16 v0, 0x1388

    iput v0, p0, Lo/dkw;->I:I

    .line 1768
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dkw;->v:I

    .line 1769
    const/16 v0, 0xf4

    iput v0, p0, Lo/dkw;->R:I

    .line 1770
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1771
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 1772
    return-void
.end method

.method public d()V
    .locals 4

    .line 1735
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetMaintenance()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1736
    invoke-direct {p0}, Lo/dkw;->i()V

    .line 1737
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->O:I

    .line 1738
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->B:Z

    .line 1739
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 1740
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 1741
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 1742
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    .line 1743
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->K:I

    .line 1744
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->M:I

    .line 1745
    iget-object v0, p0, Lo/dkw;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1746
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1747
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 1748
    const/16 v0, 0x1388

    iput v0, p0, Lo/dkw;->I:I

    .line 1749
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dkw;->v:I

    .line 1750
    const/16 v0, 0xf4

    iput v0, p0, Lo/dkw;->R:I

    .line 1751
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 179
    iget-boolean v0, p0, Lo/dkw;->B:Z

    if-eqz v0, :cond_0

    .line 180
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMainteFile isMainting, so return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    return-void

    .line 183
    :cond_0
    iput-object p2, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 184
    iput-object p1, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    .line 185
    invoke-static {p1}, Lo/dad;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    .line 186
    iget-object v0, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getIsFromAbout()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 187
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkw;->c:Z

    goto :goto_0

    .line 189
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->c:Z

    .line 191
    :goto_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFromAbout === "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw;->e:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getIsFromAbout()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkw;->B:Z

    .line 194
    const/16 v0, 0x3f6

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 196
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 198
    iget-object v0, p0, Lo/dkw;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 199
    iget-object v0, p0, Lo/dkw;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 200
    iget-object v0, p0, Lo/dkw;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 201
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dkw;->e(I)V

    .line 203
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bf7\u6c42GPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->m:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    .line 207
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->ab:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 209
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getRecordId()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    .line 210
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getGpsType()I

    move-result v0

    iput v0, p0, Lo/dkw;->K:I

    .line 211
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->M:I

    .line 213
    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 214
    iget-object v0, p0, Lo/dkw;->L:Ljava/util/List;

    iget v1, p0, Lo/dkw;->M:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/dkw;->K:I

    invoke-direct {p0, v0, v1}, Lo/dkw;->c(II)V

    goto/16 :goto_1

    .line 216
    :cond_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recordId.size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 219
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 220
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dkw;->e(I)V

    .line 222
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6c42\u53ef\u7ef4\u53ef\u6d4b transferFileInfo.getDeviceMac() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceMac()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , transferFileInfo.getDeviceVersion() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    const/4 v0, 0x1

    iput v0, p0, Lo/dkw;->J:I

    .line 230
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceMac()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->G:Ljava/lang/String;

    .line 231
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->E:Ljava/lang/String;

    .line 232
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceType()I

    move-result v0

    iput v0, p0, Lo/dkw;->F:I

    .line 235
    iget-object v0, p0, Lo/dkw;->G:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lo/dkw;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 236
    :cond_4
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bf7\u6c42\u53ef\u7ef4\u53ef\u6d4b ,parameter is error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 238
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, " parameter is error"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 239
    return-void

    .line 242
    :cond_5
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 243
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u624b\u8868\u53ef\u7ef4\u53ef\u6d4b  \u6ce8\u518c\u56de\u8c03"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->ac:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 247
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDfxLogType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dkw;->a(I)V

    goto/16 :goto_1

    .line 248
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_7

    .line 249
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dkw;->e(I)V

    .line 251
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 254
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->ac:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 256
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6c42\u7cbe\u7ec6\u5316\u7761\u7720 transferFileInfo.getStartTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getStartTime()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,transferFileInfo.getEndTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getEndTime()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 259
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getStartTime()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getEndTime()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/dkw;->d(II)V

    goto/16 :goto_1

    .line 261
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_8

    .line 262
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dkw;->e(I)V

    .line 263
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    move-result-object v0

    iput-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 264
    iget-object v0, p0, Lo/dkw;->o:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 266
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iget-object v1, p0, Lo/dkw;->Y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 267
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6c42\u5468\u671fPeriod_rri\u6587\u4ef6 transferFileInfo.getStartTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getStartTime()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,transferFileInfo.getEndTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getEndTime()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getStartTime()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getEndTime()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/dkw;->e(II)V

    goto :goto_1

    .line 271
    :cond_8
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6c42\u7c7b\u578b\u9519\u8bef transferFileInfo.getType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    invoke-virtual {p0}, Lo/dkw;->d()V

    .line 273
    invoke-virtual {p0}, Lo/dkw;->c()V

    .line 274
    iget-object v0, p0, Lo/dkw;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, " type not found"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 276
    :goto_1
    return-void
.end method

.method public g()V
    .locals 4

    .line 1778
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetDFXMaintenance()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1779
    invoke-direct {p0}, Lo/dkw;->i()V

    .line 1780
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1781
    iget-object v0, p0, Lo/dkw;->h:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1783
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lo/dkw;->S:I

    .line 1784
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkw;->B:Z

    .line 1785
    const/4 v0, 0x0

    iput v0, p0, Lo/dkw;->p:I

    .line 1786
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dkw;->A:Ljava/lang/String;

    .line 1787
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dkw;->D:Ljava/lang/String;

    .line 1788
    const/16 v0, 0x1388

    iput v0, p0, Lo/dkw;->I:I

    .line 1789
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dkw;->v:I

    .line 1790
    const/16 v0, 0xf4

    iput v0, p0, Lo/dkw;->R:I

    .line 1791
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 1792
    return-void
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 2

    .line 1821
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1822
    invoke-static {}, Lo/dlh;->a()Lo/dlh;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dlh;->e([B)V

    .line 1823
    return-void

    .line 1825
    :cond_0
    iget-object v0, p0, Lo/dkw;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1826
    return-void
.end method
