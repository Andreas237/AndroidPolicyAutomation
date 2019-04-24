.class Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;
.super Ljava/lang/Object;
.source "SKClientLoggingConfigurationProvider.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

.field final synthetic val$dataResponse:Lcom/shopkick/fetchers/DataResponse;


# direct methods
.method constructor <init>(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    iput-object p2, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;->val$dataResponse:Lcom/shopkick/fetchers/DataResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    iget-object v1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;->val$dataResponse:Lcom/shopkick/fetchers/DataResponse;

    invoke-static {v0, v1}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$100(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method
