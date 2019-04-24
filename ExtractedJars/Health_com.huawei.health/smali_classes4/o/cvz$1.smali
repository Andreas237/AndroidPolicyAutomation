.class Lo/cvz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->c(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/openservice/db/model/OpenService;

.field final synthetic c:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field final synthetic d:Lo/cvz;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 0

    .line 982
    iput-object p1, p0, Lo/cvz$1;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$1;->c:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iput-object p3, p0, Lo/cvz$1;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/cvz$1;->b:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 985
    iget-object v0, p0, Lo/cvz$1;->c:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/cvz$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/cvz$1;->b:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v4

    .line 986
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    if-nez v0, :cond_1

    .line 987
    :cond_0
    iget-object v0, p0, Lo/cvz$1;->d:Lo/cvz;

    iget-object v1, p0, Lo/cvz$1;->c:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v2, p0, Lo/cvz$1;->b:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cvz$1;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lo/cvz;->c(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Ljava/lang/String;)V

    .line 988
    return-void

    .line 990
    :cond_1
    return-void
.end method
