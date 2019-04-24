.class Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->initAndLoadCardInstructionUrl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V
    .locals 2

    .line 174
    if-eqz p2, :cond_0

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getLicUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$002(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "queryTrafficCardInfoCallback error"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    return-void

    .line 181
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)V

    .line 184
    :cond_1
    return-void
.end method
