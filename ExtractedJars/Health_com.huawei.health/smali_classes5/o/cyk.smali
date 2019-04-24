.class public Lo/cyk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cyk$b;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Z

.field private c:Z

.field private d:Landroid/os/HandlerThread;

.field private e:Landroid/content/Context;

.field private f:I

.field private g:Lo/cyj;

.field private h:Lo/cxx;

.field private i:Landroid/bluetooth/BluetoothDevice;

.field private k:Z

.field private n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private p:Lo/cxz;


# direct methods
.method public constructor <init>(Lo/cyj;Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyk;->d:Landroid/os/HandlerThread;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyk;->b:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyk;->c:Z

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyk;->k:Z

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/cyk;->f:I

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyk;->g:Lo/cyj;

    .line 512
    new-instance v0, Lo/cyk$3;

    invoke-direct {v0, p0}, Lo/cyk$3;-><init>(Lo/cyk;)V

    iput-object v0, p0, Lo/cyk;->p:Lo/cxz;

    .line 83
    iput-object p1, p0, Lo/cyk;->g:Lo/cyj;

    .line 84
    iput-object p2, p0, Lo/cyk;->e:Landroid/content/Context;

    .line 85
    iput-object p3, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    .line 86
    iput-object p4, p0, Lo/cyk;->h:Lo/cxx;

    .line 87
    invoke-direct {p0}, Lo/cyk;->a()V

    .line 88
    return-void
.end method

.method static synthetic a(Lo/cyk;)Lo/cxz;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cyk;->p:Lo/cxz;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 95
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BLEAuthenticManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cyk;->d:Landroid/os/HandlerThread;

    .line 96
    iget-object v0, p0, Lo/cyk;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 97
    new-instance v0, Lo/cyk$b;

    iget-object v1, p0, Lo/cyk;->d:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cyk$b;-><init>(Lo/cyk;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    .line 98
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lo/cyd;I)V
    .locals 6

    .line 197
    invoke-virtual {p2}, Lo/cyd;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 199
    const/16 v0, 0xc

    if-ne v0, p3, :cond_0

    .line 202
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u624b\u673a\u4fa7\u5df2\u914d\u5bf9\uff0c\u67e5\u8be2\u624b\u73af\u4fa7\u914d\u5bf9OK\uff0c\u4e0a\u62a5\u8fde\u63a5\u6210\u529f!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/cyk;->c(IZ)V

    goto/16 :goto_0

    .line 214
    :cond_0
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 215
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u624b\u673a\u4fa7\u672a\u914d\u5bf9\uff0c\u624b\u73af\u4fa7\u8001\u7248\u672c\uff0c\u53d1\u8d77\u914d\u5bf9!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 220
    :cond_1
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/cxq;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 221
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encrypt key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 224
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-ne v1, v0, :cond_2

    .line 225
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to reset v2 key info empty."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v2}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "btsdk_sharedpreferences_name4"

    iget-object v4, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    .line 231
    :cond_2
    if-eqz v5, :cond_3

    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 232
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/cyk;->c(IZ)V

    .line 233
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u624b\u673a\u4fa7\u672a\u914d\u5bf9\uff0c\u624b\u73af\u4fa7\u65b0\u7248\u672c\uff0c\u624b\u673a\u4fa7\u6709key\uff0c\u4e0a\u62a5\u8fde\u63a5\u6210\u529f!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 236
    :cond_3
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 237
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u624b\u673a\u4fa7\u672a\u914d\u5bf9\uff0c\u624b\u73af\u4fa7\u65b0\u7248\u672c\uff0c\u624b\u673a\u4fa7\u6ca1\u6709key\uff0c\u53d1\u8d77\u914d\u5bf9!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 240
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/cyk;)Lo/cyj;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    return-object v0
.end method

