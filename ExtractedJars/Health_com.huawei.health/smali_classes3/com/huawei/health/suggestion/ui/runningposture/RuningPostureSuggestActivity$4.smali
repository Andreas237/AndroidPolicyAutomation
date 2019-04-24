.class Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->upShow(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Landroid/view/View;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 275
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAnimationEnd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 277
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 282
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 270
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 271
    return-void
.end method
