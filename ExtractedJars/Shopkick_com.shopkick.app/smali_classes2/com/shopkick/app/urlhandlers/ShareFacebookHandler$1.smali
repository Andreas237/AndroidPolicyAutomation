.class Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;
.super Ljava/lang/Object;
.source "ShareFacebookHandler.java"

# interfaces
.implements Lcom/facebook/FacebookCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/FacebookCallback<",
        "Lcom/facebook/share/Sharer$Result;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;->this$0:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;->this$0:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->access$000(Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;I)V

    return-void
.end method

.method public onError(Lcom/facebook/FacebookException;)V
    .locals 1

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;->this$0:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->access$000(Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;I)V

    return-void
.end method

.method public onSuccess(Lcom/facebook/share/Sharer$Result;)V
    .locals 1

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;->this$0:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    const/4 v0, 0x3

    invoke-static {p1, v0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->access$000(Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 89
    check-cast p1, Lcom/facebook/share/Sharer$Result;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;->onSuccess(Lcom/facebook/share/Sharer$Result;)V

    return-void
.end method
