.class Lo/fha$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fha;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fha;


# direct methods
.method constructor <init>(Lo/fha;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lo/fha$4;->b:Lo/fha;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    .line 222
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 223
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-virtual {v0}, Lo/fha;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 225
    :cond_0
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-virtual {v0}, Lo/fha;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 227
    :goto_0
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-virtual {v0}, Lo/fha;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-static {v0}, Lo/fha;->h(Lo/fha;)I

    move-result v0

    if-nez v0, :cond_2

    .line 228
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    iget-object v1, p0, Lo/fha$4;->b:Lo/fha;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lo/fha;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lo/fha;->c(Lo/fha;I)I

    .line 229
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-static {v0}, Lo/fha;->h(Lo/fha;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-virtual {v0}, Lo/fha;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 231
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-static {v0}, Lo/fha;->h(Lo/fha;)I

    move-result v0

    iget-object v1, p0, Lo/fha$4;->b:Lo/fha;

    invoke-static {v1}, Lo/fha;->f(Lo/fha;)I

    move-result v1

    mul-int/2addr v0, v1

    iput v0, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 232
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    iget-object v1, p0, Lo/fha$4;->b:Lo/fha;

    invoke-virtual {v1}, Lo/fha;->getFirstVisiblePosition()I

    move-result v1

    iget-object v2, p0, Lo/fha$4;->b:Lo/fha;

    .line 233
    invoke-virtual {v2}, Lo/fha;->getCurrentPosition()I

    move-result v2

    iget-object v3, p0, Lo/fha$4;->b:Lo/fha;

    invoke-static {v3}, Lo/fha;->f(Lo/fha;)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/fha$4;->b:Lo/fha;

    .line 234
    invoke-static {v3}, Lo/fha;->f(Lo/fha;)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    .line 232
    invoke-static {v0, v1, v2, v3}, Lo/fha;->c(Lo/fha;III)V

    .line 235
    iget-object v0, p0, Lo/fha$4;->b:Lo/fha;

    invoke-static {v0}, Lo/fha;->k(Lo/fha;)V

    .line 236
    goto :goto_1

    .line 237
    :cond_1
    new-instance v0, Lo/fhf;

    const-string v1, "wheel item is error."

    invoke-direct {v0, v1}, Lo/fhf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_2
    :goto_1
    return-void
.end method
