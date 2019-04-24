.class public Lcom/huawei/health/suggestion/model/DayInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private date:Ljava/lang/String;

.field private dayDesc:Ljava/lang/String;

.field private dayTitle:Ljava/lang/String;

.field private order:I

.field private singlesCount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireDate()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->date:Ljava/lang/String;

    return-object v0
.end method

.method public acquireDayDesc()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->dayDesc:Ljava/lang/String;

    return-object v0
.end method

.method public acquireDayTitle()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->dayTitle:Ljava/lang/String;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 66
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 67
    :catch_0
    move-exception v1

    .line 68
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public copy()Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 2

    .line 50
    new-instance v1, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/DayInfo;-><init>()V

    .line 51
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->singlesCount:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveSinglesCount(I)V

    .line 52
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->order:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveOrder(I)V

    .line 53
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->dayTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDayTitle(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->dayDesc:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDayDesc(Ljava/lang/String;)V

    .line 55
    return-object v1
.end method

.method public getOrder()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->order:I

    return v0
.end method

.method public getSinglesCount()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayInfo;->singlesCount:I

    return v0
.end method

.method public saveDate(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/DayInfo;->date:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public saveDayDesc(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/DayInfo;->dayDesc:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public saveDayTitle(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/DayInfo;->dayTitle:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public saveOrder(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayInfo;->order:I

    .line 39
    return-void
.end method

.method public saveSinglesCount(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayInfo;->singlesCount:I

    .line 47
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 60
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
