.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/widget/EditText;

.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Landroid/widget/EditText;)V
    .locals 0

    .line 903
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->d:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 906
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 907
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 908
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_name_tips:I

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 910
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->m(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 911
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->p(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 913
    :goto_0
    return-void
.end method
