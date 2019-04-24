.class final Lcom/huawei/phoneserviceuni/common/e/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 379
    const/4 v2, 0x0

    .line 380
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 381
    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_0

    .line 382
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 383
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 384
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 386
    :cond_2
    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    .line 387
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 389
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
