.class Lcom/ibotta/android/view/UnlockAnimationView$1;
.super Ljava/lang/Object;
.source "UnlockAnimationView.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/UnlockAnimationView;->initLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/UnlockAnimationView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/UnlockAnimationView;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/view/UnlockAnimationView$1;->this$0:Lcom/ibotta/android/view/UnlockAnimationView;

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

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/view/UnlockAnimationView$1;->this$0:Lcom/ibotta/android/view/UnlockAnimationView;

    invoke-static {p1}, Lcom/ibotta/android/view/UnlockAnimationView;->access$000(Lcom/ibotta/android/view/UnlockAnimationView;)V

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
