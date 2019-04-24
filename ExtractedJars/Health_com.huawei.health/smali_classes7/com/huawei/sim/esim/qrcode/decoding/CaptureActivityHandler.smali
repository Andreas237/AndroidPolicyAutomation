.class public final Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

.field private final b:Lo/edi;

.field private final c:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Vector;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Vector<Lo/od;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 36
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const-string v1, "Construct:activity"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    iput-object p1, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->c:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    .line 38
    new-instance v0, Lo/edi;

    new-instance v1, Lo/edl;

    invoke-virtual {p1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a()Lo/edn;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/edl;-><init>(Lo/edn;)V

    invoke-direct {v0, p1, p2, p3, v1}, Lo/edi;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Vector;Ljava/lang/String;Lo/oy;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b:Lo/edi;

    .line 39
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const-string v1, "Construct:decodeThread"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b:Lo/edi;

    invoke-virtual {v0}, Lo/edi;->start()V

    .line 41
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const-string v1, "Construct:decodeThread"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->d:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    .line 44
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0}, Lo/edg;->b()V

    .line 45
    invoke-direct {p0}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->e()V

    .line 46
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const-string v1, "Construct-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    return-void
.end method

.method private b(Lo/or;Landroid/graphics/Bitmap;)V
    .locals 5

    .line 89
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1}, Lo/or;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 90
    :cond_1
    invoke-virtual {p1}, Lo/or;->toString()Ljava/lang/String;

    move-result-object v4

    .line 91
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->c:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c(Lo/or;Landroid/graphics/Bitmap;)Z

    .line 94
    return-void
.end method

.method private e()V
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    sget-object v1, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->d:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    if-ne v0, v1, :cond_0

    .line 115
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    .line 116
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b:Lo/edi;

    invoke-virtual {v1}, Lo/edi;->a()Landroid/os/Handler;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$id;->sim_decode:I

    invoke-virtual {v0, v1, v2}, Lo/edg;->a(Landroid/os/Handler;I)V

    .line 117
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$id;->sim_auto_focus:I

    invoke-virtual {v0, p0, v1}, Lo/edg;->e(Landroid/os/Handler;I)V

    .line 118
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->c:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c()V

    .line 120
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 98
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->b:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    .line 99
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0}, Lo/edg;->c()V

    .line 100
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b:Lo/edi;

    invoke-virtual {v0}, Lo/edi;->a()Landroid/os/Handler;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$id;->sim_quit:I

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v4

    .line 101
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b:Lo/edi;

    invoke-virtual {v0}, Lo/edi;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 105
    :catch_0
    move-exception v5

    .line 106
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_0
    sget v0, Lcom/huawei/sim/R$id;->sim_decode_succeeded:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->removeMessages(I)V

    .line 110
    sget v0, Lcom/huawei/sim/R$id;->sim_decode_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->removeMessages(I)V

    .line 111
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 55
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 57
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_auto_focus:I

    if-ne v0, v1, :cond_0

    .line 58
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    sget-object v1, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    if-ne v0, v1, :cond_5

    .line 59
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$id;->sim_auto_focus:I

    invoke-virtual {v0, p0, v1}, Lo/edg;->e(Landroid/os/Handler;I)V

    goto/16 :goto_1

    .line 61
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_restart_preview:I

    if-ne v0, v1, :cond_1

    .line 62
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Got restart preview message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-direct {p0}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->e()V

    goto/16 :goto_1

    .line 64
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_decode_succeeded:I

    if-ne v0, v1, :cond_3

    .line 65
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Got decode succeeded message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->d:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    .line 67
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 68
    if-nez v4, :cond_2

    const/4 v5, 0x0

    goto :goto_0

    :cond_2
    const-string v0, "barcode_bitmap"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/Bitmap;

    .line 69
    :goto_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/or;

    invoke-virtual {v0}, Lo/or;->e()Ljava/lang/String;

    move-result-object v6

    .line 70
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===www123======--str_result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/or;

    invoke-direct {p0, v0, v5}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b(Lo/or;Landroid/graphics/Bitmap;)V

    .line 75
    goto :goto_1

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_decode_failed:I

    if-ne v0, v1, :cond_4

    .line 77
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    .line 78
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->b:Lo/edi;

    invoke-virtual {v1}, Lo/edi;->a()Landroid/os/Handler;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$id;->sim_decode:I

    invoke-virtual {v0, v1, v2}, Lo/edg;->a(Landroid/os/Handler;I)V

    goto :goto_1

    .line 79
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/huawei/sim/R$id;->sim_return_scan_result:I

    if-ne v0, v1, :cond_5

    .line 80
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Got return scan result message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->c:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->setResult(ILandroid/content/Intent;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->c:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->finish()V

    .line 84
    :cond_5
    :goto_1
    return-void
.end method
