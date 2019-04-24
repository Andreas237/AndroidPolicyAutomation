.class public Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "BarGraphAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "GraphColumnViewHolder"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;

.field private tvLabel:Landroid/widget/TextView;

.field private tvValue:Landroid/widget/TextView;

.field private vBar:Landroid/view/View;

.field private vEmpty:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;Landroid/view/View;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->this$0:Lcom/ibotta/android/view/graph/bar/BarGraphAdapter;

    .line 61
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0905b2

    .line 62
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->vEmpty:Landroid/view/View;

    const p1, 0x7f0905ac

    .line 63
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->vBar:Landroid/view/View;

    const p1, 0x7f090596

    .line 64
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->tvValue:Landroid/widget/TextView;

    const p1, 0x7f090539

    .line 65
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->tvLabel:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;Lcom/ibotta/android/view/graph/DataPoint;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->bind(Lcom/ibotta/android/view/graph/DataPoint;Ljava/lang/String;)V

    return-void
.end method

.method private bind(Lcom/ibotta/android/view/graph/DataPoint;Ljava/lang/String;)V
    .locals 5

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->vEmpty:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->vBar:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v2, 0x42c80000    # 100.0f

    if-eqz p1, :cond_0

    const/high16 v3, 0x3f800000    # 1.0f

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/DataPoint;->getValue()F

    move-result v4

    sub-float/2addr v3, v4

    mul-float v3, v3, v2

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/DataPoint;->getValue()F

    move-result v3

    mul-float v3, v3, v2

    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 77
    iget-object v2, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->tvValue:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/graph/DataPoint;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_1

    .line 79
    iget-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->tvLabel:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 82
    :cond_0
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 p1, 0x0

    .line 83
    iput p1, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 85
    iget-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->tvValue:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    iget-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->tvLabel:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->vEmpty:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/view/graph/bar/BarGraphAdapter$GraphColumnViewHolder;->vBar:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
