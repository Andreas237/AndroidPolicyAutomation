.class Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer$1;
.super Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;
.source "PostLollipopImageBuffer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->getCopy()Lcom/scandit/base/camera/capturedImage/ImageBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;[BLcom/scandit/recognition/ImageDescription;Lcom/scandit/base/camera/SbPreLollipopCamera;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer$1;->this$0:Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    invoke-direct {p0, p2, p3, p4}, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;-><init>([BLcom/scandit/recognition/ImageDescription;Lcom/scandit/base/camera/SbPreLollipopCamera;)V

    return-void
.end method


# virtual methods
.method public release()V
    .locals 0

    return-void
.end method
