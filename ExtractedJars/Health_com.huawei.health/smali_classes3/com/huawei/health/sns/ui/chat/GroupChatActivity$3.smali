.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 1160
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 1215
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, " "

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    .line 1216
    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 1218
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputIndex()I

    move-result v3

    .line 1219
    if-lez v3, :cond_1

    .line 1221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v0, v4}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Z

    move-result v5

    .line 1223
    if-eqz v5, :cond_0

    .line 1225
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v0, v3, v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0, v3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    goto :goto_0

    .line 1229
    :cond_0
    invoke-interface {p1, v3, v3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 1234
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->m()V

    .line 1235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->F()V

    .line 1236
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 1203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;I)I

    .line 1204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputIndex()I

    move-result v3

    .line 1205
    if-lez v3, :cond_0

    .line 1207
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v3, -0x1

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1209
    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 7

    .line 1165
    if-lez p4, :cond_3

    .line 1167
    const/4 v4, 0x0

    .line 1168
    if-lez p2, :cond_0

    .line 1170
    const-string v0, "[0-9A-Za-z]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 1171
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {v0, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 1172
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    .line 1174
    :cond_0
    add-int v0, p2, p4

    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1176
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)I

    move-result v0

    if-lez v0, :cond_1

    if-eqz v4, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    .line 1177
    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    const/4 v1, 0x0

    invoke-interface {p1, v1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1179
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->o()V

    .line 1180
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lo/bfb;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1197
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v0, p1, p2, p4}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Ljava/lang/CharSequence;II)V

    .line 1198
    return-void
.end method
