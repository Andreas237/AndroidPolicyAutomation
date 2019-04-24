.class Lcom/shopkick/app/products/ScanScreen$3;
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

    .line 939
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$3;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 947
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$3;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$200(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 948
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$3;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 942
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$3;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$200(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 943
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$3;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
