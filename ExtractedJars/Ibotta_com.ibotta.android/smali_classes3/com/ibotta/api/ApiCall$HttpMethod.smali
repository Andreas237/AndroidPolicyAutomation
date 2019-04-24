.class public final enum Lcom/ibotta/api/ApiCall$HttpMethod;
.super Ljava/lang/Enum;
.source "ApiCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/ApiCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HttpMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/ApiCall$HttpMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/ApiCall$HttpMethod;

.field public static final enum DELETE:Lcom/ibotta/api/ApiCall$HttpMethod;

.field public static final enum GET:Lcom/ibotta/api/ApiCall$HttpMethod;

.field public static final enum POST:Lcom/ibotta/api/ApiCall$HttpMethod;

.field public static final enum PUT:Lcom/ibotta/api/ApiCall$HttpMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 11
    new-instance v0, Lcom/ibotta/api/ApiCall$HttpMethod;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/ApiCall$HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    new-instance v0, Lcom/ibotta/api/ApiCall$HttpMethod;

    const-string v1, "POST"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/ApiCall$HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    new-instance v0, Lcom/ibotta/api/ApiCall$HttpMethod;

    const-string v1, "PUT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/ApiCall$HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    new-instance v0, Lcom/ibotta/api/ApiCall$HttpMethod;

    const-string v1, "DELETE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/ApiCall$HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->DELETE:Lcom/ibotta/api/ApiCall$HttpMethod;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/ibotta/api/ApiCall$HttpMethod;

    sget-object v1, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/ApiCall$HttpMethod;->DELETE:Lcom/ibotta/api/ApiCall$HttpMethod;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->$VALUES:[Lcom/ibotta/api/ApiCall$HttpMethod;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/api/ApiCall$HttpMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->$VALUES:[Lcom/ibotta/api/ApiCall$HttpMethod;

    invoke-virtual {v0}, [Lcom/ibotta/api/ApiCall$HttpMethod;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method
