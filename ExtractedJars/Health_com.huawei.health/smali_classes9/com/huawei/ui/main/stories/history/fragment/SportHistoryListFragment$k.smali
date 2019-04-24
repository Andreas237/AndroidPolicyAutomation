.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1686
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(IJJLcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V
    .locals 12

    .line 1737
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMothData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1740
    const/4 v8, 0x2

    new-array v8, v8, [I

    fill-array-data v8, :array_0

    .line 1742
    if-nez p1, :cond_1

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1744
    new-instance v9, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    const/4 v0, 0x2

    move-object/from16 v1, p6

    invoke-direct {v9, v8, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;-><init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 1745
    new-instance v10, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x0

    invoke-direct {v10, v0, v9}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1746
    new-instance v11, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x1

    invoke-direct {v11, v0, v9}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1749
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, p2

    move-wide/from16 v3, p4

    move v6, p1

    move-object v7, v10

    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->b(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1751
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquire data form health platform"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1754
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1755
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-wide v1, p2

    move-wide/from16 v3, p4

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Lo/brt;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1757
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquire data form fitness "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1760
    :cond_0
    goto :goto_0

    :cond_1
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_2

    .line 1763
    new-instance v9, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    const/4 v0, 0x1

    move-object/from16 v1, p6

    invoke-direct {v9, v8, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;-><init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 1764
    new-instance v10, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x1

    invoke-direct {v10, v0, v9}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1765
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-wide v1, p2

    move-wide/from16 v3, p4

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/brt;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1767
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquire data form fitness 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1768
    goto :goto_0

    .line 1770
    :cond_2
    new-instance v9, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    const/4 v0, 0x1

    move-object/from16 v1, p6

    invoke-direct {v9, v8, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;-><init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 1771
    new-instance v10, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x0

    invoke-direct {v10, v0, v9}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1773
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, p2

    move-wide/from16 v3, p4

    move v6, p1

    move-object v7, v10

    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->b(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1775
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquire data form health platform 2 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1778
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public c(IJJLcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V
    .locals 11

    .line 1694
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDetailSportData start "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1696
    const/4 v7, 0x2

    new-array v7, v7, [I

    fill-array-data v7, :array_0

    .line 1697
    if-nez p1, :cond_0

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1699
    new-instance v8, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    const/4 v0, 0x2

    move-object/from16 v1, p6

    invoke-direct {v8, v7, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;-><init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 1700
    new-instance v9, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1701
    new-instance v10, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x1

    invoke-direct {v10, v0, v8}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1704
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, p2

    move-wide v3, p4

    move v5, p1

    move-object v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->a(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1705
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDetailSportData form health platform"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1709
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-wide v1, p2

    move-wide v3, p4

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/brt;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1710
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDetailSportData from suggestion db"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1713
    goto :goto_0

    :cond_0
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_1

    .line 1715
    new-instance v8, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    const/4 v0, 0x1

    move-object/from16 v1, p6

    invoke-direct {v8, v7, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;-><init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 1716
    new-instance v9, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x1

    invoke-direct {v9, v0, v8}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1718
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-wide v1, p2

    move-wide v3, p4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lo/brt;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1719
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDetailSportData from suggestion db"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1720
    goto :goto_0

    .line 1721
    :cond_1
    new-instance v8, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    const/4 v0, 0x1

    move-object/from16 v1, p6

    invoke-direct {v8, v7, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;-><init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 1722
    new-instance v9, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;-><init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V

    .line 1724
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, p2

    move-wide v3, p4

    move v5, p1

    move-object v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->a(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1725
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDetailSportData form health platform"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1731
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method
