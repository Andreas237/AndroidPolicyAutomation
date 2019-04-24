.class Lo/egt$c$b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egt$c$b;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:I

.field final synthetic d:Lo/egt$c$b;


# direct methods
.method constructor <init>(Lo/egt$c$b;ILandroid/widget/CheckBox;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    iput p2, p0, Lo/egt$c$b$1;->b:I

    iput-object p3, p0, Lo/egt$c$b$1;->a:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 406
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    invoke-static {v0}, Lo/egt$c$b;->c(Lo/egt$c$b;)[Z

    move-result-object v0

    array-length v0, v0

    if-ge v6, v0, :cond_0

    .line 408
    iget-object v0, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    invoke-static {v0}, Lo/egt$c$b;->c(Lo/egt$c$b;)[Z

    move-result-object v0

    const/4 v1, 0x0

    aput-boolean v1, v0, v6

    .line 406
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 411
    :cond_0
    iget-object v0, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    invoke-static {v0}, Lo/egt$c$b;->c(Lo/egt$c$b;)[Z

    move-result-object v0

    iget v1, p0, Lo/egt$c$b$1;->b:I

    iget-object v2, p0, Lo/egt$c$b$1;->a:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    aput-boolean v2, v0, v1

    .line 412
    iget-object v0, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    invoke-virtual {v0}, Lo/egt$c$b;->notifyDataSetChanged()V

    .line 413
    iget-object v0, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    invoke-static {v0}, Lo/egt$c$b;->b(Lo/egt$c$b;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 414
    iget-object v0, p0, Lo/egt$c$b$1;->d:Lo/egt$c$b;

    invoke-static {v0}, Lo/egt$c$b;->b(Lo/egt$c$b;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    move-object v2, p1

    iget v3, p0, Lo/egt$c$b$1;->b:I

    const/4 v1, 0x0

    const-wide/16 v4, -0x1

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 416
    :cond_1
    return-void
.end method
