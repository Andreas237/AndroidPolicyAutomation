.class Lo/byy$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/byy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/byy;


# direct methods
.method constructor <init>(Lo/byy;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lo/byy$4;->b:Lo/byy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 5

    .line 125
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    iget-object v0, v0, Lo/byy;->d:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    iget-object v0, v0, Lo/byy;->d:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 129
    :cond_0
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v0}, Lo/byy;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    .line 130
    if-eqz v2, :cond_1

    if-nez p3, :cond_2

    .line 131
    :cond_1
    return-void

    .line 133
    .line 134
    :cond_2
    invoke-interface {v2, p2}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v0

    invoke-static {v2, v0}, Lo/byy;->b(Landroid/widget/ListAdapter;I)Z

    move-result v3

    .line 136
    if-eqz v3, :cond_4

    .line 137
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byy;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 138
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v1}, Lo/byy;->getPaddingTop()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 139
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v0}, Lo/byy;->c()V

    goto :goto_0

    .line 141
    :cond_3
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v0, p2, p2, p3}, Lo/byy;->b(III)V

    .line 144
    :goto_0
    goto :goto_1

    .line 145
    :cond_4
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v0, p2}, Lo/byy;->b(I)I

    move-result v4

    .line 146
    const/4 v0, -0x1

    if-le v4, v0, :cond_5

    .line 147
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v0, v4, p2, p3}, Lo/byy;->b(III)V

    goto :goto_1

    .line 149
    :cond_5
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    invoke-virtual {v0}, Lo/byy;->c()V

    .line 152
    :goto_1
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .line 117
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    iget-object v0, v0, Lo/byy;->d:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lo/byy$4;->b:Lo/byy;

    iget-object v0, v0, Lo/byy;->d:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 120
    :cond_0
    return-void
.end method
