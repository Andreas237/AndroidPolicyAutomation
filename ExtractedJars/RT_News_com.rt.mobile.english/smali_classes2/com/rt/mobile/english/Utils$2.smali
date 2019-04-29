.class Lcom/rt/mobile/english/Utils$2;
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

    .line 122
    iput-object p1, p0, Lcom/rt/mobile/english/Utils$2;->this$0:Lcom/rt/mobile/english/Utils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Landroid/view/View;I)V
    .locals 3

    .line 125
    iget-object p2, p0, Lcom/rt/mobile/english/Utils$2;->this$0:Lcom/rt/mobile/english/Utils;

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/high16 v0, 0x10e0000

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p2

    .line 127
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p2

    .line 128
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    const/4 v0, 0x0

    .line 129
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    new-instance v0, Lcom/rt/mobile/english/Utils$2$1;

    invoke-direct {v0, p0, p1}, Lcom/rt/mobile/english/Utils$2$1;-><init>(Lcom/rt/mobile/english/Utils$2;Landroid/view/View;)V

    .line 130
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method
