.class public Lcom/huawei/health/suggestion/model/WeekInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private duration:I

.field private order:I

.field private sentence:Ljava/lang/String;

.field private stage:I

.field private weekName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireOrder()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->order:I

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 72
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 73
    :catch_0
    move-exception v1

    .line 74
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public getDuration()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->duration:I

    return v0
.end method

.method public getSentence()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->sentence:Ljava/lang/String;

    return-object v0
.end method

.method public getStage()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->stage:I

    return v0
.end method

.method public getWeekName()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->weekName:Ljava/lang/String;

    return-object v0
.end method

.method public saveOrder(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->order:I

    .line 31
    return-void
.end method

.method public saveSentence(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->sentence:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public saveWeekName(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->weekName:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setDuration(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->duration:I

    .line 39
    return-void
.end method

.method public setStage(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/health/suggestion/model/WeekInfo;->stage:I

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 66
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpWeekInfoStruct1()V
    .locals 0

    .line 80
    return-void
.end method

.method public uadpWeekInfoStruct2()V
    .locals 0

    .line 82
    return-void
.end method

.method public uadpWeekInfoStruct3()V
    .locals 0

    .line 84
    return-void
.end method

.method public uadpWeekInfoStruct4()V
    .locals 0

    .line 86
    return-void
.end method

.method public uadpWeekInfoStruct5()V
    .locals 0

    .line 88
    return-void
.end method

.method public uadpWeekInfoStruct6()V
    .locals 0

    .line 90
    return-void
.end method
