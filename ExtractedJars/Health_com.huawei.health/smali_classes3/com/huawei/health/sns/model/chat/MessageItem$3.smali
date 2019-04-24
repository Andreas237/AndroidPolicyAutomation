.class final Lcom/huawei/health/sns/model/chat/MessageItem$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/model/chat/MessageItem;->newComparator()Ljava/util/Comparator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 968
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 2

    .line 972
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 974
    const/4 v0, -0x1

    return v0

    .line 976
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 978
    const/4 v0, 0x1

    return v0

    .line 982
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 968
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    move-object v1, p2

    check-cast v1, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem$3;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    return v0
.end method
