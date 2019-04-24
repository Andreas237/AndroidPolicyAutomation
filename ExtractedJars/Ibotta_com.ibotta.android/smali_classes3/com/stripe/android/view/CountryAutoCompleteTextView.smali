.class public Lcom/stripe/android/view/CountryAutoCompleteTextView;
.super Landroid/widget/FrameLayout;
.source "CountryAutoCompleteTextView.java"


# annotations
.annotation build Landroid/support/annotation/RestrictTo;
    value = {
        .enum Landroid/support/annotation/RestrictTo$Scope;->LIBRARY:Landroid/support/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;
    }
.end annotation


# instance fields
.field private mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

.field private mCountryChangeListener:Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;

.field private mCountryNameToCode:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mCountrySelected:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    invoke-direct {p0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->initView()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/CountryAutoCompleteTextView;)Landroid/widget/AutoCompleteTextView;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    return-object p0
.end method

.method private initView()V
    .locals 5

    .line 62
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$layout;->country_autocomplete_textview:I

    invoke-static {v0, v1, p0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 63
    sget v0, Lcom/stripe/android/R$id;->autocomplete_country_cat:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/AutoCompleteTextView;

    iput-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    .line 64
    invoke-static {}, Lcom/stripe/android/view/CountryUtils;->getCountryNameToCodeMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryNameToCode:Ljava/util/Map;

    .line 65
    new-instance v0, Lcom/stripe/android/view/CountryAdapter;

    invoke-virtual {p0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryNameToCode:Ljava/util/Map;

    .line 66
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/CountryAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 67
    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    .line 68
    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 69
    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    new-instance v3, Lcom/stripe/android/view/CountryAutoCompleteTextView$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/CountryAutoCompleteTextView$1;-><init>(Lcom/stripe/android/view/CountryAutoCompleteTextView;)V

    instance-of v4, v1, Landroid/widget/AdapterView;

    if-nez v4, :cond_0

    invoke-virtual {v1, v3}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v1, Landroid/widget/AdapterView;

    invoke-static {v1, v3}, Lcom/newrelic/agent/android/instrumentation/AdapterViewInstrumentation;->setOnItemClickListener(Landroid/widget/AdapterView;Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 76
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 77
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->updateUIForCountryEntered(Ljava/lang/String;)V

    .line 78
    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lcom/stripe/android/view/CountryAutoCompleteTextView$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CountryAutoCompleteTextView$2;-><init>(Lcom/stripe/android/view/CountryAutoCompleteTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method


# virtual methods
.method getSelectedCountryCode()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountrySelected:Ljava/lang/String;

    return-object v0
.end method

.method setCountryChangeListener(Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryChangeListener:Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;

    return-void
.end method

.method setCountrySelected(Ljava/lang/String;)V
    .locals 2

    .line 53
    new-instance v0, Ljava/util/Locale;

    const-string v1, ""

    invoke-direct {v0, v1, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-virtual {v0}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->updateUIForCountryEntered(Ljava/lang/String;)V

    return-void
.end method

.method updateUIForCountryEntered(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryNameToCode:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 96
    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountrySelected:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 97
    :cond_0
    iput-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountrySelected:Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryChangeListener:Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;

    if-eqz v0, :cond_1

    .line 99
    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountrySelected:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;->onCountryChanged(Ljava/lang/String;)V

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 105
    :cond_2
    new-instance p1, Ljava/util/Locale;

    const-string v0, ""

    iget-object v1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountrySelected:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object p1

    .line 106
    iget-object v0, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView;->mCountryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
