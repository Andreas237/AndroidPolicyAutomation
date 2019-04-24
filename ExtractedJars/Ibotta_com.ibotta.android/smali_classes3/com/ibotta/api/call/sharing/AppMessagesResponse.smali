.class public Lcom/ibotta/api/call/sharing/AppMessagesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "AppMessagesResponse.java"


# instance fields
.field private messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/sharing/AppMessage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/sharing/AppMessage;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/call/sharing/AppMessagesResponse;->messages:Ljava/util/List;

    return-object v0
.end method

.method public setMessages(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/sharing/AppMessage;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/call/sharing/AppMessagesResponse;->messages:Ljava/util/List;

    return-void
.end method
