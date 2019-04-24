.class public final enum Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;
.super Ljava/lang/Enum;
.source "FindRebatesRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

.field public static final enum EMPTY_FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

.field public static final enum FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

.field public static final enum RETAILER_CATEGORIES:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    const-string v1, "EMPTY_FAVORITE_RETAILERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->EMPTY_FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    const-string v1, "FAVORITE_RETAILERS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    const-string v1, "RETAILER_CATEGORIES"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->RETAILER_CATEGORIES:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->EMPTY_FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->RETAILER_CATEGORIES:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    return-object v0
.end method
