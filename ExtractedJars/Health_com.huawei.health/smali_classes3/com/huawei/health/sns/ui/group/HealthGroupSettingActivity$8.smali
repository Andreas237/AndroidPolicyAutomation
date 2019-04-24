.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lo/egw$c;

.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/widget/EditText;Lo/egw$c;)V
    .locals 0

    .line 915
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->a:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->b:Lo/egw$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 948
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 949
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 950
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->b:Lo/egw$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Z)V

    goto :goto_0

    .line 952
    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 953
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->b:Lo/egw$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Z)V

    .line 955
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 919
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 6

    .line 923
    const/4 v2, 0x1

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 925
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 926
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 927
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 928
    const/4 v5, 0x0

    :goto_0
    array-length v0, v3

    if-ge v5, v0, :cond_2

    .line 929
    aget-char v0, v3, v5

    invoke-static {v0}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 930
    if-nez v2, :cond_1

    .line 931
    aget-char v0, v3, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 934
    :cond_0
    const/4 v2, 0x0

    .line 935
    aget-char v0, v3, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 928
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 938
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 939
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->a:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 940
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->a:Landroid/widget/EditText;

    invoke-virtual {v0, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 941
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;->b:Lo/egw$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Z)V

    .line 944
    :cond_3
    return-void
.end method
