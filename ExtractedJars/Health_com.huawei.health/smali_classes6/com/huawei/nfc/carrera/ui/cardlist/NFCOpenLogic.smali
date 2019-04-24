.class public Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AUTO_ENABLE_NFC:Ljava/lang/String; = "auto_enable_nfc"

.field private static final CHECK_DELAY:I = 0x1f4

.field public static final DEFAULT_PAY_REQUESTCODE:I = 0x0

.field private static final OPEN_DEFAULT_PAY:I = 0xd

.field private static final OPEN_NFC_ACTION:I = 0xa

.field private static final OPEN_NFC_FAILEED:I = 0xc

.field private static final OPEN_NFC_SUCCESS:I = 0xb

.field private static final SUCCESS_CHECK_DELAY:I = 0x3e8

.field public static final SWITH_CE_SWITCH_ACTION:Ljava/lang/String; = "com.huawei.android.nfc.SWITCH_CE_STATE"

.field public static final SWITH_CE_SWITCH_STATUS:Ljava/lang/String; = "com.huawei.android.nfc.CE_SELECTED_STATE"

.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic; = null


# instance fields
.field handler:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private listener:Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

.field private mActivty:Landroid/app/Activity;

.field private mContext:Landroid/content/Context;

.field openNFCRunnable:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->handler:Landroid/os/Handler;

    .line 197
    new-instance v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->openNFCRunnable:Ljava/lang/Runnable;

    .line 104
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 107
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->mContext:Landroid/content/Context;

    .line 109
    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Landroid/app/Activity;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->mActivty:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->listener:Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;
    .locals 4

    .line 115
    sget-object v2, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->SYNC_LOCK:[B

    monitor-enter v2

    .line 116
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->instance:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 117
    new-instance v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->instance:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    .line 119
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->instance:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 120
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public isAutoOpenNFC()Z
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "auto_enable_nfc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public openNFCEnvironment(Landroid/app/Activity;)V
    .locals 3

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->mActivty:Landroid/app/Activity;

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->listener:Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 163
    const-string v0, "listener is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 164
    return-void

    .line 167
    :cond_0
    new-instance v2, Ljava/lang/Thread;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->openNFCRunnable:Ljava/lang/Runnable;

    invoke-direct {v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 168
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 169
    return-void
.end method

.method public registEnableListener(Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->listener:Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    .line 145
    return-void
.end method

.method public setAutoOpenNFC()V
    .locals 3

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "auto_enable_nfc"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putBoolean(Ljava/lang/String;Z)Z

    .line 136
    return-void
.end method

.method public unRegistEnableListener(Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;)V
    .locals 1

    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->listener:Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    .line 152
    return-void
.end method
