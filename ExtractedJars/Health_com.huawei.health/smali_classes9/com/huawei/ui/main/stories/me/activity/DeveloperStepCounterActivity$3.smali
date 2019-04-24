.class Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Z)Z

    .line 176
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthOpenSDK onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 113
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthOpenSDK : onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthOpenSDK initSDK success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Z)Z

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->b()I

    move-result v4

    .line 140
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initHealthOpenSDK classType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    .line 143
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "ExtendStepCounter,climbStatics"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "ExtendStepCounter"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "CLASS1"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    goto :goto_1

    .line 152
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "StandStepCounter"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "CLASS2"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    goto :goto_1

    .line 157
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "NotSupportStepCounter "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "CLASS3"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 164
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->g(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cmj;->g(Lo/cmo;)V

    .line 166
    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Z)Z

    .line 171
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthOpenSDK : initSDK Failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-void
.end method
