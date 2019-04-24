.class Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ResponseHandler"
.end annotation


# instance fields
.field private final mResponder:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;


# direct methods
.method public constructor <init>(Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 108
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;->mResponder:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    .line 109
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 113
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 114
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;->mResponder:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->handleMessage(Landroid/os/Message;)V

    .line 115
    return-void
.end method
