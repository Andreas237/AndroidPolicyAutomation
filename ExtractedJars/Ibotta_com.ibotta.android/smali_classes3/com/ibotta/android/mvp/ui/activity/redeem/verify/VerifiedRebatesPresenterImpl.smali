.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "VerifiedRebatesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private allowBack:Z

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final offerDiffs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;

.field private verifiedAmount:F

.field private verifiedOfferIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final verifiedRebatesReducer:Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;

.field private voqStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerDiffs:Ljava/util/List;

    .line 54
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->voqStates:Ljava/util/List;

    .line 56
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedOfferIds:Ljava/util/Set;

    .line 68
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 69
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 70
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 71
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 72
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedRebatesReducer:Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "VerifiedRebatesPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onCollectClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.redeem.verify.VerifiedRebatesPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xb1

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private createAddRebateRow()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;
    .locals 1

    .line 199
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;-><init>()V

    return-object v0
.end method

.method private createVerifiableRebateRows(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;",
            ">;"
        }
    .end annotation

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 206
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedOfferIds:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 208
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/OfferVerification;

    .line 209
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 210
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;-><init>()V

    .line 211
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    .line 212
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->setRetailerId(Ljava/lang/Integer;)V

    .line 213
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->setCount(I)V

    .line 215
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedOfferIds:Ljava/util/Set;

    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private extractDistinctOffers(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 256
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 258
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferCategoryModel;

    .line 259
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 260
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 261
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 266
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method private getAddRebatesState(Ljava/util/List;Ljava/util/Map;)Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;"
        }
    .end annotation

    .line 271
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 274
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 275
    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/verification/OfferVerification;

    if-eqz v2, :cond_0

    .line 277
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2, v3}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    .line 285
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->NONE_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    goto :goto_1

    :cond_2
    if-ge v1, v0, :cond_3

    .line 287
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->SOME_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    goto :goto_1

    .line 289
    :cond_3
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->ALL_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    :goto_1
    return-object p1
.end method

.method private initAllowBack(Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;)V
    .locals 0

    .line 307
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->getVerifiedCount()I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->allowBack:Z

    return-void
.end method

