.class public final Lcom/microblink/OcrRecognizerFactory;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/OcrRecognizerFactory$Recognizer;
    }
.end annotation


# static fields
.field public static final DEEP_OCR_RECOGNIZER:I = 0x1

.field public static final LINUX_RECOGNIZER:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/content/Context;I)Lcom/microblink/OcrRecognizer;
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    packed-switch p1, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    new-instance p0, Lcom/microblink/DeepOcrRecognizer;

    invoke-direct {p0}, Lcom/microblink/DeepOcrRecognizer;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p1, Lcom/microblink/LinuxOcrRecognizer;

    invoke-direct {p1, p0}, Lcom/microblink/LinuxOcrRecognizer;-><init>(Landroid/content/Context;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
