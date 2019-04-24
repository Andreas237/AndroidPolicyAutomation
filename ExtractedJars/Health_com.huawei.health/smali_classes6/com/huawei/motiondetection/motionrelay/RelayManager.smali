.class public Lcom/huawei/motiondetection/motionrelay/RelayManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mRListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

.field private mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

.field private mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mContext:Landroid/content/Context;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 139
    new-instance v0, Lcom/huawei/motiondetection/motionrelay/RelayManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/motiondetection/motionrelay/RelayManager$1;-><init>(Lcom/huawei/motiondetection/motionrelay/RelayManager;)V

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 54
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mContext:Landroid/content/Context;

    .line 55
    new-instance v0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    .line 56
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    invoke-interface {v0, v1}, Lcom/huawei/motiondetection/motionrelay/IRelay;->setRelayListener(Lcom/huawei/motiondetection/motionrelay/RelayListener;)V

    .line 57
    return-void
.end method

.method static synthetic access$0(Lcom/huawei/motiondetection/motionrelay/RelayManager;ILjava/lang/Object;)V
    .locals 0

    .line 124
    invoke-direct {p0, p1, p2}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->processRecoResult(ILjava/lang/Object;)V

    return-void
.end method

.method private processRecoResult(ILjava/lang/Object;)V
    .locals 3

    .line 127
    :try_start_0
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    invoke-interface {v0, p1, p2}, Lcom/huawei/motiondetection/motionrelay/RelayListener;->notifyResult(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 130
    :catch_0
    move-exception v2

    .line 131
    const-string v0, "RelayManager"

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    invoke-interface {v0}, Lcom/huawei/motiondetection/motionrelay/IRelay;->destroy()V

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mContext:Landroid/content/Context;

    .line 102
    return-void
.end method

.method public setRelayListener(Lcom/huawei/motiondetection/motionrelay/RelayListener;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 114
    return-void
.end method

.method public startMotionRecognition(I)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    invoke-interface {v0, p1}, Lcom/huawei/motiondetection/motionrelay/IRelay;->startMotionReco(I)V

    .line 80
    return-void
.end method

.method public startMotionService()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    invoke-interface {v0}, Lcom/huawei/motiondetection/motionrelay/IRelay;->startMotionService()V

    .line 64
    return-void
.end method

.method public stopMotionRecognition(I)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    invoke-interface {v0, p1}, Lcom/huawei/motiondetection/motionrelay/IRelay;->stopMotionReco(I)V

    .line 89
    return-void
.end method

.method public stopMotionService()V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager;->mRelay:Lcom/huawei/motiondetection/motionrelay/IRelay;

    invoke-interface {v0}, Lcom/huawei/motiondetection/motionrelay/IRelay;->stopMotionService()V

    .line 71
    return-void
.end method
