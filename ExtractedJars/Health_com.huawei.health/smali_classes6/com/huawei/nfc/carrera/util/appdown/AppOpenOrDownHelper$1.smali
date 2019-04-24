.class Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->deleteDownFile()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 405
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 407
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$1100(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$1100(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 409
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    .line 411
    if-nez v3, :cond_0

    .line 412
    const-string v0, "AppOpenOrDownHelper delete appMarket apkFile failed."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 416
    :cond_0
    return-void
.end method
