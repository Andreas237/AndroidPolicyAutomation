.class Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 333
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 334
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1001

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$100(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 336
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->next()V

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$300(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$202(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;I)I

    .line 338
    const-string v4, ""

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$200(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$200(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$100(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 340
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$100(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$200(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getContent()Ljava/lang/String;

    move-result-object v4

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$400(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41700000    # 15.0f

    invoke-static {v2, v3}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->sp2px(Landroid/content/Context;F)I

    move-result v2

    const-string v3, "FZYOUH_508R--GB1-4"

    invoke-virtual {v1, v4, v2, v3}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->buildText(Ljava/lang/CharSequence;ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setView(Ljava/lang/CharSequence;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$308(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I

    .line 344
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$300(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$100(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 346
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$302(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;I)I

    .line 348
    :cond_1
    goto :goto_0

    .line 349
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1002

    if-ne v0, v1, :cond_3

    .line 352
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->access$500(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 354
    :cond_3
    :goto_0
    return-void
.end method
