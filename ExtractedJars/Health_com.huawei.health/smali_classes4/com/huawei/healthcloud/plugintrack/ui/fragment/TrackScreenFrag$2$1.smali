.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;)V
    .locals 0

    .line 678
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2$1;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 681
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2$1;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->d:Landroid/os/Handler;

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    move-result-object v4

    .line 683
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2$1;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "google_temp.png"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 687
    goto :goto_0

    .line 684
    :catch_0
    move-exception v5

    .line 685
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decode google map jpg error 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 686
    const/4 v0, 0x0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 688
    :goto_0
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 689
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 690
    return-void
.end method
