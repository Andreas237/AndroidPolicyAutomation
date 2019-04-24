.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/eui;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;Lo/eui;Ljava/lang/String;)V
    .locals 0

    .line 426
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;->c:Lo/eui;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;->c:Lo/eui;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;Ljava/lang/String;)V

    .line 430
    return-void
.end method
