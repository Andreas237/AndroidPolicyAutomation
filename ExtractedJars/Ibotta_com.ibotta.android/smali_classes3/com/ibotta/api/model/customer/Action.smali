.class public final enum Lcom/ibotta/api/model/customer/Action;
.super Ljava/lang/Enum;
.source "Action.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/Action;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/Action;

.field public static final enum CREATE:Lcom/ibotta/api/model/customer/Action;

.field public static final enum DELETE:Lcom/ibotta/api/model/customer/Action;

.field public static final enum UPDATE:Lcom/ibotta/api/model/customer/Action;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 7
    new-instance v0, Lcom/ibotta/api/model/customer/Action;

    const-string v1, "CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Action;->CREATE:Lcom/ibotta/api/model/customer/Action;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/customer/Action;

    const-string v1, "UPDATE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Action;->UPDATE:Lcom/ibotta/api/model/customer/Action;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/customer/Action;

    const-string v1, "DELETE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/customer/Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/Action;->DELETE:Lcom/ibotta/api/model/customer/Action;

    const/4 v0, 0x3

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/customer/Action;

    sget-object v1, Lcom/ibotta/api/model/customer/Action;->CREATE:Lcom/ibotta/api/model/customer/Action;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/Action;->UPDATE:Lcom/ibotta/api/model/customer/Action;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/Action;->DELETE:Lcom/ibotta/api/model/customer/Action;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/customer/Action;->$VALUES:[Lcom/ibotta/api/model/customer/Action;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/Action;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/customer/Action;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/Action;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/Action;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/customer/Action;->$VALUES:[Lcom/ibotta/api/model/customer/Action;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/Action;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/Action;

    return-object v0
.end method


# virtual methods
.method public toApiName()Ljava/lang/String;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/Action;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
