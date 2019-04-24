.class public final enum Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;
.super Ljava/lang/Enum;
.source "MyOffersTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

.field public static final enum ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

.field public static final enum APPS:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

.field public static final enum STORES:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;


# instance fields
.field private final nameResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    const-string v1, "ALL"

    const/4 v2, 0x0

    const v3, 0x7f110139

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    const-string v1, "STORES"

    const/4 v3, 0x1

    const v4, 0x7f1101f1

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->STORES:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    const-string v1, "APPS"

    const/4 v4, 0x2

    const v5, 0x7f11013e

    invoke-direct {v0, v1, v4, v5}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->APPS:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    const/4 v0, 0x3

    .line 11
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->STORES:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->APPS:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 19
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->nameResId:I

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;
    .locals 0

    .line 31
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 2

    .line 24
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->nameResId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
