.class public final enum Lcom/ibotta/api/model/earnings/Earning$ProcessingState;
.super Ljava/lang/Enum;
.source "Earning.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/earnings/Earning;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ProcessingState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/earnings/Earning$ProcessingState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field public static final enum CANCELED:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field public static final enum COMPLETE:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field public static final enum ERROR:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field public static final enum PENDING:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field public static final enum PENDING_VERIFICATION:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 29
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const-string v1, "CANCELED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->CANCELED:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    .line 30
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const-string v1, "COMPLETE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->COMPLETE:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    .line 31
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const-string v1, "ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->ERROR:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    .line 32
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const-string v1, "PENDING"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    .line 33
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const-string v1, "PENDING_VERIFICATION"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING_VERIFICATION:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    .line 34
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const-string v1, "UNKNOWN"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    const/4 v0, 0x6

    .line 28
    new-array v0, v0, [Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->CANCELED:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->COMPLETE:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->ERROR:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING_VERIFICATION:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    aput-object v1, v0, v7

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->$VALUES:[Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$ProcessingState;
    .locals 0

    if-nez p0, :cond_0

    .line 42
    sget-object p0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    return-object p0

    .line 47
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 50
    :catch_0
    sget-object p0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$ProcessingState;
    .locals 1

    .line 28
    const-class v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/earnings/Earning$ProcessingState;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->$VALUES:[Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
