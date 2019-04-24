.class public Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/leisen/wallet/sdk/oma/SmartCardCallback;


# static fields
.field private static final RESULT_FAILURE:I = 0x1

.field private static final RESULT_SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "ApduSmartCardRequest"


# instance fields
.field private final lock:Ljava/lang/Object;

.field private mApduAid:Ljava/lang/String;

.field private mCapduList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/leisen/wallet/sdk/business/ApduBean;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

.field private mCurrentExecuteIndex:I

.field private mFlag:I

.field private mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

.field private mIsGetLocalData:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->lock:Ljava/lang/Object;

    .line 35
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mContext:Landroid/content/Context;

    .line 36
    iput-object p2, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    .line 37
    return-void
.end method

.method private clearData()V
    .locals 4

    .line 185
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " clearData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const/4 v0, 0x0

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    .line 187
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    .line 188
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    .line 189
    return-void
.end method

.method private sendApudToSmartCard()V
    .locals 9

    .line 45
    iget-object v4, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->lock:Ljava/lang/Object;

    monitor-enter v4

    .line 46
    :try_start_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 47
    monitor-exit v4

    return-void

    .line 50
    :cond_0
    :try_start_1
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    if-ne v0, v1, :cond_1

    .line 51
    monitor-exit v4

    return-void

    .line 53
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/leisen/wallet/sdk/business/ApduBean;

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    .line 54
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/ApduBean;->getApdu()Ljava/lang/String;

    move-result-object v5

    .line 55
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>start get apdu index:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==apdu:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const-string v0, "00A4"

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v5, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>deal with select apdu :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/16 v0, 0x8

    const/16 v1, 0xa

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 61
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v7

    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v1, v7, 0x2

    sub-int/2addr v0, v1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mApduAid:Ljava/lang/String;

    .line 63
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    .line 64
    invoke-static {}, Lcom/leisen/wallet/sdk/oma/SmartCard;->getInstance()Lcom/leisen/wallet/sdk/oma/SmartCard;

    move-result-object v0

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/oma/SmartCard;->closeChannel()V

    .line 65
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>has been get select aid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mApduAid:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendApudToSmartCard()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    monitor-exit v4

    return-void

    .line 69
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mApduAid:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_3

    .line 70
    monitor-exit v4

    return-void

    .line 72
    :cond_3
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>start execute apdu\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    new-instance v6, Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mApduAid:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-direct {v6, v1, v0}, Lcom/leisen/wallet/sdk/oma/SmartCardBean;-><init>(ILjava/lang/String;)V

    .line 74
    invoke-virtual {v6, v5}, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->setCommand(Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lcom/leisen/wallet/sdk/oma/SmartCard;->getInstance()Lcom/leisen/wallet/sdk/oma/SmartCard;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/leisen/wallet/sdk/oma/SmartCard;->setSmartCardCallBack(Lcom/leisen/wallet/sdk/oma/SmartCardCallback;)Lcom/leisen/wallet/sdk/oma/SmartCard;

    move-result-object v0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mContext:Landroid/content/Context;

    iget v2, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mFlag:I

    invoke-virtual {v0, v1, v2, v6}, Lcom/leisen/wallet/sdk/oma/SmartCard;->execute(Landroid/content/Context;ILcom/leisen/wallet/sdk/oma/SmartCardBean;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 76
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 77
    :goto_0
    return-void
.end method

.method private sendErrorMessage(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V
    .locals 6

    .line 164
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->clearData()V

    .line 165
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendSendNextErrorMessage(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V

    .line 168
    :cond_0
    return-void
.end method

.method private sendFailureMessage(ILjava/lang/Error;)V
    .locals 1

    .line 178
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->clearData()V

    .line 179
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    invoke-virtual {v0, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendFailureMessage(ILjava/lang/Error;)V

    .line 182
    :cond_0
    return-void
.end method

.method private sendMessage(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 157
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->clearData()V

    .line 158
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendSendNextMessage(IILjava/lang/String;Ljava/lang/String;)V

    .line 161
    :cond_0
    return-void
.end method

.method private sendSuccessMessage(Ljava/lang/String;)V
    .locals 1

    .line 171
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->clearData()V

    .line 172
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendSuccessMessage(Ljava/lang/String;)V

    .line 175
    :cond_0
    return-void
.end method


# virtual methods
.method public isGetLocalData(Z)V
    .locals 4

    .line 138
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " isGetLocalData enable : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " isGetLocalData mIsGetLocalData : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iput-boolean p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    .line 141
    return-void
.end method

.method public onOperFailure(ILjava/lang/Error;)V
    .locals 6

    .line 116
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onOperFailure mIsGetLocalData : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    if-eqz v0, :cond_0

    .line 118
    const v0, 0x186a9

    invoke-direct {p0, v0, p2}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendFailureMessage(ILjava/lang/Error;)V

    goto :goto_0

    .line 120
    :cond_0
    move-object v0, p0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    invoke-virtual {v1}, Lcom/leisen/wallet/sdk/business/ApduBean;->getIndex()I

    move-result v2

    const-string v3, ""

    const-string v4, ""

    move-object v5, p2

    const/4 v1, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendErrorMessage(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V

    .line 122
    :goto_0
    return-void
.end method

.method public onOperSuccess(ILjava/lang/String;)V
    .locals 7

    .line 81
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>handle apdu response:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; mIsGetLocalData : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mIsGetLocalData:Z

    if-eqz v0, :cond_0

    .line 84
    invoke-direct {p0, p2}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendSuccessMessage(Ljava/lang/String;)V

    .line 85
    return-void

    .line 88
    :cond_0
    move-object v4, p2

    .line 89
    const-string v5, ""

    .line 90
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    .line 91
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 92
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 94
    :cond_1
    if-eqz v4, :cond_2

    .line 96
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 98
    :cond_2
    const-string v0, "ApduSmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>get response res_sw:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/ApduBean;->getSw()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 101
    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 102
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/ApduBean;->getIndex()I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0, v5, v4}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendMessage(IILjava/lang/String;Ljava/lang/String;)V

    .line 103
    return-void

    .line 106
    :cond_3
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_4

    .line 107
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteIndex:I

    .line 108
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendApudToSmartCard()V

    goto :goto_0

    .line 110
    :cond_4
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCurrentExecuteApduBean:Lcom/leisen/wallet/sdk/business/ApduBean;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/ApduBean;->getIndex()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, v5, v4}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendMessage(IILjava/lang/String;Ljava/lang/String;)V

    .line 112
    :goto_0
    return-void
.end method

.method public run()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->sendApudToSmartCard()V

    .line 42
    return-void
.end method

.method public setCapduList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/leisen/wallet/sdk/business/ApduBean;>;)V"
        }
    .end annotation

    .line 125
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    .line 126
    return-void
.end method

.method public setFlag(I)V
    .locals 0

    .line 129
    iput p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mFlag:I

    .line 130
    return-void
.end method

.method public setGetLocalDataApdu(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 144
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    goto :goto_0

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 149
    :goto_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mCapduList:Ljava/util/List;

    new-instance v1, Lcom/leisen/wallet/sdk/business/ApduBean;

    invoke-direct {v1, p1}, Lcom/leisen/wallet/sdk/business/ApduBean;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    iget-object v2, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->lock:Ljava/lang/Object;

    monitor-enter v2

    .line 152
    :try_start_0
    iput-object p2, p0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->mApduAid:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 154
    :goto_1
    return-void
.end method
