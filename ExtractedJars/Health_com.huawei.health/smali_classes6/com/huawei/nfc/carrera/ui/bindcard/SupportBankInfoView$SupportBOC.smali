.class Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SupportBOC"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;


# direct methods
.method private constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;)V
    .locals 0

    .line 338
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 341
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDic startSupportCMB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    const-string v1, "Bank_HotFix_03080000"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    move-result-object v4

    .line 343
    if-eqz v4, :cond_2

    iget v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 344
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDicsResponseCMB SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 346
    iget-object v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/server/card/response/DicItem;

    .line 347
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->getValue()Ljava/lang/String;

    move-result-object v6

    .line 348
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "2"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QueryDicsResponseCMB info : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$102(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Z)Z

    goto :goto_0

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$102(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Z)Z

    .line 354
    :goto_0
    goto :goto_1

    .line 355
    :cond_1
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDicCMB The size of result\'s dictory is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 358
    :cond_2
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDicCMB Response is null object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    const-string v1, "Bank_HotFix_03060000"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    move-result-object v5

    .line 362
    if-eqz v5, :cond_5

    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 363
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDicsresponseCGB SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 365
    iget-object v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/server/card/response/DicItem;

    .line 366
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 367
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    const-string v0, ""

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "2"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 368
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QueryDicsresponseCGB info : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$202(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Z)Z

    goto :goto_2

    .line 371
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$202(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Z)Z

    .line 373
    :goto_2
    goto :goto_3

    .line 374
    :cond_4
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDicCGB The size of result\'s dictory is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 377
    :cond_5
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryDicCGB Response is null object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    :goto_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$900(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 380
    return-void
.end method
