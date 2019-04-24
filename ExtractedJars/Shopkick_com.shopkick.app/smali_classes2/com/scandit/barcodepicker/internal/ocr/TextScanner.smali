.class public Lcom/scandit/barcodepicker/internal/ocr/TextScanner;
.super Ljava/lang/Object;
.source "TextScanner.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/Scanner;


# static fields
.field public static final ENABLED:Z = false


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/scandit/barcodepicker/internal/EngineSetupParams;Lcom/scandit/recognition/RecognitionContext;Lcom/scandit/barcodepicker/internal/ScanSessionImpl;Lcom/scandit/barcodepicker/internal/Scanner$ProcessingCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/scandit/barcodepicker/internal/EngineSetupParams;",
            "Lcom/scandit/recognition/RecognitionContext;",
            "Lcom/scandit/barcodepicker/internal/ScanSessionImpl;",
            "Lcom/scandit/barcodepicker/internal/Scanner$ProcessingCallback;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processFrameAsync(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;I)V
    .locals 0

    return-void
.end method

.method public setRelativeViewToImageTransform(Landroid/graphics/Matrix;)V
    .locals 0

    return-void
.end method

.method public setSettings(Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;)V
    .locals 0

    return-void
.end method

.method public start()V
    .locals 0

    return-void
.end method
