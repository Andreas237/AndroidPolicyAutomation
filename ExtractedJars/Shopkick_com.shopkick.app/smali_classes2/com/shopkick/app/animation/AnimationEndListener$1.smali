.class Lcom/shopkick/app/animation/AnimationEndListener$1;
.super Ljava/lang/Object;
.source "AnimationEndListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/animation/AnimationEndListener;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/animation/AnimationEndListener;

.field final synthetic val$animation:Landroid/view/animation/Animation;


# direct methods
.method constructor <init>(Lcom/shopkick/app/animation/AnimationEndListener;Landroid/view/animation/Animation;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/animation/AnimationEndListener$1;->this$0:Lcom/shopkick/app/animation/AnimationEndListener;

    iput-object p2, p0, Lcom/shopkick/app/animation/AnimationEndListener$1;->val$animation:Landroid/view/animation/Animation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/shopkick/app/animation/AnimationEndListener$1;->this$0:Lcom/shopkick/app/animation/AnimationEndListener;

    iget-object v1, p0, Lcom/shopkick/app/animation/AnimationEndListener$1;->val$animation:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/animation/AnimationEndListener;->onAnimationEnded(Landroid/view/animation/Animation;)V

    return-void
.end method
