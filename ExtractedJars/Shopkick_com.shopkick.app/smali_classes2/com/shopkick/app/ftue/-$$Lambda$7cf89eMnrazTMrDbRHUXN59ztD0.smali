.class public final synthetic Lcom/shopkick/app/ftue/-$$Lambda$7cf89eMnrazTMrDbRHUXN59ztD0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/ftue/-$$Lambda$7cf89eMnrazTMrDbRHUXN59ztD0;->f$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    return-void
.end method


# virtual methods
.method public final onOverlayDismiss()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/ftue/-$$Lambda$7cf89eMnrazTMrDbRHUXN59ztD0;->f$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->dismiss()V

    return-void
.end method
