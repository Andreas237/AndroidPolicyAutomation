.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 925
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 926
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Landroid/os/Message;)V
    .locals 8

    .line 930
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 932
    :sswitch_0
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodpresureActivityHandler "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "UPDATEHISTORY"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 933
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 934
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull, data is null ,return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    return-void

    .line 937
    :cond_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 938
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    .line 939
    goto/16 :goto_1

    .line 941
    :sswitch_1
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodpresureActivityHandler "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "RELOADDATA"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 942
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)I

    move-result v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->t(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 943
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a()V

    .line 944
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->q(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    goto :goto_0

    .line 946
    :cond_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    .line 948
    :goto_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 949
    goto/16 :goto_1

    .line 951
    :sswitch_2
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodpresureActivityHandler "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "DELETEDATA"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 952
    iget v0, p2, Landroid/os/Message;->arg1:I

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;I)V

    .line 953
    goto :goto_1

    .line 955
    :sswitch_3
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 956
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->w(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    goto :goto_1

    .line 958
    :cond_2
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    .line 960
    goto :goto_1

    .line 962
    :sswitch_4
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodp_suggest_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 963
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodp_suggest_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 964
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1, v4, v5}, Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 965
    goto :goto_1

    .line 967
    :sswitch_5
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHOW_BLOODP_SUGGEST_SERVICE_DIALOG release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodp_service_suggest_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 969
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodp_service_suggest_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 970
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1, v6, v7}, Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 971
    .line 975
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x5 -> :sswitch_3
        0x6e -> :sswitch_4
        0x6f -> :sswitch_5
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 923
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$e;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Landroid/os/Message;)V

    return-void
.end method
