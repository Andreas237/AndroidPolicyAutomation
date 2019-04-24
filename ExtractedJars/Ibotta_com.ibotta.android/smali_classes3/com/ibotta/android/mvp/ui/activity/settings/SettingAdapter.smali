.class public Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SettingAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;

.field private settingRows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->settingRows:Ljava/util/List;

    .line 20
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingViewHolderFactory;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->settingRows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->settingRows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;I)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->settingRows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->settingRows:Ljava/util/List;

    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->settingRows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapter;->notifyDataSetChanged()V

    return-void
.end method
