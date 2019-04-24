.class public interface abstract Lcom/shopkick/app/presence/IPresenceListener;
.super Ljava/lang/Object;
.source "IPresenceListener.java"


# static fields
.field public static final DETECTED_CODE:I = 0x3

.field public static final DETECTED_CRC_MATCHED_CODE:I = 0x5

.field public static final DETECTED_SIGNAL:I = 0x1

.field public static final DETECTED_SIGNAL_LOST:I = 0x2

.field public static final SEND_DATA_TO_SERVER:I = 0x4


# virtual methods
.method public abstract crcMatchedCodeDetected()V
.end method

.method public abstract presenceCodeDetected(Ljava/lang/String;I[B[BJIZLjava/util/ArrayList;[II)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I[B[BJIZ",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;[II)V"
        }
    .end annotation
.end method

.method public abstract signalDetected()V
.end method

.method public abstract signalLost(I)V
.end method
