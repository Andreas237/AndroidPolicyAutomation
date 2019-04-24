.class public Lcom/shopkick/app/presence/SKAudioRecord;
.super Ljava/lang/Object;
.source "SKAudioRecord.java"


# instance fields
.field audioRecord:Landroid/media/AudioRecord;


# direct methods
.method public constructor <init>(Landroid/media/AudioRecord;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/shopkick/app/presence/SKAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    return-void
.end method


# virtual methods
.method public getState()I
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/shopkick/app/presence/SKAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 19
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getState()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public read([SII)I
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/presence/SKAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/AudioRecord;->read([SII)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public release()V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/presence/SKAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    :cond_0
    return-void
.end method

.method public startRecording()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/shopkick/app/presence/SKAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/presence/SKAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    :cond_0
    return-void
.end method
