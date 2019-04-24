.class public Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;
.super Ljava/lang/Object;
.source "NativePresencePipelineInterop.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/NativePresencePipelineInterop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "PresenceCallback"
.end annotation


# instance fields
.field private codeByPd:Ljava/lang/String;

.field private correctedBits:I

.field private firstSigDetectionTime:J

.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/presence/IPresenceListener;",
            ">;"
        }
    .end annotation
.end field

.field private prefixCandidates:[I

.field private prefixMask:I

.field private prefixMatch:Z

.field private presenceData:[B

.field private presenceFFTData:[B

.field private presenceFactors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private state:I

.field private stepCount:I

.field final synthetic this$0:Lcom/shopkick/app/presence/NativePresencePipelineInterop;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/presence/NativePresencePipelineInterop;Ljava/util/List;Ljava/lang/String;I[B[BJZLjava/util/ArrayList;[IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/presence/IPresenceListener;",
            ">;",
            "Ljava/lang/String;",
            "I[B[BJZ",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;[IIII)V"
        }
    .end annotation

    .line 656
    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->this$0:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 657
    iput-object p2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->listeners:Ljava/util/List;

    .line 658
    iput-object p3, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->codeByPd:Ljava/lang/String;

    .line 659
    iput p4, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->correctedBits:I

    .line 660
    iput-object p5, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->presenceData:[B

    .line 661
    iput-object p6, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->presenceFFTData:[B

    .line 662
    iput-wide p7, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->firstSigDetectionTime:J

    .line 663
    iput-boolean p9, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->prefixMatch:Z

    .line 664
    iput-object p10, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->presenceFactors:Ljava/util/ArrayList;

    .line 665
    iput-object p11, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->prefixCandidates:[I

    .line 666
    iput p12, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->prefixMask:I

    .line 667
    iput p13, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->state:I

    .line 668
    iput p14, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->stepCount:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 673
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/shopkick/app/presence/IPresenceListener;

    .line 674
    iget v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->state:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_1

    .line 675
    iget-object v3, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->codeByPd:Ljava/lang/String;

    iget v4, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->correctedBits:I

    iget-object v5, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->presenceData:[B

    iget-object v6, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->presenceFFTData:[B

    iget-wide v7, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->firstSigDetectionTime:J

    iget v9, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->stepCount:I

    iget-boolean v10, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->prefixMatch:Z

    iget-object v11, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->presenceFactors:Ljava/util/ArrayList;

    iget-object v12, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->prefixCandidates:[I

    iget v13, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->prefixMask:I

    invoke-interface/range {v2 .. v13}, Lcom/shopkick/app/presence/IPresenceListener;->presenceCodeDetected(Ljava/lang/String;I[B[BJIZLjava/util/ArrayList;[II)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 686
    invoke-interface {v2}, Lcom/shopkick/app/presence/IPresenceListener;->signalDetected()V

    goto :goto_0

    :cond_2
    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 688
    iget v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;->stepCount:I

    invoke-interface {v2, v1}, Lcom/shopkick/app/presence/IPresenceListener;->signalLost(I)V

    goto :goto_0

    :cond_3
    return-void
.end method
