.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 368
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;->d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 371
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyAToBByHiDATA onResult errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;->d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$10;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;I)V

    .line 373
    return-void
.end method
