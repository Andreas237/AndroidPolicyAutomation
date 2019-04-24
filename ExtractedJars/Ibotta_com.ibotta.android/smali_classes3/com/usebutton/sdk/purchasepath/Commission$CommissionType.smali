.class public final enum Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;
.super Ljava/lang/Enum;
.source "Commission.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/purchasepath/Commission;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CommissionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

.field public static final enum COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

.field public static final enum NON_COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

.field public static final enum UNKNOWN:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;


# instance fields
.field final commissionType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 15
    new-instance v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    const-string v1, "COMMISSIONABLE"

    const-string v2, "commissionable"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    .line 16
    new-instance v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    const-string v1, "NON_COMMISSIONABLE"

    const-string v2, "non-commissionable"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->NON_COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    .line 17
    new-instance v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    const-string v1, "UNKNOWN"

    const-string v2, "unknown"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->UNKNOWN:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    const/4 v0, 0x3

    .line 14
    new-array v0, v0, [Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->NON_COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->UNKNOWN:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->$VALUES:[Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 30
    iput-object p3, p0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->commissionType:Ljava/lang/String;

    return-void
.end method

.method public static getType(Ljava/lang/String;)Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;
    .locals 5

    .line 40
    invoke-static {}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->values()[Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 41
    iget-object v4, v3, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->commissionType:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 44
    :cond_1
    sget-object p0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->UNKNOWN:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;
    .locals 1

    .line 14
    const-class v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;
    .locals 1

    .line 14
    sget-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->$VALUES:[Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    return-object v0
.end method
