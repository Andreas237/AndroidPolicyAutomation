.class Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;Ljava/lang/String;)V
    .locals 0

    .line 822
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->e:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 827
    const v0, 0x7fffffff

    if-ge v4, v0, :cond_0

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iget v1, v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->e:I

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V

    goto :goto_0

    .line 830
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iget v1, v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->e:I

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iget-object v2, v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9$4;->b:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;->d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;ILjava/lang/String;Ljava/lang/String;)V

    .line 834
    :goto_0
    return-void
.end method
