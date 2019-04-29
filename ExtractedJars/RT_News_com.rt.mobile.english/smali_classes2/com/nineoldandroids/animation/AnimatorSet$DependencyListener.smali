.class Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;
.super Ljava/lang/Object;
.source "AnimatorSet.java"

# interfaces
.implements Lcom/nineoldandroids/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DependencyListener"
.end annotation


# instance fields
.field private mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;

.field private mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

.field private mRule:I


# direct methods
.method public constructor <init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
    .locals 0

    .line 635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 636
    iput-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;

    .line 637
    iput-object p2, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    .line 638
    iput p3, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I

    return-void
.end method

.method private startIfReady(Lcom/nineoldandroids/animation/Animator;)V
    .locals 6

    .line 680
    iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;

    iget-boolean v0, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 685
    iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object v1, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 687
    iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object v3, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;

    .line 688
    iget v4, v3, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->rule:I

    iget v5, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I

    if-ne v4, v5, :cond_1

    iget-object v4, v3, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object v4, v4, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;

    if-ne v4, p1, :cond_1

    .line 693
    invoke-virtual {p1, p0}, Lcom/nineoldandroids/animation/Animator;->removeListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V

    move-object v0, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 697
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object p1, p1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 698
    iget-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object p1, p1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_3

    .line 700
    iget-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object p1, p1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;

    invoke-virtual {p1}, Lcom/nineoldandroids/animation/Animator;->start()V

    .line 701
    iget-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;

    invoke-static {p1}, Lcom/nineoldandroids/animation/AnimatorSet;->access$000(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;

    iget-object v0, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
    .locals 2

    .line 653
    iget v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 654
    invoke-direct {p0, p1}, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->startIfReady(Lcom/nineoldandroids/animation/Animator;)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Lcom/nineoldandroids/animation/Animator;)V
    .locals 1

    .line 668
    iget v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I

    if-nez v0, :cond_0

    .line 669
    invoke-direct {p0, p1}, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;->startIfReady(Lcom/nineoldandroids/animation/Animator;)V

    :cond_0
    return-void
.end method
