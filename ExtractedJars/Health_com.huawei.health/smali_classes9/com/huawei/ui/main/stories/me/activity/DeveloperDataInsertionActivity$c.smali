.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V
    .locals 0

    .line 161
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 162
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Landroid/os/Message;)V
    .locals 2

    .line 166
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 168
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 169
    goto :goto_1

    .line 171
    :goto_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 174
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;I)I

    .line 175
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;I)I

    .line 176
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 177
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 178
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 179
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 182
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 159
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$c;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Landroid/os/Message;)V

    return-void
.end method
