.class public final enum Lcom/ibotta/api/model/im/ImConnectionStatus;
.super Ljava/lang/Enum;
.source "ImConnectionStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/im/ImConnectionStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum CHECKING:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum INVALID:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum PENDING:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum TAKEN:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field public static final enum VERIFIED:Lcom/ibotta/api/model/im/ImConnectionStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 8
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "VERIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->VERIFIED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "PENDING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->PENDING:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 10
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "CHECKING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->CHECKING:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 11
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "INVALID"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->INVALID:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 12
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNKNOWN:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 13
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "TAKEN"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->TAKEN:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 14
    new-instance v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    const-string v1, "UNDEFINED"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/im/ImConnectionStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [Lcom/ibotta/api/model/im/ImConnectionStatus;

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->VERIFIED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->PENDING:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->CHECKING:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->INVALID:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNKNOWN:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->TAKEN:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->$VALUES:[Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static definedValues()[Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 2

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Lcom/ibotta/api/model/im/ImConnectionStatus;->values()[Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object v0
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 0

    .line 20
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/im/ImConnectionStatus;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 22
    :catch_0
    sget-object p0, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    :goto_0
    return-object p0
.end method

.method public static isImError(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z
    .locals 1

    .line 48
    sget-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus$1;->$SwitchMap$com$ibotta$api$model$im$ImConnectionStatus:[I

    invoke-virtual {p0}, Lcom/ibotta/api/model/im/ImConnectionStatus;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return p0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static isImPending(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z
    .locals 1

    .line 40
    sget-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->PENDING:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->CHECKING:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isImUndefined(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z
    .locals 1

    .line 36
    sget-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isImVerified(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z
    .locals 1

    .line 44
    sget-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->VERIFIED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/api/model/im/ImConnectionStatus;->$VALUES:[Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/im/ImConnectionStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object v0
.end method
