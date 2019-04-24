.class public Lo/dqn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

.field private c:I

.field private d:I

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lo/dqn;->d:I

    .line 13
    const/4 v0, 0x2

    iput v0, p0, Lo/dqn;->c:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqn;->b:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqn;->e:Ljava/util/List;

    .line 22
    iput p1, p0, Lo/dqn;->d:I

    .line 23
    iput p2, p0, Lo/dqn;->c:I

    .line 24
    return-void
.end method

.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lo/dqn;->d:I

    .line 13
    const/4 v0, 0x2

    iput v0, p0, Lo/dqn;->c:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqn;->b:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqn;->e:Ljava/util/List;

    .line 38
    iput p1, p0, Lo/dqn;->d:I

    .line 39
    iput p2, p0, Lo/dqn;->c:I

    .line 40
    iput-object p3, p0, Lo/dqn;->e:Ljava/util/List;

    .line 41
    return-void
.end method

.method public constructor <init>(ILcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lo/dqn;->d:I

    .line 13
    const/4 v0, 0x2

    iput v0, p0, Lo/dqn;->c:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqn;->b:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqn;->e:Ljava/util/List;

    .line 27
    iput p1, p0, Lo/dqn;->d:I

    .line 28
    iput-object p2, p0, Lo/dqn;->b:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    .line 29
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 30
    const-string v0, "AttachedDeviceMgrCommonResult"

    const-string v1, "multiSimDeviceInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    const/4 v0, -0x6

    iput v0, p0, Lo/dqn;->c:I

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getResultCode()I

    move-result v0

    iput v0, p0, Lo/dqn;->c:I

    .line 35
    :goto_0
    return-void
.end method
