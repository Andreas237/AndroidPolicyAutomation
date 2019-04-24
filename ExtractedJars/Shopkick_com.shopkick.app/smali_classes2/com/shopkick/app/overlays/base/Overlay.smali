.class public Lcom/shopkick/app/overlays/base/Overlay;
.super Landroid/app/Dialog;
.source "Overlay.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# static fields
.field private static final LAYERED_OVERLAY_TYPE:Ljava/lang/String; = "layered"


# instance fields
.field private isFullHeight:Z

.field private isFullWidth:Z

.field private overlayListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/interfaces/IOverlayListener;",
            ">;>;"
        }
    .end annotation
.end field

.field private overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field private skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 1

    .line 40
    invoke-virtual {p4}, Lcom/shopkick/app/overlays/base/SKOverlay;->getOverlayTheme()I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullWidth:Z

    .line 37
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullHeight:Z

    .line 42
    iput-object p2, p0, Lcom/shopkick/app/overlays/base/Overlay;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 43
    iput-object p3, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 44
    iput-object p4, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->setOverlayDialog(Lcom/shopkick/app/overlays/base/Overlay;)V

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlayListeners:Ljava/util/ArrayList;

    .line 49
    invoke-virtual {p0, p0}, Lcom/shopkick/app/overlays/base/Overlay;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 52
    invoke-virtual {p4, p2, p3}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 53
    invoke-virtual {p4}, Lcom/shopkick/app/overlays/base/SKOverlay;->isCancelable()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/base/Overlay;->setCancelable(Z)V

    return-void
.end method

.method public static synthetic lambda$populateDialog$9(Lcom/shopkick/app/overlays/base/Overlay;Landroid/view/View;)V
    .locals 0

    .line 85
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->dismiss()V

    return-void
.end method

.method private populateDialog()V
    .locals 5

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iput-boolean v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullWidth:Z

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v1, v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    iput-boolean v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullHeight:Z

    .line 66
    iget-boolean v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullHeight:Z

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    .line 67
    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 70
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 71
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 72
    iget-object v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const v2, 0x800053

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    goto :goto_2

    .line 78
    :cond_3
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const v2, 0x800033

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 84
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 85
    new-instance v1, Lcom/shopkick/app/overlays/base/-$$Lambda$Overlay$q9cwnkduZTHM2j56LO7B-fEfvFI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/base/-$$Lambda$Overlay$q9cwnkduZTHM2j56LO7B-fEfvFI;-><init>(Lcom/shopkick/app/overlays/base/Overlay;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/overlays/base/Overlay;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->isCancelableOnTouchOutside()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/overlays/base/Overlay;->setCanceledOnTouchOutside(Z)V

    return-void
.end method


# virtual methods
.method public addOverlayListener(Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlayListeners:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method public getSkOverlay()Lcom/shopkick/app/overlays/base/SKOverlay;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    instance-of v1, v0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    .line 117
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->getOverlayType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "layered"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 118
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/Overlay;->populateDialog()V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 158
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->destroy()V

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlayListeners:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 161
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

    if-eqz v0, :cond_0

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-interface {v0, v1, v2}, Lcom/shopkick/app/overlays/interfaces/IOverlayListener;->onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 98
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 100
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 101
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 102
    iget-boolean v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullWidth:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 103
    :cond_0
    iget-boolean v1, p0, Lcom/shopkick/app/overlays/base/Overlay;->isFullHeight:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlayListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 108
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 109
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-interface {v1, v2, v3}, Lcom/shopkick/app/overlays/interfaces/IOverlayListener;->onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public replaceOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    .line 143
    iput-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 144
    iput-object p2, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    iget-object p2, p0, Lcom/shopkick/app/overlays/base/Overlay;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 148
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/Overlay;->populateDialog()V

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public updateOverlay()V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/Overlay;->skOverlay:Lcom/shopkick/app/overlays/base/SKOverlay;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayUpdated(Landroid/content/Context;)V

    return-void
.end method
