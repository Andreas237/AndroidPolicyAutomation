.class public interface abstract Lcom/scandit/base/camera/capturedImage/ImageBuffer;
.super Ljava/lang/Object;
.source "ImageBuffer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;,
        Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;
    }
.end annotation


# virtual methods
.method public abstract getCopy()Lcom/scandit/base/camera/capturedImage/ImageBuffer;
.end method

.method public abstract getFormat()Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;
.end method

.method public abstract getHeight()I
.end method

.method public abstract getLegacyRepresentation()Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;
.end method

.method public abstract getWidth()I
.end method

.method public abstract isReleased()Z
.end method

.method public abstract release()V
.end method
