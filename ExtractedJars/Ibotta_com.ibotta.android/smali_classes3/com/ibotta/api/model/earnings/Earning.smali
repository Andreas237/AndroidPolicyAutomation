.class public Lcom/ibotta/api/model/earnings/Earning;
.super Ljava/lang/Object;
.source "Earning.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/earnings/Earning$Type;,
        Lcom/ibotta/api/model/earnings/Earning$ProcessingState;
    }
.end annotation


# instance fields
.field private alternateText:Ljava/lang/String;

.field private earnedAmount:F

.field private transient earningProcessingStateEnum:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field private transient earningTypeEnum:Lcom/ibotta/api/model/earnings/Earning$Type;

.field private id:I

.field private imageUrl:Ljava/lang/String;

.field private launchId:Ljava/lang/String;

.field private pendingAmount:F

.field private percentComplete:S

.field private processing:Z

.field private processingState:Ljava/lang/String;

.field private submittedTime:Ljava/util/Date;

.field private time:Ljava/util/Date;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->alternateText:Ljava/lang/String;

    return-object v0
.end method

.method public getEarnedAmount()F
    .locals 1

    .line 108
    iget v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earnedAmount:F

    return v0
.end method

.method public getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earningProcessingStateEnum:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eqz v0, :cond_0

    return-object v0

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->processingState:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earningProcessingStateEnum:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    .line 169
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earningProcessingStateEnum:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    return-object v0
.end method

.method public getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earningTypeEnum:Lcom/ibotta/api/model/earnings/Earning$Type;

    if-eqz v0, :cond_0

    return-object v0

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->type:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/earnings/Earning$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earningTypeEnum:Lcom/ibotta/api/model/earnings/Earning$Type;

    .line 222
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->earningTypeEnum:Lcom/ibotta/api/model/earnings/Earning$Type;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/ibotta/api/model/earnings/Earning;->id:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLaunchId()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->launchId:Ljava/lang/String;

    return-object v0
.end method

.method public getPendingAmount()F
    .locals 1

    .line 132
    iget v0, p0, Lcom/ibotta/api/model/earnings/Earning;->pendingAmount:F

    return v0
.end method

.method public getPercentComplete()S
    .locals 1

    .line 140
    iget-short v0, p0, Lcom/ibotta/api/model/earnings/Earning;->percentComplete:S

    return v0
.end method

.method public getProcessingState()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->processingState:Ljava/lang/String;

    return-object v0
.end method

.method public getSubmittedTime()Ljava/util/Date;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->submittedTime:Ljava/util/Date;

    return-object v0
.end method

.method public getTime()Ljava/util/Date;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->time:Ljava/util/Date;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdatedAt()Ljava/util/Date;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public isProcessing()Z
    .locals 1

    .line 148
    iget-boolean v0, p0, Lcom/ibotta/api/model/earnings/Earning;->processing:Z

    return v0
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->alternateText:Ljava/lang/String;

    return-void
.end method

.method public setEarnedAmount(F)V
    .locals 0

    .line 112
    iput p1, p0, Lcom/ibotta/api/model/earnings/Earning;->earnedAmount:F

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 96
    iput p1, p0, Lcom/ibotta/api/model/earnings/Earning;->id:I

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setLaunchId(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->launchId:Ljava/lang/String;

    return-void
.end method

.method public setPendingAmount(F)V
    .locals 0

    .line 136
    iput p1, p0, Lcom/ibotta/api/model/earnings/Earning;->pendingAmount:F

    return-void
.end method

.method public setPercentComplete(S)V
    .locals 0

    .line 144
    iput-short p1, p0, Lcom/ibotta/api/model/earnings/Earning;->percentComplete:S

    return-void
.end method

.method public setProcessing(Z)V
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/ibotta/api/model/earnings/Earning;->processing:Z

    return-void
.end method

.method public setProcessingState(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->processingState:Ljava/lang/String;

    return-void
.end method

.method public setSubmittedTime(Ljava/util/Date;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->submittedTime:Ljava/util/Date;

    return-void
.end method

.method public setTime(Ljava/util/Date;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->time:Ljava/util/Date;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->title:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->type:Ljava/lang/String;

    return-void
.end method

.method public setUpdatedAt(Ljava/util/Date;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/ibotta/api/model/earnings/Earning;->updatedAt:Ljava/util/Date;

    return-void
.end method
