.class Lcom/shopkick/app/products/ScanScreen$25;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanScreen;->enableIrProgressOverlay()V
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

    .line 1361
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$25;->this$0:Lcom/shopkick/app/products/ScanScreen;

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

    .line 1366
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$25;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$200(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 1367
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$25;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$800(Lcom/shopkick/app/products/ScanScreen;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const v1, 0x7f090546

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 1368
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$25;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$800(Lcom/shopkick/app/products/ScanScreen;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const v1, 0x7f090547

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
