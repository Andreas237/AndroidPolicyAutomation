.class Lcom/shopkick/app/products/ScanScreen$21;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanScreen;->animateScanIRInfoContentOpacity()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScanScreen;

.field private toolbar:Landroid/widget/TextView;

.field final synthetic val$baseActivity:Lcom/shopkick/app/activities/BaseActivity;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanScreen;Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 0

    .line 1222
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$21;->this$0:Lcom/shopkick/app/products/ScanScreen;

    iput-object p2, p0, Lcom/shopkick/app/products/ScanScreen$21;->val$baseActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1223
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$21;->val$baseActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTitleView()Landroid/widget/TextView;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$21;->toolbar:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1227
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 1228
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$21;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object v0

    const v1, 0x7f09060a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 1229
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$21;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object v0

    const v1, 0x7f09060b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 1230
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$21;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$300(Lcom/shopkick/app/products/ScanScreen;)Landroid/view/ViewGroup;

    move-result-object v0

    const v1, 0x7f090608

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 1231
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$21;->toolbar:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1232
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAlpha(F)V

    :cond_0
    return-void
.end method
