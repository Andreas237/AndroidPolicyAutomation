.class public Lo/bfg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/util/ArrayList;)[Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)[Ljava/lang/String;"
        }
    .end annotation

    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz p0, :cond_0

    .line 34
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 35
    new-array v2, v1, [Ljava/lang/String;

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 39
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    .line 40
    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v4

    .line 37
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 43
    :cond_0
    return-object v2
.end method
