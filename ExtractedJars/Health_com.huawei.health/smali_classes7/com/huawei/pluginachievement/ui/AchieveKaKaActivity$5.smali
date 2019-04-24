.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 140
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mHanlder, case :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 144
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/dyi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dyi;->e(Ljava/util/ArrayList;)V

    .line 145
    goto/16 :goto_0

    .line 147
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 148
    goto/16 :goto_0

    .line 150
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V

    .line 151
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR_TIP :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    goto/16 :goto_0

    .line 156
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 161
    goto :goto_0

    .line 164
    :sswitch_4
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCurKaKa:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    goto :goto_0

    .line 168
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 169
    goto :goto_0

    .line 172
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 173
    goto :goto_0

    .line 175
    :sswitch_7
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V

    .line 176
    goto :goto_0

    .line 178
    :sswitch_8
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V

    .line 179
    .line 183
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 184
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_4
        0x5 -> :sswitch_3
        0xb -> :sswitch_1
        0x3e8 -> :sswitch_2
        0x3e9 -> :sswitch_5
        0x44d -> :sswitch_6
        0x450 -> :sswitch_7
        0x451 -> :sswitch_8
        0x138d -> :sswitch_0
    .end sparse-switch
.end method
