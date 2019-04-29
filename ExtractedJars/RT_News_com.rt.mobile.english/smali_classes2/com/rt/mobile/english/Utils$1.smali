.class Lcom/rt/mobile/english/Utils$1;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Lbutterknife/ButterKnife$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/Utils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbutterknife/ButterKnife$Action<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/Utils;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/Utils;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/rt/mobile/english/Utils$1;->this$0:Lcom/rt/mobile/english/Utils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Landroid/view/View;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 104
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_1

    return-void

    .line 108
    :cond_1
    iget-object p2, p0, Lcom/rt/mobile/english/Utils$1;->this$0:Lcom/rt/mobile/english/Utils;

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/high16 v0, 0x10e0000

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p2

    const/4 v0, 0x0

    .line 109
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x0

    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 111
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    int-to-long v0, p2

    .line 112
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 p2, 0x3f800000    # 1.0f

    .line 113
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance p2, Lcom/rt/mobile/english/Utils$1$1;

    invoke-direct {p2, p0}, Lcom/rt/mobile/english/Utils$1$1;-><init>(Lcom/rt/mobile/english/Utils$1;)V

    .line 114
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method
