.class public Lcom/huawei/hwstressmgr/StressAppInteractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwstressmgr/StressAppInteractor$MediaButtonReceiver;,
        Lcom/huawei/hwstressmgr/StressAppInteractor$a;,
        Lcom/huawei/hwstressmgr/StressAppInteractor$c;,
        Lcom/huawei/hwstressmgr/StressAppInteractor$d;
    }
.end annotation


# static fields
.field private static r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# instance fields
.field private a:J

.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private c:I

.field private d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

.field private e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

.field private f:Lorg/json/JSONObject;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Z

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Z

.field private n:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private o:Landroid/media/AudioManager;

.field private p:Landroid/content/ComponentName;

.field private q:Z

.field private t:Lo/dnd;

.field private u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 101
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor$1;

    invoke-direct {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor$1;-><init>()V

    sput-object v0, Lcom/huawei/hwstressmgr/StressAppInteractor;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->i:Z

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->g:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->h:Ljava/util/List;

    .line 72
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    .line 73
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->m:Z

    .line 117
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwstressmgr/StressAppInteractor$5;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor;)V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 86
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "Opera_StressService"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    .line 88
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;-><init>(Landroid/os/Looper;Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwstressmgr/StressAppInteractor$1;)V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    .line 89
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwstressmgr/StressAppInteractor$1;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/hwstressmgr/StressAppInteractor;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/hwstressmgr/StressAppInteractor;
    .locals 1

    .line 98
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor$d;->d()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwstressmgr/StressAppInteractor;)Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->h:Ljava/util/List;

    return-object v0
.end method

