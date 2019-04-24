.class Lcom/huawei/multisimservice/MultiSimService$5;
.super Lo/dsr$c;
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
.field final synthetic a:Lcom/huawei/multisimservice/MultiSimService;


# direct methods
.method constructor <init>(Lcom/huawei/multisimservice/MultiSimService;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    invoke-direct {p0}, Lo/dsr$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .line 183
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim deleteESimProfile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "profileInfoList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/div;->b(Ljava/util/List;)V

    .line 186
    return-void
.end method

.method public a(Lo/dsw;)V
    .locals 4

    .line 130
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim registerCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    iput-object p1, v0, Lcom/huawei/multisimservice/MultiSimService;->e:Lo/dsw;

    .line 132
    return-void
.end method

.method public b()V
    .locals 4

    .line 145
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim getAttachedDeviceMultiSimInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->b(Lcom/huawei/multisimservice/MultiSimService;)V

    .line 147
    return-void
.end method

.method public c(Lo/dsw;)V
    .locals 4

    .line 137
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim unRegisterCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/huawei/multisimservice/MultiSimService;->e:Lo/dsw;

    .line 139
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/div;->c(Lo/dsw;)V

    .line 140
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    .line 153
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim downloadESimProfile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activationCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadESimProfile with app:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v2}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v4

    .line 157
    if-nez v4, :cond_0

    .line 158
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadESimProfile  get HWMultiSimMgr null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-void

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/div;->e(Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    invoke-static {v0}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/div;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.hwmultisim"

    iget-object v1, p0, Lcom/huawei/multisimservice/MultiSimService$5;->a:Lcom/huawei/multisimservice/MultiSimService;

    .line 164
    invoke-static {v1}, Lcom/huawei/multisimservice/MultiSimService;->d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    :cond_1
    invoke-virtual {v4, p1}, Lo/div;->b(Ljava/lang/String;)V

    .line 167
    :cond_2
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 4

    .line 174
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSim multiSimStatusNotifyRequest "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    const-string v0, "MultiSimService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " multiSimStatus="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " MSISDN="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/div;->e(ILjava/lang/String;)V

    .line 177
    return-void
.end method
