.class public Lcom/shopkick/app/presence/AudioRecordFactory;
.super Ljava/lang/Object;
.source "AudioRecordFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;
    }
.end annotation


# instance fields
.field protected audioFormat:I

.field protected channelConfig:I

.field protected preferredBuffSize:I

.field protected sampleRate:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->sampleRate:I

    .line 15
    iput p2, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->channelConfig:I

    .line 16
    iput p3, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->audioFormat:I

    .line 17
    iput p4, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->preferredBuffSize:I

    return-void
.end method


# virtual methods
.method public initializeAudioRecord(Z)Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;
    .locals 8

    .line 30
    new-instance v0, Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;

    invoke-direct {v0}, Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;-><init>()V

    if-eqz p1, :cond_0

    const/16 p1, 0xc

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    move v4, p1

    .line 33
    iget p1, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->sampleRate:I

    iget v1, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->audioFormat:I

    invoke-static {p1, v4, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result p1

    const/4 v1, -0x2

    if-ne p1, v1, :cond_1

    return-object v0

    .line 39
    :cond_1
    iget v1, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->preferredBuffSize:I

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 42
    new-instance v7, Landroid/media/AudioRecord;

    const/4 v2, 0x1

    iget v3, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->sampleRate:I

    iget v5, p0, Lcom/shopkick/app/presence/AudioRecordFactory;->audioFormat:I

    move-object v1, v7

    move v6, p1

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 47
    new-instance v1, Lcom/shopkick/app/presence/SKAudioRecord;

    invoke-direct {v1, v7}, Lcom/shopkick/app/presence/SKAudioRecord;-><init>(Landroid/media/AudioRecord;)V

    iput-object v1, v0, Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;->ar:Lcom/shopkick/app/presence/SKAudioRecord;

    .line 48
    iput p1, v0, Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;->bufferSize:I

    return-object v0
.end method
