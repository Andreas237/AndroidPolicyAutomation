.class Lo/dgz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgz;->d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic k:Lo/dgz;


# direct methods
.method constructor <init>(Lo/dgz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IIJI)V
    .locals 0

    .line 698
    iput-object p1, p0, Lo/dgz$3;->k:Lo/dgz;

    iput-object p2, p0, Lo/dgz$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/dgz$3;->e:I

    iput p4, p0, Lo/dgz$3;->a:I

    iput-wide p5, p0, Lo/dgz$3;->b:J

    iput p7, p0, Lo/dgz$3;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 703
    if-nez p1, :cond_0

    .line 704
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 705
    return-void

    .line 708
    :cond_0
    move-object/from16 v4, p1

    .line 709
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 711
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 712
    return-void

    .line 714
    :cond_1
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepSummary  callback.onResponse sucess sumDataList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 718
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 720
    move-object/from16 v0, p0

    iget v6, v0, Lo/dgz$3;->e:I

    .line 721
    move-object/from16 v0, p0

    iget v7, v0, Lo/dgz$3;->a:I

    .line 723
    const/4 v0, 0x1

    if-ne v0, v6, :cond_6

    .line 724
    const/4 v8, 0x0

    .line 725
    const/4 v9, 0x0

    .line 726
    const/4 v10, 0x0

    .line 727
    const/4 v11, 0x0

    .line 728
    const/4 v12, 0x0

    .line 729
    const/4 v13, 0x0

    .line 730
    const/4 v14, 0x0

    .line 732
    const/4 v15, 0x0

    .line 733
    const-wide/16 v16, 0x0

    .line 734
    const-wide/16 v18, 0x0

    .line 735
    const/16 v20, 0x0

    .line 736
    const/16 v21, 0x0

    .line 737
    const/16 v22, 0x0

    .line 738
    const-wide/16 v23, 0x0

    .line 740
    new-instance v25, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct/range {v25 .. v25}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 742
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_0
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lcom/huawei/hihealth/HiHealthData;

    .line 743
    const-string v0, "core_sleep_deep_key"

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    .line 744
    const-string v0, "core_sleep_shallow_key"

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 745
    const-string v0, "core_sleep_wake_key"

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v14, v0

    .line 746
    const-string v0, "core_sleep_wake_count_key"

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v12, v0

    .line 747
    goto :goto_0

    .line 749
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lcom/huawei/hihealth/HiHealthData;

    .line 750
    const-string v0, "core_sleep_wake_dream_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v10, v0, 0x0

    .line 751
    const-string v0, "core_sleep_day_sleep_time_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v11, v0, 0x0

    .line 752
    const-string v0, "core_sleep_score_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 753
    const-string v0, "core_sleep_fall_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v16

    .line 754
    const-string v0, "core_sleep_wake_up_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    .line 755
    const-string v0, "core_sleep_snore_freq_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 756
    const-string v0, "core_sleep_deep_sleep_part_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 757
    const-string v0, "core_sleep_total_sleep_time_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 758
    const-string v0, "core_sleep_valid_data_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v23

    .line 760
    if-gtz v9, :cond_3

    if-gtz v8, :cond_3

    if-gtz v10, :cond_3

    if-lez v11, :cond_4

    .line 761
    :cond_3
    move-object/from16 v0, v25

    invoke-virtual {v0, v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 762
    move-object/from16 v0, v25

    invoke-virtual {v0, v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 763
    move-object/from16 v0, v25

    invoke-virtual {v0, v14}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 764
    move-object/from16 v0, v25

    invoke-virtual {v0, v10}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumberSleepTime(I)V

    .line 765
    move-object/from16 v0, v25

    invoke-virtual {v0, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setNoonSleepTime(I)V

    .line 766
    move-object/from16 v0, v25

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 767
    move-object/from16 v0, v25

    invoke-virtual {v0, v15}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setScore(I)V

    .line 768
    move-wide/from16 v0, v16

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setFallTime(I)V

    .line 769
    move-wide/from16 v0, v18

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeUpTime(I)V

    .line 770
    move-object/from16 v0, v25

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSnoreFreq(I)V

    .line 771
    move-object/from16 v0, v25

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepPart(I)V

    .line 772
    move-object/from16 v0, v25

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setTotalSleepTime(I)V

    .line 773
    move-object/from16 v0, v25

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 774
    move-object/from16 v0, v25

    move-wide/from16 v1, v23

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setValidData(D)V

    goto/16 :goto_2

    .line 777
    :cond_4
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_1
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Lcom/huawei/hihealth/HiHealthData;

    .line 778
    const-string v0, "sleep_deep_key"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    .line 779
    const-string v0, "sleep_shallow_key"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 780
    const-string v0, "sleep_wake_key"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v13, v0

    .line 781
    const-string v0, "sleep_wake_count_key"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v12, v0

    .line 782
    goto :goto_1

    .line 783
    :cond_5
    const-string v0, "common_sleep_duration_sleep_sum_key"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 784
    div-int/lit8 v0, v8, 0x3c

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 785
    div-int/lit8 v0, v9, 0x3c

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 786
    div-int/lit8 v0, v13, 0x3c

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 787
    move-object/from16 v0, v25

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 788
    div-int/lit8 v0, v22, 0x3c

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setTotalSleepTime(I)V

    .line 789
    move-object/from16 v0, v25

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 792
    :goto_2
    move-object/from16 v0, v25

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 794
    goto/16 :goto_7

    .line 797
    :cond_6
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v6, :cond_d

    .line 798
    new-instance v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 799
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 800
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v12

    .line 803
    const-wide/16 v0, 0x3e8

    div-long v0, v12, v0

    move-object/from16 v2, p0

    iget-wide v2, v2, Lo/dgz$3;->b:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    int-to-long v2, v7

    div-long/2addr v0, v2

    long-to-int v14, v0

    .line 805
    move-object/from16 v0, p0

    iget v0, v0, Lo/dgz$3;->d:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_8

    .line 806
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/dgz$3;->b:J

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v15

    .line 807
    const-wide/16 v0, 0x3e8

    div-long v0, v12, v0

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v16

    .line 809
    move/from16 v0, v16

    if-ge v0, v15, :cond_7

    .line 810
    add-int/lit8 v0, v16, 0xc

    sub-int v14, v0, v15

    goto :goto_5

    .line 812
    :cond_7
    sub-int v14, v16, v15

    .line 816
    :cond_8
    :goto_5
    if-ne v14, v8, :cond_b

    .line 817
    const-string v0, "core_sleep_shallow_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 818
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 819
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v17

    .line 820
    const-string v0, "core_sleep_day_sleep_time_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 821
    const-string v0, "core_sleep_wake_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v19

    .line 822
    if-gtz v15, :cond_9

    if-gtz v16, :cond_9

    if-gtz v17, :cond_9

    if-lez v18, :cond_a

    .line 824
    :cond_9
    invoke-virtual {v9, v15}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 828
    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 832
    move/from16 v0, v17

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumberSleepTime(I)V

    .line 835
    move/from16 v0, v19

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 839
    move/from16 v0, v18

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setNoonSleepTime(I)V

    .line 842
    const-string v0, "core_sleep_wake_count_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 843
    move/from16 v0, v20

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 847
    const-string v0, "core_sleep_score_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 848
    move/from16 v0, v21

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setScore(I)V

    .line 851
    const-string v0, "core_sleep_snore_freq_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 852
    move/from16 v0, v22

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSnoreFreq(I)V

    .line 855
    const-string v0, "core_sleep_deep_sleep_part_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v23

    .line 856
    move/from16 v0, v23

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepPart(I)V

    .line 859
    const-string v0, "core_sleep_total_sleep_time_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v24

    .line 860
    move/from16 v0, v24

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setTotalSleepTime(I)V

    .line 864
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v25

    .line 865
    move-wide/from16 v0, v25

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setFallTime(I)V

    .line 868
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v27

    .line 869
    move-wide/from16 v0, v27

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeUpTime(I)V

    .line 872
    const/16 v0, 0x1f

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 873
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSleepDayTime(J)V

    .line 874
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v29

    .line 875
    move-wide/from16 v0, v29

    double-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setCoreSleepWakeupTime(J)V

    .line 876
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v31

    .line 877
    move-wide/from16 v0, v31

    double-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setCoreSleepFallTime(J)V

    .line 879
    goto :goto_6

    .line 881
    :cond_a
    const-string v0, "sleep_deep_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 882
    div-int/lit8 v0, v20, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 884
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 885
    div-int/lit8 v0, v21, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 887
    const-string v0, "sleep_wake_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 888
    div-int/lit8 v0, v22, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 890
    const-string v0, "sleep_wake_count_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v23

    .line 891
    move/from16 v0, v23

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 893
    const/16 v0, 0x1e

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 896
    :cond_b
    :goto_6
    goto/16 :goto_4

    .line 897
    :cond_c
    invoke-static {}, Lo/dgz;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepSummary  sleepTotal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 898
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 797
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    .line 903
    :cond_d
    :goto_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 904
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepSummary  callback.onResponse sucess sleepTotalDatas.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 908
    :cond_e
    return-void
.end method
