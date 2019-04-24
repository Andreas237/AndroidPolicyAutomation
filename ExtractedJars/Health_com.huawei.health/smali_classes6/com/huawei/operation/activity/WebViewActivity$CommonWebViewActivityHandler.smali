.class Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/activity/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CommonWebViewActivityHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/operation/activity/WebViewActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 826
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 827
    return-void
.end method


# virtual methods
.method protected handleMessageWhenReferenceNotNull(Lcom/huawei/operation/activity/WebViewActivity;Landroid/os/Message;)V
    .locals 23

    .line 831
    move-object/from16 v0, p2

    iget v0, v0, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 833
    :sswitch_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_TITLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 835
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1200(Lcom/huawei/operation/activity/WebViewActivity;)Lo/emr;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 836
    goto/16 :goto_1

    .line 838
    :sswitch_1
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_PROGRESSBAR_GONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1400(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 840
    goto/16 :goto_1

    .line 843
    :sswitch_2
    invoke-static/range {p1 .. p1}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 844
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_ONRECEIVED_ERROR showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1500(Lcom/huawei/operation/activity/WebViewActivity;)V

    goto/16 :goto_1

    .line 847
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_ONRECEIVED_ERROR showNoNetWorkPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 848
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1600(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 850
    goto/16 :goto_1

    .line 852
    :sswitch_3
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_ON_NET_WORK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1600(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 854
    goto/16 :goto_1

    .line 856
    :sswitch_4
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SERVER_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1700(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 858
    goto/16 :goto_1

    .line 860
    :sswitch_5
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_POST_TOAST"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 861
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 862
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 863
    goto/16 :goto_1

    .line 865
    :sswitch_6
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_START_MINI_SHOP_WEB_PAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 867
    const-string v0, "url"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 868
    const-string v0, "type"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 870
    new-instance v9, Landroid/content/Intent;

    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v9, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 871
    const-string v0, "url"

    invoke-virtual {v9, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 872
    const-string v0, "type"

    invoke-virtual {v9, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 873
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 876
    goto/16 :goto_1

    .line 879
    :sswitch_7
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_START_WEB_PAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 880
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 881
    const-string v0, "url"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 882
    const-string v8, ""

    .line 883
    const-string v0, ""

    move-object/from16 v1, p1

    invoke-virtual {v1, v7, v0}, Lcom/huawei/operation/activity/WebViewActivity;->startLoadUrl(Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    goto/16 :goto_1

    .line 887
    :sswitch_8
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RESET_ACTIVITY_LIST"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 888
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->getActivityKeyUrlSP(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 889
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/web/html/activity.html"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 890
    goto/16 :goto_1

    .line 892
    :sswitch_9
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_CONNECT_TIMEOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 893
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1800(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 894
    goto/16 :goto_1

    .line 896
    :sswitch_a
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SSL_HANDLE_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1900(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 898
    goto/16 :goto_1

    .line 900
    :sswitch_b
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 901
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_MYACTIVITY isShow = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    move-object/from16 v0, p1

    invoke-static {v0, v7}, Lcom/huawei/operation/activity/WebViewActivity;->access$2000(Lcom/huawei/operation/activity/WebViewActivity;Z)V

    .line 903
    goto/16 :goto_1

    .line 905
    :sswitch_c
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_DIALOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v8

    .line 907
    const-string v0, "huid"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 908
    const-string v0, "serviceId"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 909
    const-string v0, "function"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 910
    move-object/from16 v0, p1

    invoke-static {v0, v9, v10, v11}, Lcom/huawei/operation/activity/WebViewActivity;->access$2100(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 911
    goto/16 :goto_1

    .line 913
    :sswitch_d
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_SPORT_DATA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v12

    .line 915
    const-string v0, "JS_PARAM"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 916
    const-string v0, "JS_FUNCTION_RES"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 917
    const-string v0, "JS_FUNCTION_ERR"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 918
    const-string v0, "IS_LEGAL"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v16

    .line 919
    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-static {v0, v13, v14, v15, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2200(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 920
    goto/16 :goto_1

    .line 922
    :sswitch_e
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_HANDLE_WEBVIEW_TITLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/operation/beans/TitleBean;

    .line 924
    move-object/from16 v0, p1

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2300(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/beans/TitleBean;)V

    .line 925
    goto/16 :goto_1

    .line 927
    :sswitch_f
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_JS_SERVICE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 928
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v18

    .line 929
    new-instance v19, Lcom/huawei/operation/jsoperation/JsCommandOption;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/operation/jsoperation/JsCommandOption;-><init>()V

    .line 930
    const-string v0, "JS_SERVICE_TYPE"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/operation/jsoperation/JsCommandOption;->setServiceType(Ljava/lang/String;)V

    .line 931
    const-string v0, "JS_FUNC_TYPE"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/operation/jsoperation/JsCommandOption;->setFuncType(Ljava/lang/String;)V

    .line 932
    const-string v0, "JS_PARAM"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/operation/jsoperation/JsCommandOption;->setParam(Ljava/lang/String;)V

    .line 933
    const-string v0, "JS_FUNCTION_RES"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/operation/jsoperation/JsCommandOption;->setFunctionRes(Ljava/lang/String;)V

    .line 934
    const-string v0, "IS_LEGAL"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/operation/jsoperation/JsCommandOption;->setLegal(Z)V

    .line 935
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getServiceType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/operation/jsoperation/JsOperationProducer;->produceRequest(Ljava/lang/String;)Lcom/huawei/operation/jsoperation/JsCommand;

    move-result-object v20

    .line 936
    if-nez v20, :cond_1

    .line 937
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_JS_SERVICE error serviceType ,it is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getServiceType()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    goto/16 :goto_1

    .line 940
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2400(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/adapter/PluginOperationAdapter;

    move-result-object v0

    move-object/from16 v1, v20

    move-object/from16 v2, p1

    move-object/from16 v3, v19

    invoke-interface {v1, v2, v0, v3}, Lcom/huawei/operation/jsoperation/JsCommand;->execute(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 941
    goto/16 :goto_1

    .line 943
    :sswitch_10
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHARE_FAIL_TOAST"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 944
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$string;->IDS_submit_error_message_1:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 945
    goto/16 :goto_1

    .line 947
    :sswitch_11
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CustomWebView.MSG_QUIT_ACT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 948
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2500(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 949
    goto/16 :goto_1

    .line 951
    :sswitch_12
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CustomWebView.MSG_VMALL_COUPON"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 952
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2600(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 953
    goto/16 :goto_1

    .line 955
    :sswitch_13
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_START_APPSETTING_PAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 956
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 957
    new-instance v21, Landroid/content/Intent;

    invoke-direct/range {v21 .. v21}, Landroid/content/Intent;-><init>()V

    .line 958
    const-string v0, "com.huawei.health"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 959
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.me.activity.AppSettingActivity"

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 960
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 961
    goto/16 :goto_1

    .line 964
    :sswitch_14
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CustomWebView.MSG_GRS_GET_URL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2700(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 966
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->A(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 967
    sget v0, Lcom/huawei/operation/R$layout;->fragment_web_view_error_1:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setContentView(I)V

    .line 968
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2800(Lcom/huawei/operation/activity/WebViewActivity;)V

    goto/16 :goto_1

    .line 970
    :cond_2
    sget v0, Lcom/huawei/operation/R$layout;->activity_common_web_view:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setContentView(I)V

    .line 971
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$2900(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 972
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3000(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 974
    goto :goto_1

    .line 977
    :sswitch_15
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MAG_WEBVIEW_LOAD ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$1800(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 979
    goto :goto_1

    .line 981
    :sswitch_16
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ON_PAGE_START ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 982
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, Ljava/lang/String;

    .line 983
    move-object/from16 v0, p1

    move-object/from16 v1, v21

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3100(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)Z

    move-result v22

    .line 984
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isResetToOrderManager isOrder:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 985
    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3200(Lcom/huawei/operation/activity/WebViewActivity;Z)V

    .line 986
    goto :goto_1

    .line 988
    :goto_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    :cond_3
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_8
        0x7d0 -> :sswitch_1
        0x7d1 -> :sswitch_2
        0x7d2 -> :sswitch_0
        0x7d3 -> :sswitch_3
        0x7d4 -> :sswitch_6
        0x7d5 -> :sswitch_5
        0x7d6 -> :sswitch_4
        0x7d7 -> :sswitch_9
        0x7d8 -> :sswitch_a
        0x7d9 -> :sswitch_b
        0x7da -> :sswitch_c
        0x7db -> :sswitch_d
        0x7dc -> :sswitch_e
        0x7dd -> :sswitch_f
        0x7de -> :sswitch_11
        0x7df -> :sswitch_14
        0x7e0 -> :sswitch_7
        0x7e1 -> :sswitch_12
        0x7e2 -> :sswitch_13
        0x833 -> :sswitch_10
        0xfa1 -> :sswitch_15
        0x2766 -> :sswitch_16
    .end sparse-switch
.end method

.method public bridge synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 824
    move-object v0, p1

    check-cast v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;->handleMessageWhenReferenceNotNull(Lcom/huawei/operation/activity/WebViewActivity;Landroid/os/Message;)V

    return-void
.end method
