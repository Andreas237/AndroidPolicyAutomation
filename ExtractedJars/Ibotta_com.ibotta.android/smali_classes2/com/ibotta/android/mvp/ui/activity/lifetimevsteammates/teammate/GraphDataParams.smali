.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;
.super Ljava/lang/Object;
.source "GraphDataParams.java"


# instance fields
.field private friendDataSet:Lcom/ibotta/android/view/graph/DataSet;

.field private friendLegendItem:Lcom/ibotta/android/view/graph/LegendItem;

.field private myDataSet:Lcom/ibotta/android/view/graph/DataSet;

.field private myLegendItem:Lcom/ibotta/android/view/graph/LegendItem;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFriendDataSet()Lcom/ibotta/android/view/graph/DataSet;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->friendDataSet:Lcom/ibotta/android/view/graph/DataSet;

    return-object v0
.end method

.method public getFriendLegendItem()Lcom/ibotta/android/view/graph/LegendItem;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->friendLegendItem:Lcom/ibotta/android/view/graph/LegendItem;

    return-object v0
.end method

.method public getMyDataSet()Lcom/ibotta/android/view/graph/DataSet;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->myDataSet:Lcom/ibotta/android/view/graph/DataSet;

    return-object v0
.end method

.method public getMyLegendItem()Lcom/ibotta/android/view/graph/LegendItem;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->myLegendItem:Lcom/ibotta/android/view/graph/LegendItem;

    return-object v0
.end method

.method public setFriendDataSet(Lcom/ibotta/android/view/graph/DataSet;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->friendDataSet:Lcom/ibotta/android/view/graph/DataSet;

    return-void
.end method

.method public setFriendLegendItem(Lcom/ibotta/android/view/graph/LegendItem;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->friendLegendItem:Lcom/ibotta/android/view/graph/LegendItem;

    return-void
.end method

.method public setMyDataSet(Lcom/ibotta/android/view/graph/DataSet;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->myDataSet:Lcom/ibotta/android/view/graph/DataSet;

    return-void
.end method

.method public setMyLegendItem(Lcom/ibotta/android/view/graph/LegendItem;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->myLegendItem:Lcom/ibotta/android/view/graph/LegendItem;

    return-void
.end method
