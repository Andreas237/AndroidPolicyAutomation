.class Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;
.super Ljava/lang/Object;
.source "KicksOnTheWayOverlay.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animatePalmTrees(Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

.field final synthetic val$palmTrees1:Landroid/view/View;

.field final synthetic val$palmTrees2:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    iput-object p2, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;->val$palmTrees2:Landroid/view/View;

    iput-object p3, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;->val$palmTrees1:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;->val$palmTrees2:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;->val$palmTrees1:Landroid/view/View;

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->access$000(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
