.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eui;

.field final synthetic c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;Lo/eui;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;->b:Lo/eui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;)Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;->b:Lo/eui;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V

    .line 148
    return-void
.end method
