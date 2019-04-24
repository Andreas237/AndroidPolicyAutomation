.class Lcom/shopkick/app/browse/BrowseScreen$4;
.super Ljava/lang/Object;
.source "BrowseScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/browse/BrowseScreen;->animatePauseIconRedDot()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/browse/BrowseScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/browse/BrowseScreen;)V
    .locals 0

    .line 1116
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$4;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1123
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$4;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {p1}, Lcom/shopkick/app/browse/BrowseScreen;->access$500(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/widget/RoundImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 1124
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$4;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {p1}, Lcom/shopkick/app/browse/BrowseScreen;->access$500(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/widget/RoundImageView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

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
