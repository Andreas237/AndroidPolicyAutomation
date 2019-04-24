.class public final enum Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;
.super Ljava/lang/Enum;
.source "BonusPickerRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

.field public static final enum BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

.field public static final enum EMPTY_COMPLETED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

.field public static final enum FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

.field public static final enum TEAMWORK_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

.field public static final enum TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const-string v1, "FEATURED_BONUSES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const-string v1, "TITLE_BAR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const-string v1, "BONUS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const-string v1, "EMPTY_COMPLETED_BONUSES"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->EMPTY_COMPLETED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const-string v1, "TEAMWORK_BONUSES"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TEAMWORK_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const/4 v0, 0x5

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->EMPTY_COMPLETED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TEAMWORK_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    return-object v0
.end method
