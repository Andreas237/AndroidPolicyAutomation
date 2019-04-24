.class public abstract enum Lcom/ibotta/android/fragment/offer/GalleryTab;
.super Ljava/lang/Enum;
.source "GalleryTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/offer/GalleryTab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/offer/GalleryTab;

.field public static final enum DISCOUNTS:Lcom/ibotta/android/fragment/offer/GalleryTab;

.field public static final enum REBATES:Lcom/ibotta/android/fragment/offer/GalleryTab;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 14
    new-instance v0, Lcom/ibotta/android/fragment/offer/GalleryTab$1;

    const-string v1, "REBATES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/fragment/offer/GalleryTab$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/fragment/offer/GalleryTab;->REBATES:Lcom/ibotta/android/fragment/offer/GalleryTab;

    .line 20
    new-instance v0, Lcom/ibotta/android/fragment/offer/GalleryTab$2;

    const-string v1, "DISCOUNTS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/fragment/offer/GalleryTab$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/fragment/offer/GalleryTab;->DISCOUNTS:Lcom/ibotta/android/fragment/offer/GalleryTab;

    const/4 v0, 0x2

    .line 13
    new-array v0, v0, [Lcom/ibotta/android/fragment/offer/GalleryTab;

    sget-object v1, Lcom/ibotta/android/fragment/offer/GalleryTab;->REBATES:Lcom/ibotta/android/fragment/offer/GalleryTab;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/fragment/offer/GalleryTab;->DISCOUNTS:Lcom/ibotta/android/fragment/offer/GalleryTab;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/fragment/offer/GalleryTab;->$VALUES:[Lcom/ibotta/android/fragment/offer/GalleryTab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/ibotta/android/fragment/offer/GalleryTab$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/fragment/offer/GalleryTab;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static asList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/offer/GalleryTab;",
            ">;"
        }
    .end annotation

    .line 28
    invoke-static {}, Lcom/ibotta/android/fragment/offer/GalleryTab;->values()[Lcom/ibotta/android/fragment/offer/GalleryTab;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/fragment/offer/GalleryTab;
    .locals 0

    .line 35
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/fragment/offer/GalleryTab;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/offer/GalleryTab;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/offer/GalleryTab;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/android/fragment/offer/GalleryTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/offer/GalleryTab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/offer/GalleryTab;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/fragment/offer/GalleryTab;->$VALUES:[Lcom/ibotta/android/fragment/offer/GalleryTab;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/offer/GalleryTab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/offer/GalleryTab;

    return-object v0
.end method
