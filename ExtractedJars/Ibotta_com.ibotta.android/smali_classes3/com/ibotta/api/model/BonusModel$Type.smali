.class public final enum Lcom/ibotta/api/model/BonusModel$Type;
.super Ljava/lang/Enum;
.source "BonusModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/BonusModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/BonusModel$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/BonusModel$Type;

.field public static final enum DEFAULT:Lcom/ibotta/api/model/BonusModel$Type;

.field public static final enum FEATURED:Lcom/ibotta/api/model/BonusModel$Type;

.field public static final enum SOCIAL:Lcom/ibotta/api/model/BonusModel$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 18
    new-instance v0, Lcom/ibotta/api/model/BonusModel$Type;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/BonusModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/BonusModel$Type;->DEFAULT:Lcom/ibotta/api/model/BonusModel$Type;

    .line 19
    new-instance v0, Lcom/ibotta/api/model/BonusModel$Type;

    const-string v1, "FEATURED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/BonusModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/BonusModel$Type;->FEATURED:Lcom/ibotta/api/model/BonusModel$Type;

    .line 20
    new-instance v0, Lcom/ibotta/api/model/BonusModel$Type;

    const-string v1, "SOCIAL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/BonusModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/BonusModel$Type;->SOCIAL:Lcom/ibotta/api/model/BonusModel$Type;

    const/4 v0, 0x3

    .line 17
    new-array v0, v0, [Lcom/ibotta/api/model/BonusModel$Type;

    sget-object v1, Lcom/ibotta/api/model/BonusModel$Type;->DEFAULT:Lcom/ibotta/api/model/BonusModel$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/BonusModel$Type;->FEATURED:Lcom/ibotta/api/model/BonusModel$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/BonusModel$Type;->SOCIAL:Lcom/ibotta/api/model/BonusModel$Type;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/BonusModel$Type;->$VALUES:[Lcom/ibotta/api/model/BonusModel$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/BonusModel$Type;
    .locals 0

    .line 25
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/BonusModel$Type;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/BonusModel$Type;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/BonusModel$Type;
    .locals 1

    .line 17
    const-class v0, Lcom/ibotta/api/model/BonusModel$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/BonusModel$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/BonusModel$Type;
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/api/model/BonusModel$Type;->$VALUES:[Lcom/ibotta/api/model/BonusModel$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/BonusModel$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/BonusModel$Type;

    return-object v0
.end method
