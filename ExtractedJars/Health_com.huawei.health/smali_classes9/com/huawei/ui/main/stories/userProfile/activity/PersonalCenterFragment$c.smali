.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private d:Landroid/graphics/Bitmap;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 3775
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3776
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;->e:Landroid/content/Context;

    .line 3777
    iput-object p2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;->d:Landroid/graphics/Bitmap;

    .line 3778
    return-void
.end method

.method private a()Z
    .locals 7

    .line 3780
    const/4 v4, 0x1

    .line 3781
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 3782
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3783
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it\'s strange that we get img bitmap, unkowning the userid "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3784
    const/4 v0, 0x0

    return v0

    .line 3786
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;->d:Landroid/graphics/Bitmap;

    invoke-static {v0, v5, v1}, Lo/cyt;->c(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v6

    .line 3787
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 3788
    const/4 v4, 0x0

    .line 3789
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered request success but keeping behavior fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3791
    :cond_1
    return v4
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 3796
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter triggred img to save runnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3797
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;->a()Z

    move-result v4

    .line 3798
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Finally,the triggered header img is cached successfully? "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3799
    return-void
.end method
