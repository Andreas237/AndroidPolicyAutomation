.class Lo/crp$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field private d:Lo/crp;


# direct methods
.method public constructor <init>(Lo/crp;)V
    .locals 0

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, Lo/crp$c;->d:Lo/crp;

    .line 184
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 7

    .line 188
    iget-object v0, p0, Lo/crp$c;->d:Lo/crp;

    invoke-static {v0}, Lo/crp;->b(Lo/crp;)Lo/cqx;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqx;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v4

    .line 189
    iget-object v0, p0, Lo/crp$c;->d:Lo/crp;

    invoke-static {v0}, Lo/crp;->b(Lo/crp;)Lo/cqx;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqx;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v5

    .line 190
    if-eqz v4, :cond_0

    if-nez v5, :cond_1

    .line 191
    :cond_0
    const-string v0, "Debug_HiHealthDataPointStressMerge"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compare error input ! lhs is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " rhs is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/4 v0, 0x0

    return v0

    .line 194
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getPriority()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getPriority()I

    move-result v1

    sub-int v6, v0, v1

    .line 195
    if-eqz v6, :cond_2

    move v0, v6

    goto :goto_0

    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 178
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lo/crp$c;->b(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method
