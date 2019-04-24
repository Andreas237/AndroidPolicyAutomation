.class public final Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;
.super Ljava/lang/Object;
.source "PayAtRetailerButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u000c0\u000c2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "visibility",
        "Lcom/ibotta/android/views/components/Visibility;",
        "getText",
        "",
        "kotlin.jvm.PlatformType",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 4

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_pay_at_retailer:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/components/Visibility;)Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/components/Visibility;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;->getText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-direct {v0, p2, p1}, Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;-><init>(Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;)V

    return-object v0
.end method
