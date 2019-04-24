.class final Lcom/huawei/health/sns/model/assistant/AssistantSearchBean$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;
    .locals 1

    .line 165
    new-array v0, p1, [Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;
    .locals 1

    .line 159
    new-instance v0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    invoke-direct {v0, p1}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 154
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean$1;->c(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 154
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean$1;->b(I)[Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    move-result-object v0

    return-object v0
.end method
