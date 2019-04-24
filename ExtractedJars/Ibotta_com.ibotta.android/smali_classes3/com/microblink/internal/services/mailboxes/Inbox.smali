.class public Lcom/microblink/internal/services/mailboxes/Inbox;
.super Ljava/lang/Object;


# instance fields
.field private date:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "email_date"
    .end annotation
.end field

.field private htmlBody:Ljava/lang/String;

.field private index:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "index"
    .end annotation
.end field

.field private merchant:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "merchant_name"
    .end annotation
.end field

.field private message:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "message"
    .end annotation
.end field

.field private orderNumber:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "order_number"
    .end annotation
.end field

.field private products:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "products"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxProduct;",
            ">;"
        }
    .end annotation
.end field

.field private shippingAddress:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "shipping_address"
    .end annotation
.end field

.field private shippingStatus:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "shipping_status"
    .end annotation
.end field

.field private subtotal:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtotal"
    .end annotation
.end field

.field private taxes:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "taxes"
    .end annotation
.end field

.field private time:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "email_time"
    .end annotation
.end field

.field private total:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public date()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->date:Ljava/lang/String;

    return-object v0
.end method

.method public html()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->htmlBody:Ljava/lang/String;

    return-object v0
.end method

.method public html(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->htmlBody:Ljava/lang/String;

    return-void
.end method

.method public index()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->index:I

    return v0
.end method

.method public merchant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->merchant:Ljava/lang/String;

    return-object v0
.end method

.method public message()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->message:Ljava/lang/String;

    return-object v0
.end method

.method public orderNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->orderNumber:Ljava/lang/String;

    return-object v0
.end method

.method public products()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxProduct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->products:Ljava/util/List;

    return-object v0
.end method

.method public shippingAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->shippingAddress:Ljava/lang/String;

    return-object v0
.end method

.method public shippingStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->shippingStatus:Ljava/lang/String;

    return-object v0
.end method

.method public subtotal()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->subtotal:F

    return v0
.end method

.method public taxes()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->taxes:F

    return v0
.end method

.method public time()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->time:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Inbox{message=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", index="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->index:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", date=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->date:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", time=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->time:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", merchant=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->merchant:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", orderNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->orderNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", subtotal="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->subtotal:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", total="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->total:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", taxes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->taxes:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", shippingAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->shippingAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", products="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->products:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", shippingStatus=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->shippingStatus:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", htmlBody=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->htmlBody:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public total()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/mailboxes/Inbox;->total:F

    return v0
.end method
