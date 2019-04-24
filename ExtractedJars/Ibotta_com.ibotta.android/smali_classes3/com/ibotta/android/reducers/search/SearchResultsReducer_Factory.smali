.class public final Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;
.super Ljava/lang/Object;
.source "SearchResultsReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/reducers/search/SearchResultsReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentListReducerUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final misspellingReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/MisspellingReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBarReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/MisspellingReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->resourcesProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->misspellingReducerProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->titleBarReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/MisspellingReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;"
        }
    .end annotation

    .line 70
    new-instance v6, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static newSearchResultsReducer(Landroid/content/res/Resources;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/search/MisspellingReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/reducers/search/SearchResultsReducer;
    .locals 7

    .line 84
    new-instance v6, Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;-><init>(Landroid/content/res/Resources;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/search/MisspellingReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/search/SearchResultsReducer;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/MisspellingReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/reducers/search/SearchResultsReducer;"
        }
    .end annotation

    .line 56
    new-instance v6, Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    .line 57
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/res/Resources;

    .line 58
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 59
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/search/MisspellingReducer;

    .line 60
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 61
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/title/TitleBarReducer;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;-><init>(Landroid/content/res/Resources;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/search/MisspellingReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/ibotta/android/reducers/search/SearchResultsReducer;
    .locals 5

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->resourcesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->misspellingReducerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->titleBarReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->get()Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    move-result-object v0

    return-object v0
.end method