.method static synthetic c(Lo/cyk;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method private c(IZ)V
    .locals 5

    .line 414
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter reportConnectStatus() status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " flag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 415
    const/4 v0, 0x3

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 416
    :cond_0
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unPairFlag="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lo/cyk;->b:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",status="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget-boolean v0, p0, Lo/cyk;->b:Z

    if-eqz v0, :cond_2

    .line 418
    return-void

    .line 420
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_2

    iget-boolean v0, p0, Lo/cyk;->b:Z

    if-eqz v0, :cond_2

    .line 421
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u89e3\u7ed1\u91cd\u8fde\u4e0a\u62a5\u6b63\u5728\u8fde\u63a5."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 422
    return-void

    .line 425
    :cond_2
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-eqz v0, :cond_4

    .line 426
    iget v0, p0, Lo/cyk;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 428
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setEncryptType(I)V

    goto :goto_0

    .line 431
    :cond_3
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setEncryptType(I)V

    .line 435
    :cond_4
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_5

    .line 437
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/cyj;->e(ZI)V

    .line 441
    :cond_5
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 442
    iget-object v0, p0, Lo/cyk;->h:Lo/cxx;

    iget-object v1, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-interface {v0, v1, p1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 444
    :cond_6
    return-void
.end method

.method static synthetic c(Lo/cyk;IZ)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lo/cyk;->c(IZ)V

    return-void
.end method

.method static synthetic d(Lo/cyk;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method private d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
    .locals 6

    .line 169
    const/16 v0, 0xc

    if-ne v0, p2, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 171
    iget-object v0, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/cyk;->b(Landroid/bluetooth/BluetoothDevice;Z)Z

    goto/16 :goto_0

    .line 175
    :cond_0
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/cxq;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 176
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encrypt key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 179
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-ne v1, v0, :cond_1

    .line 180
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to reset v2 key info empty."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v2}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "btsdk_sharedpreferences_name4"

    iget-object v4, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    .line 186
    :cond_1
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 188
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/cyk;)Landroid/content/Context;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/cyk;Z)Z
    .locals 0

    .line 33
    iput-boolean p1, p0, Lo/cyk;->k:Z

    return p1
.end method

.method static synthetic h(Lo/cyk;)Landroid/os/Handler;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lo/cyk;)Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lo/cyk;->k:Z

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)Z
    .locals 9

    .line 248
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter processBondStatusResponse()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 249
    iput-object p1, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 250
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0, v1, p2}, Lo/cxo;->d(Ljava/lang/String;Landroid/content/Context;[B)Lo/cyd;

    move-result-object v6

    .line 251
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 252
    const-string v0, "0xA0200007"

    const-string v1, "01"

    const-string v2, "BLEAuthenticManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "bondState parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 253
    const/4 v0, 0x0

    return v0

    .line 256
    :cond_0
    invoke-virtual {v6}, Lo/cyd;->a()I

    move-result v0

    iput v0, p0, Lo/cyk;->f:I

    .line 257
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mBTVersionInfo = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyk;->f:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-virtual {v6}, Lo/cyd;->d()I

    move-result v7

    .line 260
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 262
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bt_service_mtu need to modify,bt_service_mtu = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    invoke-virtual {v0, v7}, Lo/cyj;->a(I)V

    goto :goto_0

    .line 266
    :cond_1
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Lo/cyj;->a(I)V

    .line 269
    :goto_0
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mBTDevice = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 270
    iget-object v0, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v8

    .line 271
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deviceBondState = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " BT_bind_status ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lo/cyd;->c()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " BT_bind_status_info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lo/cyd;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 272
    invoke-virtual {v6}, Lo/cyd;->c()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 275
    :sswitch_0
    invoke-direct {p0, p1, v8}, Lo/cyk;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 276
    goto :goto_1

    .line 279
    :sswitch_1
    invoke-virtual {v6}, Lo/cyd;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 281
    invoke-direct {p0, p1, v6, v8}, Lo/cyk;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lo/cyd;I)V

    goto :goto_1

    .line 283
    :cond_2
    iget-boolean v0, p0, Lo/cyk;->c:Z

    if-nez v0, :cond_3

    .line 284
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u67e5\u8be2\u624b\u73af\u914d\u5bf9\u72b6\u6001\u56de\u590d\u9519\u8bef\uff01\u91cd\u65b0\u53d1\u9001\u67e5\u8be2\u914d\u5bf9\u72b6\u6001\u547d\u4ee4."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyk;->c:Z

    goto :goto_1

    .line 288
    :cond_3
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u67e5\u8be2\u624b\u73af\u914d\u5bf9\u72b6\u60012\u6b21\u56de\u590d\u9519\u8bef\uff01\u65ad\u5f00\u8fde\u63a5."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-virtual {p0}, Lo/cyk;->c()V

    .line 290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyk;->c:Z

    .line 293
    .line 298
    :goto_1
    const/4 v0, 0x1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;Z)Z
    .locals 6

    .line 387
    iput-boolean p2, p0, Lo/cyk;->b:Z

    .line 388
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cxk;->b(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    .line 389
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unPairDevice() \u89e3\u7ed1\u5931\u8d25 unPair = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " reConnectFlag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 390
    if-eqz v5, :cond_0

    if-eqz p2, :cond_0

    .line 392
    invoke-virtual {p0}, Lo/cyk;->c()V

    .line 393
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 395
    :cond_0
    if-nez v5, :cond_1

    if-eqz p2, :cond_1

    .line 397
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "unPairDevice() \u89e3\u7ed1\u5931\u8d25."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 399
    :cond_1
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "unPairDevice() \u89e3\u7ed1\u6210\u529f\uff0c\u6e05\u9664Key."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 400
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxq;->c(Landroid/content/Context;)V

    .line 402
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyk;->b:Z

    .line 403
    invoke-virtual {p0}, Lo/cyk;->c()V

    .line 405
    :goto_1
    return v5
.end method

.method public c()V
    .locals 5

    .line 480
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->a()Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 482
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->a()Lo/cyn;

    move-result-object v0

    invoke-interface {v0}, Lo/cyn;->a()V

    .line 485
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cyk;->f:I

    .line 486
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "disconnect end."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 487
    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)V
    .locals 6

    .line 355
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cxk;->c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)Z

    move-result v5

    .line 356
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "pairDevice(), result = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 357
    if-nez v5, :cond_1

    .line 358
    iget-boolean v0, p0, Lo/cyk;->k:Z

    if-nez v0, :cond_0

    .line 359
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    new-instance v1, Lo/cyk$4;

    invoke-direct {v1, p0, p1, p2}, Lo/cyk$4;-><init>(Lo/cyk;Landroid/bluetooth/BluetoothDevice;Lo/cxz;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 372
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyk;->k:Z

    .line 373
    invoke-virtual {p0}, Lo/cyk;->c()V

    .line 374
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "pairDeviceFlag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lo/cyk;->k:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)Z
    .locals 11

    .line 106
    iput-object p1, p0, Lo/cyk;->n:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 107
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cxo;->a(Landroid/content/Context;[B)I

    move-result v5

    .line 108
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "processPairResponse with mBTDeviceInfo ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyk;->f:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " isAllowBind = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v6, 0x1

    .line 110
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_2

    .line 112
    :sswitch_0
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/cyk;->c(IZ)V

    .line 113
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "user refuse to allow connect device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 116
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lo/cyj;->e(ZI)V

    .line 118
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cyj;->e(Z)V

    .line 120
    iget-object v0, p0, Lo/cyk;->g:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->d()V

    goto/16 :goto_3

    .line 124
    :sswitch_1
    iget v0, p0, Lo/cyk;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, ":"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v7

    .line 126
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 127
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CommandPackage.key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CommandPackage.authVersion = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getmAuthVersion()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getmAuthVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cxq;->c(I)[B

    move-result-object v9

    .line 130
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getmAuthVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cxq;->d(I)[B

    move-result-object v10

    .line 131
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 132
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, "btsdk_sharedpreferences_name1"

    iget-object v3, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v9, v2, v3}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    .line 133
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, "btsdk_sharedpreferences_name2"

    iget-object v3, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v10, v2, v3}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    .line 134
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, "btsdk_sharedpreferences_name3"

    iget-object v3, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v7, v2, v3}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    .line 135
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->i:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "btsdk_sharedpreferences_name4"

    iget-object v4, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 137
    :cond_0
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "CX info is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 140
    :cond_1
    :goto_0
    iget v0, p0, Lo/cyk;->f:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 142
    :pswitch_0
    iget-object v0, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    iget-object v1, p0, Lo/cyk;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxq;->c(Landroid/content/Context;)V

    .line 143
    iget-object v0, p0, Lo/cyk;->a:Landroid/os/Handler;

    const/4 v1, 0x4

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 144
    goto :goto_3

    .line 146
    :pswitch_1
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/cyk;->c(IZ)V

    .line 147
    goto :goto_3

    .line 149
    :pswitch_2
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/cyk;->c(IZ)V

    .line 150
    goto :goto_3

    .line 152
    :goto_1
    goto :goto_3

    .line 156
    :goto_2
    const/4 v6, 0x0

    .line 160
    :cond_2
    :goto_3
    return v6

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
