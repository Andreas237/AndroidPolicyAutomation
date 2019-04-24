.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

.field final synthetic d:Lo/egw$c;

.field final synthetic e:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Lo/egw$c;Landroid/widget/EditText;)V
    .locals 0

    .line 930
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->d:Lo/egw$c;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->e:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 949
    invoke-static {p1}, Lo/bhs;->a(Landroid/text/Editable;)Z

    .line 950
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 951
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 952
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->d:Lo/egw$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Z)V

    goto :goto_0

    .line 954
    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 955
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->d:Lo/egw$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Z)V

    .line 957
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 933
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 934
    const-string p1, ""

    .line 936
    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 940
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 941
    const-string p1, ""

    .line 942
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->d:Lo/egw$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Z)V

    .line 943
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$2;->e:Landroid/widget/EditText;

    invoke-virtual {v0, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 945
    :cond_0
    return-void
.end method
