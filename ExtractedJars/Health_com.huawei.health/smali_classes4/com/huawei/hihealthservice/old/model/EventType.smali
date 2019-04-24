.class public Lcom/huawei/hihealthservice/old/model/EventType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACCOUNT_LOGIN:I = 0x50000000

.field public static final ACCOUNT_LOGINOUT:I = 0x60000000

.field public static final ADD_DETAIL:I = 0x10000000

.field public static final CALCULATE_CURRENT_STAT:I = 0x30000000

.field public static final CALCULATE_HISTORY_STAT:I = 0x40000000

.field public static final DELETE_DETAIL:I = 0x20000000

.field public static final DEVICE_OPER:I = -0x80000000

.field public static final USER_OPER:I = 0x70000000


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAccountEventType(I)I
    .locals 3

    .line 121
    const/high16 v0, 0x50000000

    if-ne p0, v0, :cond_0

    .line 123
    const/high16 v0, 0x50000000

    return v0

    .line 125
    :cond_0
    const/high16 v0, 0x60000000

    if-ne p0, v0, :cond_1

    .line 127
    const/high16 v0, 0x60000000

    return v0

    .line 131
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid account operation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getDeviceDataEventType(I)I
    .locals 1

    .line 115
    const/high16 v0, -0x80000000

    or-int/2addr v0, p0

    return v0
.end method

.method public static getHealthDataEventType(II)I
    .locals 3

    .line 87
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->isValidType(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid healthType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    or-int v0, p1, p0

    return v0
.end method

.method public static getUserDataEventType(I)I
    .locals 1

    .line 103
    const/high16 v0, 0x70000000

    or-int/2addr v0, p0

    return v0
.end method
