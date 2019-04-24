.class Lcom/huawei/qrcode/contacts/QRCardActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/contacts/QRCardActivity;->setListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/contacts/QRCardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/contacts/QRCardActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/contacts/QRCardActivity$2;->this$0:Lcom/huawei/qrcode/contacts/QRCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity$2;->this$0:Lcom/huawei/qrcode/contacts/QRCardActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->access$100(Lcom/huawei/qrcode/contacts/QRCardActivity;)Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->getItem(I)Lcom/huawei/qrcode/contacts/QRResultData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/qrcode/contacts/QRResultData;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/qrcode/contacts/QRResultData;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity$2;->this$0:Lcom/huawei/qrcode/contacts/QRCardActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/qrcode/contacts/QRCardActivity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
