.class public Lo/aja;
.super Lo/acp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aja$c;,
        Lo/aja$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aja$c;>;"
        }
    .end annotation
.end field

.field public c:Lo/aja$a;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 158
    invoke-direct {p0}, Lo/acp;-><init>()V

    .line 29
    new-instance v0, Lo/aja$a;

    invoke-direct {v0}, Lo/aja$a;-><init>()V

    iput-object v0, p0, Lo/aja;->c:Lo/aja$a;

    .line 158
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 160
    invoke-direct {p0}, Lo/acp;-><init>()V

    .line 29
    new-instance v0, Lo/aja$a;

    invoke-direct {v0}, Lo/aja$a;-><init>()V

    iput-object v0, p0, Lo/aja;->c:Lo/aja$a;

    .line 161
    iput-object p1, p0, Lo/aja;->e:Ljava/lang/String;

    .line 162
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4

    .line 198
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 199
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->k:Ljava/lang/String;

    return-object v0

    .line 201
    :cond_0
    const-string v0, "WiFiDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAddress deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const-string v0, ""

    return-object v0
.end method

.method public a(Lo/aby;)Z
    .locals 7

    .line 36
    const-wide/16 v4, -0x1

    .line 37
    iget-object v0, p0, Lo/aja;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->b(Ljava/lang/String;)Lo/aja;

    move-result-object v6

    .line 38
    const-string v0, "WiFiDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDevice check huawei device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    if-nez v6, :cond_0

    const-string v2, "is null"

    goto :goto_0

    :cond_0
    const-string v2, "is not null"

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 39
    if-eqz v6, :cond_1

    .line 40
    invoke-static {p0}, Lo/ajq;->b(Lo/aja;)J

    move-result-wide v4

    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p0}, Lo/ajq;->c(Lo/aja;)J

    move-result-wide v4

    .line 44
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_2

    .line 45
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lo/aby;->onStateChanged(I)V

    .line 46
    const/4 v0, 0x1

    return v0

    .line 48
    :cond_2
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Lo/aby;->onStateChanged(I)V

    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 4

    .line 169
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 170
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->d:Ljava/lang/String;

    return-object v0

    .line 172
    :cond_0
    const-string v0, "WiFiDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceName deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 173
    const-string v0, "WiFiDevice"

    return-object v0
.end method

.method public b(I)Z
    .locals 1

    .line 70
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/aja$c;>;)V"
        }
    .end annotation

    .line 259
    iput-object p1, p0, Lo/aja;->a:Ljava/util/List;

    .line 260
    return-void
.end method

.method public c()Z
    .locals 4

    .line 55
    iget-object v0, p0, Lo/aja;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->e(Ljava/lang/String;)J

    move-result-wide v2

    .line 56
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    .line 57
    const/4 v0, 0x1

    return v0

    .line 59
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 1

    .line 135
    iget-object v0, p0, Lo/aja;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const/4 v0, 0x1

    return v0

    .line 138
    :cond_0
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {v0}, Lo/aja$a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    const/4 v0, 0x1

    return v0

    .line 141
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 4

    .line 211
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    return-object v0

    .line 214
    :cond_0
    const-string v0, "WiFiDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUniqueId deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const-string v0, ""

    return-object v0
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V
    .locals 6

    .line 229
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-object v1, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->e:Ljava/lang/String;

    .line 230
    iget-object v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->deviceCode:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-object v1, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lo/aja$a;->c:J

    .line 233
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 234
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->sn:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->b:Ljava/lang/String;

    .line 235
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->model:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->d:Ljava/lang/String;

    .line 236
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->devType:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->a:Ljava/lang/String;

    .line 237
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->manu:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->f:Ljava/lang/String;

    .line 238
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->prodId:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->h:Ljava/lang/String;

    .line 239
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->hiv:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->g:Ljava/lang/String;

    .line 240
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->mac:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->k:Ljava/lang/String;

    .line 241
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->fwv:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->i:Ljava/lang/String;

    .line 242
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->hwv:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->m:Ljava/lang/String;

    .line 243
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->swv:Ljava/lang/String;

    iput-object v1, v0, Lo/aja$a;->p:Ljava/lang/String;

    .line 244
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->protType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lo/aja$a;->l:I

    .line 246
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getServices()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getServices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 247
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/aja;->a:Ljava/util/List;

    .line 248
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getServices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 249
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getServices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;

    .line 250
    new-instance v5, Lo/aja$c;

    invoke-direct {v5}, Lo/aja$c;-><init>()V

    .line 251
    iget-object v0, v4, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->sid:Ljava/lang/String;

    iput-object v0, v5, Lo/aja$c;->d:Ljava/lang/String;

    .line 252
    iget-object v0, v4, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->st:Ljava/lang/String;

    iput-object v0, v5, Lo/aja$c;->b:Ljava/lang/String;

    .line 253
    iget-object v0, p0, Lo/aja;->a:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 256
    :cond_2
    return-void
.end method

.method public f()J
    .locals 4

    .line 185
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 186
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-wide v0, v0, Lo/aja$a;->c:J

    return-wide v0

    .line 188
    :cond_0
    const-string v0, "WiFiDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCode deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public g()Ljava/lang/String;
    .locals 4

    .line 177
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 178
    iget-object v0, p0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    return-object v0

    .line 180
    :cond_0
    const-string v0, "WiFiDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceID deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const-string v0, ""

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 220
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "WiFiDevice{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 221
    const-string v0, "productId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aja;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 222
    const-string v0, ", deviceInfo=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {v1}, Lo/aja$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 223
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 224
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
