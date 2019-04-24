.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->checkCardNum()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 428
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public identifyResult(ILjava/lang/String;II)V
    .locals 2

    .line 432
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "identify card result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and issuerId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " cardType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V

    .line 435
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 437
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0, p2, p3, p4}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Ljava/lang/String;II)V

    goto :goto_0

    .line 441
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$600(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;I)V

    .line 443
    :goto_0
    return-void
.end method
