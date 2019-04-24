.class public Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ModulePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;"
    }
.end annotation


# instance fields
.field private final contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

.field private final contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

.field private displayModule:Lcom/ibotta/api/model/base/BaseModule;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

.field private moduleApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private moduleId:I

.field private payload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

.field private final retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 77
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 78
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 79
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 80
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    .line 81
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 82
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 83
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-void
.end method

.method private createBoxedDisplay()V
    .locals 1

    .line 159
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->isOfferContent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createOfferBoxedDisplay()V

    goto :goto_0

    .line 161
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->isProductContent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createProductRowsDisplay()V

    :cond_1
    :goto_0
    return-void
.end method

.method private createCirclesDisplay()V
    .locals 1

    .line 207
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->isRetailerContent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createRetailerSSDisplay()V

    :cond_0
    return-void
.end method

.method private createOfferBoxedDisplay()V
    .locals 4

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 168
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$CZAbKqRAvs47OG_2XwwtfYdouk0;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$CZAbKqRAvs47OG_2XwwtfYdouk0;-><init>(Ljava/lang/Class;)V

    .line 169
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$ModulePresenterImpl$ZKgnCwuGhHMqbOWwOrtYlt7cRaA;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$ModulePresenterImpl$ZKgnCwuGhHMqbOWwOrtYlt7cRaA;-><init>(Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;)V

    .line 170
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 171
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 172
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->payload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {v1, v0, v2}, Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object v0

    .line 174
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v3, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v3}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 175
    invoke-virtual {v3, v0}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/ilv/ListType;->MODULES:Lcom/ibotta/android/ilv/ListType;

    .line 174
    invoke-virtual {v2, v0, v3}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->setListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method private createProductRowsDisplay()V
    .locals 4

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/ProductModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 195
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/ProductModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$1_9n8SCkZQwrPWssCYSVkcF7FuA;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$1_9n8SCkZQwrPWssCYSVkcF7FuA;-><init>(Ljava/lang/Class;)V

    .line 196
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$ModulePresenterImpl$dy9GXxdy9G4n6EfRehjehmSKzI4;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$ModulePresenterImpl$dy9GXxdy9G4n6EfRehjehmSKzI4;

    .line 197
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 198
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 200
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->payload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {v1, v0, v2}, Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object v0

    .line 202
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v3, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v3}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 203
    invoke-virtual {v3, v0}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    .line 202
    invoke-virtual {v2, v0, v3}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->setListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method private createRetailerSSDisplay()V
    .locals 4

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->getRetailersFromBaseContent(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 214
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->payload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {v2, v0, v3}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->createIlvs(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->setListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method private createRowsDisplay()V
    .locals 1

    .line 187
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->isProductContent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createProductRowsDisplay()V

    :cond_0
    return-void
.end method

.method private getContentModels()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/ContentModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 277
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/ContentModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$Csa6usMn46aWqZHyCESuTqpY_Yk;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$Csa6usMn46aWqZHyCESuTqpY_Yk;-><init>(Ljava/lang/Class;)V

    .line 278
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 279
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private getContentStyle(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1

    .line 179
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    if-ne p1, v0, :cond_0

    .line 180
    sget-object p1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    return-object p1

    .line 182
    :cond_0
    sget-object p1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    return-object p1
.end method

.method private initRows()V
    .locals 2

    .line 145
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl$1;->$SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getDisplayTypeEnum()Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 153
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createCirclesDisplay()V

    goto :goto_0

    .line 150
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createRowsDisplay()V

    goto :goto_0

    .line 147
    :pswitch_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->createBoxedDisplay()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initTitle()V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTrackingPayload()V
    .locals 2

    .line 138
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MODULE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->builder(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    .line 139
    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    .line 140
    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getModuleId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->payload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    return-void
.end method

.method private isOfferContent()Z
    .locals 3

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 226
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 227
    invoke-interface {v0}, Ljava9/util/stream/Stream;->findAny()Ljava9/util/Optional;

    move-result-object v0

    .line 228
    invoke-virtual {v0}, Ljava9/util/Optional;->isPresent()Z

    move-result v0

    return v0
.end method

.method private isProductContent()Z
    .locals 3

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/ProductModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 219
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 220
    invoke-interface {v0}, Ljava9/util/stream/Stream;->findAny()Ljava9/util/Optional;

    move-result-object v0

    .line 221
    invoke-virtual {v0}, Ljava9/util/Optional;->isPresent()Z

    move-result v0

    return v0
.end method

.method private isRetailerContent()Z
    .locals 3

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/module/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 233
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 234
    invoke-interface {v0}, Ljava9/util/stream/Stream;->findAny()Ljava9/util/Optional;

    move-result-object v0

    .line 235
    invoke-virtual {v0}, Ljava9/util/Optional;->isPresent()Z

    move-result v0

    return v0
.end method

.method public static synthetic lambda$createOfferBoxedDisplay$0(Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/content/OfferDisplayContent;
    .locals 2

    .line 170
    new-instance v0, Lcom/ibotta/android/content/OfferDisplayContent;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->getContentStyle(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method

.method static synthetic lambda$createProductRowsDisplay$1(Lcom/ibotta/api/model/ProductModel;)Lcom/ibotta/android/content/ProductDisplayContent;
    .locals 2

    .line 197
    new-instance v0, Lcom/ibotta/android/content/ProductDisplayContent;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->ROW:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/content/ProductDisplayContent;-><init>(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 88
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleId:I

    invoke-interface {v1, v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createModuleCall(I)Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;

    move-result-object v1

    .line 92
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {v2}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    .line 93
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 96
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    if-eqz v0, :cond_0

    .line 248
    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 103
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->getContentModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mappers/ContentMapper;->getContentModelByContentId(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/util/List;)Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->getContentModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mappers/ContentMapper;->getContentModelByContentId(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/util/List;)Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 109
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "moduleApiJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->showUnknownErrorDialog()V

    return-void

    .line 114
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;

    .line 116
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->getModule()Lcom/ibotta/api/model/base/BaseModule;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->displayModule:Lcom/ibotta/api/model/base/BaseModule;

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->showFailedToLoad()V

    return-void

    .line 122
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->initTitle()V

    .line 123
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->initTrackingPayload()V

    .line 124
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->initRows()V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 129
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->setTitleForLoadFailure()V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->getContentModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mappers/ContentMapper;->getContentModelByContentId(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/util/List;)Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockCompleted()V
    .locals 1

    .line 271
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->reload()V

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;->showUnlockAnimation()V

    return-void
.end method

.method public setModuleId(I)V
    .locals 0

    .line 240
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;->moduleId:I

    return-void
.end method
