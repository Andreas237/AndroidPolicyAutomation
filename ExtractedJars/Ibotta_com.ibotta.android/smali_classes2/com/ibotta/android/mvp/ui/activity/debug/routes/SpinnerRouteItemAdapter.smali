.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "SpinnerRouteItemAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c014d

    .line 20
    invoke-direct {p0, p1, v0, p2}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;->setDropDownViewResource(I)V

    return-void
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 38
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 1

    .line 26
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;

    const v0, 0x7f09054d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;-><init>(Landroid/widget/TextView;)V

    return-object p1
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V
    .locals 0

    .line 31
    check-cast p3, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;

    .line 33
    invoke-static {p3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;->access$000(Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter$SpinnerItemViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p4}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getLabel()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p4, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method
