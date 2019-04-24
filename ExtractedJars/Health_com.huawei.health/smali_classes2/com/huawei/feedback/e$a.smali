.class public Lcom/huawei/feedback/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/widget/TextView;

.field public b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/content/Context;)V
    .locals 0

    .line 474
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 475
    iput-object p1, p0, Lcom/huawei/feedback/e$a;->a:Landroid/widget/TextView;

    .line 476
    iput-object p2, p0, Lcom/huawei/feedback/e$a;->b:Landroid/content/Context;

    .line 477
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 482
    iget-object v0, p0, Lcom/huawei/feedback/e$a;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 483
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 484
    iget-object v0, p0, Lcom/huawei/feedback/e$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/feedback/e$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/e$a;->b:Landroid/content/Context;

    const-string v3, "feedback_spannable_click_color"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 487
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 488
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/e$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/feedback/e$a;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/feedback/e;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 492
    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
