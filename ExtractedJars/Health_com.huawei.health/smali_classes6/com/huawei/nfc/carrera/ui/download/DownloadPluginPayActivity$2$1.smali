.class Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->onPullingChange(Lo/eay;Lo/eba;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

.field final synthetic val$result:Lo/eba;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;Lo/eba;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->val$result:Lo/eba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->val$result:Lo/eba;

    iget v0, v0, Lo/eba;->c:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 183
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mContext:Landroid/content/Context;

    .line 184
    const/16 v1, 0x4e2a

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_PLUGIN_DOWNLOADED_FLAG"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 183
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 185
    invoke-static {}, Lcom/huawei/nfc/util/WalletPluginClassUtil;->loadPlugin()V

    .line 186
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->finish()V

    .line 191
    goto/16 :goto_1

    .line 194
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->val$result:Lo/eba;

    invoke-virtual {v0}, Lo/eba;->d()I

    move-result v6

    .line 195
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPullingChange result.fetchTotalSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->val$result:Lo/eba;

    invoke-virtual {v3}, Lo/eba;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->val$result:Lo/eba;

    invoke-virtual {v0}, Lo/eba;->b()I

    move-result v7

    .line 197
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPullingChange result.fetchPulledSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->val$result:Lo/eba;

    invoke-virtual {v3}, Lo/eba;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 200
    mul-int/lit8 v0, v7, 0x64

    div-int v8, v0, v6

    .line 202
    :cond_0
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "plugin downloading process = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-static {v0, v8}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->access$100(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;I)V

    .line 204
    goto :goto_1

    .line 206
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_fail_network:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->access$200(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;IZ)V

    .line 207
    goto :goto_1

    .line 209
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_memory_space:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->access$200(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;IZ)V

    .line 210
    goto :goto_1

    .line 212
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_unused:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->access$200(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;IZ)V

    .line 213
    goto :goto_1

    .line 215
    :goto_0
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_fail_service:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->access$200(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;IZ)V

    .line 218
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch -0x9
        :pswitch_3
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
