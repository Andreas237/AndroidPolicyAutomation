.class public Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder_ViewBinding;
.super Ljava/lang/Object;
.source "FriendsAdapter$FriendsViewHolder_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;

    const-string v0, "field \'llTeammateContainer\'"

    .line 24
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09032e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->llTeammateContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvRank\'"

    .line 25
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090564

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvRank:Landroid/widget/TextView;

    const-string v0, "field \'ivProfilePic\'"

    .line 26
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902cc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->ivProfilePic:Landroid/widget/ImageView;

    const-string v0, "field \'tvName\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090525

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvName:Landroid/widget/TextView;

    const-string v0, "field \'tvAmount\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904ee

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvAmount:Landroid/widget/TextView;

    const-string v0, "field \'tvBonusContribution\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904ff

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvBonusContribution:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->llTeammateContainer:Landroid/widget/LinearLayout;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvRank:Landroid/widget/TextView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->ivProfilePic:Landroid/widget/ImageView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvName:Landroid/widget/TextView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvAmount:Landroid/widget/TextView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvBonusContribution:Landroid/widget/TextView;

    return-void

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
