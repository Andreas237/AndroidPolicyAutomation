.class public Lcom/huawei/health/sns/logic/chat/task/ChatMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/logic/chat/task/ChatMessage;>;"
        }
    .end annotation
.end field


# instance fields
.field private hasMore:Z

.field private messageItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 86
    new-instance v0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    sget-object v0, Lcom/huawei/health/sns/model/chat/MessageItem;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->messageItems:Ljava/util/ArrayList;

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->hasMore:Z

    .line 84
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/logic/chat/task/ChatMessage$3;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public getMessageItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->messageItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public hasMore()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->hasMore:Z

    return v0
.end method

.method public setHasMore(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->hasMore:Z

    .line 43
    return-void
.end method

.method public setMessageItems(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 52
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->messageItems:Ljava/util/ArrayList;

    .line 53
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->messageItems:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 111
    iget-boolean v0, p0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->hasMore:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 112
    return-void
.end method
