.class public Lcom/shopkick/app/overlays/common/ToastOverlaySpec;
.super Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
.source "ToastOverlaySpec.java"


# static fields
.field public static final TOAST_OVERLAY_KEY:Ljava/lang/String; = "toast"


# instance fields
.field public height:I

.field public isCancelableOnTouchOutside:Z

.field public toastButtonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

.field public toastButtonLabel:Ljava/lang/String;

.field public toastIconResource:Ljava/lang/String;

.field public toastMessage:Ljava/lang/String;

.field public toastTitle:Ljava/lang/String;

.field public width:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    const-string/jumbo v0, "toast"

    .line 21
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->overlayType:Ljava/lang/String;

    return-void
.end method
