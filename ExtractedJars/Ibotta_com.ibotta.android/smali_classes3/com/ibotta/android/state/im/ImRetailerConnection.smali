.class public final enum Lcom/ibotta/android/state/im/ImRetailerConnection;
.super Ljava/lang/Enum;
.source "ImRetailerConnection.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/state/im/ImRetailerConnection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/state/im/ImRetailerConnection;

.field public static final enum CONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

.field public static final enum CONNECTING:Lcom/ibotta/android/state/im/ImRetailerConnection;

.field public static final enum DISCONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

.field public static final enum ERROR_INVALID:Lcom/ibotta/android/state/im/ImRetailerConnection;

.field public static final enum ERROR_TAKEN:Lcom/ibotta/android/state/im/ImRetailerConnection;

.field public static final enum ERROR_UNKNOWN:Lcom/ibotta/android/state/im/ImRetailerConnection;


# instance fields
.field private apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 4
    new-instance v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    const-string v1, "DISCONNECTED"

    const-string v2, "disconnected"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/state/im/ImRetailerConnection;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->DISCONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    .line 5
    new-instance v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    const-string v1, "CONNECTING"

    const-string v2, "connecting"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/android/state/im/ImRetailerConnection;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTING:Lcom/ibotta/android/state/im/ImRetailerConnection;

    .line 6
    new-instance v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    const-string v1, "CONNECTED"

    const-string v2, "connected"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/android/state/im/ImRetailerConnection;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    .line 7
    new-instance v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    const-string v1, "ERROR_UNKNOWN"

    const-string v2, "error_unknown"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/android/state/im/ImRetailerConnection;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_UNKNOWN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    .line 8
    new-instance v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    const-string v1, "ERROR_INVALID"

    const-string v2, "error_invalid"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/android/state/im/ImRetailerConnection;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_INVALID:Lcom/ibotta/android/state/im/ImRetailerConnection;

    .line 9
    new-instance v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    const-string v1, "ERROR_TAKEN"

    const-string v2, "error_taken"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/android/state/im/ImRetailerConnection;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_TAKEN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    const/4 v0, 0x6

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/state/im/ImRetailerConnection;

    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->DISCONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTING:Lcom/ibotta/android/state/im/ImRetailerConnection;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_UNKNOWN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_INVALID:Lcom/ibotta/android/state/im/ImRetailerConnection;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_TAKEN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->$VALUES:[Lcom/ibotta/android/state/im/ImRetailerConnection;

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

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 14
    iput-object p3, p0, Lcom/ibotta/android/state/im/ImRetailerConnection;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/android/state/im/ImRetailerConnection;
    .locals 2

    .line 23
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->DISCONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    .line 25
    invoke-virtual {v0}, Lcom/ibotta/android/state/im/ImRetailerConnection;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 26
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->DISCONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    goto :goto_0

    .line 27
    :cond_0
    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTING:Lcom/ibotta/android/state/im/ImRetailerConnection;

    invoke-virtual {v1}, Lcom/ibotta/android/state/im/ImRetailerConnection;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 28
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTING:Lcom/ibotta/android/state/im/ImRetailerConnection;

    goto :goto_0

    .line 29
    :cond_1
    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    invoke-virtual {v1}, Lcom/ibotta/android/state/im/ImRetailerConnection;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 30
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->CONNECTED:Lcom/ibotta/android/state/im/ImRetailerConnection;

    goto :goto_0

    .line 31
    :cond_2
    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_UNKNOWN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    invoke-virtual {v1}, Lcom/ibotta/android/state/im/ImRetailerConnection;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 32
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_UNKNOWN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    goto :goto_0

    .line 33
    :cond_3
    sget-object v1, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_TAKEN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    invoke-virtual {v1}, Lcom/ibotta/android/state/im/ImRetailerConnection;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 34
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->ERROR_TAKEN:Lcom/ibotta/android/state/im/ImRetailerConnection;

    :cond_4
    :goto_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/im/ImRetailerConnection;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/im/ImRetailerConnection;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/state/im/ImRetailerConnection;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/state/im/ImRetailerConnection;->$VALUES:[Lcom/ibotta/android/state/im/ImRetailerConnection;

    invoke-virtual {v0}, [Lcom/ibotta/android/state/im/ImRetailerConnection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/state/im/ImRetailerConnection;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/state/im/ImRetailerConnection;->apiName:Ljava/lang/String;

    return-object v0
.end method