.method private a(I)V
    .locals 4

    .line 893
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cancelStressTimeOutWaiting(), time out type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 897
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    .line 898
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/16 v1, 0x2712

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    .line 899
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/16 v1, 0x2713

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    .line 900
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/16 v1, 0x2714

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    .line 901
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/16 v1, 0x2715

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    .line 902
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    invoke-virtual {v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    goto :goto_0

    .line 904
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelStressTimeOutWaiting(), mStressErrorHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    :goto_0
    return-void
.end method

.method private a(II)V
    .locals 5

    .line 864
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStressTimeOutWaiting(), enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    add-int/lit8 v4, p2, 0x8

    .line 868
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 869
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startStressTimeOutWaiting(), open type is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   timeout == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 872
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    mul-int/lit16 v1, v4, 0x3e8

    int-to-long v1, v1

    const/16 v3, 0x2711

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->sendEmptyMessageDelayed(IJ)Z

    .line 873
    goto :goto_1

    .line 875
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    mul-int/lit16 v1, v4, 0x3e8

    int-to-long v1, v1

    const/16 v3, 0x2712

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->sendEmptyMessageDelayed(IJ)Z

    .line 876
    goto :goto_1

    .line 878
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    mul-int/lit16 v1, v4, 0x3e8

    int-to-long v1, v1

    const/16 v3, 0x2713

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->sendEmptyMessageDelayed(IJ)Z

    .line 879
    goto :goto_1

    .line 881
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    mul-int/lit16 v1, v4, 0x3e8

    int-to-long v1, v1

    const/16 v3, 0x2714

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->sendEmptyMessageDelayed(IJ)Z

    .line 882
    goto :goto_1

    .line 884
    :goto_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStressTimeOutWaiting(), unknown type."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    goto :goto_1

    .line 888
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStressTimeOutWaiting(), mStressErrorHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 890
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x4 -> :sswitch_3
        0x9 -> :sswitch_1
        0xc -> :sswitch_2
    .end sparse-switch
.end method

.method private a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 277
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openStress()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    .line 282
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 284
    const-string v0, "type"

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 285
    const-string v0, "max_duration"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    goto :goto_0

    .line 286
    :catch_0
    move-exception v5

    .line 287
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :goto_0
    invoke-direct {p0, v4, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 291
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(II)V

    .line 292
    return-void
.end method

.method private a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 314
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "abortStress()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 318
    const-string v0, "type"

    const/4 v1, 0x3

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    goto :goto_0

    .line 319
    :catch_0
    move-exception v5

    .line 320
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 324
    const/16 v0, 0x2711

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 325
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/hwstressmgr/StressAppInteractor;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lo/dnd;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwstressmgr/StressAppInteractor;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/hwstressmgr/StressAppInteractor;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method private b(I)Z
    .locals 1

    .line 614
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0xc

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Lorg/json/JSONObject;)Z
    .locals 7

    .line 196
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSuccessfulResultCallback() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const-string v0, "type"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 199
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccessfulResultCallback() type is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    const/4 v0, 0x1

    if-eq v4, v0, :cond_0

    const/4 v0, 0x3

    if-eq v4, v0, :cond_0

    const/4 v0, 0x4

    if-eq v4, v0, :cond_0

    const/4 v0, 0x6

    if-eq v4, v0, :cond_0

    const/16 v0, 0x8

    if-eq v4, v0, :cond_0

    const/16 v0, 0x9

    if-eq v4, v0, :cond_0

    const/16 v0, 0xb

    if-eq v4, v0, :cond_0

    const/16 v0, 0xc

    if-eq v4, v0, :cond_0

    const/16 v0, 0xe

    if-eq v4, v0, :cond_0

    const/16 v0, 0xf

    if-ne v4, v0, :cond_2

    .line 205
    :cond_0
    const-string v0, "result_code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 206
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 207
    :goto_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccessfulResultCallback() is success? "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    return v6

    .line 210
    :cond_2
    const/4 v0, 0x7

    if-ne v4, v0, :cond_4

    .line 212
    const-string v0, "calibration_flag"

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 213
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    .line 214
    :goto_1
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccessfulResultCallback() is success? "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 215
    return v6

    .line 217
    :cond_4
    const/4 v0, 0x2

    if-eq v4, v0, :cond_5

    const/4 v0, 0x5

    if-eq v4, v0, :cond_5

    const/16 v0, 0xa

    if-eq v4, v0, :cond_5

    const/16 v0, 0xd

    if-ne v4, v0, :cond_7

    .line 220
    :cond_5
    const-string v0, "flag"

    :try_start_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 221
    const/4 v0, 0x1

    if-ne v0, v5, :cond_6

    const/4 v6, 0x1

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    .line 222
    :goto_2
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccessfulResultCallback() is success? "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 223
    return v6

    .line 226
    :cond_7
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSuccessfulResultCallback() error type."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 227
    const/4 v0, 0x0

    return v0

    .line 229
    :catch_0
    move-exception v4

    .line 230
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccessfulResultCallback() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSuccessfulResultCallback() failure callback."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private c(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Number;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 785
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 786
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Number;

    .line 787
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 788
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 789
    goto :goto_0

    .line 791
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 792
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 795
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(I)V
    .locals 5

    .line 754
    iget-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->l:Z

    if-nez v0, :cond_0

    .line 755
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->l:Z

    .line 756
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->removeMessages(I)V

    .line 758
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 759
    const-string v0, "type"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 760
    const-string v0, "result_code"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 761
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 764
    goto :goto_0

    .line 762
    :catch_0
    move-exception v4

    .line 763
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    :cond_0
    :goto_0
    return-void
.end method

.method private c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 460
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openGame()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    .line 465
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 467
    const-string v0, "type"

    const/16 v1, 0xc

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 468
    const-string v0, "max_duration"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 471
    goto :goto_0

    .line 469
    :catch_0
    move-exception v5

    .line 470
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_0
    invoke-direct {p0, v4, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 474
    const/16 v0, 0xc

    invoke-direct {p0, v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(II)V

    .line 475
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/hwstressmgr/StressAppInteractor;I)Z
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(I)Z

    move-result v0

    return v0
.end method

.method static synthetic d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/hwstressmgr/StressAppInteractor;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/hwstressmgr/StressAppInteractor;Ljava/util/List;)Ljava/lang/String;
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/hwstressmgr/StressAppInteractor;)Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->g:Ljava/util/List;

    return-object v0
.end method

