.class public Lcom/ibotta/api/execution/DefaultApiHttpExecutionFactory;
.super Ljava/lang/Object;
.source "DefaultApiHttpExecutionFactory.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecutionFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newIbottaApiInstance()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 9
    new-instance v0, Lcom/ibotta/api/execution/ApiOkHttpExecution;

    invoke-direct {v0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;-><init>()V

    return-object v0
.end method

.method public newIbottaMvtInstance()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/api/execution/MvtApiExecution;

    invoke-direct {v0}, Lcom/ibotta/api/execution/MvtApiExecution;-><init>()V

    return-object v0
.end method

.method public newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 19
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution;

    invoke-direct {v0}, Lcom/ibotta/api/execution/PwiApiExecution;-><init>()V

    return-object v0
.end method
