.class public final enum Lcom/ibotta/api/model/customer/Customer$Event;
.super Ljava/lang/Enum;
.source "Customer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/Customer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Event"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/Customer$Event;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/Customer$Event;

.field public static final enum AFTER_INVITE:Lcom/ibotta/api/model/customer/Customer$Event;

.field public static final enum AFTER_LOGIN:Lcom/ibotta/api/model/customer/Customer$Event;

.field public static final enum AFTER_REG:Lcom/ibotta/api/model/customer/Customer$Event;

.field public static final enum APP_START:Lcom/ibotta/api/model/customer/Customer$Event;

.field public static final enum REWARD_FINISH:Lcom/ibotta/api/model/customer/Customer$Event;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 657
    new-instance v0, Lcom/ibotta/api/model/customer/Customer$Event;

    const-string v1, "AFTER_REG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/Customer$Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->AFTER_REG:Lcom/ibotta/api/model/customer/Customer$Event;

    .line 658
    new-instance v0, Lcom/ibotta/api/model/customer/Customer$Event;

    const-string v1, "AFTER_LOGIN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/Customer$Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->AFTER_LOGIN:Lcom/ibotta/api/model/customer/Customer$Event;

    .line 659
    new-instance v0, Lcom/ibotta/api/model/customer/Customer$Event;

    const-string v1, "AFTER_INVITE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/customer/Customer$Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->AFTER_INVITE:Lcom/ibotta/api/model/customer/Customer$Event;

    .line 660
    new-instance v0, Lcom/ibotta/api/model/customer/Customer$Event;

    const-string v1, "APP_START"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/customer/Customer$Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->APP_START:Lcom/ibotta/api/model/customer/Customer$Event;

    .line 661
    new-instance v0, Lcom/ibotta/api/model/customer/Customer$Event;

    const-string v1, "REWARD_FINISH"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/customer/Customer$Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->REWARD_FINISH:Lcom/ibotta/api/model/customer/Customer$Event;

    const/4 v0, 0x5

    .line 656
    new-array v0, v0, [Lcom/ibotta/api/model/customer/Customer$Event;

    sget-object v1, Lcom/ibotta/api/model/customer/Customer$Event;->AFTER_REG:Lcom/ibotta/api/model/customer/Customer$Event;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/Customer$Event;->AFTER_LOGIN:Lcom/ibotta/api/model/customer/Customer$Event;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/Customer$Event;->AFTER_INVITE:Lcom/ibotta/api/model/customer/Customer$Event;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/customer/Customer$Event;->APP_START:Lcom/ibotta/api/model/customer/Customer$Event;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/customer/Customer$Event;->REWARD_FINISH:Lcom/ibotta/api/model/customer/Customer$Event;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->$VALUES:[Lcom/ibotta/api/model/customer/Customer$Event;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 656
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/Customer$Event;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 670
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/customer/Customer$Event;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/Customer$Event;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/Customer$Event;
    .locals 1

    .line 656
    const-class v0, Lcom/ibotta/api/model/customer/Customer$Event;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/Customer$Event;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/Customer$Event;
    .locals 1

    .line 656
    sget-object v0, Lcom/ibotta/api/model/customer/Customer$Event;->$VALUES:[Lcom/ibotta/api/model/customer/Customer$Event;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/Customer$Event;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/Customer$Event;

    return-object v0
.end method


# virtual methods
.method public getTrackingName()Ljava/lang/String;
    .locals 1

    .line 678
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/Customer$Event;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
