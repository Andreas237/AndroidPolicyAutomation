.class Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "KeyBoardTask"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;


# direct methods
.method public constructor <init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V
    .locals 1

    .line 702
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    .line 703
    new-instance v0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$1;

    invoke-direct {v0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$1;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V

    invoke-direct {p0, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 711
    return-void
.end method

.method static synthetic access$1100(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;Ljava/lang/Object;)V
    .locals 0

    .line 700
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->set(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;Ljava/lang/Object;)V
    .locals 0

    .line 700
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->set(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$800(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;Ljava/lang/String;)V
    .locals 0

    .line 700
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->start(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$900(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;
    .locals 1

    .line 700
    invoke-direct {p0, p1, p2, p3}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->getData(JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getData(JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;
    .locals 3

    .line 728
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 739
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->cancel(Z)Z

    .line 728
    return-object v1

    .line 729
    :catch_0
    move-exception v1

    .line 731
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 739
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->cancel(Z)Z

    .line 740
    goto :goto_0

    .line 732
    :catch_1
    move-exception v1

    .line 734
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 739
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->cancel(Z)Z

    .line 740
    goto :goto_0

    .line 735
    :catch_2
    move-exception v1

    .line 737
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/TimeoutException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 739
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->cancel(Z)Z

    .line 740
    goto :goto_0

    .line 739
    :catchall_0
    move-exception v2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->cancel(Z)Z

    throw v2

    .line 741
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method private start(Ljava/lang/String;)V
    .locals 4

    .line 714
    new-instance v1, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;

    invoke-direct {v1}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;-><init>()V

    .line 715
    invoke-virtual {v1, p1}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->setPan(Ljava/lang/String;)V

    .line 716
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$600(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->setType(I)V

    .line 717
    new-instance v2, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;

    invoke-direct {v2, p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;)V

    .line 719
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$1000(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/UPTsmAddon;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->getEncryptData(Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 723
    goto :goto_0

    .line 720
    :catch_0
    move-exception v3

    .line 721
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V

    .line 722
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->set(Ljava/lang/Object;)V

    .line 724
    :goto_0
    return-void
.end method
