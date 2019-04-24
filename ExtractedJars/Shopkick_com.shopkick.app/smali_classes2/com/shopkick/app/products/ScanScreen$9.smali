.class Lcom/shopkick/app/products/ScanScreen$9;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanScreen;->animateModeBarcodeToIR()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScanScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    .line 994
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$9;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1003
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1004
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$9;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$600(Lcom/shopkick/app/products/ScanScreen;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 1005
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$9;->this$0:Lcom/shopkick/app/products/ScanScreen;

    iget-object v0, v0, Lcom/shopkick/app/products/ScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 997
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$9;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$500(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 998
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$9;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$500(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    return-void
.end method
