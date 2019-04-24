.class Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;
.super Ljava/lang/Object;
.source "ConsentSignatureStepLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->initializeStep()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;

.field final synthetic val$clear:Landroid/view/View;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;Landroid/view/View;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;

    .prologue
    .line 116
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;->val$clear:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSignatureCleared()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;->val$clear:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 128
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;->val$clear:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 129
    return-void
.end method

.method public onSignatureStarted()V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;->val$clear:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 121
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;->val$clear:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 122
    return-void
.end method
