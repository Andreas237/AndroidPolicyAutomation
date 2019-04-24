.class public Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "LineGraphAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/graph/line/LineGraphAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LineGraphCellViewHolder"
.end annotation


# instance fields
.field private final lgcvCell:Lcom/ibotta/android/view/graph/line/LineGraphCellView;

.field final synthetic this$0:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

.field private final tvLabel:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/graph/line/LineGraphAdapter;Landroid/view/View;)V
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->this$0:Lcom/ibotta/android/view/graph/line/LineGraphAdapter;

    .line 67
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0902ee

    .line 68
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/graph/line/LineGraphCellView;

    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->lgcvCell:Lcom/ibotta/android/view/graph/line/LineGraphCellView;

    const p1, 0x7f090539

    .line 69
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->tvLabel:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;Lcom/ibotta/android/view/graph/GraphDataSet;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->bind(Lcom/ibotta/android/view/graph/GraphDataSet;I)V

    return-void
.end method

.method private bind(Lcom/ibotta/android/view/graph/GraphDataSet;I)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->lgcvCell:Lcom/ibotta/android/view/graph/line/LineGraphCellView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->lgcvCell:Lcom/ibotta/android/view/graph/line/LineGraphCellView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/graph/line/LineGraphCellView;->setIndex(I)V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/view/graph/line/LineGraphAdapter$LineGraphCellViewHolder;->tvLabel:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/graph/GraphDataSet;->getLabel(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
