.class final Lo/xr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/xr;->d(Landroid/content/Context;)Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/xr$3;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/bone/social/manager/db/SocialRankingTable;Lcom/huawei/bone/social/manager/db/SocialRankingTable;)I
    .locals 6

    .line 78
    invoke-virtual {p1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v2

    .line 79
    invoke-virtual {p2}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v3

    .line 80
    const-string v4, ""

    .line 81
    const-string v5, ""

    .line 84
    invoke-virtual {p1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 86
    invoke-virtual {p2}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 89
    :cond_0
    if-ne v2, v3, :cond_1

    .line 90
    iget-object v0, p0, Lo/xr$3;->c:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/xs;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/xr$3;->c:Landroid/content/Context;

    invoke-static {v1, v5}, Lo/xs;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 93
    :cond_1
    sub-int v0, v3, v2

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 73
    move-object v0, p1

    check-cast v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    move-object v1, p2

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {p0, v0, v1}, Lo/xr$3;->b(Lcom/huawei/bone/social/manager/db/SocialRankingTable;Lcom/huawei/bone/social/manager/db/SocialRankingTable;)I

    move-result v0

    return v0
.end method
