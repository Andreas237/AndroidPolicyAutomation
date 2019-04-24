.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "PreferencesAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->rows:Ljava/util/List;

    .line 21
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolderFactory;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;I)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 51
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 54
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapter;->notifyDataSetChanged()V

    return-void
.end method
