.class public Lcom/ibotta/android/fragment/activity/FriendsNameComparator;
.super Ljava/lang/Object;
.source "FriendsNameComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/friend/Friend;",
        ">;"
    }
.end annotation


# instance fields
.field private final formatting:Lcom/ibotta/android/util/Formatting;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/friend/Friend;Lcom/ibotta/api/model/friend/Friend;)I
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    const/4 p1, -0x1

    goto :goto_0

    .line 29
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getLastName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p2}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/ibotta/api/model/friend/Friend;->getLastName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/api/model/friend/Friend;

    check-cast p2, Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;->compare(Lcom/ibotta/api/model/friend/Friend;Lcom/ibotta/api/model/friend/Friend;)I

    move-result p1

    return p1
.end method
