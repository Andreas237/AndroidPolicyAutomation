.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;)V
    .locals 0

    .line 824
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4$1;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 0

    .line 835
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 828
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess ACTIVITY_KEY url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 829
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4$1;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Ljava/lang/String;)V

    .line 830
    return-void
.end method
