.class public Lcom/huawei/hihealthservice/old/model/SleepCycleInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cycleEnd:Ljava/lang/Integer;

.field private cycleStart:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCycleEnd()Ljava/lang/Integer;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SleepCycleInfo;->cycleEnd:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCycleStart()Ljava/lang/Integer;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SleepCycleInfo;->cycleStart:Ljava/lang/Integer;

    return-object v0
.end method

.method public setCycleEnd(Ljava/lang/Integer;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/SleepCycleInfo;->cycleEnd:Ljava/lang/Integer;

    .line 37
    return-void
.end method

.method public setCycleStart(Ljava/lang/Integer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/SleepCycleInfo;->cycleStart:Ljava/lang/Integer;

    .line 31
    return-void
.end method
