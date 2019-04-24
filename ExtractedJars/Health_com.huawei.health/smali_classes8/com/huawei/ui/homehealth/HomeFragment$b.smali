.class Lcom/huawei/ui/homehealth/HomeFragment$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/HomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/homehealth/HomeFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 933
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 934
    return-void
.end method


# virtual methods
.method protected e(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/os/Message;)V
    .locals 7

    .line 938
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 940
    :sswitch_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pull Refresh Cards"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    const/4 v0, -0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 942
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->n(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 944
    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 945
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasPullRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 948
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 949
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eoz;->b(Landroid/content/Context;)V

    .line 951
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/epd;->e(Landroid/content/Context;)V

    goto :goto_0

    .line 953
    :cond_1
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eoz;->b(Landroid/content/Context;)V

    .line 956
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->a(Z)Z

    .line 957
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->o(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b()V

    .line 958
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5ef6\u65f6\u4e24\u79d2\u53d1\u9001\u6d88\u606f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 960
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u7684\u5f39\u6846\u72b6\u6001"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    const-string v0, "100002"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 962
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"

    const-string v3, "100001"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 963
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 964
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u7684\u5f39\u6846\u72b6\u6001\uff08\u521b\u5efa\uff09"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    const/16 v0, 0x2717

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/HomeFragment$b;->sendEmptyMessageDelayed(IJ)Z

    .line 968
    :cond_2
    goto/16 :goto_1

    .line 971
    :sswitch_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_CONNECTION_TO_WEAR"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 972
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u4e0e\u7a7f\u6234App\u4e4b\u95f4\u7684\u72b6\u6001"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    invoke-static {}, Lo/eoz;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 974
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u4e3a\u975e\u534e\u4e3a\u624b\u673a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.bone"

    invoke-static {v0, v1}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 976
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u4e0e\u7a7f\u6234App\u4e4b\u95f4\u7684\u72b6\u6001\u4e3a \u672a\u8fde\u63a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 979
    new-instance v6, Lo/egx$d;

    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/egx$d;-><init>(Landroid/content/Context;)V

    .line 980
    invoke-virtual {v6}, Lo/egx$d;->e()Lo/egx;

    move-result-object v0

    invoke-virtual {v0}, Lo/egx;->show()V

    .line 981
    goto/16 :goto_1

    .line 985
    :sswitch_2
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pull Refresh Run Card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 986
    const/4 v0, 0x2

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 987
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->n(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 988
    const/4 v0, 0x4

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 989
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->n(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 990
    goto :goto_1

    .line 992
    :sswitch_3
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_CHECK_USER_PREFENCE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 993
    goto :goto_1

    .line 995
    :sswitch_4
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_CHECK_HUAWEI_WEAR_DEVICE_STATYE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 997
    invoke-static {}, Lo/etw;->d()Lo/etw;

    move-result-object v0

    invoke-virtual {v0}, Lo/etw;->e()V

    .line 998
    new-instance v6, Lo/enw;

    invoke-direct {v6}, Lo/enw;-><init>()V

    .line 999
    invoke-virtual {v6}, Lo/enw;->c()V

    .line 1000
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$b$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$b$3;-><init>(Lcom/huawei/ui/homehealth/HomeFragment$b;)V

    invoke-virtual {v6, v0, v1}, Lo/enw;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1010
    goto :goto_1

    .line 1013
    :sswitch_5
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1014
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->q(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 1015
    invoke-static {p1}, Lcom/huawei/ui/homehealth/HomeFragment;->r(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 1021
    :cond_3
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_3
        0x9 -> :sswitch_4
        0xa -> :sswitch_5
        0x3ec -> :sswitch_0
        0x3ed -> :sswitch_2
        0x2717 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 930
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/homehealth/HomeFragment$b;->e(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/os/Message;)V

    return-void
.end method
