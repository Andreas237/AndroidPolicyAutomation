.class public Lcom/huawei/dnurse/sdk/DnurseDeviceTest;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;,
        Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;
    }
.end annotation


# static fields
.field private static M:Ljava/text/SimpleDateFormat;

.field private static e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:Z

.field private D:B

.field private E:B

.field private F:B

.field private G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

.field private H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

.field private I:Landroid/content/Context;

.field private J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

.field private K:Landroid/os/Handler;

.field private L:Ljava/util/Timer;

.field private N:F

.field private O:F

.field private P:Landroid/content/BroadcastReceiver;

.field a:Ljava/lang/Runnable;

.field b:Ljava/lang/Runnable;

.field c:Ljava/lang/Runnable;

.field d:Ljava/lang/Runnable;

.field private f:I

.field private g:F

.field private h:[[I

.field private i:I

.field private j:B

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:B

.field private w:Z

.field private x:B

.field private y:B

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->M:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    const/4 v0, 0x3

    new-array v0, v0, [[I

    const/4 v1, 0x7

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x7

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x7

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->h:[[I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->i:I

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->j:B

    const/16 v0, 0x14

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->k:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->m:I

    const/16 v0, 0x708

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n:I

    const/16 v0, 0x14

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->p:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->q:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->r:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->s:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u:Z

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v:B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->C:Z

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->N:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->O:F

    new-instance v0, Lcom/huawei/dnurse/sdk/a;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/a;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->P:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/huawei/dnurse/sdk/b;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/b;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a:Ljava/lang/Runnable;

    new-instance v0, Lcom/huawei/dnurse/sdk/c;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/c;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b:Ljava/lang/Runnable;

    new-instance v0, Lcom/huawei/dnurse/sdk/d;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/d;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c:Ljava/lang/Runnable;

    new-instance v0, Lcom/huawei/dnurse/sdk/e;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/e;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d:Ljava/lang/Runnable;

    const-string v0, "HWHealthSDK"

    const-string v1, "DnurseDeviceTest: bbb"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->I:Landroid/content/Context;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "K-Touch T91"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "K-Touch C980t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "K-Touch T789"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "K-Touch S5t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Lenovo A658t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Lenovo S868t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8295"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "ZTE U930HD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HUAWEI G606-T00"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "K-Touch T6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->r:Z

    goto/16 :goto_0

    :cond_1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8085"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8085N"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8190"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8720"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->k:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->r:Z

    goto/16 :goto_0

    :cond_3
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Coolpad 8703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x320

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l:I

    goto/16 :goto_0

    :cond_4
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Lenovo A330t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l:I

    const/16 v0, 0xbb8

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n:I

    goto/16 :goto_0

    :cond_5
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-I9200"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SM-G3508I"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    const/16 v0, 0x12c

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->p:I

    goto/16 :goto_0

    :cond_7
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "MX4 Pro"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->p:I

    const/16 v0, 0x7d0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n:I

    goto/16 :goto_0

    :cond_8
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "R801"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v0, 0x32

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l:I

    goto/16 :goto_0

    :cond_9
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HTC One X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HUAWEI U8825-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->k:I

    goto/16 :goto_0

    :cond_b
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8150"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t:Z

    goto/16 :goto_0

    :cond_c
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "C1505"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0x708

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->q:I

    goto/16 :goto_0

    :cond_d
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-I9103"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->q:I

    goto/16 :goto_0

    :cond_e
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "M040"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->h:[[I

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x6

    aput v1, v0, v2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->h:[[I

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x6

    aput v1, v0, v2

    goto/16 :goto_0

    :cond_f
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HTC T528"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Coolpad8750"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    :cond_10
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->j:B

    goto/16 :goto_0

    :cond_11
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SCH-P709"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->j:B

    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v:B

    goto/16 :goto_0

    :cond_12
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S6352"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-I9070"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    const/16 v0, 0x1f4

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o:I

    goto/16 :goto_0

    :cond_14
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "N5207"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/16 v0, 0x5dc

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u:Z

    goto :goto_0

    :cond_15
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8195"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_16

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "8150D"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    :cond_16
    const/16 v0, 0x12c

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->p:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->r:Z

    goto :goto_0

    :cond_17
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Lenovo A780e"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_18

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Lenovo A385e"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_18

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HTC T320e"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_18
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o:I

    goto :goto_0

    :cond_19
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "ST25i"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1a

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "LT22i"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1a

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HTC T329t"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    :cond_1a
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v:B

    :cond_1b
    :goto_0
    const-string v0, "HWHealthSDK"

    const-string v1, "DnurseDeviceTest: end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :array_0
    .array-data 4
        0x4
        0x7
        0xb
        0x10
        0xb
        0x14
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x7
        0xc
        0x11
        0x16
        0x13
        0x14
        0x2
    .end array-data

    :array_2
    .array-data 4
        0xa
        0x10
        0x17
        0x1e
        0x13
        0x14
        0x3
    .end array-data
.end method

.method static synthetic A(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B
    .locals 1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->x:B

    return v0
.end method

.method static synthetic B(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->N:F

    return v0
.end method

.method static synthetic C(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B
    .locals 1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y:B

    return v0
.end method

.method static synthetic D(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->O:F

    return v0
.end method

.method static synthetic E(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z:I

    return v0
.end method

.method static synthetic F(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->g:F

    return v0
.end method

.method static synthetic G(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->r:Z

    return v0
.end method

.method static synthetic H(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->s:Z

    return v0
.end method

.method static synthetic I(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w:Z

    return v0
.end method

.method public static MD5(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const/4 v2, 0x0

    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    const-string v0, ""

    return-object v0

    :goto_0
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v0, v3

    new-array v4, v0, [B

    const/4 v5, 0x0

    :goto_1
    array-length v0, v3

    if-ge v5, v0, :cond_2

    aget-char v0, v3, v5

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v7, 0x0

    :goto_2
    array-length v0, v5

    if-ge v7, v0, :cond_4

    aget-byte v0, v5, v7

    and-int/lit16 v8, v0, 0xff

    const/16 v0, 0x10

    if-ge v8, v0, :cond_3

    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_3
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B
    .locals 0

    iput-byte p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->x:B

    return p1
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F
    .locals 0

    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->N:F

    return p1
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 5

    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    add-long/2addr v0, v2

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    const/16 v0, 0xa

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D:B

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    :cond_0
    new-instance v0, Ljava/util/Timer;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    new-instance v1, Lcom/huawei/dnurse/sdk/f;

    invoke-direct {v1, p0}, Lcom/huawei/dnurse/sdk/f;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v4, v2, v3}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;Ljava/util/Date;J)V

    return-void
.end method

.method private a(I)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d:Ljava/lang/Runnable;

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B:Z

    return v0
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B
    .locals 0

    iput-byte p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y:B

    return p1
.end method

.method static synthetic b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F
    .locals 0

    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->O:F

    return p1
.end method

.method static synthetic b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    return v0
.end method

.method private b()V
    .locals 4

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(I)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HWHealthSDK"

    const-string v1, "AudPly: start failed!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: start failed!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0xf

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(I)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n:I

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(I)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c:Ljava/lang/Runnable;

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->p:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 5

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyChange,state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->x:B

    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y:B

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z:I

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_1
    goto/16 :goto_1

    :pswitch_2
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->i:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a(Z)V

    :goto_0
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n:I

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(I)V

    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->E:B

    goto :goto_1

    :pswitch_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->C:Z

    :pswitch_4
    const v0, 0x2f9b8

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(I)V

    goto :goto_1

    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a()V

    goto :goto_1

    :pswitch_6
    const v0, 0x2f9b8

    invoke-direct {p0, v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(I)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->d()V

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->x:B

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->E:B

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->F:B

    if-ne v0, v1, :cond_3

    return-void

    :cond_3
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->F:B

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->E:B

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->g:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x2

    invoke-virtual {v4, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {v4, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    invoke-interface {v0, v4}, Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;->onSuccess(Landroid/util/SparseArray;)V

    goto :goto_1

    :pswitch_7
    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c()V

    :goto_1
    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    iget v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    iget-byte v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D:B

    invoke-interface {v0, v1, v2}, Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;->onMeasuring(II)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    iget v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;->onMeasuring(II)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B
    .locals 0

    iput-byte p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->F:B

    return p1
.end method

.method static synthetic c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F
    .locals 0

    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->g:F

    return p1
.end method

.method static synthetic c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I
    .locals 0

    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->i:I

    return p1
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e()V

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b()V

    :cond_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->C:Z

    return-void
.end method

.method static synthetic c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->q:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I
    .locals 0

    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z:I

    return p1
.end method

.method private static d()Ljava/text/SimpleDateFormat;
    .locals 5

    sget-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->M:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_1

    const-class v3, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    monitor-enter v3

    :try_start_0
    sget-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->M:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_0

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->M:Ljava/text/SimpleDateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->M:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o:I

    return v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest;
    .locals 4

    const-string v0, "HWHealthSDK"

    const-string v1, "DnurseDeviceTest: 333"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    if-nez v0, :cond_1

    const-class v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    return-object v0
.end method

.method static synthetic j(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->n:I

    return v0
.end method

.method static synthetic k(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B
    .locals 2

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D:B

    add-int/lit8 v1, v0, -0x1

    int-to-byte v1, v1

    iput-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D:B

    return v0
.end method

.method static synthetic l(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B
    .locals 1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D:B

    return v0
.end method

.method static synthetic m(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Ljava/util/Timer;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->L:Ljava/util/Timer;

    return-object v0
.end method

.method public static newIdWithTag(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    invoke-static {}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d()Ljava/text/SimpleDateFormat;

    move-result-object v6

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/util/Random;

    invoke-direct {v8}, Ljava/util/Random;-><init>()V

    const v0, 0xf4240

    invoke-virtual {v8, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%06d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->I:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t:Z

    return v0
.end method

.method static synthetic r(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->k:I

    return v0
.end method

.method static synthetic s(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->m:I

    return v0
.end method

.method static synthetic t(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B
    .locals 1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->j:B

    return v0
.end method

.method static synthetic u(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->l:I

    return v0
.end method

.method static synthetic v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->h:[[I

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I
    .locals 1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->i:I

    return v0
.end method

.method static synthetic x(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u:Z

    return v0
.end method

.method static synthetic y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B
    .locals 1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v:B

    return v0
.end method

.method static synthetic z(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->C:Z

    return v0
.end method


# virtual methods
.method public getDeviceSn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A:Ljava/lang/String;

    return-object v0
.end method

.method public startTest(Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;)V
    .locals 4

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    if-nez v0, :cond_1

    new-instance v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-direct {v0, p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    :cond_1
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->I:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->P:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->J:Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;

    iget v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;->onMeasuring(II)V

    return-void
.end method

.method public stopTest()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->I:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->P:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;

    :cond_0
    return-void
.end method

.method public wakeupDevice()V
    .locals 4

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->f:I

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseConstant;->isWorking(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a:Ljava/lang/Runnable;

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
