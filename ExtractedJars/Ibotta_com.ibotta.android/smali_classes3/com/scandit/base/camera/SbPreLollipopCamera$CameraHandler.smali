.class Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;
.super Landroid/os/Handler;
.source "SbPreLollipopCamera.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/SbPreLollipopCamera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CameraHandler"
.end annotation


# static fields
.field public static final AUTOFOCUS_FINISHED:I = 0x0

.field public static final HANDLE_PENDING_AUTO_FOCUS_EVENT:I = 0x1


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 805
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/base/camera/SbPreLollipopCamera$1;)V
    .locals 0

    .line 805
    invoke-direct {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 810
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/scandit/base/camera/SbPreLollipopCamera;

    .line 811
    iget p1, p1, Landroid/os/Message;->what:I

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 816
    :pswitch_0
    iget-object p1, v0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    if-eqz p1, :cond_0

    .line 817
    iget-object p1, v0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->handleAutoFocusEvent(Lcom/scandit/base/camera/SbFocusEvent;)V

    const/4 p1, 0x0

    .line 818
    iput-object p1, v0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x1

    .line 813
    invoke-static {v0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->access$1002(Lcom/scandit/base/camera/SbPreLollipopCamera;Z)Z

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
