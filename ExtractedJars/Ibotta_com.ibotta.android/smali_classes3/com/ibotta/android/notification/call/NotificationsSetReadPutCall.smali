.class public final Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "NotificationsSetReadPutCall.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u0005H\u0016J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;",
        "Lcom/ibotta/api/BaseApiCall;",
        "Lcom/ibotta/api/EmptyResponse;",
        "()V",
        "name",
        "",
        "getName",
        "()Ljava/lang/String;",
        "buildResponse",
        "json",
        "Lcom/ibotta/android/json/IbottaJson;",
        "is",
        "Ljava/io/InputStream;",
        "getApiFunction",
        "getHttpMethod",
        "Lcom/ibotta/api/ApiCall$HttpMethod;",
        "getResponseType",
        "Ljava/lang/Class;",
        "Companion",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
# The value of this static final field might be set in the static constructor
.field private static final API_FUNCTION:Ljava/lang/String; = "notifications/set_read.json"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->Companion:Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall$Companion;

    const-string v0, "notifications/set_read.json"

    .line 30
    sput-object v0, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->API_FUNCTION:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method public static final synthetic access$getAPI_FUNCTION$cp()Ljava/lang/String;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->API_FUNCTION:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/ApiResponse;

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 1
    .param p1    # Lcom/ibotta/android/json/IbottaJson;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "is"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    sget-object v0, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->API_FUNCTION:Ljava/lang/String;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;->getApiFunction()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
