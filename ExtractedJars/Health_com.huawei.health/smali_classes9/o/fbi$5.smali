.class Lo/fbi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbi;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fbi;


# direct methods
.method constructor <init>(Lo/fbi;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/fbi$5;->c:Lo/fbi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 5

    .line 129
    iget-object v0, p0, Lo/fbi$5;->c:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/fbd;->d(I)Lo/fbp;

    move-result-object v2

    .line 131
    invoke-virtual {p1, p3}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v3

    .line 132
    if-nez v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 134
    :goto_0
    if-eqz v4, :cond_1

    .line 135
    invoke-virtual {p1, p3}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 136
    iget-object v0, p0, Lo/fbi$5;->c:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    new-instance v1, Lo/fbi$5$5;

    invoke-direct {v1, p0}, Lo/fbi$5$5;-><init>(Lo/fbi$5;)V

    invoke-virtual {v0, v2, v1}, Lo/fbd;->c(Lo/fbp;Lo/fbd$b;)V

    goto :goto_1

    .line 143
    :cond_1
    iget-object v0, p0, Lo/fbi$5;->c:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/fbd;->c(Lo/fbp;)V

    .line 144
    invoke-virtual {p1, p3}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    .line 145
    iget-object v0, p0, Lo/fbi$5;->c:Lo/fbi;

    invoke-virtual {v0}, Lo/fbi;->d()V

    .line 147
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
