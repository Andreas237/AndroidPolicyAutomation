.class public final enum Lcom/ibotta/api/model/RetailerModel$CardIdType;
.super Ljava/lang/Enum;
.source "RetailerModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/RetailerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CardIdType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/RetailerModel$CardIdType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/RetailerModel$CardIdType;

.field public static final enum CARD:Lcom/ibotta/api/model/RetailerModel$CardIdType;

.field public static final enum PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 32
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;

    const-string v1, "PHONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/RetailerModel$CardIdType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;->PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;

    const-string v1, "CARD"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/RetailerModel$CardIdType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;->CARD:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    const/4 v0, 0x2

    .line 31
    new-array v0, v0, [Lcom/ibotta/api/model/RetailerModel$CardIdType;

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardIdType;->PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardIdType;->CARD:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 41
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/RetailerModel$CardIdType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    .line 31
    const-class v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/model/RetailerModel$CardIdType;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$CardIdType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/RetailerModel$CardIdType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-object v0
.end method
