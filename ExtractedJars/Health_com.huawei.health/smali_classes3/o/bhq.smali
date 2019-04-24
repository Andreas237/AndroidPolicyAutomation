.class public Lo/bhq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    .line 71
    invoke-static {p0, p1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v4

    .line 72
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasPermission ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    if-nez v4, :cond_7

    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_7

    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-static {p1, p0}, Lo/bhq;->d([Ljava/lang/String;Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v6

    .line 79
    if-nez v6, :cond_0

    .line 80
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestPermission  needPermissions == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x1

    return v0

    .line 83
    :cond_0
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_4

    aget-object v10, v7, v9

    .line 84
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6743\u9650"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":getPermissionFirstRes = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0, v10}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6743\u9650"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":shouldShowRequestPermissionRationale = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0, v10}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-static {p0, v10}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    invoke-virtual {p0, v10}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v11, 0x1

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    .line 88
    :goto_1
    if-nez v11, :cond_3

    .line 89
    const/4 v5, 0x1

    .line 90
    goto :goto_2

    .line 83
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 93
    :cond_4
    :goto_2
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u662f\u5426\u9700\u8981\u5f15\u5bfc\u6743\u9650\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    if-eqz v5, :cond_5

    .line 95
    invoke-static {p0, p2}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_4

    .line 108
    :cond_5
    const/16 v0, 0x58

    invoke-virtual {p0, v6, v0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 109
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v8, :cond_6

    aget-object v10, v7, v9

    .line 110
    invoke-static {p0, v10}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 109
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 113
    :cond_6
    :goto_4
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public static d([Ljava/lang/String;Landroid/content/Context;)[Ljava/lang/String;
    .locals 7

    .line 125
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 126
    :cond_0
    return-object p0

    .line 128
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 129
    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v5, v0, :cond_3

    .line 130
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    aget-object v1, p0, v5

    invoke-virtual {v0, p1, v1}, Lo/dbn;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 131
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "permissions = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, p0, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff0c hasPermission = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    if-nez v6, :cond_2

    .line 134
    aget-object v0, p0, v5

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 138
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v5, v0, [Ljava/lang/String;

    .line 139
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    .line 141
    :cond_4
    return-object p0
.end method

.method public static e(Landroid/app/Activity;)V
    .locals 7

    .line 39
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "NEWSOCIALFRAGMENT_IS_SHOW_HEALTH_GROUP_KEY"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 40
    const-string v0, "NEWSOCIALFRAGMENT_SHOW_HEALTH_GROUP_VALUE"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    const-string v0, "Group_HealthPermissionsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFromScheme in if IS_FORM_SCHEME && IS_FORM_SCHEME in if"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    new-instance v6, Lo/egy$b;

    invoke-direct {v6, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 44
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_enter_secure_tips:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_apphelp_pwindows_continue_button:I

    .line 45
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bhq$2;

    invoke-direct {v2, p0}, Lo/bhq$2;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_apphelp_pwindows_back_button:I

    .line 51
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bhq$4;

    invoke-direct {v2, p0}, Lo/bhq$4;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 56
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 57
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCanceledOnTouchOutside(Z)V

    .line 58
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 59
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 61
    :cond_0
    return-void
.end method
