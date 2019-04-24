.class public enum Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
.super Ljava/lang/Enum;
.source "NavButtonType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field public static final enum ACCOUNT:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field public static final enum FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field public static final enum FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field public static final enum MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

.field public static final enum REDEEM:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;


# instance fields
.field private final iconResId:I

.field private final labelResId:I

.field private final textColorIsStateList:Z

.field private final textColorResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 15
    new-instance v6, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v1, "FEATURED"

    const/4 v2, 0x0

    const v3, 0x7f0800fc

    const v4, 0x7f060063

    const v5, 0x7f11043b

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 19
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v8, "FIND_REBATES"

    const/4 v9, 0x1

    const v10, 0x7f0800fb

    const v11, 0x7f060063

    const v12, 0x7f11043a

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 23
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType$1;

    const-string v1, "REDEEM"

    const/4 v3, 0x2

    const v4, 0x7f0600f0

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType$1;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->REDEEM:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v6, "MY_REBATES"

    const/4 v7, 0x3

    const v8, 0x7f0800fd

    const v9, 0x7f060063

    const v10, 0x7f11043c

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v12, "ACCOUNT"

    const/4 v13, 0x4

    const v14, 0x7f0800fa

    const v15, 0x7f060063

    const v16, 0x7f110439

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->ACCOUNT:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const/4 v0, 0x5

    .line 14
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FIND_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->REDEEM:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->MY_REBATES:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->ACCOUNT:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 93
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIIIZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIZ)V"
        }
    .end annotation

    .line 96
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 97
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->iconResId:I

    .line 98
    iput p4, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->textColorResId:I

    .line 99
    iput p5, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->labelResId:I

    .line 100
    iput-boolean p6, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->textColorIsStateList:Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p3

    move v6, p4

    .line 89
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIIIZ)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IIZLcom/ibotta/android/mvp/ui/view/nav/NavButtonType$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIZ)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/state/app/config/AppConfig;I)Z
    .locals 0

    .line 14
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->isQrCodeRetailer(Lcom/ibotta/android/state/app/config/AppConfig;I)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Z
    .locals 0

    .line 14
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->showUseCard(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Z

    move-result p0

    return p0
.end method

.method public static fromOrdinal(I)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    if-ltz p0, :cond_1

    .line 134
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->values()[Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v0

    array-length v0, v0

    if-lt p0, v0, :cond_0

    goto :goto_0

    .line 138
    :cond_0
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->values()[Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 0

    .line 125
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static isQrCodeRetailer(Lcom/ibotta/android/state/app/config/AppConfig;I)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 142
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getLoyaltyQrCodeRetailers()Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static showUseCard(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Z
    .locals 1
    .param p0    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-eqz p1, :cond_0

    .line 149
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isAuxiliaryLoyaltyEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x1

    .line 150
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result p1

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isAuxiliaryLoyaltyEnabled()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, p1

    :cond_2
    :goto_0
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 14
    const-class v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method


# virtual methods
.method public getIconResId(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)I
    .locals 0

    .line 105
    iget p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->iconResId:I

    return p1
.end method

.method public getLabelResId(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)I
    .locals 0

    .line 114
    iget p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->labelResId:I

    return p1
.end method

.method public getTextColorResId()I
    .locals 1

    .line 109
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->textColorResId:I

    return v0
.end method

.method public isTextColorIsStateList()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->textColorIsStateList:Z

    return v0
.end method
