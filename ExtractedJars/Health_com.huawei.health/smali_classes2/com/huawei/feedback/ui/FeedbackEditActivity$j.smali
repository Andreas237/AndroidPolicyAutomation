.class Lcom/huawei/feedback/ui/FeedbackEditActivity$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1965
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 1

    .line 2095
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2096
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->f(Ljava/lang/String;)V

    .line 2098
    :cond_0
    return-void
.end method

.method private b()Z
    .locals 2

    .line 2101
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 2102
    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "^[a-zA-Z0-9]+([\\_|\\-|\\.]?[a-zA-Z0-9])*\\@[a-zA-Z0-9]+([\\_|\\-|\\.]?[a-zA-Z0-9])*\\.[a-zA-Z]{2,3}$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c()V
    .locals 3

    .line 2109
    :try_start_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->y(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/lcagent/client/LogCollectManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2110
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->y(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/lcagent/client/LogCollectManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/lcagent/client/LogCollectManager;->getUserType()I

    move-result v1

    iput v1, v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2119
    :cond_0
    goto :goto_0

    .line 2112
    :catch_0
    move-exception v2

    .line 2113
    const-string v0, "FeedbackEditActivity"

    const-string v1, "RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2119
    goto :goto_0

    .line 2115
    :catch_1
    move-exception v2

    .line 2116
    const-string v0, "FeedbackEditActivity"

    const-string v1, "The init of the object logCollectManager is exception!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2120
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14

    .line 1968
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 1969
    invoke-static {}, Lcom/huawei/feedback/e;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1970
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 1971
    return-void

    .line 1975
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->F(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1976
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 1977
    return-void

    .line 1980
    :cond_2
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1981
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 1982
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "formaterror_toast"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1981
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1983
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 1984
    return-void

    .line 1989
    :cond_3
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "captureFilePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/huawei/feedback/d;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1990
    sget-object v0, Lcom/huawei/feedback/d;->z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1991
    new-instance v12, Ljava/io/File;

    sget-object v0, Lcom/huawei/feedback/d;->z:Ljava/lang/String;

    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1992
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1993
    invoke-static {v12}, Lcom/huawei/feedback/e;->a(Ljava/io/File;)V

    .line 2000
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/app/Activity;)V

    .line 2004
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->c()V

    .line 2010
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 2014
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->F(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 2015
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2019
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 2020
    return-void

    .line 2022
    :cond_5
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x12c

    if-le v0, v1, :cond_6

    .line 2026
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 2027
    return-void

    .line 2030
    :cond_6
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/huawei/feedback/bean/d;->d(Ljava/lang/String;)V

    .line 2031
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->g(Ljava/lang/String;)V

    .line 2032
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->G(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->i(Ljava/lang/String;)V

    .line 2036
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "1"

    goto :goto_0

    :cond_7
    const-string v1, "0"

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 2037
    invoke-static {}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2038
    :cond_8
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "feedbackInfo.getPack()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/d;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2039
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2042
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_9

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 2043
    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 2044
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/d;->q()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/io/File;)Ljava/io/File;

    .line 2045
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v13

    .line 2046
    const/4 v0, 0x1

    iput v0, v13, Landroid/os/Message;->what:I

    .line 2047
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    invoke-virtual {v0, v13}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2048
    return-void

    .line 2050
    :cond_9
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    new-instance v1, Landroid/app/ProgressDialog;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 2051
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 2052
    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_waiting"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 2053
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 2054
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 2060
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/FeedbackEditActivity$i;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    .line 2061
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->D(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->start()V

    .line 2062
    return-void

    .line 2066
    :cond_a
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "---draftInfo.getEncryptKey()-->>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->H(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2067
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "---feedbackInfo.getEncryptKey()-->>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2071
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a()Lcom/huawei/phoneserviceuni/common/e/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/logic/i;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 2072
    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->x(Lcom/huawei/feedback/ui/FeedbackEditActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v4}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->y(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/lcagent/client/LogCollectManager;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 2073
    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v6

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->z(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v7

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v8

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v9

    const-string v10, ""

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v11, v5, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/huawei/feedback/logic/i;-><init>(Lcom/huawei/feedback/bean/d;ILcom/huawei/lcagent/client/LogCollectManager;Lcom/huawei/lcagent/client/LogMetricInfo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V

    .line 2072
    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a(Ljava/lang/Runnable;)V

    .line 2077
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a()V

    goto :goto_1

    .line 2083
    :cond_b
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a()Lcom/huawei/phoneserviceuni/common/e/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/logic/i;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->x(Lcom/huawei/feedback/ui/FeedbackEditActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v4}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v4

    const-string v5, "0"

    iget-object v6, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 2084
    invoke-static {v6}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/huawei/feedback/logic/i;-><init>(Lcom/huawei/feedback/bean/d;ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2083
    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a(Ljava/lang/Runnable;)V

    .line 2086
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a()V

    .line 2091
    :cond_c
    :goto_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->finish()V

    .line 2092
    return-void
.end method
