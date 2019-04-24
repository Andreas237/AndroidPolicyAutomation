.class Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->c(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->c(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    .line 103
    const-string v0, "UIHLH_DeveloperDataInsertionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDatas weight"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lo/fdi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->g(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/fdi;->e(Landroid/content/Context;IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->p(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->p(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    .line 110
    const-string v0, "UIHLH_DeveloperDataInsertionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDatas bloodpresure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lo/fdi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->p(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->g(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/fdi;->e(Landroid/content/Context;IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->n(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->n(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    .line 115
    const-string v0, "UIHLH_DeveloperDataInsertionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDatas bloodsugar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lo/fdi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->n(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->g(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/fdi;->e(Landroid/content/Context;IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 119
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_4

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    .line 121
    const-string v0, "UIHLH_DeveloperDataInsertionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDatas sleep"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lo/fdi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x64

    if-le v2, v3, :cond_3

    const/16 v2, 0x64

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->m(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :goto_0
    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->g(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/fdi;->e(Landroid/content/Context;IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 125
    :cond_4
    return-void
.end method
