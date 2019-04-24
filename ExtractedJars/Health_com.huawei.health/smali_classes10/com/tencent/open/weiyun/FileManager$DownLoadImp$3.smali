.class Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->doDownload()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 26

    .line 705
    new-instance v5, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v5}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 706
    const/16 v0, 0x3a98

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 707
    const/16 v0, 0x4e20

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 709
    sget-object v0, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 710
    const-string v0, "UTF-8"

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 711
    const-string v0, "TX_QQF_ANDROID"

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 713
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2000(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1900(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/ftn_handler/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1600(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 715
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 716
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 718
    :cond_0
    new-instance v7, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v7, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 719
    const/4 v8, 0x0

    .line 721
    new-instance v9, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2300(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 722
    const/4 v10, 0x0

    .line 726
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v10, v0

    .line 733
    goto :goto_0

    .line 727
    :catch_0
    move-exception v11

    .line 728
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v12

    .line 729
    const/4 v0, -0x2

    iput v0, v12, Landroid/os/Message;->what:I

    .line 730
    invoke-virtual {v11}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v12, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 731
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 833
    nop

    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    nop

    .line 841
    .line 842
    .line 843
    .line 844
    .line 844
    return-void

    .line 735
    :goto_0
    const/high16 v0, 0x40000

    :try_start_2
    new-array v11, v0, [B

    .line 737
    const-wide/16 v12, 0x0

    .line 738
    const-wide/16 v16, 0x0

    .line 739
    const/16 v18, 0x0

    .line 740
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2600(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 741
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v0

    const-wide/32 v2, 0x40000

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const-wide/32 v14, 0x40000

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v14

    .line 742
    :goto_1
    add-long v16, v12, v14

    .line 743
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v0

    cmp-long v0, v16, v0

    if-gtz v0, :cond_d

    .line 744
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    move-object v1, v6

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    move-object/from16 v19, v0

    .line 745
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 746
    const-string v0, "Host"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2000(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    const-string v0, "Cookie"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1700(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1800(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 749
    const-string v0, "Pragma"

    const-string v1, "no-cache"

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 750
    const-string v0, "RANGE"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v16

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 751
    const/16 v20, 0x0

    .line 753
    move-object/from16 v0, v19

    :try_start_3
    invoke-interface {v7, v0}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v21

    .line 754
    const-string v0, "weiyun_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadFileToWeiyun doDownloadPic response:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    invoke-interface/range {v21 .. v21}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v22

    .line 758
    invoke-interface/range {v22 .. v22}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v20

    .line 759
    move/from16 v0, v20

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_2

    move/from16 v0, v20

    const/16 v1, 0xce

    if-ne v0, v1, :cond_4

    .line 760
    :cond_2
    invoke-interface/range {v21 .. v21}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 761
    const/16 v23, 0x0

    .line 762
    :goto_3
    invoke-virtual {v8, v11}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v23, v0

    if-lez v0, :cond_3

    .line 763
    const/4 v0, 0x0

    move/from16 v1, v23

    invoke-virtual {v10, v11, v0, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 764
    move/from16 v0, v23

    int-to-long v0, v0

    add-long/2addr v0, v12

    move-wide v12, v0

    goto :goto_3

    .line 766
    :cond_3
    goto :goto_4

    .line 767
    :cond_4
    goto/16 :goto_a

    .line 781
    :goto_4
    goto :goto_5

    .line 769
    :catch_1
    move-exception v21

    .line 770
    add-int/lit8 v18, v18, 0x1

    .line 771
    move/from16 v0, v18

    const/16 v1, 0xa

    if-le v0, v1, :cond_5

    .line 772
    :try_start_4
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Exception;->printStackTrace()V

    .line 773
    const-string v0, "weiyun_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadFileToWeiyun doDownloadPic error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 775
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v22

    .line 776
    const/4 v0, -0x2

    move-object/from16 v1, v22

    iput v0, v1, Landroid/os/Message;->what:I

    .line 777
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 778
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 779
    goto/16 :goto_a

    .line 782
    :cond_5
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v0

    sub-long v0, v0, v16

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_6

    .line 783
    goto/16 :goto_a

    .line 785
    :cond_6
    move-wide/from16 v16, v12

    .line 786
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v0

    sub-long v0, v0, v16

    const-wide/32 v2, 0x40000

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    const-wide/32 v14, 0x40000

    goto :goto_6

    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v0

    sub-long v14, v0, v16

    .line 787
    :goto_6
    add-long v16, v16, v14

    .line 788
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v21

    .line 789
    const/4 v0, 0x1

    move-object/from16 v1, v21

    iput v0, v1, Landroid/os/Message;->what:I

    .line 790
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v1, 0x64

    mul-long v1, v1, v16

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v3}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileSize()J

    move-result-wide v3

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 791
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 793
    goto/16 :goto_2

    .line 795
    :cond_8
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    move-object v1, v6

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    move-object/from16 v19, v0

    .line 796
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 797
    const-string v0, "Host"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2000(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 798
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    const-string v0, "Cookie"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1700(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1800(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 800
    const-string v0, "Pragma"

    const-string v1, "no-cache"

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 801
    const/16 v20, 0x0

    .line 803
    move-object/from16 v0, v19

    :try_start_5
    invoke-interface {v7, v0}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v21

    .line 804
    const-string v0, "weiyun_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadFileToWeiyun doDownloadPic response:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    invoke-interface/range {v21 .. v21}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v22

    .line 808
    invoke-interface/range {v22 .. v22}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v20

    .line 809
    move/from16 v0, v20

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_9

    move/from16 v0, v20

    const/16 v1, 0xce

    if-ne v0, v1, :cond_a

    .line 810
    :cond_9
    invoke-interface/range {v21 .. v21}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 811
    const/16 v23, 0x0

    .line 812
    :goto_7
    invoke-virtual {v8, v11}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v23, v0

    if-lez v0, :cond_a

    .line 813
    const/4 v0, 0x0

    move/from16 v1, v23

    invoke-virtual {v10, v11, v0, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    .line 826
    :cond_a
    goto :goto_a

    .line 816
    :catch_2
    move-exception v21

    .line 817
    :try_start_6
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Exception;->printStackTrace()V

    .line 818
    const-string v0, "weiyun_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadFileToWeiyun doDownloadPic error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v22

    .line 821
    const/4 v0, -0x2

    move-object/from16 v1, v22

    iput v0, v1, Landroid/os/Message;->what:I

    .line 822
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 823
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 833
    if-eqz v10, :cond_b

    .line 835
    :try_start_7
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 838
    goto :goto_8

    .line 836
    :catch_3
    move-exception v23

    .line 837
    invoke-virtual/range {v23 .. v23}, Ljava/io/IOException;->printStackTrace()V

    .line 839
    :cond_b
    :goto_8
    if-eqz v8, :cond_c

    .line 841
    :try_start_8
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 844
    goto :goto_9

    .line 842
    :catch_4
    move-exception v23

    .line 843
    invoke-virtual/range {v23 .. v23}, Ljava/io/IOException;->printStackTrace()V

    .line 844
    :cond_c
    :goto_9
    return-void

    .line 829
    :cond_d
    :goto_a
    move-object/from16 v0, p0

    :try_start_9
    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v19

    .line 830
    const/4 v0, 0x2

    move-object/from16 v1, v19

    iput v0, v1, Landroid/os/Message;->what:I

    .line 831
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 833
    if-eqz v10, :cond_e

    .line 835
    :try_start_a
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 838
    goto :goto_b

    .line 836
    :catch_5
    move-exception v11

    .line 837
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 839
    :cond_e
    :goto_b
    if-eqz v8, :cond_11

    .line 841
    :try_start_b
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    .line 844
    goto :goto_e

    .line 842
    :catch_6
    move-exception v11

    .line 843
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 844
    goto :goto_e

    .line 833
    :catchall_0
    move-exception v24

    if-eqz v10, :cond_f

    .line 835
    :try_start_c
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7

    .line 838
    goto :goto_c

    .line 836
    :catch_7
    move-exception v25

    .line 837
    invoke-virtual/range {v25 .. v25}, Ljava/io/IOException;->printStackTrace()V

    .line 839
    :cond_f
    :goto_c
    if-eqz v8, :cond_10

    .line 841
    :try_start_d
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8

    .line 844
    goto :goto_d

    .line 842
    :catch_8
    move-exception v25

    .line 843
    invoke-virtual/range {v25 .. v25}, Ljava/io/IOException;->printStackTrace()V

    .line 844
    :cond_10
    :goto_d
    throw v24

    .line 846
    :cond_11
    :goto_e
    return-void
.end method
