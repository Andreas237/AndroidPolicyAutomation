.class public final enum Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
.super Ljava/lang/Enum;
.source "ServerCategorySettingViewState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

.field public static final enum ALL:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

.field public static final enum COLLAPSED:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

.field public static final enum PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 7
    new-instance v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->ALL:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    const-string v1, "PREVIEW"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    const-string v1, "COLLAPSED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->COLLAPSED:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    const/4 v0, 0x3

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->ALL:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->COLLAPSED:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->$VALUES:[Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
    .locals 1

    if-eqz p0, :cond_1

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 21
    :catch_0
    sget-object p0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    :goto_0
    return-object p0

    .line 13
    :cond_1
    :goto_1
    sget-object p0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->$VALUES:[Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    return-object v0
.end method
