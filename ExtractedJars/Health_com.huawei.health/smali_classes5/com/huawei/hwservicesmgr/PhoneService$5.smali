.class Lcom/huawei/hwservicesmgr/PhoneService$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ddg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/PhoneService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/hwservicesmgr/PhoneService;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$5;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 6

    .line 229
    const/4 v4, 0x0

    .line 230
    const/4 v0, 0x0

    if-eq v0, p3, :cond_3

    .line 231
    invoke-static {}, Lcom/huawei/hwservicesmgr/PhoneService;->d()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 232
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "managerMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    return-void

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$5;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0, p3}, Lcom/huawei/hwservicesmgr/PhoneService;->a(Lcom/huawei/hwservicesmgr/PhoneService;[B)V

    .line 236
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_1

    .line 237
    invoke-static {}, Lcom/huawei/hwservicesmgr/PhoneService;->d()Ljava/util/Map;

    move-result-object v0

    const/16 v1, 0x3f6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    .line 238
    if-eqz v4, :cond_3

    .line 239
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "file data received "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-interface {v4, p1, p3}, Lcom/huawei/hwservicesmgr/remote/parser/IParser;->getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    .line 241
    return-void

    .line 244
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/16 v1, 0x17

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0x10

    if-ne v1, v0, :cond_2

    .line 245
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "run posture report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/16 v0, 0x19

    const/4 v1, 0x0

    aput-byte v0, p3, v1

    .line 248
    :cond_2
    invoke-static {}, Lcom/huawei/hwservicesmgr/PhoneService;->d()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v1, p3, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    .line 251
    :cond_3
    invoke-static {}, Lcom/huawei/hwservicesmgr/PhoneService;->b()Lo/djr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 253
    :try_start_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/PhoneService;->b()Lo/djr;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/djr;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 258
    goto :goto_0

    .line 254
    :catch_0
    move-exception v5

    .line 255
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDataReceived remoteException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    goto :goto_0

    .line 256
    :catch_1
    move-exception v5

    .line 257
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDataReceived Exception:"

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

    .line 261
    :cond_4
    :goto_0
    if-eqz v4, :cond_5

    .line 262
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the manager is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    invoke-interface {v4, p1, p3}, Lcom/huawei/hwservicesmgr/remote/parser/IParser;->getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    .line 265
    :cond_5
    return-void
.end method
