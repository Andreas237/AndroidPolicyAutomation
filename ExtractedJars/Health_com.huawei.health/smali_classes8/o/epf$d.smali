.class Lo/epf$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/epf;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/epf;)V
    .locals 0

    .line 957
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 958
    return-void
.end method


# virtual methods
.method protected a(Lo/epf;Landroid/os/Message;)V
    .locals 8

    .line 962
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 964
    :sswitch_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh head img"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/graphics/Bitmap;

    .line 966
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 967
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_1

    .line 969
    :cond_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh head img null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    goto/16 :goto_1

    .line 973
    :sswitch_1
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh achieve cumulate level"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 974
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 976
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/dzj;

    .line 977
    invoke-virtual {v5}, Lo/dzj;->d()I

    move-result v6

    .line 978
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->f:Landroid/widget/ImageView;

    invoke-static {}, Lo/epf;->g()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 979
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->b:Landroid/widget/TextView;

    invoke-static {}, Lo/epf;->f()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 980
    add-int/lit8 v0, v6, 0x1

    const/16 v1, 0x14

    if-gt v0, v1, :cond_1

    .line 981
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v5}, Lo/dzj;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 982
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v5}, Lo/dzj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0

    .line 984
    :cond_1
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->a:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 985
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->a:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 987
    :goto_0
    invoke-static {p1}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 988
    invoke-static {p1}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 989
    goto/16 :goto_1

    .line 990
    :cond_2
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSpannableString is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 992
    goto/16 :goto_1

    .line 995
    :sswitch_2
    goto/16 :goto_1

    .line 997
    :sswitch_3
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh achieve device wear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 998
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 999
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/afa;

    .line 1000
    iget v6, p2, Landroid/os/Message;->arg1:I

    .line 1001
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lo/epi;->b(Lo/afa;I)V

    .line 1002
    goto/16 :goto_1

    .line 1005
    :sswitch_4
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh achieve device health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1007
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/afa;

    .line 1008
    iget v6, p2, Landroid/os/Message;->arg1:I

    .line 1009
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lo/epi;->b(Lo/afa;I)V

    .line 1010
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 1011
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == deviceGroupInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1012
    invoke-static {p1}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 1013
    const/4 v0, 0x2

    iput v0, v7, Landroid/os/Message;->what:I

    .line 1014
    invoke-static {p1}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1017
    :cond_3
    goto/16 :goto_1

    .line 1021
    :sswitch_5
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1022
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/epi;->b(ZZ)V

    goto/16 :goto_1

    .line 1027
    :sswitch_6
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1028
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/epi;->b(ZZ)V

    goto/16 :goto_1

    .line 1033
    :sswitch_7
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1034
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/epi;->b(ZZ)V

    goto/16 :goto_1

    .line 1039
    :sswitch_8
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updatelayout isEnableShowUpadte =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/epf;->h(Lo/epf;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  countCancelTimes  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/epf;->k(Lo/epf;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1040
    invoke-static {p1}, Lo/epf;->h(Lo/epf;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lo/epf;->k(Lo/epf;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1041
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->m:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 1042
    invoke-static {p1}, Lo/epf;->i(Lo/epf;)Lo/epi;

    move-result-object v0

    iget-object v0, v0, Lo/epi;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 1047
    :sswitch_9
    const/4 v0, 0x0

    invoke-static {v0}, Lo/epf;->c(Z)Z

    .line 1048
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_WEAR_DEVICE_CHECK_SUCCESS , isHandleCheckSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/epf;->i()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1049
    goto :goto_1

    .line 1051
    :sswitch_a
    const/4 v0, 0x0

    invoke-static {v0}, Lo/epf;->a(Z)Z

    .line 1052
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_AW70_CHECK_SUCCESS , isHandleCheckSuccessAW70 :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/epf;->n()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    .line 1057
    :cond_4
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_5
        0x5 -> :sswitch_6
        0x6 -> :sswitch_7
        0x7 -> :sswitch_4
        0x8 -> :sswitch_8
        0x64 -> :sswitch_9
        0xc8 -> :sswitch_a
    .end sparse-switch
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 954
    move-object v0, p1

    check-cast v0, Lo/epf;

    invoke-virtual {p0, v0, p2}, Lo/epf$d;->a(Lo/epf;Landroid/os/Message;)V

    return-void
.end method
