.class Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OverlayViewEventListener"
.end annotation


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 273
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;->a:Landroid/os/Handler;

    .line 274
    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 279
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    .line 282
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 284
    :cond_0
    return-void
.end method
