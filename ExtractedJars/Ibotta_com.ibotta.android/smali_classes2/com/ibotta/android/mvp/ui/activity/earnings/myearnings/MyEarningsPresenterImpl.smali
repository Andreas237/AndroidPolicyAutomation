.class public Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "MyEarningsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;"
    }
.end annotation


# static fields
.field public static final COLLAPSED_LIST_SIZE:I = 0x5

.field private static final EARNINGS_HISTORY_LIMIT:I = 0xa


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field private customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private customerEarningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private customerFriendsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final earningsHelper:Lcom/ibotta/api/helper/earnings/EarningsHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/earnings/EarningsHelper;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 67
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 68
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 69
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->earningsHelper:Lcom/ibotta/api/helper/earnings/EarningsHelper;

    .line 70
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method private applyFriendRanks(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)I"
        }
    .end annotation

    .line 258
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/view/model/FriendItem;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_2

    .line 259
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/Float;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 260
    :cond_1
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 264
    :cond_2
    invoke-virtual {v3, v1}, Lcom/ibotta/android/view/model/FriendItem;->setRank(I)V

    .line 266
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 267
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->getRank()I

    move-result v0

    goto :goto_0

    :cond_3
    return v0
.end method

.method private createEarningsHistoryList(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;"
        }
    .end annotation

    .line 203
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 204
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->removeUnsupportedEarnings(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    .line 206
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-ge v2, v3, :cond_0

    .line 207
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/earnings/Earning;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private createFriendItemList(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation

    .line 236
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/friend/Friend;

    .line 239
    new-instance v2, Lcom/ibotta/android/view/model/FriendItem;

    invoke-direct {v2}, Lcom/ibotta/android/view/model/FriendItem;-><init>()V

    .line 240
    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v4}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v4

    const/4 v5, 0x1

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Lcom/ibotta/android/view/model/FriendItem;->setMe(Z)V

    .line 241
    invoke-virtual {v2, v5}, Lcom/ibotta/android/view/model/FriendItem;->setShowEarnings(Z)V

    .line 243
    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v3

    .line 244
    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getLastName()Ljava/lang/String;

    move-result-object v4

    .line 245
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v5, v3, v4}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/view/model/FriendItem;->setName(Ljava/lang/String;)V

    .line 247
    invoke-virtual {v2, v1}, Lcom/ibotta/android/view/model/FriendItem;->setFriend(Lcom/ibotta/api/model/friend/Friend;)V

    .line 248
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private generateGraphDataSet(Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/view/graph/GraphDataSet;
    .locals 9

    .line 162
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getMonthlyEarnings()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 166
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 171
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getMonthlyEarnings()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getJoinDate()Ljava/util/Date;

    move-result-object p1

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 170
    invoke-static {v3, p1, v4}, Lcom/ibotta/api/util/UserEarningsHelper;->addMissingEarnings(Ljava/util/Map;Ljava/util/Date;Ljava/util/Date;)Ljava/util/Map;

    move-result-object p1

    .line 172
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 173
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v5, v4}, Lcom/ibotta/android/util/Formatting;->getEarningsMonth(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 176
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    .line 177
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v5

    cmpl-float v5, v5, v1

    if-lez v5, :cond_2

    .line 178
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    .line 182
    :cond_3
    new-instance v3, Lcom/ibotta/android/view/graph/DataSet;

    invoke-direct {v3}, Lcom/ibotta/android/view/graph/DataSet;-><init>()V

    .line 183
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 185
    new-instance v5, Lcom/ibotta/android/view/graph/DataPoint;

    invoke-direct {v5}, Lcom/ibotta/android/view/graph/DataPoint;-><init>()V

    .line 186
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    .line 187
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v6

    div-float/2addr v6, v1

    invoke-virtual {v5, v6}, Lcom/ibotta/android/view/graph/DataPoint;->setValue(F)V

    .line 188
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    float-to-double v7, v4

    invoke-interface {v6, v7, v8}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/ibotta/android/view/graph/DataPoint;->setLabel(Ljava/lang/String;)V

    .line 189
    invoke-virtual {v3, v5}, Lcom/ibotta/android/view/graph/DataSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 192
    :cond_4
    new-instance p1, Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-direct {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;-><init>()V

    .line 193
    invoke-virtual {p1, v2}, Lcom/ibotta/android/view/graph/GraphDataSet;->setDataSets(Ljava/util/List;)V

    .line 194
    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setLabels(Ljava/util/List;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setMinYAxisLabel(Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setMaxYAxisLabel(Ljava/lang/String;)V

    return-object p1
.end method

.method private isEarningStateSupported(Lcom/ibotta/api/model/earnings/Earning$ProcessingState;)Z
    .locals 1

    .line 232
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->ERROR:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isEarningSupported(Lcom/ibotta/api/model/earnings/Earning;)Z
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->earningsHelper:Lcom/ibotta/api/helper/earnings/EarningsHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/earnings/EarningsHelper;->isEarningTypeSupported(Lcom/ibotta/api/model/earnings/Earning$Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->isEarningStateSupported(Lcom/ibotta/api/model/earnings/Earning$ProcessingState;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private removeUnsupportedEarnings(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;"
        }
    .end annotation

    .line 214
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 216
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/earnings/Earning;

    .line 217
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->isEarningSupported(Lcom/ibotta/api/model/earnings/Earning;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 218
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 75
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 78
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerByIdJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 80
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerFriendsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerFriendsJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerFriendsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 83
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerEarningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 84
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 85
    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->COMPLETE:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 89
    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->RECEIPT:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 90
    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->CUSTOMER_BONUS:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 93
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    const/16 v6, 0xa

    const/4 v7, 0x0

    .line 92
    invoke-interface/range {v2 .. v7}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerEarningsJob(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerEarningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 96
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerFriendsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerEarningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 105
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 106
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerFriendsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 107
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerEarningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onEarningsRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 2

    .line 150
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl$1;->$SwitchMap$com$ibotta$api$model$earnings$Earning$Type:[I

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 156
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/earnings/Earning;->getId()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->showCustomerBonusDetails(Ljava/lang/String;I)V

    goto :goto_0

    .line 153
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->fromEarning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->showEarningsDetails(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 7

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerFriendsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;

    .line 114
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getLifetimeEarnings()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v0, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 118
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->setSubtitleValue(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getJoinDate()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/util/Formatting;->joinDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 121
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->setupMyEarningsMemberSince(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->generateGraphDataSet(Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/view/graph/GraphDataSet;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->graphDataSet:Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->setupMyEarningsGraph(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->customerEarningsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;

    .line 127
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;->getEarnings()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->createEarningsHistoryList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 128
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-interface {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->setMyEarningsVisibility(Z)V

    .line 129
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->setupMyEarningsHistory(Ljava/util/List;)V

    .line 131
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->getFriends()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->createFriendItemList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 132
    new-instance v1, Lcom/ibotta/android/fragment/activity/FriendItemsLifetimeEarningsComparator;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/activity/FriendItemsLifetimeEarningsComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 134
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->applyFriendRanks(Ljava/util/List;)I

    move-result v1

    .line 135
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 137
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x5

    if-ge v4, v5, :cond_0

    .line 138
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_0

    .line 139
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/view/model/FriendItem;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    if-le v1, v5, :cond_1

    add-int/lit8 v4, v1, -0x1

    .line 143
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/model/FriendItem;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-interface {v0, v3, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;->setupTeammates(Ljava/util/List;II)V

    return-void
.end method
