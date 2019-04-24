.class public Lo/bht$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bht;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 973
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 976
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 977
    move-object v5, p2

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 978
    if-eqz v4, :cond_0

    if-nez v5, :cond_1

    .line 979
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 981
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDuration()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDuration()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
