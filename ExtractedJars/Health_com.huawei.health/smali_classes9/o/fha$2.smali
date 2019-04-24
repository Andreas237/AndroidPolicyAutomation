.class Lo/fha$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fha;


# direct methods
.method constructor <init>(Lo/fha;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/fha$2;->c:Lo/fha;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .line 145
    if-eqz p3, :cond_0

    .line 146
    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fha;->b(Lo/fha;Z)V

    .line 148
    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 9

    .line 122
    if-nez p2, :cond_3

    .line 123
    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fha;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 124
    if-eqz v6, :cond_3

    .line 125
    invoke-virtual {v6}, Landroid/view/View;->getY()F

    move-result v7

    .line 126
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    invoke-static {v0}, Lo/fha;->h(Lo/fha;)I

    move-result v0

    if-nez v0, :cond_1

    .line 127
    :cond_0
    return-void

    .line 129
    :cond_1
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    iget-object v2, p0, Lo/fha$2;->c:Lo/fha;

    invoke-static {v2}, Lo/fha;->h(Lo/fha;)I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 130
    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    invoke-static {v0, v7}, Lo/fha;->c(Lo/fha;F)I

    move-result v8

    .line 131
    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    const/16 v1, 0x32

    invoke-virtual {v0, v8, v1}, Lo/fha;->smoothScrollBy(II)V

    .line 133
    goto :goto_0

    .line 134
    :cond_2
    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    iget-object v1, p0, Lo/fha$2;->c:Lo/fha;

    invoke-static {v1}, Lo/fha;->h(Lo/fha;)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, v7

    invoke-static {v0, v1}, Lo/fha;->c(Lo/fha;F)I

    move-result v8

    .line 135
    iget-object v0, p0, Lo/fha$2;->c:Lo/fha;

    const/16 v1, 0x32

    invoke-virtual {v0, v8, v1}, Lo/fha;->smoothScrollBy(II)V

    .line 140
    :cond_3
    :goto_0
    return-void
.end method
