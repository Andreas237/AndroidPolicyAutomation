.class public Lcom/huawei/pay/ui/PayAlertDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;
    }
.end annotation


# instance fields
.field private activity:Landroid/app/Activity;

.field mListener:Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;

.field private what:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/pay/ui/PayAlertDialogFragment;)I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->what:I

    return v0
.end method

.method public static newInstance(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/huawei/pay/ui/PayAlertDialogFragment;
    .locals 3

    .line 72
    new-instance v1, Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-direct {v1}, Lcom/huawei/pay/ui/PayAlertDialogFragment;-><init>()V

    .line 73
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 74
    const-string v0, "what"

    invoke-virtual {v2, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 75
    const-string v0, "title"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "message"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "positive"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "negative"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "cancelable"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 80
    invoke-virtual {v1, v2}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 81
    return-object v1
.end method


# virtual methods
.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 57
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 58
    iput-object p1, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->activity:Landroid/app/Activity;

    .line 61
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;

    iput-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->mListener:Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_0

    .line 63
    :catch_0
    move-exception v2

    .line 66
    const-string v0, "ClassCastException."

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lo/dtg;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 68
    :goto_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 9

    .line 87
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "what"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->what:I

    .line 88
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 90
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "positive"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 91
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "negative"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 93
    new-instance v6, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->activity:Landroid/app/Activity;

    invoke-direct {v6, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 94
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    invoke-virtual {v6, v2}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    .line 98
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    invoke-virtual {v6, v3}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 103
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 105
    new-instance v0, Lcom/huawei/pay/ui/PayAlertDialogFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment$1;-><init>(Lcom/huawei/pay/ui/PayAlertDialogFragment;)V

    invoke-virtual {v6, v4, v0}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 116
    :cond_2
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 118
    new-instance v0, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;-><init>(Lcom/huawei/pay/ui/PayAlertDialogFragment;)V

    invoke-virtual {v6, v5, v0}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 130
    :cond_3
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lo/egv;->show()V

    .line 132
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "cancelable"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    .line 133
    invoke-virtual {v7, v8}, Lo/egv;->setCancelable(Z)V

    .line 135
    new-instance v0, Lcom/huawei/pay/ui/PayAlertDialogFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/PayAlertDialogFragment$3;-><init>(Lcom/huawei/pay/ui/PayAlertDialogFragment;)V

    invoke-virtual {v7, v0}, Lo/egv;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 155
    return-object v7
.end method
