.class public Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/carddisplay/CardLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "SwapAnimatorListener"
.end annotation


# instance fields
.field private b:I

.field final synthetic c:Lcom/huawei/wallet/ui/carddisplay/CardLayout;


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)V
    .locals 0

    .line 1330
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 1331
    iput p2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->b:I

    .line 1332
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1337
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1340
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->b:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;->a(II)V

    .line 1343
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$SwapAnimatorListener;->b:I

    iput v1, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    .line 1345
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 1346
    return-void
.end method
