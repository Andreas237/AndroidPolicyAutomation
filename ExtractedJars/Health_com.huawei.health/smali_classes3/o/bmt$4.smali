.class Lo/bmt$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bmt;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bmt;


# direct methods
.method constructor <init>(Lo/bmt;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lo/bmt$4;->a:Lo/bmt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 71
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/bmt$4;->a:Lo/bmt;

    invoke-static {v0}, Lo/bmt;->d(Lo/bmt;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bmt$4;->a:Lo/bmt;

    invoke-virtual {v1}, Lo/bmt;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_assist_menu_pressed_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 77
    iget-object v0, p0, Lo/bmt$4;->a:Lo/bmt;

    invoke-static {v0}, Lo/bmt;->d(Lo/bmt;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bmt$4;->a:Lo/bmt;

    invoke-virtual {v1}, Lo/bmt;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_assist_menu_normal_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 79
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
