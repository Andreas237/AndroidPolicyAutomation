.class public abstract Lcom/ibotta/android/content/DisplayContent;
.super Ljava/lang/Object;
.source "DisplayContent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0005\u000b\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/content/DisplayContent;",
        "",
        "()V",
        "contentModel",
        "Lcom/ibotta/api/model/ContentModel;",
        "getContentModel",
        "()Lcom/ibotta/api/model/ContentModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getContentStyle",
        "()Lcom/ibotta/android/views/content/ContentStyle;",
        "Lcom/ibotta/android/content/OfferDisplayContent;",
        "Lcom/ibotta/android/content/RetailerDisplayContent;",
        "Lcom/ibotta/android/content/DealDisplayContent;",
        "Lcom/ibotta/android/content/ProductDisplayContent;",
        "Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;",
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
.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/content/DisplayContent;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getContentModel()Lcom/ibotta/api/model/ContentModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
