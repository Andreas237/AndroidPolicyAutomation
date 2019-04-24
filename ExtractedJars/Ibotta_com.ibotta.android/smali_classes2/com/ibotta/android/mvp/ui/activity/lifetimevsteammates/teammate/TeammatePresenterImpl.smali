.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "TeammatePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;"
    }
.end annotation


# instance fields
.field private activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private customerFriend:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private customerMe:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private friend:Lcom/ibotta/api/model/customer/Customer;

.field private friendId:I

.field private graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 63
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 64
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 65
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 66
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 67
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private initLineGraph(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 10

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getMyDataSet()Lcom/ibotta/android/view/graph/DataSet;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    .line 131
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getFriendDataSet()Lcom/ibotta/android/view/graph/DataSet;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getFriendDataSet()Lcom/ibotta/android/view/graph/DataSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/DataSet;->clear()V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getMyDataSet()Lcom/ibotta/android/view/graph/DataSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/graph/DataSet;->clear()V

    if-eqz p1, :cond_9

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_9

    .line 138
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getMonthlyEarnings()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getMonthlyEarnings()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_5

    .line 141
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 142
    new-instance v1, Ljava/util/Date;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getJoinDate()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v4}, Lcom/ibotta/api/model/customer/Customer;->getJoinDate()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 143
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 146
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getMonthlyEarnings()Ljava/util/Map;

    move-result-object p1

    .line 145
    invoke-static {p1, v1, v2}, Lcom/ibotta/api/util/UserEarningsHelper;->addMissingEarnings(Ljava/util/Map;Ljava/util/Date;Ljava/util/Date;)Ljava/util/Map;

    move-result-object p1

    .line 147
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    .line 148
    invoke-virtual {v3}, Lcom/ibotta/api/model/customer/Customer;->getMonthlyEarnings()Ljava/util/Map;

    move-result-object v3

    .line 147
    invoke-static {v3, v1, v2}, Lcom/ibotta/api/util/UserEarningsHelper;->addMissingEarnings(Ljava/util/Map;Ljava/util/Date;Ljava/util/Date;)Ljava/util/Map;

    move-result-object v1

    .line 150
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 151
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 152
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v5, v4}, Lcom/ibotta/android/util/Formatting;->getEarningsMonth(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 156
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    .line 157
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v6

    cmpl-float v6, v6, v3

    if-lez v6, :cond_3

    .line 158
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_1

    .line 162
    :cond_4
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    .line 163
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v6

    cmpl-float v6, v6, v3

    if-lez v6, :cond_5

    .line 164
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_2

    .line 168
    :cond_6
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getMyDataSet()Lcom/ibotta/android/view/graph/DataSet;

    move-result-object v4

    .line 170
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 172
    new-instance v6, Lcom/ibotta/android/view/graph/DataPoint;

    invoke-direct {v6}, Lcom/ibotta/android/view/graph/DataPoint;-><init>()V

    .line 173
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    .line 174
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v7

    div-float/2addr v7, v3

    invoke-virtual {v6, v7}, Lcom/ibotta/android/view/graph/DataPoint;->setValue(F)V

    .line 175
    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    float-to-double v8, v5

    invoke-interface {v7, v8, v9}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/ibotta/android/view/graph/DataPoint;->setLabel(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v4, v6}, Lcom/ibotta/android/view/graph/DataSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 179
    :cond_7
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getFriendDataSet()Lcom/ibotta/android/view/graph/DataSet;

    move-result-object p1

    .line 181
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 184
    new-instance v5, Lcom/ibotta/android/view/graph/DataPoint;

    invoke-direct {v5}, Lcom/ibotta/android/view/graph/DataPoint;-><init>()V

    .line 185
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    .line 186
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v6

    div-float/2addr v6, v3

    invoke-virtual {v5, v6}, Lcom/ibotta/android/view/graph/DataPoint;->setValue(F)V

    .line 187
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    float-to-double v7, v4

    invoke-interface {v6, v7, v8}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/ibotta/android/view/graph/DataPoint;->setLabel(Ljava/lang/String;)V

    .line 188
    invoke-virtual {p1, v5}, Lcom/ibotta/android/view/graph/DataSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 191
    :cond_8
    new-instance p1, Lcom/ibotta/android/view/graph/GraphDataSet;

    invoke-direct {p1}, Lcom/ibotta/android/view/graph/GraphDataSet;-><init>()V

    .line 192
    invoke-virtual {p1, v2}, Lcom/ibotta/android/view/graph/GraphDataSet;->setLabels(Ljava/util/List;)V

    .line 193
    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setDataSets(Ljava/util/List;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setMinYAxisLabel(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v1, v3

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setMaxYAxisLabel(Ljava/lang/String;)V

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getMyLegendItem()Lcom/ibotta/android/view/graph/LegendItem;

    move-result-object v1

    .line 199
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->getFriendLegendItem()Lcom/ibotta/android/view/graph/LegendItem;

    move-result-object v1

    .line 202
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/view/graph/LegendItem;->setLabel(Ljava/lang/String;)V

    .line 203
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/GraphDataSet;->setLegendItems(Ljava/util/List;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    goto :goto_6

    .line 139
    :cond_9
    :goto_5
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    :goto_6
    return-void

    :cond_a
    :goto_7
    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerMe:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 75
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerMe:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 77
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerFriend:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 78
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friendId:I

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerFriend:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 81
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerMe:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 82
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerFriend:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 7

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 217
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 218
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object p1

    .line 219
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getLastName()Ljava/lang/String;

    move-result-object p2

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 221
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v6

    move-object v4, p3

    invoke-interface/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->getFlyupCreator(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerFriend:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 89
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerMe:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 5

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerMe:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->customerFriend:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    if-eqz v1, :cond_0

    .line 113
    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getMessageData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "message"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 115
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 116
    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/notification/model/NotificationStatus;->EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 117
    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/notification/model/NotificationStatus;->NEW:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v2, v3, :cond_0

    .line 118
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v3}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDate()Ljava/util/Date;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->showMessage(Ljava/lang/String;Ljava/util/Date;)V

    .line 121
    :cond_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->initLineGraph(Lcom/ibotta/api/model/customer/Customer;)V

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friend:Lcom/ibotta/api/model/customer/Customer;

    .line 125
    invoke-virtual {v4}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->getMyRankTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    .line 124
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->setTeammate(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    :cond_1
    return-void
.end method

.method public onFriendMessageFailed(Lcom/ibotta/api/ApiErrorDetails;)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->showFriendMessageFailed(Lcom/ibotta/api/ApiErrorDetails;)V

    goto :goto_0

    .line 245
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->showNetworkConnectionErrorDialog()V

    :goto_0
    return-void
.end method

.method public onMessageClicked()V
    .locals 1

    .line 228
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->networkConnectionErrorViewShowing:Z

    if-nez v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->showMessageDialog()V

    :cond_0
    return-void
.end method

.method public onNudgeClicked()V
    .locals 1

    .line 235
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->networkConnectionErrorViewShowing:Z

    if-nez v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;->showNudgeClicked()V

    :cond_0
    return-void
.end method

.method public setActivityParcelable(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    return-void
.end method

.method public setFriendId(I)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->friendId:I

    return-void
.end method

.method public setGraphDataParams(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenterImpl;->graphDataParams:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    return-void
.end method
