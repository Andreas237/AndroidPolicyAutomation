.class final Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/logic/chat/task/ChatMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/logic/chat/task/ChatMessage;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/health/sns/logic/chat/task/ChatMessage;
    .locals 1

    .line 97
    new-array v0, p1, [Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 87
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;->e(Landroid/os/Parcel;)Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/health/sns/logic/chat/task/ChatMessage;
    .locals 2

    .line 91
    new-instance v0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;-><init>(Landroid/os/Parcel;Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 87
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;->c(I)[Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    move-result-object v0

    return-object v0
.end method
