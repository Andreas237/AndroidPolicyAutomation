.class public final Lcom/microblink/CameraFrameQueueFactory;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/CameraFrameQueueFactory$Type;
    }
.end annotation


# static fields
.field static final CONTINUOUS_FRAME_QUEUE:I = 0x1

.field static final DEFAULT:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(I)Lcom/microblink/CameraFrameQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/microblink/CameraFrameQueue<",
            "Lcom/microblink/BitmapResult;",
            ">;"
        }
    .end annotation

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Type not recognized"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    new-instance p0, Lcom/microblink/CameraFrameResultsQueue;

    invoke-direct {p0}, Lcom/microblink/CameraFrameResultsQueue;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/microblink/BitmapQueue;

    invoke-direct {p0}, Lcom/microblink/BitmapQueue;-><init>()V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
