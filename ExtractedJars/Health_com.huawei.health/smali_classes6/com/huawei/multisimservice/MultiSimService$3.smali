.class Lcom/huawei/multisimservice/MultiSimService$3;
.super Lo/dst$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/multisimservice/MultiSimService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/multisimservice/MultiSimService;


# direct methods
.method constructor <init>(Lcom/huawei/multisimservice/MultiSimService;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    invoke-direct {p0}, Lo/dst$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 5

    .line 216
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOpenMultiSim.IAttachedDeviceMultiSim downloadESimProfile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activationCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadESimProfile with app:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v2}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v4

    .line 220
    if-nez v4, :cond_0

    .line 221
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadESimProfile  get HWMultiSimMgr null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    return-void

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/div;->e(Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/div;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 227
    invoke-virtual {v4, p1}, Lo/div;->b(Ljava/lang/String;)V

    .line 229
    :cond_1
    return-void
.end method

.method public b(Lo/dta;)V
    .locals 4

    .line 193
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim registerCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    iput-object p1, v0, Lcom/huawei/multisimservice/MultiSimService;->a:Lo/dta;

    .line 195
    return-void
.end method

.method public d()V
    .locals 4

    .line 208
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOpenMultiSim.IAttachedDeviceMultiSim getAttachedDeviceMultiSimInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->b(Lcom/huawei/multisimservice/MultiSimService;)V

    .line 210
    return-void
.end method

.method public d(Lo/dta;)V
    .locals 4

    .line 200
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim unRegisterCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$3;->c:Lcom/huawei/multisimservice/MultiSimService;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/huawei/multisimservice/MultiSimService;->a:Lo/dta;

    .line 202
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/div;->c(Lo/dta;)V

    .line 203
    return-void
.end method
