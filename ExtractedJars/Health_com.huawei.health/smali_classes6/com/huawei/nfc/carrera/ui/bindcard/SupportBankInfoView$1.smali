.class Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->showSupportBankInfos(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryResultCallback(Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;>;)V"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->dismissProgressDialog()V

    .line 159
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    :cond_0
    const-string v0, "query support bank infos, but empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 162
    return-void

    .line 165
    :cond_1
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 166
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 167
    const/4 v6, 0x0

    .line 168
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;

    .line 170
    new-instance v6, Lo/dtd;

    invoke-direct {v6}, Lo/dtd;-><init>()V

    .line 171
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getNfcBankName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dtd;->a(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "03080000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 175
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showSupportBankInfos isCMBIssuerId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; isOnlySupportCMBdebitCard : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v3}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    if-eqz v9, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->setSupportCardType(I)V

    .line 183
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "03060000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    .line 184
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showSupportBankInfos isCGBIssuerId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; isOnlySupportCGBdebitCard : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v3}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    if-eqz v10, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 187
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->setSupportCardType(I)V

    .line 193
    :cond_3
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getSupportCardType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 195
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dtd;->c(Z)V

    .line 196
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dtd;->d(Z)V

    goto :goto_1

    .line 199
    :cond_4
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getSupportCardType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_5

    .line 201
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dtd;->c(Z)V

    .line 202
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dtd;->d(Z)V

    goto :goto_1

    .line 205
    :cond_5
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getSupportCardType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_6

    .line 207
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dtd;->c(Z)V

    .line 208
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dtd;->d(Z)V

    goto :goto_1

    .line 212
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unsupport cardType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->getSupportCardType()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 213
    goto/16 :goto_0

    .line 216
    :goto_1
    invoke-virtual {v6}, Lo/dtd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 219
    invoke-virtual {v6}, Lo/dtd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dtd;

    .line 220
    invoke-virtual {v11}, Lo/dtd;->d()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v6}, Lo/dtd;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    const/4 v0, 0x1

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v11, v0}, Lo/dtd;->c(Z)V

    .line 221
    invoke-virtual {v11}, Lo/dtd;->c()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v6}, Lo/dtd;->c()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v11, v0}, Lo/dtd;->d(Z)V

    .line 222
    goto :goto_4

    .line 225
    :cond_b
    invoke-virtual {v6}, Lo/dtd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    :goto_4
    goto/16 :goto_0

    .line 230
    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$302(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;)Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;

    .line 234
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/GridView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/GridView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$600(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Landroid/widget/GridView;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/GridView;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 245
    :cond_d
    return-void
.end method
