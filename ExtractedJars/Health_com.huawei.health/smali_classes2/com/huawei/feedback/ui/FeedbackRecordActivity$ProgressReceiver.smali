.class public Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 1569
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Intent;)Ljava/lang/String;
    .locals 5

    .line 1572
    const/4 v3, 0x0

    .line 1574
    const-string v0, "extraValue"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 1577
    goto :goto_0

    .line 1575
    :catch_0
    move-exception v4

    .line 1576
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "extraValue exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1578
    :goto_0
    return-object v3
.end method

.method private b(Landroid/content/Intent;)Landroid/os/Parcelable;
    .locals 5

    .line 1582
    const/4 v3, 0x0

    .line 1584
    const-string v0, "mLogUploadInfo"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 1587
    goto :goto_0

    .line 1585
    :catch_0
    move-exception v4

    .line 1586
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parcel exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1589
    :goto_0
    return-object v3
.end method

.method private c(Landroid/content/Intent;)Ljava/lang/String;
    .locals 5

    .line 1593
    const-string v3, ""

    .line 1595
    const-string v0, "exception"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 1598
    goto :goto_0

    .line 1596
    :catch_0
    move-exception v4

    .line 1597
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1600
    :goto_0
    return-object v3
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 21

    .line 1606
    if-nez p2, :cond_0

    .line 1607
    return-void

    .line 1609
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 1610
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->b(Landroid/content/Intent;)Landroid/os/Parcelable;

    move-result-object v6

    .line 1612
    const/4 v7, 0x0

    .line 1613
    if-eqz v6, :cond_1

    instance-of v0, v6, Lcom/huawei/logupload/LogUpload;

    if-eqz v0, :cond_1

    .line 1614
    move-object v7, v6

    check-cast v7, Lcom/huawei/logupload/LogUpload;

    .line 1618
    :cond_1
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1620
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->c(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v8

    .line 1623
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 1624
    const-string v0, "1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1625
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1627
    const/4 v9, 0x0

    .line 1628
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1630
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 1633
    goto :goto_0

    .line 1631
    :catch_0
    move-exception v10

    .line 1632
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ProgressReceiver RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1636
    :cond_2
    :goto_0
    if-eqz v9, :cond_a

    .line 1638
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/logupload/LogUpload;

    .line 1640
    invoke-static {}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1641
    const-string v0, "1"

    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1642
    const-string v0, "2"

    invoke-virtual {v11, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 1646
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0, v11}, Lcom/huawei/logupload/a;->a(Lcom/huawei/logupload/LogUpload;)Z

    move-result v12

    .line 1647
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateStatus flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1649
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/feedback/bean/f;

    .line 1656
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1657
    goto :goto_2

    .line 1665
    :cond_3
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    .line 1666
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v2

    .line 1665
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    .line 1667
    const/4 v0, 0x2

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 1670
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v15

    .line 1671
    .line 1672
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v17

    .line 1673
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1675
    const-string v0, ","

    .line 1676
    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    .line 1680
    move-object/from16 v0, v18

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_4

    const/4 v0, 0x1

    aget-object v0, v18, v0

    .line 1682
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1683
    const/4 v0, 0x1

    aget-object v0, v18, v0

    const/4 v1, 0x1

    aget-object v1, v18, v1

    .line 1685
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1684
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v17

    .line 1690
    :cond_4
    goto :goto_3

    .line 1691
    :cond_5
    const-string v17, "0"

    .line 1695
    .line 1696
    :goto_3
    :try_start_2
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v18

    .line 1702
    const-wide/16 v0, 0x0

    cmp-long v0, v15, v0

    if-lez v0, :cond_6

    .line 1703
    move/from16 v0, v18

    int-to-float v0, v0

    move-wide v1, v15

    long-to-float v1, v1

    div-float v19, v0, v1

    .line 1705
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v0, v0, v19

    float-to-int v1, v0

    move/from16 v20, v1

    .line 1706
    .line 1707
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1708
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v3, "feedback_advanced_loguploading"

    .line 1710
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1709
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v4, v20

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1707
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1706
    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/f;->c(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_3

    .line 1722
    :cond_6
    goto :goto_4

    .line 1719
    :catch_1
    move-exception v18

    .line 1720
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ProgressReceiver NumberFormatException"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1727
    :goto_4
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/f;->d(Ljava/lang/String;)V

    .line 1728
    invoke-static {v14}, Lcom/huawei/feedback/logic/f;->c(Lcom/huawei/feedback/bean/f;)V

    .line 1732
    :cond_7
    goto/16 :goto_2

    .line 1733
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;

    invoke-direct {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1739
    goto :goto_5

    .line 1734
    :catch_2
    move-exception v13

    .line 1735
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "Arrays sort IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1739
    goto :goto_5

    .line 1737
    :catch_3
    move-exception v13

    .line 1738
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "RemoteException e"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1743
    :cond_9
    :goto_5
    goto/16 :goto_1

    .line 1745
    :cond_a
    goto/16 :goto_11

    :cond_b
    const-string v0, "2"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    if-eqz v7, :cond_1f

    .line 1747
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1751
    const/4 v9, 0x0

    .line 1752
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 1754
    move-object/from16 v0, p0

    :try_start_4
    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v0

    move-object v9, v0

    .line 1757
    goto :goto_6

    .line 1755
    :catch_4
    move-exception v10

    .line 1756
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "FeedbackConstData.SINGLE_TASK RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1759
    :cond_c
    :goto_6
    if-eqz v9, :cond_10

    .line 1760
    const/4 v10, 0x0

    .line 1761
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/logupload/LogUpload;

    .line 1762
    invoke-virtual {v12}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_d

    .line 1763
    const/4 v10, 0x1

    .line 1764
    goto :goto_8

    .line 1766
    :cond_d
    goto :goto_7

    .line 1767
    :cond_e
    :goto_8
    if-nez v10, :cond_f

    .line 1768
    return-void

    .line 1771
    :cond_f
    goto :goto_9

    .line 1772
    :cond_10
    return-void

    .line 1776
    :goto_9
    invoke-static {}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1778
    const-string v0, "2"

    invoke-virtual {v7, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 1782
    move-object/from16 v0, p0

    :try_start_5
    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/huawei/logupload/a;->a(Lcom/huawei/logupload/LogUpload;)Z

    move-result v10

    .line 1783
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateStatus flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1785
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/feedback/bean/f;

    .line 1791
    invoke-virtual {v12}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1792
    goto :goto_a

    .line 1799
    :cond_11
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-virtual {v12}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_15

    .line 1800
    const/4 v0, 0x2

    invoke-virtual {v12, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 1802
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v13

    .line 1803
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v15

    .line 1804
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 1806
    const-string v0, ","

    invoke-virtual {v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v16

    .line 1809
    move-object/from16 v0, v16

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_12

    const/4 v0, 0x1

    aget-object v0, v16, v0

    .line 1810
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 1811
    const/4 v0, 0x1

    aget-object v0, v16, v0

    const/4 v1, 0x1

    aget-object v1, v16, v1

    .line 1812
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1811
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_7

    move-result-object v15

    .line 1817
    :cond_12
    goto :goto_b

    .line 1818
    :cond_13
    const-string v15, "0"

    .line 1821
    :goto_b
    :try_start_6
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v16

    .line 1825
    const-wide/16 v0, 0x0

    cmp-long v0, v13, v0

    if-lez v0, :cond_14

    .line 1826
    move/from16 v0, v16

    int-to-float v0, v0

    long-to-float v1, v13

    div-float v17, v0, v1

    .line 1827
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v0, v0, v17

    float-to-int v1, v0

    move/from16 v18, v1

    .line 1828
    .line 1829
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1830
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v3, "feedback_advanced_loguploading"

    .line 1832
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1830
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v4, v18

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1828
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/feedback/bean/f;->c(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_7

    .line 1840
    :cond_14
    goto :goto_c

    .line 1837
    :catch_5
    move-exception v16

    .line 1838
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "FeedbackConstData.SINGLE_TASK NumberFormatException"

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1842
    :goto_c
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/feedback/bean/f;->d(Ljava/lang/String;)V

    .line 1843
    invoke-static {v12}, Lcom/huawei/feedback/logic/f;->c(Lcom/huawei/feedback/bean/f;)V

    .line 1847
    :cond_15
    goto/16 :goto_a

    .line 1848
    :cond_16
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;

    invoke-direct {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1854
    goto :goto_d

    .line 1849
    :catch_6
    move-exception v11

    .line 1850
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "Arrays sort IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1854
    goto :goto_d

    .line 1851
    :catch_7
    move-exception v11

    .line 1852
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "FeedbackConstData.SINGLE_TASK RemoteException e"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1857
    :cond_17
    :goto_d
    goto/16 :goto_11

    .line 1860
    :cond_18
    if-eqz v7, :cond_1f

    .line 1861
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ProgressReceiver onReceive"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1864
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getId() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1865
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getTaskId() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1867
    invoke-static {}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 1869
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1f

    .line 1871
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/feedback/bean/f;

    .line 1876
    invoke-virtual {v10}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1877
    goto :goto_e

    .line 1883
    :cond_19
    invoke-virtual {v10}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 1885
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    cmp-long v0, v0, v11

    if-nez v0, :cond_1e

    .line 1886
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v13

    .line 1887
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v14

    .line 1888
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1b

    .line 1890
    const-string v0, ","

    invoke-virtual {v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v16

    .line 1893
    move-object/from16 v0, v16

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1a

    const/4 v0, 0x1

    aget-object v0, v16, v0

    .line 1894
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 1895
    const/4 v0, 0x1

    aget-object v0, v16, v0

    const/4 v1, 0x1

    aget-object v1, v16, v1

    .line 1896
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1895
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    .line 1899
    :cond_1a
    goto :goto_f

    .line 1900
    :cond_1b
    const-string v13, "0"

    .line 1903
    :goto_f
    :try_start_8
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v16

    .line 1907
    const-wide/16 v0, 0x0

    cmp-long v0, v14, v0

    if-lez v0, :cond_1c

    .line 1908
    move/from16 v0, v16

    int-to-float v0, v0

    long-to-float v1, v14

    div-float v17, v0, v1

    .line 1909
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v0, v0, v17

    float-to-int v1, v0

    move/from16 v18, v1

    .line 1911
    .line 1913
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1914
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v3, "feedback_advanced_loguploading"

    .line 1916
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1914
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v4, v18

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1912
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/feedback/bean/f;->c(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1928
    :cond_1c
    goto :goto_10

    .line 1925
    :catch_8
    move-exception v16

    .line 1926
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "mLogUploadInfo != null NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1930
    :goto_10
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v16

    .line 1933
    const-string v0, "2"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    if-nez v16, :cond_1d

    .line 1938
    const-string v0, "0"

    invoke-virtual {v7, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 1940
    :cond_1d
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/feedback/bean/f;->d(Ljava/lang/String;)V

    .line 1941
    const/4 v0, 0x5

    invoke-virtual {v10, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 1946
    :cond_1e
    goto/16 :goto_e

    .line 1951
    :cond_1f
    :goto_11
    goto/16 :goto_13

    .line 1954
    :cond_20
    const-string v0, "com.example.logupload.progressSmall"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    if-eqz v7, :cond_23

    .line 1960
    invoke-static {}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 1962
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/feedback/bean/f;

    .line 1967
    invoke-virtual {v9}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 1968
    goto :goto_12

    .line 1978
    :cond_21
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-virtual {v9}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_22

    .line 1983
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 1985
    move-object/from16 v0, p0

    :try_start_9
    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;

    invoke-direct {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_9} :catch_9

    .line 1988
    goto :goto_13

    .line 1986
    :catch_9
    move-exception v10

    .line 1987
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "Arrays sort IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1990
    goto :goto_13

    .line 1992
    :cond_22
    goto :goto_12

    .line 1997
    :cond_23
    :goto_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 1999
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 2003
    :cond_24
    const/4 v8, 0x0

    .line 2004
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->q(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)I

    move-result v8

    .line 2005
    if-lez v8, :cond_25

    .line 2007
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)V

    .line 2011
    :cond_25
    return-void
.end method
