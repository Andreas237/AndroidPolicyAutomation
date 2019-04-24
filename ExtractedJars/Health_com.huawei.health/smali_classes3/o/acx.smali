.class public Lo/acx;
.super Lo/afv;
.source "SourceFile"


# instance fields
.field private a:I

.field b:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

.field private c:Lo/abx;

.field private d:Lo/acl;

.field private e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 72
    invoke-direct {p0}, Lo/afv;-><init>()V

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lo/acx;->a:I

    .line 31
    new-instance v0, Lo/acx$4;

    invoke-direct {v0, p0}, Lo/acx$4;-><init>(Lo/acx;)V

    iput-object v0, p0, Lo/acx;->b:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    .line 73
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureController constructor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->getInstance(Landroid/content/Context;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    move-result-object v0

    iput-object v0, p0, Lo/acx;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    .line 75
    return-void
.end method

.method static synthetic b(Lo/acx;)Lo/abx;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/acx;->c:Lo/abx;

    return-object v0
.end method

.method static synthetic c(Lo/acx;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/acx;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    return-object v0
.end method

.method static synthetic d(Lo/acx;)Lo/acl;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/acx;->d:Lo/acl;

    return-object v0
.end method

.method static synthetic e(Lo/acx;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/acx;->a:I

    return v0
.end method

.method static synthetic e(Lo/acx;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/acx;->a:I

    return p1
.end method


# virtual methods
.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 79
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureController prepare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iput-object p1, p0, Lo/acx;->d:Lo/acl;

    .line 81
    iput-object p2, p0, Lo/acx;->c:Lo/abx;

    .line 82
    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 4

    .line 87
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureController start, mStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/acx;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget v0, p0, Lo/acx;->a:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 89
    iget-object v0, p0, Lo/acx;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->wakeupDevice()V

    goto :goto_0

    .line 91
    :cond_0
    iget v0, p0, Lo/acx;->a:I

    if-gez v0, :cond_1

    .line 92
    iget-object v0, p0, Lo/acx;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lo/acx;->b:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    invoke-virtual {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->startTest(Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;)V

    goto :goto_0

    .line 94
    :cond_1
    iget-object v0, p0, Lo/acx;->c:Lo/abx;

    iget-object v1, p0, Lo/acx;->d:Lo/acl;

    iget v2, p0, Lo/acx;->a:I

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 97
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 4

    .line 109
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureController cleanup"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acx;->c:Lo/abx;

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acx;->d:Lo/acl;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acx;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    .line 113
    return-void
.end method

.method public e()V
    .locals 4

    .line 102
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureController ending"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/4 v0, -0x1

    iput v0, p0, Lo/acx;->a:I

    .line 104
    iget-object v0, p0, Lo/acx;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->stopTest()V

    .line 105
    return-void
.end method
