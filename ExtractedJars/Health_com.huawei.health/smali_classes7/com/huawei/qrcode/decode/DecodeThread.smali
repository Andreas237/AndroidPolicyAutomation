.class final Lcom/huawei/qrcode/decode/DecodeThread;
.super Ljava/lang/Thread;


# static fields
.field public static final BARCODE_BITMAP:Ljava/lang/String; = "barcode_bitmap"

.field public static final BARCODE_SCALED_FACTOR:Ljava/lang/String; = "barcode_scaled_factor"


# instance fields
.field private final activity:Lcom/huawei/qrcode/CaptureActivity;

.field private handler:Landroid/os/Handler;

.field private final handlerInitLatch:Ljava/util/concurrent/CountDownLatch;

.field private final hints:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/og;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;Lo/oy;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection<Lo/od;>;Ljava/util/Map<Lo/og;*>;Ljava/lang/String;Lo/oy;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/decode/DecodeThread;->activity:Lcom/huawei/qrcode/CaptureActivity;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->handlerInitLatch:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lo/og;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-class v0, Lo/od;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p2

    const-string v0, "preferences_decode_1D"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->ONE_D_FORMATS:Ljava/util/Collection;

    invoke-interface {p2, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_2
    const-string v0, "preferences_decode_QR"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->QR_CODE_FORMATS:Ljava/util/Collection;

    invoke-interface {p2, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_3
    const-string v0, "preferences_decode_Data_Matrix"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->DATA_MATRIX_FORMATS:Ljava/util/Collection;

    invoke-interface {p2, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_4
    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    sget-object v1, Lo/og;->d:Lo/og;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p4, :cond_5

    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    sget-object v1, Lo/og;->e:Lo/og;

    invoke-interface {v0, v1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    sget-object v1, Lo/og;->h:Lo/og;

    invoke-interface {v0, v1, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "DecodeThread"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Hints: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method getHandler()Landroid/os/Handler;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->handlerInitLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public run()V
    .locals 3

    invoke-static {}, Landroid/os/Looper;->prepare()V

    new-instance v0, Lcom/huawei/qrcode/decode/DecodeHandler;

    iget-object v1, p0, Lcom/huawei/qrcode/decode/DecodeThread;->activity:Lcom/huawei/qrcode/CaptureActivity;

    iget-object v2, p0, Lcom/huawei/qrcode/decode/DecodeThread;->hints:Ljava/util/Map;

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/decode/DecodeHandler;-><init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Map;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->handler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeThread;->handlerInitLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void
.end method
