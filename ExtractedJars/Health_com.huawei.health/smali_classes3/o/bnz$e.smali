.class Lo/bnz$e;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bnz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/widget/CheckBox;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 207
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 208
    iput-object p1, p0, Lo/bnz$e;->e:Landroid/content/Context;

    .line 209
    invoke-direct {p0}, Lo/bnz$e;->a()V

    .line 210
    return-void
.end method

.method private a()V
    .locals 4

    .line 217
    invoke-virtual {p0}, Lo/bnz$e;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_check_notification_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 219
    sget v0, Lcom/huawei/android/sns/R$id;->sns_notifi_checkBox:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/bnz$e;->a:Landroid/widget/CheckBox;

    .line 220
    invoke-virtual {p0, v3}, Lo/bnz$e;->setView(Landroid/view/View;)V

    .line 221
    return-void
.end method


# virtual methods
.method public b(Landroid/content/DialogInterface$OnDismissListener;)Lo/bnz$e;
    .locals 0

    .line 246
    invoke-virtual {p0, p1}, Lo/bnz$e;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 247
    return-object p0
.end method

.method public c()Z
    .locals 1

    .line 257
    iget-object v0, p0, Lo/bnz$e;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    return v0
.end method

.method public d(Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Lo/bnz$e;
    .locals 2

    .line 233
    iget-object v0, p0, Lo/bnz$e;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_setting:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0, p1}, Lo/bnz$e;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 234
    iget-object v0, p0, Lo/bnz$e;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {p0, v1, v0, p2}, Lo/bnz$e;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 235
    return-object p0
.end method
