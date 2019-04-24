.class public Lcom/usebutton/sdk/internal/api/Request$Put;
.super Lcom/usebutton/sdk/internal/api/Request$Post;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Put"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 233
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public method()Ljava/lang/String;
    .locals 1

    const-string v0, "PUT"

    return-object v0
.end method
