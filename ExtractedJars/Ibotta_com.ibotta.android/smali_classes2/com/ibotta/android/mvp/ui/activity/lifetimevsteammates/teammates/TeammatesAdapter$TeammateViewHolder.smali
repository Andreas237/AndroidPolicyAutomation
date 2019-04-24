.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "TeammatesAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TeammateViewHolder"
.end annotation


# instance fields
.field private teammateRowView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;Landroid/view/View;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;

    .line 58
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 59
    check-cast p2, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->teammateRowView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->bind(Lcom/ibotta/android/view/model/FriendItem;)V

    return-void
.end method

.method private bind(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->teammateRowView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setFriendItem(Lcom/ibotta/android/view/model/FriendItem;)V

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->teammateRowView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter$TeammateViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesAdapter;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;)V

    return-void
.end method
