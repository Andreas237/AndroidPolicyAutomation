.class Lcom/shopkick/app/offline/APIManagerFetchRetryHandler$1;
.super Ljava/lang/Object;
.source "APIManagerFetchRetryHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler$1;->this$0:Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler$1;->this$0:Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;

    invoke-static {v0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->access$000(Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;)V

    return-void
.end method
