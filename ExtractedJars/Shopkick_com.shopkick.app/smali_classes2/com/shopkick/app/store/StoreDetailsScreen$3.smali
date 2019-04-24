.class Lcom/shopkick/app/store/StoreDetailsScreen$3;
.super Ljava/lang/Object;
.source "StoreDetailsScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/StoreDetailsScreen;->animatePauseIconRedDot()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/StoreDetailsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V
    .locals 0

    .line 1316
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$3;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1324
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$3;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$400(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/widget/RoundImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 1325
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$3;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$400(Lcom/shopkick/app/store/StoreDetailsScreen;)Lcom/shopkick/app/widget/RoundImageView;

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
