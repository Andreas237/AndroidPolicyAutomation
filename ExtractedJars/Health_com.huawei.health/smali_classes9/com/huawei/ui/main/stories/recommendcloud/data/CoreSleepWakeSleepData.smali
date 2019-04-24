.class public Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private currentDay:Ljava/lang/String;

.field private currentTimeMills:J

.field private fallSleepTime:I

.field private wakeUpTime:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentDay()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->currentDay:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentTimeMills()J
    .locals 2

    .line 15
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->currentTimeMills:J

    return-wide v0
.end method

.method public getFallSleepTime()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->fallSleepTime:I

    return v0
.end method

.method public getWakeUpTime()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->wakeUpTime:I

    return v0
.end method

.method public setCurrentDay(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->currentDay:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setCurrentTimeMills(J)V
    .locals 0

    .line 19
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->currentTimeMills:J

    .line 20
    return-void
.end method

.method public setFallSleepTime(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->fallSleepTime:I

    .line 36
    return-void
.end method

.method public setWakeUpTime(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->wakeUpTime:I

    .line 44
    return-void
.end method
