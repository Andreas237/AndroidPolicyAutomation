.class public Lcom/huawei/pluginFitnessAdvice/Audio;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private during:I

.field private gender:I

.field private id:Ljava/lang/String;

.field private identification:Ljava/lang/String;

.field private length:I

.field private name:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDuring()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->during:I

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->gender:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getIdentification()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->identification:Ljava/lang/String;

    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->length:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->url:Ljava/lang/String;

    return-object v0
.end method

.method public saveGender(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->gender:I

    .line 72
    return-void
.end method

.method public saveLength(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->length:I

    .line 56
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->name:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public saveUrl(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->url:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setDuring(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->during:I

    .line 80
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->id:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setIdentification(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Audio;->identification:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 84
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
