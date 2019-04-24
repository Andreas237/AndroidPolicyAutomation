.class Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;
.super Landroid/widget/Filter;
.source "FilterableAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/feed/FilterableAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StoreSelectorScreenFilter"
.end annotation


# instance fields
.field private lastConstraint:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/feed/FilterableAdapter;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/FilterableAdapter;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    const-string p1, ""

    .line 67
    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->lastConstraint:Ljava/lang/String;

    return-void
.end method

.method private filterTiles(Ljava/lang/String;Ljava/util/List;)Landroid/widget/Filter$FilterResults;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)",
            "Landroid/widget/Filter$FilterResults;"
        }
    .end annotation

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 93
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 94
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 96
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3c

    if-ne v4, v5, :cond_3

    .line 97
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 98
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    goto :goto_2

    .line 101
    :cond_0
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    const-string v6, " "

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 102
    array-length v6, v4

    move v7, v1

    :goto_1
    if-ge v7, v6, :cond_2

    aget-object v8, v4, v7

    .line 103
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 104
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-virtual {p1, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    move v5, v1

    :goto_2
    if-eqz v5, :cond_3

    .line 111
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 116
    :cond_4
    new-instance p1, Landroid/widget/Filter$FilterResults;

    invoke-direct {p1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 117
    iput-object v0, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    return-object p1
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, ""

    .line 73
    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->lastConstraint:Ljava/lang/String;

    .line 74
    new-instance p1, Landroid/widget/Filter$FilterResults;

    invoke-direct {p1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-static {v0}, Lcom/shopkick/app/feed/FilterableAdapter;->access$000(Lcom/shopkick/app/feed/FilterableAdapter;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    return-object p1

    .line 78
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->lastConstraint:Ljava/lang/String;

    .line 80
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->lastConstraint:Ljava/lang/String;

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-static {p1}, Lcom/shopkick/app/feed/FilterableAdapter;->access$100(Lcom/shopkick/app/feed/FilterableAdapter;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->filterTiles(Ljava/lang/String;Ljava/util/List;)Landroid/widget/Filter$FilterResults;

    move-result-object p1

    return-object p1

    .line 84
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->lastConstraint:Ljava/lang/String;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-static {p1}, Lcom/shopkick/app/feed/FilterableAdapter;->access$000(Lcom/shopkick/app/feed/FilterableAdapter;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->filterTiles(Ljava/lang/String;Ljava/util/List;)Landroid/widget/Filter$FilterResults;

    move-result-object p1

    return-object p1
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 1

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    new-instance v0, Ljava/util/ArrayList;

    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast p2, Ljava/util/Collection;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p1, Lcom/shopkick/app/feed/FilterableAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p1, Lcom/shopkick/app/feed/FilterableAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1, p2}, Lcom/shopkick/app/feed/FilterableAdapter;->access$102(Lcom/shopkick/app/feed/FilterableAdapter;Ljava/util/List;)Ljava/util/List;

    .line 125
    iget-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;->this$0:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FilterableAdapter;->notifyDataSetChanged()V

    return-void
.end method
