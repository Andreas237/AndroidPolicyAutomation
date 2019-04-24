.class public final enum Lcom/ibotta/api/model/RetailerModel$CardInputType;
.super Ljava/lang/Enum;
.source "RetailerModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/RetailerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CardInputType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/RetailerModel$CardInputType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/RetailerModel$CardInputType;

.field public static final enum ALPHANUMERIC:Lcom/ibotta/api/model/RetailerModel$CardInputType;

.field public static final enum GENERATED:Lcom/ibotta/api/model/RetailerModel$CardInputType;

.field public static final enum NUMERIC:Lcom/ibotta/api/model/RetailerModel$CardInputType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 50
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;

    const-string v1, "NUMERIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/RetailerModel$CardInputType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;->NUMERIC:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;

    const-string v1, "ALPHANUMERIC"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/RetailerModel$CardInputType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;->ALPHANUMERIC:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;

    const-string v1, "GENERATED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/RetailerModel$CardInputType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;->GENERATED:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    const/4 v0, 0x3

    .line 49
    new-array v0, v0, [Lcom/ibotta/api/model/RetailerModel$CardInputType;

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardInputType;->NUMERIC:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardInputType;->ALPHANUMERIC:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardInputType;->GENERATED:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 59
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/RetailerModel$CardInputType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    .line 49
    const-class v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    .line 49
    sget-object v0, Lcom/ibotta/api/model/RetailerModel$CardInputType;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$CardInputType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/RetailerModel$CardInputType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-object v0
.end method
