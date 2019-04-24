.class public Lcom/ibotta/api/execution/MvtApiExecution;
.super Lcom/ibotta/api/execution/ApiOkHttpExecution;
.source "MvtApiExecution.java"


# static fields
.field private static final API_PATH_FORMAT:Ljava/lang/String; = "%1$s/%2$s"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;-><init>()V

    return-void
.end method


# virtual methods
.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 4

    const-string v0, "%1$s/%2$s"

    const/4 v1, 0x2

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getMvtApiUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
