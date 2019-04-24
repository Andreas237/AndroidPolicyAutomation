.class Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getCurrentPosition()I

    move-result v3

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 191
    if-ltz v3, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getTitle()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getClickUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :cond_0
    return-void
.end method
