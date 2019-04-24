.class public final enum Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;
.super Ljava/lang/Enum;
.source "CustomerInvites.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/CustomerInvites;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AddressType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

.field public static final enum EMAIL:Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

.field public static final enum SMS:Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 11
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    const-string v1, "EMAIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->EMAIL:Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    .line 12
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    const-string v1, "SMS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->SMS:Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->EMAIL:Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->SMS:Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;
    .locals 0

    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;

    return-object v0
.end method


# virtual methods
.method public toApiName()Ljava/lang/String;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
