.class Lo/akh$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/akh$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lo/akh;


# direct methods
.method private constructor <init>(Lo/akh;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lo/akh$b;->c:Lo/akh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/akh;Lo/akh$3;)V
    .locals 0

    .line 187
    invoke-direct {p0, p1}, Lo/akh$b;-><init>(Lo/akh;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 247
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRegisterDeviceSuccess \u8bbe\u5907\u6ce8\u518c\u6210\u529f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    invoke-static {v0, p1}, Lo/akh;->a(Lo/akh;Ljava/lang/Object;)V

    .line 249
    return-void
.end method

.method public c(Lo/aix;)V
    .locals 5

    .line 226
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63e1\u624b\u6210\u529f\uff0c\u5f00\u59cb\u4e0b\u53d1\u6ce8\u518c\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 228
    if-nez p1, :cond_0

    .line 229
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "VerifyCode is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 230
    return-void

    .line 232
    :cond_0
    invoke-virtual {p1}, Lo/aix;->e()Ljava/lang/String;

    move-result-object v4

    .line 233
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    iget-object v0, v0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0, v4}, Lo/ajd;->e(Ljava/lang/String;)V

    .line 234
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VerifyCode2CoapSessionInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/aix;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lo/akh;->e(Lo/aix;I)V

    .line 236
    return-void
.end method

.method public varargs e(I[Ljava/lang/String;)V
    .locals 4

    .line 253
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure \u8bbe\u5907\u6ce8\u518c\u5931\u8d25 errCode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " msg:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    invoke-static {v0, p1}, Lo/akh;->e(Lo/akh;I)V

    .line 256
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;)V
    .locals 9

    .line 191
    if-nez p1, :cond_0

    .line 192
    return-void

    .line 195
    :cond_0
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->f(Lo/akh;)Lo/akh$i;

    move-result-object v0

    sget-object v1, Lo/akh$i;->a:Lo/akh$i;

    if-ne v0, v1, :cond_2

    .line 196
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 197
    const-string v0, "device_register_verifycode"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 198
    invoke-static {}, Lo/akh;->c()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 199
    :try_start_0
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->i(Lo/akh;)Lo/ajm;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 200
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->i(Lo/akh;)Lo/ajm;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :cond_1
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 203
    :goto_0
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u9a8c\u8bc1\u7801\u6210\u529fsoftAP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-void

    .line 206
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getVerifyCode()Ljava/lang/String;

    move-result-object v4

    .line 208
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getDevId()Ljava/lang/String;

    move-result-object v5

    .line 209
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6ce8\u518c\u8bbe\u5907\u7684ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    iget-object v0, v0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0, v5}, Lo/ajd;->e(Ljava/lang/String;)V

    .line 211
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    iget-object v0, v0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v6

    .line 213
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;->getPsk()Ljava/lang/String;

    move-result-object v7

    .line 214
    new-instance v8, Lo/aix;

    invoke-direct {v8}, Lo/aix;-><init>()V

    .line 215
    invoke-virtual {v8, v5}, Lo/aix;->a(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v8, v7}, Lo/aix;->b(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v8, v4}, Lo/aix;->c(Ljava/lang/String;)V

    .line 218
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bbe\u5907\u7c7b\u578b "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v1, v2}, Lo/akh;->e(Lo/aix;IZ)V

    .line 220
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f00\u59cb\u63e1\u624b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 222
    return-void
.end method

.method public e(Lo/air;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 240
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onWriteVerifyCodeSuccess \u4e0b\u53d1\u6ce8\u518c\u7801\u6210\u529f\uff0c\u7b49\u5f85\u8bbe\u5907\u6ce8\u518c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 241
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->a(Lo/akh;)Lo/akh$d;

    move-result-object v0

    const/16 v1, 0x3ea

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/akh$d;->sendEmptyMessageDelayed(IJ)Z

    .line 242
    iget-object v0, p0, Lo/akh$b;->c:Lo/akh;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/akh;->c(Lo/akh;I)I

    .line 243
    return-void
.end method
