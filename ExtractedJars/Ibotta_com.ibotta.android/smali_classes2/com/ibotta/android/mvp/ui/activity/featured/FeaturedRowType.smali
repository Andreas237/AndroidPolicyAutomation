.class public final enum Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;
.super Ljava/lang/Enum;
.source "FeaturedRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum FEATURED_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum GRID:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum POPULAR_RETAILERS_ROW:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum PRODUCTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum QUESTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

.field public static final enum SMALL_BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "BANNERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "FEATURED_RETAILERS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FEATURED_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "FEATURED_BONUSES"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "FAVORITE_RETAILERS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "POPULAR_RETAILERS_ROW"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->POPULAR_RETAILERS_ROW:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "PRODUCTS"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->PRODUCTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "SMALL_BANNERS"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->SMALL_BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 15
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "QUESTS"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->QUESTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    .line 16
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const-string v1, "GRID"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->GRID:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    const/16 v0, 0x9

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FEATURED_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->POPULAR_RETAILERS_ROW:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->PRODUCTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->SMALL_BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->QUESTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->GRID:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    aput-object v1, v0, v10

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    return-object v0
.end method
