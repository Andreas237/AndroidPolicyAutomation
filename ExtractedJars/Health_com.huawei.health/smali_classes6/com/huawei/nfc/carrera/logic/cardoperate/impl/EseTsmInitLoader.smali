.class public Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final RECHECK_CAP_UPGRADE_DURATION:J = 0x5265c00L

.field private static final SHAREPREFRENCE_KEY_LAST_CHECK_CAP_TIME:Ljava/lang/String; = "last_check_cap_time"


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->mContext:Landroid/content/Context;

    .line 42
    return-void
.end method

.method private notifyInfoInit()I
    .locals 4

    .line 98
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;-><init>(Landroid/content/Context;)V

    .line 99
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;->excute()I

    move-result v3

    .line 100
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

    .line 102
    return v3
.end method


# virtual methods
.method public excuteEseInit()I
    .locals 9

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "last_check_cap_time"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 62
    sub-long v0, v4, v6

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    sub-long v0, v4, v6

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    :cond_0
    sub-long v0, v6, v4

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    sub-long v0, v6, v4

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 66
    :cond_1
    const-string v0, "excuteUpgrade, had checked in 24 hours, no need to check again now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x0

    return v0

    .line 71
    :cond_2
    const-string v0, "notifyInfoInit now"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 72
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->notifyInfoInit()I

    move-result v8

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "laserNotifyResult : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 75
    if-nez v8, :cond_3

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "last_check_cap_time"

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 77
    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putLong(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 80
    :cond_3
    return v8
.end method

.method public run()V
    .locals 1

    .line 47
    const-string v0, "init ese info by huawei tsm."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->excuteEseInit()I

    .line 49
    return-void
.end method
