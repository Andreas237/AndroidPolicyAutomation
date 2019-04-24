.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method private getBtnText(I)Ljava/lang/String;
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_quick_pass_button_text:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 234
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 237
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_input_bank_card_info_again:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 238
    goto :goto_0

    .line 240
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_rebind:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 241
    goto :goto_0

    .line 243
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_quick_pass_button_text:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 244
    goto :goto_0

    .line 246
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_contact_to_bank_client:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 247
    goto :goto_0

    .line 249
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_contact_to_huawei_client:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 250
    goto :goto_0

    .line 252
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_ok:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 253
    .line 257
    :goto_0
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private getRandomNum()I
    .locals 4

    .line 225
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 226
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    add-int/lit8 v3, v0, 0xf

    .line 228
    return v3
.end method

.method private getResultTxt(I)Ljava/lang/String;
    .locals 3

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 211
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 214
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_rebind_fail:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;

    move-result-object v2

    .line 215
    .line 219
    :goto_0
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 117
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 118
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 122
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$002(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)I

    .line 123
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V

    .line 134
    goto/16 :goto_0

    .line 141
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;->bindSuccess(I)V

    .line 142
    goto/16 :goto_0

    .line 146
    :sswitch_2
    const-string v0, "===123===BIND_CARD_FAIL"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$600(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_failure_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 157
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$700(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lo/egd;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;

    invoke-direct {v1, p0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===errorInfo.oprType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 168
    iget v0, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->getResultTxt(I)Ljava/lang/String;

    move-result-object v4

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    iget v0, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->getBtnText(I)Ljava/lang/String;

    move-result-object v5

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$700(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$700(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$900(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    goto :goto_0

    .line 193
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)I

    move-result v0

    const/16 v1, 0x6b8

    if-ge v0, v1, :cond_0

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)I

    move-result v1

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->getRandomNum()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$002(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)I

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 198
    const/16 v0, 0xe

    const-wide/16 v1, 0x708

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->sendEmptyMessageDelayed(IJ)Z

    .line 206
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_2
        0xa -> :sswitch_0
        0xe -> :sswitch_3
    .end sparse-switch
.end method
