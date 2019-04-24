.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "ContentRowViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/views/content/row/ContentRowViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/content/row/ContentRowViewState;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final crvContent:Lcom/ibotta/android/views/content/row/ContentRowView;

.field private final ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

.field private viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

.field private viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/views/content/row/ContentRowView;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 27
    sget-object v0, Lcom/ibotta/android/views/content/row/ContentRowViewState;->EMPTY:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->crvContent:Lcom/ibotta/android/views/content/row/ContentRowView;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ContentRowViewHolder.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onRowRetailerImageClicked"

    const-string v3, "com.ibotta.android.mvp.ui.view.listview.holder.ContentRowViewHolder"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x42

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->bindViewEvents(Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->crvContent:Lcom/ibotta/android/views/content/row/ContentRowView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/views/content/row/ContentRowView;->bindViewEvents(Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->bindViewEvents(Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V

    return-void
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackMainButtonClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;->onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackContentRowClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;->onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onRowRetailerImageClicked()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 66
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    invoke-interface {v1}, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;->onRowRetailerImageClicked()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
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

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->updateViewState(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->crvContent:Lcom/ibotta/android/views/content/row/ContentRowView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateViewState(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V

    .line 42
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;->updateViewState(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V

    return-void
.end method
