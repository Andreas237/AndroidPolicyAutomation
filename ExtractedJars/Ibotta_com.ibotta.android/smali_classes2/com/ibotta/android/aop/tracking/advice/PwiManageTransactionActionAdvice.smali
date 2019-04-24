.class public Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionActionAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiManageTransactionActionAdvice.java"


# instance fields
.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/content/res/Resources;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    .line 23
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionActionAdvice;->resources:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 28
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    .line 29
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    aget-object p1, p1, v1

    check-cast p1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    .line 31
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 32
    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getBgcId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 33
    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 34
    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionActionAdvice;->resources:Landroid/content/res/Resources;

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getOptionTextResId()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->actionType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "pwi_manage_txn_action"

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionActionAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
