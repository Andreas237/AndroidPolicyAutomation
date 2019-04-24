.class Lcom/tencent/open/b/g$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/b/g;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/b/g;


# direct methods
.method constructor <init>(Lcom/tencent/open/b/g;)V
    .locals 0

    .line 618
    iput-object p1, p0, Lcom/tencent/open/b/g$5;->a:Lcom/tencent/open/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 26

    .line 623
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/tencent/open/b/g$5;->a:Lcom/tencent/open/b/g;

    invoke-virtual {v0}, Lcom/tencent/open/b/g;->d()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9

    move-result-object v11

    .line 624
    if-nez v11, :cond_0

    .line 625
    return-void

    .line 627
    :cond_0
    const-string v0, "openSDK_LOG.ReportManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->doReportVia, params: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 630
    invoke-static {}, Lcom/tencent/open/b/e;->a()I

    move-result v12

    .line 631
    const/4 v13, 0x0

    .line 632
    const/4 v14, 0x0

    .line 634
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9

    move-result-wide v15

    .line 635
    const-wide/16 v17, 0x0

    .line 636
    const-wide/16 v19, 0x0

    .line 637
    const/16 v21, 0x0

    .line 640
    :cond_1
    add-int/lit8 v13, v13, 0x1

    .line 642
    :try_start_2
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "http://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report"

    const-string v2, "POST"

    invoke-static {v0, v1, v2, v11}, Lcom/tencent/open/utils/HttpUtils;->openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/open/utils/Util$Statistic;

    move-result-object v22

    .line 644
    move-object/from16 v0, v22

    iget-object v0, v0, Lcom/tencent/open/utils/Util$Statistic;->response:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    move-result-object v23

    .line 646
    const/16 v24, 0x0

    .line 648
    const-string v0, "ret"

    move-object/from16 v1, v23

    :try_start_3
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    move-result v24

    .line 651
    goto :goto_0

    .line 649
    :catch_0
    move-exception v25

    .line 650
    const/16 v24, -0x4

    .line 653
    :goto_0
    if-eqz v24, :cond_2

    move-object/from16 v0, v22

    :try_start_4
    iget-object v0, v0, Lcom/tencent/open/utils/Util$Statistic;->response:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 655
    :cond_2
    const/4 v14, 0x1

    .line 656
    move v13, v12

    .line 659
    :cond_3
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/tencent/open/utils/Util$Statistic;->reqSize:J

    move-wide/from16 v17, v0

    .line 660
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/tencent/open/utils/Util$Statistic;->rspSize:J
    :try_end_4
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8

    move-wide/from16 v19, v0

    .line 697
    goto/16 :goto_2

    .line 662
    :catch_1
    move-exception v22

    .line 663
    :try_start_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    .line 664
    const-wide/16 v17, 0x0

    .line 665
    const-wide/16 v19, 0x0

    .line 666
    const/16 v21, -0x7

    .line 697
    goto :goto_2

    .line 667
    :catch_2
    move-exception v22

    .line 668
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    .line 669
    const-wide/16 v17, 0x0

    .line 670
    const-wide/16 v19, 0x0

    .line 671
    const/16 v21, -0x8

    .line 697
    goto :goto_2

    .line 672
    :catch_3
    move-exception v22

    .line 673
    const-wide/16 v17, 0x0

    .line 674
    const-wide/16 v19, 0x0

    .line 675
    const/16 v21, -0x4

    .line 697
    goto :goto_2

    .line 676
    :catch_4
    move-exception v22

    .line 677
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/b/g$5;->a:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 678
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "doReportVia, NetworkUnavailableException."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_9

    .line 679
    return-void

    .line 680
    :catch_5
    move-exception v22

    .line 682
    :try_start_6
    invoke-virtual/range {v22 .. v22}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http status code error:"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v23

    .line 683
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    move-result v0

    move/from16 v21, v0

    .line 685
    goto :goto_1

    .line 684
    :catch_6
    move-exception v23

    .line 687
    :goto_1
    goto :goto_3

    .line 688
    :catch_7
    move-exception v22

    .line 689
    const-wide/16 v17, 0x0

    .line 690
    const-wide/16 v19, 0x0

    .line 691
    :try_start_7
    invoke-static/range {v22 .. v22}, Lcom/tencent/open/utils/HttpUtils;->getErrorCodeFromException(Ljava/io/IOException;)I

    move-result v21

    .line 697
    goto :goto_2

    .line 692
    :catch_8
    move-exception v22

    .line 693
    const-wide/16 v17, 0x0

    .line 694
    const-wide/16 v19, 0x0

    .line 695
    const/16 v21, -0x6

    .line 696
    move v13, v12

    .line 698
    :goto_2
    if-lt v13, v12, :cond_1

    .line 700
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/b/g$5;->a:Lcom/tencent/open/b/g;

    const-string v1, "mapp_apptrace_sdk"

    move-wide v2, v15

    move-wide/from16 v4, v17

    move-wide/from16 v6, v19

    move/from16 v8, v21

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJILjava/lang/String;Z)V

    .line 701
    if-eqz v14, :cond_4

    .line 702
    invoke-static {}, Lcom/tencent/open/b/f;->a()Lcom/tencent/open/b/f;

    move-result-object v0

    const-string v1, "report_via"

    invoke-virtual {v0, v1}, Lcom/tencent/open/b/f;->b(Ljava/lang/String;)V

    goto :goto_4

    .line 704
    :cond_4
    invoke-static {}, Lcom/tencent/open/b/f;->a()Lcom/tencent/open/b/f;

    move-result-object v0

    const-string v1, "report_via"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/b/g$5;->a:Lcom/tencent/open/b/g;

    iget-object v2, v2, Lcom/tencent/open/b/g;->d:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/b/f;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 708
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/b/g$5;->a:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 709
    const-string v0, "openSDK_LOG.ReportManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->doReportVia, uploadSuccess: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_9

    .line 712
    goto :goto_5

    .line 710
    :catch_9
    move-exception v11

    .line 711
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->doReportVia, exception in serial executor."

    invoke-static {v0, v1, v11}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 713
    :goto_5
    return-void
.end method
