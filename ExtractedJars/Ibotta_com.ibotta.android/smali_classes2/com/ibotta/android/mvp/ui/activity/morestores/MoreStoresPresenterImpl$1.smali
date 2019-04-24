.class Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl$1;
.super Ljava/lang/Object;
.source "MoreStoresPresenterImpl.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->alphabetize(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;)I
    .locals 0

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p1

    .line 201
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p2

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p2

    .line 203
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 197
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl$1;->compare(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;)I

    move-result p1

    return p1
.end method
