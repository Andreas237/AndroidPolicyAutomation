.class Lo/cvz$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->e(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cvz;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field final synthetic e:Lcom/huawei/ui/openservice/db/model/OpenService;


# direct methods
.method constructor <init>(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 0

    .line 953
    iput-object p1, p0, Lo/cvz$20;->b:Lo/cvz;

    iput-object p2, p0, Lo/cvz$20;->d:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iput-object p3, p0, Lo/cvz$20;->c:Ljava/lang/String;

    iput-object p4, p0, Lo/cvz$20;->e:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 956
    iget-object v0, p0, Lo/cvz$20;->d:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/cvz$20;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/cvz$20;->e:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v4

    .line 957
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    if-nez v0, :cond_1

    .line 958
    :cond_0
    iget-object v0, p0, Lo/cvz$20;->b:Lo/cvz;

    iget-object v1, p0, Lo/cvz$20;->d:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v2, p0, Lo/cvz$20;->e:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cvz$20;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lo/cvz;->c(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Ljava/lang/String;)V

    .line 959
    return-void

    .line 961
    :cond_1
    return-void
.end method
