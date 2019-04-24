.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 1671
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 4

    .line 1674
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1677
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1707
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1708
    return-void
.end method
