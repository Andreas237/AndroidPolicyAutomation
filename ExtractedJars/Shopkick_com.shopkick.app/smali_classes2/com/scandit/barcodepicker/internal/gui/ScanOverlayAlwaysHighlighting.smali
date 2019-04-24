.class public final Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;
.super Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.source "ScanOverlayAlwaysHighlighting.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field private barcodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;",
            ">;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/profiles/DeviceProfile;ZLcom/scandit/barcodepicker/ScanSettings;)V
    .locals 0

    .line 42
    invoke-direct/range {p0 .. p5}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/profiles/DeviceProfile;ZLcom/scandit/barcodepicker/ScanSettings;)V

    .line 43
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->mContext:Landroid/content/Context;

    .line 44
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->mHandler:Landroid/os/Handler;

    .line 45
    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->barcodes:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Ljava/util/List;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->barcodes:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Landroid/content/Context;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->mContext:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public frameCompleted(Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V
    .locals 2

    .line 51
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->frameCompleted(Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V

    .line 53
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;

    invoke-direct {v1, p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 84
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->onDraw(Landroid/graphics/Canvas;)V

    .line 85
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 86
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 87
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->barcodes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    .line 88
    invoke-virtual {v1, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected updateIndicator(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)V
    .locals 1

    .line 79
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    return-void
.end method
