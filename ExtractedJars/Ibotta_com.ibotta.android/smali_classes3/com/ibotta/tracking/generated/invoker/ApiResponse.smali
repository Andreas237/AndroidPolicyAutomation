.class public Lcom/ibotta/tracking/generated/invoker/ApiResponse;
.super Ljava/lang/Object;
.source "ApiResponse.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final statusCode:I


# direct methods
.method public constructor <init>(ILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/tracking/generated/invoker/ApiResponse;-><init>(ILjava/util/Map;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/Map;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;TT;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->statusCode:I

    .line 44
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->headers:Ljava/util/Map;

    .line 45
    iput-object p3, p0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->data:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->statusCode:I

    return v0
.end method
