.class public final enum Lcom/ibotta/api/model/customer/CustomerSetting$FormType;
.super Ljava/lang/Enum;
.source "CustomerSetting.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/CustomerSetting;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FormType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/CustomerSetting$FormType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

.field public static final enum BOOLEAN:Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

.field public static final enum STRING:Lcom/ibotta/api/model/customer/CustomerSetting$FormType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 12
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->BOOLEAN:Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    const-string v1, "STRING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->STRING:Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->BOOLEAN:Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->STRING:Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerSetting$FormType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 25
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerSetting$FormType;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/CustomerSetting$FormType;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
