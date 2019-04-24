.class public Lcom/huawei/health/suggestion/model/FitRunPlayAudio;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final OPPORTUNITY_E:Ljava/lang/String; = "e"

.field public static final OPPORTUNITY_M:Ljava/lang/String; = "m"

.field public static final OPPORTUNITY_P:Ljava/lang/String; = "p"

.field public static final PLAY_TYPE_D:Ljava/lang/String; = "d"

.field public static final PLAY_TYPE_H:Ljava/lang/String; = "h"

.field public static final PLAY_TYPE_T:Ljava/lang/String; = "t"

.field public static final PLAY_TYPE_V:Ljava/lang/String; = "v"


# instance fields
.field private audioId:Ljava/lang/String;

.field private audioUrl:Ljava/lang/String;

.field private isPlay:Z

.field private opportunity:Ljava/lang/String;

.field private playType:Ljava/lang/String;

.field private playValue:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    return-void
.end method


# virtual methods
.method public acquireAudioId()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->audioId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireAudioUrl()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->audioUrl:Ljava/lang/String;

    return-object v0
.end method

.method public acquireIsPlay()Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->isPlay:Z

    return v0
.end method

.method public acquireOpportunity()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->opportunity:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlayType()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->playType:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlayValue()F
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->playValue:F

    return v0
.end method

.method public saveAudioId(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->audioId:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public saveAudioUrl(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->audioUrl:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public saveIsPlay(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->isPlay:Z

    .line 107
    return-void
.end method

.method public saveOpportunity(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->opportunity:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public savePlayType(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->playType:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public savePlayValue(F)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->playValue:F

    .line 100
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 111
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
