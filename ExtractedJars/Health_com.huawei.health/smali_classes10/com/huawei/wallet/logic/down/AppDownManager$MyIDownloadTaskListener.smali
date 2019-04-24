.class Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/down/IDownloadTaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/down/AppDownManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyIDownloadTaskListener"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/os/Handler;

.field final synthetic c:Lcom/huawei/wallet/logic/down/AppDownManager;

.field private e:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/huawei/wallet/logic/down/AppDownManager;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->c:Lcom/huawei/wallet/logic/down/AppDownManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    iput-object p2, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->a:Ljava/lang/String;

    .line 199
    iput-object p3, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->e:Ljava/lang/String;

    .line 200
    iput-object p4, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->b:Landroid/os/Handler;

    .line 201
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/logic/down/AppDownManager;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Lcom/huawei/wallet/logic/down/AppDownManager$1;)V
    .locals 0

    .line 192
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;-><init>(Lcom/huawei/wallet/logic/down/AppDownManager;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/wallet/logic/down/DownloadEntity;)V
    .locals 5

    .line 217
    const-string v0, "AppDownManager startDownloadApp onDownloadFinish."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 219
    new-instance v4, Lcom/huawei/wallet/logic/down/AppBean;

    invoke-direct {v4}, Lcom/huawei/wallet/logic/down/AppBean;-><init>()V

    .line 220
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/wallet/logic/down/AppBean;->e(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/wallet/logic/down/AppBean;->a(Ljava/lang/String;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->c:Lcom/huawei/wallet/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->b:Landroid/os/Handler;

    const/16 v2, 0x3f1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    .line 223
    return-void
.end method

.method public a(Lcom/huawei/wallet/logic/down/DownloadEntity;I)V
    .locals 4

    .line 205
    const-string v0, "AppDownManager startDownloadApp setProgress."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 206
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->c:Lcom/huawei/wallet/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->b:Landroid/os/Handler;

    const/16 v2, 0x3ea

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p2, v3}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    .line 207
    return-void
.end method

.method public c(Lcom/huawei/wallet/logic/down/DownloadEntity;I)V
    .locals 5

    .line 227
    const-string v0, "AppDownManager startDownloadApp onDownloadFail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 228
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->c:Lcom/huawei/wallet/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->b:Landroid/os/Handler;

    const/16 v2, 0x3e9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    .line 229
    return-void
.end method

.method public c(Lcom/huawei/wallet/logic/down/DownloadEntity;Ljava/lang/String;)V
    .locals 4

    .line 211
    const-string v0, "AppDownManager startDownloadApp setDownloadSize."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 212
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->c:Lcom/huawei/wallet/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->b:Landroid/os/Handler;

    const/16 v2, 0x3ef

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, p2}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    .line 213
    return-void
.end method

.method public d(Lcom/huawei/wallet/logic/down/DownloadEntity;)Z
    .locals 2

    .line 233
    const-string v0, "AppDownManager startDownloadApp validate."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 234
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->c:Lcom/huawei/wallet/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;->e:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/huawei/wallet/logic/down/AppDownManager;->a(Lcom/huawei/wallet/logic/down/AppDownManager;Lcom/huawei/wallet/logic/down/DownloadEntity;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Lcom/huawei/wallet/logic/down/DownloadEntity;)V
    .locals 0

    .line 240
    return-void
.end method
