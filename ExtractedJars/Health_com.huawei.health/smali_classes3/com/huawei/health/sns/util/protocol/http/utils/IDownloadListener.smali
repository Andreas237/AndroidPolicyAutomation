.class public interface abstract Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CANCEL_ERROR:I = 0x2

.field public static final NETWORK_ERROR:I = 0x1

.field public static final OTHER_ERROR:I = -0x1

.field public static final PERMISSION_ERROR:I = 0x4

.field public static final RESULT_ERROR:I = 0x3


# virtual methods
.method public abstract onCanceled()V
.end method

.method public abstract onCompleted(Ljava/lang/String;)V
.end method

.method public abstract onFailed(Ljava/lang/String;I)V
.end method

.method public abstract onProgressChanged(I)V
.end method

.method public abstract onStarted()V
.end method
