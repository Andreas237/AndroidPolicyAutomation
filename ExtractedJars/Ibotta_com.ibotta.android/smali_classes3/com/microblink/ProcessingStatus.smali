.class interface abstract annotation Lcom/microblink/ProcessingStatus;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# static fields
.field public static final BLINK_PROCESSING:I = 0x4

.field public static final BLINK_PROCESSING_DONE:I = 0x5

.field public static final CANCELLED:I = 0x3

.field public static final DONE:I = 0x2

.field public static final FINISHING:I = 0x7

.field public static final IDLE:I = 0x0

.field public static final PARSING_RESULTS:I = 0x6

.field public static final PREPARING_FRAME_FOR_OCR:I = 0x1
