.class final Lcom/huawei/ui/openservice/db/model/OpenService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/openservice/db/model/OpenService;->orderOpenService(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/ui/openservice/db/model/OpenService;Lcom/huawei/ui/openservice/db/model/OpenService;)I
    .locals 2

    .line 274
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getSubPosition()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getSubPosition()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 271
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    move-object v1, p2

    check-cast v1, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/openservice/db/model/OpenService$1;->compare(Lcom/huawei/ui/openservice/db/model/OpenService;Lcom/huawei/ui/openservice/db/model/OpenService;)I

    move-result v0

    return v0
.end method
