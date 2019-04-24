.class public Lcom/huawei/hihealthservice/old/model/SleepData;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/SleepData$Level;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x73514e57d9589f22L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method

.method public static getRecommendSleepDurationPerDay(I)I
    .locals 2

    .line 50
    const/4 v1, 0x0

    .line 51
    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    .line 52
    const/16 v1, 0x3c0

    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x3

    if-gt p0, v0, :cond_1

    .line 54
    const/16 v1, 0x2d0

    goto :goto_0

    .line 55
    :cond_1
    const/16 v0, 0xc

    if-gt p0, v0, :cond_2

    .line 56
    const/16 v1, 0x2d0

    goto :goto_0

    .line 57
    :cond_2
    const/16 v0, 0x1d

    if-gt p0, v0, :cond_3

    .line 58
    const/16 v1, 0x1e0

    goto :goto_0

    .line 59
    :cond_3
    const/16 v0, 0x3c

    if-gt p0, v0, :cond_4

    .line 60
    const/16 v1, 0x1a4

    goto :goto_0

    .line 62
    :cond_4
    const/16 v1, 0x168

    .line 65
    :goto_0
    return v1
.end method


# virtual methods
.method public bridge synthetic clone()Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/SleepData;->clone()Lcom/huawei/hihealthservice/old/model/SleepData;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/model/SleepData;
    .locals 1

    .line 37
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->clone()Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/SleepData;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 22
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/SleepData;->clone()Lcom/huawei/hihealthservice/old/model/SleepData;

    move-result-object v0

    return-object v0
.end method