.method private d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 408
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openRelax()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    .line 413
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 415
    const-string v0, "type"

    const/16 v1, 0x9

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 416
    const-string v0, "max_duration"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 419
    goto :goto_0

    .line 417
    :catch_0
    move-exception v5

    .line 418
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    :goto_0
    invoke-direct {p0, v4, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 422
    const/16 v0, 0x9

    invoke-direct {p0, v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(II)V

    .line 423
    return-void
.end method

.method private d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 296
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeStress()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 300
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 302
    const-string v0, "type"

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 303
    const-string v0, "duration"

    invoke-virtual {v4, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 306
    goto :goto_0

    .line 304
    :catch_0
    move-exception v7

    .line 305
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 309
    const/16 v0, 0x2711

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 310
    return-void
.end method

.method private d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 525
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchStressFunctionStatus() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "switchStressFunctionStatus(), JSON object: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->m:Z

    if-nez v0, :cond_0

    .line 529
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor$a;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwstressmgr/StressAppInteractor$1;)V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    .line 530
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 531
    const-string v0, "android.intent.action.PHONE_STATE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 532
    const-string v0, "android.intent.action.NEW_OUTGOING_CALL"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 533
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 536
    :cond_0
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    .line 539
    const-string v0, "productId"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 542
    goto :goto_0

    .line 540
    :catch_0
    move-exception v5

    .line 541
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 545
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchStressFunctionStatus() mStressWearAppInterface is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    return-void

    .line 550
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    invoke-interface {v0}, Lo/dnd;->a()Z

    move-result v5

    .line 551
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "switchStressFunctionStatus() isSupportStressReport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mProducuId  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    if-nez v5, :cond_2

    .line 554
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device does not support stress report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    :cond_2
    iput-object p2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 564
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v6

    .line 565
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v6, v0}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v7

    .line 566
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0xf

    if-ne v4, v0, :cond_6

    .line 567
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    .line 568
    const-string v8, ""

    .line 570
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 571
    invoke-static {v10}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 572
    move-object v8, v10

    .line 574
    :cond_3
    goto :goto_1

    .line 576
    :cond_4
    invoke-static {v8}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 577
    invoke-direct {p0, p1, v8}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 578
    invoke-virtual {p0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c()I

    goto :goto_2

    .line 580
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, v1}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 582
    :goto_2
    goto/16 :goto_4

    :cond_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_7

    invoke-direct {p0, v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(I)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 583
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-direct {p0, v0, v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Ljava/lang/String;I)V

    .line 584
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, v1}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_4

    .line 585
    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-direct {p0, v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(I)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 587
    const-string v0, "rri"

    :try_start_1
    invoke-direct {p0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->g()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 590
    goto :goto_3

    .line 588
    :catch_1
    move-exception v8

    .line 589
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    :goto_3
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, v1}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 592
    invoke-direct {p0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->f()V

    goto :goto_4

    .line 594
    :cond_8
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, v1}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 598
    :goto_4
    invoke-direct {p0, v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(I)V

    .line 611
    return-void
.end method

.method private d(I)Z
    .locals 1

    .line 621
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    const/16 v0, 0xe

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lcom/huawei/hwstressmgr/StressAppInteractor;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->i:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private e(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 770
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 771
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 772
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 773
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 774
    goto :goto_0

    .line 776
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 777
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 780
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(I)V
    .locals 4

    .line 242
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStressStatus() enter, type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStressStatus() current control status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 247
    :pswitch_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    .line 248
    goto :goto_1

    .line 250
    :pswitch_1
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    .line 251
    goto :goto_1

    .line 253
    :pswitch_2
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    .line 254
    goto :goto_1

    .line 256
    :pswitch_3
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    .line 257
    goto :goto_1

    .line 266
    :pswitch_4
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    .line 267
    goto :goto_1

    .line 269
    :goto_0
    :pswitch_5
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateStressStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :goto_1
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStressStatus() new control status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method private e(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 329
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    .line 334
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 336
    const-string v0, "type"

    const/4 v1, 0x4

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 337
    const-string v0, "score"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 338
    const-string v0, "max_duration"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    goto :goto_0

    .line 339
    :catch_0
    move-exception v5

    .line 340
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    :goto_0
    invoke-direct {p0, v4, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 344
    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(II)V

    .line 345
    return-void
.end method

.method private e(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 479
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeGame()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 483
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 485
    const-string v0, "type"

    const/16 v1, 0xd

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 486
    const-string v0, "duration"

    invoke-virtual {v4, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 487
    const-string v0, "score"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 490
    goto :goto_0

    .line 488
    :catch_0
    move-exception v7

    .line 489
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    :goto_0
    invoke-direct {p0, v4, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 493
    const/16 v0, 0x2713

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 494
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/hwstressmgr/StressAppInteractor;Lorg/json/JSONObject;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lorg/json/JSONObject;)V

    return-void
.end method

.method private e(Ljava/lang/String;I)V
    .locals 4

    .line 679
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 680
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 682
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->q:Z

    .line 684
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->l:Z

    .line 685
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->d:Lcom/huawei/hwstressmgr/StressAppInteractor$c;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwstressmgr/StressAppInteractor$c;->sendEmptyMessageDelayed(IJ)Z

    .line 686
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwstressmgr/StressAppInteractor$3;

    invoke-direct {v1, p0, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor$3;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor;I)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/afd;->a(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    .line 750
    return-void
.end method

.method private e(Lorg/json/JSONObject;)V
    .locals 5

    .line 154
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWearCallback() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 157
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWearCallback() jsonObject is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    return-void

    .line 160
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleWearCallback() jsonObject: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mIsWaitingFor2ndCallback is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->i:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    .line 164
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    .line 167
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 169
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " isSuccessfulResultCallback send to h5 type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 172
    invoke-direct {p0, v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    goto :goto_0

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 179
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send to h5 + type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 182
    invoke-direct {p0, v4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 189
    :cond_2
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->i:Z

    .line 190
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    .line 191
    const/16 v0, 0x2715

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 193
    return-void
.end method

.method private e(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 5

    .line 627
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v2

    .line 628
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    const-string v1, "54C9739F-CA5C-4347-9F00-75B9DDF2C649"

    invoke-virtual {v0, v1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v3

    .line 629
    if-nez v3, :cond_0

    .line 630
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, v1}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 631
    return-void

    .line 633
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/hihealth/device/open/MeasureKit;->getMeasureController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v4

    .line 635
    if-eqz v4, :cond_1

    if-eqz v2, :cond_1

    .line 636
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;

    invoke-direct {v0, p0, p2, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor$4;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 671
    invoke-static {}, Lo/ahd;->d()Landroid/os/Bundle;

    move-result-object v1

    .line 636
    invoke-interface {v4, v2, v0, v1}, Lcom/huawei/hihealth/device/open/MeasureController;->prepare(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    goto :goto_0

    .line 674
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, v1}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 676
    :goto_0
    return-void
.end method

.method private f()V
    .locals 2

    .line 1059
    iget-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->q:Z

    if-nez v0, :cond_0

    .line 1060
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->l(Ljava/lang/String;)V

    .line 1062
    :cond_0
    return-void
.end method

.method private f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 498
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "abortGame()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 502
    const-string v0, "type"

    const/16 v1, 0xe

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 505
    goto :goto_0

    .line 503
    :catch_0
    move-exception v5

    .line 504
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 508
    const/16 v0, 0x2713

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 509
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwstressmgr/StressAppInteractor;)I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    return v0
.end method

.method private g()Lorg/json/JSONObject;
    .locals 6

    .line 1065
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1068
    const-string v0, "listtime"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->h:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1069
    const-string v0, "listrri"

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->g:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1070
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1073
    goto :goto_0

    .line 1071
    :catch_0
    move-exception v5

    .line 1072
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1074
    :goto_0
    return-object v4
.end method

.method private g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 349
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 353
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 355
    const-string v0, "type"

    const/4 v1, 0x5

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 356
    const-string v0, "duration"

    invoke-virtual {v4, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    goto :goto_0

    .line 357
    :catch_0
    move-exception v7

    .line 358
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 362
    const/16 v0, 0x2714

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 363
    return-void
.end method

.method private h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 445
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "abortRelax()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 449
    const-string v0, "type"

    const/16 v1, 0xb

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 452
    goto :goto_0

    .line 450
    :catch_0
    move-exception v5

    .line 451
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 455
    const/16 v0, 0x2712

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 456
    return-void
.end method

.method private i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 367
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "abortCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 371
    const-string v0, "type"

    const/4 v1, 0x6

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 374
    goto :goto_0

    .line 372
    :catch_0
    move-exception v5

    .line 373
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 377
    const/16 v0, 0x2714

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 378
    return-void
.end method

.method static synthetic k(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lorg/json/JSONObject;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->f:Lorg/json/JSONObject;

    return-object v0
.end method

.method private k(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 427
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeRelax()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 431
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 433
    const-string v0, "type"

    const/16 v1, 0xa

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 434
    const-string v0, "duration"

    invoke-virtual {v4, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 437
    goto :goto_0

    .line 435
    :catch_0
    move-exception v7

    .line 436
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 440
    const/16 v0, 0x2712

    invoke-direct {p0, v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(I)V

    .line 441
    return-void
.end method


# virtual methods
.method public a(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 939
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "relaxControl() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 940
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxControl() enter. type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 943
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    if-ltz p2, :cond_0

    const/16 v0, 0xe10

    if-le p2, v0, :cond_1

    .line 944
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxControl() invalid parameter range: type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 945
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 946
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 947
    return-void

    .line 950
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p3, :cond_2

    .line 951
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "relaxControl() callback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 952
    return-void

    .line 956
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 957
    invoke-direct {p0, p2, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 958
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 959
    invoke-direct {p0, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->k(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 960
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 961
    invoke-direct {p0, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 963
    :cond_5
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1122
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->n:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    if-eqz v0, :cond_0

    .line 1123
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->n:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 1126
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    .line 1128
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->p:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterMediaButtonEventReceiver(Landroid/content/ComponentName;)V

    .line 1131
    :cond_1
    return-void
.end method

.method public b(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 996
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationControl() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationControl() enter. type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",score="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    if-ltz p2, :cond_0

    const/16 v0, 0x5a

    if-gt p2, v0, :cond_0

    if-gez p3, :cond_1

    .line 1001
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationControl() invalid parameter range: type"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", score="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 1003
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p4, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1004
    return-void

    .line 1007
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p4, :cond_2

    .line 1008
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationControl() callback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    return-void

    .line 1012
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 1013
    invoke-direct {p0, p2, p3, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 1014
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 1015
    invoke-direct {p0, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 1016
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 1017
    invoke-direct {p0, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1019
    :cond_5
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 382
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 386
    const-string v0, "type"

    const/4 v1, 0x7

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 389
    goto :goto_0

    .line 387
    :catch_0
    move-exception v5

    .line 388
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 391
    return-void
.end method

.method public c()I
    .locals 5

    .line 1098
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    .line 1099
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    .line 1100
    new-instance v0, Landroid/content/ComponentName;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwstressmgr/StressAppInteractor$MediaButtonReceiver;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->p:Landroid/content/ComponentName;

    .line 1102
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->p:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->registerMediaButtonEventReceiver(Landroid/content/ComponentName;)V

    .line 1105
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->n:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    if-nez v0, :cond_1

    .line 1106
    new-instance v0, Lcom/huawei/hwstressmgr/StressAppInteractor$2;

    invoke-direct {v0, p0}, Lcom/huawei/hwstressmgr/StressAppInteractor$2;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor;)V

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->n:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 1113
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->o:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->n:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v4

    .line 1117
    return v4
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 395
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 399
    const-string v0, "type"

    const/16 v1, 0x8

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    goto :goto_0

    .line 400
    :catch_0
    move-exception v5

    .line 401
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 404
    return-void
.end method

.method public c(Lo/dnd;)V
    .locals 4

    .line 237
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerStressCallback() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->t:Lo/dnd;

    .line 239
    return-void
.end method

.method public d(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 911
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressControl() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 912
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl() enter. type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    if-ltz p2, :cond_0

    const/16 v0, 0x5a

    if-le p2, v0, :cond_1

    .line 916
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl() invalid parameter range: type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 917
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 918
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 919
    return-void

    .line 922
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p3, :cond_2

    .line 923
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressControl() callback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 924
    return-void

    .line 927
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 928
    invoke-direct {p0, p2, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 929
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 930
    invoke-direct {p0, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 931
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 932
    invoke-direct {p0, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 935
    :cond_5
    :goto_0
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 4

    .line 1022
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "abort() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1023
    iput-boolean p2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->q:Z

    .line 1024
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1025
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "abort() callback is null. aborted by user clicking X isFromHeartKanban == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1026
    if-nez p2, :cond_0

    .line 1027
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->m(Ljava/lang/String;)V

    .line 1029
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b()V

    .line 1030
    invoke-virtual {p0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e()V

    .line 1034
    :cond_1
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current stress scene is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1035
    iget v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1037
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1038
    goto :goto_1

    .line 1040
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1041
    goto :goto_1

    .line 1043
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1044
    goto :goto_1

    .line 1046
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1047
    goto :goto_1

    .line 1049
    :pswitch_4
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "abort() called when state is idle."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1050
    goto :goto_1

    .line 1052
    :goto_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "state error."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1055
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public e()V
    .locals 2

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->m:Z

    .line 111
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    if-eqz v0, :cond_0

    .line 112
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->e:Lcom/huawei/hwstressmgr/StressAppInteractor$a;

    .line 115
    :cond_0
    return-void
.end method

.method public e(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 967
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gameControl() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gameControl() enter. type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",score="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    if-ltz p2, :cond_0

    const/16 v0, 0xe10

    if-gt p2, v0, :cond_0

    if-gez p3, :cond_1

    .line 972
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gameControl() invalid parameter range: type"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", score="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 974
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p4, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 975
    return-void

    .line 978
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p4, :cond_2

    .line 979
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gameControl() callback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 980
    return-void

    .line 984
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 985
    invoke-direct {p0, p2, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 986
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 987
    invoke-direct {p0, p3, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 988
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 989
    invoke-direct {p0, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 992
    :cond_5
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 513
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkConnected() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor;->m:Z

    .line 515
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 517
    const-string v0, "type"

    const/16 v1, 0xf

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 520
    goto :goto_0

    .line 518
    :catch_0
    move-exception v5

    .line 519
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    :goto_0
    invoke-direct {p0, v4, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 522
    return-void
.end method
