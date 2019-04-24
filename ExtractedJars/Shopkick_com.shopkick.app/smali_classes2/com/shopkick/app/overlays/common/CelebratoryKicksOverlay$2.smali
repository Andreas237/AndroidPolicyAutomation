.class Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$2;
.super Ljava/lang/Object;
.source "CelebratoryKicksOverlay.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupTreeObserverBeforeReveal()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$2;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$2;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$500(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$2;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$600(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    return-void
.end method
