.class Lcom/stripe/android/view/CountryAdapter;
.super Landroid/widget/ArrayAdapter;
.source "CountryAdapter.java"


# instance fields
.field private mContext:Landroid/content/Context;

.field mCountries:Ljava/util/List;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mFilter:Landroid/widget/Filter;

.field mSuggestions:Ljava/util/List;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 36
    sget v0, Lcom/stripe/android/R$layout;->menu_text_view:I

    invoke-direct {p0, p1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->mContext:Landroid/content/Context;

    .line 38
    invoke-virtual {p0, p2}, Lcom/stripe/android/view/CountryAdapter;->getOrderedCountries(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->mCountries:Ljava/util/List;

    .line 39
    iget-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->mCountries:Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->mSuggestions:Ljava/util/List;

    .line 40
    new-instance p1, Lcom/stripe/android/view/CountryAdapter$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/CountryAdapter$1;-><init>(Lcom/stripe/android/view/CountryAdapter;)V

    iput-object p1, p0, Lcom/stripe/android/view/CountryAdapter;->mFilter:Landroid/widget/Filter;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->mSuggestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method getCurrentLocale()Ljava/util/Locale;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 122
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 123
    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v0

    return-object v0

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->mFilter:Landroid/widget/Filter;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getItem(I)Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/stripe/android/view/CountryAdapter;->mSuggestions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method getOrderedCountries(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List;"
        }
    .end annotation

    .line 109
    new-instance v0, Lcom/stripe/android/view/CountryAdapter$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/CountryAdapter$2;-><init>(Lcom/stripe/android/view/CountryAdapter;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 115
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryAdapter;->getCurrentLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 116
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryAdapter;->getCurrentLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-object p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-eqz p2, :cond_0

    .line 89
    instance-of v0, p2, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 90
    move-object p3, p2

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    .line 93
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/view/CountryAdapter;->mContext:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/stripe/android/R$layout;->menu_text_view:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 95
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
