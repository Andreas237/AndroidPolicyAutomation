.class Lcom/usebutton/sdk/internal/BaseCardActivity$1;
.super Ljava/lang/Object;
.source "BaseCardActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/BaseCardActivity;->loadAssets()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/BaseCardActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/BaseCardActivity;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/BaseCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/BaseCardActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onAssetsFailed()V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 69
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity$1;->onResult(Ljava/lang/Void;)V

    return-void
.end method

.method public onResult(Ljava/lang/Void;)V
    .locals 0

    .line 72
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/BaseCardActivity;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onAssetsReady()V

    return-void
.end method
