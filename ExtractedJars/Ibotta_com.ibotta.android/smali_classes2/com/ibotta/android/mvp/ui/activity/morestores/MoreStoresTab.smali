.class public final enum Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;
.super Ljava/lang/Enum;
.source "MoreStoresTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

.field public static final enum ALL:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

.field public static final enum NEARBY:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;


# instance fields
.field private final nameResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    const-string v1, "NEARBY"

    const/4 v2, 0x0

    const v3, 0x7f1101b4

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    const-string v1, "ALL"

    const/4 v3, 0x1

    const v4, 0x7f110139

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->nameResId:I

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;
    .locals 0

    .line 30
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 2

    .line 23
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->nameResId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
