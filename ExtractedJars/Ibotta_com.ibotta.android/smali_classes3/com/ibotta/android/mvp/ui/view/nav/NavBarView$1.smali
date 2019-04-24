.class Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$1;
.super Ljava/lang/Object;
.source "NavBarView.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->initLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 169
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->access$000(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

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
