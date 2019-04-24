.class public final enum Lcom/ibotta/api/call/customer/Gender;
.super Ljava/lang/Enum;
.source "Gender.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/customer/Gender;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/customer/Gender;

.field public static final enum FEMALE:Lcom/ibotta/api/call/customer/Gender;

.field public static final enum MALE:Lcom/ibotta/api/call/customer/Gender;

.field public static final enum WILL_NOT_SAY:Lcom/ibotta/api/call/customer/Gender;


# instance fields
.field private final apiName:Ljava/lang/String;

.field private final friendlyName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 5
    new-instance v0, Lcom/ibotta/api/call/customer/Gender;

    const-string v1, "MALE"

    const-string v2, "M"

    const-string v3, "Male"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/ibotta/api/call/customer/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/Gender;->MALE:Lcom/ibotta/api/call/customer/Gender;

    .line 6
    new-instance v0, Lcom/ibotta/api/call/customer/Gender;

    const-string v1, "FEMALE"

    const-string v2, "F"

    const-string v3, "Female"

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/ibotta/api/call/customer/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/Gender;->FEMALE:Lcom/ibotta/api/call/customer/Gender;

    .line 7
    new-instance v0, Lcom/ibotta/api/call/customer/Gender;

    const-string v1, "WILL_NOT_SAY"

    const-string v2, ""

    const-string v3, "Will Not Say"

    const/4 v6, 0x2

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/ibotta/api/call/customer/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/call/customer/Gender;->WILL_NOT_SAY:Lcom/ibotta/api/call/customer/Gender;

    const/4 v0, 0x3

    .line 4
    new-array v0, v0, [Lcom/ibotta/api/call/customer/Gender;

    sget-object v1, Lcom/ibotta/api/call/customer/Gender;->MALE:Lcom/ibotta/api/call/customer/Gender;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/call/customer/Gender;->FEMALE:Lcom/ibotta/api/call/customer/Gender;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/call/customer/Gender;->WILL_NOT_SAY:Lcom/ibotta/api/call/customer/Gender;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/api/call/customer/Gender;->$VALUES:[Lcom/ibotta/api/call/customer/Gender;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 13
    iput-object p3, p0, Lcom/ibotta/api/call/customer/Gender;->apiName:Ljava/lang/String;

    .line 14
    iput-object p4, p0, Lcom/ibotta/api/call/customer/Gender;->friendlyName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 30
    :cond_0
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->WILL_NOT_SAY:Lcom/ibotta/api/call/customer/Gender;

    .line 31
    sget-object v1, Lcom/ibotta/api/call/customer/Gender;->MALE:Lcom/ibotta/api/call/customer/Gender;

    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/Gender;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 32
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->MALE:Lcom/ibotta/api/call/customer/Gender;

    goto :goto_0

    .line 33
    :cond_1
    sget-object v1, Lcom/ibotta/api/call/customer/Gender;->FEMALE:Lcom/ibotta/api/call/customer/Gender;

    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/Gender;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 34
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->FEMALE:Lcom/ibotta/api/call/customer/Gender;

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 45
    :cond_0
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->WILL_NOT_SAY:Lcom/ibotta/api/call/customer/Gender;

    const-string v1, "male"

    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 47
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->MALE:Lcom/ibotta/api/call/customer/Gender;

    goto :goto_0

    :cond_1
    const-string v1, "female"

    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 49
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->FEMALE:Lcom/ibotta/api/call/customer/Gender;

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;
    .locals 1

    .line 4
    const-class v0, Lcom/ibotta/api/call/customer/Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/Gender;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/customer/Gender;
    .locals 1

    .line 4
    sget-object v0, Lcom/ibotta/api/call/customer/Gender;->$VALUES:[Lcom/ibotta/api/call/customer/Gender;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/customer/Gender;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/customer/Gender;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/api/call/customer/Gender;->apiName:Ljava/lang/String;

    return-object v0
.end method

.method public getFriendlyName()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/api/call/customer/Gender;->friendlyName:Ljava/lang/String;

    return-object v0
.end method
