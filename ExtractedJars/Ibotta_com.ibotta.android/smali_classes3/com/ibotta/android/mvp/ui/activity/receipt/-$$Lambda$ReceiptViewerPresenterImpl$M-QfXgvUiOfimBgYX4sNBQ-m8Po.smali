.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->lambda$onFetchFinishedSuccessfully$0(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method