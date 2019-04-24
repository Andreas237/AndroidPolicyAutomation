.class public final Lcom/huawei/qrcode/logic/down/BaseCommonContext;
.super Ljava/lang/Object;


# static fields
.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/qrcode/logic/down/BaseCommonContext;


# instance fields
.field private applicationContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->applicationContext:Landroid/content/Context;

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/down/BaseCommonContext;
    .locals 3

    sget-object v1, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->SYNC_LOCK:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->instance:Lcom/huawei/qrcode/logic/down/BaseCommonContext;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;

    invoke-direct {v0}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->instance:Lcom/huawei/qrcode/logic/down/BaseCommonContext;

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->instance:Lcom/huawei/qrcode/logic/down/BaseCommonContext;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->applicationContext:Landroid/content/Context;

    return-object v0
.end method

.method public initContext(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->applicationContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->applicationContext:Landroid/content/Context;

    goto :goto_0

    :cond_0
    const-string v0, "initBackGround applicationContext init failed! context==null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    const-string v0, "initBackGround applicationContext init not null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method
