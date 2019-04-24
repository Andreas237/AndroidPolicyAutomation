.class Lo/exy$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exy;->e(Landroid/content/Context;JJIFLo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exy;

.field final synthetic b:Lo/ekr;

.field final synthetic e:F


# direct methods
.method constructor <init>(Lo/exy;Lo/ekr;F)V
    .locals 0

    .line 755
    iput-object p1, p0, Lo/exy$10;->a:Lo/exy;

    iput-object p2, p0, Lo/exy$10;->b:Lo/ekr;

    iput p3, p0, Lo/exy$10;->e:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 759
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 760
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$10;->b:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 761
    return-void

    .line 763
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 764
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$10;->b:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 766
    return-void

    .line 769
    :cond_1
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 770
    if-nez v4, :cond_2

    .line 771
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 773
    :cond_2
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 775
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 776
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "one day stat not size 1,logic error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 779
    :cond_3
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 783
    const/4 v7, 0x0

    .line 785
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 786
    const-string v0, "content"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 787
    goto :goto_0

    .line 789
    :cond_4
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v10

    .line 791
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$10;->a:Lo/exy;

    invoke-static {v0, v10, v11}, Lo/exy;->a(Lo/exy;J)Ljava/util/Calendar;

    move-result-object v12

    .line 792
    const/4 v13, 0x0

    .line 793
    const/4 v14, 0x0

    .line 795
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 796
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/ehz;

    .line 797
    invoke-virtual {v13}, Lo/ehz;->c()F

    move-result v14

    goto :goto_1

    .line 799
    :cond_5
    new-instance v13, Lo/ehz;

    const/4 v0, 0x0

    invoke-direct {v13, v0}, Lo/ehz;-><init>(F)V

    .line 802
    :goto_1
    const-string v0, "content"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/exy$10;->e:F

    mul-float/2addr v0, v1

    add-float/2addr v0, v14

    invoke-virtual {v13, v0}, Lo/ehz;->e(F)V

    .line 803
    const-string v0, "content"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/exy$10;->e:F

    mul-float/2addr v0, v1

    add-float/2addr v7, v0

    .line 805
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 806
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v15

    .line 807
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    invoke-virtual {v13}, Lo/ehz;->c()F

    move-result v1

    invoke-virtual {v13, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 809
    const/16 v0, 0x4e22

    if-ne v15, v0, :cond_6

    .line 810
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    sget-object v1, Lo/eiv;->b:Lo/eiv;

    invoke-virtual {v13, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    const-string v2, "content"

    invoke-virtual {v9, v2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/exy$10;->e:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v13, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    goto :goto_2

    .line 811
    :cond_6
    const/16 v0, 0x4e23

    if-ne v15, v0, :cond_7

    .line 812
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    invoke-virtual {v13, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    const-string v2, "content"

    invoke-virtual {v9, v2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/exy$10;->e:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v13, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    goto :goto_2

    .line 813
    :cond_7
    const/16 v0, 0x4e25

    if-ne v15, v0, :cond_8

    .line 814
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    sget-object v1, Lo/eiv;->c:Lo/eiv;

    invoke-virtual {v13, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    const-string v2, "content"

    invoke-virtual {v9, v2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/exy$10;->e:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v13, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    goto :goto_2

    .line 815
    :cond_8
    const/16 v0, 0x4e24

    if-ne v15, v0, :cond_9

    .line 816
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    invoke-virtual {v13, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    const-string v2, "content"

    invoke-virtual {v9, v2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/exy$10;->e:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v13, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 818
    :cond_9
    :goto_2
    goto/16 :goto_0

    .line 820
    :cond_a
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 821
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$10;->a:Lo/exy;

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/exy;->d(Lo/exy;J)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/ehz;

    .line 822
    if-nez v9, :cond_b

    .line 823
    new-instance v9, Lo/ehz;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Lo/ehz;-><init>(F)V

    .line 824
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$10;->a:Lo/exy;

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/exy;->d(Lo/exy;J)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    :cond_b
    const-string v0, "sum"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/exy$10;->e:F

    mul-float/2addr v0, v1

    sub-float v10, v0, v7

    .line 830
    const/4 v0, 0x0

    cmpl-float v0, v10, v0

    if-ltz v0, :cond_c

    .line 832
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    sget-object v1, Lo/eiv;->d:Lo/eiv;

    invoke-virtual {v9, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    add-float/2addr v1, v10

    invoke-virtual {v9, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 836
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$10;->b:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 837
    return-void
.end method