.method private initCollectButton(Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 296
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->getVerifiedAmount()F

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedAmount:F

    .line 297
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->getVerifiedCount()I

    move-result p1

    .line 299
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedAmount:F

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 300
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelper;->isPercentBackOfferPresent(Ljava/util/List;)Z

    move-result p2

    .line 302
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v1, p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->setVerificationSummary(ZILjava/lang/String;)V

    .line 303
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->setCollectButtonEnabled(Z)V

    return-void
.end method

.method private initEverything()V
    .locals 6

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 225
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    .line 226
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;->getOfferCategoriesAsModels()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->extractDistinctOffers(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 228
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v1, v0}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerifications(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    .line 230
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 232
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->createAddRebateRow()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;

    move-result-object v3

    .line 233
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->createVerifiableRebateRows(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 235
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->getAddRebatesState(Ljava/util/List;Ljava/util/Map;)Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->setState(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;)V

    .line 236
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->setFoundRebateCount(I)V

    .line 238
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 241
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedRebatesReducer:Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;

    invoke-virtual {v5}, Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;->getTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 245
    :cond_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v3, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->setRows(Ljava/util/List;)V

    .line 247
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 248
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->setVerifiedTotals(Ljava/util/List;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 250
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->initOfferIdToOfferDiffBeforeMapForTracking(Ljava/util/Map;)V

    .line 251
    invoke-direct {p0, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->initCollectButton(Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;Ljava/util/List;)V

    .line 252
    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->initAllowBack(Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;)V

    return-void
.end method

.method private initOfferDiffDataForTracking()V
    .locals 8

    .line 342
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerDiffs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    return-void

    .line 349
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    if-nez v0, :cond_1

    return-void

    .line 355
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;->getOfferCategoriesAsModels()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->extractDistinctOffers(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 357
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v1, v0}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerifications(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    .line 359
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 360
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/OfferVerification;

    .line 362
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 366
    :cond_2
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v2

    .line 367
    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    .line 369
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v1

    .line 370
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v4}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v4

    .line 371
    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getOfferAmountType()Lcom/ibotta/api/model/offer/OfferAmountType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/offer/OfferAmountType;->getTrackingName()Ljava/lang/String;

    move-result-object v2

    .line 372
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->voqStates:Ljava/util/List;

    invoke-static {v5}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v5

    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesPresenterImpl$kaIB0pofX49MTThLu7yf5_EDLns;

    invoke-direct {v6, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesPresenterImpl$kaIB0pofX49MTThLu7yf5_EDLns;-><init>(I)V

    .line 373
    invoke-interface {v5, v6}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$kqS_ffII6V7Ev7MOZQFf9SnTQzw;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$kqS_ffII6V7Ev7MOZQFf9SnTQzw;

    .line 374
    invoke-interface {v5, v6}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v5

    .line 375
    invoke-interface {v5}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v5

    const/4 v6, 0x0

    .line 376
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 378
    invoke-static {}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->builder()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;

    move-result-object v7

    .line 379
    invoke-virtual {v7, v4}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;->retailerId(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;

    move-result-object v4

    .line 380
    invoke-virtual {v4, v3}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;->offerId(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;

    move-result-object v3

    .line 381
    invoke-virtual {v3, v2}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;->offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;

    move-result-object v2

    .line 382
    invoke-virtual {v2, v5}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;->expectedQuantity(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;

    move-result-object v2

    .line 383
    invoke-virtual {v2, v1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;->actualQuantity(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;

    move-result-object v1

    .line 384
    invoke-virtual {v1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;->build()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;

    move-result-object v1

    const-string v2, "after: %s"

    const/4 v3, 0x1

    .line 385
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerDiffs:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method private initOfferIdToOfferDiffBeforeMapForTracking(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;)V"
        }
    .end annotation

    .line 311
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 312
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/OfferVerification;

    .line 314
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 318
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    .line 319
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    .line 321
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->voqStates:Ljava/util/List;

    invoke-static {v2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v2

    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesPresenterImpl$LAWTB9GZp3mOvGnHpfp77tR3_KA;

    invoke-direct {v3, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesPresenterImpl$LAWTB9GZp3mOvGnHpfp77tR3_KA;-><init>(I)V

    .line 322
    invoke-interface {v2, v3}, Ljava9/util/stream/Stream;->anyMatch(Ljava9/util/function/Predicate;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 327
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getOcrVerifiedCount()I

    move-result v0

    .line 329
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;

    move-result-object v2

    .line 330
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;->offerId(I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;

    move-result-object v1

    .line 331
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;->expectedQuantity(I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;

    move-result-object v0

    .line 332
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;

    move-result-object v0

    const-string v1, "before: %s"

    const/4 v2, 0x1

    .line 333
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->voqStates:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 338
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->voqStates:Ljava/util/List;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->setVerificationOfferQuantityStates(Ljava/util/List;)V

    return-void
.end method

.method static synthetic lambda$initOfferDiffDataForTracking$1(ILcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;)Z
    .locals 0

    .line 373
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;->getOfferId()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$initOfferIdToOfferDiffBeforeMapForTracking$0(ILcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;)Z
    .locals 0

    .line 322
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;->getOfferId()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 80
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOfferCategoriesCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;

    move-result-object v1

    .line 81
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setRetailerId(Ljava/lang/Integer;)V

    const v2, 0x7fffffff

    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    const/4 v3, 0x1

    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setContentMin(Ljava/lang/Integer;)V

    .line 84
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setContentMax(Ljava/lang/Integer;)V

    .line 85
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 87
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getReceiptOfferDiffAdviceFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;",
            ">;"
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->offerDiffs:Ljava/util/List;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 97
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onAddRebatesClicked()V
    .locals 3

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedOfferIds:Ljava/util/Set;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showAddRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 158
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->allowBack:Z

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->finish()V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showExitConfirmation()V

    :goto_0
    return-void
.end method

.method public onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showRemoveConfirmation(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onCollectClicked()V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->RECEIPT_OFFER_DIFF:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 177
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->initOfferDiffDataForTracking()V

    .line 178
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verifiedAmount:F

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showSubmitReceipt(Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)V

    .line 179
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->finish()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v1
.end method

.method public onExitConfirmationCancelled()V
    .locals 0

    return-void
.end method

.method public onExitConfirmationConfirmed()V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->initEverything()V

    return-void
.end method

.method public onProductVerificationFailed()V
    .locals 0

    return-void
.end method

.method public onProductVerificationSuccess()V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showProductVerifiedSuccess()V

    return-void
.end method

.method public onQuantityDecreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    return-void
.end method

.method public onQuantityIncreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;->showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onQuantityNoChange(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    return-void
.end method

.method public onRemoveConfirmationCancelled(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    return-void
.end method

.method public onRemoveConfirmationConfirmed(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/verification/VerificationManager;->deleteByOfferId(Ljava/lang/Integer;)V

    .line 190
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->initEverything()V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    return-void
.end method

.method public setInfo(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;",
            ">;)V"
        }
    .end annotation

    .line 107
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 108
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;->voqStates:Ljava/util/List;

    return-void
.end method
