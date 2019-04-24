.class public Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;->mContext:Landroid/content/Context;

    .line 31
    return-void
.end method

.method private notifyInfoInit()I
    .locals 4

    .line 56
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;-><init>(Landroid/content/Context;)V

    .line 57
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;->excute()I

    move-result v3

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyInfoInit, excute init, result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 59
    return v3
.end method


# virtual methods
.method public excuteEseInit()I
    .locals 3

    .line 42
    const-string v0, "excuteUpgrade, notifyInfoInit now"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 43
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;->notifyInfoInit()I

    move-result v2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "laserNotifyResult : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 45
    return v2
.end method

.method public run()V
    .locals 1

    .line 36
    const-string v0, "init ese info by huawei tsm."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;->excuteEseInit()I

    .line 38
    return-void
.end method
