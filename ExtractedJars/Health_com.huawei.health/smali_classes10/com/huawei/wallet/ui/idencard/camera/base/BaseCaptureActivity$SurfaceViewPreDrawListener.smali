.class Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SurfaceViewPreDrawListener"
.end annotation


# instance fields
.field private e:Landroid/view/SurfaceView;


# direct methods
.method public constructor <init>(Landroid/view/SurfaceView;)V
    .locals 0

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 242
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;->e:Landroid/view/SurfaceView;

    .line 243
    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 3

    .line 248
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;->e:Landroid/view/SurfaceView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 251
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getMeasuredWidth()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x3

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 252
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0, v2}, Landroid/view/SurfaceView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 254
    const/4 v0, 0x1

    return v0

    .line 258
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
