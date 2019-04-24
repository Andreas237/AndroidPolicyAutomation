.class Lo/bem$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/text/SpannableStringBuilder;

.field private d:Landroid/text/SpannableStringBuilder;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;Landroid/text/SpannableStringBuilder;)V
    .locals 0

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p1, p0, Lo/bem$e;->e:Landroid/widget/TextView;

    .line 162
    iput-object p2, p0, Lo/bem$e;->d:Landroid/text/SpannableStringBuilder;

    .line 163
    iput-object p3, p0, Lo/bem$e;->a:Landroid/text/SpannableStringBuilder;

    .line 164
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 169
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 171
    iget-object v0, p0, Lo/bem$e;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bem$e;->a:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 173
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 175
    :cond_1
    iget-object v0, p0, Lo/bem$e;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bem$e;->d:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
