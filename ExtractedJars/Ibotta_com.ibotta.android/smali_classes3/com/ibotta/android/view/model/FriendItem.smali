.class public Lcom/ibotta/android/view/model/FriendItem;
.super Ljava/lang/Object;
.source "FriendItem.java"


# instance fields
.field private friend:Lcom/ibotta/api/model/friend/Friend;

.field private me:Z

.field private name:Ljava/lang/String;

.field private rank:I

.field private showEarnings:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFriend()Lcom/ibotta/api/model/friend/Friend;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/view/model/FriendItem;->friend:Lcom/ibotta/api/model/friend/Friend;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/view/model/FriendItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRank()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/view/model/FriendItem;->rank:I

    return v0
.end method

.method public isMe()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/ibotta/android/view/model/FriendItem;->me:Z

    return v0
.end method

.method public isShowEarnings()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/view/model/FriendItem;->showEarnings:Z

    return v0
.end method

.method public setFriend(Lcom/ibotta/api/model/friend/Friend;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/view/model/FriendItem;->friend:Lcom/ibotta/api/model/friend/Friend;

    return-void
.end method

.method public setMe(Z)V
    .locals 0

    .line 20
    iput-boolean p1, p0, Lcom/ibotta/android/view/model/FriendItem;->me:Z

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/view/model/FriendItem;->name:Ljava/lang/String;

    return-void
.end method

.method public setRank(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/ibotta/android/view/model/FriendItem;->rank:I

    return-void
.end method

.method public setShowEarnings(Z)V
    .locals 0

    .line 28
    iput-boolean p1, p0, Lcom/ibotta/android/view/model/FriendItem;->showEarnings:Z

    return-void
.end method
