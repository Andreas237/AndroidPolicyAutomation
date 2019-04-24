.class Lcom/usebutton/sdk/internal/ButtonPrivate$2;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;->doRegister(Lcom/usebutton/sdk/Button$OnConfigureListener;)V
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
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

.field final synthetic val$listener:Lcom/usebutton/sdk/Button$OnConfigureListener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/Button$OnConfigureListener;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->val$listener:Lcom/usebutton/sdk/Button$OnConfigureListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 3

    const-string v0, "ButtonPrivate"

    const-string v1, "Error: Button was unable to create a session."

    .line 208
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->val$listener:Lcom/usebutton/sdk/Button$OnConfigureListener;

    if-eqz v0, :cond_0

    .line 211
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error: Button was unable to create a session."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/Button$OnConfigureListener;->onComplete(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 194
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->onResult(Ljava/lang/Void;)V

    return-void
.end method

.method public onResult(Ljava/lang/Void;)V
    .locals 1

    .line 197
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$102(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;)Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    .line 198
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$200(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    .line 200
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$2;->val$listener:Lcom/usebutton/sdk/Button$OnConfigureListener;

    if-eqz p1, :cond_0

    .line 201
    invoke-interface {p1, v0}, Lcom/usebutton/sdk/Button$OnConfigureListener;->onComplete(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
