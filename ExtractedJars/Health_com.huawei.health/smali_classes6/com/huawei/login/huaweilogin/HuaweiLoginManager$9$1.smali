.class Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;->onProcessed(Lo/ddb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;


# direct methods
.method constructor <init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;)V
    .locals 0

    .line 746
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 749
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setIsAllowedLoginValueToDB: default user onResult errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    return-void
.end method
