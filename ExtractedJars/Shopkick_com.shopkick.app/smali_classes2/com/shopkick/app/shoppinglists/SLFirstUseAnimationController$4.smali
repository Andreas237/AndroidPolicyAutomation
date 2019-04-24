.class Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$4;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SLFirstUseAnimationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->hideFirstUseView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 201
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$100(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$200(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$300(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;I)V

    return-void
.end method
