.class Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SyncFile"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V
    .locals 0

    .line 661
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;)V
    .locals 0

    .line 661
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 664
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter SyncFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->access$600(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardproductIdByIssuerId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 666
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncFileToWatch  productId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncFileToWatchTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;->this$0:Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncFileToWatchTask;-><init>(Landroid/content/Context;)V

    .line 668
    invoke-virtual {v5, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncFileToWatchTask;->sendBTOfCardPicInfor(Ljava/lang/String;)Z

    .line 669
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SyncFile end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    return-void
.end method
