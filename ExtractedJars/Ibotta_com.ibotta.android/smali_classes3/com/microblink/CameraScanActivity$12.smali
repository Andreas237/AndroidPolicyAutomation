.class Lcom/microblink/CameraScanActivity$12;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$12;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$12;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$800(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$12;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$200(Lcom/microblink/CameraScanActivity;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$12;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$300(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$12;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$300(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object p1

    sget-object v0, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

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
