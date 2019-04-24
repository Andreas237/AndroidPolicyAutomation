.class Lo/emr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emr;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/emr;


# direct methods
.method constructor <init>(Lo/emr;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/emr$3;->b:Lo/emr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 160
    iget-object v0, p0, Lo/emr$3;->b:Lo/emr;

    invoke-static {v0}, Lo/emr;->c(Lo/emr;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 161
    iget-object v0, p0, Lo/emr$3;->b:Lo/emr;

    invoke-static {v0}, Lo/emr;->c(Lo/emr;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 162
    iget-object v0, p0, Lo/emr$3;->b:Lo/emr;

    invoke-static {v0}, Lo/emr;->c(Lo/emr;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 164
    :cond_0
    iget-object v0, p0, Lo/emr$3;->b:Lo/emr;

    invoke-static {v0}, Lo/emr;->c(Lo/emr;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 166
    :goto_0
    return-void
.end method
