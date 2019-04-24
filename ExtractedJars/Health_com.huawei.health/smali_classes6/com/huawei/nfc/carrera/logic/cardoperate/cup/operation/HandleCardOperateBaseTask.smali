.class public abstract Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

.field private mRefIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

.field private final mServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

.field protected mSign:Ljava/lang/String;

.field protected mSsid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    .line 62
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

    .line 63
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    .line 64
    return-void
.end method

.method private notifyListenerResult(I)V
    .locals 5

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyListenerResult notifyListenerResult  resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 157
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->getOperateEventTag()Ljava/lang/String;

    move-result-object v2

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 160
    const-string v0, "notifyListenerResult operateFinished 2 "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    invoke-interface {v0, v2, v4, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;->operateFinished(Ljava/lang/String;Ljava/lang/String;I)V

    .line 162
    goto :goto_0

    .line 164
    :cond_0
    return-void
.end method

.method private notifyListenerStart()V
    .locals 4

    .line 171
    const-string v0, "notifyListenerResult notifyListenerStart "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 173
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->getOperateEventTag()Ljava/lang/String;

    move-result-object v3

    .line 174
    const-string v0, "notifyListenerResult operateStart 1 "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mListener:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;->operateStart(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :cond_0
    return-void
.end method


# virtual methods
.method public doTask(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Handler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;Landroid/os/Handler;)V"
        }
    .end annotation

    .line 76
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mSsid:Ljava/lang/String;

    .line 77
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mSign:Ljava/lang/String;

    .line 78
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    .line 80
    invoke-virtual {p4, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 81
    return-void
.end method

.method protected abstract getOperateEventTag()Ljava/lang/String;
.end method

.method protected abstract handleFailResult(Ljava/util/List;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation
.end method

.method protected abstract handleSuccessResult(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation
.end method

.method protected abstract isOperationSatisfied(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation
.end method

.method protected abstract prepareLocalInfo(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation
.end method

.method public run()V
    .locals 7

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->isOperationSatisfied(Ljava/util/List;)Z

    move-result v3

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "the operation task isSatisFied: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 94
    if-nez v3, :cond_0

    .line 96
    const/16 v0, -0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->notifyListenerResult(I)V

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

    const/16 v1, -0x63

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;->notifyOperateResult(I)V

    .line 98
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->prepareLocalInfo(Ljava/util/List;)Z

    move-result v4

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "the operation task isPrepareSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 104
    if-nez v4, :cond_1

    .line 106
    const/16 v0, -0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->notifyListenerResult(I)V

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

    const/16 v1, -0x63

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;->notifyOperateResult(I)V

    .line 108
    return-void

    .line 112
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->notifyListenerStart()V

    .line 114
    const-string v0, "excute cup cmd now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mSsid:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mSign:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;->excuteCMD(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excute cup cmd result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 119
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->handleSuccessResult(Ljava/util/List;)Z

    move-result v6

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "the operation task isUpdateSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 124
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->notifyListenerResult(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;->notifyOperateResult(I)V

    .line 126
    goto :goto_1

    .line 129
    :cond_2
    const/16 v6, -0x63

    .line 130
    const/4 v0, -0x7

    if-ne v0, v5, :cond_3

    .line 132
    const-string v0, "===123===RESPONSE_CODE_FAILED_OPERATION_FATAL_ERR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 133
    const/4 v6, -0x1

    goto :goto_0

    .line 134
    :cond_3
    const/4 v0, -0x3

    if-eq v0, v5, :cond_4

    const/4 v0, -0x6

    if-ne v0, v5, :cond_5

    .line 137
    :cond_4
    const-string v0, "===123===OPERATE_RESULT_DEAL"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 138
    const/16 v6, -0x62

    .line 140
    :cond_5
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyListenerResult  failResutl: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mRefIds:Ljava/util/List;

    invoke-virtual {p0, v0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->handleFailResult(Ljava/util/List;I)V

    .line 142
    invoke-direct {p0, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->notifyListenerResult(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

    invoke-virtual {v0, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;->notifyOperateResult(I)V

    .line 145
    :goto_1
    return-void
.end method
