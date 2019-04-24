.class public final enum Lcom/ibotta/android/view/retailer/RetailerFilterOption;
.super Ljava/lang/Enum;
.source "RetailerFilterOption.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/view/retailer/RetailerFilterOption;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/view/retailer/RetailerFilterOption;

.field public static final enum ALL:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

.field public static final enum NEARBY:Lcom/ibotta/android/view/retailer/RetailerFilterOption;


# instance fields
.field private labelId:I

.field private final trackingLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 12
    new-instance v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    const-string v1, "NEARBY"

    const-string v2, "nearby"

    const/4 v3, 0x0

    const v4, 0x7f1105a3

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/ibotta/android/view/retailer/RetailerFilterOption;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->NEARBY:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    .line 13
    new-instance v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    const-string v1, "ALL"

    const-string v2, "all"

    const/4 v4, 0x1

    const v5, 0x7f11059f

    invoke-direct {v0, v1, v4, v5, v2}, Lcom/ibotta/android/view/retailer/RetailerFilterOption;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->ALL:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    sget-object v1, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->NEARBY:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->ALL:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->$VALUES:[Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->labelId:I

    .line 19
    iput-object p4, p0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->trackingLabel:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/retailer/RetailerFilterOption;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/view/retailer/RetailerFilterOption;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->$VALUES:[Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    invoke-virtual {v0}, [Lcom/ibotta/android/view/retailer/RetailerFilterOption;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 2

    .line 24
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->labelId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTrackingLabel()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method
