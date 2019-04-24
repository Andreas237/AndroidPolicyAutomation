.class public final Lcom/ibotta/android/content/card/deal/DealButtonReducer;
.super Ljava/lang/Object;
.source "DealButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/deal/DealButtonReducer;",
        "",
        "shopButtonReducer",
        "Lcom/ibotta/android/button/ShopButtonReducer;",
        "(Lcom/ibotta/android/button/ShopButtonReducer;)V",
        "create",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
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
.field private final shopButtonReducer:Lcom/ibotta/android/button/ShopButtonReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/button/ShopButtonReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/button/ShopButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "shopButtonReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/deal/DealButtonReducer;->shopButtonReducer:Lcom/ibotta/android/button/ShopButtonReducer;

    return-void
.end method


# virtual methods
.method public final create()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/ibotta/android/content/card/deal/DealButtonReducer;->shopButtonReducer:Lcom/ibotta/android/button/ShopButtonReducer;

    invoke-virtual {v0}, Lcom/ibotta/android/button/ShopButtonReducer;->create()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v0

    return-object v0
.end method
