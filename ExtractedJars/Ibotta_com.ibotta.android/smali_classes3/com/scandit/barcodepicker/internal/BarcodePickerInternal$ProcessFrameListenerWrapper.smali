.class public Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;
.super Ljava/lang/Object;
.source "BarcodePickerInternal.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProcessFrameListenerWrapper"
.end annotation


# instance fields
.field private mWrappedListener:Lcom/scandit/barcodepicker/ProcessFrameListener;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/ProcessFrameListener;)V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->mWrappedListener:Lcom/scandit/barcodepicker/ProcessFrameListener;

    return-void
.end method

.method public static create(Lcom/scandit/barcodepicker/ProcessFrameListener;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 133
    :cond_0
    new-instance v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;

    invoke-direct {v0, p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;-><init>(Lcom/scandit/barcodepicker/ProcessFrameListener;)V

    return-object v0
.end method


# virtual methods
.method public didProcess(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 2

    .line 142
    invoke-interface {p1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->getLegacyRepresentation()Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    move-result-object p2

    .line 143
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->mWrappedListener:Lcom/scandit/barcodepicker/ProcessFrameListener;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->getWidth()I

    move-result v1

    .line 144
    invoke-interface {p1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->getHeight()I

    move-result p1

    .line 143
    invoke-interface {v0, p2, v1, p1, p3}, Lcom/scandit/barcodepicker/ProcessFrameListener;->didProcess([BIILcom/scandit/barcodepicker/ScanSession;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 153
    instance-of v0, p1, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 157
    :cond_0
    check-cast p1, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;

    .line 158
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->mWrappedListener:Lcom/scandit/barcodepicker/ProcessFrameListener;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->getWrappedListener()Lcom/scandit/barcodepicker/ProcessFrameListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method getWrappedListener()Lcom/scandit/barcodepicker/ProcessFrameListener;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->mWrappedListener:Lcom/scandit/barcodepicker/ProcessFrameListener;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->mWrappedListener:Lcom/scandit/barcodepicker/ProcessFrameListener;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
