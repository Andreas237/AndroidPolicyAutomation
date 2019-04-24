.class public final enum Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;
.super Ljava/lang/Enum;
.source "PwiHomeTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

.field public static final enum ADD_MONEY:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

.field public static final enum TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;


# instance fields
.field private final layoutResId:I

.field private final nameResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    const-string v1, "ADD_MONEY"

    const/4 v2, 0x0

    const v3, 0x7f1104d4

    const v4, 0x7f0c019a

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->ADD_MONEY:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    .line 15
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    const-string v1, "TRANSACTIONS"

    const/4 v3, 0x1

    const v4, 0x7f110545

    const v5, 0x7f0c01a1

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    const/4 v0, 0x2

    .line 13
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->ADD_MONEY:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->nameResId:I

    .line 22
    iput p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->layoutResId:I

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 39
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    return-object v0
.end method


# virtual methods
.method public getLayoutResId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->layoutResId:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 27
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->nameResId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
