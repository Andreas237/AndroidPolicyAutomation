.class Lcom/rt/mobile/english/Utils$2$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "Utils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/Utils$2;->apply(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/Utils$2;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/Utils$2;Landroid/view/View;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/rt/mobile/english/Utils$2$1;->this$1:Lcom/rt/mobile/english/Utils$2;

    iput-object p2, p0, Lcom/rt/mobile/english/Utils$2$1;->val$view:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 133
    iget-object p1, p0, Lcom/rt/mobile/english/Utils$2$1;->val$view:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
