.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/RewardTypeComparator;
.super Ljava/lang/Object;
.source "RewardTypeComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/TaskModel$Type;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/TaskModel$Type;Lcom/ibotta/api/model/TaskModel$Type;)I
    .locals 0

    .line 14
    invoke-virtual {p1}, Lcom/ibotta/api/model/TaskModel$Type;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/TaskModel$Type;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/api/model/TaskModel$Type;

    check-cast p2, Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/RewardTypeComparator;->compare(Lcom/ibotta/api/model/TaskModel$Type;Lcom/ibotta/api/model/TaskModel$Type;)I

    move-result p1

    return p1
.end method
