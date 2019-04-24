.class Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler$ResponderHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ResponderHandler"
.end annotation


# instance fields
.field private final mResponder:Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;


# direct methods
.method public constructor <init>(Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 86
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler$ResponderHandler;->mResponder:Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;

    .line 87
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 91
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 92
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler$ResponderHandler;->mResponder:Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handleMessage(Landroid/os/Message;)V

    .line 93
    return-void
.end method
