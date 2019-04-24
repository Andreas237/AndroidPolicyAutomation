.class public final Lcom/ibotta/android/button/ShopButtonReducer;
.super Ljava/lang/Object;
.source "ShopButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/ibotta/android/button/ShopButtonReducer;",
        "",
        "()V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    new-instance v8, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    .line 9
    sget v2, Lcom/ibotta/android/reducers/R$string;->common_shop:I

    .line 11
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_ic_new_shop:I

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, v8

    .line 8
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method
