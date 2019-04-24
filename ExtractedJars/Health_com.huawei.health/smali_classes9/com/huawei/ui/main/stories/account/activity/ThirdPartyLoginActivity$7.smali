.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->a(Lo/eui;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eui;

.field final synthetic e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    .locals 0

    .line 684
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;->a:Lo/eui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$7;->a:Lo/eui;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V

    .line 689
    return-void
.end method
