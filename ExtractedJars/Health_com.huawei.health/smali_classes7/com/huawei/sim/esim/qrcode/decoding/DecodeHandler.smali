.class public final Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private final b:Lo/ok;

.field private final d:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Hashtable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Hashtable<Lo/og;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 31
    new-instance v0, Lo/ok;

    invoke-direct {v0}, Lo/ok;-><init>()V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->b:Lo/ok;

    .line 32
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->b:Lo/ok;

    invoke-virtual {v0, p2}, Lo/ok;->d(Ljava/util/Map;)V

    .line 33
    iput-object p1, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->d:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    .line 34
    return-void
.end method

.method private e([BII)V
    .locals 11

    .line 48
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 53
    array-length v0, p1

    new-array v6, v0, [B

    .line 54
    const/4 v7, 0x0

    :goto_0
    if-ge v7, p3, :cond_1

    .line 55
    const/4 v8, 0x0

    :goto_1
    if-ge v8, p2, :cond_0

    .line 56
    mul-int v0, v8, p3

    add-int/2addr v0, p3

    sub-int/2addr v0, v7

    add-int/lit8 v0, v0, -0x1

    mul-int v1, v7, p2

    add-int/2addr v1, v8

    aget-byte v1, p1, v1

    aput-byte v1, v6, v0

    .line 55
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 58
    :cond_1
    move v7, p2

    .line 59
    move p2, p3

    .line 60
    move p3, v7

    .line 62
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0, v6, p2, p3}, Lo/edg;->e([BII)Lo/edk;

    move-result-object v5

    .line 64
    new-instance v8, Lo/oj;

    new-instance v0, Lo/qt;

    invoke-direct {v0, v5}, Lo/qt;-><init>(Lo/om;)V

    invoke-direct {v8, v0}, Lo/oj;-><init>(Lo/ob;)V

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->b:Lo/ok;

    invoke-virtual {v0, v8}, Lo/ok;->e(Lo/oj;)Lo/or;
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 70
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->b:Lo/ok;

    invoke-virtual {v0}, Lo/ok;->c()V

    .line 71
    goto :goto_2

    .line 67
    :catch_0
    move-exception v9

    .line 68
    :try_start_1
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception re = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lo/os;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->b:Lo/ok;

    invoke-virtual {v0}, Lo/ok;->c()V

    .line 71
    goto :goto_2

    .line 70
    :catchall_0
    move-exception v10

    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->b:Lo/ok;

    invoke-virtual {v0}, Lo/ok;->c()V

    .line 71
    throw v10

    .line 73
    :goto_2
    if-eqz v4, :cond_2

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->d:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e()Landroid/os/Handler;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$id;->sim_decode_succeeded:I

    invoke-static {v0, v1, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v9

    .line 76
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 77
    const-string v0, "barcode_bitmap"

    invoke-virtual {v5}, Lo/edk;->d()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 78
    invoke-virtual {v9, v10}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 80
    invoke-virtual {v9}, Landroid/os/Message;->sendToTarget()V

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->d:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e()Landroid/os/Handler;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$id;->sim_decode_failed:I

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v9

    .line 83
    invoke-virtual {v9}, Landroid/os/Message;->sendToTarget()V

    .line 85
    :goto_3
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 38
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 39
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_decode:I

    if-ne v0, v1, :cond_0

    .line 40
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    check-cast v0, [B

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;->e([BII)V

    goto :goto_0

    .line 41
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_quit:I

    if-ne v0, v1, :cond_1

    .line 42
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 44
    :cond_1
    :goto_0
    return-void
.end method
