.class Lo/akh$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/akh;

.field private e:I


# direct methods
.method public constructor <init>(Lo/akh;I)V
    .locals 0

    .line 307
    iput-object p1, p0, Lo/akh$a;->c:Lo/akh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 308
    iput p2, p0, Lo/akh$a;->e:I

    .line 309
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;Ljava/lang/String;Z)V
    .locals 7

    .line 311
    if-eqz p3, :cond_1

    .line 312
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceGetVerifyCode: getVerifyCode succeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 313
    if-nez p1, :cond_0

    .line 314
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceGetVerifyCode: getVerifyCode succeed,but rsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 315
    return-void

    .line 318
    :cond_0
    iget-object v0, p0, Lo/akh$a;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 319
    iget-object v0, p0, Lo/akh$a;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;->getRegisterInfo()Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/akh$e;->e(Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;)V

    goto/16 :goto_0

    .line 322
    :cond_1
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceGetVerifyCode: getVerifyCode failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 323
    const/16 v4, 0x7cf

    .line 324
    const-string v5, "unknown error"

    .line 325
    if-eqz p1, :cond_2

    .line 326
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 327
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 329
    :cond_2
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceGetVerifyCode: getVerifyCode failed errCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 330
    iget v0, p0, Lo/akh$a;->e:I

    add-int/lit8 v6, v0, -0x1

    .line 331
    if-lez v6, :cond_3

    iget-object v0, p0, Lo/akh$a;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 332
    iget-object v0, p0, Lo/akh$a;->c:Lo/akh;

    invoke-virtual {v0, v6}, Lo/akh;->d(I)V

    goto :goto_0

    .line 335
    :cond_3
    iget-object v0, p0, Lo/akh$a;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 336
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u6ce8\u518c\u5417\u5931\u8d25\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iget-object v0, p0, Lo/akh$a;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0xc1f

    invoke-interface {v0, v2, v1}, Lo/akh$e;->e(I[Ljava/lang/String;)V

    .line 341
    :cond_4
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 305
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/akh$a;->e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
