.class Lcom/stripe/android/view/CountryAdapter$1;
.super Landroid/widget/Filter;
.source "CountryAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CountryAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/CountryAdapter;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/CountryAdapter;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter$1;->this$0:Lcom/stripe/android/view/CountryAdapter;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 6

    .line 43
    new-instance v0, Landroid/widget/Filter$FilterResults;

    invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    .line 46
    iget-object p1, p0, Lcom/stripe/android/view/CountryAdapter$1;->this$0:Lcom/stripe/android/view/CountryAdapter;

    iget-object p1, p1, Lcom/stripe/android/view/CountryAdapter;->mCountries:Ljava/util/List;

    iput-object p1, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    return-object v0

    .line 49
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 50
    iget-object v3, p0, Lcom/stripe/android/view/CountryAdapter$1;->this$0:Lcom/stripe/android/view/CountryAdapter;

    iget-object v3, v3, Lcom/stripe/android/view/CountryAdapter;->mCountries:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 51
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 52
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 55
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    const/4 v2, 0x0

    .line 56
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 57
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CountryAdapter$1;->this$0:Lcom/stripe/android/view/CountryAdapter;

    iget-object v1, p1, Lcom/stripe/android/view/CountryAdapter;->mCountries:Ljava/util/List;

    .line 59
    :cond_4
    iput-object v1, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    return-object v0
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 0

    .line 65
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    .line 66
    iget-object p2, p0, Lcom/stripe/android/view/CountryAdapter$1;->this$0:Lcom/stripe/android/view/CountryAdapter;

    iput-object p1, p2, Lcom/stripe/android/view/CountryAdapter;->mSuggestions:Ljava/util/List;

    .line 67
    invoke-virtual {p2}, Lcom/stripe/android/view/CountryAdapter;->notifyDataSetChanged()V

    return-void
.end method
