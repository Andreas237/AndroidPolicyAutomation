.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;->onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eui;

.field final synthetic c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;Lo/eui;Ljava/lang/String;)V
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;->a:Lo/eui;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;->d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;->a:Lo/eui;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;Ljava/lang/String;)V

    .line 619
    return-void
.end method
