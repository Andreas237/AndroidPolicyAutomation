.class public final Lo/edi;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private final a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

.field private final b:Ljava/util/concurrent/CountDownLatch;

.field private c:Landroid/os/Handler;

.field private final e:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<Lo/og;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Vector;Ljava/lang/String;Lo/oy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Vector<Lo/od;>;Ljava/lang/String;Lo/oy;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 40
    const-string v0, "DecodeThread"

    const-string v1, "Construct-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lo/edi;->b:Ljava/util/concurrent/CountDownLatch;

    .line 43
    iput-object p1, p0, Lo/edi;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    .line 45
    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lo/edi;->e:Ljava/util/Hashtable;

    .line 47
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    :cond_0
    const-string v0, "DecodeThread"

    const-string v1, "Check whether decodeFmt is empty."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    new-instance p2, Ljava/util/Vector;

    invoke-direct {p2}, Ljava/util/Vector;-><init>()V

    .line 50
    sget-object v0, Lo/edh;->e:Ljava/util/Vector;

    invoke-virtual {p2, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    .line 51
    sget-object v0, Lo/edh;->b:Ljava/util/Vector;

    invoke-virtual {p2, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    .line 52
    sget-object v0, Lo/edh;->c:Ljava/util/Vector;

    invoke-virtual {p2, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    .line 56
    :cond_1
    iget-object v0, p0, Lo/edi;->e:Ljava/util/Hashtable;

    sget-object v1, Lo/og;->d:Lo/og;

    invoke-virtual {v0, v1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    if-eqz p3, :cond_2

    .line 59
    const-string v0, "DecodeThread"

    const-string v1, "Determine that characterSet is not empty."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    iget-object v0, p0, Lo/edi;->e:Ljava/util/Hashtable;

    sget-object v1, Lo/og;->e:Lo/og;

    invoke-virtual {v0, v1, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :cond_2
    iget-object v0, p0, Lo/edi;->e:Ljava/util/Hashtable;

    sget-object v1, Lo/og;->h:Lo/og;

    invoke-virtual {v0, v1, p4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "DecodeThread"

    const-string v1, "Construct-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    return-void
.end method


# virtual methods
.method public a()Landroid/os/Handler;
    .locals 5

    .line 79
    const-string v0, "DecodeThread"

    const-string v1, "Construct:getHandler-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    :try_start_0
    iget-object v0, p0, Lo/edi;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_0

    .line 82
    :catch_0
    move-exception v4

    .line 83
    const-string v0, "DecodeThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception ie = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :goto_0
    const-string v0, "DecodeThread"

    const-string v1, "Construct:getHandler-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    iget-object v0, p0, Lo/edi;->c:Landroid/os/Handler;

    return-object v0
.end method

.method public run()V
    .locals 3

    .line 70
    const-string v0, "DecodeThread"

    const-string v1, "Construct:run-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 72
    new-instance v0, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;

    iget-object v1, p0, Lo/edi;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    iget-object v2, p0, Lo/edi;->e:Ljava/util/Hashtable;

    invoke-direct {v0, v1, v2}, Lcom/huawei/sim/esim/qrcode/decoding/DecodeHandler;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Hashtable;)V

    iput-object v0, p0, Lo/edi;->c:Landroid/os/Handler;

    .line 73
    iget-object v0, p0, Lo/edi;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 74
    invoke-static {}, Landroid/os/Looper;->loop()V

    .line 75
    const-string v0, "DecodeThread"

    const-string v1, "Construct:run-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    return-void
.end method
