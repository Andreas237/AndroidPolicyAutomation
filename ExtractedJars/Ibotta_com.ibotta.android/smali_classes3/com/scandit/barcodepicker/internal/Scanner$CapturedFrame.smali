.class public final Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;
.super Ljava/lang/Object;
.source "Scanner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/Scanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CapturedFrame"
.end annotation


# instance fields
.field public buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

.field public metadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
