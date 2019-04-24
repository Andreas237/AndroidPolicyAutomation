.class Lo/bdz$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/bdz;


# direct methods
.method private constructor <init>(Lo/bdz;)V
    .locals 0

    .line 715
    iput-object p1, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bdz;Lo/bdz$2;)V
    .locals 0

    .line 715
    invoke-direct {p0, p1}, Lo/bdz$c;-><init>(Lo/bdz;)V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 719
    iget-object v0, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-static {v0}, Lo/bdz;->e(Lo/bdz;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 720
    iget-object v0, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-virtual {v0}, Lo/bdz;->getHeaderViewCount()I

    move-result v0

    iget-object v1, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-static {v1}, Lo/bdz;->c(Lo/bdz;)I

    move-result v1

    mul-int/2addr v0, v1

    sub-int v6, p3, v0

    .line 721
    if-ltz v6, :cond_0

    .line 722
    iget-object v0, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-static {v0}, Lo/bdz;->e(Lo/bdz;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v3, v6

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 725
    :cond_0
    return-void
.end method

.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 729
    iget-object v0, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-static {v0}, Lo/bdz;->d(Lo/bdz;)Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 730
    iget-object v0, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-virtual {v0}, Lo/bdz;->getHeaderViewCount()I

    move-result v0

    iget-object v1, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-static {v1}, Lo/bdz;->c(Lo/bdz;)I

    move-result v1

    mul-int/2addr v0, v1

    sub-int v6, p3, v0

    .line 731
    if-ltz v6, :cond_0

    .line 732
    iget-object v0, p0, Lo/bdz$c;->d:Lo/bdz;

    invoke-static {v0}, Lo/bdz;->d(Lo/bdz;)Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v3, v6

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    .line 735
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
