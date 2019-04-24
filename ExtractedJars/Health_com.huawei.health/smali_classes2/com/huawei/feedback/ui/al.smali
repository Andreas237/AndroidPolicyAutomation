.class Lcom/huawei/feedback/ui/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 904
    iput-object p1, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 908
    const/4 v2, 0x0

    .line 909
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 910
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->m(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/feedback/bean/f;

    .line 912
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 913
    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->d(Ljava/lang/String;)V

    .line 916
    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 917
    new-instance v3, Ljava/io/File;

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 918
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 919
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "deleteItemDialog package file delete sccess!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 922
    :cond_1
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "deleteItemDialog package file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    :goto_0
    goto :goto_1

    .line 927
    :cond_2
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "file path is empty or null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 930
    :goto_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 931
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 936
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 937
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    .line 938
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->o(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Landroid/widget/ListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 939
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)V

    .line 941
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 942
    iget-object v0, p0, Lcom/huawei/feedback/ui/al;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 945
    :cond_5
    return-void
.end method
