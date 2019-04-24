.class public Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;
.super Ljava/lang/Object;
.source "AudioRecordFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/AudioRecordFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AudioRecordAndBufferSize"
.end annotation


# instance fields
.field public ar:Lcom/shopkick/app/presence/SKAudioRecord;

.field public bufferSize:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
