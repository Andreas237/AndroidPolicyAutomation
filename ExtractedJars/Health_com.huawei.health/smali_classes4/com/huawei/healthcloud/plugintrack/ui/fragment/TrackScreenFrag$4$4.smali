.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->onSnapshotReady(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;)V
    .locals 0

    .line 824
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 827
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    .line 828
    const/4 v4, 0x0

    .line 830
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "google_temp.png"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 831
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/graphics/Bitmap;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 832
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V

    .line 833
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 834
    const/4 v4, 0x0

    .line 842
    goto/16 :goto_1

    .line 835
    .line 844
    .line 845
    .line 846
    .line 847
    .line 847
    :catch_0
    move-exception v5

    .line 836
    :try_start_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    .line 837
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:IllegalArgumentException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 842
    if-eqz v4, :cond_1

    .line 844
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 847
    goto/16 :goto_1

    .line 845
    :catch_1
    move-exception v5

    .line 846
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    goto :goto_1

    .line 838
    :catch_2
    move-exception v5

    .line 839
    :try_start_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    .line 840
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 842
    if-eqz v4, :cond_1

    .line 844
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 847
    goto :goto_1

    .line 845
    :catch_3
    move-exception v5

    .line 846
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    goto :goto_1

    .line 842
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_0

    .line 844
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 847
    goto :goto_0

    .line 845
    :catch_4
    move-exception v7

    .line 846
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    :cond_0
    :goto_0
    throw v6

    .line 850
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4$4;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    .line 851
    return-void
.end method
