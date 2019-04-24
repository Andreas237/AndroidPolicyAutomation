.class public final enum Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
.super Ljava/lang/Enum;
.source "CustomerLoyalty.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/CustomerLoyalty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EntryType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

.field public static final enum AUXILIARY:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

.field public static final enum GENERATED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

.field public static final enum MANUAL:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

.field public static final enum SCANNED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;


# instance fields
.field private trackingName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 13
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    const-string v1, "SCANNED"

    const-string v2, "Barcode"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->SCANNED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    .line 14
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    const-string v1, "MANUAL"

    const-string v2, "Manual"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->MANUAL:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    .line 15
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    const-string v1, "GENERATED"

    const-string v2, "Generated"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->GENERATED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    .line 16
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    const-string v1, "AUXILIARY"

    const-string v2, "auxiliary"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->AUXILIARY:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    const/4 v0, 0x4

    .line 12
    new-array v0, v0, [Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->SCANNED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->MANUAL:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->GENERATED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->AUXILIARY:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

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

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21
    iput-object p3, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->trackingName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
    .locals 1

    .line 12
    const-class v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
    .locals 1

    .line 12
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-object v0
.end method


# virtual methods
.method public getTrackingName()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->trackingName:Ljava/lang/String;

    return-object v0
.end method

.method public toApiName()Ljava/lang/String;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
