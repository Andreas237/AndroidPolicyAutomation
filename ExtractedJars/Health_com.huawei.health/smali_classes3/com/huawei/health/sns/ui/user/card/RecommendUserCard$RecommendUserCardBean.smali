.class public Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;
.super Lcom/huawei/health/sns/model/user/User;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RecommendUserCardBean"
.end annotation


# instance fields
.field private recommendUserList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 192
    invoke-direct {p0}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 197
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->recommendUserList:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->recommendUserList:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 207
    invoke-super {p0, p1}, Lcom/huawei/health/sns/model/user/User;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 213
    invoke-super {p0}, Lcom/huawei/health/sns/model/user/User;->hashCode()I

    move-result v0

    return v0
.end method

.method public setRecommendUserList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 201
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->recommendUserList:Ljava/util/List;

    .line 202
    return-void
.end method
