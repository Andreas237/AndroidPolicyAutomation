.class Lo/ezi$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 149
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezi$c;->c:Landroid/widget/LinearLayout;

    .line 150
    sget v0, Lcom/huawei/ui/main/R$id;->observer_view_item_place:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ezi$c;->c:Landroid/widget/LinearLayout;

    .line 151
    return-void
.end method


# virtual methods
.method public b(Lo/ezj;)V
    .locals 1

    .line 154
    iget-object v0, p0, Lo/ezi$c;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 155
    iget-object v0, p0, Lo/ezi$c;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 156
    return-void
.end method
