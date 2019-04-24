.class Lcom/shopkick/app/products/ScanScreen$7;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


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

    .line 981
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$7;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 984
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$7;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$200(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTranslationY(F)V

    .line 985
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$7;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setTranslationY(F)V

    return-void
.end method
