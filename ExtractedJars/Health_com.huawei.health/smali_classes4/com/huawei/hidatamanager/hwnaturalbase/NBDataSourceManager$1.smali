.class Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nb/client/ServiceConnectCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;->connectService()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;


# direct methods
.method constructor <init>(Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager$1;->this$0:Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnect()V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager$1;->this$0:Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;->access$002(Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;Z)Z

    .line 85
    const-string v0, "NBDataSourceManager "

    const-string v1, "NBDataSourceManager, hidatamanager has connected to natural base data service."

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/util/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-void
.end method

.method public onDisconnect()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager$1;->this$0:Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;->access$002(Lcom/huawei/hidatamanager/hwnaturalbase/NBDataSourceManager;Z)Z

    .line 91
    const-string v0, "NBDataSourceManager "

    const-string v1, "NBDataSourceManager, hidatamanager has disconnected from natural base data service."

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/util/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    return-void
.end method
