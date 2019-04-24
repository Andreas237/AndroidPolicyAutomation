.class public Lcom/huawei/openalliance/ad/inter/HiAdSplash$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/inter/HiAdSplash;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public b(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/openalliance/ad/k/h;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
