.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "TeammatesAdapter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/view/model/FriendItem;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/FriendItem;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;I)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/model/FriendItem;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->access$000(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;Lcom/ibotta/android/view/model/FriendItem;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;
    .locals 1

    .line 42
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public onTeammateRowViewClicked(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;

    if-eqz v0, :cond_0

    .line 76
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;->onTeammateClicked(Lcom/ibotta/android/view/model/FriendItem;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;->notifyDataSetChanged()V

    return-void
.end method
