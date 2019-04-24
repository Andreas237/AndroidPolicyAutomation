.class public abstract Lcom/ibotta/api/BaseApiExecution;
.super Ljava/lang/Object;
.source "BaseApiExecution.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# static fields
.field private static json:Lcom/ibotta/android/json/IbottaJson;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected getJson()Lcom/ibotta/android/json/IbottaJson;
    .locals 3

    .line 14
    sget-object v0, Lcom/ibotta/api/BaseApiExecution;->json:Lcom/ibotta/android/json/IbottaJson;

    if-nez v0, :cond_0

    .line 15
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/BaseApiExecution;->json:Lcom/ibotta/android/json/IbottaJson;

    .line 18
    :cond_0
    sget-object v0, Lcom/ibotta/api/BaseApiExecution;->json:Lcom/ibotta/android/json/IbottaJson;

    return-object v0
.end method
